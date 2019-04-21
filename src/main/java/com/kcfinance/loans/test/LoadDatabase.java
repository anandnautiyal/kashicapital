package com.kcfinance.loans.test;

import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kcfinance.loans.app.modals.Customer;
import com.kcfinance.loans.app.modals.User;
import com.kcfinance.loans.dao.CustomerRepository;
import com.kcfinance.loans.dao.UserRepository;


@Configuration
@Slf4j
public class LoadDatabase {

	Logger log = LoggerFactory.getLogger(LoadDatabase.class);
			
	/*@Bean
	CommandLineRunner initDatabase(CustomerRepository customerRepository, UserRepository userRepository) {
		return args -> {
			log.info("Preloading customer" + customerRepository.save(new Customer("Bilbo Baggins", "burglar", "9999999999", "California")));
			log.info("Preloading customer" + customerRepository.save(new Customer("Frodo Baggins", "thief", "77777777777", "New York")));
			
			log.info("Preloading user" + userRepository.save(new User("Admin", "Admin", "admin", "password1")));
			log.info("Preloading user" + userRepository.save(new User("Administrator", "Administrator", "administrator", "password1")));
			log.info("Preloading user" + userRepository.save(new User("User", "User", "user", "password1")));
		};
	}*/
}
