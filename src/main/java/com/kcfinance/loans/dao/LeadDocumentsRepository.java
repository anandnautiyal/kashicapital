package com.kcfinance.loans.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kcfinance.loans.app.modals.LeadDocument;

public interface LeadDocumentsRepository extends JpaRepository<LeadDocument, Long> {
	
}
