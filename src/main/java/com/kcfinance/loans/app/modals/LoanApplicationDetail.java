package com.kcfinance.loans.app.modals;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
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

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the loan_application_detail database table.
 * 
 */
@Entity
@Table(name="loan_application_detail")
@NamedQuery(name="LoanApplicationDetail.findAll", query="SELECT l FROM LoanApplicationDetail l")
public class LoanApplicationDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@Column(name="AGRICULTURAL_INCOME")
	private BigDecimal agriculturalIncome;

	@Column(name="APPLICANT_NAME")
	private String applicantName;

	@Column(name="APPLICATION_SERIOL_NUMBER")
	private String applicationSeriolNumber;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Column(name="COAPPLICANT_NAME")
	private String coapplicantName;

	private String code;

	@Column(name="CUSTOMER_NUMBER")
	private String customerNumber;

	@Column(name="DATE_CREATED")
	private Timestamp dateCreated;

	@Column(name="DATE_MODIFIED")
	private Timestamp dateModified;

	@Column(name="DOMESTIC_INCOME")
	private BigDecimal domesticIncome;

	@Column(name="EXISTING_CUSTOMER_DETAIL")
	private String existingCustomerDetail;

	@Column(name="INCOME_FROM_MILK")
	private BigDecimal incomeFromMilk;

	@Column(name="INCOME_FROM_OTHER_MEMBER")
	private BigDecimal incomeFromOtherMember;

	@Column(name="INCOME_FROM_OTHER_SOURCE")
	private BigDecimal incomeFromOtherSource;

	@Column(name="INCOME_FROM_RENT")
	private BigDecimal incomeFromRent;

	@Column(name="LOAN_OFFICER_NAME")
	private String loanOfficerName;

	@Column(name="LOAN_TYPE_CODE")
	private String loanTypeCode;

	@Column(name="NEW_CUSTOMER")
	private BigDecimal newCustomer;

	@Column(name="OCCUPATIONAL_INCOME")
	private BigDecimal occupationalIncome;

	@Column(name="PRESENT_CUSTOMER")
	private BigDecimal presentCustomer;

	@Column(name="SAL_INCOME")
	private BigDecimal salIncome;

	private String state;

	@Column(name="TOTAL_HOUSEHOLD_INCOME")
	private BigDecimal totalHouseholdIncome;

	//bi-directional many-to-one association to Loan
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(unique = true)
	private Loan loan;

	public LoanApplicationDetail() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getAgriculturalIncome() {
		return this.agriculturalIncome;
	}

	public void setAgriculturalIncome(BigDecimal agriculturalIncome) {
		this.agriculturalIncome = agriculturalIncome;
	}

	public String getApplicantName() {
		return this.applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getApplicationSeriolNumber() {
		return this.applicationSeriolNumber;
	}

	public void setApplicationSeriolNumber(String applicationSeriolNumber) {
		this.applicationSeriolNumber = applicationSeriolNumber;
	}

	public String getBranchCode() {
		return this.branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getCoapplicantName() {
		return this.coapplicantName;
	}

	public void setCoapplicantName(String coapplicantName) {
		this.coapplicantName = coapplicantName;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCustomerNumber() {
		return this.customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
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

	public BigDecimal getDomesticIncome() {
		return this.domesticIncome;
	}

	public void setDomesticIncome(BigDecimal domesticIncome) {
		this.domesticIncome = domesticIncome;
	}

	public String getExistingCustomerDetail() {
		return this.existingCustomerDetail;
	}

	public void setExistingCustomerDetail(String existingCustomerDetail) {
		this.existingCustomerDetail = existingCustomerDetail;
	}

	public BigDecimal getIncomeFromMilk() {
		return this.incomeFromMilk;
	}

	public void setIncomeFromMilk(BigDecimal incomeFromMilk) {
		this.incomeFromMilk = incomeFromMilk;
	}

	public BigDecimal getIncomeFromOtherMember() {
		return this.incomeFromOtherMember;
	}

	public void setIncomeFromOtherMember(BigDecimal incomeFromOtherMember) {
		this.incomeFromOtherMember = incomeFromOtherMember;
	}

	public BigDecimal getIncomeFromOtherSource() {
		return this.incomeFromOtherSource;
	}

	public void setIncomeFromOtherSource(BigDecimal incomeFromOtherSource) {
		this.incomeFromOtherSource = incomeFromOtherSource;
	}

	public BigDecimal getIncomeFromRent() {
		return this.incomeFromRent;
	}

	public void setIncomeFromRent(BigDecimal incomeFromRent) {
		this.incomeFromRent = incomeFromRent;
	}

	public String getLoanOfficerName() {
		return this.loanOfficerName;
	}

	public void setLoanOfficerName(String loanOfficerName) {
		this.loanOfficerName = loanOfficerName;
	}

	public String getLoanTypeCode() {
		return this.loanTypeCode;
	}

	public void setLoanTypeCode(String loanTypeCode) {
		this.loanTypeCode = loanTypeCode;
	}

	public BigDecimal getNewCustomer() {
		return this.newCustomer;
	}

	public void setNewCustomer(BigDecimal newCustomer) {
		this.newCustomer = newCustomer;
	}

	public BigDecimal getOccupationalIncome() {
		return this.occupationalIncome;
	}

	public void setOccupationalIncome(BigDecimal occupationalIncome) {
		this.occupationalIncome = occupationalIncome;
	}

	public BigDecimal getPresentCustomer() {
		return this.presentCustomer;
	}

	public void setPresentCustomer(BigDecimal presentCustomer) {
		this.presentCustomer = presentCustomer;
	}

	public BigDecimal getSalIncome() {
		return this.salIncome;
	}

	public void setSalIncome(BigDecimal salIncome) {
		this.salIncome = salIncome;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public BigDecimal getTotalHouseholdIncome() {
		return this.totalHouseholdIncome;
	}

	public void setTotalHouseholdIncome(BigDecimal totalHouseholdIncome) {
		this.totalHouseholdIncome = totalHouseholdIncome;
	}
	@JsonIgnore
	public Loan getLoan() {
		return this.loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

}