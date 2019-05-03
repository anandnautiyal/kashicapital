package com.kcfinance.loans.app.modals;

import java.util.List;

public class CustomerDocumentData {
		
	private String code;
	
	private List<LeadDocument> leadDocuments;
	
	private List<LoanApplicationCustomerDocument> loanApplicationCustomerDocuments;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<LeadDocument> getLeadDocuments() {
		return leadDocuments;
	}

	public void setLeadDocuments(List<LeadDocument> leadDocuments) {
		this.leadDocuments = leadDocuments;
	}

	public List<LoanApplicationCustomerDocument> getLoanApplicationCustomerDocuments() {
		return loanApplicationCustomerDocuments;
	}

	public void setLoanApplicationCustomerDocuments(
			List<LoanApplicationCustomerDocument> loanApplicationCustomerDocuments) {
		this.loanApplicationCustomerDocuments = loanApplicationCustomerDocuments;
	}

}
