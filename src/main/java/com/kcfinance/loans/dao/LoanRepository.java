package com.kcfinance.loans.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.kcfinance.loans.app.modals.Loan;

/**
 * @author Gautam Kundrai
 *
 */

public interface LoanRepository extends JpaRepository<Loan, Long> {

}