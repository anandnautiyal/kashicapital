package com.kcfinance.loans.Exceptions;


public class LeadNotFoundException extends RuntimeException {

	public LeadNotFoundException(String code) {
		super("Could not find lead with code: " + code);
	}
}