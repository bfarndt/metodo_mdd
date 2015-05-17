package gerador.compiled;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2TemplateLoader;
import org.eclipse.jet.JET2TemplateLoaderExtension;

public class _jet_transformation implements JET2TemplateLoader,
        JET2TemplateLoaderExtension {

    private JET2TemplateLoader delegate = null;

    private final static Map<String, Integer> pathToTemplateOrdinalMap = new HashMap<String,Integer>(17);
    static {
        pathToTemplateOrdinalMap.put("templates/CSS/templateBootstrap-datepicker.jet", //$NON-NLS-1$
                Integer.valueOf(0));
        pathToTemplateOrdinalMap.put("templates/CSS/templateBootstrap-datepicker.standalone.jet", //$NON-NLS-1$
                Integer.valueOf(1));
        pathToTemplateOrdinalMap.put("templates/CSS/templateBootstrap-datepicker3.jet", //$NON-NLS-1$
                Integer.valueOf(2));
        pathToTemplateOrdinalMap.put("templates/CSS/templateBootstrap-datepicker3.standalone.jet", //$NON-NLS-1$
                Integer.valueOf(3));
        pathToTemplateOrdinalMap.put("templates/JS/templateBootstrap-datepicker.jet", //$NON-NLS-1$
                Integer.valueOf(4));
        pathToTemplateOrdinalMap.put("templates/dump.jet", //$NON-NLS-1$
                Integer.valueOf(5));
        pathToTemplateOrdinalMap.put("templates/main.jet", //$NON-NLS-1$
                Integer.valueOf(6));
        pathToTemplateOrdinalMap.put("templates/templateEntityActionDelete.jet", //$NON-NLS-1$
                Integer.valueOf(7));
        pathToTemplateOrdinalMap.put("templates/templateEntityActionSave.jet", //$NON-NLS-1$
                Integer.valueOf(8));
        pathToTemplateOrdinalMap.put("templates/templateEntityClass.jet", //$NON-NLS-1$
                Integer.valueOf(9));
        pathToTemplateOrdinalMap.put("templates/templateEntityClassDB.jet", //$NON-NLS-1$
                Integer.valueOf(10));
        pathToTemplateOrdinalMap.put("templates/templateEntityJS.jet", //$NON-NLS-1$
                Integer.valueOf(11));
        pathToTemplateOrdinalMap.put("templates/templateForm.jet", //$NON-NLS-1$
                Integer.valueOf(12));
        pathToTemplateOrdinalMap.put("templates/templateFormNewEntityOnly.jet", //$NON-NLS-1$
                Integer.valueOf(13));
        pathToTemplateOrdinalMap.put("templates/templateFormReport.jet", //$NON-NLS-1$
                Integer.valueOf(14));
        pathToTemplateOrdinalMap.put("templates/templateHtml.jet", //$NON-NLS-1$
                Integer.valueOf(15));
        pathToTemplateOrdinalMap.put("templates/templateSql.jet", //$NON-NLS-1$
                Integer.valueOf(16));
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
            case 0: // templates/CSS/templateBootstrap-datepicker.jet
                return new gerador.compiled._jet_templateBootstrapdatepicker(templatePath);
            case 1: // templates/CSS/templateBootstrap-datepicker.standalone.jet
                return new gerador.compiled._jet_templateBootstrapdatepickerstandalone(templatePath);
            case 2: // templates/CSS/templateBootstrap-datepicker3.jet
                return new gerador.compiled._jet_templateBootstrapdatepicker3(templatePath);
            case 3: // templates/CSS/templateBootstrap-datepicker3.standalone.jet
                return new gerador.compiled._jet_templateBootstrapdatepicker3standalone(templatePath);
            case 4: // templates/JS/templateBootstrap-datepicker.jet
                return new gerador.compiled._jet_templateBootstrapdatepicker_0(templatePath);
            case 5: // templates/dump.jet
                return new gerador.compiled._jet_dump(templatePath);
            case 6: // templates/main.jet
                return new gerador.compiled._jet_main(templatePath);
            case 7: // templates/templateEntityActionDelete.jet
                return new gerador.compiled._jet_templateEntityActionDelete(templatePath);
            case 8: // templates/templateEntityActionSave.jet
                return new gerador.compiled._jet_templateEntityActionSave(templatePath);
            case 9: // templates/templateEntityClass.jet
                return new gerador.compiled._jet_templateEntityClass(templatePath);
            case 10: // templates/templateEntityClassDB.jet
                return new gerador.compiled._jet_templateEntityClassDB(templatePath);
            case 11: // templates/templateEntityJS.jet
                return new gerador.compiled._jet_templateEntityJS(templatePath);
            case 12: // templates/templateForm.jet
                return new gerador.compiled._jet_templateForm(templatePath);
            case 13: // templates/templateFormNewEntityOnly.jet
                return new gerador.compiled._jet_templateFormNewEntityOnly(templatePath);
            case 14: // templates/templateFormReport.jet
                return new gerador.compiled._jet_templateFormReport(templatePath);
            case 15: // templates/templateHtml.jet
                return new gerador.compiled._jet_templateHtml(templatePath);
            case 16: // templates/templateSql.jet
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
