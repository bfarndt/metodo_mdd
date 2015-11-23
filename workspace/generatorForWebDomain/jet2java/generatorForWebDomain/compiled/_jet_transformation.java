package generatorForWebDomain.compiled;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2TemplateLoader;
import org.eclipse.jet.JET2TemplateLoaderExtension;

public class _jet_transformation implements JET2TemplateLoader,
        JET2TemplateLoaderExtension {

    private JET2TemplateLoader delegate = null;

    private final static Map<String, Integer> pathToTemplateOrdinalMap = new HashMap<String,Integer>(36);
    static {
        pathToTemplateOrdinalMap.put("templates/main.jet", //$NON-NLS-1$
                Integer.valueOf(0));
        pathToTemplateOrdinalMap.put("templates/navigation/generatePages.jet", //$NON-NLS-1$
                Integer.valueOf(1));
        pathToTemplateOrdinalMap.put("templates/navigation/pages/components.jet", //$NON-NLS-1$
                Integer.valueOf(2));
        pathToTemplateOrdinalMap.put("templates/navigation/pages/page.jsp.jet", //$NON-NLS-1$
                Integer.valueOf(3));
        pathToTemplateOrdinalMap.put("templates/navigation/pages/uploadUserCommentForm.jsp.jet", //$NON-NLS-1$
                Integer.valueOf(4));
        pathToTemplateOrdinalMap.put("templates/navigation/pages/userContent.jet", //$NON-NLS-1$
                Integer.valueOf(5));
        pathToTemplateOrdinalMap.put("templates/persistence/actions/classes/ActionClass.java.jet", //$NON-NLS-1$
                Integer.valueOf(6));
        pathToTemplateOrdinalMap.put("templates/persistence/actions/generateActions.jet", //$NON-NLS-1$
                Integer.valueOf(7));
        pathToTemplateOrdinalMap.put("templates/persistence/beans/classes/BeanClass.java.jet", //$NON-NLS-1$
                Integer.valueOf(8));
        pathToTemplateOrdinalMap.put("templates/persistence/beans/generateBeans.jet", //$NON-NLS-1$
                Integer.valueOf(9));
        pathToTemplateOrdinalMap.put("templates/persistence/common/common.jet", //$NON-NLS-1$
                Integer.valueOf(10));
        pathToTemplateOrdinalMap.put("templates/persistence/daos/classes/DAOAbstractClass.java.jet", //$NON-NLS-1$
                Integer.valueOf(11));
        pathToTemplateOrdinalMap.put("templates/persistence/daos/classes/DAOAbstractFactory.java.jet", //$NON-NLS-1$
                Integer.valueOf(12));
        pathToTemplateOrdinalMap.put("templates/persistence/daos/classes/DefaultDAOFactoryProvider.java.jet", //$NON-NLS-1$
                Integer.valueOf(13));
        pathToTemplateOrdinalMap.put("templates/persistence/daos/derby/classes/DerbyDAOClass.java.jet", //$NON-NLS-1$
                Integer.valueOf(14));
        pathToTemplateOrdinalMap.put("templates/persistence/daos/derby/classes/DerbyDAOFactory.java.jet", //$NON-NLS-1$
                Integer.valueOf(15));
        pathToTemplateOrdinalMap.put("templates/persistence/daos/derby/generateDerbyDAOs.jet", //$NON-NLS-1$
                Integer.valueOf(16));
        pathToTemplateOrdinalMap.put("templates/persistence/daos/derby/sql/createDerby.sql.jet", //$NON-NLS-1$
                Integer.valueOf(17));
        pathToTemplateOrdinalMap.put("templates/persistence/daos/derby/sql/generateDerbyScript.jet", //$NON-NLS-1$
                Integer.valueOf(18));
        pathToTemplateOrdinalMap.put("templates/persistence/daos/generateDAOs.jet", //$NON-NLS-1$
                Integer.valueOf(19));
        pathToTemplateOrdinalMap.put("templates/persistence/forms/generateForms.jet", //$NON-NLS-1$
                Integer.valueOf(20));
        pathToTemplateOrdinalMap.put("templates/persistence/forms/pages/editpage.jsp.jet", //$NON-NLS-1$
                Integer.valueOf(21));
        pathToTemplateOrdinalMap.put("templates/persistence/forms/pages/jspf/adminPrefix.jspf.jet", //$NON-NLS-1$
                Integer.valueOf(22));
        pathToTemplateOrdinalMap.put("templates/persistence/forms/pages/jspf/adminSuffix.jspf.jet", //$NON-NLS-1$
                Integer.valueOf(23));
        pathToTemplateOrdinalMap.put("templates/persistence/forms/pages/listpage.jsp.jet", //$NON-NLS-1$
                Integer.valueOf(24));
        pathToTemplateOrdinalMap.put("templates/persistence/resources/files/messages.properties.jet", //$NON-NLS-1$
                Integer.valueOf(25));
        pathToTemplateOrdinalMap.put("templates/persistence/resources/generateResources.jet", //$NON-NLS-1$
                Integer.valueOf(26));
        pathToTemplateOrdinalMap.put("templates/userContent/files/DefaultUserContentDAOFactoryProvider.java.jet", //$NON-NLS-1$
                Integer.valueOf(27));
        pathToTemplateOrdinalMap.put("templates/userContent/files/DerbyUserContentDAO.java.jet", //$NON-NLS-1$
                Integer.valueOf(28));
        pathToTemplateOrdinalMap.put("templates/userContent/files/DerbyUserContentDAOFactory.java.jet", //$NON-NLS-1$
                Integer.valueOf(29));
        pathToTemplateOrdinalMap.put("templates/userContent/files/UserContent.java.jet", //$NON-NLS-1$
                Integer.valueOf(30));
        pathToTemplateOrdinalMap.put("templates/userContent/files/UserContentActions.java.jet", //$NON-NLS-1$
                Integer.valueOf(31));
        pathToTemplateOrdinalMap.put("templates/userContent/files/UserContentDAO.java.jet", //$NON-NLS-1$
                Integer.valueOf(32));
        pathToTemplateOrdinalMap.put("templates/userContent/files/UserContentDAOAbstractFactory.java.jet", //$NON-NLS-1$
                Integer.valueOf(33));
        pathToTemplateOrdinalMap.put("templates/userContent/files/moderation.jsp.jet", //$NON-NLS-1$
                Integer.valueOf(34));
        pathToTemplateOrdinalMap.put("templates/userContent/generateUserContent.jet", //$NON-NLS-1$
                Integer.valueOf(35));
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
            case 0: // templates/main.jet
                return new generatorForWebDomain.compiled._jet_main(templatePath);
            case 1: // templates/navigation/generatePages.jet
                return new generatorForWebDomain.compiled._jet_generatePages(templatePath);
            case 2: // templates/navigation/pages/components.jet
                return new generatorForWebDomain.compiled._jet_components(templatePath);
            case 3: // templates/navigation/pages/page.jsp.jet
                return new generatorForWebDomain.compiled._jet_pagejsp(templatePath);
            case 4: // templates/navigation/pages/uploadUserCommentForm.jsp.jet
                return new generatorForWebDomain.compiled._jet_uploadUserCommentFormjsp(templatePath);
            case 5: // templates/navigation/pages/userContent.jet
                return new generatorForWebDomain.compiled._jet_userContent(templatePath);
            case 6: // templates/persistence/actions/classes/ActionClass.java.jet
                return new generatorForWebDomain.compiled._jet_ActionClassjava(templatePath);
            case 7: // templates/persistence/actions/generateActions.jet
                return new generatorForWebDomain.compiled._jet_generateActions(templatePath);
            case 8: // templates/persistence/beans/classes/BeanClass.java.jet
                return new generatorForWebDomain.compiled._jet_BeanClassjava(templatePath);
            case 9: // templates/persistence/beans/generateBeans.jet
                return new generatorForWebDomain.compiled._jet_generateBeans(templatePath);
            case 10: // templates/persistence/common/common.jet
                return new generatorForWebDomain.compiled._jet_common(templatePath);
            case 11: // templates/persistence/daos/classes/DAOAbstractClass.java.jet
                return new generatorForWebDomain.compiled._jet_DAOAbstractClassjava(templatePath);
            case 12: // templates/persistence/daos/classes/DAOAbstractFactory.java.jet
                return new generatorForWebDomain.compiled._jet_DAOAbstractFactoryjava(templatePath);
            case 13: // templates/persistence/daos/classes/DefaultDAOFactoryProvider.java.jet
                return new generatorForWebDomain.compiled._jet_DefaultDAOFactoryProviderjava(templatePath);
            case 14: // templates/persistence/daos/derby/classes/DerbyDAOClass.java.jet
                return new generatorForWebDomain.compiled._jet_DerbyDAOClassjava(templatePath);
            case 15: // templates/persistence/daos/derby/classes/DerbyDAOFactory.java.jet
                return new generatorForWebDomain.compiled._jet_DerbyDAOFactoryjava(templatePath);
            case 16: // templates/persistence/daos/derby/generateDerbyDAOs.jet
                return new generatorForWebDomain.compiled._jet_generateDerbyDAOs(templatePath);
            case 17: // templates/persistence/daos/derby/sql/createDerby.sql.jet
                return new generatorForWebDomain.compiled._jet_createDerbysql(templatePath);
            case 18: // templates/persistence/daos/derby/sql/generateDerbyScript.jet
                return new generatorForWebDomain.compiled._jet_generateDerbyScript(templatePath);
            case 19: // templates/persistence/daos/generateDAOs.jet
                return new generatorForWebDomain.compiled._jet_generateDAOs(templatePath);
            case 20: // templates/persistence/forms/generateForms.jet
                return new generatorForWebDomain.compiled._jet_generateForms(templatePath);
            case 21: // templates/persistence/forms/pages/editpage.jsp.jet
                return new generatorForWebDomain.compiled._jet_editpagejsp(templatePath);
            case 22: // templates/persistence/forms/pages/jspf/adminPrefix.jspf.jet
                return new generatorForWebDomain.compiled._jet_adminPrefixjspf(templatePath);
            case 23: // templates/persistence/forms/pages/jspf/adminSuffix.jspf.jet
                return new generatorForWebDomain.compiled._jet_adminSuffixjspf(templatePath);
            case 24: // templates/persistence/forms/pages/listpage.jsp.jet
                return new generatorForWebDomain.compiled._jet_listpagejsp(templatePath);
            case 25: // templates/persistence/resources/files/messages.properties.jet
                return new generatorForWebDomain.compiled._jet_messagesproperties(templatePath);
            case 26: // templates/persistence/resources/generateResources.jet
                return new generatorForWebDomain.compiled._jet_generateResources(templatePath);
            case 27: // templates/userContent/files/DefaultUserContentDAOFactoryProvider.java.jet
                return new generatorForWebDomain.compiled._jet_DefaultUserContentDAOFactoryProviderjava(templatePath);
            case 28: // templates/userContent/files/DerbyUserContentDAO.java.jet
                return new generatorForWebDomain.compiled._jet_DerbyUserContentDAOjava(templatePath);
            case 29: // templates/userContent/files/DerbyUserContentDAOFactory.java.jet
                return new generatorForWebDomain.compiled._jet_DerbyUserContentDAOFactoryjava(templatePath);
            case 30: // templates/userContent/files/UserContent.java.jet
                return new generatorForWebDomain.compiled._jet_UserContentjava(templatePath);
            case 31: // templates/userContent/files/UserContentActions.java.jet
                return new generatorForWebDomain.compiled._jet_UserContentActionsjava(templatePath);
            case 32: // templates/userContent/files/UserContentDAO.java.jet
                return new generatorForWebDomain.compiled._jet_UserContentDAOjava(templatePath);
            case 33: // templates/userContent/files/UserContentDAOAbstractFactory.java.jet
                return new generatorForWebDomain.compiled._jet_UserContentDAOAbstractFactoryjava(templatePath);
            case 34: // templates/userContent/files/moderation.jsp.jet
                return new generatorForWebDomain.compiled._jet_moderationjsp(templatePath);
            case 35: // templates/userContent/generateUserContent.jet
                return new generatorForWebDomain.compiled._jet_generateUserContent(templatePath);
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
