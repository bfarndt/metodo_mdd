
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
<title>Administrative area: Link</title>
</head>
<body>
<%@ include file="/admin/jspf/adminPrefix.jspf" %>

<form action="generated.actions.LinkActions.saveLink.do" method="POST">
<input type="hidden" name="linkId" value="${link.linkId}" />

    
    	
            <fmt:message key="generated.beans.Link.titulo.label" />:
            
                <input type="text"
    	            name="titulo"
                    
                    
                    
                        size="50"
	               
    	               value="${link.titulo}" /><br/>
            
            
        
        
        
        
        
    

    
    	
            <fmt:message key="generated.beans.Link.url.label" />:
            
            
                <br/>
                <textarea name="url" cols="50" rows="5">${link.url}</textarea><br/>
            
        
        
        
        
        
    



    <br/>
    <input type="submit" value="<fmt:message key="saveButton" />" />
</form> 

<%@ include file="/admin/jspf/adminSuffix.jspf" %>

</body>
</html>