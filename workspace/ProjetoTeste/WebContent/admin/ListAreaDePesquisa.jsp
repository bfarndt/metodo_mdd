
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
<title>Administrative area: AreaDePesquisa</title>
</head>
<body>
<%@ include file="/admin/jspf/adminPrefix.jspf" %>

<mytaglib:showlist items="${allAreaDePesquisas}"
                   titleList="generated.beans.AreaDePesquisa.list.title"
                   insertCaption="generated.beans.AreaDePesquisa.new"
                   notExistItemsMessage="generated.beans.AreaDePesquisa.empty"
                   titles="generated.beans.AreaDePesquisa.nome.label"
                   properties="nome"
                   sizes="100"
                   idProperty="areaDePesquisaId"
                   idParameter="areaDePesquisaId"
                   insertLink="generated.actions.AreaDePesquisaActions.loadAreaDePesquisaForm.do"
                   deleteLink="generated.actions.AreaDePesquisaActions.deleteAreaDePesquisa.do"
                   updateLink="generated.actions.AreaDePesquisaActions.loadAreaDePesquisaForm.do"
                   viewLink="generated.actions.AreaDePesquisaActions.loadAreaDePesquisaForm.do"
                   paging="5"
                   originLink="generated.actions.AreaDePesquisaActions.showAllAreaDePesquisas.do"
                   highlight="true">
    <jsp:attribute name="specialEvaluation">
        
    </jsp:attribute>
</mytaglib:showlist>

<%@ include file="/admin/jspf/adminSuffix.jspf" %>
</body>
</html>