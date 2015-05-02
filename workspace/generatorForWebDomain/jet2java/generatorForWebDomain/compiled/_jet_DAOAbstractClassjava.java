package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_DAOAbstractClassjava implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_DAOAbstractClassjava(String templateFile) {
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
    private static final TagInfo _td_c_get_6_8 = new TagInfo("c:get", //$NON-NLS-1$
            6, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@fullBeanName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_23 = new TagInfo("c:get", //$NON-NLS-1$
            8, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@daoClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_26 = new TagInfo("c:get", //$NON-NLS-1$
            9, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_68 = new TagInfo("c:get", //$NON-NLS-1$
            9, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_21 = new TagInfo("c:get", //$NON-NLS-1$
            10, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_59 = new TagInfo("c:get", //$NON-NLS-1$
            10, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_94 = new TagInfo("c:get", //$NON-NLS-1$
            10, 94,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idFieldType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_136 = new TagInfo("c:get", //$NON-NLS-1$
            10, 136,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_41 = new TagInfo("c:get", //$NON-NLS-1$
            11, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_76 = new TagInfo("c:get", //$NON-NLS-1$
            11, 76,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_111 = new TagInfo("c:get", //$NON-NLS-1$
            11, 111,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_35 = new TagInfo("c:get", //$NON-NLS-1$
            12, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_70 = new TagInfo("c:get", //$NON-NLS-1$
            12, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_105 = new TagInfo("c:get", //$NON-NLS-1$
            12, 105,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_35 = new TagInfo("c:get", //$NON-NLS-1$
            13, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_70 = new TagInfo("c:get", //$NON-NLS-1$
            13, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_105 = new TagInfo("c:get", //$NON-NLS-1$
            13, 105,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_35 = new TagInfo("c:get", //$NON-NLS-1$
            14, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_70 = new TagInfo("c:get", //$NON-NLS-1$
            14, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idFieldType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_112 = new TagInfo("c:get", //$NON-NLS-1$
            14, 112,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
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
        out.write("import java.util.List;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import core.database.BaseDAO;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        out.setTag("get",121,163);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_6_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_6_8.setRuntimeParent(null);
        _jettag_c_get_6_8.setTagInfo(_td_c_get_6_8);
        _jettag_c_get_6_8.doStart(context, out);
        _jettag_c_get_6_8.doEnd();
        out.setTag(null,-1,-1);
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("public abstract class ");  //$NON-NLS-1$        
        out.setTag("get",188,226);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(38);
        RuntimeTagElement _jettag_c_get_8_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_23); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_23.setRuntimeParent(null);
        _jettag_c_get_8_23.setTagInfo(_td_c_get_8_23);
        _jettag_c_get_8_23.doStart(context, out);
        _jettag_c_get_8_23.doEnd();
        out.setTag(null,-1,-1);
        out.write(" extends BaseDAO {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public abstract List<");  //$NON-NLS-1$        
        out.setTag("get",270,304);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_9_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_26.setRuntimeParent(null);
        _jettag_c_get_9_26.setTagInfo(_td_c_get_9_26);
        _jettag_c_get_9_26.doStart(context, out);
        _jettag_c_get_9_26.doEnd();
        out.setTag(null,-1,-1);
        out.write("> getAll");  //$NON-NLS-1$        
        out.setTag("get",312,346);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_9_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_68); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_68.setRuntimeParent(null);
        _jettag_c_get_9_68.setTagInfo(_td_c_get_9_68);
        _jettag_c_get_9_68.doStart(context, out);
        _jettag_c_get_9_68.doEnd();
        out.setTag(null,-1,-1);
        out.write("s();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public abstract ");  //$NON-NLS-1$        
        out.setTag("get",371,405);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_10_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_21); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_10_21.setRuntimeParent(null);
        _jettag_c_get_10_21.setTagInfo(_td_c_get_10_21);
        _jettag_c_get_10_21.doStart(context, out);
        _jettag_c_get_10_21.doEnd();
        out.setTag(null,-1,-1);
        out.write(" get");  //$NON-NLS-1$        
        out.setTag("get",409,443);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_10_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_59); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_10_59.setRuntimeParent(null);
        _jettag_c_get_10_59.setTagInfo(_td_c_get_10_59);
        _jettag_c_get_10_59.doStart(context, out);
        _jettag_c_get_10_59.doEnd();
        out.setTag(null,-1,-1);
        out.write("(");  //$NON-NLS-1$        
        out.setTag("get",444,485);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(41);
        RuntimeTagElement _jettag_c_get_10_94 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_94); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_10_94.setRuntimeParent(null);
        _jettag_c_get_10_94.setTagInfo(_td_c_get_10_94);
        _jettag_c_get_10_94.doStart(context, out);
        _jettag_c_get_10_94.doEnd();
        out.setTag(null,-1,-1);
        out.write(" ");  //$NON-NLS-1$        
        out.setTag("get",486,523);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_10_136 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_136); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_10_136.setRuntimeParent(null);
        _jettag_c_get_10_136.setTagInfo(_td_c_get_10_136);
        _jettag_c_get_10_136.doStart(context, out);
        _jettag_c_get_10_136.doEnd();
        out.setTag(null,-1,-1);
        out.write("Parameter);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public abstract boolean saveOrUpdate");  //$NON-NLS-1$        
        out.setTag("get",575,609);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_11_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_41.setRuntimeParent(null);
        _jettag_c_get_11_41.setTagInfo(_td_c_get_11_41);
        _jettag_c_get_11_41.doStart(context, out);
        _jettag_c_get_11_41.doEnd();
        out.setTag(null,-1,-1);
        out.write("(");  //$NON-NLS-1$        
        out.setTag("get",610,644);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_11_76 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_76); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_76.setRuntimeParent(null);
        _jettag_c_get_11_76.setTagInfo(_td_c_get_11_76);
        _jettag_c_get_11_76.doStart(context, out);
        _jettag_c_get_11_76.doEnd();
        out.setTag(null,-1,-1);
        out.write(" ");  //$NON-NLS-1$        
        out.setTag("get",645,687);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_11_111 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_111); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_111.setRuntimeParent(null);
        _jettag_c_get_11_111.setTagInfo(_td_c_get_11_111);
        _jettag_c_get_11_111.doStart(context, out);
        _jettag_c_get_11_111.doEnd();
        out.setTag(null,-1,-1);
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public abstract boolean insert");  //$NON-NLS-1$        
        out.setTag("get",724,758);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_12_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_35); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_35.setRuntimeParent(null);
        _jettag_c_get_12_35.setTagInfo(_td_c_get_12_35);
        _jettag_c_get_12_35.doStart(context, out);
        _jettag_c_get_12_35.doEnd();
        out.setTag(null,-1,-1);
        out.write("(");  //$NON-NLS-1$        
        out.setTag("get",759,793);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_12_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_70); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_70.setRuntimeParent(null);
        _jettag_c_get_12_70.setTagInfo(_td_c_get_12_70);
        _jettag_c_get_12_70.doStart(context, out);
        _jettag_c_get_12_70.doEnd();
        out.setTag(null,-1,-1);
        out.write(" ");  //$NON-NLS-1$        
        out.setTag("get",794,836);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_12_105 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_105); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_105.setRuntimeParent(null);
        _jettag_c_get_12_105.setTagInfo(_td_c_get_12_105);
        _jettag_c_get_12_105.doStart(context, out);
        _jettag_c_get_12_105.doEnd();
        out.setTag(null,-1,-1);
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public abstract boolean update");  //$NON-NLS-1$        
        out.setTag("get",873,907);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_13_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_35); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_13_35.setRuntimeParent(null);
        _jettag_c_get_13_35.setTagInfo(_td_c_get_13_35);
        _jettag_c_get_13_35.doStart(context, out);
        _jettag_c_get_13_35.doEnd();
        out.setTag(null,-1,-1);
        out.write("(");  //$NON-NLS-1$        
        out.setTag("get",908,942);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_13_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_70); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_13_70.setRuntimeParent(null);
        _jettag_c_get_13_70.setTagInfo(_td_c_get_13_70);
        _jettag_c_get_13_70.doStart(context, out);
        _jettag_c_get_13_70.doEnd();
        out.setTag(null,-1,-1);
        out.write(" ");  //$NON-NLS-1$        
        out.setTag("get",943,985);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_13_105 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_105); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_13_105.setRuntimeParent(null);
        _jettag_c_get_13_105.setTagInfo(_td_c_get_13_105);
        _jettag_c_get_13_105.doStart(context, out);
        _jettag_c_get_13_105.doEnd();
        out.setTag(null,-1,-1);
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public abstract boolean delete");  //$NON-NLS-1$        
        out.setTag("get",1022,1056);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_14_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_35); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_14_35.setRuntimeParent(null);
        _jettag_c_get_14_35.setTagInfo(_td_c_get_14_35);
        _jettag_c_get_14_35.doStart(context, out);
        _jettag_c_get_14_35.doEnd();
        out.setTag(null,-1,-1);
        out.write("(");  //$NON-NLS-1$        
        out.setTag("get",1057,1098);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(41);
        RuntimeTagElement _jettag_c_get_14_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_70); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_14_70.setRuntimeParent(null);
        _jettag_c_get_14_70.setTagInfo(_td_c_get_14_70);
        _jettag_c_get_14_70.doStart(context, out);
        _jettag_c_get_14_70.doEnd();
        out.setTag(null,-1,-1);
        out.write(" ");  //$NON-NLS-1$        
        out.setTag("get",1099,1136);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_14_112 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_112); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_14_112.setRuntimeParent(null);
        _jettag_c_get_14_112.setTagInfo(_td_c_get_14_112);
        _jettag_c_get_14_112.doStart(context, out);
        _jettag_c_get_14_112.doEnd();
        out.setTag(null,-1,-1);
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.popTemplateFile();
    }
}
