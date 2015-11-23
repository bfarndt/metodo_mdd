package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_templateHtml implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_templateHtml(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_iterate_43_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            43, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentPage/forms/entity", //$NON-NLS-1$
                "currentEntity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_18 = new TagInfo("c:get", //$NON-NLS-1$
            44, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_56_4 = new TagInfo("c:if", //$NON-NLS-1$
            56, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentPage/@header = 'true')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_70_14 = new TagInfo("c:iterate", //$NON-NLS-1$
            70, 14,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/Domainmodel/Page", //$NON-NLS-1$
                "pages", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_71_18 = new TagInfo("c:if", //$NON-NLS-1$
            71, 18,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($pages/@name = $currentPage/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_100 = new TagInfo("c:get", //$NON-NLS-1$
            71, 100,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$pages/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_72_16 = new TagInfo("c:if", //$NON-NLS-1$
            72, 16,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($pages/@title != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_51 = new TagInfo("c:get", //$NON-NLS-1$
            72, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$pages/@title", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_73_16 = new TagInfo("c:if", //$NON-NLS-1$
            73, 16,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($pages/@title != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_54 = new TagInfo("c:get", //$NON-NLS-1$
            73, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$pages/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_85_5 = new TagInfo("c:if", //$NON-NLS-1$
            85, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentPage/@title != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_85_46 = new TagInfo("c:get", //$NON-NLS-1$
            85, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentPage/@title", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_86_14 = new TagInfo("c:if", //$NON-NLS-1$
            86, 14,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentPage/@title != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_58 = new TagInfo("c:get", //$NON-NLS-1$
            86, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentPage /@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_106_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            106, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentPage/forms", //$NON-NLS-1$
                "currentForm", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_107_20 = new TagInfo("c:get", //$NON-NLS-1$
            107, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentForm/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_112_2 = new TagInfo("c:if", //$NON-NLS-1$
            112, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentPage/@footer = 'true')", //$NON-NLS-1$
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
        out.write("    <meta name=\"description\" content=\"\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <meta name=\"author\" content=\"\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <link rel=\"icon\" href=\"../../favicon.ico\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    <title>Theme Template for Bootstrap</title>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    <!-- Bootstrap core CSS -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <!-- Bootstrap theme -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    <!-- Custom styles for this template -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <link href=\"css/theme.css\" rel=\"stylesheet\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <link href=\"css/sticky-footer-navbar.css\" rel=\"stylesheet\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <script src=\"js/ie-emulation-modes-warning.js\"></script>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <!-- Datepicker -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<link href=\"css/bootstrap-datepicker.css\" rel=\"stylesheet\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <!-- Table plugin -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <link href=\"css/bootstrap-table.css\" rel=\"stylesheet\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <!-- JQuery Mask Money -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <script src=\"js/jquery.maskMoney.js\" type=\"text/javascript\"></script>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <!-- JQuery Validator -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <script src=\"js/validator.js\" type=\"text/javascript\"></script>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<!-- Entitys JS -->");  //$NON-NLS-1$        
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(66);
        out.setTag("iterate",1659,1725);
        RuntimeTagElement _jettag_c_iterate_43_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_43_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_43_1.setRuntimeParent(null);
        _jettag_c_iterate_43_1.setTagInfo(_td_c_iterate_43_1);
        _jettag_c_iterate_43_1.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_43_1.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_43_1.getTagInfo().getAttribute("delimiter"),1659,1725);
            out.loopIterate();
            out.write(NL);         
            out.write("\t<script src=\"js/");  //$NON-NLS-1$        
            out.setTag("get",1743,1782);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
            RuntimeTagElement _jettag_c_get_44_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_18); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_44_18.setRuntimeParent(_jettag_c_iterate_43_1);
            _jettag_c_get_44_18.setTagInfo(_td_c_get_44_18);
            _jettag_c_get_44_18.doStart(context, out);
            _jettag_c_get_44_18.doEnd();
            out.setTag(null,-1,-1);
            out.write(".js\"></script>");  //$NON-NLS-1$        
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_iterate_43_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_43_1.doEnd();
        out.loopEnd();
        out.endTag("iterate",72);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <style type=\"text/css\"></style>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->");  //$NON-NLS-1$        
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
        out.write("  <body role=\"document\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  \t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(45);
        out.setTag("if",2188,2233);
        RuntimeTagElement _jettag_c_if_56_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_56_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_56_4.setRuntimeParent(null);
        _jettag_c_if_56_4.setTagInfo(_td_c_if_56_4);
        _jettag_c_if_56_4.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_c_if_56_4.okToProcessBody()) {
            out.write(NL);         
            out.write("\t    <nav class=\"navbar navbar-inverse navbar-fixed-top\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t      <div class=\"container\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t        <div class=\"navbar-header\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t            <span class=\"sr-only\">Toggle navigation</span>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t            <span class=\"icon-bar\"></span>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t            <span class=\"icon-bar\"></span>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t            <span class=\"icon-bar\"></span>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t          </button>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t          <a class=\"navbar-brand\" href=\"/\">Gerador JET com Bootstrap</a>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t        </div>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t        <div id=\"navbar\" class=\"navbar-collapse collapse\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t          <ul class=\"nav navbar-nav\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t            ");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(50);
            out.setTag("iterate",2931,2981);
            RuntimeTagElement _jettag_c_iterate_70_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_70_14); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_70_14.setRuntimeParent(_jettag_c_if_56_4);
            _jettag_c_iterate_70_14.setTagInfo(_td_c_iterate_70_14);
            _jettag_c_iterate_70_14.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_70_14.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_70_14.getTagInfo().getAttribute("delimiter"),2931,2981);
                out.loopIterate();
                out.write(NL);         
                out.write("\t            \t<li");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(49);
                out.setTag("if",2999,3048);
                RuntimeTagElement _jettag_c_if_71_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_71_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_71_18.setRuntimeParent(_jettag_c_iterate_70_14);
                _jettag_c_if_71_18.setTagInfo(_td_c_if_71_18);
                _jettag_c_if_71_18.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_71_18.okToProcessBody()) {
                    out.write(" class=\"active\"");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_71_18.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_71_18.doEnd();
                out.endTag("if",15);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("><a href=\"/");  //$NON-NLS-1$        
                out.setTag("get",3081,3112);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(31);
                RuntimeTagElement _jettag_c_get_71_100 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_100); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_71_100.setRuntimeParent(_jettag_c_iterate_70_14);
                _jettag_c_get_71_100.setTagInfo(_td_c_get_71_100);
                _jettag_c_get_71_100.doStart(context, out);
                _jettag_c_get_71_100.doEnd();
                out.setTag(null,-1,-1);
                out.write(".php\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t            \t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(35);
                out.setTag("if",3134,3169);
                RuntimeTagElement _jettag_c_if_72_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_72_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_72_16.setRuntimeParent(_jettag_c_iterate_70_14);
                _jettag_c_if_72_16.setTagInfo(_td_c_if_72_16);
                _jettag_c_if_72_16.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_72_16.okToProcessBody()) {
                    out.setTag("get",3169,3201);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(32);
                    RuntimeTagElement _jettag_c_get_72_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_51); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_72_51.setRuntimeParent(_jettag_c_if_72_16);
                    _jettag_c_get_72_51.setTagInfo(_td_c_get_72_51);
                    _jettag_c_get_72_51.doStart(context, out);
                    _jettag_c_get_72_51.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_c_if_72_16.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_72_16.doEnd();
                out.endTag("if",32);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("\t            \t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(38);
                out.setTag("if",3224,3262);
                RuntimeTagElement _jettag_c_if_73_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_73_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_73_16.setRuntimeParent(_jettag_c_iterate_70_14);
                _jettag_c_if_73_16.setTagInfo(_td_c_if_73_16);
                _jettag_c_if_73_16.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_73_16.okToProcessBody()) {
                    out.setTag("get",3262,3293);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(31);
                    RuntimeTagElement _jettag_c_get_73_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_54); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_73_54.setRuntimeParent(_jettag_c_if_73_16);
                    _jettag_c_get_73_54.setTagInfo(_td_c_get_73_54);
                    _jettag_c_get_73_54.doStart(context, out);
                    _jettag_c_get_73_54.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_c_if_73_16.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_73_16.doEnd();
                out.endTag("if",31);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("\t            \t</a></li>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t            ");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_iterate_70_14.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_70_14.doEnd();
            out.loopEnd();
            out.endTag("iterate",357);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
            out.write("\t          </ul>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t        </div><!--/.nav-collapse -->");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t      </div>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t    </nav>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_if_56_4.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_if_56_4.doEnd();
        out.endTag("if",1203);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(NL);         
        out.write(NL);         
        out.write("\t<div class=\"container theme-showcase\" role=\"main\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<div class=\"page-header\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<h1>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(41);
        out.setTag("if",3537,3578);
        RuntimeTagElement _jettag_c_if_85_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_85_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_85_5.setRuntimeParent(null);
        _jettag_c_if_85_5.setTagInfo(_td_c_if_85_5);
        _jettag_c_if_85_5.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_c_if_85_5.okToProcessBody()) {
            out.setTag("get",3578,3616);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(38);
            RuntimeTagElement _jettag_c_get_85_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_85_46); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_85_46.setRuntimeParent(_jettag_c_if_85_5);
            _jettag_c_get_85_46.setTagInfo(_td_c_get_85_46);
            _jettag_c_get_85_46.doStart(context, out);
            _jettag_c_get_85_46.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_c_if_85_5.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_if_85_5.doEnd();
        out.endTag("if",38);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(NL);         
        out.write("\t            ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(44);
        out.setTag("if",3637,3681);
        RuntimeTagElement _jettag_c_if_86_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_86_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_86_14.setRuntimeParent(null);
        _jettag_c_if_86_14.setTagInfo(_td_c_if_86_14);
        _jettag_c_if_86_14.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_c_if_86_14.okToProcessBody()) {
            out.setTag("get",3681,3719);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(38);
            RuntimeTagElement _jettag_c_get_86_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_58); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_86_58.setRuntimeParent(_jettag_c_if_86_14);
            _jettag_c_get_86_58.setTagInfo(_td_c_get_86_58);
            _jettag_c_get_86_58.doStart(context, out);
            _jettag_c_get_86_58.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_c_if_86_14.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_if_86_14.doEnd();
        out.endTag("if",38);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(NL);         
        out.write("\t\t\t</h1>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<?php");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (isSet($_GET['success'])) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t<div class=\"alert alert-success alert-dismissible\" role=\"alert\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t<strong>Sucesso!</strong> A a&ccedil;&atilde;o foi realizada com sucesso!");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<?php");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t} elseif (isSet($_GET['error'])) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t<div class=\"alert alert-danger alert-dismissible\" role=\"alert\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t<strong>Erro!</strong> N&atilde;o foi poss&iacute;vel realizar a a&ccedil;&atilde;o solicitada!");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<?php");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(57);
        out.setTag("iterate",4463,4520);
        RuntimeTagElement _jettag_c_iterate_106_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_106_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_106_4.setRuntimeParent(null);
        _jettag_c_iterate_106_4.setTagInfo(_td_c_iterate_106_4);
        _jettag_c_iterate_106_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_106_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_106_4.getTagInfo().getAttribute("delimiter"),4463,4520);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\t\t\tinclude \"forms/");  //$NON-NLS-1$        
            out.setTag("get",4540,4577);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(37);
            RuntimeTagElement _jettag_c_get_107_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_107_20); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_107_20.setRuntimeParent(_jettag_c_iterate_106_4);
            _jettag_c_get_107_20.setTagInfo(_td_c_get_107_20);
            _jettag_c_get_107_20.doStart(context, out);
            _jettag_c_get_107_20.doEnd();
            out.setTag(null,-1,-1);
            out.write(".php\";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_106_4.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_106_4.doEnd();
        out.loopEnd();
        out.endTag("iterate",67);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(45);
        out.setTag("if",4616,4661);
        RuntimeTagElement _jettag_c_if_112_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_112_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_112_2.setRuntimeParent(null);
        _jettag_c_if_112_2.setTagInfo(_td_c_if_112_2);
        _jettag_c_if_112_2.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_c_if_112_2.okToProcessBody()) {
            out.write(NL);         
            out.write("\t\t<footer class=\"footer\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<div class=\"container\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t<p class=\"text-muted\">Place sticky footer content here.</p>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t</div>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</footer>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_if_112_2.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_if_112_2.doEnd();
        out.endTag("if",141);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <!-- Datepicker - Retirado de: http://websocialdev.com/calendario-input-date-com-datepicker-bootstrap/ -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<script src=\"js/bootstrap-datepicker.js\"></script>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <script src=\"js/bootstrap.min.js\"></script>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <script type=\"text/javascript\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \t$(document).ready(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t$('.datepicker').datepicker({");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tformat: \"yyyy-mm-dd\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </script>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <!-- Table - Retirado de: http://bootstrap-table.wenzhixin.net.cn/ -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <script src=\"js/bootstrap-table.js\"></script>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  </body>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</html>");  //$NON-NLS-1$        
        out.popTemplateFile();
    }
}
