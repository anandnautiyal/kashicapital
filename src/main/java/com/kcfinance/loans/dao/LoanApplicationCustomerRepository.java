package com.kcfinance.loans.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kcfinance.loans.app.modals.LoanApplicationCustomer;

public interface LoanApplicationCustomerRepository extends JpaRepository<LoanApplicationCustomer, Long> {

}
