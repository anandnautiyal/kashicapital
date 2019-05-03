package com.kcfinance.loans.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kcfinance.loans.app.modals.LeadCustomer;

public interface LeadCustomerRepository extends JpaRepository<LeadCustomer, Long> {

}
