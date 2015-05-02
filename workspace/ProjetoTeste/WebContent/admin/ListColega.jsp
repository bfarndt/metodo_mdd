
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
<title>Administrative area: Colega</title>
</head>
<body>
<%@ include file="/admin/jspf/adminPrefix.jspf" %>

<mytaglib:showlist items="${allColegas}"
                   titleList="generated.beans.Colega.list.title"
                   insertCaption="generated.beans.Colega.new"
                   notExistItemsMessage="generated.beans.Colega.empty"
                   titles="generated.beans.Colega.nome.label"
                   properties="nome"
                   sizes="35"
                   idProperty="colegaId"
                   idParameter="colegaId"
                   insertLink="generated.actions.ColegaActions.loadColegaForm.do"
                   deleteLink="generated.actions.ColegaActions.deleteColega.do"
                   updateLink="generated.actions.ColegaActions.loadColegaForm.do"
                   viewLink="generated.actions.ColegaActions.loadColegaForm.do"
                   paging="5"
                   originLink="generated.actions.ColegaActions.showAllColegas.do"
                   highlight="true">
    <jsp:attribute name="specialEvaluation">
        
    </jsp:attribute>
</mytaglib:showlist>

<%@ include file="/admin/jspf/adminSuffix.jspf" %>
</body>
</html>