package gerador.compiled;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2TemplateLoader;
import org.eclipse.jet.JET2TemplateLoaderExtension;

public class _jet_transformation implements JET2TemplateLoader,
        JET2TemplateLoaderExtension {

    private JET2TemplateLoader delegate = null;

    private final static Map<String, Integer> pathToTemplateOrdinalMap = new HashMap<String,Integer>(9);
    static {
        pathToTemplateOrdinalMap.put("templates/dump.jet", //$NON-NLS-1$
                Integer.valueOf(0));
        pathToTemplateOrdinalMap.put("templates/main.jet", //$NON-NLS-1$
                Integer.valueOf(1));
        pathToTemplateOrdinalMap.put("templates/templateEntityClass.jet", //$NON-NLS-1$
                Integer.valueOf(2));
        pathToTemplateOrdinalMap.put("templates/templateEntityClassDB.jet", //$NON-NLS-1$
                Integer.valueOf(3));
        pathToTemplateOrdinalMap.put("templates/templateEntityHtmlDestroy.jet", //$NON-NLS-1$
                Integer.valueOf(4));
        pathToTemplateOrdinalMap.put("templates/templateEntityHtmlEdit.jet", //$NON-NLS-1$
                Integer.valueOf(5));
        pathToTemplateOrdinalMap.put("templates/templateEntityHtmlIndex.jet", //$NON-NLS-1$
                Integer.valueOf(6));
        pathToTemplateOrdinalMap.put("templates/templateIndex.jet", //$NON-NLS-1$
                Integer.valueOf(7));
        pathToTemplateOrdinalMap.put("templates/templateSql.jet", //$NON-NLS-1$
                Integer.valueOf(8));
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jet.JET2TemplateLoader#getTemplate(java.lang.String)
     */
    public JET2Template getTemplate(final String templatePath) {
        final Integer ordinal = pathToTemplateOrdinalMap.get(templatePath);
        if(ordinal != null) {
           switch (ordinal.intValue()) {
            case 0: // templates/dump.jet
                return new gerador.compiled._jet_dump(templatePath);
            case 1: // templates/main.jet
                return new gerador.compiled._jet_main(templatePath);
            case 2: // templates/templateEntityClass.jet
                return new gerador.compiled._jet_templateEntityClass(templatePath);
            case 3: // templates/templateEntityClassDB.jet
                return new gerador.compiled._jet_templateEntityClassDB(templatePath);
            case 4: // templates/templateEntityHtmlDestroy.jet
                return new gerador.compiled._jet_templateEntityHtmlDestroy(templatePath);
            case 5: // templates/templateEntityHtmlEdit.jet
                return new gerador.compiled._jet_templateEntityHtmlEdit(templatePath);
            case 6: // templates/templateEntityHtmlIndex.jet
                return new gerador.compiled._jet_templateEntityHtmlIndex(templatePath);
            case 7: // templates/templateIndex.jet
                return new gerador.compiled._jet_templateIndex(templatePath);
            case 8: // templates/templateSql.jet
                return new gerador.compiled._jet_templateSql(templatePath);
            default:
                break;
            }
        }
        return this.delegate != null ? this.delegate.getTemplate(templatePath) : null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jet.JET2TemplateLoaderExtension#getDelegateLoader()
     */
    public JET2TemplateLoader getDelegateLoader() {
        return this.delegate;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.jet.JET2TemplateLoaderExtension#setDelegateLoader(org.eclipse
     * .jet.JET2TemplateLoader)
     */
    public void setDelegateLoader(final JET2TemplateLoader loader) {
        this.delegate = loader;
    }
}
