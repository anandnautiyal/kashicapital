package com.kcfinance.loans.app.service.loan;

import java.util.List;
import java.util.Optional;

import com.kcfinance.loans.app.modals.CommentsData;
import com.kcfinance.loans.app.modals.CustomerDocumentData;
import com.kcfinance.loans.app.modals.Lead;
import com.kcfinance.loans.app.modals.LeadDocument;
import com.kcfinance.loans.web.controllers.webservices.LeadResponse;

public interface ILeadService {

	public Optional<Lead> findById(Long id);

	public Optional<Lead> findByCode(String code);

	public List<Lead> getLeads();

	public Lead saveLead(Lead lead);

	public void deleteLead(Long id);

	public void updateLead(Lead lead, String leadId);

	public List<Lead> findAllLeads();

	public Optional<LeadDocument> findByDocumentId(String fileId);
	
	public LeadResponse addCustomerDocuments(CustomerDocumentData customerDocumentData);
	
	public LeadResponse addLeadComments(CommentsData customerCommentData);
}
