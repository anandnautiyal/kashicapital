package com.kcfinance.loans.app.service.loan.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kcfinance.loans.Exceptions.GenericException;
import com.kcfinance.loans.app.modals.ApplicantBusinessDetail;
import com.kcfinance.loans.app.modals.Loan;
import com.kcfinance.loans.app.service.loan.ILoanService;
import com.kcfinance.loans.dao.ApplicantBusinessDetailRepository;
import com.kcfinance.loans.dao.LoanRepository;

/**
 * @author Gautam Kundrai
 *
 */

@Service
@Transactional
public class LoanService implements ILoanService{
	
	private Logger logger = LoggerFactory.getLogger(LoanService.class);
 
    @Autowired
    private LoanRepository loanRepository ;
    
    @Autowired
    private ApplicantBusinessDetailRepository applicantBusinessDetailRepository;
    

	@Override
	public List<Loan> getAllLoans() {
		// TODO Auto-generated method stub
		if(logger.isDebugEnabled())
			logger.debug("Fetching all Loan records");
		List<Loan> loanList = loanRepository.findAll();
		if(logger.isDebugEnabled())
			logger.debug("Loan records = {}",loanList);
		return loanList;
	}


	@Override
	public Optional<Loan> getById(Long ld) {
		// TODO Auto-generated method stub
		return loanRepository.findById(ld);
	}


	public Loan getByGstNumber(String gstNo) {
		// TODO Auto-generated method stub
		if(logger.isDebugEnabled())
			logger.debug("getByGstNo start");
		Loan loanDetail = null;
		List<Loan> loans = getAllLoans();
		for (Loan loan : loans) {
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
	}
	
	@Override
	public Loan getByGstNo(String gstNo) {
		// TODO Auto-generated method stub
		if(logger.isDebugEnabled())
			logger.debug("getByGstNo start");
		ApplicantBusinessDetail applicantBusinessDetail = applicantBusinessDetailRepository.findByGstNumber(gstNo);
		Loan loanDetail = null;
		if(applicantBusinessDetail != null) {
			loanDetail = applicantBusinessDetail.getLoan();
			if(logger.isDebugEnabled())
				logger.debug("Loan by {} = {}", gstNo, loanDetail);
		}
		else
			throw new GenericException(Loan.NAME, gstNo);
		return loanDetail;
	}
	
/*	@Override
    public Optional<Loan> findByCode(String code) {
        return loanRepository.findByCode(code);
    }*/
	
	
}
