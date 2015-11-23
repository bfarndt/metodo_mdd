package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_settings implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_f = "org.eclipse.jet.formatTags"; //$NON-NLS-1$

    public _jet_settings(String templateFile) {
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
    private static final TagInfo _td_c_set_2_2 = new TagInfo("c:set", //$NON-NLS-1$
            2, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity", //$NON-NLS-1$
                "className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_2_50 = new TagInfo("f:uc", //$NON-NLS-1$
            2, 50,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_2_67 = new TagInfo("c:get", //$NON-NLS-1$
            2, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_3_2 = new TagInfo("c:set", //$NON-NLS-1$
            3, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity", //$NON-NLS-1$
                "tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_3_52 = new TagInfo("f:lc", //$NON-NLS-1$
            3, 52,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_3_58 = new TagInfo("c:get", //$NON-NLS-1$
            3, 58,
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
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_6_3 = new TagInfo("c:set", //$NON-NLS-1$
            6, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature", //$NON-NLS-1$
                "methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_6_53 = new TagInfo("f:uc", //$NON-NLS-1$
            6, 53,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_70 = new TagInfo("c:get", //$NON-NLS-1$
            6, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
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
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(48);
            out.setTag("set",62,110);
            RuntimeTagElement _jettag_c_set_2_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_2_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_2_2.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_set_2_2.setTagInfo(_td_c_set_2_2);
            _jettag_c_set_2_2.doStart(context, out);
            JET2Writer _jettag_c_set_2_2_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_c_set_2_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(17);
                out.setTag("uc",110,127);
                RuntimeTagElement _jettag_f_uc_2_50 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_2_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_uc_2_50.setRuntimeParent(_jettag_c_set_2_2);
                _jettag_f_uc_2_50.setTagInfo(_td_f_uc_2_50);
                _jettag_f_uc_2_50.doStart(context, out);
                JET2Writer _jettag_f_uc_2_50_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_uc_2_50.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",127,166);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(39);
                    RuntimeTagElement _jettag_c_get_2_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_67); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_2_67.setRuntimeParent(_jettag_f_uc_2_50);
                    _jettag_c_get_2_67.setTagInfo(_td_c_get_2_67);
                    _jettag_c_get_2_67.doStart(context, out);
                    _jettag_c_get_2_67.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_uc_2_50.handleBodyContent(out);
                }
                out = _jettag_f_uc_2_50_saved_out;
        out.bodyContentEnd();
                _jettag_f_uc_2_50.doEnd();
                out.endTag("uc",39);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
    out.bodyContentStart();
                _jettag_c_set_2_2.handleBodyContent(out);
            }
            out = _jettag_c_set_2_2_saved_out;
    out.bodyContentEnd();
            _jettag_c_set_2_2.doEnd();
            out.endTag("set",63);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(8);
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(50);
            out.setTag("set",183,233);
            RuntimeTagElement _jettag_c_set_3_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_3_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_3_2.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_set_3_2.setTagInfo(_td_c_set_3_2);
            _jettag_c_set_3_2.doStart(context, out);
            JET2Writer _jettag_c_set_3_2_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_c_set_3_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(6);
                out.setTag("lc",233,239);
                RuntimeTagElement _jettag_f_lc_3_52 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_3_52); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_lc_3_52.setRuntimeParent(_jettag_c_set_3_2);
                _jettag_f_lc_3_52.setTagInfo(_td_f_lc_3_52);
                _jettag_f_lc_3_52.doStart(context, out);
                JET2Writer _jettag_f_lc_3_52_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_lc_3_52.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",239,278);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(39);
                    RuntimeTagElement _jettag_c_get_3_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_58); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_3_58.setRuntimeParent(_jettag_f_lc_3_52);
                    _jettag_c_get_3_58.setTagInfo(_td_c_get_3_58);
                    _jettag_c_get_3_58.doStart(context, out);
                    _jettag_c_get_3_58.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_lc_3_52.handleBodyContent(out);
                }
                out = _jettag_f_lc_3_52_saved_out;
        out.bodyContentEnd();
                _jettag_f_lc_3_52.doEnd();
                out.endTag("lc",39);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
    out.bodyContentStart();
                _jettag_c_set_3_2.handleBodyContent(out);
            }
            out = _jettag_c_set_3_2_saved_out;
    out.bodyContentEnd();
            _jettag_c_set_3_2.doEnd();
            out.endTag("set",52);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(8);
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(64);
            out.setTag("iterate",297,361);
            RuntimeTagElement _jettag_c_iterate_5_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_5_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_5_2.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_iterate_5_2.setTagInfo(_td_c_iterate_5_2);
            _jettag_c_iterate_5_2.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_5_2.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_5_2.getTagInfo().getAttribute("delimiter"),297,361);
                out.loopIterate();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(50);
                out.setTag("set",364,414);
                RuntimeTagElement _jettag_c_set_6_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_6_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_6_3.setRuntimeParent(_jettag_c_iterate_5_2);
                _jettag_c_set_6_3.setTagInfo(_td_c_set_6_3);
                _jettag_c_set_6_3.doStart(context, out);
                JET2Writer _jettag_c_set_6_3_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_c_set_6_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(17);
                    out.setTag("uc",414,431);
                    RuntimeTagElement _jettag_f_uc_6_53 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_6_53); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_f_uc_6_53.setRuntimeParent(_jettag_c_set_6_3);
                    _jettag_f_uc_6_53.setTagInfo(_td_f_uc_6_53);
                    _jettag_f_uc_6_53.doStart(context, out);
                    JET2Writer _jettag_f_uc_6_53_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_f_uc_6_53.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.setTag("get",431,471);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(40);
                        RuntimeTagElement _jettag_c_get_6_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_70); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_6_70.setRuntimeParent(_jettag_f_uc_6_53);
                        _jettag_c_get_6_70.setTagInfo(_td_c_get_6_70);
                        _jettag_c_get_6_70.doStart(context, out);
                        _jettag_c_get_6_70.doEnd();
                        out.setTag(null,-1,-1);
            out.bodyContentStart();
                        _jettag_f_uc_6_53.handleBodyContent(out);
                    }
                    out = _jettag_f_uc_6_53_saved_out;
            out.bodyContentEnd();
                    _jettag_f_uc_6_53.doEnd();
                    out.endTag("uc",40);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
        out.bodyContentStart();
                    _jettag_c_set_6_3.handleBodyContent(out);
                }
                out = _jettag_c_set_6_3_saved_out;
        out.bodyContentEnd();
                _jettag_c_set_6_3.doEnd();
                out.endTag("set",64);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(8);
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_iterate_5_2.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_5_2.doEnd();
            out.loopEnd();
            out.endTag("iterate",127);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_iterate_1_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_1_1.doEnd();
        out.loopEnd();
        out.endTag("iterate",441);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.popTemplateFile();
    }
}
