<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%--@ taglib uri="/WEB-INF/tlds/fmt.tld" prefix="fmt" --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<section class="content">
        <div class="container-fluid">
                <div class="row clearfix">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="card">
                        <div class="header">
                            <h2>
                                LEAD FORM:
                            </h2>
                        </div>
                        <div class="body">
                            <!-- Nav tabs -->
                            <ul class="nav nav-tabs tab-col-deep-orange" role="tablist">
                                <li role="presentation" class="active">
                                    <a href="#details_with_icon_title" data-toggle="tab" aria-expanded="true">
                                        <i class="material-icons">details</i> DETAILS</a>
                                </li>
                                <li role="presentation" class="">
                                    <a href="#comments_with_icon_title" data-toggle="tab" aria-expanded="false">
                                        <i class="material-icons">comment</i> COMMENTS</a>
                                </li>
                                <li role="presentation" class="">
                                    <a href="#documents_with_icon_title" data-toggle="tab" aria-expanded="false">
                                        <i class="material-icons">email</i> DOCUMENTS</a>
                                </li>
                            </ul>

                            <!-- Tab panes -->
                            <div class="tab-content">
                <!---------------------- Details Start From Here ---------------------->
                                <div role="tabpanel" class="tab-pane fade active in" id="details_with_icon_title">
                                     <h2>Details</h2>  
                         <section>
                        <form:form method="POST" modelAttribute="lead" class="form-horizontal">
                          <form:input type="hidden" path="leadCustomer.id" id="leadCustomer.id"/>
                          <form:input type="hidden" path="id" id="id"/>
						  
                        <div class="body">
                            <div class="row clearfix">
                                <div class="col-md-6">
                                    <div class="form-group form-float">
                                        <div class="form-line">
                                            <form:input type="text" path="leadCustomer.firstName" id="leadCustomer.firstName" class="form-control"/>
											<label class="form-label">First Name</label>
                                        </div>
                                    </div>
                                </div>

                                <div class="col-md-6">
                                    <div class="form-group form-float">
                                        <div class="form-line">
                                           <form:input type="text" path="leadCustomer.lastName" id="leadCustomer.lastName" class="form-control"/>
										   <label class="form-label">Last Name</label>
                                        </div>
                                    </div>
                                </div>
                            </div>
							
							<div class="row clearfix">
                                <div class="col-md-12">
                                    <div class="form-group form-float">
                                        <div class="form-line">
                                           <form:input type="text" path="leadCustomer.natureOfBusiness" id="leadCustomer.natureOfBusiness" class="form-control"/>
											<label class="form-label">Nature of business</label>
                                        </div>
                                    </div>
                                </div>
                            </div>
							
                            <div class="row clearfix">
                                <div class="col-md-4">
                                    <div class="form-group form-float">
                                        <div class="form-line">
                                            <form:input type="text" path="leadCustomer.address" id="leadCustomer.address" class="form-control"/>
											<label class="form-label">Address of business</label>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="form-group form-float">
                                        <div class="form-line">
                                           
											 <form:input type="text" path="leadCustomer.phone" id="leadCustomer.phone" class="form-control"/>
											 <label class="form-label">Mobile Number</label>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="form-group form-float">
                                        <div class="form-line">
                                           
											<form:input type="text" path="leadCustomer.aadharNo" id="leadCustomer.aadharNo" class="form-control"/>
											<label class="form-label">AAdhar</label>
                                        </div>
                                    </div>
                                </div>
                            </div>
							<div class="row clearfix">
                                <div class="col-md-4">
                                    <div class="form-group form-float">
                                        <div class="form-line">
                                           <form:input type="text" path="leadCustomer.panNo" id="leadCustomer.panNo" class="form-control"/>
										   <label class="form-label">Pan No</label>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="form-group form-float">
                                        <div class="form-line">
                                            <form:input type="text" path="leadCustomer.voterIdNo" id="leadCustomer.voterIdNo" class="form-control"/>
											<label class="form-label">Voter Id Number</label>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="form-group form-float">
                                        <div class="form-line" id="bs_datepicker_container">
                                            <form:input type="text" path="leadCustomer.meetingDate" id="leadCustomer.meetingDate" class="form-control"/>
											<label class="form-label">Meeting Date</label>
                                        </div>
                                    </div>
                                </div>
                            </div>
							<c:forEach items="${lead.leadComments}" var="leadComments" varStatus="status">
							<c:set var="itemIndex" value="${status.index}" scope="request" />

							 <c:if test="${leadComments.comment == '' || fn:length(leadComments.comment)<1}">
							<div class="row clearfix">
                                <div class="col-sm-12">
                                    <div class="form-group form-float">
                                        <div class="form-line">
                                            <form:textarea rows="4" class="form-control no-resize" path="leadComments[${status.index}].comment" />
											<label class="form-label">Please type your Comment</label>
                                        </div>
                                    </div>
                                </div>
                            </div>
							</c:if>
							</c:forEach>
							<input type="submit" value="Update" class="btn btn-orange m-t-15 waves-effect"/>
							<input type="submit" value="Hold" class="btn btn-orange m-t-15 waves-effect"/>
							</div>
                      </form:form>
                      </section>
                                </div>
            <!---------------------- Details End Here ---------------------->
            <!---------------------- Comments Start From Here ---------------------->
                                <div role="tabpanel" class="tab-pane fade" id="comments_with_icon_title">
                <div class="row clearfix">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="card">
                        <div class="header">
                            <h2>
                                Comments :
                            </h2>
                        </div>
                        <div class="body">
                            <div class="table-responsive">
                                <table class="table table-bordered table-striped table-hover js-basic-example dataTable">
                                    <thead>
                                        <tr>
                                            <th>Username</th>
                                            <th>Action</th>
                                        </tr>
                                    </thead>
                                    
                                    <tbody>
                                        
											 <tr>
											<td>User 1</td>
											<td id="actionIcons">                                         
											    <a href="<c:url value='/edit-user-${lead.id}' />" class="btn bg-orange btn-circle-lg waves-effect waves-circle waves-float"><i class="material-icons">description</i></a>
                                                </td>
                                               
											</tr>
                                              <tr>
											<td>User 2</td>
											<td id="actionIcons">                                         
											    <a href="<c:url value='/edit-user-${lead.id}' />" class="btn bg-orange btn-circle-lg waves-effect waves-circle waves-float"><i class="material-icons">description</i></a>
                                                </td>
                                              </tr>
                                             <tr>
											<td>User 3</td>
											<td id="actionIcons">                                         
											    <a href="<c:url value='/edit-user-${lead.id}' />" class="btn bg-orange btn-circle-lg waves-effect waves-circle waves-float"><i class="material-icons">description</i></a>
                                                </td>
                                              </tr>
                                             <tr>
											<td>User 4</td>
											<td id="actionIcons">                                         
											    <a href="<c:url value='/edit-user-${lead.id}' />" class="btn bg-orange btn-circle-lg waves-effect waves-circle waves-float"><i class="material-icons">description</i></a>
                                                </td>
                                              </tr>
										
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
                                </div>
              <!---------------------- Comments End Here ---------------------->
             <!---------------------- Document Start From Here ---------------------->
                                <div role="tabpanel" class="tab-pane fade" id="documents_with_icon_title">
                                         <div class="row clearfix">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="card">
                        <div class="header">
                            <h2>
                                Documents :
                            </h2>
                        </div>
                        <div class="body">
                            <div class="table-responsive">
                                <table class="table table-bordered table-striped table-hover js-basic-example dataTable">
                                    <thead>
                                        <tr>
                                            <th>Serial Number</th>
                                            <th>Link</th>
                                        </tr>
                                    </thead>
                                    
                                    <tbody>
                                         <c:forEach items="${leadList}" var="lead">
											 <tr>
											<td>Document 1</td>
											<td id="actionIcons">                                         
											    <a href="<c:url value='/edit-user-${lead.id}' />" class="btn bg-orange  btn-circle-lg waves-effect waves-circle waves-float"><i class="material-icons">link</i></a>
                                                </td>
                                               
											</tr>
                                              <tr>
											<td>Document 2</td>
											<td id="actionIcons">                                         
											    <a href="<c:url value='/edit-user-${lead.id}' />" class="btn bg-orange  btn-circle-lg waves-effect waves-circle waves-float"><i class="material-icons">link</i></a>
                                                </td>
                                              </tr>
                                             <tr>
											<td>Document 3</td>
											<td id="actionIcons">                                         
											    <a href="<c:url value='/edit-user-${lead.id}' />" class="btn bg-orange  btn-circle-lg waves-effect waves-circle waves-float"><i class="material-icons">link</i></a>
                                                </td>
                                              </tr>
                                             <tr>
											<td>Document 4</td>
											<td id="actionIcons">                                         
											    <a href="<c:url value='/edit-user-${lead.id}' />" class="btn bg-orange  btn-circle-lg waves-effect waves-circle waves-float"><i class="material-icons">link</i></a>
                                                </td>
                                              </tr>
										</c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        <!---------------------- Document End Here ---------------------->
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>