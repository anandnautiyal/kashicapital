package com.kcfinance.loans.app.service.lead.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kcfinance.loans.app.common.ResponseConstants;
import com.kcfinance.loans.app.modals.CustomerDocumentData;
import com.kcfinance.loans.app.modals.Lead;
import com.kcfinance.loans.app.modals.LeadCustomer;
import com.kcfinance.loans.app.modals.LeadDocument;
import com.kcfinance.loans.app.service.loan.ILeadService;
import com.kcfinance.loans.dao.LeadCommentsRepository;
import com.kcfinance.loans.dao.LeadCustomerRepository;
import com.kcfinance.loans.dao.LeadDocumentsRepository;
import com.kcfinance.loans.dao.LeadRepository;
import com.kcfinance.loans.web.controllers.webservices.LeadResponse;
import com.kcfinance.loans.web.controllers.webservices.LoanApplicationResponse;

@Service
@Transactional
public class LeadService implements ILeadService {
 
	private static final String SUCCESS_KEY = "SUCCESS";
	private static final String FAILURE_KEY = "SUCCESS";
	
    @Autowired
    private LeadRepository leadRepository ;
    
    @Autowired
    private LeadDocumentsRepository leadDocumentRepository ;
    
    @Autowired
    private LeadCustomerRepository leadCustomerRepository ;
    
    @Autowired
    private LeadCommentsRepository leadCommentsRepository ;
    
    public Optional<Lead> findById(Long id) {
        return leadRepository.findById(id);
    }
    
    public Optional<Lead> findByCode(String code) {
        return leadRepository.findByCode(code);
    }
    
    public List<Lead> getLeads() {
		return leadRepository.findAll();
	}
    
    public Lead saveLead(Lead lead) {
    	
    	LeadCustomer leadCustomer = lead.getLeadCustomer();
    	leadCustomer.setLead(lead);
    	for(LeadDocument document : leadCustomer.getLeadDocuments()) {
    		document.setLeadCustomer(leadCustomer);
    	}
    	
    	return leadRepository.save(lead);
    }
    
    public void deleteLead(Long id) {
    	leadRepository.deleteById(id);
    }
    
    
    
    public void updateLead(Lead lead, String leadId) {
        leadRepository.saveAndFlush(lead);
    }
 
    
   public List<Lead> findAllLeads() {
        return leadRepository.findAll();
    }


   public Optional<LeadDocument> findByDocumentId(String fileId) {	   
	   return leadDocumentRepository.findById(Long.parseLong(fileId));	  
   }
 
   @Override
	public LeadResponse addCustomerDocuments(CustomerDocumentData customerDocumentData) {

		LeadResponse leadResponse = new LeadResponse();
		
		try {

			Lead lead = leadRepository.findByCode(customerDocumentData.getCode()).orElse(null);

			if(lead != null) {

				LeadCustomer leadCustomer = lead.getLeadCustomer();
				List<LeadDocument> customerDocuments = customerDocumentData.getLeadDocuments();

				for(LeadDocument customerDocument : customerDocuments) {
					customerDocument.setLeadCustomer(leadCustomer);			
					leadCustomer.getLeadDocuments().add(customerDocument);
				}

				leadCustomerRepository.saveAndFlush(leadCustomer);
				leadResponse.setStatus(ResponseConstants.SUCCESS_KEY);
				leadResponse.setMessage(ResponseConstants.ADD_DOCUMENTS_SUCCESS_MSG);
			}

		} catch (Exception e) {
			leadResponse.setStatus(ResponseConstants.FAILURE_KEY);
			leadResponse.setMessage(ResponseConstants.ADD_DOCUMENTS_FAILURE_MSG);
			leadResponse.setErrors(Arrays.asList(e.getMessage()));
		}

		return leadResponse;
	}
    
}
