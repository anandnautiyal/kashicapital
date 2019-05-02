package com.kcfinance.loans.web.controllers.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kcfinance.loans.app.modals.Lead;
import com.kcfinance.loans.app.modals.LeadComment;
import com.kcfinance.loans.app.modals.LoanApplication;
import com.kcfinance.loans.app.service.loan.impl.LoanService;

@Controller
@RequestMapping("/")
public class LoanController {
	
	@Autowired
	LoanService loanService;


	@Autowired
	MessageSource messageSource;

	@RequestMapping(value="/loan", method = RequestMethod.GET)
    public String showHomePage(ModelMap model){
        return "loan";
    }
	
	/**
	 * This method will list all existing users.
	 */
	@RequestMapping(value="/getLoan", method = RequestMethod.POST)
	public String listLoan(ModelMap model) {

		List<LoanApplication> loanList = loanService.getAllLoans();
		model.addAttribute("loanList", loanList);


		return "loan";
	}
	
	/**
	 * This method will provide the medium to update an existing user.
	 */
	@RequestMapping(value = { "/edit-loan-{loanId}" }, method = RequestMethod.GET)
	public String editUser(@PathVariable String loanId, ModelMap model) {
		Optional<LoanApplication> loanData = loanService.getById(Long.parseLong(loanId));
		model.addAttribute("loanData",  loanData.get());
		model.addAttribute("edit", true);
		return "editLoan";
	}

}
