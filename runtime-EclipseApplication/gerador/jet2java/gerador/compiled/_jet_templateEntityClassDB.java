package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_templateEntityClassDB implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_templateEntityClassDB(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_3_15 = new TagInfo("c:get", //$NON-NLS-1$
            3, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_4_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            4, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_4_65 = new TagInfo("c:if", //$NON-NLS-1$
            4, 65,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_18 = new TagInfo("c:get", //$NON-NLS-1$
            5, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_7 = new TagInfo("c:get", //$NON-NLS-1$
            7, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_21 = new TagInfo("c:get", //$NON-NLS-1$
            12, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "/Domainmodel/@nomeProj", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_23 = new TagInfo("c:get", //$NON-NLS-1$
            21, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_34 = new TagInfo("c:get", //$NON-NLS-1$
            23, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_23_81 = new TagInfo("c:iterate", //$NON-NLS-1$
            23, 81,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_24_5 = new TagInfo("c:if", //$NON-NLS-1$
            24, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name != '') or (($currentFeature/EntityType/entity/@name != '') and ($currentFeature/@min <= 1) and ($currentFeature/@max <= 1))", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_7 = new TagInfo("c:get", //$NON-NLS-1$
            25, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_27_13 = new TagInfo("c:iterate", //$NON-NLS-1$
            27, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_28_5 = new TagInfo("c:if", //$NON-NLS-1$
            28, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and ($currentFeature/@min <= 1) and ($currentFeature/@max <= 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_12 = new TagInfo("c:get", //$NON-NLS-1$
            29, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_56 = new TagInfo("c:get", //$NON-NLS-1$
            29, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_30_12 = new TagInfo("c:if", //$NON-NLS-1$
            30, 12,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_31_7 = new TagInfo("c:if", //$NON-NLS-1$
            31, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'boolean')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_14 = new TagInfo("c:get", //$NON-NLS-1$
            32, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_58 = new TagInfo("c:get", //$NON-NLS-1$
            32, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_32_139 = new TagInfo("c:if", //$NON-NLS-1$
            32, 139,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name != 'boolean')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_13 = new TagInfo("c:get", //$NON-NLS-1$
            33, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_57 = new TagInfo("c:get", //$NON-NLS-1$
            33, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_42_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            42, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_43_4 = new TagInfo("c:if", //$NON-NLS-1$
            43, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and (($currentFeature/@min > 1) or ($currentFeature/@max > 1))", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_14 = new TagInfo("c:get", //$NON-NLS-1$
            44, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_58 = new TagInfo("c:get", //$NON-NLS-1$
            44, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_114 = new TagInfo("c:get", //$NON-NLS-1$
            44, 114,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_35 = new TagInfo("c:get", //$NON-NLS-1$
            45, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_82 = new TagInfo("c:get", //$NON-NLS-1$
            45, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_6 = new TagInfo("c:get", //$NON-NLS-1$
            46, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_6 = new TagInfo("c:get", //$NON-NLS-1$
            47, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_14 = new TagInfo("c:get", //$NON-NLS-1$
            52, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_26 = new TagInfo("c:get", //$NON-NLS-1$
            64, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_29 = new TagInfo("c:get", //$NON-NLS-1$
            66, 29,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_66_79 = new TagInfo("c:iterate", //$NON-NLS-1$
            66, 79,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_67_5 = new TagInfo("c:if", //$NON-NLS-1$
            67, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and ($currentFeature/@min <= 1) and ($currentFeature/@max <= 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_68_7 = new TagInfo("c:get", //$NON-NLS-1$
            68, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_68_55 = new TagInfo("c:get", //$NON-NLS-1$
            68, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_68_99 = new TagInfo("c:get", //$NON-NLS-1$
            68, 99,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_69_12 = new TagInfo("c:if", //$NON-NLS-1$
            69, 12,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_70_7 = new TagInfo("c:if", //$NON-NLS-1$
            70, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'boolean')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_7 = new TagInfo("c:get", //$NON-NLS-1$
            71, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_57 = new TagInfo("c:get", //$NON-NLS-1$
            71, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_101 = new TagInfo("c:get", //$NON-NLS-1$
            71, 101,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_71_182 = new TagInfo("c:if", //$NON-NLS-1$
            71, 182,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name != 'boolean')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_7 = new TagInfo("c:get", //$NON-NLS-1$
            72, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_56 = new TagInfo("c:get", //$NON-NLS-1$
            72, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_100 = new TagInfo("c:get", //$NON-NLS-1$
            72, 100,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_20 = new TagInfo("c:get", //$NON-NLS-1$
            73, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_78_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            78, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_79_4 = new TagInfo("c:if", //$NON-NLS-1$
            79, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and (($currentFeature/@min > 1) or ($currentFeature/@max > 1))", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_80_35 = new TagInfo("c:get", //$NON-NLS-1$
            80, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_80_82 = new TagInfo("c:get", //$NON-NLS-1$
            80, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_81_10 = new TagInfo("c:get", //$NON-NLS-1$
            81, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_81_67 = new TagInfo("c:get", //$NON-NLS-1$
            81, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_13 = new TagInfo("c:get", //$NON-NLS-1$
            86, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_57 = new TagInfo("c:get", //$NON-NLS-1$
            86, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_113 = new TagInfo("c:get", //$NON-NLS-1$
            86, 113,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_87_35 = new TagInfo("c:get", //$NON-NLS-1$
            87, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_87_82 = new TagInfo("c:get", //$NON-NLS-1$
            87, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_88_6 = new TagInfo("c:get", //$NON-NLS-1$
            88, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_89_6 = new TagInfo("c:get", //$NON-NLS-1$
            89, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_93_11 = new TagInfo("c:get", //$NON-NLS-1$
            93, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_94_14 = new TagInfo("c:get", //$NON-NLS-1$
            94, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_106_27 = new TagInfo("c:get", //$NON-NLS-1$
            106, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_109_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            109, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_110_4 = new TagInfo("c:if", //$NON-NLS-1$
            110, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and (($currentFeature/@min > 1) or ($currentFeature/@max > 1))", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_111_35 = new TagInfo("c:get", //$NON-NLS-1$
            111, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_111_82 = new TagInfo("c:get", //$NON-NLS-1$
            111, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_112_10 = new TagInfo("c:get", //$NON-NLS-1$
            112, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_112_67 = new TagInfo("c:get", //$NON-NLS-1$
            112, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_117_34 = new TagInfo("c:get", //$NON-NLS-1$
            117, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_117_97 = new TagInfo("c:get", //$NON-NLS-1$
            117, 97,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_129_5 = new TagInfo("c:get", //$NON-NLS-1$
            129, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_129_58 = new TagInfo("c:get", //$NON-NLS-1$
            129, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_130_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            130, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_131_6 = new TagInfo("c:if", //$NON-NLS-1$
            131, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and ($currentFeature/@min <= 1) and ($currentFeature/@max <= 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_132_6 = new TagInfo("c:get", //$NON-NLS-1$
            132, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_132_78 = new TagInfo("c:get", //$NON-NLS-1$
            132, 78,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_132_148 = new TagInfo("c:iterate", //$NON-NLS-1$
            132, 148,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_133_7 = new TagInfo("c:get", //$NON-NLS-1$
            133, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_133_73 = new TagInfo("c:get", //$NON-NLS-1$
            133, 73,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_133_135 = new TagInfo("c:get", //$NON-NLS-1$
            133, 135,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_133_201 = new TagInfo("c:get", //$NON-NLS-1$
            133, 201,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_134_12 = new TagInfo("c:if", //$NON-NLS-1$
            134, 12,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_135_6 = new TagInfo("c:get", //$NON-NLS-1$
            135, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_135_53 = new TagInfo("c:get", //$NON-NLS-1$
            135, 53,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_135_97 = new TagInfo("c:get", //$NON-NLS-1$
            135, 97,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_135_144 = new TagInfo("c:get", //$NON-NLS-1$
            135, 144,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_136_5 = new TagInfo("c:get", //$NON-NLS-1$
            136, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_137_5 = new TagInfo("c:get", //$NON-NLS-1$
            137, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_138_9 = new TagInfo("c:get", //$NON-NLS-1$
            138, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_139_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            139, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_139_68 = new TagInfo("c:if", //$NON-NLS-1$
            139, 68,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and ($currentFeature/@min <= 1) and ($currentFeature/@max <= 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_140_16 = new TagInfo("c:get", //$NON-NLS-1$
            140, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_140_85 = new TagInfo("c:get", //$NON-NLS-1$
            140, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_140_156 = new TagInfo("c:get", //$NON-NLS-1$
            140, 156,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_140_203 = new TagInfo("c:get", //$NON-NLS-1$
            140, 203,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_141_13 = new TagInfo("c:get", //$NON-NLS-1$
            141, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_146_6 = new TagInfo("c:get", //$NON-NLS-1$
            146, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_146_52 = new TagInfo("c:get", //$NON-NLS-1$
            146, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_148_6 = new TagInfo("c:get", //$NON-NLS-1$
            148, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_148_59 = new TagInfo("c:get", //$NON-NLS-1$
            148, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_149_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            149, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_150_5 = new TagInfo("c:if", //$NON-NLS-1$
            150, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and ($currentFeature/@min <= 1) and ($currentFeature/@max <= 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_151_6 = new TagInfo("c:get", //$NON-NLS-1$
            151, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_151_71 = new TagInfo("c:get", //$NON-NLS-1$
            151, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_152_6 = new TagInfo("c:get", //$NON-NLS-1$
            152, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_152_78 = new TagInfo("c:get", //$NON-NLS-1$
            152, 78,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_153_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            153, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_154_7 = new TagInfo("c:get", //$NON-NLS-1$
            154, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_154_70 = new TagInfo("c:get", //$NON-NLS-1$
            154, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_154_141 = new TagInfo("c:get", //$NON-NLS-1$
            154, 141,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_154_207 = new TagInfo("c:get", //$NON-NLS-1$
            154, 207,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_156_6 = new TagInfo("c:get", //$NON-NLS-1$
            156, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_156_50 = new TagInfo("c:get", //$NON-NLS-1$
            156, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_156_98 = new TagInfo("c:get", //$NON-NLS-1$
            156, 98,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_157_11 = new TagInfo("c:if", //$NON-NLS-1$
            157, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_158_6 = new TagInfo("c:get", //$NON-NLS-1$
            158, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_158_50 = new TagInfo("c:get", //$NON-NLS-1$
            158, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_158_103 = new TagInfo("c:get", //$NON-NLS-1$
            158, 103,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_158_150 = new TagInfo("c:get", //$NON-NLS-1$
            158, 150,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_159_11 = new TagInfo("c:if", //$NON-NLS-1$
            159, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and (($currentFeature/@min > 1) or ($currentFeature/@max > 1))", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_160_12 = new TagInfo("c:get", //$NON-NLS-1$
            160, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_161_7 = new TagInfo("c:get", //$NON-NLS-1$
            161, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_161_79 = new TagInfo("c:get", //$NON-NLS-1$
            161, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_161_149 = new TagInfo("c:iterate", //$NON-NLS-1$
            161, 149,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_162_8 = new TagInfo("c:get", //$NON-NLS-1$
            162, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_162_74 = new TagInfo("c:get", //$NON-NLS-1$
            162, 74,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_162_136 = new TagInfo("c:get", //$NON-NLS-1$
            162, 136,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_162_202 = new TagInfo("c:get", //$NON-NLS-1$
            162, 202,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_163_7 = new TagInfo("c:get", //$NON-NLS-1$
            163, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_163_54 = new TagInfo("c:get", //$NON-NLS-1$
            163, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_164_7 = new TagInfo("c:get", //$NON-NLS-1$
            164, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_164_54 = new TagInfo("c:get", //$NON-NLS-1$
            164, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_165_11 = new TagInfo("c:get", //$NON-NLS-1$
            165, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_165_58 = new TagInfo("c:get", //$NON-NLS-1$
            165, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_166_17 = new TagInfo("c:get", //$NON-NLS-1$
            166, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_166_86 = new TagInfo("c:get", //$NON-NLS-1$
            166, 86,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_166_157 = new TagInfo("c:get", //$NON-NLS-1$
            166, 157,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_166_204 = new TagInfo("c:get", //$NON-NLS-1$
            166, 204,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_166_270 = new TagInfo("c:get", //$NON-NLS-1$
            166, 270,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_167_12 = new TagInfo("c:get", //$NON-NLS-1$
            167, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_167_59 = new TagInfo("c:get", //$NON-NLS-1$
            167, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_167_125 = new TagInfo("c:get", //$NON-NLS-1$
            167, 125,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_167_182 = new TagInfo("c:get", //$NON-NLS-1$
            167, 182,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_170_16 = new TagInfo("c:get", //$NON-NLS-1$
            170, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_171_18 = new TagInfo("c:get", //$NON-NLS-1$
            171, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_171_83 = new TagInfo("c:get", //$NON-NLS-1$
            171, 83,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_172_8 = new TagInfo("c:get", //$NON-NLS-1$
            172, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_172_73 = new TagInfo("c:get", //$NON-NLS-1$
            172, 73,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_173_8 = new TagInfo("c:get", //$NON-NLS-1$
            173, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_173_79 = new TagInfo("c:get", //$NON-NLS-1$
            173, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_173_121 = new TagInfo("c:get", //$NON-NLS-1$
            173, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_174_7 = new TagInfo("c:iterate", //$NON-NLS-1$
            174, 7,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_175_9 = new TagInfo("c:get", //$NON-NLS-1$
            175, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_175_72 = new TagInfo("c:get", //$NON-NLS-1$
            175, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_175_142 = new TagInfo("c:get", //$NON-NLS-1$
            175, 142,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_175_184 = new TagInfo("c:get", //$NON-NLS-1$
            175, 184,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_175_250 = new TagInfo("c:get", //$NON-NLS-1$
            175, 250,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_177_8 = new TagInfo("c:get", //$NON-NLS-1$
            177, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_177_52 = new TagInfo("c:get", //$NON-NLS-1$
            177, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_177_100 = new TagInfo("c:get", //$NON-NLS-1$
            177, 100,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_181_18 = new TagInfo("c:get", //$NON-NLS-1$
            181, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_188_23 = new TagInfo("c:get", //$NON-NLS-1$
            188, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_194_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            194, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_195_7 = new TagInfo("c:if", //$NON-NLS-1$
            195, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_196_15 = new TagInfo("c:get", //$NON-NLS-1$
            196, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_196_59 = new TagInfo("c:get", //$NON-NLS-1$
            196, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_196_119 = new TagInfo("c:get", //$NON-NLS-1$
            196, 119,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_196_163 = new TagInfo("c:get", //$NON-NLS-1$
            196, 163,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_197_19 = new TagInfo("c:get", //$NON-NLS-1$
            197, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_197_63 = new TagInfo("c:get", //$NON-NLS-1$
            197, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_197_117 = new TagInfo("c:get", //$NON-NLS-1$
            197, 117,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_197_161 = new TagInfo("c:get", //$NON-NLS-1$
            197, 161,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_198_10 = new TagInfo("c:if", //$NON-NLS-1$
            198, 10,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_199_13 = new TagInfo("c:get", //$NON-NLS-1$
            199, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_199_57 = new TagInfo("c:get", //$NON-NLS-1$
            199, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_206_4 = new TagInfo("c:if", //$NON-NLS-1$
            206, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_207_20 = new TagInfo("c:get", //$NON-NLS-1$
            207, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_207_64 = new TagInfo("c:get", //$NON-NLS-1$
            207, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_210_16 = new TagInfo("c:get", //$NON-NLS-1$
            210, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_210_60 = new TagInfo("c:get", //$NON-NLS-1$
            210, 60,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_210_113 = new TagInfo("c:get", //$NON-NLS-1$
            210, 113,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_215_7 = new TagInfo("c:if", //$NON-NLS-1$
            215, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/@min <= 1) and ($currentFeature/@max <= 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_216_19 = new TagInfo("c:get", //$NON-NLS-1$
            216, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_216_66 = new TagInfo("c:get", //$NON-NLS-1$
            216, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_216_114 = new TagInfo("c:get", //$NON-NLS-1$
            216, 114,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_217_14 = new TagInfo("c:if", //$NON-NLS-1$
            217, 14,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/@min > 1) or ($currentFeature/@max > 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_220_13 = new TagInfo("c:get", //$NON-NLS-1$
            220, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_220_60 = new TagInfo("c:get", //$NON-NLS-1$
            220, 60,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_222_9 = new TagInfo("c:get", //$NON-NLS-1$
            222, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_222_56 = new TagInfo("c:get", //$NON-NLS-1$
            222, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_222_122 = new TagInfo("c:get", //$NON-NLS-1$
            222, 122,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_222_174 = new TagInfo("c:get", //$NON-NLS-1$
            222, 174,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_223_13 = new TagInfo("c:get", //$NON-NLS-1$
            223, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_223_60 = new TagInfo("c:get", //$NON-NLS-1$
            223, 60,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_223_126 = new TagInfo("c:get", //$NON-NLS-1$
            223, 126,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_223_202 = new TagInfo("c:get", //$NON-NLS-1$
            223, 202,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_230_17 = new TagInfo("c:get", //$NON-NLS-1$
            230, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_230_64 = new TagInfo("c:get", //$NON-NLS-1$
            230, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_230_112 = new TagInfo("c:get", //$NON-NLS-1$
            230, 112,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_230_156 = new TagInfo("c:get", //$NON-NLS-1$
            230, 156,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_232_11 = new TagInfo("c:if", //$NON-NLS-1$
            232, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_233_17 = new TagInfo("c:get", //$NON-NLS-1$
            233, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_233_64 = new TagInfo("c:get", //$NON-NLS-1$
            233, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_233_113 = new TagInfo("c:get", //$NON-NLS-1$
            233, 113,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_233_157 = new TagInfo("c:get", //$NON-NLS-1$
            233, 157,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_238_5 = new TagInfo("c:get", //$NON-NLS-1$
            238, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_238_58 = new TagInfo("c:get", //$NON-NLS-1$
            238, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_239_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            239, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_240_6 = new TagInfo("c:if", //$NON-NLS-1$
            240, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and ($currentFeature/@min <= 1) and ($currentFeature/@max <= 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_241_6 = new TagInfo("c:get", //$NON-NLS-1$
            241, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_241_78 = new TagInfo("c:get", //$NON-NLS-1$
            241, 78,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_241_148 = new TagInfo("c:iterate", //$NON-NLS-1$
            241, 148,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_242_7 = new TagInfo("c:get", //$NON-NLS-1$
            242, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_242_73 = new TagInfo("c:get", //$NON-NLS-1$
            242, 73,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_242_135 = new TagInfo("c:get", //$NON-NLS-1$
            242, 135,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_242_201 = new TagInfo("c:get", //$NON-NLS-1$
            242, 201,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_243_12 = new TagInfo("c:if", //$NON-NLS-1$
            243, 12,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_244_6 = new TagInfo("c:get", //$NON-NLS-1$
            244, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_244_53 = new TagInfo("c:get", //$NON-NLS-1$
            244, 53,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_244_97 = new TagInfo("c:get", //$NON-NLS-1$
            244, 97,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_244_144 = new TagInfo("c:get", //$NON-NLS-1$
            244, 144,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_245_5 = new TagInfo("c:get", //$NON-NLS-1$
            245, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_246_5 = new TagInfo("c:get", //$NON-NLS-1$
            246, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_247_9 = new TagInfo("c:get", //$NON-NLS-1$
            247, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_248_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            248, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_248_68 = new TagInfo("c:if", //$NON-NLS-1$
            248, 68,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and ($currentFeature/@min <= 1) and ($currentFeature/@max <= 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_249_16 = new TagInfo("c:get", //$NON-NLS-1$
            249, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_249_85 = new TagInfo("c:get", //$NON-NLS-1$
            249, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_249_156 = new TagInfo("c:get", //$NON-NLS-1$
            249, 156,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_249_203 = new TagInfo("c:get", //$NON-NLS-1$
            249, 203,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_250_26 = new TagInfo("c:get", //$NON-NLS-1$
            250, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_254_6 = new TagInfo("c:get", //$NON-NLS-1$
            254, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_254_52 = new TagInfo("c:get", //$NON-NLS-1$
            254, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_256_6 = new TagInfo("c:get", //$NON-NLS-1$
            256, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_256_59 = new TagInfo("c:get", //$NON-NLS-1$
            256, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_257_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            257, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_258_5 = new TagInfo("c:if", //$NON-NLS-1$
            258, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and ($currentFeature/@min <= 1) and ($currentFeature/@max <= 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_259_6 = new TagInfo("c:get", //$NON-NLS-1$
            259, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_259_71 = new TagInfo("c:get", //$NON-NLS-1$
            259, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_260_6 = new TagInfo("c:get", //$NON-NLS-1$
            260, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_260_78 = new TagInfo("c:get", //$NON-NLS-1$
            260, 78,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_261_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            261, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_262_7 = new TagInfo("c:get", //$NON-NLS-1$
            262, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_262_70 = new TagInfo("c:get", //$NON-NLS-1$
            262, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_262_141 = new TagInfo("c:get", //$NON-NLS-1$
            262, 141,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_262_207 = new TagInfo("c:get", //$NON-NLS-1$
            262, 207,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_264_6 = new TagInfo("c:get", //$NON-NLS-1$
            264, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_264_50 = new TagInfo("c:get", //$NON-NLS-1$
            264, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_264_98 = new TagInfo("c:get", //$NON-NLS-1$
            264, 98,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_265_11 = new TagInfo("c:if", //$NON-NLS-1$
            265, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_266_6 = new TagInfo("c:get", //$NON-NLS-1$
            266, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_266_50 = new TagInfo("c:get", //$NON-NLS-1$
            266, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_266_103 = new TagInfo("c:get", //$NON-NLS-1$
            266, 103,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_266_150 = new TagInfo("c:get", //$NON-NLS-1$
            266, 150,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_267_11 = new TagInfo("c:if", //$NON-NLS-1$
            267, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and (($currentFeature/@min > 1) or ($currentFeature/@max > 1))", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_268_12 = new TagInfo("c:get", //$NON-NLS-1$
            268, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_269_7 = new TagInfo("c:get", //$NON-NLS-1$
            269, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_269_79 = new TagInfo("c:get", //$NON-NLS-1$
            269, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_269_149 = new TagInfo("c:iterate", //$NON-NLS-1$
            269, 149,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_270_8 = new TagInfo("c:get", //$NON-NLS-1$
            270, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_270_74 = new TagInfo("c:get", //$NON-NLS-1$
            270, 74,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_270_136 = new TagInfo("c:get", //$NON-NLS-1$
            270, 136,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_270_202 = new TagInfo("c:get", //$NON-NLS-1$
            270, 202,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_271_7 = new TagInfo("c:get", //$NON-NLS-1$
            271, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_271_54 = new TagInfo("c:get", //$NON-NLS-1$
            271, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_272_7 = new TagInfo("c:get", //$NON-NLS-1$
            272, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_272_54 = new TagInfo("c:get", //$NON-NLS-1$
            272, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_273_11 = new TagInfo("c:get", //$NON-NLS-1$
            273, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_273_58 = new TagInfo("c:get", //$NON-NLS-1$
            273, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_274_17 = new TagInfo("c:get", //$NON-NLS-1$
            274, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_274_86 = new TagInfo("c:get", //$NON-NLS-1$
            274, 86,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_274_157 = new TagInfo("c:get", //$NON-NLS-1$
            274, 157,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_274_204 = new TagInfo("c:get", //$NON-NLS-1$
            274, 204,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_274_270 = new TagInfo("c:get", //$NON-NLS-1$
            274, 270,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_275_12 = new TagInfo("c:get", //$NON-NLS-1$
            275, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_275_59 = new TagInfo("c:get", //$NON-NLS-1$
            275, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_275_125 = new TagInfo("c:get", //$NON-NLS-1$
            275, 125,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_275_182 = new TagInfo("c:get", //$NON-NLS-1$
            275, 182,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_278_16 = new TagInfo("c:get", //$NON-NLS-1$
            278, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_279_18 = new TagInfo("c:get", //$NON-NLS-1$
            279, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_279_83 = new TagInfo("c:get", //$NON-NLS-1$
            279, 83,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_280_8 = new TagInfo("c:get", //$NON-NLS-1$
            280, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_280_73 = new TagInfo("c:get", //$NON-NLS-1$
            280, 73,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_281_8 = new TagInfo("c:get", //$NON-NLS-1$
            281, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_281_79 = new TagInfo("c:get", //$NON-NLS-1$
            281, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_281_121 = new TagInfo("c:get", //$NON-NLS-1$
            281, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_282_7 = new TagInfo("c:iterate", //$NON-NLS-1$
            282, 7,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_283_9 = new TagInfo("c:get", //$NON-NLS-1$
            283, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_283_72 = new TagInfo("c:get", //$NON-NLS-1$
            283, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_283_142 = new TagInfo("c:get", //$NON-NLS-1$
            283, 142,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_283_184 = new TagInfo("c:get", //$NON-NLS-1$
            283, 184,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_283_250 = new TagInfo("c:get", //$NON-NLS-1$
            283, 250,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_285_8 = new TagInfo("c:get", //$NON-NLS-1$
            285, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_285_52 = new TagInfo("c:get", //$NON-NLS-1$
            285, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_285_100 = new TagInfo("c:get", //$NON-NLS-1$
            285, 100,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_289_18 = new TagInfo("c:get", //$NON-NLS-1$
            289, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        out.write("<?php");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("include_once \"");  //$NON-NLS-1$        
        out.setTag("get",21,60);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_3_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_15.setRuntimeParent(null);
        _jettag_c_get_3_15.setTagInfo(_td_c_get_3_15);
        _jettag_c_get_3_15.doStart(context, out);
        _jettag_c_get_3_15.doEnd();
        out.setTag(null,-1,-1);
        out.write(".class.php\";");  //$NON-NLS-1$        
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(64);
        out.setTag("iterate",73,137);
        RuntimeTagElement _jettag_c_iterate_4_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_4_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_4_1.setRuntimeParent(null);
        _jettag_c_iterate_4_1.setTagInfo(_td_c_iterate_4_1);
        _jettag_c_iterate_4_1.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_4_1.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_4_1.getTagInfo().getAttribute("delimiter"),73,137);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(64);
            out.setTag("if",137,201);
            RuntimeTagElement _jettag_c_if_4_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_4_65); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_4_65.setRuntimeParent(_jettag_c_iterate_4_1);
            _jettag_c_if_4_65.setTagInfo(_td_c_if_4_65);
            _jettag_c_if_4_65.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_4_65.okToProcessBody()) {
                out.write("include_once \"");  //$NON-NLS-1$        
                out.setTag("get",215,278);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(63);
                RuntimeTagElement _jettag_c_get_5_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_5_18.setRuntimeParent(_jettag_c_if_4_65);
                _jettag_c_get_5_18.setTagInfo(_td_c_get_5_18);
                _jettag_c_get_5_18.doStart(context, out);
                _jettag_c_get_5_18.doEnd();
                out.setTag(null,-1,-1);
                out.write(".class.php\";");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_4_65.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_4_65.doEnd();
            out.endTag("if",89);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_4_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_4_1.doEnd();
        out.loopEnd();
        out.endTag("iterate",160);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write(NL);         
        out.write("class ");  //$NON-NLS-1$        
        out.setTag("get",317,361);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_7_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_7_7.setRuntimeParent(null);
        _jettag_c_get_7_7.setTagInfo(_td_c_get_7_7);
        _jettag_c_get_7_7.doStart(context, out);
        _jettag_c_get_7_7.doEnd();
        out.setTag(null,-1,-1);
        out.write("DB");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate $dbconn;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate $host = \"localhost\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate $port = \"5432\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate $dbname = \"");  //$NON-NLS-1$        
        out.setTag("get",459,500);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(41);
        RuntimeTagElement _jettag_c_get_12_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_21); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_21.setRuntimeParent(null);
        _jettag_c_get_12_21.setTagInfo(_td_c_get_12_21);
        _jettag_c_get_12_21.doStart(context, out);
        _jettag_c_get_12_21.doEnd();
        out.setTag(null,-1,-1);
        out.write("\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate $user = \"postgres\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate $password = \"teste\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic function __construct()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$this->dbconn = pg_connect(\"host= \" . $this->host . \" port=\" . $this->port . \" dbname=\" . $this->dbname . \" user=\" . $this->user . \" password=\" . $this->password);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic function add($");  //$NON-NLS-1$        
        out.setTag("get",789,828);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_21_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_23); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_23.setRuntimeParent(null);
        _jettag_c_get_21_23.setTagInfo(_td_c_get_21_23);
        _jettag_c_get_21_23.doStart(context, out);
        _jettag_c_get_21_23.doEnd();
        out.setTag(null,-1,-1);
        out.write(")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$query = pg_query(\"INSERT INTO ");  //$NON-NLS-1$        
        out.setTag("get",866,912);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_23_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_34); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_23_34.setRuntimeParent(null);
        _jettag_c_get_23_34.setTagInfo(_td_c_get_23_34);
        _jettag_c_get_23_34.doStart(context, out);
        _jettag_c_get_23_34.doEnd();
        out.setTag(null,-1,-1);
        out.write("(");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(64);
        out.setTag("iterate",913,977);
        RuntimeTagElement _jettag_c_iterate_23_81 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_23_81); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_23_81.setRuntimeParent(null);
        _jettag_c_iterate_23_81.setTagInfo(_td_c_iterate_23_81);
        _jettag_c_iterate_23_81.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_23_81.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_23_81.getTagInfo().getAttribute("delimiter"),913,977);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\t\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(175);
            out.setTag("if",982,1157);
            RuntimeTagElement _jettag_c_if_24_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_24_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_24_5.setRuntimeParent(_jettag_c_iterate_23_81);
            _jettag_c_if_24_5.setTagInfo(_td_c_if_24_5);
            _jettag_c_if_24_5.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_24_5.okToProcessBody()) {
                out.setTag("get",1157,1197);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_25_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_25_7.setRuntimeParent(_jettag_c_if_24_5);
                _jettag_c_get_25_7.setTagInfo(_td_c_get_25_7);
                _jettag_c_get_25_7.doStart(context, out);
                _jettag_c_get_25_7.doEnd();
                out.setTag(null,-1,-1);
                out.write(",");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_24_5.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_24_5.doEnd();
            out.endTag("if",41);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_23_81.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_23_81.doEnd();
        out.loopEnd();
        out.endTag("iterate",228);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write("created_at,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tupdate_at");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t) VALUES(");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(64);
        out.setTag("iterate",1255,1319);
        RuntimeTagElement _jettag_c_iterate_27_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_27_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_27_13.setRuntimeParent(null);
        _jettag_c_iterate_27_13.setTagInfo(_td_c_iterate_27_13);
        _jettag_c_iterate_27_13.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_27_13.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_27_13.getTagInfo().getAttribute("delimiter"),1255,1319);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\t\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(131);
            out.setTag("if",1324,1455);
            RuntimeTagElement _jettag_c_if_28_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_28_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_28_5.setRuntimeParent(_jettag_c_iterate_27_13);
            _jettag_c_if_28_5.setTagInfo(_td_c_if_28_5);
            _jettag_c_if_28_5.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_28_5.okToProcessBody()) {
                out.write("\" . $");  //$NON-NLS-1$        
                out.setTag("get",1460,1499);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_29_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_29_12.setRuntimeParent(_jettag_c_if_28_5);
                _jettag_c_get_29_12.setTagInfo(_td_c_get_29_12);
                _jettag_c_get_29_12.doStart(context, out);
                _jettag_c_get_29_12.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",1504,1550);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_29_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_56); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_29_56.setRuntimeParent(_jettag_c_if_28_5);
                _jettag_c_get_29_56.setTagInfo(_td_c_get_29_56);
                _jettag_c_get_29_56.doStart(context, out);
                _jettag_c_get_29_56.doEnd();
                out.setTag(null,-1,-1);
                out.write("()->getId() . \",");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_28_5.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_28_5.doEnd();
            out.endTag("if",116);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(70);
            out.setTag("if",1578,1648);
            RuntimeTagElement _jettag_c_if_30_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_30_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_30_12.setRuntimeParent(_jettag_c_iterate_27_13);
            _jettag_c_if_30_12.setTagInfo(_td_c_if_30_12);
            _jettag_c_if_30_12.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_30_12.okToProcessBody()) {
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(64);
                out.setTag("if",1648,1712);
                RuntimeTagElement _jettag_c_if_31_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_31_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_31_7.setRuntimeParent(_jettag_c_if_30_12);
                _jettag_c_if_31_7.setTagInfo(_td_c_if_31_7);
                _jettag_c_if_31_7.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_31_7.okToProcessBody()) {
                    out.write("'\" . ($");  //$NON-NLS-1$        
                    out.setTag("get",1719,1758);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(39);
                    RuntimeTagElement _jettag_c_get_32_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_14); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_32_14.setRuntimeParent(_jettag_c_if_31_7);
                    _jettag_c_get_32_14.setTagInfo(_td_c_get_32_14);
                    _jettag_c_get_32_14.doStart(context, out);
                    _jettag_c_get_32_14.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->get");  //$NON-NLS-1$        
                    out.setTag("get",1763,1809);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_32_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_58); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_32_58.setRuntimeParent(_jettag_c_if_31_7);
                    _jettag_c_get_32_58.setTagInfo(_td_c_get_32_58);
                    _jettag_c_get_32_58.doStart(context, out);
                    _jettag_c_get_32_58.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("() ? \"true\" : \"false\") . \"',");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_31_7.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_31_7.doEnd();
                out.endTag("if",125);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(65);
                out.setTag("if",1844,1909);
                RuntimeTagElement _jettag_c_if_32_139 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_32_139); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_32_139.setRuntimeParent(_jettag_c_if_30_12);
                _jettag_c_if_32_139.setTagInfo(_td_c_if_32_139);
                _jettag_c_if_32_139.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_32_139.okToProcessBody()) {
                    out.write("'\" . $");  //$NON-NLS-1$        
                    out.setTag("get",1915,1954);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(39);
                    RuntimeTagElement _jettag_c_get_33_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_33_13.setRuntimeParent(_jettag_c_if_32_139);
                    _jettag_c_get_33_13.setTagInfo(_td_c_get_33_13);
                    _jettag_c_get_33_13.doStart(context, out);
                    _jettag_c_get_33_13.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->get");  //$NON-NLS-1$        
                    out.setTag("get",1959,2005);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_33_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_57); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_33_57.setRuntimeParent(_jettag_c_if_32_139);
                    _jettag_c_get_33_57.setTagInfo(_td_c_get_33_57);
                    _jettag_c_get_33_57.doStart(context, out);
                    _jettag_c_get_33_57.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("() . \"',");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_32_139.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_32_139.doEnd();
                out.endTag("if",104);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
    out.bodyContentStart();
                _jettag_c_if_30_12.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_30_12.doEnd();
            out.endTag("if",372);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_27_13.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_27_13.doEnd();
        out.loopEnd();
        out.endTag("iterate",708);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write("now(),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tnow()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t) RETURNING id;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$result = (pg_affected_rows($query) > 0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$id = pg_fetch_assoc($query);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$id = $id['id'];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(67);
        out.setTag("iterate",2184,2251);
        RuntimeTagElement _jettag_c_iterate_42_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_42_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_42_3.setRuntimeParent(null);
        _jettag_c_iterate_42_3.setTagInfo(_td_c_iterate_42_3);
        _jettag_c_iterate_42_3.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_42_3.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_42_3.getTagInfo().getAttribute("delimiter"),2184,2251);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(127);
            out.setTag("if",2251,2378);
            RuntimeTagElement _jettag_c_if_43_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_43_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_43_4.setRuntimeParent(_jettag_c_iterate_42_3);
            _jettag_c_if_43_4.setTagInfo(_td_c_if_43_4);
            _jettag_c_if_43_4.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_43_4.okToProcessBody()) {
                out.write("foreach ($");  //$NON-NLS-1$        
                out.setTag("get",2388,2427);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_44_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_44_14.setRuntimeParent(_jettag_c_if_43_4);
                _jettag_c_get_44_14.setTagInfo(_td_c_get_44_14);
                _jettag_c_get_44_14.doStart(context, out);
                _jettag_c_get_44_14.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",2432,2478);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_44_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_58); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_44_58.setRuntimeParent(_jettag_c_if_43_4);
                _jettag_c_get_44_58.setTagInfo(_td_c_get_44_58);
                _jettag_c_get_44_58.doStart(context, out);
                _jettag_c_get_44_58.doEnd();
                out.setTag(null,-1,-1);
                out.write("() as $row");  //$NON-NLS-1$        
                out.setTag("get",2488,2534);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_44_114 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_114); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_44_114.setRuntimeParent(_jettag_c_if_43_4);
                _jettag_c_get_44_114.setTagInfo(_td_c_get_44_114);
                _jettag_c_get_44_114.doStart(context, out);
                _jettag_c_get_44_114.doEnd();
                out.setTag(null,-1,-1);
                out.write(") {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t$query = pg_query(\"INSERT INTO ");  //$NON-NLS-1$        
                out.setTag("get",2572,2618);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_45_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_35); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_45_35.setRuntimeParent(_jettag_c_if_43_4);
                _jettag_c_get_45_35.setTagInfo(_td_c_get_45_35);
                _jettag_c_get_45_35.doStart(context, out);
                _jettag_c_get_45_35.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",2619,2684);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_45_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_82); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_45_82.setRuntimeParent(_jettag_c_if_43_4);
                _jettag_c_get_45_82.setTagInfo(_td_c_get_45_82);
                _jettag_c_get_45_82.doStart(context, out);
                _jettag_c_get_45_82.doEnd();
                out.setTag(null,-1,-1);
                out.write("(");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",2691,2737);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_46_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_46_6.setRuntimeParent(_jettag_c_if_43_4);
                _jettag_c_get_46_6.setTagInfo(_td_c_get_46_6);
                _jettag_c_get_46_6.doStart(context, out);
                _jettag_c_get_46_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id,");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",2747,2812);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_47_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_47_6.setRuntimeParent(_jettag_c_if_43_4);
                _jettag_c_get_47_6.setTagInfo(_td_c_get_47_6);
                _jettag_c_get_47_6.doStart(context, out);
                _jettag_c_get_47_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id,");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tcreated_at,");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tupdate_at");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t) VALUES(");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\" . $id . \",");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\" . $row");  //$NON-NLS-1$        
                out.setTag("get",2894,2940);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_52_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_52_14.setRuntimeParent(_jettag_c_if_43_4);
                _jettag_c_get_52_14.setTagInfo(_td_c_get_52_14);
                _jettag_c_get_52_14.doStart(context, out);
                _jettag_c_get_52_14.doEnd();
                out.setTag(null,-1,-1);
                out.write("->getId() . \",");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tnow(),");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tnow()");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t$result = $result && (pg_affected_rows($query) > 0);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t}");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_43_4.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_43_4.doEnd();
            out.endTag("if",676);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_42_3.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_42_3.doEnd();
        out.loopEnd();
        out.endTag("iterate",810);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write(NL);         
        out.write("\t\treturn $result;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic function update($");  //$NON-NLS-1$        
        out.setTag("get",3122,3161);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_64_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_64_26.setRuntimeParent(null);
        _jettag_c_get_64_26.setTagInfo(_td_c_get_64_26);
        _jettag_c_get_64_26.doStart(context, out);
        _jettag_c_get_64_26.doEnd();
        out.setTag(null,-1,-1);
        out.write(")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$query = pg_query(\"UPDATE ");  //$NON-NLS-1$        
        out.setTag("get",3194,3240);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_66_29 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_29); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_66_29.setRuntimeParent(null);
        _jettag_c_get_66_29.setTagInfo(_td_c_get_66_29);
        _jettag_c_get_66_29.doStart(context, out);
        _jettag_c_get_66_29.doEnd();
        out.setTag(null,-1,-1);
        out.write(" SET");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(64);
        out.setTag("iterate",3244,3308);
        RuntimeTagElement _jettag_c_iterate_66_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_66_79); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_66_79.setRuntimeParent(null);
        _jettag_c_iterate_66_79.setTagInfo(_td_c_iterate_66_79);
        _jettag_c_iterate_66_79.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_66_79.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_66_79.getTagInfo().getAttribute("delimiter"),3244,3308);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\t\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(131);
            out.setTag("if",3313,3444);
            RuntimeTagElement _jettag_c_if_67_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_67_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_67_5.setRuntimeParent(_jettag_c_iterate_66_79);
            _jettag_c_if_67_5.setTagInfo(_td_c_if_67_5);
            _jettag_c_if_67_5.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_67_5.okToProcessBody()) {
                out.setTag("get",3444,3484);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_68_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_68_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_68_7.setRuntimeParent(_jettag_c_if_67_5);
                _jettag_c_get_68_7.setTagInfo(_td_c_get_68_7);
                _jettag_c_get_68_7.doStart(context, out);
                _jettag_c_get_68_7.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = \" . $");  //$NON-NLS-1$        
                out.setTag("get",3492,3531);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_68_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_68_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_68_55.setRuntimeParent(_jettag_c_if_67_5);
                _jettag_c_get_68_55.setTagInfo(_td_c_get_68_55);
                _jettag_c_get_68_55.doStart(context, out);
                _jettag_c_get_68_55.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",3536,3582);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_68_99 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_68_99); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_68_99.setRuntimeParent(_jettag_c_if_67_5);
                _jettag_c_get_68_99.setTagInfo(_td_c_get_68_99);
                _jettag_c_get_68_99.doStart(context, out);
                _jettag_c_get_68_99.doEnd();
                out.setTag(null,-1,-1);
                out.write("()->getId() . \",");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_67_5.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_67_5.doEnd();
            out.endTag("if",159);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(70);
            out.setTag("if",3610,3680);
            RuntimeTagElement _jettag_c_if_69_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_69_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_69_12.setRuntimeParent(_jettag_c_iterate_66_79);
            _jettag_c_if_69_12.setTagInfo(_td_c_if_69_12);
            _jettag_c_if_69_12.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_69_12.okToProcessBody()) {
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(64);
                out.setTag("if",3680,3744);
                RuntimeTagElement _jettag_c_if_70_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_70_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_70_7.setRuntimeParent(_jettag_c_if_69_12);
                _jettag_c_if_70_7.setTagInfo(_td_c_if_70_7);
                _jettag_c_if_70_7.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_70_7.okToProcessBody()) {
                    out.setTag("get",3744,3784);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_71_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_71_7.setRuntimeParent(_jettag_c_if_70_7);
                    _jettag_c_get_71_7.setTagInfo(_td_c_get_71_7);
                    _jettag_c_get_71_7.doStart(context, out);
                    _jettag_c_get_71_7.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" = '\" . ($");  //$NON-NLS-1$        
                    out.setTag("get",3794,3833);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(39);
                    RuntimeTagElement _jettag_c_get_71_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_57); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_71_57.setRuntimeParent(_jettag_c_if_70_7);
                    _jettag_c_get_71_57.setTagInfo(_td_c_get_71_57);
                    _jettag_c_get_71_57.doStart(context, out);
                    _jettag_c_get_71_57.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->get");  //$NON-NLS-1$        
                    out.setTag("get",3838,3884);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_71_101 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_101); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_71_101.setRuntimeParent(_jettag_c_if_70_7);
                    _jettag_c_get_71_101.setTagInfo(_td_c_get_71_101);
                    _jettag_c_get_71_101.doStart(context, out);
                    _jettag_c_get_71_101.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("() ? \"true\" : \"false\") . \"',");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_70_7.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_70_7.doEnd();
                out.endTag("if",168);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(65);
                out.setTag("if",3919,3984);
                RuntimeTagElement _jettag_c_if_71_182 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_71_182); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_71_182.setRuntimeParent(_jettag_c_if_69_12);
                _jettag_c_if_71_182.setTagInfo(_td_c_if_71_182);
                _jettag_c_if_71_182.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_71_182.okToProcessBody()) {
                    out.setTag("get",3984,4024);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_72_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_72_7.setRuntimeParent(_jettag_c_if_71_182);
                    _jettag_c_get_72_7.setTagInfo(_td_c_get_72_7);
                    _jettag_c_get_72_7.doStart(context, out);
                    _jettag_c_get_72_7.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" = '\" . $");  //$NON-NLS-1$        
                    out.setTag("get",4033,4072);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(39);
                    RuntimeTagElement _jettag_c_get_72_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_56); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_72_56.setRuntimeParent(_jettag_c_if_71_182);
                    _jettag_c_get_72_56.setTagInfo(_td_c_get_72_56);
                    _jettag_c_get_72_56.doStart(context, out);
                    _jettag_c_get_72_56.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->get");  //$NON-NLS-1$        
                    out.setTag("get",4077,4123);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_72_100 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_100); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_72_100.setRuntimeParent(_jettag_c_if_71_182);
                    _jettag_c_get_72_100.setTagInfo(_td_c_get_72_100);
                    _jettag_c_get_72_100.doStart(context, out);
                    _jettag_c_get_72_100.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("() . \"',");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_71_182.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_71_182.doEnd();
                out.endTag("if",147);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
    out.bodyContentStart();
                _jettag_c_if_69_12.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_69_12.doEnd();
            out.endTag("if",458);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_66_79.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_66_79.doEnd();
        out.loopEnd();
        out.endTag("iterate",837);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write("update_at = now()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tWHERE id = \" . $");  //$NON-NLS-1$        
        out.setTag("get",4194,4233);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_73_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_20); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_73_20.setRuntimeParent(null);
        _jettag_c_get_73_20.setTagInfo(_td_c_get_73_20);
        _jettag_c_get_73_20.doStart(context, out);
        _jettag_c_get_73_20.doEnd();
        out.setTag(null,-1,-1);
        out.write("->getId()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t$result = (pg_affected_rows($query) > 0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(67);
        out.setTag("iterate",4298,4365);
        RuntimeTagElement _jettag_c_iterate_78_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_78_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_78_3.setRuntimeParent(null);
        _jettag_c_iterate_78_3.setTagInfo(_td_c_iterate_78_3);
        _jettag_c_iterate_78_3.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_78_3.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_78_3.getTagInfo().getAttribute("delimiter"),4298,4365);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(127);
            out.setTag("if",4365,4492);
            RuntimeTagElement _jettag_c_if_79_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_79_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_79_4.setRuntimeParent(_jettag_c_iterate_78_3);
            _jettag_c_if_79_4.setTagInfo(_td_c_if_79_4);
            _jettag_c_if_79_4.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_79_4.okToProcessBody()) {
                out.write("$query = pg_query(\"DELETE FROM ");  //$NON-NLS-1$        
                out.setTag("get",4523,4569);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_80_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_80_35); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_80_35.setRuntimeParent(_jettag_c_if_79_4);
                _jettag_c_get_80_35.setTagInfo(_td_c_get_80_35);
                _jettag_c_get_80_35.doStart(context, out);
                _jettag_c_get_80_35.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",4570,4635);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_80_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_80_82); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_80_82.setRuntimeParent(_jettag_c_if_79_4);
                _jettag_c_get_80_82.setTagInfo(_td_c_get_80_82);
                _jettag_c_get_80_82.doStart(context, out);
                _jettag_c_get_80_82.doEnd();
                out.setTag(null,-1,-1);
                out.write(NL);         
                out.write("\t\t\tWHERE ");  //$NON-NLS-1$        
                out.setTag("get",4645,4691);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_81_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_81_10); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_81_10.setRuntimeParent(_jettag_c_if_79_4);
                _jettag_c_get_81_10.setTagInfo(_td_c_get_81_10);
                _jettag_c_get_81_10.doStart(context, out);
                _jettag_c_get_81_10.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id = \" . $");  //$NON-NLS-1$        
                out.setTag("get",4702,4741);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_81_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_81_67); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_81_67.setRuntimeParent(_jettag_c_if_79_4);
                _jettag_c_get_81_67.setTagInfo(_td_c_get_81_67);
                _jettag_c_get_81_67.doStart(context, out);
                _jettag_c_get_81_67.doEnd();
                out.setTag(null,-1,-1);
                out.write("->getId()");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t$result = $result && (pg_affected_rows($query) > 0);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("\t\tforeach ($");  //$NON-NLS-1$        
                out.setTag("get",4827,4866);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_86_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_86_13.setRuntimeParent(_jettag_c_if_79_4);
                _jettag_c_get_86_13.setTagInfo(_td_c_get_86_13);
                _jettag_c_get_86_13.doStart(context, out);
                _jettag_c_get_86_13.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",4871,4917);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_86_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_57); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_86_57.setRuntimeParent(_jettag_c_if_79_4);
                _jettag_c_get_86_57.setTagInfo(_td_c_get_86_57);
                _jettag_c_get_86_57.doStart(context, out);
                _jettag_c_get_86_57.doEnd();
                out.setTag(null,-1,-1);
                out.write("() as $row");  //$NON-NLS-1$        
                out.setTag("get",4927,4973);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_86_113 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_113); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_86_113.setRuntimeParent(_jettag_c_if_79_4);
                _jettag_c_get_86_113.setTagInfo(_td_c_get_86_113);
                _jettag_c_get_86_113.doStart(context, out);
                _jettag_c_get_86_113.doEnd();
                out.setTag(null,-1,-1);
                out.write(") {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t$query = pg_query(\"INSERT INTO ");  //$NON-NLS-1$        
                out.setTag("get",5011,5057);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_87_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_87_35); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_87_35.setRuntimeParent(_jettag_c_if_79_4);
                _jettag_c_get_87_35.setTagInfo(_td_c_get_87_35);
                _jettag_c_get_87_35.doStart(context, out);
                _jettag_c_get_87_35.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",5058,5123);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_87_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_87_82); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_87_82.setRuntimeParent(_jettag_c_if_79_4);
                _jettag_c_get_87_82.setTagInfo(_td_c_get_87_82);
                _jettag_c_get_87_82.doStart(context, out);
                _jettag_c_get_87_82.doEnd();
                out.setTag(null,-1,-1);
                out.write("(");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",5130,5176);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_88_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_88_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_88_6.setRuntimeParent(_jettag_c_if_79_4);
                _jettag_c_get_88_6.setTagInfo(_td_c_get_88_6);
                _jettag_c_get_88_6.doStart(context, out);
                _jettag_c_get_88_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id,");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",5186,5251);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_89_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_89_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_89_6.setRuntimeParent(_jettag_c_if_79_4);
                _jettag_c_get_89_6.setTagInfo(_td_c_get_89_6);
                _jettag_c_get_89_6.doStart(context, out);
                _jettag_c_get_89_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id,");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tcreated_at,");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tupdate_at");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t) VALUES(");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\" . $");  //$NON-NLS-1$        
                out.setTag("get",5312,5351);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_93_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_93_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_93_11.setRuntimeParent(_jettag_c_if_79_4);
                _jettag_c_get_93_11.setTagInfo(_td_c_get_93_11);
                _jettag_c_get_93_11.doStart(context, out);
                _jettag_c_get_93_11.doEnd();
                out.setTag(null,-1,-1);
                out.write("->getId() . \",");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\" . $row");  //$NON-NLS-1$        
                out.setTag("get",5379,5425);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_94_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_94_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_94_14.setRuntimeParent(_jettag_c_if_79_4);
                _jettag_c_get_94_14.setTagInfo(_td_c_get_94_14);
                _jettag_c_get_94_14.doStart(context, out);
                _jettag_c_get_94_14.doEnd();
                out.setTag(null,-1,-1);
                out.write("->getId() . \",");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tnow(),");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tnow()");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t$result = $result && (pg_affected_rows($query) > 0);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t}");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_79_4.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_79_4.doEnd();
            out.endTag("if",1047);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_78_3.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_78_3.doEnd();
        out.loopEnd();
        out.endTag("iterate",1181);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write(NL);         
        out.write("\t\treturn $result;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic function destroy($");  //$NON-NLS-1$        
        out.setTag("get",5608,5647);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_106_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_106_27); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_106_27.setRuntimeParent(null);
        _jettag_c_get_106_27.setTagInfo(_td_c_get_106_27);
        _jettag_c_get_106_27.doStart(context, out);
        _jettag_c_get_106_27.doEnd();
        out.setTag(null,-1,-1);
        out.write(")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$result = true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(67);
        out.setTag("iterate",5672,5739);
        RuntimeTagElement _jettag_c_iterate_109_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_109_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_109_3.setRuntimeParent(null);
        _jettag_c_iterate_109_3.setTagInfo(_td_c_iterate_109_3);
        _jettag_c_iterate_109_3.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_109_3.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_109_3.getTagInfo().getAttribute("delimiter"),5672,5739);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(127);
            out.setTag("if",5739,5866);
            RuntimeTagElement _jettag_c_if_110_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_110_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_110_4.setRuntimeParent(_jettag_c_iterate_109_3);
            _jettag_c_if_110_4.setTagInfo(_td_c_if_110_4);
            _jettag_c_if_110_4.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_110_4.okToProcessBody()) {
                out.write("$query = pg_query(\"DELETE FROM ");  //$NON-NLS-1$        
                out.setTag("get",5897,5943);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_111_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_111_35); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_111_35.setRuntimeParent(_jettag_c_if_110_4);
                _jettag_c_get_111_35.setTagInfo(_td_c_get_111_35);
                _jettag_c_get_111_35.doStart(context, out);
                _jettag_c_get_111_35.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",5944,6009);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_111_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_111_82); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_111_82.setRuntimeParent(_jettag_c_if_110_4);
                _jettag_c_get_111_82.setTagInfo(_td_c_get_111_82);
                _jettag_c_get_111_82.doStart(context, out);
                _jettag_c_get_111_82.doEnd();
                out.setTag(null,-1,-1);
                out.write(NL);         
                out.write("\t\t\tWHERE ");  //$NON-NLS-1$        
                out.setTag("get",6019,6065);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_112_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_112_10); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_112_10.setRuntimeParent(_jettag_c_if_110_4);
                _jettag_c_get_112_10.setTagInfo(_td_c_get_112_10);
                _jettag_c_get_112_10.doStart(context, out);
                _jettag_c_get_112_10.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id = \" . $");  //$NON-NLS-1$        
                out.setTag("get",6076,6115);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_112_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_112_67); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_112_67.setRuntimeParent(_jettag_c_if_110_4);
                _jettag_c_get_112_67.setTagInfo(_td_c_get_112_67);
                _jettag_c_get_112_67.doStart(context, out);
                _jettag_c_get_112_67.doEnd();
                out.setTag(null,-1,-1);
                out.write("->getId()");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t$result = $result && (pg_affected_rows($query) > 0);");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_110_4.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_110_4.doEnd();
            out.endTag("if",321);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_109_3.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_109_3.doEnd();
        out.loopEnd();
        out.endTag("iterate",455);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t$query = pg_query(\"DELETE FROM ");  //$NON-NLS-1$        
        out.setTag("get",6241,6287);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_117_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_117_34); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_117_34.setRuntimeParent(null);
        _jettag_c_get_117_34.setTagInfo(_td_c_get_117_34);
        _jettag_c_get_117_34.doStart(context, out);
        _jettag_c_get_117_34.doEnd();
        out.setTag(null,-1,-1);
        out.write(" WHERE id = \" . $");  //$NON-NLS-1$        
        out.setTag("get",6304,6343);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_117_97 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_117_97); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_117_97.setRuntimeParent(null);
        _jettag_c_get_117_97.setTagInfo(_td_c_get_117_97);
        _jettag_c_get_117_97.doStart(context, out);
        _jettag_c_get_117_97.doEnd();
        out.setTag(null,-1,-1);
        out.write("->getId());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t$result = $result && (pg_affected_rows($query) > 0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn $result;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic function getAll()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$result = array();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t$query = pg_query(\"SELECT");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.setTag("get",6519,6565);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_129_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_129_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_129_5.setRuntimeParent(null);
        _jettag_c_get_129_5.setTagInfo(_td_c_get_129_5);
        _jettag_c_get_129_5.doStart(context, out);
        _jettag_c_get_129_5.doEnd();
        out.setTag(null,-1,-1);
        out.write(".id AS ");  //$NON-NLS-1$        
        out.setTag("get",6572,6618);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_129_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_129_58); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_129_58.setRuntimeParent(null);
        _jettag_c_get_129_58.setTagInfo(_td_c_get_129_58);
        _jettag_c_get_129_58.doStart(context, out);
        _jettag_c_get_129_58.doEnd();
        out.setTag(null,-1,-1);
        out.write("_id,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(69);
        out.setTag("iterate",6627,6696);
        RuntimeTagElement _jettag_c_iterate_130_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_130_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_130_5.setRuntimeParent(null);
        _jettag_c_iterate_130_5.setTagInfo(_td_c_iterate_130_5);
        _jettag_c_iterate_130_5.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_130_5.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_130_5.getTagInfo().getAttribute("delimiter"),6627,6696);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(125);
            out.setTag("if",6696,6821);
            RuntimeTagElement _jettag_c_if_131_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_131_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_131_6.setRuntimeParent(_jettag_c_iterate_130_5);
            _jettag_c_if_131_6.setTagInfo(_td_c_if_131_6);
            _jettag_c_if_131_6.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_131_6.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",6827,6892);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_132_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_132_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_132_6.setRuntimeParent(_jettag_c_if_131_6);
                _jettag_c_get_132_6.setTagInfo(_td_c_get_132_6);
                _jettag_c_get_132_6.doStart(context, out);
                _jettag_c_get_132_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id AS ");  //$NON-NLS-1$        
                out.setTag("get",6899,6964);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_132_78 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_132_78); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_132_78.setRuntimeParent(_jettag_c_if_131_6);
                _jettag_c_get_132_78.setTagInfo(_td_c_get_132_78);
                _jettag_c_get_132_78.doStart(context, out);
                _jettag_c_get_132_78.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id, ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(107);
                out.setTag("iterate",6969,7076);
                RuntimeTagElement _jettag_c_iterate_132_148 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_132_148); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_132_148.setRuntimeParent(_jettag_c_if_131_6);
                _jettag_c_iterate_132_148.setTagInfo(_td_c_iterate_132_148);
                _jettag_c_iterate_132_148.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_132_148.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_132_148.getTagInfo().getAttribute("delimiter"),6969,7076);
                    out.loopIterate();
                    out.setTag("get",7076,7141);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_133_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_133_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_133_7.setRuntimeParent(_jettag_c_iterate_132_148);
                    _jettag_c_get_133_7.setTagInfo(_td_c_get_133_7);
                    _jettag_c_get_133_7.doStart(context, out);
                    _jettag_c_get_133_7.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",7142,7200);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_133_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_133_73); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_133_73.setRuntimeParent(_jettag_c_iterate_132_148);
                    _jettag_c_get_133_73.setTagInfo(_td_c_get_133_73);
                    _jettag_c_get_133_73.doStart(context, out);
                    _jettag_c_get_133_73.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" AS ");  //$NON-NLS-1$        
                    out.setTag("get",7204,7269);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_133_135 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_133_135); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_133_135.setRuntimeParent(_jettag_c_iterate_132_148);
                    _jettag_c_get_133_135.setTagInfo(_td_c_get_133_135);
                    _jettag_c_get_133_135.doStart(context, out);
                    _jettag_c_get_133_135.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",7270,7328);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_133_201 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_133_201); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_133_201.setRuntimeParent(_jettag_c_iterate_132_148);
                    _jettag_c_get_133_201.setTagInfo(_td_c_get_133_201);
                    _jettag_c_get_133_201.doStart(context, out);
                    _jettag_c_get_133_201.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(",");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_132_148.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_132_148.doEnd();
                out.loopEnd();
                out.endTag("iterate",253);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_131_6.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_131_6.doEnd();
            out.endTag("if",525);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(69);
            out.setTag("if",7353,7422);
            RuntimeTagElement _jettag_c_if_134_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_134_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_134_12.setRuntimeParent(_jettag_c_iterate_130_5);
            _jettag_c_if_134_12.setTagInfo(_td_c_if_134_12);
            _jettag_c_if_134_12.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_134_12.okToProcessBody()) {
                out.setTag("get",7422,7468);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_135_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_135_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_135_6.setRuntimeParent(_jettag_c_if_134_12);
                _jettag_c_get_135_6.setTagInfo(_td_c_get_135_6);
                _jettag_c_get_135_6.doStart(context, out);
                _jettag_c_get_135_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",7469,7509);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_135_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_135_53); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_135_53.setRuntimeParent(_jettag_c_if_134_12);
                _jettag_c_get_135_53.setTagInfo(_td_c_get_135_53);
                _jettag_c_get_135_53.doStart(context, out);
                _jettag_c_get_135_53.doEnd();
                out.setTag(null,-1,-1);
                out.write(" AS ");  //$NON-NLS-1$        
                out.setTag("get",7513,7559);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_135_97 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_135_97); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_135_97.setRuntimeParent(_jettag_c_if_134_12);
                _jettag_c_get_135_97.setTagInfo(_td_c_get_135_97);
                _jettag_c_get_135_97.doStart(context, out);
                _jettag_c_get_135_97.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",7560,7600);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_135_144 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_135_144); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_135_144.setRuntimeParent(_jettag_c_if_134_12);
                _jettag_c_get_135_144.setTagInfo(_td_c_get_135_144);
                _jettag_c_get_135_144.doStart(context, out);
                _jettag_c_get_135_144.doEnd();
                out.setTag(null,-1,-1);
                out.write(",");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_134_12.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_134_12.doEnd();
            out.endTag("if",179);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_130_5.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_130_5.doEnd();
        out.loopEnd();
        out.endTag("iterate",912);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.setTag("get",7625,7671);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_136_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_136_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_136_5.setRuntimeParent(null);
        _jettag_c_get_136_5.setTagInfo(_td_c_get_136_5);
        _jettag_c_get_136_5.doStart(context, out);
        _jettag_c_get_136_5.doEnd();
        out.setTag(null,-1,-1);
        out.write(".created_at,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.setTag("get",7688,7734);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_137_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_137_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_137_5.setRuntimeParent(null);
        _jettag_c_get_137_5.setTagInfo(_td_c_get_137_5);
        _jettag_c_get_137_5.doStart(context, out);
        _jettag_c_get_137_5.doEnd();
        out.setTag(null,-1,-1);
        out.write(".update_at");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tFROM ");  //$NON-NLS-1$        
        out.setTag("get",7753,7799);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_138_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_138_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_138_9.setRuntimeParent(null);
        _jettag_c_get_138_9.setTagInfo(_td_c_get_138_9);
        _jettag_c_get_138_9.doStart(context, out);
        _jettag_c_get_138_9.doEnd();
        out.setTag(null,-1,-1);
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(64);
        out.setTag("iterate",7803,7867);
        RuntimeTagElement _jettag_c_iterate_139_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_139_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_139_4.setRuntimeParent(null);
        _jettag_c_iterate_139_4.setTagInfo(_td_c_iterate_139_4);
        _jettag_c_iterate_139_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_139_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_139_4.getTagInfo().getAttribute("delimiter"),7803,7867);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(129);
            out.setTag("if",7867,7996);
            RuntimeTagElement _jettag_c_if_139_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_139_68); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_139_68.setRuntimeParent(_jettag_c_iterate_139_4);
            _jettag_c_if_139_68.setTagInfo(_td_c_if_139_68);
            _jettag_c_if_139_68.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_139_68.okToProcessBody()) {
                out.write("INNER JOIN ");  //$NON-NLS-1$        
                out.setTag("get",8007,8072);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_140_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_140_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_140_16.setRuntimeParent(_jettag_c_if_139_68);
                _jettag_c_get_140_16.setTagInfo(_td_c_get_140_16);
                _jettag_c_get_140_16.doStart(context, out);
                _jettag_c_get_140_16.doEnd();
                out.setTag(null,-1,-1);
                out.write(" ON ");  //$NON-NLS-1$        
                out.setTag("get",8076,8141);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_140_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_140_85); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_140_85.setRuntimeParent(_jettag_c_if_139_68);
                _jettag_c_get_140_85.setTagInfo(_td_c_get_140_85);
                _jettag_c_get_140_85.doStart(context, out);
                _jettag_c_get_140_85.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id = ");  //$NON-NLS-1$        
                out.setTag("get",8147,8193);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_140_156 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_140_156); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_140_156.setRuntimeParent(_jettag_c_if_139_68);
                _jettag_c_get_140_156.setTagInfo(_td_c_get_140_156);
                _jettag_c_get_140_156.doStart(context, out);
                _jettag_c_get_140_156.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",8194,8234);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_140_203 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_140_203); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_140_203.setRuntimeParent(_jettag_c_if_139_68);
                _jettag_c_get_140_203.setTagInfo(_td_c_get_140_203);
                _jettag_c_get_140_203.doStart(context, out);
                _jettag_c_get_140_203.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_c_if_139_68.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_139_68.doEnd();
            out.endTag("if",238);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_139_4.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_139_4.doEnd();
        out.loopEnd();
        out.endTag("iterate",374);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\tORDER BY ");  //$NON-NLS-1$        
        out.setTag("get",8266,8312);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_141_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_141_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_141_13.setRuntimeParent(null);
        _jettag_c_get_141_13.setTagInfo(_td_c_get_141_13);
        _jettag_c_get_141_13.doStart(context, out);
        _jettag_c_get_141_13.doEnd();
        out.setTag(null,-1,-1);
        out.write(".id");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tif ($query) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\twhile ($row = pg_fetch_assoc($query)) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t$");  //$NON-NLS-1$        
        out.setTag("get",8387,8426);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_146_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_146_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_146_6.setRuntimeParent(null);
        _jettag_c_get_146_6.setTagInfo(_td_c_get_146_6);
        _jettag_c_get_146_6.doStart(context, out);
        _jettag_c_get_146_6.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = new ");  //$NON-NLS-1$        
        out.setTag("get",8433,8477);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_146_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_146_52); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_146_52.setRuntimeParent(null);
        _jettag_c_get_146_52.setTagInfo(_td_c_get_146_52);
        _jettag_c_get_146_52.doStart(context, out);
        _jettag_c_get_146_52.doEnd();
        out.setTag(null,-1,-1);
        out.write("();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\t\t$");  //$NON-NLS-1$        
        out.setTag("get",8487,8526);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_148_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_148_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_148_6.setRuntimeParent(null);
        _jettag_c_get_148_6.setTagInfo(_td_c_get_148_6);
        _jettag_c_get_148_6.doStart(context, out);
        _jettag_c_get_148_6.doEnd();
        out.setTag(null,-1,-1);
        out.write("->setId($row[\"");  //$NON-NLS-1$        
        out.setTag("get",8540,8586);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_148_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_148_59); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_148_59.setRuntimeParent(null);
        _jettag_c_get_148_59.setTagInfo(_td_c_get_148_59);
        _jettag_c_get_148_59.doStart(context, out);
        _jettag_c_get_148_59.doEnd();
        out.setTag(null,-1,-1);
        out.write("_id\"]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(68);
        out.setTag("iterate",8597,8665);
        RuntimeTagElement _jettag_c_iterate_149_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_149_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_149_4.setRuntimeParent(null);
        _jettag_c_iterate_149_4.setTagInfo(_td_c_iterate_149_4);
        _jettag_c_iterate_149_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_149_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_149_4.getTagInfo().getAttribute("delimiter"),8597,8665);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(125);
            out.setTag("if",8665,8790);
            RuntimeTagElement _jettag_c_if_150_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_150_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_150_5.setRuntimeParent(_jettag_c_iterate_149_4);
            _jettag_c_if_150_5.setTagInfo(_td_c_if_150_5);
            _jettag_c_if_150_5.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_150_5.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",8796,8854);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_151_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_151_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_151_6.setRuntimeParent(_jettag_c_if_150_5);
                _jettag_c_get_151_6.setTagInfo(_td_c_get_151_6);
                _jettag_c_get_151_6.doStart(context, out);
                _jettag_c_get_151_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = new ");  //$NON-NLS-1$        
                out.setTag("get",8861,8924);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(63);
                RuntimeTagElement _jettag_c_get_151_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_151_71); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_151_71.setRuntimeParent(_jettag_c_if_150_5);
                _jettag_c_get_151_71.setTagInfo(_td_c_get_151_71);
                _jettag_c_get_151_71.doStart(context, out);
                _jettag_c_get_151_71.doEnd();
                out.setTag(null,-1,-1);
                out.write("();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",8933,8991);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_152_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_152_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_152_6.setRuntimeParent(_jettag_c_if_150_5);
                _jettag_c_get_152_6.setTagInfo(_td_c_get_152_6);
                _jettag_c_get_152_6.doStart(context, out);
                _jettag_c_get_152_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->setId($row[\"");  //$NON-NLS-1$        
                out.setTag("get",9005,9070);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_152_78 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_152_78); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_152_78.setRuntimeParent(_jettag_c_if_150_5);
                _jettag_c_get_152_78.setTagInfo(_td_c_get_152_78);
                _jettag_c_get_152_78.doStart(context, out);
                _jettag_c_get_152_78.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id\"]);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(106);
                out.setTag("iterate",9082,9188);
                RuntimeTagElement _jettag_c_iterate_153_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_153_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_153_5.setRuntimeParent(_jettag_c_if_150_5);
                _jettag_c_iterate_153_5.setTagInfo(_td_c_iterate_153_5);
                _jettag_c_iterate_153_5.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_153_5.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_153_5.getTagInfo().getAttribute("delimiter"),9082,9188);
                    out.loopIterate();
                    out.write("$");  //$NON-NLS-1$        
                    out.setTag("get",9189,9247);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_154_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_154_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_154_7.setRuntimeParent(_jettag_c_iterate_153_5);
                    _jettag_c_get_154_7.setTagInfo(_td_c_get_154_7);
                    _jettag_c_get_154_7.doStart(context, out);
                    _jettag_c_get_154_7.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->set");  //$NON-NLS-1$        
                    out.setTag("get",9252,9316);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(64);
                    RuntimeTagElement _jettag_c_get_154_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_154_70); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_154_70.setRuntimeParent(_jettag_c_iterate_153_5);
                    _jettag_c_get_154_70.setTagInfo(_td_c_get_154_70);
                    _jettag_c_get_154_70.doStart(context, out);
                    _jettag_c_get_154_70.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("($row[\"");  //$NON-NLS-1$        
                    out.setTag("get",9323,9388);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_154_141 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_154_141); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_154_141.setRuntimeParent(_jettag_c_iterate_153_5);
                    _jettag_c_get_154_141.setTagInfo(_td_c_get_154_141);
                    _jettag_c_get_154_141.doStart(context, out);
                    _jettag_c_get_154_141.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",9389,9447);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_154_207 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_154_207); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_154_207.setRuntimeParent(_jettag_c_iterate_153_5);
                    _jettag_c_get_154_207.setTagInfo(_td_c_get_154_207);
                    _jettag_c_get_154_207.doStart(context, out);
                    _jettag_c_get_154_207.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\"]);");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_153_5.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_153_5.doEnd();
                out.loopEnd();
                out.endTag("iterate",268);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",9474,9513);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_156_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_156_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_156_6.setRuntimeParent(_jettag_c_if_150_5);
                _jettag_c_get_156_6.setTagInfo(_td_c_get_156_6);
                _jettag_c_get_156_6.doStart(context, out);
                _jettag_c_get_156_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->set");  //$NON-NLS-1$        
                out.setTag("get",9518,9564);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_156_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_156_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_156_50.setRuntimeParent(_jettag_c_if_150_5);
                _jettag_c_get_156_50.setTagInfo(_td_c_get_156_50);
                _jettag_c_get_156_50.doStart(context, out);
                _jettag_c_get_156_50.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",9566,9624);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_156_98 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_156_98); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_156_98.setRuntimeParent(_jettag_c_if_150_5);
                _jettag_c_get_156_98.setTagInfo(_td_c_get_156_98);
                _jettag_c_get_156_98.doStart(context, out);
                _jettag_c_get_156_98.doEnd();
                out.setTag(null,-1,-1);
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_150_5.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_150_5.doEnd();
            out.endTag("if",840);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(64);
            out.setTag("if",9637,9701);
            RuntimeTagElement _jettag_c_if_157_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_157_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_157_11.setRuntimeParent(_jettag_c_iterate_149_4);
            _jettag_c_if_157_11.setTagInfo(_td_c_if_157_11);
            _jettag_c_if_157_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_157_11.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",9707,9746);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_158_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_158_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_158_6.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_158_6.setTagInfo(_td_c_get_158_6);
                _jettag_c_get_158_6.doStart(context, out);
                _jettag_c_get_158_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->set");  //$NON-NLS-1$        
                out.setTag("get",9751,9797);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_158_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_158_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_158_50.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_158_50.setTagInfo(_td_c_get_158_50);
                _jettag_c_get_158_50.doStart(context, out);
                _jettag_c_get_158_50.doEnd();
                out.setTag(null,-1,-1);
                out.write("($row[\"");  //$NON-NLS-1$        
                out.setTag("get",9804,9850);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_158_103 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_158_103); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_158_103.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_158_103.setTagInfo(_td_c_get_158_103);
                _jettag_c_get_158_103.doStart(context, out);
                _jettag_c_get_158_103.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",9851,9891);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_158_150 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_158_150); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_158_150.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_158_150.setTagInfo(_td_c_get_158_150);
                _jettag_c_get_158_150.doStart(context, out);
                _jettag_c_get_158_150.doEnd();
                out.setTag(null,-1,-1);
                out.write("\"]);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_157_11.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_157_11.doEnd();
            out.endTag("if",198);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(124);
            out.setTag("if",9906,10030);
            RuntimeTagElement _jettag_c_if_159_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_159_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_159_11.setRuntimeParent(_jettag_c_iterate_149_4);
            _jettag_c_if_159_11.setTagInfo(_td_c_if_159_11);
            _jettag_c_if_159_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_159_11.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$query_");  //$NON-NLS-1$        
                out.setTag("get",10042,10082);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_160_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_160_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_160_12.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_get_160_12.setTagInfo(_td_c_get_160_12);
                _jettag_c_get_160_12.doStart(context, out);
                _jettag_c_get_160_12.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = pg_query(\"SELECT");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",10108,10173);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_161_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_161_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_161_7.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_get_161_7.setTagInfo(_td_c_get_161_7);
                _jettag_c_get_161_7.doStart(context, out);
                _jettag_c_get_161_7.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id AS ");  //$NON-NLS-1$        
                out.setTag("get",10180,10245);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_161_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_161_79); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_161_79.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_get_161_79.setTagInfo(_td_c_get_161_79);
                _jettag_c_get_161_79.doStart(context, out);
                _jettag_c_get_161_79.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id, ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(108);
                out.setTag("iterate",10250,10358);
                RuntimeTagElement _jettag_c_iterate_161_149 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_161_149); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_161_149.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_iterate_161_149.setTagInfo(_td_c_iterate_161_149);
                _jettag_c_iterate_161_149.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_161_149.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_161_149.getTagInfo().getAttribute("delimiter"),10250,10358);
                    out.loopIterate();
                    out.setTag("get",10358,10423);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_162_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_162_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_162_8.setRuntimeParent(_jettag_c_iterate_161_149);
                    _jettag_c_get_162_8.setTagInfo(_td_c_get_162_8);
                    _jettag_c_get_162_8.doStart(context, out);
                    _jettag_c_get_162_8.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",10424,10482);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_162_74 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_162_74); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_162_74.setRuntimeParent(_jettag_c_iterate_161_149);
                    _jettag_c_get_162_74.setTagInfo(_td_c_get_162_74);
                    _jettag_c_get_162_74.doStart(context, out);
                    _jettag_c_get_162_74.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" AS ");  //$NON-NLS-1$        
                    out.setTag("get",10486,10551);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_162_136 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_162_136); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_162_136.setRuntimeParent(_jettag_c_iterate_161_149);
                    _jettag_c_get_162_136.setTagInfo(_td_c_get_162_136);
                    _jettag_c_get_162_136.doStart(context, out);
                    _jettag_c_get_162_136.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",10552,10610);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_162_202 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_162_202); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_162_202.setRuntimeParent(_jettag_c_iterate_161_149);
                    _jettag_c_get_162_202.setTagInfo(_td_c_get_162_202);
                    _jettag_c_get_162_202.doStart(context, out);
                    _jettag_c_get_162_202.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(",");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_161_149.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_161_149.doEnd();
                out.loopEnd();
                out.endTag("iterate",253);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",10630,10676);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_163_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_163_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_163_7.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_get_163_7.setTagInfo(_td_c_get_163_7);
                _jettag_c_get_163_7.doStart(context, out);
                _jettag_c_get_163_7.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",10677,10742);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_163_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_163_54); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_163_54.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_get_163_54.setTagInfo(_td_c_get_163_54);
                _jettag_c_get_163_54.doStart(context, out);
                _jettag_c_get_163_54.doEnd();
                out.setTag(null,-1,-1);
                out.write(".created_at,");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",10761,10807);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_164_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_164_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_164_7.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_get_164_7.setTagInfo(_td_c_get_164_7);
                _jettag_c_get_164_7.doStart(context, out);
                _jettag_c_get_164_7.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",10808,10873);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_164_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_164_54); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_164_54.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_get_164_54.setTagInfo(_td_c_get_164_54);
                _jettag_c_get_164_54.doStart(context, out);
                _jettag_c_get_164_54.doEnd();
                out.setTag(null,-1,-1);
                out.write(".update_at");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tFROM ");  //$NON-NLS-1$        
                out.setTag("get",10894,10940);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_165_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_165_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_165_11.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_get_165_11.setTagInfo(_td_c_get_165_11);
                _jettag_c_get_165_11.doStart(context, out);
                _jettag_c_get_165_11.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",10941,11006);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_165_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_165_58); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_165_58.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_get_165_58.setTagInfo(_td_c_get_165_58);
                _jettag_c_get_165_58.doStart(context, out);
                _jettag_c_get_165_58.doEnd();
                out.setTag(null,-1,-1);
                out.write(NL);         
                out.write("\t\t\t\t\tINNER JOIN ");  //$NON-NLS-1$        
                out.setTag("get",11023,11088);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_166_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_166_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_166_17.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_get_166_17.setTagInfo(_td_c_get_166_17);
                _jettag_c_get_166_17.doStart(context, out);
                _jettag_c_get_166_17.doEnd();
                out.setTag(null,-1,-1);
                out.write(" ON ");  //$NON-NLS-1$        
                out.setTag("get",11092,11157);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_166_86 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_166_86); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_166_86.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_get_166_86.setTagInfo(_td_c_get_166_86);
                _jettag_c_get_166_86.doStart(context, out);
                _jettag_c_get_166_86.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id = ");  //$NON-NLS-1$        
                out.setTag("get",11163,11209);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_166_157 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_166_157); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_166_157.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_get_166_157.setTagInfo(_td_c_get_166_157);
                _jettag_c_get_166_157.doStart(context, out);
                _jettag_c_get_166_157.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",11210,11275);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_166_204 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_166_204); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_166_204.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_get_166_204.setTagInfo(_td_c_get_166_204);
                _jettag_c_get_166_204.doStart(context, out);
                _jettag_c_get_166_204.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",11276,11341);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_166_270 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_166_270); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_166_270.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_get_166_270.setTagInfo(_td_c_get_166_270);
                _jettag_c_get_166_270.doStart(context, out);
                _jettag_c_get_166_270.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tWHERE ");  //$NON-NLS-1$        
                out.setTag("get",11357,11403);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_167_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_167_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_167_12.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_get_167_12.setTagInfo(_td_c_get_167_12);
                _jettag_c_get_167_12.doStart(context, out);
                _jettag_c_get_167_12.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",11404,11469);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_167_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_167_59); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_167_59.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_get_167_59.setTagInfo(_td_c_get_167_59);
                _jettag_c_get_167_59.doStart(context, out);
                _jettag_c_get_167_59.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",11470,11516);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_167_125 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_167_125); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_167_125.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_get_167_125.setTagInfo(_td_c_get_167_125);
                _jettag_c_get_167_125.doStart(context, out);
                _jettag_c_get_167_125.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id = \" . $");  //$NON-NLS-1$        
                out.setTag("get",11527,11566);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_167_182 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_167_182); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_167_182.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_get_167_182.setTagInfo(_td_c_get_167_182);
                _jettag_c_get_167_182.doStart(context, out);
                _jettag_c_get_167_182.doEnd();
                out.setTag(null,-1,-1);
                out.write("->getId()");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\tif ($query_");  //$NON-NLS-1$        
                out.setTag("get",11603,11643);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_170_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_170_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_170_16.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_get_170_16.setTagInfo(_td_c_get_170_16);
                _jettag_c_get_170_16.doStart(context, out);
                _jettag_c_get_170_16.doEnd();
                out.setTag(null,-1,-1);
                out.write(") {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\twhile ($row_");  //$NON-NLS-1$        
                out.setTag("get",11664,11704);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_171_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_171_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_171_18.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_get_171_18.setTagInfo(_td_c_get_171_18);
                _jettag_c_get_171_18.doStart(context, out);
                _jettag_c_get_171_18.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = pg_fetch_assoc($query_");  //$NON-NLS-1$        
                out.setTag("get",11729,11769);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_171_83 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_171_83); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_171_83.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_get_171_83.setTagInfo(_td_c_get_171_83);
                _jettag_c_get_171_83.doStart(context, out);
                _jettag_c_get_171_83.doEnd();
                out.setTag(null,-1,-1);
                out.write(")) {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",11781,11839);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_172_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_172_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_172_8.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_get_172_8.setTagInfo(_td_c_get_172_8);
                _jettag_c_get_172_8.doStart(context, out);
                _jettag_c_get_172_8.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = new ");  //$NON-NLS-1$        
                out.setTag("get",11846,11909);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(63);
                RuntimeTagElement _jettag_c_get_172_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_172_73); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_172_73.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_get_172_73.setTagInfo(_td_c_get_172_73);
                _jettag_c_get_172_73.doStart(context, out);
                _jettag_c_get_172_73.doEnd();
                out.setTag(null,-1,-1);
                out.write("();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",11920,11978);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_173_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_173_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_173_8.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_get_173_8.setTagInfo(_td_c_get_173_8);
                _jettag_c_get_173_8.doStart(context, out);
                _jettag_c_get_173_8.doEnd();
                out.setTag(null,-1,-1);
                out.write("->setId($row_");  //$NON-NLS-1$        
                out.setTag("get",11991,12031);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_173_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_173_79); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_173_79.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_get_173_79.setTagInfo(_td_c_get_173_79);
                _jettag_c_get_173_79.doStart(context, out);
                _jettag_c_get_173_79.doEnd();
                out.setTag(null,-1,-1);
                out.write("[\"");  //$NON-NLS-1$        
                out.setTag("get",12033,12098);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_173_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_173_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_173_121.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_get_173_121.setTagInfo(_td_c_get_173_121);
                _jettag_c_get_173_121.doStart(context, out);
                _jettag_c_get_173_121.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id\"]);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(108);
                out.setTag("iterate",12112,12220);
                RuntimeTagElement _jettag_c_iterate_174_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_174_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_174_7.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_iterate_174_7.setTagInfo(_td_c_iterate_174_7);
                _jettag_c_iterate_174_7.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_174_7.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_174_7.getTagInfo().getAttribute("delimiter"),12112,12220);
                    out.loopIterate();
                    out.write("$");  //$NON-NLS-1$        
                    out.setTag("get",12221,12279);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_175_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_175_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_175_9.setRuntimeParent(_jettag_c_iterate_174_7);
                    _jettag_c_get_175_9.setTagInfo(_td_c_get_175_9);
                    _jettag_c_get_175_9.doStart(context, out);
                    _jettag_c_get_175_9.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->set");  //$NON-NLS-1$        
                    out.setTag("get",12284,12348);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(64);
                    RuntimeTagElement _jettag_c_get_175_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_175_72); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_175_72.setRuntimeParent(_jettag_c_iterate_174_7);
                    _jettag_c_get_175_72.setTagInfo(_td_c_get_175_72);
                    _jettag_c_get_175_72.doStart(context, out);
                    _jettag_c_get_175_72.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("($row_");  //$NON-NLS-1$        
                    out.setTag("get",12354,12394);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_175_142 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_175_142); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_175_142.setRuntimeParent(_jettag_c_iterate_174_7);
                    _jettag_c_get_175_142.setTagInfo(_td_c_get_175_142);
                    _jettag_c_get_175_142.doStart(context, out);
                    _jettag_c_get_175_142.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("[\"");  //$NON-NLS-1$        
                    out.setTag("get",12396,12461);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_175_184 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_175_184); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_175_184.setRuntimeParent(_jettag_c_iterate_174_7);
                    _jettag_c_get_175_184.setTagInfo(_td_c_get_175_184);
                    _jettag_c_get_175_184.doStart(context, out);
                    _jettag_c_get_175_184.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",12462,12520);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_175_250 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_175_250); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_175_250.setRuntimeParent(_jettag_c_iterate_174_7);
                    _jettag_c_get_175_250.setTagInfo(_td_c_get_175_250);
                    _jettag_c_get_175_250.doStart(context, out);
                    _jettag_c_get_175_250.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\"]);");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_174_7.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_174_7.doEnd();
                out.loopEnd();
                out.endTag("iterate",311);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",12551,12590);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_177_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_177_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_177_8.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_get_177_8.setTagInfo(_td_c_get_177_8);
                _jettag_c_get_177_8.doStart(context, out);
                _jettag_c_get_177_8.doEnd();
                out.setTag(null,-1,-1);
                out.write("->add");  //$NON-NLS-1$        
                out.setTag("get",12595,12641);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_177_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_177_52); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_177_52.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_get_177_52.setTagInfo(_td_c_get_177_52);
                _jettag_c_get_177_52.doStart(context, out);
                _jettag_c_get_177_52.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",12643,12701);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_177_100 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_177_100); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_177_100.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_get_177_100.setTagInfo(_td_c_get_177_100);
                _jettag_c_get_177_100.doStart(context, out);
                _jettag_c_get_177_100.doEnd();
                out.setTag(null,-1,-1);
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_159_11.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_159_11.doEnd();
            out.endTag("if",2690);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_149_4.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_149_4.doEnd();
        out.loopEnd();
        out.endTag("iterate",4062);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\t\t$result[] = $");  //$NON-NLS-1$        
        out.setTag("get",12757,12796);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_181_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_181_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_181_18.setRuntimeParent(null);
        _jettag_c_get_181_18.setTagInfo(_td_c_get_181_18);
        _jettag_c_get_181_18.doStart(context, out);
        _jettag_c_get_181_18.doEnd();
        out.setTag(null,-1,-1);
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\treturn $result;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic function get($");  //$NON-NLS-1$        
        out.setTag("get",12852,12891);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_188_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_188_23); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_188_23.setRuntimeParent(null);
        _jettag_c_get_188_23.setTagInfo(_td_c_get_188_23);
        _jettag_c_get_188_23.doStart(context, out);
        _jettag_c_get_188_23.doEnd();
        out.setTag(null,-1,-1);
        out.write(")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$result = array();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t$where = \"\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(64);
        out.setTag("iterate",12935,12999);
        RuntimeTagElement _jettag_c_iterate_194_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_194_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_194_2.setRuntimeParent(null);
        _jettag_c_iterate_194_2.setTagInfo(_td_c_iterate_194_2);
        _jettag_c_iterate_194_2.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_194_2.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_194_2.getTagInfo().getAttribute("delimiter"),12935,12999);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\tif (");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(61);
            out.setTag("if",13006,13067);
            RuntimeTagElement _jettag_c_if_195_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_195_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_195_7.setRuntimeParent(_jettag_c_iterate_194_2);
            _jettag_c_if_195_7.setTagInfo(_td_c_if_195_7);
            _jettag_c_if_195_7.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_195_7.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t(is_array($");  //$NON-NLS-1$        
                out.setTag("get",13082,13121);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_196_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_196_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_196_15.setRuntimeParent(_jettag_c_if_195_7);
                _jettag_c_get_196_15.setTagInfo(_td_c_get_196_15);
                _jettag_c_get_196_15.doStart(context, out);
                _jettag_c_get_196_15.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",13126,13172);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_196_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_196_59); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_196_59.setRuntimeParent(_jettag_c_if_195_7);
                _jettag_c_get_196_59.setTagInfo(_td_c_get_196_59);
                _jettag_c_get_196_59.doStart(context, out);
                _jettag_c_get_196_59.doEnd();
                out.setTag(null,-1,-1);
                out.write("()) && count($");  //$NON-NLS-1$        
                out.setTag("get",13186,13225);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_196_119 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_196_119); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_196_119.setRuntimeParent(_jettag_c_if_195_7);
                _jettag_c_get_196_119.setTagInfo(_td_c_get_196_119);
                _jettag_c_get_196_119.doStart(context, out);
                _jettag_c_get_196_119.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",13230,13276);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_196_163 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_196_163); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_196_163.setRuntimeParent(_jettag_c_if_195_7);
                _jettag_c_get_196_163.setTagInfo(_td_c_get_196_163);
                _jettag_c_get_196_163.doStart(context, out);
                _jettag_c_get_196_163.doEnd();
                out.setTag(null,-1,-1);
                out.write("()) > 0)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t|| (is_object($");  //$NON-NLS-1$        
                out.setTag("get",13303,13342);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_197_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_197_19); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_197_19.setRuntimeParent(_jettag_c_if_195_7);
                _jettag_c_get_197_19.setTagInfo(_td_c_get_197_19);
                _jettag_c_get_197_19.doStart(context, out);
                _jettag_c_get_197_19.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",13347,13393);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_197_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_197_63); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_197_63.setRuntimeParent(_jettag_c_if_195_7);
                _jettag_c_get_197_63.setTagInfo(_td_c_get_197_63);
                _jettag_c_get_197_63.doStart(context, out);
                _jettag_c_get_197_63.doEnd();
                out.setTag(null,-1,-1);
                out.write("()) && $");  //$NON-NLS-1$        
                out.setTag("get",13401,13440);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_197_117 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_197_117); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_197_117.setRuntimeParent(_jettag_c_if_195_7);
                _jettag_c_get_197_117.setTagInfo(_td_c_get_197_117);
                _jettag_c_get_197_117.doStart(context, out);
                _jettag_c_get_197_117.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",13445,13491);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_197_161 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_197_161); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_197_161.setRuntimeParent(_jettag_c_if_195_7);
                _jettag_c_get_197_161.setTagInfo(_td_c_get_197_161);
                _jettag_c_get_197_161.doStart(context, out);
                _jettag_c_get_197_161.doEnd();
                out.setTag(null,-1,-1);
                out.write("()->getId() > 0)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_195_7.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_195_7.doEnd();
            out.endTag("if",443);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(68);
            out.setTag("if",13517,13585);
            RuntimeTagElement _jettag_c_if_198_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_198_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_198_10.setRuntimeParent(_jettag_c_iterate_194_2);
            _jettag_c_if_198_10.setTagInfo(_td_c_if_198_10);
            _jettag_c_if_198_10.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_198_10.okToProcessBody()) {
                out.write("strlen($");  //$NON-NLS-1$        
                out.setTag("get",13593,13632);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_199_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_199_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_199_13.setRuntimeParent(_jettag_c_if_198_10);
                _jettag_c_get_199_13.setTagInfo(_td_c_get_199_13);
                _jettag_c_get_199_13.doStart(context, out);
                _jettag_c_get_199_13.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",13637,13683);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_199_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_199_57); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_199_57.setRuntimeParent(_jettag_c_if_198_10);
                _jettag_c_get_199_57.setTagInfo(_td_c_get_199_57);
                _jettag_c_get_199_57.doStart(context, out);
                _jettag_c_get_199_57.doEnd();
                out.setTag(null,-1,-1);
                out.write("()) > 0");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_198_10.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_198_10.doEnd();
            out.endTag("if",105);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(") {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\tif (strlen($where) > 0) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t$where .= \" AND \";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t} else {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t$where = \"WHERE \";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("\t\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(66);
            out.setTag("if",13797,13863);
            RuntimeTagElement _jettag_c_if_206_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_206_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_206_4.setRuntimeParent(_jettag_c_iterate_194_2);
            _jettag_c_if_206_4.setTagInfo(_td_c_if_206_4);
            _jettag_c_if_206_4.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_206_4.okToProcessBody()) {
                out.write("if (is_array($");  //$NON-NLS-1$        
                out.setTag("get",13877,13916);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_207_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_207_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_207_20.setRuntimeParent(_jettag_c_if_206_4);
                _jettag_c_get_207_20.setTagInfo(_td_c_get_207_20);
                _jettag_c_get_207_20.doStart(context, out);
                _jettag_c_get_207_20.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",13921,13967);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_207_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_207_64); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_207_64.setRuntimeParent(_jettag_c_if_206_4);
                _jettag_c_get_207_64.setTagInfo(_td_c_get_207_64);
                _jettag_c_get_207_64.doStart(context, out);
                _jettag_c_get_207_64.doEnd();
                out.setTag(null,-1,-1);
                out.write("())) {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t$first = true;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t$where .= \"(\";");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tforeach ($");  //$NON-NLS-1$        
                out.setTag("get",14029,14068);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_210_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_210_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_210_16.setRuntimeParent(_jettag_c_if_206_4);
                _jettag_c_get_210_16.setTagInfo(_td_c_get_210_16);
                _jettag_c_get_210_16.doStart(context, out);
                _jettag_c_get_210_16.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",14073,14119);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_210_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_210_60); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_210_60.setRuntimeParent(_jettag_c_if_206_4);
                _jettag_c_get_210_60.setTagInfo(_td_c_get_210_60);
                _jettag_c_get_210_60.doStart(context, out);
                _jettag_c_get_210_60.doEnd();
                out.setTag(null,-1,-1);
                out.write("() as $");  //$NON-NLS-1$        
                out.setTag("get",14126,14166);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_210_113 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_210_113); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_210_113.setRuntimeParent(_jettag_c_if_206_4);
                _jettag_c_get_210_113.setTagInfo(_td_c_get_210_113);
                _jettag_c_get_210_113.doStart(context, out);
                _jettag_c_get_210_113.doEnd();
                out.setTag(null,-1,-1);
                out.write(") {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\tif ( ! $first) {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t$where .= \" OR \";");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(80);
                out.setTag("if",14233,14313);
                RuntimeTagElement _jettag_c_if_215_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_215_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_215_7.setRuntimeParent(_jettag_c_if_206_4);
                _jettag_c_if_215_7.setTagInfo(_td_c_if_215_7);
                _jettag_c_if_215_7.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_215_7.okToProcessBody()) {
                    out.write("$where .= \"");  //$NON-NLS-1$        
                    out.setTag("get",14324,14370);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_216_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_216_19); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_216_19.setRuntimeParent(_jettag_c_if_215_7);
                    _jettag_c_get_216_19.setTagInfo(_td_c_get_216_19);
                    _jettag_c_get_216_19.doStart(context, out);
                    _jettag_c_get_216_19.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",14371,14411);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_216_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_216_66); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_216_66.setRuntimeParent(_jettag_c_if_215_7);
                    _jettag_c_get_216_66.setTagInfo(_td_c_get_216_66);
                    _jettag_c_get_216_66.doStart(context, out);
                    _jettag_c_get_216_66.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" = \" . $");  //$NON-NLS-1$        
                    out.setTag("get",14419,14459);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_216_114 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_216_114); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_216_114.setRuntimeParent(_jettag_c_if_215_7);
                    _jettag_c_get_216_114.setTagInfo(_td_c_get_216_114);
                    _jettag_c_get_216_114.doStart(context, out);
                    _jettag_c_get_216_114.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->getId();");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_215_7.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_215_7.doEnd();
                out.endTag("if",163);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(77);
                out.setTag("if",14483,14560);
                RuntimeTagElement _jettag_c_if_217_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_217_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_217_14.setRuntimeParent(_jettag_c_if_206_4);
                _jettag_c_if_217_14.setTagInfo(_td_c_if_217_14);
                _jettag_c_if_217_14.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_217_14.okToProcessBody()) {
                    out.write("$where .= \"(");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\tSELECT count(*)");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\tFROM ");  //$NON-NLS-1$        
                    out.setTag("get",14608,14654);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_220_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_220_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_220_13.setRuntimeParent(_jettag_c_if_217_14);
                    _jettag_c_get_220_13.setTagInfo(_td_c_get_220_13);
                    _jettag_c_get_220_13.doStart(context, out);
                    _jettag_c_get_220_13.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",14655,14720);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_220_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_220_60); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_220_60.setRuntimeParent(_jettag_c_if_217_14);
                    _jettag_c_get_220_60.setTagInfo(_td_c_get_220_60);
                    _jettag_c_get_220_60.doStart(context, out);
                    _jettag_c_get_220_60.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\tWHERE");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.setTag("get",14742,14788);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_222_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_222_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_222_9.setRuntimeParent(_jettag_c_if_217_14);
                    _jettag_c_get_222_9.setTagInfo(_td_c_get_222_9);
                    _jettag_c_get_222_9.doStart(context, out);
                    _jettag_c_get_222_9.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",14789,14854);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_222_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_222_56); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_222_56.setRuntimeParent(_jettag_c_if_217_14);
                    _jettag_c_get_222_56.setTagInfo(_td_c_get_222_56);
                    _jettag_c_get_222_56.doStart(context, out);
                    _jettag_c_get_222_56.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",14855,14901);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_222_122 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_222_122); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_222_122.setRuntimeParent(_jettag_c_if_217_14);
                    _jettag_c_get_222_122.setTagInfo(_td_c_get_222_122);
                    _jettag_c_get_222_122.doStart(context, out);
                    _jettag_c_get_222_122.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_id = ");  //$NON-NLS-1$        
                    out.setTag("get",14907,14953);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_222_174 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_222_174); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_222_174.setRuntimeParent(_jettag_c_if_217_14);
                    _jettag_c_get_222_174.setTagInfo(_td_c_get_222_174);
                    _jettag_c_get_222_174.doStart(context, out);
                    _jettag_c_get_222_174.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".id");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\tAND ");  //$NON-NLS-1$        
                    out.setTag("get",14969,15015);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_223_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_223_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_223_13.setRuntimeParent(_jettag_c_if_217_14);
                    _jettag_c_get_223_13.setTagInfo(_td_c_get_223_13);
                    _jettag_c_get_223_13.doStart(context, out);
                    _jettag_c_get_223_13.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",15016,15081);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_223_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_223_60); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_223_60.setRuntimeParent(_jettag_c_if_217_14);
                    _jettag_c_get_223_60.setTagInfo(_td_c_get_223_60);
                    _jettag_c_get_223_60.doStart(context, out);
                    _jettag_c_get_223_60.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",15082,15147);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_223_126 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_223_126); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_223_126.setRuntimeParent(_jettag_c_if_217_14);
                    _jettag_c_get_223_126.setTagInfo(_td_c_get_223_126);
                    _jettag_c_get_223_126.doStart(context, out);
                    _jettag_c_get_223_126.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_id = \" . $");  //$NON-NLS-1$        
                    out.setTag("get",15158,15198);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_223_202 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_223_202); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_223_202.setRuntimeParent(_jettag_c_if_217_14);
                    _jettag_c_get_223_202.setTagInfo(_td_c_get_223_202);
                    _jettag_c_get_223_202.doStart(context, out);
                    _jettag_c_get_223_202.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->getId() . \"");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t) > 0\";");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_217_14.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_217_14.doEnd();
                out.endTag("if",672);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("\t\t\t\t\t\t$first = false;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t$where .= \")\";");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t} else {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t$where .= \"");  //$NON-NLS-1$        
                out.setTag("get",15318,15364);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_230_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_230_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_230_17.setRuntimeParent(_jettag_c_if_206_4);
                _jettag_c_get_230_17.setTagInfo(_td_c_get_230_17);
                _jettag_c_get_230_17.doStart(context, out);
                _jettag_c_get_230_17.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",15365,15405);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_230_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_230_64); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_230_64.setRuntimeParent(_jettag_c_if_206_4);
                _jettag_c_get_230_64.setTagInfo(_td_c_get_230_64);
                _jettag_c_get_230_64.doStart(context, out);
                _jettag_c_get_230_64.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = \" . $");  //$NON-NLS-1$        
                out.setTag("get",15413,15452);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_230_112 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_230_112); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_230_112.setRuntimeParent(_jettag_c_if_206_4);
                _jettag_c_get_230_112.setTagInfo(_td_c_get_230_112);
                _jettag_c_get_230_112.doStart(context, out);
                _jettag_c_get_230_112.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",15457,15503);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_230_156 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_230_156); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_230_156.setRuntimeParent(_jettag_c_if_206_4);
                _jettag_c_get_230_156.setTagInfo(_td_c_get_230_156);
                _jettag_c_get_230_156.doStart(context, out);
                _jettag_c_get_230_156.doEnd();
                out.setTag(null,-1,-1);
                out.write("()->getId();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_206_4.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_206_4.doEnd();
            out.endTag("if",1662);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(69);
            out.setTag("if",15532,15601);
            RuntimeTagElement _jettag_c_if_232_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_232_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_232_11.setRuntimeParent(_jettag_c_iterate_194_2);
            _jettag_c_if_232_11.setTagInfo(_td_c_if_232_11);
            _jettag_c_if_232_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_232_11.okToProcessBody()) {
                out.write("$where .= \"");  //$NON-NLS-1$        
                out.setTag("get",15612,15658);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_233_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_233_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_233_17.setRuntimeParent(_jettag_c_if_232_11);
                _jettag_c_get_233_17.setTagInfo(_td_c_get_233_17);
                _jettag_c_get_233_17.doStart(context, out);
                _jettag_c_get_233_17.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",15659,15699);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_233_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_233_64); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_233_64.setRuntimeParent(_jettag_c_if_232_11);
                _jettag_c_get_233_64.setTagInfo(_td_c_get_233_64);
                _jettag_c_get_233_64.doStart(context, out);
                _jettag_c_get_233_64.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = '\" . $");  //$NON-NLS-1$        
                out.setTag("get",15708,15747);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_233_113 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_233_113); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_233_113.setRuntimeParent(_jettag_c_if_232_11);
                _jettag_c_get_233_113.setTagInfo(_td_c_get_233_113);
                _jettag_c_get_233_113.doStart(context, out);
                _jettag_c_get_233_113.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",15752,15798);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_233_157 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_233_157); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_233_157.setRuntimeParent(_jettag_c_if_232_11);
                _jettag_c_get_233_157.setTagInfo(_td_c_get_233_157);
                _jettag_c_get_233_157.doStart(context, out);
                _jettag_c_get_233_157.doEnd();
                out.setTag(null,-1,-1);
                out.write("() . \"'\";");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_232_11.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_232_11.doEnd();
            out.endTag("if",210);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("\t\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_194_2.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_194_2.doEnd();
        out.loopEnd();
        out.endTag("iterate",2825);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t$query = pg_query(\"SELECT");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.setTag("get",15869,15915);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_238_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_238_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_238_5.setRuntimeParent(null);
        _jettag_c_get_238_5.setTagInfo(_td_c_get_238_5);
        _jettag_c_get_238_5.doStart(context, out);
        _jettag_c_get_238_5.doEnd();
        out.setTag(null,-1,-1);
        out.write(".id AS ");  //$NON-NLS-1$        
        out.setTag("get",15922,15968);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_238_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_238_58); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_238_58.setRuntimeParent(null);
        _jettag_c_get_238_58.setTagInfo(_td_c_get_238_58);
        _jettag_c_get_238_58.doStart(context, out);
        _jettag_c_get_238_58.doEnd();
        out.setTag(null,-1,-1);
        out.write("_id,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(69);
        out.setTag("iterate",15977,16046);
        RuntimeTagElement _jettag_c_iterate_239_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_239_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_239_5.setRuntimeParent(null);
        _jettag_c_iterate_239_5.setTagInfo(_td_c_iterate_239_5);
        _jettag_c_iterate_239_5.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_239_5.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_239_5.getTagInfo().getAttribute("delimiter"),15977,16046);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(125);
            out.setTag("if",16046,16171);
            RuntimeTagElement _jettag_c_if_240_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_240_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_240_6.setRuntimeParent(_jettag_c_iterate_239_5);
            _jettag_c_if_240_6.setTagInfo(_td_c_if_240_6);
            _jettag_c_if_240_6.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_240_6.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",16177,16242);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_241_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_241_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_241_6.setRuntimeParent(_jettag_c_if_240_6);
                _jettag_c_get_241_6.setTagInfo(_td_c_get_241_6);
                _jettag_c_get_241_6.doStart(context, out);
                _jettag_c_get_241_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id AS ");  //$NON-NLS-1$        
                out.setTag("get",16249,16314);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_241_78 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_241_78); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_241_78.setRuntimeParent(_jettag_c_if_240_6);
                _jettag_c_get_241_78.setTagInfo(_td_c_get_241_78);
                _jettag_c_get_241_78.doStart(context, out);
                _jettag_c_get_241_78.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id, ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(107);
                out.setTag("iterate",16319,16426);
                RuntimeTagElement _jettag_c_iterate_241_148 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_241_148); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_241_148.setRuntimeParent(_jettag_c_if_240_6);
                _jettag_c_iterate_241_148.setTagInfo(_td_c_iterate_241_148);
                _jettag_c_iterate_241_148.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_241_148.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_241_148.getTagInfo().getAttribute("delimiter"),16319,16426);
                    out.loopIterate();
                    out.setTag("get",16426,16491);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_242_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_242_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_242_7.setRuntimeParent(_jettag_c_iterate_241_148);
                    _jettag_c_get_242_7.setTagInfo(_td_c_get_242_7);
                    _jettag_c_get_242_7.doStart(context, out);
                    _jettag_c_get_242_7.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",16492,16550);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_242_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_242_73); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_242_73.setRuntimeParent(_jettag_c_iterate_241_148);
                    _jettag_c_get_242_73.setTagInfo(_td_c_get_242_73);
                    _jettag_c_get_242_73.doStart(context, out);
                    _jettag_c_get_242_73.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" AS ");  //$NON-NLS-1$        
                    out.setTag("get",16554,16619);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_242_135 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_242_135); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_242_135.setRuntimeParent(_jettag_c_iterate_241_148);
                    _jettag_c_get_242_135.setTagInfo(_td_c_get_242_135);
                    _jettag_c_get_242_135.doStart(context, out);
                    _jettag_c_get_242_135.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",16620,16678);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_242_201 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_242_201); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_242_201.setRuntimeParent(_jettag_c_iterate_241_148);
                    _jettag_c_get_242_201.setTagInfo(_td_c_get_242_201);
                    _jettag_c_get_242_201.doStart(context, out);
                    _jettag_c_get_242_201.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(",");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_241_148.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_241_148.doEnd();
                out.loopEnd();
                out.endTag("iterate",253);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_240_6.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_240_6.doEnd();
            out.endTag("if",525);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(69);
            out.setTag("if",16703,16772);
            RuntimeTagElement _jettag_c_if_243_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_243_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_243_12.setRuntimeParent(_jettag_c_iterate_239_5);
            _jettag_c_if_243_12.setTagInfo(_td_c_if_243_12);
            _jettag_c_if_243_12.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_243_12.okToProcessBody()) {
                out.setTag("get",16772,16818);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_244_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_244_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_244_6.setRuntimeParent(_jettag_c_if_243_12);
                _jettag_c_get_244_6.setTagInfo(_td_c_get_244_6);
                _jettag_c_get_244_6.doStart(context, out);
                _jettag_c_get_244_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",16819,16859);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_244_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_244_53); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_244_53.setRuntimeParent(_jettag_c_if_243_12);
                _jettag_c_get_244_53.setTagInfo(_td_c_get_244_53);
                _jettag_c_get_244_53.doStart(context, out);
                _jettag_c_get_244_53.doEnd();
                out.setTag(null,-1,-1);
                out.write(" AS ");  //$NON-NLS-1$        
                out.setTag("get",16863,16909);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_244_97 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_244_97); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_244_97.setRuntimeParent(_jettag_c_if_243_12);
                _jettag_c_get_244_97.setTagInfo(_td_c_get_244_97);
                _jettag_c_get_244_97.doStart(context, out);
                _jettag_c_get_244_97.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",16910,16950);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_244_144 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_244_144); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_244_144.setRuntimeParent(_jettag_c_if_243_12);
                _jettag_c_get_244_144.setTagInfo(_td_c_get_244_144);
                _jettag_c_get_244_144.doStart(context, out);
                _jettag_c_get_244_144.doEnd();
                out.setTag(null,-1,-1);
                out.write(",");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_243_12.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_243_12.doEnd();
            out.endTag("if",179);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_239_5.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_239_5.doEnd();
        out.loopEnd();
        out.endTag("iterate",912);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.setTag("get",16975,17021);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_245_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_245_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_245_5.setRuntimeParent(null);
        _jettag_c_get_245_5.setTagInfo(_td_c_get_245_5);
        _jettag_c_get_245_5.doStart(context, out);
        _jettag_c_get_245_5.doEnd();
        out.setTag(null,-1,-1);
        out.write(".created_at,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.setTag("get",17038,17084);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_246_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_246_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_246_5.setRuntimeParent(null);
        _jettag_c_get_246_5.setTagInfo(_td_c_get_246_5);
        _jettag_c_get_246_5.doStart(context, out);
        _jettag_c_get_246_5.doEnd();
        out.setTag(null,-1,-1);
        out.write(".update_at");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tFROM ");  //$NON-NLS-1$        
        out.setTag("get",17103,17149);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_247_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_247_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_247_9.setRuntimeParent(null);
        _jettag_c_get_247_9.setTagInfo(_td_c_get_247_9);
        _jettag_c_get_247_9.doStart(context, out);
        _jettag_c_get_247_9.doEnd();
        out.setTag(null,-1,-1);
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(64);
        out.setTag("iterate",17153,17217);
        RuntimeTagElement _jettag_c_iterate_248_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_248_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_248_4.setRuntimeParent(null);
        _jettag_c_iterate_248_4.setTagInfo(_td_c_iterate_248_4);
        _jettag_c_iterate_248_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_248_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_248_4.getTagInfo().getAttribute("delimiter"),17153,17217);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(129);
            out.setTag("if",17217,17346);
            RuntimeTagElement _jettag_c_if_248_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_248_68); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_248_68.setRuntimeParent(_jettag_c_iterate_248_4);
            _jettag_c_if_248_68.setTagInfo(_td_c_if_248_68);
            _jettag_c_if_248_68.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_248_68.okToProcessBody()) {
                out.write("INNER JOIN ");  //$NON-NLS-1$        
                out.setTag("get",17357,17422);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_249_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_249_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_249_16.setRuntimeParent(_jettag_c_if_248_68);
                _jettag_c_get_249_16.setTagInfo(_td_c_get_249_16);
                _jettag_c_get_249_16.doStart(context, out);
                _jettag_c_get_249_16.doEnd();
                out.setTag(null,-1,-1);
                out.write(" ON ");  //$NON-NLS-1$        
                out.setTag("get",17426,17491);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_249_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_249_85); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_249_85.setRuntimeParent(_jettag_c_if_248_68);
                _jettag_c_get_249_85.setTagInfo(_td_c_get_249_85);
                _jettag_c_get_249_85.doStart(context, out);
                _jettag_c_get_249_85.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id = ");  //$NON-NLS-1$        
                out.setTag("get",17497,17543);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_249_156 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_249_156); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_249_156.setRuntimeParent(_jettag_c_if_248_68);
                _jettag_c_get_249_156.setTagInfo(_td_c_get_249_156);
                _jettag_c_get_249_156.doStart(context, out);
                _jettag_c_get_249_156.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",17544,17584);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_249_203 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_249_203); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_249_203.setRuntimeParent(_jettag_c_if_248_68);
                _jettag_c_get_249_203.setTagInfo(_td_c_get_249_203);
                _jettag_c_get_249_203.doStart(context, out);
                _jettag_c_get_249_203.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_c_if_248_68.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_248_68.doEnd();
            out.endTag("if",238);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_248_4.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_248_4.doEnd();
        out.loopEnd();
        out.endTag("iterate",374);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\" . $where . \"ORDER BY ");  //$NON-NLS-1$        
        out.setTag("get",17629,17675);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_250_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_250_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_250_26.setRuntimeParent(null);
        _jettag_c_get_250_26.setTagInfo(_td_c_get_250_26);
        _jettag_c_get_250_26.doStart(context, out);
        _jettag_c_get_250_26.doEnd();
        out.setTag(null,-1,-1);
        out.write(".id\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tif ($query) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\twhile ($row = pg_fetch_assoc($query)) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t$");  //$NON-NLS-1$        
        out.setTag("get",17747,17786);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_254_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_254_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_254_6.setRuntimeParent(null);
        _jettag_c_get_254_6.setTagInfo(_td_c_get_254_6);
        _jettag_c_get_254_6.doStart(context, out);
        _jettag_c_get_254_6.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = new ");  //$NON-NLS-1$        
        out.setTag("get",17793,17837);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_254_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_254_52); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_254_52.setRuntimeParent(null);
        _jettag_c_get_254_52.setTagInfo(_td_c_get_254_52);
        _jettag_c_get_254_52.doStart(context, out);
        _jettag_c_get_254_52.doEnd();
        out.setTag(null,-1,-1);
        out.write("();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\t\t$");  //$NON-NLS-1$        
        out.setTag("get",17847,17886);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_256_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_256_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_256_6.setRuntimeParent(null);
        _jettag_c_get_256_6.setTagInfo(_td_c_get_256_6);
        _jettag_c_get_256_6.doStart(context, out);
        _jettag_c_get_256_6.doEnd();
        out.setTag(null,-1,-1);
        out.write("->setId($row[\"");  //$NON-NLS-1$        
        out.setTag("get",17900,17946);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_256_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_256_59); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_256_59.setRuntimeParent(null);
        _jettag_c_get_256_59.setTagInfo(_td_c_get_256_59);
        _jettag_c_get_256_59.doStart(context, out);
        _jettag_c_get_256_59.doEnd();
        out.setTag(null,-1,-1);
        out.write("_id\"]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(68);
        out.setTag("iterate",17957,18025);
        RuntimeTagElement _jettag_c_iterate_257_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_257_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_257_4.setRuntimeParent(null);
        _jettag_c_iterate_257_4.setTagInfo(_td_c_iterate_257_4);
        _jettag_c_iterate_257_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_257_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_257_4.getTagInfo().getAttribute("delimiter"),17957,18025);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(125);
            out.setTag("if",18025,18150);
            RuntimeTagElement _jettag_c_if_258_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_258_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_258_5.setRuntimeParent(_jettag_c_iterate_257_4);
            _jettag_c_if_258_5.setTagInfo(_td_c_if_258_5);
            _jettag_c_if_258_5.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_258_5.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",18156,18214);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_259_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_259_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_259_6.setRuntimeParent(_jettag_c_if_258_5);
                _jettag_c_get_259_6.setTagInfo(_td_c_get_259_6);
                _jettag_c_get_259_6.doStart(context, out);
                _jettag_c_get_259_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = new ");  //$NON-NLS-1$        
                out.setTag("get",18221,18284);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(63);
                RuntimeTagElement _jettag_c_get_259_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_259_71); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_259_71.setRuntimeParent(_jettag_c_if_258_5);
                _jettag_c_get_259_71.setTagInfo(_td_c_get_259_71);
                _jettag_c_get_259_71.doStart(context, out);
                _jettag_c_get_259_71.doEnd();
                out.setTag(null,-1,-1);
                out.write("();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",18293,18351);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_260_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_260_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_260_6.setRuntimeParent(_jettag_c_if_258_5);
                _jettag_c_get_260_6.setTagInfo(_td_c_get_260_6);
                _jettag_c_get_260_6.doStart(context, out);
                _jettag_c_get_260_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->setId($row[\"");  //$NON-NLS-1$        
                out.setTag("get",18365,18430);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_260_78 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_260_78); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_260_78.setRuntimeParent(_jettag_c_if_258_5);
                _jettag_c_get_260_78.setTagInfo(_td_c_get_260_78);
                _jettag_c_get_260_78.doStart(context, out);
                _jettag_c_get_260_78.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id\"]);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(106);
                out.setTag("iterate",18442,18548);
                RuntimeTagElement _jettag_c_iterate_261_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_261_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_261_5.setRuntimeParent(_jettag_c_if_258_5);
                _jettag_c_iterate_261_5.setTagInfo(_td_c_iterate_261_5);
                _jettag_c_iterate_261_5.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_261_5.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_261_5.getTagInfo().getAttribute("delimiter"),18442,18548);
                    out.loopIterate();
                    out.write("$");  //$NON-NLS-1$        
                    out.setTag("get",18549,18607);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_262_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_262_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_262_7.setRuntimeParent(_jettag_c_iterate_261_5);
                    _jettag_c_get_262_7.setTagInfo(_td_c_get_262_7);
                    _jettag_c_get_262_7.doStart(context, out);
                    _jettag_c_get_262_7.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->set");  //$NON-NLS-1$        
                    out.setTag("get",18612,18676);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(64);
                    RuntimeTagElement _jettag_c_get_262_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_262_70); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_262_70.setRuntimeParent(_jettag_c_iterate_261_5);
                    _jettag_c_get_262_70.setTagInfo(_td_c_get_262_70);
                    _jettag_c_get_262_70.doStart(context, out);
                    _jettag_c_get_262_70.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("($row[\"");  //$NON-NLS-1$        
                    out.setTag("get",18683,18748);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_262_141 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_262_141); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_262_141.setRuntimeParent(_jettag_c_iterate_261_5);
                    _jettag_c_get_262_141.setTagInfo(_td_c_get_262_141);
                    _jettag_c_get_262_141.doStart(context, out);
                    _jettag_c_get_262_141.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",18749,18807);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_262_207 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_262_207); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_262_207.setRuntimeParent(_jettag_c_iterate_261_5);
                    _jettag_c_get_262_207.setTagInfo(_td_c_get_262_207);
                    _jettag_c_get_262_207.doStart(context, out);
                    _jettag_c_get_262_207.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\"]);");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_261_5.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_261_5.doEnd();
                out.loopEnd();
                out.endTag("iterate",268);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",18834,18873);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_264_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_264_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_264_6.setRuntimeParent(_jettag_c_if_258_5);
                _jettag_c_get_264_6.setTagInfo(_td_c_get_264_6);
                _jettag_c_get_264_6.doStart(context, out);
                _jettag_c_get_264_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->set");  //$NON-NLS-1$        
                out.setTag("get",18878,18924);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_264_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_264_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_264_50.setRuntimeParent(_jettag_c_if_258_5);
                _jettag_c_get_264_50.setTagInfo(_td_c_get_264_50);
                _jettag_c_get_264_50.doStart(context, out);
                _jettag_c_get_264_50.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",18926,18984);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_264_98 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_264_98); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_264_98.setRuntimeParent(_jettag_c_if_258_5);
                _jettag_c_get_264_98.setTagInfo(_td_c_get_264_98);
                _jettag_c_get_264_98.doStart(context, out);
                _jettag_c_get_264_98.doEnd();
                out.setTag(null,-1,-1);
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_258_5.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_258_5.doEnd();
            out.endTag("if",840);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(64);
            out.setTag("if",18997,19061);
            RuntimeTagElement _jettag_c_if_265_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_265_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_265_11.setRuntimeParent(_jettag_c_iterate_257_4);
            _jettag_c_if_265_11.setTagInfo(_td_c_if_265_11);
            _jettag_c_if_265_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_265_11.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",19067,19106);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_266_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_266_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_266_6.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_266_6.setTagInfo(_td_c_get_266_6);
                _jettag_c_get_266_6.doStart(context, out);
                _jettag_c_get_266_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->set");  //$NON-NLS-1$        
                out.setTag("get",19111,19157);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_266_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_266_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_266_50.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_266_50.setTagInfo(_td_c_get_266_50);
                _jettag_c_get_266_50.doStart(context, out);
                _jettag_c_get_266_50.doEnd();
                out.setTag(null,-1,-1);
                out.write("($row[\"");  //$NON-NLS-1$        
                out.setTag("get",19164,19210);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_266_103 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_266_103); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_266_103.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_266_103.setTagInfo(_td_c_get_266_103);
                _jettag_c_get_266_103.doStart(context, out);
                _jettag_c_get_266_103.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",19211,19251);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_266_150 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_266_150); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_266_150.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_266_150.setTagInfo(_td_c_get_266_150);
                _jettag_c_get_266_150.doStart(context, out);
                _jettag_c_get_266_150.doEnd();
                out.setTag(null,-1,-1);
                out.write("\"]);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_265_11.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_265_11.doEnd();
            out.endTag("if",198);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(124);
            out.setTag("if",19266,19390);
            RuntimeTagElement _jettag_c_if_267_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_267_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_267_11.setRuntimeParent(_jettag_c_iterate_257_4);
            _jettag_c_if_267_11.setTagInfo(_td_c_if_267_11);
            _jettag_c_if_267_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_267_11.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$query_");  //$NON-NLS-1$        
                out.setTag("get",19402,19442);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_268_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_268_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_268_12.setRuntimeParent(_jettag_c_if_267_11);
                _jettag_c_get_268_12.setTagInfo(_td_c_get_268_12);
                _jettag_c_get_268_12.doStart(context, out);
                _jettag_c_get_268_12.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = pg_query(\"SELECT");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",19468,19533);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_269_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_269_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_269_7.setRuntimeParent(_jettag_c_if_267_11);
                _jettag_c_get_269_7.setTagInfo(_td_c_get_269_7);
                _jettag_c_get_269_7.doStart(context, out);
                _jettag_c_get_269_7.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id AS ");  //$NON-NLS-1$        
                out.setTag("get",19540,19605);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_269_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_269_79); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_269_79.setRuntimeParent(_jettag_c_if_267_11);
                _jettag_c_get_269_79.setTagInfo(_td_c_get_269_79);
                _jettag_c_get_269_79.doStart(context, out);
                _jettag_c_get_269_79.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id, ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(108);
                out.setTag("iterate",19610,19718);
                RuntimeTagElement _jettag_c_iterate_269_149 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_269_149); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_269_149.setRuntimeParent(_jettag_c_if_267_11);
                _jettag_c_iterate_269_149.setTagInfo(_td_c_iterate_269_149);
                _jettag_c_iterate_269_149.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_269_149.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_269_149.getTagInfo().getAttribute("delimiter"),19610,19718);
                    out.loopIterate();
                    out.setTag("get",19718,19783);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_270_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_270_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_270_8.setRuntimeParent(_jettag_c_iterate_269_149);
                    _jettag_c_get_270_8.setTagInfo(_td_c_get_270_8);
                    _jettag_c_get_270_8.doStart(context, out);
                    _jettag_c_get_270_8.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",19784,19842);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_270_74 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_270_74); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_270_74.setRuntimeParent(_jettag_c_iterate_269_149);
                    _jettag_c_get_270_74.setTagInfo(_td_c_get_270_74);
                    _jettag_c_get_270_74.doStart(context, out);
                    _jettag_c_get_270_74.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" AS ");  //$NON-NLS-1$        
                    out.setTag("get",19846,19911);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_270_136 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_270_136); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_270_136.setRuntimeParent(_jettag_c_iterate_269_149);
                    _jettag_c_get_270_136.setTagInfo(_td_c_get_270_136);
                    _jettag_c_get_270_136.doStart(context, out);
                    _jettag_c_get_270_136.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",19912,19970);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_270_202 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_270_202); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_270_202.setRuntimeParent(_jettag_c_iterate_269_149);
                    _jettag_c_get_270_202.setTagInfo(_td_c_get_270_202);
                    _jettag_c_get_270_202.doStart(context, out);
                    _jettag_c_get_270_202.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(",");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_269_149.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_269_149.doEnd();
                out.loopEnd();
                out.endTag("iterate",253);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",19990,20036);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_271_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_271_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_271_7.setRuntimeParent(_jettag_c_if_267_11);
                _jettag_c_get_271_7.setTagInfo(_td_c_get_271_7);
                _jettag_c_get_271_7.doStart(context, out);
                _jettag_c_get_271_7.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",20037,20102);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_271_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_271_54); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_271_54.setRuntimeParent(_jettag_c_if_267_11);
                _jettag_c_get_271_54.setTagInfo(_td_c_get_271_54);
                _jettag_c_get_271_54.doStart(context, out);
                _jettag_c_get_271_54.doEnd();
                out.setTag(null,-1,-1);
                out.write(".created_at,");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",20121,20167);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_272_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_272_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_272_7.setRuntimeParent(_jettag_c_if_267_11);
                _jettag_c_get_272_7.setTagInfo(_td_c_get_272_7);
                _jettag_c_get_272_7.doStart(context, out);
                _jettag_c_get_272_7.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",20168,20233);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_272_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_272_54); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_272_54.setRuntimeParent(_jettag_c_if_267_11);
                _jettag_c_get_272_54.setTagInfo(_td_c_get_272_54);
                _jettag_c_get_272_54.doStart(context, out);
                _jettag_c_get_272_54.doEnd();
                out.setTag(null,-1,-1);
                out.write(".update_at");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tFROM ");  //$NON-NLS-1$        
                out.setTag("get",20254,20300);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_273_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_273_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_273_11.setRuntimeParent(_jettag_c_if_267_11);
                _jettag_c_get_273_11.setTagInfo(_td_c_get_273_11);
                _jettag_c_get_273_11.doStart(context, out);
                _jettag_c_get_273_11.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",20301,20366);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_273_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_273_58); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_273_58.setRuntimeParent(_jettag_c_if_267_11);
                _jettag_c_get_273_58.setTagInfo(_td_c_get_273_58);
                _jettag_c_get_273_58.doStart(context, out);
                _jettag_c_get_273_58.doEnd();
                out.setTag(null,-1,-1);
                out.write(NL);         
                out.write("\t\t\t\t\tINNER JOIN ");  //$NON-NLS-1$        
                out.setTag("get",20383,20448);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_274_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_274_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_274_17.setRuntimeParent(_jettag_c_if_267_11);
                _jettag_c_get_274_17.setTagInfo(_td_c_get_274_17);
                _jettag_c_get_274_17.doStart(context, out);
                _jettag_c_get_274_17.doEnd();
                out.setTag(null,-1,-1);
                out.write(" ON ");  //$NON-NLS-1$        
                out.setTag("get",20452,20517);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_274_86 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_274_86); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_274_86.setRuntimeParent(_jettag_c_if_267_11);
                _jettag_c_get_274_86.setTagInfo(_td_c_get_274_86);
                _jettag_c_get_274_86.doStart(context, out);
                _jettag_c_get_274_86.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id = ");  //$NON-NLS-1$        
                out.setTag("get",20523,20569);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_274_157 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_274_157); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_274_157.setRuntimeParent(_jettag_c_if_267_11);
                _jettag_c_get_274_157.setTagInfo(_td_c_get_274_157);
                _jettag_c_get_274_157.doStart(context, out);
                _jettag_c_get_274_157.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",20570,20635);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_274_204 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_274_204); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_274_204.setRuntimeParent(_jettag_c_if_267_11);
                _jettag_c_get_274_204.setTagInfo(_td_c_get_274_204);
                _jettag_c_get_274_204.doStart(context, out);
                _jettag_c_get_274_204.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",20636,20701);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_274_270 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_274_270); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_274_270.setRuntimeParent(_jettag_c_if_267_11);
                _jettag_c_get_274_270.setTagInfo(_td_c_get_274_270);
                _jettag_c_get_274_270.doStart(context, out);
                _jettag_c_get_274_270.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tWHERE ");  //$NON-NLS-1$        
                out.setTag("get",20717,20763);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_275_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_275_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_275_12.setRuntimeParent(_jettag_c_if_267_11);
                _jettag_c_get_275_12.setTagInfo(_td_c_get_275_12);
                _jettag_c_get_275_12.doStart(context, out);
                _jettag_c_get_275_12.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",20764,20829);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_275_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_275_59); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_275_59.setRuntimeParent(_jettag_c_if_267_11);
                _jettag_c_get_275_59.setTagInfo(_td_c_get_275_59);
                _jettag_c_get_275_59.doStart(context, out);
                _jettag_c_get_275_59.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",20830,20876);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_275_125 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_275_125); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_275_125.setRuntimeParent(_jettag_c_if_267_11);
                _jettag_c_get_275_125.setTagInfo(_td_c_get_275_125);
                _jettag_c_get_275_125.doStart(context, out);
                _jettag_c_get_275_125.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id = \" . $");  //$NON-NLS-1$        
                out.setTag("get",20887,20926);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_275_182 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_275_182); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_275_182.setRuntimeParent(_jettag_c_if_267_11);
                _jettag_c_get_275_182.setTagInfo(_td_c_get_275_182);
                _jettag_c_get_275_182.doStart(context, out);
                _jettag_c_get_275_182.doEnd();
                out.setTag(null,-1,-1);
                out.write("->getId()");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\tif ($query_");  //$NON-NLS-1$        
                out.setTag("get",20963,21003);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_278_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_278_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_278_16.setRuntimeParent(_jettag_c_if_267_11);
                _jettag_c_get_278_16.setTagInfo(_td_c_get_278_16);
                _jettag_c_get_278_16.doStart(context, out);
                _jettag_c_get_278_16.doEnd();
                out.setTag(null,-1,-1);
                out.write(") {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\twhile ($row_");  //$NON-NLS-1$        
                out.setTag("get",21024,21064);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_279_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_279_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_279_18.setRuntimeParent(_jettag_c_if_267_11);
                _jettag_c_get_279_18.setTagInfo(_td_c_get_279_18);
                _jettag_c_get_279_18.doStart(context, out);
                _jettag_c_get_279_18.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = pg_fetch_assoc($query_");  //$NON-NLS-1$        
                out.setTag("get",21089,21129);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_279_83 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_279_83); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_279_83.setRuntimeParent(_jettag_c_if_267_11);
                _jettag_c_get_279_83.setTagInfo(_td_c_get_279_83);
                _jettag_c_get_279_83.doStart(context, out);
                _jettag_c_get_279_83.doEnd();
                out.setTag(null,-1,-1);
                out.write(")) {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",21141,21199);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_280_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_280_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_280_8.setRuntimeParent(_jettag_c_if_267_11);
                _jettag_c_get_280_8.setTagInfo(_td_c_get_280_8);
                _jettag_c_get_280_8.doStart(context, out);
                _jettag_c_get_280_8.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = new ");  //$NON-NLS-1$        
                out.setTag("get",21206,21269);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(63);
                RuntimeTagElement _jettag_c_get_280_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_280_73); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_280_73.setRuntimeParent(_jettag_c_if_267_11);
                _jettag_c_get_280_73.setTagInfo(_td_c_get_280_73);
                _jettag_c_get_280_73.doStart(context, out);
                _jettag_c_get_280_73.doEnd();
                out.setTag(null,-1,-1);
                out.write("();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",21280,21338);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_281_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_281_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_281_8.setRuntimeParent(_jettag_c_if_267_11);
                _jettag_c_get_281_8.setTagInfo(_td_c_get_281_8);
                _jettag_c_get_281_8.doStart(context, out);
                _jettag_c_get_281_8.doEnd();
                out.setTag(null,-1,-1);
                out.write("->setId($row_");  //$NON-NLS-1$        
                out.setTag("get",21351,21391);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_281_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_281_79); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_281_79.setRuntimeParent(_jettag_c_if_267_11);
                _jettag_c_get_281_79.setTagInfo(_td_c_get_281_79);
                _jettag_c_get_281_79.doStart(context, out);
                _jettag_c_get_281_79.doEnd();
                out.setTag(null,-1,-1);
                out.write("[\"");  //$NON-NLS-1$        
                out.setTag("get",21393,21458);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_281_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_281_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_281_121.setRuntimeParent(_jettag_c_if_267_11);
                _jettag_c_get_281_121.setTagInfo(_td_c_get_281_121);
                _jettag_c_get_281_121.doStart(context, out);
                _jettag_c_get_281_121.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id\"]);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(108);
                out.setTag("iterate",21472,21580);
                RuntimeTagElement _jettag_c_iterate_282_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_282_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_282_7.setRuntimeParent(_jettag_c_if_267_11);
                _jettag_c_iterate_282_7.setTagInfo(_td_c_iterate_282_7);
                _jettag_c_iterate_282_7.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_282_7.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_282_7.getTagInfo().getAttribute("delimiter"),21472,21580);
                    out.loopIterate();
                    out.write("$");  //$NON-NLS-1$        
                    out.setTag("get",21581,21639);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_283_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_283_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_283_9.setRuntimeParent(_jettag_c_iterate_282_7);
                    _jettag_c_get_283_9.setTagInfo(_td_c_get_283_9);
                    _jettag_c_get_283_9.doStart(context, out);
                    _jettag_c_get_283_9.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->set");  //$NON-NLS-1$        
                    out.setTag("get",21644,21708);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(64);
                    RuntimeTagElement _jettag_c_get_283_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_283_72); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_283_72.setRuntimeParent(_jettag_c_iterate_282_7);
                    _jettag_c_get_283_72.setTagInfo(_td_c_get_283_72);
                    _jettag_c_get_283_72.doStart(context, out);
                    _jettag_c_get_283_72.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("($row_");  //$NON-NLS-1$        
                    out.setTag("get",21714,21754);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_283_142 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_283_142); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_283_142.setRuntimeParent(_jettag_c_iterate_282_7);
                    _jettag_c_get_283_142.setTagInfo(_td_c_get_283_142);
                    _jettag_c_get_283_142.doStart(context, out);
                    _jettag_c_get_283_142.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("[\"");  //$NON-NLS-1$        
                    out.setTag("get",21756,21821);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_283_184 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_283_184); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_283_184.setRuntimeParent(_jettag_c_iterate_282_7);
                    _jettag_c_get_283_184.setTagInfo(_td_c_get_283_184);
                    _jettag_c_get_283_184.doStart(context, out);
                    _jettag_c_get_283_184.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",21822,21880);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_283_250 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_283_250); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_283_250.setRuntimeParent(_jettag_c_iterate_282_7);
                    _jettag_c_get_283_250.setTagInfo(_td_c_get_283_250);
                    _jettag_c_get_283_250.doStart(context, out);
                    _jettag_c_get_283_250.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\"]);");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_282_7.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_282_7.doEnd();
                out.loopEnd();
                out.endTag("iterate",311);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",21911,21950);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_285_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_285_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_285_8.setRuntimeParent(_jettag_c_if_267_11);
                _jettag_c_get_285_8.setTagInfo(_td_c_get_285_8);
                _jettag_c_get_285_8.doStart(context, out);
                _jettag_c_get_285_8.doEnd();
                out.setTag(null,-1,-1);
                out.write("->add");  //$NON-NLS-1$        
                out.setTag("get",21955,22001);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_285_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_285_52); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_285_52.setRuntimeParent(_jettag_c_if_267_11);
                _jettag_c_get_285_52.setTagInfo(_td_c_get_285_52);
                _jettag_c_get_285_52.doStart(context, out);
                _jettag_c_get_285_52.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",22003,22061);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_285_100 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_285_100); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_285_100.setRuntimeParent(_jettag_c_if_267_11);
                _jettag_c_get_285_100.setTagInfo(_td_c_get_285_100);
                _jettag_c_get_285_100.doStart(context, out);
                _jettag_c_get_285_100.doEnd();
                out.setTag(null,-1,-1);
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_267_11.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_267_11.doEnd();
            out.endTag("if",2690);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_257_4.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_257_4.doEnd();
        out.loopEnd();
        out.endTag("iterate",4062);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\t\t$result[] = $");  //$NON-NLS-1$        
        out.setTag("get",22117,22156);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_289_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_289_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_289_18.setRuntimeParent(null);
        _jettag_c_get_289_18.setTagInfo(_td_c_get_289_18);
        _jettag_c_get_289_18.doStart(context, out);
        _jettag_c_get_289_18.doEnd();
        out.setTag(null,-1,-1);
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\treturn $result;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("?>");  //$NON-NLS-1$        
        out.popTemplateFile();
    }
}
