package com.kcfinance.loans.app.modals;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the customer_asset database table.
 * 
 */
@Entity
@Table(name="customer_asset")
@NamedQuery(name="CustomerAsset.findAll", query="SELECT c FROM CustomerAsset c")
public class CustomerAsset implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="ASSET_TYPE_CODE")
	private String assetTypeCode;

	@Column(name="ASSET_TYPE_NAME")
	private String assetTypeName;

	//bi-directional many-to-one association to LoanCustomerAsset
	@OneToMany(mappedBy="customerAsset")
	private List<LoanCustomerAsset> loanCustomerAssets;

	public CustomerAsset() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAssetTypeCode() {
		return this.assetTypeCode;
	}

	public void setAssetTypeCode(String assetTypeCode) {
		this.assetTypeCode = assetTypeCode;
	}

	public String getAssetTypeName() {
		return this.assetTypeName;
	}

	public void setAssetTypeName(String assetTypeName) {
		this.assetTypeName = assetTypeName;
	}

	public List<LoanCustomerAsset> getLoanCustomerAssets() {
		return this.loanCustomerAssets;
	}

	public void setLoanCustomerAssets(List<LoanCustomerAsset> loanCustomerAssets) {
		this.loanCustomerAssets = loanCustomerAssets;
	}

	public LoanCustomerAsset addLoanCustomerAsset(LoanCustomerAsset loanCustomerAsset) {
		getLoanCustomerAssets().add(loanCustomerAsset);
		loanCustomerAsset.setCustomerAsset(this);

		return loanCustomerAsset;
	}

	public LoanCustomerAsset removeLoanCustomerAsset(LoanCustomerAsset loanCustomerAsset) {
		getLoanCustomerAssets().remove(loanCustomerAsset);
		loanCustomerAsset.setCustomerAsset(null);

		return loanCustomerAsset;
	}

}