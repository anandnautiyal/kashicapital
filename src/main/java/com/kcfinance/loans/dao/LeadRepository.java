package com.kcfinance.loans.dao;


import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;


import com.kcfinance.loans.app.modals.Lead;


public interface LeadRepository extends JpaRepository<Lead, Long> {

	List<Lead> findByLocale (String locale);

}