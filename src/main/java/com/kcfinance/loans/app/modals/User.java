package com.kcfinance.loans.app.modals;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class User {
	
	private @Id @GeneratedValue Long id;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	
	public User(String firstName, String lastName, String username,
			String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
	}		
	
}
