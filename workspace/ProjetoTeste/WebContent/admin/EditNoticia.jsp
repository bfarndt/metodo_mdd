
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
<title>Administrative area: Noticia</title>
</head>
<body>
<%@ include file="/admin/jspf/adminPrefix.jspf" %>

<form action="generated.actions.NoticiaActions.saveNoticia.do" method="POST">
<input type="hidden" name="noticiaId" value="${noticia.noticiaId}" />

    
    	
            <fmt:message key="generated.beans.Noticia.titulo.label" />:
            
                <input type="text"
    	            name="titulo"
                    
                    
                    
                        size="50"
	               
    	               value="${noticia.titulo}" /><br/>
            
            
        
        
        
        
        
    

    
    	
            <fmt:message key="generated.beans.Noticia.resumo.label" />:
            
            
                <br/>
                <textarea name="resumo" cols="50" rows="5">${noticia.resumo}</textarea><br/>
            
        
        
        
        
        
    

    
    	
            <fmt:message key="generated.beans.Noticia.conteudo.label" />:
            
            
                <br/>
                <textarea name="conteudo" cols="50" rows="5">${noticia.conteudo}</textarea><br/>
            
        
        
        
        
        
    

    
    	
        
        
        
        
            <fmt:message key="generated.beans.Noticia.imagem.label" />:
            <br/>
            <img id="Noticiaimagem"
                src="core.actions.CommonActions.showSessionImage.do?imageId=Noticiaimagem"
                width="100" height="100" />
            <br/>
            <input type="button" value="<fmt:message key="selectButton" />" onclick="popup('popups/uploadImageForm.jsp?imageId=Noticiaimagem')" /><br/>
        
    

    
    	
        
        
        
            <fmt:message key="generated.beans.Noticia.data.label" />:
            <input id="datechooserdata"
						 class="datechooser dc-dateformat='j/n/Y' dc-iconlink='${contextPath}css/datechooser.png'"
						 type="text"
						 name="data"
						 value="${f:formatSimpleDate(noticia.data)}" /><br/>
        
        
    

    



    <br/>
    <input type="submit" value="<fmt:message key="saveButton" />" />
</form> 

<%@ include file="/admin/jspf/adminSuffix.jspf" %>

</body>
</html>