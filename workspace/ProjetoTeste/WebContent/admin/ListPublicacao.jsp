
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
<title>Administrative area: Publicacao</title>
</head>
<body>
<%@ include file="/admin/jspf/adminPrefix.jspf" %>

<mytaglib:showlist items="${allPublicacaos}"
                   titleList="generated.beans.Publicacao.list.title"
                   insertCaption="generated.beans.Publicacao.new"
                   notExistItemsMessage="generated.beans.Publicacao.empty"
                   titles="generated.beans.Publicacao.autores.label,generated.beans.Publicacao.local.label"
                   properties="autores,local"
                   sizes="255,255"
                   idProperty="publicacaoId"
                   idParameter="publicacaoId"
                   insertLink="generated.actions.PublicacaoActions.loadPublicacaoForm.do"
                   deleteLink="generated.actions.PublicacaoActions.deletePublicacao.do"
                   updateLink="generated.actions.PublicacaoActions.loadPublicacaoForm.do"
                   viewLink="generated.actions.PublicacaoActions.loadPublicacaoForm.do"
                   paging="5"
                   originLink="generated.actions.PublicacaoActions.showAllPublicacaos.do"
                   highlight="true">
    <jsp:attribute name="specialEvaluation">
        
    </jsp:attribute>
</mytaglib:showlist>

<%@ include file="/admin/jspf/adminSuffix.jspf" %>
</body>
</html>