package com.kcfinance.loans.app.modals;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data 
@Entity
@Table(name="LEAD")
@NoArgsConstructor
public class Lead {


	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "lead_seq")
	@SequenceGenerator(name="lead_seq", sequenceName="lead_seq",allocationSize=1)
	private Long id;

	@Column(name="CODE", nullable=true)
	private String code;

	@Column(name="STATUS", nullable=true)
	private String status;

	/**
	 * Date entity created.
	 */
	@Column(name="CREATE_DATE", nullable=true, insertable = false, updatable= false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;
	/**
	 * Date entity last modified.
	 */
	@Column(name="MODIFIED_DATE", nullable=true, insertable = false, updatable= false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedDate;

	@OneToOne(mappedBy="lead", cascade = CascadeType.ALL)
	private LeadCustomer leadCustomer;

	@OneToMany(mappedBy = "lead",cascade = CascadeType.ALL)
	private List<LeadComment> leadComments;

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

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public List<LeadComment> getLeadComments() {
		return leadComments;
	}

	public void setLeadComments(List<LeadComment> leadComments) {
		this.leadComments = leadComments;
	}



}
