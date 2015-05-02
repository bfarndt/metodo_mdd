package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_DAOAbstractFactoryjava implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_DAOAbstractFactoryjava(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_9 = new TagInfo("c:get", //$NON-NLS-1$
            1, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@daosPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_3_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            3, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/WebDomainAdministrationModel/userTypes", //$NON-NLS-1$
                "userType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_8 = new TagInfo("c:get", //$NON-NLS-1$
            4, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@fullDaoClassName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_23 = new TagInfo("c:get", //$NON-NLS-1$
            7, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@daoAbstractFactoryClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_8_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            8, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/WebDomainAdministrationModel/userTypes", //$NON-NLS-1$
                "userType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_21 = new TagInfo("c:get", //$NON-NLS-1$
            9, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@daoClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_63 = new TagInfo("c:get", //$NON-NLS-1$
            9, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@daoClass", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        out.write("package ");  //$NON-NLS-1$        
        out.setTag("get",8,57);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(49);
        RuntimeTagElement _jettag_c_get_1_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_9.setRuntimeParent(null);
        _jettag_c_get_1_9.setTagInfo(_td_c_get_1_9);
        _jettag_c_get_1_9.doStart(context, out);
        _jettag_c_get_1_9.doEnd();
        out.setTag(null,-1,-1);
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(75);
        out.setTag("iterate",60,135);
        RuntimeTagElement _jettag_c_iterate_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_3_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_3_1.setRuntimeParent(null);
        _jettag_c_iterate_3_1.setTagInfo(_td_c_iterate_3_1);
        _jettag_c_iterate_3_1.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_3_1.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_3_1.getTagInfo().getAttribute("delimiter"),60,135);
            out.loopIterate();
            out.write(NL);         
            out.write("import ");  //$NON-NLS-1$        
            out.setTag("get",143,189);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(46);
            RuntimeTagElement _jettag_c_get_4_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_8); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_4_8.setRuntimeParent(_jettag_c_iterate_3_1);
            _jettag_c_get_4_8.setTagInfo(_td_c_get_4_8);
            _jettag_c_get_4_8.doStart(context, out);
            _jettag_c_get_4_8.doEnd();
            out.setTag(null,-1,-1);
            out.write(";");  //$NON-NLS-1$        
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_iterate_3_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_3_1.doEnd();
        out.loopEnd();
        out.endTag("iterate",56);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write(NL);         
        out.write("public abstract class ");  //$NON-NLS-1$        
        out.setTag("get",227,288);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(61);
        RuntimeTagElement _jettag_c_get_7_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_23); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_7_23.setRuntimeParent(null);
        _jettag_c_get_7_23.setTagInfo(_td_c_get_7_23);
        _jettag_c_get_7_23.doStart(context, out);
        _jettag_c_get_7_23.doEnd();
        out.setTag(null,-1,-1);
        out.write(" {");  //$NON-NLS-1$        
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(75);
        out.setTag("iterate",291,366);
        RuntimeTagElement _jettag_c_iterate_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_8_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_8_1.setRuntimeParent(null);
        _jettag_c_iterate_8_1.setTagInfo(_td_c_iterate_8_1);
        _jettag_c_iterate_8_1.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_8_1.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_8_1.getTagInfo().getAttribute("delimiter"),291,366);
            out.loopIterate();
            out.write(NL);         
            out.write("    public abstract ");  //$NON-NLS-1$        
            out.setTag("get",387,425);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(38);
            RuntimeTagElement _jettag_c_get_9_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_21); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_9_21.setRuntimeParent(_jettag_c_iterate_8_1);
            _jettag_c_get_9_21.setTagInfo(_td_c_get_9_21);
            _jettag_c_get_9_21.doStart(context, out);
            _jettag_c_get_9_21.doEnd();
            out.setTag(null,-1,-1);
            out.write(" get");  //$NON-NLS-1$        
            out.setTag("get",429,467);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(38);
            RuntimeTagElement _jettag_c_get_9_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_63); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_9_63.setRuntimeParent(_jettag_c_iterate_8_1);
            _jettag_c_get_9_63.setTagInfo(_td_c_get_9_63);
            _jettag_c_get_9_63.doStart(context, out);
            _jettag_c_get_9_63.doEnd();
            out.setTag(null,-1,-1);
            out.write("();");  //$NON-NLS-1$        
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_iterate_8_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_8_1.doEnd();
        out.loopEnd();
        out.endTag("iterate",105);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.popTemplateFile();
    }
}
