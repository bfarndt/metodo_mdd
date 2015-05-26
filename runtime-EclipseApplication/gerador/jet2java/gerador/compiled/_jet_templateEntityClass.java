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
    
    private static final TagInfo _td_f_uc_3_7 = new TagInfo("f:uc", //$NON-NLS-1$
            3, 7,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_24 = new TagInfo("c:get", //$NON-NLS-1$
            3, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_6_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            6, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_13 = new TagInfo("c:get", //$NON-NLS-1$
            7, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_20_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            20, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_21_21 = new TagInfo("f:uc", //$NON-NLS-1$
            21, 21,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_38 = new TagInfo("c:get", //$NON-NLS-1$
            21, 38,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_17 = new TagInfo("c:get", //$NON-NLS-1$
            23, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_26_21 = new TagInfo("f:uc", //$NON-NLS-1$
            26, 21,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_38 = new TagInfo("c:get", //$NON-NLS-1$
            26, 38,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_87 = new TagInfo("c:get", //$NON-NLS-1$
            26, 87,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_10 = new TagInfo("c:get", //$NON-NLS-1$
            28, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_54 = new TagInfo("c:get", //$NON-NLS-1$
            28, 54,
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
        out.write(NL);         
        out.write("class ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(17);
        out.setTag("uc",13,30);
        RuntimeTagElement _jettag_f_uc_3_7 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_3_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_uc_3_7.setRuntimeParent(null);
        _jettag_f_uc_3_7.setTagInfo(_td_f_uc_3_7);
        _jettag_f_uc_3_7.doStart(context, out);
        JET2Writer _jettag_f_uc_3_7_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_uc_3_7.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",30,69);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
            RuntimeTagElement _jettag_c_get_3_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_24); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_3_24.setRuntimeParent(_jettag_f_uc_3_7);
            _jettag_c_get_3_24.setTagInfo(_td_c_get_3_24);
            _jettag_c_get_3_24.doStart(context, out);
            _jettag_c_get_3_24.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_f_uc_3_7.handleBodyContent(out);
        }
        out = _jettag_f_uc_3_7_saved_out;
out.bodyContentEnd();
        _jettag_f_uc_3_7.doEnd();
        out.endTag("uc",39);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(NL);         
        out.write("{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate $id;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(67);
        out.setTag("iterate",94,161);
        RuntimeTagElement _jettag_c_iterate_6_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_6_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_6_2.setRuntimeParent(null);
        _jettag_c_iterate_6_2.setTagInfo(_td_c_iterate_6_2);
        _jettag_c_iterate_6_2.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_6_2.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_6_2.getTagInfo().getAttribute("delimiter"),94,161);
            out.loopIterate();
            out.write("private $");  //$NON-NLS-1$        
            out.setTag("get",170,210);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(40);
            RuntimeTagElement _jettag_c_get_7_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_13); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_7_13.setRuntimeParent(_jettag_c_iterate_6_2);
            _jettag_c_get_7_13.setTagInfo(_td_c_get_7_13);
            _jettag_c_get_7_13.doStart(context, out);
            _jettag_c_get_7_13.doEnd();
            out.setTag(null,-1,-1);
            out.write(" = \"\";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_6_2.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_6_2.doEnd();
        out.loopEnd();
        out.endTag("iterate",57);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic function getId()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn $this->id;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic function setId($id)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$this->id = $id;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(64);
        out.setTag("iterate",341,405);
        RuntimeTagElement _jettag_c_iterate_20_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_20_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_20_1.setRuntimeParent(null);
        _jettag_c_iterate_20_1.setTagInfo(_td_c_iterate_20_1);
        _jettag_c_iterate_20_1.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_20_1.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_20_1.getTagInfo().getAttribute("delimiter"),341,405);
            out.loopIterate();
            out.write(NL);         
            out.write("\tpublic function get");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(17);
            out.setTag("uc",426,443);
            RuntimeTagElement _jettag_f_uc_21_21 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_21_21); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_uc_21_21.setRuntimeParent(_jettag_c_iterate_20_1);
            _jettag_f_uc_21_21.setTagInfo(_td_f_uc_21_21);
            _jettag_f_uc_21_21.doStart(context, out);
            JET2Writer _jettag_f_uc_21_21_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_f_uc_21_21.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.setTag("get",443,483);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_21_38 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_38); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_21_38.setRuntimeParent(_jettag_f_uc_21_21);
                _jettag_c_get_21_38.setTagInfo(_td_c_get_21_38);
                _jettag_c_get_21_38.doStart(context, out);
                _jettag_c_get_21_38.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_f_uc_21_21.handleBodyContent(out);
            }
            out = _jettag_f_uc_21_21_saved_out;
    out.bodyContentEnd();
            _jettag_f_uc_21_21.doEnd();
            out.endTag("uc",40);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write("()");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t{");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\treturn $this->");  //$NON-NLS-1$        
            out.setTag("get",512,552);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(40);
            RuntimeTagElement _jettag_c_get_23_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_17); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_23_17.setRuntimeParent(_jettag_c_iterate_20_1);
            _jettag_c_get_23_17.setTagInfo(_td_c_get_23_17);
            _jettag_c_get_23_17.doStart(context, out);
            _jettag_c_get_23_17.doEnd();
            out.setTag(null,-1,-1);
            out.write(";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tpublic function set");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(17);
            out.setTag("uc",579,596);
            RuntimeTagElement _jettag_f_uc_26_21 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_26_21); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_uc_26_21.setRuntimeParent(_jettag_c_iterate_20_1);
            _jettag_f_uc_26_21.setTagInfo(_td_f_uc_26_21);
            _jettag_f_uc_26_21.doStart(context, out);
            JET2Writer _jettag_f_uc_26_21_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_f_uc_26_21.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.setTag("get",596,636);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_26_38 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_38); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_26_38.setRuntimeParent(_jettag_f_uc_26_21);
                _jettag_c_get_26_38.setTagInfo(_td_c_get_26_38);
                _jettag_c_get_26_38.doStart(context, out);
                _jettag_c_get_26_38.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_f_uc_26_21.handleBodyContent(out);
            }
            out = _jettag_f_uc_26_21_saved_out;
    out.bodyContentEnd();
            _jettag_f_uc_26_21.doEnd();
            out.endTag("uc",40);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write("($");  //$NON-NLS-1$        
            out.setTag("get",645,685);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(40);
            RuntimeTagElement _jettag_c_get_26_87 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_87); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_26_87.setRuntimeParent(_jettag_c_iterate_20_1);
            _jettag_c_get_26_87.setTagInfo(_td_c_get_26_87);
            _jettag_c_get_26_87.doStart(context, out);
            _jettag_c_get_26_87.doEnd();
            out.setTag(null,-1,-1);
            out.write(")");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t{");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t$this->");  //$NON-NLS-1$        
            out.setTag("get",699,739);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(40);
            RuntimeTagElement _jettag_c_get_28_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_28_10.setRuntimeParent(_jettag_c_iterate_20_1);
            _jettag_c_get_28_10.setTagInfo(_td_c_get_28_10);
            _jettag_c_get_28_10.doStart(context, out);
            _jettag_c_get_28_10.doEnd();
            out.setTag(null,-1,-1);
            out.write(" = $");  //$NON-NLS-1$        
            out.setTag("get",743,783);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(40);
            RuntimeTagElement _jettag_c_get_28_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_54); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_28_54.setRuntimeParent(_jettag_c_iterate_20_1);
            _jettag_c_get_28_54.setTagInfo(_td_c_get_28_54);
            _jettag_c_get_28_54.doStart(context, out);
            _jettag_c_get_28_54.doEnd();
            out.setTag(null,-1,-1);
            out.write(";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t}");  //$NON-NLS-1$        
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_iterate_20_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_20_1.doEnd();
        out.loopEnd();
        out.endTag("iterate",383);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("?>");  //$NON-NLS-1$        
        out.popTemplateFile();
    }
}
