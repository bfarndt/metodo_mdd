package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_adminPrefixjspf implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_adminPrefixjspf(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_iterate_10_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            10, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/WebDomainAdministrationModel/userTypes", //$NON-NLS-1$
                "userType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_18 = new TagInfo("c:get", //$NON-NLS-1$
            11, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@actionsPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_71 = new TagInfo("c:get", //$NON-NLS-1$
            11, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@actionClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_113 = new TagInfo("c:get", //$NON-NLS-1$
            11, 113,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@showAllAction", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_161 = new TagInfo("c:get", //$NON-NLS-1$
            11, 161,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_13_3 = new TagInfo("c:if", //$NON-NLS-1$
            13, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$featuresModel/WebDomainFeatures/@userContent = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_14_3 = new TagInfo("c:if", //$NON-NLS-1$
            14, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$featuresModel/WebDomainFeatures/@moderation = 'true'", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(36);
        out.write(NL);         
        out.write(NL);         
        out.write("<table class=\"adminMainTable\" width=\"100%\" border=\"1\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <tr>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <td class=\"adminMainTitle\" colspan=\"2\">Administrative area</td>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </tr>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <tr>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <td class=\"menu\">Entities: <br />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <br />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(75);
        out.setTag("iterate",258,333);
        RuntimeTagElement _jettag_c_iterate_10_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_10_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_10_9.setRuntimeParent(null);
        _jettag_c_iterate_10_9.setTagInfo(_td_c_iterate_10_9);
        _jettag_c_iterate_10_9.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_10_9.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_10_9.getTagInfo().getAttribute("delimiter"),258,333);
            out.loopIterate();
            out.write(NL);         
            out.write("        <a href=\"");  //$NON-NLS-1$        
            out.setTag("get",351,403);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(52);
            RuntimeTagElement _jettag_c_get_11_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_18); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_11_18.setRuntimeParent(_jettag_c_iterate_10_9);
            _jettag_c_get_11_18.setTagInfo(_td_c_get_11_18);
            _jettag_c_get_11_18.doStart(context, out);
            _jettag_c_get_11_18.doEnd();
            out.setTag(null,-1,-1);
            out.write(".");  //$NON-NLS-1$        
            out.setTag("get",404,445);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(41);
            RuntimeTagElement _jettag_c_get_11_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_71); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_11_71.setRuntimeParent(_jettag_c_iterate_10_9);
            _jettag_c_get_11_71.setTagInfo(_td_c_get_11_71);
            _jettag_c_get_11_71.doStart(context, out);
            _jettag_c_get_11_71.doEnd();
            out.setTag(null,-1,-1);
            out.write(".");  //$NON-NLS-1$        
            out.setTag("get",446,489);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(43);
            RuntimeTagElement _jettag_c_get_11_113 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_113); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_11_113.setRuntimeParent(_jettag_c_iterate_10_9);
            _jettag_c_get_11_113.setTagInfo(_td_c_get_11_113);
            _jettag_c_get_11_113.doStart(context, out);
            _jettag_c_get_11_113.doEnd();
            out.setTag(null,-1,-1);
            out.write(".do\">");  //$NON-NLS-1$        
            out.setTag("get",494,528);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(34);
            RuntimeTagElement _jettag_c_get_11_161 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_161); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_11_161.setRuntimeParent(_jettag_c_iterate_10_9);
            _jettag_c_get_11_161.setTagInfo(_td_c_get_11_161);
            _jettag_c_get_11_161.doStart(context, out);
            _jettag_c_get_11_161.doEnd();
            out.setTag(null,-1,-1);
            out.write("</a><br />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        ");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_10_9.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_10_9.doEnd();
        out.loopEnd();
        out.endTag("iterate",214);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(68);
        out.setTag("if",562,630);
        RuntimeTagElement _jettag_c_if_13_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_13_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_13_3.setRuntimeParent(null);
        _jettag_c_if_13_3.setTagInfo(_td_c_if_13_3);
        _jettag_c_if_13_3.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_c_if_13_3.okToProcessBody()) {
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(67);
            out.setTag("if",633,700);
            RuntimeTagElement _jettag_c_if_14_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_14_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_14_3.setRuntimeParent(_jettag_c_if_13_3);
            _jettag_c_if_14_3.setTagInfo(_td_c_if_14_3);
            _jettag_c_if_14_3.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_14_3.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t<br /> Outras acoes: <br />");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        <br />");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t<a href=\"generated.usercontent.UserContentActions.showModerationForm.do\">Moderacao de comentarios de usuario</a>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_14_3.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_14_3.doEnd();
            out.endTag("if",163);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_if_13_3.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_if_13_3.doEnd();
        out.endTag("if",243);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(NL);         
        out.write("        </td>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <td class=\"mainArea\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.popTemplateFile();
    }
}
