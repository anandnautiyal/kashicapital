package com.kcfinance.loans.app.service.loan.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.kcfinance.loans.Exceptions.GenericException;
import com.kcfinance.loans.app.common.ResponseConstants;
import com.kcfinance.loans.app.modals.ApplicationLoanDetail;
import com.kcfinance.loans.app.modals.CommentsData;
import com.kcfinance.loans.app.modals.CustomerAsset;
import com.kcfinance.loans.app.modals.CustomerDocumentData;
import com.kcfinance.loans.app.modals.LoanApplication;
import com.kcfinance.loans.app.modals.LoanApplicationComment;
import com.kcfinance.loans.app.modals.LoanApplicationCustomer;
import com.kcfinance.loans.app.modals.LoanApplicationCustomerDocument;
import com.kcfinance.loans.app.modals.LoanCustomerAsset;
import com.kcfinance.loans.app.modals.LoanCustomerBankDetail;
import com.kcfinance.loans.app.modals.LoanCustomerBusiness;
import com.kcfinance.loans.app.modals.LoanCustomerDependent;
import com.kcfinance.loans.app.modals.LoanCustomerLoanDetail;
import com.kcfinance.loans.app.modals.LoanCustomerPartnerDetail;
import com.kcfinance.loans.app.modals.LoanCustomerPartnerFirmDetail;
import com.kcfinance.loans.app.modals.LoanType;
import com.kcfinance.loans.app.service.loan.ILoanService;
import com.kcfinance.loans.dao.CustomerAssetTypeRepository;
import com.kcfinance.loans.dao.LoanApplicationCustomerDocumentRepository;
import com.kcfinance.loans.dao.LoanApplicationCustomerRepository;
import com.kcfinance.loans.dao.LoanApplicationRepository;
import com.kcfinance.loans.dao.LoanCustomerBusinessRepository;
import com.kcfinance.loans.dao.LoanTypeRepository;
import com.kcfinance.loans.web.controllers.webservices.LoanApplicationResponse;

/**
 * @author Gautam Kundrai
 *
 */

@Service
@Transactional
public class LoanService implements ILoanService{

	private Logger logger = LoggerFactory.getLogger(LoanService.class);	

	@Autowired
	private LoanApplicationRepository loanApplicationRepository ;

	@Autowired
	private LoanCustomerBusinessRepository loanCustomerBusinessRepository;

	@Autowired
	private LoanApplicationCustomerRepository loanApplicationCustomerRepository;

	@Autowired
	private LoanTypeRepository loanTypeRepository;

	@Autowired
	private CustomerAssetTypeRepository customerAssetTypeRepository;
	
	@Autowired
	private LoanApplicationCustomerDocumentRepository loanApplicationCustomerDocumentRepository;


	@Override
	public List<LoanApplication> getAllLoans() {
		// TODO Auto-generated method stub
		if(logger.isDebugEnabled())
			logger.debug("Fetching all Loan records");
		List<LoanApplication> loanList = loanApplicationRepository.findAll();
		if(logger.isDebugEnabled())
			logger.debug("Loan records = {}",loanList);
		return loanList;
	}


	@Override
	public Optional<LoanApplication> getById(Long ld) {
		// TODO Auto-generated method stub
		return loanApplicationRepository.findById(ld);
	}


	/*	public LoanApplication getByGstNumber(String gstNo) {
		// TODO Auto-generated method stub
		if(logger.isDebugEnabled())
			logger.debug("getByGstNo start");
		LoanApplication loanDetail = null;
		List<LoanApplication> loans = getAllLoans();
		for (LoanApplication loan : loans) {
			List<ApplicantBusinessDetail> applicantBusinessDetailList = loan.getApplicantBusinessDetails();
			for (ApplicantBusinessDetail applicantBusinessDetail : applicantBusinessDetailList) {
				String applicantGstNumber = applicantBusinessDetail.getGstNumber();
				if(applicantGstNumber != null && applicantGstNumber.equalsIgnoreCase(gstNo)) {
					loanDetail = loan;
					if(logger.isDebugEnabled())
						logger.debug("Loan by {} = {}", gstNo, loanDetail);
					break;
				}
			}
		}
		return loanDetail;
	}*/

