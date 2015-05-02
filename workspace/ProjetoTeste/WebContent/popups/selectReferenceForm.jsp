<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ctrl"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/admin.css" />
<title>Selecione o departamento</title>
<script type="text/javascript">
	function select(openerFieldId, openerFieldSummaryId, selectedId, selectedSummary) {
		window.opener.document.getElementById(openerFieldId).value = selectedId;
		window.opener.document.getElementById(openerFieldSummaryId).value = selectedSummary;
		document.getElementById("selectedSummary").value = selectedSummary;
	}
</script>
</head>
<body>
<fmt:message key="${currentlySelectedMessageKey}" />:
<input type="text" id="selectedSummary" disabled="disabled"
	value="${param.selectedSummary}" />
<input type="button" value="<fmt:message key="closeButton" />" onclick="window.close();" />

<br />
<fmt:message key="${selectMessageKey}" />:
<br />
<ctrl:forEach items="${allElements}" var="element">
	<a href="#"
		onclick="select('${param.openerFieldId}','${param.openerFieldSummaryId}','${element.id}','${element.summary}');">${element.summary}</a>
	<br />
</ctrl:forEach>

</body>
</html>