package com.kcfinance.loans.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kcfinance.loans.app.modals.CustomerAsset;

public interface CustomerAssetTypeRepository extends JpaRepository<CustomerAsset, Long>{
	
	public CustomerAsset findByAssetTypeCode(String code);

}
