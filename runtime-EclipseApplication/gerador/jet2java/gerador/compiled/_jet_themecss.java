package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_themecss implements JET2Template {
    private final String templateFile;

    public _jet_themecss(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        out.write("body {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding-top: 70px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding-bottom: 30px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".theme-dropdown .dropdown-menu {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: static;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 20px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".theme-showcase > p > .btn {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin: 5px 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".theme-showcase .navbar .container {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.popTemplateFile();
    }
}
