package com.kcfinance.loans.Exceptions;

public class GenericException extends RuntimeException {

	public GenericException(String entityName, String code) {
		super("Could not find "+entityName+" with code: " + code);
	}
}
