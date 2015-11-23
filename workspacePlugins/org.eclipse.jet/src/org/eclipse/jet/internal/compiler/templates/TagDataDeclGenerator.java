package org.eclipse.jet.internal.compiler.templates;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import java.util.Iterator;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.internal.JavaUtil;
import org.eclipse.jet.compiler.XMLElement;
import org.eclipse.jet.internal.compiler.MethodBodyCreator;

public class TagDataDeclGenerator implements JET2Template {
    private final String templateFile;

    public TagDataDeclGenerator(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(37);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(37);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(58);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(52);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(54);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(70);
        out.write(NL);         
        out.scriptletStart();

    XMLElement element;
    try {
	    element  = (XMLElement)context.getVariable("element"); //$NON-NLS-1$
    } catch( JET2TagException e) {
        out.write(e.toString());
        return;
    }
		
	String varName = MethodBodyCreator.tagInfoVariableName(element);

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(272);
        out.scriptletEnd();
        out.write(NL);         
        out.write("        final TagInfo ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( varName );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(14);
        out.scriptletEnd();
        out.write(" = new TagInfo(\"");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write(element.getName());
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(22);
        out.scriptletEnd();
        out.write("\", //$NON-NLS-1$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( element.getLine() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(24);
        out.scriptletEnd();
        out.write(", ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( element.getColumn() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(26);
        out.scriptletEnd();
        out.write(",");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            new String[] {");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 			for (Iterator i = element.getAttributes().keySet().iterator(); i.hasNext();) { 
                String attrName = (String) i.next(); 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(141);
        out.scriptletEnd();
        out.write(NL);         
        out.write("                \"");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( attrName );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(15);
        out.scriptletEnd();
        out.write("\", //$NON-NLS-1$");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
          } 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(16);
        out.scriptletEnd();
        out.write(NL);         
        out.write("            },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            new String[] {");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 			for (Iterator i = element.getAttributes().values().iterator(); i.hasNext();) { 
                String attrValue = (String) i.next(); 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(142);
        out.scriptletEnd();
        out.write(NL);         
        out.write("                \"");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( JavaUtil.escapeJavaString(attrValue.toCharArray()) );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(57);
        out.scriptletEnd();
        out.write("\", //$NON-NLS-1$");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
          } 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(16);
        out.scriptletEnd();
        out.write(NL);         
        out.write("            } );");  //$NON-NLS-1$        
        out.write(NL);         
        out.popTemplateFile();
    }
}
