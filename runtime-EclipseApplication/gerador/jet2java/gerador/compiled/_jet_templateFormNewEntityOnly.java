package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_templateFormNewEntityOnly implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_templateFormNewEntityOnly(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_iterate_1_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            1, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentForm/entity", //$NON-NLS-1$
                "currentEntity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_35 = new TagInfo("c:get", //$NON-NLS-1$
            3, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_92 = new TagInfo("c:get", //$NON-NLS-1$
            5, 92,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_49 = new TagInfo("c:get", //$NON-NLS-1$
            6, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentPage/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_7_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            7, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_9_7 = new TagInfo("c:if", //$NON-NLS-1$
            9, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'string') or ($currentFeature/DataType/@name = 'int') or ($currentFeature/DataType/@name = 'float') or ($currentFeature/DataType/@name = 'time')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_40 = new TagInfo("c:get", //$NON-NLS-1$
            10, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_33 = new TagInfo("c:get", //$NON-NLS-1$
            11, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_79 = new TagInfo("c:get", //$NON-NLS-1$
            11, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_13_7 = new TagInfo("c:if", //$NON-NLS-1$
            13, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'currency')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_40 = new TagInfo("c:get", //$NON-NLS-1$
            14, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_33 = new TagInfo("c:get", //$NON-NLS-1$
            15, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_79 = new TagInfo("c:get", //$NON-NLS-1$
            15, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_17_7 = new TagInfo("c:if", //$NON-NLS-1$
            17, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'date')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_40 = new TagInfo("c:get", //$NON-NLS-1$
            18, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_33 = new TagInfo("c:get", //$NON-NLS-1$
            19, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_79 = new TagInfo("c:get", //$NON-NLS-1$
            19, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_21_7 = new TagInfo("c:if", //$NON-NLS-1$
            21, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'boolean')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_40 = new TagInfo("c:get", //$NON-NLS-1$
            22, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_37 = new TagInfo("c:get", //$NON-NLS-1$
            23, 37,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_83 = new TagInfo("c:get", //$NON-NLS-1$
            23, 83,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(60);
        out.setTag("iterate",0,60);
        RuntimeTagElement _jettag_c_iterate_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_1_1.setRuntimeParent(null);
        _jettag_c_iterate_1_1.setTagInfo(_td_c_iterate_1_1);
        _jettag_c_iterate_1_1.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_1_1.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_1_1.getTagInfo().getAttribute("delimiter"),0,60);
            out.loopIterate();
            out.write(NL);         
            out.write("\t<div class=\"panel panel-default\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<div class=\"panel-heading\">Novo ");  //$NON-NLS-1$        
            out.setTag("get",130,169);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
            RuntimeTagElement _jettag_c_get_3_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_35); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_3_35.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_3_35.setTagInfo(_td_c_get_3_35);
            _jettag_c_get_3_35.doStart(context, out);
            _jettag_c_get_3_35.doEnd();
            out.setTag(null,-1,-1);
            out.write("</div>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<div class=\"panel-body\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<form class=\"bs-example bs-example-form\" data-example-id=\"simple-input-groups\" action=\"/");  //$NON-NLS-1$        
            out.setTag("get",294,333);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
            RuntimeTagElement _jettag_c_get_5_92 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_92); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_5_92.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_5_92.setTagInfo(_td_c_get_5_92);
            _jettag_c_get_5_92.doStart(context, out);
            _jettag_c_get_5_92.doEnd();
            out.setTag(null,-1,-1);
            out.write("/save.php\" method=\"post\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t<input type=\"hidden\" name=\"pageBack\" value=\"");  //$NON-NLS-1$        
            out.setTag("get",407,444);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(37);
            RuntimeTagElement _jettag_c_get_6_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_49); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_6_49.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_6_49.setTagInfo(_td_c_get_6_49);
            _jettag_c_get_6_49.doStart(context, out);
            _jettag_c_get_6_49.doEnd();
            out.setTag(null,-1,-1);
            out.write("\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(64);
            out.setTag("iterate",451,515);
            RuntimeTagElement _jettag_c_iterate_7_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_7_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_7_5.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_iterate_7_5.setTagInfo(_td_c_iterate_7_5);
            _jettag_c_iterate_7_5.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_7_5.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_7_5.getTagInfo().getAttribute("delimiter"),451,515);
                out.loopIterate();
                out.write(NL);         
                out.write("\t\t\t\t\t<div class=\"input-group\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(192);
                out.setTag("if",553,745);
                RuntimeTagElement _jettag_c_if_9_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_9_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_9_7.setRuntimeParent(_jettag_c_iterate_7_5);
                _jettag_c_if_9_7.setTagInfo(_td_c_if_9_7);
                _jettag_c_if_9_7.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_9_7.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t<span class=\"input-group-addon\">");  //$NON-NLS-1$        
                    out.setTag("get",785,825);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_10_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_40); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_10_40.setRuntimeParent(_jettag_c_if_9_7);
                    _jettag_c_get_10_40.setTagInfo(_td_c_get_10_40);
                    _jettag_c_get_10_40.doStart(context, out);
                    _jettag_c_get_10_40.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("</span>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"");  //$NON-NLS-1$        
                    out.setTag("get",865,905);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_11_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_33); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_11_33.setRuntimeParent(_jettag_c_if_9_7);
                    _jettag_c_get_11_33.setTagInfo(_td_c_get_11_33);
                    _jettag_c_get_11_33.doStart(context, out);
                    _jettag_c_get_11_33.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\" id=\"");  //$NON-NLS-1$        
                    out.setTag("get",911,951);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_11_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_79); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_11_79.setRuntimeParent(_jettag_c_if_9_7);
                    _jettag_c_get_11_79.setTagInfo(_td_c_get_11_79);
                    _jettag_c_get_11_79.doStart(context, out);
                    _jettag_c_get_11_79.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\" class=\"form-control\" placeholder=\"\" aria-describedby=\"basic-addon1\">");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_9_7.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_9_7.doEnd();
                out.endTag("if",283);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(59);
                out.setTag("if",1042,1101);
                RuntimeTagElement _jettag_c_if_13_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_13_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_13_7.setRuntimeParent(_jettag_c_iterate_7_5);
                _jettag_c_if_13_7.setTagInfo(_td_c_if_13_7);
                _jettag_c_if_13_7.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_13_7.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t<span class=\"input-group-addon\">");  //$NON-NLS-1$        
                    out.setTag("get",1141,1181);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_14_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_40); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_14_40.setRuntimeParent(_jettag_c_if_13_7);
                    _jettag_c_get_14_40.setTagInfo(_td_c_get_14_40);
                    _jettag_c_get_14_40.doStart(context, out);
                    _jettag_c_get_14_40.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" (R$)</span>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"");  //$NON-NLS-1$        
                    out.setTag("get",1226,1266);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_15_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_33); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_15_33.setRuntimeParent(_jettag_c_if_13_7);
                    _jettag_c_get_15_33.setTagInfo(_td_c_get_15_33);
                    _jettag_c_get_15_33.doStart(context, out);
                    _jettag_c_get_15_33.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\" id=\"");  //$NON-NLS-1$        
                    out.setTag("get",1272,1312);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_15_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_79); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_15_79.setRuntimeParent(_jettag_c_if_13_7);
                    _jettag_c_get_15_79.setTagInfo(_td_c_get_15_79);
                    _jettag_c_get_15_79.doStart(context, out);
                    _jettag_c_get_15_79.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\" class=\"form-control\" placeholder=\"\" aria-describedby=\"basic-addon1\">");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_13_7.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_13_7.doEnd();
                out.endTag("if",288);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(55);
                out.setTag("if",1403,1458);
                RuntimeTagElement _jettag_c_if_17_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_17_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_17_7.setRuntimeParent(_jettag_c_iterate_7_5);
                _jettag_c_if_17_7.setTagInfo(_td_c_if_17_7);
                _jettag_c_if_17_7.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_17_7.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t<span class=\"input-group-addon\">");  //$NON-NLS-1$        
                    out.setTag("get",1498,1538);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_18_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_40); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_18_40.setRuntimeParent(_jettag_c_if_17_7);
                    _jettag_c_get_18_40.setTagInfo(_td_c_get_18_40);
                    _jettag_c_get_18_40.doStart(context, out);
                    _jettag_c_get_18_40.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("</span>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"");  //$NON-NLS-1$        
                    out.setTag("get",1578,1618);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_19_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_33); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_19_33.setRuntimeParent(_jettag_c_if_17_7);
                    _jettag_c_get_19_33.setTagInfo(_td_c_get_19_33);
                    _jettag_c_get_19_33.doStart(context, out);
                    _jettag_c_get_19_33.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\" id=\"");  //$NON-NLS-1$        
                    out.setTag("get",1624,1664);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_19_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_79); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_19_79.setRuntimeParent(_jettag_c_if_17_7);
                    _jettag_c_get_19_79.setTagInfo(_td_c_get_19_79);
                    _jettag_c_get_19_79.doStart(context, out);
                    _jettag_c_get_19_79.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\" class=\"form-control datepicker\" placeholder=\"\" aria-describedby=\"basic-addon1\">");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_17_7.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_17_7.doEnd();
                out.endTag("if",294);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(58);
                out.setTag("if",1766,1824);
                RuntimeTagElement _jettag_c_if_21_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_21_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_21_7.setRuntimeParent(_jettag_c_iterate_7_5);
                _jettag_c_if_21_7.setTagInfo(_td_c_if_21_7);
                _jettag_c_if_21_7.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_21_7.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t<span class=\"input-group-addon\">");  //$NON-NLS-1$        
                    out.setTag("get",1864,1904);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_22_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_40); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_22_40.setRuntimeParent(_jettag_c_if_21_7);
                    _jettag_c_get_22_40.setTagInfo(_td_c_get_22_40);
                    _jettag_c_get_22_40.doStart(context, out);
                    _jettag_c_get_22_40.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("</span>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"");  //$NON-NLS-1$        
                    out.setTag("get",1948,1988);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_23_37 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_37); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_23_37.setRuntimeParent(_jettag_c_if_21_7);
                    _jettag_c_get_23_37.setTagInfo(_td_c_get_23_37);
                    _jettag_c_get_23_37.doStart(context, out);
                    _jettag_c_get_23_37.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\" id=\"");  //$NON-NLS-1$        
                    out.setTag("get",1994,2034);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_23_83 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_83); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_23_83.setRuntimeParent(_jettag_c_if_21_7);
                    _jettag_c_get_23_83.setTagInfo(_td_c_get_23_83);
                    _jettag_c_get_23_83.doStart(context, out);
                    _jettag_c_get_23_83.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\" class=\"form-control\" placeholder=\"\" aria-describedby=\"basic-addon1\">");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_21_7.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_21_7.doEnd();
                out.endTag("if",287);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("\t\t\t\t\t</div>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t<br>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_iterate_7_5.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_7_5.doEnd();
            out.loopEnd();
            out.endTag("iterate",1630);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
            out.write("\t\t\t\t<div class=\"btn-group btn-group\" role=\"group\" aria-label=\"...\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t<button type=\"reset\" class=\"btn btn-default\">Limpar</button>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">Salvar</button>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t</div>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t</form>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</div>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</div>");  //$NON-NLS-1$        
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_iterate_1_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_1_1.doEnd();
        out.loopEnd();
        out.endTag("iterate",2338);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.popTemplateFile();
    }
}
