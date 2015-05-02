package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_templateSql implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_f = "org.eclipse.jet.formatTags"; //$NON-NLS-1$

    public _jet_templateSql(String templateFile) {
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
                "e", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_2_14 = new TagInfo("f:lc", //$NON-NLS-1$
            2, 14,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_2_20 = new TagInfo("c:get", //$NON-NLS-1$
            2, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_4_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            4, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$e/Feature", //$NON-NLS-1$
                "f", //$NON-NLS-1$
                ", ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_4 = new TagInfo("c:get", //$NON-NLS-1$
            5, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$f/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(48);
        out.setTag("iterate",0,48);
        RuntimeTagElement _jettag_c_iterate_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_1_1.setRuntimeParent(null);
        _jettag_c_iterate_1_1.setTagInfo(_td_c_iterate_1_1);
        _jettag_c_iterate_1_1.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_1_1.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_1_1.getTagInfo().getAttribute("delimiter"),0,48);
            out.loopIterate();
            out.write(NL);         
            out.write("CREATE TABLE ");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(6);
            out.setTag("lc",62,68);
            RuntimeTagElement _jettag_f_lc_2_14 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_2_14); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_lc_2_14.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_f_lc_2_14.setTagInfo(_td_f_lc_2_14);
            _jettag_f_lc_2_14.doStart(context, out);
            JET2Writer _jettag_f_lc_2_14_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_f_lc_2_14.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.setTag("get",68,95);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(27);
                RuntimeTagElement _jettag_c_get_2_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_2_20.setRuntimeParent(_jettag_f_lc_2_14);
                _jettag_c_get_2_20.setTagInfo(_td_c_get_2_20);
                _jettag_c_get_2_20.doStart(context, out);
                _jettag_c_get_2_20.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_f_lc_2_14.handleBodyContent(out);
            }
            out = _jettag_f_lc_2_14_saved_out;
    out.bodyContentEnd();
            _jettag_f_lc_2_14.doEnd();
            out.endTag("lc",27);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("(");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(57);
            out.setTag("iterate",106,163);
            RuntimeTagElement _jettag_c_iterate_4_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_4_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_4_2.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_iterate_4_2.setTagInfo(_td_c_iterate_4_2);
            _jettag_c_iterate_4_2.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_4_2.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_4_2.getTagInfo().getAttribute("delimiter"),106,163);
                out.loopIterate();
                out.setTag("get",163,190);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(27);
                RuntimeTagElement _jettag_c_get_5_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_5_4.setRuntimeParent(_jettag_c_iterate_4_2);
                _jettag_c_get_5_4.setTagInfo(_td_c_get_5_4);
                _jettag_c_get_5_4.doStart(context, out);
                _jettag_c_get_5_4.doEnd();
                out.setTag(null,-1,-1);
                out.write(" text");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_iterate_4_2.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_4_2.doEnd();
            out.loopEnd();
            out.endTag("iterate",32);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
            out.write(");");  //$NON-NLS-1$        
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_iterate_1_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_1_1.doEnd();
        out.loopEnd();
        out.endTag("iterate",163);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.popTemplateFile();
    }
}
