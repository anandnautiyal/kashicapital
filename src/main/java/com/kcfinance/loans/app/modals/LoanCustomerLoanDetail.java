package com.kcfinance.loans.app.modals;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the loan_customer_loan_detail database table.
 * 
 */
@Entity
@Table(name="loan_customer_loan_detail")
@NamedQuery(name="LoanCustomerLoanDetail.findAll", query="SELECT l FROM LoanCustomerLoanDetail l")
public class LoanCustomerLoanDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="BALANCE_LOAN_AMOUNT")
	private BigDecimal balanceLoanAmount;

	@Column(name="DATE_CREATED")
	private Timestamp dateCreated;

	@Column(name="DATE_MODIFIED")
	private Timestamp dateModified;

	@Column(name="LOAN_AGREEMENT_INCORPORATED")
	private String loanAgreementIncorporated;

	@Column(name="LOAN_AMOUNT")
	private BigDecimal loanAmount;

	@Column(name="LOAN_COMPANY_NAME")
	private String loanCompanyName;

	@Column(name="LOAN_EMI_AMOUNT")
	private BigDecimal loanEmiAmount;

	@Column(name="LOAN_EMI_TYPE")
	private String loanEmiType;

	@Column(name="LOAN_INTEREST_RATE")
	private BigDecimal loanInterestRate;

	@Column(name="LOAN_SECURITY")
	private String loanSecurity;

	@Column(name="LOAN_START_DATE")
	private Timestamp loanStartDate;

	@Column(name="LOAN_TERM")
	private String loanTerm;

	@Column(name="PRESENT_LOAN_STATUS")
	private String presentLoanStatus;

	private String purpose;

	@Column(name="TYPE_OF_LOAN")
	private String typeOfLoan;

	//bi-directional many-to-one association to LoanApplicationCustomer
	@ManyToOne
	@JoinColumn(name="LOAN_CUSTOMER_ID")
	private LoanApplicationCustomer loanApplicationCustomer;

	public LoanCustomerLoanDetail() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getBalanceLoanAmount() {
		return this.balanceLoanAmount;
	}

	public void setBalanceLoanAmount(BigDecimal balanceLoanAmount) {
		this.balanceLoanAmount = balanceLoanAmount;
	}

	public Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Timestamp getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Timestamp dateModified) {
		this.dateModified = dateModified;
	}

	public String getLoanAgreementIncorporated() {
		return this.loanAgreementIncorporated;
	}

	public void setLoanAgreementIncorporated(String loanAgreementIncorporated) {
		this.loanAgreementIncorporated = loanAgreementIncorporated;
	}

	public BigDecimal getLoanAmount() {
		return this.loanAmount;
	}

	public void setLoanAmount(BigDecimal loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoanCompanyName() {
		return this.loanCompanyName;
	}

	public void setLoanCompanyName(String loanCompanyName) {
		this.loanCompanyName = loanCompanyName;
	}

	public BigDecimal getLoanEmiAmount() {
		return this.loanEmiAmount;
	}

	public void setLoanEmiAmount(BigDecimal loanEmiAmount) {
		this.loanEmiAmount = loanEmiAmount;
	}

	public String getLoanEmiType() {
		return this.loanEmiType;
	}

	public void setLoanEmiType(String loanEmiType) {
		this.loanEmiType = loanEmiType;
	}

	public BigDecimal getLoanInterestRate() {
		return this.loanInterestRate;
	}

	public void setLoanInterestRate(BigDecimal loanInterestRate) {
		this.loanInterestRate = loanInterestRate;
	}

	public String getLoanSecurity() {
		return this.loanSecurity;
	}

	public void setLoanSecurity(String loanSecurity) {
		this.loanSecurity = loanSecurity;
	}

	public Timestamp getLoanStartDate() {
		return this.loanStartDate;
	}

	public void setLoanStartDate(Timestamp loanStartDate) {
		this.loanStartDate = loanStartDate;
	}

	public String getLoanTerm() {
		return this.loanTerm;
	}

	public void setLoanTerm(String loanTerm) {
		this.loanTerm = loanTerm;
	}

	public String getPresentLoanStatus() {
		return this.presentLoanStatus;
	}

	public void setPresentLoanStatus(String presentLoanStatus) {
		this.presentLoanStatus = presentLoanStatus;
	}

	public String getPurpose() {
		return this.purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getTypeOfLoan() {
		return this.typeOfLoan;
	}

	public void setTypeOfLoan(String typeOfLoan) {
		this.typeOfLoan = typeOfLoan;
	}

	@JsonIgnore
	public LoanApplicationCustomer getLoanApplicationCustomer() {
		return this.loanApplicationCustomer;
	}

	public void setLoanApplicationCustomer(LoanApplicationCustomer loanApplicationCustomer) {
		this.loanApplicationCustomer = loanApplicationCustomer;
	}

}