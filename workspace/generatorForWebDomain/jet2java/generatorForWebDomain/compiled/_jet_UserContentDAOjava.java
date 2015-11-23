package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_UserContentDAOjava implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_UserContentDAOjava(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_if_10_1 = new TagInfo("c:if", //$NON-NLS-1$
            10, 1,
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
        out.write("import java.util.List;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import core.database.BaseDAO;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("public abstract class UserContentDAO extends BaseDAO {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public abstract List<UserContent> getAllUserContent(String entity, long entityId);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public abstract boolean insertUserContent(String entityName, long entityId, String title, String content, String name, String email);");  //$NON-NLS-1$        
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(67);
        out.setTag("if",367,434);
        RuntimeTagElement _jettag_c_if_10_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_10_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_10_1.setRuntimeParent(null);
        _jettag_c_if_10_1.setTagInfo(_td_c_if_10_1);
        _jettag_c_if_10_1.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_c_if_10_1.okToProcessBody()) {
            out.write(NL);         
            out.write("    public abstract boolean approveUserContent(long userContentId);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    public abstract boolean deleteUserContent(long userContentId);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    public abstract List<UserContent> getUnapprovedUserContent();");  //$NON-NLS-1$        
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_if_10_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_if_10_1.doEnd();
        out.endTag("if",202);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.popTemplateFile();
    }
}
