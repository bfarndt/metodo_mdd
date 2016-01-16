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
                "($currentFeature/DataType/@name = 'currency')", //$NON-NLS-1$
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
    private static final TagInfo _td_c_get_43_5 = new TagInfo("c:get", //$NON-NLS-1$
            43, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_72 = new TagInfo("c:get", //$NON-NLS-1$
            43, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_5 = new TagInfo("c:get", //$NON-NLS-1$
            44, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_72 = new TagInfo("c:get", //$NON-NLS-1$
            44, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_5 = new TagInfo("c:get", //$NON-NLS-1$
            45, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_57 = new TagInfo("c:get", //$NON-NLS-1$
            45, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_18 = new TagInfo("c:get", //$NON-NLS-1$
            46, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_62 = new TagInfo("c:get", //$NON-NLS-1$
            46, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_48_9 = new TagInfo("c:if", //$NON-NLS-1$
            48, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and (($currentFeature/@min > 1) or ($currentFeature/@max > 1))", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_22 = new TagInfo("c:get", //$NON-NLS-1$
            49, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_18 = new TagInfo("c:get", //$NON-NLS-1$
            51, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_22 = new TagInfo("c:get", //$NON-NLS-1$
            54, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_70 = new TagInfo("c:get", //$NON-NLS-1$
            54, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_11 = new TagInfo("c:get", //$NON-NLS-1$
            56, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_57 = new TagInfo("c:get", //$NON-NLS-1$
            56, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_59_25 = new TagInfo("c:get", //$NON-NLS-1$
            59, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_59_73 = new TagInfo("c:get", //$NON-NLS-1$
            59, 73,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_20 = new TagInfo("c:get", //$NON-NLS-1$
            61, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_62_29 = new TagInfo("c:get", //$NON-NLS-1$
            62, 29,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_19 = new TagInfo("c:get", //$NON-NLS-1$
            63, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_68_28 = new TagInfo("c:get", //$NON-NLS-1$
            68, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_70_11 = new TagInfo("c:get", //$NON-NLS-1$
            70, 11,
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
        out.jump(63);
                out.setTag("if",1670,1733);
                RuntimeTagElement _jettag_c_if_41_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_41_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_41_4.setRuntimeParent(_jettag_c_if_33_3);
                _jettag_c_if_41_4.setTagInfo(_td_c_if_41_4);
                _jettag_c_if_41_4.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_41_4.okToProcessBody()) {
                    out.write("$");  //$NON-NLS-1$        
                    out.setTag("get",1734,1774);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_42_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_6); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_42_6.setRuntimeParent(_jettag_c_if_41_4);
                    _jettag_c_get_42_6.setTagInfo(_td_c_get_42_6);
                    _jettag_c_get_42_6.doStart(context, out);
                    _jettag_c_get_42_6.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" = str_ireplace(\".\", \"\", $");  //$NON-NLS-1$        
                    out.setTag("get",1800,1840);
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
                    out.write("\t\t\t$");  //$NON-NLS-1$        
                    out.setTag("get",1847,1887);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_43_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_43_5.setRuntimeParent(_jettag_c_if_41_4);
                    _jettag_c_get_43_5.setTagInfo(_td_c_get_43_5);
                    _jettag_c_get_43_5.doStart(context, out);
                    _jettag_c_get_43_5.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" = str_ireplace(\",\", \".\", $");  //$NON-NLS-1$        
                    out.setTag("get",1914,1954);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_43_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_72); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_43_72.setRuntimeParent(_jettag_c_if_41_4);
                    _jettag_c_get_43_72.setTagInfo(_td_c_get_43_72);
                    _jettag_c_get_43_72.doStart(context, out);
                    _jettag_c_get_43_72.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(");");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t$");  //$NON-NLS-1$        
                    out.setTag("get",1961,2001);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_44_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_44_5.setRuntimeParent(_jettag_c_if_41_4);
                    _jettag_c_get_44_5.setTagInfo(_td_c_get_44_5);
                    _jettag_c_get_44_5.doStart(context, out);
                    _jettag_c_get_44_5.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" = str_ireplace(\"R$\", \"\", $");  //$NON-NLS-1$        
                    out.setTag("get",2028,2068);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_44_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_72); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_44_72.setRuntimeParent(_jettag_c_if_41_4);
                    _jettag_c_get_44_72.setTagInfo(_td_c_get_44_72);
                    _jettag_c_get_44_72.doStart(context, out);
                    _jettag_c_get_44_72.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(");");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t$");  //$NON-NLS-1$        
                    out.setTag("get",2075,2115);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_45_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_45_5.setRuntimeParent(_jettag_c_if_41_4);
                    _jettag_c_get_45_5.setTagInfo(_td_c_get_45_5);
                    _jettag_c_get_45_5.doStart(context, out);
                    _jettag_c_get_45_5.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" = (float) $");  //$NON-NLS-1$        
                    out.setTag("get",2127,2167);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_45_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_57); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_45_57.setRuntimeParent(_jettag_c_if_41_4);
                    _jettag_c_get_45_57.setTagInfo(_td_c_get_45_57);
                    _jettag_c_get_45_57.doStart(context, out);
                    _jettag_c_get_45_57.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(";");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_41_4.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_41_4.doEnd();
                out.endTag("if",439);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("$this->");  //$NON-NLS-1$        
                out.setTag("get",2186,2226);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_46_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_46_18.setRuntimeParent(_jettag_c_if_33_3);
                _jettag_c_get_46_18.setTagInfo(_td_c_get_46_18);
                _jettag_c_get_46_18.doStart(context, out);
                _jettag_c_get_46_18.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = $");  //$NON-NLS-1$        
                out.setTag("get",2230,2270);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_46_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_62); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_46_62.setRuntimeParent(_jettag_c_if_33_3);
                _jettag_c_get_46_62.setTagInfo(_td_c_get_46_62);
                _jettag_c_get_46_62.doStart(context, out);
                _jettag_c_get_46_62.doEnd();
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
            out.endTag("if",864);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(124);
            out.setTag("if",2284,2408);
            RuntimeTagElement _jettag_c_if_48_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_48_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_48_9.setRuntimeParent(_jettag_c_iterate_32_2);
            _jettag_c_if_48_9.setTagInfo(_td_c_if_48_9);
            _jettag_c_if_48_9.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_48_9.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\tpublic function get");  //$NON-NLS-1$        
                out.setTag("get",2430,2476);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_49_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_22); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_49_22.setRuntimeParent(_jettag_c_if_48_9);
                _jettag_c_get_49_22.setTagInfo(_td_c_get_49_22);
                _jettag_c_get_49_22.doStart(context, out);
                _jettag_c_get_49_22.doEnd();
                out.setTag(null,-1,-1);
                out.write("()");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t{");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\treturn $this->");  //$NON-NLS-1$        
                out.setTag("get",2500,2540);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_51_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_51_18.setRuntimeParent(_jettag_c_if_48_9);
                _jettag_c_get_51_18.setTagInfo(_td_c_get_51_18);
                _jettag_c_get_51_18.doStart(context, out);
                _jettag_c_get_51_18.doEnd();
                out.setTag(null,-1,-1);
                out.write(";");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tpublic function add");  //$NON-NLS-1$        
                out.setTag("get",2570,2616);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_54_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_54_22); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_54_22.setRuntimeParent(_jettag_c_if_48_9);
                _jettag_c_get_54_22.setTagInfo(_td_c_get_54_22);
                _jettag_c_get_54_22.doStart(context, out);
                _jettag_c_get_54_22.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",2618,2658);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_54_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_54_70); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_54_70.setRuntimeParent(_jettag_c_if_48_9);
                _jettag_c_get_54_70.setTagInfo(_td_c_get_54_70);
                _jettag_c_get_54_70.doStart(context, out);
                _jettag_c_get_54_70.doEnd();
                out.setTag(null,-1,-1);
                out.write(")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t{");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t$this->");  //$NON-NLS-1$        
                out.setTag("get",2674,2714);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_56_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_56_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_56_11.setRuntimeParent(_jettag_c_if_48_9);
                _jettag_c_get_56_11.setTagInfo(_td_c_get_56_11);
                _jettag_c_get_56_11.doStart(context, out);
                _jettag_c_get_56_11.doEnd();
                out.setTag(null,-1,-1);
                out.write("[] = $");  //$NON-NLS-1$        
                out.setTag("get",2720,2760);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_56_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_56_57); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_56_57.setRuntimeParent(_jettag_c_if_48_9);
                _jettag_c_get_56_57.setTagInfo(_td_c_get_56_57);
                _jettag_c_get_56_57.doStart(context, out);
                _jettag_c_get_56_57.doEnd();
                out.setTag(null,-1,-1);
                out.write(";");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tpublic function remove");  //$NON-NLS-1$        
                out.setTag("get",2793,2839);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_59_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_59_25); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_59_25.setRuntimeParent(_jettag_c_if_48_9);
                _jettag_c_get_59_25.setTagInfo(_td_c_get_59_25);
                _jettag_c_get_59_25.doStart(context, out);
                _jettag_c_get_59_25.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",2841,2881);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_59_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_59_73); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_59_73.setRuntimeParent(_jettag_c_if_48_9);
                _jettag_c_get_59_73.setTagInfo(_td_c_get_59_73);
                _jettag_c_get_59_73.doStart(context, out);
                _jettag_c_get_59_73.doEnd();
                out.setTag(null,-1,-1);
                out.write(")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t{");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tforeach ($this->");  //$NON-NLS-1$        
                out.setTag("get",2906,2946);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_61_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_61_20.setRuntimeParent(_jettag_c_if_48_9);
                _jettag_c_get_61_20.setTagInfo(_td_c_get_61_20);
                _jettag_c_get_61_20.doStart(context, out);
                _jettag_c_get_61_20.doEnd();
                out.setTag(null,-1,-1);
                out.write(" as $key => $value) {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\tif ($value->getId() == $");  //$NON-NLS-1$        
                out.setTag("get",2996,3036);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_62_29 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_62_29); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_62_29.setRuntimeParent(_jettag_c_if_48_9);
                _jettag_c_get_62_29.setTagInfo(_td_c_get_62_29);
                _jettag_c_get_62_29.doStart(context, out);
                _jettag_c_get_62_29.doEnd();
                out.setTag(null,-1,-1);
                out.write("->getId()) {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tunset($this->");  //$NON-NLS-1$        
                out.setTag("get",3067,3107);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_63_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_19); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_63_19.setRuntimeParent(_jettag_c_if_48_9);
                _jettag_c_get_63_19.setTagInfo(_td_c_get_63_19);
                _jettag_c_get_63_19.doStart(context, out);
                _jettag_c_get_63_19.doEnd();
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
                out.setTag("get",3161,3207);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_68_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_68_28); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_68_28.setRuntimeParent(_jettag_c_if_48_9);
                _jettag_c_get_68_28.setTagInfo(_td_c_get_68_28);
                _jettag_c_get_68_28.doStart(context, out);
                _jettag_c_get_68_28.doEnd();
                out.setTag(null,-1,-1);
                out.write("()");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t{");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t$this->");  //$NON-NLS-1$        
                out.setTag("get",3224,3264);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_70_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_70_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_70_11.setRuntimeParent(_jettag_c_if_48_9);
                _jettag_c_get_70_11.setTagInfo(_td_c_get_70_11);
                _jettag_c_get_70_11.doStart(context, out);
                _jettag_c_get_70_11.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = array();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_48_9.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_48_9.doEnd();
            out.endTag("if",873);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_32_2.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_32_2.doEnd();
        out.loopEnd();
        out.endTag("iterate",2044);
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
