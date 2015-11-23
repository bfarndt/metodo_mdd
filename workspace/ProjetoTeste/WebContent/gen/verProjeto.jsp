
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
<title>Projeto de pesquisa</title>
<script type="text/javascript" src="../js/util.js"></script>
</head>
<body>

<table class="navMainTable">
<tr><td class="navTopArea" colspan="3">
<!-- begin top -->

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

	 
	 
	
	
		<% long idParameter = Long.parseLong(request.getParameter("idParameter"));
		ProjetoDePesquisaDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getProjetoDePesquisaDAO();
		ProjetoDePesquisa aProjetoDePesquisa = dao.getProjetoDePesquisa(idParameter);
		if(aProjetoDePesquisa != null) {
			
				
			
				
			
				
			
				
			
				
			
				
			
		%>

		
			Título: <%=aProjetoDePesquisa.getTitulo()%><br/>

		
			Descrição: <%=aProjetoDePesquisa.getDescricao()%><br/>

		
			Vigência: <%=new java.text.SimpleDateFormat("dd/MM/yyyy").format(aProjetoDePesquisa.getDataInicio())%> a <%=new java.text.SimpleDateFormat("dd/MM/yyyy").format(aProjetoDePesquisa.getDataFim())%><br/>

		
			Apoio financeiro: <%=aProjetoDePesquisa.getApoio().getSummary()%><br/>

		
			Área de interesse: <%=aProjetoDePesquisa.getArea().getSummary()%><br/>

		

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
		

		
			<div class="componentLink"><a href="projetos.jsp">Ver todos projetos</a></div>
		
	
	
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