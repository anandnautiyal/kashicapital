package com.kcfinance.loans.app.service.loan;

import java.util.List;
import java.util.Optional;

import com.kcfinance.loans.app.modals.LoanApplication;

/**
 * @author Gautam Kundrai
 *
 */

public interface ILoanService {
	
	public List<LoanApplication> getAllLoans();
	
    //public Optional<Loan> findByCode(String code);
    
	public Optional<LoanApplication> getById(Long ld);
	
	public LoanApplication getByGstNo(String gstNo);
	
}