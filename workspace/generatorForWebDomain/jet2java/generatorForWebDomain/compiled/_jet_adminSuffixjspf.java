package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_adminSuffixjspf implements JET2Template {
    private final String templateFile;

    public _jet_adminSuffixjspf(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        out.write("</td>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</tr>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</table>");  //$NON-NLS-1$        
        out.popTemplateFile();
    }
}
