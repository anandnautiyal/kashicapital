<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	
	<section class="content">
        <div class="container-fluid loan-wizard">
            <!-- Basic Example | Horizontal Layout -->
            <div class="row clearfix">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="card">
                        <div class="header">
                            <h2>Business Loan Application Form <span>(व्यवसाय  ऋण आवेदन पत्र)</span></h2>
                        </div>
                        <div class="body">
                    <form:form method="POST" modelAttribute="loanData" class="form-horizontal">
                          <form:input type="hidden" path="id" id="id"/>
                            <div id="wizard_horizontal">
            
        <!-------------------------------- Form Section 1 start from here ---------------------------------->
			           <h2><span class="sr-only">1</span></h2>
                                <section>
                        <div class="header kc-header">
                            <h2>
                                For Office Use<span>(कार्यालय उपयोग हेतु)</span>:
                            </h2>
                        </div>
                        <div class="body">
                           
                                <div class="row clearfix">
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                       <div class="input-group input-group-lg">
                                        <span class="input-group-addon kc-customerType">
                                        <form:radiobutton path = "loanApplicationCustomer.newCustomer" value = "1" label="Current Customer(वर्तमान ग्राहक)"/>
										
                                        </span>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                     <div class="input-group input-group-lg">
                                        <span class="input-group-addon kc-customerType">
                                            <form:radiobutton path = "loanApplicationCustomer.newCustomer" value = "0"  label="New Customer(नया ग्राहक)"/>
                                          
                                        </span>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" path="loanApplicationCustomer.existingCustomerDetail" id="loanApplicationCustomer.existingCustomerDetail" class="form-control"/>
                                                <label class="form-label">Describe the situation of the current customer<span>(वर्तमान ग्राहक होने के स्थिति  में विवरण दें)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row clearfix">
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                               <form:input type="text" path="loanApplicationCustomer.applicantName" id="loanApplicationCustomer.applicantName" class="form-control"/>
                                                <label class="form-label">Name Of Applicant<span>(आवेदक का नाम)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" path="loanApplicationCustomer.coapplicantName" id="loanApplicationCustomer.coapplicantName" class="form-control"/>
                                                <label class="form-label">Name Of Co-Applicant<span>(सह -आवेदक का नाम)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" path="loanApplicationCustomer.applicationSerialNumber" id="loanApplicationCustomer.applicationSerialNumber" class="form-control"/>
                                                <label class="form-label">Application Serial Number<span>(आवेदन क्रम संख्या)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" path="loanApplicationCustomer.customerNumber" id="loanApplicationCustomer.customerNumber" class="form-control"/>
                                                <label class="form-label">Customer Number<span>(ग्राहक संख्या)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row clearfix">
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" path="loanApplicationCustomer.loanOfficerName" id="loanApplicationCustomer.loanOfficerName" class="form-control"/>
                                                <label class="form-label">Loan officer's name<span>(ऋण अधिकारी का नाम)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" path="loanApplicationCustomer.branchCode" id="loanApplicationCustomer.branchCode" class="form-control"/>
                                                <label class="form-label">Branch Name and Number<span>(शाखा का नाम व संख्या)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" path="loanApplicationCustomer.state" id="loanApplicationCustomer.state" class="form-control"/>
                                                <label class="form-label">State Name<span>(प्रदेश का नाम)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                    	<form:select path="loanApplicationCustomer.loanPurpose">
   											<form:option value="NONE" label="कृपया चुने ऋण का उद्देश्य"/>
   											<form:option value="कार्यशील हेतु" label="For Working(कार्यशील हेतु)"/>
   											<form:option value="निवेश हेतु" label="For Investment(निवेश हेतु)"/>
   											<form:option value="विविधता हेतु" label="For Diversity(विविधता हेतु)"/>
										</form:select>
										
                                    </div>
                                </div>
                            
                        </div>
				</section>
                                          
    <!-------------------------------- Form Section 1 end here ----------------------------------> 
                                
		 
