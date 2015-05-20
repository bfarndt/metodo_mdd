/*
 * Copyright (c) 2006, 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  *
 * Contributors:
 *   IBM - Initial API and implementation
 */
!! N�O TESTADO !!// elemento tipo comment1(org.eclipse.jet.core.parser.ast.Comment)
out.jump(360);
package org.eclipse.jet.internal.compiler.templates;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.eclipse.jet.internal.JavaUtil;
import org.eclipse.jet.internal.compiler.LoaderGenerationParameters;

public class JET2TransformGenerator implements JET2Template {
    private final String templateFile;

    public JET2TransformGenerator(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(118);
        out.write(NL);         
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(37);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(32);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(38);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(36);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(52);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(79);
        out.write(NL);         
        out.scriptletStart();

LoaderGenerationParameters parms = (LoaderGenerationParameters)context.getVariable("args"); //$NON-NLS-1$
SortedMap templateMap = new TreeMap(parms.getTemplateMap());
boolean useJava5 = context.hasVariable("useJava5") ? Boolean.valueOf((String)context.getVariable("useJava5")).booleanValue() : false; //$NON-NLS-1$  //$NON-NLS-2$  

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(337);
        out.scriptletEnd();
        out.write(NL);         
        out.write("package ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( parms.getPackageName() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(29);
        out.scriptletEnd();
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import java.util.HashMap;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.util.Map;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import org.eclipse.jet.JET2Template;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.jet.JET2TemplateLoader;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.jet.JET2TemplateLoaderExtension;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("public class ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( parms.getClassName() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(27);
        out.scriptletEnd();
        out.write(" implements JET2TemplateLoader,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        JET2TemplateLoaderExtension {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    private JET2TemplateLoader delegate = null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.scriptletStart();
 if(useJava5){ 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(19);
        out.scriptletEnd();
        out.write(NL);         
        out.write("    private final static Map<String, Integer> pathToTemplateOrdinalMap = new HashMap<String,Integer>(");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write(templateMap.size());
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(23);
        out.scriptletEnd();
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 } else { 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(14);
        out.scriptletEnd();
        out.write(NL);         
        out.write("    private final static Map pathToTemplateOrdinalMap = new HashMap(");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write(templateMap.size());
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(23);
        out.scriptletEnd();
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 } 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(7);
        out.scriptletEnd();
        out.write(NL);         
        out.write("    static {");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 int ordinal = 0;
   for(Iterator i=templateMap.keySet().iterator(); i.hasNext(); ordinal++) { 
       String templatePath = (String)i.next(); 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(147);
        out.scriptletEnd();
        out.write(NL);         
        out.write("        pathToTemplateOrdinalMap.put(");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( JavaUtil.asJavaQuotedString(templatePath) );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(48);
        out.scriptletEnd();
        out.write(", //$NON-NLS-1$");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 if(useJava5) { 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(20);
        out.scriptletEnd();
        out.write(NL);         
        out.write("                Integer.valueOf(");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( ordinal );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(14);
        out.scriptletEnd();
        out.write("));");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 } else { 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(14);
        out.scriptletEnd();
        out.write(NL);         
        out.write("                new Integer(");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( ordinal );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(14);
        out.scriptletEnd();
        out.write("));");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 } 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(7);
        out.scriptletEnd();
        out.write(NL);         
        out.scriptletStart();
 } 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(7);
        out.scriptletEnd();
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    /*");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("     * (non-Javadoc)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("     * ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("     * @see org.eclipse.jet.JET2TemplateLoader#getTemplate(java.lang.String)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("     */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public JET2Template getTemplate(final String templatePath) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 if(useJava5) { 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(20);
        out.scriptletEnd();
        out.write(NL);         
        out.write("        final Integer ordinal = pathToTemplateOrdinalMap.get(templatePath);");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 } else { 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(14);
        out.scriptletEnd();
        out.write(NL);         
        out.write("        final Integer ordinal = (Integer)pathToTemplateOrdinalMap.get(templatePath);");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 } 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(7);
        out.scriptletEnd();
        out.write(NL);         
        out.write("        if(ordinal != null) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("           switch (ordinal.intValue()) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 ordinal = 0;
   for(Iterator i=templateMap.entrySet().iterator(); i.hasNext(); ordinal++) { 
       Map.Entry entry = (Map.Entry)i.next(); 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(144);
        out.scriptletEnd();
        out.write(NL);         
        out.write("            case ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( ordinal );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(14);
        out.scriptletEnd();
        out.write(": // ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( entry.getKey() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(21);
        out.scriptletEnd();
        out.write(NL);         
        out.write("                return new ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( entry.getValue() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(23);
        out.scriptletEnd();
        out.write("();");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
 } 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(7);
        out.scriptletEnd();
        out.write(NL);         
        out.write("            default:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                break;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        return this.delegate != null ? this.delegate.getTemplate(templatePath) : null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    /*");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("     * (non-Javadoc)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("     * ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("     * @see org.eclipse.jet.JET2TemplateLoaderExtension#getDelegateLoader()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("     */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public JET2TemplateLoader getDelegateLoader() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        return this.delegate;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    /*");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("     * (non-Javadoc)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("     * ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("     * @see");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("     * org.eclipse.jet.JET2TemplateLoaderExtension#setDelegateLoader(org.eclipse");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("     * .jet.JET2TemplateLoader)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("     */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public void setDelegateLoader(final JET2TemplateLoader loader) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.delegate = loader;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.popTemplateFile();
    }
}
