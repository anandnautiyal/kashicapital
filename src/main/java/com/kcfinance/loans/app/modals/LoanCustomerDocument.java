package com.kcfinance.loans.app.modals;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Timestamp;


/**
 * The persistent class for the loan_customer_documents database table.
 * 
 */
@Entity
@Table(name="loan_customer_documents")
@NamedQuery(name="LoanCustomerDocument.findAll", query="SELECT l FROM LoanCustomerDocument l")
public class LoanCustomerDocument implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@Column(name="DATE_CREATED")
	private Timestamp dateCreated;

	@Column(name="DATE_MODIFIED")
	private Timestamp dateModified;

	@Lob
	@Column(name="DOCUMENT_IMAGE")
	private byte[] documentImage;

	@Column(name="DOCUMENT_NAME")
	private String documentName;

	//bi-directional many-to-one association to Loan
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(unique = true)
	private Loan loan;

	public LoanCustomerDocument() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
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

	public byte[] getDocumentImage() {
		return this.documentImage;
	}

	public void setDocumentImage(byte[] documentImage) {
		this.documentImage = documentImage;
	}

	public String getDocumentName() {
		return this.documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	@JsonIgnore
	public Loan getLoan() {
		return this.loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

}