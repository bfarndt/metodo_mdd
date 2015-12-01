package my.jet.transformation.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_templateExemplo implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_templateExemplo(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_8_33 = new TagInfo("c:get", //$NON-NLS-1$
            8, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_10_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            10, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$e/Feature", //$NON-NLS-1$
                "f", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_19 = new TagInfo("c:get", //$NON-NLS-1$
            11, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$f/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_55 = new TagInfo("c:get", //$NON-NLS-1$
            11, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$f/type/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        out.write("<html>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<head><title>teste</title></head>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<?php");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("Achei uma entidade! Seu nome é: ");  //$NON-NLS-1$        
        out.setTag("get",85,112);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(27);
        RuntimeTagElement _jettag_c_get_8_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_33); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_33.setRuntimeParent(null);
        _jettag_c_get_8_33.setTagInfo(_td_c_get_8_33);
        _jettag_c_get_8_33.doStart(context, out);
        _jettag_c_get_8_33.doEnd();
        out.setTag(null,-1,-1);
        out.write(NL);         
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(39);
        out.setTag("iterate",114,153);
        RuntimeTagElement _jettag_c_iterate_10_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_10_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_10_1.setRuntimeParent(null);
        _jettag_c_iterate_10_1.setTagInfo(_td_c_iterate_10_1);
        _jettag_c_iterate_10_1.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_10_1.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_10_1.getTagInfo().getAttribute("delimiter"),114,153);
            out.loopIterate();
            out.write(NL);         
            out.write("Achei um feature! ");  //$NON-NLS-1$        
            out.setTag("get",172,199);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_11_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_19); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_11_19.setRuntimeParent(_jettag_c_iterate_10_1);
            _jettag_c_get_11_19.setTagInfo(_td_c_get_11_19);
            _jettag_c_get_11_19.doStart(context, out);
            _jettag_c_get_11_19.doEnd();
            out.setTag(null,-1,-1);
            out.write(" do tipo ");  //$NON-NLS-1$        
            out.setTag("get",208,240);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(32);
            RuntimeTagElement _jettag_c_get_11_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_55); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_11_55.setRuntimeParent(_jettag_c_iterate_10_1);
            _jettag_c_get_11_55.setTagInfo(_td_c_get_11_55);
            _jettag_c_get_11_55.doStart(context, out);
            _jettag_c_get_11_55.doEnd();
            out.setTag(null,-1,-1);
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_iterate_10_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_10_1.doEnd();
        out.loopEnd();
        out.endTag("iterate",88);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write(NL);         
        out.popTemplateFile();
    }
}
