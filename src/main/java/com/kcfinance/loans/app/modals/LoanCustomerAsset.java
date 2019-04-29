package com.kcfinance.loans.app.modals;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the loan_customer_asset database table.
 * 
 */
@Entity
@Table(name="loan_customer_asset")
@NamedQuery(name="LoanCustomerAsset.findAll", query="SELECT l FROM LoanCustomerAsset l")
public class LoanCustomerAsset implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="ASSET_COST")
	private BigDecimal assetCost;

	@Column(name="ASSET_DESCRIPTION")
	private String assetDescription;

	@Column(name="ASSET_QUANTITY")
	private BigDecimal assetQuantity;

	@Column(name="ASSET_TYPE")
	private String assetType;

	@Column(name="DATE_CREATED")
	private Timestamp dateCreated;

	@Column(name="DATE_MODIFIED")
	private Timestamp dateModified;

	@Column(name="TOTAL_BUSINESS_ASSET")
	private BigDecimal totalBusinessAsset;

	@Column(name="TOTAL_HOME_ASSET")
	private BigDecimal totalHomeAsset;

	//bi-directional many-to-one association to CustomerAsset
	@ManyToOne
	@JoinColumn(name="CUSTOMER_ASSET_TYPE_ID")
	private CustomerAsset customerAsset;

	//bi-directional many-to-one association to LoanApplicationCustomer
	@ManyToOne
	@JoinColumn(name="LOAN_CUSTOMER_ID")
	private LoanApplicationCustomer loanApplicationCustomer;

	public LoanCustomerAsset() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getAssetCost() {
		return this.assetCost;
	}

	public void setAssetCost(BigDecimal assetCost) {
		this.assetCost = assetCost;
	}

	public String getAssetDescription() {
		return this.assetDescription;
	}

	public void setAssetDescription(String assetDescription) {
		this.assetDescription = assetDescription;
	}

	public BigDecimal getAssetQuantity() {
		return this.assetQuantity;
	}

	public void setAssetQuantity(BigDecimal assetQuantity) {
		this.assetQuantity = assetQuantity;
	}

	public String getAssetType() {
		return this.assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
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

	public BigDecimal getTotalBusinessAsset() {
		return this.totalBusinessAsset;
	}

	public void setTotalBusinessAsset(BigDecimal totalBusinessAsset) {
		this.totalBusinessAsset = totalBusinessAsset;
	}

	public BigDecimal getTotalHomeAsset() {
		return this.totalHomeAsset;
	}

	public void setTotalHomeAsset(BigDecimal totalHomeAsset) {
		this.totalHomeAsset = totalHomeAsset;
	}

	public CustomerAsset getCustomerAsset() {
		return this.customerAsset;
	}

	public void setCustomerAsset(CustomerAsset customerAsset) {
		this.customerAsset = customerAsset;
	}
	@JsonIgnore
	public LoanApplicationCustomer getLoanApplicationCustomer() {
		return this.loanApplicationCustomer;
	}

	public void setLoanApplicationCustomer(LoanApplicationCustomer loanApplicationCustomer) {
		this.loanApplicationCustomer = loanApplicationCustomer;
	}

}