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
                "($currentFeature/DataType/@name = 'currency')", //$NON-NLS-1$
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
    private static final TagInfo _td_c_get_41_40 = new TagInfo("c:get", //$NON-NLS-1$
            41, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_22 = new TagInfo("c:get", //$NON-NLS-1$
            44, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_70 = new TagInfo("c:get", //$NON-NLS-1$
            44, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_17 = new TagInfo("c:get", //$NON-NLS-1$
            46, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_6 = new TagInfo("c:get", //$NON-NLS-1$
            47, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_73 = new TagInfo("c:get", //$NON-NLS-1$
            47, 73,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_6 = new TagInfo("c:get", //$NON-NLS-1$
            48, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_72 = new TagInfo("c:get", //$NON-NLS-1$
            48, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_6 = new TagInfo("c:get", //$NON-NLS-1$
            49, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_73 = new TagInfo("c:get", //$NON-NLS-1$
            49, 73,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_6 = new TagInfo("c:get", //$NON-NLS-1$
            50, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_55 = new TagInfo("c:get", //$NON-NLS-1$
            50, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_11 = new TagInfo("c:get", //$NON-NLS-1$
            53, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_55 = new TagInfo("c:get", //$NON-NLS-1$
            53, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_55_9 = new TagInfo("c:if", //$NON-NLS-1$
            55, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name != 'currency') or (($currentFeature/EntityType/entity/@name != '') and ($currentFeature/@min <= 1) and ($currentFeature/@max <= 1))", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_22 = new TagInfo("c:get", //$NON-NLS-1$
            56, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_58_18 = new TagInfo("c:get", //$NON-NLS-1$
            58, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_22 = new TagInfo("c:get", //$NON-NLS-1$
            61, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_70 = new TagInfo("c:get", //$NON-NLS-1$
            61, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_11 = new TagInfo("c:get", //$NON-NLS-1$
            63, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_55 = new TagInfo("c:get", //$NON-NLS-1$
            63, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_65_9 = new TagInfo("c:if", //$NON-NLS-1$
            65, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and (($currentFeature/@min > 1) or ($currentFeature/@max > 1))", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_22 = new TagInfo("c:get", //$NON-NLS-1$
            66, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_68_18 = new TagInfo("c:get", //$NON-NLS-1$
            68, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_22 = new TagInfo("c:get", //$NON-NLS-1$
            71, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_70 = new TagInfo("c:get", //$NON-NLS-1$
            71, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_11 = new TagInfo("c:get", //$NON-NLS-1$
            73, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_57 = new TagInfo("c:get", //$NON-NLS-1$
            73, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_76_25 = new TagInfo("c:get", //$NON-NLS-1$
            76, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_76_73 = new TagInfo("c:get", //$NON-NLS-1$
            76, 73,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_78_20 = new TagInfo("c:get", //$NON-NLS-1$
            78, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_29 = new TagInfo("c:get", //$NON-NLS-1$
            79, 29,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_80_19 = new TagInfo("c:get", //$NON-NLS-1$
            80, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_85_28 = new TagInfo("c:get", //$NON-NLS-1$
            85, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_87_11 = new TagInfo("c:get", //$NON-NLS-1$
            87, 11,
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
    out.jump(59);
            out.setTag("if",1244,1303);
            RuntimeTagElement _jettag_c_if_33_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_33_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_33_3.setRuntimeParent(_jettag_c_iterate_32_2);
            _jettag_c_if_33_3.setTagInfo(_td_c_if_33_3);
            _jettag_c_if_33_3.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_33_3.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\tpublic function get");  //$NON-NLS-1$        
                out.setTag("get",1325,1371);
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
                out.setTag("get",1395,1435);
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
                out.write("\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tpublic function get");  //$NON-NLS-1$        
                out.setTag("get",1465,1511);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_39_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_22); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_39_22.setRuntimeParent(_jettag_c_if_33_3);
                _jettag_c_get_39_22.setTagInfo(_td_c_get_39_22);
                _jettag_c_get_39_22.doStart(context, out);
                _jettag_c_get_39_22.doEnd();
                out.setTag(null,-1,-1);
                out.write("Formated()");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t{");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\treturn 'R$ ' . number_format($this->");  //$NON-NLS-1$        
                out.setTag("get",1565,1605);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_41_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_40); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_41_40.setRuntimeParent(_jettag_c_if_33_3);
                _jettag_c_get_41_40.setTagInfo(_td_c_get_41_40);
                _jettag_c_get_41_40.doStart(context, out);
                _jettag_c_get_41_40.doEnd();
                out.setTag(null,-1,-1);
                out.write(", 2, ',', '.');");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("\t\tpublic function set");  //$NON-NLS-1$        
                out.setTag("get",1647,1693);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_44_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_22); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_44_22.setRuntimeParent(_jettag_c_if_33_3);
                _jettag_c_get_44_22.setTagInfo(_td_c_get_44_22);
                _jettag_c_get_44_22.doStart(context, out);
                _jettag_c_get_44_22.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",1695,1735);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_44_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_70); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_44_70.setRuntimeParent(_jettag_c_if_33_3);
                _jettag_c_get_44_70.setTagInfo(_td_c_get_44_70);
                _jettag_c_get_44_70.doStart(context, out);
                _jettag_c_get_44_70.doEnd();
                out.setTag(null,-1,-1);
                out.write(")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t{");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tif (stripos($");  //$NON-NLS-1$        
                out.setTag("get",1757,1797);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_46_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_46_17.setRuntimeParent(_jettag_c_if_33_3);
                _jettag_c_get_46_17.setTagInfo(_td_c_get_46_17);
                _jettag_c_get_46_17.doStart(context, out);
                _jettag_c_get_46_17.doEnd();
                out.setTag(null,-1,-1);
                out.write(", 'r$') !== false) {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",1823,1863);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_47_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_47_6.setRuntimeParent(_jettag_c_if_33_3);
                _jettag_c_get_47_6.setTagInfo(_td_c_get_47_6);
                _jettag_c_get_47_6.doStart(context, out);
                _jettag_c_get_47_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = str_ireplace('r$', '', $");  //$NON-NLS-1$        
                out.setTag("get",1890,1930);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_47_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_73); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_47_73.setRuntimeParent(_jettag_c_if_33_3);
                _jettag_c_get_47_73.setTagInfo(_td_c_get_47_73);
                _jettag_c_get_47_73.doStart(context, out);
                _jettag_c_get_47_73.doEnd();
                out.setTag(null,-1,-1);
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",1938,1978);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_48_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_48_6.setRuntimeParent(_jettag_c_if_33_3);
                _jettag_c_get_48_6.setTagInfo(_td_c_get_48_6);
                _jettag_c_get_48_6.doStart(context, out);
                _jettag_c_get_48_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = str_ireplace('.', '', $");  //$NON-NLS-1$        
                out.setTag("get",2004,2044);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_48_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_72); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_48_72.setRuntimeParent(_jettag_c_if_33_3);
                _jettag_c_get_48_72.setTagInfo(_td_c_get_48_72);
                _jettag_c_get_48_72.doStart(context, out);
                _jettag_c_get_48_72.doEnd();
                out.setTag(null,-1,-1);
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",2052,2092);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_49_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_49_6.setRuntimeParent(_jettag_c_if_33_3);
                _jettag_c_get_49_6.setTagInfo(_td_c_get_49_6);
                _jettag_c_get_49_6.doStart(context, out);
                _jettag_c_get_49_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = str_ireplace(',', '.', $");  //$NON-NLS-1$        
                out.setTag("get",2119,2159);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_49_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_73); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_49_73.setRuntimeParent(_jettag_c_if_33_3);
                _jettag_c_get_49_73.setTagInfo(_td_c_get_49_73);
                _jettag_c_get_49_73.doStart(context, out);
                _jettag_c_get_49_73.doEnd();
                out.setTag(null,-1,-1);
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",2167,2207);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_50_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_50_6.setRuntimeParent(_jettag_c_if_33_3);
                _jettag_c_get_50_6.setTagInfo(_td_c_get_50_6);
                _jettag_c_get_50_6.doStart(context, out);
                _jettag_c_get_50_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = trim($");  //$NON-NLS-1$        
                out.setTag("get",2216,2256);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_50_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_50_55.setRuntimeParent(_jettag_c_if_33_3);
                _jettag_c_get_50_55.setTagInfo(_td_c_get_50_55);
                _jettag_c_get_50_55.doStart(context, out);
                _jettag_c_get_50_55.doEnd();
                out.setTag(null,-1,-1);
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("\t\t\t$this->");  //$NON-NLS-1$        
                out.setTag("get",2275,2315);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_53_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_53_11.setRuntimeParent(_jettag_c_if_33_3);
                _jettag_c_get_53_11.setTagInfo(_td_c_get_53_11);
                _jettag_c_get_53_11.doStart(context, out);
                _jettag_c_get_53_11.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = $");  //$NON-NLS-1$        
                out.setTag("get",2319,2359);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_53_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_53_55.setRuntimeParent(_jettag_c_if_33_3);
                _jettag_c_get_53_55.setTagInfo(_td_c_get_53_55);
                _jettag_c_get_53_55.doStart(context, out);
                _jettag_c_get_53_55.doEnd();
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
            out.endTag("if",1063);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(177);
            out.setTag("if",2373,2550);
            RuntimeTagElement _jettag_c_if_55_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_55_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_55_9.setRuntimeParent(_jettag_c_iterate_32_2);
            _jettag_c_if_55_9.setTagInfo(_td_c_if_55_9);
            _jettag_c_if_55_9.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_55_9.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\tpublic function get");  //$NON-NLS-1$        
                out.setTag("get",2572,2618);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_56_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_56_22); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_56_22.setRuntimeParent(_jettag_c_if_55_9);
                _jettag_c_get_56_22.setTagInfo(_td_c_get_56_22);
                _jettag_c_get_56_22.doStart(context, out);
                _jettag_c_get_56_22.doEnd();
                out.setTag(null,-1,-1);
                out.write("()");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t{");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\treturn $this->");  //$NON-NLS-1$        
                out.setTag("get",2642,2682);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_58_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_58_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_58_18.setRuntimeParent(_jettag_c_if_55_9);
                _jettag_c_get_58_18.setTagInfo(_td_c_get_58_18);
                _jettag_c_get_58_18.doStart(context, out);
                _jettag_c_get_58_18.doEnd();
                out.setTag(null,-1,-1);
                out.write(";");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("\t\tpublic function set");  //$NON-NLS-1$        
                out.setTag("get",2710,2756);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_61_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_22); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_61_22.setRuntimeParent(_jettag_c_if_55_9);
                _jettag_c_get_61_22.setTagInfo(_td_c_get_61_22);
                _jettag_c_get_61_22.doStart(context, out);
                _jettag_c_get_61_22.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",2758,2798);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_61_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_70); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_61_70.setRuntimeParent(_jettag_c_if_55_9);
                _jettag_c_get_61_70.setTagInfo(_td_c_get_61_70);
                _jettag_c_get_61_70.doStart(context, out);
                _jettag_c_get_61_70.doEnd();
                out.setTag(null,-1,-1);
                out.write(")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t{");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t$this->");  //$NON-NLS-1$        
                out.setTag("get",2814,2854);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_63_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_63_11.setRuntimeParent(_jettag_c_if_55_9);
                _jettag_c_get_63_11.setTagInfo(_td_c_get_63_11);
                _jettag_c_get_63_11.doStart(context, out);
                _jettag_c_get_63_11.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = $");  //$NON-NLS-1$        
                out.setTag("get",2858,2898);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_63_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_63_55.setRuntimeParent(_jettag_c_if_55_9);
                _jettag_c_get_63_55.setTagInfo(_td_c_get_63_55);
                _jettag_c_get_63_55.doStart(context, out);
                _jettag_c_get_63_55.doEnd();
                out.setTag(null,-1,-1);
                out.write(";");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_55_9.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_55_9.doEnd();
            out.endTag("if",355);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(124);
            out.setTag("if",2912,3036);
            RuntimeTagElement _jettag_c_if_65_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_65_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_65_9.setRuntimeParent(_jettag_c_iterate_32_2);
            _jettag_c_if_65_9.setTagInfo(_td_c_if_65_9);
            _jettag_c_if_65_9.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_65_9.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\tpublic function get");  //$NON-NLS-1$        
                out.setTag("get",3058,3104);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_66_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_22); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_66_22.setRuntimeParent(_jettag_c_if_65_9);
                _jettag_c_get_66_22.setTagInfo(_td_c_get_66_22);
                _jettag_c_get_66_22.doStart(context, out);
                _jettag_c_get_66_22.doEnd();
                out.setTag(null,-1,-1);
                out.write("()");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t{");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\treturn $this->");  //$NON-NLS-1$        
                out.setTag("get",3128,3168);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_68_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_68_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_68_18.setRuntimeParent(_jettag_c_if_65_9);
                _jettag_c_get_68_18.setTagInfo(_td_c_get_68_18);
                _jettag_c_get_68_18.doStart(context, out);
                _jettag_c_get_68_18.doEnd();
                out.setTag(null,-1,-1);
                out.write(";");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tpublic function add");  //$NON-NLS-1$        
                out.setTag("get",3198,3244);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_71_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_22); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_71_22.setRuntimeParent(_jettag_c_if_65_9);
                _jettag_c_get_71_22.setTagInfo(_td_c_get_71_22);
                _jettag_c_get_71_22.doStart(context, out);
                _jettag_c_get_71_22.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",3246,3286);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_71_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_70); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_71_70.setRuntimeParent(_jettag_c_if_65_9);
                _jettag_c_get_71_70.setTagInfo(_td_c_get_71_70);
                _jettag_c_get_71_70.doStart(context, out);
                _jettag_c_get_71_70.doEnd();
                out.setTag(null,-1,-1);
                out.write(")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t{");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t$this->");  //$NON-NLS-1$        
                out.setTag("get",3302,3342);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_73_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_73_11.setRuntimeParent(_jettag_c_if_65_9);
                _jettag_c_get_73_11.setTagInfo(_td_c_get_73_11);
                _jettag_c_get_73_11.doStart(context, out);
                _jettag_c_get_73_11.doEnd();
                out.setTag(null,-1,-1);
                out.write("[] = $");  //$NON-NLS-1$        
                out.setTag("get",3348,3388);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_73_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_57); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_73_57.setRuntimeParent(_jettag_c_if_65_9);
                _jettag_c_get_73_57.setTagInfo(_td_c_get_73_57);
                _jettag_c_get_73_57.doStart(context, out);
                _jettag_c_get_73_57.doEnd();
                out.setTag(null,-1,-1);
                out.write(";");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tpublic function remove");  //$NON-NLS-1$        
                out.setTag("get",3421,3467);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_76_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_76_25); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_76_25.setRuntimeParent(_jettag_c_if_65_9);
                _jettag_c_get_76_25.setTagInfo(_td_c_get_76_25);
                _jettag_c_get_76_25.doStart(context, out);
                _jettag_c_get_76_25.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",3469,3509);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_76_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_76_73); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_76_73.setRuntimeParent(_jettag_c_if_65_9);
                _jettag_c_get_76_73.setTagInfo(_td_c_get_76_73);
                _jettag_c_get_76_73.doStart(context, out);
                _jettag_c_get_76_73.doEnd();
                out.setTag(null,-1,-1);
                out.write(")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t{");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tforeach ($this->");  //$NON-NLS-1$        
                out.setTag("get",3534,3574);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_78_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_78_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_78_20.setRuntimeParent(_jettag_c_if_65_9);
                _jettag_c_get_78_20.setTagInfo(_td_c_get_78_20);
                _jettag_c_get_78_20.doStart(context, out);
                _jettag_c_get_78_20.doEnd();
                out.setTag(null,-1,-1);
                out.write(" as $key => $value) {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\tif ($value->getId() == $");  //$NON-NLS-1$        
                out.setTag("get",3624,3664);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_79_29 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_29); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_79_29.setRuntimeParent(_jettag_c_if_65_9);
                _jettag_c_get_79_29.setTagInfo(_td_c_get_79_29);
                _jettag_c_get_79_29.doStart(context, out);
                _jettag_c_get_79_29.doEnd();
                out.setTag(null,-1,-1);
                out.write("->getId()) {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tunset($this->");  //$NON-NLS-1$        
                out.setTag("get",3695,3735);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_80_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_80_19); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_80_19.setRuntimeParent(_jettag_c_if_65_9);
                _jettag_c_get_80_19.setTagInfo(_td_c_get_80_19);
                _jettag_c_get_80_19.doStart(context, out);
                _jettag_c_get_80_19.doEnd();
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
                out.setTag("get",3789,3835);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_85_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_85_28); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_85_28.setRuntimeParent(_jettag_c_if_65_9);
                _jettag_c_get_85_28.setTagInfo(_td_c_get_85_28);
                _jettag_c_get_85_28.doStart(context, out);
                _jettag_c_get_85_28.doEnd();
                out.setTag(null,-1,-1);
                out.write("()");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t{");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t$this->");  //$NON-NLS-1$        
                out.setTag("get",3852,3892);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_87_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_87_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_87_11.setRuntimeParent(_jettag_c_if_65_9);
                _jettag_c_get_87_11.setTagInfo(_td_c_get_87_11);
                _jettag_c_get_87_11.doStart(context, out);
                _jettag_c_get_87_11.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = array();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_65_9.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_65_9.doEnd();
            out.endTag("if",873);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_32_2.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_32_2.doEnd();
        out.loopEnd();
        out.endTag("iterate",2672);
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
