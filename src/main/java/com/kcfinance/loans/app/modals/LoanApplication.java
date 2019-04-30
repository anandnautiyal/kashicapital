package com.kcfinance.loans.app.modals;


import java.io.Serializable;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the loan_application database table.
 * 
 */
@Entity
@Table(name="loan_application")
@NamedQuery(name="LoanApplication.findAll", query="SELECT l FROM LoanApplication l")
public class LoanApplication implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String code;

	@Column(name="DATE_CREATED")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateCreated;

	@Column(name="DATE_MODIFIED")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateModified;

	private String status;

	//bi-directional many-to-one association to LoanApplicationComment
	@OneToMany(mappedBy="loanApplication")
	private List<LoanApplicationComment> loanApplicationComments;

	//bi-directional many-to-one association to LoanApplicationCustomer
	@OneToOne
	@JoinColumn(name="ID")
	private LoanApplicationCustomer loanApplicationCustomer;

	public LoanApplication() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<LoanApplicationComment> getLoanApplicationComments() {
		return this.loanApplicationComments;
	}

	public void setLoanApplicationComments(List<LoanApplicationComment> loanApplicationComments) {
		this.loanApplicationComments = loanApplicationComments;
	}

	
	public LoanApplicationCustomer getLoanApplicationCustomer() {
		return loanApplicationCustomer;
	}

	public void setLoanApplicationCustomer(LoanApplicationCustomer loanApplicationCustomer) {
		this.loanApplicationCustomer = loanApplicationCustomer;
	}

	public LoanApplicationComment addLoanApplicationComment(LoanApplicationComment loanApplicationComment) {
		getLoanApplicationComments().add(loanApplicationComment);
		loanApplicationComment.setLoanApplication(this);

		return loanApplicationComment;
	}

	public LoanApplicationComment removeLoanApplicationComment(LoanApplicationComment loanApplicationComment) {
		getLoanApplicationComments().remove(loanApplicationComment);
		loanApplicationComment.setLoanApplication(null);

		return loanApplicationComment;

	}

/*	public LoanApplicationCustomer addLoanApplicationCustomer(LoanApplicationCustomer loanApplicationCustomer) {
		getLoanApplicationCustomers().add(loanApplicationCustomer);
		loanApplicationCustomer.setLoanApplication(this);

		return loanApplicationCustomer;
	}

	public LoanApplicationCustomer removeLoanApplicationCustomer(LoanApplicationCustomer loanApplicationCustomer) {
		getLoanApplicationCustomers().remove(loanApplicationCustomer);
		loanApplicationCustomer.setLoanApplication(null);

		return loanApplicationCustomer;
	}*/

}