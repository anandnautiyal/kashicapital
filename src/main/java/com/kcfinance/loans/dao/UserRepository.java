package com.kcfinance.loans.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kcfinance.loans.app.modals.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
