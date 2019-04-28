package com.kcfinance.loans.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kcfinance.loans.app.modals.ApplicantBusinessDetail;

public interface ApplicantBusinessDetailRepository extends JpaRepository<ApplicantBusinessDetail, Long> {
	
	public ApplicantBusinessDetail findByGstNumber(String gstNumber);
}
