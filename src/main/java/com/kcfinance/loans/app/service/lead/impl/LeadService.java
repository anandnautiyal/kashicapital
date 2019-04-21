package com.kcfinance.loans.app.service.lead.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.kcfinance.loans.app.modals.Lead;

import com.kcfinance.loans.dao.LeadRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LeadService{
 
    @Autowired
    private LeadRepository leadRepository ;
 
    public Optional<Lead> findById(String id) {
        return leadRepository.findById(Long.parseLong(id));
    }
 
   
    /*public void saveLead(Lead Lead) {
    	leadDao.save(Lead);
    }*/
    
    public void updateLead(Lead lead) {
        Optional<Lead> entity = leadRepository.findById(lead.getId());
        if(entity!=null){
            
           /* entity.get().setFirstName(lead.getFirstName());
            entity.get().setLastName(lead.getLastName());
            entity.get().setMobileNumber(lead.getMobileNumber());
            */
        }
    }
 
     
   public Iterable<Lead> findAllLeads() {
        return leadRepository.findAll();
    }
 
   
    
}
