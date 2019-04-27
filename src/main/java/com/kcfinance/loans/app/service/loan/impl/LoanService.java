package com.kcfinance.loans.app.service.loan.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kcfinance.loans.app.modals.Loan;
import com.kcfinance.loans.app.service.loan.ILoanService;
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
}