	@Override
	public LoanApplication getByGstNo(String gstNo) {
		// TODO Auto-generated method stub
		if(logger.isDebugEnabled())
			logger.debug("getByGstNo start");
		LoanCustomerBusiness applicantBusinessDetail = loanCustomerBusinessRepository.findByGstNumber(gstNo);
		LoanApplication loanDetail = null;
		if(applicantBusinessDetail != null) {
			LoanApplicationCustomer loanApplicationCustomer = applicantBusinessDetail.getLoanApplicationCustomer();
			if(logger.isDebugEnabled())
				logger.debug("loanApplicationCustomer by {}", loanApplicationCustomer);
			if(loanApplicationCustomer != null) {
				loanDetail = loanApplicationCustomer.getLoanApplication();
			}
		}
		else
			throw new GenericException("LoanApplication", gstNo);
		return loanDetail;
	}



	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false)
	public LoanApplicationResponse saveLoanApplication(LoanApplication loanApplication) {
		if(logger.isDebugEnabled())
			logger.debug("saveLoanApplication start");

		LoanApplicationResponse applicationResponse = new LoanApplicationResponse();
		
		try {
			setParentReference(loanApplication);
			loanApplicationRepository.save(loanApplication);
			applicationResponse.setStatus(ResponseConstants.SUCCESS_KEY);
			applicationResponse.setMessage(ResponseConstants.ADD_DOCUMENTS_SUCCESS_MSG);
		}catch(Exception e) {
			e.printStackTrace();
			applicationResponse.setStatus(ResponseConstants.FAILURE_KEY);
			applicationResponse.setMessage(ResponseConstants.ADD_DOCUMENTS_FAILURE_MSG);
			applicationResponse.setErrors(Arrays.asList(e.getMessage()));
		}

		return applicationResponse;
	}


	private void setParentReference(LoanApplication loanApplication) {
		//Setting LoanApplication reference in ApplicationLoanDetail - JsonIgnore (Need to figure out solution of Circular reference)
		ApplicationLoanDetail applicationLoanDetail = loanApplication.getApplicationLoanDetail();
		if(applicationLoanDetail != null) {
			LoanType loanType = loanTypeRepository.findByLoanTypeCode(applicationLoanDetail.getLoanType().getLoanTypeCode());
			applicationLoanDetail.setLoanType(loanType);
			applicationLoanDetail.setLoanApplication(loanApplication);
		}
		if(logger.isDebugEnabled())
			logger.debug("applicationLoanDetail set");
		//Setting LoanApplication reference in LoanApplicationCustomer - JsonIgnore (Need to figure out solution of Circular reference)
		LoanApplicationCustomer loanApplicationCustomer = loanApplication.getLoanApplicationCustomer();
		loanApplicationCustomer.setLoanApplication(loanApplication);

		if(logger.isDebugEnabled())
			logger.debug("loanApplicationCustomer set");
		//Setting LoanApplication reference in LoanApplicationCustomer
		if(loanApplication.getLoanApplicationComments() != null) {
			for (LoanApplicationComment loanApplicationComment : loanApplication.getLoanApplicationComments()) {
				loanApplicationComment.setLoanApplication(loanApplication);	
			}
		}

		if(logger.isDebugEnabled())
			logger.debug("loanApplicationComment set");

		//Setting LoanApplicationCustomer reference in LoanApplicationCustomerDocument
		if(loanApplicationCustomer.getLoanApplicationCustomerDocuments() != null) {
			for(LoanApplicationCustomerDocument loanApplicationCustomerDocument : loanApplicationCustomer.getLoanApplicationCustomerDocuments()) {
				loanApplicationCustomerDocument.setLoanApplicationCustomer(loanApplicationCustomer);
			}
		}

		if(logger.isDebugEnabled())
			logger.debug("loanApplicationCustomerDocument set");

		//Setting LoanApplicationCustomer reference in LoanCustomerAsset
		if(loanApplicationCustomer.getLoanCustomerAssets() != null) {
			for(LoanCustomerAsset loanCustomerAsset : loanApplicationCustomer.getLoanCustomerAssets()) {
				CustomerAsset customerAsset = customerAssetTypeRepository.findByAssetTypeCode(loanCustomerAsset.getCustomerAsset().getAssetTypeCode());
				loanCustomerAsset.setCustomerAsset(customerAsset);
				loanCustomerAsset.setLoanApplicationCustomer(loanApplicationCustomer);
			}
		}

		if(logger.isDebugEnabled())
			logger.debug("loanCustomerAsset set");

		//Setting LoanApplicationCustomer reference in LoanApplicationCustomer
		if(loanApplicationCustomer.getLoanCustomerBankDetails() != null) {
			for(LoanCustomerBankDetail loanCustomerBankDetail : loanApplicationCustomer.getLoanCustomerBankDetails()) {
				loanCustomerBankDetail.setLoanApplicationCustomer(loanApplicationCustomer);
			}
		}
		if(logger.isDebugEnabled())
			logger.debug("loanCustomerBankDetail set");

		//Setting LoanApplicationCustomer reference in loanCustomerBankDetail
		if(loanApplicationCustomer.getLoanCustomerBusinesses() != null) {
			for(LoanCustomerBusiness loanCustomerBusiness : loanApplicationCustomer.getLoanCustomerBusinesses()) {
				loanCustomerBusiness.setLoanApplicationCustomer(loanApplicationCustomer);
			}
		}

		if(logger.isDebugEnabled())
			logger.debug("loanCustomerBusiness set");

		//Setting LoanApplicationCustomer reference in loanCustomerBusiness
		if(loanApplicationCustomer.getLoanCustomerDependents() != null) {
			for(LoanCustomerDependent loanCustomerDependent : loanApplicationCustomer.getLoanCustomerDependents()) {
				loanCustomerDependent.setLoanApplicationCustomer(loanApplicationCustomer);
			}
		}

		if(logger.isDebugEnabled())
			logger.debug("loanCustomerDependent set");

		//Setting LoanApplicationCustomer reference in loanCustomerDependent
		if(loanApplicationCustomer.getLoanCustomerLoanDetails() != null) {
			for(LoanCustomerLoanDetail loanCustomerLoanDetail : loanApplicationCustomer.getLoanCustomerLoanDetails()) {
				loanCustomerLoanDetail.setLoanApplicationCustomer(loanApplicationCustomer);
			}
		}

		if(logger.isDebugEnabled())
			logger.debug("loanCustomerLoanDetail set");

		//Setting LoanApplicationCustomer reference in LoanCustomerAsset
		if(loanApplicationCustomer.getLoanCustomerPartnerDetails() != null) {
			for(LoanCustomerPartnerDetail loanCustomerPartnerDetail : loanApplicationCustomer.getLoanCustomerPartnerDetails()) {
				loanCustomerPartnerDetail.setLoanApplicationCustomer(loanApplicationCustomer);
			}
		}

		//Setting LoanApplicationCustomer reference in LoanCustomerpartner Firm
		if(loanApplicationCustomer.getLoanCustomerPartnerFirmDetails() != null) {
			for(LoanCustomerPartnerFirmDetail loanCustomerPartnerFirmDetail : loanApplicationCustomer.getLoanCustomerPartnerFirmDetails()) {
				loanCustomerPartnerFirmDetail.setLoanApplicationCustomer(loanApplicationCustomer);
			}
		}
		if(logger.isDebugEnabled())
			logger.debug("loanCustomerPartnerDetail set and finally Persisting the loanApplication");
	}


	@Override
	public Optional<LoanApplication> getByCode(String code) {
		return loanApplicationRepository.findByCode(code);
	}


	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false)
	public LoanApplicationResponse addCustomerDocuments(CustomerDocumentData customerDocumentData) {

		LoanApplicationResponse applicationResponse = new LoanApplicationResponse();
		try {

			LoanApplication loanApplication = loanApplicationRepository.findByCode(customerDocumentData.getCode()).orElse(null);

			if(loanApplication != null) {

				LoanApplicationCustomer loanApplicationCustomer = loanApplication.getLoanApplicationCustomer();
				List<LoanApplicationCustomerDocument> customerDocuments = customerDocumentData.getLoanApplicationCustomerDocuments();

				for(LoanApplicationCustomerDocument customerDocument : customerDocuments) {
					customerDocument.setLoanApplicationCustomer(loanApplicationCustomer);			
					loanApplicationCustomer.getLoanApplicationCustomerDocuments().add(customerDocument);
				}

				loanApplicationCustomerRepository.saveAndFlush(loanApplicationCustomer);
				applicationResponse.setStatus(ResponseConstants.SUCCESS_KEY);
				applicationResponse.setMessage(ResponseConstants.ADD_DOCUMENTS_SUCCESS_MSG);
			}

		} catch (Exception e) {
			applicationResponse.setStatus(ResponseConstants.FAILURE_KEY);
			applicationResponse.setMessage(ResponseConstants.ADD_DOCUMENTS_FAILURE_MSG);
			applicationResponse.setErrors(Arrays.asList(e.getMessage()));
		}

		return applicationResponse;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false)
	public LoanApplicationResponse addCustomerComments(CommentsData customerCommentData) {

		LoanApplicationResponse applicationResponse = new LoanApplicationResponse();
		try {

			LoanApplication loanApplication = loanApplicationRepository.findByCode(customerCommentData.getCode()).orElse(null);

			if(loanApplication != null) {

				List<LoanApplicationComment> loanComments = customerCommentData.getLoanApplicationComments();
				
				if(loanComments != null) {
					
					for(LoanApplicationComment loanComment : loanComments) {
						loanComment.setLoanApplication(loanApplication);			
						loanApplication.getLoanApplicationComments().add(loanComment);
					}

					loanApplicationRepository.saveAndFlush(loanApplication);
					applicationResponse.setStatus(ResponseConstants.SUCCESS_KEY);
					applicationResponse.setMessage(ResponseConstants.ADD_DOCUMENTS_SUCCESS_MSG);
				}
			}

		} catch (Exception e) {
			applicationResponse.setStatus(ResponseConstants.FAILURE_KEY);
			applicationResponse.setMessage(ResponseConstants.ADD_DOCUMENTS_FAILURE_MSG);
			applicationResponse.setErrors(Arrays.asList(e.getMessage()));
		}

		return applicationResponse;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false)
	public void updateLoanApplication(LoanApplication loanApplication, String loanApplicationId) {
		if(logger.isDebugEnabled())
			logger.debug("updateLoanApplication starte");
		//setParentReference(loanApplication);
		
		List<LoanApplicationComment>loanComments = new ArrayList<LoanApplicationComment>();
    	for(LoanApplicationComment loanComment:loanApplication.getLoanApplicationComments()){
    		
    		if(!loanComment.getComments().isEmpty()){
    			loanComments.add(loanComment);
    		}
    		
    	}
    	loanApplication.setLoanApplicationComments(null);
    	loanApplication.setLoanApplicationComments(loanComments);
		loanApplicationRepository.saveAndFlush(loanApplication);
	}
	
	public Optional<LoanApplicationCustomerDocument> findByDocumentId(String fileId) {	   
		   return loanApplicationCustomerDocumentRepository.findById(Long.parseLong(fileId));	  
	   }
}
