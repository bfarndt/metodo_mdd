package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_templateSql implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_f = "org.eclipse.jet.formatTags"; //$NON-NLS-1$

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
    private static final TagInfo _td_f_lc_2_14 = new TagInfo("f:lc", //$NON-NLS-1$
            2, 14,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_2_20 = new TagInfo("c:get", //$NON-NLS-1$
            2, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_5_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            5, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
                ", ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_3 = new TagInfo("c:get", //$NON-NLS-1$
            6, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_6_44 = new TagInfo("c:if", //$NON-NLS-1$
            6, 44,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'string')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_7_15 = new TagInfo("c:if", //$NON-NLS-1$
            7, 15,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'int')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_18 = new TagInfo("c:if", //$NON-NLS-1$
            8, 18,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'float')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_9_15 = new TagInfo("c:if", //$NON-NLS-1$
            9, 15,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'time')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_10_33 = new TagInfo("c:if", //$NON-NLS-1$
            10, 33,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'currency')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_11_16 = new TagInfo("c:if", //$NON-NLS-1$
            11, 16,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'date') or ($currentFeature/DataType/@name = 'boolean')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_4 = new TagInfo("c:get", //$NON-NLS-1$
            12, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/DataType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_12_60 = new TagInfo("c:if", //$NON-NLS-1$
            12, 60,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_14_13 = new TagInfo("f:lc", //$NON-NLS-1$
            14, 13,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_14_19 = new TagInfo("c:get", //$NON-NLS-1$
            14, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_15_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            15, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_15_66 = new TagInfo("c:if", //$NON-NLS-1$
            15, 66,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_16_15 = new TagInfo("f:lc", //$NON-NLS-1$
            16, 15,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_16_21 = new TagInfo("c:get", //$NON-NLS-1$
            16, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_68 = new TagInfo("c:get", //$NON-NLS-1$
            16, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_127 = new TagInfo("c:get", //$NON-NLS-1$
            16, 127,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_17_15 = new TagInfo("f:lc", //$NON-NLS-1$
            17, 15,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_17_21 = new TagInfo("c:get", //$NON-NLS-1$
            17, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
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
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(6);
            out.setTag("lc",74,80);
            RuntimeTagElement _jettag_f_lc_2_14 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_2_14); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_lc_2_14.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_f_lc_2_14.setTagInfo(_td_f_lc_2_14);
            _jettag_f_lc_2_14.doStart(context, out);
            JET2Writer _jettag_f_lc_2_14_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_f_lc_2_14.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.setTag("get",80,119);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_2_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_2_20.setRuntimeParent(_jettag_f_lc_2_14);
                _jettag_c_get_2_20.setTagInfo(_td_c_get_2_20);
                _jettag_c_get_2_20.doStart(context, out);
                _jettag_c_get_2_20.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_f_lc_2_14.handleBodyContent(out);
            }
            out = _jettag_f_lc_2_14_saved_out;
    out.bodyContentEnd();
            _jettag_f_lc_2_14.doEnd();
            out.endTag("lc",39);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("(");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tid bigserial,");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(81);
            out.setTag("iterate",145,226);
            RuntimeTagElement _jettag_c_iterate_5_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_5_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_5_2.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_iterate_5_2.setTagInfo(_td_c_iterate_5_2);
            _jettag_c_iterate_5_2.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_5_2.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_5_2.getTagInfo().getAttribute("delimiter"),145,226);
                out.loopIterate();
                out.setTag("get",226,266);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_6_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_6_3.setRuntimeParent(_jettag_c_iterate_5_2);
                _jettag_c_get_6_3.setTagInfo(_td_c_get_6_3);
                _jettag_c_get_6_3.doStart(context, out);
                _jettag_c_get_6_3.doEnd();
                out.setTag(null,-1,-1);
                out.write(" ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(60);
                out.setTag("if",267,327);
                RuntimeTagElement _jettag_c_if_6_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_6_44); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_6_44.setRuntimeParent(_jettag_c_iterate_5_2);
                _jettag_c_if_6_44.setTagInfo(_td_c_if_6_44);
                _jettag_c_if_6_44.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_6_44.okToProcessBody()) {
                    out.write("text");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_6_44.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_6_44.doEnd();
                out.endTag("if",4);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(57);
                out.setTag("if",338,395);
                RuntimeTagElement _jettag_c_if_7_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_7_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_7_15.setRuntimeParent(_jettag_c_iterate_5_2);
                _jettag_c_if_7_15.setTagInfo(_td_c_if_7_15);
                _jettag_c_if_7_15.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_7_15.okToProcessBody()) {
                    out.write("integer");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_7_15.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_7_15.doEnd();
                out.endTag("if",7);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(59);
                out.setTag("if",409,468);
                RuntimeTagElement _jettag_c_if_8_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_8_18.setRuntimeParent(_jettag_c_iterate_5_2);
                _jettag_c_if_8_18.setTagInfo(_td_c_if_8_18);
                _jettag_c_if_8_18.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_8_18.okToProcessBody()) {
                    out.write("real");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_8_18.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_8_18.doEnd();
                out.endTag("if",4);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(58);
                out.setTag("if",479,537);
                RuntimeTagElement _jettag_c_if_9_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_9_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_9_15.setRuntimeParent(_jettag_c_iterate_5_2);
                _jettag_c_if_9_15.setTagInfo(_td_c_if_9_15);
                _jettag_c_if_9_15.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_9_15.okToProcessBody()) {
                    out.write("time without time zone");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_9_15.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_9_15.doEnd();
                out.endTag("if",22);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(62);
                out.setTag("if",566,628);
                RuntimeTagElement _jettag_c_if_10_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_10_33); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_10_33.setRuntimeParent(_jettag_c_iterate_5_2);
                _jettag_c_if_10_33.setTagInfo(_td_c_if_10_33);
                _jettag_c_if_10_33.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_10_33.okToProcessBody()) {
                    out.write("money");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_10_33.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_10_33.doEnd();
                out.endTag("if",5);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(106);
                out.setTag("if",640,746);
                RuntimeTagElement _jettag_c_if_11_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_11_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_11_16.setRuntimeParent(_jettag_c_iterate_5_2);
                _jettag_c_if_11_16.setTagInfo(_td_c_if_11_16);
                _jettag_c_if_11_16.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_11_16.okToProcessBody()) {
                    out.setTag("get",746,795);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(49);
                    RuntimeTagElement _jettag_c_get_12_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_12_4.setRuntimeParent(_jettag_c_if_11_16);
                    _jettag_c_get_12_4.setTagInfo(_td_c_get_12_4);
                    _jettag_c_get_12_4.doStart(context, out);
                    _jettag_c_get_12_4.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_c_if_11_16.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_11_16.doEnd();
                out.endTag("if",49);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(64);
                out.setTag("if",802,866);
                RuntimeTagElement _jettag_c_if_12_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_12_60); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_12_60.setRuntimeParent(_jettag_c_iterate_5_2);
                _jettag_c_if_12_60.setTagInfo(_td_c_if_12_60);
                _jettag_c_if_12_60.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_12_60.okToProcessBody()) {
                    out.write("bigint");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_12_60.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_12_60.doEnd();
                out.endTag("if",6);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
    out.bodyContentStart();
                _jettag_c_iterate_5_2.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_5_2.doEnd();
            out.loopEnd();
            out.endTag("iterate",653);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(",");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tCONSTRAINT ");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(6);
            out.setTag("lc",905,911);
            RuntimeTagElement _jettag_f_lc_14_13 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_14_13); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_lc_14_13.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_f_lc_14_13.setTagInfo(_td_f_lc_14_13);
            _jettag_f_lc_14_13.doStart(context, out);
            JET2Writer _jettag_f_lc_14_13_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_f_lc_14_13.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.setTag("get",911,950);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_14_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_19); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_14_19.setRuntimeParent(_jettag_f_lc_14_13);
                _jettag_c_get_14_19.setTagInfo(_td_c_get_14_19);
                _jettag_c_get_14_19.doStart(context, out);
                _jettag_c_get_14_19.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_f_lc_14_13.handleBodyContent(out);
            }
            out = _jettag_f_lc_14_13_saved_out;
    out.bodyContentEnd();
            _jettag_f_lc_14_13.doEnd();
            out.endTag("lc",39);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write("_pkey PRIMARY KEY (id)");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(64);
            out.setTag("iterate",981,1045);
            RuntimeTagElement _jettag_c_iterate_15_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_15_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_15_2.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_iterate_15_2.setTagInfo(_td_c_iterate_15_2);
            _jettag_c_iterate_15_2.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_15_2.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_15_2.getTagInfo().getAttribute("delimiter"),981,1045);
                out.loopIterate();
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(64);
                out.setTag("if",1045,1109);
                RuntimeTagElement _jettag_c_if_15_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_15_66); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_15_66.setRuntimeParent(_jettag_c_iterate_15_2);
                _jettag_c_if_15_66.setTagInfo(_td_c_if_15_66);
                _jettag_c_if_15_66.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_15_66.okToProcessBody()) {
                    out.write("CONSTRAINT ");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(6);
                    out.setTag("lc",1120,1126);
                    RuntimeTagElement _jettag_f_lc_16_15 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_16_15); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_f_lc_16_15.setRuntimeParent(_jettag_c_if_15_66);
                    _jettag_f_lc_16_15.setTagInfo(_td_f_lc_16_15);
                    _jettag_f_lc_16_15.doStart(context, out);
                    JET2Writer _jettag_f_lc_16_15_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_f_lc_16_15.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.setTag("get",1126,1165);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(39);
                        RuntimeTagElement _jettag_c_get_16_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_21); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_16_21.setRuntimeParent(_jettag_f_lc_16_15);
                        _jettag_c_get_16_21.setTagInfo(_td_c_get_16_21);
                        _jettag_c_get_16_21.doStart(context, out);
                        _jettag_c_get_16_21.doEnd();
                        out.setTag(null,-1,-1);
            out.bodyContentStart();
                        _jettag_f_lc_16_15.handleBodyContent(out);
                    }
                    out = _jettag_f_lc_16_15_saved_out;
            out.bodyContentEnd();
                    _jettag_f_lc_16_15.doEnd();
                    out.endTag("lc",39);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",1173,1213);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_16_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_68); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_16_68.setRuntimeParent(_jettag_c_if_15_66);
                    _jettag_c_get_16_68.setTagInfo(_td_c_get_16_68);
                    _jettag_c_get_16_68.doStart(context, out);
                    _jettag_c_get_16_68.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_fkey FOREIGN KEY (");  //$NON-NLS-1$        
                    out.setTag("get",1232,1272);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_16_127 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_127); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_16_127.setRuntimeParent(_jettag_c_if_15_66);
                    _jettag_c_get_16_127.setTagInfo(_td_c_get_16_127);
                    _jettag_c_get_16_127.doStart(context, out);
                    _jettag_c_get_16_127.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(")");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\tREFERENCES ");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(6);
                    out.setTag("lc",1288,1294);
                    RuntimeTagElement _jettag_f_lc_17_15 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_17_15); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_f_lc_17_15.setRuntimeParent(_jettag_c_if_15_66);
                    _jettag_f_lc_17_15.setTagInfo(_td_f_lc_17_15);
                    _jettag_f_lc_17_15.doStart(context, out);
                    JET2Writer _jettag_f_lc_17_15_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_f_lc_17_15.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.setTag("get",1294,1352);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(58);
                        RuntimeTagElement _jettag_c_get_17_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_21); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_17_21.setRuntimeParent(_jettag_f_lc_17_15);
                        _jettag_c_get_17_21.setTagInfo(_td_c_get_17_21);
                        _jettag_c_get_17_21.doStart(context, out);
                        _jettag_c_get_17_21.doEnd();
                        out.setTag(null,-1,-1);
            out.bodyContentStart();
                        _jettag_f_lc_17_15.handleBodyContent(out);
                    }
                    out = _jettag_f_lc_17_15_saved_out;
            out.bodyContentEnd();
                    _jettag_f_lc_17_15.doEnd();
                    out.endTag("lc",58);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
                    out.write(" (id) MATCH SIMPLE");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\tON UPDATE NO ACTION ON DELETE NO ACTION");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_15_66.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_15_66.doEnd();
                out.endTag("if",313);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
    out.bodyContentStart();
                _jettag_c_iterate_15_2.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_15_2.doEnd();
            out.loopEnd();
            out.endTag("iterate",384);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
            out.write(");");  //$NON-NLS-1$        
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_iterate_1_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_1_1.doEnd();
        out.loopEnd();
        out.endTag("iterate",1385);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.popTemplateFile();
    }
}
