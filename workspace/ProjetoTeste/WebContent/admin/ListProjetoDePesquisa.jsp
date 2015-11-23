
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
<title>Administrative area: ProjetoDePesquisa</title>
</head>
<body>
<%@ include file="/admin/jspf/adminPrefix.jspf" %>

<mytaglib:showlist items="${allProjetoDePesquisas}"
                   titleList="generated.beans.ProjetoDePesquisa.list.title"
                   insertCaption="generated.beans.ProjetoDePesquisa.new"
                   notExistItemsMessage="generated.beans.ProjetoDePesquisa.empty"
                   titles="generated.beans.ProjetoDePesquisa.titulo.label,generated.beans.ProjetoDePesquisa.dataInicio.label,generated.beans.ProjetoDePesquisa.dataFim.label"
                   properties="titulo,*dataInicio,*dataFim"
                   sizes="100,0,0"
                   idProperty="projetoDePesquisaId"
                   idParameter="projetoDePesquisaId"
                   insertLink="generated.actions.ProjetoDePesquisaActions.loadProjetoDePesquisaForm.do"
                   deleteLink="generated.actions.ProjetoDePesquisaActions.deleteProjetoDePesquisa.do"
                   updateLink="generated.actions.ProjetoDePesquisaActions.loadProjetoDePesquisaForm.do"
                   viewLink="generated.actions.ProjetoDePesquisaActions.loadProjetoDePesquisaForm.do"
                   paging="5"
                   originLink="generated.actions.ProjetoDePesquisaActions.showAllProjetoDePesquisas.do"
                   highlight="true">
    <jsp:attribute name="specialEvaluation">
        <ctrl:if test="${specialPropertyName == 'dataInicio'}">
            ${f:formatSimpleDate(evaluatedItem.dataInicio)}
        </ctrl:if><ctrl:if test="${specialPropertyName == 'dataFim'}">
            ${f:formatSimpleDate(evaluatedItem.dataFim)}
        </ctrl:if>
    </jsp:attribute>
</mytaglib:showlist>

<%@ include file="/admin/jspf/adminSuffix.jspf" %>
</body>
</html>