package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_userContent implements JET2Template {
    private final String templateFile;

    public _jet_userContent(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(36);
        out.write(NL);         
        out.write("<!-- begin userContent area -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<% { %>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<hr>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<div class=\"userContentTitle\">Comentarios de usuarios:</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<% UserContentDAO daoUserContent = DefaultUserContentDAOFactoryProvider.getDefaultDAOFactoryInstance().getUserContentDAO();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("   List<UserContent> allUserContent = daoUserContent.getAllUserContent(request.getParameter(\"entityName\"), Long.parseLong(request.getParameter(\"idParameter\")));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("   for(UserContent uc: allUserContent) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("%>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<div class=\"userContent\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<span class=\"userContentDate\"><%=new java.text.SimpleDateFormat(\"dd/MM/yyyy - hh:mm:ss\").format(uc.getDate())%></span>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<span class=\"userContentName\"><%=uc.getName()%></span> <br/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<div class=\"userContentTextTitle\"><%=uc.getTitle()%></div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<div class=\"userContentText\"><%=uc.getContent()%></div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<% } %>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<br/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<input type=\"button\" value=\"Enviar comentario\" onclick=\"popup('uploadUserCommentForm.jsp?entityName=<%=request.getParameter(\"entityName\")%>&entityId=<%=request.getParameter(\"idParameter\")%>',300,400)\" /><br/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<% } %>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<!-- end userContent area -->");  //$NON-NLS-1$        
        out.popTemplateFile();
    }
}
