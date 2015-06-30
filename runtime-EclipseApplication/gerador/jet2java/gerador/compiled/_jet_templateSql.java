package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_templateSql implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_templateSql(String templateFile) {
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
                "/Domainmodel/Entity", //$NON-NLS-1$
                "currentEntity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_2_14 = new TagInfo("c:get", //$NON-NLS-1$
            2, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_5_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            5, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_6_3 = new TagInfo("c:if", //$NON-NLS-1$
            6, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name != '') or (($currentFeature/EntityType/entity/@name != '') and ($currentFeature/@min <= 1) and ($currentFeature/@max <= 1))", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_4 = new TagInfo("c:get", //$NON-NLS-1$
            7, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_7_45 = new TagInfo("c:if", //$NON-NLS-1$
            7, 45,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'string')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_15 = new TagInfo("c:if", //$NON-NLS-1$
            8, 15,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'int')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_9_18 = new TagInfo("c:if", //$NON-NLS-1$
            9, 18,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'float')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_10_15 = new TagInfo("c:if", //$NON-NLS-1$
            10, 15,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'time')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_11_33 = new TagInfo("c:if", //$NON-NLS-1$
            11, 33,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'currency')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_12_16 = new TagInfo("c:if", //$NON-NLS-1$
            12, 16,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'date') or ($currentFeature/DataType/@name = 'boolean')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_4 = new TagInfo("c:get", //$NON-NLS-1$
            13, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/DataType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_13_60 = new TagInfo("c:if", //$NON-NLS-1$
            13, 60,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_13 = new TagInfo("c:get", //$NON-NLS-1$
            17, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_18_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            18, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_18_66 = new TagInfo("c:if", //$NON-NLS-1$
            18, 66,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and ($currentFeature/@min <= 1) and ($currentFeature/@max <= 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_15 = new TagInfo("c:get", //$NON-NLS-1$
            19, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_62 = new TagInfo("c:get", //$NON-NLS-1$
            19, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_121 = new TagInfo("c:get", //$NON-NLS-1$
            19, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_15 = new TagInfo("c:get", //$NON-NLS-1$
            20, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_25_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            25, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_25_65 = new TagInfo("c:if", //$NON-NLS-1$
            25, 65,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and (($currentFeature/@min > 1) or ($currentFeature/@max > 1))", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_16 = new TagInfo("c:get", //$NON-NLS-1$
            26, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_63 = new TagInfo("c:get", //$NON-NLS-1$
            26, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_2 = new TagInfo("c:get", //$NON-NLS-1$
            29, 2,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_2 = new TagInfo("c:get", //$NON-NLS-1$
            30, 2,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_13 = new TagInfo("c:get", //$NON-NLS-1$
            33, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_60 = new TagInfo("c:get", //$NON-NLS-1$
            33, 60,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_13 = new TagInfo("c:get", //$NON-NLS-1$
            34, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_60 = new TagInfo("c:get", //$NON-NLS-1$
            34, 60,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_101 = new TagInfo("c:get", //$NON-NLS-1$
            34, 101,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_166 = new TagInfo("c:get", //$NON-NLS-1$
            34, 166,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_14 = new TagInfo("c:get", //$NON-NLS-1$
            35, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_13 = new TagInfo("c:get", //$NON-NLS-1$
            37, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_60 = new TagInfo("c:get", //$NON-NLS-1$
            37, 60,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_101 = new TagInfo("c:get", //$NON-NLS-1$
            37, 101,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_185 = new TagInfo("c:get", //$NON-NLS-1$
            37, 185,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_14 = new TagInfo("c:get", //$NON-NLS-1$
            38, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
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
            out.write("CREATE TABLE ");  //$NON-NLS-1$        
            out.setTag("get",74,120);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(46);
            RuntimeTagElement _jettag_c_get_2_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_14); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_2_14.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_2_14.setTagInfo(_td_c_get_2_14);
            _jettag_c_get_2_14.doStart(context, out);
            _jettag_c_get_2_14.doEnd();
            out.setTag(null,-1,-1);
            out.write(NL);         
            out.write("(");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tid bigserial,");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(66);
            out.setTag("iterate",139,205);
            RuntimeTagElement _jettag_c_iterate_5_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_5_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_5_2.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_iterate_5_2.setTagInfo(_td_c_iterate_5_2);
            _jettag_c_iterate_5_2.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_5_2.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_5_2.getTagInfo().getAttribute("delimiter"),139,205);
                out.loopIterate();
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(172);
                out.setTag("if",205,377);
                RuntimeTagElement _jettag_c_if_6_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_6_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_6_3.setRuntimeParent(_jettag_c_iterate_5_2);
                _jettag_c_if_6_3.setTagInfo(_td_c_if_6_3);
                _jettag_c_if_6_3.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_6_3.okToProcessBody()) {
                    out.setTag("get",377,417);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_7_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_7_4.setRuntimeParent(_jettag_c_if_6_3);
                    _jettag_c_get_7_4.setTagInfo(_td_c_get_7_4);
                    _jettag_c_get_7_4.doStart(context, out);
                    _jettag_c_get_7_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" ");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(60);
                    out.setTag("if",418,478);
                    RuntimeTagElement _jettag_c_if_7_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_7_45); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_7_45.setRuntimeParent(_jettag_c_if_6_3);
                    _jettag_c_if_7_45.setTagInfo(_td_c_if_7_45);
                    _jettag_c_if_7_45.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_c_if_7_45.okToProcessBody()) {
                        out.write("text");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_if_7_45.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_if_7_45.doEnd();
                    out.endTag("if",4);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(57);
                    out.setTag("if",489,546);
                    RuntimeTagElement _jettag_c_if_8_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_15); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_8_15.setRuntimeParent(_jettag_c_if_6_3);
                    _jettag_c_if_8_15.setTagInfo(_td_c_if_8_15);
                    _jettag_c_if_8_15.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_c_if_8_15.okToProcessBody()) {
                        out.write("integer");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_if_8_15.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_if_8_15.doEnd();
                    out.endTag("if",7);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(59);
                    out.setTag("if",560,619);
                    RuntimeTagElement _jettag_c_if_9_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_9_18); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_9_18.setRuntimeParent(_jettag_c_if_6_3);
                    _jettag_c_if_9_18.setTagInfo(_td_c_if_9_18);
                    _jettag_c_if_9_18.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_c_if_9_18.okToProcessBody()) {
                        out.write("real");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_if_9_18.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_if_9_18.doEnd();
                    out.endTag("if",4);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(58);
                    out.setTag("if",630,688);
                    RuntimeTagElement _jettag_c_if_10_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_10_15); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_10_15.setRuntimeParent(_jettag_c_if_6_3);
                    _jettag_c_if_10_15.setTagInfo(_td_c_if_10_15);
                    _jettag_c_if_10_15.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_c_if_10_15.okToProcessBody()) {
                        out.write("time without time zone");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_if_10_15.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_if_10_15.doEnd();
                    out.endTag("if",22);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(62);
                    out.setTag("if",717,779);
                    RuntimeTagElement _jettag_c_if_11_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_11_33); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_11_33.setRuntimeParent(_jettag_c_if_6_3);
                    _jettag_c_if_11_33.setTagInfo(_td_c_if_11_33);
                    _jettag_c_if_11_33.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_c_if_11_33.okToProcessBody()) {
                        out.write("money");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_if_11_33.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_if_11_33.doEnd();
                    out.endTag("if",5);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(106);
                    out.setTag("if",791,897);
                    RuntimeTagElement _jettag_c_if_12_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_12_16); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_12_16.setRuntimeParent(_jettag_c_if_6_3);
                    _jettag_c_if_12_16.setTagInfo(_td_c_if_12_16);
                    _jettag_c_if_12_16.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_c_if_12_16.okToProcessBody()) {
                        out.setTag("get",897,946);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(49);
                        RuntimeTagElement _jettag_c_get_13_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_4); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_13_4.setRuntimeParent(_jettag_c_if_12_16);
                        _jettag_c_get_13_4.setTagInfo(_td_c_get_13_4);
                        _jettag_c_get_13_4.doStart(context, out);
                        _jettag_c_get_13_4.doEnd();
                        out.setTag(null,-1,-1);
            out.bodyContentStart();
                        _jettag_c_if_12_16.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_if_12_16.doEnd();
                    out.endTag("if",49);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(64);
                    out.setTag("if",953,1017);
                    RuntimeTagElement _jettag_c_if_13_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_13_60); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_13_60.setRuntimeParent(_jettag_c_if_6_3);
                    _jettag_c_if_13_60.setTagInfo(_td_c_if_13_60);
                    _jettag_c_if_13_60.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_c_if_13_60.okToProcessBody()) {
                        out.write("bigint");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_if_13_60.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_if_13_60.doEnd();
                    out.endTag("if",6);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
                    out.write(",");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_6_3.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_6_3.doEnd();
                out.endTag("if",656);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
    out.bodyContentStart();
                _jettag_c_iterate_5_2.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_5_2.doEnd();
            out.loopEnd();
            out.endTag("iterate",835);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write("created_at timestamp with time zone,");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tupdate_at timestamp with time zone,");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tCONSTRAINT ");  //$NON-NLS-1$        
            out.setTag("get",1138,1184);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(46);
            RuntimeTagElement _jettag_c_get_17_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_13); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_17_13.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_17_13.setTagInfo(_td_c_get_17_13);
            _jettag_c_get_17_13.doStart(context, out);
            _jettag_c_get_17_13.doEnd();
            out.setTag(null,-1,-1);
            out.write("_pkey PRIMARY KEY (id)");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(64);
            out.setTag("iterate",1208,1272);
            RuntimeTagElement _jettag_c_iterate_18_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_18_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_18_2.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_iterate_18_2.setTagInfo(_td_c_iterate_18_2);
            _jettag_c_iterate_18_2.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_18_2.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_18_2.getTagInfo().getAttribute("delimiter"),1208,1272);
                out.loopIterate();
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(128);
                out.setTag("if",1272,1400);
                RuntimeTagElement _jettag_c_if_18_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_18_66); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_18_66.setRuntimeParent(_jettag_c_iterate_18_2);
                _jettag_c_if_18_66.setTagInfo(_td_c_if_18_66);
                _jettag_c_if_18_66.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_18_66.okToProcessBody()) {
                    out.write("CONSTRAINT ");  //$NON-NLS-1$        
                    out.setTag("get",1411,1457);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_19_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_15); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_19_15.setRuntimeParent(_jettag_c_if_18_66);
                    _jettag_c_get_19_15.setTagInfo(_td_c_get_19_15);
                    _jettag_c_get_19_15.doStart(context, out);
                    _jettag_c_get_19_15.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",1458,1498);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_19_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_62); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_19_62.setRuntimeParent(_jettag_c_if_18_66);
                    _jettag_c_get_19_62.setTagInfo(_td_c_get_19_62);
                    _jettag_c_get_19_62.doStart(context, out);
                    _jettag_c_get_19_62.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_fkey FOREIGN KEY (");  //$NON-NLS-1$        
                    out.setTag("get",1517,1557);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_19_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_121); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_19_121.setRuntimeParent(_jettag_c_if_18_66);
                    _jettag_c_get_19_121.setTagInfo(_td_c_get_19_121);
                    _jettag_c_get_19_121.doStart(context, out);
                    _jettag_c_get_19_121.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(")");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\tREFERENCES ");  //$NON-NLS-1$        
                    out.setTag("get",1573,1638);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_20_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_15); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_20_15.setRuntimeParent(_jettag_c_if_18_66);
                    _jettag_c_get_20_15.setTagInfo(_td_c_get_20_15);
                    _jettag_c_get_20_15.doStart(context, out);
                    _jettag_c_get_20_15.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" (id) MATCH SIMPLE");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\tON UPDATE NO ACTION ON DELETE NO ACTION");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_18_66.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_18_66.doEnd();
                out.endTag("if",301);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
    out.bodyContentStart();
                _jettag_c_iterate_18_2.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_18_2.doEnd();
            out.loopEnd();
            out.endTag("iterate",436);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
            out.write(");");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(64);
            out.setTag("iterate",1725,1789);
            RuntimeTagElement _jettag_c_iterate_25_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_25_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_25_1.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_iterate_25_1.setTagInfo(_td_c_iterate_25_1);
            _jettag_c_iterate_25_1.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_25_1.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_25_1.getTagInfo().getAttribute("delimiter"),1725,1789);
                out.loopIterate();
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(126);
                out.setTag("if",1789,1915);
                RuntimeTagElement _jettag_c_if_25_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_25_65); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_25_65.setRuntimeParent(_jettag_c_iterate_25_1);
                _jettag_c_if_25_65.setTagInfo(_td_c_if_25_65);
                _jettag_c_if_25_65.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_25_65.okToProcessBody()) {
                    out.write("CREATE TABLE ");  //$NON-NLS-1$        
                    out.setTag("get",1928,1974);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_26_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_16); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_26_16.setRuntimeParent(_jettag_c_if_25_65);
                    _jettag_c_get_26_16.setTagInfo(_td_c_get_26_16);
                    _jettag_c_get_26_16.doStart(context, out);
                    _jettag_c_get_26_16.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",1975,2040);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_26_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_63); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_26_63.setRuntimeParent(_jettag_c_if_25_65);
                    _jettag_c_get_26_63.setTagInfo(_td_c_get_26_63);
                    _jettag_c_get_26_63.doStart(context, out);
                    _jettag_c_get_26_63.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("(");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tid bigserial,");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t");  //$NON-NLS-1$        
                    out.setTag("get",2059,2105);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_29_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_29_2.setRuntimeParent(_jettag_c_if_25_65);
                    _jettag_c_get_29_2.setTagInfo(_td_c_get_29_2);
                    _jettag_c_get_29_2.doStart(context, out);
                    _jettag_c_get_29_2.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_id bigint,");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t");  //$NON-NLS-1$        
                    out.setTag("get",2118,2183);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_30_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_30_2.setRuntimeParent(_jettag_c_if_25_65);
                    _jettag_c_get_30_2.setTagInfo(_td_c_get_30_2);
                    _jettag_c_get_30_2.doStart(context, out);
                    _jettag_c_get_30_2.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_id bigint,");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tcreated_at timestamp with time zone,");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tupdate_at timestamp with time zone,");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tCONSTRAINT ");  //$NON-NLS-1$        
                    out.setTag("get",2282,2328);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_33_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_33_13.setRuntimeParent(_jettag_c_if_25_65);
                    _jettag_c_get_33_13.setTagInfo(_td_c_get_33_13);
                    _jettag_c_get_33_13.doStart(context, out);
                    _jettag_c_get_33_13.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",2329,2369);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_33_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_60); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_33_60.setRuntimeParent(_jettag_c_if_25_65);
                    _jettag_c_get_33_60.setTagInfo(_td_c_get_33_60);
                    _jettag_c_get_33_60.doStart(context, out);
                    _jettag_c_get_33_60.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_pkey PRIMARY KEY (id),");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tCONSTRAINT ");  //$NON-NLS-1$        
                    out.setTag("get",2405,2451);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_34_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_34_13.setRuntimeParent(_jettag_c_if_25_65);
                    _jettag_c_get_34_13.setTagInfo(_td_c_get_34_13);
                    _jettag_c_get_34_13.doStart(context, out);
                    _jettag_c_get_34_13.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",2452,2492);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_34_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_60); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_34_60.setRuntimeParent(_jettag_c_if_25_65);
                    _jettag_c_get_34_60.setTagInfo(_td_c_get_34_60);
                    _jettag_c_get_34_60.doStart(context, out);
                    _jettag_c_get_34_60.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",2493,2539);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_34_101 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_101); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_34_101.setRuntimeParent(_jettag_c_if_25_65);
                    _jettag_c_get_34_101.setTagInfo(_td_c_get_34_101);
                    _jettag_c_get_34_101.doStart(context, out);
                    _jettag_c_get_34_101.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_fkey FOREIGN KEY (");  //$NON-NLS-1$        
                    out.setTag("get",2558,2604);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_34_166 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_166); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_34_166.setRuntimeParent(_jettag_c_if_25_65);
                    _jettag_c_get_34_166.setTagInfo(_td_c_get_34_166);
                    _jettag_c_get_34_166.doStart(context, out);
                    _jettag_c_get_34_166.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_id)");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\tREFERENCES ");  //$NON-NLS-1$        
                    out.setTag("get",2622,2668);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_35_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_14); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_35_14.setRuntimeParent(_jettag_c_if_25_65);
                    _jettag_c_get_35_14.setTagInfo(_td_c_get_35_14);
                    _jettag_c_get_35_14.doStart(context, out);
                    _jettag_c_get_35_14.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" (id) MATCH SIMPLE");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\tON UPDATE NO ACTION ON DELETE NO ACTION,");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tCONSTRAINT ");  //$NON-NLS-1$        
                    out.setTag("get",2742,2788);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_37_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_37_13.setRuntimeParent(_jettag_c_if_25_65);
                    _jettag_c_get_37_13.setTagInfo(_td_c_get_37_13);
                    _jettag_c_get_37_13.doStart(context, out);
                    _jettag_c_get_37_13.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",2789,2829);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_37_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_60); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_37_60.setRuntimeParent(_jettag_c_if_25_65);
                    _jettag_c_get_37_60.setTagInfo(_td_c_get_37_60);
                    _jettag_c_get_37_60.doStart(context, out);
                    _jettag_c_get_37_60.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",2830,2895);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_37_101 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_101); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_37_101.setRuntimeParent(_jettag_c_if_25_65);
                    _jettag_c_get_37_101.setTagInfo(_td_c_get_37_101);
                    _jettag_c_get_37_101.doStart(context, out);
                    _jettag_c_get_37_101.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_fkey FOREIGN KEY (");  //$NON-NLS-1$        
                    out.setTag("get",2914,2979);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_37_185 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_185); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_37_185.setRuntimeParent(_jettag_c_if_25_65);
                    _jettag_c_get_37_185.setTagInfo(_td_c_get_37_185);
                    _jettag_c_get_37_185.doStart(context, out);
                    _jettag_c_get_37_185.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_id)");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\tREFERENCES ");  //$NON-NLS-1$        
                    out.setTag("get",2997,3062);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_38_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_14); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_38_14.setRuntimeParent(_jettag_c_if_25_65);
                    _jettag_c_get_38_14.setTagInfo(_td_c_get_38_14);
                    _jettag_c_get_38_14.doStart(context, out);
                    _jettag_c_get_38_14.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" (id) MATCH SIMPLE");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\tON UPDATE NO ACTION ON DELETE NO ACTION");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(");");  //$NON-NLS-1$        
                    out.write(NL);         
        out.bodyContentStart();
                    _jettag_c_if_25_65.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_25_65.doEnd();
                out.endTag("if",1211);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
    out.bodyContentStart();
                _jettag_c_iterate_25_1.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_25_1.doEnd();
            out.loopEnd();
            out.endTag("iterate",1344);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_iterate_1_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_1_1.doEnd();
        out.loopEnd();
        out.endTag("iterate",3086);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.popTemplateFile();
    }
}
