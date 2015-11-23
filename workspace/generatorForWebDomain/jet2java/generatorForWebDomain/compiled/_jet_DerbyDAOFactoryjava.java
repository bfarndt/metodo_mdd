package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_DerbyDAOFactoryjava implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_DerbyDAOFactoryjava(String templateFile) {
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
                "$theConfiguration/@derbyDaosPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_8 = new TagInfo("c:get", //$NON-NLS-1$
            4, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@daoAbstractFactoryFullName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_5_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            5, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/WebDomainAdministrationModel/userTypes", //$NON-NLS-1$
                "userType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_8 = new TagInfo("c:get", //$NON-NLS-1$
            6, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@fullDaoClassName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_14 = new TagInfo("c:get", //$NON-NLS-1$
            9, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@derbyDaoFactoryClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_81 = new TagInfo("c:get", //$NON-NLS-1$
            9, 81,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@daoAbstractFactoryClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_12 = new TagInfo("c:get", //$NON-NLS-1$
            12, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@derbyDaoFactoryClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_17_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            17, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/WebDomainAdministrationModel/userTypes", //$NON-NLS-1$
                "userType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_12 = new TagInfo("c:get", //$NON-NLS-1$
            18, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@daoClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_54 = new TagInfo("c:get", //$NON-NLS-1$
            18, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@daoClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_9 = new TagInfo("c:get", //$NON-NLS-1$
            19, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@daoClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_58 = new TagInfo("c:get", //$NON-NLS-1$
            19, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@derbyDAOClass", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        out.write("package ");  //$NON-NLS-1$        
        out.setTag("get",8,62);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(54);
        RuntimeTagElement _jettag_c_get_1_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_9.setRuntimeParent(null);
        _jettag_c_get_1_9.setTagInfo(_td_c_get_1_9);
        _jettag_c_get_1_9.doStart(context, out);
        _jettag_c_get_1_9.doEnd();
        out.setTag(null,-1,-1);
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import core.database.ConnectionProvider;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        out.setTag("get",113,177);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(64);
        RuntimeTagElement _jettag_c_get_4_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_4_8.setRuntimeParent(null);
        _jettag_c_get_4_8.setTagInfo(_td_c_get_4_8);
        _jettag_c_get_4_8.doStart(context, out);
        _jettag_c_get_4_8.doEnd();
        out.setTag(null,-1,-1);
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(75);
        out.setTag("iterate",179,254);
        RuntimeTagElement _jettag_c_iterate_5_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_5_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_5_1.setRuntimeParent(null);
        _jettag_c_iterate_5_1.setTagInfo(_td_c_iterate_5_1);
        _jettag_c_iterate_5_1.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_5_1.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_5_1.getTagInfo().getAttribute("delimiter"),179,254);
            out.loopIterate();
            out.write(NL);         
            out.write("import ");  //$NON-NLS-1$        
            out.setTag("get",262,308);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(46);
            RuntimeTagElement _jettag_c_get_6_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_8); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_6_8.setRuntimeParent(_jettag_c_iterate_5_1);
            _jettag_c_get_6_8.setTagInfo(_td_c_get_6_8);
            _jettag_c_get_6_8.doStart(context, out);
            _jettag_c_get_6_8.doEnd();
            out.setTag(null,-1,-1);
            out.write(";");  //$NON-NLS-1$        
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_iterate_5_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_5_1.doEnd();
        out.loopEnd();
        out.endTag("iterate",56);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write(NL);         
        out.write("public class ");  //$NON-NLS-1$        
        out.setTag("get",337,395);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(58);
        RuntimeTagElement _jettag_c_get_9_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_14.setRuntimeParent(null);
        _jettag_c_get_9_14.setTagInfo(_td_c_get_9_14);
        _jettag_c_get_9_14.doStart(context, out);
        _jettag_c_get_9_14.doEnd();
        out.setTag(null,-1,-1);
        out.write(" extends ");  //$NON-NLS-1$        
        out.setTag("get",404,465);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(61);
        RuntimeTagElement _jettag_c_get_9_81 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_81); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_81.setRuntimeParent(null);
        _jettag_c_get_9_81.setTagInfo(_td_c_get_9_81);
        _jettag_c_get_9_81.doStart(context, out);
        _jettag_c_get_9_81.doEnd();
        out.setTag(null,-1,-1);
        out.write(" {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ConnectionProvider connectionProvider;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public ");  //$NON-NLS-1$        
        out.setTag("get",527,585);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(58);
        RuntimeTagElement _jettag_c_get_12_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_12.setRuntimeParent(null);
        _jettag_c_get_12_12.setTagInfo(_td_c_get_12_12);
        _jettag_c_get_12_12.doStart(context, out);
        _jettag_c_get_12_12.doEnd();
        out.setTag(null,-1,-1);
        out.write("(ConnectionProvider connectionProvider) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.connectionProvider = connectionProvider;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    @Override");  //$NON-NLS-1$        
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(75);
        out.setTag("iterate",706,781);
        RuntimeTagElement _jettag_c_iterate_17_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_17_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_17_1.setRuntimeParent(null);
        _jettag_c_iterate_17_1.setTagInfo(_td_c_iterate_17_1);
        _jettag_c_iterate_17_1.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_17_1.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_17_1.getTagInfo().getAttribute("delimiter"),706,781);
            out.loopIterate();
            out.write(NL);         
            out.write("    public ");  //$NON-NLS-1$        
            out.setTag("get",793,831);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(38);
            RuntimeTagElement _jettag_c_get_18_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_18_12.setRuntimeParent(_jettag_c_iterate_17_1);
            _jettag_c_get_18_12.setTagInfo(_td_c_get_18_12);
            _jettag_c_get_18_12.doStart(context, out);
            _jettag_c_get_18_12.doEnd();
            out.setTag(null,-1,-1);
            out.write(" get");  //$NON-NLS-1$        
            out.setTag("get",835,873);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(38);
            RuntimeTagElement _jettag_c_get_18_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_54); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_18_54.setRuntimeParent(_jettag_c_iterate_17_1);
            _jettag_c_get_18_54.setTagInfo(_td_c_get_18_54);
            _jettag_c_get_18_54.doStart(context, out);
            _jettag_c_get_18_54.doEnd();
            out.setTag(null,-1,-1);
            out.write("() {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        ");  //$NON-NLS-1$        
            out.setTag("get",886,924);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(38);
            RuntimeTagElement _jettag_c_get_19_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_19_9.setRuntimeParent(_jettag_c_iterate_17_1);
            _jettag_c_get_19_9.setTagInfo(_td_c_get_19_9);
            _jettag_c_get_19_9.doStart(context, out);
            _jettag_c_get_19_9.doEnd();
            out.setTag(null,-1,-1);
            out.write(" dao = new ");  //$NON-NLS-1$        
            out.setTag("get",935,978);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(43);
            RuntimeTagElement _jettag_c_get_19_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_58); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_19_58.setRuntimeParent(_jettag_c_iterate_17_1);
            _jettag_c_get_19_58.setTagInfo(_td_c_get_19_58);
            _jettag_c_get_19_58.doStart(context, out);
            _jettag_c_get_19_58.doEnd();
            out.setTag(null,-1,-1);
            out.write("();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        dao.setConnectionProvider(connectionProvider);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        return dao;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    }");  //$NON-NLS-1$        
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_iterate_17_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_17_1.doEnd();
        out.loopEnd();
        out.endTag("iterate",282);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.popTemplateFile();
    }
}
