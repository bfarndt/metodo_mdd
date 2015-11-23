package org.eclipse.jet.internal.compiler.templates;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.jet.internal.compiler.GenXMLElement;

public class XMLStartGenerator implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public XMLStartGenerator(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_6_1 = new TagInfo("c:get", //$NON-NLS-1$
            6, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_1 = new TagInfo("c:get", //$NON-NLS-1$
            7, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_1 = new TagInfo("c:get", //$NON-NLS-1$
            8, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_1 = new TagInfo("c:get", //$NON-NLS-1$
            9, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_1 = new TagInfo("c:get", //$NON-NLS-1$
            12, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_1 = new TagInfo("c:get", //$NON-NLS-1$
            14, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_1 = new TagInfo("c:get", //$NON-NLS-1$
            16, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$indent", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(35);
        out.write(NL);         
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(66);
        out.write(NL);         
        out.scriptletStart();

	GenXMLElement element = (GenXMLElement) context.getVariable("element"); //$NON-NLS-1$

// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(92);
        out.scriptletEnd();
        out.write(NL);         
        out.setTag("get",196,221);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(25);
        RuntimeTagElement _jettag_c_get_6_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_6_1.setRuntimeParent(null);
        _jettag_c_get_6_1.setTagInfo(_td_c_get_6_1);
        _jettag_c_get_6_1.doStart(context, out);
        _jettag_c_get_6_1.doEnd();
        out.setTag(null,-1,-1);
        out.write("RuntimeTagElement ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( element.getTagVariable() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(31);
        out.scriptletEnd();
        out.write(" = context.getTagFactory().createRuntimeTag(_jetns_");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( element.getNSPrefix() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(28);
        out.scriptletEnd();
        out.write(", \"");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( element.getTagNCName() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(29);
        out.scriptletEnd();
        out.write("\", \"");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( element.getName() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(24);
        out.scriptletEnd();
        out.write("\", ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( element.getTagInfoVariable() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(35);
        out.scriptletEnd();
        out.write("); //$NON-NLS-1$ //$NON-NLS-2$");  //$NON-NLS-1$        
        out.write(NL);         
        out.setTag("get",478,503);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(25);
        RuntimeTagElement _jettag_c_get_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_7_1.setRuntimeParent(null);
        _jettag_c_get_7_1.setTagInfo(_td_c_get_7_1);
        _jettag_c_get_7_1.doStart(context, out);
        _jettag_c_get_7_1.doEnd();
        out.setTag(null,-1,-1);
        out.scriptletStart();
        out.write( element.getTagVariable() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(31);
        out.scriptletEnd();
        out.write(".setRuntimeParent(");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( element.getParentTagVariable() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(37);
        out.scriptletEnd();
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.setTag("get",592,617);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(25);
        RuntimeTagElement _jettag_c_get_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_1.setRuntimeParent(null);
        _jettag_c_get_8_1.setTagInfo(_td_c_get_8_1);
        _jettag_c_get_8_1.doStart(context, out);
        _jettag_c_get_8_1.doEnd();
        out.setTag(null,-1,-1);
        out.scriptletStart();
        out.write( element.getTagVariable() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(31);
        out.scriptletEnd();
        out.write(".setTagInfo(");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( element.getTagInfoVariable() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(35);
        out.scriptletEnd();
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.setTag("get",698,723);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(25);
        RuntimeTagElement _jettag_c_get_9_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_1.setRuntimeParent(null);
        _jettag_c_get_9_1.setTagInfo(_td_c_get_9_1);
        _jettag_c_get_9_1.doStart(context, out);
        _jettag_c_get_9_1.doEnd();
        out.setTag(null,-1,-1);
        out.scriptletStart();
        out.write( element.getTagVariable() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(31);
        out.scriptletEnd();
        out.write(".doStart(context, out);");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
  if(element.hasBody()) { 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(30);
        out.scriptletEnd();
        out.write(NL);         
        out.scriptletStart();
     if(element.requiresNewWriter()) { 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(43);
        out.scriptletEnd();
        out.write(NL);         
        out.setTag("get",853,878);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(25);
        RuntimeTagElement _jettag_c_get_12_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_1.setRuntimeParent(null);
        _jettag_c_get_12_1.setTagInfo(_td_c_get_12_1);
        _jettag_c_get_12_1.doStart(context, out);
        _jettag_c_get_12_1.doEnd();
        out.setTag(null,-1,-1);
        out.write("JET2Writer ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( element.getTagVariable() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(31);
        out.scriptletEnd();
        out.write("_saved_out = out;");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
     } 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(11);
        out.scriptletEnd();
        out.write(NL);         
        out.setTag("get",950,975);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(25);
        RuntimeTagElement _jettag_c_get_14_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_14_1.setRuntimeParent(null);
        _jettag_c_get_14_1.setTagInfo(_td_c_get_14_1);
        _jettag_c_get_14_1.doStart(context, out);
        _jettag_c_get_14_1.doEnd();
        out.setTag(null,-1,-1);
        out.write("while (");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( element.getTagVariable() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(31);
        out.scriptletEnd();
        out.write(".okToProcessBody()) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
     if(element.requiresNewWriter()) { 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(43);
        out.scriptletEnd();
        out.write(NL);         
        out.setTag("get",1079,1104);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(25);
        RuntimeTagElement _jettag_c_get_16_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_16_1.setRuntimeParent(null);
        _jettag_c_get_16_1.setTagInfo(_td_c_get_16_1);
        _jettag_c_get_16_1.doStart(context, out);
        _jettag_c_get_16_1.doEnd();
        out.setTag(null,-1,-1);
        out.write("    out = out.newNestedContentWriter();");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
     } 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(11);
        out.scriptletEnd();
        out.write(NL);         
        out.scriptletStart();
  } 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(8);
        out.scriptletEnd();
        out.write(NL);         
        out.popTemplateFile();
    }
}
