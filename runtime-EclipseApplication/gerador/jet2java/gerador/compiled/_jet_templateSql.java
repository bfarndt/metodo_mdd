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
    private static final TagInfo _td_c_if_14_17 = new TagInfo("c:if", //$NON-NLS-1$
            14, 17,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@required != ''", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_13 = new TagInfo("c:get", //$NON-NLS-1$
            17, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_17_81 = new TagInfo("c:iterate", //$NON-NLS-1$
            17, 81,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_18_4 = new TagInfo("c:if", //$NON-NLS-1$
            18, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and ($currentFeature/@min <= 1) and ($currentFeature/@max <= 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_14 = new TagInfo("c:get", //$NON-NLS-1$
            20, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_61 = new TagInfo("c:get", //$NON-NLS-1$
            20, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_120 = new TagInfo("c:get", //$NON-NLS-1$
            20, 120,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_15 = new TagInfo("c:get", //$NON-NLS-1$
            21, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_26_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            26, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_26_65 = new TagInfo("c:if", //$NON-NLS-1$
            26, 65,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and (($currentFeature/@min > 1) or ($currentFeature/@max > 1))", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_16 = new TagInfo("c:get", //$NON-NLS-1$
            27, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_63 = new TagInfo("c:get", //$NON-NLS-1$
            27, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_2 = new TagInfo("c:get", //$NON-NLS-1$
            30, 2,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_2 = new TagInfo("c:get", //$NON-NLS-1$
            31, 2,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
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
    private static final TagInfo _td_c_get_35_13 = new TagInfo("c:get", //$NON-NLS-1$
            35, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_60 = new TagInfo("c:get", //$NON-NLS-1$
            35, 60,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_101 = new TagInfo("c:get", //$NON-NLS-1$
            35, 101,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_166 = new TagInfo("c:get", //$NON-NLS-1$
            35, 166,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_14 = new TagInfo("c:get", //$NON-NLS-1$
            36, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_13 = new TagInfo("c:get", //$NON-NLS-1$
            38, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_60 = new TagInfo("c:get", //$NON-NLS-1$
            38, 60,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_101 = new TagInfo("c:get", //$NON-NLS-1$
            38, 101,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_185 = new TagInfo("c:get", //$NON-NLS-1$
            38, 185,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_14 = new TagInfo("c:get", //$NON-NLS-1$
            39, 14,
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
            out.write("\tid bigserial NOT NULL,");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(66);
            out.setTag("iterate",148,214);
            RuntimeTagElement _jettag_c_iterate_5_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_5_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_5_2.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_iterate_5_2.setTagInfo(_td_c_iterate_5_2);
            _jettag_c_iterate_5_2.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_5_2.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_5_2.getTagInfo().getAttribute("delimiter"),148,214);
                out.loopIterate();
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(172);
                out.setTag("if",214,386);
                RuntimeTagElement _jettag_c_if_6_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_6_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_6_3.setRuntimeParent(_jettag_c_iterate_5_2);
                _jettag_c_if_6_3.setTagInfo(_td_c_if_6_3);
                _jettag_c_if_6_3.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_6_3.okToProcessBody()) {
                    out.setTag("get",386,426);
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
                    out.setTag("if",427,487);
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
                    out.setTag("if",498,555);
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
                    out.setTag("if",569,628);
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
                    out.setTag("if",639,697);
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
                    out.setTag("if",726,788);
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
                    out.setTag("if",800,906);
                    RuntimeTagElement _jettag_c_if_12_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_12_16); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_12_16.setRuntimeParent(_jettag_c_if_6_3);
                    _jettag_c_if_12_16.setTagInfo(_td_c_if_12_16);
                    _jettag_c_if_12_16.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_c_if_12_16.okToProcessBody()) {
                        out.setTag("get",906,955);
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
                    out.setTag("if",962,1026);
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
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(45);
                    out.setTag("if",1039,1084);
                    RuntimeTagElement _jettag_c_if_14_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_14_17); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_14_17.setRuntimeParent(_jettag_c_if_6_3);
                    _jettag_c_if_14_17.setTagInfo(_td_c_if_14_17);
                    _jettag_c_if_14_17.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_c_if_14_17.okToProcessBody()) {
                        out.write(" NOT NULL");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_if_14_17.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_if_14_17.doEnd();
                    out.endTag("if",9);
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
                out.endTag("if",717);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
    out.bodyContentStart();
                _jettag_c_iterate_5_2.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_5_2.doEnd();
            out.loopEnd();
            out.endTag("iterate",896);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write("created_at timestamp with time zone,");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tupdate_at timestamp with time zone,");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tCONSTRAINT ");  //$NON-NLS-1$        
            out.setTag("get",1208,1254);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(46);
            RuntimeTagElement _jettag_c_get_17_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_13); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_17_13.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_17_13.setTagInfo(_td_c_get_17_13);
            _jettag_c_get_17_13.doStart(context, out);
            _jettag_c_get_17_13.doEnd();
            out.setTag(null,-1,-1);
            out.write("_pkey PRIMARY KEY (id)");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(67);
            out.setTag("iterate",1276,1343);
            RuntimeTagElement _jettag_c_iterate_17_81 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_17_81); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_17_81.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_iterate_17_81.setTagInfo(_td_c_iterate_17_81);
            _jettag_c_iterate_17_81.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_17_81.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_17_81.getTagInfo().getAttribute("delimiter"),1276,1343);
                out.loopIterate();
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(128);
                out.setTag("if",1343,1471);
                RuntimeTagElement _jettag_c_if_18_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_18_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_18_4.setRuntimeParent(_jettag_c_iterate_17_81);
                _jettag_c_if_18_4.setTagInfo(_td_c_if_18_4);
                _jettag_c_if_18_4.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_18_4.okToProcessBody()) {
                    out.write(",");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\tCONSTRAINT ");  //$NON-NLS-1$        
                    out.setTag("get",1486,1532);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_20_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_14); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_20_14.setRuntimeParent(_jettag_c_if_18_4);
                    _jettag_c_get_20_14.setTagInfo(_td_c_get_20_14);
                    _jettag_c_get_20_14.doStart(context, out);
                    _jettag_c_get_20_14.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",1533,1573);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_20_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_61); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_20_61.setRuntimeParent(_jettag_c_if_18_4);
                    _jettag_c_get_20_61.setTagInfo(_td_c_get_20_61);
                    _jettag_c_get_20_61.doStart(context, out);
                    _jettag_c_get_20_61.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_fkey FOREIGN KEY (");  //$NON-NLS-1$        
                    out.setTag("get",1592,1632);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_20_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_120); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_20_120.setRuntimeParent(_jettag_c_if_18_4);
                    _jettag_c_get_20_120.setTagInfo(_td_c_get_20_120);
                    _jettag_c_get_20_120.doStart(context, out);
                    _jettag_c_get_20_120.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(")");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\tREFERENCES ");  //$NON-NLS-1$        
                    out.setTag("get",1648,1713);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_21_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_15); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_21_15.setRuntimeParent(_jettag_c_if_18_4);
                    _jettag_c_get_21_15.setTagInfo(_td_c_get_21_15);
                    _jettag_c_get_21_15.doStart(context, out);
                    _jettag_c_get_21_15.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" (id) MATCH SIMPLE");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\tON UPDATE NO ACTION ON DELETE NO ACTION");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_18_4.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_18_4.doEnd();
                out.endTag("if",305);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
    out.bodyContentStart();
                _jettag_c_iterate_17_81.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_17_81.doEnd();
            out.loopEnd();
            out.endTag("iterate",440);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
            out.write(");");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(64);
            out.setTag("iterate",1800,1864);
            RuntimeTagElement _jettag_c_iterate_26_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_26_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_26_1.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_iterate_26_1.setTagInfo(_td_c_iterate_26_1);
            _jettag_c_iterate_26_1.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_26_1.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_26_1.getTagInfo().getAttribute("delimiter"),1800,1864);
                out.loopIterate();
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(126);
                out.setTag("if",1864,1990);
                RuntimeTagElement _jettag_c_if_26_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_26_65); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_26_65.setRuntimeParent(_jettag_c_iterate_26_1);
                _jettag_c_if_26_65.setTagInfo(_td_c_if_26_65);
                _jettag_c_if_26_65.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_26_65.okToProcessBody()) {
                    out.write("CREATE TABLE ");  //$NON-NLS-1$        
                    out.setTag("get",2003,2049);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_27_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_16); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_27_16.setRuntimeParent(_jettag_c_if_26_65);
                    _jettag_c_get_27_16.setTagInfo(_td_c_get_27_16);
                    _jettag_c_get_27_16.doStart(context, out);
                    _jettag_c_get_27_16.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",2050,2115);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_27_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_63); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_27_63.setRuntimeParent(_jettag_c_if_26_65);
                    _jettag_c_get_27_63.setTagInfo(_td_c_get_27_63);
                    _jettag_c_get_27_63.doStart(context, out);
                    _jettag_c_get_27_63.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("(");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tid bigserial,");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t");  //$NON-NLS-1$        
                    out.setTag("get",2134,2180);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_30_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_30_2.setRuntimeParent(_jettag_c_if_26_65);
                    _jettag_c_get_30_2.setTagInfo(_td_c_get_30_2);
                    _jettag_c_get_30_2.doStart(context, out);
                    _jettag_c_get_30_2.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_id bigint,");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t");  //$NON-NLS-1$        
                    out.setTag("get",2193,2258);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_31_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_31_2.setRuntimeParent(_jettag_c_if_26_65);
                    _jettag_c_get_31_2.setTagInfo(_td_c_get_31_2);
                    _jettag_c_get_31_2.doStart(context, out);
                    _jettag_c_get_31_2.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_id bigint,");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tcreated_at timestamp with time zone,");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tupdate_at timestamp with time zone,");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tCONSTRAINT ");  //$NON-NLS-1$        
                    out.setTag("get",2357,2403);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_34_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_34_13.setRuntimeParent(_jettag_c_if_26_65);
                    _jettag_c_get_34_13.setTagInfo(_td_c_get_34_13);
                    _jettag_c_get_34_13.doStart(context, out);
                    _jettag_c_get_34_13.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",2404,2444);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_34_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_60); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_34_60.setRuntimeParent(_jettag_c_if_26_65);
                    _jettag_c_get_34_60.setTagInfo(_td_c_get_34_60);
                    _jettag_c_get_34_60.doStart(context, out);
                    _jettag_c_get_34_60.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_pkey PRIMARY KEY (id),");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tCONSTRAINT ");  //$NON-NLS-1$        
                    out.setTag("get",2480,2526);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_35_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_35_13.setRuntimeParent(_jettag_c_if_26_65);
                    _jettag_c_get_35_13.setTagInfo(_td_c_get_35_13);
                    _jettag_c_get_35_13.doStart(context, out);
                    _jettag_c_get_35_13.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",2527,2567);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_35_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_60); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_35_60.setRuntimeParent(_jettag_c_if_26_65);
                    _jettag_c_get_35_60.setTagInfo(_td_c_get_35_60);
                    _jettag_c_get_35_60.doStart(context, out);
                    _jettag_c_get_35_60.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",2568,2614);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_35_101 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_101); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_35_101.setRuntimeParent(_jettag_c_if_26_65);
                    _jettag_c_get_35_101.setTagInfo(_td_c_get_35_101);
                    _jettag_c_get_35_101.doStart(context, out);
                    _jettag_c_get_35_101.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_fkey FOREIGN KEY (");  //$NON-NLS-1$        
                    out.setTag("get",2633,2679);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_35_166 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_166); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_35_166.setRuntimeParent(_jettag_c_if_26_65);
                    _jettag_c_get_35_166.setTagInfo(_td_c_get_35_166);
                    _jettag_c_get_35_166.doStart(context, out);
                    _jettag_c_get_35_166.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_id)");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\tREFERENCES ");  //$NON-NLS-1$        
                    out.setTag("get",2697,2743);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_36_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_14); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_36_14.setRuntimeParent(_jettag_c_if_26_65);
                    _jettag_c_get_36_14.setTagInfo(_td_c_get_36_14);
                    _jettag_c_get_36_14.doStart(context, out);
                    _jettag_c_get_36_14.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" (id) MATCH SIMPLE");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\tON UPDATE NO ACTION ON DELETE NO ACTION,");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tCONSTRAINT ");  //$NON-NLS-1$        
                    out.setTag("get",2817,2863);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_38_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_38_13.setRuntimeParent(_jettag_c_if_26_65);
                    _jettag_c_get_38_13.setTagInfo(_td_c_get_38_13);
                    _jettag_c_get_38_13.doStart(context, out);
                    _jettag_c_get_38_13.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",2864,2904);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_38_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_60); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_38_60.setRuntimeParent(_jettag_c_if_26_65);
                    _jettag_c_get_38_60.setTagInfo(_td_c_get_38_60);
                    _jettag_c_get_38_60.doStart(context, out);
                    _jettag_c_get_38_60.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",2905,2970);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_38_101 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_101); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_38_101.setRuntimeParent(_jettag_c_if_26_65);
                    _jettag_c_get_38_101.setTagInfo(_td_c_get_38_101);
                    _jettag_c_get_38_101.doStart(context, out);
                    _jettag_c_get_38_101.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_fkey FOREIGN KEY (");  //$NON-NLS-1$        
                    out.setTag("get",2989,3054);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_38_185 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_185); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_38_185.setRuntimeParent(_jettag_c_if_26_65);
                    _jettag_c_get_38_185.setTagInfo(_td_c_get_38_185);
                    _jettag_c_get_38_185.doStart(context, out);
                    _jettag_c_get_38_185.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_id)");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\tREFERENCES ");  //$NON-NLS-1$        
                    out.setTag("get",3072,3137);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_39_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_14); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_39_14.setRuntimeParent(_jettag_c_if_26_65);
                    _jettag_c_get_39_14.setTagInfo(_td_c_get_39_14);
                    _jettag_c_get_39_14.doStart(context, out);
                    _jettag_c_get_39_14.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" (id) MATCH SIMPLE");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\tON UPDATE NO ACTION ON DELETE NO ACTION");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(");");  //$NON-NLS-1$        
                    out.write(NL);         
        out.bodyContentStart();
                    _jettag_c_if_26_65.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_26_65.doEnd();
                out.endTag("if",1211);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
    out.bodyContentStart();
                _jettag_c_iterate_26_1.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_26_1.doEnd();
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
        out.endTag("iterate",3161);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.popTemplateFile();
    }
}
