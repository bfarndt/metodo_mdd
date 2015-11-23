package org.eclipse.jet.internal.compiler.templates;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.jet.internal.compiler.*;
import org.eclipse.jet.compiler.*;
import org.eclipse.jet.transform.TransformContextExtender;
import org.eclipse.jet.taglib.TagLibraryReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class JET2JavaGenerator implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$


    private XMLElement[] getAllXMLTags(JET2CompilationUnit cu) {
        final List result = new ArrayList();
    	cu.accept(new DefaultJET2ASTVisitor() {
	    	public void visit(XMLBodyElement element) {
		    	result.add(element);
		    }
		
			public void visit(XMLEmptyElement element) {
				result.add(element);
			}
		});
        return (XMLElement[])result.toArray(new XMLElement[result.size()]);
    }
    
    private JET2Declaration[] getAllJavaDeclarations(JET2CompilationUnit cu) {
        final List result = new ArrayList();
    	cu.accept(new DefaultJET2ASTVisitor() {
	    	public void visit(JET2Declaration declaration) {
		    	result.add(declaration);
		    }
		});
        return (JET2Declaration[])result.toArray(new JET2Declaration[result.size()]);
    }

!! N�O TESTADO !!// elemento tipo JavaDeclaration(org.eclipse.jet.core.parser.ast.JavaDeclaration)
out.jump(783);
    public JET2JavaGenerator(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_include_80_4 = new TagInfo("c:include", //$NON-NLS-1$
            80, 4,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/tagDataDeclarations.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(121);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(54);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(45);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(69);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(61);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(38);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(33);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(37);
        out.write(NL);         
        out.write(NL);         
        out.scriptletStart();

	JET2CompilationUnit cu = (JET2CompilationUnit)context.getVariable("cu"); //$NON-NLS-1$
	
	final JET2Declaration[] allMemberDeclarations = getAllJavaDeclarations(cu);
	final XMLElement[] allXMLElements = getAllXMLTags(cu);
		
	final TagLibraryReference[] tlRefs = cu.getTagLibraryReferences();

	MethodBodyCreator generatedBody = new MethodBodyCreator(TransformContextExtender.getInstance(context).getLoader());
	cu.accept(generatedBody);

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(444);
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
        out.write("import org.eclipse.jet.JET2Context;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.jet.JET2Template;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.jet.JET2Writer;");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 if( allXMLElements.length > 0) { 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(38);
        out.scriptletEnd();
        out.write(NL);         
        out.write("import org.eclipse.jet.taglib.RuntimeTagElement;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.jet.taglib.TagInfo;");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 } 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(7);
        out.scriptletEnd();
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
        out.write(" implements JET2Template {");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 if( allXMLElements.length > 0) { 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(38);
        out.scriptletEnd();
        out.write(NL);         
        out.scriptletStart();
    for(int i = 0; i < tlRefs.length; i++ ) { 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(50);
        out.scriptletEnd();
        out.write(NL);         
        out.write("    public static final String _jetns_");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( tlRefs[i].getPrefix() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(28);
        out.scriptletEnd();
        out.write(" = \"");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( tlRefs[i].getTagLibraryId() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(34);
        out.scriptletEnd();
        out.write("\"; //$NON-NLS-1$");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
    } 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(10);
        out.scriptletEnd();
        out.write(NL);         
        out.scriptletStart();
 } 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(7);
        out.scriptletEnd();
        out.write(NL);         
        out.scriptletStart();
	for(int i = 0; i < allMemberDeclarations.length; i++) { 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(61);
        out.scriptletEnd();
        out.write(NL);         
        out.write(NL);         
        out.scriptletStart();
        out.write( allMemberDeclarations[i].getJavaContent() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(48);
        out.scriptletEnd();
        out.write(NL);         
        out.scriptletStart();
  } 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(8);
        out.scriptletEnd();
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( cu.getOutputJavaClassName() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(34);
        out.scriptletEnd();
        out.write("() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsuper();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void generate(final JET2Context context, JET2Writer out) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
	for(int i = 0; i < allXMLElements.length; i++) { 
	    context.setVariable("element", allXMLElements[i]); //$NON-NLS-1$

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(125);
        out.scriptletEnd();
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.setTag("include",2801,2858);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(57);
        out.includeStart();
        RuntimeTagElement _jettag_c_include_80_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_80_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_80_4.setRuntimeParent(null);
        _jettag_c_include_80_4.setTagInfo(_td_c_include_80_4);
        _jettag_c_include_80_4.doStart(context, out);
        _jettag_c_include_80_4.doEnd();
        out.setTag(null,-1,-1);
        out.write(NL);         
        out.scriptletStart();
  } 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(8);
        out.scriptletEnd();
        out.write(NL);         
        out.scriptletStart();
        out.write( generatedBody.getBuffer() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(32);
        out.scriptletEnd();
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.popTemplateFile();
    }
}
