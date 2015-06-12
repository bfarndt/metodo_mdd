package org.eclipse.jet.internal.compiler.templates;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class DummyMain implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public DummyMain(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_log_2_1 = new TagInfo("c:log", //$NON-NLS-1$
            2, 1,
            new String[] {
            },
            new String[] {
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(26);
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(7);
        out.setTag("log",27,34);
        RuntimeTagElement _jettag_c_log_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "log", "c:log", _td_c_log_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_log_2_1.setRuntimeParent(null);
        _jettag_c_log_2_1.setTagInfo(_td_c_log_2_1);
        _jettag_c_log_2_1.doStart(context, out);
        JET2Writer _jettag_c_log_2_1_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_c_log_2_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("This transform in not intended to be run.");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_log_2_1.handleBodyContent(out);
        }
        out = _jettag_c_log_2_1_saved_out;
out.bodyContentEnd();
        _jettag_c_log_2_1.doEnd();
        out.endTag("log",41);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(8);
        out.write(NL);         
        out.popTemplateFile();
    }
}
