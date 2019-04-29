<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%--@ taglib uri="/WEB-INF/tlds/fmt.tld" prefix="fmt" --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>

<meta http-equiv='Content-Type' content='text/html; charset=UTF-8' />
<tiles:insertAttribute name="header" />
<!-- header -->
<body class="theme-amber">			
	<!-- mini header -->
	<tiles:insertAttribute name="miniheader" />
	<!-- MENU SIDEBAR-->
	<tiles:insertAttribute name="sidebar" />
	<!-- END MENU SIDEBAR-->
	<!-- main body -->
	<tiles:insertAttribute name="body" />            
	<!-- FOOTER -->
	<tiles:insertAttribute name="footer" />