package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_templateBootstrap2 implements JET2Template {
    private final String templateFile;

    public _jet_templateBootstrap2(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        out.write(NL);         
        out.write(".btn-link,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-link:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-link.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-link[disabled],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("fieldset[disabled] .btn-link {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-box-shadow: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          box-shadow: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-link,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-link:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-link:focus,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-link:active {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-link:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-link:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #23527c;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-decoration: underline;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-link[disabled]:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("fieldset[disabled] .btn-link:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-link[disabled]:focus,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("fieldset[disabled] .btn-link:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #777;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-decoration: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-lg,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-lg > .btn {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 10px 16px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-size: 18px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  line-height: 1.3333333;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 6px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-sm,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-sm > .btn {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 5px 10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-size: 12px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  line-height: 1.5;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-xs,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-xs > .btn {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 1px 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-size: 12px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  line-height: 1.5;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-block {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: 100%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-block + .btn-block {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("input[type=\"submit\"].btn-block,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("input[type=\"reset\"].btn-block,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("input[type=\"button\"].btn-block {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: 100%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".fade {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  opacity: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-transition: opacity .15s linear;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("       -o-transition: opacity .15s linear;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          transition: opacity .15s linear;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".fade.in {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  opacity: 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".collapse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".collapse.in {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("tr.collapse.in {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: table-row;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("tbody.collapse.in {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: table-row-group;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".collapsing {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: relative;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  height: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  overflow: hidden;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-transition-timing-function: ease;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("       -o-transition-timing-function: ease;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          transition-timing-function: ease;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-transition-duration: .35s;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("       -o-transition-duration: .35s;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          transition-duration: .35s;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-transition-property: height, visibility;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("       -o-transition-property: height, visibility;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          transition-property: height, visibility;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".caret {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: inline-block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  height: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: 2px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  vertical-align: middle;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top: 4px dashed;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-right: 4px solid transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-left: 4px solid transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".dropup,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".dropdown {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: relative;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".dropdown-toggle:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  outline: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".dropdown-menu {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: absolute;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  top: 100%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  z-index: 1000;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  float: left;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  min-width: 160px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 5px 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin: 2px 0 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-size: 14px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-align: left;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  list-style: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-background-clip: padding-box;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          background-clip: padding-box;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border: 1px solid #ccc;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border: 1px solid rgba(0, 0, 0, .15);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-box-shadow: 0 6px 12px rgba(0, 0, 0, .175);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          box-shadow: 0 6px 12px rgba(0, 0, 0, .175);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".dropdown-menu.pull-right {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  right: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".dropdown-menu .divider {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  height: 1px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin: 9px 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  overflow: hidden;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #e5e5e5;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".dropdown-menu > li > a {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 3px 20px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  clear: both;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-weight: normal;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  line-height: 1.42857143;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #333;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  white-space: nowrap;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".dropdown-menu > li > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".dropdown-menu > li > a:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #262626;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-decoration: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #f5f5f5;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".dropdown-menu > .active > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".dropdown-menu > .active > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".dropdown-menu > .active > a:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-decoration: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #337ab7;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  outline: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".dropdown-menu > .disabled > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".dropdown-menu > .disabled > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".dropdown-menu > .disabled > a:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #777;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".dropdown-menu > .disabled > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".dropdown-menu > .disabled > a:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-decoration: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  cursor: not-allowed;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  filter: progid:DXImageTransform.Microsoft.gradient(enabled = false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".open > .dropdown-menu {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".open > a {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  outline: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".dropdown-menu-right {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  right: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".dropdown-menu-left {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  right: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".dropdown-header {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 3px 20px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-size: 12px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  line-height: 1.42857143;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #777;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  white-space: nowrap;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".dropdown-backdrop {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: fixed;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  right: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  z-index: 990;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pull-right > .dropdown-menu {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  right: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".dropup .caret,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-fixed-bottom .dropdown .caret {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  content: \"\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom: 4px solid;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".dropup .dropdown-menu,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-fixed-bottom .dropdown .dropdown-menu {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  top: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  bottom: 100%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 2px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 768px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-right .dropdown-menu {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    right: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    left: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-right .dropdown-menu-left {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    right: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-vertical {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: relative;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: inline-block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  vertical-align: middle;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group > .btn,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-vertical > .btn {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: relative;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  float: left;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group > .btn:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-vertical > .btn:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group > .btn:focus,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-vertical > .btn:focus,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group > .btn:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-vertical > .btn:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group > .btn.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-vertical > .btn.active {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  z-index: 2;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group .btn + .btn,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group .btn + .btn-group,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group .btn-group + .btn,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group .btn-group + .btn-group {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: -1px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-toolbar {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: -5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-toolbar .btn-group,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-toolbar .input-group {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  float: left;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-toolbar > .btn,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-toolbar > .btn-group,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-toolbar > .input-group {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group > .btn:not(:first-child):not(:last-child):not(.dropdown-toggle) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group > .btn:first-child {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group > .btn:first-child:not(:last-child):not(.dropdown-toggle) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-right-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-right-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group > .btn:last-child:not(:first-child),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group > .dropdown-toggle:not(:first-child) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-left-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-left-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group > .btn-group {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  float: left;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group > .btn-group:not(:first-child):not(:last-child) > .btn {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group > .btn-group:first-child:not(:last-child) > .btn:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group > .btn-group:first-child:not(:last-child) > .dropdown-toggle {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-right-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-right-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group > .btn-group:last-child:not(:first-child) > .btn:first-child {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-left-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-left-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group .dropdown-toggle:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group.open .dropdown-toggle {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  outline: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group > .btn + .dropdown-toggle {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding-right: 8px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding-left: 8px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group > .btn-lg + .dropdown-toggle {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding-right: 12px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding-left: 12px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group.open .dropdown-toggle {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-box-shadow: inset 0 3px 5px rgba(0, 0, 0, .125);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          box-shadow: inset 0 3px 5px rgba(0, 0, 0, .125);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group.open .dropdown-toggle.btn-link {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-box-shadow: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          box-shadow: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn .caret {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-lg .caret {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-width: 5px 5px 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-width: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".dropup .btn-lg .caret {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-width: 0 5px 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-vertical > .btn,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-vertical > .btn-group,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-vertical > .btn-group > .btn {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  float: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: 100%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  max-width: 100%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-vertical > .btn-group > .btn {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  float: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-vertical > .btn + .btn,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-vertical > .btn + .btn-group,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-vertical > .btn-group + .btn,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-vertical > .btn-group + .btn-group {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: -1px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-vertical > .btn:not(:first-child):not(:last-child) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-vertical > .btn:first-child:not(:last-child) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-right-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-right-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-left-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-vertical > .btn:last-child:not(:first-child) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-left-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-right-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-left-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-vertical > .btn-group:not(:first-child):not(:last-child) > .btn {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-vertical > .btn-group:first-child:not(:last-child) > .btn:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-vertical > .btn-group:first-child:not(:last-child) > .dropdown-toggle {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-right-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-left-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-vertical > .btn-group:last-child:not(:first-child) > .btn:first-child {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-left-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-right-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-justified {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: table;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: 100%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  table-layout: fixed;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-collapse: separate;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-justified > .btn,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-justified > .btn-group {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: table-cell;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  float: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: 1%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-justified > .btn-group .btn {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: 100%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-justified > .btn-group .dropdown-menu {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("[data-toggle=\"buttons\"] > .btn input[type=\"radio\"],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("[data-toggle=\"buttons\"] > .btn-group > .btn input[type=\"radio\"],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("[data-toggle=\"buttons\"] > .btn input[type=\"checkbox\"],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("[data-toggle=\"buttons\"] > .btn-group > .btn input[type=\"checkbox\"] {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: absolute;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  clip: rect(0, 0, 0, 0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  pointer-events: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: relative;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: table;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-collapse: separate;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group[class*=\"col-\"] {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  float: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding-right: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding-left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group .form-control {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: relative;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  z-index: 2;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  float: left;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: 100%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-lg > .form-control,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-lg > .input-group-addon,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-lg > .input-group-btn > .btn {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  height: 46px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 10px 16px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-size: 18px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  line-height: 1.3333333;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 6px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("select.input-group-lg > .form-control,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("select.input-group-lg > .input-group-addon,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("select.input-group-lg > .input-group-btn > .btn {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  height: 46px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  line-height: 46px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("textarea.input-group-lg > .form-control,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("textarea.input-group-lg > .input-group-addon,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("textarea.input-group-lg > .input-group-btn > .btn,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("select[multiple].input-group-lg > .form-control,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("select[multiple].input-group-lg > .input-group-addon,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("select[multiple].input-group-lg > .input-group-btn > .btn {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  height: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-sm > .form-control,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-sm > .input-group-addon,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-sm > .input-group-btn > .btn {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  height: 30px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 5px 10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-size: 12px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  line-height: 1.5;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("select.input-group-sm > .form-control,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("select.input-group-sm > .input-group-addon,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("select.input-group-sm > .input-group-btn > .btn {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  height: 30px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  line-height: 30px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("textarea.input-group-sm > .form-control,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("textarea.input-group-sm > .input-group-addon,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("textarea.input-group-sm > .input-group-btn > .btn,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("select[multiple].input-group-sm > .form-control,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("select[multiple].input-group-sm > .input-group-addon,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("select[multiple].input-group-sm > .input-group-btn > .btn {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  height: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-addon,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-btn,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group .form-control {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: table-cell;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-addon:not(:first-child):not(:last-child),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-btn:not(:first-child):not(:last-child),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group .form-control:not(:first-child):not(:last-child) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-addon,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-btn {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: 1%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  white-space: nowrap;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  vertical-align: middle;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-addon {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 6px 12px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-size: 14px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-weight: normal;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  line-height: 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #555;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-align: center;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #eee;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border: 1px solid #ccc;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-addon.input-sm {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 5px 10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-size: 12px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-addon.input-lg {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 10px 16px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-size: 18px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 6px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-addon input[type=\"radio\"],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-addon input[type=\"checkbox\"] {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group .form-control:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-addon:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-btn:first-child > .btn,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-btn:first-child > .btn-group > .btn,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-btn:first-child > .dropdown-toggle,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-btn:last-child > .btn:not(:last-child):not(.dropdown-toggle),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-btn:last-child > .btn-group:not(:last-child) > .btn {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-right-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-right-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-addon:first-child {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-right: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group .form-control:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-addon:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-btn:last-child > .btn,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-btn:last-child > .btn-group > .btn,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-btn:last-child > .dropdown-toggle,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-btn:first-child > .btn:not(:first-child),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-btn:first-child > .btn-group:not(:first-child) > .btn {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-left-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-left-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-addon:last-child {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-btn {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: relative;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-size: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  white-space: nowrap;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-btn > .btn {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: relative;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-btn > .btn + .btn {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: -1px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-btn > .btn:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-btn > .btn:focus,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-btn > .btn:active {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  z-index: 2;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-btn:first-child > .btn,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-btn:first-child > .btn-group {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-right: -1px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-btn:last-child > .btn,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-group-btn:last-child > .btn-group {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: -1px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding-left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  list-style: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav > li {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: relative;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav > li > a {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: relative;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 10px 15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav > li > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav > li > a:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-decoration: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #eee;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav > li.disabled > a {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #777;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav > li.disabled > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav > li.disabled > a:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #777;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-decoration: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  cursor: not-allowed;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav .open > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav .open > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav .open > a:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #eee;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #337ab7;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav .nav-divider {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  height: 1px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin: 9px 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  overflow: hidden;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #e5e5e5;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav > li > a > img {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  max-width: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-tabs {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom: 1px solid #ddd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-tabs > li {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  float: left;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: -1px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-tabs > li > a {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-right: 2px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  line-height: 1.42857143;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border: 1px solid transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 4px 4px 0 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-tabs > li > a:hover {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #eee #eee #ddd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-tabs > li.active > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-tabs > li.active > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-tabs > li.active > a:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #555;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  cursor: default;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border: 1px solid #ddd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-color: transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-tabs.nav-justified {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: 100%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-tabs.nav-justified > li {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  float: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-tabs.nav-justified > li > a {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-align: center;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-tabs.nav-justified > .dropdown .dropdown-menu {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  top: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 768px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .nav-tabs.nav-justified > li {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: table-cell;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    width: 1%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .nav-tabs.nav-justified > li > a {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-tabs.nav-justified > li > a {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-right: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-tabs.nav-justified > .active > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-tabs.nav-justified > .active > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-tabs.nav-justified > .active > a:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border: 1px solid #ddd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 768px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .nav-tabs.nav-justified > li > a {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-bottom: 1px solid #ddd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-radius: 4px 4px 0 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .nav-tabs.nav-justified > .active > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .nav-tabs.nav-justified > .active > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .nav-tabs.nav-justified > .active > a:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-bottom-color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-pills > li {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  float: left;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-pills > li > a {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-pills > li + li {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: 2px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-pills > li.active > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-pills > li.active > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-pills > li.active > a:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #337ab7;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-stacked > li {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  float: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-stacked > li + li {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: 2px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-justified {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: 100%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-justified > li {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  float: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-justified > li > a {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-align: center;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-justified > .dropdown .dropdown-menu {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  top: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 768px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .nav-justified > li {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: table-cell;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    width: 1%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .nav-justified > li > a {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-tabs-justified {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-tabs-justified > li > a {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-right: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-tabs-justified > .active > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-tabs-justified > .active > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-tabs-justified > .active > a:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border: 1px solid #ddd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 768px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .nav-tabs-justified > li > a {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-bottom: 1px solid #ddd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-radius: 4px 4px 0 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .nav-tabs-justified > .active > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .nav-tabs-justified > .active > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .nav-tabs-justified > .active > a:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-bottom-color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".tab-content > .tab-pane {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".tab-content > .active {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-tabs .dropdown-menu {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: -1px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-left-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-right-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: relative;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  min-height: 50px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 20px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border: 1px solid transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 768px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 768px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-header {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    float: left;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-collapse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding-right: 15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding-left: 15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  overflow-x: visible;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-overflow-scrolling: touch;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top: 1px solid transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-box-shadow: inset 0 1px 0 rgba(255, 255, 255, .1);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          box-shadow: inset 0 1px 0 rgba(255, 255, 255, .1);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-collapse.in {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  overflow-y: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 768px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-collapse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    width: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    -webkit-box-shadow: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            box-shadow: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-collapse.collapse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: block !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    height: auto !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    padding-bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    overflow: visible !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-collapse.in {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    overflow-y: visible;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-fixed-top .navbar-collapse,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-static-top .navbar-collapse,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-fixed-bottom .navbar-collapse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    padding-right: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    padding-left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-fixed-top .navbar-collapse,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-fixed-bottom .navbar-collapse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  max-height: 340px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (max-device-width: 480px) and (orientation: landscape) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-fixed-top .navbar-collapse,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-fixed-bottom .navbar-collapse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    max-height: 200px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".container > .navbar-header,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".container-fluid > .navbar-header,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".container > .navbar-collapse,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".container-fluid > .navbar-collapse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-right: -15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: -15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 768px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .container > .navbar-header,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .container-fluid > .navbar-header,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .container > .navbar-collapse,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .container-fluid > .navbar-collapse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-right: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-static-top {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  z-index: 1000;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-width: 0 0 1px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 768px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-static-top {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-fixed-top,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-fixed-bottom {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: fixed;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  right: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  z-index: 1030;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 768px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-fixed-top,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-fixed-bottom {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-fixed-top {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-width: 0 0 1px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-fixed-bottom {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-width: 1px 0 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-brand {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  float: left;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  height: 50px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 15px 15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-size: 18px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  line-height: 20px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-brand:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-brand:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-decoration: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-brand > img {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 768px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar > .container .navbar-brand,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar > .container-fluid .navbar-brand {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-left: -15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-toggle {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: relative;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  float: right;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 9px 10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: 8px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-right: 15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 8px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border: 1px solid transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-toggle:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  outline: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-toggle .icon-bar {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: 22px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  height: 2px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 1px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-toggle .icon-bar + .icon-bar {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 768px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-toggle {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-nav {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin: 7.5px -15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-nav > li > a {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding-top: 10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding-bottom: 10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  line-height: 20px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (max-width: 767px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-nav .open .dropdown-menu {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    position: static;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    float: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    width: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-color: transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    -webkit-box-shadow: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            box-shadow: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-nav .open .dropdown-menu > li > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-nav .open .dropdown-menu .dropdown-header {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    padding: 5px 15px 5px 25px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-nav .open .dropdown-menu > li > a {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    line-height: 20px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-nav .open .dropdown-menu > li > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-nav .open .dropdown-menu > li > a:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 768px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-nav {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    float: left;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-nav > li {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    float: left;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-nav > li > a {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    padding-top: 15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    padding-bottom: 15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-form {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 10px 15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: 8px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-right: -15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 8px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: -15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top: 1px solid transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom: 1px solid transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-box-shadow: inset 0 1px 0 rgba(255, 255, 255, .1), 0 1px 0 rgba(255, 255, 255, .1);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          box-shadow: inset 0 1px 0 rgba(255, 255, 255, .1), 0 1px 0 rgba(255, 255, 255, .1);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 768px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-form .form-group {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: inline-block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    vertical-align: middle;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-form .form-control {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: inline-block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    width: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    vertical-align: middle;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-form .form-control-static {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: inline-block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-form .input-group {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: inline-table;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    vertical-align: middle;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-form .input-group .input-group-addon,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-form .input-group .input-group-btn,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-form .input-group .form-control {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    width: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-form .input-group > .form-control {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    width: 100%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-form .control-label {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    vertical-align: middle;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-form .radio,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-form .checkbox {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: inline-block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    vertical-align: middle;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-form .radio label,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-form .checkbox label {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    padding-left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-form .radio input[type=\"radio\"],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-form .checkbox input[type=\"checkbox\"] {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    position: relative;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-form .has-feedback .form-control-feedback {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (max-width: 767px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-form .form-group {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-bottom: 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-form .form-group:last-child {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 768px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-form {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    width: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    padding-top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    padding-bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-right: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    -webkit-box-shadow: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            box-shadow: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-nav > li > .dropdown-menu {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-left-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-right-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-fixed-bottom .navbar-nav > li > .dropdown-menu {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-left-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-right-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-right-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-left-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-btn {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: 8px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 8px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-btn.btn-sm {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: 10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-btn.btn-xs {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: 14px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 14px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-text {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: 15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 768px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-text {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    float: left;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-right: 15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-left: 15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 768px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-left {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    float: left !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-right {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    float: right !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-right: -15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-right ~ .navbar-right {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-right: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #f8f8f8;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #e7e7e7;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default .navbar-brand {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #777;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default .navbar-brand:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default .navbar-brand:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #5e5e5e;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default .navbar-text {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #777;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default .navbar-nav > li > a {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #777;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default .navbar-nav > li > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default .navbar-nav > li > a:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #333;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default .navbar-nav > .active > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default .navbar-nav > .active > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default .navbar-nav > .active > a:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #555;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #e7e7e7;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default .navbar-nav > .disabled > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default .navbar-nav > .disabled > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default .navbar-nav > .disabled > a:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #ccc;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default .navbar-toggle {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #ddd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default .navbar-toggle:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default .navbar-toggle:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #ddd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default .navbar-toggle .icon-bar {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #888;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default .navbar-collapse,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default .navbar-form {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #e7e7e7;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default .navbar-nav > .open > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default .navbar-nav > .open > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default .navbar-nav > .open > a:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #555;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #e7e7e7;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (max-width: 767px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-default .navbar-nav .open .dropdown-menu > li > a {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    color: #777;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-default .navbar-nav .open .dropdown-menu > li > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-default .navbar-nav .open .dropdown-menu > li > a:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    color: #333;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-color: transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-default .navbar-nav .open .dropdown-menu > .active > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-default .navbar-nav .open .dropdown-menu > .active > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-default .navbar-nav .open .dropdown-menu > .active > a:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    color: #555;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-color: #e7e7e7;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-default .navbar-nav .open .dropdown-menu > .disabled > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-default .navbar-nav .open .dropdown-menu > .disabled > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-default .navbar-nav .open .dropdown-menu > .disabled > a:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    color: #ccc;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-color: transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default .navbar-link {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #777;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default .navbar-link:hover {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #333;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default .btn-link {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #777;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default .btn-link:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default .btn-link:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #333;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default .btn-link[disabled]:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("fieldset[disabled] .navbar-default .btn-link:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default .btn-link[disabled]:focus,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("fieldset[disabled] .navbar-default .btn-link:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #ccc;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #222;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #080808;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse .navbar-brand {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #9d9d9d;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse .navbar-brand:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse .navbar-brand:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse .navbar-text {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #9d9d9d;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse .navbar-nav > li > a {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #9d9d9d;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse .navbar-nav > li > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse .navbar-nav > li > a:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse .navbar-nav > .active > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse .navbar-nav > .active > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse .navbar-nav > .active > a:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #080808;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse .navbar-nav > .disabled > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse .navbar-nav > .disabled > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse .navbar-nav > .disabled > a:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #444;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse .navbar-toggle {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #333;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse .navbar-toggle:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse .navbar-toggle:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #333;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse .navbar-toggle .icon-bar {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse .navbar-collapse,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse .navbar-form {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #101010;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse .navbar-nav > .open > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse .navbar-nav > .open > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse .navbar-nav > .open > a:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #080808;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (max-width: 767px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-inverse .navbar-nav .open .dropdown-menu > .dropdown-header {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-color: #080808;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-inverse .navbar-nav .open .dropdown-menu .divider {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-color: #080808;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-inverse .navbar-nav .open .dropdown-menu > li > a {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    color: #9d9d9d;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-inverse .navbar-nav .open .dropdown-menu > li > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-inverse .navbar-nav .open .dropdown-menu > li > a:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-color: transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-inverse .navbar-nav .open .dropdown-menu > .active > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-inverse .navbar-nav .open .dropdown-menu > .active > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-inverse .navbar-nav .open .dropdown-menu > .active > a:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-color: #080808;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-inverse .navbar-nav .open .dropdown-menu > .disabled > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-inverse .navbar-nav .open .dropdown-menu > .disabled > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .navbar-inverse .navbar-nav .open .dropdown-menu > .disabled > a:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    color: #444;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-color: transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse .navbar-link {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #9d9d9d;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse .navbar-link:hover {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse .btn-link {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #9d9d9d;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse .btn-link:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse .btn-link:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse .btn-link[disabled]:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("fieldset[disabled] .navbar-inverse .btn-link:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse .btn-link[disabled]:focus,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("fieldset[disabled] .navbar-inverse .btn-link:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #444;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".breadcrumb {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 8px 15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 20px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  list-style: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #f5f5f5;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".breadcrumb > li {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: inline-block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".breadcrumb > li + li:before {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 0 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #ccc;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  content: \"/\\00a0\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".breadcrumb > .active {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #777;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: inline-block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding-left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin: 20px 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination > li {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: inline;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination > li > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination > li > span {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: relative;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  float: left;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 6px 12px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: -1px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  line-height: 1.42857143;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #337ab7;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-decoration: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border: 1px solid #ddd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination > li:first-child > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination > li:first-child > span {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-left-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-left-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination > li:last-child > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination > li:last-child > span {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-right-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-right-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination > li > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination > li > span:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination > li > a:focus,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination > li > span:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #23527c;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #eee;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #ddd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination > .active > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination > .active > span,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination > .active > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination > .active > span:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination > .active > a:focus,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination > .active > span:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  z-index: 2;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  cursor: default;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #337ab7;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #337ab7;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination > .disabled > span,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination > .disabled > span:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination > .disabled > span:focus,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination > .disabled > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination > .disabled > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination > .disabled > a:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #777;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  cursor: not-allowed;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #ddd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination-lg > li > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination-lg > li > span {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 10px 16px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-size: 18px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination-lg > li:first-child > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination-lg > li:first-child > span {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-left-radius: 6px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-left-radius: 6px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination-lg > li:last-child > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination-lg > li:last-child > span {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-right-radius: 6px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-right-radius: 6px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination-sm > li > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination-sm > li > span {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 5px 10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-size: 12px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination-sm > li:first-child > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination-sm > li:first-child > span {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-left-radius: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-left-radius: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination-sm > li:last-child > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pagination-sm > li:last-child > span {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-right-radius: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-right-radius: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pager {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding-left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin: 20px 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-align: center;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  list-style: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pager li {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: inline;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pager li > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pager li > span {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: inline-block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 5px 14px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border: 1px solid #ddd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pager li > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pager li > a:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-decoration: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #eee;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pager .next > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pager .next > span {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  float: right;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pager .previous > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pager .previous > span {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  float: left;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pager .disabled > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pager .disabled > a:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pager .disabled > a:focus,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pager .disabled > span {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #777;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  cursor: not-allowed;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".label {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: inline;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: .2em .6em .3em;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-size: 75%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-weight: bold;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  line-height: 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-align: center;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  white-space: nowrap;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  vertical-align: baseline;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: .25em;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.label:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.label:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-decoration: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  cursor: pointer;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".label:empty {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn .label {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: relative;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  top: -1px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".label-default {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #777;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".label-default[href]:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".label-default[href]:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #5e5e5e;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".label-primary {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #337ab7;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".label-primary[href]:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".label-primary[href]:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #286090;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".label-success {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #5cb85c;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".label-success[href]:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".label-success[href]:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #449d44;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".label-info {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #5bc0de;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".label-info[href]:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".label-info[href]:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #31b0d5;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".label-warning {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #f0ad4e;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".label-warning[href]:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".label-warning[href]:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #ec971f;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".label-danger {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #d9534f;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".label-danger[href]:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".label-danger[href]:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #c9302c;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".badge {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: inline-block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  min-width: 10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 3px 7px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-size: 12px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-weight: bold;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  line-height: 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-align: center;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  white-space: nowrap;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  vertical-align: baseline;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #777;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".badge:empty {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn .badge {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: relative;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  top: -1px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-xs .badge,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-xs > .btn .badge {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 1px 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.badge:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.badge:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-decoration: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  cursor: pointer;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item.active > .badge,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-pills > .active > a > .badge {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #337ab7;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item > .badge {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  float: right;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item > .badge + .badge {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-right: 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav-pills > li > a > .badge {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".jumbotron {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 30px 15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 30px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: inherit;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #eee;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".jumbotron h1,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".jumbotron .h1 {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: inherit;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".jumbotron p {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-size: 21px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-weight: 200;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".jumbotron > hr {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-color: #d5d5d5;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".container .jumbotron,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".container-fluid .jumbotron {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 6px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".jumbotron .container {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  max-width: 100%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media screen and (min-width: 768px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .jumbotron {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    padding: 48px 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .container .jumbotron,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .container-fluid .jumbotron {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    padding-right: 60px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    padding-left: 60px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .jumbotron h1,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .jumbotron .h1 {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    font-size: 63px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".thumbnail {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 20px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  line-height: 1.42857143;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border: 1px solid #ddd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-transition: border .2s ease-in-out;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("       -o-transition: border .2s ease-in-out;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          transition: border .2s ease-in-out;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".thumbnail > img,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".thumbnail a > img {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-right: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.thumbnail:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.thumbnail:focus,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.thumbnail.active {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #337ab7;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".thumbnail .caption {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 9px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #333;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".alert {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 20px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border: 1px solid transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".alert h4 {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: inherit;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".alert .alert-link {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-weight: bold;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".alert > p,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".alert > ul {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".alert > p + p {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".alert-dismissable,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".alert-dismissible {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding-right: 35px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".alert-dismissable .close,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".alert-dismissible .close {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: relative;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  top: -2px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  right: -21px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: inherit;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".alert-success {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #3c763d;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #dff0d8;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #d6e9c6;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".alert-success hr {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-color: #c9e2b3;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".alert-success .alert-link {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #2b542c;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".alert-info {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #31708f;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #d9edf7;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #bce8f1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".alert-info hr {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-color: #a6e1ec;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".alert-info .alert-link {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #245269;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".alert-warning {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #8a6d3b;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #fcf8e3;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #faebcc;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".alert-warning hr {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-color: #f7e1b5;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".alert-warning .alert-link {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #66512c;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".alert-danger {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #a94442;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #f2dede;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #ebccd1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".alert-danger hr {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-color: #e4b9c0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".alert-danger .alert-link {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #843534;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@-webkit-keyframes progress-bar-stripes {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  from {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-position: 40px 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  to {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-position: 0 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@-o-keyframes progress-bar-stripes {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  from {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-position: 40px 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  to {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-position: 0 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@keyframes progress-bar-stripes {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  from {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-position: 40px 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  to {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-position: 0 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".progress {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  height: 20px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 20px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  overflow: hidden;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #f5f5f5;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-box-shadow: inset 0 1px 2px rgba(0, 0, 0, .1);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          box-shadow: inset 0 1px 2px rgba(0, 0, 0, .1);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".progress-bar {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  float: left;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  height: 100%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-size: 12px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  line-height: 20px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-align: center;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #337ab7;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-box-shadow: inset 0 -1px 0 rgba(0, 0, 0, .15);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          box-shadow: inset 0 -1px 0 rgba(0, 0, 0, .15);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-transition: width .6s ease;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("       -o-transition: width .6s ease;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          transition: width .6s ease;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".progress-striped .progress-bar,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".progress-bar-striped {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -webkit-linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image:      -o-linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image:         linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-background-size: 40px 40px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          background-size: 40px 40px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".progress.active .progress-bar,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".progress-bar.active {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-animation: progress-bar-stripes 2s linear infinite;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("       -o-animation: progress-bar-stripes 2s linear infinite;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          animation: progress-bar-stripes 2s linear infinite;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".progress-bar-success {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #5cb85c;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".progress-striped .progress-bar-success {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -webkit-linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image:      -o-linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image:         linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".progress-bar-info {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #5bc0de;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".progress-striped .progress-bar-info {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -webkit-linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image:      -o-linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image:         linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".progress-bar-warning {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #f0ad4e;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".progress-striped .progress-bar-warning {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -webkit-linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image:      -o-linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image:         linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".progress-bar-danger {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #d9534f;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".progress-striped .progress-bar-danger {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -webkit-linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image:      -o-linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image:         linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".media {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: 15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".media:first-child {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".media,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".media-body {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  overflow: hidden;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  zoom: 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".media-body {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: 10000px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".media-object {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".media-right,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".media > .pull-right {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding-left: 10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".media-left,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".media > .pull-left {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding-right: 10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".media-left,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".media-right,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".media-body {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: table-cell;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  vertical-align: top;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".media-middle {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  vertical-align: middle;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".media-bottom {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  vertical-align: bottom;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".media-heading {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".media-list {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding-left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  list-style: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding-left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 20px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: relative;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 10px 15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: -1px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border: 1px solid #ddd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item:first-child {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-left-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-right-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item:last-child {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-right-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-left-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #555;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item .list-group-item-heading {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #333;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #555;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-decoration: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #f5f5f5;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item.disabled,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item.disabled:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item.disabled:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #777;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  cursor: not-allowed;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #eee;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item.disabled .list-group-item-heading,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item.disabled:hover .list-group-item-heading,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item.disabled:focus .list-group-item-heading {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: inherit;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item.disabled .list-group-item-text,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item.disabled:hover .list-group-item-text,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item.disabled:focus .list-group-item-text {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #777;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item.active:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item.active:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  z-index: 2;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #337ab7;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #337ab7;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item.active .list-group-item-heading,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item.active:hover .list-group-item-heading,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item.active:focus .list-group-item-heading,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item.active .list-group-item-heading > small,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item.active:hover .list-group-item-heading > small,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item.active:focus .list-group-item-heading > small,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item.active .list-group-item-heading > .small,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item.active:hover .list-group-item-heading > .small,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item.active:focus .list-group-item-heading > .small {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: inherit;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item.active .list-group-item-text,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item.active:hover .list-group-item-text,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item.active:focus .list-group-item-text {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #c7ddef;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item-success {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #3c763d;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #dff0d8;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item-success {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #3c763d;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item-success .list-group-item-heading {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: inherit;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item-success:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item-success:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #3c763d;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #d0e9c6;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item-success.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item-success.active:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item-success.active:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #3c763d;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #3c763d;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item-info {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #31708f;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #d9edf7;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item-info {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #31708f;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item-info .list-group-item-heading {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: inherit;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item-info:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item-info:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #31708f;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #c4e3f3;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item-info.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item-info.active:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item-info.active:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #31708f;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #31708f;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item-warning {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #8a6d3b;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #fcf8e3;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item-warning {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #8a6d3b;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item-warning .list-group-item-heading {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: inherit;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item-warning:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item-warning:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #8a6d3b;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #faf2cc;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item-warning.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item-warning.active:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item-warning.active:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #8a6d3b;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #8a6d3b;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item-danger {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #a94442;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #f2dede;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item-danger {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #a94442;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item-danger .list-group-item-heading {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: inherit;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item-danger:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item-danger:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #a94442;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #ebcccc;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item-danger.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item-danger.active:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("a.list-group-item-danger.active:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #a94442;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #a94442;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item-heading {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item-text {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  line-height: 1.3;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 20px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border: 1px solid transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-box-shadow: 0 1px 1px rgba(0, 0, 0, .05);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          box-shadow: 0 1px 1px rgba(0, 0, 0, .05);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-body {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-heading {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 10px 15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom: 1px solid transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-left-radius: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-right-radius: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-heading > .dropdown .dropdown-toggle {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: inherit;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-title {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-size: 16px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: inherit;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-title > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-title > small,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-title > .small,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-title > small > a,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-title > .small > a {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: inherit;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-footer {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 10px 15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #f5f5f5;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top: 1px solid #ddd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-right-radius: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-left-radius: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .list-group,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .panel-collapse > .list-group {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .list-group .list-group-item,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .panel-collapse > .list-group .list-group-item {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-width: 1px 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .list-group:first-child .list-group-item:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .panel-collapse > .list-group:first-child .list-group-item:first-child {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-left-radius: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-right-radius: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .list-group:last-child .list-group-item:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .panel-collapse > .list-group:last-child .list-group-item:last-child {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-right-radius: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-left-radius: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-heading + .list-group .list-group-item:first-child {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-width: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group + .panel-footer {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-width: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive > .table,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .panel-collapse > .table {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table caption,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive > .table caption,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .panel-collapse > .table caption {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding-right: 15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding-left: 15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive:first-child > .table:first-child {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-left-radius: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-right-radius: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table:first-child > thead:first-child > tr:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive:first-child > .table:first-child > thead:first-child > tr:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table:first-child > tbody:first-child > tr:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive:first-child > .table:first-child > tbody:first-child > tr:first-child {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-left-radius: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-right-radius: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table:first-child > thead:first-child > tr:first-child td:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive:first-child > .table:first-child > thead:first-child > tr:first-child td:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table:first-child > tbody:first-child > tr:first-child td:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive:first-child > .table:first-child > tbody:first-child > tr:first-child td:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table:first-child > thead:first-child > tr:first-child th:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive:first-child > .table:first-child > thead:first-child > tr:first-child th:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table:first-child > tbody:first-child > tr:first-child th:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive:first-child > .table:first-child > tbody:first-child > tr:first-child th:first-child {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-left-radius: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table:first-child > thead:first-child > tr:first-child td:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive:first-child > .table:first-child > thead:first-child > tr:first-child td:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table:first-child > tbody:first-child > tr:first-child td:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive:first-child > .table:first-child > tbody:first-child > tr:first-child td:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table:first-child > thead:first-child > tr:first-child th:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive:first-child > .table:first-child > thead:first-child > tr:first-child th:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table:first-child > tbody:first-child > tr:first-child th:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive:first-child > .table:first-child > tbody:first-child > tr:first-child th:last-child {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-right-radius: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive:last-child > .table:last-child {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-right-radius: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-left-radius: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table:last-child > tbody:last-child > tr:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive:last-child > .table:last-child > tbody:last-child > tr:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table:last-child > tfoot:last-child > tr:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive:last-child > .table:last-child > tfoot:last-child > tr:last-child {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-right-radius: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-left-radius: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table:last-child > tbody:last-child > tr:last-child td:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive:last-child > .table:last-child > tbody:last-child > tr:last-child td:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table:last-child > tfoot:last-child > tr:last-child td:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive:last-child > .table:last-child > tfoot:last-child > tr:last-child td:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table:last-child > tbody:last-child > tr:last-child th:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive:last-child > .table:last-child > tbody:last-child > tr:last-child th:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table:last-child > tfoot:last-child > tr:last-child th:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive:last-child > .table:last-child > tfoot:last-child > tr:last-child th:first-child {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-left-radius: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table:last-child > tbody:last-child > tr:last-child td:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive:last-child > .table:last-child > tbody:last-child > tr:last-child td:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table:last-child > tfoot:last-child > tr:last-child td:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive:last-child > .table:last-child > tfoot:last-child > tr:last-child td:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table:last-child > tbody:last-child > tr:last-child th:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive:last-child > .table:last-child > tbody:last-child > tr:last-child th:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table:last-child > tfoot:last-child > tr:last-child th:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive:last-child > .table:last-child > tfoot:last-child > tr:last-child th:last-child {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-right-radius: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .panel-body + .table,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .panel-body + .table-responsive,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table + .panel-body,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive + .panel-body {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top: 1px solid #ddd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table > tbody:first-child > tr:first-child th,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table > tbody:first-child > tr:first-child td {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-bordered,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive > .table-bordered {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-bordered > thead > tr > th:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive > .table-bordered > thead > tr > th:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-bordered > tbody > tr > th:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive > .table-bordered > tbody > tr > th:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-bordered > tfoot > tr > th:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive > .table-bordered > tfoot > tr > th:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-bordered > thead > tr > td:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive > .table-bordered > thead > tr > td:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-bordered > tbody > tr > td:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive > .table-bordered > tbody > tr > td:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-bordered > tfoot > tr > td:first-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive > .table-bordered > tfoot > tr > td:first-child {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-bordered > thead > tr > th:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive > .table-bordered > thead > tr > th:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-bordered > tbody > tr > th:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive > .table-bordered > tbody > tr > th:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-bordered > tfoot > tr > th:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive > .table-bordered > tfoot > tr > th:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-bordered > thead > tr > td:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive > .table-bordered > thead > tr > td:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-bordered > tbody > tr > td:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive > .table-bordered > tbody > tr > td:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-bordered > tfoot > tr > td:last-child,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive > .table-bordered > tfoot > tr > td:last-child {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-right: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-bordered > thead > tr:first-child > td,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive > .table-bordered > thead > tr:first-child > td,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-bordered > tbody > tr:first-child > td,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive > .table-bordered > tbody > tr:first-child > td,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-bordered > thead > tr:first-child > th,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive > .table-bordered > thead > tr:first-child > th,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-bordered > tbody > tr:first-child > th,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive > .table-bordered > tbody > tr:first-child > th {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-bordered > tbody > tr:last-child > td,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive > .table-bordered > tbody > tr:last-child > td,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-bordered > tfoot > tr:last-child > td,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive > .table-bordered > tfoot > tr:last-child > td,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-bordered > tbody > tr:last-child > th,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive > .table-bordered > tbody > tr:last-child > th,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-bordered > tfoot > tr:last-child > th,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive > .table-bordered > tfoot > tr:last-child > th {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel > .table-responsive {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-group {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 20px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-group .panel {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-group .panel + .panel {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-group .panel-heading {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-group .panel-heading + .panel-collapse > .panel-body,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-group .panel-heading + .panel-collapse > .list-group {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top: 1px solid #ddd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-group .panel-footer {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-group .panel-footer + .panel-collapse .panel-body {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom: 1px solid #ddd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-default {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #ddd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-default > .panel-heading {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #333;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #f5f5f5;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #ddd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-default > .panel-heading + .panel-collapse > .panel-body {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-color: #ddd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-default > .panel-heading .badge {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #f5f5f5;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #333;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-default > .panel-footer + .panel-collapse > .panel-body {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-color: #ddd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-primary {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #337ab7;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-primary > .panel-heading {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #337ab7;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #337ab7;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-primary > .panel-heading + .panel-collapse > .panel-body {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-color: #337ab7;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-primary > .panel-heading .badge {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #337ab7;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-primary > .panel-footer + .panel-collapse > .panel-body {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-color: #337ab7;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-success {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #d6e9c6;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-success > .panel-heading {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #3c763d;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #dff0d8;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #d6e9c6;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-success > .panel-heading + .panel-collapse > .panel-body {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-color: #d6e9c6;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-success > .panel-heading .badge {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #dff0d8;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #3c763d;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-success > .panel-footer + .panel-collapse > .panel-body {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-color: #d6e9c6;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-info {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #bce8f1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-info > .panel-heading {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #31708f;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #d9edf7;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #bce8f1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-info > .panel-heading + .panel-collapse > .panel-body {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-color: #bce8f1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-info > .panel-heading .badge {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #d9edf7;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #31708f;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-info > .panel-footer + .panel-collapse > .panel-body {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-color: #bce8f1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-warning {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #faebcc;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-warning > .panel-heading {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #8a6d3b;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #fcf8e3;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #faebcc;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-warning > .panel-heading + .panel-collapse > .panel-body {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-color: #faebcc;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-warning > .panel-heading .badge {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #fcf8e3;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #8a6d3b;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-warning > .panel-footer + .panel-collapse > .panel-body {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-color: #faebcc;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-danger {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #ebccd1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-danger > .panel-heading {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #a94442;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #f2dede;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #ebccd1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-danger > .panel-heading + .panel-collapse > .panel-body {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-color: #ebccd1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-danger > .panel-heading .badge {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #f2dede;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #a94442;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-danger > .panel-footer + .panel-collapse > .panel-body {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-color: #ebccd1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".embed-responsive {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: relative;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  height: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  overflow: hidden;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".embed-responsive .embed-responsive-item,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".embed-responsive iframe,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".embed-responsive embed,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".embed-responsive object,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".embed-responsive video {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: absolute;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: 100%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  height: 100%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".embed-responsive-16by9 {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding-bottom: 56.25%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".embed-responsive-4by3 {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding-bottom: 75%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".well {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  min-height: 20px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 19px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 20px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #f5f5f5;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border: 1px solid #e3e3e3;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, .05);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          box-shadow: inset 0 1px 1px rgba(0, 0, 0, .05);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".well blockquote {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #ddd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: rgba(0, 0, 0, .15);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".well-lg {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 24px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 6px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".well-sm {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 9px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".close {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  float: right;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-size: 21px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-weight: bold;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  line-height: 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #000;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-shadow: 0 1px 0 #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  filter: alpha(opacity=20);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  opacity: .2;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".close:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".close:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #000;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-decoration: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  cursor: pointer;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  filter: alpha(opacity=50);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  opacity: .5;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("button.close {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-appearance: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  cursor: pointer;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background: transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".modal-open {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  overflow: hidden;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".modal {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: fixed;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  right: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  z-index: 1050;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  overflow: hidden;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-overflow-scrolling: touch;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  outline: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".modal.fade .modal-dialog {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-transition: -webkit-transform .3s ease-out;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("       -o-transition:      -o-transform .3s ease-out;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          transition:         transform .3s ease-out;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-transform: translate(0, -25%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      -ms-transform: translate(0, -25%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("       -o-transform: translate(0, -25%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          transform: translate(0, -25%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".modal.in .modal-dialog {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-transform: translate(0, 0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      -ms-transform: translate(0, 0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("       -o-transform: translate(0, 0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          transform: translate(0, 0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".modal-open .modal {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  overflow-x: hidden;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  overflow-y: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".modal-dialog {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: relative;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin: 10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".modal-content {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: relative;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-background-clip: padding-box;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          background-clip: padding-box;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border: 1px solid #999;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border: 1px solid rgba(0, 0, 0, .2);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 6px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  outline: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-box-shadow: 0 3px 9px rgba(0, 0, 0, .5);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          box-shadow: 0 3px 9px rgba(0, 0, 0, .5);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".modal-backdrop {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: fixed;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  right: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  z-index: 1040;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #000;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".modal-backdrop.fade {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  filter: alpha(opacity=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  opacity: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".modal-backdrop.in {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  filter: alpha(opacity=50);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  opacity: .5;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".modal-header {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  min-height: 16.42857143px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom: 1px solid #e5e5e5;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".modal-header .close {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: -2px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".modal-title {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  line-height: 1.42857143;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".modal-body {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: relative;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".modal-footer {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-align: right;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top: 1px solid #e5e5e5;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".modal-footer .btn + .btn {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".modal-footer .btn-group .btn + .btn {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: -1px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".modal-footer .btn-block + .btn-block {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".modal-scrollbar-measure {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: absolute;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  top: -9999px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: 50px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  height: 50px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  overflow: scroll;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 768px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .modal-dialog {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    width: 600px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin: 30px auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .modal-content {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    -webkit-box-shadow: 0 5px 15px rgba(0, 0, 0, .5);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            box-shadow: 0 5px 15px rgba(0, 0, 0, .5);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .modal-sm {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    width: 300px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 992px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .modal-lg {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    width: 900px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".tooltip {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: absolute;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  z-index: 1070;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-family: \"Helvetica Neue\", Helvetica, Arial, sans-serif;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-size: 12px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-weight: normal;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  line-height: 1.4;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  filter: alpha(opacity=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  opacity: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".tooltip.in {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  filter: alpha(opacity=90);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  opacity: .9;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".tooltip.top {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 5px 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: -3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".tooltip.right {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 0 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".tooltip.bottom {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 5px 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".tooltip.left {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 0 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: -3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".tooltip-inner {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  max-width: 200px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 3px 8px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-align: center;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-decoration: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #000;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".tooltip-arrow {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: absolute;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  height: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-style: solid;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".tooltip.top .tooltip-arrow {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: 50%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: -5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-width: 5px 5px 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-color: #000;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".tooltip.top-left .tooltip-arrow {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  right: 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: -5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-width: 5px 5px 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-color: #000;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".tooltip.top-right .tooltip-arrow {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: -5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-width: 5px 5px 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-color: #000;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".tooltip.right .tooltip-arrow {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  top: 50%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: -5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-width: 5px 5px 5px 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-right-color: #000;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".tooltip.left .tooltip-arrow {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  top: 50%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  right: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: -5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-width: 5px 0 5px 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-left-color: #000;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".tooltip.bottom .tooltip-arrow {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: 50%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: -5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-width: 0 5px 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-color: #000;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".tooltip.bottom-left .tooltip-arrow {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  right: 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: -5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-width: 0 5px 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-color: #000;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".tooltip.bottom-right .tooltip-arrow {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: -5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-width: 0 5px 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-color: #000;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".popover {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: absolute;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  z-index: 1060;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  max-width: 276px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 1px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-family: \"Helvetica Neue\", Helvetica, Arial, sans-serif;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-size: 14px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-weight: normal;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  line-height: 1.42857143;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-align: left;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  white-space: normal;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-background-clip: padding-box;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          background-clip: padding-box;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border: 1px solid #ccc;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border: 1px solid rgba(0, 0, 0, .2);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 6px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-box-shadow: 0 5px 10px rgba(0, 0, 0, .2);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          box-shadow: 0 5px 10px rgba(0, 0, 0, .2);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".popover.top {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: -10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".popover.right {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: 10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".popover.bottom {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: 10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".popover.left {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: -10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".popover-title {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 8px 14px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-size: 14px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #f7f7f7;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom: 1px solid #ebebeb;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 5px 5px 0 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".popover-content {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 9px 14px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".popover > .arrow,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".popover > .arrow:after {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: absolute;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  height: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-style: solid;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".popover > .arrow {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-width: 11px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".popover > .arrow:after {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  content: \"\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-width: 10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".popover.top > .arrow {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  bottom: -11px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: 50%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: -11px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-color: #999;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-color: rgba(0, 0, 0, .25);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-width: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".popover.top > .arrow:after {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  bottom: 1px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: -10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  content: \" \";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-width: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".popover.right > .arrow {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  top: 50%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: -11px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: -11px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-right-color: #999;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-right-color: rgba(0, 0, 0, .25);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-left-width: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".popover.right > .arrow:after {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  bottom: -10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: 1px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  content: \" \";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-right-color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-left-width: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".popover.bottom > .arrow {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  top: -11px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: 50%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: -11px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-width: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-color: #999;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-color: rgba(0, 0, 0, .25);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".popover.bottom > .arrow:after {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  top: 1px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: -10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  content: \" \";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top-width: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".popover.left > .arrow {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  top: 50%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  right: -11px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: -11px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-right-width: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-left-color: #999;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-left-color: rgba(0, 0, 0, .25);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".popover.left > .arrow:after {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  right: 1px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  bottom: -10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  content: \" \";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-right-width: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-left-color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: relative;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-inner {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: relative;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: 100%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  overflow: hidden;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-inner > .item {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: relative;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-transition: .6s ease-in-out left;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("       -o-transition: .6s ease-in-out left;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          transition: .6s ease-in-out left;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-inner > .item > img,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-inner > .item > a > img {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  line-height: 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media all and (transform-3d), (-webkit-transform-3d) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .carousel-inner > .item {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    -webkit-transition: -webkit-transform .6s ease-in-out;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("         -o-transition:      -o-transform .6s ease-in-out;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            transition:         transform .6s ease-in-out;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    -webkit-backface-visibility: hidden;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            backface-visibility: hidden;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    -webkit-perspective: 1000;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            perspective: 1000;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .carousel-inner > .item.next,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .carousel-inner > .item.active.right {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    -webkit-transform: translate3d(100%, 0, 0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            transform: translate3d(100%, 0, 0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .carousel-inner > .item.prev,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .carousel-inner > .item.active.left {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    -webkit-transform: translate3d(-100%, 0, 0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            transform: translate3d(-100%, 0, 0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .carousel-inner > .item.next.left,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .carousel-inner > .item.prev.right,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .carousel-inner > .item.active {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    -webkit-transform: translate3d(0, 0, 0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            transform: translate3d(0, 0, 0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-inner > .active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-inner > .next,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-inner > .prev {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-inner > .active {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-inner > .next,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-inner > .prev {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: absolute;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: 100%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-inner > .next {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: 100%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-inner > .prev {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: -100%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-inner > .next.left,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-inner > .prev.right {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-inner > .active.left {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: -100%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-inner > .active.right {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: 100%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-control {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: absolute;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: 15%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-size: 20px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-align: center;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-shadow: 0 1px 2px rgba(0, 0, 0, .6);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  filter: alpha(opacity=50);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  opacity: .5;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-control.left {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -webkit-linear-gradient(left, rgba(0, 0, 0, .5) 0%, rgba(0, 0, 0, .0001) 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image:      -o-linear-gradient(left, rgba(0, 0, 0, .5) 0%, rgba(0, 0, 0, .0001) 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -webkit-gradient(linear, left top, right top, from(rgba(0, 0, 0, .5)), to(rgba(0, 0, 0, .0001)));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image:         linear-gradient(to right, rgba(0, 0, 0, .5) 0%, rgba(0, 0, 0, .0001) 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#80000000', endColorstr='#00000000', GradientType=1);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-control.right {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  right: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -webkit-linear-gradient(left, rgba(0, 0, 0, .0001) 0%, rgba(0, 0, 0, .5) 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image:      -o-linear-gradient(left, rgba(0, 0, 0, .0001) 0%, rgba(0, 0, 0, .5) 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -webkit-gradient(linear, left top, right top, from(rgba(0, 0, 0, .0001)), to(rgba(0, 0, 0, .5)));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image:         linear-gradient(to right, rgba(0, 0, 0, .0001) 0%, rgba(0, 0, 0, .5) 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#00000000', endColorstr='#80000000', GradientType=1);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-control:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-control:focus {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-decoration: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  filter: alpha(opacity=90);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  outline: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  opacity: .9;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-control .icon-prev,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-control .icon-next,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-control .glyphicon-chevron-left,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-control .glyphicon-chevron-right {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: absolute;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  top: 50%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  z-index: 5;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: inline-block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-control .icon-prev,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-control .glyphicon-chevron-left {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: 50%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: -10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-control .icon-next,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-control .glyphicon-chevron-right {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  right: 50%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-right: -10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-control .icon-prev,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-control .icon-next {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: 20px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  height: 20px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: -10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-family: serif;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  line-height: 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-control .icon-prev:before {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  content: '\\2039';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-control .icon-next:before {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  content: '\\203a';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-indicators {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: absolute;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  bottom: 10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: 50%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  z-index: 15;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: 60%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding-left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: -30%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-align: center;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  list-style: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-indicators li {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: inline-block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: 10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  height: 10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin: 1px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-indent: -999px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  cursor: pointer;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #000 \\9;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: rgba(0, 0, 0, 0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border: 1px solid #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-indicators .active {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: 12px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  height: 12px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-caption {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: absolute;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  right: 15%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  bottom: 20px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: 15%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  z-index: 10;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding-top: 20px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding-bottom: 20px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-align: center;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-shadow: 0 1px 2px rgba(0, 0, 0, .6);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".carousel-caption .btn {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-shadow: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media screen and (min-width: 768px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .carousel-control .glyphicon-chevron-left,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .carousel-control .glyphicon-chevron-right,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .carousel-control .icon-prev,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .carousel-control .icon-next {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    width: 30px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    height: 30px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-top: -15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    font-size: 30px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .carousel-control .glyphicon-chevron-left,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .carousel-control .icon-prev {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-left: -15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .carousel-control .glyphicon-chevron-right,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .carousel-control .icon-next {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-right: -15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .carousel-caption {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    right: 20%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    left: 20%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    padding-bottom: 30px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .carousel-indicators {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    bottom: 20px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".clearfix:before,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".clearfix:after,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".dl-horizontal dd:before,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".dl-horizontal dd:after,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".container:before,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".container:after,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".container-fluid:before,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".container-fluid:after,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".row:before,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".row:after,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".form-horizontal .form-group:before,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".form-horizontal .form-group:after,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-toolbar:before,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-toolbar:after,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-vertical > .btn-group:before,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-vertical > .btn-group:after,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav:before,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav:after,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar:before,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar:after,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-header:before,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-header:after,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-collapse:before,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-collapse:after,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pager:before,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pager:after,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-body:before,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-body:after,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".modal-footer:before,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".modal-footer:after {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: table;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  content: \" \";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".clearfix:after,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".dl-horizontal dd:after,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".container:after,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".container-fluid:after,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".row:after,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".form-horizontal .form-group:after,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-toolbar:after,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-group-vertical > .btn-group:after,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".nav:after,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar:after,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-header:after,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-collapse:after,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pager:after,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-body:after,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".modal-footer:after {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  clear: both;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".center-block {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-right: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pull-right {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  float: right !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".pull-left {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  float: left !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".hide {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: none !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".show {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: block !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".invisible {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  visibility: hidden;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".text-hide {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font: 0/0 a;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-shadow: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".hidden {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: none !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".affix {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: fixed;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@-ms-viewport {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: device-width;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".visible-xs,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".visible-sm,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".visible-md,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".visible-lg {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: none !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".visible-xs-block,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".visible-xs-inline,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".visible-xs-inline-block,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".visible-sm-block,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".visible-sm-inline,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".visible-sm-inline-block,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".visible-md-block,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".visible-md-inline,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".visible-md-inline-block,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".visible-lg-block,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".visible-lg-inline,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".visible-lg-inline-block {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: none !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (max-width: 767px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .visible-xs {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: block !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  table.visible-xs {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: table;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  tr.visible-xs {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: table-row !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  th.visible-xs,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  td.visible-xs {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: table-cell !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (max-width: 767px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .visible-xs-block {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: block !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (max-width: 767px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .visible-xs-inline {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: inline !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (max-width: 767px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .visible-xs-inline-block {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: inline-block !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 768px) and (max-width: 991px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .visible-sm {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: block !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  table.visible-sm {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: table;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  tr.visible-sm {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: table-row !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  th.visible-sm,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  td.visible-sm {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: table-cell !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 768px) and (max-width: 991px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .visible-sm-block {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: block !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 768px) and (max-width: 991px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .visible-sm-inline {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: inline !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 768px) and (max-width: 991px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .visible-sm-inline-block {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: inline-block !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 992px) and (max-width: 1199px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .visible-md {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: block !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  table.visible-md {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: table;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  tr.visible-md {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: table-row !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  th.visible-md,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  td.visible-md {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: table-cell !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 992px) and (max-width: 1199px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .visible-md-block {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: block !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 992px) and (max-width: 1199px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .visible-md-inline {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: inline !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 992px) and (max-width: 1199px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .visible-md-inline-block {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: inline-block !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 1200px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .visible-lg {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: block !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  table.visible-lg {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: table;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  tr.visible-lg {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: table-row !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  th.visible-lg,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  td.visible-lg {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: table-cell !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 1200px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .visible-lg-block {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: block !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 1200px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .visible-lg-inline {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: inline !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 1200px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .visible-lg-inline-block {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: inline-block !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (max-width: 767px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .hidden-xs {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: none !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 768px) and (max-width: 991px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .hidden-sm {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: none !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 992px) and (max-width: 1199px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .hidden-md {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: none !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (min-width: 1200px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .hidden-lg {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: none !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".visible-print {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: none !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media print {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .visible-print {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: block !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  table.visible-print {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: table;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  tr.visible-print {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: table-row !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  th.visible-print,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  td.visible-print {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: table-cell !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".visible-print-block {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: none !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media print {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .visible-print-block {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: block !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".visible-print-inline {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: none !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media print {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .visible-print-inline {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: inline !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".visible-print-inline-block {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: none !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media print {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .visible-print-inline-block {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: inline-block !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media print {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  .hidden-print {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: none !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("/*# sourceMappingURL=bootstrap.css.map */");  //$NON-NLS-1$        
        out.write(NL);         
        out.popTemplateFile();
    }
}
