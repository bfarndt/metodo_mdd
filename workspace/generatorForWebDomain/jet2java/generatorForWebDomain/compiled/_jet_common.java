package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_common implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_f = "org.eclipse.jet.formatTags"; //$NON-NLS-1$

    public _jet_common(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_2_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            2, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/WebDomainAdministrationModel/configuration", //$NON-NLS-1$
                "theConfiguration", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_5_1 = new TagInfo("c:set", //$NON-NLS-1$
            5, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration", //$NON-NLS-1$
                "beansPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_55 = new TagInfo("c:get", //$NON-NLS-1$
            5, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@package", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_6_1 = new TagInfo("c:set", //$NON-NLS-1$
            6, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration", //$NON-NLS-1$
                "actionsPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_57 = new TagInfo("c:get", //$NON-NLS-1$
            6, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@package", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_7_1 = new TagInfo("c:set", //$NON-NLS-1$
            7, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration", //$NON-NLS-1$
                "resourcesPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_59 = new TagInfo("c:get", //$NON-NLS-1$
            7, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@package", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_8_1 = new TagInfo("c:set", //$NON-NLS-1$
            8, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration", //$NON-NLS-1$
                "daosPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_54 = new TagInfo("c:get", //$NON-NLS-1$
            8, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@package", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_9_1 = new TagInfo("c:set", //$NON-NLS-1$
            9, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration", //$NON-NLS-1$
                "daoAbstractFactoryClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_10_1 = new TagInfo("c:set", //$NON-NLS-1$
            10, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration", //$NON-NLS-1$
                "daoAbstractFactoryFullName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_69 = new TagInfo("c:get", //$NON-NLS-1$
            10, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@daosPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_119 = new TagInfo("c:get", //$NON-NLS-1$
            10, 119,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@daoAbstractFactoryClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_11_1 = new TagInfo("c:set", //$NON-NLS-1$
            11, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration", //$NON-NLS-1$
                "defaultDAOFactoryProviderClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_13_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            13, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/WebDomainAdministrationModel/userTypes", //$NON-NLS-1$
                "userType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_15_2 = new TagInfo("c:set", //$NON-NLS-1$
            15, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$userType", //$NON-NLS-1$
                "fullBeanName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_48 = new TagInfo("c:get", //$NON-NLS-1$
            15, 48,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@beansPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_99 = new TagInfo("c:get", //$NON-NLS-1$
            15, 99,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_17_2 = new TagInfo("c:set", //$NON-NLS-1$
            17, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$userType", //$NON-NLS-1$
                "actionClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_47 = new TagInfo("c:get", //$NON-NLS-1$
            17, 47,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_18_2 = new TagInfo("c:set", //$NON-NLS-1$
            18, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$userType", //$NON-NLS-1$
                "actionClassFullPath", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_55 = new TagInfo("c:get", //$NON-NLS-1$
            18, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@actionsPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_108 = new TagInfo("c:get", //$NON-NLS-1$
            18, 108,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@actionClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_19_2 = new TagInfo("c:set", //$NON-NLS-1$
            19, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$userType", //$NON-NLS-1$
                "saveAction", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_50 = new TagInfo("c:get", //$NON-NLS-1$
            19, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_20_2 = new TagInfo("c:set", //$NON-NLS-1$
            20, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$userType", //$NON-NLS-1$
                "deleteAction", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_54 = new TagInfo("c:get", //$NON-NLS-1$
            20, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_21_2 = new TagInfo("c:set", //$NON-NLS-1$
            21, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$userType", //$NON-NLS-1$
                "loadFormAction", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_54 = new TagInfo("c:get", //$NON-NLS-1$
            21, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_22_2 = new TagInfo("c:set", //$NON-NLS-1$
            22, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$userType", //$NON-NLS-1$
                "showAllAction", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_56 = new TagInfo("c:get", //$NON-NLS-1$
            22, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_23_5 = new TagInfo("c:set", //$NON-NLS-1$
            23, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$userType", //$NON-NLS-1$
                "showAllForSelectionAction", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_71 = new TagInfo("c:get", //$NON-NLS-1$
            23, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_25_2 = new TagInfo("c:set", //$NON-NLS-1$
            25, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$userType", //$NON-NLS-1$
                "daoClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_44 = new TagInfo("c:get", //$NON-NLS-1$
            25, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_26_2 = new TagInfo("c:set", //$NON-NLS-1$
            26, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$userType", //$NON-NLS-1$
                "fullDaoClassName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_52 = new TagInfo("c:get", //$NON-NLS-1$
            26, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@daosPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_102 = new TagInfo("c:get", //$NON-NLS-1$
            26, 102,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@daoClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_28_2 = new TagInfo("c:set", //$NON-NLS-1$
            28, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$userType", //$NON-NLS-1$
                "idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_28_43 = new TagInfo("f:lc", //$NON-NLS-1$
            28, 43,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_60 = new TagInfo("c:get", //$NON-NLS-1$
            28, 60,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_29_2 = new TagInfo("c:set", //$NON-NLS-1$
            29, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$userType", //$NON-NLS-1$
                "idFieldType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_30_2 = new TagInfo("c:set", //$NON-NLS-1$
            30, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$userType", //$NON-NLS-1$
                "idFieldTypeFromStringMethod", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_31_2 = new TagInfo("c:set", //$NON-NLS-1$
            31, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$userType", //$NON-NLS-1$
                "idFieldTypeResultSetGetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_32_2 = new TagInfo("c:set", //$NON-NLS-1$
            32, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$userType", //$NON-NLS-1$
                "idFieldTypePreparedStatementSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_33_2 = new TagInfo("c:set", //$NON-NLS-1$
            33, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$userType", //$NON-NLS-1$
                "idFieldSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_33_52 = new TagInfo("f:uc", //$NON-NLS-1$
            33, 52,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_69 = new TagInfo("c:get", //$NON-NLS-1$
            33, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_34_2 = new TagInfo("c:set", //$NON-NLS-1$
            34, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$userType", //$NON-NLS-1$
                "idFieldGetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_34_52 = new TagInfo("f:uc", //$NON-NLS-1$
            34, 52,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_69 = new TagInfo("c:get", //$NON-NLS-1$
            34, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_36_2 = new TagInfo("c:set", //$NON-NLS-1$
            36, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$userType", //$NON-NLS-1$
                "instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_36_48 = new TagInfo("f:lc", //$NON-NLS-1$
            36, 48,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_65 = new TagInfo("c:get", //$NON-NLS-1$
            36, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_38_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            38, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/attributes", //$NON-NLS-1$
                "attribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_39_9 = new TagInfo("c:if", //$NON-NLS-1$
            39, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldType = 'IMAGE'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_addElement_40_13 = new TagInfo("c:addElement", //$NON-NLS-1$
            40, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType", //$NON-NLS-1$
                "attributes", //$NON-NLS-1$
                "newAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_41_13 = new TagInfo("c:set", //$NON-NLS-1$
            41, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$newAttribute", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_55 = new TagInfo("c:get", //$NON-NLS-1$
            41, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_42_13 = new TagInfo("c:set", //$NON-NLS-1$
            42, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$newAttribute", //$NON-NLS-1$
                "fieldSize", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_43_13 = new TagInfo("c:set", //$NON-NLS-1$
            43, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$newAttribute", //$NON-NLS-1$
                "isImageContentType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_49_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            49, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/WebDomainAdministrationModel/userTypes", //$NON-NLS-1$
                "userType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_50_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            50, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/attributes", //$NON-NLS-1$
                "anAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_52_3 = new TagInfo("c:set", //$NON-NLS-1$
            52, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute", //$NON-NLS-1$
                "javaSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_52_53 = new TagInfo("f:uc", //$NON-NLS-1$
            52, 53,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_70 = new TagInfo("c:get", //$NON-NLS-1$
            52, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_53_3 = new TagInfo("c:set", //$NON-NLS-1$
            53, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute", //$NON-NLS-1$
                "javaGetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_53_53 = new TagInfo("f:uc", //$NON-NLS-1$
            53, 53,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_70 = new TagInfo("c:get", //$NON-NLS-1$
            53, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_54_3 = new TagInfo("c:set", //$NON-NLS-1$
            54, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute", //$NON-NLS-1$
                "javaType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_55_3 = new TagInfo("c:set", //$NON-NLS-1$
            55, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute", //$NON-NLS-1$
                "resultSetTypeGetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_56_3 = new TagInfo("c:set", //$NON-NLS-1$
            56, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute", //$NON-NLS-1$
                "preparedStatementTypeSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_57_3 = new TagInfo("c:if", //$NON-NLS-1$
            57, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@fieldType = 'DATE'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_58_4 = new TagInfo("c:set", //$NON-NLS-1$
            58, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute", //$NON-NLS-1$
                "javaType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_59_4 = new TagInfo("c:set", //$NON-NLS-1$
            59, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute", //$NON-NLS-1$
                "resultSetTypeGetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_60_4 = new TagInfo("c:set", //$NON-NLS-1$
            60, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute", //$NON-NLS-1$
                "preparedStatementTypeSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_62_9 = new TagInfo("c:if", //$NON-NLS-1$
            62, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@fieldType = 'IMAGE'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_63_13 = new TagInfo("c:set", //$NON-NLS-1$
            63, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute", //$NON-NLS-1$
                "javaType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_64_13 = new TagInfo("c:set", //$NON-NLS-1$
            64, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute", //$NON-NLS-1$
                "resultSetTypeGetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_65_13 = new TagInfo("c:set", //$NON-NLS-1$
            65, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute", //$NON-NLS-1$
                "resultSetTypeGetterForceCast", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_66_13 = new TagInfo("c:set", //$NON-NLS-1$
            66, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute", //$NON-NLS-1$
                "preparedStatementTypeSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_68_9 = new TagInfo("c:if", //$NON-NLS-1$
            68, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@fieldType = 'INT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_69_13 = new TagInfo("c:set", //$NON-NLS-1$
            69, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute", //$NON-NLS-1$
                "javaType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_70_13 = new TagInfo("c:set", //$NON-NLS-1$
            70, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute", //$NON-NLS-1$
                "resultSetTypeGetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_71_13 = new TagInfo("c:set", //$NON-NLS-1$
            71, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute", //$NON-NLS-1$
                "preparedStatementTypeSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_73_9 = new TagInfo("c:if", //$NON-NLS-1$
            73, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@fieldType = 'LONG'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_74_13 = new TagInfo("c:set", //$NON-NLS-1$
            74, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute", //$NON-NLS-1$
                "javaType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_75_13 = new TagInfo("c:set", //$NON-NLS-1$
            75, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute", //$NON-NLS-1$
                "resultSetTypeGetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_76_13 = new TagInfo("c:set", //$NON-NLS-1$
            76, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute", //$NON-NLS-1$
                "preparedStatementTypeSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_78_9 = new TagInfo("c:if", //$NON-NLS-1$
            78, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@fieldType = 'REAL'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_79_13 = new TagInfo("c:set", //$NON-NLS-1$
            79, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute", //$NON-NLS-1$
                "javaType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_80_13 = new TagInfo("c:set", //$NON-NLS-1$
            80, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute", //$NON-NLS-1$
                "resultSetTypeGetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_81_13 = new TagInfo("c:set", //$NON-NLS-1$
            81, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute", //$NON-NLS-1$
                "preparedStatementTypeSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_83_9 = new TagInfo("c:if", //$NON-NLS-1$
            83, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@fieldType = 'CURRENCY'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_84_13 = new TagInfo("c:set", //$NON-NLS-1$
            84, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute", //$NON-NLS-1$
                "javaType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_85_13 = new TagInfo("c:set", //$NON-NLS-1$
            85, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute", //$NON-NLS-1$
                "resultSetTypeGetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_86_13 = new TagInfo("c:set", //$NON-NLS-1$
            86, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute", //$NON-NLS-1$
                "preparedStatementTypeSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_89_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            89, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/referenceList", //$NON-NLS-1$
                "aReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_90_3 = new TagInfo("c:set", //$NON-NLS-1$
            90, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$aReference", //$NON-NLS-1$
                "javaSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_90_52 = new TagInfo("f:uc", //$NON-NLS-1$
            90, 52,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_90_69 = new TagInfo("c:get", //$NON-NLS-1$
            90, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_91_3 = new TagInfo("c:set", //$NON-NLS-1$
            91, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$aReference", //$NON-NLS-1$
                "javaGetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_91_52 = new TagInfo("f:uc", //$NON-NLS-1$
            91, 52,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_91_69 = new TagInfo("c:get", //$NON-NLS-1$
            91, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_92_3 = new TagInfo("c:set", //$NON-NLS-1$
            92, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$aReference", //$NON-NLS-1$
                "javaType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_92_47 = new TagInfo("c:get", //$NON-NLS-1$
            92, 47,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/referencedType/@fullBeanName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_97_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            97, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/WebDomainAdministrationModel/userTypes", //$NON-NLS-1$
                "userType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_98_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            98, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/attributes", //$NON-NLS-1$
                "anAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_99_3 = new TagInfo("c:set", //$NON-NLS-1$
            99, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute", //$NON-NLS-1$
                "messageKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_99_50 = new TagInfo("c:get", //$NON-NLS-1$
            99, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@fullBeanName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_99_93 = new TagInfo("c:get", //$NON-NLS-1$
            99, 93,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_101_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            101, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/referenceList", //$NON-NLS-1$
                "aReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_102_9 = new TagInfo("c:set", //$NON-NLS-1$
            102, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$aReference", //$NON-NLS-1$
                "messageKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_102_55 = new TagInfo("c:get", //$NON-NLS-1$
            102, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@fullBeanName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_102_98 = new TagInfo("c:get", //$NON-NLS-1$
            102, 98,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_107_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            107, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/WebDomainAdministrationModel/userTypes", //$NON-NLS-1$
                "userType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_108_2 = new TagInfo("c:set", //$NON-NLS-1$
            108, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$userType", //$NON-NLS-1$
                "editPagePath", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_108_48 = new TagInfo("c:get", //$NON-NLS-1$
            108, 48,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@webpath", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_108_98 = new TagInfo("c:get", //$NON-NLS-1$
            108, 98,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_109_5 = new TagInfo("c:set", //$NON-NLS-1$
            109, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$userType", //$NON-NLS-1$
                "listPagePath", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_109_51 = new TagInfo("c:get", //$NON-NLS-1$
            109, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@webpath", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_109_101 = new TagInfo("c:get", //$NON-NLS-1$
            109, 101,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        // Set configuration variable 
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(36);
        out.write(NL);         
        out.setTag("setVariable",37,130);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(93);
        RuntimeTagElement _jettag_c_setVariable_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_2_1.setRuntimeParent(null);
        _jettag_c_setVariable_2_1.setTagInfo(_td_c_setVariable_2_1);
        _jettag_c_setVariable_2_1.doStart(context, out);
        _jettag_c_setVariable_2_1.doEnd();
        out.setTag(null,-1,-1);
        out.write(NL);         
        out.write(NL);         
        // Set main packages 
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(27);
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(54);
        out.setTag("set",160,214);
        RuntimeTagElement _jettag_c_set_5_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_5_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_5_1.setRuntimeParent(null);
        _jettag_c_set_5_1.setTagInfo(_td_c_set_5_1);
        _jettag_c_set_5_1.doStart(context, out);
        JET2Writer _jettag_c_set_5_1_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_c_set_5_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",214,259);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(45);
            RuntimeTagElement _jettag_c_get_5_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_55); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_5_55.setRuntimeParent(_jettag_c_set_5_1);
            _jettag_c_get_5_55.setTagInfo(_td_c_get_5_55);
            _jettag_c_get_5_55.doStart(context, out);
            _jettag_c_get_5_55.doEnd();
            out.setTag(null,-1,-1);
            out.write(".beans");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_set_5_1.handleBodyContent(out);
        }
        out = _jettag_c_set_5_1_saved_out;
out.bodyContentEnd();
        _jettag_c_set_5_1.doEnd();
        out.endTag("set",51);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(8);
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(56);
        out.setTag("set",274,330);
        RuntimeTagElement _jettag_c_set_6_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_6_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_6_1.setRuntimeParent(null);
        _jettag_c_set_6_1.setTagInfo(_td_c_set_6_1);
        _jettag_c_set_6_1.doStart(context, out);
        JET2Writer _jettag_c_set_6_1_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_c_set_6_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",330,375);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(45);
            RuntimeTagElement _jettag_c_get_6_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_57); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_6_57.setRuntimeParent(_jettag_c_set_6_1);
            _jettag_c_get_6_57.setTagInfo(_td_c_get_6_57);
            _jettag_c_get_6_57.doStart(context, out);
            _jettag_c_get_6_57.doEnd();
            out.setTag(null,-1,-1);
            out.write(".actions");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_set_6_1.handleBodyContent(out);
        }
        out = _jettag_c_set_6_1_saved_out;
out.bodyContentEnd();
        _jettag_c_set_6_1.doEnd();
        out.endTag("set",53);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(8);
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(58);
        out.setTag("set",392,450);
        RuntimeTagElement _jettag_c_set_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_7_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_7_1.setRuntimeParent(null);
        _jettag_c_set_7_1.setTagInfo(_td_c_set_7_1);
        _jettag_c_set_7_1.doStart(context, out);
        JET2Writer _jettag_c_set_7_1_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_c_set_7_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",450,495);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(45);
            RuntimeTagElement _jettag_c_get_7_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_59); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_7_59.setRuntimeParent(_jettag_c_set_7_1);
            _jettag_c_get_7_59.setTagInfo(_td_c_get_7_59);
            _jettag_c_get_7_59.doStart(context, out);
            _jettag_c_get_7_59.doEnd();
            out.setTag(null,-1,-1);
            out.write(".resources");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_set_7_1.handleBodyContent(out);
        }
        out = _jettag_c_set_7_1_saved_out;
out.bodyContentEnd();
        _jettag_c_set_7_1.doEnd();
        out.endTag("set",55);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(8);
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(53);
        out.setTag("set",514,567);
        RuntimeTagElement _jettag_c_set_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_8_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_8_1.setRuntimeParent(null);
        _jettag_c_set_8_1.setTagInfo(_td_c_set_8_1);
        _jettag_c_set_8_1.doStart(context, out);
        JET2Writer _jettag_c_set_8_1_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_c_set_8_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",567,612);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(45);
            RuntimeTagElement _jettag_c_get_8_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_54); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_8_54.setRuntimeParent(_jettag_c_set_8_1);
            _jettag_c_get_8_54.setTagInfo(_td_c_get_8_54);
            _jettag_c_get_8_54.doStart(context, out);
            _jettag_c_get_8_54.doEnd();
            out.setTag(null,-1,-1);
            out.write(".daos");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_set_8_1.handleBodyContent(out);
        }
        out = _jettag_c_set_8_1_saved_out;
out.bodyContentEnd();
        _jettag_c_set_8_1.doEnd();
        out.endTag("set",50);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(8);
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(65);
        out.setTag("set",626,691);
        RuntimeTagElement _jettag_c_set_9_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_9_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_9_1.setRuntimeParent(null);
        _jettag_c_set_9_1.setTagInfo(_td_c_set_9_1);
        _jettag_c_set_9_1.doStart(context, out);
        JET2Writer _jettag_c_set_9_1_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_c_set_9_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("DAOAbstractFactory");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_set_9_1.handleBodyContent(out);
        }
        out = _jettag_c_set_9_1_saved_out;
out.bodyContentEnd();
        _jettag_c_set_9_1.doEnd();
        out.endTag("set",18);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(8);
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(68);
        out.setTag("set",718,786);
        RuntimeTagElement _jettag_c_set_10_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_10_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_10_1.setRuntimeParent(null);
        _jettag_c_set_10_1.setTagInfo(_td_c_set_10_1);
        _jettag_c_set_10_1.doStart(context, out);
        JET2Writer _jettag_c_set_10_1_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_c_set_10_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",786,835);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(49);
            RuntimeTagElement _jettag_c_get_10_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_69); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_10_69.setRuntimeParent(_jettag_c_set_10_1);
            _jettag_c_get_10_69.setTagInfo(_td_c_get_10_69);
            _jettag_c_get_10_69.doStart(context, out);
            _jettag_c_get_10_69.doEnd();
            out.setTag(null,-1,-1);
            out.write(".");  //$NON-NLS-1$        
            out.setTag("get",836,897);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(61);
            RuntimeTagElement _jettag_c_get_10_119 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_119); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_10_119.setRuntimeParent(_jettag_c_set_10_1);
            _jettag_c_get_10_119.setTagInfo(_td_c_get_10_119);
            _jettag_c_get_10_119.doStart(context, out);
            _jettag_c_get_10_119.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_c_set_10_1.handleBodyContent(out);
        }
        out = _jettag_c_set_10_1_saved_out;
out.bodyContentEnd();
        _jettag_c_set_10_1.doEnd();
        out.endTag("set",111);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(8);
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(72);
        out.setTag("set",906,978);
        RuntimeTagElement _jettag_c_set_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_11_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_11_1.setRuntimeParent(null);
        _jettag_c_set_11_1.setTagInfo(_td_c_set_11_1);
        _jettag_c_set_11_1.doStart(context, out);
        JET2Writer _jettag_c_set_11_1_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_c_set_11_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("DefaultDAOFactoryProvider");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_set_11_1.handleBodyContent(out);
        }
        out = _jettag_c_set_11_1_saved_out;
out.bodyContentEnd();
        _jettag_c_set_11_1.doEnd();
        out.endTag("set",25);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(8);
        out.write(NL);         
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(75);
        out.setTag("iterate",1013,1088);
        RuntimeTagElement _jettag_c_iterate_13_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_13_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_13_1.setRuntimeParent(null);
        _jettag_c_iterate_13_1.setTagInfo(_td_c_iterate_13_1);
        _jettag_c_iterate_13_1.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_13_1.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_13_1.getTagInfo().getAttribute("delimiter"),1013,1088);
            out.loopIterate();
            out.write(NL);         
            // Set bean package and fully qualified bean name 
    // elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
    out.jump(56);
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(46);
            out.setTag("set",1147,1193);
            RuntimeTagElement _jettag_c_set_15_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_15_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_15_2.setRuntimeParent(_jettag_c_iterate_13_1);
            _jettag_c_set_15_2.setTagInfo(_td_c_set_15_2);
            _jettag_c_set_15_2.doStart(context, out);
            JET2Writer _jettag_c_set_15_2_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_c_set_15_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.setTag("get",1193,1243);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(50);
                RuntimeTagElement _jettag_c_get_15_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_48); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_15_48.setRuntimeParent(_jettag_c_set_15_2);
                _jettag_c_get_15_48.setTagInfo(_td_c_get_15_48);
                _jettag_c_get_15_48.doStart(context, out);
                _jettag_c_get_15_48.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",1244,1278);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(34);
                RuntimeTagElement _jettag_c_get_15_99 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_99); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_15_99.setRuntimeParent(_jettag_c_set_15_2);
                _jettag_c_get_15_99.setTagInfo(_td_c_get_15_99);
                _jettag_c_get_15_99.doStart(context, out);
                _jettag_c_get_15_99.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_c_set_15_2.handleBodyContent(out);
            }
            out = _jettag_c_set_15_2_saved_out;
    out.bodyContentEnd();
            _jettag_c_set_15_2.doEnd();
            out.endTag("set",85);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(8);
            out.write(NL);         
            // Set action names and fully qualified action names 
    // elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
    out.jump(59);
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(45);
            out.setTag("set",1348,1393);
            RuntimeTagElement _jettag_c_set_17_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_17_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_17_2.setRuntimeParent(_jettag_c_iterate_13_1);
            _jettag_c_set_17_2.setTagInfo(_td_c_set_17_2);
            _jettag_c_set_17_2.doStart(context, out);
            JET2Writer _jettag_c_set_17_2_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_c_set_17_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.setTag("get",1393,1427);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(34);
                RuntimeTagElement _jettag_c_get_17_47 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_47); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_17_47.setRuntimeParent(_jettag_c_set_17_2);
                _jettag_c_get_17_47.setTagInfo(_td_c_get_17_47);
                _jettag_c_get_17_47.doStart(context, out);
                _jettag_c_get_17_47.doEnd();
                out.setTag(null,-1,-1);
                out.write("Actions");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_set_17_2.handleBodyContent(out);
            }
            out = _jettag_c_set_17_2_saved_out;
    out.bodyContentEnd();
            _jettag_c_set_17_2.doEnd();
            out.endTag("set",41);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(8);
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(53);
            out.setTag("set",1444,1497);
            RuntimeTagElement _jettag_c_set_18_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_18_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_18_2.setRuntimeParent(_jettag_c_iterate_13_1);
            _jettag_c_set_18_2.setTagInfo(_td_c_set_18_2);
            _jettag_c_set_18_2.doStart(context, out);
            JET2Writer _jettag_c_set_18_2_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_c_set_18_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.setTag("get",1497,1549);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(52);
                RuntimeTagElement _jettag_c_get_18_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_18_55.setRuntimeParent(_jettag_c_set_18_2);
                _jettag_c_get_18_55.setTagInfo(_td_c_get_18_55);
                _jettag_c_get_18_55.doStart(context, out);
                _jettag_c_get_18_55.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",1550,1591);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(41);
                RuntimeTagElement _jettag_c_get_18_108 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_108); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_18_108.setRuntimeParent(_jettag_c_set_18_2);
                _jettag_c_get_18_108.setTagInfo(_td_c_get_18_108);
                _jettag_c_get_18_108.doStart(context, out);
                _jettag_c_get_18_108.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_c_set_18_2.handleBodyContent(out);
            }
            out = _jettag_c_set_18_2_saved_out;
    out.bodyContentEnd();
            _jettag_c_set_18_2.doEnd();
            out.endTag("set",94);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(8);
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(44);
            out.setTag("set",1601,1645);
            RuntimeTagElement _jettag_c_set_19_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_19_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_19_2.setRuntimeParent(_jettag_c_iterate_13_1);
            _jettag_c_set_19_2.setTagInfo(_td_c_set_19_2);
            _jettag_c_set_19_2.doStart(context, out);
            JET2Writer _jettag_c_set_19_2_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_c_set_19_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("save");  //$NON-NLS-1$        
                out.setTag("get",1649,1683);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(34);
                RuntimeTagElement _jettag_c_get_19_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_19_50.setRuntimeParent(_jettag_c_set_19_2);
                _jettag_c_get_19_50.setTagInfo(_td_c_get_19_50);
                _jettag_c_get_19_50.doStart(context, out);
                _jettag_c_get_19_50.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_c_set_19_2.handleBodyContent(out);
            }
            out = _jettag_c_set_19_2_saved_out;
    out.bodyContentEnd();
            _jettag_c_set_19_2.doEnd();
            out.endTag("set",38);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(8);
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(46);
            out.setTag("set",1693,1739);
            RuntimeTagElement _jettag_c_set_20_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_20_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_20_2.setRuntimeParent(_jettag_c_iterate_13_1);
            _jettag_c_set_20_2.setTagInfo(_td_c_set_20_2);
            _jettag_c_set_20_2.doStart(context, out);
            JET2Writer _jettag_c_set_20_2_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_c_set_20_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("delete");  //$NON-NLS-1$        
                out.setTag("get",1745,1779);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(34);
                RuntimeTagElement _jettag_c_get_20_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_54); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_20_54.setRuntimeParent(_jettag_c_set_20_2);
                _jettag_c_get_20_54.setTagInfo(_td_c_get_20_54);
                _jettag_c_get_20_54.doStart(context, out);
                _jettag_c_get_20_54.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_c_set_20_2.handleBodyContent(out);
            }
            out = _jettag_c_set_20_2_saved_out;
    out.bodyContentEnd();
            _jettag_c_set_20_2.doEnd();
            out.endTag("set",40);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(8);
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(48);
            out.setTag("set",1789,1837);
            RuntimeTagElement _jettag_c_set_21_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_21_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_21_2.setRuntimeParent(_jettag_c_iterate_13_1);
            _jettag_c_set_21_2.setTagInfo(_td_c_set_21_2);
            _jettag_c_set_21_2.doStart(context, out);
            JET2Writer _jettag_c_set_21_2_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_c_set_21_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("load");  //$NON-NLS-1$        
                out.setTag("get",1841,1875);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(34);
                RuntimeTagElement _jettag_c_get_21_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_54); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_21_54.setRuntimeParent(_jettag_c_set_21_2);
                _jettag_c_get_21_54.setTagInfo(_td_c_get_21_54);
                _jettag_c_get_21_54.doStart(context, out);
                _jettag_c_get_21_54.doEnd();
                out.setTag(null,-1,-1);
                out.write("Form");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_set_21_2.handleBodyContent(out);
            }
            out = _jettag_c_set_21_2_saved_out;
    out.bodyContentEnd();
            _jettag_c_set_21_2.doEnd();
            out.endTag("set",42);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(8);
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(47);
            out.setTag("set",1889,1936);
            RuntimeTagElement _jettag_c_set_22_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_22_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_22_2.setRuntimeParent(_jettag_c_iterate_13_1);
            _jettag_c_set_22_2.setTagInfo(_td_c_set_22_2);
            _jettag_c_set_22_2.doStart(context, out);
            JET2Writer _jettag_c_set_22_2_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_c_set_22_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("showAll");  //$NON-NLS-1$        
                out.setTag("get",1943,1977);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(34);
                RuntimeTagElement _jettag_c_get_22_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_56); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_22_56.setRuntimeParent(_jettag_c_set_22_2);
                _jettag_c_get_22_56.setTagInfo(_td_c_get_22_56);
                _jettag_c_get_22_56.doStart(context, out);
                _jettag_c_get_22_56.doEnd();
                out.setTag(null,-1,-1);
                out.write("s");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_set_22_2.handleBodyContent(out);
            }
            out = _jettag_c_set_22_2_saved_out;
    out.bodyContentEnd();
            _jettag_c_set_22_2.doEnd();
            out.endTag("set",42);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(8);
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(59);
            out.setTag("set",1991,2050);
            RuntimeTagElement _jettag_c_set_23_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_23_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_23_5.setRuntimeParent(_jettag_c_iterate_13_1);
            _jettag_c_set_23_5.setTagInfo(_td_c_set_23_5);
            _jettag_c_set_23_5.doStart(context, out);
            JET2Writer _jettag_c_set_23_5_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_c_set_23_5.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("showAll");  //$NON-NLS-1$        
                out.setTag("get",2057,2091);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(34);
                RuntimeTagElement _jettag_c_get_23_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_71); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_23_71.setRuntimeParent(_jettag_c_set_23_5);
                _jettag_c_get_23_71.setTagInfo(_td_c_get_23_71);
                _jettag_c_get_23_71.doStart(context, out);
                _jettag_c_get_23_71.doEnd();
                out.setTag(null,-1,-1);
                out.write("sForSelection");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_set_23_5.handleBodyContent(out);
            }
            out = _jettag_c_set_23_5_saved_out;
    out.bodyContentEnd();
            _jettag_c_set_23_5.doEnd();
            out.endTag("set",54);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(8);
            out.write(NL);         
            // Set DAO names 
    // elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
    out.jump(23);
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(42);
            out.setTag("set",2138,2180);
            RuntimeTagElement _jettag_c_set_25_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_25_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_25_2.setRuntimeParent(_jettag_c_iterate_13_1);
            _jettag_c_set_25_2.setTagInfo(_td_c_set_25_2);
            _jettag_c_set_25_2.doStart(context, out);
            JET2Writer _jettag_c_set_25_2_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_c_set_25_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.setTag("get",2180,2214);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(34);
                RuntimeTagElement _jettag_c_get_25_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_44); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_25_44.setRuntimeParent(_jettag_c_set_25_2);
                _jettag_c_get_25_44.setTagInfo(_td_c_get_25_44);
                _jettag_c_get_25_44.doStart(context, out);
                _jettag_c_get_25_44.doEnd();
                out.setTag(null,-1,-1);
                out.write("DAO");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_set_25_2.handleBodyContent(out);
            }
            out = _jettag_c_set_25_2_saved_out;
    out.bodyContentEnd();
            _jettag_c_set_25_2.doEnd();
            out.endTag("set",37);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(8);
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(50);
            out.setTag("set",2227,2277);
            RuntimeTagElement _jettag_c_set_26_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_26_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_26_2.setRuntimeParent(_jettag_c_iterate_13_1);
            _jettag_c_set_26_2.setTagInfo(_td_c_set_26_2);
            _jettag_c_set_26_2.doStart(context, out);
            JET2Writer _jettag_c_set_26_2_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_c_set_26_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.setTag("get",2277,2326);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(49);
                RuntimeTagElement _jettag_c_get_26_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_52); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_26_52.setRuntimeParent(_jettag_c_set_26_2);
                _jettag_c_get_26_52.setTagInfo(_td_c_get_26_52);
                _jettag_c_get_26_52.doStart(context, out);
                _jettag_c_get_26_52.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",2327,2365);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(38);
                RuntimeTagElement _jettag_c_get_26_102 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_102); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_26_102.setRuntimeParent(_jettag_c_set_26_2);
                _jettag_c_get_26_102.setTagInfo(_td_c_get_26_102);
                _jettag_c_get_26_102.doStart(context, out);
                _jettag_c_get_26_102.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_c_set_26_2.handleBodyContent(out);
            }
            out = _jettag_c_set_26_2_saved_out;
    out.bodyContentEnd();
            _jettag_c_set_26_2.doEnd();
            out.endTag("set",88);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(8);
            out.write(NL);         
            // Add id field to the types 
    // elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
    out.jump(35);
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(41);
            out.setTag("set",2411,2452);
            RuntimeTagElement _jettag_c_set_28_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_28_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_28_2.setRuntimeParent(_jettag_c_iterate_13_1);
            _jettag_c_set_28_2.setTagInfo(_td_c_set_28_2);
            _jettag_c_set_28_2.doStart(context, out);
            JET2Writer _jettag_c_set_28_2_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_c_set_28_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(17);
                out.setTag("lc",2452,2469);
                RuntimeTagElement _jettag_f_lc_28_43 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_28_43); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_lc_28_43.setRuntimeParent(_jettag_c_set_28_2);
                _jettag_f_lc_28_43.setTagInfo(_td_f_lc_28_43);
                _jettag_f_lc_28_43.doStart(context, out);
                JET2Writer _jettag_f_lc_28_43_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_lc_28_43.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",2469,2503);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(34);
                    RuntimeTagElement _jettag_c_get_28_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_60); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_28_60.setRuntimeParent(_jettag_f_lc_28_43);
                    _jettag_c_get_28_60.setTagInfo(_td_c_get_28_60);
                    _jettag_c_get_28_60.doStart(context, out);
                    _jettag_c_get_28_60.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_lc_28_43.handleBodyContent(out);
                }
                out = _jettag_f_lc_28_43_saved_out;
        out.bodyContentEnd();
                _jettag_f_lc_28_43.doEnd();
                out.endTag("lc",34);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("Id");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_set_28_2.handleBodyContent(out);
            }
            out = _jettag_c_set_28_2_saved_out;
    out.bodyContentEnd();
            _jettag_c_set_28_2.doEnd();
            out.endTag("set",60);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(8);
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(45);
            out.setTag("set",2522,2567);
            RuntimeTagElement _jettag_c_set_29_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_29_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_29_2.setRuntimeParent(_jettag_c_iterate_13_1);
            _jettag_c_set_29_2.setTagInfo(_td_c_set_29_2);
            _jettag_c_set_29_2.doStart(context, out);
            JET2Writer _jettag_c_set_29_2_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_c_set_29_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("long");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_set_29_2.handleBodyContent(out);
            }
            out = _jettag_c_set_29_2_saved_out;
    out.bodyContentEnd();
            _jettag_c_set_29_2.doEnd();
            out.endTag("set",4);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(8);
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(61);
            out.setTag("set",2581,2642);
            RuntimeTagElement _jettag_c_set_30_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_30_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_30_2.setRuntimeParent(_jettag_c_iterate_13_1);
            _jettag_c_set_30_2.setTagInfo(_td_c_set_30_2);
            _jettag_c_set_30_2.doStart(context, out);
            JET2Writer _jettag_c_set_30_2_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_c_set_30_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("Long.parseLong");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_set_30_2.handleBodyContent(out);
            }
            out = _jettag_c_set_30_2_saved_out;
    out.bodyContentEnd();
            _jettag_c_set_30_2.doEnd();
            out.endTag("set",14);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(8);
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(60);
            out.setTag("set",2666,2726);
            RuntimeTagElement _jettag_c_set_31_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_31_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_31_2.setRuntimeParent(_jettag_c_iterate_13_1);
            _jettag_c_set_31_2.setTagInfo(_td_c_set_31_2);
            _jettag_c_set_31_2.doStart(context, out);
            JET2Writer _jettag_c_set_31_2_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_c_set_31_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("getLong");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_set_31_2.handleBodyContent(out);
            }
            out = _jettag_c_set_31_2_saved_out;
    out.bodyContentEnd();
            _jettag_c_set_31_2.doEnd();
            out.endTag("set",7);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(8);
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(68);
            out.setTag("set",2743,2811);
            RuntimeTagElement _jettag_c_set_32_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_32_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_32_2.setRuntimeParent(_jettag_c_iterate_13_1);
            _jettag_c_set_32_2.setTagInfo(_td_c_set_32_2);
            _jettag_c_set_32_2.doStart(context, out);
            JET2Writer _jettag_c_set_32_2_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_c_set_32_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("setLong");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_set_32_2.handleBodyContent(out);
            }
            out = _jettag_c_set_32_2_saved_out;
    out.bodyContentEnd();
            _jettag_c_set_32_2.doEnd();
            out.endTag("set",7);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(8);
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(47);
            out.setTag("set",2828,2875);
            RuntimeTagElement _jettag_c_set_33_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_33_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_33_2.setRuntimeParent(_jettag_c_iterate_13_1);
            _jettag_c_set_33_2.setTagInfo(_td_c_set_33_2);
            _jettag_c_set_33_2.doStart(context, out);
            JET2Writer _jettag_c_set_33_2_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_c_set_33_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("set");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(17);
                out.setTag("uc",2878,2895);
                RuntimeTagElement _jettag_f_uc_33_52 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_33_52); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_uc_33_52.setRuntimeParent(_jettag_c_set_33_2);
                _jettag_f_uc_33_52.setTagInfo(_td_f_uc_33_52);
                _jettag_f_uc_33_52.doStart(context, out);
                JET2Writer _jettag_f_uc_33_52_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_uc_33_52.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",2895,2932);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(37);
                    RuntimeTagElement _jettag_c_get_33_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_69); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_33_69.setRuntimeParent(_jettag_f_uc_33_52);
                    _jettag_c_get_33_69.setTagInfo(_td_c_get_33_69);
                    _jettag_c_get_33_69.doStart(context, out);
                    _jettag_c_get_33_69.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_uc_33_52.handleBodyContent(out);
                }
                out = _jettag_f_uc_33_52_saved_out;
        out.bodyContentEnd();
                _jettag_f_uc_33_52.doEnd();
                out.endTag("uc",37);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
    out.bodyContentStart();
                _jettag_c_set_33_2.handleBodyContent(out);
            }
            out = _jettag_c_set_33_2_saved_out;
    out.bodyContentEnd();
            _jettag_c_set_33_2.doEnd();
            out.endTag("set",64);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(8);
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(47);
            out.setTag("set",2949,2996);
            RuntimeTagElement _jettag_c_set_34_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_34_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_34_2.setRuntimeParent(_jettag_c_iterate_13_1);
            _jettag_c_set_34_2.setTagInfo(_td_c_set_34_2);
            _jettag_c_set_34_2.doStart(context, out);
            JET2Writer _jettag_c_set_34_2_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_c_set_34_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("get");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(17);
                out.setTag("uc",2999,3016);
                RuntimeTagElement _jettag_f_uc_34_52 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_34_52); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_uc_34_52.setRuntimeParent(_jettag_c_set_34_2);
                _jettag_f_uc_34_52.setTagInfo(_td_f_uc_34_52);
                _jettag_f_uc_34_52.doStart(context, out);
                JET2Writer _jettag_f_uc_34_52_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_uc_34_52.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",3016,3053);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(37);
                    RuntimeTagElement _jettag_c_get_34_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_69); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_34_69.setRuntimeParent(_jettag_f_uc_34_52);
                    _jettag_c_get_34_69.setTagInfo(_td_c_get_34_69);
                    _jettag_c_get_34_69.doStart(context, out);
                    _jettag_c_get_34_69.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_uc_34_52.handleBodyContent(out);
                }
                out = _jettag_f_uc_34_52_saved_out;
        out.bodyContentEnd();
                _jettag_f_uc_34_52.doEnd();
                out.endTag("uc",37);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
    out.bodyContentStart();
                _jettag_c_set_34_2.handleBodyContent(out);
            }
            out = _jettag_c_set_34_2_saved_out;
    out.bodyContentEnd();
            _jettag_c_set_34_2.doEnd();
            out.endTag("set",64);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(8);
            out.write(NL);         
            // Set instance name (Ex: class User, instance userObj) 
    // elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
    out.jump(62);
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(46);
            out.setTag("set",3133,3179);
            RuntimeTagElement _jettag_c_set_36_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_36_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_36_2.setRuntimeParent(_jettag_c_iterate_13_1);
            _jettag_c_set_36_2.setTagInfo(_td_c_set_36_2);
            _jettag_c_set_36_2.doStart(context, out);
            JET2Writer _jettag_c_set_36_2_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_c_set_36_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(17);
                out.setTag("lc",3179,3196);
                RuntimeTagElement _jettag_f_lc_36_48 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_36_48); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_lc_36_48.setRuntimeParent(_jettag_c_set_36_2);
                _jettag_f_lc_36_48.setTagInfo(_td_f_lc_36_48);
                _jettag_f_lc_36_48.doStart(context, out);
                JET2Writer _jettag_f_lc_36_48_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_lc_36_48.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",3196,3230);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(34);
                    RuntimeTagElement _jettag_c_get_36_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_65); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_36_65.setRuntimeParent(_jettag_f_lc_36_48);
                    _jettag_c_get_36_65.setTagInfo(_td_c_get_36_65);
                    _jettag_c_get_36_65.doStart(context, out);
                    _jettag_c_get_36_65.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_lc_36_48.handleBodyContent(out);
                }
                out = _jettag_f_lc_36_48_saved_out;
        out.bodyContentEnd();
                _jettag_f_lc_36_48.doEnd();
                out.endTag("lc",34);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
    out.bodyContentStart();
                _jettag_c_set_36_2.handleBodyContent(out);
            }
            out = _jettag_c_set_36_2_saved_out;
    out.bodyContentEnd();
            _jettag_c_set_36_2.doEnd();
            out.endTag("set",58);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(8);
            out.write(NL);         
            // Add content type field for image fields 
    // elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
    out.jump(49);
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(57);
            out.setTag("iterate",3300,3357);
            RuntimeTagElement _jettag_c_iterate_38_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_38_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_38_5.setRuntimeParent(_jettag_c_iterate_13_1);
            _jettag_c_iterate_38_5.setTagInfo(_td_c_iterate_38_5);
            _jettag_c_iterate_38_5.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_38_5.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_38_5.getTagInfo().getAttribute("delimiter"),3300,3357);
                out.loopIterate();
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(45);
                out.setTag("if",3366,3411);
                RuntimeTagElement _jettag_c_if_39_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_39_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_39_9.setRuntimeParent(_jettag_c_iterate_38_5);
                _jettag_c_if_39_9.setTagInfo(_td_c_if_39_9);
                _jettag_c_if_39_9.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_39_9.okToProcessBody()) {
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
                    out.setTag("addElement",3424,3496);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(72);
                    RuntimeTagElement _jettag_c_addElement_40_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "addElement", "c:addElement", _td_c_addElement_40_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_addElement_40_13.setRuntimeParent(_jettag_c_if_39_9);
                    _jettag_c_addElement_40_13.setTagInfo(_td_c_addElement_40_13);
                    _jettag_c_addElement_40_13.doStart(context, out);
                    _jettag_c_addElement_40_13.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(42);
                    out.setTag("set",3509,3551);
                    RuntimeTagElement _jettag_c_set_41_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_41_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_41_13.setRuntimeParent(_jettag_c_if_39_9);
                    _jettag_c_set_41_13.setTagInfo(_td_c_set_41_13);
                    _jettag_c_set_41_13.doStart(context, out);
                    JET2Writer _jettag_c_set_41_13_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_c_set_41_13.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.setTag("get",3551,3586);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(35);
                        RuntimeTagElement _jettag_c_get_41_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_55); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_41_55.setRuntimeParent(_jettag_c_set_41_13);
                        _jettag_c_get_41_55.setTagInfo(_td_c_get_41_55);
                        _jettag_c_get_41_55.doStart(context, out);
                        _jettag_c_get_41_55.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("ContentType");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_set_41_13.handleBodyContent(out);
                    }
                    out = _jettag_c_set_41_13_saved_out;
            out.bodyContentEnd();
                    _jettag_c_set_41_13.doEnd();
                    out.endTag("set",46);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(8);
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(47);
                    out.setTag("set",3618,3665);
                    RuntimeTagElement _jettag_c_set_42_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_42_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_42_13.setRuntimeParent(_jettag_c_if_39_9);
                    _jettag_c_set_42_13.setTagInfo(_td_c_set_42_13);
                    _jettag_c_set_42_13.doStart(context, out);
                    JET2Writer _jettag_c_set_42_13_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_c_set_42_13.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("30");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_set_42_13.handleBodyContent(out);
                    }
                    out = _jettag_c_set_42_13_saved_out;
            out.bodyContentEnd();
                    _jettag_c_set_42_13.doEnd();
                    out.endTag("set",2);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(8);
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(56);
                    out.setTag("set",3688,3744);
                    RuntimeTagElement _jettag_c_set_43_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_43_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_43_13.setRuntimeParent(_jettag_c_if_39_9);
                    _jettag_c_set_43_13.setTagInfo(_td_c_set_43_13);
                    _jettag_c_set_43_13.doStart(context, out);
                    JET2Writer _jettag_c_set_43_13_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_c_set_43_13.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("true");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_set_43_13.handleBodyContent(out);
                    }
                    out = _jettag_c_set_43_13_saved_out;
            out.bodyContentEnd();
                    _jettag_c_set_43_13.doEnd();
                    out.endTag("set",4);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(8);
                    out.write(NL);         
                    out.write("        ");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_39_9.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_39_9.doEnd();
                out.endTag("if",354);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_iterate_38_5.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_38_5.doEnd();
            out.loopEnd();
            out.endTag("iterate",420);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_iterate_13_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_13_1.doEnd();
        out.loopEnd();
        out.endTag("iterate",2702);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write(NL);         
        // transform all fields and references into Java and database attributes 
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(79);
        out.write(" ");  //$NON-NLS-1$        
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(75);
        out.setTag("iterate",3885,3960);
        RuntimeTagElement _jettag_c_iterate_49_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_49_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_49_1.setRuntimeParent(null);
        _jettag_c_iterate_49_1.setTagInfo(_td_c_iterate_49_1);
        _jettag_c_iterate_49_1.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_49_1.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_49_1.getTagInfo().getAttribute("delimiter"),3885,3960);
            out.loopIterate();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(59);
            out.setTag("iterate",3962,4021);
            RuntimeTagElement _jettag_c_iterate_50_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_50_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_50_2.setRuntimeParent(_jettag_c_iterate_49_1);
            _jettag_c_iterate_50_2.setTagInfo(_td_c_iterate_50_2);
            _jettag_c_iterate_50_2.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_50_2.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_50_2.getTagInfo().getAttribute("delimiter"),3962,4021);
                out.loopIterate();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                // attribute setter and getter 
        // elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
        out.jump(37);
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(47);
                out.setTag("set",4064,4111);
                RuntimeTagElement _jettag_c_set_52_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_52_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_52_3.setRuntimeParent(_jettag_c_iterate_50_2);
                _jettag_c_set_52_3.setTagInfo(_td_c_set_52_3);
                _jettag_c_set_52_3.doStart(context, out);
                JET2Writer _jettag_c_set_52_3_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_c_set_52_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("set");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(17);
                    out.setTag("uc",4114,4131);
                    RuntimeTagElement _jettag_f_uc_52_53 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_52_53); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_f_uc_52_53.setRuntimeParent(_jettag_c_set_52_3);
                    _jettag_f_uc_52_53.setTagInfo(_td_f_uc_52_53);
                    _jettag_f_uc_52_53.doStart(context, out);
                    JET2Writer _jettag_f_uc_52_53_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_f_uc_52_53.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.setTag("get",4131,4168);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(37);
                        RuntimeTagElement _jettag_c_get_52_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_70); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_52_70.setRuntimeParent(_jettag_f_uc_52_53);
                        _jettag_c_get_52_70.setTagInfo(_td_c_get_52_70);
                        _jettag_c_get_52_70.doStart(context, out);
                        _jettag_c_get_52_70.doEnd();
                        out.setTag(null,-1,-1);
            out.bodyContentStart();
                        _jettag_f_uc_52_53.handleBodyContent(out);
                    }
                    out = _jettag_f_uc_52_53_saved_out;
            out.bodyContentEnd();
                    _jettag_f_uc_52_53.doEnd();
                    out.endTag("uc",37);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
        out.bodyContentStart();
                    _jettag_c_set_52_3.handleBodyContent(out);
                }
                out = _jettag_c_set_52_3_saved_out;
        out.bodyContentEnd();
                _jettag_c_set_52_3.doEnd();
                out.endTag("set",64);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(8);
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(47);
                out.setTag("set",4186,4233);
                RuntimeTagElement _jettag_c_set_53_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_53_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_53_3.setRuntimeParent(_jettag_c_iterate_50_2);
                _jettag_c_set_53_3.setTagInfo(_td_c_set_53_3);
                _jettag_c_set_53_3.doStart(context, out);
                JET2Writer _jettag_c_set_53_3_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_c_set_53_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("get");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(17);
                    out.setTag("uc",4236,4253);
                    RuntimeTagElement _jettag_f_uc_53_53 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_53_53); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_f_uc_53_53.setRuntimeParent(_jettag_c_set_53_3);
                    _jettag_f_uc_53_53.setTagInfo(_td_f_uc_53_53);
                    _jettag_f_uc_53_53.doStart(context, out);
                    JET2Writer _jettag_f_uc_53_53_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_f_uc_53_53.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.setTag("get",4253,4290);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(37);
                        RuntimeTagElement _jettag_c_get_53_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_70); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_53_70.setRuntimeParent(_jettag_f_uc_53_53);
                        _jettag_c_get_53_70.setTagInfo(_td_c_get_53_70);
                        _jettag_c_get_53_70.doStart(context, out);
                        _jettag_c_get_53_70.doEnd();
                        out.setTag(null,-1,-1);
            out.bodyContentStart();
                        _jettag_f_uc_53_53.handleBodyContent(out);
                    }
                    out = _jettag_f_uc_53_53_saved_out;
            out.bodyContentEnd();
                    _jettag_f_uc_53_53.doEnd();
                    out.endTag("uc",37);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
        out.bodyContentStart();
                    _jettag_c_set_53_3.handleBodyContent(out);
                }
                out = _jettag_c_set_53_3_saved_out;
        out.bodyContentEnd();
                _jettag_c_set_53_3.doEnd();
                out.endTag("set",64);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(8);
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(45);
                out.setTag("set",4308,4353);
                RuntimeTagElement _jettag_c_set_54_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_54_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_54_3.setRuntimeParent(_jettag_c_iterate_50_2);
                _jettag_c_set_54_3.setTagInfo(_td_c_set_54_3);
                _jettag_c_set_54_3.doStart(context, out);
                JET2Writer _jettag_c_set_54_3_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_c_set_54_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("String");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_set_54_3.handleBodyContent(out);
                }
                out = _jettag_c_set_54_3_saved_out;
        out.bodyContentEnd();
                _jettag_c_set_54_3.doEnd();
                out.endTag("set",6);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(8);
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(56);
                out.setTag("set",4370,4426);
                RuntimeTagElement _jettag_c_set_55_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_55_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_55_3.setRuntimeParent(_jettag_c_iterate_50_2);
                _jettag_c_set_55_3.setTagInfo(_td_c_set_55_3);
                _jettag_c_set_55_3.doStart(context, out);
                JET2Writer _jettag_c_set_55_3_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_c_set_55_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("getString");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_set_55_3.handleBodyContent(out);
                }
                out = _jettag_c_set_55_3_saved_out;
        out.bodyContentEnd();
                _jettag_c_set_55_3.doEnd();
                out.endTag("set",9);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(8);
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(64);
                out.setTag("set",4446,4510);
                RuntimeTagElement _jettag_c_set_56_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_56_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_56_3.setRuntimeParent(_jettag_c_iterate_50_2);
                _jettag_c_set_56_3.setTagInfo(_td_c_set_56_3);
                _jettag_c_set_56_3.doStart(context, out);
                JET2Writer _jettag_c_set_56_3_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_c_set_56_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("setString");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_set_56_3.handleBodyContent(out);
                }
                out = _jettag_c_set_56_3_saved_out;
        out.bodyContentEnd();
                _jettag_c_set_56_3.doEnd();
                out.endTag("set",9);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(8);
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(46);
                out.setTag("if",4530,4576);
                RuntimeTagElement _jettag_c_if_57_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_57_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_57_3.setRuntimeParent(_jettag_c_iterate_50_2);
                _jettag_c_if_57_3.setTagInfo(_td_c_if_57_3);
                _jettag_c_if_57_3.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_57_3.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(45);
                    out.setTag("set",4580,4625);
                    RuntimeTagElement _jettag_c_set_58_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_58_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_58_4.setRuntimeParent(_jettag_c_if_57_3);
                    _jettag_c_set_58_4.setTagInfo(_td_c_set_58_4);
                    _jettag_c_set_58_4.doStart(context, out);
                    JET2Writer _jettag_c_set_58_4_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_c_set_58_4.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.util.Date");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_set_58_4.handleBodyContent(out);
                    }
                    out = _jettag_c_set_58_4_saved_out;
            out.bodyContentEnd();
                    _jettag_c_set_58_4.doEnd();
                    out.endTag("set",14);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(8);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(56);
                    out.setTag("set",4651,4707);
                    RuntimeTagElement _jettag_c_set_59_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_59_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_59_4.setRuntimeParent(_jettag_c_if_57_3);
                    _jettag_c_set_59_4.setTagInfo(_td_c_set_59_4);
                    _jettag_c_set_59_4.doStart(context, out);
                    JET2Writer _jettag_c_set_59_4_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_c_set_59_4.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("getTimestamp");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_set_59_4.handleBodyContent(out);
                    }
                    out = _jettag_c_set_59_4_saved_out;
            out.bodyContentEnd();
                    _jettag_c_set_59_4.doEnd();
                    out.endTag("set",12);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(8);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(64);
                    out.setTag("set",4731,4795);
                    RuntimeTagElement _jettag_c_set_60_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_60_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_60_4.setRuntimeParent(_jettag_c_if_57_3);
                    _jettag_c_set_60_4.setTagInfo(_td_c_set_60_4);
                    _jettag_c_set_60_4.doStart(context, out);
                    JET2Writer _jettag_c_set_60_4_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_c_set_60_4.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("setTimestamp");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_set_60_4.handleBodyContent(out);
                    }
                    out = _jettag_c_set_60_4_saved_out;
            out.bodyContentEnd();
                    _jettag_c_set_60_4.doEnd();
                    out.endTag("set",12);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(8);
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_57_3.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_57_3.doEnd();
                out.endTag("if",242);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(47);
                out.setTag("if",4834,4881);
                RuntimeTagElement _jettag_c_if_62_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_62_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_62_9.setRuntimeParent(_jettag_c_iterate_50_2);
                _jettag_c_if_62_9.setTagInfo(_td_c_if_62_9);
                _jettag_c_if_62_9.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_62_9.okToProcessBody()) {
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(45);
                    out.setTag("set",4894,4939);
                    RuntimeTagElement _jettag_c_set_63_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_63_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_63_13.setRuntimeParent(_jettag_c_if_62_9);
                    _jettag_c_set_63_13.setTagInfo(_td_c_set_63_13);
                    _jettag_c_set_63_13.doStart(context, out);
                    JET2Writer _jettag_c_set_63_13_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_c_set_63_13.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("byte[]");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_set_63_13.handleBodyContent(out);
                    }
                    out = _jettag_c_set_63_13_saved_out;
            out.bodyContentEnd();
                    _jettag_c_set_63_13.doEnd();
                    out.endTag("set",6);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(8);
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(56);
                    out.setTag("set",4966,5022);
                    RuntimeTagElement _jettag_c_set_64_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_64_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_64_13.setRuntimeParent(_jettag_c_if_62_9);
                    _jettag_c_set_64_13.setTagInfo(_td_c_set_64_13);
                    _jettag_c_set_64_13.doStart(context, out);
                    JET2Writer _jettag_c_set_64_13_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_c_set_64_13.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("getObject");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_set_64_13.handleBodyContent(out);
                    }
                    out = _jettag_c_set_64_13_saved_out;
            out.bodyContentEnd();
                    _jettag_c_set_64_13.doEnd();
                    out.endTag("set",9);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(8);
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(65);
                    out.setTag("set",5052,5117);
                    RuntimeTagElement _jettag_c_set_65_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_65_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_65_13.setRuntimeParent(_jettag_c_if_62_9);
                    _jettag_c_set_65_13.setTagInfo(_td_c_set_65_13);
                    _jettag_c_set_65_13.doStart(context, out);
                    JET2Writer _jettag_c_set_65_13_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_c_set_65_13.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("true");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_set_65_13.handleBodyContent(out);
                    }
                    out = _jettag_c_set_65_13_saved_out;
            out.bodyContentEnd();
                    _jettag_c_set_65_13.doEnd();
                    out.endTag("set",4);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(8);
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(64);
                    out.setTag("set",5142,5206);
                    RuntimeTagElement _jettag_c_set_66_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_66_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_66_13.setRuntimeParent(_jettag_c_if_62_9);
                    _jettag_c_set_66_13.setTagInfo(_td_c_set_66_13);
                    _jettag_c_set_66_13.doStart(context, out);
                    JET2Writer _jettag_c_set_66_13_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_c_set_66_13.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("setObject");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_set_66_13.handleBodyContent(out);
                    }
                    out = _jettag_c_set_66_13_saved_out;
            out.bodyContentEnd();
                    _jettag_c_set_66_13.doEnd();
                    out.endTag("set",9);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(8);
                    out.write(NL);         
                    out.write("        ");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_62_9.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_62_9.doEnd();
                out.endTag("if",351);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(45);
                out.setTag("if",5248,5293);
                RuntimeTagElement _jettag_c_if_68_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_68_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_68_9.setRuntimeParent(_jettag_c_iterate_50_2);
                _jettag_c_if_68_9.setTagInfo(_td_c_if_68_9);
                _jettag_c_if_68_9.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_68_9.okToProcessBody()) {
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(45);
                    out.setTag("set",5306,5351);
                    RuntimeTagElement _jettag_c_set_69_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_69_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_69_13.setRuntimeParent(_jettag_c_if_68_9);
                    _jettag_c_set_69_13.setTagInfo(_td_c_set_69_13);
                    _jettag_c_set_69_13.doStart(context, out);
                    JET2Writer _jettag_c_set_69_13_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_c_set_69_13.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("int");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_set_69_13.handleBodyContent(out);
                    }
                    out = _jettag_c_set_69_13_saved_out;
            out.bodyContentEnd();
                    _jettag_c_set_69_13.doEnd();
                    out.endTag("set",3);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(8);
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(56);
                    out.setTag("set",5375,5431);
                    RuntimeTagElement _jettag_c_set_70_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_70_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_70_13.setRuntimeParent(_jettag_c_if_68_9);
                    _jettag_c_set_70_13.setTagInfo(_td_c_set_70_13);
                    _jettag_c_set_70_13.doStart(context, out);
                    JET2Writer _jettag_c_set_70_13_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_c_set_70_13.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("getInt");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_set_70_13.handleBodyContent(out);
                    }
                    out = _jettag_c_set_70_13_saved_out;
            out.bodyContentEnd();
                    _jettag_c_set_70_13.doEnd();
                    out.endTag("set",6);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(8);
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(64);
                    out.setTag("set",5458,5522);
                    RuntimeTagElement _jettag_c_set_71_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_71_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_71_13.setRuntimeParent(_jettag_c_if_68_9);
                    _jettag_c_set_71_13.setTagInfo(_td_c_set_71_13);
                    _jettag_c_set_71_13.doStart(context, out);
                    JET2Writer _jettag_c_set_71_13_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_c_set_71_13.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("setInt");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_set_71_13.handleBodyContent(out);
                    }
                    out = _jettag_c_set_71_13_saved_out;
            out.bodyContentEnd();
                    _jettag_c_set_71_13.doEnd();
                    out.endTag("set",6);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(8);
                    out.write(NL);         
                    out.write("        ");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_68_9.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_68_9.doEnd();
                out.endTag("if",252);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(46);
                out.setTag("if",5561,5607);
                RuntimeTagElement _jettag_c_if_73_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_73_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_73_9.setRuntimeParent(_jettag_c_iterate_50_2);
                _jettag_c_if_73_9.setTagInfo(_td_c_if_73_9);
                _jettag_c_if_73_9.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_73_9.okToProcessBody()) {
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(45);
                    out.setTag("set",5620,5665);
                    RuntimeTagElement _jettag_c_set_74_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_74_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_74_13.setRuntimeParent(_jettag_c_if_73_9);
                    _jettag_c_set_74_13.setTagInfo(_td_c_set_74_13);
                    _jettag_c_set_74_13.doStart(context, out);
                    JET2Writer _jettag_c_set_74_13_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_c_set_74_13.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("long");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_set_74_13.handleBodyContent(out);
                    }
                    out = _jettag_c_set_74_13_saved_out;
            out.bodyContentEnd();
                    _jettag_c_set_74_13.doEnd();
                    out.endTag("set",4);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(8);
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(56);
                    out.setTag("set",5690,5746);
                    RuntimeTagElement _jettag_c_set_75_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_75_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_75_13.setRuntimeParent(_jettag_c_if_73_9);
                    _jettag_c_set_75_13.setTagInfo(_td_c_set_75_13);
                    _jettag_c_set_75_13.doStart(context, out);
                    JET2Writer _jettag_c_set_75_13_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_c_set_75_13.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("getLong");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_set_75_13.handleBodyContent(out);
                    }
                    out = _jettag_c_set_75_13_saved_out;
            out.bodyContentEnd();
                    _jettag_c_set_75_13.doEnd();
                    out.endTag("set",7);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(8);
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(64);
                    out.setTag("set",5774,5838);
                    RuntimeTagElement _jettag_c_set_76_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_76_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_76_13.setRuntimeParent(_jettag_c_if_73_9);
                    _jettag_c_set_76_13.setTagInfo(_td_c_set_76_13);
                    _jettag_c_set_76_13.doStart(context, out);
                    JET2Writer _jettag_c_set_76_13_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_c_set_76_13.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("setLong");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_set_76_13.handleBodyContent(out);
                    }
                    out = _jettag_c_set_76_13_saved_out;
            out.bodyContentEnd();
                    _jettag_c_set_76_13.doEnd();
                    out.endTag("set",7);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(8);
                    out.write(NL);         
                    out.write("        ");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_73_9.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_73_9.doEnd();
                out.endTag("if",255);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(46);
                out.setTag("if",5878,5924);
                RuntimeTagElement _jettag_c_if_78_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_78_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_78_9.setRuntimeParent(_jettag_c_iterate_50_2);
                _jettag_c_if_78_9.setTagInfo(_td_c_if_78_9);
                _jettag_c_if_78_9.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_78_9.okToProcessBody()) {
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(45);
                    out.setTag("set",5937,5982);
                    RuntimeTagElement _jettag_c_set_79_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_79_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_79_13.setRuntimeParent(_jettag_c_if_78_9);
                    _jettag_c_set_79_13.setTagInfo(_td_c_set_79_13);
                    _jettag_c_set_79_13.doStart(context, out);
                    JET2Writer _jettag_c_set_79_13_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_c_set_79_13.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("float");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_set_79_13.handleBodyContent(out);
                    }
                    out = _jettag_c_set_79_13_saved_out;
            out.bodyContentEnd();
                    _jettag_c_set_79_13.doEnd();
                    out.endTag("set",5);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(8);
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(56);
                    out.setTag("set",6008,6064);
                    RuntimeTagElement _jettag_c_set_80_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_80_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_80_13.setRuntimeParent(_jettag_c_if_78_9);
                    _jettag_c_set_80_13.setTagInfo(_td_c_set_80_13);
                    _jettag_c_set_80_13.doStart(context, out);
                    JET2Writer _jettag_c_set_80_13_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_c_set_80_13.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("getFloat");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_set_80_13.handleBodyContent(out);
                    }
                    out = _jettag_c_set_80_13_saved_out;
            out.bodyContentEnd();
                    _jettag_c_set_80_13.doEnd();
                    out.endTag("set",8);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(8);
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(64);
                    out.setTag("set",6093,6157);
                    RuntimeTagElement _jettag_c_set_81_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_81_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_81_13.setRuntimeParent(_jettag_c_if_78_9);
                    _jettag_c_set_81_13.setTagInfo(_td_c_set_81_13);
                    _jettag_c_set_81_13.doStart(context, out);
                    JET2Writer _jettag_c_set_81_13_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_c_set_81_13.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("setFloat");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_set_81_13.handleBodyContent(out);
                    }
                    out = _jettag_c_set_81_13_saved_out;
            out.bodyContentEnd();
                    _jettag_c_set_81_13.doEnd();
                    out.endTag("set",8);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(8);
                    out.write(NL);         
                    out.write("        ");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_78_9.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_78_9.doEnd();
                out.endTag("if",258);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(50);
                out.setTag("if",6198,6248);
                RuntimeTagElement _jettag_c_if_83_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_83_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_83_9.setRuntimeParent(_jettag_c_iterate_50_2);
                _jettag_c_if_83_9.setTagInfo(_td_c_if_83_9);
                _jettag_c_if_83_9.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_83_9.okToProcessBody()) {
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(45);
                    out.setTag("set",6261,6306);
                    RuntimeTagElement _jettag_c_set_84_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_84_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_84_13.setRuntimeParent(_jettag_c_if_83_9);
                    _jettag_c_set_84_13.setTagInfo(_td_c_set_84_13);
                    _jettag_c_set_84_13.doStart(context, out);
                    JET2Writer _jettag_c_set_84_13_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_c_set_84_13.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("float");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_set_84_13.handleBodyContent(out);
                    }
                    out = _jettag_c_set_84_13_saved_out;
            out.bodyContentEnd();
                    _jettag_c_set_84_13.doEnd();
                    out.endTag("set",5);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(8);
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(56);
                    out.setTag("set",6332,6388);
                    RuntimeTagElement _jettag_c_set_85_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_85_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_85_13.setRuntimeParent(_jettag_c_if_83_9);
                    _jettag_c_set_85_13.setTagInfo(_td_c_set_85_13);
                    _jettag_c_set_85_13.doStart(context, out);
                    JET2Writer _jettag_c_set_85_13_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_c_set_85_13.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("getFloat");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_set_85_13.handleBodyContent(out);
                    }
                    out = _jettag_c_set_85_13_saved_out;
            out.bodyContentEnd();
                    _jettag_c_set_85_13.doEnd();
                    out.endTag("set",8);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(8);
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(64);
                    out.setTag("set",6417,6481);
                    RuntimeTagElement _jettag_c_set_86_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_86_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_86_13.setRuntimeParent(_jettag_c_if_83_9);
                    _jettag_c_set_86_13.setTagInfo(_td_c_set_86_13);
                    _jettag_c_set_86_13.doStart(context, out);
                    JET2Writer _jettag_c_set_86_13_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_c_set_86_13.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("setFloat");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_set_86_13.handleBodyContent(out);
                    }
                    out = _jettag_c_set_86_13_saved_out;
            out.bodyContentEnd();
                    _jettag_c_set_86_13.doEnd();
                    out.endTag("set",8);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(8);
                    out.write(NL);         
                    out.write("        ");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_83_9.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_83_9.doEnd();
                out.endTag("if",258);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_iterate_50_2.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_50_2.doEnd();
            out.loopEnd();
            out.endTag("iterate",2494);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(61);
            out.setTag("iterate",6529,6590);
            RuntimeTagElement _jettag_c_iterate_89_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_89_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_89_2.setRuntimeParent(_jettag_c_iterate_49_1);
            _jettag_c_iterate_89_2.setTagInfo(_td_c_iterate_89_2);
            _jettag_c_iterate_89_2.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_89_2.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_89_2.getTagInfo().getAttribute("delimiter"),6529,6590);
                out.loopIterate();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(46);
                out.setTag("set",6593,6639);
                RuntimeTagElement _jettag_c_set_90_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_90_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_90_3.setRuntimeParent(_jettag_c_iterate_89_2);
                _jettag_c_set_90_3.setTagInfo(_td_c_set_90_3);
                _jettag_c_set_90_3.doStart(context, out);
                JET2Writer _jettag_c_set_90_3_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_c_set_90_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("set");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(17);
                    out.setTag("uc",6642,6659);
                    RuntimeTagElement _jettag_f_uc_90_52 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_90_52); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_f_uc_90_52.setRuntimeParent(_jettag_c_set_90_3);
                    _jettag_f_uc_90_52.setTagInfo(_td_f_uc_90_52);
                    _jettag_f_uc_90_52.doStart(context, out);
                    JET2Writer _jettag_f_uc_90_52_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_f_uc_90_52.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.setTag("get",6659,6695);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(36);
                        RuntimeTagElement _jettag_c_get_90_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_90_69); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_90_69.setRuntimeParent(_jettag_f_uc_90_52);
                        _jettag_c_get_90_69.setTagInfo(_td_c_get_90_69);
                        _jettag_c_get_90_69.doStart(context, out);
                        _jettag_c_get_90_69.doEnd();
                        out.setTag(null,-1,-1);
            out.bodyContentStart();
                        _jettag_f_uc_90_52.handleBodyContent(out);
                    }
                    out = _jettag_f_uc_90_52_saved_out;
            out.bodyContentEnd();
                    _jettag_f_uc_90_52.doEnd();
                    out.endTag("uc",36);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
        out.bodyContentStart();
                    _jettag_c_set_90_3.handleBodyContent(out);
                }
                out = _jettag_c_set_90_3_saved_out;
        out.bodyContentEnd();
                _jettag_c_set_90_3.doEnd();
                out.endTag("set",63);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(8);
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(46);
                out.setTag("set",6713,6759);
                RuntimeTagElement _jettag_c_set_91_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_91_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_91_3.setRuntimeParent(_jettag_c_iterate_89_2);
                _jettag_c_set_91_3.setTagInfo(_td_c_set_91_3);
                _jettag_c_set_91_3.doStart(context, out);
                JET2Writer _jettag_c_set_91_3_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_c_set_91_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("get");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(17);
                    out.setTag("uc",6762,6779);
                    RuntimeTagElement _jettag_f_uc_91_52 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_91_52); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_f_uc_91_52.setRuntimeParent(_jettag_c_set_91_3);
                    _jettag_f_uc_91_52.setTagInfo(_td_f_uc_91_52);
                    _jettag_f_uc_91_52.doStart(context, out);
                    JET2Writer _jettag_f_uc_91_52_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_f_uc_91_52.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.setTag("get",6779,6815);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(36);
                        RuntimeTagElement _jettag_c_get_91_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_91_69); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_91_69.setRuntimeParent(_jettag_f_uc_91_52);
                        _jettag_c_get_91_69.setTagInfo(_td_c_get_91_69);
                        _jettag_c_get_91_69.doStart(context, out);
                        _jettag_c_get_91_69.doEnd();
                        out.setTag(null,-1,-1);
            out.bodyContentStart();
                        _jettag_f_uc_91_52.handleBodyContent(out);
                    }
                    out = _jettag_f_uc_91_52_saved_out;
            out.bodyContentEnd();
                    _jettag_f_uc_91_52.doEnd();
                    out.endTag("uc",36);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
        out.bodyContentStart();
                    _jettag_c_set_91_3.handleBodyContent(out);
                }
                out = _jettag_c_set_91_3_saved_out;
        out.bodyContentEnd();
                _jettag_c_set_91_3.doEnd();
                out.endTag("set",63);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(8);
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(44);
                out.setTag("set",6833,6877);
                RuntimeTagElement _jettag_c_set_92_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_92_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_92_3.setRuntimeParent(_jettag_c_iterate_89_2);
                _jettag_c_set_92_3.setTagInfo(_td_c_set_92_3);
                _jettag_c_set_92_3.doStart(context, out);
                JET2Writer _jettag_c_set_92_3_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_c_set_92_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",6877,6936);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(59);
                    RuntimeTagElement _jettag_c_get_92_47 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_92_47); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_92_47.setRuntimeParent(_jettag_c_set_92_3);
                    _jettag_c_get_92_47.setTagInfo(_td_c_get_92_47);
                    _jettag_c_get_92_47.doStart(context, out);
                    _jettag_c_get_92_47.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_c_set_92_3.handleBodyContent(out);
                }
                out = _jettag_c_set_92_3_saved_out;
        out.bodyContentEnd();
                _jettag_c_set_92_3.doEnd();
                out.endTag("set",59);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(8);
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_iterate_89_2.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_89_2.doEnd();
            out.loopEnd();
            out.endTag("iterate",356);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_iterate_49_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_49_1.doEnd();
        out.loopEnd();
        out.endTag("iterate",2999);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write(NL);         
        // set all types, field and references message keys 
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(58);
        out.write(" ");  //$NON-NLS-1$        
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(75);
        out.setTag("iterate",7033,7108);
        RuntimeTagElement _jettag_c_iterate_97_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_97_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_97_1.setRuntimeParent(null);
        _jettag_c_iterate_97_1.setTagInfo(_td_c_iterate_97_1);
        _jettag_c_iterate_97_1.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_97_1.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_97_1.getTagInfo().getAttribute("delimiter"),7033,7108);
            out.loopIterate();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(59);
            out.setTag("iterate",7110,7169);
            RuntimeTagElement _jettag_c_iterate_98_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_98_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_98_2.setRuntimeParent(_jettag_c_iterate_97_1);
            _jettag_c_iterate_98_2.setTagInfo(_td_c_iterate_98_2);
            _jettag_c_iterate_98_2.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_98_2.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_98_2.getTagInfo().getAttribute("delimiter"),7110,7169);
                out.loopIterate();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(47);
                out.setTag("set",7172,7219);
                RuntimeTagElement _jettag_c_set_99_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_99_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_99_3.setRuntimeParent(_jettag_c_iterate_98_2);
                _jettag_c_set_99_3.setTagInfo(_td_c_set_99_3);
                _jettag_c_set_99_3.doStart(context, out);
                JET2Writer _jettag_c_set_99_3_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_c_set_99_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",7219,7261);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(42);
                    RuntimeTagElement _jettag_c_get_99_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_99_50); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_99_50.setRuntimeParent(_jettag_c_set_99_3);
                    _jettag_c_get_99_50.setTagInfo(_td_c_get_99_50);
                    _jettag_c_get_99_50.doStart(context, out);
                    _jettag_c_get_99_50.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",7262,7299);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(37);
                    RuntimeTagElement _jettag_c_get_99_93 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_99_93); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_99_93.setRuntimeParent(_jettag_c_set_99_3);
                    _jettag_c_get_99_93.setTagInfo(_td_c_get_99_93);
                    _jettag_c_get_99_93.doStart(context, out);
                    _jettag_c_get_99_93.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".label");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_set_99_3.handleBodyContent(out);
                }
                out = _jettag_c_set_99_3_saved_out;
        out.bodyContentEnd();
                _jettag_c_set_99_3.doEnd();
                out.endTag("set",86);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(8);
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_iterate_98_2.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_98_2.doEnd();
            out.loopEnd();
            out.endTag("iterate",146);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(61);
            out.setTag("iterate",7332,7393);
            RuntimeTagElement _jettag_c_iterate_101_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_101_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_101_5.setRuntimeParent(_jettag_c_iterate_97_1);
            _jettag_c_iterate_101_5.setTagInfo(_td_c_iterate_101_5);
            _jettag_c_iterate_101_5.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_101_5.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_101_5.getTagInfo().getAttribute("delimiter"),7332,7393);
                out.loopIterate();
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(46);
                out.setTag("set",7402,7448);
                RuntimeTagElement _jettag_c_set_102_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_102_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_102_9.setRuntimeParent(_jettag_c_iterate_101_5);
                _jettag_c_set_102_9.setTagInfo(_td_c_set_102_9);
                _jettag_c_set_102_9.doStart(context, out);
                JET2Writer _jettag_c_set_102_9_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_c_set_102_9.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",7448,7490);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(42);
                    RuntimeTagElement _jettag_c_get_102_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_102_55); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_102_55.setRuntimeParent(_jettag_c_set_102_9);
                    _jettag_c_get_102_55.setTagInfo(_td_c_get_102_55);
                    _jettag_c_get_102_55.doStart(context, out);
                    _jettag_c_get_102_55.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",7491,7527);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(36);
                    RuntimeTagElement _jettag_c_get_102_98 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_102_98); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_102_98.setRuntimeParent(_jettag_c_set_102_9);
                    _jettag_c_get_102_98.setTagInfo(_td_c_get_102_98);
                    _jettag_c_get_102_98.doStart(context, out);
                    _jettag_c_get_102_98.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".label");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_set_102_9.handleBodyContent(out);
                }
                out = _jettag_c_set_102_9_saved_out;
        out.bodyContentEnd();
                _jettag_c_set_102_9.doEnd();
                out.endTag("set",85);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(8);
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_iterate_101_5.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_101_5.doEnd();
            out.loopEnd();
            out.endTag("iterate",153);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_iterate_97_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_97_1.doEnd();
        out.loopEnd();
        out.endTag("iterate",451);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write(NL);         
        // set paths for pages 
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(29);
        out.write(" ");  //$NON-NLS-1$        
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(75);
        out.setTag("iterate",7604,7679);
        RuntimeTagElement _jettag_c_iterate_107_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_107_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_107_1.setRuntimeParent(null);
        _jettag_c_iterate_107_1.setTagInfo(_td_c_iterate_107_1);
        _jettag_c_iterate_107_1.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_107_1.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_107_1.getTagInfo().getAttribute("delimiter"),7604,7679);
            out.loopIterate();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(46);
            out.setTag("set",7681,7727);
            RuntimeTagElement _jettag_c_set_108_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_108_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_108_2.setRuntimeParent(_jettag_c_iterate_107_1);
            _jettag_c_set_108_2.setTagInfo(_td_c_set_108_2);
            _jettag_c_set_108_2.doStart(context, out);
            JET2Writer _jettag_c_set_108_2_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_c_set_108_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.setTag("get",7727,7772);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(45);
                RuntimeTagElement _jettag_c_get_108_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_48); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_108_48.setRuntimeParent(_jettag_c_set_108_2);
                _jettag_c_get_108_48.setTagInfo(_td_c_get_108_48);
                _jettag_c_get_108_48.doStart(context, out);
                _jettag_c_get_108_48.doEnd();
                out.setTag(null,-1,-1);
                out.write("/Edit");  //$NON-NLS-1$        
                out.setTag("get",7777,7811);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(34);
                RuntimeTagElement _jettag_c_get_108_98 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_98); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_108_98.setRuntimeParent(_jettag_c_set_108_2);
                _jettag_c_get_108_98.setTagInfo(_td_c_get_108_98);
                _jettag_c_get_108_98.doStart(context, out);
                _jettag_c_get_108_98.doEnd();
                out.setTag(null,-1,-1);
                out.write(".jsp");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_set_108_2.handleBodyContent(out);
            }
            out = _jettag_c_set_108_2_saved_out;
    out.bodyContentEnd();
            _jettag_c_set_108_2.doEnd();
            out.endTag("set",88);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(8);
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(46);
            out.setTag("set",7828,7874);
            RuntimeTagElement _jettag_c_set_109_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_109_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_109_5.setRuntimeParent(_jettag_c_iterate_107_1);
            _jettag_c_set_109_5.setTagInfo(_td_c_set_109_5);
            _jettag_c_set_109_5.doStart(context, out);
            JET2Writer _jettag_c_set_109_5_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_c_set_109_5.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.setTag("get",7874,7919);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(45);
                RuntimeTagElement _jettag_c_get_109_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_109_51); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_109_51.setRuntimeParent(_jettag_c_set_109_5);
                _jettag_c_get_109_51.setTagInfo(_td_c_get_109_51);
                _jettag_c_get_109_51.doStart(context, out);
                _jettag_c_get_109_51.doEnd();
                out.setTag(null,-1,-1);
                out.write("/List");  //$NON-NLS-1$        
                out.setTag("get",7924,7958);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(34);
                RuntimeTagElement _jettag_c_get_109_101 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_109_101); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_109_101.setRuntimeParent(_jettag_c_set_109_5);
                _jettag_c_get_109_101.setTagInfo(_td_c_get_109_101);
                _jettag_c_get_109_101.doStart(context, out);
                _jettag_c_get_109_101.doEnd();
                out.setTag(null,-1,-1);
                out.write(".jsp");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_set_109_5.handleBodyContent(out);
            }
            out = _jettag_c_set_109_5_saved_out;
    out.bodyContentEnd();
            _jettag_c_set_109_5.doEnd();
            out.endTag("set",88);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(8);
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_iterate_107_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_107_1.doEnd();
        out.loopEnd();
        out.endTag("iterate",292);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.popTemplateFile();
    }
}
