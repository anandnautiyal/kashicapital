<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%--@ taglib uri="/WEB-INF/tlds/fmt.tld" prefix="fmt" --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

	<section class="content">
        <div class="container-fluid">
			<!-- Form structure Start -->
			<div class="row clearfix">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="card">
                        <div class="header">
                            <h2>
                                Search Loan
                                <small>With Loan no.</small>
                            </h2>
                        </div>
                        <div class="body">
                        <form:form method="POST" action="/getLoan" modelAttribute="loan">
                                <div class="row clearfix">
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" path="code"  class="form-control"/>
                                                <label class="form-label">Enter Loan no.</label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                        <input type="submit" value="Search" class="btn btn-orange btn-lg m-l-15 waves-effect"/>
                                    </div>
                                </div>

							
                        </div>
                    </div>
                </div>
            </div>
			<!-- Form structure End -->
			
			<!-- Basic Examples --> <c:if test="${not empty loanList}">
            <div class="row clearfix">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="card">
                        <div class="header">
                            <h2>
                                Search Result
                            </h2>
                        </div>
                        <div class="body">
                        <c:forEach items="${loanList}" var="loanApplication">
                            <div class="table-responsive">
                                <table class="table table-bordered table-striped table-hover js-basic-example dataTable">
                                    <thead>
                                        <tr>
                                            <th>Loan Code</th>
											<th>Loan Status</th>
											<th>Applicant Name</th>
											<th>Loan Officer Name</th>
                                        </tr>
                                    </thead>
                                    
                                    <tbody>
                                         
											<tr>
											<td>${loanApplication.code}</td>
                                            <td>${loanApplication.status}</td>
                                            <td>${loanApplication.loanApplicationCustomer.applicantName}</td>
                                            <td>${loanApplication.loanApplicationCustomer.loanOfficerName}</td>
                                            <td><a href="<c:url value='/edit-loan-${loanApplication.id}' />" class="btn btn-success custom-width">edit</a></td>
											</tr>
										
                                    </tbody>
									
                                </table>
                            </div>
                            </c:forEach>
                            <c:if test="${not empty noRecords}">
           	 					${noRecords}
           					 </c:if>
                        </div>
                    </div>
                </div>
            </div>
            <!-- #END# Basic Examples -->
			</c:if>
        </div>
	  </form:form>
    </section>