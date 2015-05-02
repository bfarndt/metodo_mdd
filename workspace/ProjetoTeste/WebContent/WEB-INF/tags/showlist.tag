<%@tag description="put the tag description here" pageEncoding="UTF-8"%>

<%-- Taglib directives can be specified here: --%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ attribute name="items" required="true" type="java.util.Collection"%>
<%@ attribute name="titles" %>
<%@ attribute name="titleList" %>
<%@ attribute name="properties" required="true" %>
<%@ attribute name="sizes" %>
<%@ attribute name="idProperty" %>
<%@ attribute name="idParameter" %>
<%@ attribute name="viewLink" %>
<%@ attribute name="insertLink" %>
<%@ attribute name="insertCaption" %>
<%@ attribute name="updateLink" %>
<%@ attribute name="deleteLink" %>
<%@ attribute name="originLink" %>
<%@ attribute name="notExistItemsMessage" %>
<%@ attribute name="highlight" %>
<%@ attribute name="paging" %>
<%@ attribute name="specialEvaluation" fragment="true" %>

<%@ variable name-given="specialPropertyName" %> 
<%@ variable name-given="evaluatedItem" variable-class="java.lang.Object" %>

<% if(titleList != null && titleList.trim().length() >0) { %>

<table width="100%" border="0" align="center" cellpadding="6" cellspacing="0">
    <tr>
        <td><div align="center"><span class="listTitle"><fmt:message key="<%=titleList%>" /></span></div></td>
    </tr>
</table>				
<br>
<% }
if ((insertCaption != null) && (insertLink != null) &&
        (insertCaption.trim().length() > 0) && (insertLink.trim().length() > 0)){%>
<table width="100%" border="0" align="center" cellpadding="2" cellspacing="0">
    <tr><td width="100%" align="right"><a href="<%=insertLink%>" class="insertLink">[<fmt:message key="<%=insertCaption%>" />]</a></td><tr>
</table>
<%
}
if(items == null || items.isEmpty()){
    if(notExistItemsMessage != null){
%>
<table width="100%" border="0" align="center" cellpadding="6" cellspacing="0">
    <tr>
        <td><div align="center"><span class="emptyMessage"><fmt:message key="<%=notExistItemsMessage%>" /></span></div></td>
    </tr>
</table>													
<%
    }else{%>
<table width="100%" border="0" align="center" cellpadding="6" cellspacing="0">
    <tr>
        <td><div align="center"><span class="emptyMessage">Nenhum item foi encontrado!</span></div></td>
    </tr>
</table>														
<%	
    }
}else{
    java.util.StringTokenizer st;
    java.util.Vector titlesVector = new java.util.Vector();
    if ((titles != null) && (!titles.equals(""))){
        st = new java.util.StringTokenizer(titles, ",");
        while(st.hasMoreTokens())
            titlesVector.add(st.nextToken());
    }else{
        titlesVector = null;
    }
    java.util.Vector sizesVector = new java.util.Vector();
    if (sizes != null){
        st = new java.util.StringTokenizer(sizes, ",");
        while(st.hasMoreTokens())
            sizesVector.add(st.nextToken());
    }else{
        sizesVector = null;
    }
    java.util.Vector propertiesVector = new java.util.Vector();
    st = new java.util.StringTokenizer(properties, ",");
    while(st.hasMoreTokens())
        propertiesVector.add(st.nextToken());
    
// CONTROLE DE PAGINACAO
    int pageSize = 0;
    int numPages = 0;
    int cPage = 0;
    if (paging != null){
        pageSize = Integer.parseInt(paging);
        numPages = ((items.size()-1)/pageSize)+1;
    }else{
        pageSize = items.size();
        numPages = 1;
    }
    String currentPage = request.getParameter("currentPage");
    if ((currentPage != null) && (!currentPage.equals("0"))  && (!currentPage.equals(""))){
        cPage = Integer.parseInt(currentPage);
    }else{
        cPage = 1;
    }
// INTERROMPENDO O CONTROLE DE PAGINACAO
    
// CALCULANDO A PAGINA CORRENTE CASO O PARAMETRO goToItem SEJA DIFERENTE DE null
    java.util.Vector iItems = new java.util.Vector(items);
    String strGoToItem = request.getParameter("goToItem");
    int curPage = 0;
    int positionElement = -1;
    if (strGoToItem != null){
        for(int t=0;t<iItems.size();t++){
            java.lang.Object item = iItems.elementAt(t);
            String propId = org.apache.commons.beanutils.BeanUtils.getProperty(item,idProperty);
            if (propId.equals(strGoToItem)){
                positionElement = t;
                curPage = (int)(t/pageSize)+1;
                if ((currentPage == null) || (cPage == curPage))
                    cPage = curPage;
            }
        }
    }
// FIM DO CALCULO
    
// CONTINUACAO DO CONTROLE DE PAGINACAO
    int firstPage=0;
    int previousPage=0;
    int nextPage=0;
    int lastPage=0;
    if ((cPage==1) && (numPages==1)){
        firstPage=0;
        previousPage=0;
        nextPage=0;
        lastPage=0;
    }else if ((cPage==1) && (numPages>1)){
        firstPage=0;
        previousPage=0;
        nextPage=cPage+1;
        lastPage=numPages;
    }else if ((cPage>1) && (cPage<numPages)){
        firstPage=1;
        previousPage=cPage-1;
        nextPage=cPage+1;
        lastPage=numPages;
    }else if ((cPage>1) && (cPage==numPages)){
        firstPage=1;
        previousPage=cPage-1;
        nextPage=0;
        lastPage=0;
    }
// FIM DO CONTROLE DE PAGINACAO

%>
<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" class="mainListTable">
    <tr class="listTitleRow">
        <td width="8" class="listTitleCell">&nbsp;</td>
        <% 
        if((titlesVector != null) && (sizesVector != null)){
            if((titlesVector.size() == sizesVector.size()) && (titlesVector.size() == propertiesVector.size())){
                for(int i=0;i<titlesVector.size();i++){
                    String size = (String)sizesVector.get(i);
                    String title = (String)titlesVector.get(i);
                    String width="";
                    String align="align=\"left\"";
                    if(!size.equals("0")){
                        width=" width=\""+size+"\"";
                        align="align=\"center\"";
                    }
        %>
        <td <%=align%> class="listTitleCell" <%=width%>><fmt:message key="<%=title%>" /></td>
        <%
                    if(i!=(titlesVector.size()-1)){ %>
        <td width="8" class="listTitleCell" align="center">|</td>
        <%
                    }
                }
                if ((updateLink != null) || (deleteLink != null)){
        %>
        <td width="8" class="listTitleCell" align="center">|</td>
        <td class="listTitleCellEditUpdateCell">&nbsp;</td>
        <%
                }
            }
        }
        %>
        <td width="8" class="listTitleCell">&nbsp;</td>
    </tr>
    <%
    //iItems = new java.util.Vector(items);
    int startItem = (cPage-1)*pageSize;
    for(int t=0;(t<pageSize) && (t<(iItems.size()-startItem));t++){
        java.lang.Object item = iItems.elementAt(startItem+t);
        jspContext.setAttribute("evaluatedItem", item);
        
        int countWriteTr = 0;
        for(int i=0;i<propertiesVector.size();i++) {
            String size="0";
            if(sizesVector != null)
                size = (String)sizesVector.get(i);
            String property = (String)propertiesVector.get(i);
            boolean isSpecial = false;
            if(property.startsWith("*")){
                property = property.substring(1);
                isSpecial = true;
            }
            String width="";
            String align="align=\"left\"";
            if(!size.equals("0")) {
                width=" width=\""+size+"\"";
                align="align=\"center\"";
            }
            String viewFinalLink = "";
            
            if (positionElement == (startItem+t)){
                if ((highlight != null) && (!highlight.equals(""))){
                    if (countWriteTr == 0){
    %>
    <tr class="listRow">
    <td width="8" class="listCell">&nbsp;</td>
    <%
                    countWriteTr = 1;
                    }
    %>
    <td <%=align%> class="listCell" <%=width%>>
    <%
                }else{
                    if (countWriteTr == 0){
    %>
    <tr class="listRow">
    <td width="8" class="listCell">&nbsp;</td>
    <%
    countWriteTr = 1;
                    }
    %>
    <td <%=align%> class="listCell" <%=width%>>
    <%
                }
            }else{
                if (countWriteTr == 0){
    %>
    <tr class="listRow">
        <td width="8" class="listCell">&nbsp;</td>
        <%
        countWriteTr = 1;
                }
        %>
        <td <%=align%> class="listCell" <%=width%>>
            <%
            }
            if ((idParameter!=null) && (idProperty!=null) && (viewLink !=null)){
                String parameterChar = "&";
                if (viewLink.indexOf('?') == -1)
                    parameterChar = "?";
                viewFinalLink += viewLink+parameterChar+idParameter+"="+org.apache.commons.beanutils.BeanUtils.getProperty(item,idProperty);
            %>
            <a href="<%=viewFinalLink%>" class="listCellLink">
                <%
                }
            if(isSpecial){
                %>
                <c:set var="specialPropertyName" value="<%=property%>" />
                <jsp:invoke fragment="specialEvaluation"/>
                <%
                }else{
                String propertyValue = org.apache.commons.beanutils.BeanUtils.getProperty(item,property);
                %>
                <%=propertyValue%>
                <%
                }
            if ((idParameter!=null) && (idProperty!=null) && (viewLink!=null)){
                %>
            </a>
            <%
            }
            %>
        </td>
        <%
        if(i != propertiesVector.size()-1 ){
        %>
        <td width="8" class="listCell">&nbsp;</td>
        <%
        }
        }
        if ((updateLink != null) || (deleteLink != null)){
            String parameterUpChar = "&";
            String parameterDelChar = "&";
            if (updateLink!=null){
                if (updateLink.indexOf('?') == -1)
                    parameterUpChar = "?";
            }
            if (deleteLink!=null){
                if (deleteLink.indexOf('?') == -1)
                    parameterDelChar = "?";
            }
            String updateFinalLink = updateLink+parameterUpChar+idParameter+"="+org.apache.commons.beanutils.BeanUtils.getProperty(item,idProperty);
            String deleteFinalLink = deleteLink+parameterDelChar+idParameter+"="+org.apache.commons.beanutils.BeanUtils.getProperty(item,idProperty);
        %>
        <td width="8" class="listCell">&nbsp;</td>
        <td class="listCell"><table cellpadding="0" cellspacing="0"><tr>
            <%
            if(updateLink != null){
            %>
            <td class="listCellEditLink" onclick="window.location='<%=updateFinalLink%>';" />
            <%
            }
            if(deleteLink != null){
            %>
                <td class="listCellDeleteLink" onclick="window.location='<%=deleteFinalLink%>';" />
                <%
                }
                %>
        </tr></table></td>
        <%
        }
        %>
        <td width="8" class="listCell">&nbsp;</td>
    </tr>
    <!--    <tr><td height="10"></td></tr>-->
    <!--</table>-->
    <%
    }
    if (paging!=null){
        String parameterOriginChar = "&";
        if (originLink!=null){
            if (originLink.indexOf('?') == -1)
                parameterOriginChar = "?";
            
            String linkFirstPage = originLink+parameterOriginChar+"currentPage="+firstPage;
            String linkPreviousPage = originLink+parameterOriginChar+"currentPage="+previousPage;
            String linkNextPage = originLink+parameterOriginChar+"currentPage="+nextPage;
            String linkLastPage = originLink+parameterOriginChar+"currentPage="+lastPage;
            if (strGoToItem != null){
                linkFirstPage += "&goToItem="+strGoToItem;
                linkPreviousPage += "&goToItem="+strGoToItem;
                linkNextPage += "&goToItem="+strGoToItem;
                linkLastPage += "&goToItem="+strGoToItem;
            }
    %>
</table>
<table width="100%" border="0" align="right" cellpadding="0" cellspacing="0" class="pageNavigation">
    <tr>
        <td width="100%" align="right">
                &nbsp;<%if (firstPage!=0){%><a href="<%=linkFirstPage%>" class="pageNavigationLink">Primeira</a><%}%>
                <%if (previousPage!=0){%>|&nbsp;<a href="<%=linkPreviousPage%>" class="pageNavigationLink">Anterior</a><%}%>
                &nbsp;&nbsp;<span class="pageNavigationStatus">P&aacute;gina <%=cPage%> de <%=numPages%></span>&nbsp;&nbsp;
                <%if (nextPage!=0){%><a href="<%=linkNextPage%>" class="pageNavigationLink">Pr&oacute;xima</a><%}%>
                <%if (lastPage!=0){%>|&nbsp;<a href="<%=linkLastPage%>" class="pageNavigationLink">&Uacute;ltima</a><%}%>
        </td>
    </tr>
</table>
<%
        }
    }
} 
%>
