package org.eclipse.jet.internal.compiler.templates;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.compiler.JET2Expression;

public class WriteJavaExpressionTemplate implements JET2Template {
    private final String templateFile;

    public WriteJavaExpressionTemplate(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(45);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(58);
        out.write(NL);         
        out.scriptletStart();

final String indent = (String)context.getVariable("indent"); //$NON-NLS-1$
final JET2Expression expr = (JET2Expression)context.getVariable("element"); //$NON-NLS-1$

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(170);
        out.scriptletEnd();
        out.write(NL);         
        out.scriptletStart();
        out.write( indent );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(13);
        out.scriptletEnd();
        out.write("out.write(");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( expr.getJavaContent() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(28);
        out.scriptletEnd();
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.popTemplateFile();
    }
}
