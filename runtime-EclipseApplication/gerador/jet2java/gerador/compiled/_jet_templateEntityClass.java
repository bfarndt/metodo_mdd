package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_templateEntityClass implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_f = "org.eclipse.jet.formatTags"; //$NON-NLS-1$

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
    private static final TagInfo _td_f_uc_3_18 = new TagInfo("f:uc", //$NON-NLS-1$
            3, 18,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_35 = new TagInfo("c:get", //$NON-NLS-1$
            3, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_5_8 = new TagInfo("f:uc", //$NON-NLS-1$
            5, 8,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_25 = new TagInfo("c:get", //$NON-NLS-1$
            5, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
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
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_16_11 = new TagInfo("f:uc", //$NON-NLS-1$
            16, 11,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_28 = new TagInfo("c:get", //$NON-NLS-1$
            16, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_16_102 = new TagInfo("c:if", //$NON-NLS-1$
            16, 102,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_31_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            31, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_32_22 = new TagInfo("f:uc", //$NON-NLS-1$
            32, 22,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_39 = new TagInfo("c:get", //$NON-NLS-1$
            32, 39,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_18 = new TagInfo("c:get", //$NON-NLS-1$
            34, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_37_22 = new TagInfo("f:uc", //$NON-NLS-1$
            37, 22,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_39 = new TagInfo("c:get", //$NON-NLS-1$
            37, 39,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_88 = new TagInfo("c:get", //$NON-NLS-1$
            37, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_11 = new TagInfo("c:get", //$NON-NLS-1$
            39, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_55 = new TagInfo("c:get", //$NON-NLS-1$
            39, 55,
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
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(17);
                out.setTag("uc",149,166);
                RuntimeTagElement _jettag_f_uc_3_18 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_3_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_uc_3_18.setRuntimeParent(_jettag_c_if_2_66);
                _jettag_f_uc_3_18.setTagInfo(_td_f_uc_3_18);
                _jettag_f_uc_3_18.doStart(context, out);
                JET2Writer _jettag_f_uc_3_18_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_uc_3_18.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",166,224);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_3_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_35); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_3_35.setRuntimeParent(_jettag_f_uc_3_18);
                    _jettag_c_get_3_35.setTagInfo(_td_c_get_3_35);
                    _jettag_c_get_3_35.doStart(context, out);
                    _jettag_c_get_3_35.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_uc_3_18.handleBodyContent(out);
                }
                out = _jettag_f_uc_3_18_saved_out;
        out.bodyContentEnd();
                _jettag_f_uc_3_18.doEnd();
                out.endTag("uc",58);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(".class.php\";");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_2_66.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_2_66.doEnd();
            out.endTag("if",108);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_2_2.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_2_2.doEnd();
        out.loopEnd();
        out.endTag("iterate",179);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write(NL);         
        out.write("\tclass ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(17);
        out.setTag("uc",271,288);
        RuntimeTagElement _jettag_f_uc_5_8 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_5_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_uc_5_8.setRuntimeParent(null);
        _jettag_f_uc_5_8.setTagInfo(_td_f_uc_5_8);
        _jettag_f_uc_5_8.doStart(context, out);
        JET2Writer _jettag_f_uc_5_8_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_uc_5_8.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",288,327);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
            RuntimeTagElement _jettag_c_get_5_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_25); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_5_25.setRuntimeParent(_jettag_f_uc_5_8);
            _jettag_c_get_5_25.setTagInfo(_td_c_get_5_25);
            _jettag_c_get_5_25.doStart(context, out);
            _jettag_c_get_5_25.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_f_uc_5_8.handleBodyContent(out);
        }
        out = _jettag_f_uc_5_8_saved_out;
out.bodyContentEnd();
        _jettag_f_uc_5_8.doEnd();
        out.endTag("uc",39);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(NL);         
        out.write("\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tprivate $id;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(68);
        out.setTag("iterate",355,423);
        RuntimeTagElement _jettag_c_iterate_8_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_8_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_8_3.setRuntimeParent(null);
        _jettag_c_iterate_8_3.setTagInfo(_td_c_iterate_8_3);
        _jettag_c_iterate_8_3.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_8_3.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_8_3.getTagInfo().getAttribute("delimiter"),355,423);
            out.loopIterate();
            out.write("private $");  //$NON-NLS-1$        
            out.setTag("get",432,472);
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
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tpublic function __construct()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(69);
        out.setTag("iterate",531,600);
        RuntimeTagElement _jettag_c_iterate_14_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_14_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_14_4.setRuntimeParent(null);
        _jettag_c_iterate_14_4.setTagInfo(_td_c_iterate_14_4);
        _jettag_c_iterate_14_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_14_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_14_4.getTagInfo().getAttribute("delimiter"),531,600);
            out.loopIterate();
            out.write("$this->");  //$NON-NLS-1$        
            out.setTag("get",607,647);
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
    out.jump(67);
            out.setTag("if",650,717);
            RuntimeTagElement _jettag_c_if_15_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_15_56); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_15_56.setRuntimeParent(_jettag_c_iterate_14_4);
            _jettag_c_if_15_56.setTagInfo(_td_c_if_15_56);
            _jettag_c_if_15_56.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_15_56.okToProcessBody()) {
                out.write("new ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(17);
                out.setTag("uc",721,738);
                RuntimeTagElement _jettag_f_uc_16_11 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_16_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_uc_16_11.setRuntimeParent(_jettag_c_if_15_56);
                _jettag_f_uc_16_11.setTagInfo(_td_f_uc_16_11);
                _jettag_f_uc_16_11.doStart(context, out);
                JET2Writer _jettag_f_uc_16_11_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_uc_16_11.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",738,796);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_16_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_28); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_16_28.setRuntimeParent(_jettag_f_uc_16_11);
                    _jettag_c_get_16_28.setTagInfo(_td_c_get_16_28);
                    _jettag_c_get_16_28.doStart(context, out);
                    _jettag_c_get_16_28.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_uc_16_11.handleBodyContent(out);
                }
                out = _jettag_f_uc_16_11_saved_out;
        out.bodyContentEnd();
                _jettag_f_uc_16_11.doEnd();
                out.endTag("uc",58);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("()");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_15_56.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_15_56.doEnd();
            out.endTag("if",88);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(70);
            out.setTag("if",812,882);
            RuntimeTagElement _jettag_c_if_16_102 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_16_102); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_16_102.setRuntimeParent(_jettag_c_iterate_14_4);
            _jettag_c_if_16_102.setTagInfo(_td_c_if_16_102);
            _jettag_c_if_16_102.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_16_102.okToProcessBody()) {
                out.write("\"\"");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_16_102.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_16_102.doEnd();
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
        out.endTag("iterate",296);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tpublic function getId()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn $this->id;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tpublic function setId($id)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t$this->id = $id;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(64);
        out.setTag("iterate",1035,1099);
        RuntimeTagElement _jettag_c_iterate_31_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_31_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_31_2.setRuntimeParent(null);
        _jettag_c_iterate_31_2.setTagInfo(_td_c_iterate_31_2);
        _jettag_c_iterate_31_2.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_31_2.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_31_2.getTagInfo().getAttribute("delimiter"),1035,1099);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\tpublic function get");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(17);
            out.setTag("uc",1121,1138);
            RuntimeTagElement _jettag_f_uc_32_22 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_32_22); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_uc_32_22.setRuntimeParent(_jettag_c_iterate_31_2);
            _jettag_f_uc_32_22.setTagInfo(_td_f_uc_32_22);
            _jettag_f_uc_32_22.doStart(context, out);
            JET2Writer _jettag_f_uc_32_22_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_f_uc_32_22.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.setTag("get",1138,1178);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_32_39 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_39); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_32_39.setRuntimeParent(_jettag_f_uc_32_22);
                _jettag_c_get_32_39.setTagInfo(_td_c_get_32_39);
                _jettag_c_get_32_39.doStart(context, out);
                _jettag_c_get_32_39.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_f_uc_32_22.handleBodyContent(out);
            }
            out = _jettag_f_uc_32_22_saved_out;
    out.bodyContentEnd();
            _jettag_f_uc_32_22.doEnd();
            out.endTag("uc",40);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write("()");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t{");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\treturn $this->");  //$NON-NLS-1$        
            out.setTag("get",1209,1249);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(40);
            RuntimeTagElement _jettag_c_get_34_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_18); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_34_18.setRuntimeParent(_jettag_c_iterate_31_2);
            _jettag_c_get_34_18.setTagInfo(_td_c_get_34_18);
            _jettag_c_get_34_18.doStart(context, out);
            _jettag_c_get_34_18.doEnd();
            out.setTag(null,-1,-1);
            out.write(";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tpublic function set");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(17);
            out.setTag("uc",1279,1296);
            RuntimeTagElement _jettag_f_uc_37_22 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_37_22); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_uc_37_22.setRuntimeParent(_jettag_c_iterate_31_2);
            _jettag_f_uc_37_22.setTagInfo(_td_f_uc_37_22);
            _jettag_f_uc_37_22.doStart(context, out);
            JET2Writer _jettag_f_uc_37_22_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_f_uc_37_22.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.setTag("get",1296,1336);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_37_39 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_39); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_37_39.setRuntimeParent(_jettag_f_uc_37_22);
                _jettag_c_get_37_39.setTagInfo(_td_c_get_37_39);
                _jettag_c_get_37_39.doStart(context, out);
                _jettag_c_get_37_39.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_f_uc_37_22.handleBodyContent(out);
            }
            out = _jettag_f_uc_37_22_saved_out;
    out.bodyContentEnd();
            _jettag_f_uc_37_22.doEnd();
            out.endTag("uc",40);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write("($");  //$NON-NLS-1$        
            out.setTag("get",1345,1385);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(40);
            RuntimeTagElement _jettag_c_get_37_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_88); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_37_88.setRuntimeParent(_jettag_c_iterate_31_2);
            _jettag_c_get_37_88.setTagInfo(_td_c_get_37_88);
            _jettag_c_get_37_88.doStart(context, out);
            _jettag_c_get_37_88.doEnd();
            out.setTag(null,-1,-1);
            out.write(")");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t{");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t$this->");  //$NON-NLS-1$        
            out.setTag("get",1401,1441);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(40);
            RuntimeTagElement _jettag_c_get_39_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_39_11.setRuntimeParent(_jettag_c_iterate_31_2);
            _jettag_c_get_39_11.setTagInfo(_td_c_get_39_11);
            _jettag_c_get_39_11.doStart(context, out);
            _jettag_c_get_39_11.doEnd();
            out.setTag(null,-1,-1);
            out.write(" = $");  //$NON-NLS-1$        
            out.setTag("get",1445,1485);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(40);
            RuntimeTagElement _jettag_c_get_39_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_55); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_39_55.setRuntimeParent(_jettag_c_iterate_31_2);
            _jettag_c_get_39_55.setTagInfo(_td_c_get_39_55);
            _jettag_c_get_39_55.doStart(context, out);
            _jettag_c_get_39_55.doEnd();
            out.setTag(null,-1,-1);
            out.write(";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_31_2.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_31_2.doEnd();
        out.loopEnd();
        out.endTag("iterate",393);
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
