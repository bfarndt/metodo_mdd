package gerador.compiled;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2TemplateLoader;
import org.eclipse.jet.JET2TemplateLoaderExtension;

public class _jet_transformation implements JET2TemplateLoader,
        JET2TemplateLoaderExtension {

    private JET2TemplateLoader delegate = null;

    private final static Map<String, Integer> pathToTemplateOrdinalMap = new HashMap<String,Integer>(33);
    static {
        pathToTemplateOrdinalMap.put("templates/CSS/templateBootstrap-datepicker.jet", //$NON-NLS-1$
                Integer.valueOf(0));
        pathToTemplateOrdinalMap.put("templates/CSS/templateBootstrap-datepicker.standalone.jet", //$NON-NLS-1$
                Integer.valueOf(1));
        pathToTemplateOrdinalMap.put("templates/CSS/templateBootstrap-datepicker3.jet", //$NON-NLS-1$
                Integer.valueOf(2));
        pathToTemplateOrdinalMap.put("templates/CSS/templateBootstrap-datepicker3.standalone.jet", //$NON-NLS-1$
                Integer.valueOf(3));
        pathToTemplateOrdinalMap.put("templates/CSS/templateBootstrap-table.jet", //$NON-NLS-1$
                Integer.valueOf(4));
        pathToTemplateOrdinalMap.put("templates/CSS/templateBootstrap-theme.css.map.jet", //$NON-NLS-1$
                Integer.valueOf(5));
        pathToTemplateOrdinalMap.put("templates/CSS/templateBootstrap-theme.jet", //$NON-NLS-1$
                Integer.valueOf(6));
        pathToTemplateOrdinalMap.put("templates/CSS/templateBootstrap-theme.min.jet", //$NON-NLS-1$
                Integer.valueOf(7));
        pathToTemplateOrdinalMap.put("templates/CSS/templateBootstrap.css.map.jet", //$NON-NLS-1$
                Integer.valueOf(8));
        pathToTemplateOrdinalMap.put("templates/CSS/templateBootstrap.jet", //$NON-NLS-1$
                Integer.valueOf(9));
        pathToTemplateOrdinalMap.put("templates/CSS/templateBootstrap.min.jet", //$NON-NLS-1$
                Integer.valueOf(10));
        pathToTemplateOrdinalMap.put("templates/CSS/templateBootstrap2.jet", //$NON-NLS-1$
                Integer.valueOf(11));
        pathToTemplateOrdinalMap.put("templates/CSS/templateSticky-footer-navbar.jet", //$NON-NLS-1$
                Integer.valueOf(12));
        pathToTemplateOrdinalMap.put("templates/CSS/templateTheme.jet", //$NON-NLS-1$
                Integer.valueOf(13));
        pathToTemplateOrdinalMap.put("templates/JS/templateBootstrap-datepicker.jet", //$NON-NLS-1$
                Integer.valueOf(14));
        pathToTemplateOrdinalMap.put("templates/JS/templateBootstrap-table.jet", //$NON-NLS-1$
                Integer.valueOf(15));
        pathToTemplateOrdinalMap.put("templates/JS/templateBootstrap.jet", //$NON-NLS-1$
                Integer.valueOf(16));
        pathToTemplateOrdinalMap.put("templates/JS/templateBootstrap.min.jet", //$NON-NLS-1$
                Integer.valueOf(17));
        pathToTemplateOrdinalMap.put("templates/JS/templateIe-emulation-modes-warning.jet", //$NON-NLS-1$
                Integer.valueOf(18));
        pathToTemplateOrdinalMap.put("templates/JS/templateNpm.jet", //$NON-NLS-1$
                Integer.valueOf(19));
        pathToTemplateOrdinalMap.put("templates/main.jet", //$NON-NLS-1$
                Integer.valueOf(20));
        pathToTemplateOrdinalMap.put("templates/settings.jet", //$NON-NLS-1$
                Integer.valueOf(21));
        pathToTemplateOrdinalMap.put("templates/templateEntityActionDelete.jet", //$NON-NLS-1$
                Integer.valueOf(22));
        pathToTemplateOrdinalMap.put("templates/templateEntityActionSave.jet", //$NON-NLS-1$
                Integer.valueOf(23));
        pathToTemplateOrdinalMap.put("templates/templateEntityClass.jet", //$NON-NLS-1$
                Integer.valueOf(24));
        pathToTemplateOrdinalMap.put("templates/templateEntityClassDB.jet", //$NON-NLS-1$
                Integer.valueOf(25));
        pathToTemplateOrdinalMap.put("templates/templateEntityJS.jet", //$NON-NLS-1$
                Integer.valueOf(26));
        pathToTemplateOrdinalMap.put("templates/templateEntityRelationship.jet", //$NON-NLS-1$
                Integer.valueOf(27));
        pathToTemplateOrdinalMap.put("templates/templateForm.jet", //$NON-NLS-1$
                Integer.valueOf(28));
        pathToTemplateOrdinalMap.put("templates/templateFormNewEntityOnly.jet", //$NON-NLS-1$
                Integer.valueOf(29));
        pathToTemplateOrdinalMap.put("templates/templateFormReport.jet", //$NON-NLS-1$
                Integer.valueOf(30));
        pathToTemplateOrdinalMap.put("templates/templateHtml.jet", //$NON-NLS-1$
                Integer.valueOf(31));
        pathToTemplateOrdinalMap.put("templates/templateSql.jet", //$NON-NLS-1$
                Integer.valueOf(32));
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
            case 4: // templates/CSS/templateBootstrap-table.jet
                return new gerador.compiled._jet_templateBootstraptable(templatePath);
            case 5: // templates/CSS/templateBootstrap-theme.css.map.jet
                return new gerador.compiled._jet_templateBootstrapthemecssmap(templatePath);
            case 6: // templates/CSS/templateBootstrap-theme.jet
                return new gerador.compiled._jet_templateBootstraptheme(templatePath);
            case 7: // templates/CSS/templateBootstrap-theme.min.jet
                return new gerador.compiled._jet_templateBootstrapthememin(templatePath);
            case 8: // templates/CSS/templateBootstrap.css.map.jet
                return new gerador.compiled._jet_templateBootstrapcssmap(templatePath);
            case 9: // templates/CSS/templateBootstrap.jet
                return new gerador.compiled._jet_templateBootstrap_0(templatePath);
            case 10: // templates/CSS/templateBootstrap.min.jet
                return new gerador.compiled._jet_templateBootstrapmin_0(templatePath);
            case 11: // templates/CSS/templateBootstrap2.jet
                return new gerador.compiled._jet_templateBootstrap2(templatePath);
            case 12: // templates/CSS/templateSticky-footer-navbar.jet
                return new gerador.compiled._jet_templateStickyfooternavbar(templatePath);
            case 13: // templates/CSS/templateTheme.jet
                return new gerador.compiled._jet_templateTheme(templatePath);
            case 14: // templates/JS/templateBootstrap-datepicker.jet
                return new gerador.compiled._jet_templateBootstrapdatepicker_0(templatePath);
            case 15: // templates/JS/templateBootstrap-table.jet
                return new gerador.compiled._jet_templateBootstraptable_0(templatePath);
            case 16: // templates/JS/templateBootstrap.jet
                return new gerador.compiled._jet_templateBootstrap(templatePath);
            case 17: // templates/JS/templateBootstrap.min.jet
                return new gerador.compiled._jet_templateBootstrapmin(templatePath);
            case 18: // templates/JS/templateIe-emulation-modes-warning.jet
                return new gerador.compiled._jet_templateIeemulationmodeswarning(templatePath);
            case 19: // templates/JS/templateNpm.jet
                return new gerador.compiled._jet_templateNpm(templatePath);
            case 20: // templates/main.jet
                return new gerador.compiled._jet_main(templatePath);
            case 21: // templates/settings.jet
                return new gerador.compiled._jet_settings(templatePath);
            case 22: // templates/templateEntityActionDelete.jet
                return new gerador.compiled._jet_templateEntityActionDelete(templatePath);
            case 23: // templates/templateEntityActionSave.jet
                return new gerador.compiled._jet_templateEntityActionSave(templatePath);
            case 24: // templates/templateEntityClass.jet
                return new gerador.compiled._jet_templateEntityClass(templatePath);
            case 25: // templates/templateEntityClassDB.jet
                return new gerador.compiled._jet_templateEntityClassDB(templatePath);
            case 26: // templates/templateEntityJS.jet
                return new gerador.compiled._jet_templateEntityJS(templatePath);
            case 27: // templates/templateEntityRelationship.jet
                return new gerador.compiled._jet_templateEntityRelationship(templatePath);
            case 28: // templates/templateForm.jet
                return new gerador.compiled._jet_templateForm(templatePath);
            case 29: // templates/templateFormNewEntityOnly.jet
                return new gerador.compiled._jet_templateFormNewEntityOnly(templatePath);
            case 30: // templates/templateFormReport.jet
                return new gerador.compiled._jet_templateFormReport(templatePath);
            case 31: // templates/templateHtml.jet
                return new gerador.compiled._jet_templateHtml(templatePath);
            case 32: // templates/templateSql.jet
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
