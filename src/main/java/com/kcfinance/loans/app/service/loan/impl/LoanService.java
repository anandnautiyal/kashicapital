package com.kcfinance.loans.app.service.loan.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kcfinance.loans.Exceptions.GenericException;
import com.kcfinance.loans.app.modals.LoanApplication;
import com.kcfinance.loans.app.modals.LoanApplicationCustomer;
import com.kcfinance.loans.app.modals.LoanCustomerBusiness;
import com.kcfinance.loans.app.service.loan.ILoanService;
import com.kcfinance.loans.dao.LoanApplicationRepository;
import com.kcfinance.loans.dao.LoanCustomerBusinessRepository;

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
	
/*	@Override
    public Optional<Loan> findByCode(String code) {
        return loanRepository.findByCode(code);
    }*/
	
	
}
