package com.kcfinance.loans.web.controllers.web;



import java.beans.PropertyEditor;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.kcfinance.loans.app.modals.Lead;
import com.kcfinance.loans.app.modals.LeadComment;

import com.kcfinance.loans.app.modals.LeadDocument;

import com.kcfinance.loans.app.service.lead.impl.LeadService;

@Controller
@RequestMapping("/")

public class LeadController {

	@Autowired
	LeadService leadService;


	@Autowired
	MessageSource messageSource;

	@RequestMapping(value="/lead", method = RequestMethod.GET)
	public String showHomePage(ModelMap model){
		return "lead";
	}

	/**
	 * This method will list all existing users.
	 */
	@RequestMapping(value = { "/list", "/list" }, method = RequestMethod.POST)
	public String listUsers(ModelMap model) {

		List<Lead> leads = leadService.findAllLeads();
		model.addAttribute("leadList", leads);


		return "lead";
	}


	/**
	 * This method will provide the medium to update an existing user.
	 */
	@RequestMapping(value = { "/edit-user-{leadId}" }, method = RequestMethod.GET)
	public String editUser(@PathVariable String leadId, ModelMap model) {
		Optional<Lead> lead = leadService.findById(leadId);
		model.addAttribute("lead", lead.get());
		model.addAttribute("edit", true);
		return "editLead";
	}

	@RequestMapping(value = { "/edit-user-{leadId}" }, method = RequestMethod.POST)
	public String updateUser(@ModelAttribute Lead lead, BindingResult result,
			ModelMap model, @PathVariable String leadId) {

		if (result.hasErrors()) {
			return "registration";
		}

		leadService.updateLead(lead,leadId);

		model.addAttribute("success", "User " + lead.getLeadCustomer().getFirstName() + " "+ lead.getLeadCustomer().getLastName() + " updated successfully");
		return "leadSuccess";
	}

	@RequestMapping("/downloadFile/{fileId}")
	public String  downloadFile(@PathVariable String fileId,HttpServletResponse response) {
		// Load file from database
		Optional<LeadDocument> file = leadService.findByDocumentId(fileId);  

		// Check if file is actually retrieved from database.  
		try{
			if (file.get().getDocumentImage() != null) {  
				response.setContentType("image/jpeg");  
				response.setHeader("Content-Length",  
						String.valueOf(file.get().getDocumentImage().length));  
				// Write file content to response.  
				response.getOutputStream().write(file.get().getDocumentImage());  
			} 

		} catch (IOException e) {  
			e.printStackTrace();  
		}  
		return null;
	}	

	 

}