<!-------------------------------- Form Section 2 Start From Here ---------------------------------->
							<h2><span class="sr-only">2</span></h2>
							<section>  
							<div class="header kc-header">
								<h2>
									Proposed Credit Facilities<span>(प्रस्तावित ऋण सुविधाएं)</span>:
							</div>
							<div class="body kc-top">
								
									<div class="row clearfix">
										<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
								             <span class="kc-subhead">Types Of Loan<span>(सुविधाओं का प्रकार)</span></span>
										<form:select  class="form-control show-tick kc-select" path="applicationLoanDetail.loanType">
   											<form:option value="1" label="Term Loan(सावधि ऋण)"/>
   											<form:option value="2" label="Other Loans(अन्य ऋण)"/>
   										</form:select>
										
									    </div>
										<div class="col-lg-5 col-md-5 col-sm-5 col-xs-5">
											<div class="form-group form-float">
												<div class="form-line">
													 <form:input type="text" path="applicationLoanDetail.loanAmount" id="applicationLoanDetail.loanAmount" class="form-control"/>
													<label class="form-label">Amount<span>(राशि)</span></label>
												</div>
											</div>
										</div>
                                        <a class="btn bg-orange btn-circle waves-effect waves-circle waves-float" data-toggle="collapse" href="#proposedCredit" role="button" aria-expanded="false" aria-controls="proposedCredit"><i class="material-icons">add</i></a>
                                        </div>
                                       <div class="row clearfix collapse" id="proposedCredit">
                                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
											<div class="form-group form-float">
												<div class="form-line">
													<form:input type="text" path="applicationLoanDetail.loanTerm" id="applicationLoanDetail.loanTerm" class="form-control"/>
													<label class="form-label">Period<span>(अवधि)</span></label>
												</div>
											</div>
										</div>
										<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
											<div class="form-group form-float">
												<div class="form-line">
													<form:input type="text" path="applicationLoanDetail.loanObjective" id="applicationLoanDetail.loanObjective" class="form-control"/>
													<label class="form-label">Aim Behind Facilitate Loan<span>(ऋण सुविधा प्राप्त करने का उद्देश्य)</span></label>
												</div>
											</div>
										</div>
									</div> 
							</div>
                                <div id="IfTermLoan">
                                <div class="header">
								<h2>
									In The Case Of Fixed Investment Loan Required, Details Of Machinery/Equipment Should Be Presented As Follows<span>(सावधि निवेश ऋण आवश्यकता के मामले में, मशीन/उपकरण का ब्योरा निम्नानुसार प्रस्तुत किया जाए)</span>:
								</h2>
							</div>
							<div class="body">
								
									<div class="row clearfix">
										<div class="col-lg-2 col-md-2 col-sm-2 col-xs-4 form-control-label">
													<label class="form-label kc-label">Type Of Machine/Equipment<span>(मशीन/उपकरण का प्रकार)</span></label>
									    </div>
										<div class="col-lg-2 col-md-2 col-sm-2 col-xs-4 form-control-label">
													<label class="form-label kc-label">Purpose To Get<span>(प्राप्त करने का उद्देश्य)</span></label>
										</div>
										<div class="col-lg-2 col-md-2 col-sm-2 col-xs-4 form-control-label">
													<label class="form-label kc-label">Suppliers Name<span>(आपूर्तिकर्ता का नाम)</span></label>
										</div>
										<div class="col-lg-2 col-md-2 col-sm-2 col-xs-4 form-control-label">
													<label class="form-label kc-label">Total Cost Of Machine<span>(मशीन की कुल लागत)</span></label>
										</div>
                                        <div class="col-lg-2 col-md-2 col-sm-2 col-xs-4 form-control-label">
													<label class="form-label kc-label">Subscription OF customers(₹)<span>(ग्राहक का अंशदान (रु.) )</span></label>
										</div>
                                        <div class="col-lg-2 col-md-2 col-sm-2 col-xs-4 form-control-label">
													<label class="form-label kc-label">Required Loan Amount(₹)<span>(आवश्यक ऋण राशि (रु.) )</span></label>
										</div>
									</div>
                                    <div class="row clearfix">
										<div class="col-lg-2 col-md-2 col-sm-2 col-xs-4">
										<div class="form-group form-float">
												<div class="form-line">
                                                    <form:input type="text" path="applicationLoanDetail.deviceType" id="applicationLoanDetail.deviceType" class="form-control"/>
													<label class="form-label"></label>
												</div>
											</div>
									</div>
										<div class="col-lg-2 col-md-2 col-sm-2 col-xs-4">
											<div class="form-group form-float">
												<div class="form-line">
													 <form:input type="text" path="applicationLoanDetail.deviceLoanObjective" id="applicationLoanDetail.deviceLoanObjective" class="form-control"/>
													<label class="form-label"></label>
												</div>
											</div>
										</div>
										<div class="col-lg-2 col-md-2 col-sm-2 col-xs-4">
											<div class="form-group form-float">
												<div class="form-line">
													<form:input type="text" path="applicationLoanDetail.supplierName" id="applicationLoanDetail.supplierName" class="form-control"/>
													<label class="form-label"></label>
												</div>
											</div>
										</div>
										<div class="col-lg-2 col-md-2 col-sm-2 col-xs-4">
											<div class="form-group form-float">
												<div class="form-line">
													<form:input type="text" path="applicationLoanDetail.costOfMachine" id="applicationLoanDetail.costOfMachine" class="form-control"/>
													<label class="form-label"></label>
												</div>
											</div>
										</div>
                                        <div class="col-lg-2 col-md-2 col-sm-2 col-xs-4">
											<div class="form-group form-float">
												<div class="form-line">
													<form:input type="text" path="applicationLoanDetail.customerContributionAmount" id="applicationLoanDetail.customerContributionAmount" class="form-control"/>
													<label class="form-label"></label>
												</div>
											</div>
										</div>
                                        <div class="col-lg-2 col-md-2 col-sm-2 col-xs-4">
											<div class="form-group form-float">
												<div class="form-line">
													<form:input type="text" path="applicationLoanDetail.loanAmountRequired" id="applicationLoanDetail.loanAmountRequired" class="form-control"/>
													<label class="form-label"></label>
												</div>
											</div>
										</div>
									</div>
							</div>
                                </div>
        </section> 
                        
      <!-------------------------------- Form Section 2 End Here ---------------------------------->
      <!-------------------------------- Form Section 3 Start From Here ---------------------------------->                                                <h2><span class="sr-only">3</span></h2>
                                <section>  
                                   <div class="header kc-header">
                            <h2>
                                Business Information<span>(व्यवसाय संबंधी जानकारी)</span>:
                            </h2>
                        </div>
                        <div class="body">
                           <c:forEach items="${loanData.loanApplicationCustomer.loanCustomerBusinesses}" var="loanCustomerBusinesses" varStatus="status">
                                <div class="row clearfix">
                                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" rows="4" class="form-control" path="loanApplicationCustomer.loanCustomerBusinesses[${status.index}].enterpriseName" 
                                                />
                                                <label class="form-label">Enterprise Name<span>(उद्यम का नाम)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-7 col-md-7 col-sm-7 col-xs-12">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" rows="4" class="form-control" path="loanApplicationCustomer.loanCustomerBusinesses[${status.index}].businessAddress" 
                                                />
                                                <label class="form-label">Details Of The Current Business Address (Shop Number/Route)<span>(वर्तमान व्यवसाय पता(दुकान संख्या/ मार्ग का विवरण))</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <a class="btn bg-orange btn-circle waves-effect waves-circle waves-float" data-toggle="collapse" href="#businessinfo" role="button" aria-expanded="false" aria-controls="businessinfo"><i class="material-icons">add</i></a>
                                    </div>
                                <div class="row clearfix collapse" id="businessinfo">
                                     <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                               <form:input type="text" rows="4" class="form-control" path="loanApplicationCustomer.loanCustomerBusinesses[${status.index}].city" 
                                                />
                                                <label class="form-label">Village/Town<span>(ग्राम/शहर)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                               <form:input type="text" rows="4" class="form-control" path="loanApplicationCustomer.loanCustomerBusinesses[${status.index}].postOffice" 
                                                />
                                                <label class="form-label">Post<span>(पोस्ट)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                             <form:input type="text" rows="4" class="form-control" path="loanApplicationCustomer.loanCustomerBusinesses[${status.index}].district" 
                                              />
                                                <label class="form-label">District<span>(जिला)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                             <form:input type="text" rows="4" class="form-control" path="loanApplicationCustomer.loanCustomerBusinesses[${status.index}].state" 
                                              />
                                                <label class="form-label">State<span>(प्रदेश)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                               <form:input type="text" rows="4" class="form-control" path="loanApplicationCustomer.loanCustomerBusinesses[${status.index}].pinCode" 
                                              />
                                                <label class="form-label">Pin Code<span>(पिन कोड)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                               <form:input type="text" rows="4" class="form-control" path="loanApplicationCustomer.loanCustomerBusinesses[${status.index}].mobileNumber" 
                                              />
                                                <label class="form-label">Mobie Number<span>(मोबाइल नं.)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                              <form:input type="text" rows="4" class="form-control" path="loanApplicationCustomer.loanCustomerBusinesses[${status.index}].phoneNumber" />
                                                <label class="form-label">Telephone Number<span>(टेलीफोन नं.)</span></label>
                                            </div>
                                        </div>
                                    </div>
												<div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" rows="4" class="form-control" path="loanApplicationCustomer.loanCustomerBusinesses[${status.index}].email" />
                                                <label class="form-label">Email<span>(ई-मेल)</span></label>
                                            </div>
                                        </div>
                                    </div> 
                                </div>
                                <div class="kc-heading">
                                <h4>
                                     Business Activity<span>(व्यवसाय कार्यकलाप)</span>:
                                </h4>
                                </div>
                                <div class="row clearfix">
                                    <div class="col-lg-5 col-md-5 col-sm-5 col-xs-5">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" rows="4" class="form-control" path="loanApplicationCustomer.loanCustomerBusinesses[${status.index}].presentBusinessActivity" />
                                                <label class="form-label">Present<span>(वर्तमान)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" rows="4" class="form-control" path="loanApplicationCustomer.loanCustomerBusinesses[${status.index}].proposedBusinessActivity" />
                                                <label class="form-label">As Proposed<span>(प्रस्तावित)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                      <a class="btn bg-orange btn-circle waves-effect waves-circle waves-float" data-toggle="collapse" href="#bussinessOff" role="button" aria-expanded="false" aria-controls="bussinessOff"><i class="material-icons">add</i></a>
                                 </div>
                               <div class="row clearfix collapse" id="bussinessOff">
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerBusinesses[${status.index}].startDate" />
                                                <label class="form-label">Date Of Commencement (Day/Month/Year)<span>(प्रारंभ करने की तिथि (दिन/महीना/वर्ष))</span></label>
                                            </div>
                                        </div>
                                    </div>
                                   <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                       <span class="kc-subhead">Build-Type<span>(गठन-प्रकार)</span></span>
                                       <form:select  class="form-control show-tick kc-select" path="loanApplicationCustomer.loanCustomerBusinesses[${status.index}].typeOfCompany">
   											<form:option value="एकल स्वामित्व" label="Sole Proprietorship(एकल स्वामित्व)"/>
   											<form:option value="प्रा. लि." label="Pvt. LTD.(प्रा.लि.)"/>
   											<form:option value="भागीदारी" label="Partnerships(भागीदारी)"/>
   											<form:option value="लिमिटेड कंपनी" label="Limited Company(लिमिटेड कंपनी)"/>
   											<form:option value="व्यक्तिगत" label="Personal(व्यक्तिगत)"/>
   											<form:option value="अन्य(निर्दिष्ट करें)" label="Specify Other(अन्य(निर्दिष्ट करें))"/>
   										</form:select>
										                                                                    
                                   </div>
                                   <div class="col-lg-7 col-md-7 col-sm-7 col-xs-7">
                                       <span class="kc-subhead">Business Premises Type<span>(व्यवसाय परिसर प्रकार)</span></span>
										<form:select  class="form-control show-tick kc-select" path="loanApplicationCustomer.loanCustomerBusinesses[${status.index}].businessPremisesType">
											<form:option value="निरंतर चलायमान" label="Constant motion(निरंतर चलायमान)"/>
											<form:option value="चलायमान(सीमित दायरा)" label="Moving(Narrow Circle)(चलायमान(सीमित दायरा))"/>
                                            <form:option value="स्थिर(किराये का)" label= "Stable(Rental)(स्थिर(किराये का))"/>
                                           <form:option value="स्थिर(स्वयं का)" label="Stable(Self)(स्थिर(स्वयं का))"/>
										</form:select>
                                   </div>
                                    <div class="col-lg-5 col-md-5 col-sm-5 col-xs-5">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerBusinesses[${status.index}].registeredOffice" />
                                                <label class="form-label">Registered Office Address<span>(पंजीकृत कार्यालय का पता)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4 form-control-label">
                                      <label class="form-label kc-label">Is GST Registered (Yes/No)<span>(क्या इकाई GST पंजीकृत है (हाँ/ नहीं))</span></label>
                                    </div>
                                  <div class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                    <div class="input-group input-group-lg">
                                        <span class="input-group-addon">
                                            
                                            <form:radiobutton path = "loanApplicationCustomer.loanCustomerBusinesses[${status.index}].gstExist" value = "1" label="Yes(हाँ)"/>
                                           
                                        </span>
                                    </div>
                                   </div>
                                  <div class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                   <div class="input-group input-group-lg">
                                        <span class="input-group-addon">
                                           <form:radiobutton path = "loanApplicationCustomer.loanCustomerBusinesses[${status.index}].gstExist" value = "0" label="No(नहीं)"/>
                                           
                                        </span>
                                    </div>
                                  </div>
                                  <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerBusinesses[${status.index}].gstNumber" />
                                                <label class="form-label">GST Registration No.<span>(GST पंजीकरण नं:)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerBusinesses[${status.index}].registeredUnit" />
                                                <label class="form-label">Is Entity registered (if So, Then where? For Example - The Municipality / Municipal / Mandi Parishad etc.<span>(क्या इकाई पंजीकृत है(यदि हाँ तो कहाँ ?उदाहरण - नगर पालिका/ नगर निगम/मंडी परिषद आदि))</span></label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                           
                        </div>
                        </c:forEach>
                                </section>
       <!-------------------------------- Form Section 3 End Here ---------------------------------->
       <!-------------------------------- Form Section 4 Start From Here ---------------------------------->
                                <h2><span class="sr-only">4</span></h2>        
                                <section>
                                <div class="header kc-header">
                            <h2>
                                Family Details Of Those Members Are Dependent On You<span>(पारिवारिक विवरण उन सदस्यों का जो आप पर आश्रित हैं)</span>:
                            </h2>
                               </div>
                     <c:forEach items="${loanData.loanApplicationCustomer.loanCustomerDependents}" var="loanCustomerDependents" varStatus="status">
                        <div class="body">
                                <div class="row clearfix">
                                     <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerDependents[${status.index}].name" />
                                                <label class="form-label">Name<span>(नाम)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                     <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerDependents[${status.index}].relation" />
                                                <label class="form-label">Relation<span>(रिश्ता)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                     <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerDependents[${status.index}].age" />
                                                <label class="form-label">Age(In Years)<span>(उम्र (वर्ष))</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <a class="btn bg-orange btn-circle waves-effect waves-circle waves-float" data-toggle="collapse" href="#familyDetails" role="button" aria-expanded="false" aria-controls="familyDetails"><i class="material-icons">add</i></a>
                                </div>
                                    <div class="row clearfix collapse" id="familyDetails">
                                     <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                               <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerDependents[${status.index}].business" />
                                                <label class="form-label">Business<span>(व्यवसाय)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                     <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerDependents[${status.index}].income" />
                                                <label class="form-label">Income<span>(आय)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                     <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerDependents[${status.index}].mobileNumber" />
                                                <label class="form-label">Mobile Number<span>(मोबाइल नं.)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                     <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerDependents[${status.index}].livingStatus" />
                                                <label class="form-label">Are You Live Together(Yes/No)<span>(क्या आपके साथ रहते हैं (हाँ/नहीं))</span></label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                        </div>
                        </c:forEach>
                               </section>
       <!-------------------------------- Form Section 4 End Here ---------------------------------->
       <!-------------------------------- Form Section 5 Start From Here ---------------------------------->
                                <h2><span class="sr-only">5</span></h2>        
                                <section>
                                <div class="header">
                            <h2>
                                Details Of Owners/Partners/Directors<span>(मालिक / भागीदारों / निदेशकों का विवरण)</span>:
                            </h2>
                               </div>
              <c:forEach items="${loanData.loanApplicationCustomer.loanCustomerPartnerDetails}" var="loanCustomerPartnerDetails" varStatus="status">     
                        <div class="body">
                            <div class="kc-heading">
                            <h3>Owners/Partners <span>(मालिक / भागीदार)</span></h3>
                              </div>
                                <div class="row clearfix">
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                             <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerPartnerDetails[${status.index}].partnerName" />
                                                <label class="form-label">Name<span>(नाम)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                     <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerPartnerDetails[${status.index}].partnerGurdianName" />
                                                <label class="form-label">Father's / Husband's Name<span>(पिता/ पति का नाम)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerPartnerDetails[${status.index}].dateOfBirth" />
                                                <label class="form-label">Date Of Birth<span>(जन्म तिथि)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerPartnerDetails[${status.index}].gender" />
                                                <label class="form-label">Sex<span>(लिंग)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <a class="btn bg-orange btn-circle waves-effect waves-circle waves-float" data-toggle="collapse" href="#ownerPatners" role="button" aria-expanded="false" aria-controls="ownerPatners"><i class="material-icons">add</i></a>
                                 </div>
                                    <div class="row clearfix collapse" id="ownerPatners">
                                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerPartnerDetails[${status.index}].qualification" />
                                                <label class="form-label">Educational Qualification<span>(शैक्षणिक योग्यता)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                               <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerPartnerDetails[${status.index}].yearsOfExperience" />
                                                <label class="form-label">Activities Operate Experience(In Years)<span>(कार्यकलाप संचालित करने का अनुभव (वर्षों में))</span></label>
                                            </div>
                                        </div>
                                    </div>
                                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerPartnerDetails[${status.index}].yearsOfExperience" />
                                                <label class="form-label">Is There Any Connection With The Company's Officials? If So, Details<span>(क्या कंपनी  के पदाधिकारियों के साथ कोई सम्बन्ध है? यदि हाँ तो विवरण दें)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-5 col-md-5 col-sm-5 col-xs-5">
                                       <span class="kc-subhead">Type Of Accommodation<span>(आवास का प्रकार)</span></span>
										
										<form:select  class="form-control show-tick kc-select" path="loanApplicationCustomer.loanCustomerPartnerDetails[${status.index}].typeOfAccomodation">
   											<form:option value="स्वयं" label="Self(स्वयं)"/>
   											<form:option value="किरायेदार" label="Tenant(किरायेदार)"/>
   											<form:option value="पुश्तैनी" label="Ancestral(पुश्तैनी)"/>
   											
   										</form:select>
										                                                                    
                                   </div>
                                    <div class="col-lg-7 col-md-7 col-sm-7 col-xs-7">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerPartnerDetails[${status.index}].partnerAddress" />
                                                <label class="form-label">Residential address<span>(आवासीय पता)</span></label>
                                            </div>
                                        </div>
                                      </div>
                                     <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                       <span class="kc-subhead">Social Ranking<span>(सोशल श्रेणी)</span></span>
                                       <form:select  class="form-control show-tick kc-select" path="loanApplicationCustomer.loanCustomerPartnerDetails[${status.index}].caste">
   											<form:option value="एससी" label="S.C(एससी)"/>
   											<form:option value="एसटी" label="S.T(एसटी)"/>
   											<form:option value="ओबीसी" label="OBC(ओबीसी)"/>
   											<form:option value="सामान्य" label="General(सामान्य )"/>
   											
   										</form:select>
										
                                      </div>
                                        <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                           <span class="kc-subhead">Religion<span>(धर्म)</span></span>
                                           <form:select  class="form-control show-tick kc-select" path="loanApplicationCustomer.loanCustomerPartnerDetails[${status.index}].religion">
   											<form:option value="हिंदू" label="Hindu(हिंदू)"/>
   											<form:option value="बौद्ध" label="Buddhist(बौद्ध)"/>
   											<form:option value="पारसी" label="Parasi(पारसी)"/>
   											<form:option value="ईसाई" label="Christian(ईसाई)"/>
   											<form:option value="सिख" label="Sikh(सिख)"/>
   											<form:option value="जैन" label="Jain(जैन)"/>
   											<form:option value="मुस्लिम" label="Muslim(मुस्लिम)"/>
   											<form:option value="अन्य" label="Other(अन्य)"/>
   											
   											</form:select>
										
                                       </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerPartnerDetails[${status.index}].mobileNumber" />
                                                <label class="form-label">Mobile Number<span>(मोबाइल नंबर)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerPartnerDetails[${status.index}].panNumber" />
                                                <label class="form-label">Pan Card<span>(पैन कार्ड)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerPartnerDetails[${status.index}].aadharNumber" />
                                                <label class="form-label">Aadhar Number<span>(आधार नंबर)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerPartnerDetails[${status.index}].voterCardNo" />
                                                <label class="form-label">Voter ID<span>(मतदाता पहचान पत्र)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerPartnerDetails[${status.index}].dinNumber" />
                                                <label class="form-label">DIN/Other Proof<span>(डीआईएऩ /अन्य प्रमाण)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                       </div>
                    </c:forEach>
                               </section>
       <!-------------------------------- Form Section 5 End Here ---------------------------------->
       <!-------------------------------- Form Section 6 Start Here ---------------------------------->
                                 <h2><span class="sr-only">6</span></h2>        
                                <section>
                                <div class="header kc-header">
                            <h2>
                                Partner Firms Name and Business Nature<span>(सहयोगी फर्मों के नाम और सहयोगी फर्मों के व्यवसाय की प्रकृति)</span> :
                            </h2>
                               </div>
        			<c:forEach items="${loanData.loanApplicationCustomer.loanCustomerPartnerFirmDetails}" var="loanCustomerPartnerFirmDetails" varStatus="status">
                        <div class="body">
                                <div class="row clearfix">
                                    <div class="col-lg-5 col-md-5 col-sm-5 col-xs-5">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerPartnerFirmDetails[${status.index}].partnerFirmName" />
                                                <label class="form-label">Name Of Partner Firm<span>(सहयोगी फर्म का नाम)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerPartnerFirmDetails[${status.index}].firmAddress" />
                                                <label class="form-label">Address Of Partner Firm<span>(सहयोगी फर्म का पता)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                     <a class="btn bg-orange btn-circle waves-effect waves-circle waves-float" data-toggle="collapse" href="#patnerFirms" role="button" aria-expanded="false" aria-controls="patnerFirms"><i class="material-icons">add</i></a>
                                </div>
                                    <div class="row clearfix collapse" id="patnerFirms">
                                     <div class="col-lg-6 col-md-6 col-sm-6 col-xs-9">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerPartnerFirmDetails[${status.index}].partnerFirmBankName" />
                                                <label class="form-label">Current Bank Being Banking Practices With<span>(वर्तमान बैंक जिसके साथ बैंकिंग व्यवहार किया जा रहा हो)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerPartnerFirmDetails[${status.index}].firmBusinessNature" />
                                                <label class="form-label">Partner Firm's Business Nature<span>(सहयोगी फर्म के व्यवसाय की प्रकृति)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerPartnerFirmDetails[${status.index}].firmOwnerShipRange" />
                                                <label class="form-label">In Partner Firm Owner/Partner/ Or Investor's Range Of Interest<span>(सहयोगी फर्म में मालिक/भागीदार/या सिर्फ निवेशक के रूप में हित की सीमा)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                        </div>
                               </section>
           </c:forEach>
       <!-------------------------------- Form Section 6 End Here ---------------------------------->
       <!-------------------------------- Form Section 7 Start From Here ---------------------------------->
                                <h2><span class="sr-only">7</span></h2>        
                                <section>
                                <div class="header kc-header">
                            <h2>
                                Current Banking Facilities (in rupees)<span>(वर्तमान बैंकिंग सुविधाएं (रुपए में))</span>:
                            </h2>
                               </div>
            <c:forEach items="${loanData.loanApplicationCustomer.loanCustomerBankDetails}" var="loanCustomerBankDetails" varStatus="status">
                        <div class="body kc-top">
                                <div class="row clearfix">
                                     <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                        <span class="kc-subhead">Types Of Facilities<span>(सुविधाओं का प्रकार)</span></span>
                                        <form:select  class="form-control show-tick kc-select" path="loanApplicationCustomer.loanCustomerBankDetails[${status.index}].bankAccountType">
   											<form:option value="बचत खाता" label="Savings Account(बचत खाता)"/>
   											<form:option value="चालू खाता" label="Current Account(चालू खाता)"/>
   											<form:option value="CC लिमिट" label="CC Limit<span>(CC लिमिट)"/>
   											
   										</form:select>
                                    </div>
                                     <div class="col-lg-7 col-md-7 col-sm-7 col-xs-7">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerBankDetails[${status.index}].bankName" />
                                                <label class="form-label">Present Bank Name With Whom You Have Banking Practices<span>(वर्तमान बैंक जिसके साथ बैंकिंग व्यवहार किया जा रहा हो)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <a class="btn bg-orange btn-circle waves-effect waves-circle waves-float" data-toggle="collapse" href="#currentBanking" role="button" aria-expanded="false" aria-controls="currentBanking"><i class="material-icons">add</i></a>
                                </div>
                                <div class="row clearfix collapse" id="currentBanking">
                                     <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerBankDetails[${status.index}].bankBranchNumber" />
                                                <label class="form-label">Bank Branch<span>(बैंक शाखा)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                     <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerBankDetails[${status.index}].accountNumber" />
                                                <label class="form-label">Account Number<span>(खाता सं:)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerBankDetails[${status.index}].accountStartDate" />
                                                <label class="form-label">Date Of Account Opened<span>(खाता प्रारम्भ करने की तिथि)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerBankDetails[${status.index}].depositAmount" />
                                                <label class="form-label">Bank Balance<span>(बैंक में जमा राशि)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    
                                </div>
                        </div>
                 </c:forEach>
                               </section>
       <!-------------------------------- Form Section 7 End Here ---------------------------------->
       <!-------------------------------- Form Section 8 Start From Here --------------------------->
                                <h2><span class="sr-only">8</span></h2>        
                                <section>
                                <div class="header kc-header">
                            <h2>
                                Details Of Liabilities (Commercial and  Domestic)<span>(देनदारियों का विवरण (व्यावसायिक व घरेलू))</span>:
                            </h2>
                               </div>
             <c:forEach items="${loanData.loanApplicationCustomer.loanCustomerLoanDetails}" var="loanCustomerLoanDetails" varStatus="status">
                        <div class="body kc-top">
                                <div class="row clearfix">
                                    <div class="col-lg-5 col-md-5 col-sm-5 col-xs-5">
                                        <span class="kc-subhead">Types Of Liabilities<span>(देनदारियों का प्रकार)</span></span>
                                        
                                        <form:select  class="form-control show-tick kc-select" path="loanApplicationCustomer.loanCustomerLoanDetails[${status.index}].typeOfLoan">
   											<form:option value="बैंक " label="Bank(बैंक)"/>
   											<form:option value="प्राइवेट फाइनेंस कंपनी" label="Private Finance Company(प्राइवेट फाइनेंस कंपनी)"/>
   											<form:option value="जिस्टर्ड NBFC/ NBFC MFI" label="Registered NBFC/ NBFC MF(रजिस्टर्ड NBFC/ NBFC MFI)"/>
   											<form:option value="सप्लायर" label="Supplier(सप्लायर)"/>
   											<form:option value="किसान क्रेडिट कार्ड" label="Kisan Credit Card(किसान क्रेडिट कार्ड)"/>
   											<form:option value="रिश्तेदार/ मित्र/ पड़ोसी" label="Relative/Friend/Neighbor(रिश्तेदार/ मित्र/ पड़ोसी)"/>
   											<form:option value="साहुकार" label="Financer(साहुकार)"/>
   											<form:option value="बैंक का क्रेडिट कार्ड" label="Bank Credit Card(बैंक का क्रेडिट कार्ड)"/>
   											<form:option value="अन्य स्रोत से ऋण" label="Loan From Other Sources(अन्य स्रोत से ऋण)"/>
   											
   											
   										</form:select>
										
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerLoanDetails[${status.index}].loanCompanyName" />
                                                <label class="form-label">Name<span>(नाम)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerLoanDetails[${status.index}].purpose" />
                                                <label class="form-label">Objective<span>(उद्देश्य)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <a class="btn bg-orange btn-circle waves-effect waves-circle waves-float" data-toggle="collapse" href="#detailsLib" role="button" aria-expanded="false" aria-controls="detailsLib"><i class="material-icons">add</i></a>
                                </div>
                                <div class="row clearfix collapse" id="detailsLib">
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerLoanDetails[${status.index}].loanAmount" />
                                                <label class="form-label">Original Loan Amount<span>(मूल ऋण राशि)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerLoanDetails[${status.index}].balanceLoanAmount" />
                                                <label class="form-label">Remaining Loan Amount<span>(शेष ऋण राशि)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                               <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerLoanDetails[${status.index}].loanTerm" />
                                                <label class="form-label">Period<span>(अवधि)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerLoanDetails[${status.index}].loanInterestRate" />
                                                <label class="form-label">Rate Of Interest<span>(ब्याज दर)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerLoanDetails[${status.index}].loanStartDate" />
                                                <label class="form-label">Start Date<span>(प्रारम्भ की तिथि)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerLoanDetails[${status.index}].loanEmiAmount" />
                                                <label class="form-label">Amount Of Installment<span>(किश्त की राशि)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerLoanDetails[${status.index}].loanEmiType" />
                                                <label class="form-label">Installment frequency (Daily/Weekly/Monthly/Fortnightly)<span>(किश्त की आवृत्ति (दैनिक/साप्ताहिक/ मासिक/ पाक्षिक))</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerLoanDetails[${status.index}].loanSecurity" />
                                                <label class="form-label">Securities<span>(प्रतिभूति)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerLoanDetails[${status.index}].legalStatus" />
                                                <label class="form-label">Any pending legal proceedings<span>(कोई अपूर्ण कानूनी कार्यवाही)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerLoanDetails[${status.index}].loanAgreementIncorporated" />
                                                <label class="form-label">Any Informal Settlement Between Borrower And Lender<span>(कोई अनौपचारिक समझौता जो उधारकर्ता और ऋणदाता में हुआ हो)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" class="form-control" path="loanApplicationCustomer.loanCustomerLoanDetails[${status.index}].presentLoanStatus" />
                                                <label class="form-label">Present Situation (Performing/Non-Performing)<span>(वर्तमान स्थिति(परफार्मिंग/नॉन परफार्मिंग))</span></label>
                                            </div>
                                        </div>
                                    </div>
                                </div>       
                        </div>
                  </c:forEach>
                               </section>
                   
          <!-------------------------------- Form Section 8 End Here ---------------------------------->
       <!-------------------------------- Form Section 9 Start From Here ---------------------------------->
                                <h2><span class="sr-only">9</span></h2>        
                                <section>
                                <div class="header kc-header">
                            <h2>
                                Total Of Liabilities (Commercial and  Domestic)<span>(कुल देनदारियां (व्यावसायिक व घरेलू))</span>:
                            </h2>
                               </div>
                        <div class="body">
                            
                                <div class="row clearfix">
                                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" path="loanApplicationCustomer.totalCommercialLiability" id="loanApplicationCustomer.totalCommercialLiability" class="form-control"/>
                                                <label class="form-label">Sub Total (Commercial Liabilities)<span>(उप कुल (व्यावसायिक देनदारियां))</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                               <form:input type="text" path="loanApplicationCustomer.totalDomesticLiability" id="loanApplicationCustomer.totalDomesticLiability" class="form-control"/>
                                                <label class="form-label">Sub Total(Domestic Liabilities)<span>(उप कुल (घरेलु देनदारियां))</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" path="loanApplicationCustomer.totalLiability" id="loanApplicationCustomer.totalLiability" class="form-control"/>
                                                <label class="form-label">Total liabilities (iv)<span>(कुल देनदारियां (iv))</span></label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="kc-heading">
                                <h4>
                                     Total Capacity<span>(कुल हैसियत)</span>:
                                </h4>
                                </div>
                                <div class="row clearfix">
                                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" path="loanApplicationCustomer.occupationalIncome" id="loanApplicationCustomer.occupationalIncome" class="form-control"/>
                                                <label class="form-label">Professional Capacity<span>(व्यावसायिक हैसियत)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" path="loanApplicationCustomer.domesticCapacity" id="loanApplicationCustomer.domesticCapacity" class="form-control"/>
                                                <label class="form-label">Domestic Capacity<span>(घरेलु हैसियत)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" path="loanApplicationCustomer.totalCapacity" id="loanApplicationCustomer.totalCapacity" class="form-control"/>
                                                <label class="form-label">Total Capacity<span>(कुल हैसियत )</span></label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                       
                        </div>
                               </section>
       <!-------------------------------- Form Section 9 End Here ---------------------------------->
       <!-------------------------------- Form Section 10 Start From Here -------------------------->
                                <h2><span class="sr-only">10</span></h2>        
                                <section>
                                <div class="header kc-header">
                                <h2>
                                    The Details Of The Monthly Household Income<span>(मासिक घरेलु आय का विवरण)</span>:
                                </h2>
                               </div>
                        <div class="body">
                           
                                <div class="row clearfix">
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" path="loanApplicationCustomer.incomeFromRent" id="loanApplicationCustomer.incomeFromRent" class="form-control"/>
                                                <label class="form-label">Rental income<span>(किराये से आमदनी)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" path="loanApplicationCustomer.incomeFromOtherMember" id="loanApplicationCustomer.incomeFromOtherMember" class="form-control"/>
                                                <label class="form-label">Household Income Of Other Members By Pension<span>(घर के अन्य सदस्य के पेंशन से आमदनी)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row clearfix">
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" path="loanApplicationCustomer.salIncome" id="loanApplicationCustomer.salIncome" class="form-control"/>
                                                <label class="form-label">Household Income From Salaries Of Members<span>(घर के अन्य सदस्य के वेतन से आमदनी)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" path="loanApplicationCustomer.agriculturalIncome" id="loanApplicationCustomer.agriculturalIncome" class="form-control"/>
                                                <label class="form-label">Farming Income<span>(खेती से आमदनी)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row clearfix">
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" path="loanApplicationCustomer.incomeFromMilk" id="loanApplicationCustomer.incomeFromMilk" class="form-control"/>
                                                <label class="form-label">Income From Milk Products<span>(दुग्ध उत्पाद से आमदनी)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" path="loanApplicationCustomer.incomeFromOtherSource" id="loanApplicationCustomer.incomeFromOtherSource" class="form-control"/>
                                                <label class="form-label">Income From Any Other Source<span>(अन्य किसी स्रोत से आमदनी)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row clearfix">
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <form:input type="text" path="loanApplicationCustomer.domesticIncome" id="loanApplicationCustomer.domesticIncome" class="form-control"/>
                                                <label class="form-label">Gross Domestic Income (vi)<span>(सकल घरेलू आय(vi))</span></label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            
                        </div>
                               </section>
       <!-------------------------------- Form Section 10 End Here --------------------------------->
                        </div>
                      </form>           
                    </div>
                </div>
            </div>
            <!-- #END# Basic Example | Horizontal Layout -->
        </div>
     </div>
  </form:form>
    </section>
    <script>
         $(document).ready(function(){
                $('.kc-add').on( "click", function() {
                  var clon = $('.kc-familyFormBody>.kc-familyDetails').clone();
                  $('#kc-append-family-details').append(clon);
                  $.AdminBSB.input.activate();
                });                          
                $('.kc-addDetails').on( "click", function() {
                  var clon1 = $('.kc-liabilitiesFormBody>.kc-liabilitiesDetails').clone();
                  $('#kc-append-liabilities-details').append(clon1);
                  $.AdminBSB.input.activate();
                });                          
                $('.kc-addCurrentBanking').on( "click", function() {
                  var clon2 = $('.kc-CurrentBankingFormBody>.kc-CurrentBanking').clone();
                  $('#kc-append-Current-Banking').append(clon2);
                  $.AdminBSB.input.activate();
                });                          
                $('.kc-addPartnerBusiness').on( "click", function() {
                  var clon3 = $('.kc-PartnerBusinessFormBody>.kc-PartnerBusiness').clone();
                  $('#kc-append-Partner-Business').append(clon3);
                  $.AdminBSB.input.activate();
                });                          
         });
       </script>
<style>
    .kc-btnadd {
    float: right;
    position: relative;
    top: -22px;
    }
    .kc-select {
    display: inline-flex !important;
    }
    .kc-top{
    margin-top: 10px;    
    }
    .kc-customerType{
    float: left;    
    }
        .kc-select{
    position: relative;
    top: -18px;
    }
    span.kc-subhead {
        position: relative;
        top: -15px;
    }
    label.kc-label {
        text-align: center;
        float: left;
    }
    .wizard > .steps > ul > li {
        width: 6% !important;
        float: left;
    }
    .steps.clearfix a {
        border-radius: 50% !important;
        width: 50px !important;
        height: 50px !important;
        text-align: center;
        line-height: normal;
    }
    .form-group .form-line.focused .form-label {
        top: -25px;
        left: 0;
        font-size: 12px;
    }
    .form-label span{
        display: block;
    }    
    .form-group .form-line .form-label{
        top: -6px;
    }
    .kc-header {
    margin-bottom: 15px;
    }
    .kc-heading {
    margin-bottom: 30px;
    }
    </style>