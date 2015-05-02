package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_moderationjsp implements JET2Template {
    private final String templateFile;

    public _jet_moderationjsp(String templateFile) {
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
        out.write("<%@ page language=\"java\" contentType=\"text/html; charset=ISO-8859-1\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    pageEncoding=\"ISO-8859-1\"%>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<%@ taglib uri=\"http://java.sun.com/jsp/jstl/core\" prefix=\"ctrl\"%>  ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<%@ taglib uri=\"/WEB-INF/tags/mytaglib.tld\" prefix=\"mytaglib\"%>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<%@ taglib uri=\"/WEB-INF/tags/myfunctions.tld\" prefix=\"f\"%>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<%@ taglib prefix=\"fmt\" uri=\"http://java.sun.com/jsp/jstl/fmt\" %>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<html>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<head>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/admin.css\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<title>Moderacao de comentarios</title>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</head>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<body>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<%@ include file=\"/admin/jspf/adminPrefix.jspf\" %>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<div class=\"userContentTitle\">Comentarios de usuarios nao aprovados:</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<ctrl:forEach items=\"${unnaprovedUserContent}\" var=\"uc\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<div class=\"userContent\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<span class=\"userContentDate\"><fmt:formatDate pattern=\"dd/MM/yyyy - hh:mm:ss\" value=\"${uc.date}\"/></span>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<span class=\"userContentName\">${uc.name}</span> <br/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<div class=\"userContentTextTitle\">${uc.title}</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<div class=\"userContentText\">${uc.content}</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<div class=\"moderationActions\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<a class=\"button\" href=\"generated.usercontent.UserContentActions.approveUserContent.do?userContentId=${uc.userContentId}\">Aprovar</a>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<a class=\"button\" href=\"generated.usercontent.UserContentActions.deleteUserContent.do?userContentId=${uc.userContentId}\">Remover</a>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</ctrl:forEach>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<%@ include file=\"/admin/jspf/adminSuffix.jspf\" %>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</body>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</html>");  //$NON-NLS-1$        
        out.popTemplateFile();
    }
}
