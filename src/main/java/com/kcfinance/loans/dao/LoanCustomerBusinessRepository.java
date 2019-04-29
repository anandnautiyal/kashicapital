package com.kcfinance.loans.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kcfinance.loans.app.modals.LoanCustomerBusiness;

public interface LoanCustomerBusinessRepository extends JpaRepository<LoanCustomerBusiness, Long> {
	
	public LoanCustomerBusiness findByGstNumber(String gstNumber);
}
