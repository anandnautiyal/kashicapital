package com.kcfinance.loans.web.controllers.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kcfinance.loans.app.modals.Loan;
import com.kcfinance.loans.app.service.loan.ILoanService;

/**
 * Rest controller for all the loan URL's
 * provides services to add update delete loan specific data
 * @author Gautam Kundrai
 *
 */
@RestController
public class LoanControllerRest {

	@Autowired
	private ILoanService loanService;
	
	// Aggregate root
	@GetMapping("/loans")
	public List<Loan> all() {
		return loanService.getAllLoans();
	}
}
