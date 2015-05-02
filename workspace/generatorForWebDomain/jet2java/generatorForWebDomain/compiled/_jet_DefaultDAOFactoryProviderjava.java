package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_DefaultDAOFactoryProviderjava implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_DefaultDAOFactoryProviderjava(String templateFile) {
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
    private static final TagInfo _td_c_get_3_8 = new TagInfo("c:get", //$NON-NLS-1$
            3, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@daoAbstractFactoryFullName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_8 = new TagInfo("c:get", //$NON-NLS-1$
            4, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@msSqlDaoFactoryFullName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_14 = new TagInfo("c:get", //$NON-NLS-1$
            6, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@defaultDAOFactoryProviderClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_20 = new TagInfo("c:get", //$NON-NLS-1$
            7, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@daoAbstractFactoryClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_19 = new TagInfo("c:get", //$NON-NLS-1$
            9, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@daoAbstractFactoryClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_31 = new TagInfo("c:get", //$NON-NLS-1$
            11, 31,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@msSqlDaoFactoryClass", //$NON-NLS-1$
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
        out.write("import ");  //$NON-NLS-1$        
        out.setTag("get",67,131);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(64);
        RuntimeTagElement _jettag_c_get_3_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_8.setRuntimeParent(null);
        _jettag_c_get_3_8.setTagInfo(_td_c_get_3_8);
        _jettag_c_get_3_8.doStart(context, out);
        _jettag_c_get_3_8.doEnd();
        out.setTag(null,-1,-1);
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        out.setTag("get",140,201);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(61);
        RuntimeTagElement _jettag_c_get_4_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_4_8.setRuntimeParent(null);
        _jettag_c_get_4_8.setTagInfo(_td_c_get_4_8);
        _jettag_c_get_4_8.doStart(context, out);
        _jettag_c_get_4_8.doEnd();
        out.setTag(null,-1,-1);
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("public class ");  //$NON-NLS-1$        
        out.setTag("get",217,285);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(68);
        RuntimeTagElement _jettag_c_get_6_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_6_14.setRuntimeParent(null);
        _jettag_c_get_6_14.setTagInfo(_td_c_get_6_14);
        _jettag_c_get_6_14.doStart(context, out);
        _jettag_c_get_6_14.doEnd();
        out.setTag(null,-1,-1);
        out.write(" {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    private static ");  //$NON-NLS-1$        
        out.setTag("get",307,368);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(61);
        RuntimeTagElement _jettag_c_get_7_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_20); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_7_20.setRuntimeParent(null);
        _jettag_c_get_7_20.setTagInfo(_td_c_get_7_20);
        _jettag_c_get_7_20.doStart(context, out);
        _jettag_c_get_7_20.doEnd();
        out.setTag(null,-1,-1);
        out.write(" theInstance = null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public static ");  //$NON-NLS-1$        
        out.setTag("get",412,473);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(61);
        RuntimeTagElement _jettag_c_get_9_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_19); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_19.setRuntimeParent(null);
        _jettag_c_get_9_19.setTagInfo(_td_c_get_9_19);
        _jettag_c_get_9_19.doStart(context, out);
        _jettag_c_get_9_19.doEnd();
        out.setTag(null,-1,-1);
        out.write(" getDefaultDAOFactoryInstance() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if(theInstance == null)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            theInstance = new ");  //$NON-NLS-1$        
        out.setTag("get",569,627);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(58);
        RuntimeTagElement _jettag_c_get_11_31 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_31); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_31.setRuntimeParent(null);
        _jettag_c_get_11_31.setTagInfo(_td_c_get_11_31);
        _jettag_c_get_11_31.doStart(context, out);
        _jettag_c_get_11_31.doEnd();
        out.setTag(null,-1,-1);
        out.write("();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        return theInstance;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.popTemplateFile();
    }
}
