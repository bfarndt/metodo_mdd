package org.eclipse.jet.internal.compiler.templates.v2;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.core.parser.ast.*;
import org.eclipse.jet.internal.compiler.V2CodeGenVisitor;
import org.eclipse.jet.internal.compiler.HasNewlinesUtil;
import org.eclipse.jet.internal.compiler.TagUsageVisitor;
import org.eclipse.jet.taglib.TagLibraryReference;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import org.eclipse.jet.internal.JavaUtil;

public class JET2JavaGeneratorNew implements JET2Template {
    private final String templateFile;

    public JET2JavaGeneratorNew(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(127);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(52);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(69);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(68);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(68);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(61);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(35);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(39);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(37);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(52);
        out.write(NL);         
        out.scriptletStart();

	final boolean hcrFriendly = context.hasVariable("hcrFriendly") //$NON-NLS-1$
		? ((Boolean)context.getVariable("hcrFriendly")).booleanValue() : false; //$NON-NLS-1$
    JETCompilationUnit cu = (JETCompilationUnit)context.getVariable("cu"); //$NON-NLS-1$
    final TagUsageVisitor tuv = new TagUsageVisitor();
    cu.accept(tuv);
    TagLibraryReference[] tlrefs = tuv.getUsedTagLibraryReferences(cu);
    Arrays.sort(tlrefs, new Comparator() {
       public int compare(Object o1, Object o2) {
          return ((TagLibraryReference)o1).getTagLibraryId().compareTo(((TagLibraryReference)o2).getTagLibraryId());
       }
    });
    final String nlConstantName = "NL"; //$NON-NLS-1$

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(688);
        out.scriptletEnd();
        out.write(NL);         
        out.scriptletStart();
cu.accept(new V2CodeGenVisitor(context,out, "") { //$NON-NLS-1$ 
    public boolean visit(Comment comment) {
        final String text = comment.getCommentText();
        final String leadIn = " * "; //$NON-NLS-1$
        if(isHeaderComment(text)) {

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(254);
        out.scriptletEnd();
        out.write(NL);         
        out.write("/*");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 out.write(formatComment(text, leadIn)) ;
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(45);
        out.scriptletEnd();
        out.write(NL);         
        out.write(" */");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();

        }
        return true;
    }
});

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(46);
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
 if(tuv.hasTags()) { 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(25);
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
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(63);
        out.scriptletEnd();
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( (String)i.next() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(23);
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
        out.scriptletStart();
cu.accept(new V2CodeGenVisitor(context,out, "") { //$NON-NLS-1$ 
    public boolean visit(Comment comment) {
        final String text = comment.getCommentText();
        final String leadIn = " * "; //$NON-NLS-1$
        if(isClassComment(text)) {

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(253);
        out.scriptletEnd();
        out.write(NL);         
        out.write("/**");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 out.write(formatComment(text, leadIn)) ;
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(45);
        out.scriptletEnd();
        out.write(NL);         
        out.write(" */");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();

        }
        return true;
    }
});

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(46);
        out.scriptletEnd();
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
    if(!hcrFriendly) {
          for(int i = 0; i < tlrefs.length; i++ ) { 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(79);
        out.scriptletEnd();
        out.write(NL);         
        out.write("    private static final String _jetns_");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( tlrefs[i].getPrefix() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(28);
        out.scriptletEnd();
        out.write(" = \"");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( tlrefs[i].getTagLibraryId() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(34);
        out.scriptletEnd();
        out.write("\"; //$NON-NLS-1$");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
        }
      } 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(22);
        out.scriptletEnd();
        out.write(NL);         
        out.write(NL);         
        out.scriptletStart();
 cu.accept(new V2CodeGenVisitor(context,out) {
      public boolean visit(JavaDeclaration decl) {

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(102);
        out.scriptletEnd();
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.scriptletStart();
 writeAndRecord(decl); 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(27);
        out.scriptletEnd();
        out.write(NL);         
        out.write(NL);         
        out.scriptletStart();

        return true;
      }
   });

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(41);
        out.scriptletEnd();
        out.write(NL);         
        out.write("    public ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( cu.getOutputJavaClassName() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(34);
        out.scriptletEnd();
        out.write("() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        super();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 if(HasNewlinesUtil.test(cu)) { 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(36);
        out.scriptletEnd();
        out.write(NL);         
        out.write(NL);         
        out.write("    private static final String ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write(nlConstantName);
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(19);
        out.scriptletEnd();
        out.write(" = System.getProperty(\"line.separator\"); //$NON-NLS-1$");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 } 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(7);
        out.scriptletEnd();
        out.write(NL);         
        out.scriptletStart();
 if(tuv.hasTags() && !hcrFriendly) { 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(41);
        out.scriptletEnd();
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 cu.accept(new V2CodeGenVisitor(context,out, "    ") { //$NON-NLS-1$
      public boolean visit(XMLBodyElement e) {
          doElementVisit(e);
          return true;
      }
      public boolean visit(XMLEmptyElement e) {
          doElementVisit(e);
          return true;
      }
      public void doElementVisit(XMLElement e) {

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(337);
        out.scriptletEnd();
        out.write(NL);         
        out.write("    private static final TagInfo _td_");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( tagInfoVar(e) );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(20);
        out.scriptletEnd();
        out.write(" = new TagInfo(\"");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write(e.getName());
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(16);
        out.scriptletEnd();
        out.write("\", //$NON-NLS-1$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( e.getLine() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(18);
        out.scriptletEnd();
        out.write(", ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( e.getColumn() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(20);
        out.scriptletEnd();
        out.write(",");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            new String[] {");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
          for (Iterator i = e.getAttributes().keySet().iterator(); i.hasNext();) { 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(87);
        out.scriptletEnd();
        out.write(NL);         
        out.write("                \"");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( (String) i.next() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(24);
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
          for (Iterator i = e.getAttributes().values().iterator(); i.hasNext();) { 
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
        out.scriptletStart();
    } 
   }); 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(18);
        out.scriptletEnd();
        out.write(NL);         
        out.scriptletStart();
 } 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(7);
        out.scriptletEnd();
        out.write(NL);         
        out.scriptletStart();
 if(tuv.hasTags() && hcrFriendly) { 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(40);
        out.scriptletEnd();
        out.write(NL);         
        out.write(NL);         
        out.write("    private TagInfo[] _init_tagInfo() { ");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 if(tuv.hasAttributelessTags()) { 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(38);
        out.scriptletEnd();
        out.write(NL);         
        out.write("        final String[] EMPTY_STRING_ARRAY = new String[0];");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 } 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(7);
        out.scriptletEnd();
        out.write(NL);         
        out.write("        return new TagInfo[] {");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 cu.accept(new V2CodeGenVisitor(context,out, "    ") { //$NON-NLS-1$
      public boolean visit(XMLBodyElement e) {
          doElementVisit(e);
          return true;
      }
      public boolean visit(XMLEmptyElement e) {
          doElementVisit(e);
          return true;
      }
      public void doElementVisit(XMLElement e) {

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(337);
        out.scriptletEnd();
        out.write(NL);         
        out.write("        new TagInfo(\"");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write(e.getName());
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(16);
        out.scriptletEnd();
        out.write("\", //$NON-NLS-1$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( e.getLine() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(18);
        out.scriptletEnd();
        out.write(", ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( e.getColumn() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(20);
        out.scriptletEnd();
        out.write(",");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
        if(e.getAttributes().size() > 0) { 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(47);
        out.scriptletEnd();
        out.write(NL);         
        out.write("            new String[] {");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
          for (Iterator i = e.getAttributes().keySet().iterator(); i.hasNext();) { 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(87);
        out.scriptletEnd();
        out.write(NL);         
        out.write("                \"");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( (String) i.next() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(24);
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
          for (Iterator i = e.getAttributes().values().iterator(); i.hasNext();) { 
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
        out.write("            } ),");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
        } else { 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(21);
        out.scriptletEnd();
        out.write(NL);         
        out.write("            EMPTY_STRING_ARRAY, EMPTY_STRING_ARRAY ),");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
        } 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(14);
        out.scriptletEnd();
        out.write(NL);         
        out.scriptletStart();
    } 
   }); 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(18);
        out.scriptletEnd();
        out.write(NL);         
        out.write("        };   ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 } 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(7);
        out.scriptletEnd();
        out.write(NL);         
        out.write(NL);         
        out.write("    public void generate(final JET2Context context, final JET2Writer __out) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
    if(hcrFriendly) {
          for(int i = 0; i < tlrefs.length; i++ ) { 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(78);
        out.scriptletEnd();
        out.write(NL);         
        out.write("        final String _jetns_");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( tlrefs[i].getPrefix() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(28);
        out.scriptletEnd();
        out.write(" = \"");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( tlrefs[i].getTagLibraryId() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(34);
        out.scriptletEnd();
        out.write("\"; //$NON-NLS-1$");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
        }
          if(tuv.hasTags()) { 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(44);
        out.scriptletEnd();
        out.write(NL);         
        out.write("        final TagInfo[] _td_ = _init_tagInfo();");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
        }
      } 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(22);
        out.scriptletEnd();
        out.write(NL);         
        out.write("        JET2Writer out = __out;");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 cu.accept(new V2CodeGenVisitor(context,out, "    ") { //$NON-NLS-1$
    public boolean visit(TextElement text) {
        if(text.getText().length > 0) {
            String[] strings = textConstants(text, nlConstantName);
            for(int i = 0; i < strings.length; i++) {

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(280);
        out.scriptletEnd();
        out.write(NL);         
        out.write("        out.write(");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write(strings[i]);
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(15);
        out.scriptletEnd();
        out.write("); ");  //$NON-NLS-1$        
        out.scriptletStart();
 if(strings[i].startsWith("\"")) { //$NON-NLS-1$ 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(53);
        out.scriptletEnd();
        out.write(" //$NON-NLS-1$");  //$NON-NLS-1$        
        out.scriptletStart();
}
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(5);
        out.scriptletEnd();
        out.write("        ");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();

            }
        }
        return true;
      }
      public boolean visit(JavaScriptlet scriptlet) {

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(112);
        out.scriptletEnd();
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
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
out.jump(86);
        out.scriptletEnd();
        out.write(NL);         
        out.write("        out.write(");  //$NON-NLS-1$        
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
      public boolean visit(EmbeddedExpression expr) {

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(90);
        out.scriptletEnd();
        out.write(NL);         
        out.write("        out.write(context.embeddedExpressionAsString(");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( JavaUtil.asJavaQuotedString(expr.getExpression().toCharArray()) );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(70);
        out.scriptletEnd();
        out.write(", ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( expr.getLine() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(21);
        out.scriptletEnd();
        out.write(", ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( expr.getColumn());
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(22);
        out.scriptletEnd();
        out.write(")); //$NON-NLS-1$ //$NON-NLS-2$");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();

          return true;
      }
      public boolean visit(XMLBodyElement e) {

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(83);
        out.scriptletEnd();
        out.write(NL);         
        out.write("        RuntimeTagElement ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( tagVar(e) );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(16);
        out.scriptletEnd();
        out.write(" = context.getTagFactory().createRuntimeTag(_jetns_");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( e.getNSPrefix() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(22);
        out.scriptletEnd();
        out.write(", \"");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( e.getTagNCName() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(23);
        out.scriptletEnd();
        out.write("\", \"");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( e.getName() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(18);
        out.scriptletEnd();
        out.write("\", _td_");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( hcrFriendly ? tuv.ordinalExpr(e) : tagInfoVar(e) );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(55);
        out.scriptletEnd();
        out.write("); //$NON-NLS-1$ //$NON-NLS-2$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( tagVar(e) );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(16);
        out.scriptletEnd();
        out.write(".setRuntimeParent(");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( parentTagVar(e) );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(22);
        out.scriptletEnd();
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( tagVar(e) );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(16);
        out.scriptletEnd();
        out.write(".setTagInfo(_td_");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( hcrFriendly ? tuv.ordinalExpr(e) : tagInfoVar(e) );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(55);
        out.scriptletEnd();
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( tagVar(e) );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(16);
        out.scriptletEnd();
        out.write(".doStart(context, out);");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 if(requiresOwnWriter(e)) { 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(32);
        out.scriptletEnd();
        out.write(NL);         
        out.write("        JET2Writer ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( tagVar(e) );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(16);
        out.scriptletEnd();
        out.write("_saved_out = out;");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 } 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(7);
        out.scriptletEnd();
        out.write(NL);         
        out.write("        while (");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( tagVar(e) );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(16);
        out.scriptletEnd();
        out.write(".okToProcessBody()) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 if(requiresOwnWriter(e)) { 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(32);
        out.scriptletEnd();
        out.write(NL);         
        out.write("            out = out.newNestedContentWriter();");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 } 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(7);
        out.scriptletEnd();
        out.write(NL);         
        out.scriptletStart();

          in();
          return true;
      }
      public void endVisit(XMLBodyElement e) {
          out();

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(116);
        out.scriptletEnd();
        out.write(NL);         
        out.write("            ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( tagVar(e) );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(16);
        out.scriptletEnd();
        out.write(".handleBodyContent(out);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 if(requiresOwnWriter(e)) { 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(32);
        out.scriptletEnd();
        out.write(NL);         
        out.write("        out = ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( tagVar(e) );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(16);
        out.scriptletEnd();
        out.write("_saved_out;");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
  } 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(8);
        out.scriptletEnd();
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( tagVar(e) );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(16);
        out.scriptletEnd();
        out.write(".doEnd();");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();

 
      }
      public boolean visit(XMLEmptyElement e) {

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(63);
        out.scriptletEnd();
        out.write(NL);         
        out.write("        RuntimeTagElement ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( tagVar(e) );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(16);
        out.scriptletEnd();
        out.write(" = context.getTagFactory().createRuntimeTag(_jetns_");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( e.getNSPrefix() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(22);
        out.scriptletEnd();
        out.write(", \"");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( e.getTagNCName() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(23);
        out.scriptletEnd();
        out.write("\", \"");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( e.getName() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(18);
        out.scriptletEnd();
        out.write("\", _td_");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( hcrFriendly ? tuv.ordinalExpr(e) : tagInfoVar(e) );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(55);
        out.scriptletEnd();
        out.write("); //$NON-NLS-1$ //$NON-NLS-2$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( tagVar(e) );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(16);
        out.scriptletEnd();
        out.write(".setRuntimeParent(");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( parentTagVar(e) );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(22);
        out.scriptletEnd();
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( tagVar(e) );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(16);
        out.scriptletEnd();
        out.write(".setTagInfo(_td_");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( hcrFriendly ? tuv.ordinalExpr(e) : tagInfoVar(e) );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(55);
        out.scriptletEnd();
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( tagVar(e) );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(16);
        out.scriptletEnd();
        out.write(".doStart(context, out);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( tagVar(e) );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(16);
        out.scriptletEnd();
        out.write(".doEnd();");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();

          return true;
      }
  
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(38);
        out.scriptletEnd();
        out.write(NL);         
        out.write(" ");  //$NON-NLS-1$        
        out.scriptletStart();

      public boolean visit(Comment comment) {
        final String text = comment.getCommentText();
        final String leadIn = "        //";  //$NON-NLS-1$
        if(isNormalComment(text)) {
			out.write(formatComment(text, leadIn)) ;
         }
          return true;
      }
  
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(288);
        out.scriptletEnd();
        out.write(NL);         
        out.scriptletStart();

   });

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(12);
        out.scriptletEnd();
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.popTemplateFile();
    }
}
