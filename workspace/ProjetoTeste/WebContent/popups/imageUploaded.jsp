<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/admin.css" />
<title>Produto</title>
</head>
<body>
<center>
<br/><br/><br/><br/>
<fmt:message key="${message}" />
<br/><br/><br/><br/>
<input type="button" value="<fmt:message key="closeButton" />" onclick="window.close();window.opener.reloadImage('${imageUploaded}');" />
</center>
</body>
</html>