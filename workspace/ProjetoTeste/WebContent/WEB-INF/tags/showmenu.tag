<%@tag description="put the tag description here" pageEncoding="UTF-8"%>

<%-- Taglib directives can be specified here: --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ attribute name="items" required="true" type="java.util.Collection"%>
<%@ attribute name="nameField" required="true"%>
<%@ attribute name="link" required="true"%>
<%@ attribute name="idProperty" required="true"%>

<%
	for (Object item : items) {
		String propertyValue = org.apache.commons.beanutils.BeanUtils
				.getProperty(item, nameField);
		String idPropertyValue = org.apache.commons.beanutils.BeanUtils
				.getProperty(item, idProperty);
%>
<a href="<%=link%>?<%=idProperty%>=<%=idPropertyValue%>"><%=propertyValue%></a>
<br />
<%
	}
%>
