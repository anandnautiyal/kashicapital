package com.kcfinance.loans.app.modals;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Customer {
	
	private @Id @GeneratedValue Long id;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public Customer(String firstName, String lastName, String phone,
			String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}

	
}
