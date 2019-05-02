package com.kcfinance.loans.app.modals;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="loan_customer_partner_firm")
@NamedQuery(name="LoanCustomerPartnerFirmDetail.findAll", query="SELECT l FROM LoanCustomerPartnerFirmDetail l")
public class LoanCustomerPartnerFirmDetail {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="PARTNER_FIRM_NAME")
	private String partnerFirmName;

	@Column(name="FIRM_ADDRESS")
	private String firmAddress;

	@Column(name="DATE_CREATED")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateCreated;

	@Column(name="DATE_MODIFIED")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateModified;

	@Column(name="PARTNER_FIRM_BANK_NAME")
	private String partnerFirmBankName;

	@Column(name="PARTNER_FIRM_BUSINESS_NATURE")
	private String firmBusinessNature;
	
	@Column(name="PARTNER_FIRM_OWNERSHIP_RANGE")
	private String firmOwnerShipRange;
	
	
	//bi-directional many-to-one association to LoanApplicationCustomer
	@ManyToOne
	@JoinColumn(name="LOAN_CUSTOMER_ID")
	private LoanApplicationCustomer loanApplicationCustomer;

	public LoanCustomerPartnerFirmDetail() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPartnerFirmName() {
		return partnerFirmName;
	}

	public void setPartnerFirmName(String partnerFirmName) {
		this.partnerFirmName = partnerFirmName;
	}

	public String getFirmAddress() {
		return firmAddress;
	}

	public void setFirmAddress(String firmAddress) {
		this.firmAddress = firmAddress;
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

	public String getPartnerFirmBankName() {
		return partnerFirmBankName;
	}

	public void setPartnerFirmBankName(String partnerFirmBankName) {
		this.partnerFirmBankName = partnerFirmBankName;
	}

	public String getFirmBusinessNature() {
		return firmBusinessNature;
	}

	public void setFirmBusinessNature(String firmBusinessNature) {
		this.firmBusinessNature = firmBusinessNature;
	}

	public LoanApplicationCustomer getLoanApplicationCustomer() {
		return loanApplicationCustomer;
	}

	public void setLoanApplicationCustomer(LoanApplicationCustomer loanApplicationCustomer) {
		this.loanApplicationCustomer = loanApplicationCustomer;
	}
	
	public String getFirmOwnerShipRange() {
		return firmOwnerShipRange;
	}

	public void setFirmOwnerShipRange(String firmOwnerShipRange) {
		this.firmOwnerShipRange = firmOwnerShipRange;
	}


	
}
