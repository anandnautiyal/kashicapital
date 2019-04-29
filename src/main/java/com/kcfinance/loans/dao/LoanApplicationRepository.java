package com.kcfinance.loans.dao;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kcfinance.loans.app.modals.LoanApplication;

/**
 * @author Gautam Kundrai
 *
 */

public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {
	
	public Optional<LoanApplication> findByCode(String code);
}