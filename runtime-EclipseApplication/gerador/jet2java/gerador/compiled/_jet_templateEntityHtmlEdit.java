package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_templateEntityHtmlEdit implements JET2Template {
    private final String templateFile;

    public _jet_templateEntityHtmlEdit(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        out.popTemplateFile();
    }
}
