package com.kcfinance.loans.app.modals;

import java.util.List;

public class CommentsData {

    private Long customerId;

    private String code;
   
    private List<LeadComment> leadComments;
   
    private List<LoanApplicationComment> loanApplicationComments;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<LeadComment> getLeadComments() {
        return leadComments;
    }

    public void setLeadComments(List<LeadComment> leadComments) {
        this.leadComments = leadComments;
    }

    public List<LoanApplicationComment> getLoanApplicationComments() {
        return loanApplicationComments;
    }

    public void setLoanApplicationComments(List<LoanApplicationComment> loanApplicationComments) {
        this.loanApplicationComments = loanApplicationComments;
    }
}
