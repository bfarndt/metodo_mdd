
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ctrl"%>  
<%@ taglib uri="/WEB-INF/tags/mytaglib.tld" prefix="mytaglib"%>
<%@ taglib uri="/WEB-INF/tags/myfunctions.tld" prefix="f"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/admin.css" />
<link rel="stylesheet" type="text/css" href="css/listStyle/listStyle.css" />
<title>Administrative area: Suporte</title>
</head>
<body>
<%@ include file="/admin/jspf/adminPrefix.jspf" %>

<mytaglib:showlist items="${allSuportes}"
                   titleList="generated.beans.Suporte.list.title"
                   insertCaption="generated.beans.Suporte.new"
                   notExistItemsMessage="generated.beans.Suporte.empty"
                   titles="generated.beans.Suporte.agencia.label"
                   properties="agencia"
                   sizes="100"
                   idProperty="suporteId"
                   idParameter="suporteId"
                   insertLink="generated.actions.SuporteActions.loadSuporteForm.do"
                   deleteLink="generated.actions.SuporteActions.deleteSuporte.do"
                   updateLink="generated.actions.SuporteActions.loadSuporteForm.do"
                   viewLink="generated.actions.SuporteActions.loadSuporteForm.do"
                   paging="5"
                   originLink="generated.actions.SuporteActions.showAllSuportes.do"
                   highlight="true">
    <jsp:attribute name="specialEvaluation">
        
    </jsp:attribute>
</mytaglib:showlist>

<%@ include file="/admin/jspf/adminSuffix.jspf" %>
</body>
</html>