package com.kcfinance.loans.web.controllers.webservices;

import java.util.Arrays;
import java.util.List;

public class LeadResponse {
	
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

	public LeadResponse() {
		super();
	}

	public LeadResponse(String status, String message, List<String> errors) {
		super();
		this.status = status;
		this.message = message;
		this.errors = errors;
	}
	
	public LeadResponse(String status, String message, String error) {
		super();
		this.status = status;
		this.message = message;
		this.errors = Arrays.asList(error);
	}

}
