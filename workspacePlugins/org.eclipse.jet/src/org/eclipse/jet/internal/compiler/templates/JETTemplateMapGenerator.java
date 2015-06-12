package org.eclipse.jet.internal.compiler.templates;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.jet.internal.compiler.PreferenceValueUtil;

public class JETTemplateMapGenerator implements JET2Template {
    private final String templateFile;

    public JETTemplateMapGenerator(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(95);
        out.write(" ");  //$NON-NLS-1$        
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(38);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(40);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(37);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(33);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(32);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(72);
        out.write(NL);         
        out.scriptletStart();

Map templateMap = (Map)context.getVariable("args"); //$NON-NLS-1$
List templatePaths = new ArrayList(templateMap.keySet());
Collections.sort(templatePaths);

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(162);
        out.scriptletEnd();
        out.write(NL);         
        out.scriptletStart();
 
    for(Iterator i = templatePaths.iterator(); i.hasNext();){ 
        String key = (String)i.next();
        String value = (String)templateMap.get(key);

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(161);
        out.scriptletEnd();
        out.write(NL);         
        out.scriptletStart();
        out.write( PreferenceValueUtil.encode(key) );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(38);
        out.scriptletEnd();
        out.write(" = ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( PreferenceValueUtil.encode(value) );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(40);
        out.scriptletEnd();
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
