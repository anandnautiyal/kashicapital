package com.kcfinance.loans.app.service.loan;

import java.util.List;
import java.util.Optional;

import com.kcfinance.loans.app.modals.CustomerDocumentData;
import com.kcfinance.loans.app.modals.LoanApplication;
import com.kcfinance.loans.web.controllers.webservices.LoanApplicationResponse;

/**
 * @author Gautam Kundrai
 *
 */

public interface ILoanService {
	
	public List<LoanApplication> getAllLoans();
	
    //public Optional<Loan> findByCode(String code);
    
	public Optional<LoanApplication> getById(Long ld);
	
	public LoanApplication getByGstNo(String gstNo);
	
	public Optional<LoanApplication> getByCode(String code);
	
	public LoanApplicationResponse saveLoanApplication(LoanApplication loanApplication);
	
	public LoanApplicationResponse addCustomerDocuments(CustomerDocumentData customerDocumentData);
	
	public void updateLoanApplication(LoanApplication loanApplication, String loanId);
	
}