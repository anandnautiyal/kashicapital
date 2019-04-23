package com.kcfinance.loans.web.controllers.web;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.kcfinance.loans.app.modals.Lead;
import com.kcfinance.loans.app.modals.LeadModal;
import com.kcfinance.loans.app.service.lead.impl.LeadService;
import com.kcfinance.loans.dao.LeadRepository;

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
	public String updateUser(@Valid Lead lead, BindingResult result,
			ModelMap model, @PathVariable String leadId) {

		if (result.hasErrors()) {
			return "registration";
		}

		leadService.updateLead(lead,leadId);

		model.addAttribute("success", "User " + lead.getLeadCustomer().getFirstName() + " "+ lead.getLeadCustomer().getLastName() + " updated successfully");
		return "leadSuccess";
	}



}