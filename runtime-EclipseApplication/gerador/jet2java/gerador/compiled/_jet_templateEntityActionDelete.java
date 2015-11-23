package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_templateEntityActionDelete implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_templateEntityActionDelete(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_2_25 = new TagInfo("c:get", //$NON-NLS-1$
            2, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_25 = new TagInfo("c:get", //$NON-NLS-1$
            3, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_3 = new TagInfo("c:get", //$NON-NLS-1$
            5, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_54 = new TagInfo("c:get", //$NON-NLS-1$
            5, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_3 = new TagInfo("c:get", //$NON-NLS-1$
            6, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_56 = new TagInfo("c:get", //$NON-NLS-1$
            6, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_4 = new TagInfo("c:get", //$NON-NLS-1$
            11, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_14 = new TagInfo("c:get", //$NON-NLS-1$
            12, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_71 = new TagInfo("c:get", //$NON-NLS-1$
            12, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        out.write("<?php");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tinclude_once \"../class/");  //$NON-NLS-1$        
        out.setTag("get",30,74);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_2_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_25); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_2_25.setRuntimeParent(null);
        _jettag_c_get_2_25.setTagInfo(_td_c_get_2_25);
        _jettag_c_get_2_25.doStart(context, out);
        _jettag_c_get_2_25.doEnd();
        out.setTag(null,-1,-1);
        out.write(".class.php\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tinclude_once \"../class/");  //$NON-NLS-1$        
        out.setTag("get",111,155);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_3_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_25); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_25.setRuntimeParent(null);
        _jettag_c_get_3_25.setTagInfo(_td_c_get_3_25);
        _jettag_c_get_3_25.doStart(context, out);
        _jettag_c_get_3_25.doEnd();
        out.setTag(null,-1,-1);
        out.write("DB.class.php\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t$");  //$NON-NLS-1$        
        out.setTag("get",174,218);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_5_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_5_3.setRuntimeParent(null);
        _jettag_c_get_5_3.setTagInfo(_td_c_get_5_3);
        _jettag_c_get_5_3.doStart(context, out);
        _jettag_c_get_5_3.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = new ");  //$NON-NLS-1$        
        out.setTag("get",225,269);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_5_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_54); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_5_54.setRuntimeParent(null);
        _jettag_c_get_5_54.setTagInfo(_td_c_get_5_54);
        _jettag_c_get_5_54.doStart(context, out);
        _jettag_c_get_5_54.doEnd();
        out.setTag(null,-1,-1);
        out.write("();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t$");  //$NON-NLS-1$        
        out.setTag("get",275,319);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_6_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_6_3.setRuntimeParent(null);
        _jettag_c_get_6_3.setTagInfo(_td_c_get_6_3);
        _jettag_c_get_6_3.doStart(context, out);
        _jettag_c_get_6_3.doEnd();
        out.setTag(null,-1,-1);
        out.write("DB = new ");  //$NON-NLS-1$        
        out.setTag("get",328,372);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_6_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_56); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_6_56.setRuntimeParent(null);
        _jettag_c_get_6_56.setTagInfo(_td_c_get_6_56);
        _jettag_c_get_6_56.doStart(context, out);
        _jettag_c_get_6_56.doEnd();
        out.setTag(null,-1,-1);
        out.write("DB();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t$result = false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tif (isSet($_GET['id']) && $_GET['id'] > 0) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$");  //$NON-NLS-1$        
        out.setTag("get",449,488);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_11_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_4.setRuntimeParent(null);
        _jettag_c_get_11_4.setTagInfo(_td_c_get_11_4);
        _jettag_c_get_11_4.doStart(context, out);
        _jettag_c_get_11_4.doEnd();
        out.setTag(null,-1,-1);
        out.write("->setId($_GET[\"id\"]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$result = $");  //$NON-NLS-1$        
        out.setTag("get",523,567);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_12_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_14.setRuntimeParent(null);
        _jettag_c_get_12_14.setTagInfo(_td_c_get_12_14);
        _jettag_c_get_12_14.doStart(context, out);
        _jettag_c_get_12_14.doEnd();
        out.setTag(null,-1,-1);
        out.write("DB->destroy($");  //$NON-NLS-1$        
        out.setTag("get",580,624);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_12_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_71); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_71.setRuntimeParent(null);
        _jettag_c_get_12_71.setTagInfo(_td_c_get_12_71);
        _jettag_c_get_12_71.doStart(context, out);
        _jettag_c_get_12_71.doEnd();
        out.setTag(null,-1,-1);
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tif ($result) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tdie('<META http-equiv=\"refresh\" content=\"1;URL=/' . $_GET[\"pageBack\"] . '.php?success=1\">');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t} else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tdie('<META http-equiv=\"refresh\" content=\"1;URL=/' . $_GET[\"pageBack\"] . '.php?error=1\">');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("?>");  //$NON-NLS-1$        
        out.popTemplateFile();
    }
}
