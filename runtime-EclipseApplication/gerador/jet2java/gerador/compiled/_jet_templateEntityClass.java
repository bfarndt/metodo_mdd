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
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_5_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            5, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$e/Feature", //$NON-NLS-1$
                "f", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_12 = new TagInfo("c:get", //$NON-NLS-1$
            6, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$f/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_8_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            8, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$e/Feature", //$NON-NLS-1$
                "f", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_9_22 = new TagInfo("f:uc", //$NON-NLS-1$
            9, 22,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_39 = new TagInfo("c:get", //$NON-NLS-1$
            9, 39,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$f/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_18 = new TagInfo("c:get", //$NON-NLS-1$
            11, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$f/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_14_22 = new TagInfo("f:uc", //$NON-NLS-1$
            14, 22,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_39 = new TagInfo("c:get", //$NON-NLS-1$
            14, 39,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$f/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_75 = new TagInfo("c:get", //$NON-NLS-1$
            14, 75,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$f/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_11 = new TagInfo("c:get", //$NON-NLS-1$
            16, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$f/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_41 = new TagInfo("c:get", //$NON-NLS-1$
            16, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$f/@name", //$NON-NLS-1$
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
            out.setTag("get",30,57);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
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
        out.endTag("uc",27);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(NL);         
        out.write("{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(39);
        out.setTag("iterate",68,107);
        RuntimeTagElement _jettag_c_iterate_5_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_5_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_5_2.setRuntimeParent(null);
        _jettag_c_iterate_5_2.setTagInfo(_td_c_iterate_5_2);
        _jettag_c_iterate_5_2.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_5_2.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_5_2.getTagInfo().getAttribute("delimiter"),68,107);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\tprivate $");  //$NON-NLS-1$        
            out.setTag("get",119,146);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_6_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_6_12.setRuntimeParent(_jettag_c_iterate_5_2);
            _jettag_c_get_6_12.setTagInfo(_td_c_get_6_12);
            _jettag_c_get_6_12.doStart(context, out);
            _jettag_c_get_6_12.doEnd();
            out.setTag(null,-1,-1);
            out.write(";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_5_2.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_5_2.doEnd();
        out.loopEnd();
        out.endTag("iterate",42);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(39);
        out.setTag("iterate",163,202);
        RuntimeTagElement _jettag_c_iterate_8_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_8_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_8_2.setRuntimeParent(null);
        _jettag_c_iterate_8_2.setTagInfo(_td_c_iterate_8_2);
        _jettag_c_iterate_8_2.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_8_2.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_8_2.getTagInfo().getAttribute("delimiter"),163,202);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\tpublic function get");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(17);
            out.setTag("uc",224,241);
            RuntimeTagElement _jettag_f_uc_9_22 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_9_22); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_uc_9_22.setRuntimeParent(_jettag_c_iterate_8_2);
            _jettag_f_uc_9_22.setTagInfo(_td_f_uc_9_22);
            _jettag_f_uc_9_22.doStart(context, out);
            JET2Writer _jettag_f_uc_9_22_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_f_uc_9_22.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.setTag("get",241,268);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(27);
                RuntimeTagElement _jettag_c_get_9_39 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_39); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_9_39.setRuntimeParent(_jettag_f_uc_9_22);
                _jettag_c_get_9_39.setTagInfo(_td_c_get_9_39);
                _jettag_c_get_9_39.doStart(context, out);
                _jettag_c_get_9_39.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_f_uc_9_22.handleBodyContent(out);
            }
            out = _jettag_f_uc_9_22_saved_out;
    out.bodyContentEnd();
            _jettag_f_uc_9_22.doEnd();
            out.endTag("uc",27);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write("()");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t{");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\treturn $this->");  //$NON-NLS-1$        
            out.setTag("get",299,326);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_11_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_18); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_11_18.setRuntimeParent(_jettag_c_iterate_8_2);
            _jettag_c_get_11_18.setTagInfo(_td_c_get_11_18);
            _jettag_c_get_11_18.doStart(context, out);
            _jettag_c_get_11_18.doEnd();
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
            out.setTag("uc",356,373);
            RuntimeTagElement _jettag_f_uc_14_22 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_14_22); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_uc_14_22.setRuntimeParent(_jettag_c_iterate_8_2);
            _jettag_f_uc_14_22.setTagInfo(_td_f_uc_14_22);
            _jettag_f_uc_14_22.doStart(context, out);
            JET2Writer _jettag_f_uc_14_22_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_f_uc_14_22.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.setTag("get",373,400);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(27);
                RuntimeTagElement _jettag_c_get_14_39 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_39); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_14_39.setRuntimeParent(_jettag_f_uc_14_22);
                _jettag_c_get_14_39.setTagInfo(_td_c_get_14_39);
                _jettag_c_get_14_39.doStart(context, out);
                _jettag_c_get_14_39.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_f_uc_14_22.handleBodyContent(out);
            }
            out = _jettag_f_uc_14_22_saved_out;
    out.bodyContentEnd();
            _jettag_f_uc_14_22.doEnd();
            out.endTag("uc",27);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write("($");  //$NON-NLS-1$        
            out.setTag("get",409,436);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_14_75 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_75); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_14_75.setRuntimeParent(_jettag_c_iterate_8_2);
            _jettag_c_get_14_75.setTagInfo(_td_c_get_14_75);
            _jettag_c_get_14_75.doStart(context, out);
            _jettag_c_get_14_75.doEnd();
            out.setTag(null,-1,-1);
            out.write(")");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t{");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t$this->");  //$NON-NLS-1$        
            out.setTag("get",452,479);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_16_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_16_11.setRuntimeParent(_jettag_c_iterate_8_2);
            _jettag_c_get_16_11.setTagInfo(_td_c_get_16_11);
            _jettag_c_get_16_11.doStart(context, out);
            _jettag_c_get_16_11.doEnd();
            out.setTag(null,-1,-1);
            out.write(" = ");  //$NON-NLS-1$        
            out.setTag("get",482,509);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_16_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_41); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_16_41.setRuntimeParent(_jettag_c_iterate_8_2);
            _jettag_c_get_16_41.setTagInfo(_td_c_get_16_41);
            _jettag_c_get_16_41.doStart(context, out);
            _jettag_c_get_16_41.doEnd();
            out.setTag(null,-1,-1);
            out.write(";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_8_2.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_8_2.doEnd();
        out.loopEnd();
        out.endTag("iterate",314);
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
