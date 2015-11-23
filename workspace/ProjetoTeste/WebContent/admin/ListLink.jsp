
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
<title>Administrative area: Link</title>
</head>
<body>
<%@ include file="/admin/jspf/adminPrefix.jspf" %>

<mytaglib:showlist items="${allLinks}"
                   titleList="generated.beans.Link.list.title"
                   insertCaption="generated.beans.Link.new"
                   notExistItemsMessage="generated.beans.Link.empty"
                   titles="generated.beans.Link.titulo.label,generated.beans.Link.url.label"
                   properties="titulo,url"
                   sizes="100,255"
                   idProperty="linkId"
                   idParameter="linkId"
                   insertLink="generated.actions.LinkActions.loadLinkForm.do"
                   deleteLink="generated.actions.LinkActions.deleteLink.do"
                   updateLink="generated.actions.LinkActions.loadLinkForm.do"
                   viewLink="generated.actions.LinkActions.loadLinkForm.do"
                   paging="5"
                   originLink="generated.actions.LinkActions.showAllLinks.do"
                   highlight="true">
    <jsp:attribute name="specialEvaluation">
        
    </jsp:attribute>
</mytaglib:showlist>

<%@ include file="/admin/jspf/adminSuffix.jspf" %>
</body>
</html>