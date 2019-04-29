package com.kcfinance.loans.app.modals;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * The persistent class for the loan database table.
 * 
 */
@Data 
@Entity
@Table(name="LOAN")
@NoArgsConstructor
public class Loan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	public static final String NAME ="LOAN";
	private String code;

	@Column(name="DATE_CREATED")
	private Timestamp dateCreated;

	@Column(name="DATE_MODIFIED")
	private Timestamp dateModified;

	private String status;

	//bi-directional many-to-one association to ApplicantBusinessDetail
	@OneToMany(mappedBy="loan", cascade = CascadeType.ALL)
	private List<ApplicantBusinessDetail> applicantBusinessDetails;

	//bi-directional many-to-one association to CustBankDetail
	@OneToMany(mappedBy="loan", cascade = CascadeType.ALL)
	private List<CustBankDetail> custBankDetails;

	//bi-directional many-to-one association to CustLoanDetail
	@OneToMany(mappedBy="loan", cascade = CascadeType.ALL)
	private List<CustLoanDetail> custLoanDetails;

	//bi-directional many-to-one association to CustPartnerDetail
	@OneToMany(mappedBy="loan", cascade = CascadeType.ALL)
	private List<CustPartnerDetail> custPartnerDetails;

	//bi-directional many-to-one association to LoanApplicantComment
	@OneToMany(mappedBy="loan", cascade = CascadeType.ALL)
	private List<LoanApplicantComment> loanApplicantComments;

	//bi-directional many-to-one association to LoanApplicationDetail
	@OneToMany(mappedBy="loan", cascade = CascadeType.ALL)
	private List<LoanApplicationDetail> loanApplicationDetails;

	//bi-directional many-to-one association to LoanCustomerDependent
	@OneToMany(mappedBy="loan", cascade = CascadeType.ALL)
	private List<LoanCustomerDependent> loanCustomerDependents;

	//bi-directional many-to-one association to LoanCustomerDocument
	@OneToMany(mappedBy="loan", cascade = CascadeType.ALL)
	private List<LoanCustomerDocument> loanCustomerDocuments;

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<ApplicantBusinessDetail> getApplicantBusinessDetails() {
		return this.applicantBusinessDetails;
	}

	public void setApplicantBusinessDetails(List<ApplicantBusinessDetail> applicantBusinessDetails) {
		this.applicantBusinessDetails = applicantBusinessDetails;
	}

	public ApplicantBusinessDetail addApplicantBusinessDetail(ApplicantBusinessDetail applicantBusinessDetail) {
		getApplicantBusinessDetails().add(applicantBusinessDetail);
		applicantBusinessDetail.setLoan(this);

		return applicantBusinessDetail;
	}

	public ApplicantBusinessDetail removeApplicantBusinessDetail(ApplicantBusinessDetail applicantBusinessDetail) {
		getApplicantBusinessDetails().remove(applicantBusinessDetail);
		applicantBusinessDetail.setLoan(null);

		return applicantBusinessDetail;
	}

	public List<CustBankDetail> getCustBankDetails() {
		return this.custBankDetails;
	}

	public void setCustBankDetails(List<CustBankDetail> custBankDetails) {
		this.custBankDetails = custBankDetails;
	}

	public CustBankDetail addCustBankDetail(CustBankDetail custBankDetail) {
		getCustBankDetails().add(custBankDetail);
		custBankDetail.setLoan(this);

		return custBankDetail;
	}

	public CustBankDetail removeCustBankDetail(CustBankDetail custBankDetail) {
		getCustBankDetails().remove(custBankDetail);
		custBankDetail.setLoan(null);

		return custBankDetail;
	}

	public List<CustLoanDetail> getCustLoanDetails() {
		return this.custLoanDetails;
	}

	public void setCustLoanDetails(List<CustLoanDetail> custLoanDetails) {
		this.custLoanDetails = custLoanDetails;
	}

	public CustLoanDetail addCustLoanDetail(CustLoanDetail custLoanDetail) {
		getCustLoanDetails().add(custLoanDetail);
		custLoanDetail.setLoan(this);

		return custLoanDetail;
	}

	public CustLoanDetail removeCustLoanDetail(CustLoanDetail custLoanDetail) {
		getCustLoanDetails().remove(custLoanDetail);
		custLoanDetail.setLoan(null);

		return custLoanDetail;
	}

	public List<CustPartnerDetail> getCustPartnerDetails() {
		return this.custPartnerDetails;
	}

	public void setCustPartnerDetails(List<CustPartnerDetail> custPartnerDetails) {
		this.custPartnerDetails = custPartnerDetails;
	}

	public CustPartnerDetail addCustPartnerDetail(CustPartnerDetail custPartnerDetail) {
		getCustPartnerDetails().add(custPartnerDetail);
		custPartnerDetail.setLoan(this);

		return custPartnerDetail;
	}

	public CustPartnerDetail removeCustPartnerDetail(CustPartnerDetail custPartnerDetail) {
		getCustPartnerDetails().remove(custPartnerDetail);
		custPartnerDetail.setLoan(null);

		return custPartnerDetail;
	}

	public List<LoanApplicantComment> getLoanApplicantComments() {
		return this.loanApplicantComments;
	}

	public void setLoanApplicantComments(List<LoanApplicantComment> loanApplicantComments) {
		this.loanApplicantComments = loanApplicantComments;
	}

	public LoanApplicantComment addLoanApplicantComment(LoanApplicantComment loanApplicantComment) {
		getLoanApplicantComments().add(loanApplicantComment);
		loanApplicantComment.setLoan(this);

		return loanApplicantComment;
	}

	public LoanApplicantComment removeLoanApplicantComment(LoanApplicantComment loanApplicantComment) {
		getLoanApplicantComments().remove(loanApplicantComment);
		loanApplicantComment.setLoan(null);

		return loanApplicantComment;
	}

	public List<LoanApplicationDetail> getLoanApplicationDetails() {
		return this.loanApplicationDetails;
	}

	public void setLoanApplicationDetails(List<LoanApplicationDetail> loanApplicationDetails) {
		this.loanApplicationDetails = loanApplicationDetails;
	}

	public LoanApplicationDetail addLoanApplicationDetail(LoanApplicationDetail loanApplicationDetail) {
		getLoanApplicationDetails().add(loanApplicationDetail);
		loanApplicationDetail.setLoan(this);

		return loanApplicationDetail;
	}

	public LoanApplicationDetail removeLoanApplicationDetail(LoanApplicationDetail loanApplicationDetail) {
		getLoanApplicationDetails().remove(loanApplicationDetail);
		loanApplicationDetail.setLoan(null);

		return loanApplicationDetail;
	}

	public List<LoanCustomerDependent> getLoanCustomerDependents() {
		return this.loanCustomerDependents;
	}

	public void setLoanCustomerDependents(List<LoanCustomerDependent> loanCustomerDependents) {
		this.loanCustomerDependents = loanCustomerDependents;
	}

	public LoanCustomerDependent addLoanCustomerDependent(LoanCustomerDependent loanCustomerDependent) {
		getLoanCustomerDependents().add(loanCustomerDependent);
		loanCustomerDependent.setLoan(this);

		return loanCustomerDependent;
	}

	public LoanCustomerDependent removeLoanCustomerDependent(LoanCustomerDependent loanCustomerDependent) {
		getLoanCustomerDependents().remove(loanCustomerDependent);
		loanCustomerDependent.setLoan(null);

		return loanCustomerDependent;
	}

	public List<LoanCustomerDocument> getLoanCustomerDocuments() {
		return this.loanCustomerDocuments;
	}

	public void setLoanCustomerDocuments(List<LoanCustomerDocument> loanCustomerDocuments) {
		this.loanCustomerDocuments = loanCustomerDocuments;
	}

	public LoanCustomerDocument addLoanCustomerDocument(LoanCustomerDocument loanCustomerDocument) {
		getLoanCustomerDocuments().add(loanCustomerDocument);
		loanCustomerDocument.setLoan(this);

		return loanCustomerDocument;
	}

	public LoanCustomerDocument removeLoanCustomerDocument(LoanCustomerDocument loanCustomerDocument) {
		getLoanCustomerDocuments().remove(loanCustomerDocument);
		loanCustomerDocument.setLoan(null);

		return loanCustomerDocument;
	}

}
