package com.kcfinance.loans.app.modals;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="lead_customer_documents")
public class LeadDocument{

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID", nullable=false)
	private Long id;

	@Column(name="DOCUMENT_NAME", nullable=true)
	private String documentName;

	/**
	 * Date entity created.
	 */
	@Column(name="DATE_CREATED", nullable=true, insertable = false, updatable= false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	@Column(name="DOCUMENT_IMAGE", nullable=true)
	@Lob
	private byte[] documentImage;


	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn
	private LeadCustomer leadCustomer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public byte[] getDocumentImage() {
		return documentImage;
	}

	@JsonIgnore
	public LeadCustomer getLeadCustomer() {
		return leadCustomer;
	}

	public void setLeadCustomer(LeadCustomer leadCustomer) {
		this.leadCustomer = leadCustomer;
	}

	public void setDocumentImage(byte[] documentImage) {
		this.documentImage = documentImage;
	}


}
