package org.eclipse.jet.internal.compiler.templates;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.compiler.TextElement;
import org.eclipse.jet.internal.JavaUtil;

public class WriteTextElementTemplate implements JET2Template {
    private final String templateFile;

    public WriteTextElementTemplate(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(42);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(55);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(52);
        out.write(NL);         
        out.scriptletStart();

final String indent = (String)context.getVariable("indent"); //$NON-NLS-1$
final TextElement text = (TextElement)context.getVariable("element"); //$NON-NLS-1$

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(164);
        out.scriptletEnd();
        out.write(NL);         
        out.scriptletStart();
 if(text.getText().length > 0) { 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(37);
        out.scriptletEnd();
        out.write(NL);         
        out.scriptletStart();
        out.write( indent );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(13);
        out.scriptletEnd();
        out.write("out.write( ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( JavaUtil.asJavaQuotedString(text.getText()) );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(50);
        out.scriptletEnd();
        out.write(" ); //$NON-NLS-1$");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 } 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(7);
        out.scriptletEnd();
        out.write(NL);         
        out.popTemplateFile();
    }
}
