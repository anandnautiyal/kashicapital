package com.kcfinance.loans.web.controllers.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
}
