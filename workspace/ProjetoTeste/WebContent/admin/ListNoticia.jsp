
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
<title>Administrative area: Noticia</title>
</head>
<body>
<%@ include file="/admin/jspf/adminPrefix.jspf" %>

<mytaglib:showlist items="${allNoticias}"
                   titleList="generated.beans.Noticia.list.title"
                   insertCaption="generated.beans.Noticia.new"
                   notExistItemsMessage="generated.beans.Noticia.empty"
                   titles="generated.beans.Noticia.titulo.label,generated.beans.Noticia.data.label"
                   properties="titulo,*data"
                   sizes="100,0"
                   idProperty="noticiaId"
                   idParameter="noticiaId"
                   insertLink="generated.actions.NoticiaActions.loadNoticiaForm.do"
                   deleteLink="generated.actions.NoticiaActions.deleteNoticia.do"
                   updateLink="generated.actions.NoticiaActions.loadNoticiaForm.do"
                   viewLink="generated.actions.NoticiaActions.loadNoticiaForm.do"
                   paging="5"
                   originLink="generated.actions.NoticiaActions.showAllNoticias.do"
                   highlight="true">
    <jsp:attribute name="specialEvaluation">
        <ctrl:if test="${specialPropertyName == 'data'}">
            ${f:formatSimpleDate(evaluatedItem.data)}
        </ctrl:if>
    </jsp:attribute>
</mytaglib:showlist>

<%@ include file="/admin/jspf/adminSuffix.jspf" %>
</body>
</html>