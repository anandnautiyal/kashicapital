package com.kcfinance.loans.app.service.loan;

import java.util.List;
import java.util.Optional;

import com.kcfinance.loans.app.modals.Loan;

/**
 * @author Gautam Kundrai
 *
 */

public interface ILoanService {
	
	public List<Loan> getAllLoans();
	
    //public Optional<Loan> findByCode(String code);
    
	public Optional<Loan> getById(Long ld);
	
	public Loan getByGstNo(String gstNo);
	
}
