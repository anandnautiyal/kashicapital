package com.kcfinance.loans.web.controllers.webservices;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kcfinance.loans.Exceptions.CustomerNotFoundException;
import com.kcfinance.loans.app.modals.Customer;
import com.kcfinance.loans.dao.CustomerRepository;

@RestController
public class CustomerController {

	private final CustomerRepository customerRepository;

	CustomerController(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	// Aggregate root
	@GetMapping("/customers")
	List<Customer> all() {
		return customerRepository.findAll();
	}

	@PostMapping("/customers")
	Customer newCustomer(@RequestBody Customer newCustomer) {
		return customerRepository.save(newCustomer);
	}
	
	@GetMapping("/customers/{id}")
	Customer one(@PathVariable Long id) {

		return customerRepository.findById(id)
			.orElseThrow(() -> new CustomerNotFoundException(id));
	}

	/*@PutMapping("/customers/{id}")
	Customer replaceCustomer(@RequestBody Customer newCustomer, @PathVariable Long id) {
		
		return customerRepository.findById(id).map(customer -> {
			customer.setFirstName(newCustomer.getFirstName());
			customer.setLastName(newCustomer.getLastName());
			customer.setPhone(newCustomer.getPhone());
			customer.setAddress(newCustomer.getAddress());			
			return customerRepository.save(customer);
		}).orElseGet(() -> {
			newCustomer.setId(id);
			return customerRepository.save(newCustomer);
		});
	}*/

	@DeleteMapping("/customers/{id}")
	void deleteCustomer(@PathVariable Long id) {
		customerRepository.deleteById(id);
	}
}
