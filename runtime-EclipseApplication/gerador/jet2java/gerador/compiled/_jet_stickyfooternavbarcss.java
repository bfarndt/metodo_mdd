package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_stickyfooternavbarcss implements JET2Template {
    private final String templateFile;

    public _jet_stickyfooternavbarcss(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        out.write("/* Sticky footer styles");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("-------------------------------------------------- */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("html {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: relative;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  min-height: 100%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("body {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  /* Margin bottom by footer height */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-bottom: 60px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".footer {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: absolute;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: 100%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  /* Set the fixed height of the footer here */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  height: 60px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #f5f5f5;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("/* Custom page CSS");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("-------------------------------------------------- */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("/* Not required for template or sticky footer method. */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("body > .container {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 60px 15px 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".container .text-muted {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin: 20px 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".footer > .container {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding-right: 15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding-left: 15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("code {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-size: 80%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.popTemplateFile();
    }
}
