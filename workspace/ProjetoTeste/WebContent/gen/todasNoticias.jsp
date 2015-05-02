
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="generated.beans.*"%>
<%@page import="generated.daos.*"%>
<%@page import="java.util.*"%>
<%@page import="core.database.*"%>

<%@page import="generated.usercontent.*"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../css/navigation.css" />
<title>Todas not&iacute;cias</title>
<script type="text/javascript" src="../js/util.js"></script>
</head>
<body>

<table class="navMainTable">
<tr><td class="navTopArea" colspan="3">
<!-- begin top -->

	
	 
	
<% { %>

	
		Notícias
	 
	 
	
	
	Text
<% } %>

<!-- end top -->
</td></tr>
<tr><td class="navLeftArea">
<!-- begin left -->

	
	
	
<% { %>

	 
	
			
			
				
				<a href="index.jsp">principal</a>
				<br/>
				<a href="verApoio.jsp">apoio</a>
				<br/>
				<a href="todasNoticias.jsp">noticias</a>
				<br/>
				<a href="projetos.jsp">projetos</a>
				<br/>
				<a href="colegas.jsp">colegas</a>
				<br/>
				<a href="linksInteressantes.jsp">links</a>
				
			
		<br/>
	 
	
	
	
<% } %>

<!-- end left -->
</td>
<td class="navMainArea">
<!-- begin main -->

	
	
	
<% { %>

<div class="componentTitle">Todas not&iacute;cias:</div>

	 
	 
	
		<%
		NoticiaDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getNoticiaDAO();
		List<Noticia> listNoticia = dao.getAllNoticias();
		
		for(Noticia aNoticia : listNoticia) {
		
		%>
		<div class="summaryItem">
		<span class="summaryTitle">
		
			<a href="verNoticia.jsp?idParameter=<%=aNoticia.getNoticiaId()%>&entityName=Noticia" class="summaryTitle">
		
		
		<%=aNoticia.getTitulo()%>
		
			</a>
		
		</span><br/>
		
			<span class="summaryField">
			
				<a href="verNoticia.jsp?idParameter=<%=aNoticia.getNoticiaId()%>&entityName=Noticia" class="summaryField">
			
			
			<%=aNoticia.getResumo()%>
			
				</a>
			
			</span><br/>
		
		</div>
		<% } %>
	
	
	
	
<% } %>

<!-- end main -->
</td>
<td class="navRightArea">
<!-- begin right -->

<!-- end right -->
</td></tr>
<tr><td class="navBottomArea" colspan="3">
<!-- begin bottom -->

	
	
	
<% { %>

	
		Página de Fulano de tal. 2009
	 
	 
	
	
	Text
<% } %>

<!-- end bottom -->
</td></tr>
</table>

</body>
</html>