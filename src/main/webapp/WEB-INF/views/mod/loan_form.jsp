<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%--@ taglib uri="/WEB-INF/tlds/fmt.tld" prefix="fmt" --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
	
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
                           <form>
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
                                            <input type="radio" name="customer_type" checked class="with-gap" value="Current Customer" id="current_customer">
                                            <label for="current_customer">Current Customer<span>(वर्तमान ग्राहक)</span></label>
                                        </span>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                     <div class="input-group input-group-lg">
                                        <span class="input-group-addon kc-customerType">
                                            <input type="radio" class="with-gap" name="customer_type" value="New Customer" id="new_customer">
                                            <label for="new_customer">New Customer<span>(नया ग्राहक)</span></label>
                                        </span>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="Current_situation">
                                                <label class="form-label">Describe the situation of the current customer<span>(वर्तमान ग्राहक होने के स्थिति  में विवरण दें)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row clearfix">
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control">
                                                <label class="form-label">Name Of Applicant<span>(आवेदक का नाम)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="applicant_name">
                                                <label class="form-label">Name Of Co-Applicant<span>(सह -आवेदक का नाम)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="serial-number">
                                                <label class="form-label">Application Serial Number<span>(आवेदन क्रम संख्या)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="customer_number">
                                                <label class="form-label">Customer Number<span>(ग्राहक संख्या)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row clearfix">
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="officer_name">
                                                <label class="form-label">Loan officer's name<span>(ऋण अधिकारी का नाम)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="branch_name_number">
                                                <label class="form-label">Branch Name and Number<span>(शाखा का नाम व संख्या)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="state_name">
                                                <label class="form-label">State Name<span>(प्रदेश का नाम)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
										<select class="form-control show-tick" name="reason_behind">
											<option value="कार्यशील हेतु">For Working<span>(कार्यशील हेतु)</span></option>
											<option value="निवेश हेतु">For Investment<span>(निवेश हेतु)</span></option>
											<option value="विविधता हेतु">For Diversity<span>(विविधता हेतु)</span></option>
										</select>
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
								</h2>
							</div>
							<div class="body kc-top">
								
									<div class="row clearfix">
										<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
								             <span class="kc-subhead">Types Of Loan<span>(सुविधाओं का प्रकार)</span></span>
										<select class="form-control show-tick kc-select" name="loan_types">
											<option value="सावधि ऋण">Term Loan<span>(सावधि ऋण)</span></option>
											<option value="अन्य ऋण">Other Loans<span>(अन्य ऋण)</span></option>
										</select>
									    </div>
										<div class="col-lg-5 col-md-5 col-sm-5 col-xs-5">
											<div class="form-group form-float">
												<div class="form-line">
													<input type="text" class="form-control" name="termloan_amount">
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
													<input type="text" class="form-control" name="termloan_period">
													<label class="form-label">Period<span>(अवधि)</span></label>
												</div>
											</div>
										</div>
										<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
											<div class="form-group form-float">
												<div class="form-line">
													<input type="text" class="form-control" name="termloan_aim_behind">
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
                                                    <input type="text" class="form-control" name="machine_equipment_1">
													<label class="form-label"></label>
												</div>
											</div>
									</div>
										<div class="col-lg-2 col-md-2 col-sm-2 col-xs-4">
											<div class="form-group form-float">
												<div class="form-line">
													 <input type="text" class="form-control" name="purpose_1">
													<label class="form-label"></label>
												</div>
											</div>
										</div>
										<div class="col-lg-2 col-md-2 col-sm-2 col-xs-4">
											<div class="form-group form-float">
												<div class="form-line">
													<input type="text" class="form-control" name="supplier_1">
													<label class="form-label"></label>
												</div>
											</div>
										</div>
										<div class="col-lg-2 col-md-2 col-sm-2 col-xs-4">
											<div class="form-group form-float">
												<div class="form-line">
													<input type="text" class="form-control" name="machine_cost_1">
													<label class="form-label"></label>
												</div>
											</div>
										</div>
                                        <div class="col-lg-2 col-md-2 col-sm-2 col-xs-4">
											<div class="form-group form-float">
												<div class="form-line">
													<input type="text" class="form-control" name="sub_of_customers_1">
													<label class="form-label"></label>
												</div>
											</div>
										</div>
                                        <div class="col-lg-2 col-md-2 col-sm-2 col-xs-4">
											<div class="form-group form-float">
												<div class="form-line">
													<input type="text" class="form-control" name="req_loan_amount_1">
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
                           
                                <div class="row clearfix">
                                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="enterprise_name">
                                                <label class="form-label">Enterprise Name<span>(उद्यम का नाम)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-7 col-md-7 col-sm-7 col-xs-12">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="details_address">
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
                                                <input type="text" class="form-control" name="locality">
                                                <label class="form-label">Village/Town<span>(ग्राम/शहर)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="post">
                                                <label class="form-label">Post<span>(पोस्ट)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="district">
                                                <label class="form-label">District<span>(जिला)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="state">
                                                <label class="form-label">State<span>(प्रदेश)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="pin_code">
                                                <label class="form-label">Pin Code<span>(पिन कोड)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="mobile_number">
                                                <label class="form-label">Mobie Number<span>(मोबाइल नं.)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="tel_number">
                                                <label class="form-label">Telephone Number<span>(टेलीफोन नं.)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="email" class="form-control" name="email">
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
                                                <input type="text" class="form-control" name="present">
                                                <label class="form-label">Present<span>(वर्तमान)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="as_proposed">
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
                                                <input type="text" class="form-control" name="date_commencement">
                                                <label class="form-label">Date Of Commencement (Day/Month/Year)<span>(प्रारंभ करने की तिथि (दिन/महीना/वर्ष))</span></label>
                                            </div>
                                        </div>
                                    </div>
                                   <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                       <span class="kc-subhead">Build-Type<span>(गठन-प्रकार)</span></span>
										<select class="form-control show-tick kc-select" name="build_type">
											<option value="एकल स्वामित्व">Sole Proprietorship<span>(एकल स्वामित्व)</span></option>
											<option value="भागीदारी">Partnerships<span>(भागीदारी)</span></option>
											<option value="प्रा. लि.">Pvt. LTD.<span>(प्रा.लि.)</span></option>
                                            <option value="लिमिटेड कंपनी">Limited Company<span>(लिमिटेड कंपनी)</span></option>
                                            <option value="व्यक्तिगत">Personal<span>(व्यक्तिगत)</span></option>
                                            <option value="अन्य(निर्दिष्ट करें)">Specify Other<span>(अन्य(निर्दिष्ट करें))</span></option>
										</select>                                                                             
                                   </div>
                                   <div class="col-lg-7 col-md-7 col-sm-7 col-xs-7">
                                       <span class="kc-subhead">Business Premises Type<span>(व्यवसाय परिसर प्रकार)</span></span>
										<select class="form-control show-tick kc-select" name="business_premises">
											<option value="निरंतर चलायमान">Constant motion<span>(निरंतर चलायमान)</span></option>
											<option value="चलायमान(सीमित दायरा)">Moving(Narrow Circle)<span>(चलायमान(सीमित दायरा))</span></option>
                                            <option value="स्थिर(किराये का)">Stable(Rental)<span>(स्थिर(किराये का))</span></option>
                                            <option value="स्थिर(स्वयं का)">Stable(Self)<span>(स्थिर(स्वयं का))</span></option>
										</select>
                                   </div>
                                    <div class="col-lg-5 col-md-5 col-sm-5 col-xs-5">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="reg_off_adress">
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
                                            <input type="radio" class="with-gap" name="gst_registered" id="gst_yes" value="हाँ">
                                            <label for="gst_yes">Yes<span>(हाँ)</span></label>
                                        </span>
                                    </div>
                                   </div>
                                  <div class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                   <div class="input-group input-group-lg">
                                        <span class="input-group-addon">
                                            <input type="radio" class="with-gap" name="gst_registered" id="gst_no" value="नहीं">
                                            <label for="gst_no">No<span>(नहीं)</span></label>
                                        </span>
                                    </div>
                                  </div>
                                  <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="gst_reg_num">
                                                <label class="form-label">GST Registration No.<span>(GST पंजीकरण नं:)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="entity_reg">
                                                <label class="form-label">Is Entity registered (if So, Then where? For Example - The Municipality / Municipal / Mandi Parishad etc.<span>(क्या इकाई पंजीकृत है(यदि हाँ तो कहाँ ?उदाहरण - नगर पालिका/ नगर निगम/मंडी परिषद आदि))</span></label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                           
                        </div>
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
                        <div class="body">
                                <div class="row clearfix">
                                     <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="family_member_name[]">
                                                <label class="form-label">Name<span>(नाम)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                     <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="family_member_relation[]">
                                                <label class="form-label">Relation<span>(रिश्ता)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                     <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="family_member_age[]">
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
                                                <input type="text" class="form-control" name="family_member_business[]">
                                                <label class="form-label">Business<span>(व्यवसाय)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                     <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="family_member_income[]">
                                                <label class="form-label">Income<span>(आय)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                     <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="family_member_mob_num[]">
                                                <label class="form-label">Mobile Number<span>(मोबाइल नं.)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                     <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="live _together[]">
                                                <label class="form-label">Are You Live Together(Yes/No)<span>(क्या आपके साथ रहते हैं (हाँ/नहीं))</span></label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                        </div>
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
                        <div class="body">
                            <div class="kc-heading">
                            <h3>Owners/Partners <span>(मालिक / भागीदार)</span></h3>
                              </div>
                                <div class="row clearfix">
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="o_p_name">
                                                <label class="form-label">Name<span>(नाम)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                     <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="f_h_name">
                                                <label class="form-label">Father's / Husband's Name<span>(पिता/ पति का नाम)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="d_o_b">
                                                <label class="form-label">Date Of Birth<span>(जन्म तिथि)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="sex">
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
                                                <input type="text" class="form-control" name="edu_q">
                                                <label class="form-label">Educational Qualification<span>(शैक्षणिक योग्यता)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="activities_exp">
                                                <label class="form-label">Activities Operate Experience(In Years)<span>(कार्यकलाप संचालित करने का अनुभव (वर्षों में))</span></label>
                                            </div>
                                        </div>
                                    </div>
                                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="connection_with_company">
                                                <label class="form-label">Is There Any Connection With The Company's Officials? If So, Details<span>(क्या कंपनी  के पदाधिकारियों के साथ कोई सम्बन्ध है? यदि हाँ तो विवरण दें)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-5 col-md-5 col-sm-5 col-xs-5">
                                       <span class="kc-subhead">Type Of Accommodation<span>(आवास का प्रकार)</span></span>
										<select class="form-control show-tick kc-select" name="accommodation">
											<option value="स्वयं">Self<span>(स्वयं)</span></option>
											<option value="किरायेदार">Tenant<span>(किरायेदार)</span></option>
                                            <option value="पुश्तैनी">Ancestral<span>(पुश्तैनी)</span></option>
										</select>
                                   </div>
                                    <div class="col-lg-7 col-md-7 col-sm-7 col-xs-7">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="res_address">
                                                <label class="form-label">Residential address<span>(आवासीय पता)</span></label>
                                            </div>
                                        </div>
                                      </div>
                                     <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                       <span class="kc-subhead">Social Ranking<span>(सोशल श्रेणी)</span></span>
										<select class="form-control show-tick kc-select" name="social_ranking">
											<option value="एससी">S.C<span>(एससी)</span></option>
											<option value="एसटी">S.T<span>(एसटी)</span></option>
                                            <option value="ओबीसी">OBC<span>(ओबीसी)</span></option>
                                            <option value="सामान्य">General<span>(सामान्य )</span></option>
										</select>
                                      </div>
                                        <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                           <span class="kc-subhead">Religion<span>(धर्म)</span></span>
                                            <select class="form-control show-tick kc-select" name="religion">
                                                <option value="हिंदू">Hindu<span>(हिंदू)</span></option>
                                                <option value="बौद्ध">Buddhist<span>(बौद्ध)</span></option>
                                                <option value="पारसी">Parasi<span>(पारसी)</span></option>
                                                <option value="ईसाई">Christian<span>(ईसाई)</span></option>
                                                <option value="सिख">Sikh<span>(सिख)</span></option>
                                                <option value="जैन">Jain<span>(जैन)</span></option>
                                                <option value="मुस्लिम">Muslim<span>(मुस्लिम)</span></option>
                                                <option value="अन्य">Other<span>(अन्य)</span></option>
                                            </select>
                                       </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="o_p_mob_number">
                                                <label class="form-label">Mobile Number<span>(मोबाइल नंबर)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="pan_card">
                                                <label class="form-label">Pan Card<span>(पैन कार्ड)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="aadhar_number">
                                                <label class="form-label">Aadhar Number<span>(आधार नंबर)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="voter_id">
                                                <label class="form-label">Voter ID<span>(मतदाता पहचान पत्र)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="din_proof">
                                                <label class="form-label">DIN/Other Proof<span>(डीआईएऩ /अन्य प्रमाण)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                       </div>
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
                        <div class="body">
                                <div class="row clearfix">
                                    <div class="col-lg-5 col-md-5 col-sm-5 col-xs-5">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="partner_firm_name">
                                                <label class="form-label">Name Of Patner Firm<span>(सहयोगी फर्म का नाम)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="partner_address">
                                                <label class="form-label">Address Of Patner Firm<span>(सहयोगी फर्म का पता)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                     <a class="btn bg-orange btn-circle waves-effect waves-circle waves-float" data-toggle="collapse" href="#patnerFirms" role="button" aria-expanded="false" aria-controls="patnerFirms"><i class="material-icons">add</i></a>
                                </div>
                                    <div class="row clearfix collapse" id="patnerFirms">
                                     <div class="col-lg-6 col-md-6 col-sm-6 col-xs-9">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="current_banking_prac">
                                                <label class="form-label">Current Bank Being Banking Practices With<span>(वर्तमान बैंक जिसके साथ बैंकिंग व्यवहार किया जा रहा हो)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="business_nature">
                                                <label class="form-label">Patner Firm's Business Nature<span>(सहयोगी फर्म के व्यवसाय की प्रकृति)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="range_of_intrest">
                                                <label class="form-label">In Patner Firm Owner/Patner/ Or Investor's Range Of Intrest<span>(सहयोगी फर्म में मालिक/भागीदार/ या सिर्फ निवेशक के रूप में हित की सीमा)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                        </div>
                               </section>
       <!-------------------------------- Form Section 6 End Here ---------------------------------->
       <!-------------------------------- Form Section 7 Start From Here ---------------------------------->
                                <h2><span class="sr-only">7</span></h2>        
                                <section>
                                <div class="header kc-header">
                            <h2>
                                Current Banking Facilities (in rupees)<span>(वर्तमान बैंकिंग सुविधाएं (रुपए में))</span>:
                            </h2>
                               </div>
                        <div class="body kc-top">
                                <div class="row clearfix">
                                     <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                        <span class="kc-subhead">Types Of Facilities<span>(सुविधाओं का प्रकार)</span></span>
										<select class="form-control show-tick kc-select" name="Types_Of_Facilities">
											<option value="बचत खाता">Savings Account<span>(बचत खाता)</span></option>
											<option value="चालू खाता">Current Account<span>(चालू खाता)</span></option>
                                            <option value="CC लिमिट">CC Limit<span>(CC लिमिट)</span></option>
										</select>
                                    </div>
                                     <div class="col-lg-7 col-md-7 col-sm-7 col-xs-7">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="present_bank_banking_practices">
                                                <label class="form-label">Present Bank With You Have Banking Practices<span>(वर्तमान बैंक जिसके साथ बैंकिंग व्यवहार किया जा रहा हो)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <a class="btn bg-orange btn-circle waves-effect waves-circle waves-float" data-toggle="collapse" href="#currentBanking" role="button" aria-expanded="false" aria-controls="currentBanking"><i class="material-icons">add</i></a>
                                </div>
                                <div class="row clearfix collapse" id="currentBanking">
                                     <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="bank_branch">
                                                <label class="form-label">Bank Branch<span>(बैंक शाखा)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                     <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="current_Account_number">
                                                <label class="form-label">Account Number<span>(खाता सं:)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="date_of_account_opened">
                                                <label class="form-label">Date Of Account Opened<span>(खाता प्रारम्भ करने की तिथि)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="bank_balance">
                                                <label class="form-label">Bank Balance<span>(बैंक में जमा राशि)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                     <div class="col-lg-4 col-md-4 col-sm-4 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="total_employees">
                                                <label class="form-label">How Many Employees In Your Shop?<span>(आपके दूकान में कितने कर्मचारी हैं ?)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                        </div>
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
                        <div class="body kc-top">
                                <div class="row clearfix">
                                    <div class="col-lg-5 col-md-5 col-sm-5 col-xs-5">
                                        <span class="kc-subhead">Types Of Liabilities<span>(देनदारियों का प्रकार)</span></span>
										<select class="form-control show-tick kc-select" name="types_of_liabilities">
											<option value="बैंक 1">Bank 1<span>(बैंक 1)</span></option>
											<option value="बैंक 2">Bank 2<span>(बैंक 2)</span></option>
                                            <option value="प्राइवेट फाइनेंस कंपनी">Private Finance Company<span>(प्राइवेट फाइनेंस कंपनी)</span></option>
                                            <option value="रजिस्टर्ड NBFC/ NBFC MFI">Registered NBFC/ NBFC MF<span>(रजिस्टर्ड NBFC/ NBFC MFI)</span></option>
                                            <option value="सप्लायर">Supplier<span>(सप्लायर)</span></option>
                                            <option value="किसान क्रेडिट कार्ड">Kisan Credit Card<span>(किसान क्रेडिट कार्ड)</span></option>
                                            <option value="रिश्तेदार/ मित्र/ पड़ोसी">Relative/Friend/Neighbor<span>(रिश्तेदार/ मित्र/ पड़ोसी)</span></option>
                                            <option value="साहुकार">Financer<span>(साहुकार)</span></option>
                                            <option value="बैंक का क्रेडिट कार्ड">Bank Credit Card<span>(बैंक का क्रेडिट कार्ड)</span></option>
                                            <option value="अन्य स्रोत से ऋण">Loan From Other Sources<span>(अन्य स्रोत से ऋण)</span></option>
										</select>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="name_in_liabilities">
                                                <label class="form-label">Name<span>(नाम)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="objective_in_liabilities">
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
                                                <input type="text" class="form-control" name="original_loan_amount">
                                                <label class="form-label">Original Loan Amount<span>(मूल ऋण राशि)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="remaining_loan_amount">
                                                <label class="form-label">Remaining Loan Amount<span>(शेष ऋण राशि)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="loan_period">
                                                <label class="form-label">Period<span>(अवधि)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="rate_of_interest">
                                                <label class="form-label">Rate Of Interest<span>(ब्याज दर)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="start_date_of_loan">
                                                <label class="form-label">Start Date<span>(प्रारम्भ की तिथि)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="amount_of_installment">
                                                <label class="form-label">Amount Of Installment<span>(किश्त की राशि)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="installment_frequency">
                                                <label class="form-label">Installment frequency (Daily/Weekly/Monthly/Fortnightly)<span>(किश्त की आवृत्ति (दैनिक/साप्ताहिक/ मासिक/ पाक्षिक))</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="Securities_in_loan">
                                                <label class="form-label">Securities<span>(प्रतिभूति)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="pending_legal_proceedings">
                                                <label class="form-label">Any pending legal proceedings<span>(कोई अपूर्ण कानूनी कार्यवाही)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="informal_settlement">
                                                <label class="form-label">Any Informal Settlement Between Borrower And Lender<span>(कोई अनौपचारिक समझौता जो उधारकर्ता और ऋणदाता में हुआ हो)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="present_situation">
                                                <label class="form-label">Present Situation (Performing/Non-Performing)<span>(वर्तमान स्थिति(परफार्मिंग/नॉन परफार्मिंग))</span></label>
                                            </div>
                                        </div>
                                    </div>
                                </div>       
                        </div>
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
                                                <input type="text" class="form-control" name="sub_total_commercial_liabilities">
                                                <label class="form-label">Sub Total (Commercial Liabilities)<span>(उप कुल (व्यावसायिक देनदारियां))</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="sub_total_domestic_liabilities">
                                                <label class="form-label">Sub Total(Domestic Liabilities)<span>(उप कुल (घरेलु देनदारियां))</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="total_liabilities">
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
                                                <input type="text" class="form-control" name="professional_capacity">
                                                <label class="form-label">Professional Capacity<span>(व्यावसायिक हैसियत)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="domestic_capacity">
                                                <label class="form-label">Domestic Capacity<span>(घरेलु हैसियत)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="total_capacity">
                                                <label class="form-label">Total Capacity (v)=(iii)-(iv)<span>(कुल हैसियत (v)=(iii)-(iv))</span></label>
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
                                                <input type="text" class="form-control" name="rental_income">
                                                <label class="form-label">Rental income<span>(किराये से आमदनी)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="income_by_pension">
                                                <label class="form-label">Household Income Of Other Members By Pension<span>(घर के अन्य सदस्य के पेंशन से आमदनी)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row clearfix">
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="income_by_member_salaries">
                                                <label class="form-label">Household Income From Salaries Of Members<span>(घर के अन्य सदस्य के वेतन से आमदनी)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="farming_income">
                                                <label class="form-label">Farming Income<span>(खेती से आमदनी)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row clearfix">
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="Income_from_milk_products">
                                                <label class="form-label">Income From Milk Products<span>(दुग्ध उत्पाद से आमदनी)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="income_from_other_sources">
                                                <label class="form-label">Income From Any Other Source<span>(अन्य किसी स्रोत से आमदनी)</span></label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row clearfix">
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="form-group form-float">
                                            <div class="form-line">
                                                <input type="text" class="form-control" name="gross_domestic_income">
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