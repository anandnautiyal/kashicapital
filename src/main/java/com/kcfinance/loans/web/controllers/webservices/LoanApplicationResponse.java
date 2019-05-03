package com.kcfinance.loans.web.controllers.webservices;

import java.util.Arrays;
import java.util.List;

public class LoanApplicationResponse {
	
	private String status;
	
	private String message;
	
	private List<String> errors;
	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

	public LoanApplicationResponse() {
		super();
	}

	public LoanApplicationResponse(String status, String message, List<String> errors) {
		super();
		this.status = status;
		this.message = message;
		this.errors = errors;
	}
	
	public LoanApplicationResponse(String status, String message, String error) {
		super();
		this.status = status;
		this.message = message;
		this.errors = Arrays.asList(error);
	}

}
