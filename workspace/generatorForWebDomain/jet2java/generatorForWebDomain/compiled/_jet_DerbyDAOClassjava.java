package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_DerbyDAOClassjava implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_DerbyDAOClassjava(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_9 = new TagInfo("c:get", //$NON-NLS-1$
            1, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@derbyDaosPackage", //$NON-NLS-1$
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
    private static final TagInfo _td_c_set_14_1 = new TagInfo("c:set", //$NON-NLS-1$
            14, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$userType", //$NON-NLS-1$
                "allAttributesForSQL", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_15_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            15, 3,
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
    private static final TagInfo _td_c_get_16_4 = new TagInfo("c:get", //$NON-NLS-1$
            16, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_17_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            17, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/referenceList", //$NON-NLS-1$
                "reference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_9 = new TagInfo("c:get", //$NON-NLS-1$
            18, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_20_2 = new TagInfo("c:set", //$NON-NLS-1$
            20, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$userType", //$NON-NLS-1$
                "allAttributesAsQuestionMarksForSQL", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_21_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            21, 3,
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
    private static final TagInfo _td_c_iterate_23_6 = new TagInfo("c:iterate", //$NON-NLS-1$
            23, 6,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/referenceList", //$NON-NLS-1$
                "reference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_26_2 = new TagInfo("c:set", //$NON-NLS-1$
            26, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$userType", //$NON-NLS-1$
                "allAttributesWithQuestionMarksForSQL", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_27_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            27, 3,
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
    private static final TagInfo _td_c_get_28_4 = new TagInfo("c:get", //$NON-NLS-1$
            28, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_29_6 = new TagInfo("c:iterate", //$NON-NLS-1$
            29, 6,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/referenceList", //$NON-NLS-1$
                "reference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_12 = new TagInfo("c:get", //$NON-NLS-1$
            30, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_32_2 = new TagInfo("c:set", //$NON-NLS-1$
            32, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$userType", //$NON-NLS-1$
                "createUserTypeInstanceFromResultSet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_17 = new TagInfo("c:get", //$NON-NLS-1$
            33, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idFieldType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_59 = new TagInfo("c:get", //$NON-NLS-1$
            33, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_102 = new TagInfo("c:get", //$NON-NLS-1$
            33, 102,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idFieldTypeResultSetGetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_160 = new TagInfo("c:get", //$NON-NLS-1$
            33, 160,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_34_17 = new TagInfo("c:iterate", //$NON-NLS-1$
            34, 17,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/attributes", //$NON-NLS-1$
                "attribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_35_17 = new TagInfo("c:if", //$NON-NLS-1$
            35, 17,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($attribute/@fieldType = 'IMAGE')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_17 = new TagInfo("c:get", //$NON-NLS-1$
            36, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@javaType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_57 = new TagInfo("c:get", //$NON-NLS-1$
            36, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_36_95 = new TagInfo("c:if", //$NON-NLS-1$
            36, 95,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@resultSetTypeGetterForceCast = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_159 = new TagInfo("c:get", //$NON-NLS-1$
            36, 159,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@javaType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_209 = new TagInfo("c:get", //$NON-NLS-1$
            36, 209,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@resultSetTypeGetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_261 = new TagInfo("c:get", //$NON-NLS-1$
            36, 261,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_38_17 = new TagInfo("c:if", //$NON-NLS-1$
            38, 17,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldType = 'IMAGE'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_35 = new TagInfo("c:get", //$NON-NLS-1$
            39, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_85 = new TagInfo("c:get", //$NON-NLS-1$
            39, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_24 = new TagInfo("c:get", //$NON-NLS-1$
            40, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_66 = new TagInfo("c:get", //$NON-NLS-1$
            40, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_124 = new TagInfo("c:get", //$NON-NLS-1$
            40, 124,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_43_17 = new TagInfo("c:iterate", //$NON-NLS-1$
            43, 17,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/referenceList", //$NON-NLS-1$
                "reference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_25 = new TagInfo("c:get", //$NON-NLS-1$
            44, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_75 = new TagInfo("c:get", //$NON-NLS-1$
            44, 75,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_17 = new TagInfo("c:get", //$NON-NLS-1$
            47, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_52 = new TagInfo("c:get", //$NON-NLS-1$
            47, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_101 = new TagInfo("c:get", //$NON-NLS-1$
            47, 101,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_17 = new TagInfo("c:get", //$NON-NLS-1$
            48, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_60 = new TagInfo("c:get", //$NON-NLS-1$
            48, 60,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idFieldSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_104 = new TagInfo("c:get", //$NON-NLS-1$
            48, 104,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_49_17 = new TagInfo("c:iterate", //$NON-NLS-1$
            49, 17,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/attributes", //$NON-NLS-1$
                "attribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_17 = new TagInfo("c:get", //$NON-NLS-1$
            50, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_60 = new TagInfo("c:get", //$NON-NLS-1$
            50, 60,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@javaSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_102 = new TagInfo("c:get", //$NON-NLS-1$
            50, 102,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_52_17 = new TagInfo("c:iterate", //$NON-NLS-1$
            52, 17,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/referenceList", //$NON-NLS-1$
                "reference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_17 = new TagInfo("c:get", //$NON-NLS-1$
            53, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/referencedType/@fullDaoClassName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_80 = new TagInfo("c:get", //$NON-NLS-1$
            53, 80,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_195 = new TagInfo("c:get", //$NON-NLS-1$
            53, 195,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/referencedType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_17 = new TagInfo("c:get", //$NON-NLS-1$
            54, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/referencedType/@fullBeanName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_76 = new TagInfo("c:get", //$NON-NLS-1$
            54, 76,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_114 = new TagInfo("c:get", //$NON-NLS-1$
            54, 114,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_156 = new TagInfo("c:get", //$NON-NLS-1$
            54, 156,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/referencedType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_210 = new TagInfo("c:get", //$NON-NLS-1$
            54, 210,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_17 = new TagInfo("c:get", //$NON-NLS-1$
            55, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_60 = new TagInfo("c:get", //$NON-NLS-1$
            55, 60,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@javaSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_102 = new TagInfo("c:get", //$NON-NLS-1$
            55, 102,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_59_14 = new TagInfo("c:get", //$NON-NLS-1$
            59, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@derbyDAOClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_59_66 = new TagInfo("c:get", //$NON-NLS-1$
            59, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@daoClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_17 = new TagInfo("c:get", //$NON-NLS-1$
            61, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_59 = new TagInfo("c:get", //$NON-NLS-1$
            61, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_36 = new TagInfo("c:get", //$NON-NLS-1$
            64, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_75 = new TagInfo("c:get", //$NON-NLS-1$
            64, 75,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@allAttributesForSQL", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_130 = new TagInfo("c:get", //$NON-NLS-1$
            64, 130,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_68_18 = new TagInfo("c:get", //$NON-NLS-1$
            68, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_68_77 = new TagInfo("c:get", //$NON-NLS-1$
            68, 77,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_17 = new TagInfo("c:get", //$NON-NLS-1$
            71, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@createUserTypeInstanceFromResultSet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_28 = new TagInfo("c:get", //$NON-NLS-1$
            73, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_12 = new TagInfo("c:get", //$NON-NLS-1$
            86, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_50 = new TagInfo("c:get", //$NON-NLS-1$
            86, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_85 = new TagInfo("c:get", //$NON-NLS-1$
            86, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idFieldType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_127 = new TagInfo("c:get", //$NON-NLS-1$
            86, 127,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_89_36 = new TagInfo("c:get", //$NON-NLS-1$
            89, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_89_75 = new TagInfo("c:get", //$NON-NLS-1$
            89, 75,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@allAttributesForSQL", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_89_130 = new TagInfo("c:get", //$NON-NLS-1$
            89, 130,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_89_171 = new TagInfo("c:get", //$NON-NLS-1$
            89, 171,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_91_16 = new TagInfo("c:get", //$NON-NLS-1$
            91, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idFieldTypePreparedStatementSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_91_83 = new TagInfo("c:get", //$NON-NLS-1$
            91, 83,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_17 = new TagInfo("c:get", //$NON-NLS-1$
            96, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@createUserTypeInstanceFromResultSet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_98_24 = new TagInfo("c:get", //$NON-NLS-1$
            98, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_111_32 = new TagInfo("c:get", //$NON-NLS-1$
            111, 32,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_111_67 = new TagInfo("c:get", //$NON-NLS-1$
            111, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_111_102 = new TagInfo("c:get", //$NON-NLS-1$
            111, 102,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_112_12 = new TagInfo("c:get", //$NON-NLS-1$
            112, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_112_55 = new TagInfo("c:get", //$NON-NLS-1$
            112, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idFieldGetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_113_13 = new TagInfo("c:get", //$NON-NLS-1$
            113, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_113_56 = new TagInfo("c:get", //$NON-NLS-1$
            113, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_113_96 = new TagInfo("c:get", //$NON-NLS-1$
            113, 96,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_113_131 = new TagInfo("c:get", //$NON-NLS-1$
            113, 131,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_113_174 = new TagInfo("c:get", //$NON-NLS-1$
            113, 174,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idFieldGetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_114_24 = new TagInfo("c:get", //$NON-NLS-1$
            114, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_115_30 = new TagInfo("c:get", //$NON-NLS-1$
            115, 30,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_115_65 = new TagInfo("c:get", //$NON-NLS-1$
            115, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_118_22 = new TagInfo("c:get", //$NON-NLS-1$
            118, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_118_57 = new TagInfo("c:get", //$NON-NLS-1$
            118, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_122_26 = new TagInfo("c:get", //$NON-NLS-1$
            122, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_122_61 = new TagInfo("c:get", //$NON-NLS-1$
            122, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_122_96 = new TagInfo("c:get", //$NON-NLS-1$
            122, 96,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_125_41 = new TagInfo("c:get", //$NON-NLS-1$
            125, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_125_77 = new TagInfo("c:get", //$NON-NLS-1$
            125, 77,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@allAttributesForSQL", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_125_136 = new TagInfo("c:get", //$NON-NLS-1$
            125, 136,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@allAttributesAsQuestionMarksForSQL", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_129_13 = new TagInfo("c:iterate", //$NON-NLS-1$
            129, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/attributes", //$NON-NLS-1$
                "attribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_130_16 = new TagInfo("c:get", //$NON-NLS-1$
            130, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@preparedStatementTypeSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_130_84 = new TagInfo("c:if", //$NON-NLS-1$
            130, 84,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldType = 'DATE'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_132_14 = new TagInfo("c:get", //$NON-NLS-1$
            132, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_132_56 = new TagInfo("c:get", //$NON-NLS-1$
            132, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@javaGetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_132_98 = new TagInfo("c:if", //$NON-NLS-1$
            132, 98,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldType = 'DATE'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_136_13 = new TagInfo("c:iterate", //$NON-NLS-1$
            136, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/referenceList", //$NON-NLS-1$
                "reference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_137_16 = new TagInfo("c:get", //$NON-NLS-1$
            137, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_137_58 = new TagInfo("c:get", //$NON-NLS-1$
            137, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@javaGetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_138_36 = new TagInfo("c:get", //$NON-NLS-1$
            138, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_138_78 = new TagInfo("c:get", //$NON-NLS-1$
            138, 78,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@javaGetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_138_122 = new TagInfo("c:get", //$NON-NLS-1$
            138, 122,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/referencedType/@idFieldGetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_155_26 = new TagInfo("c:get", //$NON-NLS-1$
            155, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_155_61 = new TagInfo("c:get", //$NON-NLS-1$
            155, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_155_96 = new TagInfo("c:get", //$NON-NLS-1$
            155, 96,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_158_36 = new TagInfo("c:get", //$NON-NLS-1$
            158, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_158_75 = new TagInfo("c:get", //$NON-NLS-1$
            158, 75,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@allAttributesWithQuestionMarksForSQL", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_158_148 = new TagInfo("c:get", //$NON-NLS-1$
            158, 148,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_162_13 = new TagInfo("c:iterate", //$NON-NLS-1$
            162, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/attributes", //$NON-NLS-1$
                "attribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_163_16 = new TagInfo("c:get", //$NON-NLS-1$
            163, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@preparedStatementTypeSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_163_85 = new TagInfo("c:if", //$NON-NLS-1$
            163, 85,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldType = 'DATE'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_165_14 = new TagInfo("c:get", //$NON-NLS-1$
            165, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_165_56 = new TagInfo("c:get", //$NON-NLS-1$
            165, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@javaGetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_165_98 = new TagInfo("c:if", //$NON-NLS-1$
            165, 98,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldType = 'DATE'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_169_13 = new TagInfo("c:iterate", //$NON-NLS-1$
            169, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/referenceList", //$NON-NLS-1$
                "reference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_170_16 = new TagInfo("c:get", //$NON-NLS-1$
            170, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_170_58 = new TagInfo("c:get", //$NON-NLS-1$
            170, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@javaGetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_171_37 = new TagInfo("c:get", //$NON-NLS-1$
            171, 37,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_171_79 = new TagInfo("c:get", //$NON-NLS-1$
            171, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@javaGetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_171_123 = new TagInfo("c:get", //$NON-NLS-1$
            171, 123,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/referencedType/@idFieldGetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_174_16 = new TagInfo("c:get", //$NON-NLS-1$
            174, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idFieldTypePreparedStatementSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_174_90 = new TagInfo("c:get", //$NON-NLS-1$
            174, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_174_133 = new TagInfo("c:get", //$NON-NLS-1$
            174, 133,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idFieldGetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_189_26 = new TagInfo("c:get", //$NON-NLS-1$
            189, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_189_61 = new TagInfo("c:get", //$NON-NLS-1$
            189, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idFieldType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_189_103 = new TagInfo("c:get", //$NON-NLS-1$
            189, 103,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_192_41 = new TagInfo("c:get", //$NON-NLS-1$
            192, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_192_82 = new TagInfo("c:get", //$NON-NLS-1$
            192, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_194_16 = new TagInfo("c:get", //$NON-NLS-1$
            194, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idFieldTypePreparedStatementSetter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_194_83 = new TagInfo("c:get", //$NON-NLS-1$
            194, 83,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        out.write("package ");  //$NON-NLS-1$        
        out.setTag("get",8,62);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(54);
        RuntimeTagElement _jettag_c_get_1_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_9.setRuntimeParent(null);
        _jettag_c_get_1_9.setTagInfo(_td_c_get_1_9);
        _jettag_c_get_1_9.doStart(context, out);
        _jettag_c_get_1_9.doEnd();
        out.setTag(null,-1,-1);
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import java.sql.Connection;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.sql.PreparedStatement;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.sql.ResultSet;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.sql.SQLException;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.util.ArrayList;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.util.List;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        out.setTag("get",244,290);
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
        out.setTag("get",299,341);
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
        // useful pieces of recurring code 
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(41);
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(55);
        out.setTag("set",386,441);
        RuntimeTagElement _jettag_c_set_14_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_14_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_14_1.setRuntimeParent(null);
        _jettag_c_set_14_1.setTagInfo(_td_c_set_14_1);
        _jettag_c_set_14_1.doStart(context, out);
        JET2Writer _jettag_c_set_14_1_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_c_set_14_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(75);
            out.setTag("iterate",441,516);
            RuntimeTagElement _jettag_c_iterate_15_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_15_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_15_3.setRuntimeParent(_jettag_c_set_14_1);
            _jettag_c_iterate_15_3.setTagInfo(_td_c_iterate_15_3);
            _jettag_c_iterate_15_3.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_15_3.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_15_3.getTagInfo().getAttribute("delimiter"),441,516);
                out.loopIterate();
                out.setTag("get",516,551);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_16_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_16_4.setRuntimeParent(_jettag_c_iterate_15_3);
                _jettag_c_get_16_4.setTagInfo(_td_c_get_16_4);
                _jettag_c_get_16_4.doStart(context, out);
                _jettag_c_get_16_4.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_c_iterate_15_3.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_15_3.doEnd();
            out.loopEnd();
            out.endTag("iterate",35);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(14);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(66);
            out.setTag("iterate",565,631);
            RuntimeTagElement _jettag_c_iterate_17_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_17_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_17_3.setRuntimeParent(_jettag_c_set_14_1);
            _jettag_c_iterate_17_3.setTagInfo(_td_c_iterate_17_3);
            _jettag_c_iterate_17_3.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_17_3.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_17_3.getTagInfo().getAttribute("delimiter"),565,631);
                out.loopIterate();
                out.write(", ");  //$NON-NLS-1$        
                out.setTag("get",633,668);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_18_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_18_9.setRuntimeParent(_jettag_c_iterate_17_3);
                _jettag_c_get_18_9.setTagInfo(_td_c_get_18_9);
                _jettag_c_get_18_9.doStart(context, out);
                _jettag_c_get_18_9.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_c_iterate_17_3.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_17_3.doEnd();
            out.loopEnd();
            out.endTag("iterate",37);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(14);
out.bodyContentStart();
            _jettag_c_set_14_1.handleBodyContent(out);
        }
        out = _jettag_c_set_14_1_saved_out;
out.bodyContentEnd();
        _jettag_c_set_14_1.doEnd();
        out.endTag("set",241);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(9);
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(70);
        out.setTag("set",691,761);
        RuntimeTagElement _jettag_c_set_20_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_20_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_20_2.setRuntimeParent(null);
        _jettag_c_set_20_2.setTagInfo(_td_c_set_20_2);
        _jettag_c_set_20_2.doStart(context, out);
        JET2Writer _jettag_c_set_20_2_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_c_set_20_2.okToProcessBody()) {
            out = out.newNestedContentWriter();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(75);
            out.setTag("iterate",761,836);
            RuntimeTagElement _jettag_c_iterate_21_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_21_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_21_3.setRuntimeParent(_jettag_c_set_20_2);
            _jettag_c_iterate_21_3.setTagInfo(_td_c_iterate_21_3);
            _jettag_c_iterate_21_3.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_21_3.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_21_3.getTagInfo().getAttribute("delimiter"),761,836);
                out.loopIterate();
                out.write("?");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_iterate_21_3.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_21_3.doEnd();
            out.loopEnd();
            out.endTag("iterate",1);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(17);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(69);
            out.setTag("iterate",854,923);
            RuntimeTagElement _jettag_c_iterate_23_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_23_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_23_6.setRuntimeParent(_jettag_c_set_20_2);
            _jettag_c_iterate_23_6.setTagInfo(_td_c_iterate_23_6);
            _jettag_c_iterate_23_6.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_23_6.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_23_6.getTagInfo().getAttribute("delimiter"),854,923);
                out.loopIterate();
                out.write(", ?");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_iterate_23_6.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_23_6.doEnd();
            out.loopEnd();
            out.endTag("iterate",3);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(17);
out.bodyContentStart();
            _jettag_c_set_20_2.handleBodyContent(out);
        }
        out = _jettag_c_set_20_2_saved_out;
out.bodyContentEnd();
        _jettag_c_set_20_2.doEnd();
        out.endTag("set",182);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(9);
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(72);
        out.setTag("set",952,1024);
        RuntimeTagElement _jettag_c_set_26_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_26_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_26_2.setRuntimeParent(null);
        _jettag_c_set_26_2.setTagInfo(_td_c_set_26_2);
        _jettag_c_set_26_2.doStart(context, out);
        JET2Writer _jettag_c_set_26_2_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_c_set_26_2.okToProcessBody()) {
            out = out.newNestedContentWriter();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(75);
            out.setTag("iterate",1024,1099);
            RuntimeTagElement _jettag_c_iterate_27_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_27_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_27_3.setRuntimeParent(_jettag_c_set_26_2);
            _jettag_c_iterate_27_3.setTagInfo(_td_c_iterate_27_3);
            _jettag_c_iterate_27_3.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_27_3.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_27_3.getTagInfo().getAttribute("delimiter"),1024,1099);
                out.loopIterate();
                out.setTag("get",1099,1134);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_28_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_28_4.setRuntimeParent(_jettag_c_iterate_27_3);
                _jettag_c_get_28_4.setTagInfo(_td_c_get_28_4);
                _jettag_c_get_28_4.doStart(context, out);
                _jettag_c_get_28_4.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = ?");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_iterate_27_3.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_27_3.doEnd();
            out.loopEnd();
            out.endTag("iterate",39);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(17);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(69);
            out.setTag("iterate",1155,1224);
            RuntimeTagElement _jettag_c_iterate_29_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_29_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_29_6.setRuntimeParent(_jettag_c_set_26_2);
            _jettag_c_iterate_29_6.setTagInfo(_td_c_iterate_29_6);
            _jettag_c_iterate_29_6.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_29_6.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_29_6.getTagInfo().getAttribute("delimiter"),1155,1224);
                out.loopIterate();
                out.write(", ");  //$NON-NLS-1$        
                out.setTag("get",1226,1261);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_30_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_30_12.setRuntimeParent(_jettag_c_iterate_29_6);
                _jettag_c_get_30_12.setTagInfo(_td_c_get_30_12);
                _jettag_c_get_30_12.doStart(context, out);
                _jettag_c_get_30_12.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = ?");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_iterate_29_6.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_29_6.doEnd();
            out.loopEnd();
            out.endTag("iterate",41);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(17);
out.bodyContentStart();
            _jettag_c_set_26_2.handleBodyContent(out);
        }
        out = _jettag_c_set_26_2_saved_out;
out.bodyContentEnd();
        _jettag_c_set_26_2.doEnd();
        out.endTag("set",258);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(9);
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(69);
        out.setTag("set",1291,1360);
        RuntimeTagElement _jettag_c_set_32_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_32_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_32_2.setRuntimeParent(null);
        _jettag_c_set_32_2.setTagInfo(_td_c_set_32_2);
        _jettag_c_set_32_2.doStart(context, out);
        JET2Writer _jettag_c_set_32_2_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_c_set_32_2.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write(NL);         
            out.write("                ");  //$NON-NLS-1$        
            out.setTag("get",1377,1418);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(41);
            RuntimeTagElement _jettag_c_get_33_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_17); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_33_17.setRuntimeParent(_jettag_c_set_32_2);
            _jettag_c_get_33_17.setTagInfo(_td_c_get_33_17);
            _jettag_c_get_33_17.doStart(context, out);
            _jettag_c_get_33_17.doEnd();
            out.setTag(null,-1,-1);
            out.write(" ");  //$NON-NLS-1$        
            out.setTag("get",1419,1456);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(37);
            RuntimeTagElement _jettag_c_get_33_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_59); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_33_59.setRuntimeParent(_jettag_c_set_32_2);
            _jettag_c_get_33_59.setTagInfo(_td_c_get_33_59);
            _jettag_c_get_33_59.doStart(context, out);
            _jettag_c_get_33_59.doEnd();
            out.setTag(null,-1,-1);
            out.write(" = rs.");  //$NON-NLS-1$        
            out.setTag("get",1462,1518);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(56);
            RuntimeTagElement _jettag_c_get_33_102 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_102); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_33_102.setRuntimeParent(_jettag_c_set_32_2);
            _jettag_c_get_33_102.setTagInfo(_td_c_get_33_102);
            _jettag_c_get_33_102.doStart(context, out);
            _jettag_c_get_33_102.doEnd();
            out.setTag(null,-1,-1);
            out.write("(\"");  //$NON-NLS-1$        
            out.setTag("get",1520,1557);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(37);
            RuntimeTagElement _jettag_c_get_33_160 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_160); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_33_160.setRuntimeParent(_jettag_c_set_32_2);
            _jettag_c_get_33_160.setTagInfo(_td_c_get_33_160);
            _jettag_c_get_33_160.doStart(context, out);
            _jettag_c_get_33_160.doEnd();
            out.setTag(null,-1,-1);
            out.write("\");");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("                ");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(57);
            out.setTag("iterate",1577,1634);
            RuntimeTagElement _jettag_c_iterate_34_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_34_17); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_34_17.setRuntimeParent(_jettag_c_set_32_2);
            _jettag_c_iterate_34_17.setTagInfo(_td_c_iterate_34_17);
            _jettag_c_iterate_34_17.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_34_17.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_34_17.getTagInfo().getAttribute("delimiter"),1577,1634);
                out.loopIterate();
                out.write(NL);         
                out.write("                ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(50);
                out.setTag("if",1651,1701);
                RuntimeTagElement _jettag_c_if_35_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_35_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_35_17.setRuntimeParent(_jettag_c_iterate_34_17);
                _jettag_c_if_35_17.setTagInfo(_td_c_if_35_17);
                _jettag_c_if_35_17.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_35_17.okToProcessBody()) {
                    out.write(NL);         
                    out.write("                ");  //$NON-NLS-1$        
                    out.setTag("get",1718,1757);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(39);
                    RuntimeTagElement _jettag_c_get_36_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_17); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_36_17.setRuntimeParent(_jettag_c_if_35_17);
                    _jettag_c_get_36_17.setTagInfo(_td_c_get_36_17);
                    _jettag_c_get_36_17.doStart(context, out);
                    _jettag_c_get_36_17.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" ");  //$NON-NLS-1$        
                    out.setTag("get",1758,1793);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(35);
                    RuntimeTagElement _jettag_c_get_36_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_57); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_36_57.setRuntimeParent(_jettag_c_if_35_17);
                    _jettag_c_get_36_57.setTagInfo(_td_c_get_36_57);
                    _jettag_c_get_36_57.doStart(context, out);
                    _jettag_c_get_36_57.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" = ");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(63);
                    out.setTag("if",1796,1859);
                    RuntimeTagElement _jettag_c_if_36_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_36_95); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_36_95.setRuntimeParent(_jettag_c_if_35_17);
                    _jettag_c_if_36_95.setTagInfo(_td_c_if_36_95);
                    _jettag_c_if_36_95.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_c_if_36_95.okToProcessBody()) {
                        out.write("(");  //$NON-NLS-1$        
                        out.setTag("get",1860,1899);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(39);
                        RuntimeTagElement _jettag_c_get_36_159 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_159); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_36_159.setRuntimeParent(_jettag_c_if_36_95);
                        _jettag_c_get_36_159.setTagInfo(_td_c_get_36_159);
                        _jettag_c_get_36_159.doStart(context, out);
                        _jettag_c_get_36_159.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(")");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_if_36_95.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_if_36_95.doEnd();
                    out.endTag("if",41);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
                    out.write("rs.");  //$NON-NLS-1$        
                    out.setTag("get",1910,1960);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(50);
                    RuntimeTagElement _jettag_c_get_36_209 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_209); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_36_209.setRuntimeParent(_jettag_c_if_35_17);
                    _jettag_c_get_36_209.setTagInfo(_td_c_get_36_209);
                    _jettag_c_get_36_209.doStart(context, out);
                    _jettag_c_get_36_209.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("(\"");  //$NON-NLS-1$        
                    out.setTag("get",1962,1997);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(35);
                    RuntimeTagElement _jettag_c_get_36_261 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_261); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_36_261.setRuntimeParent(_jettag_c_if_35_17);
                    _jettag_c_get_36_261.setTagInfo(_td_c_get_36_261);
                    _jettag_c_get_36_261.doStart(context, out);
                    _jettag_c_get_36_261.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\");");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("                ");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_35_17.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_35_17.doEnd();
                out.endTag("if",316);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("                ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(45);
                out.setTag("if",2041,2086);
                RuntimeTagElement _jettag_c_if_38_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_38_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_38_17.setRuntimeParent(_jettag_c_iterate_34_17);
                _jettag_c_if_38_17.setTagInfo(_td_c_if_38_17);
                _jettag_c_if_38_17.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_38_17.okToProcessBody()) {
                    out.write(NL);         
                    out.write("                java.sql.Blob blob");  //$NON-NLS-1$        
                    out.setTag("get",2121,2156);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(35);
                    RuntimeTagElement _jettag_c_get_39_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_35); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_39_35.setRuntimeParent(_jettag_c_if_38_17);
                    _jettag_c_get_39_35.setTagInfo(_td_c_get_39_35);
                    _jettag_c_get_39_35.doStart(context, out);
                    _jettag_c_get_39_35.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" = rs.getBlob(\"");  //$NON-NLS-1$        
                    out.setTag("get",2171,2206);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(35);
                    RuntimeTagElement _jettag_c_get_39_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_85); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_39_85.setRuntimeParent(_jettag_c_if_38_17);
                    _jettag_c_get_39_85.setTagInfo(_td_c_get_39_85);
                    _jettag_c_get_39_85.doStart(context, out);
                    _jettag_c_get_39_85.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\");");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("                byte[] ");  //$NON-NLS-1$        
                    out.setTag("get",2233,2268);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(35);
                    RuntimeTagElement _jettag_c_get_40_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_24); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_40_24.setRuntimeParent(_jettag_c_if_38_17);
                    _jettag_c_get_40_24.setTagInfo(_td_c_get_40_24);
                    _jettag_c_get_40_24.doStart(context, out);
                    _jettag_c_get_40_24.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" = blob");  //$NON-NLS-1$        
                    out.setTag("get",2275,2310);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(35);
                    RuntimeTagElement _jettag_c_get_40_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_66); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_40_66.setRuntimeParent(_jettag_c_if_38_17);
                    _jettag_c_get_40_66.setTagInfo(_td_c_get_40_66);
                    _jettag_c_get_40_66.doStart(context, out);
                    _jettag_c_get_40_66.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".getBytes(1, (int)(blob");  //$NON-NLS-1$        
                    out.setTag("get",2333,2368);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(35);
                    RuntimeTagElement _jettag_c_get_40_124 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_124); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_40_124.setRuntimeParent(_jettag_c_if_38_17);
                    _jettag_c_get_40_124.setTagInfo(_td_c_get_40_124);
                    _jettag_c_get_40_124.doStart(context, out);
                    _jettag_c_get_40_124.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".length()));");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("                ");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_38_17.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_38_17.doEnd();
                out.endTag("if",311);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("                ");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_iterate_34_17.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_34_17.doEnd();
            out.loopEnd();
            out.endTag("iterate",787);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
            out.write("                ");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(60);
            out.setTag("iterate",2450,2510);
            RuntimeTagElement _jettag_c_iterate_43_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_43_17); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_43_17.setRuntimeParent(_jettag_c_set_32_2);
            _jettag_c_iterate_43_17.setTagInfo(_td_c_iterate_43_17);
            _jettag_c_iterate_43_17.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_43_17.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_43_17.getTagInfo().getAttribute("delimiter"),2450,2510);
                out.loopIterate();
                out.write(NL);         
                out.write("                long ref");  //$NON-NLS-1$        
                out.setTag("get",2535,2570);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_44_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_25); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_44_25.setRuntimeParent(_jettag_c_iterate_43_17);
                _jettag_c_get_44_25.setTagInfo(_td_c_get_44_25);
                _jettag_c_get_44_25.doStart(context, out);
                _jettag_c_get_44_25.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = rs.getLong(\"");  //$NON-NLS-1$        
                out.setTag("get",2585,2620);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_44_75 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_75); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_44_75.setRuntimeParent(_jettag_c_iterate_43_17);
                _jettag_c_get_44_75.setTagInfo(_td_c_get_44_75);
                _jettag_c_get_44_75.doStart(context, out);
                _jettag_c_get_44_75.doEnd();
                out.setTag(null,-1,-1);
                out.write("\");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("                ");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_iterate_43_17.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_43_17.doEnd();
            out.loopEnd();
            out.endTag("iterate",130);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
            out.write("                ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("                ");  //$NON-NLS-1$        
            out.setTag("get",2686,2720);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(34);
            RuntimeTagElement _jettag_c_get_47_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_17); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_47_17.setRuntimeParent(_jettag_c_set_32_2);
            _jettag_c_get_47_17.setTagInfo(_td_c_get_47_17);
            _jettag_c_get_47_17.doStart(context, out);
            _jettag_c_get_47_17.doEnd();
            out.setTag(null,-1,-1);
            out.write(" ");  //$NON-NLS-1$        
            out.setTag("get",2721,2763);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(42);
            RuntimeTagElement _jettag_c_get_47_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_52); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_47_52.setRuntimeParent(_jettag_c_set_32_2);
            _jettag_c_get_47_52.setTagInfo(_td_c_get_47_52);
            _jettag_c_get_47_52.doStart(context, out);
            _jettag_c_get_47_52.doEnd();
            out.setTag(null,-1,-1);
            out.write(" = new ");  //$NON-NLS-1$        
            out.setTag("get",2770,2804);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(34);
            RuntimeTagElement _jettag_c_get_47_101 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_101); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_47_101.setRuntimeParent(_jettag_c_set_32_2);
            _jettag_c_get_47_101.setTagInfo(_td_c_get_47_101);
            _jettag_c_get_47_101.doStart(context, out);
            _jettag_c_get_47_101.doEnd();
            out.setTag(null,-1,-1);
            out.write("();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("                ");  //$NON-NLS-1$        
            out.setTag("get",2824,2866);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(42);
            RuntimeTagElement _jettag_c_get_48_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_17); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_48_17.setRuntimeParent(_jettag_c_set_32_2);
            _jettag_c_get_48_17.setTagInfo(_td_c_get_48_17);
            _jettag_c_get_48_17.doStart(context, out);
            _jettag_c_get_48_17.doEnd();
            out.setTag(null,-1,-1);
            out.write(".");  //$NON-NLS-1$        
            out.setTag("get",2867,2910);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(43);
            RuntimeTagElement _jettag_c_get_48_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_60); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_48_60.setRuntimeParent(_jettag_c_set_32_2);
            _jettag_c_get_48_60.setTagInfo(_td_c_get_48_60);
            _jettag_c_get_48_60.doStart(context, out);
            _jettag_c_get_48_60.doEnd();
            out.setTag(null,-1,-1);
            out.write("(");  //$NON-NLS-1$        
            out.setTag("get",2911,2948);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(37);
            RuntimeTagElement _jettag_c_get_48_104 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_104); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_48_104.setRuntimeParent(_jettag_c_set_32_2);
            _jettag_c_get_48_104.setTagInfo(_td_c_get_48_104);
            _jettag_c_get_48_104.doStart(context, out);
            _jettag_c_get_48_104.doEnd();
            out.setTag(null,-1,-1);
            out.write(");");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("                ");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(57);
            out.setTag("iterate",2967,3024);
            RuntimeTagElement _jettag_c_iterate_49_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_49_17); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_49_17.setRuntimeParent(_jettag_c_set_32_2);
            _jettag_c_iterate_49_17.setTagInfo(_td_c_iterate_49_17);
            _jettag_c_iterate_49_17.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_49_17.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_49_17.getTagInfo().getAttribute("delimiter"),2967,3024);
                out.loopIterate();
                out.write(NL);         
                out.write("                ");  //$NON-NLS-1$        
                out.setTag("get",3041,3083);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(42);
                RuntimeTagElement _jettag_c_get_50_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_50_17.setRuntimeParent(_jettag_c_iterate_49_17);
                _jettag_c_get_50_17.setTagInfo(_td_c_get_50_17);
                _jettag_c_get_50_17.doStart(context, out);
                _jettag_c_get_50_17.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",3084,3125);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(41);
                RuntimeTagElement _jettag_c_get_50_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_60); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_50_60.setRuntimeParent(_jettag_c_iterate_49_17);
                _jettag_c_get_50_60.setTagInfo(_td_c_get_50_60);
                _jettag_c_get_50_60.doStart(context, out);
                _jettag_c_get_50_60.doEnd();
                out.setTag(null,-1,-1);
                out.write("(");  //$NON-NLS-1$        
                out.setTag("get",3126,3161);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_50_102 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_102); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_50_102.setRuntimeParent(_jettag_c_iterate_49_17);
                _jettag_c_get_50_102.setTagInfo(_td_c_get_50_102);
                _jettag_c_get_50_102.doStart(context, out);
                _jettag_c_get_50_102.doEnd();
                out.setTag(null,-1,-1);
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("                ");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_iterate_49_17.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_49_17.doEnd();
            out.loopEnd();
            out.endTag("iterate",156);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
            out.write("                ");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(60);
            out.setTag("iterate",3209,3269);
            RuntimeTagElement _jettag_c_iterate_52_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_52_17); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_52_17.setRuntimeParent(_jettag_c_set_32_2);
            _jettag_c_iterate_52_17.setTagInfo(_td_c_iterate_52_17);
            _jettag_c_iterate_52_17.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_52_17.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_52_17.getTagInfo().getAttribute("delimiter"),3209,3269);
                out.loopIterate();
                out.write(NL);         
                out.write("                ");  //$NON-NLS-1$        
                out.setTag("get",3286,3348);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(62);
                RuntimeTagElement _jettag_c_get_53_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_53_17.setRuntimeParent(_jettag_c_iterate_52_17);
                _jettag_c_get_53_17.setTagInfo(_td_c_get_53_17);
                _jettag_c_get_53_17.doStart(context, out);
                _jettag_c_get_53_17.doEnd();
                out.setTag(null,-1,-1);
                out.write(" ");  //$NON-NLS-1$        
                out.setTag("get",3349,3384);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_53_80 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_80); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_53_80.setRuntimeParent(_jettag_c_iterate_52_17);
                _jettag_c_get_53_80.setTagInfo(_td_c_get_53_80);
                _jettag_c_get_53_80.doStart(context, out);
                _jettag_c_get_53_80.doEnd();
                out.setTag(null,-1,-1);
                out.write("DAO = core.database.DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().get");  //$NON-NLS-1$        
                out.setTag("get",3464,3514);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(50);
                RuntimeTagElement _jettag_c_get_53_195 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_195); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_53_195.setRuntimeParent(_jettag_c_iterate_52_17);
                _jettag_c_get_53_195.setTagInfo(_td_c_get_53_195);
                _jettag_c_get_53_195.doStart(context, out);
                _jettag_c_get_53_195.doEnd();
                out.setTag(null,-1,-1);
                out.write("DAO();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("                ");  //$NON-NLS-1$        
                out.setTag("get",3537,3595);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_54_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_54_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_54_17.setRuntimeParent(_jettag_c_iterate_52_17);
                _jettag_c_get_54_17.setTagInfo(_td_c_get_54_17);
                _jettag_c_get_54_17.doStart(context, out);
                _jettag_c_get_54_17.doEnd();
                out.setTag(null,-1,-1);
                out.write(" ");  //$NON-NLS-1$        
                out.setTag("get",3596,3631);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_54_76 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_54_76); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_54_76.setRuntimeParent(_jettag_c_iterate_52_17);
                _jettag_c_get_54_76.setTagInfo(_td_c_get_54_76);
                _jettag_c_get_54_76.doStart(context, out);
                _jettag_c_get_54_76.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = ");  //$NON-NLS-1$        
                out.setTag("get",3634,3669);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_54_114 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_54_114); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_54_114.setRuntimeParent(_jettag_c_iterate_52_17);
                _jettag_c_get_54_114.setTagInfo(_td_c_get_54_114);
                _jettag_c_get_54_114.doStart(context, out);
                _jettag_c_get_54_114.doEnd();
                out.setTag(null,-1,-1);
                out.write("DAO.get");  //$NON-NLS-1$        
                out.setTag("get",3676,3726);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(50);
                RuntimeTagElement _jettag_c_get_54_156 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_54_156); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_54_156.setRuntimeParent(_jettag_c_iterate_52_17);
                _jettag_c_get_54_156.setTagInfo(_td_c_get_54_156);
                _jettag_c_get_54_156.doStart(context, out);
                _jettag_c_get_54_156.doEnd();
                out.setTag(null,-1,-1);
                out.write("(ref");  //$NON-NLS-1$        
                out.setTag("get",3730,3765);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_54_210 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_54_210); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_54_210.setRuntimeParent(_jettag_c_iterate_52_17);
                _jettag_c_get_54_210.setTagInfo(_td_c_get_54_210);
                _jettag_c_get_54_210.doStart(context, out);
                _jettag_c_get_54_210.doEnd();
                out.setTag(null,-1,-1);
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("                ");  //$NON-NLS-1$        
                out.setTag("get",3784,3826);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(42);
                RuntimeTagElement _jettag_c_get_55_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_55_17.setRuntimeParent(_jettag_c_iterate_52_17);
                _jettag_c_get_55_17.setTagInfo(_td_c_get_55_17);
                _jettag_c_get_55_17.doStart(context, out);
                _jettag_c_get_55_17.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",3827,3868);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(41);
                RuntimeTagElement _jettag_c_get_55_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_60); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_55_60.setRuntimeParent(_jettag_c_iterate_52_17);
                _jettag_c_get_55_60.setTagInfo(_td_c_get_55_60);
                _jettag_c_get_55_60.doStart(context, out);
                _jettag_c_get_55_60.doEnd();
                out.setTag(null,-1,-1);
                out.write("(");  //$NON-NLS-1$        
                out.setTag("get",3869,3904);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_55_102 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_102); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_55_102.setRuntimeParent(_jettag_c_iterate_52_17);
                _jettag_c_get_55_102.setTagInfo(_td_c_get_55_102);
                _jettag_c_get_55_102.doStart(context, out);
                _jettag_c_get_55_102.doEnd();
                out.setTag(null,-1,-1);
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("                ");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_iterate_52_17.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_52_17.doEnd();
            out.loopEnd();
            out.endTag("iterate",654);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_set_32_2.handleBodyContent(out);
        }
        out = _jettag_c_set_32_2_saved_out;
out.bodyContentEnd();
        _jettag_c_set_32_2.doEnd();
        out.endTag("set",2576);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(8);
        out.write(NL);         
        out.write(NL);         
        out.write("public class ");  //$NON-NLS-1$        
        out.setTag("get",3959,4002);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(43);
        RuntimeTagElement _jettag_c_get_59_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_59_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_59_14.setRuntimeParent(null);
        _jettag_c_get_59_14.setTagInfo(_td_c_get_59_14);
        _jettag_c_get_59_14.doStart(context, out);
        _jettag_c_get_59_14.doEnd();
        out.setTag(null,-1,-1);
        out.write(" extends ");  //$NON-NLS-1$        
        out.setTag("get",4011,4049);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(38);
        RuntimeTagElement _jettag_c_get_59_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_59_66); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_59_66.setRuntimeParent(null);
        _jettag_c_get_59_66.setTagInfo(_td_c_get_59_66);
        _jettag_c_get_59_66.doStart(context, out);
        _jettag_c_get_59_66.doEnd();
        out.setTag(null,-1,-1);
        out.write(" {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    @Override");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public List<");  //$NON-NLS-1$        
        out.setTag("get",4082,4116);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_61_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_61_17.setRuntimeParent(null);
        _jettag_c_get_61_17.setTagInfo(_td_c_get_61_17);
        _jettag_c_get_61_17.doStart(context, out);
        _jettag_c_get_61_17.doEnd();
        out.setTag(null,-1,-1);
        out.write("> getAll");  //$NON-NLS-1$        
        out.setTag("get",4124,4158);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_61_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_59); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_61_59.setRuntimeParent(null);
        _jettag_c_get_61_59.setTagInfo(_td_c_get_61_59);
        _jettag_c_get_61_59.doStart(context, out);
        _jettag_c_get_61_59.doEnd();
        out.setTag(null,-1,-1);
        out.write("s() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        Connection conn = getConnection();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        try {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            String query = \"SELECT ");  //$NON-NLS-1$        
        out.setTag("get",4256,4293);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_64_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_64_36.setRuntimeParent(null);
        _jettag_c_get_64_36.setTagInfo(_td_c_get_64_36);
        _jettag_c_get_64_36.doStart(context, out);
        _jettag_c_get_64_36.doEnd();
        out.setTag(null,-1,-1);
        out.write(", ");  //$NON-NLS-1$        
        out.setTag("get",4295,4344);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(49);
        RuntimeTagElement _jettag_c_get_64_75 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_75); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_64_75.setRuntimeParent(null);
        _jettag_c_get_64_75.setTagInfo(_td_c_get_64_75);
        _jettag_c_get_64_75.doStart(context, out);
        _jettag_c_get_64_75.doEnd();
        out.setTag(null,-1,-1);
        out.write(" form ");  //$NON-NLS-1$        
        out.setTag("get",4350,4384);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_64_130 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_130); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_64_130.setRuntimeParent(null);
        _jettag_c_get_64_130.setTagInfo(_td_c_get_64_130);
        _jettag_c_get_64_130.doStart(context, out);
        _jettag_c_get_64_130.doEnd();
        out.setTag(null,-1,-1);
        out.write("\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            PreparedStatement ps = conn.prepareStatement(query);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ResultSet rs = ps.executeQuery();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            List<");  //$NON-NLS-1$        
        out.setTag("get",4528,4562);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_68_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_68_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_68_18.setRuntimeParent(null);
        _jettag_c_get_68_18.setTagInfo(_td_c_get_68_18);
        _jettag_c_get_68_18.doStart(context, out);
        _jettag_c_get_68_18.doEnd();
        out.setTag(null,-1,-1);
        out.write("> result = new ArrayList<");  //$NON-NLS-1$        
        out.setTag("get",4587,4621);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_68_77 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_68_77); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_68_77.setRuntimeParent(null);
        _jettag_c_get_68_77.setTagInfo(_td_c_get_68_77);
        _jettag_c_get_68_77.doStart(context, out);
        _jettag_c_get_68_77.doEnd();
        out.setTag(null,-1,-1);
        out.write(">();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            while(rs.next()) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                ");  //$NON-NLS-1$        
        out.setTag("get",4686,4751);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(65);
        RuntimeTagElement _jettag_c_get_71_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_71_17.setRuntimeParent(null);
        _jettag_c_get_71_17.setTagInfo(_td_c_get_71_17);
        _jettag_c_get_71_17.doStart(context, out);
        _jettag_c_get_71_17.doEnd();
        out.setTag(null,-1,-1);
        out.write(NL);         
        out.write("                ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                result.add(");  //$NON-NLS-1$        
        out.setTag("get",4796,4838);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_73_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_28); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_73_28.setRuntimeParent(null);
        _jettag_c_get_73_28.setTagInfo(_td_c_get_73_28);
        _jettag_c_get_73_28.doStart(context, out);
        _jettag_c_get_73_28.doEnd();
        out.setTag(null,-1,-1);
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return result;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        } catch(SQLException se) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            se.printStackTrace();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        } finally {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            returnConnection(conn);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    @Override");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public ");  //$NON-NLS-1$        
        out.setTag("get",5087,5121);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_86_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_86_12.setRuntimeParent(null);
        _jettag_c_get_86_12.setTagInfo(_td_c_get_86_12);
        _jettag_c_get_86_12.doStart(context, out);
        _jettag_c_get_86_12.doEnd();
        out.setTag(null,-1,-1);
        out.write(" get");  //$NON-NLS-1$        
        out.setTag("get",5125,5159);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_86_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_50); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_86_50.setRuntimeParent(null);
        _jettag_c_get_86_50.setTagInfo(_td_c_get_86_50);
        _jettag_c_get_86_50.doStart(context, out);
        _jettag_c_get_86_50.doEnd();
        out.setTag(null,-1,-1);
        out.write("(");  //$NON-NLS-1$        
        out.setTag("get",5160,5201);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(41);
        RuntimeTagElement _jettag_c_get_86_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_85); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_86_85.setRuntimeParent(null);
        _jettag_c_get_86_85.setTagInfo(_td_c_get_86_85);
        _jettag_c_get_86_85.doStart(context, out);
        _jettag_c_get_86_85.doEnd();
        out.setTag(null,-1,-1);
        out.write(" ");  //$NON-NLS-1$        
        out.setTag("get",5202,5239);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_86_127 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_127); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_86_127.setRuntimeParent(null);
        _jettag_c_get_86_127.setTagInfo(_td_c_get_86_127);
        _jettag_c_get_86_127.doStart(context, out);
        _jettag_c_get_86_127.doEnd();
        out.setTag(null,-1,-1);
        out.write("Parameter) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        Connection conn = getConnection();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        try {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            String query = \"SELECT ");  //$NON-NLS-1$        
        out.setTag("get",5344,5381);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_89_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_89_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_89_36.setRuntimeParent(null);
        _jettag_c_get_89_36.setTagInfo(_td_c_get_89_36);
        _jettag_c_get_89_36.doStart(context, out);
        _jettag_c_get_89_36.doEnd();
        out.setTag(null,-1,-1);
        out.write(", ");  //$NON-NLS-1$        
        out.setTag("get",5383,5432);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(49);
        RuntimeTagElement _jettag_c_get_89_75 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_89_75); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_89_75.setRuntimeParent(null);
        _jettag_c_get_89_75.setTagInfo(_td_c_get_89_75);
        _jettag_c_get_89_75.doStart(context, out);
        _jettag_c_get_89_75.doEnd();
        out.setTag(null,-1,-1);
        out.write(" from ");  //$NON-NLS-1$        
        out.setTag("get",5438,5472);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_89_130 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_89_130); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_89_130.setRuntimeParent(null);
        _jettag_c_get_89_130.setTagInfo(_td_c_get_89_130);
        _jettag_c_get_89_130.doStart(context, out);
        _jettag_c_get_89_130.doEnd();
        out.setTag(null,-1,-1);
        out.write(" WHERE ");  //$NON-NLS-1$        
        out.setTag("get",5479,5516);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_89_171 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_89_171); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_89_171.setRuntimeParent(null);
        _jettag_c_get_89_171.setTagInfo(_td_c_get_89_171);
        _jettag_c_get_89_171.doStart(context, out);
        _jettag_c_get_89_171.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = ?\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            PreparedStatement ps = conn.prepareStatement(query);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ps.");  //$NON-NLS-1$        
        out.setTag("get",5603,5667);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(64);
        RuntimeTagElement _jettag_c_get_91_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_91_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_91_16.setRuntimeParent(null);
        _jettag_c_get_91_16.setTagInfo(_td_c_get_91_16);
        _jettag_c_get_91_16.doStart(context, out);
        _jettag_c_get_91_16.doEnd();
        out.setTag(null,-1,-1);
        out.write("(1,");  //$NON-NLS-1$        
        out.setTag("get",5670,5707);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_91_83 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_91_83); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_91_83.setRuntimeParent(null);
        _jettag_c_get_91_83.setTagInfo(_td_c_get_91_83);
        _jettag_c_get_91_83.doStart(context, out);
        _jettag_c_get_91_83.doEnd();
        out.setTag(null,-1,-1);
        out.write("Parameter);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ResultSet rs = ps.executeQuery();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            if(rs.next()) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                ");  //$NON-NLS-1$        
        out.setTag("get",5835,5900);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(65);
        RuntimeTagElement _jettag_c_get_96_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_96_17.setRuntimeParent(null);
        _jettag_c_get_96_17.setTagInfo(_td_c_get_96_17);
        _jettag_c_get_96_17.doStart(context, out);
        _jettag_c_get_96_17.doEnd();
        out.setTag(null,-1,-1);
        out.write(NL);         
        out.write("                ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                return ");  //$NON-NLS-1$        
        out.setTag("get",5941,5983);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_98_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_98_24); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_98_24.setRuntimeParent(null);
        _jettag_c_get_98_24.setTagInfo(_td_c_get_98_24);
        _jettag_c_get_98_24.doStart(context, out);
        _jettag_c_get_98_24.doEnd();
        out.setTag(null,-1,-1);
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        } catch(SQLException se) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            se.printStackTrace();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        } finally {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            returnConnection(conn);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    @Override");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public boolean saveOrUpdate");  //$NON-NLS-1$        
        out.setTag("get",6249,6283);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_111_32 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_111_32); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_111_32.setRuntimeParent(null);
        _jettag_c_get_111_32.setTagInfo(_td_c_get_111_32);
        _jettag_c_get_111_32.doStart(context, out);
        _jettag_c_get_111_32.doEnd();
        out.setTag(null,-1,-1);
        out.write("(");  //$NON-NLS-1$        
        out.setTag("get",6284,6318);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_111_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_111_67); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_111_67.setRuntimeParent(null);
        _jettag_c_get_111_67.setTagInfo(_td_c_get_111_67);
        _jettag_c_get_111_67.doStart(context, out);
        _jettag_c_get_111_67.doEnd();
        out.setTag(null,-1,-1);
        out.write(" ");  //$NON-NLS-1$        
        out.setTag("get",6319,6361);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_111_102 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_111_102); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_111_102.setRuntimeParent(null);
        _jettag_c_get_111_102.setTagInfo(_td_c_get_111_102);
        _jettag_c_get_111_102.doStart(context, out);
        _jettag_c_get_111_102.doEnd();
        out.setTag(null,-1,-1);
        out.write(") {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if(");  //$NON-NLS-1$        
        out.setTag("get",6376,6418);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_112_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_112_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_112_12.setRuntimeParent(null);
        _jettag_c_get_112_12.setTagInfo(_td_c_get_112_12);
        _jettag_c_get_112_12.doStart(context, out);
        _jettag_c_get_112_12.doEnd();
        out.setTag(null,-1,-1);
        out.write(".");  //$NON-NLS-1$        
        out.setTag("get",6419,6462);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(43);
        RuntimeTagElement _jettag_c_get_112_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_112_55); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_112_55.setRuntimeParent(null);
        _jettag_c_get_112_55.setTagInfo(_td_c_get_112_55);
        _jettag_c_get_112_55.doStart(context, out);
        _jettag_c_get_112_55.doEnd();
        out.setTag(null,-1,-1);
        out.write("() > 0) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ");  //$NON-NLS-1$        
        out.setTag("get",6484,6518);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_113_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_113_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_113_13.setRuntimeParent(null);
        _jettag_c_get_113_13.setTagInfo(_td_c_get_113_13);
        _jettag_c_get_113_13.doStart(context, out);
        _jettag_c_get_113_13.doEnd();
        out.setTag(null,-1,-1);
        out.write(" existent");  //$NON-NLS-1$        
        out.setTag("get",6527,6561);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_113_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_113_56); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_113_56.setRuntimeParent(null);
        _jettag_c_get_113_56.setTagInfo(_td_c_get_113_56);
        _jettag_c_get_113_56.doStart(context, out);
        _jettag_c_get_113_56.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = get");  //$NON-NLS-1$        
        out.setTag("get",6567,6601);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_113_96 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_113_96); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_113_96.setRuntimeParent(null);
        _jettag_c_get_113_96.setTagInfo(_td_c_get_113_96);
        _jettag_c_get_113_96.doStart(context, out);
        _jettag_c_get_113_96.doEnd();
        out.setTag(null,-1,-1);
        out.write("(");  //$NON-NLS-1$        
        out.setTag("get",6602,6644);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_113_131 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_113_131); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_113_131.setRuntimeParent(null);
        _jettag_c_get_113_131.setTagInfo(_td_c_get_113_131);
        _jettag_c_get_113_131.doStart(context, out);
        _jettag_c_get_113_131.doEnd();
        out.setTag(null,-1,-1);
        out.write(".");  //$NON-NLS-1$        
        out.setTag("get",6645,6688);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(43);
        RuntimeTagElement _jettag_c_get_113_174 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_113_174); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_113_174.setRuntimeParent(null);
        _jettag_c_get_113_174.setTagInfo(_td_c_get_113_174);
        _jettag_c_get_113_174.doStart(context, out);
        _jettag_c_get_113_174.doEnd();
        out.setTag(null,-1,-1);
        out.write("());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            if(existent");  //$NON-NLS-1$        
        out.setTag("get",6716,6750);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_114_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_114_24); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_114_24.setRuntimeParent(null);
        _jettag_c_get_114_24.setTagInfo(_td_c_get_114_24);
        _jettag_c_get_114_24.doStart(context, out);
        _jettag_c_get_114_24.doEnd();
        out.setTag(null,-1,-1);
        out.write(" != null) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                return update");  //$NON-NLS-1$        
        out.setTag("get",6791,6825);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_115_30 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_115_30); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_115_30.setRuntimeParent(null);
        _jettag_c_get_115_30.setTagInfo(_td_c_get_115_30);
        _jettag_c_get_115_30.doStart(context, out);
        _jettag_c_get_115_30.doEnd();
        out.setTag(null,-1,-1);
        out.write("(");  //$NON-NLS-1$        
        out.setTag("get",6826,6868);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_115_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_115_65); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_115_65.setRuntimeParent(null);
        _jettag_c_get_115_65.setTagInfo(_td_c_get_115_65);
        _jettag_c_get_115_65.doStart(context, out);
        _jettag_c_get_115_65.doEnd();
        out.setTag(null,-1,-1);
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        return insert");  //$NON-NLS-1$        
        out.setTag("get",6916,6950);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_118_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_118_22); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_118_22.setRuntimeParent(null);
        _jettag_c_get_118_22.setTagInfo(_td_c_get_118_22);
        _jettag_c_get_118_22.doStart(context, out);
        _jettag_c_get_118_22.doEnd();
        out.setTag(null,-1,-1);
        out.write("(");  //$NON-NLS-1$        
        out.setTag("get",6951,6993);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_118_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_118_57); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_118_57.setRuntimeParent(null);
        _jettag_c_get_118_57.setTagInfo(_td_c_get_118_57);
        _jettag_c_get_118_57.doStart(context, out);
        _jettag_c_get_118_57.doEnd();
        out.setTag(null,-1,-1);
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    @Override");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public boolean insert");  //$NON-NLS-1$        
        out.setTag("get",7042,7076);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_122_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_122_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_122_26.setRuntimeParent(null);
        _jettag_c_get_122_26.setTagInfo(_td_c_get_122_26);
        _jettag_c_get_122_26.doStart(context, out);
        _jettag_c_get_122_26.doEnd();
        out.setTag(null,-1,-1);
        out.write("(");  //$NON-NLS-1$        
        out.setTag("get",7077,7111);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_122_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_122_61); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_122_61.setRuntimeParent(null);
        _jettag_c_get_122_61.setTagInfo(_td_c_get_122_61);
        _jettag_c_get_122_61.doStart(context, out);
        _jettag_c_get_122_61.doEnd();
        out.setTag(null,-1,-1);
        out.write(" ");  //$NON-NLS-1$        
        out.setTag("get",7112,7154);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_122_96 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_122_96); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_122_96.setRuntimeParent(null);
        _jettag_c_get_122_96.setTagInfo(_td_c_get_122_96);
        _jettag_c_get_122_96.doStart(context, out);
        _jettag_c_get_122_96.doEnd();
        out.setTag(null,-1,-1);
        out.write(") {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        Connection conn = getConnection();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        try {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            String query = \"INSERT INTO ");  //$NON-NLS-1$        
        out.setTag("get",7255,7289);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_125_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_125_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_125_41.setRuntimeParent(null);
        _jettag_c_get_125_41.setTagInfo(_td_c_get_125_41);
        _jettag_c_get_125_41.doStart(context, out);
        _jettag_c_get_125_41.doEnd();
        out.setTag(null,-1,-1);
        out.write(" (");  //$NON-NLS-1$        
        out.setTag("get",7291,7340);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(49);
        RuntimeTagElement _jettag_c_get_125_77 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_125_77); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_125_77.setRuntimeParent(null);
        _jettag_c_get_125_77.setTagInfo(_td_c_get_125_77);
        _jettag_c_get_125_77.doStart(context, out);
        _jettag_c_get_125_77.doEnd();
        out.setTag(null,-1,-1);
        out.write(") values (");  //$NON-NLS-1$        
        out.setTag("get",7350,7414);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(64);
        RuntimeTagElement _jettag_c_get_125_136 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_125_136); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_125_136.setRuntimeParent(null);
        _jettag_c_get_125_136.setTagInfo(_td_c_get_125_136);
        _jettag_c_get_125_136.doStart(context, out);
        _jettag_c_get_125_136.doEnd();
        out.setTag(null,-1,-1);
        out.write(")\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            PreparedStatement ps = conn.prepareStatement(query);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.scriptletStart();
 int i=1; 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(14);
        out.scriptletEnd();
        out.write(NL);         
        out.write("            ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(57);
        out.setTag("iterate",7518,7575);
        RuntimeTagElement _jettag_c_iterate_129_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_129_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_129_13.setRuntimeParent(null);
        _jettag_c_iterate_129_13.setTagInfo(_td_c_iterate_129_13);
        _jettag_c_iterate_129_13.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_129_13.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_129_13.getTagInfo().getAttribute("delimiter"),7518,7575);
            out.loopIterate();
            out.write(NL);         
            out.write("            ps.");  //$NON-NLS-1$        
            out.setTag("get",7591,7648);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(57);
            RuntimeTagElement _jettag_c_get_130_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_130_16); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_130_16.setRuntimeParent(_jettag_c_iterate_129_13);
            _jettag_c_get_130_16.setTagInfo(_td_c_get_130_16);
            _jettag_c_get_130_16.doStart(context, out);
            _jettag_c_get_130_16.doEnd();
            out.setTag(null,-1,-1);
            out.write("(");  //$NON-NLS-1$        
            out.scriptletStart();
            out.write(i++);
    // elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
    out.jump(8);
            out.scriptletEnd();
            out.write(", ");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(57);
            out.setTag("if",7659,7716);
            RuntimeTagElement _jettag_c_if_130_84 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_130_84); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_130_84.setRuntimeParent(_jettag_c_iterate_129_13);
            _jettag_c_if_130_84.setTagInfo(_td_c_if_130_84);
            _jettag_c_if_130_84.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_130_84.okToProcessBody()) {
                out.write("new java.sql.Timestamp(");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_130_84.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_130_84.doEnd();
            out.endTag("if",23);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(20);
            out.setTag("get",7759,7800);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(41);
            RuntimeTagElement _jettag_c_get_132_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_132_14); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_132_14.setRuntimeParent(_jettag_c_iterate_129_13);
            _jettag_c_get_132_14.setTagInfo(_td_c_get_132_14);
            _jettag_c_get_132_14.doStart(context, out);
            _jettag_c_get_132_14.doEnd();
            out.setTag(null,-1,-1);
            out.write(".");  //$NON-NLS-1$        
            out.setTag("get",7801,7841);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(40);
            RuntimeTagElement _jettag_c_get_132_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_132_56); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_132_56.setRuntimeParent(_jettag_c_iterate_129_13);
            _jettag_c_get_132_56.setTagInfo(_td_c_get_132_56);
            _jettag_c_get_132_56.doStart(context, out);
            _jettag_c_get_132_56.doEnd();
            out.setTag(null,-1,-1);
            out.write("()");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(57);
            out.setTag("if",7843,7900);
            RuntimeTagElement _jettag_c_if_132_98 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_132_98); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_132_98.setRuntimeParent(_jettag_c_iterate_129_13);
            _jettag_c_if_132_98.setTagInfo(_td_c_if_132_98);
            _jettag_c_if_132_98.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_132_98.okToProcessBody()) {
                out.write(".getTime())");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_132_98.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_132_98.doEnd();
            out.endTag("if",11);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(20);
            out.write(");");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_129_13.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_129_13.doEnd();
        out.loopEnd();
        out.endTag("iterate",362);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write("     ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(60);
        out.setTag("iterate",7967,8027);
        RuntimeTagElement _jettag_c_iterate_136_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_136_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_136_13.setRuntimeParent(null);
        _jettag_c_iterate_136_13.setTagInfo(_td_c_iterate_136_13);
        _jettag_c_iterate_136_13.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_136_13.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_136_13.getTagInfo().getAttribute("delimiter"),7967,8027);
            out.loopIterate();
            out.write(NL);         
            out.write("            if(");  //$NON-NLS-1$        
            out.setTag("get",8043,8084);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(41);
            RuntimeTagElement _jettag_c_get_137_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_137_16); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_137_16.setRuntimeParent(_jettag_c_iterate_136_13);
            _jettag_c_get_137_16.setTagInfo(_td_c_get_137_16);
            _jettag_c_get_137_16.doStart(context, out);
            _jettag_c_get_137_16.doEnd();
            out.setTag(null,-1,-1);
            out.write(".");  //$NON-NLS-1$        
            out.setTag("get",8085,8126);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(41);
            RuntimeTagElement _jettag_c_get_137_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_137_58); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_137_58.setRuntimeParent(_jettag_c_iterate_136_13);
            _jettag_c_get_137_58.setTagInfo(_td_c_get_137_58);
            _jettag_c_get_137_58.doStart(context, out);
            _jettag_c_get_137_58.doEnd();
            out.setTag(null,-1,-1);
            out.write("() != null)");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("                ps.setLong(");  //$NON-NLS-1$        
            out.scriptletStart();
            out.write(i);
    // elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
    out.jump(6);
            out.scriptletEnd();
            out.write(", ");  //$NON-NLS-1$        
            out.setTag("get",8173,8214);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(41);
            RuntimeTagElement _jettag_c_get_138_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_138_36); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_138_36.setRuntimeParent(_jettag_c_iterate_136_13);
            _jettag_c_get_138_36.setTagInfo(_td_c_get_138_36);
            _jettag_c_get_138_36.doStart(context, out);
            _jettag_c_get_138_36.doEnd();
            out.setTag(null,-1,-1);
            out.write(".");  //$NON-NLS-1$        
            out.setTag("get",8215,8256);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(41);
            RuntimeTagElement _jettag_c_get_138_78 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_138_78); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_138_78.setRuntimeParent(_jettag_c_iterate_136_13);
            _jettag_c_get_138_78.setTagInfo(_td_c_get_138_78);
            _jettag_c_get_138_78.doStart(context, out);
            _jettag_c_get_138_78.doEnd();
            out.setTag(null,-1,-1);
            out.write("().");  //$NON-NLS-1$        
            out.setTag("get",8259,8318);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(59);
            RuntimeTagElement _jettag_c_get_138_122 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_138_122); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_138_122.setRuntimeParent(_jettag_c_iterate_136_13);
            _jettag_c_get_138_122.setTagInfo(_td_c_get_138_122);
            _jettag_c_get_138_122.doStart(context, out);
            _jettag_c_get_138_122.doEnd();
            out.setTag(null,-1,-1);
            out.write("());");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            else ps.setLong(");  //$NON-NLS-1$        
            out.scriptletStart();
            out.write(i++);
    // elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
    out.jump(8);
            out.scriptletEnd();
            out.write(", -1);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            ");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_136_13.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_136_13.doEnd();
        out.loopEnd();
        out.endTag("iterate",351);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write("     ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t       ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            int rows = ps.executeUpdate();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            if(rows == 1)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                return true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        } catch(SQLException se) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            se.printStackTrace();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        } finally {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            returnConnection(conn);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    @Override");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public boolean update");  //$NON-NLS-1$        
        out.setTag("get",8738,8772);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_155_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_155_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_155_26.setRuntimeParent(null);
        _jettag_c_get_155_26.setTagInfo(_td_c_get_155_26);
        _jettag_c_get_155_26.doStart(context, out);
        _jettag_c_get_155_26.doEnd();
        out.setTag(null,-1,-1);
        out.write("(");  //$NON-NLS-1$        
        out.setTag("get",8773,8807);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_155_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_155_61); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_155_61.setRuntimeParent(null);
        _jettag_c_get_155_61.setTagInfo(_td_c_get_155_61);
        _jettag_c_get_155_61.doStart(context, out);
        _jettag_c_get_155_61.doEnd();
        out.setTag(null,-1,-1);
        out.write(" ");  //$NON-NLS-1$        
        out.setTag("get",8808,8850);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_155_96 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_155_96); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_155_96.setRuntimeParent(null);
        _jettag_c_get_155_96.setTagInfo(_td_c_get_155_96);
        _jettag_c_get_155_96.doStart(context, out);
        _jettag_c_get_155_96.doEnd();
        out.setTag(null,-1,-1);
        out.write(") {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        Connection conn = getConnection();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        try {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            String query = \"UPDATE ");  //$NON-NLS-1$        
        out.setTag("get",8946,8980);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_158_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_158_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_158_36.setRuntimeParent(null);
        _jettag_c_get_158_36.setTagInfo(_td_c_get_158_36);
        _jettag_c_get_158_36.doStart(context, out);
        _jettag_c_get_158_36.doEnd();
        out.setTag(null,-1,-1);
        out.write(" set ");  //$NON-NLS-1$        
        out.setTag("get",8985,9051);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(66);
        RuntimeTagElement _jettag_c_get_158_75 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_158_75); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_158_75.setRuntimeParent(null);
        _jettag_c_get_158_75.setTagInfo(_td_c_get_158_75);
        _jettag_c_get_158_75.doStart(context, out);
        _jettag_c_get_158_75.doEnd();
        out.setTag(null,-1,-1);
        out.write(" WHERE ");  //$NON-NLS-1$        
        out.setTag("get",9058,9095);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_158_148 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_158_148); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_158_148.setRuntimeParent(null);
        _jettag_c_get_158_148.setTagInfo(_td_c_get_158_148);
        _jettag_c_get_158_148.doStart(context, out);
        _jettag_c_get_158_148.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = ?\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            PreparedStatement ps = conn.prepareStatement(query);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.scriptletStart();
 int i2=1; 
// elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
out.jump(15);
        out.scriptletEnd();
        out.write(NL);         
        out.write("            ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(57);
        out.setTag("iterate",9199,9256);
        RuntimeTagElement _jettag_c_iterate_162_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_162_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_162_13.setRuntimeParent(null);
        _jettag_c_iterate_162_13.setTagInfo(_td_c_iterate_162_13);
        _jettag_c_iterate_162_13.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_162_13.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_162_13.getTagInfo().getAttribute("delimiter"),9199,9256);
            out.loopIterate();
            out.write(NL);         
            out.write("            ps.");  //$NON-NLS-1$        
            out.setTag("get",9272,9329);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(57);
            RuntimeTagElement _jettag_c_get_163_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_163_16); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_163_16.setRuntimeParent(_jettag_c_iterate_162_13);
            _jettag_c_get_163_16.setTagInfo(_td_c_get_163_16);
            _jettag_c_get_163_16.doStart(context, out);
            _jettag_c_get_163_16.doEnd();
            out.setTag(null,-1,-1);
            out.write("(");  //$NON-NLS-1$        
            out.scriptletStart();
            out.write(i2++);
    // elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
    out.jump(9);
            out.scriptletEnd();
            out.write(", ");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(57);
            out.setTag("if",9341,9398);
            RuntimeTagElement _jettag_c_if_163_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_163_85); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_163_85.setRuntimeParent(_jettag_c_iterate_162_13);
            _jettag_c_if_163_85.setTagInfo(_td_c_if_163_85);
            _jettag_c_if_163_85.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_163_85.okToProcessBody()) {
                out.write("new java.sql.Timestamp(");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_163_85.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_163_85.doEnd();
            out.endTag("if",23);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(20);
            out.setTag("get",9441,9482);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(41);
            RuntimeTagElement _jettag_c_get_165_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_165_14); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_165_14.setRuntimeParent(_jettag_c_iterate_162_13);
            _jettag_c_get_165_14.setTagInfo(_td_c_get_165_14);
            _jettag_c_get_165_14.doStart(context, out);
            _jettag_c_get_165_14.doEnd();
            out.setTag(null,-1,-1);
            out.write(".");  //$NON-NLS-1$        
            out.setTag("get",9483,9523);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(40);
            RuntimeTagElement _jettag_c_get_165_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_165_56); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_165_56.setRuntimeParent(_jettag_c_iterate_162_13);
            _jettag_c_get_165_56.setTagInfo(_td_c_get_165_56);
            _jettag_c_get_165_56.doStart(context, out);
            _jettag_c_get_165_56.doEnd();
            out.setTag(null,-1,-1);
            out.write("()");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(57);
            out.setTag("if",9525,9582);
            RuntimeTagElement _jettag_c_if_165_98 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_165_98); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_165_98.setRuntimeParent(_jettag_c_iterate_162_13);
            _jettag_c_if_165_98.setTagInfo(_td_c_if_165_98);
            _jettag_c_if_165_98.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_165_98.okToProcessBody()) {
                out.write(".getTime())");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_165_98.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_165_98.doEnd();
            out.endTag("if",11);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(20);
            out.write(");");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_162_13.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_162_13.doEnd();
        out.loopEnd();
        out.endTag("iterate",363);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write("            ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(60);
        out.setTag("iterate",9656,9716);
        RuntimeTagElement _jettag_c_iterate_169_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_169_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_169_13.setRuntimeParent(null);
        _jettag_c_iterate_169_13.setTagInfo(_td_c_iterate_169_13);
        _jettag_c_iterate_169_13.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_169_13.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_169_13.getTagInfo().getAttribute("delimiter"),9656,9716);
            out.loopIterate();
            out.write(NL);         
            out.write("            if(");  //$NON-NLS-1$        
            out.setTag("get",9732,9773);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(41);
            RuntimeTagElement _jettag_c_get_170_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_170_16); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_170_16.setRuntimeParent(_jettag_c_iterate_169_13);
            _jettag_c_get_170_16.setTagInfo(_td_c_get_170_16);
            _jettag_c_get_170_16.doStart(context, out);
            _jettag_c_get_170_16.doEnd();
            out.setTag(null,-1,-1);
            out.write(".");  //$NON-NLS-1$        
            out.setTag("get",9774,9815);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(41);
            RuntimeTagElement _jettag_c_get_170_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_170_58); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_170_58.setRuntimeParent(_jettag_c_iterate_169_13);
            _jettag_c_get_170_58.setTagInfo(_td_c_get_170_58);
            _jettag_c_get_170_58.doStart(context, out);
            _jettag_c_get_170_58.doEnd();
            out.setTag(null,-1,-1);
            out.write("() != null)");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("                ps.setLong(");  //$NON-NLS-1$        
            out.scriptletStart();
            out.write(i2);
    // elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
    out.jump(7);
            out.scriptletEnd();
            out.write(", ");  //$NON-NLS-1$        
            out.setTag("get",9863,9904);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(41);
            RuntimeTagElement _jettag_c_get_171_37 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_171_37); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_171_37.setRuntimeParent(_jettag_c_iterate_169_13);
            _jettag_c_get_171_37.setTagInfo(_td_c_get_171_37);
            _jettag_c_get_171_37.doStart(context, out);
            _jettag_c_get_171_37.doEnd();
            out.setTag(null,-1,-1);
            out.write(".");  //$NON-NLS-1$        
            out.setTag("get",9905,9946);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(41);
            RuntimeTagElement _jettag_c_get_171_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_171_79); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_171_79.setRuntimeParent(_jettag_c_iterate_169_13);
            _jettag_c_get_171_79.setTagInfo(_td_c_get_171_79);
            _jettag_c_get_171_79.doStart(context, out);
            _jettag_c_get_171_79.doEnd();
            out.setTag(null,-1,-1);
            out.write("().");  //$NON-NLS-1$        
            out.setTag("get",9949,10008);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(59);
            RuntimeTagElement _jettag_c_get_171_123 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_171_123); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_171_123.setRuntimeParent(_jettag_c_iterate_169_13);
            _jettag_c_get_171_123.setTagInfo(_td_c_get_171_123);
            _jettag_c_get_171_123.doStart(context, out);
            _jettag_c_get_171_123.doEnd();
            out.setTag(null,-1,-1);
            out.write("());");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            else ps.setLong(");  //$NON-NLS-1$        
            out.scriptletStart();
            out.write(i2++);
    // elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
    out.jump(9);
            out.scriptletEnd();
            out.write(", -1);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            ");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_169_13.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_169_13.doEnd();
        out.loopEnd();
        out.endTag("iterate",353);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write("     ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ps.");  //$NON-NLS-1$        
        out.setTag("get",10102,10166);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(64);
        RuntimeTagElement _jettag_c_get_174_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_174_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_174_16.setRuntimeParent(null);
        _jettag_c_get_174_16.setTagInfo(_td_c_get_174_16);
        _jettag_c_get_174_16.doStart(context, out);
        _jettag_c_get_174_16.doEnd();
        out.setTag(null,-1,-1);
        out.write("(");  //$NON-NLS-1$        
        out.scriptletStart();
        out.write(i2);
// elemento tipo JavaExpression(org.eclipse.jet.core.parser.ast.JavaExpression)
out.jump(7);
        out.scriptletEnd();
        out.write(", ");  //$NON-NLS-1$        
        out.setTag("get",10176,10218);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_174_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_174_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_174_90.setRuntimeParent(null);
        _jettag_c_get_174_90.setTagInfo(_td_c_get_174_90);
        _jettag_c_get_174_90.doStart(context, out);
        _jettag_c_get_174_90.doEnd();
        out.setTag(null,-1,-1);
        out.write(".");  //$NON-NLS-1$        
        out.setTag("get",10219,10262);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(43);
        RuntimeTagElement _jettag_c_get_174_133 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_174_133); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_174_133.setRuntimeParent(null);
        _jettag_c_get_174_133.setTagInfo(_td_c_get_174_133);
        _jettag_c_get_174_133.doStart(context, out);
        _jettag_c_get_174_133.doEnd();
        out.setTag(null,-1,-1);
        out.write("());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            int rows = ps.executeUpdate();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            if(rows == 1)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                return true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        } catch(SQLException se) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            se.printStackTrace();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        } finally {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            returnConnection(conn);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    @Override");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public boolean delete");  //$NON-NLS-1$        
        out.setTag("get",10611,10645);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_189_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_189_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_189_26.setRuntimeParent(null);
        _jettag_c_get_189_26.setTagInfo(_td_c_get_189_26);
        _jettag_c_get_189_26.doStart(context, out);
        _jettag_c_get_189_26.doEnd();
        out.setTag(null,-1,-1);
        out.write("(");  //$NON-NLS-1$        
        out.setTag("get",10646,10687);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(41);
        RuntimeTagElement _jettag_c_get_189_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_189_61); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_189_61.setRuntimeParent(null);
        _jettag_c_get_189_61.setTagInfo(_td_c_get_189_61);
        _jettag_c_get_189_61.doStart(context, out);
        _jettag_c_get_189_61.doEnd();
        out.setTag(null,-1,-1);
        out.write(" ");  //$NON-NLS-1$        
        out.setTag("get",10688,10725);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_189_103 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_189_103); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_189_103.setRuntimeParent(null);
        _jettag_c_get_189_103.setTagInfo(_td_c_get_189_103);
        _jettag_c_get_189_103.doStart(context, out);
        _jettag_c_get_189_103.doEnd();
        out.setTag(null,-1,-1);
        out.write(") {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        Connection conn = getConnection();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        try {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            String query = \"DELETE FROM ");  //$NON-NLS-1$        
        out.setTag("get",10826,10860);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_192_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_192_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_192_41.setRuntimeParent(null);
        _jettag_c_get_192_41.setTagInfo(_td_c_get_192_41);
        _jettag_c_get_192_41.doStart(context, out);
        _jettag_c_get_192_41.doEnd();
        out.setTag(null,-1,-1);
        out.write(" where ");  //$NON-NLS-1$        
        out.setTag("get",10867,10904);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_192_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_192_82); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_192_82.setRuntimeParent(null);
        _jettag_c_get_192_82.setTagInfo(_td_c_get_192_82);
        _jettag_c_get_192_82.doStart(context, out);
        _jettag_c_get_192_82.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = ?\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            PreparedStatement ps = conn.prepareStatement(query);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ps.");  //$NON-NLS-1$        
        out.setTag("get",10991,11055);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(64);
        RuntimeTagElement _jettag_c_get_194_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_194_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_194_16.setRuntimeParent(null);
        _jettag_c_get_194_16.setTagInfo(_td_c_get_194_16);
        _jettag_c_get_194_16.doStart(context, out);
        _jettag_c_get_194_16.doEnd();
        out.setTag(null,-1,-1);
        out.write("(1,");  //$NON-NLS-1$        
        out.setTag("get",11058,11095);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_194_83 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_194_83); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_194_83.setRuntimeParent(null);
        _jettag_c_get_194_83.setTagInfo(_td_c_get_194_83);
        _jettag_c_get_194_83.doStart(context, out);
        _jettag_c_get_194_83.doEnd();
        out.setTag(null,-1,-1);
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            int rows = ps.executeUpdate();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            if(rows == 1)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                return true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        } catch(SQLException se) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            se.printStackTrace();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        } finally {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            returnConnection(conn);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.popTemplateFile();
    }
}
