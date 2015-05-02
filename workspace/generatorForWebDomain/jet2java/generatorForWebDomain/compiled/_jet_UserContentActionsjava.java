package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_UserContentActionsjava implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_UserContentActionsjava(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_if_3_1 = new TagInfo("c:if", //$NON-NLS-1$
            3, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$featuresModel/WebDomainFeatures/@moderation = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_13_2 = new TagInfo("c:if", //$NON-NLS-1$
            13, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$featuresModel/WebDomainFeatures/@moderation = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_48 = new TagInfo("c:get", //$NON-NLS-1$
            14, 48,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@webpath", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_42_2 = new TagInfo("c:if", //$NON-NLS-1$
            42, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$featuresModel/WebDomainFeatures/@moderation = 'true'", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        out.write("package generated.usercontent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(67);
        out.setTag("if",32,99);
        RuntimeTagElement _jettag_c_if_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_3_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_3_1.setRuntimeParent(null);
        _jettag_c_if_3_1.setTagInfo(_td_c_if_3_1);
        _jettag_c_if_3_1.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_c_if_3_1.okToProcessBody()) {
            out.write(NL);         
            out.write("import java.util.List;");  //$NON-NLS-1$        
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_if_3_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_if_3_1.doEnd();
        out.endTag("if",24);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(NL);         
        out.write(NL);         
        out.write("import java.io.IOException;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.io.PrintWriter;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import javax.servlet.http.HttpServletRequest;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import javax.servlet.http.HttpServletResponse;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("public class UserContentActions {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(67);
        out.setTag("if",317,384);
        RuntimeTagElement _jettag_c_if_13_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_13_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_13_2.setRuntimeParent(null);
        _jettag_c_if_13_2.setTagInfo(_td_c_if_13_2);
        _jettag_c_if_13_2.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_c_if_13_2.okToProcessBody()) {
            out.write(NL);         
            out.write("\tpublic final static String MODERATION_PAGE = \"");  //$NON-NLS-1$        
            out.setTag("get",432,477);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(45);
            RuntimeTagElement _jettag_c_get_14_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_48); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_14_48.setRuntimeParent(_jettag_c_if_13_2);
            _jettag_c_get_14_48.setTagInfo(_td_c_get_14_48);
            _jettag_c_get_14_48.doStart(context, out);
            _jettag_c_get_14_48.doEnd();
            out.setTag(null,-1,-1);
            out.write("/moderation.jsp\";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_if_13_2.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_if_13_2.doEnd();
        out.endTag("if",112);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic String uploadUserContent(HttpServletRequest req,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tHttpServletResponse resp) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tString entityName = req.getParameter(\"entityName\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tString entityId = req.getParameter(\"entityId\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tString name = req.getParameter(\"name\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tString email = req.getParameter(\"email\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tString title = req.getParameter(\"title\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tString content = req.getParameter(\"content\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        UserContentDAO dao = DefaultUserContentDAOFactoryProvider.getDefaultDAOFactoryInstance().getUserContentDAO();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        dao.insertUserContent(entityName, Long.parseLong(entityId), title, content, name, email);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\ttry {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tPrintWriter pw = resp.getWriter();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tpw.println(\"<html>\" + \"<body>\" + \"<script>window.close();</script>\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t+ \"</body>\" + \"</html>\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tpw.flush();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tpw.close();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t} catch (IOException e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\te.printStackTrace();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        return null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(67);
        out.setTag("if",1356,1423);
        RuntimeTagElement _jettag_c_if_42_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_42_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_42_2.setRuntimeParent(null);
        _jettag_c_if_42_2.setTagInfo(_td_c_if_42_2);
        _jettag_c_if_42_2.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_c_if_42_2.okToProcessBody()) {
            out.write(NL);         
            out.write("    public String showModerationForm(HttpServletRequest req, HttpServletResponse resp) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    \tUserContentDAO dao = DefaultUserContentDAOFactoryProvider.getDefaultDAOFactoryInstance().getUserContentDAO();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        List<UserContent> unapprovedUserContent = dao.getUnapprovedUserContent();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        req.setAttribute(\"unnaprovedUserContent\", unapprovedUserContent);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        return MODERATION_PAGE;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    }");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    public String approveUserContent(HttpServletRequest req, HttpServletResponse resp) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    \tUserContentDAO dao = DefaultUserContentDAOFactoryProvider.getDefaultDAOFactoryInstance().getUserContentDAO();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    \tString userContentId = req.getParameter(\"userContentId\");");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        dao.approveUserContent(Long.parseLong(userContentId));");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        return showModerationForm(req,resp);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    }");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    public String deleteUserContent(HttpServletRequest req, HttpServletResponse resp) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    \tUserContentDAO dao = DefaultUserContentDAOFactoryProvider.getDefaultDAOFactoryInstance().getUserContentDAO();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    \tString userContentId = req.getParameter(\"userContentId\");");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        dao.deleteUserContent(Long.parseLong(userContentId));");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        return showModerationForm(req,resp);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    }    ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_if_42_2.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_if_42_2.doEnd();
        out.endTag("if",1240);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.popTemplateFile();
    }
}
