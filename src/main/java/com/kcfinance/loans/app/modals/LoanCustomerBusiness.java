package com.kcfinance.loans.app.modals;

import java.io.Serializable;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the loan_customer_business database table.
 * 
 */
@Entity
@Table(name="loan_customer_business")
@NamedQuery(name="LoanCustomerBusiness.findAll", query="SELECT l FROM LoanCustomerBusiness l")
public class LoanCustomerBusiness implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="BUSINESS_ADDRESS")
	private String businessAddress;

	@Column(name="BUSINESS_PREMISES_TYPE")
	private String businessPremisesType;

	private String city;

	@Column(name="DATE_CREATED")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateCreated;

	@Column(name="DATE_MODIFIED")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateModified;

	private String district;

	private String email;

	@Column(name="ENTERPRISE_NAME")
	private String enterpriseName;

	@Column(name="GST_EXIST")
	private String gstExist;

	@Column(name="GST_NUMBER")
	private String gstNumber;

	@Column(name="MOBILE_NUMBER")
	private String mobileNumber;

	@Column(name="NUMBER_OF_EMPLOYEE")
	private String numberOfEmployee;

	@Column(name="PHONE_NUMBER")
	private String phoneNumber;

	@Column(name="PIN_CODE")
	private String pinCode;

	@Column(name="POST_OFFICE")
	private String postOffice;

	@Column(name="PRESENT_BUSINESS_ACTIVITY")
	private String presentBusinessActivity;

	@Column(name="PROPOSED_BUSINESS_ACTIVITY")
	private String proposedBusinessActivity;

	@Column(name="REGISTERED_OFFICE")
	private String registeredOffice;

	@Column(name="REGISTERED_UNIT")
	private String registeredUnit;

	@Column(name="START_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date startDate;

	private String state;

	@Column(name="TYPE_OF_COMPANY")
	private String typeOfCompany;

	@ManyToOne
	@JoinColumn(name="LOAN_CUSTOMER_ID")
	private LoanApplicationCustomer loanApplicationCustomer;

	public LoanCustomerBusiness() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBusinessAddress() {
		return this.businessAddress;
	}

	public void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;
	}

	public String getBusinessPremisesType() {
		return this.businessPremisesType;
	}

	public void setBusinessPremisesType(String businessPremisesType) {
		this.businessPremisesType = businessPremisesType;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getGstExist() {
		return this.gstExist;
	}

	public void setGstExist(String gstExist) {
		this.gstExist = gstExist;
	}

	public String getGstNumber() {
		return this.gstNumber;
	}

	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getNumberOfEmployee() {
		return this.numberOfEmployee;
	}

	public void setNumberOfEmployee(String numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPinCode() {
		return this.pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getPostOffice() {
		return this.postOffice;
	}

	public void setPostOffice(String postOffice) {
		this.postOffice = postOffice;
	}

	public String getPresentBusinessActivity() {
		return this.presentBusinessActivity;
	}

	public void setPresentBusinessActivity(String presentBusinessActivity) {
		this.presentBusinessActivity = presentBusinessActivity;
	}

	public String getProposedBusinessActivity() {
		return this.proposedBusinessActivity;
	}

	public void setProposedBusinessActivity(String proposedBusinessActivity) {
		this.proposedBusinessActivity = proposedBusinessActivity;
	}

	public String getRegisteredOffice() {
		return this.registeredOffice;
	}

	public void setRegisteredOffice(String registeredOffice) {
		this.registeredOffice = registeredOffice;
	}

	public String getRegisteredUnit() {
		return this.registeredUnit;
	}

	public void setRegisteredUnit(String registeredUnit) {
		this.registeredUnit = registeredUnit;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTypeOfCompany() {
		return this.typeOfCompany;
	}

	public void setTypeOfCompany(String typeOfCompany) {
		this.typeOfCompany = typeOfCompany;
	}

	@JsonIgnore
	public LoanApplicationCustomer getLoanApplicationCustomer() {
		return this.loanApplicationCustomer;
	}

	public void setLoanApplicationCustomer(LoanApplicationCustomer loanApplicationCustomer) {
		this.loanApplicationCustomer = loanApplicationCustomer;
	}

}