
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/WEB-INF/tags/myfunctions.tld" prefix="f"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/admin.css" />
<link rel="stylesheet" type="text/css" href="css/listStyle/listStyle.css" />
<link rel="stylesheet" type="text/css" href="css/datechooser.css" />
<script type="text/javascript" src="js/datechooserPor.js"></script>
<script type="text/javascript" src="js/util.js"></script>
<title>Administrative area: ProjetoDePesquisa</title>
</head>
<body>
<%@ include file="/admin/jspf/adminPrefix.jspf" %>

<form action="generated.actions.ProjetoDePesquisaActions.saveProjetoDePesquisa.do" method="POST">
<input type="hidden" name="projetoDePesquisaId" value="${projetoDePesquisa.projetoDePesquisaId}" />

    
    	
            <fmt:message key="generated.beans.ProjetoDePesquisa.titulo.label" />:
            
                <input type="text"
    	            name="titulo"
                    
                    
                    
                        size="50"
	               
    	               value="${projetoDePesquisa.titulo}" /><br/>
            
            
        
        
        
        
        
    

    
    	
            <fmt:message key="generated.beans.ProjetoDePesquisa.descricao.label" />:
            
            
                <br/>
                <textarea name="descricao" cols="50" rows="5">${projetoDePesquisa.descricao}</textarea><br/>
            
        
        
        
        
        
    

    
    	
        
        
        
            <fmt:message key="generated.beans.ProjetoDePesquisa.dataInicio.label" />:
            <input id="datechooserdataInicio"
						 class="datechooser dc-dateformat='j/n/Y' dc-iconlink='${contextPath}css/datechooser.png'"
						 type="text"
						 name="dataInicio"
						 value="${f:formatSimpleDate(projetoDePesquisa.dataInicio)}" /><br/>
        
        
    

    
    	
        
        
        
            <fmt:message key="generated.beans.ProjetoDePesquisa.dataFim.label" />:
            <input id="datechooserdataFim"
						 class="datechooser dc-dateformat='j/n/Y' dc-iconlink='${contextPath}css/datechooser.png'"
						 type="text"
						 name="dataFim"
						 value="${f:formatSimpleDate(projetoDePesquisa.dataFim)}" /><br/>
        
        
    



<fmt:message key="generated.beans.ProjetoDePesquisa.apoio.label" />:
<input type="hidden" name="apoio" id="apoio"
    value="${projetoDePesquisa.apoio.suporteId}" /> 
<input type="text"
    id="apoioSummary"
    
    size="10"
    
    
        size="0"
    
    
    disabled="disabled" value="${projetoDePesquisa.apoio.summary}" /> <input
    type="button" value="<fmt:message key="selectButton" />"
    onclick="popup('generated.actions.SuporteActions.showAllSuportesForSelection.do' +
                   '?selectedSummary='+document.getElementById('apoioSummary').value +
                   '&openerFieldId=apoio' +
                   '&openerFieldSummaryId=apoioSummary');" />
<br />

<fmt:message key="generated.beans.ProjetoDePesquisa.area.label" />:
<input type="hidden" name="area" id="area"
    value="${projetoDePesquisa.area.areaDePesquisaId}" /> 
<input type="text"
    id="areaSummary"
    
    size="10"
    
    
        size="0"
    
    
    disabled="disabled" value="${projetoDePesquisa.area.summary}" /> <input
    type="button" value="<fmt:message key="selectButton" />"
    onclick="popup('generated.actions.AreaDePesquisaActions.showAllAreaDePesquisasForSelection.do' +
                   '?selectedSummary='+document.getElementById('areaSummary').value +
                   '&openerFieldId=area' +
                   '&openerFieldSummaryId=areaSummary');" />
<br />

    <br/>
    <input type="submit" value="<fmt:message key="saveButton" />" />
</form> 

<%@ include file="/admin/jspf/adminSuffix.jspf" %>

</body>
</html>