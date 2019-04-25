package com.kcfinance.loans.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kcfinance.loans.app.modals.LeadComment;


public interface LeadCommentsRepository extends JpaRepository<LeadComment, Long>{
	
	Optional<LeadComment> findByLocaleAndId (String locale,Long id);
	

}
