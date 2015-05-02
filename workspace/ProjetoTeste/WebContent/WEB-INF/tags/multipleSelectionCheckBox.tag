<%@tag description="Multiple Selection CheckBox" pageEncoding="UTF-8"%>

<%-- Taglib directives can be specified here: --%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="/WEB-INF/tags/myfunctions" prefix="myfunctions"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="set" required="true" type="java.util.Collection"%>
<%@attribute name="selected" required="true" type="java.util.Collection"%>
<%@attribute name="idProperty" required="true"%>
<%@attribute name="displayProperty" required="true"%>
<%@attribute name="fieldName" required="true"%>
<%
for(Object anElementFromSet:set) {
    String idValue = org.apache.commons.beanutils.BeanUtils.getProperty(anElementFromSet,idProperty);
    String displayValue = org.apache.commons.beanutils.BeanUtils.getProperty(anElementFromSet,displayProperty);
%>        
    <input type="checkbox" name="<%=fieldName%>" value="<%=idValue%>" 
<%
    if(core.helpers.CollectionHelper.belongsTo(selected,anElementFromSet)) {
%>
               checked
<% } %>
           /><%=displayValue%><br/>
<% } %>