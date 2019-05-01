package com.kcfinance.loans.app.modals;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the loan_application_customer database table.
 * 
 */
@Entity
@Table(name="loan_application_customer")
@NamedQuery(name="LoanApplicationCustomer.findAll", query="SELECT l FROM LoanApplicationCustomer l")
public class LoanApplicationCustomer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="AGRICULTURAL_INCOME")
	private BigDecimal agriculturalIncome;

	@Column(name="APPLICANT_NAME")
	private String applicantName;

	@Column(name="APPLICATION_SERIAL_NUMBER")
	private String applicationSerialNumber;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Column(name="COAPPLICANT_NAME")
	private String coapplicantName;

	@Column(name="CUSTOMER_NUMBER")
	private String customerNumber;

	@Column(name="DATE_CREATED")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateCreated;

	@Column(name="DATE_MODIFIED")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateModified;

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
	private String newCustomer;

	@Column(name="OCCUPATIONAL_INCOME")
	private BigDecimal occupationalIncome;

	@Column(name="PRESENT_CUSTOMER")
	private String presentCustomer;

	@Column(name="SAL_INCOME")
	private BigDecimal salIncome;

	private String state;

	@Column(name="TOTAL_HOUSEHOLD_INCOME")
	private BigDecimal totalHouseholdIncome;

	//bi-directional many-to-one association to LoanApplication
	@OneToOne
	@JoinColumn(name="LOAN_ID")
	private LoanApplication loanApplication;

	//bi-directional many-to-one association to LoanApplicationCustomerDocument
	@OneToMany(mappedBy="loanApplicationCustomer")
	private List<LoanApplicationCustomerDocument> loanApplicationCustomerDocuments;

	//bi-directional many-to-one association to LoanCustomerAsset
	@OneToMany(mappedBy="loanApplicationCustomer")
	private List<LoanCustomerAsset> loanCustomerAssets;

	//bi-directional many-to-one association to LoanCustomerBankDetail
	@OneToMany(mappedBy="loanApplicationCustomer")
	private List<LoanCustomerBankDetail> loanCustomerBankDetails;

	//bi-directional many-to-one association to LoanCustomerBusiness
	@OneToMany(mappedBy="loanApplicationCustomer")
	private List<LoanCustomerBusiness> loanCustomerBusinesses;

	//bi-directional many-to-one association to LoanCustomerDependent
	@OneToMany(mappedBy="loanApplicationCustomer")
	private List<LoanCustomerDependent> loanCustomerDependents;

	//bi-directional many-to-one association to LoanCustomerLoanDetail
	@OneToMany(mappedBy="loanApplicationCustomer")
	private List<LoanCustomerLoanDetail> loanCustomerLoanDetails;

	//bi-directional many-to-one association to LoanCustomerPartnerDetail
	@OneToMany(mappedBy="loanApplicationCustomer")
	private List<LoanCustomerPartnerDetail> loanCustomerPartnerDetails;

	public LoanApplicationCustomer() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
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

	public String getApplicationSerialNumber() {
		return this.applicationSerialNumber;
	}

	public void setApplicationSerialNumber(String applicationSerialNumber) {
		this.applicationSerialNumber = applicationSerialNumber;
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

	public String getCustomerNumber() {
		return this.customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
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

	public String getNewCustomer() {
		return this.newCustomer;
	}

	public void setNewCustomer(String newCustomer) {
		this.newCustomer = newCustomer;
	}

	public BigDecimal getOccupationalIncome() {
		return this.occupationalIncome;
	}

	public void setOccupationalIncome(BigDecimal occupationalIncome) {
		this.occupationalIncome = occupationalIncome;
	}

	public String getPresentCustomer() {
		return this.presentCustomer;
	}

	public void setPresentCustomer(String presentCustomer) {
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
	public LoanApplication getLoanApplication() {
		return this.loanApplication;
	}

	public void setLoanApplication(LoanApplication loanApplication) {
		this.loanApplication = loanApplication;
	}

	public List<LoanApplicationCustomerDocument> getLoanApplicationCustomerDocuments() {
		return this.loanApplicationCustomerDocuments;
	}

	public void setLoanApplicationCustomerDocuments(List<LoanApplicationCustomerDocument> loanApplicationCustomerDocuments) {
		this.loanApplicationCustomerDocuments = loanApplicationCustomerDocuments;
	}

	public LoanApplicationCustomerDocument addLoanApplicationCustomerDocument(LoanApplicationCustomerDocument loanApplicationCustomerDocument) {
		getLoanApplicationCustomerDocuments().add(loanApplicationCustomerDocument);
		loanApplicationCustomerDocument.setLoanApplicationCustomer(this);

		return loanApplicationCustomerDocument;
	}

	public LoanApplicationCustomerDocument removeLoanApplicationCustomerDocument(LoanApplicationCustomerDocument loanApplicationCustomerDocument) {
		getLoanApplicationCustomerDocuments().remove(loanApplicationCustomerDocument);
		loanApplicationCustomerDocument.setLoanApplicationCustomer(null);

		return loanApplicationCustomerDocument;
	}

	public List<LoanCustomerAsset> getLoanCustomerAssets() {
		return this.loanCustomerAssets;
	}

	public void setLoanCustomerAssets(List<LoanCustomerAsset> loanCustomerAssets) {
		this.loanCustomerAssets = loanCustomerAssets;
	}

	public LoanCustomerAsset addLoanCustomerAsset(LoanCustomerAsset loanCustomerAsset) {
		getLoanCustomerAssets().add(loanCustomerAsset);
		loanCustomerAsset.setLoanApplicationCustomer(this);

		return loanCustomerAsset;
	}

	public LoanCustomerAsset removeLoanCustomerAsset(LoanCustomerAsset loanCustomerAsset) {
		getLoanCustomerAssets().remove(loanCustomerAsset);
		loanCustomerAsset.setLoanApplicationCustomer(null);

		return loanCustomerAsset;
	}

	public List<LoanCustomerBankDetail> getLoanCustomerBankDetails() {
		return this.loanCustomerBankDetails;
	}

	public void setLoanCustomerBankDetails(List<LoanCustomerBankDetail> loanCustomerBankDetails) {
		this.loanCustomerBankDetails = loanCustomerBankDetails;
	}

	public LoanCustomerBankDetail addLoanCustomerBankDetail(LoanCustomerBankDetail loanCustomerBankDetail) {
		getLoanCustomerBankDetails().add(loanCustomerBankDetail);
		loanCustomerBankDetail.setLoanApplicationCustomer(this);

		return loanCustomerBankDetail;
	}

	public LoanCustomerBankDetail removeLoanCustomerBankDetail(LoanCustomerBankDetail loanCustomerBankDetail) {
		getLoanCustomerBankDetails().remove(loanCustomerBankDetail);
		loanCustomerBankDetail.setLoanApplicationCustomer(null);

		return loanCustomerBankDetail;
	}

	public List<LoanCustomerBusiness> getLoanCustomerBusinesses() {
		return this.loanCustomerBusinesses;
	}

	public void setLoanCustomerBusinesses(List<LoanCustomerBusiness> loanCustomerBusinesses) {
		this.loanCustomerBusinesses = loanCustomerBusinesses;
	}

	public LoanCustomerBusiness addLoanCustomerBusiness(LoanCustomerBusiness loanCustomerBusiness) {
		getLoanCustomerBusinesses().add(loanCustomerBusiness);
		loanCustomerBusiness.setLoanApplicationCustomer(this);

		return loanCustomerBusiness;
	}

	public LoanCustomerBusiness removeLoanCustomerBusiness(LoanCustomerBusiness loanCustomerBusiness) {
		getLoanCustomerBusinesses().remove(loanCustomerBusiness);
		loanCustomerBusiness.setLoanApplicationCustomer(null);

		return loanCustomerBusiness;
	}

	public List<LoanCustomerDependent> getLoanCustomerDependents() {
		return this.loanCustomerDependents;
	}

	public void setLoanCustomerDependents(List<LoanCustomerDependent> loanCustomerDependents) {
		this.loanCustomerDependents = loanCustomerDependents;
	}

	public LoanCustomerDependent addLoanCustomerDependent(LoanCustomerDependent loanCustomerDependent) {
		getLoanCustomerDependents().add(loanCustomerDependent);
		loanCustomerDependent.setLoanApplicationCustomer(this);

		return loanCustomerDependent;
	}

	public LoanCustomerDependent removeLoanCustomerDependent(LoanCustomerDependent loanCustomerDependent) {
		getLoanCustomerDependents().remove(loanCustomerDependent);
		loanCustomerDependent.setLoanApplicationCustomer(null);

		return loanCustomerDependent;
	}

	public List<LoanCustomerLoanDetail> getLoanCustomerLoanDetails() {
		return this.loanCustomerLoanDetails;
	}

	public void setLoanCustomerLoanDetails(List<LoanCustomerLoanDetail> loanCustomerLoanDetails) {
		this.loanCustomerLoanDetails = loanCustomerLoanDetails;
	}

	public LoanCustomerLoanDetail addLoanCustomerLoanDetail(LoanCustomerLoanDetail loanCustomerLoanDetail) {
		getLoanCustomerLoanDetails().add(loanCustomerLoanDetail);
		loanCustomerLoanDetail.setLoanApplicationCustomer(this);

		return loanCustomerLoanDetail;
	}

	public LoanCustomerLoanDetail removeLoanCustomerLoanDetail(LoanCustomerLoanDetail loanCustomerLoanDetail) {
		getLoanCustomerLoanDetails().remove(loanCustomerLoanDetail);
		loanCustomerLoanDetail.setLoanApplicationCustomer(null);

		return loanCustomerLoanDetail;
	}

	public List<LoanCustomerPartnerDetail> getLoanCustomerPartnerDetails() {
		return this.loanCustomerPartnerDetails;
	}

	public void setLoanCustomerPartnerDetails(List<LoanCustomerPartnerDetail> loanCustomerPartnerDetails) {
		this.loanCustomerPartnerDetails = loanCustomerPartnerDetails;
	}

	public LoanCustomerPartnerDetail addLoanCustomerPartnerDetail(LoanCustomerPartnerDetail loanCustomerPartnerDetail) {
		getLoanCustomerPartnerDetails().add(loanCustomerPartnerDetail);
		loanCustomerPartnerDetail.setLoanApplicationCustomer(this);

		return loanCustomerPartnerDetail;
	}

	public LoanCustomerPartnerDetail removeLoanCustomerPartnerDetail(LoanCustomerPartnerDetail loanCustomerPartnerDetail) {
		getLoanCustomerPartnerDetails().remove(loanCustomerPartnerDetail);
		loanCustomerPartnerDetail.setLoanApplicationCustomer(null);

		return loanCustomerPartnerDetail;
	}

}