package com.kcfinance.loans.app.modals;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data 
@Entity
@NoArgsConstructor
@Table(name="LEAD_CUSTOMER")
public class LeadCustomer {

	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "lead_cust_seq")
	@SequenceGenerator(name="lead_cust_seq", sequenceName="lead_cust",allocationSize=1)
	@Column(name="ID", nullable=false,insertable = false,updatable= false)
	private Long id;


	@Column(name="FIRST_NAME", nullable=true)
	private String firstName;


	@Column(name="LAST_NAME", nullable=true)
	private String lastName;


	@Column(name="PHONE", nullable=true)
	private String phone;

	@Column(name="AADHAR_NO", nullable=true)
	private String aadharNo;

	@Column(name="NATURE_OF_BUSINESS", nullable=true)
	private String natureOfBusiness;

	@Column(name="PAN_NO", nullable=true)
	private String panNo;

	@Column(name="VOTER_ID_NO", nullable=true)
	private String voterIdNo;

	@Column(name="ACTIVE", nullable=true)
	private int active;

	@Column(name="Address", nullable=true)
	private String address;

	
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

	/**
	 * Date entity last modified.
	 */
	@Column(name="MEETING_DATE", nullable=true)
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date meetingDate;

	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(unique = true)
	private Lead lead;

	@JsonIgnore
	@OneToMany(mappedBy = "leadCustomer",cascade = CascadeType.ALL)
	private List<LeadDocument> leadDocuments;
	
	@JsonIgnore
	public Lead getLead() {
		return lead;
	}

	public void setLead(Lead lead) {
		this.lead = lead;
	}

	public Long getId() {
		return id;
	}


	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getNatureOfBusiness() {
		return natureOfBusiness;
	}

	public void setNatureOfBusiness(String natureOfBusiness) {
		this.natureOfBusiness = natureOfBusiness;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getVoterIdNo() {
		return voterIdNo;
	}

	public void setVoterIdNo(String voterIdNo) {
		this.voterIdNo = voterIdNo;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
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

	public Date getMeetingDate() {
		return meetingDate;
	}

	public void setMeetingDate(Date meetingDate) {
		this.meetingDate = meetingDate;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}	
	
	@JsonIgnore
	public List<LeadDocument> getLeadDocuments() {
		return leadDocuments;
	}

	@JsonProperty
	public void setLeadDocuments(List<LeadDocument> leadDocuments) {
		this.leadDocuments = leadDocuments;
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
		if (!(obj instanceof Lead))
			return false;
		LeadCustomer other = (LeadCustomer) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;

		return true;
	}


}
