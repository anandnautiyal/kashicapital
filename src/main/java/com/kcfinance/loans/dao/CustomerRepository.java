package com.kcfinance.loans.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kcfinance.loans.app.modals.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
