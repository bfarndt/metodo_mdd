package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_ActionClassjava implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_ActionClassjava(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_2_9 = new TagInfo("c:get", //$NON-NLS-1$
            2, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@actionsPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_22 = new TagInfo("c:get", //$NON-NLS-1$
            9, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@defaultDAOFactoryProviderClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_8 = new TagInfo("c:get", //$NON-NLS-1$
            10, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@fullDaoClassName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_8 = new TagInfo("c:get", //$NON-NLS-1$
            11, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@fullBeanName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_14 = new TagInfo("c:get", //$NON-NLS-1$
            13, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@actionClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_32 = new TagInfo("c:get", //$NON-NLS-1$
            14, 32,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@editPageConstant", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_82 = new TagInfo("c:get", //$NON-NLS-1$
            14, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@editPagePath", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_32 = new TagInfo("c:get", //$NON-NLS-1$
            15, 32,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@listPageConstant", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_82 = new TagInfo("c:get", //$NON-NLS-1$
            15, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@listPagePath", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_32 = new TagInfo("c:get", //$NON-NLS-1$
            16, 32,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@listPageForSelectionConstant", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_19 = new TagInfo("c:get", //$NON-NLS-1$
            18, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@loadFormAction", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_16 = new TagInfo("c:get", //$NON-NLS-1$
            19, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_83 = new TagInfo("c:get", //$NON-NLS-1$
            19, 83,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_21_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            21, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/attributes", //$NON-NLS-1$
                "attribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_22_13 = new TagInfo("c:if", //$NON-NLS-1$
            22, 13,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldType = 'IMAGE'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_43 = new TagInfo("c:get", //$NON-NLS-1$
            23, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_77 = new TagInfo("c:get", //$NON-NLS-1$
            23, 77,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_43 = new TagInfo("c:get", //$NON-NLS-1$
            24, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_77 = new TagInfo("c:get", //$NON-NLS-1$
            24, 77,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_12 = new TagInfo("c:get", //$NON-NLS-1$
            28, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_13 = new TagInfo("c:get", //$NON-NLS-1$
            29, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idFieldType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_55 = new TagInfo("c:get", //$NON-NLS-1$
            29, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_95 = new TagInfo("c:get", //$NON-NLS-1$
            29, 95,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idFieldTypeFromStringMethod", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_153 = new TagInfo("c:get", //$NON-NLS-1$
            29, 153,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_13 = new TagInfo("c:get", //$NON-NLS-1$
            30, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@daoClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_58 = new TagInfo("c:get", //$NON-NLS-1$
            30, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@defaultDAOFactoryProviderClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_161 = new TagInfo("c:get", //$NON-NLS-1$
            30, 161,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@daoClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_13 = new TagInfo("c:get", //$NON-NLS-1$
            31, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_48 = new TagInfo("c:get", //$NON-NLS-1$
            31, 48,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_100 = new TagInfo("c:get", //$NON-NLS-1$
            31, 100,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_135 = new TagInfo("c:get", //$NON-NLS-1$
            31, 135,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_16 = new TagInfo("c:get", //$NON-NLS-1$
            32, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_35 = new TagInfo("c:get", //$NON-NLS-1$
            33, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_79 = new TagInfo("c:get", //$NON-NLS-1$
            33, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_35_17 = new TagInfo("c:iterate", //$NON-NLS-1$
            35, 17,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/attributes", //$NON-NLS-1$
                "attribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_36_21 = new TagInfo("c:if", //$NON-NLS-1$
            36, 21,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldType = 'IMAGE'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_48 = new TagInfo("c:get", //$NON-NLS-1$
            37, 48,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_82 = new TagInfo("c:get", //$NON-NLS-1$
            37, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_130 = new TagInfo("c:get", //$NON-NLS-1$
            37, 130,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_173 = new TagInfo("c:get", //$NON-NLS-1$
            37, 173,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@javaGetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_48 = new TagInfo("c:get", //$NON-NLS-1$
            38, 48,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_82 = new TagInfo("c:get", //$NON-NLS-1$
            38, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_119 = new TagInfo("c:get", //$NON-NLS-1$
            38, 119,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_162 = new TagInfo("c:get", //$NON-NLS-1$
            38, 162,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@javaGetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_16 = new TagInfo("c:get", //$NON-NLS-1$
            45, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@editPageConstant", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_19 = new TagInfo("c:get", //$NON-NLS-1$
            48, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@deleteAction", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_16 = new TagInfo("c:get", //$NON-NLS-1$
            49, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_83 = new TagInfo("c:get", //$NON-NLS-1$
            49, 83,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_9 = new TagInfo("c:get", //$NON-NLS-1$
            50, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@daoClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_54 = new TagInfo("c:get", //$NON-NLS-1$
            50, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@defaultDAOFactoryProviderClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_157 = new TagInfo("c:get", //$NON-NLS-1$
            50, 157,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@daoClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_9 = new TagInfo("c:get", //$NON-NLS-1$
            52, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idFieldType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_51 = new TagInfo("c:get", //$NON-NLS-1$
            52, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_91 = new TagInfo("c:get", //$NON-NLS-1$
            52, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idFieldTypeFromStringMethod", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_149 = new TagInfo("c:get", //$NON-NLS-1$
            52, 149,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_36 = new TagInfo("c:get", //$NON-NLS-1$
            53, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_71 = new TagInfo("c:get", //$NON-NLS-1$
            53, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_42 = new TagInfo("c:get", //$NON-NLS-1$
            56, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@fullBeanName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_58_43 = new TagInfo("c:get", //$NON-NLS-1$
            58, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@fullBeanName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_16 = new TagInfo("c:get", //$NON-NLS-1$
            60, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@showAllAction", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_19 = new TagInfo("c:get", //$NON-NLS-1$
            63, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@saveAction", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_16 = new TagInfo("c:get", //$NON-NLS-1$
            64, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_83 = new TagInfo("c:get", //$NON-NLS-1$
            64, 83,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_65_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            65, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/attributes", //$NON-NLS-1$
                "attribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_66_13 = new TagInfo("c:if", //$NON-NLS-1$
            66, 13,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($attribute/@fieldType = 'IMAGE' or $attribute/@isImageContentType = 'true')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_16 = new TagInfo("c:get", //$NON-NLS-1$
            67, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_81 = new TagInfo("c:get", //$NON-NLS-1$
            67, 81,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_69_13 = new TagInfo("c:if", //$NON-NLS-1$
            69, 13,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldType = 'IMAGE'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_70_16 = new TagInfo("c:get", //$NON-NLS-1$
            70, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_70_103 = new TagInfo("c:get", //$NON-NLS-1$
            70, 103,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_70_137 = new TagInfo("c:get", //$NON-NLS-1$
            70, 137,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_12 = new TagInfo("c:get", //$NON-NLS-1$
            71, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_66 = new TagInfo("c:get", //$NON-NLS-1$
            71, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_16 = new TagInfo("c:get", //$NON-NLS-1$
            72, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_114 = new TagInfo("c:get", //$NON-NLS-1$
            72, 114,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_148 = new TagInfo("c:get", //$NON-NLS-1$
            72, 148,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_75_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            75, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/referenceList", //$NON-NLS-1$
                "reference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_76_16 = new TagInfo("c:get", //$NON-NLS-1$
            76, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_76_81 = new TagInfo("c:get", //$NON-NLS-1$
            76, 81,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_9 = new TagInfo("c:get", //$NON-NLS-1$
            79, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_44 = new TagInfo("c:get", //$NON-NLS-1$
            79, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_94 = new TagInfo("c:get", //$NON-NLS-1$
            79, 94,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_129 = new TagInfo("c:get", //$NON-NLS-1$
            79, 129,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_79_177 = new TagInfo("c:iterate", //$NON-NLS-1$
            79, 177,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$userType/attributes", //$NON-NLS-1$
                "attribute", //$NON-NLS-1$
                ", ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_80_10 = new TagInfo("c:get", //$NON-NLS-1$
            80, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_81_10 = new TagInfo("c:iterate", //$NON-NLS-1$
            81, 10,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/referenceList", //$NON-NLS-1$
                "reference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_81_72 = new TagInfo("c:get", //$NON-NLS-1$
            81, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_83_9 = new TagInfo("c:get", //$NON-NLS-1$
            83, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@daoClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_83_54 = new TagInfo("c:get", //$NON-NLS-1$
            83, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@defaultDAOFactoryProviderClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_83_157 = new TagInfo("c:get", //$NON-NLS-1$
            83, 157,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@daoClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_42 = new TagInfo("c:get", //$NON-NLS-1$
            84, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_77 = new TagInfo("c:get", //$NON-NLS-1$
            84, 77,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_87_42 = new TagInfo("c:get", //$NON-NLS-1$
            87, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@fullBeanName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_89_43 = new TagInfo("c:get", //$NON-NLS-1$
            89, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@fullBeanName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_91_16 = new TagInfo("c:get", //$NON-NLS-1$
            91, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@showAllAction", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_94_19 = new TagInfo("c:get", //$NON-NLS-1$
            94, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@showAllAction", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_95_9 = new TagInfo("c:get", //$NON-NLS-1$
            95, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@daoClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_95_54 = new TagInfo("c:get", //$NON-NLS-1$
            95, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@defaultDAOFactoryProviderClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_95_157 = new TagInfo("c:get", //$NON-NLS-1$
            95, 157,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@daoClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_97_14 = new TagInfo("c:get", //$NON-NLS-1$
            97, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_97_53 = new TagInfo("c:get", //$NON-NLS-1$
            97, 53,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_97_101 = new TagInfo("c:get", //$NON-NLS-1$
            97, 101,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_99_30 = new TagInfo("c:get", //$NON-NLS-1$
            99, 30,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_99_71 = new TagInfo("c:get", //$NON-NLS-1$
            99, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_101_16 = new TagInfo("c:get", //$NON-NLS-1$
            101, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@listPageConstant", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_104_19 = new TagInfo("c:get", //$NON-NLS-1$
            104, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@showAllForSelectionAction", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_105_9 = new TagInfo("c:get", //$NON-NLS-1$
            105, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@daoClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_105_54 = new TagInfo("c:get", //$NON-NLS-1$
            105, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@defaultDAOFactoryProviderClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_105_157 = new TagInfo("c:get", //$NON-NLS-1$
            105, 157,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@daoClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_107_14 = new TagInfo("c:get", //$NON-NLS-1$
            107, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_107_53 = new TagInfo("c:get", //$NON-NLS-1$
            107, 53,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_107_101 = new TagInfo("c:get", //$NON-NLS-1$
            107, 101,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_109_44 = new TagInfo("c:get", //$NON-NLS-1$
            109, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_111_58 = new TagInfo("c:get", //$NON-NLS-1$
            111, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@fullBeanName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_112_47 = new TagInfo("c:get", //$NON-NLS-1$
            112, 47,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@fullBeanName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_114_16 = new TagInfo("c:get", //$NON-NLS-1$
            114, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@listPageForSelectionConstant", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_117_13 = new TagInfo("c:get", //$NON-NLS-1$
            117, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_117_53 = new TagInfo("c:get", //$NON-NLS-1$
            117, 53,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_117_95 = new TagInfo("c:get", //$NON-NLS-1$
            117, 95,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_117_143 = new TagInfo("c:iterate", //$NON-NLS-1$
            117, 143,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$userType/attributes", //$NON-NLS-1$
                "attribute", //$NON-NLS-1$
                ", ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_118_10 = new TagInfo("c:if", //$NON-NLS-1$
            118, 10,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($attribute/@fieldType = 'IMAGE')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_120_10 = new TagInfo("c:if", //$NON-NLS-1$
            120, 10,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldType = 'IMAGE'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_121_11 = new TagInfo("c:get", //$NON-NLS-1$
            121, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_122_10 = new TagInfo("c:iterate", //$NON-NLS-1$
            122, 10,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/referenceList", //$NON-NLS-1$
                "reference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_122_79 = new TagInfo("c:get", //$NON-NLS-1$
            122, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_123_9 = new TagInfo("c:get", //$NON-NLS-1$
            123, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_123_44 = new TagInfo("c:get", //$NON-NLS-1$
            123, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_123_93 = new TagInfo("c:get", //$NON-NLS-1$
            123, 93,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_124_12 = new TagInfo("c:get", //$NON-NLS-1$
            124, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_124_70 = new TagInfo("c:get", //$NON-NLS-1$
            124, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_125_13 = new TagInfo("c:get", //$NON-NLS-1$
            125, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_125_56 = new TagInfo("c:get", //$NON-NLS-1$
            125, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idFieldSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_125_100 = new TagInfo("c:get", //$NON-NLS-1$
            125, 100,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idFieldTypeFromStringMethod", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_125_158 = new TagInfo("c:get", //$NON-NLS-1$
            125, 158,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_127_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            127, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/attributes", //$NON-NLS-1$
                "attribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_128_3 = new TagInfo("c:if", //$NON-NLS-1$
            128, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldType = 'TEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_129_3 = new TagInfo("c:get", //$NON-NLS-1$
            129, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_129_46 = new TagInfo("c:get", //$NON-NLS-1$
            129, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@javaSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_129_88 = new TagInfo("c:get", //$NON-NLS-1$
            129, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_131_3 = new TagInfo("c:if", //$NON-NLS-1$
            131, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldType = 'PASSWORD'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_132_3 = new TagInfo("c:get", //$NON-NLS-1$
            132, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_132_46 = new TagInfo("c:get", //$NON-NLS-1$
            132, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@javaSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_132_88 = new TagInfo("c:get", //$NON-NLS-1$
            132, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_134_9 = new TagInfo("c:if", //$NON-NLS-1$
            134, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldType = 'INT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_135_9 = new TagInfo("c:get", //$NON-NLS-1$
            135, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_135_52 = new TagInfo("c:get", //$NON-NLS-1$
            135, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@javaSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_135_111 = new TagInfo("c:get", //$NON-NLS-1$
            135, 111,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_137_9 = new TagInfo("c:if", //$NON-NLS-1$
            137, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldType = 'LONG'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_138_9 = new TagInfo("c:get", //$NON-NLS-1$
            138, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_138_52 = new TagInfo("c:get", //$NON-NLS-1$
            138, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@javaSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_138_109 = new TagInfo("c:get", //$NON-NLS-1$
            138, 109,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_140_9 = new TagInfo("c:if", //$NON-NLS-1$
            140, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldType = 'REAL'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_141_9 = new TagInfo("c:get", //$NON-NLS-1$
            141, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_141_52 = new TagInfo("c:get", //$NON-NLS-1$
            141, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@javaSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_141_111 = new TagInfo("c:get", //$NON-NLS-1$
            141, 111,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_143_9 = new TagInfo("c:if", //$NON-NLS-1$
            143, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldType = 'CURRENCY'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_144_9 = new TagInfo("c:get", //$NON-NLS-1$
            144, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_144_52 = new TagInfo("c:get", //$NON-NLS-1$
            144, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@javaSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_144_111 = new TagInfo("c:get", //$NON-NLS-1$
            144, 111,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_146_3 = new TagInfo("c:if", //$NON-NLS-1$
            146, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldType = 'DATE'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_148_16 = new TagInfo("c:get", //$NON-NLS-1$
            148, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_148_72 = new TagInfo("c:get", //$NON-NLS-1$
            148, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_150_17 = new TagInfo("c:get", //$NON-NLS-1$
            150, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_150_60 = new TagInfo("c:get", //$NON-NLS-1$
            150, 60,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@javaSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_150_112 = new TagInfo("c:get", //$NON-NLS-1$
            150, 112,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_157_9 = new TagInfo("c:if", //$NON-NLS-1$
            157, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldType = 'IMAGE'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_158_9 = new TagInfo("c:get", //$NON-NLS-1$
            158, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_158_52 = new TagInfo("c:get", //$NON-NLS-1$
            158, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@javaSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_158_94 = new TagInfo("c:get", //$NON-NLS-1$
            158, 94,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_162_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            162, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/referenceList", //$NON-NLS-1$
                "reference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_163_12 = new TagInfo("c:get", //$NON-NLS-1$
            163, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_163_68 = new TagInfo("c:get", //$NON-NLS-1$
            163, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_164_13 = new TagInfo("c:get", //$NON-NLS-1$
            164, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/referencedType/@fullBeanName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_164_72 = new TagInfo("c:get", //$NON-NLS-1$
            164, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_164_114 = new TagInfo("c:get", //$NON-NLS-1$
            164, 114,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/referencedType/@fullBeanName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_165_13 = new TagInfo("c:get", //$NON-NLS-1$
            165, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_165_49 = new TagInfo("c:get", //$NON-NLS-1$
            165, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/referencedType/@idFieldSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_165_124 = new TagInfo("c:get", //$NON-NLS-1$
            165, 124,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_166_13 = new TagInfo("c:get", //$NON-NLS-1$
            166, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_166_56 = new TagInfo("c:get", //$NON-NLS-1$
            166, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@javaSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_166_98 = new TagInfo("c:get", //$NON-NLS-1$
            166, 98,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_170_16 = new TagInfo("c:get", //$NON-NLS-1$
            170, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        // Selected variable: userType 
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(37);
        out.write(NL);         
        out.write("package ");  //$NON-NLS-1$        
        out.setTag("get",46,98);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(52);
        RuntimeTagElement _jettag_c_get_2_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_2_9.setRuntimeParent(null);
        _jettag_c_get_2_9.setTagInfo(_td_c_get_2_9);
        _jettag_c_get_2_9.doStart(context, out);
        _jettag_c_get_2_9.doEnd();
        out.setTag(null,-1,-1);
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import java.util.List;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import javax.servlet.http.HttpServletRequest;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import javax.servlet.http.HttpServletResponse;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import core.database.");  //$NON-NLS-1$        
        out.setTag("get",240,308);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(68);
        RuntimeTagElement _jettag_c_get_9_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_22); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_22.setRuntimeParent(null);
        _jettag_c_get_9_22.setTagInfo(_td_c_get_9_22);
        _jettag_c_get_9_22.doStart(context, out);
        _jettag_c_get_9_22.doEnd();
        out.setTag(null,-1,-1);
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        out.setTag("get",317,363);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_10_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_10_8.setRuntimeParent(null);
        _jettag_c_get_10_8.setTagInfo(_td_c_get_10_8);
        _jettag_c_get_10_8.doStart(context, out);
        _jettag_c_get_10_8.doEnd();
        out.setTag(null,-1,-1);
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        out.setTag("get",372,414);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_11_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_8.setRuntimeParent(null);
        _jettag_c_get_11_8.setTagInfo(_td_c_get_11_8);
        _jettag_c_get_11_8.doStart(context, out);
        _jettag_c_get_11_8.doEnd();
        out.setTag(null,-1,-1);
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("public class ");  //$NON-NLS-1$        
        out.setTag("get",430,471);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(41);
        RuntimeTagElement _jettag_c_get_13_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_13_14.setRuntimeParent(null);
        _jettag_c_get_13_14.setTagInfo(_td_c_get_13_14);
        _jettag_c_get_13_14.doStart(context, out);
        _jettag_c_get_13_14.doEnd();
        out.setTag(null,-1,-1);
        out.write(" {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public final static String ");  //$NON-NLS-1$        
        out.setTag("get",505,551);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_14_32 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_32); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_14_32.setRuntimeParent(null);
        _jettag_c_get_14_32.setTagInfo(_td_c_get_14_32);
        _jettag_c_get_14_32.doStart(context, out);
        _jettag_c_get_14_32.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = \"");  //$NON-NLS-1$        
        out.setTag("get",555,597);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_14_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_82); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_14_82.setRuntimeParent(null);
        _jettag_c_get_14_82.setTagInfo(_td_c_get_14_82);
        _jettag_c_get_14_82.doStart(context, out);
        _jettag_c_get_14_82.doEnd();
        out.setTag(null,-1,-1);
        out.write("\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public final static String ");  //$NON-NLS-1$        
        out.setTag("get",631,677);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_15_32 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_32); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_15_32.setRuntimeParent(null);
        _jettag_c_get_15_32.setTagInfo(_td_c_get_15_32);
        _jettag_c_get_15_32.doStart(context, out);
        _jettag_c_get_15_32.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = \"");  //$NON-NLS-1$        
        out.setTag("get",681,723);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_15_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_82); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_15_82.setRuntimeParent(null);
        _jettag_c_get_15_82.setTagInfo(_td_c_get_15_82);
        _jettag_c_get_15_82.doStart(context, out);
        _jettag_c_get_15_82.doEnd();
        out.setTag(null,-1,-1);
        out.write("\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public final static String ");  //$NON-NLS-1$        
        out.setTag("get",757,815);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(58);
        RuntimeTagElement _jettag_c_get_16_32 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_32); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_16_32.setRuntimeParent(null);
        _jettag_c_get_16_32.setTagInfo(_td_c_get_16_32);
        _jettag_c_get_16_32.doStart(context, out);
        _jettag_c_get_16_32.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = \"popups/selectReferenceForm.jsp\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    public String ");  //$NON-NLS-1$        
        out.setTag("get",871,915);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_18_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_19); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_18_19.setRuntimeParent(null);
        _jettag_c_get_18_19.setTagInfo(_td_c_get_18_19);
        _jettag_c_get_18_19.doStart(context, out);
        _jettag_c_get_18_19.doEnd();
        out.setTag(null,-1,-1);
        out.write("(HttpServletRequest req, HttpServletResponse resp) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        String ");  //$NON-NLS-1$        
        out.setTag("get",983,1020);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_19_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_19_16.setRuntimeParent(null);
        _jettag_c_get_19_16.setTagInfo(_td_c_get_19_16);
        _jettag_c_get_19_16.doStart(context, out);
        _jettag_c_get_19_16.doEnd();
        out.setTag(null,-1,-1);
        out.write("Parameter = req.getParameter(\"");  //$NON-NLS-1$        
        out.setTag("get",1050,1087);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_19_83 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_83); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_19_83.setRuntimeParent(null);
        _jettag_c_get_19_83.setTagInfo(_td_c_get_19_83);
        _jettag_c_get_19_83.doStart(context, out);
        _jettag_c_get_19_83.doEnd();
        out.setTag(null,-1,-1);
        out.write("\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(57);
        out.setTag("iterate",1108,1165);
        RuntimeTagElement _jettag_c_iterate_21_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_21_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_21_9.setRuntimeParent(null);
        _jettag_c_iterate_21_9.setTagInfo(_td_c_iterate_21_9);
        _jettag_c_iterate_21_9.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_21_9.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_21_9.getTagInfo().getAttribute("delimiter"),1108,1165);
            out.loopIterate();
            out.write(NL);         
            out.write("            ");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(45);
            out.setTag("if",1178,1223);
            RuntimeTagElement _jettag_c_if_22_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_22_13); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_22_13.setRuntimeParent(_jettag_c_iterate_21_9);
            _jettag_c_if_22_13.setTagInfo(_td_c_if_22_13);
            _jettag_c_if_22_13.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_22_13.okToProcessBody()) {
                out.write(NL);         
                out.write("        req.getSession().removeAttribute(\"");  //$NON-NLS-1$        
                out.setTag("get",1266,1300);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(34);
                RuntimeTagElement _jettag_c_get_23_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_43); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_23_43.setRuntimeParent(_jettag_c_if_22_13);
                _jettag_c_get_23_43.setTagInfo(_td_c_get_23_43);
                _jettag_c_get_23_43.doStart(context, out);
                _jettag_c_get_23_43.doEnd();
                out.setTag(null,-1,-1);
                out.setTag("get",1300,1335);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_23_77 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_77); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_23_77.setRuntimeParent(_jettag_c_if_22_13);
                _jettag_c_get_23_77.setTagInfo(_td_c_get_23_77);
                _jettag_c_get_23_77.doStart(context, out);
                _jettag_c_get_23_77.doEnd();
                out.setTag(null,-1,-1);
                out.write("ContentType\");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        req.getSession().removeAttribute(\"");  //$NON-NLS-1$        
                out.setTag("get",1392,1426);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(34);
                RuntimeTagElement _jettag_c_get_24_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_43); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_24_43.setRuntimeParent(_jettag_c_if_22_13);
                _jettag_c_get_24_43.setTagInfo(_td_c_get_24_43);
                _jettag_c_get_24_43.doStart(context, out);
                _jettag_c_get_24_43.doEnd();
                out.setTag(null,-1,-1);
                out.setTag("get",1426,1461);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_24_77 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_77); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_24_77.setRuntimeParent(_jettag_c_if_22_13);
                _jettag_c_get_24_77.setTagInfo(_td_c_get_24_77);
                _jettag_c_get_24_77.doStart(context, out);
                _jettag_c_get_24_77.doEnd();
                out.setTag(null,-1,-1);
                out.write("\");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            ");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_22_13.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_22_13.doEnd();
            out.endTag("if",254);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("        ");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_21_9.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_21_9.doEnd();
        out.loopEnd();
        out.endTag("iterate",328);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if(");  //$NON-NLS-1$        
        out.setTag("get",1526,1563);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_28_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_28_12.setRuntimeParent(null);
        _jettag_c_get_28_12.setTagInfo(_td_c_get_28_12);
        _jettag_c_get_28_12.doStart(context, out);
        _jettag_c_get_28_12.doEnd();
        out.setTag(null,-1,-1);
        out.write("Parameter != null) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ");  //$NON-NLS-1$        
        out.setTag("get",1596,1637);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(41);
        RuntimeTagElement _jettag_c_get_29_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_29_13.setRuntimeParent(null);
        _jettag_c_get_29_13.setTagInfo(_td_c_get_29_13);
        _jettag_c_get_29_13.doStart(context, out);
        _jettag_c_get_29_13.doEnd();
        out.setTag(null,-1,-1);
        out.write(" ");  //$NON-NLS-1$        
        out.setTag("get",1638,1675);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_29_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_55); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_29_55.setRuntimeParent(null);
        _jettag_c_get_29_55.setTagInfo(_td_c_get_29_55);
        _jettag_c_get_29_55.doStart(context, out);
        _jettag_c_get_29_55.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = ");  //$NON-NLS-1$        
        out.setTag("get",1678,1735);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(57);
        RuntimeTagElement _jettag_c_get_29_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_95); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_29_95.setRuntimeParent(null);
        _jettag_c_get_29_95.setTagInfo(_td_c_get_29_95);
        _jettag_c_get_29_95.doStart(context, out);
        _jettag_c_get_29_95.doEnd();
        out.setTag(null,-1,-1);
        out.write("(");  //$NON-NLS-1$        
        out.setTag("get",1736,1773);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_29_153 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_153); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_29_153.setRuntimeParent(null);
        _jettag_c_get_29_153.setTagInfo(_td_c_get_29_153);
        _jettag_c_get_29_153.doStart(context, out);
        _jettag_c_get_29_153.doEnd();
        out.setTag(null,-1,-1);
        out.write("Parameter);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ");  //$NON-NLS-1$        
        out.setTag("get",1797,1835);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(38);
        RuntimeTagElement _jettag_c_get_30_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_30_13.setRuntimeParent(null);
        _jettag_c_get_30_13.setTagInfo(_td_c_get_30_13);
        _jettag_c_get_30_13.doStart(context, out);
        _jettag_c_get_30_13.doEnd();
        out.setTag(null,-1,-1);
        out.write(" dao = ");  //$NON-NLS-1$        
        out.setTag("get",1842,1910);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(68);
        RuntimeTagElement _jettag_c_get_30_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_58); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_30_58.setRuntimeParent(null);
        _jettag_c_get_30_58.setTagInfo(_td_c_get_30_58);
        _jettag_c_get_30_58.doStart(context, out);
        _jettag_c_get_30_58.doEnd();
        out.setTag(null,-1,-1);
        out.write(".getDefaultDAOFactoryInstance().get");  //$NON-NLS-1$        
        out.setTag("get",1945,1983);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(38);
        RuntimeTagElement _jettag_c_get_30_161 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_161); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_30_161.setRuntimeParent(null);
        _jettag_c_get_30_161.setTagInfo(_td_c_get_30_161);
        _jettag_c_get_30_161.doStart(context, out);
        _jettag_c_get_30_161.doEnd();
        out.setTag(null,-1,-1);
        out.write("();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ");  //$NON-NLS-1$        
        out.setTag("get",1999,2033);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_31_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_31_13.setRuntimeParent(null);
        _jettag_c_get_31_13.setTagInfo(_td_c_get_31_13);
        _jettag_c_get_31_13.doStart(context, out);
        _jettag_c_get_31_13.doEnd();
        out.setTag(null,-1,-1);
        out.write(" ");  //$NON-NLS-1$        
        out.setTag("get",2034,2076);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_31_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_48); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_31_48.setRuntimeParent(null);
        _jettag_c_get_31_48.setTagInfo(_td_c_get_31_48);
        _jettag_c_get_31_48.doStart(context, out);
        _jettag_c_get_31_48.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = dao.get");  //$NON-NLS-1$        
        out.setTag("get",2086,2120);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_31_100 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_100); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_31_100.setRuntimeParent(null);
        _jettag_c_get_31_100.setTagInfo(_td_c_get_31_100);
        _jettag_c_get_31_100.doStart(context, out);
        _jettag_c_get_31_100.doEnd();
        out.setTag(null,-1,-1);
        out.write("(");  //$NON-NLS-1$        
        out.setTag("get",2121,2158);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_31_135 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_135); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_31_135.setRuntimeParent(null);
        _jettag_c_get_31_135.setTagInfo(_td_c_get_31_135);
        _jettag_c_get_31_135.doStart(context, out);
        _jettag_c_get_31_135.doEnd();
        out.setTag(null,-1,-1);
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            if(");  //$NON-NLS-1$        
        out.setTag("get",2176,2218);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_32_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_32_16.setRuntimeParent(null);
        _jettag_c_get_32_16.setTagInfo(_td_c_get_32_16);
        _jettag_c_get_32_16.doStart(context, out);
        _jettag_c_get_32_16.doEnd();
        out.setTag(null,-1,-1);
        out.write(" != null) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                req.setAttribute(\"");  //$NON-NLS-1$        
        out.setTag("get",2264,2306);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_33_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_35); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_33_35.setRuntimeParent(null);
        _jettag_c_get_33_35.setTagInfo(_td_c_get_33_35);
        _jettag_c_get_33_35.doStart(context, out);
        _jettag_c_get_33_35.doEnd();
        out.setTag(null,-1,-1);
        out.write("\",");  //$NON-NLS-1$        
        out.setTag("get",2308,2350);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_33_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_79); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_33_79.setRuntimeParent(null);
        _jettag_c_get_33_79.setTagInfo(_td_c_get_33_79);
        _jettag_c_get_33_79.doStart(context, out);
        _jettag_c_get_33_79.doEnd();
        out.setTag(null,-1,-1);
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(57);
        out.setTag("iterate",2370,2427);
        RuntimeTagElement _jettag_c_iterate_35_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_35_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_35_17.setRuntimeParent(null);
        _jettag_c_iterate_35_17.setTagInfo(_td_c_iterate_35_17);
        _jettag_c_iterate_35_17.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_35_17.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_35_17.getTagInfo().getAttribute("delimiter"),2370,2427);
            out.loopIterate();
            out.write(NL);         
            out.write("                    ");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(45);
            out.setTag("if",2448,2493);
            RuntimeTagElement _jettag_c_if_36_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_36_21); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_36_21.setRuntimeParent(_jettag_c_iterate_35_17);
            _jettag_c_if_36_21.setTagInfo(_td_c_if_36_21);
            _jettag_c_if_36_21.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_36_21.okToProcessBody()) {
                out.write(NL);         
                out.write("                req.getSession().setAttribute(\"");  //$NON-NLS-1$        
                out.setTag("get",2541,2575);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(34);
                RuntimeTagElement _jettag_c_get_37_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_48); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_37_48.setRuntimeParent(_jettag_c_if_36_21);
                _jettag_c_get_37_48.setTagInfo(_td_c_get_37_48);
                _jettag_c_get_37_48.doStart(context, out);
                _jettag_c_get_37_48.doEnd();
                out.setTag(null,-1,-1);
                out.setTag("get",2575,2610);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_37_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_82); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_37_82.setRuntimeParent(_jettag_c_if_36_21);
                _jettag_c_get_37_82.setTagInfo(_td_c_get_37_82);
                _jettag_c_get_37_82.doStart(context, out);
                _jettag_c_get_37_82.doEnd();
                out.setTag(null,-1,-1);
                out.write("ContentType\",");  //$NON-NLS-1$        
                out.setTag("get",2623,2665);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(42);
                RuntimeTagElement _jettag_c_get_37_130 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_130); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_37_130.setRuntimeParent(_jettag_c_if_36_21);
                _jettag_c_get_37_130.setTagInfo(_td_c_get_37_130);
                _jettag_c_get_37_130.doStart(context, out);
                _jettag_c_get_37_130.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",2666,2707);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(41);
                RuntimeTagElement _jettag_c_get_37_173 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_173); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_37_173.setRuntimeParent(_jettag_c_if_36_21);
                _jettag_c_get_37_173.setTagInfo(_td_c_get_37_173);
                _jettag_c_get_37_173.doStart(context, out);
                _jettag_c_get_37_173.doEnd();
                out.setTag(null,-1,-1);
                out.write("ContentType());");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("                req.getSession().setAttribute(\"");  //$NON-NLS-1$        
                out.setTag("get",2770,2804);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(34);
                RuntimeTagElement _jettag_c_get_38_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_48); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_38_48.setRuntimeParent(_jettag_c_if_36_21);
                _jettag_c_get_38_48.setTagInfo(_td_c_get_38_48);
                _jettag_c_get_38_48.doStart(context, out);
                _jettag_c_get_38_48.doEnd();
                out.setTag(null,-1,-1);
                out.setTag("get",2804,2839);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_38_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_82); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_38_82.setRuntimeParent(_jettag_c_if_36_21);
                _jettag_c_get_38_82.setTagInfo(_td_c_get_38_82);
                _jettag_c_get_38_82.doStart(context, out);
                _jettag_c_get_38_82.doEnd();
                out.setTag(null,-1,-1);
                out.write("\",");  //$NON-NLS-1$        
                out.setTag("get",2841,2883);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(42);
                RuntimeTagElement _jettag_c_get_38_119 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_119); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_38_119.setRuntimeParent(_jettag_c_if_36_21);
                _jettag_c_get_38_119.setTagInfo(_td_c_get_38_119);
                _jettag_c_get_38_119.doStart(context, out);
                _jettag_c_get_38_119.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",2884,2925);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(41);
                RuntimeTagElement _jettag_c_get_38_162 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_162); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_38_162.setRuntimeParent(_jettag_c_if_36_21);
                _jettag_c_get_38_162.setTagInfo(_td_c_get_38_162);
                _jettag_c_get_38_162.doStart(context, out);
                _jettag_c_get_38_162.doEnd();
                out.setTag(null,-1,-1);
                out.write("());");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("                    ");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_36_21.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_36_21.doEnd();
            out.endTag("if",457);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("                ");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_35_17.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_35_17.doEnd();
        out.loopEnd();
        out.endTag("iterate",547);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        return ");  //$NON-NLS-1$        
        out.setTag("get",3036,3082);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_45_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_45_16.setRuntimeParent(null);
        _jettag_c_get_45_16.setTagInfo(_td_c_get_45_16);
        _jettag_c_get_45_16.doStart(context, out);
        _jettag_c_get_45_16.doEnd();
        out.setTag(null,-1,-1);
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public String ");  //$NON-NLS-1$        
        out.setTag("get",3113,3155);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_48_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_19); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_48_19.setRuntimeParent(null);
        _jettag_c_get_48_19.setTagInfo(_td_c_get_48_19);
        _jettag_c_get_48_19.doStart(context, out);
        _jettag_c_get_48_19.doEnd();
        out.setTag(null,-1,-1);
        out.write("(HttpServletRequest req, HttpServletResponse resp) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        String ");  //$NON-NLS-1$        
        out.setTag("get",3223,3260);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_49_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_49_16.setRuntimeParent(null);
        _jettag_c_get_49_16.setTagInfo(_td_c_get_49_16);
        _jettag_c_get_49_16.doStart(context, out);
        _jettag_c_get_49_16.doEnd();
        out.setTag(null,-1,-1);
        out.write("Parameter = req.getParameter(\"");  //$NON-NLS-1$        
        out.setTag("get",3290,3327);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_49_83 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_83); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_49_83.setRuntimeParent(null);
        _jettag_c_get_49_83.setTagInfo(_td_c_get_49_83);
        _jettag_c_get_49_83.doStart(context, out);
        _jettag_c_get_49_83.doEnd();
        out.setTag(null,-1,-1);
        out.write("\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.setTag("get",3339,3377);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(38);
        RuntimeTagElement _jettag_c_get_50_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_50_9.setRuntimeParent(null);
        _jettag_c_get_50_9.setTagInfo(_td_c_get_50_9);
        _jettag_c_get_50_9.doStart(context, out);
        _jettag_c_get_50_9.doEnd();
        out.setTag(null,-1,-1);
        out.write(" dao = ");  //$NON-NLS-1$        
        out.setTag("get",3384,3452);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(68);
        RuntimeTagElement _jettag_c_get_50_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_54); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_50_54.setRuntimeParent(null);
        _jettag_c_get_50_54.setTagInfo(_td_c_get_50_54);
        _jettag_c_get_50_54.doStart(context, out);
        _jettag_c_get_50_54.doEnd();
        out.setTag(null,-1,-1);
        out.write(".getDefaultDAOFactoryInstance().get");  //$NON-NLS-1$        
        out.setTag("get",3487,3525);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(38);
        RuntimeTagElement _jettag_c_get_50_157 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_157); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_50_157.setRuntimeParent(null);
        _jettag_c_get_50_157.setTagInfo(_td_c_get_50_157);
        _jettag_c_get_50_157.doStart(context, out);
        _jettag_c_get_50_157.doEnd();
        out.setTag(null,-1,-1);
        out.write("();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.setTag("get",3546,3587);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(41);
        RuntimeTagElement _jettag_c_get_52_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_52_9.setRuntimeParent(null);
        _jettag_c_get_52_9.setTagInfo(_td_c_get_52_9);
        _jettag_c_get_52_9.doStart(context, out);
        _jettag_c_get_52_9.doEnd();
        out.setTag(null,-1,-1);
        out.write(" ");  //$NON-NLS-1$        
        out.setTag("get",3588,3625);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_52_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_51); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_52_51.setRuntimeParent(null);
        _jettag_c_get_52_51.setTagInfo(_td_c_get_52_51);
        _jettag_c_get_52_51.doStart(context, out);
        _jettag_c_get_52_51.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = ");  //$NON-NLS-1$        
        out.setTag("get",3628,3685);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(57);
        RuntimeTagElement _jettag_c_get_52_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_91); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_52_91.setRuntimeParent(null);
        _jettag_c_get_52_91.setTagInfo(_td_c_get_52_91);
        _jettag_c_get_52_91.doStart(context, out);
        _jettag_c_get_52_91.doEnd();
        out.setTag(null,-1,-1);
        out.write("(");  //$NON-NLS-1$        
        out.setTag("get",3686,3723);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_52_149 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_149); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_52_149.setRuntimeParent(null);
        _jettag_c_get_52_149.setTagInfo(_td_c_get_52_149);
        _jettag_c_get_52_149.doStart(context, out);
        _jettag_c_get_52_149.doEnd();
        out.setTag(null,-1,-1);
        out.write("Parameter);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        boolean result = dao.delete");  //$NON-NLS-1$        
        out.setTag("get",3770,3804);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_53_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_53_36.setRuntimeParent(null);
        _jettag_c_get_53_36.setTagInfo(_td_c_get_53_36);
        _jettag_c_get_53_36.doStart(context, out);
        _jettag_c_get_53_36.doEnd();
        out.setTag(null,-1,-1);
        out.write("(");  //$NON-NLS-1$        
        out.setTag("get",3805,3842);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_53_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_71); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_53_71.setRuntimeParent(null);
        _jettag_c_get_53_71.setTagInfo(_td_c_get_53_71);
        _jettag_c_get_53_71.doStart(context, out);
        _jettag_c_get_53_71.doEnd();
        out.setTag(null,-1,-1);
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if(result) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            req.setAttribute(\"message\", \"");  //$NON-NLS-1$        
        out.setTag("get",3916,3958);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_56_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_56_42); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_56_42.setRuntimeParent(null);
        _jettag_c_get_56_42.setTagInfo(_td_c_get_56_42);
        _jettag_c_get_56_42.doStart(context, out);
        _jettag_c_get_56_42.doEnd();
        out.setTag(null,-1,-1);
        out.write(".delete.ok\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        else req.setAttribute(\"message\", \"");  //$NON-NLS-1$        
        out.setTag("get",4024,4066);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_58_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_58_43); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_58_43.setRuntimeParent(null);
        _jettag_c_get_58_43.setTagInfo(_td_c_get_58_43);
        _jettag_c_get_58_43.doStart(context, out);
        _jettag_c_get_58_43.doEnd();
        out.setTag(null,-1,-1);
        out.write(".delete.failed\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        return ");  //$NON-NLS-1$        
        out.setTag("get",4108,4151);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(43);
        RuntimeTagElement _jettag_c_get_60_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_60_16.setRuntimeParent(null);
        _jettag_c_get_60_16.setTagInfo(_td_c_get_60_16);
        _jettag_c_get_60_16.doStart(context, out);
        _jettag_c_get_60_16.doEnd();
        out.setTag(null,-1,-1);
        out.write("(req,resp);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public String ");  //$NON-NLS-1$        
        out.setTag("get",4192,4232);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(40);
        RuntimeTagElement _jettag_c_get_63_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_19); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_63_19.setRuntimeParent(null);
        _jettag_c_get_63_19.setTagInfo(_td_c_get_63_19);
        _jettag_c_get_63_19.doStart(context, out);
        _jettag_c_get_63_19.doEnd();
        out.setTag(null,-1,-1);
        out.write("(HttpServletRequest req, HttpServletResponse resp) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        String ");  //$NON-NLS-1$        
        out.setTag("get",4300,4337);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_64_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_64_16.setRuntimeParent(null);
        _jettag_c_get_64_16.setTagInfo(_td_c_get_64_16);
        _jettag_c_get_64_16.doStart(context, out);
        _jettag_c_get_64_16.doEnd();
        out.setTag(null,-1,-1);
        out.write("Parameter = req.getParameter(\"");  //$NON-NLS-1$        
        out.setTag("get",4367,4404);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_64_83 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_83); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_64_83.setRuntimeParent(null);
        _jettag_c_get_64_83.setTagInfo(_td_c_get_64_83);
        _jettag_c_get_64_83.doStart(context, out);
        _jettag_c_get_64_83.doEnd();
        out.setTag(null,-1,-1);
        out.write("\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(57);
        out.setTag("iterate",4416,4473);
        RuntimeTagElement _jettag_c_iterate_65_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_65_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_65_9.setRuntimeParent(null);
        _jettag_c_iterate_65_9.setTagInfo(_td_c_iterate_65_9);
        _jettag_c_iterate_65_9.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_65_9.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_65_9.getTagInfo().getAttribute("delimiter"),4416,4473);
            out.loopIterate();
            out.write(NL);         
            out.write("            ");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(93);
            out.setTag("if",4486,4579);
            RuntimeTagElement _jettag_c_if_66_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_66_13); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_66_13.setRuntimeParent(_jettag_c_iterate_65_9);
            _jettag_c_if_66_13.setTagInfo(_td_c_if_66_13);
            _jettag_c_if_66_13.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_66_13.okToProcessBody()) {
                out.write(NL);         
                out.write("        String ");  //$NON-NLS-1$        
                out.setTag("get",4595,4630);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_67_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_67_16.setRuntimeParent(_jettag_c_if_66_13);
                _jettag_c_get_67_16.setTagInfo(_td_c_get_67_16);
                _jettag_c_get_67_16.doStart(context, out);
                _jettag_c_get_67_16.doEnd();
                out.setTag(null,-1,-1);
                out.write("Parameter = req.getParameter(\"");  //$NON-NLS-1$        
                out.setTag("get",4660,4695);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_67_81 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_81); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_67_81.setRuntimeParent(_jettag_c_if_66_13);
                _jettag_c_get_67_81.setTagInfo(_td_c_get_67_81);
                _jettag_c_get_67_81.doStart(context, out);
                _jettag_c_get_67_81.doEnd();
                out.setTag(null,-1,-1);
                out.write("\");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            ");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_66_13.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_66_13.doEnd();
            out.endTag("if",132);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("            ");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(45);
            out.setTag("if",4731,4776);
            RuntimeTagElement _jettag_c_if_69_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_69_13); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_69_13.setRuntimeParent(_jettag_c_iterate_65_9);
            _jettag_c_if_69_13.setTagInfo(_td_c_if_69_13);
            _jettag_c_if_69_13.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_69_13.okToProcessBody()) {
                out.write(NL);         
                out.write("        byte[] ");  //$NON-NLS-1$        
                out.setTag("get",4792,4827);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_70_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_70_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_70_16.setRuntimeParent(_jettag_c_if_69_13);
                _jettag_c_get_70_16.setTagInfo(_td_c_get_70_16);
                _jettag_c_get_70_16.doStart(context, out);
                _jettag_c_get_70_16.doEnd();
                out.setTag(null,-1,-1);
                out.write("Parameter = (byte[]) req.getSession().getAttribute(\"");  //$NON-NLS-1$        
                out.setTag("get",4879,4913);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(34);
                RuntimeTagElement _jettag_c_get_70_103 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_70_103); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_70_103.setRuntimeParent(_jettag_c_if_69_13);
                _jettag_c_get_70_103.setTagInfo(_td_c_get_70_103);
                _jettag_c_get_70_103.doStart(context, out);
                _jettag_c_get_70_103.doEnd();
                out.setTag(null,-1,-1);
                out.setTag("get",4913,4948);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_70_137 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_70_137); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_70_137.setRuntimeParent(_jettag_c_if_69_13);
                _jettag_c_get_70_137.setTagInfo(_td_c_get_70_137);
                _jettag_c_get_70_137.doStart(context, out);
                _jettag_c_get_70_137.doEnd();
                out.setTag(null,-1,-1);
                out.write("\");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        if(");  //$NON-NLS-1$        
                out.setTag("get",4963,4998);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_71_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_71_12.setRuntimeParent(_jettag_c_if_69_13);
                _jettag_c_get_71_12.setTagInfo(_td_c_get_71_12);
                _jettag_c_get_71_12.doStart(context, out);
                _jettag_c_get_71_12.doEnd();
                out.setTag(null,-1,-1);
                out.write("Parameter == null) ");  //$NON-NLS-1$        
                out.setTag("get",5017,5052);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_71_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_66); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_71_66.setRuntimeParent(_jettag_c_if_69_13);
                _jettag_c_get_71_66.setTagInfo(_td_c_get_71_66);
                _jettag_c_get_71_66.doStart(context, out);
                _jettag_c_get_71_66.doEnd();
                out.setTag(null,-1,-1);
                out.write("Parameter = new byte[0];");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        String ");  //$NON-NLS-1$        
                out.setTag("get",5092,5127);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_72_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_72_16.setRuntimeParent(_jettag_c_if_69_13);
                _jettag_c_get_72_16.setTagInfo(_td_c_get_72_16);
                _jettag_c_get_72_16.doStart(context, out);
                _jettag_c_get_72_16.doEnd();
                out.setTag(null,-1,-1);
                out.write("ContentTypeParameter = (String) req.getSession().getAttribute(\"");  //$NON-NLS-1$        
                out.setTag("get",5190,5224);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(34);
                RuntimeTagElement _jettag_c_get_72_114 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_114); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_72_114.setRuntimeParent(_jettag_c_if_69_13);
                _jettag_c_get_72_114.setTagInfo(_td_c_get_72_114);
                _jettag_c_get_72_114.doStart(context, out);
                _jettag_c_get_72_114.doEnd();
                out.setTag(null,-1,-1);
                out.setTag("get",5224,5259);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_72_148 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_148); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_72_148.setRuntimeParent(_jettag_c_if_69_13);
                _jettag_c_get_72_148.setTagInfo(_td_c_get_72_148);
                _jettag_c_get_72_148.doStart(context, out);
                _jettag_c_get_72_148.doEnd();
                out.setTag(null,-1,-1);
                out.write("ContentType\");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            ");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_69_13.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_69_13.doEnd();
            out.endTag("if",510);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("        ");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_65_9.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_65_9.doEnd();
        out.loopEnd();
        out.endTag("iterate",829);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(60);
        out.setTag("iterate",5323,5383);
        RuntimeTagElement _jettag_c_iterate_75_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_75_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_75_9.setRuntimeParent(null);
        _jettag_c_iterate_75_9.setTagInfo(_td_c_iterate_75_9);
        _jettag_c_iterate_75_9.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_75_9.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_75_9.getTagInfo().getAttribute("delimiter"),5323,5383);
            out.loopIterate();
            out.write(NL);         
            out.write("        String ");  //$NON-NLS-1$        
            out.setTag("get",5399,5434);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(35);
            RuntimeTagElement _jettag_c_get_76_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_76_16); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_76_16.setRuntimeParent(_jettag_c_iterate_75_9);
            _jettag_c_get_76_16.setTagInfo(_td_c_get_76_16);
            _jettag_c_get_76_16.doStart(context, out);
            _jettag_c_get_76_16.doEnd();
            out.setTag(null,-1,-1);
            out.write("Parameter = req.getParameter(\"");  //$NON-NLS-1$        
            out.setTag("get",5464,5499);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(35);
            RuntimeTagElement _jettag_c_get_76_81 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_76_81); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_76_81.setRuntimeParent(_jettag_c_iterate_75_9);
            _jettag_c_get_76_81.setTagInfo(_td_c_get_76_81);
            _jettag_c_get_76_81.doStart(context, out);
            _jettag_c_get_76_81.doEnd();
            out.setTag(null,-1,-1);
            out.write("\");");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        ");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_75_9.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_75_9.doEnd();
        out.loopEnd();
        out.endTag("iterate",128);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.setTag("get",5541,5575);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_79_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_79_9.setRuntimeParent(null);
        _jettag_c_get_79_9.setTagInfo(_td_c_get_79_9);
        _jettag_c_get_79_9.doStart(context, out);
        _jettag_c_get_79_9.doEnd();
        out.setTag(null,-1,-1);
        out.write(" ");  //$NON-NLS-1$        
        out.setTag("get",5576,5618);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_79_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_44); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_79_44.setRuntimeParent(null);
        _jettag_c_get_79_44.setTagInfo(_td_c_get_79_44);
        _jettag_c_get_79_44.doStart(context, out);
        _jettag_c_get_79_44.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = setup");  //$NON-NLS-1$        
        out.setTag("get",5626,5660);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_79_94 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_94); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_79_94.setRuntimeParent(null);
        _jettag_c_get_79_94.setTagInfo(_td_c_get_79_94);
        _jettag_c_get_79_94.doStart(context, out);
        _jettag_c_get_79_94.doEnd();
        out.setTag(null,-1,-1);
        out.write("(");  //$NON-NLS-1$        
        out.setTag("get",5661,5698);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_79_129 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_129); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_79_129.setRuntimeParent(null);
        _jettag_c_get_79_129.setTagInfo(_td_c_get_79_129);
        _jettag_c_get_79_129.doStart(context, out);
        _jettag_c_get_79_129.doEnd();
        out.setTag(null,-1,-1);
        out.write("Parameter, ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(81);
        out.setTag("iterate",5709,5790);
        RuntimeTagElement _jettag_c_iterate_79_177 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_79_177); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_79_177.setRuntimeParent(null);
        _jettag_c_iterate_79_177.setTagInfo(_td_c_iterate_79_177);
        _jettag_c_iterate_79_177.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_79_177.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_79_177.getTagInfo().getAttribute("delimiter"),5709,5790);
            out.loopIterate();
            out.setTag("get",5790,5825);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(35);
            RuntimeTagElement _jettag_c_get_80_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_80_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_80_10.setRuntimeParent(_jettag_c_iterate_79_177);
            _jettag_c_get_80_10.setTagInfo(_td_c_get_80_10);
            _jettag_c_get_80_10.doStart(context, out);
            _jettag_c_get_80_10.doEnd();
            out.setTag(null,-1,-1);
            out.write("Parameter");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_79_177.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_79_177.doEnd();
        out.loopEnd();
        out.endTag("iterate",44);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(21);
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(60);
        out.setTag("iterate",5855,5915);
        RuntimeTagElement _jettag_c_iterate_81_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_81_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_81_10.setRuntimeParent(null);
        _jettag_c_iterate_81_10.setTagInfo(_td_c_iterate_81_10);
        _jettag_c_iterate_81_10.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_81_10.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_81_10.getTagInfo().getAttribute("delimiter"),5855,5915);
            out.loopIterate();
            out.write(", ");  //$NON-NLS-1$        
            out.setTag("get",5917,5952);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(35);
            RuntimeTagElement _jettag_c_get_81_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_81_72); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_81_72.setRuntimeParent(_jettag_c_iterate_81_10);
            _jettag_c_get_81_72.setTagInfo(_td_c_get_81_72);
            _jettag_c_get_81_72.doStart(context, out);
            _jettag_c_get_81_72.doEnd();
            out.setTag(null,-1,-1);
            out.write("Parameter");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_81_10.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_81_10.doEnd();
        out.loopEnd();
        out.endTag("iterate",46);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.setTag("get",5993,6031);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(38);
        RuntimeTagElement _jettag_c_get_83_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_83_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_83_9.setRuntimeParent(null);
        _jettag_c_get_83_9.setTagInfo(_td_c_get_83_9);
        _jettag_c_get_83_9.doStart(context, out);
        _jettag_c_get_83_9.doEnd();
        out.setTag(null,-1,-1);
        out.write(" dao = ");  //$NON-NLS-1$        
        out.setTag("get",6038,6106);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(68);
        RuntimeTagElement _jettag_c_get_83_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_83_54); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_83_54.setRuntimeParent(null);
        _jettag_c_get_83_54.setTagInfo(_td_c_get_83_54);
        _jettag_c_get_83_54.doStart(context, out);
        _jettag_c_get_83_54.doEnd();
        out.setTag(null,-1,-1);
        out.write(".getDefaultDAOFactoryInstance().get");  //$NON-NLS-1$        
        out.setTag("get",6141,6179);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(38);
        RuntimeTagElement _jettag_c_get_83_157 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_83_157); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_83_157.setRuntimeParent(null);
        _jettag_c_get_83_157.setTagInfo(_td_c_get_83_157);
        _jettag_c_get_83_157.doStart(context, out);
        _jettag_c_get_83_157.doEnd();
        out.setTag(null,-1,-1);
        out.write("();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        boolean result = dao.saveOrUpdate");  //$NON-NLS-1$        
        out.setTag("get",6224,6258);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_84_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_42); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_84_42.setRuntimeParent(null);
        _jettag_c_get_84_42.setTagInfo(_td_c_get_84_42);
        _jettag_c_get_84_42.doStart(context, out);
        _jettag_c_get_84_42.doEnd();
        out.setTag(null,-1,-1);
        out.write("(");  //$NON-NLS-1$        
        out.setTag("get",6259,6301);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_84_77 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_77); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_84_77.setRuntimeParent(null);
        _jettag_c_get_84_77.setTagInfo(_td_c_get_84_77);
        _jettag_c_get_84_77.doStart(context, out);
        _jettag_c_get_84_77.doEnd();
        out.setTag(null,-1,-1);
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if(result) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            req.setAttribute(\"message\", \"");  //$NON-NLS-1$        
        out.setTag("get",6375,6417);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_87_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_87_42); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_87_42.setRuntimeParent(null);
        _jettag_c_get_87_42.setTagInfo(_td_c_get_87_42);
        _jettag_c_get_87_42.doStart(context, out);
        _jettag_c_get_87_42.doEnd();
        out.setTag(null,-1,-1);
        out.write(".save.ok\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        else req.setAttribute(\"message\", \"");  //$NON-NLS-1$        
        out.setTag("get",6481,6523);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_89_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_89_43); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_89_43.setRuntimeParent(null);
        _jettag_c_get_89_43.setTagInfo(_td_c_get_89_43);
        _jettag_c_get_89_43.doStart(context, out);
        _jettag_c_get_89_43.doEnd();
        out.setTag(null,-1,-1);
        out.write(".save.failed\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        return ");  //$NON-NLS-1$        
        out.setTag("get",6563,6606);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(43);
        RuntimeTagElement _jettag_c_get_91_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_91_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_91_16.setRuntimeParent(null);
        _jettag_c_get_91_16.setTagInfo(_td_c_get_91_16);
        _jettag_c_get_91_16.doStart(context, out);
        _jettag_c_get_91_16.doEnd();
        out.setTag(null,-1,-1);
        out.write("(req,resp);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public String ");  //$NON-NLS-1$        
        out.setTag("get",6647,6690);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(43);
        RuntimeTagElement _jettag_c_get_94_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_94_19); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_94_19.setRuntimeParent(null);
        _jettag_c_get_94_19.setTagInfo(_td_c_get_94_19);
        _jettag_c_get_94_19.doStart(context, out);
        _jettag_c_get_94_19.doEnd();
        out.setTag(null,-1,-1);
        out.write("(HttpServletRequest req, HttpServletResponse resp) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.setTag("get",6751,6789);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(38);
        RuntimeTagElement _jettag_c_get_95_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_95_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_95_9.setRuntimeParent(null);
        _jettag_c_get_95_9.setTagInfo(_td_c_get_95_9);
        _jettag_c_get_95_9.doStart(context, out);
        _jettag_c_get_95_9.doEnd();
        out.setTag(null,-1,-1);
        out.write(" dao = ");  //$NON-NLS-1$        
        out.setTag("get",6796,6864);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(68);
        RuntimeTagElement _jettag_c_get_95_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_95_54); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_95_54.setRuntimeParent(null);
        _jettag_c_get_95_54.setTagInfo(_td_c_get_95_54);
        _jettag_c_get_95_54.doStart(context, out);
        _jettag_c_get_95_54.doEnd();
        out.setTag(null,-1,-1);
        out.write(".getDefaultDAOFactoryInstance().get");  //$NON-NLS-1$        
        out.setTag("get",6899,6937);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(38);
        RuntimeTagElement _jettag_c_get_95_157 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_95_157); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_95_157.setRuntimeParent(null);
        _jettag_c_get_95_157.setTagInfo(_td_c_get_95_157);
        _jettag_c_get_95_157.doStart(context, out);
        _jettag_c_get_95_157.doEnd();
        out.setTag(null,-1,-1);
        out.write("();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        List<");  //$NON-NLS-1$        
        out.setTag("get",6963,6997);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_97_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_97_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_97_14.setRuntimeParent(null);
        _jettag_c_get_97_14.setTagInfo(_td_c_get_97_14);
        _jettag_c_get_97_14.doStart(context, out);
        _jettag_c_get_97_14.doEnd();
        out.setTag(null,-1,-1);
        out.write("> all");  //$NON-NLS-1$        
        out.setTag("get",7002,7036);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_97_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_97_53); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_97_53.setRuntimeParent(null);
        _jettag_c_get_97_53.setTagInfo(_td_c_get_97_53);
        _jettag_c_get_97_53.doStart(context, out);
        _jettag_c_get_97_53.doEnd();
        out.setTag(null,-1,-1);
        out.write("s = dao.getAll");  //$NON-NLS-1$        
        out.setTag("get",7050,7084);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_97_101 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_97_101); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_97_101.setRuntimeParent(null);
        _jettag_c_get_97_101.setTagInfo(_td_c_get_97_101);
        _jettag_c_get_97_101.doStart(context, out);
        _jettag_c_get_97_101.doEnd();
        out.setTag(null,-1,-1);
        out.write("s();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        req.setAttribute(\"all");  //$NON-NLS-1$        
        out.setTag("get",7127,7161);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_99_30 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_99_30); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_99_30.setRuntimeParent(null);
        _jettag_c_get_99_30.setTagInfo(_td_c_get_99_30);
        _jettag_c_get_99_30.doStart(context, out);
        _jettag_c_get_99_30.doEnd();
        out.setTag(null,-1,-1);
        out.write("s\", all");  //$NON-NLS-1$        
        out.setTag("get",7168,7202);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_99_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_99_71); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_99_71.setRuntimeParent(null);
        _jettag_c_get_99_71.setTagInfo(_td_c_get_99_71);
        _jettag_c_get_99_71.doStart(context, out);
        _jettag_c_get_99_71.doEnd();
        out.setTag(null,-1,-1);
        out.write("s);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        return ");  //$NON-NLS-1$        
        out.setTag("get",7230,7276);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_101_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_101_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_101_16.setRuntimeParent(null);
        _jettag_c_get_101_16.setTagInfo(_td_c_get_101_16);
        _jettag_c_get_101_16.doStart(context, out);
        _jettag_c_get_101_16.doEnd();
        out.setTag(null,-1,-1);
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    public String ");  //$NON-NLS-1$        
        out.setTag("get",7303,7358);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(55);
        RuntimeTagElement _jettag_c_get_104_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_104_19); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_104_19.setRuntimeParent(null);
        _jettag_c_get_104_19.setTagInfo(_td_c_get_104_19);
        _jettag_c_get_104_19.doStart(context, out);
        _jettag_c_get_104_19.doEnd();
        out.setTag(null,-1,-1);
        out.write("(HttpServletRequest req, HttpServletResponse resp) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.setTag("get",7419,7457);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(38);
        RuntimeTagElement _jettag_c_get_105_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_105_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_105_9.setRuntimeParent(null);
        _jettag_c_get_105_9.setTagInfo(_td_c_get_105_9);
        _jettag_c_get_105_9.doStart(context, out);
        _jettag_c_get_105_9.doEnd();
        out.setTag(null,-1,-1);
        out.write(" dao = ");  //$NON-NLS-1$        
        out.setTag("get",7464,7532);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(68);
        RuntimeTagElement _jettag_c_get_105_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_105_54); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_105_54.setRuntimeParent(null);
        _jettag_c_get_105_54.setTagInfo(_td_c_get_105_54);
        _jettag_c_get_105_54.doStart(context, out);
        _jettag_c_get_105_54.doEnd();
        out.setTag(null,-1,-1);
        out.write(".getDefaultDAOFactoryInstance().get");  //$NON-NLS-1$        
        out.setTag("get",7567,7605);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(38);
        RuntimeTagElement _jettag_c_get_105_157 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_105_157); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_105_157.setRuntimeParent(null);
        _jettag_c_get_105_157.setTagInfo(_td_c_get_105_157);
        _jettag_c_get_105_157.doStart(context, out);
        _jettag_c_get_105_157.doEnd();
        out.setTag(null,-1,-1);
        out.write("();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        List<");  //$NON-NLS-1$        
        out.setTag("get",7631,7665);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_107_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_107_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_107_14.setRuntimeParent(null);
        _jettag_c_get_107_14.setTagInfo(_td_c_get_107_14);
        _jettag_c_get_107_14.doStart(context, out);
        _jettag_c_get_107_14.doEnd();
        out.setTag(null,-1,-1);
        out.write("> all");  //$NON-NLS-1$        
        out.setTag("get",7670,7704);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_107_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_107_53); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_107_53.setRuntimeParent(null);
        _jettag_c_get_107_53.setTagInfo(_td_c_get_107_53);
        _jettag_c_get_107_53.doStart(context, out);
        _jettag_c_get_107_53.doEnd();
        out.setTag(null,-1,-1);
        out.write("s = dao.getAll");  //$NON-NLS-1$        
        out.setTag("get",7718,7752);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_107_101 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_107_101); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_107_101.setRuntimeParent(null);
        _jettag_c_get_107_101.setTagInfo(_td_c_get_107_101);
        _jettag_c_get_107_101.doStart(context, out);
        _jettag_c_get_107_101.doEnd();
        out.setTag(null,-1,-1);
        out.write("s();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        req.setAttribute(\"allElements\", all");  //$NON-NLS-1$        
        out.setTag("get",7809,7843);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_109_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_109_44); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_109_44.setRuntimeParent(null);
        _jettag_c_get_109_44.setTagInfo(_td_c_get_109_44);
        _jettag_c_get_109_44.doStart(context, out);
        _jettag_c_get_109_44.doEnd();
        out.setTag(null,-1,-1);
        out.write("s);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        req.setAttribute(\"currentlySelectedMessageKey\", \"");  //$NON-NLS-1$        
        out.setTag("get",7913,7955);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_111_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_111_58); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_111_58.setRuntimeParent(null);
        _jettag_c_get_111_58.setTagInfo(_td_c_get_111_58);
        _jettag_c_get_111_58.doStart(context, out);
        _jettag_c_get_111_58.doEnd();
        out.setTag(null,-1,-1);
        out.write(".currentlySelected.label\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        req.setAttribute(\"selectMessageKey\", \"");  //$NON-NLS-1$        
        out.setTag("get",8029,8071);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_112_47 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_112_47); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_112_47.setRuntimeParent(null);
        _jettag_c_get_112_47.setTagInfo(_td_c_get_112_47);
        _jettag_c_get_112_47.doStart(context, out);
        _jettag_c_get_112_47.doEnd();
        out.setTag(null,-1,-1);
        out.write(".select.label\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        return ");  //$NON-NLS-1$        
        out.setTag("get",8112,8170);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(58);
        RuntimeTagElement _jettag_c_get_114_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_114_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_114_16.setRuntimeParent(null);
        _jettag_c_get_114_16.setTagInfo(_td_c_get_114_16);
        _jettag_c_get_114_16.doStart(context, out);
        _jettag_c_get_114_16.doEnd();
        out.setTag(null,-1,-1);
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    private ");  //$NON-NLS-1$        
        out.setTag("get",8191,8225);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_117_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_117_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_117_13.setRuntimeParent(null);
        _jettag_c_get_117_13.setTagInfo(_td_c_get_117_13);
        _jettag_c_get_117_13.doStart(context, out);
        _jettag_c_get_117_13.doEnd();
        out.setTag(null,-1,-1);
        out.write(" setup");  //$NON-NLS-1$        
        out.setTag("get",8231,8265);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_117_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_117_53); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_117_53.setRuntimeParent(null);
        _jettag_c_get_117_53.setTagInfo(_td_c_get_117_53);
        _jettag_c_get_117_53.doStart(context, out);
        _jettag_c_get_117_53.doEnd();
        out.setTag(null,-1,-1);
        out.write("(String ");  //$NON-NLS-1$        
        out.setTag("get",8273,8310);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_117_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_117_95); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_117_95.setRuntimeParent(null);
        _jettag_c_get_117_95.setTagInfo(_td_c_get_117_95);
        _jettag_c_get_117_95.doStart(context, out);
        _jettag_c_get_117_95.doEnd();
        out.setTag(null,-1,-1);
        out.write("Parameter, ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(81);
        out.setTag("iterate",8321,8402);
        RuntimeTagElement _jettag_c_iterate_117_143 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_117_143); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_117_143.setRuntimeParent(null);
        _jettag_c_iterate_117_143.setTagInfo(_td_c_iterate_117_143);
        _jettag_c_iterate_117_143.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_117_143.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_117_143.getTagInfo().getAttribute("delimiter"),8321,8402);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(59);
            out.setTag("if",8402,8461);
            RuntimeTagElement _jettag_c_if_118_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_118_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_118_10.setRuntimeParent(_jettag_c_iterate_117_143);
            _jettag_c_if_118_10.setTagInfo(_td_c_if_118_10);
            _jettag_c_if_118_10.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_118_10.okToProcessBody()) {
                out.write("String");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_118_10.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_118_10.doEnd();
            out.endTag("if",6);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(16);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(45);
            out.setTag("if",8483,8528);
            RuntimeTagElement _jettag_c_if_120_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_120_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_120_10.setRuntimeParent(_jettag_c_iterate_117_143);
            _jettag_c_if_120_10.setTagInfo(_td_c_if_120_10);
            _jettag_c_if_120_10.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_120_10.okToProcessBody()) {
                out.write("byte []");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_120_10.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_120_10.doEnd();
            out.endTag("if",7);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(16);
            out.write(" ");  //$NON-NLS-1$        
            out.setTag("get",8552,8587);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(35);
            RuntimeTagElement _jettag_c_get_121_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_121_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_121_11.setRuntimeParent(_jettag_c_iterate_117_143);
            _jettag_c_get_121_11.setTagInfo(_td_c_get_121_11);
            _jettag_c_get_121_11.doStart(context, out);
            _jettag_c_get_121_11.doEnd();
            out.setTag(null,-1,-1);
            out.write("Parameter");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_117_143.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_117_143.doEnd();
        out.loopEnd();
        out.endTag("iterate",194);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(21);
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(60);
        out.setTag("iterate",8617,8677);
        RuntimeTagElement _jettag_c_iterate_122_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_122_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_122_10.setRuntimeParent(null);
        _jettag_c_iterate_122_10.setTagInfo(_td_c_iterate_122_10);
        _jettag_c_iterate_122_10.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_122_10.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_122_10.getTagInfo().getAttribute("delimiter"),8617,8677);
            out.loopIterate();
            out.write(", String ");  //$NON-NLS-1$        
            out.setTag("get",8686,8721);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(35);
            RuntimeTagElement _jettag_c_get_122_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_122_79); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_122_79.setRuntimeParent(_jettag_c_iterate_122_10);
            _jettag_c_get_122_79.setTagInfo(_td_c_get_122_79);
            _jettag_c_get_122_79.doStart(context, out);
            _jettag_c_get_122_79.doEnd();
            out.setTag(null,-1,-1);
            out.write("Parameter");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_122_10.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_122_10.doEnd();
        out.loopEnd();
        out.endTag("iterate",53);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(") {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.setTag("get",8754,8788);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_123_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_123_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_123_9.setRuntimeParent(null);
        _jettag_c_get_123_9.setTagInfo(_td_c_get_123_9);
        _jettag_c_get_123_9.doStart(context, out);
        _jettag_c_get_123_9.doEnd();
        out.setTag(null,-1,-1);
        out.write(" ");  //$NON-NLS-1$        
        out.setTag("get",8789,8831);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_123_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_123_44); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_123_44.setRuntimeParent(null);
        _jettag_c_get_123_44.setTagInfo(_td_c_get_123_44);
        _jettag_c_get_123_44.doStart(context, out);
        _jettag_c_get_123_44.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = new ");  //$NON-NLS-1$        
        out.setTag("get",8838,8872);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_123_93 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_123_93); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_123_93.setRuntimeParent(null);
        _jettag_c_get_123_93.setTagInfo(_td_c_get_123_93);
        _jettag_c_get_123_93.doStart(context, out);
        _jettag_c_get_123_93.doEnd();
        out.setTag(null,-1,-1);
        out.write("();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if(");  //$NON-NLS-1$        
        out.setTag("get",8887,8924);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_124_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_124_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_124_12.setRuntimeParent(null);
        _jettag_c_get_124_12.setTagInfo(_td_c_get_124_12);
        _jettag_c_get_124_12.doStart(context, out);
        _jettag_c_get_124_12.doEnd();
        out.setTag(null,-1,-1);
        out.write("Parameter != null && ");  //$NON-NLS-1$        
        out.setTag("get",8945,8982);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_124_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_124_70); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_124_70.setRuntimeParent(null);
        _jettag_c_get_124_70.setTagInfo(_td_c_get_124_70);
        _jettag_c_get_124_70.doStart(context, out);
        _jettag_c_get_124_70.doEnd();
        out.setTag(null,-1,-1);
        out.write("Parameter.trim().length()>0)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ");  //$NON-NLS-1$        
        out.setTag("get",9023,9065);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_125_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_125_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_125_13.setRuntimeParent(null);
        _jettag_c_get_125_13.setTagInfo(_td_c_get_125_13);
        _jettag_c_get_125_13.doStart(context, out);
        _jettag_c_get_125_13.doEnd();
        out.setTag(null,-1,-1);
        out.write(".");  //$NON-NLS-1$        
        out.setTag("get",9066,9109);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(43);
        RuntimeTagElement _jettag_c_get_125_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_125_56); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_125_56.setRuntimeParent(null);
        _jettag_c_get_125_56.setTagInfo(_td_c_get_125_56);
        _jettag_c_get_125_56.doStart(context, out);
        _jettag_c_get_125_56.doEnd();
        out.setTag(null,-1,-1);
        out.write("(");  //$NON-NLS-1$        
        out.setTag("get",9110,9167);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(57);
        RuntimeTagElement _jettag_c_get_125_100 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_125_100); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_125_100.setRuntimeParent(null);
        _jettag_c_get_125_100.setTagInfo(_td_c_get_125_100);
        _jettag_c_get_125_100.doStart(context, out);
        _jettag_c_get_125_100.doEnd();
        out.setTag(null,-1,-1);
        out.write("(");  //$NON-NLS-1$        
        out.setTag("get",9168,9205);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_125_158 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_125_158); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_125_158.setRuntimeParent(null);
        _jettag_c_get_125_158.setTagInfo(_td_c_get_125_158);
        _jettag_c_get_125_158.doStart(context, out);
        _jettag_c_get_125_158.doEnd();
        out.setTag(null,-1,-1);
        out.write("Parameter));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(57);
        out.setTag("iterate",9221,9278);
        RuntimeTagElement _jettag_c_iterate_127_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_127_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_127_3.setRuntimeParent(null);
        _jettag_c_iterate_127_3.setTagInfo(_td_c_iterate_127_3);
        _jettag_c_iterate_127_3.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_127_3.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_127_3.getTagInfo().getAttribute("delimiter"),9221,9278);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(44);
            out.setTag("if",9281,9325);
            RuntimeTagElement _jettag_c_if_128_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_128_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_128_3.setRuntimeParent(_jettag_c_iterate_127_3);
            _jettag_c_if_128_3.setTagInfo(_td_c_if_128_3);
            _jettag_c_if_128_3.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_128_3.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                out.setTag("get",9328,9370);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(42);
                RuntimeTagElement _jettag_c_get_129_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_129_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_129_3.setRuntimeParent(_jettag_c_if_128_3);
                _jettag_c_get_129_3.setTagInfo(_td_c_get_129_3);
                _jettag_c_get_129_3.doStart(context, out);
                _jettag_c_get_129_3.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",9371,9412);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(41);
                RuntimeTagElement _jettag_c_get_129_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_129_46); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_129_46.setRuntimeParent(_jettag_c_if_128_3);
                _jettag_c_get_129_46.setTagInfo(_td_c_get_129_46);
                _jettag_c_get_129_46.doStart(context, out);
                _jettag_c_get_129_46.doEnd();
                out.setTag(null,-1,-1);
                out.write("(");  //$NON-NLS-1$        
                out.setTag("get",9413,9448);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_129_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_129_88); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_129_88.setRuntimeParent(_jettag_c_if_128_3);
                _jettag_c_get_129_88.setTagInfo(_td_c_get_129_88);
                _jettag_c_get_129_88.doStart(context, out);
                _jettag_c_get_129_88.doEnd();
                out.setTag(null,-1,-1);
                out.write("Parameter);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_128_3.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_128_3.doEnd();
            out.endTag("if",137);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(48);
            out.setTag("if",9472,9520);
            RuntimeTagElement _jettag_c_if_131_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_131_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_131_3.setRuntimeParent(_jettag_c_iterate_127_3);
            _jettag_c_if_131_3.setTagInfo(_td_c_if_131_3);
            _jettag_c_if_131_3.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_131_3.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                out.setTag("get",9523,9565);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(42);
                RuntimeTagElement _jettag_c_get_132_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_132_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_132_3.setRuntimeParent(_jettag_c_if_131_3);
                _jettag_c_get_132_3.setTagInfo(_td_c_get_132_3);
                _jettag_c_get_132_3.doStart(context, out);
                _jettag_c_get_132_3.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",9566,9607);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(41);
                RuntimeTagElement _jettag_c_get_132_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_132_46); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_132_46.setRuntimeParent(_jettag_c_if_131_3);
                _jettag_c_get_132_46.setTagInfo(_td_c_get_132_46);
                _jettag_c_get_132_46.doStart(context, out);
                _jettag_c_get_132_46.doEnd();
                out.setTag(null,-1,-1);
                out.write("(");  //$NON-NLS-1$        
                out.setTag("get",9608,9643);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_132_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_132_88); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_132_88.setRuntimeParent(_jettag_c_if_131_3);
                _jettag_c_get_132_88.setTagInfo(_td_c_get_132_88);
                _jettag_c_get_132_88.doStart(context, out);
                _jettag_c_get_132_88.doEnd();
                out.setTag(null,-1,-1);
                out.write("Parameter);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_131_3.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_131_3.doEnd();
            out.endTag("if",137);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("        ");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(43);
            out.setTag("if",9673,9716);
            RuntimeTagElement _jettag_c_if_134_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_134_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_134_9.setRuntimeParent(_jettag_c_iterate_127_3);
            _jettag_c_if_134_9.setTagInfo(_td_c_if_134_9);
            _jettag_c_if_134_9.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_134_9.okToProcessBody()) {
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
                out.setTag("get",9725,9767);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(42);
                RuntimeTagElement _jettag_c_get_135_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_135_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_135_9.setRuntimeParent(_jettag_c_if_134_9);
                _jettag_c_get_135_9.setTagInfo(_td_c_get_135_9);
                _jettag_c_get_135_9.doStart(context, out);
                _jettag_c_get_135_9.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",9768,9809);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(41);
                RuntimeTagElement _jettag_c_get_135_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_135_52); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_135_52.setRuntimeParent(_jettag_c_if_134_9);
                _jettag_c_get_135_52.setTagInfo(_td_c_get_135_52);
                _jettag_c_get_135_52.doStart(context, out);
                _jettag_c_get_135_52.doEnd();
                out.setTag(null,-1,-1);
                out.write("(Integer.parseInt(");  //$NON-NLS-1$        
                out.setTag("get",9827,9862);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_135_111 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_135_111); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_135_111.setRuntimeParent(_jettag_c_if_134_9);
                _jettag_c_get_135_111.setTagInfo(_td_c_get_135_111);
                _jettag_c_get_135_111.doStart(context, out);
                _jettag_c_get_135_111.doEnd();
                out.setTag(null,-1,-1);
                out.write("Parameter));");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_134_9.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_134_9.doEnd();
            out.endTag("if",167);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("        ");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(44);
            out.setTag("if",9899,9943);
            RuntimeTagElement _jettag_c_if_137_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_137_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_137_9.setRuntimeParent(_jettag_c_iterate_127_3);
            _jettag_c_if_137_9.setTagInfo(_td_c_if_137_9);
            _jettag_c_if_137_9.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_137_9.okToProcessBody()) {
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
                out.setTag("get",9952,9994);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(42);
                RuntimeTagElement _jettag_c_get_138_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_138_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_138_9.setRuntimeParent(_jettag_c_if_137_9);
                _jettag_c_get_138_9.setTagInfo(_td_c_get_138_9);
                _jettag_c_get_138_9.doStart(context, out);
                _jettag_c_get_138_9.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",9995,10036);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(41);
                RuntimeTagElement _jettag_c_get_138_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_138_52); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_138_52.setRuntimeParent(_jettag_c_if_137_9);
                _jettag_c_get_138_52.setTagInfo(_td_c_get_138_52);
                _jettag_c_get_138_52.doStart(context, out);
                _jettag_c_get_138_52.doEnd();
                out.setTag(null,-1,-1);
                out.write("(Long.parseLong(");  //$NON-NLS-1$        
                out.setTag("get",10052,10087);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_138_109 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_138_109); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_138_109.setRuntimeParent(_jettag_c_if_137_9);
                _jettag_c_get_138_109.setTagInfo(_td_c_get_138_109);
                _jettag_c_get_138_109.doStart(context, out);
                _jettag_c_get_138_109.doEnd();
                out.setTag(null,-1,-1);
                out.write("Parameter));");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_137_9.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_137_9.doEnd();
            out.endTag("if",165);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("        ");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(44);
            out.setTag("if",10124,10168);
            RuntimeTagElement _jettag_c_if_140_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_140_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_140_9.setRuntimeParent(_jettag_c_iterate_127_3);
            _jettag_c_if_140_9.setTagInfo(_td_c_if_140_9);
            _jettag_c_if_140_9.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_140_9.okToProcessBody()) {
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
                out.setTag("get",10177,10219);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(42);
                RuntimeTagElement _jettag_c_get_141_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_141_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_141_9.setRuntimeParent(_jettag_c_if_140_9);
                _jettag_c_get_141_9.setTagInfo(_td_c_get_141_9);
                _jettag_c_get_141_9.doStart(context, out);
                _jettag_c_get_141_9.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",10220,10261);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(41);
                RuntimeTagElement _jettag_c_get_141_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_141_52); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_141_52.setRuntimeParent(_jettag_c_if_140_9);
                _jettag_c_get_141_52.setTagInfo(_td_c_get_141_52);
                _jettag_c_get_141_52.doStart(context, out);
                _jettag_c_get_141_52.doEnd();
                out.setTag(null,-1,-1);
                out.write("(Float.parseFloat(");  //$NON-NLS-1$        
                out.setTag("get",10279,10314);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_141_111 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_141_111); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_141_111.setRuntimeParent(_jettag_c_if_140_9);
                _jettag_c_get_141_111.setTagInfo(_td_c_get_141_111);
                _jettag_c_get_141_111.doStart(context, out);
                _jettag_c_get_141_111.doEnd();
                out.setTag(null,-1,-1);
                out.write("Parameter));");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_140_9.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_140_9.doEnd();
            out.endTag("if",167);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("        ");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(48);
            out.setTag("if",10351,10399);
            RuntimeTagElement _jettag_c_if_143_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_143_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_143_9.setRuntimeParent(_jettag_c_iterate_127_3);
            _jettag_c_if_143_9.setTagInfo(_td_c_if_143_9);
            _jettag_c_if_143_9.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_143_9.okToProcessBody()) {
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
                out.setTag("get",10408,10450);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(42);
                RuntimeTagElement _jettag_c_get_144_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_144_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_144_9.setRuntimeParent(_jettag_c_if_143_9);
                _jettag_c_get_144_9.setTagInfo(_td_c_get_144_9);
                _jettag_c_get_144_9.doStart(context, out);
                _jettag_c_get_144_9.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",10451,10492);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(41);
                RuntimeTagElement _jettag_c_get_144_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_144_52); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_144_52.setRuntimeParent(_jettag_c_if_143_9);
                _jettag_c_get_144_52.setTagInfo(_td_c_get_144_52);
                _jettag_c_get_144_52.doStart(context, out);
                _jettag_c_get_144_52.doEnd();
                out.setTag(null,-1,-1);
                out.write("(Float.parseFloat(");  //$NON-NLS-1$        
                out.setTag("get",10510,10545);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_144_111 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_144_111); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_144_111.setRuntimeParent(_jettag_c_if_143_9);
                _jettag_c_get_144_111.setTagInfo(_td_c_get_144_111);
                _jettag_c_get_144_111.doStart(context, out);
                _jettag_c_get_144_111.doEnd();
                out.setTag(null,-1,-1);
                out.write("Parameter));");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_143_9.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_143_9.doEnd();
            out.endTag("if",167);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(44);
            out.setTag("if",10576,10620);
            RuntimeTagElement _jettag_c_if_146_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_146_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_146_3.setRuntimeParent(_jettag_c_iterate_127_3);
            _jettag_c_if_146_3.setTagInfo(_td_c_if_146_3);
            _jettag_c_if_146_3.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_146_3.okToProcessBody()) {
                out.write(NL);         
                out.write("        try {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            if(");  //$NON-NLS-1$        
                out.setTag("get",10650,10685);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_148_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_148_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_148_16.setRuntimeParent(_jettag_c_if_146_3);
                _jettag_c_get_148_16.setTagInfo(_td_c_get_148_16);
                _jettag_c_get_148_16.doStart(context, out);
                _jettag_c_get_148_16.doEnd();
                out.setTag(null,-1,-1);
                out.write("Parameter != null && ");  //$NON-NLS-1$        
                out.setTag("get",10706,10741);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_148_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_148_72); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_148_72.setRuntimeParent(_jettag_c_if_146_3);
                _jettag_c_get_148_72.setTagInfo(_td_c_get_148_72);
                _jettag_c_get_148_72.doStart(context, out);
                _jettag_c_get_148_72.doEnd();
                out.setTag(null,-1,-1);
                out.write("Parameter.trim().length()>0) {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("                java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(\"dd/MM/yyyy\");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("                ");  //$NON-NLS-1$        
                out.setTag("get",10883,10925);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(42);
                RuntimeTagElement _jettag_c_get_150_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_150_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_150_17.setRuntimeParent(_jettag_c_if_146_3);
                _jettag_c_get_150_17.setTagInfo(_td_c_get_150_17);
                _jettag_c_get_150_17.doStart(context, out);
                _jettag_c_get_150_17.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",10926,10967);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(41);
                RuntimeTagElement _jettag_c_get_150_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_150_60); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_150_60.setRuntimeParent(_jettag_c_if_146_3);
                _jettag_c_get_150_60.setTagInfo(_td_c_get_150_60);
                _jettag_c_get_150_60.doStart(context, out);
                _jettag_c_get_150_60.doEnd();
                out.setTag(null,-1,-1);
                out.write("(sdf.parse(");  //$NON-NLS-1$        
                out.setTag("get",10978,11013);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_150_112 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_150_112); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_150_112.setRuntimeParent(_jettag_c_if_146_3);
                _jettag_c_get_150_112.setTagInfo(_td_c_get_150_112);
                _jettag_c_get_150_112.doStart(context, out);
                _jettag_c_get_150_112.doEnd();
                out.setTag(null,-1,-1);
                out.write("Parameter));");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            }");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        }");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        catch(java.text.ParseException pe) {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            pe.printStackTrace();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        }");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_146_3.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_146_3.doEnd();
            out.endTag("if",521);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("        ");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(45);
            out.setTag("if",11157,11202);
            RuntimeTagElement _jettag_c_if_157_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_157_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_157_9.setRuntimeParent(_jettag_c_iterate_127_3);
            _jettag_c_if_157_9.setTagInfo(_td_c_if_157_9);
            _jettag_c_if_157_9.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_157_9.okToProcessBody()) {
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
                out.setTag("get",11211,11253);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(42);
                RuntimeTagElement _jettag_c_get_158_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_158_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_158_9.setRuntimeParent(_jettag_c_if_157_9);
                _jettag_c_get_158_9.setTagInfo(_td_c_get_158_9);
                _jettag_c_get_158_9.doStart(context, out);
                _jettag_c_get_158_9.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",11254,11295);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(41);
                RuntimeTagElement _jettag_c_get_158_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_158_52); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_158_52.setRuntimeParent(_jettag_c_if_157_9);
                _jettag_c_get_158_52.setTagInfo(_td_c_get_158_52);
                _jettag_c_get_158_52.doStart(context, out);
                _jettag_c_get_158_52.doEnd();
                out.setTag(null,-1,-1);
                out.write("(");  //$NON-NLS-1$        
                out.setTag("get",11296,11331);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_158_94 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_158_94); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_158_94.setRuntimeParent(_jettag_c_if_157_9);
                _jettag_c_get_158_94.setTagInfo(_td_c_get_158_94);
                _jettag_c_get_158_94.doStart(context, out);
                _jettag_c_get_158_94.doEnd();
                out.setTag(null,-1,-1);
                out.write("Parameter);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_157_9.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_157_9.doEnd();
            out.endTag("if",149);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_127_3.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_127_3.doEnd();
        out.loopEnd();
        out.endTag("iterate",2083);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(60);
        out.setTag("iterate",11385,11445);
        RuntimeTagElement _jettag_c_iterate_162_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_162_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_162_9.setRuntimeParent(null);
        _jettag_c_iterate_162_9.setTagInfo(_td_c_iterate_162_9);
        _jettag_c_iterate_162_9.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_162_9.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_162_9.getTagInfo().getAttribute("delimiter"),11385,11445);
            out.loopIterate();
            out.write(NL);         
            out.write("        if(");  //$NON-NLS-1$        
            out.setTag("get",11457,11492);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(35);
            RuntimeTagElement _jettag_c_get_163_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_163_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_163_12.setRuntimeParent(_jettag_c_iterate_162_9);
            _jettag_c_get_163_12.setTagInfo(_td_c_get_163_12);
            _jettag_c_get_163_12.doStart(context, out);
            _jettag_c_get_163_12.doEnd();
            out.setTag(null,-1,-1);
            out.write("Parameter != null && ");  //$NON-NLS-1$        
            out.setTag("get",11513,11548);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(35);
            RuntimeTagElement _jettag_c_get_163_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_163_68); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_163_68.setRuntimeParent(_jettag_c_iterate_162_9);
            _jettag_c_get_163_68.setTagInfo(_td_c_get_163_68);
            _jettag_c_get_163_68.doStart(context, out);
            _jettag_c_get_163_68.doEnd();
            out.setTag(null,-1,-1);
            out.write("Parameter.length() > 0) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            ");  //$NON-NLS-1$        
            out.setTag("get",11586,11644);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(58);
            RuntimeTagElement _jettag_c_get_164_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_164_13); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_164_13.setRuntimeParent(_jettag_c_iterate_162_9);
            _jettag_c_get_164_13.setTagInfo(_td_c_get_164_13);
            _jettag_c_get_164_13.doStart(context, out);
            _jettag_c_get_164_13.doEnd();
            out.setTag(null,-1,-1);
            out.write(" ");  //$NON-NLS-1$        
            out.setTag("get",11645,11680);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(35);
            RuntimeTagElement _jettag_c_get_164_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_164_72); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_164_72.setRuntimeParent(_jettag_c_iterate_162_9);
            _jettag_c_get_164_72.setTagInfo(_td_c_get_164_72);
            _jettag_c_get_164_72.doStart(context, out);
            _jettag_c_get_164_72.doEnd();
            out.setTag(null,-1,-1);
            out.write(" = new ");  //$NON-NLS-1$        
            out.setTag("get",11687,11745);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(58);
            RuntimeTagElement _jettag_c_get_164_114 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_164_114); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_164_114.setRuntimeParent(_jettag_c_iterate_162_9);
            _jettag_c_get_164_114.setTagInfo(_td_c_get_164_114);
            _jettag_c_get_164_114.doStart(context, out);
            _jettag_c_get_164_114.doEnd();
            out.setTag(null,-1,-1);
            out.write("();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            ");  //$NON-NLS-1$        
            out.setTag("get",11761,11796);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(35);
            RuntimeTagElement _jettag_c_get_165_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_165_13); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_165_13.setRuntimeParent(_jettag_c_iterate_162_9);
            _jettag_c_get_165_13.setTagInfo(_td_c_get_165_13);
            _jettag_c_get_165_13.doStart(context, out);
            _jettag_c_get_165_13.doEnd();
            out.setTag(null,-1,-1);
            out.write(".");  //$NON-NLS-1$        
            out.setTag("get",11797,11856);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(59);
            RuntimeTagElement _jettag_c_get_165_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_165_49); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_165_49.setRuntimeParent(_jettag_c_iterate_162_9);
            _jettag_c_get_165_49.setTagInfo(_td_c_get_165_49);
            _jettag_c_get_165_49.doStart(context, out);
            _jettag_c_get_165_49.doEnd();
            out.setTag(null,-1,-1);
            out.write("(Long.parseLong(");  //$NON-NLS-1$        
            out.setTag("get",11872,11907);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(35);
            RuntimeTagElement _jettag_c_get_165_124 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_165_124); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_165_124.setRuntimeParent(_jettag_c_iterate_162_9);
            _jettag_c_get_165_124.setTagInfo(_td_c_get_165_124);
            _jettag_c_get_165_124.doStart(context, out);
            _jettag_c_get_165_124.doEnd();
            out.setTag(null,-1,-1);
            out.write("Parameter));");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            ");  //$NON-NLS-1$        
            out.setTag("get",11932,11974);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(42);
            RuntimeTagElement _jettag_c_get_166_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_166_13); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_166_13.setRuntimeParent(_jettag_c_iterate_162_9);
            _jettag_c_get_166_13.setTagInfo(_td_c_get_166_13);
            _jettag_c_get_166_13.doStart(context, out);
            _jettag_c_get_166_13.doEnd();
            out.setTag(null,-1,-1);
            out.write(".");  //$NON-NLS-1$        
            out.setTag("get",11975,12016);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(41);
            RuntimeTagElement _jettag_c_get_166_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_166_56); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_166_56.setRuntimeParent(_jettag_c_iterate_162_9);
            _jettag_c_get_166_56.setTagInfo(_td_c_get_166_56);
            _jettag_c_get_166_56.doStart(context, out);
            _jettag_c_get_166_56.doEnd();
            out.setTag(null,-1,-1);
            out.write("(");  //$NON-NLS-1$        
            out.setTag("get",12017,12052);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(35);
            RuntimeTagElement _jettag_c_get_166_98 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_166_98); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_166_98.setRuntimeParent(_jettag_c_iterate_162_9);
            _jettag_c_get_166_98.setTagInfo(_td_c_get_166_98);
            _jettag_c_get_166_98.doStart(context, out);
            _jettag_c_get_166_98.doEnd();
            out.setTag(null,-1,-1);
            out.write(");");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        }");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        ");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_162_9.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_162_9.doEnd();
        out.loopEnd();
        out.endTag("iterate",628);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("            ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        return ");  //$NON-NLS-1$        
        out.setTag("get",12114,12156);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_170_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_170_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_170_16.setRuntimeParent(null);
        _jettag_c_get_170_16.setTagInfo(_td_c_get_170_16);
        _jettag_c_get_170_16.doStart(context, out);
        _jettag_c_get_170_16.doEnd();
        out.setTag(null,-1,-1);
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.popTemplateFile();
    }
}
