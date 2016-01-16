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
    private static final TagInfo _td_c_get_70_7 = new TagInfo("c:get", //$NON-NLS-1$
            70, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_70_56 = new TagInfo("c:get", //$NON-NLS-1$
            70, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_70_100 = new TagInfo("c:get", //$NON-NLS-1$
            70, 100,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_20 = new TagInfo("c:get", //$NON-NLS-1$
            71, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_76_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            76, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_77_4 = new TagInfo("c:if", //$NON-NLS-1$
            77, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and (($currentFeature/@min > 1) or ($currentFeature/@max > 1))", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_78_35 = new TagInfo("c:get", //$NON-NLS-1$
            78, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_78_82 = new TagInfo("c:get", //$NON-NLS-1$
            78, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_10 = new TagInfo("c:get", //$NON-NLS-1$
            79, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_67 = new TagInfo("c:get", //$NON-NLS-1$
            79, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_13 = new TagInfo("c:get", //$NON-NLS-1$
            84, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_57 = new TagInfo("c:get", //$NON-NLS-1$
            84, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_113 = new TagInfo("c:get", //$NON-NLS-1$
            84, 113,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_85_35 = new TagInfo("c:get", //$NON-NLS-1$
            85, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_85_82 = new TagInfo("c:get", //$NON-NLS-1$
            85, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_6 = new TagInfo("c:get", //$NON-NLS-1$
            86, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_87_6 = new TagInfo("c:get", //$NON-NLS-1$
            87, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_91_11 = new TagInfo("c:get", //$NON-NLS-1$
            91, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_92_14 = new TagInfo("c:get", //$NON-NLS-1$
            92, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_104_27 = new TagInfo("c:get", //$NON-NLS-1$
            104, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_107_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            107, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_108_4 = new TagInfo("c:if", //$NON-NLS-1$
            108, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and (($currentFeature/@min > 1) or ($currentFeature/@max > 1))", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_109_35 = new TagInfo("c:get", //$NON-NLS-1$
            109, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_109_82 = new TagInfo("c:get", //$NON-NLS-1$
            109, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_110_10 = new TagInfo("c:get", //$NON-NLS-1$
            110, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_110_67 = new TagInfo("c:get", //$NON-NLS-1$
            110, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_115_34 = new TagInfo("c:get", //$NON-NLS-1$
            115, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_115_97 = new TagInfo("c:get", //$NON-NLS-1$
            115, 97,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_127_5 = new TagInfo("c:get", //$NON-NLS-1$
            127, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_127_58 = new TagInfo("c:get", //$NON-NLS-1$
            127, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_128_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            128, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_129_6 = new TagInfo("c:if", //$NON-NLS-1$
            129, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and ($currentFeature/@min <= 1) and ($currentFeature/@max <= 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_130_6 = new TagInfo("c:get", //$NON-NLS-1$
            130, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_130_78 = new TagInfo("c:get", //$NON-NLS-1$
            130, 78,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_130_148 = new TagInfo("c:iterate", //$NON-NLS-1$
            130, 148,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_131_7 = new TagInfo("c:get", //$NON-NLS-1$
            131, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_131_73 = new TagInfo("c:get", //$NON-NLS-1$
            131, 73,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_131_135 = new TagInfo("c:get", //$NON-NLS-1$
            131, 135,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_131_201 = new TagInfo("c:get", //$NON-NLS-1$
            131, 201,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_132_12 = new TagInfo("c:if", //$NON-NLS-1$
            132, 12,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_133_6 = new TagInfo("c:get", //$NON-NLS-1$
            133, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_133_53 = new TagInfo("c:get", //$NON-NLS-1$
            133, 53,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_133_97 = new TagInfo("c:get", //$NON-NLS-1$
            133, 97,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_133_144 = new TagInfo("c:get", //$NON-NLS-1$
            133, 144,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_134_5 = new TagInfo("c:get", //$NON-NLS-1$
            134, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_135_5 = new TagInfo("c:get", //$NON-NLS-1$
            135, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_136_9 = new TagInfo("c:get", //$NON-NLS-1$
            136, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_137_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            137, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_137_68 = new TagInfo("c:if", //$NON-NLS-1$
            137, 68,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and ($currentFeature/@min <= 1) and ($currentFeature/@max <= 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_138_16 = new TagInfo("c:get", //$NON-NLS-1$
            138, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_138_85 = new TagInfo("c:get", //$NON-NLS-1$
            138, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_138_156 = new TagInfo("c:get", //$NON-NLS-1$
            138, 156,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_138_203 = new TagInfo("c:get", //$NON-NLS-1$
            138, 203,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_139_13 = new TagInfo("c:get", //$NON-NLS-1$
            139, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_144_6 = new TagInfo("c:get", //$NON-NLS-1$
            144, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_144_52 = new TagInfo("c:get", //$NON-NLS-1$
            144, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_146_6 = new TagInfo("c:get", //$NON-NLS-1$
            146, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_146_59 = new TagInfo("c:get", //$NON-NLS-1$
            146, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_147_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            147, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_148_5 = new TagInfo("c:if", //$NON-NLS-1$
            148, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and ($currentFeature/@min <= 1) and ($currentFeature/@max <= 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_149_6 = new TagInfo("c:get", //$NON-NLS-1$
            149, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_149_71 = new TagInfo("c:get", //$NON-NLS-1$
            149, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_150_6 = new TagInfo("c:get", //$NON-NLS-1$
            150, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_150_78 = new TagInfo("c:get", //$NON-NLS-1$
            150, 78,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_151_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            151, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_152_7 = new TagInfo("c:get", //$NON-NLS-1$
            152, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_152_70 = new TagInfo("c:get", //$NON-NLS-1$
            152, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_152_141 = new TagInfo("c:get", //$NON-NLS-1$
            152, 141,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_152_207 = new TagInfo("c:get", //$NON-NLS-1$
            152, 207,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_154_6 = new TagInfo("c:get", //$NON-NLS-1$
            154, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_154_50 = new TagInfo("c:get", //$NON-NLS-1$
            154, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_154_98 = new TagInfo("c:get", //$NON-NLS-1$
            154, 98,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_155_11 = new TagInfo("c:if", //$NON-NLS-1$
            155, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
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
    private static final TagInfo _td_c_get_156_103 = new TagInfo("c:get", //$NON-NLS-1$
            156, 103,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_156_150 = new TagInfo("c:get", //$NON-NLS-1$
            156, 150,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_157_11 = new TagInfo("c:if", //$NON-NLS-1$
            157, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and (($currentFeature/@min > 1) or ($currentFeature/@max > 1))", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_158_12 = new TagInfo("c:get", //$NON-NLS-1$
            158, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_7 = new TagInfo("c:get", //$NON-NLS-1$
            159, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_79 = new TagInfo("c:get", //$NON-NLS-1$
            159, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_159_149 = new TagInfo("c:iterate", //$NON-NLS-1$
            159, 149,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_160_8 = new TagInfo("c:get", //$NON-NLS-1$
            160, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_160_74 = new TagInfo("c:get", //$NON-NLS-1$
            160, 74,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_160_136 = new TagInfo("c:get", //$NON-NLS-1$
            160, 136,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_160_202 = new TagInfo("c:get", //$NON-NLS-1$
            160, 202,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_161_7 = new TagInfo("c:get", //$NON-NLS-1$
            161, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_161_54 = new TagInfo("c:get", //$NON-NLS-1$
            161, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_162_7 = new TagInfo("c:get", //$NON-NLS-1$
            162, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_162_54 = new TagInfo("c:get", //$NON-NLS-1$
            162, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_163_11 = new TagInfo("c:get", //$NON-NLS-1$
            163, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_163_58 = new TagInfo("c:get", //$NON-NLS-1$
            163, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_164_17 = new TagInfo("c:get", //$NON-NLS-1$
            164, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_164_86 = new TagInfo("c:get", //$NON-NLS-1$
            164, 86,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_164_157 = new TagInfo("c:get", //$NON-NLS-1$
            164, 157,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_164_204 = new TagInfo("c:get", //$NON-NLS-1$
            164, 204,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_164_270 = new TagInfo("c:get", //$NON-NLS-1$
            164, 270,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_165_12 = new TagInfo("c:get", //$NON-NLS-1$
            165, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_165_59 = new TagInfo("c:get", //$NON-NLS-1$
            165, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_165_125 = new TagInfo("c:get", //$NON-NLS-1$
            165, 125,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_165_182 = new TagInfo("c:get", //$NON-NLS-1$
            165, 182,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_168_16 = new TagInfo("c:get", //$NON-NLS-1$
            168, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_169_18 = new TagInfo("c:get", //$NON-NLS-1$
            169, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_169_83 = new TagInfo("c:get", //$NON-NLS-1$
            169, 83,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_170_8 = new TagInfo("c:get", //$NON-NLS-1$
            170, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_170_73 = new TagInfo("c:get", //$NON-NLS-1$
            170, 73,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_171_8 = new TagInfo("c:get", //$NON-NLS-1$
            171, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_171_79 = new TagInfo("c:get", //$NON-NLS-1$
            171, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_171_121 = new TagInfo("c:get", //$NON-NLS-1$
            171, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_172_7 = new TagInfo("c:iterate", //$NON-NLS-1$
            172, 7,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_173_9 = new TagInfo("c:get", //$NON-NLS-1$
            173, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_173_72 = new TagInfo("c:get", //$NON-NLS-1$
            173, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_173_142 = new TagInfo("c:get", //$NON-NLS-1$
            173, 142,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_173_184 = new TagInfo("c:get", //$NON-NLS-1$
            173, 184,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_173_250 = new TagInfo("c:get", //$NON-NLS-1$
            173, 250,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_175_8 = new TagInfo("c:get", //$NON-NLS-1$
            175, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_175_52 = new TagInfo("c:get", //$NON-NLS-1$
            175, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_175_100 = new TagInfo("c:get", //$NON-NLS-1$
            175, 100,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_179_18 = new TagInfo("c:get", //$NON-NLS-1$
            179, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_186_23 = new TagInfo("c:get", //$NON-NLS-1$
            186, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_192_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            192, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_193_7 = new TagInfo("c:if", //$NON-NLS-1$
            193, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_194_15 = new TagInfo("c:get", //$NON-NLS-1$
            194, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_194_59 = new TagInfo("c:get", //$NON-NLS-1$
            194, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_194_119 = new TagInfo("c:get", //$NON-NLS-1$
            194, 119,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_194_163 = new TagInfo("c:get", //$NON-NLS-1$
            194, 163,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_195_19 = new TagInfo("c:get", //$NON-NLS-1$
            195, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_195_63 = new TagInfo("c:get", //$NON-NLS-1$
            195, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_195_117 = new TagInfo("c:get", //$NON-NLS-1$
            195, 117,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_195_161 = new TagInfo("c:get", //$NON-NLS-1$
            195, 161,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_196_10 = new TagInfo("c:if", //$NON-NLS-1$
            196, 10,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_197_13 = new TagInfo("c:get", //$NON-NLS-1$
            197, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_197_57 = new TagInfo("c:get", //$NON-NLS-1$
            197, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_204_4 = new TagInfo("c:if", //$NON-NLS-1$
            204, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_205_20 = new TagInfo("c:get", //$NON-NLS-1$
            205, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_205_64 = new TagInfo("c:get", //$NON-NLS-1$
            205, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_208_16 = new TagInfo("c:get", //$NON-NLS-1$
            208, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_208_60 = new TagInfo("c:get", //$NON-NLS-1$
            208, 60,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_208_113 = new TagInfo("c:get", //$NON-NLS-1$
            208, 113,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_213_7 = new TagInfo("c:if", //$NON-NLS-1$
            213, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/@min <= 1) and ($currentFeature/@max <= 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_214_19 = new TagInfo("c:get", //$NON-NLS-1$
            214, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_214_66 = new TagInfo("c:get", //$NON-NLS-1$
            214, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_214_114 = new TagInfo("c:get", //$NON-NLS-1$
            214, 114,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_215_14 = new TagInfo("c:if", //$NON-NLS-1$
            215, 14,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/@min > 1) or ($currentFeature/@max > 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_218_13 = new TagInfo("c:get", //$NON-NLS-1$
            218, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_218_60 = new TagInfo("c:get", //$NON-NLS-1$
            218, 60,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_220_9 = new TagInfo("c:get", //$NON-NLS-1$
            220, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_220_56 = new TagInfo("c:get", //$NON-NLS-1$
            220, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_220_122 = new TagInfo("c:get", //$NON-NLS-1$
            220, 122,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_220_174 = new TagInfo("c:get", //$NON-NLS-1$
            220, 174,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_221_13 = new TagInfo("c:get", //$NON-NLS-1$
            221, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_221_60 = new TagInfo("c:get", //$NON-NLS-1$
            221, 60,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_221_126 = new TagInfo("c:get", //$NON-NLS-1$
            221, 126,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_221_202 = new TagInfo("c:get", //$NON-NLS-1$
            221, 202,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_228_17 = new TagInfo("c:get", //$NON-NLS-1$
            228, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_228_64 = new TagInfo("c:get", //$NON-NLS-1$
            228, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_228_112 = new TagInfo("c:get", //$NON-NLS-1$
            228, 112,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_228_156 = new TagInfo("c:get", //$NON-NLS-1$
            228, 156,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_230_11 = new TagInfo("c:if", //$NON-NLS-1$
            230, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_231_17 = new TagInfo("c:get", //$NON-NLS-1$
            231, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_231_64 = new TagInfo("c:get", //$NON-NLS-1$
            231, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_231_113 = new TagInfo("c:get", //$NON-NLS-1$
            231, 113,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_231_157 = new TagInfo("c:get", //$NON-NLS-1$
            231, 157,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_236_5 = new TagInfo("c:get", //$NON-NLS-1$
            236, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_236_58 = new TagInfo("c:get", //$NON-NLS-1$
            236, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_237_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            237, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_238_6 = new TagInfo("c:if", //$NON-NLS-1$
            238, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and ($currentFeature/@min <= 1) and ($currentFeature/@max <= 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_239_6 = new TagInfo("c:get", //$NON-NLS-1$
            239, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_239_78 = new TagInfo("c:get", //$NON-NLS-1$
            239, 78,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_239_148 = new TagInfo("c:iterate", //$NON-NLS-1$
            239, 148,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_240_7 = new TagInfo("c:get", //$NON-NLS-1$
            240, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_240_73 = new TagInfo("c:get", //$NON-NLS-1$
            240, 73,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_240_135 = new TagInfo("c:get", //$NON-NLS-1$
            240, 135,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_240_201 = new TagInfo("c:get", //$NON-NLS-1$
            240, 201,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_241_12 = new TagInfo("c:if", //$NON-NLS-1$
            241, 12,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_242_6 = new TagInfo("c:get", //$NON-NLS-1$
            242, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_242_53 = new TagInfo("c:get", //$NON-NLS-1$
            242, 53,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_242_97 = new TagInfo("c:get", //$NON-NLS-1$
            242, 97,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_242_144 = new TagInfo("c:get", //$NON-NLS-1$
            242, 144,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_243_5 = new TagInfo("c:get", //$NON-NLS-1$
            243, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_244_5 = new TagInfo("c:get", //$NON-NLS-1$
            244, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_245_9 = new TagInfo("c:get", //$NON-NLS-1$
            245, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_246_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            246, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_246_68 = new TagInfo("c:if", //$NON-NLS-1$
            246, 68,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and ($currentFeature/@min <= 1) and ($currentFeature/@max <= 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_247_16 = new TagInfo("c:get", //$NON-NLS-1$
            247, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_247_85 = new TagInfo("c:get", //$NON-NLS-1$
            247, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_247_156 = new TagInfo("c:get", //$NON-NLS-1$
            247, 156,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_247_203 = new TagInfo("c:get", //$NON-NLS-1$
            247, 203,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_248_26 = new TagInfo("c:get", //$NON-NLS-1$
            248, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_252_6 = new TagInfo("c:get", //$NON-NLS-1$
            252, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_252_52 = new TagInfo("c:get", //$NON-NLS-1$
            252, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_254_6 = new TagInfo("c:get", //$NON-NLS-1$
            254, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_254_59 = new TagInfo("c:get", //$NON-NLS-1$
            254, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_255_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            255, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_256_5 = new TagInfo("c:if", //$NON-NLS-1$
            256, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and ($currentFeature/@min <= 1) and ($currentFeature/@max <= 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_257_6 = new TagInfo("c:get", //$NON-NLS-1$
            257, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_257_71 = new TagInfo("c:get", //$NON-NLS-1$
            257, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_258_6 = new TagInfo("c:get", //$NON-NLS-1$
            258, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_258_78 = new TagInfo("c:get", //$NON-NLS-1$
            258, 78,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_259_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            259, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_260_7 = new TagInfo("c:get", //$NON-NLS-1$
            260, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_260_70 = new TagInfo("c:get", //$NON-NLS-1$
            260, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_260_141 = new TagInfo("c:get", //$NON-NLS-1$
            260, 141,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_260_207 = new TagInfo("c:get", //$NON-NLS-1$
            260, 207,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_262_6 = new TagInfo("c:get", //$NON-NLS-1$
            262, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_262_50 = new TagInfo("c:get", //$NON-NLS-1$
            262, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_262_98 = new TagInfo("c:get", //$NON-NLS-1$
            262, 98,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_263_11 = new TagInfo("c:if", //$NON-NLS-1$
            263, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
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
    private static final TagInfo _td_c_get_264_103 = new TagInfo("c:get", //$NON-NLS-1$
            264, 103,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_264_150 = new TagInfo("c:get", //$NON-NLS-1$
            264, 150,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_265_11 = new TagInfo("c:if", //$NON-NLS-1$
            265, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and (($currentFeature/@min > 1) or ($currentFeature/@max > 1))", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_266_12 = new TagInfo("c:get", //$NON-NLS-1$
            266, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_267_7 = new TagInfo("c:get", //$NON-NLS-1$
            267, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_267_79 = new TagInfo("c:get", //$NON-NLS-1$
            267, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_267_149 = new TagInfo("c:iterate", //$NON-NLS-1$
            267, 149,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_268_8 = new TagInfo("c:get", //$NON-NLS-1$
            268, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_268_74 = new TagInfo("c:get", //$NON-NLS-1$
            268, 74,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_268_136 = new TagInfo("c:get", //$NON-NLS-1$
            268, 136,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_268_202 = new TagInfo("c:get", //$NON-NLS-1$
            268, 202,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_269_7 = new TagInfo("c:get", //$NON-NLS-1$
            269, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_269_54 = new TagInfo("c:get", //$NON-NLS-1$
            269, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_270_7 = new TagInfo("c:get", //$NON-NLS-1$
            270, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_270_54 = new TagInfo("c:get", //$NON-NLS-1$
            270, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_271_11 = new TagInfo("c:get", //$NON-NLS-1$
            271, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_271_58 = new TagInfo("c:get", //$NON-NLS-1$
            271, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_272_17 = new TagInfo("c:get", //$NON-NLS-1$
            272, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_272_86 = new TagInfo("c:get", //$NON-NLS-1$
            272, 86,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_272_157 = new TagInfo("c:get", //$NON-NLS-1$
            272, 157,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_272_204 = new TagInfo("c:get", //$NON-NLS-1$
            272, 204,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_272_270 = new TagInfo("c:get", //$NON-NLS-1$
            272, 270,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_273_12 = new TagInfo("c:get", //$NON-NLS-1$
            273, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_273_59 = new TagInfo("c:get", //$NON-NLS-1$
            273, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_273_125 = new TagInfo("c:get", //$NON-NLS-1$
            273, 125,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_273_182 = new TagInfo("c:get", //$NON-NLS-1$
            273, 182,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_276_16 = new TagInfo("c:get", //$NON-NLS-1$
            276, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_277_18 = new TagInfo("c:get", //$NON-NLS-1$
            277, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_277_83 = new TagInfo("c:get", //$NON-NLS-1$
            277, 83,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_278_8 = new TagInfo("c:get", //$NON-NLS-1$
            278, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_278_73 = new TagInfo("c:get", //$NON-NLS-1$
            278, 73,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_279_8 = new TagInfo("c:get", //$NON-NLS-1$
            279, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_279_79 = new TagInfo("c:get", //$NON-NLS-1$
            279, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_279_121 = new TagInfo("c:get", //$NON-NLS-1$
            279, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_280_7 = new TagInfo("c:iterate", //$NON-NLS-1$
            280, 7,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_281_9 = new TagInfo("c:get", //$NON-NLS-1$
            281, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_281_72 = new TagInfo("c:get", //$NON-NLS-1$
            281, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_281_142 = new TagInfo("c:get", //$NON-NLS-1$
            281, 142,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_281_184 = new TagInfo("c:get", //$NON-NLS-1$
            281, 184,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_281_250 = new TagInfo("c:get", //$NON-NLS-1$
            281, 250,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_283_8 = new TagInfo("c:get", //$NON-NLS-1$
            283, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_283_52 = new TagInfo("c:get", //$NON-NLS-1$
            283, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_283_100 = new TagInfo("c:get", //$NON-NLS-1$
            283, 100,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_287_18 = new TagInfo("c:get", //$NON-NLS-1$
            287, 18,
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
                out.setTag("get",3680,3720);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_70_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_70_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_70_7.setRuntimeParent(_jettag_c_if_69_12);
                _jettag_c_get_70_7.setTagInfo(_td_c_get_70_7);
                _jettag_c_get_70_7.doStart(context, out);
                _jettag_c_get_70_7.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = '\" . $");  //$NON-NLS-1$        
                out.setTag("get",3729,3768);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_70_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_70_56); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_70_56.setRuntimeParent(_jettag_c_if_69_12);
                _jettag_c_get_70_56.setTagInfo(_td_c_get_70_56);
                _jettag_c_get_70_56.doStart(context, out);
                _jettag_c_get_70_56.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",3773,3819);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_70_100 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_70_100); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_70_100.setRuntimeParent(_jettag_c_if_69_12);
                _jettag_c_get_70_100.setTagInfo(_td_c_get_70_100);
                _jettag_c_get_70_100.doStart(context, out);
                _jettag_c_get_70_100.doEnd();
                out.setTag(null,-1,-1);
                out.write("() . \"',");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_69_12.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_69_12.doEnd();
            out.endTag("if",147);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_66_79.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_66_79.doEnd();
        out.loopEnd();
        out.endTag("iterate",526);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write("update_at = now()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tWHERE id = \" . $");  //$NON-NLS-1$        
        out.setTag("get",3883,3922);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_71_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_20); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_71_20.setRuntimeParent(null);
        _jettag_c_get_71_20.setTagInfo(_td_c_get_71_20);
        _jettag_c_get_71_20.doStart(context, out);
        _jettag_c_get_71_20.doEnd();
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
        out.setTag("iterate",3987,4054);
        RuntimeTagElement _jettag_c_iterate_76_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_76_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_76_3.setRuntimeParent(null);
        _jettag_c_iterate_76_3.setTagInfo(_td_c_iterate_76_3);
        _jettag_c_iterate_76_3.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_76_3.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_76_3.getTagInfo().getAttribute("delimiter"),3987,4054);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(127);
            out.setTag("if",4054,4181);
            RuntimeTagElement _jettag_c_if_77_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_77_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_77_4.setRuntimeParent(_jettag_c_iterate_76_3);
            _jettag_c_if_77_4.setTagInfo(_td_c_if_77_4);
            _jettag_c_if_77_4.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_77_4.okToProcessBody()) {
                out.write("$query = pg_query(\"DELETE FROM ");  //$NON-NLS-1$        
                out.setTag("get",4212,4258);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_78_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_78_35); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_78_35.setRuntimeParent(_jettag_c_if_77_4);
                _jettag_c_get_78_35.setTagInfo(_td_c_get_78_35);
                _jettag_c_get_78_35.doStart(context, out);
                _jettag_c_get_78_35.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",4259,4324);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_78_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_78_82); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_78_82.setRuntimeParent(_jettag_c_if_77_4);
                _jettag_c_get_78_82.setTagInfo(_td_c_get_78_82);
                _jettag_c_get_78_82.doStart(context, out);
                _jettag_c_get_78_82.doEnd();
                out.setTag(null,-1,-1);
                out.write(NL);         
                out.write("\t\t\tWHERE ");  //$NON-NLS-1$        
                out.setTag("get",4334,4380);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_79_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_10); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_79_10.setRuntimeParent(_jettag_c_if_77_4);
                _jettag_c_get_79_10.setTagInfo(_td_c_get_79_10);
                _jettag_c_get_79_10.doStart(context, out);
                _jettag_c_get_79_10.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id = \" . $");  //$NON-NLS-1$        
                out.setTag("get",4391,4430);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_79_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_67); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_79_67.setRuntimeParent(_jettag_c_if_77_4);
                _jettag_c_get_79_67.setTagInfo(_td_c_get_79_67);
                _jettag_c_get_79_67.doStart(context, out);
                _jettag_c_get_79_67.doEnd();
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
                out.setTag("get",4516,4555);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_84_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_84_13.setRuntimeParent(_jettag_c_if_77_4);
                _jettag_c_get_84_13.setTagInfo(_td_c_get_84_13);
                _jettag_c_get_84_13.doStart(context, out);
                _jettag_c_get_84_13.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",4560,4606);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_84_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_57); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_84_57.setRuntimeParent(_jettag_c_if_77_4);
                _jettag_c_get_84_57.setTagInfo(_td_c_get_84_57);
                _jettag_c_get_84_57.doStart(context, out);
                _jettag_c_get_84_57.doEnd();
                out.setTag(null,-1,-1);
                out.write("() as $row");  //$NON-NLS-1$        
                out.setTag("get",4616,4662);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_84_113 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_113); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_84_113.setRuntimeParent(_jettag_c_if_77_4);
                _jettag_c_get_84_113.setTagInfo(_td_c_get_84_113);
                _jettag_c_get_84_113.doStart(context, out);
                _jettag_c_get_84_113.doEnd();
                out.setTag(null,-1,-1);
                out.write(") {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t$query = pg_query(\"INSERT INTO ");  //$NON-NLS-1$        
                out.setTag("get",4700,4746);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_85_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_85_35); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_85_35.setRuntimeParent(_jettag_c_if_77_4);
                _jettag_c_get_85_35.setTagInfo(_td_c_get_85_35);
                _jettag_c_get_85_35.doStart(context, out);
                _jettag_c_get_85_35.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",4747,4812);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_85_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_85_82); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_85_82.setRuntimeParent(_jettag_c_if_77_4);
                _jettag_c_get_85_82.setTagInfo(_td_c_get_85_82);
                _jettag_c_get_85_82.doStart(context, out);
                _jettag_c_get_85_82.doEnd();
                out.setTag(null,-1,-1);
                out.write("(");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",4819,4865);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_86_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_86_6.setRuntimeParent(_jettag_c_if_77_4);
                _jettag_c_get_86_6.setTagInfo(_td_c_get_86_6);
                _jettag_c_get_86_6.doStart(context, out);
                _jettag_c_get_86_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id,");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",4875,4940);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_87_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_87_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_87_6.setRuntimeParent(_jettag_c_if_77_4);
                _jettag_c_get_87_6.setTagInfo(_td_c_get_87_6);
                _jettag_c_get_87_6.doStart(context, out);
                _jettag_c_get_87_6.doEnd();
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
                out.setTag("get",5001,5040);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_91_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_91_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_91_11.setRuntimeParent(_jettag_c_if_77_4);
                _jettag_c_get_91_11.setTagInfo(_td_c_get_91_11);
                _jettag_c_get_91_11.doStart(context, out);
                _jettag_c_get_91_11.doEnd();
                out.setTag(null,-1,-1);
                out.write("->getId() . \",");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\" . $row");  //$NON-NLS-1$        
                out.setTag("get",5068,5114);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_92_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_92_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_92_14.setRuntimeParent(_jettag_c_if_77_4);
                _jettag_c_get_92_14.setTagInfo(_td_c_get_92_14);
                _jettag_c_get_92_14.doStart(context, out);
                _jettag_c_get_92_14.doEnd();
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
                _jettag_c_if_77_4.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_77_4.doEnd();
            out.endTag("if",1047);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_76_3.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_76_3.doEnd();
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
        out.setTag("get",5297,5336);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_104_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_104_27); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_104_27.setRuntimeParent(null);
        _jettag_c_get_104_27.setTagInfo(_td_c_get_104_27);
        _jettag_c_get_104_27.doStart(context, out);
        _jettag_c_get_104_27.doEnd();
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
        out.setTag("iterate",5361,5428);
        RuntimeTagElement _jettag_c_iterate_107_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_107_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_107_3.setRuntimeParent(null);
        _jettag_c_iterate_107_3.setTagInfo(_td_c_iterate_107_3);
        _jettag_c_iterate_107_3.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_107_3.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_107_3.getTagInfo().getAttribute("delimiter"),5361,5428);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(127);
            out.setTag("if",5428,5555);
            RuntimeTagElement _jettag_c_if_108_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_108_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_108_4.setRuntimeParent(_jettag_c_iterate_107_3);
            _jettag_c_if_108_4.setTagInfo(_td_c_if_108_4);
            _jettag_c_if_108_4.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_108_4.okToProcessBody()) {
                out.write("$query = pg_query(\"DELETE FROM ");  //$NON-NLS-1$        
                out.setTag("get",5586,5632);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_109_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_109_35); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_109_35.setRuntimeParent(_jettag_c_if_108_4);
                _jettag_c_get_109_35.setTagInfo(_td_c_get_109_35);
                _jettag_c_get_109_35.doStart(context, out);
                _jettag_c_get_109_35.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",5633,5698);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_109_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_109_82); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_109_82.setRuntimeParent(_jettag_c_if_108_4);
                _jettag_c_get_109_82.setTagInfo(_td_c_get_109_82);
                _jettag_c_get_109_82.doStart(context, out);
                _jettag_c_get_109_82.doEnd();
                out.setTag(null,-1,-1);
                out.write(NL);         
                out.write("\t\t\tWHERE ");  //$NON-NLS-1$        
                out.setTag("get",5708,5754);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_110_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_110_10); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_110_10.setRuntimeParent(_jettag_c_if_108_4);
                _jettag_c_get_110_10.setTagInfo(_td_c_get_110_10);
                _jettag_c_get_110_10.doStart(context, out);
                _jettag_c_get_110_10.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id = \" . $");  //$NON-NLS-1$        
                out.setTag("get",5765,5804);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_110_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_110_67); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_110_67.setRuntimeParent(_jettag_c_if_108_4);
                _jettag_c_get_110_67.setTagInfo(_td_c_get_110_67);
                _jettag_c_get_110_67.doStart(context, out);
                _jettag_c_get_110_67.doEnd();
                out.setTag(null,-1,-1);
                out.write("->getId()");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t$result = $result && (pg_affected_rows($query) > 0);");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_108_4.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_108_4.doEnd();
            out.endTag("if",321);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_107_3.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_107_3.doEnd();
        out.loopEnd();
        out.endTag("iterate",455);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t$query = pg_query(\"DELETE FROM ");  //$NON-NLS-1$        
        out.setTag("get",5930,5976);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_115_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_115_34); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_115_34.setRuntimeParent(null);
        _jettag_c_get_115_34.setTagInfo(_td_c_get_115_34);
        _jettag_c_get_115_34.doStart(context, out);
        _jettag_c_get_115_34.doEnd();
        out.setTag(null,-1,-1);
        out.write(" WHERE id = \" . $");  //$NON-NLS-1$        
        out.setTag("get",5993,6032);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_115_97 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_115_97); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_115_97.setRuntimeParent(null);
        _jettag_c_get_115_97.setTagInfo(_td_c_get_115_97);
        _jettag_c_get_115_97.doStart(context, out);
        _jettag_c_get_115_97.doEnd();
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
        out.setTag("get",6208,6254);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_127_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_127_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_127_5.setRuntimeParent(null);
        _jettag_c_get_127_5.setTagInfo(_td_c_get_127_5);
        _jettag_c_get_127_5.doStart(context, out);
        _jettag_c_get_127_5.doEnd();
        out.setTag(null,-1,-1);
        out.write(".id AS ");  //$NON-NLS-1$        
        out.setTag("get",6261,6307);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_127_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_127_58); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_127_58.setRuntimeParent(null);
        _jettag_c_get_127_58.setTagInfo(_td_c_get_127_58);
        _jettag_c_get_127_58.doStart(context, out);
        _jettag_c_get_127_58.doEnd();
        out.setTag(null,-1,-1);
        out.write("_id,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(69);
        out.setTag("iterate",6316,6385);
        RuntimeTagElement _jettag_c_iterate_128_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_128_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_128_5.setRuntimeParent(null);
        _jettag_c_iterate_128_5.setTagInfo(_td_c_iterate_128_5);
        _jettag_c_iterate_128_5.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_128_5.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_128_5.getTagInfo().getAttribute("delimiter"),6316,6385);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(125);
            out.setTag("if",6385,6510);
            RuntimeTagElement _jettag_c_if_129_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_129_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_129_6.setRuntimeParent(_jettag_c_iterate_128_5);
            _jettag_c_if_129_6.setTagInfo(_td_c_if_129_6);
            _jettag_c_if_129_6.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_129_6.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",6516,6581);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_130_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_130_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_130_6.setRuntimeParent(_jettag_c_if_129_6);
                _jettag_c_get_130_6.setTagInfo(_td_c_get_130_6);
                _jettag_c_get_130_6.doStart(context, out);
                _jettag_c_get_130_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id AS ");  //$NON-NLS-1$        
                out.setTag("get",6588,6653);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_130_78 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_130_78); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_130_78.setRuntimeParent(_jettag_c_if_129_6);
                _jettag_c_get_130_78.setTagInfo(_td_c_get_130_78);
                _jettag_c_get_130_78.doStart(context, out);
                _jettag_c_get_130_78.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id, ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(107);
                out.setTag("iterate",6658,6765);
                RuntimeTagElement _jettag_c_iterate_130_148 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_130_148); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_130_148.setRuntimeParent(_jettag_c_if_129_6);
                _jettag_c_iterate_130_148.setTagInfo(_td_c_iterate_130_148);
                _jettag_c_iterate_130_148.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_130_148.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_130_148.getTagInfo().getAttribute("delimiter"),6658,6765);
                    out.loopIterate();
                    out.setTag("get",6765,6830);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_131_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_131_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_131_7.setRuntimeParent(_jettag_c_iterate_130_148);
                    _jettag_c_get_131_7.setTagInfo(_td_c_get_131_7);
                    _jettag_c_get_131_7.doStart(context, out);
                    _jettag_c_get_131_7.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",6831,6889);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_131_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_131_73); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_131_73.setRuntimeParent(_jettag_c_iterate_130_148);
                    _jettag_c_get_131_73.setTagInfo(_td_c_get_131_73);
                    _jettag_c_get_131_73.doStart(context, out);
                    _jettag_c_get_131_73.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" AS ");  //$NON-NLS-1$        
                    out.setTag("get",6893,6958);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_131_135 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_131_135); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_131_135.setRuntimeParent(_jettag_c_iterate_130_148);
                    _jettag_c_get_131_135.setTagInfo(_td_c_get_131_135);
                    _jettag_c_get_131_135.doStart(context, out);
                    _jettag_c_get_131_135.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",6959,7017);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_131_201 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_131_201); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_131_201.setRuntimeParent(_jettag_c_iterate_130_148);
                    _jettag_c_get_131_201.setTagInfo(_td_c_get_131_201);
                    _jettag_c_get_131_201.doStart(context, out);
                    _jettag_c_get_131_201.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(",");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_130_148.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_130_148.doEnd();
                out.loopEnd();
                out.endTag("iterate",253);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_129_6.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_129_6.doEnd();
            out.endTag("if",525);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(69);
            out.setTag("if",7042,7111);
            RuntimeTagElement _jettag_c_if_132_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_132_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_132_12.setRuntimeParent(_jettag_c_iterate_128_5);
            _jettag_c_if_132_12.setTagInfo(_td_c_if_132_12);
            _jettag_c_if_132_12.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_132_12.okToProcessBody()) {
                out.setTag("get",7111,7157);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_133_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_133_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_133_6.setRuntimeParent(_jettag_c_if_132_12);
                _jettag_c_get_133_6.setTagInfo(_td_c_get_133_6);
                _jettag_c_get_133_6.doStart(context, out);
                _jettag_c_get_133_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",7158,7198);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_133_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_133_53); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_133_53.setRuntimeParent(_jettag_c_if_132_12);
                _jettag_c_get_133_53.setTagInfo(_td_c_get_133_53);
                _jettag_c_get_133_53.doStart(context, out);
                _jettag_c_get_133_53.doEnd();
                out.setTag(null,-1,-1);
                out.write(" AS ");  //$NON-NLS-1$        
                out.setTag("get",7202,7248);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_133_97 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_133_97); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_133_97.setRuntimeParent(_jettag_c_if_132_12);
                _jettag_c_get_133_97.setTagInfo(_td_c_get_133_97);
                _jettag_c_get_133_97.doStart(context, out);
                _jettag_c_get_133_97.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",7249,7289);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_133_144 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_133_144); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_133_144.setRuntimeParent(_jettag_c_if_132_12);
                _jettag_c_get_133_144.setTagInfo(_td_c_get_133_144);
                _jettag_c_get_133_144.doStart(context, out);
                _jettag_c_get_133_144.doEnd();
                out.setTag(null,-1,-1);
                out.write(",");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_132_12.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_132_12.doEnd();
            out.endTag("if",179);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_128_5.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_128_5.doEnd();
        out.loopEnd();
        out.endTag("iterate",912);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.setTag("get",7314,7360);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_134_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_134_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_134_5.setRuntimeParent(null);
        _jettag_c_get_134_5.setTagInfo(_td_c_get_134_5);
        _jettag_c_get_134_5.doStart(context, out);
        _jettag_c_get_134_5.doEnd();
        out.setTag(null,-1,-1);
        out.write(".created_at as created_at,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.setTag("get",7391,7437);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_135_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_135_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_135_5.setRuntimeParent(null);
        _jettag_c_get_135_5.setTagInfo(_td_c_get_135_5);
        _jettag_c_get_135_5.doStart(context, out);
        _jettag_c_get_135_5.doEnd();
        out.setTag(null,-1,-1);
        out.write(".update_at as update_at");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tFROM ");  //$NON-NLS-1$        
        out.setTag("get",7469,7515);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_136_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_136_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_136_9.setRuntimeParent(null);
        _jettag_c_get_136_9.setTagInfo(_td_c_get_136_9);
        _jettag_c_get_136_9.doStart(context, out);
        _jettag_c_get_136_9.doEnd();
        out.setTag(null,-1,-1);
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(64);
        out.setTag("iterate",7519,7583);
        RuntimeTagElement _jettag_c_iterate_137_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_137_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_137_4.setRuntimeParent(null);
        _jettag_c_iterate_137_4.setTagInfo(_td_c_iterate_137_4);
        _jettag_c_iterate_137_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_137_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_137_4.getTagInfo().getAttribute("delimiter"),7519,7583);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(129);
            out.setTag("if",7583,7712);
            RuntimeTagElement _jettag_c_if_137_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_137_68); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_137_68.setRuntimeParent(_jettag_c_iterate_137_4);
            _jettag_c_if_137_68.setTagInfo(_td_c_if_137_68);
            _jettag_c_if_137_68.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_137_68.okToProcessBody()) {
                out.write("INNER JOIN ");  //$NON-NLS-1$        
                out.setTag("get",7723,7788);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_138_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_138_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_138_16.setRuntimeParent(_jettag_c_if_137_68);
                _jettag_c_get_138_16.setTagInfo(_td_c_get_138_16);
                _jettag_c_get_138_16.doStart(context, out);
                _jettag_c_get_138_16.doEnd();
                out.setTag(null,-1,-1);
                out.write(" ON ");  //$NON-NLS-1$        
                out.setTag("get",7792,7857);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_138_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_138_85); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_138_85.setRuntimeParent(_jettag_c_if_137_68);
                _jettag_c_get_138_85.setTagInfo(_td_c_get_138_85);
                _jettag_c_get_138_85.doStart(context, out);
                _jettag_c_get_138_85.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id = ");  //$NON-NLS-1$        
                out.setTag("get",7863,7909);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_138_156 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_138_156); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_138_156.setRuntimeParent(_jettag_c_if_137_68);
                _jettag_c_get_138_156.setTagInfo(_td_c_get_138_156);
                _jettag_c_get_138_156.doStart(context, out);
                _jettag_c_get_138_156.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",7910,7950);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_138_203 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_138_203); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_138_203.setRuntimeParent(_jettag_c_if_137_68);
                _jettag_c_get_138_203.setTagInfo(_td_c_get_138_203);
                _jettag_c_get_138_203.doStart(context, out);
                _jettag_c_get_138_203.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_c_if_137_68.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_137_68.doEnd();
            out.endTag("if",238);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_137_4.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_137_4.doEnd();
        out.loopEnd();
        out.endTag("iterate",374);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\tORDER BY ");  //$NON-NLS-1$        
        out.setTag("get",7982,8028);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_139_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_139_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_139_13.setRuntimeParent(null);
        _jettag_c_get_139_13.setTagInfo(_td_c_get_139_13);
        _jettag_c_get_139_13.doStart(context, out);
        _jettag_c_get_139_13.doEnd();
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
        out.setTag("get",8103,8142);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_144_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_144_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_144_6.setRuntimeParent(null);
        _jettag_c_get_144_6.setTagInfo(_td_c_get_144_6);
        _jettag_c_get_144_6.doStart(context, out);
        _jettag_c_get_144_6.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = new ");  //$NON-NLS-1$        
        out.setTag("get",8149,8193);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_144_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_144_52); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_144_52.setRuntimeParent(null);
        _jettag_c_get_144_52.setTagInfo(_td_c_get_144_52);
        _jettag_c_get_144_52.doStart(context, out);
        _jettag_c_get_144_52.doEnd();
        out.setTag(null,-1,-1);
        out.write("();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\t\t$");  //$NON-NLS-1$        
        out.setTag("get",8203,8242);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_146_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_146_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_146_6.setRuntimeParent(null);
        _jettag_c_get_146_6.setTagInfo(_td_c_get_146_6);
        _jettag_c_get_146_6.doStart(context, out);
        _jettag_c_get_146_6.doEnd();
        out.setTag(null,-1,-1);
        out.write("->setId($row[\"");  //$NON-NLS-1$        
        out.setTag("get",8256,8302);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_146_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_146_59); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_146_59.setRuntimeParent(null);
        _jettag_c_get_146_59.setTagInfo(_td_c_get_146_59);
        _jettag_c_get_146_59.doStart(context, out);
        _jettag_c_get_146_59.doEnd();
        out.setTag(null,-1,-1);
        out.write("_id\"]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(68);
        out.setTag("iterate",8313,8381);
        RuntimeTagElement _jettag_c_iterate_147_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_147_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_147_4.setRuntimeParent(null);
        _jettag_c_iterate_147_4.setTagInfo(_td_c_iterate_147_4);
        _jettag_c_iterate_147_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_147_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_147_4.getTagInfo().getAttribute("delimiter"),8313,8381);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(125);
            out.setTag("if",8381,8506);
            RuntimeTagElement _jettag_c_if_148_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_148_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_148_5.setRuntimeParent(_jettag_c_iterate_147_4);
            _jettag_c_if_148_5.setTagInfo(_td_c_if_148_5);
            _jettag_c_if_148_5.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_148_5.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",8512,8570);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_149_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_149_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_149_6.setRuntimeParent(_jettag_c_if_148_5);
                _jettag_c_get_149_6.setTagInfo(_td_c_get_149_6);
                _jettag_c_get_149_6.doStart(context, out);
                _jettag_c_get_149_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = new ");  //$NON-NLS-1$        
                out.setTag("get",8577,8640);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(63);
                RuntimeTagElement _jettag_c_get_149_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_149_71); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_149_71.setRuntimeParent(_jettag_c_if_148_5);
                _jettag_c_get_149_71.setTagInfo(_td_c_get_149_71);
                _jettag_c_get_149_71.doStart(context, out);
                _jettag_c_get_149_71.doEnd();
                out.setTag(null,-1,-1);
                out.write("();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",8649,8707);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_150_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_150_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_150_6.setRuntimeParent(_jettag_c_if_148_5);
                _jettag_c_get_150_6.setTagInfo(_td_c_get_150_6);
                _jettag_c_get_150_6.doStart(context, out);
                _jettag_c_get_150_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->setId($row[\"");  //$NON-NLS-1$        
                out.setTag("get",8721,8786);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_150_78 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_150_78); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_150_78.setRuntimeParent(_jettag_c_if_148_5);
                _jettag_c_get_150_78.setTagInfo(_td_c_get_150_78);
                _jettag_c_get_150_78.doStart(context, out);
                _jettag_c_get_150_78.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id\"]);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(106);
                out.setTag("iterate",8798,8904);
                RuntimeTagElement _jettag_c_iterate_151_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_151_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_151_5.setRuntimeParent(_jettag_c_if_148_5);
                _jettag_c_iterate_151_5.setTagInfo(_td_c_iterate_151_5);
                _jettag_c_iterate_151_5.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_151_5.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_151_5.getTagInfo().getAttribute("delimiter"),8798,8904);
                    out.loopIterate();
                    out.write("$");  //$NON-NLS-1$        
                    out.setTag("get",8905,8963);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_152_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_152_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_152_7.setRuntimeParent(_jettag_c_iterate_151_5);
                    _jettag_c_get_152_7.setTagInfo(_td_c_get_152_7);
                    _jettag_c_get_152_7.doStart(context, out);
                    _jettag_c_get_152_7.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->set");  //$NON-NLS-1$        
                    out.setTag("get",8968,9032);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(64);
                    RuntimeTagElement _jettag_c_get_152_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_152_70); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_152_70.setRuntimeParent(_jettag_c_iterate_151_5);
                    _jettag_c_get_152_70.setTagInfo(_td_c_get_152_70);
                    _jettag_c_get_152_70.doStart(context, out);
                    _jettag_c_get_152_70.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("($row[\"");  //$NON-NLS-1$        
                    out.setTag("get",9039,9104);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_152_141 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_152_141); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_152_141.setRuntimeParent(_jettag_c_iterate_151_5);
                    _jettag_c_get_152_141.setTagInfo(_td_c_get_152_141);
                    _jettag_c_get_152_141.doStart(context, out);
                    _jettag_c_get_152_141.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",9105,9163);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_152_207 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_152_207); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_152_207.setRuntimeParent(_jettag_c_iterate_151_5);
                    _jettag_c_get_152_207.setTagInfo(_td_c_get_152_207);
                    _jettag_c_get_152_207.doStart(context, out);
                    _jettag_c_get_152_207.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\"]);");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_151_5.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_151_5.doEnd();
                out.loopEnd();
                out.endTag("iterate",268);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",9190,9229);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_154_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_154_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_154_6.setRuntimeParent(_jettag_c_if_148_5);
                _jettag_c_get_154_6.setTagInfo(_td_c_get_154_6);
                _jettag_c_get_154_6.doStart(context, out);
                _jettag_c_get_154_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->set");  //$NON-NLS-1$        
                out.setTag("get",9234,9280);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_154_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_154_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_154_50.setRuntimeParent(_jettag_c_if_148_5);
                _jettag_c_get_154_50.setTagInfo(_td_c_get_154_50);
                _jettag_c_get_154_50.doStart(context, out);
                _jettag_c_get_154_50.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",9282,9340);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_154_98 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_154_98); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_154_98.setRuntimeParent(_jettag_c_if_148_5);
                _jettag_c_get_154_98.setTagInfo(_td_c_get_154_98);
                _jettag_c_get_154_98.doStart(context, out);
                _jettag_c_get_154_98.doEnd();
                out.setTag(null,-1,-1);
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_148_5.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_148_5.doEnd();
            out.endTag("if",840);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(64);
            out.setTag("if",9353,9417);
            RuntimeTagElement _jettag_c_if_155_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_155_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_155_11.setRuntimeParent(_jettag_c_iterate_147_4);
            _jettag_c_if_155_11.setTagInfo(_td_c_if_155_11);
            _jettag_c_if_155_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_155_11.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",9423,9462);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_156_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_156_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_156_6.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_156_6.setTagInfo(_td_c_get_156_6);
                _jettag_c_get_156_6.doStart(context, out);
                _jettag_c_get_156_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->set");  //$NON-NLS-1$        
                out.setTag("get",9467,9513);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_156_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_156_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_156_50.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_156_50.setTagInfo(_td_c_get_156_50);
                _jettag_c_get_156_50.doStart(context, out);
                _jettag_c_get_156_50.doEnd();
                out.setTag(null,-1,-1);
                out.write("($row[\"");  //$NON-NLS-1$        
                out.setTag("get",9520,9566);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_156_103 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_156_103); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_156_103.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_156_103.setTagInfo(_td_c_get_156_103);
                _jettag_c_get_156_103.doStart(context, out);
                _jettag_c_get_156_103.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",9567,9607);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_156_150 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_156_150); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_156_150.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_156_150.setTagInfo(_td_c_get_156_150);
                _jettag_c_get_156_150.doStart(context, out);
                _jettag_c_get_156_150.doEnd();
                out.setTag(null,-1,-1);
                out.write("\"]);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_155_11.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_155_11.doEnd();
            out.endTag("if",198);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(124);
            out.setTag("if",9622,9746);
            RuntimeTagElement _jettag_c_if_157_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_157_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_157_11.setRuntimeParent(_jettag_c_iterate_147_4);
            _jettag_c_if_157_11.setTagInfo(_td_c_if_157_11);
            _jettag_c_if_157_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_157_11.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$query_");  //$NON-NLS-1$        
                out.setTag("get",9758,9798);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_158_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_158_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_158_12.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_158_12.setTagInfo(_td_c_get_158_12);
                _jettag_c_get_158_12.doStart(context, out);
                _jettag_c_get_158_12.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = pg_query(\"SELECT");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",9824,9889);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_159_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_159_7.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_159_7.setTagInfo(_td_c_get_159_7);
                _jettag_c_get_159_7.doStart(context, out);
                _jettag_c_get_159_7.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id AS ");  //$NON-NLS-1$        
                out.setTag("get",9896,9961);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_159_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_79); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_159_79.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_159_79.setTagInfo(_td_c_get_159_79);
                _jettag_c_get_159_79.doStart(context, out);
                _jettag_c_get_159_79.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id, ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(108);
                out.setTag("iterate",9966,10074);
                RuntimeTagElement _jettag_c_iterate_159_149 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_159_149); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_159_149.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_iterate_159_149.setTagInfo(_td_c_iterate_159_149);
                _jettag_c_iterate_159_149.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_159_149.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_159_149.getTagInfo().getAttribute("delimiter"),9966,10074);
                    out.loopIterate();
                    out.setTag("get",10074,10139);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_160_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_160_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_160_8.setRuntimeParent(_jettag_c_iterate_159_149);
                    _jettag_c_get_160_8.setTagInfo(_td_c_get_160_8);
                    _jettag_c_get_160_8.doStart(context, out);
                    _jettag_c_get_160_8.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",10140,10198);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_160_74 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_160_74); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_160_74.setRuntimeParent(_jettag_c_iterate_159_149);
                    _jettag_c_get_160_74.setTagInfo(_td_c_get_160_74);
                    _jettag_c_get_160_74.doStart(context, out);
                    _jettag_c_get_160_74.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" AS ");  //$NON-NLS-1$        
                    out.setTag("get",10202,10267);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_160_136 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_160_136); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_160_136.setRuntimeParent(_jettag_c_iterate_159_149);
                    _jettag_c_get_160_136.setTagInfo(_td_c_get_160_136);
                    _jettag_c_get_160_136.doStart(context, out);
                    _jettag_c_get_160_136.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",10268,10326);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_160_202 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_160_202); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_160_202.setRuntimeParent(_jettag_c_iterate_159_149);
                    _jettag_c_get_160_202.setTagInfo(_td_c_get_160_202);
                    _jettag_c_get_160_202.doStart(context, out);
                    _jettag_c_get_160_202.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(",");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_159_149.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_159_149.doEnd();
                out.loopEnd();
                out.endTag("iterate",253);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",10346,10392);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_161_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_161_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_161_7.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_161_7.setTagInfo(_td_c_get_161_7);
                _jettag_c_get_161_7.doStart(context, out);
                _jettag_c_get_161_7.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",10393,10458);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_161_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_161_54); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_161_54.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_161_54.setTagInfo(_td_c_get_161_54);
                _jettag_c_get_161_54.doStart(context, out);
                _jettag_c_get_161_54.doEnd();
                out.setTag(null,-1,-1);
                out.write(".created_at,");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",10477,10523);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_162_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_162_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_162_7.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_162_7.setTagInfo(_td_c_get_162_7);
                _jettag_c_get_162_7.doStart(context, out);
                _jettag_c_get_162_7.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",10524,10589);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_162_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_162_54); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_162_54.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_162_54.setTagInfo(_td_c_get_162_54);
                _jettag_c_get_162_54.doStart(context, out);
                _jettag_c_get_162_54.doEnd();
                out.setTag(null,-1,-1);
                out.write(".update_at");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tFROM ");  //$NON-NLS-1$        
                out.setTag("get",10610,10656);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_163_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_163_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_163_11.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_163_11.setTagInfo(_td_c_get_163_11);
                _jettag_c_get_163_11.doStart(context, out);
                _jettag_c_get_163_11.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",10657,10722);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_163_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_163_58); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_163_58.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_163_58.setTagInfo(_td_c_get_163_58);
                _jettag_c_get_163_58.doStart(context, out);
                _jettag_c_get_163_58.doEnd();
                out.setTag(null,-1,-1);
                out.write(NL);         
                out.write("\t\t\t\t\tINNER JOIN ");  //$NON-NLS-1$        
                out.setTag("get",10739,10804);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_164_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_164_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_164_17.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_164_17.setTagInfo(_td_c_get_164_17);
                _jettag_c_get_164_17.doStart(context, out);
                _jettag_c_get_164_17.doEnd();
                out.setTag(null,-1,-1);
                out.write(" ON ");  //$NON-NLS-1$        
                out.setTag("get",10808,10873);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_164_86 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_164_86); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_164_86.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_164_86.setTagInfo(_td_c_get_164_86);
                _jettag_c_get_164_86.doStart(context, out);
                _jettag_c_get_164_86.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id = ");  //$NON-NLS-1$        
                out.setTag("get",10879,10925);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_164_157 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_164_157); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_164_157.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_164_157.setTagInfo(_td_c_get_164_157);
                _jettag_c_get_164_157.doStart(context, out);
                _jettag_c_get_164_157.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",10926,10991);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_164_204 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_164_204); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_164_204.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_164_204.setTagInfo(_td_c_get_164_204);
                _jettag_c_get_164_204.doStart(context, out);
                _jettag_c_get_164_204.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",10992,11057);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_164_270 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_164_270); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_164_270.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_164_270.setTagInfo(_td_c_get_164_270);
                _jettag_c_get_164_270.doStart(context, out);
                _jettag_c_get_164_270.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tWHERE ");  //$NON-NLS-1$        
                out.setTag("get",11073,11119);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_165_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_165_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_165_12.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_165_12.setTagInfo(_td_c_get_165_12);
                _jettag_c_get_165_12.doStart(context, out);
                _jettag_c_get_165_12.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",11120,11185);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_165_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_165_59); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_165_59.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_165_59.setTagInfo(_td_c_get_165_59);
                _jettag_c_get_165_59.doStart(context, out);
                _jettag_c_get_165_59.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",11186,11232);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_165_125 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_165_125); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_165_125.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_165_125.setTagInfo(_td_c_get_165_125);
                _jettag_c_get_165_125.doStart(context, out);
                _jettag_c_get_165_125.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id = \" . $");  //$NON-NLS-1$        
                out.setTag("get",11243,11282);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_165_182 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_165_182); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_165_182.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_165_182.setTagInfo(_td_c_get_165_182);
                _jettag_c_get_165_182.doStart(context, out);
                _jettag_c_get_165_182.doEnd();
                out.setTag(null,-1,-1);
                out.write("->getId()");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\tif ($query_");  //$NON-NLS-1$        
                out.setTag("get",11319,11359);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_168_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_168_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_168_16.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_168_16.setTagInfo(_td_c_get_168_16);
                _jettag_c_get_168_16.doStart(context, out);
                _jettag_c_get_168_16.doEnd();
                out.setTag(null,-1,-1);
                out.write(") {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\twhile ($row_");  //$NON-NLS-1$        
                out.setTag("get",11380,11420);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_169_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_169_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_169_18.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_169_18.setTagInfo(_td_c_get_169_18);
                _jettag_c_get_169_18.doStart(context, out);
                _jettag_c_get_169_18.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = pg_fetch_assoc($query_");  //$NON-NLS-1$        
                out.setTag("get",11445,11485);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_169_83 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_169_83); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_169_83.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_169_83.setTagInfo(_td_c_get_169_83);
                _jettag_c_get_169_83.doStart(context, out);
                _jettag_c_get_169_83.doEnd();
                out.setTag(null,-1,-1);
                out.write(")) {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",11497,11555);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_170_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_170_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_170_8.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_170_8.setTagInfo(_td_c_get_170_8);
                _jettag_c_get_170_8.doStart(context, out);
                _jettag_c_get_170_8.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = new ");  //$NON-NLS-1$        
                out.setTag("get",11562,11625);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(63);
                RuntimeTagElement _jettag_c_get_170_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_170_73); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_170_73.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_170_73.setTagInfo(_td_c_get_170_73);
                _jettag_c_get_170_73.doStart(context, out);
                _jettag_c_get_170_73.doEnd();
                out.setTag(null,-1,-1);
                out.write("();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",11636,11694);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_171_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_171_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_171_8.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_171_8.setTagInfo(_td_c_get_171_8);
                _jettag_c_get_171_8.doStart(context, out);
                _jettag_c_get_171_8.doEnd();
                out.setTag(null,-1,-1);
                out.write("->setId($row_");  //$NON-NLS-1$        
                out.setTag("get",11707,11747);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_171_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_171_79); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_171_79.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_171_79.setTagInfo(_td_c_get_171_79);
                _jettag_c_get_171_79.doStart(context, out);
                _jettag_c_get_171_79.doEnd();
                out.setTag(null,-1,-1);
                out.write("[\"");  //$NON-NLS-1$        
                out.setTag("get",11749,11814);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_171_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_171_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_171_121.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_171_121.setTagInfo(_td_c_get_171_121);
                _jettag_c_get_171_121.doStart(context, out);
                _jettag_c_get_171_121.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id\"]);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(108);
                out.setTag("iterate",11828,11936);
                RuntimeTagElement _jettag_c_iterate_172_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_172_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_172_7.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_iterate_172_7.setTagInfo(_td_c_iterate_172_7);
                _jettag_c_iterate_172_7.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_172_7.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_172_7.getTagInfo().getAttribute("delimiter"),11828,11936);
                    out.loopIterate();
                    out.write("$");  //$NON-NLS-1$        
                    out.setTag("get",11937,11995);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_173_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_173_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_173_9.setRuntimeParent(_jettag_c_iterate_172_7);
                    _jettag_c_get_173_9.setTagInfo(_td_c_get_173_9);
                    _jettag_c_get_173_9.doStart(context, out);
                    _jettag_c_get_173_9.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->set");  //$NON-NLS-1$        
                    out.setTag("get",12000,12064);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(64);
                    RuntimeTagElement _jettag_c_get_173_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_173_72); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_173_72.setRuntimeParent(_jettag_c_iterate_172_7);
                    _jettag_c_get_173_72.setTagInfo(_td_c_get_173_72);
                    _jettag_c_get_173_72.doStart(context, out);
                    _jettag_c_get_173_72.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("($row_");  //$NON-NLS-1$        
                    out.setTag("get",12070,12110);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_173_142 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_173_142); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_173_142.setRuntimeParent(_jettag_c_iterate_172_7);
                    _jettag_c_get_173_142.setTagInfo(_td_c_get_173_142);
                    _jettag_c_get_173_142.doStart(context, out);
                    _jettag_c_get_173_142.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("[\"");  //$NON-NLS-1$        
                    out.setTag("get",12112,12177);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_173_184 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_173_184); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_173_184.setRuntimeParent(_jettag_c_iterate_172_7);
                    _jettag_c_get_173_184.setTagInfo(_td_c_get_173_184);
                    _jettag_c_get_173_184.doStart(context, out);
                    _jettag_c_get_173_184.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",12178,12236);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_173_250 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_173_250); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_173_250.setRuntimeParent(_jettag_c_iterate_172_7);
                    _jettag_c_get_173_250.setTagInfo(_td_c_get_173_250);
                    _jettag_c_get_173_250.doStart(context, out);
                    _jettag_c_get_173_250.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\"]);");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_172_7.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_172_7.doEnd();
                out.loopEnd();
                out.endTag("iterate",311);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",12267,12306);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_175_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_175_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_175_8.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_175_8.setTagInfo(_td_c_get_175_8);
                _jettag_c_get_175_8.doStart(context, out);
                _jettag_c_get_175_8.doEnd();
                out.setTag(null,-1,-1);
                out.write("->add");  //$NON-NLS-1$        
                out.setTag("get",12311,12357);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_175_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_175_52); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_175_52.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_175_52.setTagInfo(_td_c_get_175_52);
                _jettag_c_get_175_52.doStart(context, out);
                _jettag_c_get_175_52.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",12359,12417);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_175_100 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_175_100); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_175_100.setRuntimeParent(_jettag_c_if_157_11);
                _jettag_c_get_175_100.setTagInfo(_td_c_get_175_100);
                _jettag_c_get_175_100.doStart(context, out);
                _jettag_c_get_175_100.doEnd();
                out.setTag(null,-1,-1);
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_157_11.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_157_11.doEnd();
            out.endTag("if",2690);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_147_4.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_147_4.doEnd();
        out.loopEnd();
        out.endTag("iterate",4062);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\t\t$result[] = $");  //$NON-NLS-1$        
        out.setTag("get",12473,12512);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_179_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_179_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_179_18.setRuntimeParent(null);
        _jettag_c_get_179_18.setTagInfo(_td_c_get_179_18);
        _jettag_c_get_179_18.doStart(context, out);
        _jettag_c_get_179_18.doEnd();
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
        out.setTag("get",12568,12607);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_186_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_186_23); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_186_23.setRuntimeParent(null);
        _jettag_c_get_186_23.setTagInfo(_td_c_get_186_23);
        _jettag_c_get_186_23.doStart(context, out);
        _jettag_c_get_186_23.doEnd();
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
        out.setTag("iterate",12651,12715);
        RuntimeTagElement _jettag_c_iterate_192_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_192_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_192_2.setRuntimeParent(null);
        _jettag_c_iterate_192_2.setTagInfo(_td_c_iterate_192_2);
        _jettag_c_iterate_192_2.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_192_2.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_192_2.getTagInfo().getAttribute("delimiter"),12651,12715);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\tif (");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(61);
            out.setTag("if",12722,12783);
            RuntimeTagElement _jettag_c_if_193_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_193_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_193_7.setRuntimeParent(_jettag_c_iterate_192_2);
            _jettag_c_if_193_7.setTagInfo(_td_c_if_193_7);
            _jettag_c_if_193_7.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_193_7.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t(is_array($");  //$NON-NLS-1$        
                out.setTag("get",12798,12837);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_194_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_194_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_194_15.setRuntimeParent(_jettag_c_if_193_7);
                _jettag_c_get_194_15.setTagInfo(_td_c_get_194_15);
                _jettag_c_get_194_15.doStart(context, out);
                _jettag_c_get_194_15.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",12842,12888);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_194_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_194_59); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_194_59.setRuntimeParent(_jettag_c_if_193_7);
                _jettag_c_get_194_59.setTagInfo(_td_c_get_194_59);
                _jettag_c_get_194_59.doStart(context, out);
                _jettag_c_get_194_59.doEnd();
                out.setTag(null,-1,-1);
                out.write("()) && count($");  //$NON-NLS-1$        
                out.setTag("get",12902,12941);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_194_119 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_194_119); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_194_119.setRuntimeParent(_jettag_c_if_193_7);
                _jettag_c_get_194_119.setTagInfo(_td_c_get_194_119);
                _jettag_c_get_194_119.doStart(context, out);
                _jettag_c_get_194_119.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",12946,12992);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_194_163 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_194_163); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_194_163.setRuntimeParent(_jettag_c_if_193_7);
                _jettag_c_get_194_163.setTagInfo(_td_c_get_194_163);
                _jettag_c_get_194_163.doStart(context, out);
                _jettag_c_get_194_163.doEnd();
                out.setTag(null,-1,-1);
                out.write("()) > 0)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t|| (is_object($");  //$NON-NLS-1$        
                out.setTag("get",13019,13058);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_195_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_195_19); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_195_19.setRuntimeParent(_jettag_c_if_193_7);
                _jettag_c_get_195_19.setTagInfo(_td_c_get_195_19);
                _jettag_c_get_195_19.doStart(context, out);
                _jettag_c_get_195_19.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",13063,13109);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_195_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_195_63); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_195_63.setRuntimeParent(_jettag_c_if_193_7);
                _jettag_c_get_195_63.setTagInfo(_td_c_get_195_63);
                _jettag_c_get_195_63.doStart(context, out);
                _jettag_c_get_195_63.doEnd();
                out.setTag(null,-1,-1);
                out.write("()) && $");  //$NON-NLS-1$        
                out.setTag("get",13117,13156);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_195_117 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_195_117); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_195_117.setRuntimeParent(_jettag_c_if_193_7);
                _jettag_c_get_195_117.setTagInfo(_td_c_get_195_117);
                _jettag_c_get_195_117.doStart(context, out);
                _jettag_c_get_195_117.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",13161,13207);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_195_161 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_195_161); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_195_161.setRuntimeParent(_jettag_c_if_193_7);
                _jettag_c_get_195_161.setTagInfo(_td_c_get_195_161);
                _jettag_c_get_195_161.doStart(context, out);
                _jettag_c_get_195_161.doEnd();
                out.setTag(null,-1,-1);
                out.write("()->getId() > 0)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_193_7.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_193_7.doEnd();
            out.endTag("if",443);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(68);
            out.setTag("if",13233,13301);
            RuntimeTagElement _jettag_c_if_196_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_196_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_196_10.setRuntimeParent(_jettag_c_iterate_192_2);
            _jettag_c_if_196_10.setTagInfo(_td_c_if_196_10);
            _jettag_c_if_196_10.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_196_10.okToProcessBody()) {
                out.write("strlen($");  //$NON-NLS-1$        
                out.setTag("get",13309,13348);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_197_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_197_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_197_13.setRuntimeParent(_jettag_c_if_196_10);
                _jettag_c_get_197_13.setTagInfo(_td_c_get_197_13);
                _jettag_c_get_197_13.doStart(context, out);
                _jettag_c_get_197_13.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",13353,13399);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_197_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_197_57); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_197_57.setRuntimeParent(_jettag_c_if_196_10);
                _jettag_c_get_197_57.setTagInfo(_td_c_get_197_57);
                _jettag_c_get_197_57.doStart(context, out);
                _jettag_c_get_197_57.doEnd();
                out.setTag(null,-1,-1);
                out.write("()) > 0");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_196_10.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_196_10.doEnd();
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
            out.setTag("if",13513,13579);
            RuntimeTagElement _jettag_c_if_204_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_204_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_204_4.setRuntimeParent(_jettag_c_iterate_192_2);
            _jettag_c_if_204_4.setTagInfo(_td_c_if_204_4);
            _jettag_c_if_204_4.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_204_4.okToProcessBody()) {
                out.write("if (is_array($");  //$NON-NLS-1$        
                out.setTag("get",13593,13632);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_205_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_205_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_205_20.setRuntimeParent(_jettag_c_if_204_4);
                _jettag_c_get_205_20.setTagInfo(_td_c_get_205_20);
                _jettag_c_get_205_20.doStart(context, out);
                _jettag_c_get_205_20.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",13637,13683);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_205_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_205_64); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_205_64.setRuntimeParent(_jettag_c_if_204_4);
                _jettag_c_get_205_64.setTagInfo(_td_c_get_205_64);
                _jettag_c_get_205_64.doStart(context, out);
                _jettag_c_get_205_64.doEnd();
                out.setTag(null,-1,-1);
                out.write("())) {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t$first = true;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t$where .= \"(\";");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tforeach ($");  //$NON-NLS-1$        
                out.setTag("get",13745,13784);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_208_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_208_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_208_16.setRuntimeParent(_jettag_c_if_204_4);
                _jettag_c_get_208_16.setTagInfo(_td_c_get_208_16);
                _jettag_c_get_208_16.doStart(context, out);
                _jettag_c_get_208_16.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",13789,13835);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_208_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_208_60); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_208_60.setRuntimeParent(_jettag_c_if_204_4);
                _jettag_c_get_208_60.setTagInfo(_td_c_get_208_60);
                _jettag_c_get_208_60.doStart(context, out);
                _jettag_c_get_208_60.doEnd();
                out.setTag(null,-1,-1);
                out.write("() as $");  //$NON-NLS-1$        
                out.setTag("get",13842,13882);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_208_113 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_208_113); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_208_113.setRuntimeParent(_jettag_c_if_204_4);
                _jettag_c_get_208_113.setTagInfo(_td_c_get_208_113);
                _jettag_c_get_208_113.doStart(context, out);
                _jettag_c_get_208_113.doEnd();
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
                out.setTag("if",13949,14029);
                RuntimeTagElement _jettag_c_if_213_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_213_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_213_7.setRuntimeParent(_jettag_c_if_204_4);
                _jettag_c_if_213_7.setTagInfo(_td_c_if_213_7);
                _jettag_c_if_213_7.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_213_7.okToProcessBody()) {
                    out.write("$where .= \"");  //$NON-NLS-1$        
                    out.setTag("get",14040,14086);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_214_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_214_19); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_214_19.setRuntimeParent(_jettag_c_if_213_7);
                    _jettag_c_get_214_19.setTagInfo(_td_c_get_214_19);
                    _jettag_c_get_214_19.doStart(context, out);
                    _jettag_c_get_214_19.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",14087,14127);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_214_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_214_66); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_214_66.setRuntimeParent(_jettag_c_if_213_7);
                    _jettag_c_get_214_66.setTagInfo(_td_c_get_214_66);
                    _jettag_c_get_214_66.doStart(context, out);
                    _jettag_c_get_214_66.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" = \" . $");  //$NON-NLS-1$        
                    out.setTag("get",14135,14175);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_214_114 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_214_114); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_214_114.setRuntimeParent(_jettag_c_if_213_7);
                    _jettag_c_get_214_114.setTagInfo(_td_c_get_214_114);
                    _jettag_c_get_214_114.doStart(context, out);
                    _jettag_c_get_214_114.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->getId();");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_213_7.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_213_7.doEnd();
                out.endTag("if",163);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(77);
                out.setTag("if",14199,14276);
                RuntimeTagElement _jettag_c_if_215_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_215_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_215_14.setRuntimeParent(_jettag_c_if_204_4);
                _jettag_c_if_215_14.setTagInfo(_td_c_if_215_14);
                _jettag_c_if_215_14.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_215_14.okToProcessBody()) {
                    out.write("$where .= \"(");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\tSELECT count(*)");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\tFROM ");  //$NON-NLS-1$        
                    out.setTag("get",14324,14370);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_218_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_218_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_218_13.setRuntimeParent(_jettag_c_if_215_14);
                    _jettag_c_get_218_13.setTagInfo(_td_c_get_218_13);
                    _jettag_c_get_218_13.doStart(context, out);
                    _jettag_c_get_218_13.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",14371,14436);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_218_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_218_60); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_218_60.setRuntimeParent(_jettag_c_if_215_14);
                    _jettag_c_get_218_60.setTagInfo(_td_c_get_218_60);
                    _jettag_c_get_218_60.doStart(context, out);
                    _jettag_c_get_218_60.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\tWHERE");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.setTag("get",14458,14504);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_220_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_220_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_220_9.setRuntimeParent(_jettag_c_if_215_14);
                    _jettag_c_get_220_9.setTagInfo(_td_c_get_220_9);
                    _jettag_c_get_220_9.doStart(context, out);
                    _jettag_c_get_220_9.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",14505,14570);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_220_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_220_56); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_220_56.setRuntimeParent(_jettag_c_if_215_14);
                    _jettag_c_get_220_56.setTagInfo(_td_c_get_220_56);
                    _jettag_c_get_220_56.doStart(context, out);
                    _jettag_c_get_220_56.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",14571,14617);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_220_122 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_220_122); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_220_122.setRuntimeParent(_jettag_c_if_215_14);
                    _jettag_c_get_220_122.setTagInfo(_td_c_get_220_122);
                    _jettag_c_get_220_122.doStart(context, out);
                    _jettag_c_get_220_122.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_id = ");  //$NON-NLS-1$        
                    out.setTag("get",14623,14669);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_220_174 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_220_174); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_220_174.setRuntimeParent(_jettag_c_if_215_14);
                    _jettag_c_get_220_174.setTagInfo(_td_c_get_220_174);
                    _jettag_c_get_220_174.doStart(context, out);
                    _jettag_c_get_220_174.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".id");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\tAND ");  //$NON-NLS-1$        
                    out.setTag("get",14685,14731);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_221_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_221_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_221_13.setRuntimeParent(_jettag_c_if_215_14);
                    _jettag_c_get_221_13.setTagInfo(_td_c_get_221_13);
                    _jettag_c_get_221_13.doStart(context, out);
                    _jettag_c_get_221_13.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",14732,14797);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_221_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_221_60); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_221_60.setRuntimeParent(_jettag_c_if_215_14);
                    _jettag_c_get_221_60.setTagInfo(_td_c_get_221_60);
                    _jettag_c_get_221_60.doStart(context, out);
                    _jettag_c_get_221_60.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",14798,14863);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_221_126 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_221_126); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_221_126.setRuntimeParent(_jettag_c_if_215_14);
                    _jettag_c_get_221_126.setTagInfo(_td_c_get_221_126);
                    _jettag_c_get_221_126.doStart(context, out);
                    _jettag_c_get_221_126.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_id = \" . $");  //$NON-NLS-1$        
                    out.setTag("get",14874,14914);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_221_202 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_221_202); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_221_202.setRuntimeParent(_jettag_c_if_215_14);
                    _jettag_c_get_221_202.setTagInfo(_td_c_get_221_202);
                    _jettag_c_get_221_202.doStart(context, out);
                    _jettag_c_get_221_202.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->getId() . \"");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t) > 0\";");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_215_14.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_215_14.doEnd();
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
                out.setTag("get",15034,15080);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_228_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_228_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_228_17.setRuntimeParent(_jettag_c_if_204_4);
                _jettag_c_get_228_17.setTagInfo(_td_c_get_228_17);
                _jettag_c_get_228_17.doStart(context, out);
                _jettag_c_get_228_17.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",15081,15121);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_228_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_228_64); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_228_64.setRuntimeParent(_jettag_c_if_204_4);
                _jettag_c_get_228_64.setTagInfo(_td_c_get_228_64);
                _jettag_c_get_228_64.doStart(context, out);
                _jettag_c_get_228_64.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = \" . $");  //$NON-NLS-1$        
                out.setTag("get",15129,15168);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_228_112 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_228_112); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_228_112.setRuntimeParent(_jettag_c_if_204_4);
                _jettag_c_get_228_112.setTagInfo(_td_c_get_228_112);
                _jettag_c_get_228_112.doStart(context, out);
                _jettag_c_get_228_112.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",15173,15219);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_228_156 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_228_156); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_228_156.setRuntimeParent(_jettag_c_if_204_4);
                _jettag_c_get_228_156.setTagInfo(_td_c_get_228_156);
                _jettag_c_get_228_156.doStart(context, out);
                _jettag_c_get_228_156.doEnd();
                out.setTag(null,-1,-1);
                out.write("()->getId();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_204_4.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_204_4.doEnd();
            out.endTag("if",1662);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(69);
            out.setTag("if",15248,15317);
            RuntimeTagElement _jettag_c_if_230_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_230_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_230_11.setRuntimeParent(_jettag_c_iterate_192_2);
            _jettag_c_if_230_11.setTagInfo(_td_c_if_230_11);
            _jettag_c_if_230_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_230_11.okToProcessBody()) {
                out.write("$where .= \"");  //$NON-NLS-1$        
                out.setTag("get",15328,15374);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_231_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_231_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_231_17.setRuntimeParent(_jettag_c_if_230_11);
                _jettag_c_get_231_17.setTagInfo(_td_c_get_231_17);
                _jettag_c_get_231_17.doStart(context, out);
                _jettag_c_get_231_17.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",15375,15415);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_231_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_231_64); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_231_64.setRuntimeParent(_jettag_c_if_230_11);
                _jettag_c_get_231_64.setTagInfo(_td_c_get_231_64);
                _jettag_c_get_231_64.doStart(context, out);
                _jettag_c_get_231_64.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = '\" . $");  //$NON-NLS-1$        
                out.setTag("get",15424,15463);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_231_113 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_231_113); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_231_113.setRuntimeParent(_jettag_c_if_230_11);
                _jettag_c_get_231_113.setTagInfo(_td_c_get_231_113);
                _jettag_c_get_231_113.doStart(context, out);
                _jettag_c_get_231_113.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",15468,15514);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_231_157 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_231_157); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_231_157.setRuntimeParent(_jettag_c_if_230_11);
                _jettag_c_get_231_157.setTagInfo(_td_c_get_231_157);
                _jettag_c_get_231_157.doStart(context, out);
                _jettag_c_get_231_157.doEnd();
                out.setTag(null,-1,-1);
                out.write("() . \"'\";");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_230_11.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_230_11.doEnd();
            out.endTag("if",210);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("\t\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_192_2.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_192_2.doEnd();
        out.loopEnd();
        out.endTag("iterate",2825);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t$query = pg_query(\"SELECT");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.setTag("get",15585,15631);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_236_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_236_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_236_5.setRuntimeParent(null);
        _jettag_c_get_236_5.setTagInfo(_td_c_get_236_5);
        _jettag_c_get_236_5.doStart(context, out);
        _jettag_c_get_236_5.doEnd();
        out.setTag(null,-1,-1);
        out.write(".id AS ");  //$NON-NLS-1$        
        out.setTag("get",15638,15684);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_236_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_236_58); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_236_58.setRuntimeParent(null);
        _jettag_c_get_236_58.setTagInfo(_td_c_get_236_58);
        _jettag_c_get_236_58.doStart(context, out);
        _jettag_c_get_236_58.doEnd();
        out.setTag(null,-1,-1);
        out.write("_id,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(69);
        out.setTag("iterate",15693,15762);
        RuntimeTagElement _jettag_c_iterate_237_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_237_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_237_5.setRuntimeParent(null);
        _jettag_c_iterate_237_5.setTagInfo(_td_c_iterate_237_5);
        _jettag_c_iterate_237_5.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_237_5.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_237_5.getTagInfo().getAttribute("delimiter"),15693,15762);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(125);
            out.setTag("if",15762,15887);
            RuntimeTagElement _jettag_c_if_238_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_238_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_238_6.setRuntimeParent(_jettag_c_iterate_237_5);
            _jettag_c_if_238_6.setTagInfo(_td_c_if_238_6);
            _jettag_c_if_238_6.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_238_6.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",15893,15958);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_239_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_239_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_239_6.setRuntimeParent(_jettag_c_if_238_6);
                _jettag_c_get_239_6.setTagInfo(_td_c_get_239_6);
                _jettag_c_get_239_6.doStart(context, out);
                _jettag_c_get_239_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id AS ");  //$NON-NLS-1$        
                out.setTag("get",15965,16030);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_239_78 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_239_78); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_239_78.setRuntimeParent(_jettag_c_if_238_6);
                _jettag_c_get_239_78.setTagInfo(_td_c_get_239_78);
                _jettag_c_get_239_78.doStart(context, out);
                _jettag_c_get_239_78.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id, ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(107);
                out.setTag("iterate",16035,16142);
                RuntimeTagElement _jettag_c_iterate_239_148 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_239_148); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_239_148.setRuntimeParent(_jettag_c_if_238_6);
                _jettag_c_iterate_239_148.setTagInfo(_td_c_iterate_239_148);
                _jettag_c_iterate_239_148.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_239_148.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_239_148.getTagInfo().getAttribute("delimiter"),16035,16142);
                    out.loopIterate();
                    out.setTag("get",16142,16207);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_240_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_240_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_240_7.setRuntimeParent(_jettag_c_iterate_239_148);
                    _jettag_c_get_240_7.setTagInfo(_td_c_get_240_7);
                    _jettag_c_get_240_7.doStart(context, out);
                    _jettag_c_get_240_7.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",16208,16266);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_240_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_240_73); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_240_73.setRuntimeParent(_jettag_c_iterate_239_148);
                    _jettag_c_get_240_73.setTagInfo(_td_c_get_240_73);
                    _jettag_c_get_240_73.doStart(context, out);
                    _jettag_c_get_240_73.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" AS ");  //$NON-NLS-1$        
                    out.setTag("get",16270,16335);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_240_135 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_240_135); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_240_135.setRuntimeParent(_jettag_c_iterate_239_148);
                    _jettag_c_get_240_135.setTagInfo(_td_c_get_240_135);
                    _jettag_c_get_240_135.doStart(context, out);
                    _jettag_c_get_240_135.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",16336,16394);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_240_201 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_240_201); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_240_201.setRuntimeParent(_jettag_c_iterate_239_148);
                    _jettag_c_get_240_201.setTagInfo(_td_c_get_240_201);
                    _jettag_c_get_240_201.doStart(context, out);
                    _jettag_c_get_240_201.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(",");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_239_148.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_239_148.doEnd();
                out.loopEnd();
                out.endTag("iterate",253);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_238_6.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_238_6.doEnd();
            out.endTag("if",525);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(69);
            out.setTag("if",16419,16488);
            RuntimeTagElement _jettag_c_if_241_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_241_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_241_12.setRuntimeParent(_jettag_c_iterate_237_5);
            _jettag_c_if_241_12.setTagInfo(_td_c_if_241_12);
            _jettag_c_if_241_12.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_241_12.okToProcessBody()) {
                out.setTag("get",16488,16534);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_242_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_242_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_242_6.setRuntimeParent(_jettag_c_if_241_12);
                _jettag_c_get_242_6.setTagInfo(_td_c_get_242_6);
                _jettag_c_get_242_6.doStart(context, out);
                _jettag_c_get_242_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",16535,16575);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_242_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_242_53); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_242_53.setRuntimeParent(_jettag_c_if_241_12);
                _jettag_c_get_242_53.setTagInfo(_td_c_get_242_53);
                _jettag_c_get_242_53.doStart(context, out);
                _jettag_c_get_242_53.doEnd();
                out.setTag(null,-1,-1);
                out.write(" AS ");  //$NON-NLS-1$        
                out.setTag("get",16579,16625);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_242_97 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_242_97); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_242_97.setRuntimeParent(_jettag_c_if_241_12);
                _jettag_c_get_242_97.setTagInfo(_td_c_get_242_97);
                _jettag_c_get_242_97.doStart(context, out);
                _jettag_c_get_242_97.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",16626,16666);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_242_144 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_242_144); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_242_144.setRuntimeParent(_jettag_c_if_241_12);
                _jettag_c_get_242_144.setTagInfo(_td_c_get_242_144);
                _jettag_c_get_242_144.doStart(context, out);
                _jettag_c_get_242_144.doEnd();
                out.setTag(null,-1,-1);
                out.write(",");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_241_12.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_241_12.doEnd();
            out.endTag("if",179);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_237_5.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_237_5.doEnd();
        out.loopEnd();
        out.endTag("iterate",912);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.setTag("get",16691,16737);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_243_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_243_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_243_5.setRuntimeParent(null);
        _jettag_c_get_243_5.setTagInfo(_td_c_get_243_5);
        _jettag_c_get_243_5.doStart(context, out);
        _jettag_c_get_243_5.doEnd();
        out.setTag(null,-1,-1);
        out.write(".created_at as created_at,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.setTag("get",16768,16814);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_244_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_244_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_244_5.setRuntimeParent(null);
        _jettag_c_get_244_5.setTagInfo(_td_c_get_244_5);
        _jettag_c_get_244_5.doStart(context, out);
        _jettag_c_get_244_5.doEnd();
        out.setTag(null,-1,-1);
        out.write(".update_at as update_at");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tFROM ");  //$NON-NLS-1$        
        out.setTag("get",16846,16892);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_245_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_245_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_245_9.setRuntimeParent(null);
        _jettag_c_get_245_9.setTagInfo(_td_c_get_245_9);
        _jettag_c_get_245_9.doStart(context, out);
        _jettag_c_get_245_9.doEnd();
        out.setTag(null,-1,-1);
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(64);
        out.setTag("iterate",16896,16960);
        RuntimeTagElement _jettag_c_iterate_246_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_246_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_246_4.setRuntimeParent(null);
        _jettag_c_iterate_246_4.setTagInfo(_td_c_iterate_246_4);
        _jettag_c_iterate_246_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_246_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_246_4.getTagInfo().getAttribute("delimiter"),16896,16960);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(129);
            out.setTag("if",16960,17089);
            RuntimeTagElement _jettag_c_if_246_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_246_68); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_246_68.setRuntimeParent(_jettag_c_iterate_246_4);
            _jettag_c_if_246_68.setTagInfo(_td_c_if_246_68);
            _jettag_c_if_246_68.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_246_68.okToProcessBody()) {
                out.write("INNER JOIN ");  //$NON-NLS-1$        
                out.setTag("get",17100,17165);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_247_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_247_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_247_16.setRuntimeParent(_jettag_c_if_246_68);
                _jettag_c_get_247_16.setTagInfo(_td_c_get_247_16);
                _jettag_c_get_247_16.doStart(context, out);
                _jettag_c_get_247_16.doEnd();
                out.setTag(null,-1,-1);
                out.write(" ON ");  //$NON-NLS-1$        
                out.setTag("get",17169,17234);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_247_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_247_85); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_247_85.setRuntimeParent(_jettag_c_if_246_68);
                _jettag_c_get_247_85.setTagInfo(_td_c_get_247_85);
                _jettag_c_get_247_85.doStart(context, out);
                _jettag_c_get_247_85.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id = ");  //$NON-NLS-1$        
                out.setTag("get",17240,17286);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_247_156 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_247_156); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_247_156.setRuntimeParent(_jettag_c_if_246_68);
                _jettag_c_get_247_156.setTagInfo(_td_c_get_247_156);
                _jettag_c_get_247_156.doStart(context, out);
                _jettag_c_get_247_156.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",17287,17327);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_247_203 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_247_203); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_247_203.setRuntimeParent(_jettag_c_if_246_68);
                _jettag_c_get_247_203.setTagInfo(_td_c_get_247_203);
                _jettag_c_get_247_203.doStart(context, out);
                _jettag_c_get_247_203.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_c_if_246_68.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_246_68.doEnd();
            out.endTag("if",238);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_246_4.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_246_4.doEnd();
        out.loopEnd();
        out.endTag("iterate",374);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\" . $where . \"ORDER BY ");  //$NON-NLS-1$        
        out.setTag("get",17372,17418);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_248_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_248_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_248_26.setRuntimeParent(null);
        _jettag_c_get_248_26.setTagInfo(_td_c_get_248_26);
        _jettag_c_get_248_26.doStart(context, out);
        _jettag_c_get_248_26.doEnd();
        out.setTag(null,-1,-1);
        out.write(".id\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tif ($query) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\twhile ($row = pg_fetch_assoc($query)) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t$");  //$NON-NLS-1$        
        out.setTag("get",17490,17529);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_252_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_252_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_252_6.setRuntimeParent(null);
        _jettag_c_get_252_6.setTagInfo(_td_c_get_252_6);
        _jettag_c_get_252_6.doStart(context, out);
        _jettag_c_get_252_6.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = new ");  //$NON-NLS-1$        
        out.setTag("get",17536,17580);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_252_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_252_52); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_252_52.setRuntimeParent(null);
        _jettag_c_get_252_52.setTagInfo(_td_c_get_252_52);
        _jettag_c_get_252_52.doStart(context, out);
        _jettag_c_get_252_52.doEnd();
        out.setTag(null,-1,-1);
        out.write("();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\t\t$");  //$NON-NLS-1$        
        out.setTag("get",17590,17629);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_254_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_254_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_254_6.setRuntimeParent(null);
        _jettag_c_get_254_6.setTagInfo(_td_c_get_254_6);
        _jettag_c_get_254_6.doStart(context, out);
        _jettag_c_get_254_6.doEnd();
        out.setTag(null,-1,-1);
        out.write("->setId($row[\"");  //$NON-NLS-1$        
        out.setTag("get",17643,17689);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_254_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_254_59); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_254_59.setRuntimeParent(null);
        _jettag_c_get_254_59.setTagInfo(_td_c_get_254_59);
        _jettag_c_get_254_59.doStart(context, out);
        _jettag_c_get_254_59.doEnd();
        out.setTag(null,-1,-1);
        out.write("_id\"]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(68);
        out.setTag("iterate",17700,17768);
        RuntimeTagElement _jettag_c_iterate_255_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_255_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_255_4.setRuntimeParent(null);
        _jettag_c_iterate_255_4.setTagInfo(_td_c_iterate_255_4);
        _jettag_c_iterate_255_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_255_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_255_4.getTagInfo().getAttribute("delimiter"),17700,17768);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(125);
            out.setTag("if",17768,17893);
            RuntimeTagElement _jettag_c_if_256_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_256_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_256_5.setRuntimeParent(_jettag_c_iterate_255_4);
            _jettag_c_if_256_5.setTagInfo(_td_c_if_256_5);
            _jettag_c_if_256_5.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_256_5.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",17899,17957);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_257_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_257_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_257_6.setRuntimeParent(_jettag_c_if_256_5);
                _jettag_c_get_257_6.setTagInfo(_td_c_get_257_6);
                _jettag_c_get_257_6.doStart(context, out);
                _jettag_c_get_257_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = new ");  //$NON-NLS-1$        
                out.setTag("get",17964,18027);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(63);
                RuntimeTagElement _jettag_c_get_257_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_257_71); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_257_71.setRuntimeParent(_jettag_c_if_256_5);
                _jettag_c_get_257_71.setTagInfo(_td_c_get_257_71);
                _jettag_c_get_257_71.doStart(context, out);
                _jettag_c_get_257_71.doEnd();
                out.setTag(null,-1,-1);
                out.write("();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",18036,18094);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_258_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_258_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_258_6.setRuntimeParent(_jettag_c_if_256_5);
                _jettag_c_get_258_6.setTagInfo(_td_c_get_258_6);
                _jettag_c_get_258_6.doStart(context, out);
                _jettag_c_get_258_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->setId($row[\"");  //$NON-NLS-1$        
                out.setTag("get",18108,18173);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_258_78 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_258_78); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_258_78.setRuntimeParent(_jettag_c_if_256_5);
                _jettag_c_get_258_78.setTagInfo(_td_c_get_258_78);
                _jettag_c_get_258_78.doStart(context, out);
                _jettag_c_get_258_78.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id\"]);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(106);
                out.setTag("iterate",18185,18291);
                RuntimeTagElement _jettag_c_iterate_259_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_259_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_259_5.setRuntimeParent(_jettag_c_if_256_5);
                _jettag_c_iterate_259_5.setTagInfo(_td_c_iterate_259_5);
                _jettag_c_iterate_259_5.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_259_5.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_259_5.getTagInfo().getAttribute("delimiter"),18185,18291);
                    out.loopIterate();
                    out.write("$");  //$NON-NLS-1$        
                    out.setTag("get",18292,18350);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_260_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_260_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_260_7.setRuntimeParent(_jettag_c_iterate_259_5);
                    _jettag_c_get_260_7.setTagInfo(_td_c_get_260_7);
                    _jettag_c_get_260_7.doStart(context, out);
                    _jettag_c_get_260_7.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->set");  //$NON-NLS-1$        
                    out.setTag("get",18355,18419);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(64);
                    RuntimeTagElement _jettag_c_get_260_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_260_70); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_260_70.setRuntimeParent(_jettag_c_iterate_259_5);
                    _jettag_c_get_260_70.setTagInfo(_td_c_get_260_70);
                    _jettag_c_get_260_70.doStart(context, out);
                    _jettag_c_get_260_70.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("($row[\"");  //$NON-NLS-1$        
                    out.setTag("get",18426,18491);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_260_141 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_260_141); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_260_141.setRuntimeParent(_jettag_c_iterate_259_5);
                    _jettag_c_get_260_141.setTagInfo(_td_c_get_260_141);
                    _jettag_c_get_260_141.doStart(context, out);
                    _jettag_c_get_260_141.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",18492,18550);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_260_207 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_260_207); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_260_207.setRuntimeParent(_jettag_c_iterate_259_5);
                    _jettag_c_get_260_207.setTagInfo(_td_c_get_260_207);
                    _jettag_c_get_260_207.doStart(context, out);
                    _jettag_c_get_260_207.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\"]);");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_259_5.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_259_5.doEnd();
                out.loopEnd();
                out.endTag("iterate",268);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",18577,18616);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_262_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_262_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_262_6.setRuntimeParent(_jettag_c_if_256_5);
                _jettag_c_get_262_6.setTagInfo(_td_c_get_262_6);
                _jettag_c_get_262_6.doStart(context, out);
                _jettag_c_get_262_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->set");  //$NON-NLS-1$        
                out.setTag("get",18621,18667);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_262_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_262_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_262_50.setRuntimeParent(_jettag_c_if_256_5);
                _jettag_c_get_262_50.setTagInfo(_td_c_get_262_50);
                _jettag_c_get_262_50.doStart(context, out);
                _jettag_c_get_262_50.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",18669,18727);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_262_98 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_262_98); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_262_98.setRuntimeParent(_jettag_c_if_256_5);
                _jettag_c_get_262_98.setTagInfo(_td_c_get_262_98);
                _jettag_c_get_262_98.doStart(context, out);
                _jettag_c_get_262_98.doEnd();
                out.setTag(null,-1,-1);
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_256_5.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_256_5.doEnd();
            out.endTag("if",840);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(64);
            out.setTag("if",18740,18804);
            RuntimeTagElement _jettag_c_if_263_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_263_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_263_11.setRuntimeParent(_jettag_c_iterate_255_4);
            _jettag_c_if_263_11.setTagInfo(_td_c_if_263_11);
            _jettag_c_if_263_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_263_11.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",18810,18849);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_264_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_264_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_264_6.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_264_6.setTagInfo(_td_c_get_264_6);
                _jettag_c_get_264_6.doStart(context, out);
                _jettag_c_get_264_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->set");  //$NON-NLS-1$        
                out.setTag("get",18854,18900);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_264_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_264_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_264_50.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_264_50.setTagInfo(_td_c_get_264_50);
                _jettag_c_get_264_50.doStart(context, out);
                _jettag_c_get_264_50.doEnd();
                out.setTag(null,-1,-1);
                out.write("($row[\"");  //$NON-NLS-1$        
                out.setTag("get",18907,18953);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_264_103 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_264_103); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_264_103.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_264_103.setTagInfo(_td_c_get_264_103);
                _jettag_c_get_264_103.doStart(context, out);
                _jettag_c_get_264_103.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",18954,18994);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_264_150 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_264_150); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_264_150.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_264_150.setTagInfo(_td_c_get_264_150);
                _jettag_c_get_264_150.doStart(context, out);
                _jettag_c_get_264_150.doEnd();
                out.setTag(null,-1,-1);
                out.write("\"]);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_263_11.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_263_11.doEnd();
            out.endTag("if",198);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(124);
            out.setTag("if",19009,19133);
            RuntimeTagElement _jettag_c_if_265_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_265_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_265_11.setRuntimeParent(_jettag_c_iterate_255_4);
            _jettag_c_if_265_11.setTagInfo(_td_c_if_265_11);
            _jettag_c_if_265_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_265_11.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$query_");  //$NON-NLS-1$        
                out.setTag("get",19145,19185);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_266_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_266_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_266_12.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_266_12.setTagInfo(_td_c_get_266_12);
                _jettag_c_get_266_12.doStart(context, out);
                _jettag_c_get_266_12.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = pg_query(\"SELECT");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",19211,19276);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_267_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_267_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_267_7.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_267_7.setTagInfo(_td_c_get_267_7);
                _jettag_c_get_267_7.doStart(context, out);
                _jettag_c_get_267_7.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id AS ");  //$NON-NLS-1$        
                out.setTag("get",19283,19348);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_267_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_267_79); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_267_79.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_267_79.setTagInfo(_td_c_get_267_79);
                _jettag_c_get_267_79.doStart(context, out);
                _jettag_c_get_267_79.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id, ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(108);
                out.setTag("iterate",19353,19461);
                RuntimeTagElement _jettag_c_iterate_267_149 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_267_149); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_267_149.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_iterate_267_149.setTagInfo(_td_c_iterate_267_149);
                _jettag_c_iterate_267_149.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_267_149.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_267_149.getTagInfo().getAttribute("delimiter"),19353,19461);
                    out.loopIterate();
                    out.setTag("get",19461,19526);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_268_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_268_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_268_8.setRuntimeParent(_jettag_c_iterate_267_149);
                    _jettag_c_get_268_8.setTagInfo(_td_c_get_268_8);
                    _jettag_c_get_268_8.doStart(context, out);
                    _jettag_c_get_268_8.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",19527,19585);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_268_74 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_268_74); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_268_74.setRuntimeParent(_jettag_c_iterate_267_149);
                    _jettag_c_get_268_74.setTagInfo(_td_c_get_268_74);
                    _jettag_c_get_268_74.doStart(context, out);
                    _jettag_c_get_268_74.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" AS ");  //$NON-NLS-1$        
                    out.setTag("get",19589,19654);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_268_136 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_268_136); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_268_136.setRuntimeParent(_jettag_c_iterate_267_149);
                    _jettag_c_get_268_136.setTagInfo(_td_c_get_268_136);
                    _jettag_c_get_268_136.doStart(context, out);
                    _jettag_c_get_268_136.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",19655,19713);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_268_202 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_268_202); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_268_202.setRuntimeParent(_jettag_c_iterate_267_149);
                    _jettag_c_get_268_202.setTagInfo(_td_c_get_268_202);
                    _jettag_c_get_268_202.doStart(context, out);
                    _jettag_c_get_268_202.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(",");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_267_149.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_267_149.doEnd();
                out.loopEnd();
                out.endTag("iterate",253);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",19733,19779);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_269_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_269_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_269_7.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_269_7.setTagInfo(_td_c_get_269_7);
                _jettag_c_get_269_7.doStart(context, out);
                _jettag_c_get_269_7.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",19780,19845);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_269_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_269_54); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_269_54.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_269_54.setTagInfo(_td_c_get_269_54);
                _jettag_c_get_269_54.doStart(context, out);
                _jettag_c_get_269_54.doEnd();
                out.setTag(null,-1,-1);
                out.write(".created_at,");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",19864,19910);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_270_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_270_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_270_7.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_270_7.setTagInfo(_td_c_get_270_7);
                _jettag_c_get_270_7.doStart(context, out);
                _jettag_c_get_270_7.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",19911,19976);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_270_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_270_54); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_270_54.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_270_54.setTagInfo(_td_c_get_270_54);
                _jettag_c_get_270_54.doStart(context, out);
                _jettag_c_get_270_54.doEnd();
                out.setTag(null,-1,-1);
                out.write(".update_at");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tFROM ");  //$NON-NLS-1$        
                out.setTag("get",19997,20043);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_271_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_271_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_271_11.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_271_11.setTagInfo(_td_c_get_271_11);
                _jettag_c_get_271_11.doStart(context, out);
                _jettag_c_get_271_11.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",20044,20109);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_271_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_271_58); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_271_58.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_271_58.setTagInfo(_td_c_get_271_58);
                _jettag_c_get_271_58.doStart(context, out);
                _jettag_c_get_271_58.doEnd();
                out.setTag(null,-1,-1);
                out.write(NL);         
                out.write("\t\t\t\t\tINNER JOIN ");  //$NON-NLS-1$        
                out.setTag("get",20126,20191);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_272_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_272_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_272_17.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_272_17.setTagInfo(_td_c_get_272_17);
                _jettag_c_get_272_17.doStart(context, out);
                _jettag_c_get_272_17.doEnd();
                out.setTag(null,-1,-1);
                out.write(" ON ");  //$NON-NLS-1$        
                out.setTag("get",20195,20260);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_272_86 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_272_86); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_272_86.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_272_86.setTagInfo(_td_c_get_272_86);
                _jettag_c_get_272_86.doStart(context, out);
                _jettag_c_get_272_86.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id = ");  //$NON-NLS-1$        
                out.setTag("get",20266,20312);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_272_157 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_272_157); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_272_157.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_272_157.setTagInfo(_td_c_get_272_157);
                _jettag_c_get_272_157.doStart(context, out);
                _jettag_c_get_272_157.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",20313,20378);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_272_204 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_272_204); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_272_204.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_272_204.setTagInfo(_td_c_get_272_204);
                _jettag_c_get_272_204.doStart(context, out);
                _jettag_c_get_272_204.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",20379,20444);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_272_270 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_272_270); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_272_270.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_272_270.setTagInfo(_td_c_get_272_270);
                _jettag_c_get_272_270.doStart(context, out);
                _jettag_c_get_272_270.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tWHERE ");  //$NON-NLS-1$        
                out.setTag("get",20460,20506);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_273_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_273_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_273_12.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_273_12.setTagInfo(_td_c_get_273_12);
                _jettag_c_get_273_12.doStart(context, out);
                _jettag_c_get_273_12.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",20507,20572);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_273_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_273_59); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_273_59.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_273_59.setTagInfo(_td_c_get_273_59);
                _jettag_c_get_273_59.doStart(context, out);
                _jettag_c_get_273_59.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",20573,20619);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_273_125 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_273_125); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_273_125.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_273_125.setTagInfo(_td_c_get_273_125);
                _jettag_c_get_273_125.doStart(context, out);
                _jettag_c_get_273_125.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id = \" . $");  //$NON-NLS-1$        
                out.setTag("get",20630,20669);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_273_182 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_273_182); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_273_182.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_273_182.setTagInfo(_td_c_get_273_182);
                _jettag_c_get_273_182.doStart(context, out);
                _jettag_c_get_273_182.doEnd();
                out.setTag(null,-1,-1);
                out.write("->getId()");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\tif ($query_");  //$NON-NLS-1$        
                out.setTag("get",20706,20746);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_276_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_276_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_276_16.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_276_16.setTagInfo(_td_c_get_276_16);
                _jettag_c_get_276_16.doStart(context, out);
                _jettag_c_get_276_16.doEnd();
                out.setTag(null,-1,-1);
                out.write(") {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\twhile ($row_");  //$NON-NLS-1$        
                out.setTag("get",20767,20807);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_277_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_277_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_277_18.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_277_18.setTagInfo(_td_c_get_277_18);
                _jettag_c_get_277_18.doStart(context, out);
                _jettag_c_get_277_18.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = pg_fetch_assoc($query_");  //$NON-NLS-1$        
                out.setTag("get",20832,20872);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_277_83 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_277_83); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_277_83.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_277_83.setTagInfo(_td_c_get_277_83);
                _jettag_c_get_277_83.doStart(context, out);
                _jettag_c_get_277_83.doEnd();
                out.setTag(null,-1,-1);
                out.write(")) {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",20884,20942);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_278_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_278_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_278_8.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_278_8.setTagInfo(_td_c_get_278_8);
                _jettag_c_get_278_8.doStart(context, out);
                _jettag_c_get_278_8.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = new ");  //$NON-NLS-1$        
                out.setTag("get",20949,21012);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(63);
                RuntimeTagElement _jettag_c_get_278_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_278_73); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_278_73.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_278_73.setTagInfo(_td_c_get_278_73);
                _jettag_c_get_278_73.doStart(context, out);
                _jettag_c_get_278_73.doEnd();
                out.setTag(null,-1,-1);
                out.write("();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",21023,21081);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_279_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_279_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_279_8.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_279_8.setTagInfo(_td_c_get_279_8);
                _jettag_c_get_279_8.doStart(context, out);
                _jettag_c_get_279_8.doEnd();
                out.setTag(null,-1,-1);
                out.write("->setId($row_");  //$NON-NLS-1$        
                out.setTag("get",21094,21134);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_279_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_279_79); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_279_79.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_279_79.setTagInfo(_td_c_get_279_79);
                _jettag_c_get_279_79.doStart(context, out);
                _jettag_c_get_279_79.doEnd();
                out.setTag(null,-1,-1);
                out.write("[\"");  //$NON-NLS-1$        
                out.setTag("get",21136,21201);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_279_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_279_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_279_121.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_279_121.setTagInfo(_td_c_get_279_121);
                _jettag_c_get_279_121.doStart(context, out);
                _jettag_c_get_279_121.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id\"]);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(108);
                out.setTag("iterate",21215,21323);
                RuntimeTagElement _jettag_c_iterate_280_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_280_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_280_7.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_iterate_280_7.setTagInfo(_td_c_iterate_280_7);
                _jettag_c_iterate_280_7.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_280_7.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_280_7.getTagInfo().getAttribute("delimiter"),21215,21323);
                    out.loopIterate();
                    out.write("$");  //$NON-NLS-1$        
                    out.setTag("get",21324,21382);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_281_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_281_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_281_9.setRuntimeParent(_jettag_c_iterate_280_7);
                    _jettag_c_get_281_9.setTagInfo(_td_c_get_281_9);
                    _jettag_c_get_281_9.doStart(context, out);
                    _jettag_c_get_281_9.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->set");  //$NON-NLS-1$        
                    out.setTag("get",21387,21451);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(64);
                    RuntimeTagElement _jettag_c_get_281_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_281_72); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_281_72.setRuntimeParent(_jettag_c_iterate_280_7);
                    _jettag_c_get_281_72.setTagInfo(_td_c_get_281_72);
                    _jettag_c_get_281_72.doStart(context, out);
                    _jettag_c_get_281_72.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("($row_");  //$NON-NLS-1$        
                    out.setTag("get",21457,21497);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_281_142 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_281_142); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_281_142.setRuntimeParent(_jettag_c_iterate_280_7);
                    _jettag_c_get_281_142.setTagInfo(_td_c_get_281_142);
                    _jettag_c_get_281_142.doStart(context, out);
                    _jettag_c_get_281_142.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("[\"");  //$NON-NLS-1$        
                    out.setTag("get",21499,21564);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_281_184 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_281_184); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_281_184.setRuntimeParent(_jettag_c_iterate_280_7);
                    _jettag_c_get_281_184.setTagInfo(_td_c_get_281_184);
                    _jettag_c_get_281_184.doStart(context, out);
                    _jettag_c_get_281_184.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",21565,21623);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_281_250 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_281_250); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_281_250.setRuntimeParent(_jettag_c_iterate_280_7);
                    _jettag_c_get_281_250.setTagInfo(_td_c_get_281_250);
                    _jettag_c_get_281_250.doStart(context, out);
                    _jettag_c_get_281_250.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\"]);");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_280_7.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_280_7.doEnd();
                out.loopEnd();
                out.endTag("iterate",311);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",21654,21693);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_283_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_283_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_283_8.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_283_8.setTagInfo(_td_c_get_283_8);
                _jettag_c_get_283_8.doStart(context, out);
                _jettag_c_get_283_8.doEnd();
                out.setTag(null,-1,-1);
                out.write("->add");  //$NON-NLS-1$        
                out.setTag("get",21698,21744);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_283_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_283_52); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_283_52.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_283_52.setTagInfo(_td_c_get_283_52);
                _jettag_c_get_283_52.doStart(context, out);
                _jettag_c_get_283_52.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",21746,21804);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_283_100 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_283_100); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_283_100.setRuntimeParent(_jettag_c_if_265_11);
                _jettag_c_get_283_100.setTagInfo(_td_c_get_283_100);
                _jettag_c_get_283_100.doStart(context, out);
                _jettag_c_get_283_100.doEnd();
                out.setTag(null,-1,-1);
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_265_11.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_265_11.doEnd();
            out.endTag("if",2690);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_255_4.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_255_4.doEnd();
        out.loopEnd();
        out.endTag("iterate",4062);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\t\t$result[] = $");  //$NON-NLS-1$        
        out.setTag("get",21860,21899);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_287_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_287_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_287_18.setRuntimeParent(null);
        _jettag_c_get_287_18.setTagInfo(_td_c_get_287_18);
        _jettag_c_get_287_18.doStart(context, out);
        _jettag_c_get_287_18.doEnd();
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
