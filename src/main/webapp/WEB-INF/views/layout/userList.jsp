<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%--@ taglib uri="/WEB-INF/tlds/fmt.tld" prefix="fmt" --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<body>
    <div class="generic-container">
        <div class="panel panel-default">
              <!-- Default panel contents -->
            <div class="panel-heading"><span class="lead">List of Users </span></div>
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>Firstname</th>
                        <th>Lastname</th>
                        <th>Email</th>
						<th >Date</th>
                        <th >xxxx</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach items="${leadList}" var="lead">
                    <tr>
                        <td>${lead.firstName}</td>
                        <td>${lead.lastName}</td>
                        <td>${lead.mobileNumber}</td>
						<td>${lead.createDate}</td>
                       
                       
                        <td><a href="<c:url value='/edit-user-${lead.id}' />" class="btn btn-success 
 
custom-width">edit</a></td>
                        <td><a href="<c:url value='/delete-user-${user.mobileNumber}' />" class="btn btn-danger 
 
custom-width">delete</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
        <div class="well">
            <a href="<c:url value='/newuser' />">Add New User</a>
        </div>
    </div>
