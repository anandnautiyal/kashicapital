package com.kcfinance.loans.app.modals;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the loan_application_comment database table.
 * 
 */
@Entity
@Table(name="loan_application_comment")
@NamedQuery(name="LoanApplicationComment.findAll", query="SELECT l FROM LoanApplicationComment l")
public class LoanApplicationComment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="COMMENT_BY_USER")
	private BigDecimal commentByUser;

	private String comments;

	@Column(name="DATE_CREATED")
	private Timestamp dateCreated;

	@Column(name="DATE_MODIFIED")
	private Timestamp dateModified;

	@Column(name="DATE_OF_COMMENT")
	private Timestamp dateOfComment;

	@Column(name="LOAN_STATUS")
	private String loanStatus;

	//bi-directional many-to-one association to LoanApplication
	@ManyToOne
	@JoinColumn(name="LOAN_ID")
	private LoanApplication loanApplication;

	public LoanApplicationComment() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getCommentByUser() {
		return this.commentByUser;
	}

	public void setCommentByUser(BigDecimal commentByUser) {
		this.commentByUser = commentByUser;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
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

	public Timestamp getDateOfComment() {
		return this.dateOfComment;
	}

	public void setDateOfComment(Timestamp dateOfComment) {
		this.dateOfComment = dateOfComment;
	}

	public String getLoanStatus() {
		return this.loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	@JsonIgnore
	public LoanApplication getLoanApplication() {
		return this.loanApplication;
	}

	public void setLoanApplication(LoanApplication loanApplication) {
		this.loanApplication = loanApplication;
	}

}