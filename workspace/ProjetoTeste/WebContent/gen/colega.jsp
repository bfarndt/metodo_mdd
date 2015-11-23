
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
<title>Colega</title>
<script type="text/javascript" src="../js/util.js"></script>
</head>
<body>

<table class="navMainTable">
<tr><td class="navTopArea" colspan="3">
<!-- begin top -->

	
	 
	
<% { %>

	 
	
			
				
				<a href="index.jsp">principal</a>
				|
				<a href="verApoio.jsp">apoio</a>
				|
				<a href="todasNoticias.jsp">noticias</a>
				|
				<a href="projetos.jsp">projetos</a>
				|
				<a href="colegas.jsp">colegas</a>
				|
				<a href="linksInteressantes.jsp">links</a>
				
			
			
		<br/>
	 
	
	
	
<% } %>

<!-- end top -->
</td></tr>
<tr><td class="navLeftArea">
<!-- begin left -->

<!-- end left -->
</td>
<td class="navMainArea">
<!-- begin main -->

	
	
	
<% { %>

	 
	 
	
	
		<% long idParameter = Long.parseLong(request.getParameter("idParameter"));
		ColegaDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getColegaDAO();
		Colega aColega = dao.getColega(idParameter);
		if(aColega != null) {
			
				
			
				
			
		%>

		
			Nome: <%=aColega.getNome()%><br/>

		
			Homepage: <%=aColega.getHomepage()%><br/>

		

		<% } %>

		
			
<!-- begin userContent area -->
<% { %>
<hr>
<div class="userContentTitle">Comentarios de usuarios:</div>
<% UserContentDAO daoUserContent = DefaultUserContentDAOFactoryProvider.getDefaultDAOFactoryInstance().getUserContentDAO();
   List<UserContent> allUserContent = daoUserContent.getAllUserContent(request.getParameter("entityName"), Long.parseLong(request.getParameter("idParameter")));
   for(UserContent uc: allUserContent) {
%>
<div class="userContent">
<span class="userContentDate"><%=new java.text.SimpleDateFormat("dd/MM/yyyy - hh:mm:ss").format(uc.getDate())%></span>
<span class="userContentName"><%=uc.getName()%></span> <br/>
<div class="userContentTextTitle"><%=uc.getTitle()%></div>
<div class="userContentText"><%=uc.getContent()%></div>
</div>
<% } %>
<br/>
<input type="button" value="Enviar comentario" onclick="popup('uploadUserCommentForm.jsp?entityName=<%=request.getParameter("entityName")%>&entityId=<%=request.getParameter("idParameter")%>',300,400)" /><br/>
<% } %>
<!-- end userContent area -->
		

		
			<div class="componentLink"><a href="colegas.jsp">Ver todos colegas</a></div>
		
	
	
<% } %>

<!-- end main -->
</td>
<td class="navRightArea">
<!-- begin right -->

<!-- end right -->
</td></tr>
<tr><td class="navBottomArea" colspan="3">
<!-- begin bottom -->

<!-- end bottom -->
</td></tr>
</table>

</body>
</html>