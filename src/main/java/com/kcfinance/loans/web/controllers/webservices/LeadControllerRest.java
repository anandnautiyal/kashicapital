package com.kcfinance.loans.web.controllers.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.kcfinance.loans.Exceptions.LeadNotFoundException;
import com.kcfinance.loans.app.modals.CommentsData;
import com.kcfinance.loans.app.modals.CustomerDocumentData;
import com.kcfinance.loans.app.modals.Lead;
import com.kcfinance.loans.app.service.loan.ILeadService;

/**
 * Rest controller for all the lead URL's
 * provides services to add update delete lead data
 * @author Anand Nautiyal
 *
 */
@RestController
public class LeadControllerRest {

	@Autowired
	private ILeadService leadService;
	
	// Aggregate root
	@GetMapping("/leads")
	public List<Lead> all() {
		return leadService.getLeads();
	}

	@PostMapping("/leads")
	Lead newCustomer(@RequestBody Lead newLead) {
		return leadService.saveLead(newLead);
	}
	
	/*
	 * @GetMapping("/leads/{id}") Lead one(@PathVariable Long id) { return
	 * leadService.findById(id) .orElseThrow(() -> new
	 * LeadNotFoundException(String.valueOf(id))); }
	 */
	
	@GetMapping("/leads/{code}")
	Lead oneByCode(@PathVariable String code) {
		return leadService.findByCode(code)
			.orElseThrow(() -> new LeadNotFoundException(code));
	}
	
	@DeleteMapping("/leads/{id}")
	void deleteLead(@PathVariable Long id) {
		leadService.deleteLead(id);
	}
	
	@PostMapping("/leads/docs")
	LeadResponse updateCustomerDocuments(@RequestBody CustomerDocumentData customerDocumentData) {
		return leadService.addCustomerDocuments(customerDocumentData);
	}
	
	@PostMapping("/leads/comments")
	LeadResponse updateCustomerDocuments(@RequestBody CommentsData customerDocumentData) {
		return leadService.addLeadComments(customerDocumentData);
	}
}
