package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_templateEntityClass implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_templateEntityClass(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_iterate_2_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            2, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_2_66 = new TagInfo("c:if", //$NON-NLS-1$
            2, 66,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_18 = new TagInfo("c:get", //$NON-NLS-1$
            3, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_8 = new TagInfo("c:get", //$NON-NLS-1$
            5, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_8_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            8, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_14 = new TagInfo("c:get", //$NON-NLS-1$
            9, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_14_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            14, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_13 = new TagInfo("c:get", //$NON-NLS-1$
            15, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_15_56 = new TagInfo("c:if", //$NON-NLS-1$
            15, 56,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and (($currentFeature/@min > 1) or ($currentFeature/@max > 1))", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_16_21 = new TagInfo("c:if", //$NON-NLS-1$
            16, 21,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and ($currentFeature/@min <= 1) and ($currentFeature/@max <= 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_11 = new TagInfo("c:get", //$NON-NLS-1$
            17, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_17_83 = new TagInfo("c:if", //$NON-NLS-1$
            17, 83,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_32_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            32, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_33_3 = new TagInfo("c:if", //$NON-NLS-1$
            33, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name != '') or (($currentFeature/EntityType/entity/@name != '') and ($currentFeature/@min <= 1) and ($currentFeature/@max <= 1))", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_22 = new TagInfo("c:get", //$NON-NLS-1$
            34, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_18 = new TagInfo("c:get", //$NON-NLS-1$
            36, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_22 = new TagInfo("c:get", //$NON-NLS-1$
            39, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_70 = new TagInfo("c:get", //$NON-NLS-1$
            39, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_41_4 = new TagInfo("c:if", //$NON-NLS-1$
            41, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name) = 'currency'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_6 = new TagInfo("c:get", //$NON-NLS-1$
            42, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_72 = new TagInfo("c:get", //$NON-NLS-1$
            42, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_6 = new TagInfo("c:get", //$NON-NLS-1$
            43, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_73 = new TagInfo("c:get", //$NON-NLS-1$
            43, 73,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_6 = new TagInfo("c:get", //$NON-NLS-1$
            44, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_73 = new TagInfo("c:get", //$NON-NLS-1$
            44, 73,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_6 = new TagInfo("c:get", //$NON-NLS-1$
            45, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_58 = new TagInfo("c:get", //$NON-NLS-1$
            45, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_11 = new TagInfo("c:get", //$NON-NLS-1$
            47, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_55 = new TagInfo("c:get", //$NON-NLS-1$
            47, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_49_9 = new TagInfo("c:if", //$NON-NLS-1$
            49, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and (($currentFeature/@min > 1) or ($currentFeature/@max > 1))", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_22 = new TagInfo("c:get", //$NON-NLS-1$
            50, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_18 = new TagInfo("c:get", //$NON-NLS-1$
            52, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_22 = new TagInfo("c:get", //$NON-NLS-1$
            55, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_70 = new TagInfo("c:get", //$NON-NLS-1$
            55, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_11 = new TagInfo("c:get", //$NON-NLS-1$
            57, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_57 = new TagInfo("c:get", //$NON-NLS-1$
            57, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_25 = new TagInfo("c:get", //$NON-NLS-1$
            60, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_73 = new TagInfo("c:get", //$NON-NLS-1$
            60, 73,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_62_20 = new TagInfo("c:get", //$NON-NLS-1$
            62, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_29 = new TagInfo("c:get", //$NON-NLS-1$
            63, 29,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_19 = new TagInfo("c:get", //$NON-NLS-1$
            64, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_69_28 = new TagInfo("c:get", //$NON-NLS-1$
            69, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_11 = new TagInfo("c:get", //$NON-NLS-1$
            71, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        out.write("<?php");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(64);
        out.setTag("iterate",7,71);
        RuntimeTagElement _jettag_c_iterate_2_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_2_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_2_2.setRuntimeParent(null);
        _jettag_c_iterate_2_2.setTagInfo(_td_c_iterate_2_2);
        _jettag_c_iterate_2_2.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_2_2.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_2_2.getTagInfo().getAttribute("delimiter"),7,71);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(64);
            out.setTag("if",71,135);
            RuntimeTagElement _jettag_c_if_2_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_2_66); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_2_66.setRuntimeParent(_jettag_c_iterate_2_2);
            _jettag_c_if_2_66.setTagInfo(_td_c_if_2_66);
            _jettag_c_if_2_66.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_2_66.okToProcessBody()) {
                out.write("include_once \"");  //$NON-NLS-1$        
                out.setTag("get",149,212);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(63);
                RuntimeTagElement _jettag_c_get_3_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_3_18.setRuntimeParent(_jettag_c_if_2_66);
                _jettag_c_get_3_18.setTagInfo(_td_c_get_3_18);
                _jettag_c_get_3_18.doStart(context, out);
                _jettag_c_get_3_18.doEnd();
                out.setTag(null,-1,-1);
                out.write(".class.php\";");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_2_66.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_2_66.doEnd();
            out.endTag("if",89);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_2_2.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_2_2.doEnd();
        out.loopEnd();
        out.endTag("iterate",160);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write(NL);         
        out.write("\tclass ");  //$NON-NLS-1$        
        out.setTag("get",252,296);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_5_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_5_8.setRuntimeParent(null);
        _jettag_c_get_5_8.setTagInfo(_td_c_get_5_8);
        _jettag_c_get_5_8.doStart(context, out);
        _jettag_c_get_5_8.doEnd();
        out.setTag(null,-1,-1);
        out.write(NL);         
        out.write("\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tprivate $id;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(68);
        out.setTag("iterate",317,385);
        RuntimeTagElement _jettag_c_iterate_8_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_8_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_8_3.setRuntimeParent(null);
        _jettag_c_iterate_8_3.setTagInfo(_td_c_iterate_8_3);
        _jettag_c_iterate_8_3.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_8_3.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_8_3.getTagInfo().getAttribute("delimiter"),317,385);
            out.loopIterate();
            out.write("private $");  //$NON-NLS-1$        
            out.setTag("get",394,434);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(40);
            RuntimeTagElement _jettag_c_get_9_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_14); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_9_14.setRuntimeParent(_jettag_c_iterate_8_3);
            _jettag_c_get_9_14.setTagInfo(_td_c_get_9_14);
            _jettag_c_get_9_14.doStart(context, out);
            _jettag_c_get_9_14.doEnd();
            out.setTag(null,-1,-1);
            out.write(";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_8_3.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_8_3.doEnd();
        out.loopEnd();
        out.endTag("iterate",53);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tpublic function __construct()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(69);
        out.setTag("iterate",491,560);
        RuntimeTagElement _jettag_c_iterate_14_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_14_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_14_4.setRuntimeParent(null);
        _jettag_c_iterate_14_4.setTagInfo(_td_c_iterate_14_4);
        _jettag_c_iterate_14_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_14_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_14_4.getTagInfo().getAttribute("delimiter"),491,560);
            out.loopIterate();
            out.write("$this->");  //$NON-NLS-1$        
            out.setTag("get",567,607);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(40);
            RuntimeTagElement _jettag_c_get_15_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_13); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_15_13.setRuntimeParent(_jettag_c_iterate_14_4);
            _jettag_c_get_15_13.setTagInfo(_td_c_get_15_13);
            _jettag_c_get_15_13.doStart(context, out);
            _jettag_c_get_15_13.doEnd();
            out.setTag(null,-1,-1);
            out.write(" = ");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(130);
            out.setTag("if",610,740);
            RuntimeTagElement _jettag_c_if_15_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_15_56); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_15_56.setRuntimeParent(_jettag_c_iterate_14_4);
            _jettag_c_if_15_56.setTagInfo(_td_c_if_15_56);
            _jettag_c_if_15_56.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_15_56.okToProcessBody()) {
                out.write("array()");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_15_56.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_15_56.doEnd();
            out.endTag("if",7);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(131);
            out.setTag("if",754,885);
            RuntimeTagElement _jettag_c_if_16_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_16_21); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_16_21.setRuntimeParent(_jettag_c_iterate_14_4);
            _jettag_c_if_16_21.setTagInfo(_td_c_if_16_21);
            _jettag_c_if_16_21.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_16_21.okToProcessBody()) {
                out.write("new ");  //$NON-NLS-1$        
                out.setTag("get",889,952);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(63);
                RuntimeTagElement _jettag_c_get_17_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_17_11.setRuntimeParent(_jettag_c_if_16_21);
                _jettag_c_get_17_11.setTagInfo(_td_c_get_17_11);
                _jettag_c_get_17_11.doStart(context, out);
                _jettag_c_get_17_11.doEnd();
                out.setTag(null,-1,-1);
                out.write("()");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_16_21.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_16_21.doEnd();
            out.endTag("if",69);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(70);
            out.setTag("if",961,1031);
            RuntimeTagElement _jettag_c_if_17_83 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_17_83); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_17_83.setRuntimeParent(_jettag_c_iterate_14_4);
            _jettag_c_if_17_83.setTagInfo(_td_c_if_17_83);
            _jettag_c_if_17_83.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_17_83.okToProcessBody()) {
                out.write("\"\"");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_17_83.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_17_83.doEnd();
            out.endTag("if",2);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_14_4.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_14_4.doEnd();
        out.loopEnd();
        out.endTag("iterate",485);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tpublic function getId()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn $this->id;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tpublic function setId($id)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t$this->id = $id;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(66);
        out.setTag("iterate",1178,1244);
        RuntimeTagElement _jettag_c_iterate_32_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_32_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_32_2.setRuntimeParent(null);
        _jettag_c_iterate_32_2.setTagInfo(_td_c_iterate_32_2);
        _jettag_c_iterate_32_2.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_32_2.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_32_2.getTagInfo().getAttribute("delimiter"),1178,1244);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(169);
            out.setTag("if",1244,1413);
            RuntimeTagElement _jettag_c_if_33_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_33_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_33_3.setRuntimeParent(_jettag_c_iterate_32_2);
            _jettag_c_if_33_3.setTagInfo(_td_c_if_33_3);
            _jettag_c_if_33_3.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_33_3.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\tpublic function get");  //$NON-NLS-1$        
                out.setTag("get",1435,1481);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_34_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_22); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_34_22.setRuntimeParent(_jettag_c_if_33_3);
                _jettag_c_get_34_22.setTagInfo(_td_c_get_34_22);
                _jettag_c_get_34_22.doStart(context, out);
                _jettag_c_get_34_22.doEnd();
                out.setTag(null,-1,-1);
                out.write("()");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t{");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\treturn $this->");  //$NON-NLS-1$        
                out.setTag("get",1505,1545);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_36_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_36_18.setRuntimeParent(_jettag_c_if_33_3);
                _jettag_c_get_36_18.setTagInfo(_td_c_get_36_18);
                _jettag_c_get_36_18.doStart(context, out);
                _jettag_c_get_36_18.doEnd();
                out.setTag(null,-1,-1);
                out.write(";");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("\t\tpublic function set");  //$NON-NLS-1$        
                out.setTag("get",1573,1619);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_39_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_22); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_39_22.setRuntimeParent(_jettag_c_if_33_3);
                _jettag_c_get_39_22.setTagInfo(_td_c_get_39_22);
                _jettag_c_get_39_22.doStart(context, out);
                _jettag_c_get_39_22.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",1621,1661);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_39_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_70); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_39_70.setRuntimeParent(_jettag_c_if_33_3);
                _jettag_c_get_39_70.setTagInfo(_td_c_get_39_70);
                _jettag_c_get_39_70.doStart(context, out);
                _jettag_c_get_39_70.doEnd();
                out.setTag(null,-1,-1);
                out.write(")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t{");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(59);
                out.setTag("if",1670,1729);
                RuntimeTagElement _jettag_c_if_41_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_41_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_41_4.setRuntimeParent(_jettag_c_if_33_3);
                _jettag_c_if_41_4.setTagInfo(_td_c_if_41_4);
                _jettag_c_if_41_4.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_41_4.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t\t$");  //$NON-NLS-1$        
                    out.setTag("get",1735,1775);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_42_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_6); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_42_6.setRuntimeParent(_jettag_c_if_41_4);
                    _jettag_c_get_42_6.setTagInfo(_td_c_get_42_6);
                    _jettag_c_get_42_6.doStart(context, out);
                    _jettag_c_get_42_6.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" = str_ireplace(\".\", \"\", $");  //$NON-NLS-1$        
                    out.setTag("get",1801,1841);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_42_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_72); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_42_72.setRuntimeParent(_jettag_c_if_41_4);
                    _jettag_c_get_42_72.setTagInfo(_td_c_get_42_72);
                    _jettag_c_get_42_72.doStart(context, out);
                    _jettag_c_get_42_72.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(");");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t$");  //$NON-NLS-1$        
                    out.setTag("get",1849,1889);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_43_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_6); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_43_6.setRuntimeParent(_jettag_c_if_41_4);
                    _jettag_c_get_43_6.setTagInfo(_td_c_get_43_6);
                    _jettag_c_get_43_6.doStart(context, out);
                    _jettag_c_get_43_6.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" = str_ireplace(\",\", \".\", $");  //$NON-NLS-1$        
                    out.setTag("get",1916,1956);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_43_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_73); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_43_73.setRuntimeParent(_jettag_c_if_41_4);
                    _jettag_c_get_43_73.setTagInfo(_td_c_get_43_73);
                    _jettag_c_get_43_73.doStart(context, out);
                    _jettag_c_get_43_73.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(");");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t$");  //$NON-NLS-1$        
                    out.setTag("get",1964,2004);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_44_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_6); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_44_6.setRuntimeParent(_jettag_c_if_41_4);
                    _jettag_c_get_44_6.setTagInfo(_td_c_get_44_6);
                    _jettag_c_get_44_6.doStart(context, out);
                    _jettag_c_get_44_6.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" = str_ireplace(\"R$\", \"\", $");  //$NON-NLS-1$        
                    out.setTag("get",2031,2071);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_44_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_73); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_44_73.setRuntimeParent(_jettag_c_if_41_4);
                    _jettag_c_get_44_73.setTagInfo(_td_c_get_44_73);
                    _jettag_c_get_44_73.doStart(context, out);
                    _jettag_c_get_44_73.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(");");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t$");  //$NON-NLS-1$        
                    out.setTag("get",2079,2119);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_45_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_6); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_45_6.setRuntimeParent(_jettag_c_if_41_4);
                    _jettag_c_get_45_6.setTagInfo(_td_c_get_45_6);
                    _jettag_c_get_45_6.doStart(context, out);
                    _jettag_c_get_45_6.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" = (float) $");  //$NON-NLS-1$        
                    out.setTag("get",2131,2171);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_45_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_58); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_45_58.setRuntimeParent(_jettag_c_if_41_4);
                    _jettag_c_get_45_58.setTagInfo(_td_c_get_45_58);
                    _jettag_c_get_45_58.doStart(context, out);
                    _jettag_c_get_45_58.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(";");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_41_4.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_41_4.doEnd();
                out.endTag("if",447);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("\t\t\t$this->");  //$NON-NLS-1$        
                out.setTag("get",2194,2234);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_47_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_47_11.setRuntimeParent(_jettag_c_if_33_3);
                _jettag_c_get_47_11.setTagInfo(_td_c_get_47_11);
                _jettag_c_get_47_11.doStart(context, out);
                _jettag_c_get_47_11.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = $");  //$NON-NLS-1$        
                out.setTag("get",2238,2278);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_47_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_47_55.setRuntimeParent(_jettag_c_if_33_3);
                _jettag_c_get_47_55.setTagInfo(_td_c_get_47_55);
                _jettag_c_get_47_55.doStart(context, out);
                _jettag_c_get_47_55.doEnd();
                out.setTag(null,-1,-1);
                out.write(";");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_33_3.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_33_3.doEnd();
            out.endTag("if",872);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(124);
            out.setTag("if",2292,2416);
            RuntimeTagElement _jettag_c_if_49_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_49_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_49_9.setRuntimeParent(_jettag_c_iterate_32_2);
            _jettag_c_if_49_9.setTagInfo(_td_c_if_49_9);
            _jettag_c_if_49_9.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_49_9.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\tpublic function get");  //$NON-NLS-1$        
                out.setTag("get",2438,2484);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_50_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_22); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_50_22.setRuntimeParent(_jettag_c_if_49_9);
                _jettag_c_get_50_22.setTagInfo(_td_c_get_50_22);
                _jettag_c_get_50_22.doStart(context, out);
                _jettag_c_get_50_22.doEnd();
                out.setTag(null,-1,-1);
                out.write("()");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t{");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\treturn $this->");  //$NON-NLS-1$        
                out.setTag("get",2508,2548);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_52_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_52_18.setRuntimeParent(_jettag_c_if_49_9);
                _jettag_c_get_52_18.setTagInfo(_td_c_get_52_18);
                _jettag_c_get_52_18.doStart(context, out);
                _jettag_c_get_52_18.doEnd();
                out.setTag(null,-1,-1);
                out.write(";");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tpublic function add");  //$NON-NLS-1$        
                out.setTag("get",2578,2624);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_55_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_22); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_55_22.setRuntimeParent(_jettag_c_if_49_9);
                _jettag_c_get_55_22.setTagInfo(_td_c_get_55_22);
                _jettag_c_get_55_22.doStart(context, out);
                _jettag_c_get_55_22.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",2626,2666);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_55_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_70); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_55_70.setRuntimeParent(_jettag_c_if_49_9);
                _jettag_c_get_55_70.setTagInfo(_td_c_get_55_70);
                _jettag_c_get_55_70.doStart(context, out);
                _jettag_c_get_55_70.doEnd();
                out.setTag(null,-1,-1);
                out.write(")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t{");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t$this->");  //$NON-NLS-1$        
                out.setTag("get",2682,2722);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_57_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_57_11.setRuntimeParent(_jettag_c_if_49_9);
                _jettag_c_get_57_11.setTagInfo(_td_c_get_57_11);
                _jettag_c_get_57_11.doStart(context, out);
                _jettag_c_get_57_11.doEnd();
                out.setTag(null,-1,-1);
                out.write("[] = $");  //$NON-NLS-1$        
                out.setTag("get",2728,2768);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_57_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_57); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_57_57.setRuntimeParent(_jettag_c_if_49_9);
                _jettag_c_get_57_57.setTagInfo(_td_c_get_57_57);
                _jettag_c_get_57_57.doStart(context, out);
                _jettag_c_get_57_57.doEnd();
                out.setTag(null,-1,-1);
                out.write(";");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tpublic function remove");  //$NON-NLS-1$        
                out.setTag("get",2801,2847);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_60_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_25); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_60_25.setRuntimeParent(_jettag_c_if_49_9);
                _jettag_c_get_60_25.setTagInfo(_td_c_get_60_25);
                _jettag_c_get_60_25.doStart(context, out);
                _jettag_c_get_60_25.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",2849,2889);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_60_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_73); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_60_73.setRuntimeParent(_jettag_c_if_49_9);
                _jettag_c_get_60_73.setTagInfo(_td_c_get_60_73);
                _jettag_c_get_60_73.doStart(context, out);
                _jettag_c_get_60_73.doEnd();
                out.setTag(null,-1,-1);
                out.write(")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t{");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tforeach ($this->");  //$NON-NLS-1$        
                out.setTag("get",2914,2954);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_62_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_62_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_62_20.setRuntimeParent(_jettag_c_if_49_9);
                _jettag_c_get_62_20.setTagInfo(_td_c_get_62_20);
                _jettag_c_get_62_20.doStart(context, out);
                _jettag_c_get_62_20.doEnd();
                out.setTag(null,-1,-1);
                out.write(" as $key => $value) {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\tif ($value->getId() == $");  //$NON-NLS-1$        
                out.setTag("get",3004,3044);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_63_29 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_29); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_63_29.setRuntimeParent(_jettag_c_if_49_9);
                _jettag_c_get_63_29.setTagInfo(_td_c_get_63_29);
                _jettag_c_get_63_29.doStart(context, out);
                _jettag_c_get_63_29.doEnd();
                out.setTag(null,-1,-1);
                out.write("->getId()) {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tunset($this->");  //$NON-NLS-1$        
                out.setTag("get",3075,3115);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_64_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_19); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_64_19.setRuntimeParent(_jettag_c_if_49_9);
                _jettag_c_get_64_19.setTagInfo(_td_c_get_64_19);
                _jettag_c_get_64_19.doStart(context, out);
                _jettag_c_get_64_19.doEnd();
                out.setTag(null,-1,-1);
                out.write("[$key]);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tpublic function removeAll");  //$NON-NLS-1$        
                out.setTag("get",3169,3215);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_69_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_28); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_69_28.setRuntimeParent(_jettag_c_if_49_9);
                _jettag_c_get_69_28.setTagInfo(_td_c_get_69_28);
                _jettag_c_get_69_28.doStart(context, out);
                _jettag_c_get_69_28.doEnd();
                out.setTag(null,-1,-1);
                out.write("()");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t{");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t$this->");  //$NON-NLS-1$        
                out.setTag("get",3232,3272);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_71_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_71_11.setRuntimeParent(_jettag_c_if_49_9);
                _jettag_c_get_71_11.setTagInfo(_td_c_get_71_11);
                _jettag_c_get_71_11.doStart(context, out);
                _jettag_c_get_71_11.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = array();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_49_9.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_49_9.doEnd();
            out.endTag("if",873);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_32_2.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_32_2.doEnd();
        out.loopEnd();
        out.endTag("iterate",2052);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("?>");  //$NON-NLS-1$        
        out.popTemplateFile();
    }
}
