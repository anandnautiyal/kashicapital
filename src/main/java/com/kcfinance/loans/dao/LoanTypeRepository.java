package com.kcfinance.loans.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kcfinance.loans.app.modals.LoanType;

public interface LoanTypeRepository extends JpaRepository<LoanType, Long>{

	public LoanType findByLoanTypeCode(String code);
}
