package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_templateEntityHtmlIndex implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_templateEntityHtmlIndex(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_iterate_35_13 = new TagInfo("c:iterate", //$NON-NLS-1$
            35, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/Domainmodel/Entity", //$NON-NLS-1$
                "entity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_36_17 = new TagInfo("c:if", //$NON-NLS-1$
            36, 17,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($entity/@name = $e/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_90 = new TagInfo("c:get", //$NON-NLS-1$
            36, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_124 = new TagInfo("c:get", //$NON-NLS-1$
            36, 124,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$entity/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        out.write("<!DOCTYPE html>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<html lang=\"en\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  <head>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <meta charset=\"utf-8\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <title>Bootstrap 101 Template</title>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    <!-- Bootstrap -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <link href=\"http://localhost/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <!--[if lt IE 9]>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <![endif]-->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  </head>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  <body>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <nav class=\"navbar navbar-inverse navbar-fixed-top\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <div class=\"container\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <div class=\"navbar-header\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            <span class=\"sr-only\">Toggle navigation</span>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            <span class=\"icon-bar\"></span>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            <span class=\"icon-bar\"></span>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            <span class=\"icon-bar\"></span>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          </button>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          <a class=\"navbar-brand\" href=\"/\">Gerador JET com Bootstrap</a>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        </div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          <ul class=\"nav navbar-nav\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            <li><a href=\"/\">Home</a></li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(53);
        out.setTag("iterate",1590,1643);
        RuntimeTagElement _jettag_c_iterate_35_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_35_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_35_13.setRuntimeParent(null);
        _jettag_c_iterate_35_13.setTagInfo(_td_c_iterate_35_13);
        _jettag_c_iterate_35_13.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_35_13.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_35_13.getTagInfo().getAttribute("delimiter"),1590,1643);
            out.loopIterate();
            out.write(NL);         
            out.write("            \t<li");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(40);
            out.setTag("if",1660,1700);
            RuntimeTagElement _jettag_c_if_36_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_36_17); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_36_17.setRuntimeParent(_jettag_c_iterate_35_13);
            _jettag_c_if_36_17.setTagInfo(_td_c_if_36_17);
            _jettag_c_if_36_17.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_36_17.okToProcessBody()) {
                out.write(" class=\"active\"");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_36_17.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_36_17.doEnd();
            out.endTag("if",15);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write("><a href=\"/");  //$NON-NLS-1$        
            out.setTag("get",1733,1765);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(32);
            RuntimeTagElement _jettag_c_get_36_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_90); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_36_90.setRuntimeParent(_jettag_c_iterate_35_13);
            _jettag_c_get_36_90.setTagInfo(_td_c_get_36_90);
            _jettag_c_get_36_90.doStart(context, out);
            _jettag_c_get_36_90.doEnd();
            out.setTag(null,-1,-1);
            out.write("\">");  //$NON-NLS-1$        
            out.setTag("get",1767,1799);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(32);
            RuntimeTagElement _jettag_c_get_36_124 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_124); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_36_124.setRuntimeParent(_jettag_c_iterate_35_13);
            _jettag_c_get_36_124.setTagInfo(_td_c_get_36_124);
            _jettag_c_get_36_124.doStart(context, out);
            _jettag_c_get_36_124.doEnd();
            out.setTag(null,-1,-1);
            out.write("</a></li>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            ");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_35_13.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_35_13.doEnd();
        out.loopEnd();
        out.endTag("iterate",178);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("          </ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        </div><!--/.nav-collapse -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </nav>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <script src=\"http://localhost/bootstrap/js/bootstrap.min.js\"></script>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  </body>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</html>");  //$NON-NLS-1$        
        out.popTemplateFile();
    }
}