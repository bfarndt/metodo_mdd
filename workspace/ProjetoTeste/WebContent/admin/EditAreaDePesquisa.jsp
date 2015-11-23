
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
<title>Administrative area: AreaDePesquisa</title>
</head>
<body>
<%@ include file="/admin/jspf/adminPrefix.jspf" %>

<form action="generated.actions.AreaDePesquisaActions.saveAreaDePesquisa.do" method="POST">
<input type="hidden" name="areaDePesquisaId" value="${areaDePesquisa.areaDePesquisaId}" />

    
    	
            <fmt:message key="generated.beans.AreaDePesquisa.nome.label" />:
            
                <input type="text"
    	            name="nome"
                    
                    
                    
                        size="50"
	               
    	               value="${areaDePesquisa.nome}" /><br/>
            
            
        
        
        
        
        
    

    
    	
            <fmt:message key="generated.beans.AreaDePesquisa.descricao.label" />:
            
            
                <br/>
                <textarea name="descricao" cols="50" rows="5">${areaDePesquisa.descricao}</textarea><br/>
            
        
        
        
        
        
    



    <br/>
    <input type="submit" value="<fmt:message key="saveButton" />" />
</form> 

<%@ include file="/admin/jspf/adminSuffix.jspf" %>

</body>
</html>