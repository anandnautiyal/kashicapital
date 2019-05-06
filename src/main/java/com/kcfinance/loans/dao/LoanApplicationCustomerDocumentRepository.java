package com.kcfinance.loans.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.kcfinance.loans.app.modals.LoanApplicationCustomerDocument;

public interface LoanApplicationCustomerDocumentRepository extends JpaRepository<LoanApplicationCustomerDocument, Long>  {

}
