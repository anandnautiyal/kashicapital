package com.kcfinance.loans.web.controllers.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kcfinance.loans.Exceptions.GenericException;
import com.kcfinance.loans.app.modals.LoanApplication;
import com.kcfinance.loans.app.service.loan.ILoanService;

/**
 * Rest controller for all the loan URL's
 * provides services to add update delete loan specific data
 * @author Gautam Kundrai
 *
 */
@RestController
public class LoanApplicationControllerRest {

	@Autowired
	private ILoanService loanService;
	
	// Aggregate root
	@GetMapping("/loans")
	public List<LoanApplication> all() {
		return loanService.getAllLoans();
	}
	
	@GetMapping("/loans/{id}")
	LoanApplication byId(@PathVariable Long id) {
		return loanService.getById(id)
			.orElseThrow(() -> new GenericException("LoanApplication", String.valueOf(id)));
	}
	
	@GetMapping("/loans/gst/{gstNo}")
	LoanApplication byGstNo(@PathVariable String gstNo) {
		return loanService.getByGstNo(gstNo);
			//.orElseThrow(() -> new GenericException(Loan.NAME, gstNo));
	}
}