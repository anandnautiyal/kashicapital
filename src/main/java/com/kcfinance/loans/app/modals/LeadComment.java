package com.kcfinance.loans.app.modals;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@Table(name="LEAD_COMMENTS")
public class LeadComment {

	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="lead_cust_comm")
	@SequenceGenerator(name="lead_cust_comm", sequenceName="lead_cust_comm")
	@Column(name="ID", nullable=false,insertable = false,updatable= false)
	private Long id;


	@Column(name="COMMENTS", nullable=true)
	private String comment;


	@Column(name="LEAD_STATUS", nullable=true)
	private String leadStatus;


	/**
	 * Date entity created.
	 */
	@Column(name="CREATE_DATE", nullable=true, insertable = false, updatable= false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreated;


	/**
	 * Date entity last modified.
	 */
	@Column(name="MODIFIED_DATE", nullable=true, insertable = false, updatable= false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateModified;

	/**
	 * Date entity created.
	 */
	@Column(name="DATE_OF_COMMENT",nullable=true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date commentDate;



	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(unique = true)
	private Lead lead;

	public LeadComment(String comment, String leadStatus) {
		super();
		this.comment = comment;
		this.leadStatus = leadStatus;


	}		


	public Lead getLead() {
		return lead;
	}

	public void setLead(Lead lead) {
		this.lead = lead;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getLeadStatus() {
		return leadStatus;
	}

	public void setLeadStatus(String leadStatus) {
		this.leadStatus = leadStatus;
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

	public Date getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());

		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof LeadComment))
			return false;
		LeadComment other = (LeadComment) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;

		return true;
	}
}
