package com.kcfinance.loans.app.modals;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="application_loan_detail")
@NamedQuery(name="ApplicationLoanDetail.findAll", query="SELECT l FROM ApplicationLoanDetail l")
public class ApplicationLoanDetail implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="DATE_CREATED")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateCreated;

	@Column(name="DATE_MODIFIED")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateModified;

	@ManyToOne
	@JoinColumn(name="LOAN_TYPE_ID")
	private LoanType loanType;

	@Column(name="DEVICE_TYPE")
	private String deviceType;

	@Column(name="DEVICE_LOAN_OBJECTIVE")
	private String deviceLoanObjective;

	@Column(name="LOAN_OBJECTIVE")
	private String loanObjective;

	@Column(name="COST_OF_MACHINE")
	private BigDecimal costOfMachine;

	@Column(name="CUSTOMER_CONTRIBUTION_AMOUNT")
	private BigDecimal customerContributionAmount;

	@Column(name="LOAN_AMOUNT_REQUIRED")
	private BigDecimal loanAmountRequired;

	@Column(name="LOAN_AMOUNT")
	private BigDecimal loanAmount;

	@Column(name="LOAN_TERM")
	private BigDecimal loanTerm;
	

	@Column(name="SUPPLIER_NAME")
	private String supplierName;

	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(unique = true, name="LOAN_ID")
	private LoanApplication loanApplication;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateModified() {
		return dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public LoanType getLoanType() {
		return loanType;
	}

	public void setLoanType(LoanType loanType) {
		this.loanType = loanType;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDeviceLoanObjective() {
		return deviceLoanObjective;
	}

	public void setDeviceLoanObjective(String deviceLoanObjective) {
		this.deviceLoanObjective = deviceLoanObjective;
	}

	public String getLoanObjective() {
		return loanObjective;
	}

	public void setLoanObjective(String loanObjective) {
		this.loanObjective = loanObjective;
	}

	public BigDecimal getCostOfMachine() {
		return costOfMachine;
	}

	public void setCostOfMachine(BigDecimal costOfMachine) {
		this.costOfMachine = costOfMachine;
	}

	public BigDecimal getCustomerContributionAmount() {
		return customerContributionAmount;
	}

	public void setCustomerContributionAmount(BigDecimal customerContributionAmount) {
		this.customerContributionAmount = customerContributionAmount;
	}

	public BigDecimal getLoanAmountRequired() {
		return loanAmountRequired;
	}

	public void setLoanAmountRequired(BigDecimal loanAmountRequired) {
		this.loanAmountRequired = loanAmountRequired;
	}

	public BigDecimal getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(BigDecimal loanAmount) {
		this.loanAmount = loanAmount;
	}

	public BigDecimal getLoanTerm() {
		return loanTerm;
	}

	public void setLoanTerm(BigDecimal loanTerm) {
		this.loanTerm = loanTerm;
	}

	@JsonIgnore
	public LoanApplication getLoanApplication() {
		return loanApplication;
	}

	public void setLoanApplication(LoanApplication loanApplication) {
		this.loanApplication = loanApplication;
	}
	
	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}



}
