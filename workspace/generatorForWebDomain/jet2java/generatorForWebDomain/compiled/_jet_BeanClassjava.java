package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_BeanClassjava implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_BeanClassjava(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_3_9 = new TagInfo("c:get", //$NON-NLS-1$
            3, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@beansPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_14 = new TagInfo("c:get", //$NON-NLS-1$
            6, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_10 = new TagInfo("c:get", //$NON-NLS-1$
            8, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idFieldType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_52 = new TagInfo("c:get", //$NON-NLS-1$
            8, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_11_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            11, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/attributes", //$NON-NLS-1$
                "anAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_10 = new TagInfo("c:get", //$NON-NLS-1$
            12, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@javaType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_52 = new TagInfo("c:get", //$NON-NLS-1$
            12, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_16_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            16, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/referenceList", //$NON-NLS-1$
                "aReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_10 = new TagInfo("c:get", //$NON-NLS-1$
            17, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/@javaType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_51 = new TagInfo("c:get", //$NON-NLS-1$
            17, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_9 = new TagInfo("c:get", //$NON-NLS-1$
            21, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_14 = new TagInfo("c:get", //$NON-NLS-1$
            25, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idFieldSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_58 = new TagInfo("c:get", //$NON-NLS-1$
            25, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idFieldType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_100 = new TagInfo("c:get", //$NON-NLS-1$
            25, 100,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_146 = new TagInfo("c:get", //$NON-NLS-1$
            25, 146,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_186 = new TagInfo("c:get", //$NON-NLS-1$
            25, 186,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_9 = new TagInfo("c:get", //$NON-NLS-1$
            26, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idFieldType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_51 = new TagInfo("c:get", //$NON-NLS-1$
            26, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idFieldGetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_111 = new TagInfo("c:get", //$NON-NLS-1$
            26, 111,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_29_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            29, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/attributes", //$NON-NLS-1$
                "anAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_14 = new TagInfo("c:get", //$NON-NLS-1$
            30, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@javaSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_58 = new TagInfo("c:get", //$NON-NLS-1$
            30, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@javaType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_100 = new TagInfo("c:get", //$NON-NLS-1$
            30, 100,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_146 = new TagInfo("c:get", //$NON-NLS-1$
            30, 146,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_186 = new TagInfo("c:get", //$NON-NLS-1$
            30, 186,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_9 = new TagInfo("c:get", //$NON-NLS-1$
            31, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@javaType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_51 = new TagInfo("c:get", //$NON-NLS-1$
            31, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@javaGetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_111 = new TagInfo("c:get", //$NON-NLS-1$
            31, 111,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_35_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            35, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/referenceList", //$NON-NLS-1$
                "aReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_14 = new TagInfo("c:get", //$NON-NLS-1$
            36, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/@javaSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_57 = new TagInfo("c:get", //$NON-NLS-1$
            36, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/@javaType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_98 = new TagInfo("c:get", //$NON-NLS-1$
            36, 98,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_143 = new TagInfo("c:get", //$NON-NLS-1$
            36, 143,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_182 = new TagInfo("c:get", //$NON-NLS-1$
            36, 182,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_9 = new TagInfo("c:get", //$NON-NLS-1$
            37, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/@javaType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_50 = new TagInfo("c:get", //$NON-NLS-1$
            37, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/@javaGetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_109 = new TagInfo("c:get", //$NON-NLS-1$
            37, 109,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_69_16 = new TagInfo("c:get", //$NON-NLS-1$
            69, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idFieldGetter", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        // Selected variable: userType 
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(37);
        out.write(NL);         
        out.write(NL);         
        out.write("package ");  //$NON-NLS-1$        
        out.setTag("get",47,97);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(50);
        RuntimeTagElement _jettag_c_get_3_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_9.setRuntimeParent(null);
        _jettag_c_get_3_9.setTagInfo(_td_c_get_3_9);
        _jettag_c_get_3_9.doStart(context, out);
        _jettag_c_get_3_9.doEnd();
        out.setTag(null,-1,-1);
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("/* Esta classe foi gerada! */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("public class ");  //$NON-NLS-1$        
        out.setTag("get",143,177);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_6_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_6_14.setRuntimeParent(null);
        _jettag_c_get_6_14.setTagInfo(_td_c_get_6_14);
        _jettag_c_get_6_14.doStart(context, out);
        _jettag_c_get_6_14.doEnd();
        out.setTag(null,-1,-1);
        out.write(" {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t// id field");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate ");  //$NON-NLS-1$        
        out.setTag("get",202,243);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(41);
        RuntimeTagElement _jettag_c_get_8_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_10.setRuntimeParent(null);
        _jettag_c_get_8_10.setTagInfo(_td_c_get_8_10);
        _jettag_c_get_8_10.doStart(context, out);
        _jettag_c_get_8_10.doEnd();
        out.setTag(null,-1,-1);
        out.write(" ");  //$NON-NLS-1$        
        out.setTag("get",244,281);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_8_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_52); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_52.setRuntimeParent(null);
        _jettag_c_get_8_52.setTagInfo(_td_c_get_8_52);
        _jettag_c_get_8_52.doStart(context, out);
        _jettag_c_get_8_52.doEnd();
        out.setTag(null,-1,-1);
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t// fields");  //$NON-NLS-1$        
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(59);
        out.setTag("iterate",295,354);
        RuntimeTagElement _jettag_c_iterate_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_11_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_11_1.setRuntimeParent(null);
        _jettag_c_iterate_11_1.setTagInfo(_td_c_iterate_11_1);
        _jettag_c_iterate_11_1.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_11_1.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_11_1.getTagInfo().getAttribute("delimiter"),295,354);
            out.loopIterate();
            out.write(NL);         
            out.write("\tprivate ");  //$NON-NLS-1$        
            out.setTag("get",364,405);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(41);
            RuntimeTagElement _jettag_c_get_12_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_12_10.setRuntimeParent(_jettag_c_iterate_11_1);
            _jettag_c_get_12_10.setTagInfo(_td_c_get_12_10);
            _jettag_c_get_12_10.doStart(context, out);
            _jettag_c_get_12_10.doEnd();
            out.setTag(null,-1,-1);
            out.write(" ");  //$NON-NLS-1$        
            out.setTag("get",406,443);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(37);
            RuntimeTagElement _jettag_c_get_12_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_52); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_12_52.setRuntimeParent(_jettag_c_iterate_11_1);
            _jettag_c_get_12_52.setTagInfo(_td_c_get_12_52);
            _jettag_c_get_12_52.doStart(context, out);
            _jettag_c_get_12_52.doEnd();
            out.setTag(null,-1,-1);
            out.write(";");  //$NON-NLS-1$        
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_iterate_11_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_11_1.doEnd();
        out.loopEnd();
        out.endTag("iterate",91);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write(NL);         
        out.write("\t// references");  //$NON-NLS-1$        
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(61);
        out.setTag("iterate",474,535);
        RuntimeTagElement _jettag_c_iterate_16_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_16_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_16_1.setRuntimeParent(null);
        _jettag_c_iterate_16_1.setTagInfo(_td_c_iterate_16_1);
        _jettag_c_iterate_16_1.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_16_1.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_16_1.getTagInfo().getAttribute("delimiter"),474,535);
            out.loopIterate();
            out.write(NL);         
            out.write("\tprivate ");  //$NON-NLS-1$        
            out.setTag("get",545,585);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(40);
            RuntimeTagElement _jettag_c_get_17_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_17_10.setRuntimeParent(_jettag_c_iterate_16_1);
            _jettag_c_get_17_10.setTagInfo(_td_c_get_17_10);
            _jettag_c_get_17_10.doStart(context, out);
            _jettag_c_get_17_10.doEnd();
            out.setTag(null,-1,-1);
            out.write(" ");  //$NON-NLS-1$        
            out.setTag("get",586,622);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(36);
            RuntimeTagElement _jettag_c_get_17_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_51); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_17_51.setRuntimeParent(_jettag_c_iterate_16_1);
            _jettag_c_get_17_51.setTagInfo(_td_c_get_17_51);
            _jettag_c_get_17_51.doStart(context, out);
            _jettag_c_get_17_51.doEnd();
            out.setTag(null,-1,-1);
            out.write(";");  //$NON-NLS-1$        
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_iterate_16_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_16_1.doEnd();
        out.loopEnd();
        out.endTag("iterate",89);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write(NL);         
        out.write("\t// default constructor");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic ");  //$NON-NLS-1$        
        out.setTag("get",670,704);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_21_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_9.setRuntimeParent(null);
        _jettag_c_get_21_9.setTagInfo(_td_c_get_21_9);
        _jettag_c_get_21_9.doStart(context, out);
        _jettag_c_get_21_9.doEnd();
        out.setTag(null,-1,-1);
        out.write("() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t// id fields setter and getter");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void ");  //$NON-NLS-1$        
        out.setTag("get",759,802);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(43);
        RuntimeTagElement _jettag_c_get_25_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_25_14.setRuntimeParent(null);
        _jettag_c_get_25_14.setTagInfo(_td_c_get_25_14);
        _jettag_c_get_25_14.doStart(context, out);
        _jettag_c_get_25_14.doEnd();
        out.setTag(null,-1,-1);
        out.write("(");  //$NON-NLS-1$        
        out.setTag("get",803,844);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(41);
        RuntimeTagElement _jettag_c_get_25_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_58); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_25_58.setRuntimeParent(null);
        _jettag_c_get_25_58.setTagInfo(_td_c_get_25_58);
        _jettag_c_get_25_58.doStart(context, out);
        _jettag_c_get_25_58.doEnd();
        out.setTag(null,-1,-1);
        out.write(" ");  //$NON-NLS-1$        
        out.setTag("get",845,882);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_25_100 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_100); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_25_100.setRuntimeParent(null);
        _jettag_c_get_25_100.setTagInfo(_td_c_get_25_100);
        _jettag_c_get_25_100.doStart(context, out);
        _jettag_c_get_25_100.doEnd();
        out.setTag(null,-1,-1);
        out.write(") { this.");  //$NON-NLS-1$        
        out.setTag("get",891,928);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_25_146 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_146); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_25_146.setRuntimeParent(null);
        _jettag_c_get_25_146.setTagInfo(_td_c_get_25_146);
        _jettag_c_get_25_146.doStart(context, out);
        _jettag_c_get_25_146.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = ");  //$NON-NLS-1$        
        out.setTag("get",931,968);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_25_186 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_186); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_25_186.setRuntimeParent(null);
        _jettag_c_get_25_186.setTagInfo(_td_c_get_25_186);
        _jettag_c_get_25_186.doStart(context, out);
        _jettag_c_get_25_186.doEnd();
        out.setTag(null,-1,-1);
        out.write("; }    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic ");  //$NON-NLS-1$        
        out.setTag("get",984,1025);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(41);
        RuntimeTagElement _jettag_c_get_26_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_26_9.setRuntimeParent(null);
        _jettag_c_get_26_9.setTagInfo(_td_c_get_26_9);
        _jettag_c_get_26_9.doStart(context, out);
        _jettag_c_get_26_9.doEnd();
        out.setTag(null,-1,-1);
        out.write(" ");  //$NON-NLS-1$        
        out.setTag("get",1026,1069);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(43);
        RuntimeTagElement _jettag_c_get_26_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_51); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_26_51.setRuntimeParent(null);
        _jettag_c_get_26_51.setTagInfo(_td_c_get_26_51);
        _jettag_c_get_26_51.doStart(context, out);
        _jettag_c_get_26_51.doEnd();
        out.setTag(null,-1,-1);
        out.write("() { return this.");  //$NON-NLS-1$        
        out.setTag("get",1086,1123);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_26_111 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_111); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_26_111.setRuntimeParent(null);
        _jettag_c_get_26_111.setTagInfo(_td_c_get_26_111);
        _jettag_c_get_26_111.doStart(context, out);
        _jettag_c_get_26_111.doEnd();
        out.setTag(null,-1,-1);
        out.write("; }    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t// fields setters and getters");  //$NON-NLS-1$        
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(59);
        out.setTag("iterate",1163,1222);
        RuntimeTagElement _jettag_c_iterate_29_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_29_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_29_1.setRuntimeParent(null);
        _jettag_c_iterate_29_1.setTagInfo(_td_c_iterate_29_1);
        _jettag_c_iterate_29_1.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_29_1.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_29_1.getTagInfo().getAttribute("delimiter"),1163,1222);
            out.loopIterate();
            out.write(NL);         
            out.write("\tpublic void ");  //$NON-NLS-1$        
            out.setTag("get",1236,1279);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(43);
            RuntimeTagElement _jettag_c_get_30_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_14); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_30_14.setRuntimeParent(_jettag_c_iterate_29_1);
            _jettag_c_get_30_14.setTagInfo(_td_c_get_30_14);
            _jettag_c_get_30_14.doStart(context, out);
            _jettag_c_get_30_14.doEnd();
            out.setTag(null,-1,-1);
            out.write("(");  //$NON-NLS-1$        
            out.setTag("get",1280,1321);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(41);
            RuntimeTagElement _jettag_c_get_30_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_58); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_30_58.setRuntimeParent(_jettag_c_iterate_29_1);
            _jettag_c_get_30_58.setTagInfo(_td_c_get_30_58);
            _jettag_c_get_30_58.doStart(context, out);
            _jettag_c_get_30_58.doEnd();
            out.setTag(null,-1,-1);
            out.write(" ");  //$NON-NLS-1$        
            out.setTag("get",1322,1359);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(37);
            RuntimeTagElement _jettag_c_get_30_100 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_100); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_30_100.setRuntimeParent(_jettag_c_iterate_29_1);
            _jettag_c_get_30_100.setTagInfo(_td_c_get_30_100);
            _jettag_c_get_30_100.doStart(context, out);
            _jettag_c_get_30_100.doEnd();
            out.setTag(null,-1,-1);
            out.write(") { this.");  //$NON-NLS-1$        
            out.setTag("get",1368,1405);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(37);
            RuntimeTagElement _jettag_c_get_30_146 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_146); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_30_146.setRuntimeParent(_jettag_c_iterate_29_1);
            _jettag_c_get_30_146.setTagInfo(_td_c_get_30_146);
            _jettag_c_get_30_146.doStart(context, out);
            _jettag_c_get_30_146.doEnd();
            out.setTag(null,-1,-1);
            out.write(" = ");  //$NON-NLS-1$        
            out.setTag("get",1408,1445);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(37);
            RuntimeTagElement _jettag_c_get_30_186 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_186); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_30_186.setRuntimeParent(_jettag_c_iterate_29_1);
            _jettag_c_get_30_186.setTagInfo(_td_c_get_30_186);
            _jettag_c_get_30_186.doStart(context, out);
            _jettag_c_get_30_186.doEnd();
            out.setTag(null,-1,-1);
            out.write("; }    ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tpublic ");  //$NON-NLS-1$        
            out.setTag("get",1461,1502);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(41);
            RuntimeTagElement _jettag_c_get_31_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_31_9.setRuntimeParent(_jettag_c_iterate_29_1);
            _jettag_c_get_31_9.setTagInfo(_td_c_get_31_9);
            _jettag_c_get_31_9.doStart(context, out);
            _jettag_c_get_31_9.doEnd();
            out.setTag(null,-1,-1);
            out.write(" ");  //$NON-NLS-1$        
            out.setTag("get",1503,1546);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(43);
            RuntimeTagElement _jettag_c_get_31_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_51); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_31_51.setRuntimeParent(_jettag_c_iterate_29_1);
            _jettag_c_get_31_51.setTagInfo(_td_c_get_31_51);
            _jettag_c_get_31_51.doStart(context, out);
            _jettag_c_get_31_51.doEnd();
            out.setTag(null,-1,-1);
            out.write("() { return this.");  //$NON-NLS-1$        
            out.setTag("get",1563,1600);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(37);
            RuntimeTagElement _jettag_c_get_31_111 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_111); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_31_111.setRuntimeParent(_jettag_c_iterate_29_1);
            _jettag_c_get_31_111.setTagInfo(_td_c_get_31_111);
            _jettag_c_get_31_111.doStart(context, out);
            _jettag_c_get_31_111.doEnd();
            out.setTag(null,-1,-1);
            out.write("; }    ");  //$NON-NLS-1$        
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_iterate_29_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_29_1.doEnd();
        out.loopEnd();
        out.endTag("iterate",386);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write(NL);         
        out.write("\t// references setters and getters");  //$NON-NLS-1$        
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(61);
        out.setTag("iterate",1657,1718);
        RuntimeTagElement _jettag_c_iterate_35_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_35_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_35_1.setRuntimeParent(null);
        _jettag_c_iterate_35_1.setTagInfo(_td_c_iterate_35_1);
        _jettag_c_iterate_35_1.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_35_1.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_35_1.getTagInfo().getAttribute("delimiter"),1657,1718);
            out.loopIterate();
            out.write(NL);         
            out.write("\tpublic void ");  //$NON-NLS-1$        
            out.setTag("get",1732,1774);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(42);
            RuntimeTagElement _jettag_c_get_36_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_14); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_36_14.setRuntimeParent(_jettag_c_iterate_35_1);
            _jettag_c_get_36_14.setTagInfo(_td_c_get_36_14);
            _jettag_c_get_36_14.doStart(context, out);
            _jettag_c_get_36_14.doEnd();
            out.setTag(null,-1,-1);
            out.write("(");  //$NON-NLS-1$        
            out.setTag("get",1775,1815);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(40);
            RuntimeTagElement _jettag_c_get_36_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_57); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_36_57.setRuntimeParent(_jettag_c_iterate_35_1);
            _jettag_c_get_36_57.setTagInfo(_td_c_get_36_57);
            _jettag_c_get_36_57.doStart(context, out);
            _jettag_c_get_36_57.doEnd();
            out.setTag(null,-1,-1);
            out.write(" ");  //$NON-NLS-1$        
            out.setTag("get",1816,1852);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(36);
            RuntimeTagElement _jettag_c_get_36_98 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_98); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_36_98.setRuntimeParent(_jettag_c_iterate_35_1);
            _jettag_c_get_36_98.setTagInfo(_td_c_get_36_98);
            _jettag_c_get_36_98.doStart(context, out);
            _jettag_c_get_36_98.doEnd();
            out.setTag(null,-1,-1);
            out.write(") { this.");  //$NON-NLS-1$        
            out.setTag("get",1861,1897);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(36);
            RuntimeTagElement _jettag_c_get_36_143 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_143); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_36_143.setRuntimeParent(_jettag_c_iterate_35_1);
            _jettag_c_get_36_143.setTagInfo(_td_c_get_36_143);
            _jettag_c_get_36_143.doStart(context, out);
            _jettag_c_get_36_143.doEnd();
            out.setTag(null,-1,-1);
            out.write(" = ");  //$NON-NLS-1$        
            out.setTag("get",1900,1936);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(36);
            RuntimeTagElement _jettag_c_get_36_182 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_182); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_36_182.setRuntimeParent(_jettag_c_iterate_35_1);
            _jettag_c_get_36_182.setTagInfo(_td_c_get_36_182);
            _jettag_c_get_36_182.doStart(context, out);
            _jettag_c_get_36_182.doEnd();
            out.setTag(null,-1,-1);
            out.write("; }    ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tpublic ");  //$NON-NLS-1$        
            out.setTag("get",1952,1992);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(40);
            RuntimeTagElement _jettag_c_get_37_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_37_9.setRuntimeParent(_jettag_c_iterate_35_1);
            _jettag_c_get_37_9.setTagInfo(_td_c_get_37_9);
            _jettag_c_get_37_9.doStart(context, out);
            _jettag_c_get_37_9.doEnd();
            out.setTag(null,-1,-1);
            out.write(" ");  //$NON-NLS-1$        
            out.setTag("get",1993,2035);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(42);
            RuntimeTagElement _jettag_c_get_37_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_50); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_37_50.setRuntimeParent(_jettag_c_iterate_35_1);
            _jettag_c_get_37_50.setTagInfo(_td_c_get_37_50);
            _jettag_c_get_37_50.doStart(context, out);
            _jettag_c_get_37_50.doEnd();
            out.setTag(null,-1,-1);
            out.write("() { return this.");  //$NON-NLS-1$        
            out.setTag("get",2052,2088);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(36);
            RuntimeTagElement _jettag_c_get_37_109 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_109); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_37_109.setRuntimeParent(_jettag_c_iterate_35_1);
            _jettag_c_get_37_109.setTagInfo(_td_c_get_37_109);
            _jettag_c_get_37_109.doStart(context, out);
            _jettag_c_get_37_109.doEnd();
            out.setTag(null,-1,-1);
            out.write("; }    ");  //$NON-NLS-1$        
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_iterate_35_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_35_1.doEnd();
        out.loopEnd();
        out.endTag("iterate",378);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write(NL);         
        out.scriptletStart();
  String strTypeSummaryJavaCommand = "";
    webDomainAdministrationSubDomain.Type t = (webDomainAdministrationSubDomain.Type)context.getVariable("userType");
    String typeSummary = t.getTypeSummary();
    int index1 = typeSummary.indexOf("{");
    int index2 = typeSummary.indexOf("}");
    while(index1 != -1 && index2 != -1) {
        String prefix = typeSummary.substring(0,index1);
        String fieldName = typeSummary.substring(index1+1, index2);
        if(fieldName.equals("id"))
            fieldName = "get" + t.getName() + fieldName.substring(0,1).toUpperCase() + fieldName.substring(1);
        else
            fieldName = "get" + fieldName.substring(0,1).toUpperCase() + fieldName.substring(1);
        if(prefix.length() > 0) strTypeSummaryJavaCommand += "\""+prefix+"\" + ";
        strTypeSummaryJavaCommand += fieldName + "() + ";
        typeSummary = typeSummary.substring(index2+1);
        index1 = typeSummary.indexOf("{");
        index2 = typeSummary.indexOf("}");
    }
    if(typeSummary.length() > 0)
        strTypeSummaryJavaCommand += "\"" + typeSummary + "\"";
    if(strTypeSummaryJavaCommand.endsWith(" + "))
        strTypeSummaryJavaCommand = strTypeSummaryJavaCommand.substring(0,strTypeSummaryJavaCommand.length()-3);  
    
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(1270);
        out.scriptletEnd();
        out.write(NL);         
        out.write("    // summary getter");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public String getSummary() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        return ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write(strTypeSummaryJavaCommand);
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(30);
        out.scriptletEnd();
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    // generic id getter");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public long getId() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        return ");  //$NON-NLS-1$        
        out.setTag("get",3555,3598);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(43);
        RuntimeTagElement _jettag_c_get_69_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_69_16.setRuntimeParent(null);
        _jettag_c_get_69_16.setTagInfo(_td_c_get_69_16);
        _jettag_c_get_69_16.doStart(context, out);
        _jettag_c_get_69_16.doEnd();
        out.setTag(null,-1,-1);
        out.write("();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public String toString() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        return getSummary();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.popTemplateFile();
    }
}
