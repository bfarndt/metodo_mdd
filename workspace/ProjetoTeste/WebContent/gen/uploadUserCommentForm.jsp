
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../css/navigation.css" />
<title>Coment&aacute;rio</title>


</head>
<body>
<form name="imageForm" action="generated.usercontent.UserContentActions.uploadUserContent.do">
<input type="hidden" name="entityName" value="${param.entityName}" />
<input type="hidden" name="entityId" value="${param.entityId}" />
Nome: <input type="text" name="name" size="40" /><br/>
E-mail: <input type="text" name="email" size="40" /><br/>
Assunto: <input type="text" name="title" size="40" /><br/>
Coment&aacute;rio: 
<textarea name="content" cols="32" rows="5"></textarea><br/>
<input value="Enviar" type="submit" />

<span class="userContentWarning">Aviso: o comentario so sera publicado apos aprovacao do moderador!</span>

</form>
</body>
</html>