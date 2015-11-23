package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_templateEntityJS implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_templateEntityJS(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_16 = new TagInfo("c:get", //$NON-NLS-1$
            1, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_2_22 = new TagInfo("c:get", //$NON-NLS-1$
            2, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_16 = new TagInfo("c:get", //$NON-NLS-1$
            5, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_7_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            7, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_3 = new TagInfo("c:if", //$NON-NLS-1$
            8, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_12 = new TagInfo("c:get", //$NON-NLS-1$
            9, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_12 = new TagInfo("c:get", //$NON-NLS-1$
            10, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_131 = new TagInfo("c:get", //$NON-NLS-1$
            10, 131,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_182 = new TagInfo("c:get", //$NON-NLS-1$
            10, 182,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_10 = new TagInfo("c:get", //$NON-NLS-1$
            11, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_106 = new TagInfo("c:get", //$NON-NLS-1$
            11, 106,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_12_9 = new TagInfo("c:if", //$NON-NLS-1$
            12, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_8 = new TagInfo("c:get", //$NON-NLS-1$
            13, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_59 = new TagInfo("c:get", //$NON-NLS-1$
            13, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_110 = new TagInfo("c:get", //$NON-NLS-1$
            13, 110,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_13 = new TagInfo("c:get", //$NON-NLS-1$
            16, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_13 = new TagInfo("c:get", //$NON-NLS-1$
            21, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_23_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            23, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_24_3 = new TagInfo("c:if", //$NON-NLS-1$
            24, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_13 = new TagInfo("c:get", //$NON-NLS-1$
            25, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_10 = new TagInfo("c:get", //$NON-NLS-1$
            26, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_27_9 = new TagInfo("c:if", //$NON-NLS-1$
            27, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_8 = new TagInfo("c:get", //$NON-NLS-1$
            28, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_13 = new TagInfo("c:get", //$NON-NLS-1$
            31, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        out.write("function delete");  //$NON-NLS-1$        
        out.setTag("get",15,54);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_1_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_16.setRuntimeParent(null);
        _jettag_c_get_1_16.setTagInfo(_td_c_get_1_16);
        _jettag_c_get_1_16.doStart(context, out);
        _jettag_c_get_1_16.doEnd();
        out.setTag(null,-1,-1);
        out.write("(id, pageBack) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\twindow.location = \"/");  //$NON-NLS-1$        
        out.setTag("get",92,131);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_2_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_22); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_2_22.setRuntimeParent(null);
        _jettag_c_get_2_22.setTagInfo(_td_c_get_2_22);
        _jettag_c_get_2_22.doStart(context, out);
        _jettag_c_get_2_22.doEnd();
        out.setTag(null,-1,-1);
        out.write("/delete.php?id=\" + id + \"&pageBack=\" + pageBack;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("function update");  //$NON-NLS-1$        
        out.setTag("get",198,237);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_5_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_5_16.setRuntimeParent(null);
        _jettag_c_get_5_16.setTagInfo(_td_c_get_5_16);
        _jettag_c_get_5_16.doStart(context, out);
        _jettag_c_get_5_16.doEnd();
        out.setTag(null,-1,-1);
        out.write("(id) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t$(\"#id\").val(id);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(66);
        out.setTag("iterate",264,330);
        RuntimeTagElement _jettag_c_iterate_7_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_7_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_7_2.setRuntimeParent(null);
        _jettag_c_iterate_7_2.setTagInfo(_td_c_iterate_7_2);
        _jettag_c_iterate_7_2.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_7_2.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_7_2.getTagInfo().getAttribute("delimiter"),264,330);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(61);
            out.setTag("if",330,391);
            RuntimeTagElement _jettag_c_if_8_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_8_3.setRuntimeParent(_jettag_c_iterate_7_2);
            _jettag_c_if_8_3.setTagInfo(_td_c_if_8_3);
            _jettag_c_if_8_3.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_8_3.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t$(\"#table");  //$NON-NLS-1$        
                out.setTag("get",403,461);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_9_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_9_12.setRuntimeParent(_jettag_c_if_8_3);
                _jettag_c_get_9_12.setTagInfo(_td_c_get_9_12);
                _jettag_c_get_9_12.doStart(context, out);
                _jettag_c_get_9_12.doEnd();
                out.setTag(null,-1,-1);
                out.write("formAdd\").bootstrapTable('uncheckAll');");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t$(\"#table");  //$NON-NLS-1$        
                out.setTag("get",512,570);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_10_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_10_12.setRuntimeParent(_jettag_c_if_8_3);
                _jettag_c_get_10_12.setTagInfo(_td_c_get_10_12);
                _jettag_c_get_10_12.doStart(context, out);
                _jettag_c_get_10_12.doEnd();
                out.setTag(null,-1,-1);
                out.write("formAdd\").bootstrapTable('checkBy', {field:'id', values:[$(\"#");  //$NON-NLS-1$        
                out.setTag("get",631,670);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_10_131 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_131); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_10_131.setRuntimeParent(_jettag_c_if_8_3);
                _jettag_c_get_10_131.setTagInfo(_td_c_get_10_131);
                _jettag_c_get_10_131.doStart(context, out);
                _jettag_c_get_10_131.doEnd();
                out.setTag(null,-1,-1);
                out.write("_\" + id + \"_");  //$NON-NLS-1$        
                out.setTag("get",682,722);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_10_182 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_182); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_10_182.setRuntimeParent(_jettag_c_if_8_3);
                _jettag_c_get_10_182.setTagInfo(_td_c_get_10_182);
                _jettag_c_get_10_182.doStart(context, out);
                _jettag_c_get_10_182.doEnd();
                out.setTag(null,-1,-1);
                out.write("\").val()]});");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t$(\"#txt");  //$NON-NLS-1$        
                out.setTag("get",744,802);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_11_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_10); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_11_10.setRuntimeParent(_jettag_c_if_8_3);
                _jettag_c_get_11_10.setTagInfo(_td_c_get_11_10);
                _jettag_c_get_11_10.doStart(context, out);
                _jettag_c_get_11_10.doEnd();
                out.setTag(null,-1,-1);
                out.write("formAdd\").val(JSON.stringify($(\"#table");  //$NON-NLS-1$        
                out.setTag("get",840,898);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_11_106 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_106); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_11_106.setRuntimeParent(_jettag_c_if_8_3);
                _jettag_c_get_11_106.setTagInfo(_td_c_get_11_106);
                _jettag_c_get_11_106.doStart(context, out);
                _jettag_c_get_11_106.doEnd();
                out.setTag(null,-1,-1);
                out.write("formAdd\").bootstrapTable('getSelections')));");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_8_3.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_8_3.doEnd();
            out.endTag("if",553);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(67);
            out.setTag("if",951,1018);
            RuntimeTagElement _jettag_c_if_12_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_12_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_12_9.setRuntimeParent(_jettag_c_iterate_7_2);
            _jettag_c_if_12_9.setTagInfo(_td_c_if_12_9);
            _jettag_c_if_12_9.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_12_9.okToProcessBody()) {
                out.write("$(\"#");  //$NON-NLS-1$        
                out.setTag("get",1022,1062);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_13_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_13_8.setRuntimeParent(_jettag_c_if_12_9);
                _jettag_c_get_13_8.setTagInfo(_td_c_get_13_8);
                _jettag_c_get_13_8.doStart(context, out);
                _jettag_c_get_13_8.doEnd();
                out.setTag(null,-1,-1);
                out.write("\").val($(\"#");  //$NON-NLS-1$        
                out.setTag("get",1073,1112);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_13_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_59); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_13_59.setRuntimeParent(_jettag_c_if_12_9);
                _jettag_c_get_13_59.setTagInfo(_td_c_get_13_59);
                _jettag_c_get_13_59.doStart(context, out);
                _jettag_c_get_13_59.doEnd();
                out.setTag(null,-1,-1);
                out.write("_\" + id + \"_");  //$NON-NLS-1$        
                out.setTag("get",1124,1164);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_13_110 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_110); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_13_110.setRuntimeParent(_jettag_c_if_12_9);
                _jettag_c_get_13_110.setTagInfo(_td_c_get_13_110);
                _jettag_c_get_13_110.doStart(context, out);
                _jettag_c_get_13_110.doEnd();
                out.setTag(null,-1,-1);
                out.write("\").val());");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_12_9.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_12_9.doEnd();
            out.endTag("if",158);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_7_2.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_7_2.doEnd();
        out.loopEnd();
        out.endTag("iterate",853);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t$(\"#formAdd");  //$NON-NLS-1$        
        out.setTag("get",1210,1249);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_16_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_16_13.setRuntimeParent(null);
        _jettag_c_get_16_13.setTagInfo(_td_c_get_16_13);
        _jettag_c_get_16_13.doStart(context, out);
        _jettag_c_get_16_13.doEnd();
        out.setTag(null,-1,-1);
        out.write("\").modal();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\treturn true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("function add");  //$NON-NLS-1$        
        out.setTag("get",1291,1330);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_21_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_13.setRuntimeParent(null);
        _jettag_c_get_21_13.setTagInfo(_td_c_get_21_13);
        _jettag_c_get_21_13.doStart(context, out);
        _jettag_c_get_21_13.doEnd();
        out.setTag(null,-1,-1);
        out.write("() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t$(\"#id\").val(\"\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(66);
        out.setTag("iterate",1355,1421);
        RuntimeTagElement _jettag_c_iterate_23_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_23_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_23_2.setRuntimeParent(null);
        _jettag_c_iterate_23_2.setTagInfo(_td_c_iterate_23_2);
        _jettag_c_iterate_23_2.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_23_2.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_23_2.getTagInfo().getAttribute("delimiter"),1355,1421);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(64);
            out.setTag("if",1421,1485);
            RuntimeTagElement _jettag_c_if_24_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_24_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_24_3.setRuntimeParent(_jettag_c_iterate_23_2);
            _jettag_c_if_24_3.setTagInfo(_td_c_if_24_3);
            _jettag_c_if_24_3.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_24_3.okToProcessBody()) {
                out.write("$(\"#table");  //$NON-NLS-1$        
                out.setTag("get",1494,1552);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_25_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_25_13.setRuntimeParent(_jettag_c_if_24_3);
                _jettag_c_get_25_13.setTagInfo(_td_c_get_25_13);
                _jettag_c_get_25_13.doStart(context, out);
                _jettag_c_get_25_13.doEnd();
                out.setTag(null,-1,-1);
                out.write("formAdd\").bootstrapTable('uncheckAll');");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t$(\"#txt");  //$NON-NLS-1$        
                out.setTag("get",1601,1659);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_26_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_10); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_26_10.setRuntimeParent(_jettag_c_if_24_3);
                _jettag_c_get_26_10.setTagInfo(_td_c_get_26_10);
                _jettag_c_get_26_10.doStart(context, out);
                _jettag_c_get_26_10.doEnd();
                out.setTag(null,-1,-1);
                out.write("formAdd\").val(\"\");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_24_3.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_24_3.doEnd();
            out.endTag("if",194);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(67);
            out.setTag("if",1686,1753);
            RuntimeTagElement _jettag_c_if_27_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_27_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_27_9.setRuntimeParent(_jettag_c_iterate_23_2);
            _jettag_c_if_27_9.setTagInfo(_td_c_if_27_9);
            _jettag_c_if_27_9.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_27_9.okToProcessBody()) {
                out.write("$(\"#");  //$NON-NLS-1$        
                out.setTag("get",1757,1797);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_28_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_28_8.setRuntimeParent(_jettag_c_if_27_9);
                _jettag_c_get_28_8.setTagInfo(_td_c_get_28_8);
                _jettag_c_get_28_8.doStart(context, out);
                _jettag_c_get_28_8.doEnd();
                out.setTag(null,-1,-1);
                out.write("\").val(\"\");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_27_9.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_27_9.doEnd();
            out.endTag("if",57);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_23_2.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_23_2.doEnd();
        out.loopEnd();
        out.endTag("iterate",396);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t$(\"#formAdd");  //$NON-NLS-1$        
        out.setTag("get",1844,1883);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_31_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_31_13.setRuntimeParent(null);
        _jettag_c_get_31_13.setTagInfo(_td_c_get_31_13);
        _jettag_c_get_31_13.doStart(context, out);
        _jettag_c_get_31_13.doEnd();
        out.setTag(null,-1,-1);
        out.write("\").modal();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\treturn true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.popTemplateFile();
    }
}
