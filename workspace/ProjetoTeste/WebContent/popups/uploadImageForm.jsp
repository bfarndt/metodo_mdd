<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Upload image</title>
</head>
<body>
<form name="imageForm" action="core.actions.CommonActions.uploadImage.do" method="POST" enctype="multipart/form-data">
Current image:<br/> 
<img src="core.actions.CommonActions.showSessionImage.do?imageId=${param.imageId}" width="100" height="100" />
<br/>
<input
    type="file" name="image"
    accept="image/jpeg; image/gif; image/bmp; image/png" /> <br />
<input type="hidden" name="imageId" value="${param.imageId}" />
<input type="submit" />
</form>
</body>
</html>