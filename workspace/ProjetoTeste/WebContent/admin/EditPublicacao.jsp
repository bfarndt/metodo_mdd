
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
<title>Administrative area: Publicacao</title>
</head>
<body>
<%@ include file="/admin/jspf/adminPrefix.jspf" %>

<form action="generated.actions.PublicacaoActions.savePublicacao.do" method="POST">
<input type="hidden" name="publicacaoId" value="${publicacao.publicacaoId}" />

    
    	
            <fmt:message key="generated.beans.Publicacao.autores.label" />:
            
            
                <br/>
                <textarea name="autores" cols="50" rows="5">${publicacao.autores}</textarea><br/>
            
        
        
        
        
        
    

    
    	
            <fmt:message key="generated.beans.Publicacao.local.label" />:
            
            
                <br/>
                <textarea name="local" cols="50" rows="5">${publicacao.local}</textarea><br/>
            
        
        
        
        
        
    

    
    	
            <fmt:message key="generated.beans.Publicacao.data.label" />:
            
                <input type="text"
    	            name="data"
                    
                    
                    
                        size="50"
	               
    	               value="${publicacao.data}" /><br/>
            
            
        
        
        
        
        
    



<fmt:message key="generated.beans.Publicacao.area.label" />:
<input type="hidden" name="area" id="area"
    value="${publicacao.area.areaDePesquisaId}" /> 
<input type="text"
    id="areaSummary"
    
    size="10"
    
    
        size="0"
    
    
    disabled="disabled" value="${publicacao.area.summary}" /> <input
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