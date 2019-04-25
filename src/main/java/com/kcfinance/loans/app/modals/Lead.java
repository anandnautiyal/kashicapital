package com.kcfinance.loans.app.modals;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;


@Entity
@Table(name="LEAD")
public class Lead {


	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID", nullable=false)
	private Long id;

	@Column(name="CODE", nullable=true)
	private String code;

	@Column(name="STATUS", nullable=true)
	private String status;

	/**
	 * Date entity created.
	 */
	@Column(name="MODIFIED_DATE", nullable=true, insertable = false, updatable= false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreated;
	/**
	 * Date entity last modified.
	 */
	@Column(name="MODIFIED_DATE", nullable=true, insertable = false, updatable= false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateModified;

	@OneToMany(mappedBy = "lead")
	@Cascade({CascadeType.ALL})
	private List<LeadComment> leadComments;
	
	

	@OneToMany(mappedBy = "lead")
	@Cascade({CascadeType.SAVE_UPDATE})
	private List<LeadDocument> leadDocuments;
	
	@OneToOne(mappedBy = "lead")
	@Cascade({CascadeType.SAVE_UPDATE})
	private LeadCustomer leadCustomer;
	
	@Column(name="LOCALE", nullable=true)
	private String locale;

	public LeadCustomer getLeadCustomer() {
		return leadCustomer;
	}

	public void setLeadCustomer(LeadCustomer leadCustomer) {
		this.leadCustomer = leadCustomer;
	}

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateModified() {
		return dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public List<LeadDocument> getLeadDocuments() {
		return leadDocuments;
	}

	public void setLeadDocuments(List<LeadDocument> leadDocuments) {
		this.leadDocuments = leadDocuments;
	}

	public List<LeadComment> getLeadComments() {
		return leadComments;
	}

	public void setLeadComments(List<LeadComment> leadComments) {
		this.leadComments = leadComments;
	}

	

}
