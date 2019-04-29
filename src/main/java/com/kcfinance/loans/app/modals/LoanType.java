package com.kcfinance.loans.app.modals;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the loan_type database table.
 * 
 */
@Entity
@Table(name="loan_type")
@NamedQuery(name="LoanType.findAll", query="SELECT l FROM LoanType l")
public class LoanType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="LOAN_TYPE_ID")
	private long loanTypeId;

	@Column(name="LOAN_TYPE_CODE")
	private String loanTypeCode;

	@Column(name="LOAN_TYPE_NAME")
	private String loanTypeName;

	public LoanType() {
	}

	public long getLoanTypeId() {
		return this.loanTypeId;
	}

	public void setLoanTypeId(long loanTypeId) {
		this.loanTypeId = loanTypeId;
	}

	public String getLoanTypeCode() {
		return this.loanTypeCode;
	}

	public void setLoanTypeCode(String loanTypeCode) {
		this.loanTypeCode = loanTypeCode;
	}

	public String getLoanTypeName() {
		return this.loanTypeName;
	}

	public void setLoanTypeName(String loanTypeName) {
		this.loanTypeName = loanTypeName;
	}

}