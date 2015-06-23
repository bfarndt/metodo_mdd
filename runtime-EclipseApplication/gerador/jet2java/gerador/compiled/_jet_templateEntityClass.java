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
    private static final TagInfo _td_c_get_41_11 = new TagInfo("c:get", //$NON-NLS-1$
            41, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_55 = new TagInfo("c:get", //$NON-NLS-1$
            41, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_43_9 = new TagInfo("c:if", //$NON-NLS-1$
            43, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and (($currentFeature/@min > 1) or ($currentFeature/@max > 1))", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_22 = new TagInfo("c:get", //$NON-NLS-1$
            44, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_18 = new TagInfo("c:get", //$NON-NLS-1$
            46, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_22 = new TagInfo("c:get", //$NON-NLS-1$
            49, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_70 = new TagInfo("c:get", //$NON-NLS-1$
            49, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_11 = new TagInfo("c:get", //$NON-NLS-1$
            51, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_57 = new TagInfo("c:get", //$NON-NLS-1$
            51, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_25 = new TagInfo("c:get", //$NON-NLS-1$
            54, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_73 = new TagInfo("c:get", //$NON-NLS-1$
            54, 73,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_20 = new TagInfo("c:get", //$NON-NLS-1$
            56, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_29 = new TagInfo("c:get", //$NON-NLS-1$
            57, 29,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_58_19 = new TagInfo("c:get", //$NON-NLS-1$
            58, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_28 = new TagInfo("c:get", //$NON-NLS-1$
            63, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_65_11 = new TagInfo("c:get", //$NON-NLS-1$
            65, 11,
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
                out.write("\t\t\t$this->");  //$NON-NLS-1$        
                out.setTag("get",1677,1717);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_41_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_41_11.setRuntimeParent(_jettag_c_if_33_3);
                _jettag_c_get_41_11.setTagInfo(_td_c_get_41_11);
                _jettag_c_get_41_11.doStart(context, out);
                _jettag_c_get_41_11.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = $");  //$NON-NLS-1$        
                out.setTag("get",1721,1761);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_41_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_41_55.setRuntimeParent(_jettag_c_if_33_3);
                _jettag_c_get_41_55.setTagInfo(_td_c_get_41_55);
                _jettag_c_get_41_55.doStart(context, out);
                _jettag_c_get_41_55.doEnd();
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
            out.endTag("if",355);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(124);
            out.setTag("if",1775,1899);
            RuntimeTagElement _jettag_c_if_43_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_43_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_43_9.setRuntimeParent(_jettag_c_iterate_32_2);
            _jettag_c_if_43_9.setTagInfo(_td_c_if_43_9);
            _jettag_c_if_43_9.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_43_9.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\tpublic function get");  //$NON-NLS-1$        
                out.setTag("get",1921,1967);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_44_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_22); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_44_22.setRuntimeParent(_jettag_c_if_43_9);
                _jettag_c_get_44_22.setTagInfo(_td_c_get_44_22);
                _jettag_c_get_44_22.doStart(context, out);
                _jettag_c_get_44_22.doEnd();
                out.setTag(null,-1,-1);
                out.write("()");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t{");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\treturn $this->");  //$NON-NLS-1$        
                out.setTag("get",1991,2031);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_46_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_46_18.setRuntimeParent(_jettag_c_if_43_9);
                _jettag_c_get_46_18.setTagInfo(_td_c_get_46_18);
                _jettag_c_get_46_18.doStart(context, out);
                _jettag_c_get_46_18.doEnd();
                out.setTag(null,-1,-1);
                out.write(";");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tpublic function add");  //$NON-NLS-1$        
                out.setTag("get",2061,2107);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_49_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_22); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_49_22.setRuntimeParent(_jettag_c_if_43_9);
                _jettag_c_get_49_22.setTagInfo(_td_c_get_49_22);
                _jettag_c_get_49_22.doStart(context, out);
                _jettag_c_get_49_22.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",2109,2149);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_49_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_70); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_49_70.setRuntimeParent(_jettag_c_if_43_9);
                _jettag_c_get_49_70.setTagInfo(_td_c_get_49_70);
                _jettag_c_get_49_70.doStart(context, out);
                _jettag_c_get_49_70.doEnd();
                out.setTag(null,-1,-1);
                out.write(")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t{");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t$this->");  //$NON-NLS-1$        
                out.setTag("get",2165,2205);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_51_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_51_11.setRuntimeParent(_jettag_c_if_43_9);
                _jettag_c_get_51_11.setTagInfo(_td_c_get_51_11);
                _jettag_c_get_51_11.doStart(context, out);
                _jettag_c_get_51_11.doEnd();
                out.setTag(null,-1,-1);
                out.write("[] = $");  //$NON-NLS-1$        
                out.setTag("get",2211,2251);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_51_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_57); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_51_57.setRuntimeParent(_jettag_c_if_43_9);
                _jettag_c_get_51_57.setTagInfo(_td_c_get_51_57);
                _jettag_c_get_51_57.doStart(context, out);
                _jettag_c_get_51_57.doEnd();
                out.setTag(null,-1,-1);
                out.write(";");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tpublic function remove");  //$NON-NLS-1$        
                out.setTag("get",2284,2330);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_54_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_54_25); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_54_25.setRuntimeParent(_jettag_c_if_43_9);
                _jettag_c_get_54_25.setTagInfo(_td_c_get_54_25);
                _jettag_c_get_54_25.doStart(context, out);
                _jettag_c_get_54_25.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",2332,2372);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_54_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_54_73); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_54_73.setRuntimeParent(_jettag_c_if_43_9);
                _jettag_c_get_54_73.setTagInfo(_td_c_get_54_73);
                _jettag_c_get_54_73.doStart(context, out);
                _jettag_c_get_54_73.doEnd();
                out.setTag(null,-1,-1);
                out.write(")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t{");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tforeach ($this->");  //$NON-NLS-1$        
                out.setTag("get",2397,2437);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_56_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_56_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_56_20.setRuntimeParent(_jettag_c_if_43_9);
                _jettag_c_get_56_20.setTagInfo(_td_c_get_56_20);
                _jettag_c_get_56_20.doStart(context, out);
                _jettag_c_get_56_20.doEnd();
                out.setTag(null,-1,-1);
                out.write(" as $key => $value) {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\tif ($value->getId() == $");  //$NON-NLS-1$        
                out.setTag("get",2487,2527);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_57_29 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_29); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_57_29.setRuntimeParent(_jettag_c_if_43_9);
                _jettag_c_get_57_29.setTagInfo(_td_c_get_57_29);
                _jettag_c_get_57_29.doStart(context, out);
                _jettag_c_get_57_29.doEnd();
                out.setTag(null,-1,-1);
                out.write("->getId()) {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tunset($this->");  //$NON-NLS-1$        
                out.setTag("get",2558,2598);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_58_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_58_19); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_58_19.setRuntimeParent(_jettag_c_if_43_9);
                _jettag_c_get_58_19.setTagInfo(_td_c_get_58_19);
                _jettag_c_get_58_19.doStart(context, out);
                _jettag_c_get_58_19.doEnd();
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
                out.setTag("get",2652,2698);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_63_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_28); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_63_28.setRuntimeParent(_jettag_c_if_43_9);
                _jettag_c_get_63_28.setTagInfo(_td_c_get_63_28);
                _jettag_c_get_63_28.doStart(context, out);
                _jettag_c_get_63_28.doEnd();
                out.setTag(null,-1,-1);
                out.write("()");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t{");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t$this->");  //$NON-NLS-1$        
                out.setTag("get",2715,2755);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_65_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_65_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_65_11.setRuntimeParent(_jettag_c_if_43_9);
                _jettag_c_get_65_11.setTagInfo(_td_c_get_65_11);
                _jettag_c_get_65_11.doStart(context, out);
                _jettag_c_get_65_11.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = array();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_43_9.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_43_9.doEnd();
            out.endTag("if",873);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_32_2.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_32_2.doEnd();
        out.loopEnd();
        out.endTag("iterate",1535);
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
