package org.eclipse.jet.internal.compiler.templates;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.jet.internal.compiler.GenXMLElement;

public class XMLEndGenerator implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public XMLEndGenerator(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
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
    private static final TagInfo _td_c_get_10_1 = new TagInfo("c:get", //$NON-NLS-1$
            10, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_1 = new TagInfo("c:get", //$NON-NLS-1$
            13, 1,
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
out.jump(33);
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
        out.scriptletStart();
  if(element.hasBody()) { 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(30);
        out.scriptletEnd();
        out.write(NL);         
        out.setTag("get",225,250);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(25);
        RuntimeTagElement _jettag_c_get_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_7_1.setRuntimeParent(null);
        _jettag_c_get_7_1.setTagInfo(_td_c_get_7_1);
        _jettag_c_get_7_1.doStart(context, out);
        _jettag_c_get_7_1.doEnd();
        out.setTag(null,-1,-1);
        out.write("    ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( element.getTagVariable() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(31);
        out.scriptletEnd();
        out.write(".handleBodyContent(out);");  //$NON-NLS-1$        
        out.write(NL);         
        out.setTag("get",310,335);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(25);
        RuntimeTagElement _jettag_c_get_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_1.setRuntimeParent(null);
        _jettag_c_get_8_1.setTagInfo(_td_c_get_8_1);
        _jettag_c_get_8_1.doStart(context, out);
        _jettag_c_get_8_1.doEnd();
        out.setTag(null,-1,-1);
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.scriptletStart();
     if(element.requiresNewWriter()) { 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(43);
        out.scriptletEnd();
        out.write(NL);         
        out.setTag("get",381,406);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(25);
        RuntimeTagElement _jettag_c_get_10_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_10_1.setRuntimeParent(null);
        _jettag_c_get_10_1.setTagInfo(_td_c_get_10_1);
        _jettag_c_get_10_1.doStart(context, out);
        _jettag_c_get_10_1.doEnd();
        out.setTag(null,-1,-1);
        out.write("out = ");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write( element.getTagVariable() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(31);
        out.scriptletEnd();
        out.write("_saved_out;");  //$NON-NLS-1$        
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
        out.setTag("get",476,501);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(25);
        RuntimeTagElement _jettag_c_get_13_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_13_1.setRuntimeParent(null);
        _jettag_c_get_13_1.setTagInfo(_td_c_get_13_1);
        _jettag_c_get_13_1.doStart(context, out);
        _jettag_c_get_13_1.doEnd();
        out.setTag(null,-1,-1);
        out.scriptletStart();
        out.write( element.getTagVariable() );
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(31);
        out.scriptletEnd();
        out.write(".doEnd();");  //$NON-NLS-1$        
        out.write(NL);         
        out.popTemplateFile();
    }
}
