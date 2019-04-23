package com.kcfinance.loans.dao;


import org.springframework.data.jpa.repository.JpaRepository;


import com.kcfinance.loans.app.modals.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {
 
	

	
}