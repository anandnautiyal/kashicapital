package com.kcfinance.loans.app.modals;

import java.io.Serializable;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;


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
	private Long id;

	@Column(name="AADHAR_NUMBER")
	private String aadharNumber;

	private String cast;

	@Column(name="DATE_CREATED")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateCreated;

	@Column(name="DATE_MODIFIED")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateModified;

	@Column(name="DATE_OF_BIRTH")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateOfBirth;

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
	private String yearsOfExperience;

	//bi-directional many-to-one association to LoanApplicationCustomer
	@ManyToOne
	@JoinColumn(name="LOAN_CUSTOMER_ID")
	private LoanApplicationCustomer loanApplicationCustomer;

	public LoanCustomerPartnerDetail() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAadharNumber() {
		return this.aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getCast() {
		return this.cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
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

	public Date getDateOfBirth() {
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

	public String getYearsOfExperience() {
		return this.yearsOfExperience;
	}

	public void setYearsOfExperience(String yearsOfExperience) {
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