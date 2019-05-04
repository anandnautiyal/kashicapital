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
import com.kcfinance.loans.app.service.lead.impl.LeadService;

@Controller
@RequestMapping("/")
@SessionAttributes ("lead")
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
	@RequestMapping(value = { "/list" }, method = RequestMethod.POST)
	public String listUsers(ModelMap model) {

		List<Lead> leads = leadService.findAllLeads();
		model.addAttribute("leadList", leads);


		return "lead";
	}

	/**
	 * This method will list all existing users.
	 */
	@RequestMapping(value = { "/findLead" }, method = RequestMethod.POST)
	public String findLead(@ModelAttribute ("lead") Lead lead,ModelMap model) {

		Optional<Lead> tempLead= leadService.findByCode(lead.getCode());
		
		List<Lead> leads = new ArrayList<Lead>();
		leads.add(tempLead.get());
		model.addAttribute("leadList", leads);


		return "lead";
	}

	/**
	 * This method will provide the medium to update an existing user.
	 */
	@RequestMapping(value = { "/edit-user-{leadId}" }, method = RequestMethod.GET)
	public String editUser(@PathVariable String leadId, ModelMap model) {
		Optional<Lead> lead = leadService.findById(Long.parseLong(leadId));
		
		LeadComment comments = new LeadComment("","open");
		comments.setLead(lead.get());
		lead.get().getLeadComments().add(comments);
		model.addAttribute("lead", lead.get());
		model.addAttribute("edit", true);
		return "editLead";
	}

	@RequestMapping(value = { "/edit-user-{leadId}" }, method = RequestMethod.POST)
	public String updateUser(@ModelAttribute ("lead") Lead lead, BindingResult result,
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
				response.setContentType("image/png");  
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

	@ModelAttribute("lead")
	public Lead createLeadForm() {
		return new Lead();
	}

}