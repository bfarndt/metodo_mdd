package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_uploadUserCommentFormjsp implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_uploadUserCommentFormjsp(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_if_23_1 = new TagInfo("c:if", //$NON-NLS-1$
            23, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$featuresModel/WebDomainFeatures/@moderation = 'true'", //$NON-NLS-1$
            } );

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
        out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<html>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<head>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/navigation.css\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<title>Coment&aacute;rio</title>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("</head>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<body>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<form name=\"imageForm\" action=\"generated.usercontent.UserContentActions.uploadUserContent.do\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<input type=\"hidden\" name=\"entityName\" value=\"${param.entityName}\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<input type=\"hidden\" name=\"entityId\" value=\"${param.entityId}\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("Nome: <input type=\"text\" name=\"name\" size=\"40\" /><br/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("E-mail: <input type=\"text\" name=\"email\" size=\"40\" /><br/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("Assunto: <input type=\"text\" name=\"title\" size=\"40\" /><br/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("Coment&aacute;rio: ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<textarea name=\"content\" cols=\"32\" rows=\"5\"></textarea><br/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<input value=\"Enviar\" type=\"submit\" />");  //$NON-NLS-1$        
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(67);
        out.setTag("if",972,1039);
        RuntimeTagElement _jettag_c_if_23_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_23_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_23_1.setRuntimeParent(null);
        _jettag_c_if_23_1.setTagInfo(_td_c_if_23_1);
        _jettag_c_if_23_1.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_c_if_23_1.okToProcessBody()) {
            out.write(NL);         
            out.write("<span class=\"userContentWarning\">Aviso: o comentario so sera publicado apos aprovacao do moderador!</span>");  //$NON-NLS-1$        
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_if_23_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_if_23_1.doEnd();
        out.endTag("if",108);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(NL);         
        out.write("</form>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</body>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</html>");  //$NON-NLS-1$        
        out.popTemplateFile();
    }
}
