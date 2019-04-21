package com.kcfinance.loans.app.modals;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the LEAD database table.
 * 
 */
@Entity
@NamedQuery(name="Lead.findAll", query="SELECT l FROM Lead l")
public class Lead implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String code;
	
	private BigDecimal status;

	@Column(name="CREATE_DATE")
	private BigDecimal createDate;

	@Column(name="MODIFIED_DATE")
	private BigDecimal modifiedDate;

	
    @OneToOne(mappedBy = "leadId")
    private LeadCustomer customer;
    
	@OneToMany(mappedBy = "leadId")
    private List<LeadComment> comments;
	
	@OneToMany(mappedBy = "leadId")
    private List<LeadComment> customerDocuments;


	public Lead() {
	}

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

	public BigDecimal getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(BigDecimal createDate) {
		this.createDate = createDate;
	}

	public BigDecimal getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(BigDecimal modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public BigDecimal getStatus() {
		return this.status;
	}

	public void setStatus(BigDecimal status) {
		this.status = status;
	}

    public LeadCustomer getCustomer() {
		return customer;
	}

	public void setCustomer(LeadCustomer customer) {
		this.customer = customer;
	}
	
	public List<LeadComment> getComments() {
		return comments;
	}

	public void setComments(List<LeadComment> comments) {
		this.comments = comments;
	}
	

	public List<LeadComment> getCustomerDocuments() {
		return customerDocuments;
	}

	public void setCustomerDocuments(List<LeadComment> customerDocuments) {
		this.customerDocuments = customerDocuments;
	}
}