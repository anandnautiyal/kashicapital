package com.kcfinance.loans.app.service.lead.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.kcfinance.loans.app.modals.Lead;
import com.kcfinance.loans.app.modals.LeadDocuments;
import com.kcfinance.loans.dao.LeadDocumentsRepository;
import com.kcfinance.loans.dao.LeadRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LeadService{
 
    @Autowired
    private LeadRepository leadRepository ;
    
    @Autowired
    private LeadDocumentsRepository leadDocumentRepository ;
 
    public Optional<Lead> findById(String id) {
        return leadRepository.findById(Long.parseLong(id));
    }
 
   
    public void saveLead(Lead Lead) {
    	leadRepository.save(Lead);
    }
    
    public void updateLead(Lead lead, String leadId) {
        Optional<Lead> entity = leadRepository.findById(Long.parseLong(leadId));
        if(entity!=null){
        	
        	entity.get().getLeadCustomer().setFirstName(lead.getLeadCustomer().getFirstName());
        	
        	entity.get().getLeadCustomer().setLastName(lead.getLeadCustomer().getLastName());
        	
        	entity.get().getLeadCustomer().setMeetingDate(lead.getLeadCustomer().getMeetingDate());
        	
        	entity.get().getLeadCustomer().setPhone(lead.getLeadCustomer().getPhone());
        	
        	leadRepository.saveAndFlush(entity.get());
        	
        	
        
         }
        
       
    }
 
    
   public List<Lead> findAllLeads() {
        return leadRepository.findAll();
    }


   public Optional<LeadDocuments> findByDocumentId(String fileId) {
	   
	   return leadDocumentRepository.findById(Long.parseLong(fileId));
	  
   }
 
   
    
}
