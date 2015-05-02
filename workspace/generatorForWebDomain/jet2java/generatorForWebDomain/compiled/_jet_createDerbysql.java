package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_createDerbysql implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_createDerbysql(String templateFile) {
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
                "/WebDomainAdministrationModel/userTypes", //$NON-NLS-1$
                "userType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_2_12 = new TagInfo("c:get", //$NON-NLS-1$
            2, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_14 = new TagInfo("c:get", //$NON-NLS-1$
            4, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_5 = new TagInfo("c:get", //$NON-NLS-1$
            5, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_5_83 = new TagInfo("c:iterate", //$NON-NLS-1$
            5, 83,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$userType/attributes", //$NON-NLS-1$
                "attribute", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_5 = new TagInfo("c:get", //$NON-NLS-1$
            7, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_7_41 = new TagInfo("c:if", //$NON-NLS-1$
            7, 41,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldType = 'DATE'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_15 = new TagInfo("c:if", //$NON-NLS-1$
            8, 15,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldType = 'TEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_13 = new TagInfo("c:get", //$NON-NLS-1$
            9, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldSize", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_9_61 = new TagInfo("c:if", //$NON-NLS-1$
            9, 61,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldType = 'PASSWORD'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_13 = new TagInfo("c:get", //$NON-NLS-1$
            10, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldSize", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_10_61 = new TagInfo("c:if", //$NON-NLS-1$
            10, 61,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldType = 'INT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_11_20 = new TagInfo("c:if", //$NON-NLS-1$
            11, 20,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldType = 'LONG'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_12_23 = new TagInfo("c:if", //$NON-NLS-1$
            12, 23,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldType = 'REAL'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_13_21 = new TagInfo("c:if", //$NON-NLS-1$
            13, 21,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldType = 'CURRENCY'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_14_21 = new TagInfo("c:if", //$NON-NLS-1$
            14, 21,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldType = 'IMAGE'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_15_33 = new TagInfo("c:iterate", //$NON-NLS-1$
            15, 33,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/referenceList", //$NON-NLS-1$
                "aReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_5 = new TagInfo("c:get", //$NON-NLS-1$
            16, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_21_1 = new TagInfo("c:if", //$NON-NLS-1$
            21, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$featuresModel/WebDomainFeatures/@userContent = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_33_1 = new TagInfo("c:if", //$NON-NLS-1$
            33, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$featuresModel/WebDomainFeatures/@moderation = 'true'", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(75);
        out.setTag("iterate",0,75);
        RuntimeTagElement _jettag_c_iterate_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_1_1.setRuntimeParent(null);
        _jettag_c_iterate_1_1.setTagInfo(_td_c_iterate_1_1);
        _jettag_c_iterate_1_1.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_1_1.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_1_1.getTagInfo().getAttribute("delimiter"),0,75);
            out.loopIterate();
            out.write(NL);         
            out.write("DROP TABLE ");  //$NON-NLS-1$        
            out.setTag("get",87,121);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(34);
            RuntimeTagElement _jettag_c_get_2_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_2_12.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_2_12.setTagInfo(_td_c_get_2_12);
            _jettag_c_get_2_12.doStart(context, out);
            _jettag_c_get_2_12.doEnd();
            out.setTag(null,-1,-1);
            out.write(";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("CREATE TABLE ");  //$NON-NLS-1$        
            out.setTag("get",137,171);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(34);
            RuntimeTagElement _jettag_c_get_4_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_14); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_4_14.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_4_14.setTagInfo(_td_c_get_4_14);
            _jettag_c_get_4_14.doStart(context, out);
            _jettag_c_get_4_14.doEnd();
            out.setTag(null,-1,-1);
            out.write(" (");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            out.setTag("get",178,215);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(37);
            RuntimeTagElement _jettag_c_get_5_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_5_5.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_5_5.setTagInfo(_td_c_get_5_5);
            _jettag_c_get_5_5.doStart(context, out);
            _jettag_c_get_5_5.doEnd();
            out.setTag(null,-1,-1);
            out.write(" BIGINT GENERATED BY DEFAULT AS IDENTITY,");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(78);
            out.setTag("iterate",256,334);
            RuntimeTagElement _jettag_c_iterate_5_83 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_5_83); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_5_83.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_iterate_5_83.setTagInfo(_td_c_iterate_5_83);
            _jettag_c_iterate_5_83.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_5_83.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_5_83.getTagInfo().getAttribute("delimiter"),256,334);
                out.loopIterate();
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
                out.setTag("get",339,374);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_7_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_7_5.setRuntimeParent(_jettag_c_iterate_5_83);
                _jettag_c_get_7_5.setTagInfo(_td_c_get_7_5);
                _jettag_c_get_7_5.doStart(context, out);
                _jettag_c_get_7_5.doEnd();
                out.setTag(null,-1,-1);
                out.write(" ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(47);
                out.setTag("if",375,422);
                RuntimeTagElement _jettag_c_if_7_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_7_41); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_7_41.setRuntimeParent(_jettag_c_iterate_5_83);
                _jettag_c_if_7_41.setTagInfo(_td_c_if_7_41);
                _jettag_c_if_7_41.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_7_41.okToProcessBody()) {
                    out.write("DATE");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_7_41.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_7_41.doEnd();
                out.endTag("if",4);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(47);
                out.setTag("if",433,480);
                RuntimeTagElement _jettag_c_if_8_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_8_15.setRuntimeParent(_jettag_c_iterate_5_83);
                _jettag_c_if_8_15.setTagInfo(_td_c_if_8_15);
                _jettag_c_if_8_15.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_8_15.okToProcessBody()) {
                    out.write("VARCHAR (");  //$NON-NLS-1$        
                    out.setTag("get",489,529);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_9_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_9_13.setRuntimeParent(_jettag_c_if_8_15);
                    _jettag_c_get_9_13.setTagInfo(_td_c_get_9_13);
                    _jettag_c_get_9_13.doStart(context, out);
                    _jettag_c_get_9_13.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(")");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_8_15.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_8_15.doEnd();
                out.endTag("if",50);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(51);
                out.setTag("if",537,588);
                RuntimeTagElement _jettag_c_if_9_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_9_61); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_9_61.setRuntimeParent(_jettag_c_iterate_5_83);
                _jettag_c_if_9_61.setTagInfo(_td_c_if_9_61);
                _jettag_c_if_9_61.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_9_61.okToProcessBody()) {
                    out.write("VARCHAR (");  //$NON-NLS-1$        
                    out.setTag("get",597,637);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_10_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_10_13.setRuntimeParent(_jettag_c_if_9_61);
                    _jettag_c_get_10_13.setTagInfo(_td_c_get_10_13);
                    _jettag_c_get_10_13.doStart(context, out);
                    _jettag_c_get_10_13.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(")");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_9_61.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_9_61.doEnd();
                out.endTag("if",50);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(52);
                out.setTag("if",645,697);
                RuntimeTagElement _jettag_c_if_10_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_10_61); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_10_61.setRuntimeParent(_jettag_c_iterate_5_83);
                _jettag_c_if_10_61.setTagInfo(_td_c_if_10_61);
                _jettag_c_if_10_61.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_10_61.okToProcessBody()) {
                    out.write("INT");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_10_61.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_10_61.doEnd();
                out.endTag("if",3);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(53);
                out.setTag("if",707,760);
                RuntimeTagElement _jettag_c_if_11_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_11_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_11_20.setRuntimeParent(_jettag_c_iterate_5_83);
                _jettag_c_if_11_20.setTagInfo(_td_c_if_11_20);
                _jettag_c_if_11_20.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_11_20.okToProcessBody()) {
                    out.write("BIGINT");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_11_20.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_11_20.doEnd();
                out.endTag("if",6);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(53);
                out.setTag("if",773,826);
                RuntimeTagElement _jettag_c_if_12_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_12_23); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_12_23.setRuntimeParent(_jettag_c_iterate_5_83);
                _jettag_c_if_12_23.setTagInfo(_td_c_if_12_23);
                _jettag_c_if_12_23.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_12_23.okToProcessBody()) {
                    out.write("REAL");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_12_23.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_12_23.doEnd();
                out.endTag("if",4);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(57);
                out.setTag("if",837,894);
                RuntimeTagElement _jettag_c_if_13_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_13_21); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_13_21.setRuntimeParent(_jettag_c_iterate_5_83);
                _jettag_c_if_13_21.setTagInfo(_td_c_if_13_21);
                _jettag_c_if_13_21.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_13_21.okToProcessBody()) {
                    out.write("REAL");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_13_21.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_13_21.doEnd();
                out.endTag("if",4);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(54);
                out.setTag("if",905,959);
                RuntimeTagElement _jettag_c_if_14_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_14_21); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_14_21.setRuntimeParent(_jettag_c_iterate_5_83);
                _jettag_c_if_14_21.setTagInfo(_td_c_if_14_21);
                _jettag_c_if_14_21.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_14_21.okToProcessBody()) {
                    out.write("BLOB");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_14_21.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_14_21.doEnd();
                out.endTag("if",4);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
    out.bodyContentStart();
                _jettag_c_iterate_5_83.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_5_83.doEnd();
            out.loopEnd();
            out.endTag("iterate",636);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(61);
            out.setTag("iterate",982,1043);
            RuntimeTagElement _jettag_c_iterate_15_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_15_33); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_15_33.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_iterate_15_33.setTagInfo(_td_c_iterate_15_33);
            _jettag_c_iterate_15_33.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_15_33.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_15_33.getTagInfo().getAttribute("delimiter"),982,1043);
                out.loopIterate();
                out.write(",");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
                out.setTag("get",1049,1085);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(36);
                RuntimeTagElement _jettag_c_get_16_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_16_5.setRuntimeParent(_jettag_c_iterate_15_33);
                _jettag_c_get_16_5.setTagInfo(_td_c_get_16_5);
                _jettag_c_get_16_5.doStart(context, out);
                _jettag_c_get_16_5.doEnd();
                out.setTag(null,-1,-1);
                out.write(" BIGINT");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_iterate_15_33.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_15_33.doEnd();
            out.loopEnd();
            out.endTag("iterate",49);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
            out.write(");");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_iterate_1_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_1_1.doEnd();
        out.loopEnd();
        out.endTag("iterate",1034);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(68);
        out.setTag("if",1123,1191);
        RuntimeTagElement _jettag_c_if_21_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_21_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_21_1.setRuntimeParent(null);
        _jettag_c_if_21_1.setTagInfo(_td_c_if_21_1);
        _jettag_c_if_21_1.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_c_if_21_1.okToProcessBody()) {
            out.write(NL);         
            out.write("DROP TABLE UserContent;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("CREATE TABLE UserContent (");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    userContentId BIGINT GENERATED BY DEFAULT AS IDENTITY,");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tentityName VARCHAR (255),");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tentityId BIGINT,");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    date BIGINT,");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    title VARCHAR (255),");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    content VARCHAR (1000),");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    name VARCHAR (100),");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    email VARCHAR (100)");  //$NON-NLS-1$        
            out.write(NL);         
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(67);
            out.setTag("if",1466,1533);
            RuntimeTagElement _jettag_c_if_33_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_33_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_33_1.setRuntimeParent(_jettag_c_if_21_1);
            _jettag_c_if_33_1.setTagInfo(_td_c_if_33_1);
            _jettag_c_if_33_1.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_33_1.okToProcessBody()) {
                out.write(NL);         
                out.write("    , approved CHAR");  //$NON-NLS-1$        
                out.write(NL);         
    out.bodyContentStart();
                _jettag_c_if_33_1.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_33_1.doEnd();
            out.endTag("if",21);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(");");  //$NON-NLS-1$        
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_if_21_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_if_21_1.doEnd();
        out.endTag("if",378);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.popTemplateFile();
    }
}
