package com.kcfinance.loans.app.modals;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the loan_customer_partner_detail database table.
 * 
 */
@Entity
@Table(name="loan_customer_partner_detail")
@NamedQuery(name="LoanCustomerPartnerDetail.findAll", query="SELECT l FROM LoanCustomerPartnerDetail l")
public class LoanCustomerPartnerDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="AADHAR_NUMBER")
	private BigDecimal aadharNumber;

	private String cast;

	@Column(name="DATE_CREATED")
	private Timestamp dateCreated;

	@Column(name="DATE_MODIFIED")
	private Timestamp dateModified;

	@Column(name="DATE_OF_BIRTH")
	private Timestamp dateOfBirth;

	@Column(name="DIN_NUMBER")
	private String dinNumber;

	private String gender;

	@Column(name="MOBILE_NUMBER")
	private String mobileNumber;

	@Column(name="PAN_NUMBER")
	private String panNumber;

	@Column(name="PARTNER_GURDIAN_NAME")
	private String partnerGurdianName;

	@Column(name="PARTNER_NAME")
	private String partnerName;

	private String qualification;

	private String religion;

	@Column(name="TYPE_OF_ACCOMODATION")
	private String typeOfAccomodation;

	@Column(name="VOTER_CARD_NO")
	private String voterCardNo;

	@Column(name="YEARS_OF_EXPERIENCE")
	private BigDecimal yearsOfExperience;

	//bi-directional many-to-one association to LoanApplicationCustomer
	@ManyToOne
	@JoinColumn(name="LOAN_CUSTOMER_ID")
	private LoanApplicationCustomer loanApplicationCustomer;

	public LoanCustomerPartnerDetail() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getAadharNumber() {
		return this.aadharNumber;
	}

	public void setAadharNumber(BigDecimal aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getCast() {
		return this.cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
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

	public Timestamp getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Timestamp dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDinNumber() {
		return this.dinNumber;
	}

	public void setDinNumber(String dinNumber) {
		this.dinNumber = dinNumber;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPanNumber() {
		return this.panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getPartnerGurdianName() {
		return this.partnerGurdianName;
	}

	public void setPartnerGurdianName(String partnerGurdianName) {
		this.partnerGurdianName = partnerGurdianName;
	}

	public String getPartnerName() {
		return this.partnerName;
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	public String getQualification() {
		return this.qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getReligion() {
		return this.religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getTypeOfAccomodation() {
		return this.typeOfAccomodation;
	}

	public void setTypeOfAccomodation(String typeOfAccomodation) {
		this.typeOfAccomodation = typeOfAccomodation;
	}

	public String getVoterCardNo() {
		return this.voterCardNo;
	}

	public void setVoterCardNo(String voterCardNo) {
		this.voterCardNo = voterCardNo;
	}

	public BigDecimal getYearsOfExperience() {
		return this.yearsOfExperience;
	}

	public void setYearsOfExperience(BigDecimal yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	@JsonIgnore
	public LoanApplicationCustomer getLoanApplicationCustomer() {
		return this.loanApplicationCustomer;
	}

	public void setLoanApplicationCustomer(LoanApplicationCustomer loanApplicationCustomer) {
		this.loanApplicationCustomer = loanApplicationCustomer;
	}

}