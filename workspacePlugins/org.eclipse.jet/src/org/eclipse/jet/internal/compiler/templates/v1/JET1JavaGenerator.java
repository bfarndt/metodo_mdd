package org.eclipse.jet.internal.compiler.templates.v1;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.core.parser.ast.*;
import org.eclipse.jet.internal.compiler.SafeJETASTVisitor;
import java.util.Iterator;
import org.eclipse.jet.internal.JavaUtil;

public class JET1JavaGenerator implements JET2Template {
    private final String templateFile;

    public JET1JavaGenerator(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(124);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(52);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(70);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(37);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(52);
        out.write(NL);         
        out.scriptletStart();

	JETCompilationUnit cu = (JETCompilationUnit)context.getVariable("cu"); //$NON-NLS-1$

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(91);
        out.scriptletEnd();
        out.write(NL);         
        out.write("package ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( cu.getOutputJavaPackage() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(32);
        out.scriptletEnd();
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.scriptletStart();
 for(Iterator i=cu.getImports().iterator();i.hasNext();) { 
	String importName = (String)i.next();
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(102);
        out.scriptletEnd();
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write(importName);
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(15);
        out.scriptletEnd();
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 } 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(7);
        out.scriptletEnd();
        out.write(NL);         
        out.write(NL);         
        out.write("public class ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( cu.getOutputJavaClassName() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(34);
        out.scriptletEnd();
        out.scriptletStart();

	  if (cu.getExtend() != null) {
	  	
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(42);
        out.scriptletEnd();
        out.write(" extends ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( cu.getExtend() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(21);
        out.scriptletEnd();
        out.scriptletStart();

	  }
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(9);
        out.scriptletEnd();
        out.write(NL);         
        out.write("{");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 cu.accept(new SafeJETASTVisitor(context,out) {
      public boolean visit(JavaDeclaration decl) {

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(103);
        out.scriptletEnd();
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.scriptletStart();
 writeAndRecord(decl); 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(27);
        out.scriptletEnd();
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();

		return true;
      }
   });

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(35);
        out.scriptletEnd();
        out.write(NL);         
        out.write("  protected static String nl;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  public static synchronized ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( cu.getOutputJavaClassName() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(34);
        out.scriptletEnd();
        out.write(" create(String lineSeparator)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nl = lineSeparator;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( cu.getOutputJavaClassName() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(34);
        out.scriptletEnd();
        out.write(" result = new ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( cu.getOutputJavaClassName() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(34);
        out.scriptletEnd();
        out.write("();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nl = null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return result;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  public final String NL = nl == null ? (System.getProperties().getProperty(\"line.separator\")) : nl; //$NON-NLS-1$");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 cu.accept(new SafeJETASTVisitor(context,out) {
	  private int textCount = 0;
      public boolean visit(TextElement text) {
          if(text.getText().length > 0) {
              textCount++;

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(198);
        out.scriptletEnd();
        out.write(NL);         
        out.write("  protected final String TEXT_");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write(textCount);
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(14);
        out.scriptletEnd();
        out.write(" = ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write(JavaUtil.asJavaQuoteStringWithNLRemoved(text.getText()));
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(60);
        out.scriptletEnd();
        out.write(";");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write(JavaUtil.nlsCommentsForJavaQuoteStringWithNLRemoved(text.getText()));
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(72);
        out.scriptletEnd();
        out.write(NL);         
        out.scriptletStart();

         }
		 return true;
      }
   });

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(47);
        out.scriptletEnd();
        out.write(NL);         
        out.write(NL);         
        out.write("  public String generate(Object argument)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    final StringBuffer stringBuffer = new StringBuffer();");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 cu.accept(new SafeJETASTVisitor(context,out) {
	  private int textCount = 0;
      public boolean visit(TextElement text) {
          if(text.getText().length > 0) {
              textCount++;

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(198);
        out.scriptletEnd();
        out.write(NL);         
        out.write("    stringBuffer.append(TEXT_");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write(textCount);
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(14);
        out.scriptletEnd();
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();

          }
		  return true;
      }
      public boolean visit(JavaScriptlet scriptlet) {

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(96);
        out.scriptletEnd();
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.scriptletStart();
 writeAndRecord(scriptlet); 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(32);
        out.scriptletEnd();
        out.write(NL);         
        out.write(NL);         
        out.scriptletStart();

		return true;
      }
      public boolean visit(JavaExpression expr) {

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(78);
        out.scriptletEnd();
        out.write(NL);         
        out.write("    stringBuffer.append(");  //$NON-NLS-1$        
        out.scriptletStart();
 writeAndRecord(expr); 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(27);
        out.scriptletEnd();
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();

		return true;
  }
   });

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(31);
        out.scriptletEnd();
        out.write(NL);         
        out.write("    return stringBuffer.toString();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.popTemplateFile();
    }
}
