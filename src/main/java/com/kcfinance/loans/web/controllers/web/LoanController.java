package com.kcfinance.loans.web.controllers.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.kcfinance.loans.app.modals.Lead;
import com.kcfinance.loans.app.modals.LeadComment;
import com.kcfinance.loans.app.modals.LeadDocument;
import com.kcfinance.loans.app.modals.LoanApplication;
import com.kcfinance.loans.app.modals.LoanApplicationComment;
import com.kcfinance.loans.app.modals.LoanApplicationCustomerDocument;
import com.kcfinance.loans.app.service.loan.ILoanService;

@Controller
@RequestMapping("/")
@SessionAttributes ("loan")
public class LoanController {
	
	@Autowired
	ILoanService loanService;


	@Autowired
	MessageSource messageSource;

	@RequestMapping(value="/loan", method = RequestMethod.GET)
    public String showHomePage(ModelMap model){
        return "loan";
    }
	
	/**
	 * This method will list all existing users.
	 */
	@RequestMapping(value="/getLoans", method = RequestMethod.POST)
	public String listLoan(ModelMap model) {

		List<LoanApplication> loanList = loanService.getAllLoans();
		model.addAttribute("loanList", loanList);


		return "loan";
	}
	

	/**
	 * This method will list all existing users.
	 */
	@RequestMapping(value = { "/getLoan" }, method = RequestMethod.POST)
	public String findLead(@ModelAttribute("loan") LoanApplication loan, ModelMap model) {

		Optional<LoanApplication> tempLoan = loanService.getByCode(loan.getCode());
		if(tempLoan.isPresent()){
			List<LoanApplication> loans = new ArrayList<LoanApplication>();
			loans.add(tempLoan.get());
			
			model.addAttribute("loanList", loans);
		}else{
			model.addAttribute("noRecords", "No records are found for the given Loan Application number");
			
		}

		return "loan";
	}
	
	/**
	 * This method will provide the medium to update an existing user.
	 */
	@RequestMapping(value = { "/edit-loan-{loanId}" }, method = RequestMethod.GET)
	public String editUser(@PathVariable String loanId, ModelMap model) {
		Optional<LoanApplication> loanData = loanService.getById(Long.parseLong(loanId));
		LoanApplicationComment comment = new LoanApplicationComment();
		comment.setLoanApplication(loanData.get());
		loanData.get().getLoanApplicationComments().add(comment);
		model.addAttribute("loan",  loanData.get());
		model.addAttribute("edit", true);
		return "editLoan";
	}

	@RequestMapping(value = { "/edit-loan-{loanId}" }, method = RequestMethod.POST)
	public String updateLoanApplication(@ModelAttribute ("loan") LoanApplication loanApplication, BindingResult result,
			ModelMap model, @PathVariable String loanId) {

		if (result.hasErrors()) {
			return "editLoan";
		}

		loanService.updateLoanApplication(loanApplication, loanId);

		model.addAttribute("success", "Loan Application with - " + loanApplication.getCode() + "updated successfully");
		return ".tile.loanApplicationSuccess";
	}
	
	@RequestMapping("/downloadLoanFile/{fileId}")
	public String downloadFile(@PathVariable String fileId, HttpServletResponse response) {
		// Load file from database
		Optional<LoanApplicationCustomerDocument> file = loanService.findByDocumentId(fileId);

		// Check if file is actually retrieved from database.
		try {
			if (file.get().getDocumentImage() != null) {
				response.setContentType("image/png");
				response.setHeader("Content-Length", String.valueOf(file.get().getDocumentImage().length));
				// Write file content to response.
				response.getOutputStream().write(file.get().getDocumentImage());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@ModelAttribute("loan")
	public LoanApplication createLeadForm() {
		return new LoanApplication();
	}
}
