package com.kcfinance.loans.app.modals;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the loan_customer_bank_detail database table.
 * 
 */
@Entity
@Table(name="loan_customer_bank_detail")
@NamedQuery(name="LoanCustomerBankDetail.findAll", query="SELECT l FROM LoanCustomerBankDetail l")
public class LoanCustomerBankDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="ACCOUNT_NUMBER")
	private String accountNumber;

	@Column(name="ACCOUNT_START_DATE")
	private Timestamp accountStartDate;

	@Column(name="BANK_ACCOUNT_TYPE")
	private String bankAccountType;

	@Column(name="BANK_BRANCH_NUMBER")
	private String bankBranchNumber;

	@Column(name="BANK_NAME")
	private String bankName;

	@Column(name="DATE_CREATED")
	private Timestamp dateCreated;

	@Column(name="DATE_MODIFIED")
	private Timestamp dateModified;

	@Column(name="DEPOSIT_AMOUNT")
	private BigDecimal depositAmount;

	//bi-directional many-to-one association to LoanApplicationCustomer
	@ManyToOne
	@JoinColumn(name="LOAN_CUSTOMER_ID")
	private LoanApplicationCustomer loanApplicationCustomer;

	public LoanCustomerBankDetail() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Timestamp getAccountStartDate() {
		return this.accountStartDate;
	}

	public void setAccountStartDate(Timestamp accountStartDate) {
		this.accountStartDate = accountStartDate;
	}

	public String getBankAccountType() {
		return this.bankAccountType;
	}

	public void setBankAccountType(String bankAccountType) {
		this.bankAccountType = bankAccountType;
	}

	public String getBankBranchNumber() {
		return this.bankBranchNumber;
	}

	public void setBankBranchNumber(String bankBranchNumber) {
		this.bankBranchNumber = bankBranchNumber;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
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

	public BigDecimal getDepositAmount() {
		return this.depositAmount;
	}

	public void setDepositAmount(BigDecimal depositAmount) {
		this.depositAmount = depositAmount;
	}

	@JsonIgnore
	public LoanApplicationCustomer getLoanApplicationCustomer() {
		return this.loanApplicationCustomer;
	}

	public void setLoanApplicationCustomer(LoanApplicationCustomer loanApplicationCustomer) {
		this.loanApplicationCustomer = loanApplicationCustomer;
	}

}