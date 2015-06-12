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
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_11 = new TagInfo("c:get", //$NON-NLS-1$
            16, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_16_83 = new TagInfo("c:if", //$NON-NLS-1$
            16, 83,
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
    private static final TagInfo _td_c_get_32_22 = new TagInfo("c:get", //$NON-NLS-1$
            32, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_18 = new TagInfo("c:get", //$NON-NLS-1$
            34, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_22 = new TagInfo("c:get", //$NON-NLS-1$
            37, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_70 = new TagInfo("c:get", //$NON-NLS-1$
            37, 70,
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
    out.jump(67);
            out.setTag("if",610,677);
            RuntimeTagElement _jettag_c_if_15_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_15_56); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_15_56.setRuntimeParent(_jettag_c_iterate_14_4);
            _jettag_c_if_15_56.setTagInfo(_td_c_if_15_56);
            _jettag_c_if_15_56.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_15_56.okToProcessBody()) {
                out.write("new ");  //$NON-NLS-1$        
                out.setTag("get",681,744);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(63);
                RuntimeTagElement _jettag_c_get_16_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_16_11.setRuntimeParent(_jettag_c_if_15_56);
                _jettag_c_get_16_11.setTagInfo(_td_c_get_16_11);
                _jettag_c_get_16_11.doStart(context, out);
                _jettag_c_get_16_11.doEnd();
                out.setTag(null,-1,-1);
                out.write("()");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_15_56.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_15_56.doEnd();
            out.endTag("if",69);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(70);
            out.setTag("if",753,823);
            RuntimeTagElement _jettag_c_if_16_83 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_16_83); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_16_83.setRuntimeParent(_jettag_c_iterate_14_4);
            _jettag_c_if_16_83.setTagInfo(_td_c_if_16_83);
            _jettag_c_if_16_83.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_16_83.okToProcessBody()) {
                out.write("\"\"");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_16_83.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_16_83.doEnd();
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
        out.endTag("iterate",277);
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
out.jump(64);
        out.setTag("iterate",970,1034);
        RuntimeTagElement _jettag_c_iterate_31_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_31_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_31_2.setRuntimeParent(null);
        _jettag_c_iterate_31_2.setTagInfo(_td_c_iterate_31_2);
        _jettag_c_iterate_31_2.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_31_2.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_31_2.getTagInfo().getAttribute("delimiter"),970,1034);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\tpublic function get");  //$NON-NLS-1$        
            out.setTag("get",1056,1102);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(46);
            RuntimeTagElement _jettag_c_get_32_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_22); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_32_22.setRuntimeParent(_jettag_c_iterate_31_2);
            _jettag_c_get_32_22.setTagInfo(_td_c_get_32_22);
            _jettag_c_get_32_22.doStart(context, out);
            _jettag_c_get_32_22.doEnd();
            out.setTag(null,-1,-1);
            out.write("()");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t{");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\treturn $this->");  //$NON-NLS-1$        
            out.setTag("get",1126,1166);
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
            out.write(NL);         
            out.write("\t\tpublic function set");  //$NON-NLS-1$        
            out.setTag("get",1194,1240);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(46);
            RuntimeTagElement _jettag_c_get_37_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_22); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_37_22.setRuntimeParent(_jettag_c_iterate_31_2);
            _jettag_c_get_37_22.setTagInfo(_td_c_get_37_22);
            _jettag_c_get_37_22.doStart(context, out);
            _jettag_c_get_37_22.doEnd();
            out.setTag(null,-1,-1);
            out.write("($");  //$NON-NLS-1$        
            out.setTag("get",1242,1282);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(40);
            RuntimeTagElement _jettag_c_get_37_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_70); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_37_70.setRuntimeParent(_jettag_c_iterate_31_2);
            _jettag_c_get_37_70.setTagInfo(_td_c_get_37_70);
            _jettag_c_get_37_70.doStart(context, out);
            _jettag_c_get_37_70.doEnd();
            out.setTag(null,-1,-1);
            out.write(")");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t{");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t$this->");  //$NON-NLS-1$        
            out.setTag("get",1298,1338);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(40);
            RuntimeTagElement _jettag_c_get_39_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_39_11.setRuntimeParent(_jettag_c_iterate_31_2);
            _jettag_c_get_39_11.setTagInfo(_td_c_get_39_11);
            _jettag_c_get_39_11.doStart(context, out);
            _jettag_c_get_39_11.doEnd();
            out.setTag(null,-1,-1);
            out.write(" = $");  //$NON-NLS-1$        
            out.setTag("get",1342,1382);
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
        out.endTag("iterate",355);
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
