
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
<title>Administrative area: Suporte</title>
</head>
<body>
<%@ include file="/admin/jspf/adminPrefix.jspf" %>

<form action="generated.actions.SuporteActions.saveSuporte.do" method="POST">
<input type="hidden" name="suporteId" value="${suporte.suporteId}" />

    
    	
            <fmt:message key="generated.beans.Suporte.agencia.label" />:
            
                <input type="text"
    	            name="agencia"
                    
                    
                    
                        size="50"
	               
    	               value="${suporte.agencia}" /><br/>
            
            
        
        
        
        
        
    

    
    	
        
        
        
        
            <fmt:message key="generated.beans.Suporte.icone.label" />:
            <br/>
            <img id="Suporteicone"
                src="core.actions.CommonActions.showSessionImage.do?imageId=Suporteicone"
                width="100" height="100" />
            <br/>
            <input type="button" value="<fmt:message key="selectButton" />" onclick="popup('popups/uploadImageForm.jsp?imageId=Suporteicone')" /><br/>
        
    

    



    <br/>
    <input type="submit" value="<fmt:message key="saveButton" />" />
</form> 

<%@ include file="/admin/jspf/adminSuffix.jspf" %>

</body>
</html>