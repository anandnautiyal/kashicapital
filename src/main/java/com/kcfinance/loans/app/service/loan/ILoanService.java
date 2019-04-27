package com.kcfinance.loans.app.service.loan;

import java.util.List;

import com.kcfinance.loans.app.modals.Loan;

/**
 * @author Gautam Kundrai
 *
 */

public interface ILoanService {
	
	public List<Loan> getAllLoans();
	
	//public Loan getLoanById(Long ld);
	
}