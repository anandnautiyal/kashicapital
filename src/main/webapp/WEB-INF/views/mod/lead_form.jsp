<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%--@ taglib uri="/WEB-INF/tlds/fmt.tld" prefix="fmt" --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<section class="content">
        <div class="container-fluid">
				            <!-- Multi Column -->
            <div class="row clearfix">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="card">
                        <div class="header">
                            <h2>
                                Lead Form
                            </h2>
                        </div>
			<form:form method="POST" modelAttribute="lead" class="form-horizontal">
				  <form:input type="hidden" path="leadCustomer.id" id="leadCustomer.id"/>
				  <form:input type="hidden" path="id" id="id"/>
                        <div class="body">
							
                            <div class="row clearfix">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <div class="form-line">
                                            <form:input type="text" path="leadCustomer.firstName" id="leadCustomer.firstName" class="form-control input-sm" placeholder="First Name"/>
                                        </div>
                                    </div>
                                </div>

                                <div class="col-md-6">
                                    <div class="form-group">
                                        <div class="form-line">
                                           <form:input type="text" path="leadCustomer.lastName" id="leadCustomer.lastName" class="form-control input-sm" placeholder="Last Name"/>
                                        </div>
                                    </div>
                                </div>
                            </div>
							
							<div class="row clearfix">
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <div class="form-line">
                                           <form:input type="text" path="leadCustomer.natureOfBusiness" id="leadCustomer.natureOfBusiness" class="form-control input-sm" placeholder="Nature of business"/>
											
                                        </div>
                                    </div>
                                </div>
                            </div>
							
                            <div class="row clearfix">
                                <div class="col-md-4">
                                    <div class="form-group">
                                        <div class="form-line">
                                            <form:input type="text" path="leadCustomer.address" id="leadCustomer.address" class="form-control input-sm" placeholder="Address of business"/>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="form-group">
                                        <div class="form-line">
                                            <input type="text" class="form-control" placeholder="Mobile Number">
											 <form:input type="text" path="leadCustomer.phone" id="leadCustomer.phone" class="form-control input-sm" placeholder="Mobile Number"/>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="form-group">
                                        <div class="form-line">
                                            <input type="text" class="form-control" placeholder="AAdhar">
											<form:input type="text" path="leadCustomer.aadharNo" id="leadCustomer.aadharNo" class="form-control input-sm" placeholder="AAdhar"/>
                                        </div>
                                    </div>
                                </div>
                            </div>
							<div class="row clearfix">
                                <div class="col-md-4">
                                    <div class="form-group">
                                        <div class="form-line">
                                           <form:input type="text" path="leadCustomer.panNo" id="leadCustomer.panNo" class="form-control input-sm" placeholder="Pan No"/>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="form-group">
                                        <div class="form-line">
                                            <form:input type="text" path="leadCustomer.voterIdNo" id="leadCustomer.voterIdNo" class="form-control input-sm" placeholder="Voter Id Number"/>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="form-group">
                                        <div class="form-line">
                                            <form:input type="text" path="leadCustomer.meetingDate" id="leadCustomer.meetingDate" class="form-control input-sm" placeholder="Meeting Date"/>
                                        </div>
                                    </div>
                                </div>
                            </div>
							<input type="submit" value="Update" class="btn btn-orange m-t-15 waves-effect"/>
							<input type="submit" value="Hold" class="btn btn-orange m-t-15 waves-effect"/>
							
                        </div>
                    </div>
                </div>
            </div>
            <!-- #END# Multi Column -->
        </div>
    </section>
</form:form>