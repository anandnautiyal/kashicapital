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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

 
@Entity
@Table(name="LEAD_CUSTOMER_DOCUMENTS")
public class LeadDocument {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID", nullable=false,insertable = false,updatable= false)
	private Long id;


	@Column(name="DOCUMENT_NAME", nullable=true)
	private String code;

	

	/**
	 * Date entity created.
	 */
	@Column(name="CREATE_DATE", nullable=true, insertable = false, updatable= false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreated;

	
	
	@Column(name="DOCUMENT_IMAGE", nullable=true)
	@Lob
	private byte[] documentImage;


	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn
	private Lead lead;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	
	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	

	public Lead getLead() {
		return lead;
	}

	public void setLead(Lead lead) {
		this.lead = lead;
	}
	

	public byte[] getDocumentImage() {
		return documentImage;
	}

	public void setDocumentImage(byte[] documentImage) {
		this.documentImage = documentImage;
	}

}
