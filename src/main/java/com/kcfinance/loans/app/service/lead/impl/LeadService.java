package com.kcfinance.loans.app.service.lead.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.kcfinance.loans.app.modals.Lead;
import com.kcfinance.loans.app.modals.LeadCustomer;
import com.kcfinance.loans.app.modals.LeadDocument;
import com.kcfinance.loans.dao.LeadCommentsRepository;
import com.kcfinance.loans.dao.LeadDocumentsRepository;
import com.kcfinance.loans.dao.LeadRepository;

@Service
@Transactional
public class LeadService{
 
    @Autowired
    private LeadRepository leadRepository ;
    
    @Autowired
    private LeadDocumentsRepository leadDocumentRepository ;
    
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
 
   
    
}
