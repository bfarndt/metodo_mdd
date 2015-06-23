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
    private static final TagInfo _td_c_get_31_13 = new TagInfo("c:get", //$NON-NLS-1$
            31, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_57 = new TagInfo("c:get", //$NON-NLS-1$
            31, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_40_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            40, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_41_4 = new TagInfo("c:if", //$NON-NLS-1$
            41, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and (($currentFeature/@min > 1) or ($currentFeature/@max > 1))", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_14 = new TagInfo("c:get", //$NON-NLS-1$
            42, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_58 = new TagInfo("c:get", //$NON-NLS-1$
            42, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_114 = new TagInfo("c:get", //$NON-NLS-1$
            42, 114,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_35 = new TagInfo("c:get", //$NON-NLS-1$
            43, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_82 = new TagInfo("c:get", //$NON-NLS-1$
            43, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_6 = new TagInfo("c:get", //$NON-NLS-1$
            44, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_6 = new TagInfo("c:get", //$NON-NLS-1$
            45, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_14 = new TagInfo("c:get", //$NON-NLS-1$
            50, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_62_26 = new TagInfo("c:get", //$NON-NLS-1$
            62, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_29 = new TagInfo("c:get", //$NON-NLS-1$
            64, 29,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_64_79 = new TagInfo("c:iterate", //$NON-NLS-1$
            64, 79,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_65_5 = new TagInfo("c:if", //$NON-NLS-1$
            65, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and ($currentFeature/@min <= 1) and ($currentFeature/@max <= 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_7 = new TagInfo("c:get", //$NON-NLS-1$
            66, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_55 = new TagInfo("c:get", //$NON-NLS-1$
            66, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_99 = new TagInfo("c:get", //$NON-NLS-1$
            66, 99,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_67_12 = new TagInfo("c:if", //$NON-NLS-1$
            67, 12,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_68_7 = new TagInfo("c:get", //$NON-NLS-1$
            68, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_68_56 = new TagInfo("c:get", //$NON-NLS-1$
            68, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_68_100 = new TagInfo("c:get", //$NON-NLS-1$
            68, 100,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_69_20 = new TagInfo("c:get", //$NON-NLS-1$
            69, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_74_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            74, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_75_4 = new TagInfo("c:if", //$NON-NLS-1$
            75, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and (($currentFeature/@min > 1) or ($currentFeature/@max > 1))", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_76_35 = new TagInfo("c:get", //$NON-NLS-1$
            76, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_76_82 = new TagInfo("c:get", //$NON-NLS-1$
            76, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_77_10 = new TagInfo("c:get", //$NON-NLS-1$
            77, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_77_67 = new TagInfo("c:get", //$NON-NLS-1$
            77, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_82_13 = new TagInfo("c:get", //$NON-NLS-1$
            82, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_82_57 = new TagInfo("c:get", //$NON-NLS-1$
            82, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_82_113 = new TagInfo("c:get", //$NON-NLS-1$
            82, 113,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_83_35 = new TagInfo("c:get", //$NON-NLS-1$
            83, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_83_82 = new TagInfo("c:get", //$NON-NLS-1$
            83, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_6 = new TagInfo("c:get", //$NON-NLS-1$
            84, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_85_6 = new TagInfo("c:get", //$NON-NLS-1$
            85, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_89_11 = new TagInfo("c:get", //$NON-NLS-1$
            89, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_90_14 = new TagInfo("c:get", //$NON-NLS-1$
            90, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_102_27 = new TagInfo("c:get", //$NON-NLS-1$
            102, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_105_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            105, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_106_4 = new TagInfo("c:if", //$NON-NLS-1$
            106, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and (($currentFeature/@min > 1) or ($currentFeature/@max > 1))", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_107_35 = new TagInfo("c:get", //$NON-NLS-1$
            107, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_107_82 = new TagInfo("c:get", //$NON-NLS-1$
            107, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_108_10 = new TagInfo("c:get", //$NON-NLS-1$
            108, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_108_67 = new TagInfo("c:get", //$NON-NLS-1$
            108, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_113_34 = new TagInfo("c:get", //$NON-NLS-1$
            113, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_113_97 = new TagInfo("c:get", //$NON-NLS-1$
            113, 97,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_125_5 = new TagInfo("c:get", //$NON-NLS-1$
            125, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_125_58 = new TagInfo("c:get", //$NON-NLS-1$
            125, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_126_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            126, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_127_6 = new TagInfo("c:if", //$NON-NLS-1$
            127, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and ($currentFeature/@min <= 1) and ($currentFeature/@max <= 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_128_6 = new TagInfo("c:get", //$NON-NLS-1$
            128, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_128_78 = new TagInfo("c:get", //$NON-NLS-1$
            128, 78,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_128_148 = new TagInfo("c:iterate", //$NON-NLS-1$
            128, 148,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_129_7 = new TagInfo("c:get", //$NON-NLS-1$
            129, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_129_73 = new TagInfo("c:get", //$NON-NLS-1$
            129, 73,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_129_135 = new TagInfo("c:get", //$NON-NLS-1$
            129, 135,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_129_201 = new TagInfo("c:get", //$NON-NLS-1$
            129, 201,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_130_12 = new TagInfo("c:if", //$NON-NLS-1$
            130, 12,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_131_6 = new TagInfo("c:get", //$NON-NLS-1$
            131, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_131_53 = new TagInfo("c:get", //$NON-NLS-1$
            131, 53,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_131_97 = new TagInfo("c:get", //$NON-NLS-1$
            131, 97,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_131_144 = new TagInfo("c:get", //$NON-NLS-1$
            131, 144,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_134_9 = new TagInfo("c:get", //$NON-NLS-1$
            134, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_135_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            135, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_135_68 = new TagInfo("c:if", //$NON-NLS-1$
            135, 68,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and ($currentFeature/@min <= 1) and ($currentFeature/@max <= 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_136_16 = new TagInfo("c:get", //$NON-NLS-1$
            136, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_136_85 = new TagInfo("c:get", //$NON-NLS-1$
            136, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_136_156 = new TagInfo("c:get", //$NON-NLS-1$
            136, 156,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_136_203 = new TagInfo("c:get", //$NON-NLS-1$
            136, 203,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_137_13 = new TagInfo("c:get", //$NON-NLS-1$
            137, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_142_6 = new TagInfo("c:get", //$NON-NLS-1$
            142, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_142_52 = new TagInfo("c:get", //$NON-NLS-1$
            142, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_144_6 = new TagInfo("c:get", //$NON-NLS-1$
            144, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_144_59 = new TagInfo("c:get", //$NON-NLS-1$
            144, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_145_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            145, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_146_5 = new TagInfo("c:if", //$NON-NLS-1$
            146, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and ($currentFeature/@min <= 1) and ($currentFeature/@max <= 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_147_6 = new TagInfo("c:get", //$NON-NLS-1$
            147, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_147_71 = new TagInfo("c:get", //$NON-NLS-1$
            147, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_148_6 = new TagInfo("c:get", //$NON-NLS-1$
            148, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_148_78 = new TagInfo("c:get", //$NON-NLS-1$
            148, 78,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_149_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            149, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_150_7 = new TagInfo("c:get", //$NON-NLS-1$
            150, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_150_70 = new TagInfo("c:get", //$NON-NLS-1$
            150, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_150_141 = new TagInfo("c:get", //$NON-NLS-1$
            150, 141,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_150_207 = new TagInfo("c:get", //$NON-NLS-1$
            150, 207,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_152_6 = new TagInfo("c:get", //$NON-NLS-1$
            152, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_152_50 = new TagInfo("c:get", //$NON-NLS-1$
            152, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_152_98 = new TagInfo("c:get", //$NON-NLS-1$
            152, 98,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_153_11 = new TagInfo("c:if", //$NON-NLS-1$
            153, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
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
    private static final TagInfo _td_c_get_154_103 = new TagInfo("c:get", //$NON-NLS-1$
            154, 103,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_154_150 = new TagInfo("c:get", //$NON-NLS-1$
            154, 150,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_155_11 = new TagInfo("c:if", //$NON-NLS-1$
            155, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and (($currentFeature/@min > 1) or ($currentFeature/@max > 1))", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_156_12 = new TagInfo("c:get", //$NON-NLS-1$
            156, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_157_7 = new TagInfo("c:get", //$NON-NLS-1$
            157, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_157_79 = new TagInfo("c:get", //$NON-NLS-1$
            157, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_157_149 = new TagInfo("c:iterate", //$NON-NLS-1$
            157, 149,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_158_8 = new TagInfo("c:get", //$NON-NLS-1$
            158, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_158_74 = new TagInfo("c:get", //$NON-NLS-1$
            158, 74,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_158_136 = new TagInfo("c:get", //$NON-NLS-1$
            158, 136,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_158_202 = new TagInfo("c:get", //$NON-NLS-1$
            158, 202,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_7 = new TagInfo("c:get", //$NON-NLS-1$
            159, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_54 = new TagInfo("c:get", //$NON-NLS-1$
            159, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_160_7 = new TagInfo("c:get", //$NON-NLS-1$
            160, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_160_54 = new TagInfo("c:get", //$NON-NLS-1$
            160, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_161_11 = new TagInfo("c:get", //$NON-NLS-1$
            161, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_161_58 = new TagInfo("c:get", //$NON-NLS-1$
            161, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_162_17 = new TagInfo("c:get", //$NON-NLS-1$
            162, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_162_86 = new TagInfo("c:get", //$NON-NLS-1$
            162, 86,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_162_157 = new TagInfo("c:get", //$NON-NLS-1$
            162, 157,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_162_204 = new TagInfo("c:get", //$NON-NLS-1$
            162, 204,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_162_270 = new TagInfo("c:get", //$NON-NLS-1$
            162, 270,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_163_12 = new TagInfo("c:get", //$NON-NLS-1$
            163, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_163_59 = new TagInfo("c:get", //$NON-NLS-1$
            163, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_163_125 = new TagInfo("c:get", //$NON-NLS-1$
            163, 125,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_163_182 = new TagInfo("c:get", //$NON-NLS-1$
            163, 182,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_166_16 = new TagInfo("c:get", //$NON-NLS-1$
            166, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_167_18 = new TagInfo("c:get", //$NON-NLS-1$
            167, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_167_83 = new TagInfo("c:get", //$NON-NLS-1$
            167, 83,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_168_8 = new TagInfo("c:get", //$NON-NLS-1$
            168, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_168_73 = new TagInfo("c:get", //$NON-NLS-1$
            168, 73,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_169_8 = new TagInfo("c:get", //$NON-NLS-1$
            169, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_169_79 = new TagInfo("c:get", //$NON-NLS-1$
            169, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_169_121 = new TagInfo("c:get", //$NON-NLS-1$
            169, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_170_7 = new TagInfo("c:iterate", //$NON-NLS-1$
            170, 7,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_171_9 = new TagInfo("c:get", //$NON-NLS-1$
            171, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_171_72 = new TagInfo("c:get", //$NON-NLS-1$
            171, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_171_142 = new TagInfo("c:get", //$NON-NLS-1$
            171, 142,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_171_184 = new TagInfo("c:get", //$NON-NLS-1$
            171, 184,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_171_250 = new TagInfo("c:get", //$NON-NLS-1$
            171, 250,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_173_8 = new TagInfo("c:get", //$NON-NLS-1$
            173, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_173_52 = new TagInfo("c:get", //$NON-NLS-1$
            173, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_173_100 = new TagInfo("c:get", //$NON-NLS-1$
            173, 100,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_177_18 = new TagInfo("c:get", //$NON-NLS-1$
            177, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_184_23 = new TagInfo("c:get", //$NON-NLS-1$
            184, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_190_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            190, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_191_7 = new TagInfo("c:if", //$NON-NLS-1$
            191, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_192_15 = new TagInfo("c:get", //$NON-NLS-1$
            192, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_192_59 = new TagInfo("c:get", //$NON-NLS-1$
            192, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_192_119 = new TagInfo("c:get", //$NON-NLS-1$
            192, 119,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_192_163 = new TagInfo("c:get", //$NON-NLS-1$
            192, 163,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_193_19 = new TagInfo("c:get", //$NON-NLS-1$
            193, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_193_63 = new TagInfo("c:get", //$NON-NLS-1$
            193, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_193_117 = new TagInfo("c:get", //$NON-NLS-1$
            193, 117,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_193_161 = new TagInfo("c:get", //$NON-NLS-1$
            193, 161,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_194_10 = new TagInfo("c:if", //$NON-NLS-1$
            194, 10,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_195_13 = new TagInfo("c:get", //$NON-NLS-1$
            195, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_195_57 = new TagInfo("c:get", //$NON-NLS-1$
            195, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_202_4 = new TagInfo("c:if", //$NON-NLS-1$
            202, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_203_20 = new TagInfo("c:get", //$NON-NLS-1$
            203, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_203_64 = new TagInfo("c:get", //$NON-NLS-1$
            203, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_206_16 = new TagInfo("c:get", //$NON-NLS-1$
            206, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_206_60 = new TagInfo("c:get", //$NON-NLS-1$
            206, 60,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_206_113 = new TagInfo("c:get", //$NON-NLS-1$
            206, 113,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_211_7 = new TagInfo("c:if", //$NON-NLS-1$
            211, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/@min <= 1) and ($currentFeature/@max <= 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_212_19 = new TagInfo("c:get", //$NON-NLS-1$
            212, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_212_66 = new TagInfo("c:get", //$NON-NLS-1$
            212, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_212_114 = new TagInfo("c:get", //$NON-NLS-1$
            212, 114,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_213_14 = new TagInfo("c:if", //$NON-NLS-1$
            213, 14,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/@min > 1) or ($currentFeature/@max > 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_216_13 = new TagInfo("c:get", //$NON-NLS-1$
            216, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_216_60 = new TagInfo("c:get", //$NON-NLS-1$
            216, 60,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_218_9 = new TagInfo("c:get", //$NON-NLS-1$
            218, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_218_56 = new TagInfo("c:get", //$NON-NLS-1$
            218, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_218_122 = new TagInfo("c:get", //$NON-NLS-1$
            218, 122,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_218_174 = new TagInfo("c:get", //$NON-NLS-1$
            218, 174,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_219_13 = new TagInfo("c:get", //$NON-NLS-1$
            219, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_219_60 = new TagInfo("c:get", //$NON-NLS-1$
            219, 60,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_219_126 = new TagInfo("c:get", //$NON-NLS-1$
            219, 126,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_219_202 = new TagInfo("c:get", //$NON-NLS-1$
            219, 202,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_226_17 = new TagInfo("c:get", //$NON-NLS-1$
            226, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_226_64 = new TagInfo("c:get", //$NON-NLS-1$
            226, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_226_112 = new TagInfo("c:get", //$NON-NLS-1$
            226, 112,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_226_156 = new TagInfo("c:get", //$NON-NLS-1$
            226, 156,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_228_11 = new TagInfo("c:if", //$NON-NLS-1$
            228, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_229_17 = new TagInfo("c:get", //$NON-NLS-1$
            229, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_229_64 = new TagInfo("c:get", //$NON-NLS-1$
            229, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_229_113 = new TagInfo("c:get", //$NON-NLS-1$
            229, 113,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_229_157 = new TagInfo("c:get", //$NON-NLS-1$
            229, 157,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_234_5 = new TagInfo("c:get", //$NON-NLS-1$
            234, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_234_58 = new TagInfo("c:get", //$NON-NLS-1$
            234, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_235_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            235, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_236_6 = new TagInfo("c:if", //$NON-NLS-1$
            236, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and ($currentFeature/@min <= 1) and ($currentFeature/@max <= 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_237_6 = new TagInfo("c:get", //$NON-NLS-1$
            237, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_237_78 = new TagInfo("c:get", //$NON-NLS-1$
            237, 78,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_237_148 = new TagInfo("c:iterate", //$NON-NLS-1$
            237, 148,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_238_7 = new TagInfo("c:get", //$NON-NLS-1$
            238, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_238_73 = new TagInfo("c:get", //$NON-NLS-1$
            238, 73,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_238_135 = new TagInfo("c:get", //$NON-NLS-1$
            238, 135,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_238_201 = new TagInfo("c:get", //$NON-NLS-1$
            238, 201,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_239_12 = new TagInfo("c:if", //$NON-NLS-1$
            239, 12,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_240_6 = new TagInfo("c:get", //$NON-NLS-1$
            240, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_240_53 = new TagInfo("c:get", //$NON-NLS-1$
            240, 53,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_240_97 = new TagInfo("c:get", //$NON-NLS-1$
            240, 97,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_240_144 = new TagInfo("c:get", //$NON-NLS-1$
            240, 144,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_243_9 = new TagInfo("c:get", //$NON-NLS-1$
            243, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_244_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            244, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_244_68 = new TagInfo("c:if", //$NON-NLS-1$
            244, 68,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and ($currentFeature/@min <= 1) and ($currentFeature/@max <= 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_245_16 = new TagInfo("c:get", //$NON-NLS-1$
            245, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_245_85 = new TagInfo("c:get", //$NON-NLS-1$
            245, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_245_156 = new TagInfo("c:get", //$NON-NLS-1$
            245, 156,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_245_203 = new TagInfo("c:get", //$NON-NLS-1$
            245, 203,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_246_26 = new TagInfo("c:get", //$NON-NLS-1$
            246, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_250_6 = new TagInfo("c:get", //$NON-NLS-1$
            250, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_250_52 = new TagInfo("c:get", //$NON-NLS-1$
            250, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_252_6 = new TagInfo("c:get", //$NON-NLS-1$
            252, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_252_59 = new TagInfo("c:get", //$NON-NLS-1$
            252, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_253_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            253, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_254_5 = new TagInfo("c:if", //$NON-NLS-1$
            254, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and ($currentFeature/@min <= 1) and ($currentFeature/@max <= 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_255_6 = new TagInfo("c:get", //$NON-NLS-1$
            255, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_255_71 = new TagInfo("c:get", //$NON-NLS-1$
            255, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_256_6 = new TagInfo("c:get", //$NON-NLS-1$
            256, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_256_78 = new TagInfo("c:get", //$NON-NLS-1$
            256, 78,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_257_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            257, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_258_7 = new TagInfo("c:get", //$NON-NLS-1$
            258, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_258_70 = new TagInfo("c:get", //$NON-NLS-1$
            258, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_258_141 = new TagInfo("c:get", //$NON-NLS-1$
            258, 141,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_258_207 = new TagInfo("c:get", //$NON-NLS-1$
            258, 207,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_260_6 = new TagInfo("c:get", //$NON-NLS-1$
            260, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_260_50 = new TagInfo("c:get", //$NON-NLS-1$
            260, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_260_98 = new TagInfo("c:get", //$NON-NLS-1$
            260, 98,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_261_11 = new TagInfo("c:if", //$NON-NLS-1$
            261, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
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
    private static final TagInfo _td_c_get_262_103 = new TagInfo("c:get", //$NON-NLS-1$
            262, 103,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_262_150 = new TagInfo("c:get", //$NON-NLS-1$
            262, 150,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_263_11 = new TagInfo("c:if", //$NON-NLS-1$
            263, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and (($currentFeature/@min > 1) or ($currentFeature/@max > 1))", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_264_12 = new TagInfo("c:get", //$NON-NLS-1$
            264, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_265_7 = new TagInfo("c:get", //$NON-NLS-1$
            265, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_265_79 = new TagInfo("c:get", //$NON-NLS-1$
            265, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_265_149 = new TagInfo("c:iterate", //$NON-NLS-1$
            265, 149,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_266_8 = new TagInfo("c:get", //$NON-NLS-1$
            266, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_266_74 = new TagInfo("c:get", //$NON-NLS-1$
            266, 74,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_266_136 = new TagInfo("c:get", //$NON-NLS-1$
            266, 136,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_266_202 = new TagInfo("c:get", //$NON-NLS-1$
            266, 202,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_267_7 = new TagInfo("c:get", //$NON-NLS-1$
            267, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_267_54 = new TagInfo("c:get", //$NON-NLS-1$
            267, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_268_7 = new TagInfo("c:get", //$NON-NLS-1$
            268, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_268_54 = new TagInfo("c:get", //$NON-NLS-1$
            268, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_269_11 = new TagInfo("c:get", //$NON-NLS-1$
            269, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_269_58 = new TagInfo("c:get", //$NON-NLS-1$
            269, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_270_17 = new TagInfo("c:get", //$NON-NLS-1$
            270, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_270_86 = new TagInfo("c:get", //$NON-NLS-1$
            270, 86,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_270_157 = new TagInfo("c:get", //$NON-NLS-1$
            270, 157,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_270_204 = new TagInfo("c:get", //$NON-NLS-1$
            270, 204,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_270_270 = new TagInfo("c:get", //$NON-NLS-1$
            270, 270,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_271_12 = new TagInfo("c:get", //$NON-NLS-1$
            271, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_271_59 = new TagInfo("c:get", //$NON-NLS-1$
            271, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_271_125 = new TagInfo("c:get", //$NON-NLS-1$
            271, 125,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_271_182 = new TagInfo("c:get", //$NON-NLS-1$
            271, 182,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_274_16 = new TagInfo("c:get", //$NON-NLS-1$
            274, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_275_18 = new TagInfo("c:get", //$NON-NLS-1$
            275, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_275_83 = new TagInfo("c:get", //$NON-NLS-1$
            275, 83,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_276_8 = new TagInfo("c:get", //$NON-NLS-1$
            276, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_276_73 = new TagInfo("c:get", //$NON-NLS-1$
            276, 73,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_277_8 = new TagInfo("c:get", //$NON-NLS-1$
            277, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_277_79 = new TagInfo("c:get", //$NON-NLS-1$
            277, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_277_121 = new TagInfo("c:get", //$NON-NLS-1$
            277, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_278_7 = new TagInfo("c:iterate", //$NON-NLS-1$
            278, 7,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_279_9 = new TagInfo("c:get", //$NON-NLS-1$
            279, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_279_72 = new TagInfo("c:get", //$NON-NLS-1$
            279, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_279_142 = new TagInfo("c:get", //$NON-NLS-1$
            279, 142,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_279_184 = new TagInfo("c:get", //$NON-NLS-1$
            279, 184,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_279_250 = new TagInfo("c:get", //$NON-NLS-1$
            279, 250,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_281_8 = new TagInfo("c:get", //$NON-NLS-1$
            281, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_281_52 = new TagInfo("c:get", //$NON-NLS-1$
            281, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_281_100 = new TagInfo("c:get", //$NON-NLS-1$
            281, 100,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_285_18 = new TagInfo("c:get", //$NON-NLS-1$
            285, 18,
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
        out.write("\tprivate $dbname = \"jet\";");  //$NON-NLS-1$        
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
        out.setTag("get",751,790);
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
        out.setTag("get",828,874);
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
        out.setTag("iterate",875,939);
        RuntimeTagElement _jettag_c_iterate_23_81 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_23_81); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_23_81.setRuntimeParent(null);
        _jettag_c_iterate_23_81.setTagInfo(_td_c_iterate_23_81);
        _jettag_c_iterate_23_81.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_23_81.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_23_81.getTagInfo().getAttribute("delimiter"),875,939);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\t\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(175);
            out.setTag("if",944,1119);
            RuntimeTagElement _jettag_c_if_24_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_24_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_24_5.setRuntimeParent(_jettag_c_iterate_23_81);
            _jettag_c_if_24_5.setTagInfo(_td_c_if_24_5);
            _jettag_c_if_24_5.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_24_5.okToProcessBody()) {
                out.setTag("get",1119,1159);
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
        out.setTag("iterate",1217,1281);
        RuntimeTagElement _jettag_c_iterate_27_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_27_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_27_13.setRuntimeParent(null);
        _jettag_c_iterate_27_13.setTagInfo(_td_c_iterate_27_13);
        _jettag_c_iterate_27_13.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_27_13.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_27_13.getTagInfo().getAttribute("delimiter"),1217,1281);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\t\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(131);
            out.setTag("if",1286,1417);
            RuntimeTagElement _jettag_c_if_28_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_28_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_28_5.setRuntimeParent(_jettag_c_iterate_27_13);
            _jettag_c_if_28_5.setTagInfo(_td_c_if_28_5);
            _jettag_c_if_28_5.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_28_5.okToProcessBody()) {
                out.write("\" . $");  //$NON-NLS-1$        
                out.setTag("get",1422,1461);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_29_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_29_12.setRuntimeParent(_jettag_c_if_28_5);
                _jettag_c_get_29_12.setTagInfo(_td_c_get_29_12);
                _jettag_c_get_29_12.doStart(context, out);
                _jettag_c_get_29_12.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",1466,1512);
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
            out.setTag("if",1540,1610);
            RuntimeTagElement _jettag_c_if_30_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_30_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_30_12.setRuntimeParent(_jettag_c_iterate_27_13);
            _jettag_c_if_30_12.setTagInfo(_td_c_if_30_12);
            _jettag_c_if_30_12.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_30_12.okToProcessBody()) {
                out.write("'\" . $");  //$NON-NLS-1$        
                out.setTag("get",1616,1655);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_31_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_31_13.setRuntimeParent(_jettag_c_if_30_12);
                _jettag_c_get_31_13.setTagInfo(_td_c_get_31_13);
                _jettag_c_get_31_13.doStart(context, out);
                _jettag_c_get_31_13.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",1660,1706);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_31_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_57); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_31_57.setRuntimeParent(_jettag_c_if_30_12);
                _jettag_c_get_31_57.setTagInfo(_td_c_get_31_57);
                _jettag_c_get_31_57.doStart(context, out);
                _jettag_c_get_31_57.doEnd();
                out.setTag(null,-1,-1);
                out.write("() . \"',");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_30_12.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_30_12.doEnd();
            out.endTag("if",104);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_27_13.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_27_13.doEnd();
        out.loopEnd();
        out.endTag("iterate",440);
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
        out.setTag("iterate",1878,1945);
        RuntimeTagElement _jettag_c_iterate_40_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_40_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_40_3.setRuntimeParent(null);
        _jettag_c_iterate_40_3.setTagInfo(_td_c_iterate_40_3);
        _jettag_c_iterate_40_3.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_40_3.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_40_3.getTagInfo().getAttribute("delimiter"),1878,1945);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(127);
            out.setTag("if",1945,2072);
            RuntimeTagElement _jettag_c_if_41_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_41_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_41_4.setRuntimeParent(_jettag_c_iterate_40_3);
            _jettag_c_if_41_4.setTagInfo(_td_c_if_41_4);
            _jettag_c_if_41_4.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_41_4.okToProcessBody()) {
                out.write("foreach ($");  //$NON-NLS-1$        
                out.setTag("get",2082,2121);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_42_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_42_14.setRuntimeParent(_jettag_c_if_41_4);
                _jettag_c_get_42_14.setTagInfo(_td_c_get_42_14);
                _jettag_c_get_42_14.doStart(context, out);
                _jettag_c_get_42_14.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",2126,2172);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_42_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_58); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_42_58.setRuntimeParent(_jettag_c_if_41_4);
                _jettag_c_get_42_58.setTagInfo(_td_c_get_42_58);
                _jettag_c_get_42_58.doStart(context, out);
                _jettag_c_get_42_58.doEnd();
                out.setTag(null,-1,-1);
                out.write("() as $row");  //$NON-NLS-1$        
                out.setTag("get",2182,2228);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_42_114 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_114); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_42_114.setRuntimeParent(_jettag_c_if_41_4);
                _jettag_c_get_42_114.setTagInfo(_td_c_get_42_114);
                _jettag_c_get_42_114.doStart(context, out);
                _jettag_c_get_42_114.doEnd();
                out.setTag(null,-1,-1);
                out.write(") {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t$query = pg_query(\"INSERT INTO ");  //$NON-NLS-1$        
                out.setTag("get",2266,2312);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_43_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_35); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_43_35.setRuntimeParent(_jettag_c_if_41_4);
                _jettag_c_get_43_35.setTagInfo(_td_c_get_43_35);
                _jettag_c_get_43_35.doStart(context, out);
                _jettag_c_get_43_35.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",2313,2378);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_43_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_82); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_43_82.setRuntimeParent(_jettag_c_if_41_4);
                _jettag_c_get_43_82.setTagInfo(_td_c_get_43_82);
                _jettag_c_get_43_82.doStart(context, out);
                _jettag_c_get_43_82.doEnd();
                out.setTag(null,-1,-1);
                out.write("(");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",2385,2431);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_44_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_44_6.setRuntimeParent(_jettag_c_if_41_4);
                _jettag_c_get_44_6.setTagInfo(_td_c_get_44_6);
                _jettag_c_get_44_6.doStart(context, out);
                _jettag_c_get_44_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id,");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",2441,2506);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_45_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_45_6.setRuntimeParent(_jettag_c_if_41_4);
                _jettag_c_get_45_6.setTagInfo(_td_c_get_45_6);
                _jettag_c_get_45_6.doStart(context, out);
                _jettag_c_get_45_6.doEnd();
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
                out.setTag("get",2588,2634);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_50_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_50_14.setRuntimeParent(_jettag_c_if_41_4);
                _jettag_c_get_50_14.setTagInfo(_td_c_get_50_14);
                _jettag_c_get_50_14.doStart(context, out);
                _jettag_c_get_50_14.doEnd();
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
                _jettag_c_if_41_4.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_41_4.doEnd();
            out.endTag("if",676);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_40_3.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_40_3.doEnd();
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
        out.setTag("get",2816,2855);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_62_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_62_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_62_26.setRuntimeParent(null);
        _jettag_c_get_62_26.setTagInfo(_td_c_get_62_26);
        _jettag_c_get_62_26.doStart(context, out);
        _jettag_c_get_62_26.doEnd();
        out.setTag(null,-1,-1);
        out.write(")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$query = pg_query(\"UPDATE ");  //$NON-NLS-1$        
        out.setTag("get",2888,2934);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_64_29 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_29); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_64_29.setRuntimeParent(null);
        _jettag_c_get_64_29.setTagInfo(_td_c_get_64_29);
        _jettag_c_get_64_29.doStart(context, out);
        _jettag_c_get_64_29.doEnd();
        out.setTag(null,-1,-1);
        out.write(" SET");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(64);
        out.setTag("iterate",2938,3002);
        RuntimeTagElement _jettag_c_iterate_64_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_64_79); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_64_79.setRuntimeParent(null);
        _jettag_c_iterate_64_79.setTagInfo(_td_c_iterate_64_79);
        _jettag_c_iterate_64_79.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_64_79.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_64_79.getTagInfo().getAttribute("delimiter"),2938,3002);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\t\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(131);
            out.setTag("if",3007,3138);
            RuntimeTagElement _jettag_c_if_65_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_65_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_65_5.setRuntimeParent(_jettag_c_iterate_64_79);
            _jettag_c_if_65_5.setTagInfo(_td_c_if_65_5);
            _jettag_c_if_65_5.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_65_5.okToProcessBody()) {
                out.setTag("get",3138,3178);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_66_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_66_7.setRuntimeParent(_jettag_c_if_65_5);
                _jettag_c_get_66_7.setTagInfo(_td_c_get_66_7);
                _jettag_c_get_66_7.doStart(context, out);
                _jettag_c_get_66_7.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = \" . $");  //$NON-NLS-1$        
                out.setTag("get",3186,3225);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_66_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_66_55.setRuntimeParent(_jettag_c_if_65_5);
                _jettag_c_get_66_55.setTagInfo(_td_c_get_66_55);
                _jettag_c_get_66_55.doStart(context, out);
                _jettag_c_get_66_55.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",3230,3276);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_66_99 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_99); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_66_99.setRuntimeParent(_jettag_c_if_65_5);
                _jettag_c_get_66_99.setTagInfo(_td_c_get_66_99);
                _jettag_c_get_66_99.doStart(context, out);
                _jettag_c_get_66_99.doEnd();
                out.setTag(null,-1,-1);
                out.write("()->getId() . \",");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_65_5.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_65_5.doEnd();
            out.endTag("if",159);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(70);
            out.setTag("if",3304,3374);
            RuntimeTagElement _jettag_c_if_67_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_67_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_67_12.setRuntimeParent(_jettag_c_iterate_64_79);
            _jettag_c_if_67_12.setTagInfo(_td_c_if_67_12);
            _jettag_c_if_67_12.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_67_12.okToProcessBody()) {
                out.setTag("get",3374,3414);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_68_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_68_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_68_7.setRuntimeParent(_jettag_c_if_67_12);
                _jettag_c_get_68_7.setTagInfo(_td_c_get_68_7);
                _jettag_c_get_68_7.doStart(context, out);
                _jettag_c_get_68_7.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = '\" . $");  //$NON-NLS-1$        
                out.setTag("get",3423,3462);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_68_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_68_56); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_68_56.setRuntimeParent(_jettag_c_if_67_12);
                _jettag_c_get_68_56.setTagInfo(_td_c_get_68_56);
                _jettag_c_get_68_56.doStart(context, out);
                _jettag_c_get_68_56.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",3467,3513);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_68_100 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_68_100); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_68_100.setRuntimeParent(_jettag_c_if_67_12);
                _jettag_c_get_68_100.setTagInfo(_td_c_get_68_100);
                _jettag_c_get_68_100.doStart(context, out);
                _jettag_c_get_68_100.doEnd();
                out.setTag(null,-1,-1);
                out.write("() . \"',");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_67_12.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_67_12.doEnd();
            out.endTag("if",147);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_64_79.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_64_79.doEnd();
        out.loopEnd();
        out.endTag("iterate",526);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write("update_at = now()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tWHERE id = \" . $");  //$NON-NLS-1$        
        out.setTag("get",3577,3616);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_69_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_20); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_69_20.setRuntimeParent(null);
        _jettag_c_get_69_20.setTagInfo(_td_c_get_69_20);
        _jettag_c_get_69_20.doStart(context, out);
        _jettag_c_get_69_20.doEnd();
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
        out.setTag("iterate",3681,3748);
        RuntimeTagElement _jettag_c_iterate_74_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_74_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_74_3.setRuntimeParent(null);
        _jettag_c_iterate_74_3.setTagInfo(_td_c_iterate_74_3);
        _jettag_c_iterate_74_3.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_74_3.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_74_3.getTagInfo().getAttribute("delimiter"),3681,3748);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(127);
            out.setTag("if",3748,3875);
            RuntimeTagElement _jettag_c_if_75_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_75_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_75_4.setRuntimeParent(_jettag_c_iterate_74_3);
            _jettag_c_if_75_4.setTagInfo(_td_c_if_75_4);
            _jettag_c_if_75_4.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_75_4.okToProcessBody()) {
                out.write("$query = pg_query(\"DELETE FROM ");  //$NON-NLS-1$        
                out.setTag("get",3906,3952);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_76_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_76_35); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_76_35.setRuntimeParent(_jettag_c_if_75_4);
                _jettag_c_get_76_35.setTagInfo(_td_c_get_76_35);
                _jettag_c_get_76_35.doStart(context, out);
                _jettag_c_get_76_35.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",3953,4018);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_76_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_76_82); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_76_82.setRuntimeParent(_jettag_c_if_75_4);
                _jettag_c_get_76_82.setTagInfo(_td_c_get_76_82);
                _jettag_c_get_76_82.doStart(context, out);
                _jettag_c_get_76_82.doEnd();
                out.setTag(null,-1,-1);
                out.write(NL);         
                out.write("\t\t\tWHERE ");  //$NON-NLS-1$        
                out.setTag("get",4028,4074);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_77_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_77_10); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_77_10.setRuntimeParent(_jettag_c_if_75_4);
                _jettag_c_get_77_10.setTagInfo(_td_c_get_77_10);
                _jettag_c_get_77_10.doStart(context, out);
                _jettag_c_get_77_10.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id = \" . $");  //$NON-NLS-1$        
                out.setTag("get",4085,4124);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_77_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_77_67); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_77_67.setRuntimeParent(_jettag_c_if_75_4);
                _jettag_c_get_77_67.setTagInfo(_td_c_get_77_67);
                _jettag_c_get_77_67.doStart(context, out);
                _jettag_c_get_77_67.doEnd();
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
                out.setTag("get",4210,4249);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_82_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_82_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_82_13.setRuntimeParent(_jettag_c_if_75_4);
                _jettag_c_get_82_13.setTagInfo(_td_c_get_82_13);
                _jettag_c_get_82_13.doStart(context, out);
                _jettag_c_get_82_13.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",4254,4300);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_82_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_82_57); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_82_57.setRuntimeParent(_jettag_c_if_75_4);
                _jettag_c_get_82_57.setTagInfo(_td_c_get_82_57);
                _jettag_c_get_82_57.doStart(context, out);
                _jettag_c_get_82_57.doEnd();
                out.setTag(null,-1,-1);
                out.write("() as $row");  //$NON-NLS-1$        
                out.setTag("get",4310,4356);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_82_113 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_82_113); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_82_113.setRuntimeParent(_jettag_c_if_75_4);
                _jettag_c_get_82_113.setTagInfo(_td_c_get_82_113);
                _jettag_c_get_82_113.doStart(context, out);
                _jettag_c_get_82_113.doEnd();
                out.setTag(null,-1,-1);
                out.write(") {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t$query = pg_query(\"INSERT INTO ");  //$NON-NLS-1$        
                out.setTag("get",4394,4440);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_83_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_83_35); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_83_35.setRuntimeParent(_jettag_c_if_75_4);
                _jettag_c_get_83_35.setTagInfo(_td_c_get_83_35);
                _jettag_c_get_83_35.doStart(context, out);
                _jettag_c_get_83_35.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",4441,4506);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_83_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_83_82); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_83_82.setRuntimeParent(_jettag_c_if_75_4);
                _jettag_c_get_83_82.setTagInfo(_td_c_get_83_82);
                _jettag_c_get_83_82.doStart(context, out);
                _jettag_c_get_83_82.doEnd();
                out.setTag(null,-1,-1);
                out.write("(");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",4513,4559);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_84_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_84_6.setRuntimeParent(_jettag_c_if_75_4);
                _jettag_c_get_84_6.setTagInfo(_td_c_get_84_6);
                _jettag_c_get_84_6.doStart(context, out);
                _jettag_c_get_84_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id,");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",4569,4634);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_85_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_85_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_85_6.setRuntimeParent(_jettag_c_if_75_4);
                _jettag_c_get_85_6.setTagInfo(_td_c_get_85_6);
                _jettag_c_get_85_6.doStart(context, out);
                _jettag_c_get_85_6.doEnd();
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
                out.setTag("get",4695,4734);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_89_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_89_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_89_11.setRuntimeParent(_jettag_c_if_75_4);
                _jettag_c_get_89_11.setTagInfo(_td_c_get_89_11);
                _jettag_c_get_89_11.doStart(context, out);
                _jettag_c_get_89_11.doEnd();
                out.setTag(null,-1,-1);
                out.write("->getId() . \",");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\" . $row");  //$NON-NLS-1$        
                out.setTag("get",4762,4808);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_90_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_90_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_90_14.setRuntimeParent(_jettag_c_if_75_4);
                _jettag_c_get_90_14.setTagInfo(_td_c_get_90_14);
                _jettag_c_get_90_14.doStart(context, out);
                _jettag_c_get_90_14.doEnd();
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
                _jettag_c_if_75_4.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_75_4.doEnd();
            out.endTag("if",1047);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_74_3.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_74_3.doEnd();
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
        out.setTag("get",4991,5030);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_102_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_102_27); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_102_27.setRuntimeParent(null);
        _jettag_c_get_102_27.setTagInfo(_td_c_get_102_27);
        _jettag_c_get_102_27.doStart(context, out);
        _jettag_c_get_102_27.doEnd();
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
        out.setTag("iterate",5055,5122);
        RuntimeTagElement _jettag_c_iterate_105_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_105_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_105_3.setRuntimeParent(null);
        _jettag_c_iterate_105_3.setTagInfo(_td_c_iterate_105_3);
        _jettag_c_iterate_105_3.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_105_3.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_105_3.getTagInfo().getAttribute("delimiter"),5055,5122);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(127);
            out.setTag("if",5122,5249);
            RuntimeTagElement _jettag_c_if_106_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_106_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_106_4.setRuntimeParent(_jettag_c_iterate_105_3);
            _jettag_c_if_106_4.setTagInfo(_td_c_if_106_4);
            _jettag_c_if_106_4.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_106_4.okToProcessBody()) {
                out.write("$query = pg_query(\"DELETE FROM ");  //$NON-NLS-1$        
                out.setTag("get",5280,5326);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_107_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_107_35); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_107_35.setRuntimeParent(_jettag_c_if_106_4);
                _jettag_c_get_107_35.setTagInfo(_td_c_get_107_35);
                _jettag_c_get_107_35.doStart(context, out);
                _jettag_c_get_107_35.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",5327,5392);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_107_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_107_82); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_107_82.setRuntimeParent(_jettag_c_if_106_4);
                _jettag_c_get_107_82.setTagInfo(_td_c_get_107_82);
                _jettag_c_get_107_82.doStart(context, out);
                _jettag_c_get_107_82.doEnd();
                out.setTag(null,-1,-1);
                out.write(NL);         
                out.write("\t\t\tWHERE ");  //$NON-NLS-1$        
                out.setTag("get",5402,5448);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_108_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_10); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_108_10.setRuntimeParent(_jettag_c_if_106_4);
                _jettag_c_get_108_10.setTagInfo(_td_c_get_108_10);
                _jettag_c_get_108_10.doStart(context, out);
                _jettag_c_get_108_10.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id = \" . $");  //$NON-NLS-1$        
                out.setTag("get",5459,5498);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_108_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_67); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_108_67.setRuntimeParent(_jettag_c_if_106_4);
                _jettag_c_get_108_67.setTagInfo(_td_c_get_108_67);
                _jettag_c_get_108_67.doStart(context, out);
                _jettag_c_get_108_67.doEnd();
                out.setTag(null,-1,-1);
                out.write("->getId()");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t$result = $result && (pg_affected_rows($query) > 0);");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_106_4.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_106_4.doEnd();
            out.endTag("if",321);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_105_3.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_105_3.doEnd();
        out.loopEnd();
        out.endTag("iterate",455);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t$query = pg_query(\"DELETE FROM ");  //$NON-NLS-1$        
        out.setTag("get",5624,5670);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_113_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_113_34); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_113_34.setRuntimeParent(null);
        _jettag_c_get_113_34.setTagInfo(_td_c_get_113_34);
        _jettag_c_get_113_34.doStart(context, out);
        _jettag_c_get_113_34.doEnd();
        out.setTag(null,-1,-1);
        out.write(" WHERE id = \" . $");  //$NON-NLS-1$        
        out.setTag("get",5687,5726);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_113_97 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_113_97); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_113_97.setRuntimeParent(null);
        _jettag_c_get_113_97.setTagInfo(_td_c_get_113_97);
        _jettag_c_get_113_97.doStart(context, out);
        _jettag_c_get_113_97.doEnd();
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
        out.setTag("get",5902,5948);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_125_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_125_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_125_5.setRuntimeParent(null);
        _jettag_c_get_125_5.setTagInfo(_td_c_get_125_5);
        _jettag_c_get_125_5.doStart(context, out);
        _jettag_c_get_125_5.doEnd();
        out.setTag(null,-1,-1);
        out.write(".id AS ");  //$NON-NLS-1$        
        out.setTag("get",5955,6001);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_125_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_125_58); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_125_58.setRuntimeParent(null);
        _jettag_c_get_125_58.setTagInfo(_td_c_get_125_58);
        _jettag_c_get_125_58.doStart(context, out);
        _jettag_c_get_125_58.doEnd();
        out.setTag(null,-1,-1);
        out.write("_id,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(69);
        out.setTag("iterate",6010,6079);
        RuntimeTagElement _jettag_c_iterate_126_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_126_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_126_5.setRuntimeParent(null);
        _jettag_c_iterate_126_5.setTagInfo(_td_c_iterate_126_5);
        _jettag_c_iterate_126_5.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_126_5.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_126_5.getTagInfo().getAttribute("delimiter"),6010,6079);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(125);
            out.setTag("if",6079,6204);
            RuntimeTagElement _jettag_c_if_127_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_127_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_127_6.setRuntimeParent(_jettag_c_iterate_126_5);
            _jettag_c_if_127_6.setTagInfo(_td_c_if_127_6);
            _jettag_c_if_127_6.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_127_6.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",6210,6275);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_128_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_128_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_128_6.setRuntimeParent(_jettag_c_if_127_6);
                _jettag_c_get_128_6.setTagInfo(_td_c_get_128_6);
                _jettag_c_get_128_6.doStart(context, out);
                _jettag_c_get_128_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id AS ");  //$NON-NLS-1$        
                out.setTag("get",6282,6347);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_128_78 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_128_78); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_128_78.setRuntimeParent(_jettag_c_if_127_6);
                _jettag_c_get_128_78.setTagInfo(_td_c_get_128_78);
                _jettag_c_get_128_78.doStart(context, out);
                _jettag_c_get_128_78.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id, ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(107);
                out.setTag("iterate",6352,6459);
                RuntimeTagElement _jettag_c_iterate_128_148 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_128_148); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_128_148.setRuntimeParent(_jettag_c_if_127_6);
                _jettag_c_iterate_128_148.setTagInfo(_td_c_iterate_128_148);
                _jettag_c_iterate_128_148.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_128_148.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_128_148.getTagInfo().getAttribute("delimiter"),6352,6459);
                    out.loopIterate();
                    out.setTag("get",6459,6524);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_129_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_129_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_129_7.setRuntimeParent(_jettag_c_iterate_128_148);
                    _jettag_c_get_129_7.setTagInfo(_td_c_get_129_7);
                    _jettag_c_get_129_7.doStart(context, out);
                    _jettag_c_get_129_7.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",6525,6583);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_129_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_129_73); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_129_73.setRuntimeParent(_jettag_c_iterate_128_148);
                    _jettag_c_get_129_73.setTagInfo(_td_c_get_129_73);
                    _jettag_c_get_129_73.doStart(context, out);
                    _jettag_c_get_129_73.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" AS ");  //$NON-NLS-1$        
                    out.setTag("get",6587,6652);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_129_135 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_129_135); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_129_135.setRuntimeParent(_jettag_c_iterate_128_148);
                    _jettag_c_get_129_135.setTagInfo(_td_c_get_129_135);
                    _jettag_c_get_129_135.doStart(context, out);
                    _jettag_c_get_129_135.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",6653,6711);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_129_201 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_129_201); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_129_201.setRuntimeParent(_jettag_c_iterate_128_148);
                    _jettag_c_get_129_201.setTagInfo(_td_c_get_129_201);
                    _jettag_c_get_129_201.doStart(context, out);
                    _jettag_c_get_129_201.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(",");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_128_148.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_128_148.doEnd();
                out.loopEnd();
                out.endTag("iterate",253);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_127_6.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_127_6.doEnd();
            out.endTag("if",525);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(69);
            out.setTag("if",6736,6805);
            RuntimeTagElement _jettag_c_if_130_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_130_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_130_12.setRuntimeParent(_jettag_c_iterate_126_5);
            _jettag_c_if_130_12.setTagInfo(_td_c_if_130_12);
            _jettag_c_if_130_12.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_130_12.okToProcessBody()) {
                out.setTag("get",6805,6851);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_131_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_131_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_131_6.setRuntimeParent(_jettag_c_if_130_12);
                _jettag_c_get_131_6.setTagInfo(_td_c_get_131_6);
                _jettag_c_get_131_6.doStart(context, out);
                _jettag_c_get_131_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",6852,6892);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_131_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_131_53); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_131_53.setRuntimeParent(_jettag_c_if_130_12);
                _jettag_c_get_131_53.setTagInfo(_td_c_get_131_53);
                _jettag_c_get_131_53.doStart(context, out);
                _jettag_c_get_131_53.doEnd();
                out.setTag(null,-1,-1);
                out.write(" AS ");  //$NON-NLS-1$        
                out.setTag("get",6896,6942);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_131_97 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_131_97); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_131_97.setRuntimeParent(_jettag_c_if_130_12);
                _jettag_c_get_131_97.setTagInfo(_td_c_get_131_97);
                _jettag_c_get_131_97.doStart(context, out);
                _jettag_c_get_131_97.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",6943,6983);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_131_144 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_131_144); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_131_144.setRuntimeParent(_jettag_c_if_130_12);
                _jettag_c_get_131_144.setTagInfo(_td_c_get_131_144);
                _jettag_c_get_131_144.doStart(context, out);
                _jettag_c_get_131_144.doEnd();
                out.setTag(null,-1,-1);
                out.write(",");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_130_12.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_130_12.doEnd();
            out.endTag("if",179);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_126_5.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_126_5.doEnd();
        out.loopEnd();
        out.endTag("iterate",912);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\t\tcreated_at,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tupdate_at");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tFROM ");  //$NON-NLS-1$        
        out.setTag("get",7042,7088);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_134_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_134_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_134_9.setRuntimeParent(null);
        _jettag_c_get_134_9.setTagInfo(_td_c_get_134_9);
        _jettag_c_get_134_9.doStart(context, out);
        _jettag_c_get_134_9.doEnd();
        out.setTag(null,-1,-1);
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(64);
        out.setTag("iterate",7092,7156);
        RuntimeTagElement _jettag_c_iterate_135_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_135_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_135_4.setRuntimeParent(null);
        _jettag_c_iterate_135_4.setTagInfo(_td_c_iterate_135_4);
        _jettag_c_iterate_135_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_135_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_135_4.getTagInfo().getAttribute("delimiter"),7092,7156);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(129);
            out.setTag("if",7156,7285);
            RuntimeTagElement _jettag_c_if_135_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_135_68); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_135_68.setRuntimeParent(_jettag_c_iterate_135_4);
            _jettag_c_if_135_68.setTagInfo(_td_c_if_135_68);
            _jettag_c_if_135_68.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_135_68.okToProcessBody()) {
                out.write("INNER JOIN ");  //$NON-NLS-1$        
                out.setTag("get",7296,7361);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_136_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_136_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_136_16.setRuntimeParent(_jettag_c_if_135_68);
                _jettag_c_get_136_16.setTagInfo(_td_c_get_136_16);
                _jettag_c_get_136_16.doStart(context, out);
                _jettag_c_get_136_16.doEnd();
                out.setTag(null,-1,-1);
                out.write(" ON ");  //$NON-NLS-1$        
                out.setTag("get",7365,7430);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_136_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_136_85); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_136_85.setRuntimeParent(_jettag_c_if_135_68);
                _jettag_c_get_136_85.setTagInfo(_td_c_get_136_85);
                _jettag_c_get_136_85.doStart(context, out);
                _jettag_c_get_136_85.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id = ");  //$NON-NLS-1$        
                out.setTag("get",7436,7482);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_136_156 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_136_156); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_136_156.setRuntimeParent(_jettag_c_if_135_68);
                _jettag_c_get_136_156.setTagInfo(_td_c_get_136_156);
                _jettag_c_get_136_156.doStart(context, out);
                _jettag_c_get_136_156.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",7483,7523);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_136_203 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_136_203); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_136_203.setRuntimeParent(_jettag_c_if_135_68);
                _jettag_c_get_136_203.setTagInfo(_td_c_get_136_203);
                _jettag_c_get_136_203.doStart(context, out);
                _jettag_c_get_136_203.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_c_if_135_68.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_135_68.doEnd();
            out.endTag("if",238);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_135_4.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_135_4.doEnd();
        out.loopEnd();
        out.endTag("iterate",374);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\tORDER BY ");  //$NON-NLS-1$        
        out.setTag("get",7555,7601);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_137_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_137_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_137_13.setRuntimeParent(null);
        _jettag_c_get_137_13.setTagInfo(_td_c_get_137_13);
        _jettag_c_get_137_13.doStart(context, out);
        _jettag_c_get_137_13.doEnd();
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
        out.setTag("get",7676,7715);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_142_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_142_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_142_6.setRuntimeParent(null);
        _jettag_c_get_142_6.setTagInfo(_td_c_get_142_6);
        _jettag_c_get_142_6.doStart(context, out);
        _jettag_c_get_142_6.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = new ");  //$NON-NLS-1$        
        out.setTag("get",7722,7766);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_142_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_142_52); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_142_52.setRuntimeParent(null);
        _jettag_c_get_142_52.setTagInfo(_td_c_get_142_52);
        _jettag_c_get_142_52.doStart(context, out);
        _jettag_c_get_142_52.doEnd();
        out.setTag(null,-1,-1);
        out.write("();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\t\t$");  //$NON-NLS-1$        
        out.setTag("get",7776,7815);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_144_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_144_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_144_6.setRuntimeParent(null);
        _jettag_c_get_144_6.setTagInfo(_td_c_get_144_6);
        _jettag_c_get_144_6.doStart(context, out);
        _jettag_c_get_144_6.doEnd();
        out.setTag(null,-1,-1);
        out.write("->setId($row[\"");  //$NON-NLS-1$        
        out.setTag("get",7829,7875);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_144_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_144_59); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_144_59.setRuntimeParent(null);
        _jettag_c_get_144_59.setTagInfo(_td_c_get_144_59);
        _jettag_c_get_144_59.doStart(context, out);
        _jettag_c_get_144_59.doEnd();
        out.setTag(null,-1,-1);
        out.write("_id\"]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(68);
        out.setTag("iterate",7886,7954);
        RuntimeTagElement _jettag_c_iterate_145_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_145_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_145_4.setRuntimeParent(null);
        _jettag_c_iterate_145_4.setTagInfo(_td_c_iterate_145_4);
        _jettag_c_iterate_145_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_145_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_145_4.getTagInfo().getAttribute("delimiter"),7886,7954);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(125);
            out.setTag("if",7954,8079);
            RuntimeTagElement _jettag_c_if_146_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_146_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_146_5.setRuntimeParent(_jettag_c_iterate_145_4);
            _jettag_c_if_146_5.setTagInfo(_td_c_if_146_5);
            _jettag_c_if_146_5.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_146_5.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",8085,8143);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_147_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_147_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_147_6.setRuntimeParent(_jettag_c_if_146_5);
                _jettag_c_get_147_6.setTagInfo(_td_c_get_147_6);
                _jettag_c_get_147_6.doStart(context, out);
                _jettag_c_get_147_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = new ");  //$NON-NLS-1$        
                out.setTag("get",8150,8213);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(63);
                RuntimeTagElement _jettag_c_get_147_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_147_71); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_147_71.setRuntimeParent(_jettag_c_if_146_5);
                _jettag_c_get_147_71.setTagInfo(_td_c_get_147_71);
                _jettag_c_get_147_71.doStart(context, out);
                _jettag_c_get_147_71.doEnd();
                out.setTag(null,-1,-1);
                out.write("();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",8222,8280);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_148_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_148_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_148_6.setRuntimeParent(_jettag_c_if_146_5);
                _jettag_c_get_148_6.setTagInfo(_td_c_get_148_6);
                _jettag_c_get_148_6.doStart(context, out);
                _jettag_c_get_148_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->setId($row[\"");  //$NON-NLS-1$        
                out.setTag("get",8294,8359);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_148_78 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_148_78); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_148_78.setRuntimeParent(_jettag_c_if_146_5);
                _jettag_c_get_148_78.setTagInfo(_td_c_get_148_78);
                _jettag_c_get_148_78.doStart(context, out);
                _jettag_c_get_148_78.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id\"]);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(106);
                out.setTag("iterate",8371,8477);
                RuntimeTagElement _jettag_c_iterate_149_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_149_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_149_5.setRuntimeParent(_jettag_c_if_146_5);
                _jettag_c_iterate_149_5.setTagInfo(_td_c_iterate_149_5);
                _jettag_c_iterate_149_5.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_149_5.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_149_5.getTagInfo().getAttribute("delimiter"),8371,8477);
                    out.loopIterate();
                    out.write("$");  //$NON-NLS-1$        
                    out.setTag("get",8478,8536);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_150_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_150_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_150_7.setRuntimeParent(_jettag_c_iterate_149_5);
                    _jettag_c_get_150_7.setTagInfo(_td_c_get_150_7);
                    _jettag_c_get_150_7.doStart(context, out);
                    _jettag_c_get_150_7.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->set");  //$NON-NLS-1$        
                    out.setTag("get",8541,8605);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(64);
                    RuntimeTagElement _jettag_c_get_150_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_150_70); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_150_70.setRuntimeParent(_jettag_c_iterate_149_5);
                    _jettag_c_get_150_70.setTagInfo(_td_c_get_150_70);
                    _jettag_c_get_150_70.doStart(context, out);
                    _jettag_c_get_150_70.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("($row[\"");  //$NON-NLS-1$        
                    out.setTag("get",8612,8677);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_150_141 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_150_141); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_150_141.setRuntimeParent(_jettag_c_iterate_149_5);
                    _jettag_c_get_150_141.setTagInfo(_td_c_get_150_141);
                    _jettag_c_get_150_141.doStart(context, out);
                    _jettag_c_get_150_141.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",8678,8736);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_150_207 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_150_207); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_150_207.setRuntimeParent(_jettag_c_iterate_149_5);
                    _jettag_c_get_150_207.setTagInfo(_td_c_get_150_207);
                    _jettag_c_get_150_207.doStart(context, out);
                    _jettag_c_get_150_207.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\"]);");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_149_5.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_149_5.doEnd();
                out.loopEnd();
                out.endTag("iterate",268);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",8763,8802);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_152_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_152_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_152_6.setRuntimeParent(_jettag_c_if_146_5);
                _jettag_c_get_152_6.setTagInfo(_td_c_get_152_6);
                _jettag_c_get_152_6.doStart(context, out);
                _jettag_c_get_152_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->set");  //$NON-NLS-1$        
                out.setTag("get",8807,8853);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_152_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_152_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_152_50.setRuntimeParent(_jettag_c_if_146_5);
                _jettag_c_get_152_50.setTagInfo(_td_c_get_152_50);
                _jettag_c_get_152_50.doStart(context, out);
                _jettag_c_get_152_50.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",8855,8913);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_152_98 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_152_98); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_152_98.setRuntimeParent(_jettag_c_if_146_5);
                _jettag_c_get_152_98.setTagInfo(_td_c_get_152_98);
                _jettag_c_get_152_98.doStart(context, out);
                _jettag_c_get_152_98.doEnd();
                out.setTag(null,-1,-1);
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_146_5.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_146_5.doEnd();
            out.endTag("if",840);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(64);
            out.setTag("if",8926,8990);
            RuntimeTagElement _jettag_c_if_153_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_153_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_153_11.setRuntimeParent(_jettag_c_iterate_145_4);
            _jettag_c_if_153_11.setTagInfo(_td_c_if_153_11);
            _jettag_c_if_153_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_153_11.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",8996,9035);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_154_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_154_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_154_6.setRuntimeParent(_jettag_c_if_153_11);
                _jettag_c_get_154_6.setTagInfo(_td_c_get_154_6);
                _jettag_c_get_154_6.doStart(context, out);
                _jettag_c_get_154_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->set");  //$NON-NLS-1$        
                out.setTag("get",9040,9086);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_154_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_154_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_154_50.setRuntimeParent(_jettag_c_if_153_11);
                _jettag_c_get_154_50.setTagInfo(_td_c_get_154_50);
                _jettag_c_get_154_50.doStart(context, out);
                _jettag_c_get_154_50.doEnd();
                out.setTag(null,-1,-1);
                out.write("($row[\"");  //$NON-NLS-1$        
                out.setTag("get",9093,9139);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_154_103 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_154_103); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_154_103.setRuntimeParent(_jettag_c_if_153_11);
                _jettag_c_get_154_103.setTagInfo(_td_c_get_154_103);
                _jettag_c_get_154_103.doStart(context, out);
                _jettag_c_get_154_103.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",9140,9180);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_154_150 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_154_150); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_154_150.setRuntimeParent(_jettag_c_if_153_11);
                _jettag_c_get_154_150.setTagInfo(_td_c_get_154_150);
                _jettag_c_get_154_150.doStart(context, out);
                _jettag_c_get_154_150.doEnd();
                out.setTag(null,-1,-1);
                out.write("\"]);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_153_11.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_153_11.doEnd();
            out.endTag("if",198);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(124);
            out.setTag("if",9195,9319);
            RuntimeTagElement _jettag_c_if_155_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_155_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_155_11.setRuntimeParent(_jettag_c_iterate_145_4);
            _jettag_c_if_155_11.setTagInfo(_td_c_if_155_11);
            _jettag_c_if_155_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_155_11.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$query_");  //$NON-NLS-1$        
                out.setTag("get",9331,9371);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_156_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_156_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_156_12.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_156_12.setTagInfo(_td_c_get_156_12);
                _jettag_c_get_156_12.doStart(context, out);
                _jettag_c_get_156_12.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = pg_query(\"SELECT");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",9397,9462);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_157_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_157_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_157_7.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_157_7.setTagInfo(_td_c_get_157_7);
                _jettag_c_get_157_7.doStart(context, out);
                _jettag_c_get_157_7.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id AS ");  //$NON-NLS-1$        
                out.setTag("get",9469,9534);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_157_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_157_79); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_157_79.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_157_79.setTagInfo(_td_c_get_157_79);
                _jettag_c_get_157_79.doStart(context, out);
                _jettag_c_get_157_79.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id, ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(108);
                out.setTag("iterate",9539,9647);
                RuntimeTagElement _jettag_c_iterate_157_149 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_157_149); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_157_149.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_iterate_157_149.setTagInfo(_td_c_iterate_157_149);
                _jettag_c_iterate_157_149.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_157_149.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_157_149.getTagInfo().getAttribute("delimiter"),9539,9647);
                    out.loopIterate();
                    out.setTag("get",9647,9712);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_158_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_158_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_158_8.setRuntimeParent(_jettag_c_iterate_157_149);
                    _jettag_c_get_158_8.setTagInfo(_td_c_get_158_8);
                    _jettag_c_get_158_8.doStart(context, out);
                    _jettag_c_get_158_8.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",9713,9771);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_158_74 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_158_74); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_158_74.setRuntimeParent(_jettag_c_iterate_157_149);
                    _jettag_c_get_158_74.setTagInfo(_td_c_get_158_74);
                    _jettag_c_get_158_74.doStart(context, out);
                    _jettag_c_get_158_74.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" AS ");  //$NON-NLS-1$        
                    out.setTag("get",9775,9840);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_158_136 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_158_136); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_158_136.setRuntimeParent(_jettag_c_iterate_157_149);
                    _jettag_c_get_158_136.setTagInfo(_td_c_get_158_136);
                    _jettag_c_get_158_136.doStart(context, out);
                    _jettag_c_get_158_136.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",9841,9899);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_158_202 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_158_202); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_158_202.setRuntimeParent(_jettag_c_iterate_157_149);
                    _jettag_c_get_158_202.setTagInfo(_td_c_get_158_202);
                    _jettag_c_get_158_202.doStart(context, out);
                    _jettag_c_get_158_202.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(",");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_157_149.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_157_149.doEnd();
                out.loopEnd();
                out.endTag("iterate",253);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",9919,9965);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_159_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_159_7.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_159_7.setTagInfo(_td_c_get_159_7);
                _jettag_c_get_159_7.doStart(context, out);
                _jettag_c_get_159_7.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",9966,10031);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_159_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_54); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_159_54.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_159_54.setTagInfo(_td_c_get_159_54);
                _jettag_c_get_159_54.doStart(context, out);
                _jettag_c_get_159_54.doEnd();
                out.setTag(null,-1,-1);
                out.write(".created_at,");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",10050,10096);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_160_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_160_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_160_7.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_160_7.setTagInfo(_td_c_get_160_7);
                _jettag_c_get_160_7.doStart(context, out);
                _jettag_c_get_160_7.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",10097,10162);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_160_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_160_54); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_160_54.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_160_54.setTagInfo(_td_c_get_160_54);
                _jettag_c_get_160_54.doStart(context, out);
                _jettag_c_get_160_54.doEnd();
                out.setTag(null,-1,-1);
                out.write(".update_at");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tFROM ");  //$NON-NLS-1$        
                out.setTag("get",10183,10229);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_161_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_161_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_161_11.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_161_11.setTagInfo(_td_c_get_161_11);
                _jettag_c_get_161_11.doStart(context, out);
                _jettag_c_get_161_11.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",10230,10295);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_161_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_161_58); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_161_58.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_161_58.setTagInfo(_td_c_get_161_58);
                _jettag_c_get_161_58.doStart(context, out);
                _jettag_c_get_161_58.doEnd();
                out.setTag(null,-1,-1);
                out.write(NL);         
                out.write("\t\t\t\t\tINNER JOIN ");  //$NON-NLS-1$        
                out.setTag("get",10312,10377);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_162_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_162_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_162_17.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_162_17.setTagInfo(_td_c_get_162_17);
                _jettag_c_get_162_17.doStart(context, out);
                _jettag_c_get_162_17.doEnd();
                out.setTag(null,-1,-1);
                out.write(" ON ");  //$NON-NLS-1$        
                out.setTag("get",10381,10446);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_162_86 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_162_86); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_162_86.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_162_86.setTagInfo(_td_c_get_162_86);
                _jettag_c_get_162_86.doStart(context, out);
                _jettag_c_get_162_86.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id = ");  //$NON-NLS-1$        
                out.setTag("get",10452,10498);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_162_157 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_162_157); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_162_157.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_162_157.setTagInfo(_td_c_get_162_157);
                _jettag_c_get_162_157.doStart(context, out);
                _jettag_c_get_162_157.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",10499,10564);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_162_204 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_162_204); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_162_204.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_162_204.setTagInfo(_td_c_get_162_204);
                _jettag_c_get_162_204.doStart(context, out);
                _jettag_c_get_162_204.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",10565,10630);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_162_270 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_162_270); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_162_270.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_162_270.setTagInfo(_td_c_get_162_270);
                _jettag_c_get_162_270.doStart(context, out);
                _jettag_c_get_162_270.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tWHERE ");  //$NON-NLS-1$        
                out.setTag("get",10646,10692);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_163_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_163_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_163_12.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_163_12.setTagInfo(_td_c_get_163_12);
                _jettag_c_get_163_12.doStart(context, out);
                _jettag_c_get_163_12.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",10693,10758);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_163_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_163_59); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_163_59.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_163_59.setTagInfo(_td_c_get_163_59);
                _jettag_c_get_163_59.doStart(context, out);
                _jettag_c_get_163_59.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",10759,10805);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_163_125 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_163_125); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_163_125.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_163_125.setTagInfo(_td_c_get_163_125);
                _jettag_c_get_163_125.doStart(context, out);
                _jettag_c_get_163_125.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id = \" . $");  //$NON-NLS-1$        
                out.setTag("get",10816,10855);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_163_182 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_163_182); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_163_182.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_163_182.setTagInfo(_td_c_get_163_182);
                _jettag_c_get_163_182.doStart(context, out);
                _jettag_c_get_163_182.doEnd();
                out.setTag(null,-1,-1);
                out.write("->getId()");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\tif ($query_");  //$NON-NLS-1$        
                out.setTag("get",10892,10932);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_166_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_166_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_166_16.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_166_16.setTagInfo(_td_c_get_166_16);
                _jettag_c_get_166_16.doStart(context, out);
                _jettag_c_get_166_16.doEnd();
                out.setTag(null,-1,-1);
                out.write(") {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\twhile ($row_");  //$NON-NLS-1$        
                out.setTag("get",10953,10993);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_167_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_167_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_167_18.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_167_18.setTagInfo(_td_c_get_167_18);
                _jettag_c_get_167_18.doStart(context, out);
                _jettag_c_get_167_18.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = pg_fetch_assoc($query_");  //$NON-NLS-1$        
                out.setTag("get",11018,11058);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_167_83 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_167_83); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_167_83.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_167_83.setTagInfo(_td_c_get_167_83);
                _jettag_c_get_167_83.doStart(context, out);
                _jettag_c_get_167_83.doEnd();
                out.setTag(null,-1,-1);
                out.write(")) {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",11070,11128);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_168_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_168_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_168_8.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_168_8.setTagInfo(_td_c_get_168_8);
                _jettag_c_get_168_8.doStart(context, out);
                _jettag_c_get_168_8.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = new ");  //$NON-NLS-1$        
                out.setTag("get",11135,11198);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(63);
                RuntimeTagElement _jettag_c_get_168_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_168_73); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_168_73.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_168_73.setTagInfo(_td_c_get_168_73);
                _jettag_c_get_168_73.doStart(context, out);
                _jettag_c_get_168_73.doEnd();
                out.setTag(null,-1,-1);
                out.write("();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",11209,11267);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_169_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_169_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_169_8.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_169_8.setTagInfo(_td_c_get_169_8);
                _jettag_c_get_169_8.doStart(context, out);
                _jettag_c_get_169_8.doEnd();
                out.setTag(null,-1,-1);
                out.write("->setId($row_");  //$NON-NLS-1$        
                out.setTag("get",11280,11320);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_169_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_169_79); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_169_79.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_169_79.setTagInfo(_td_c_get_169_79);
                _jettag_c_get_169_79.doStart(context, out);
                _jettag_c_get_169_79.doEnd();
                out.setTag(null,-1,-1);
                out.write("[\"");  //$NON-NLS-1$        
                out.setTag("get",11322,11387);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_169_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_169_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_169_121.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_169_121.setTagInfo(_td_c_get_169_121);
                _jettag_c_get_169_121.doStart(context, out);
                _jettag_c_get_169_121.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id\"]);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(108);
                out.setTag("iterate",11401,11509);
                RuntimeTagElement _jettag_c_iterate_170_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_170_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_170_7.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_iterate_170_7.setTagInfo(_td_c_iterate_170_7);
                _jettag_c_iterate_170_7.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_170_7.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_170_7.getTagInfo().getAttribute("delimiter"),11401,11509);
                    out.loopIterate();
                    out.write("$");  //$NON-NLS-1$        
                    out.setTag("get",11510,11568);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_171_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_171_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_171_9.setRuntimeParent(_jettag_c_iterate_170_7);
                    _jettag_c_get_171_9.setTagInfo(_td_c_get_171_9);
                    _jettag_c_get_171_9.doStart(context, out);
                    _jettag_c_get_171_9.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->set");  //$NON-NLS-1$        
                    out.setTag("get",11573,11637);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(64);
                    RuntimeTagElement _jettag_c_get_171_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_171_72); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_171_72.setRuntimeParent(_jettag_c_iterate_170_7);
                    _jettag_c_get_171_72.setTagInfo(_td_c_get_171_72);
                    _jettag_c_get_171_72.doStart(context, out);
                    _jettag_c_get_171_72.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("($row_");  //$NON-NLS-1$        
                    out.setTag("get",11643,11683);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_171_142 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_171_142); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_171_142.setRuntimeParent(_jettag_c_iterate_170_7);
                    _jettag_c_get_171_142.setTagInfo(_td_c_get_171_142);
                    _jettag_c_get_171_142.doStart(context, out);
                    _jettag_c_get_171_142.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("[\"");  //$NON-NLS-1$        
                    out.setTag("get",11685,11750);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_171_184 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_171_184); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_171_184.setRuntimeParent(_jettag_c_iterate_170_7);
                    _jettag_c_get_171_184.setTagInfo(_td_c_get_171_184);
                    _jettag_c_get_171_184.doStart(context, out);
                    _jettag_c_get_171_184.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",11751,11809);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_171_250 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_171_250); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_171_250.setRuntimeParent(_jettag_c_iterate_170_7);
                    _jettag_c_get_171_250.setTagInfo(_td_c_get_171_250);
                    _jettag_c_get_171_250.doStart(context, out);
                    _jettag_c_get_171_250.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\"]);");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_170_7.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_170_7.doEnd();
                out.loopEnd();
                out.endTag("iterate",311);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",11840,11879);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_173_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_173_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_173_8.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_173_8.setTagInfo(_td_c_get_173_8);
                _jettag_c_get_173_8.doStart(context, out);
                _jettag_c_get_173_8.doEnd();
                out.setTag(null,-1,-1);
                out.write("->add");  //$NON-NLS-1$        
                out.setTag("get",11884,11930);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_173_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_173_52); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_173_52.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_173_52.setTagInfo(_td_c_get_173_52);
                _jettag_c_get_173_52.doStart(context, out);
                _jettag_c_get_173_52.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",11932,11990);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_173_100 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_173_100); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_173_100.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_173_100.setTagInfo(_td_c_get_173_100);
                _jettag_c_get_173_100.doStart(context, out);
                _jettag_c_get_173_100.doEnd();
                out.setTag(null,-1,-1);
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_155_11.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_155_11.doEnd();
            out.endTag("if",2690);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_145_4.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_145_4.doEnd();
        out.loopEnd();
        out.endTag("iterate",4062);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\t\t$result[] = $");  //$NON-NLS-1$        
        out.setTag("get",12046,12085);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_177_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_177_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_177_18.setRuntimeParent(null);
        _jettag_c_get_177_18.setTagInfo(_td_c_get_177_18);
        _jettag_c_get_177_18.doStart(context, out);
        _jettag_c_get_177_18.doEnd();
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
        out.setTag("get",12141,12180);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_184_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_184_23); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_184_23.setRuntimeParent(null);
        _jettag_c_get_184_23.setTagInfo(_td_c_get_184_23);
        _jettag_c_get_184_23.doStart(context, out);
        _jettag_c_get_184_23.doEnd();
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
        out.setTag("iterate",12224,12288);
        RuntimeTagElement _jettag_c_iterate_190_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_190_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_190_2.setRuntimeParent(null);
        _jettag_c_iterate_190_2.setTagInfo(_td_c_iterate_190_2);
        _jettag_c_iterate_190_2.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_190_2.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_190_2.getTagInfo().getAttribute("delimiter"),12224,12288);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\tif (");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(61);
            out.setTag("if",12295,12356);
            RuntimeTagElement _jettag_c_if_191_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_191_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_191_7.setRuntimeParent(_jettag_c_iterate_190_2);
            _jettag_c_if_191_7.setTagInfo(_td_c_if_191_7);
            _jettag_c_if_191_7.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_191_7.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t(is_array($");  //$NON-NLS-1$        
                out.setTag("get",12371,12410);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_192_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_192_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_192_15.setRuntimeParent(_jettag_c_if_191_7);
                _jettag_c_get_192_15.setTagInfo(_td_c_get_192_15);
                _jettag_c_get_192_15.doStart(context, out);
                _jettag_c_get_192_15.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",12415,12461);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_192_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_192_59); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_192_59.setRuntimeParent(_jettag_c_if_191_7);
                _jettag_c_get_192_59.setTagInfo(_td_c_get_192_59);
                _jettag_c_get_192_59.doStart(context, out);
                _jettag_c_get_192_59.doEnd();
                out.setTag(null,-1,-1);
                out.write("()) && count($");  //$NON-NLS-1$        
                out.setTag("get",12475,12514);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_192_119 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_192_119); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_192_119.setRuntimeParent(_jettag_c_if_191_7);
                _jettag_c_get_192_119.setTagInfo(_td_c_get_192_119);
                _jettag_c_get_192_119.doStart(context, out);
                _jettag_c_get_192_119.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",12519,12565);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_192_163 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_192_163); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_192_163.setRuntimeParent(_jettag_c_if_191_7);
                _jettag_c_get_192_163.setTagInfo(_td_c_get_192_163);
                _jettag_c_get_192_163.doStart(context, out);
                _jettag_c_get_192_163.doEnd();
                out.setTag(null,-1,-1);
                out.write("()) > 0)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t|| (is_object($");  //$NON-NLS-1$        
                out.setTag("get",12592,12631);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_193_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_193_19); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_193_19.setRuntimeParent(_jettag_c_if_191_7);
                _jettag_c_get_193_19.setTagInfo(_td_c_get_193_19);
                _jettag_c_get_193_19.doStart(context, out);
                _jettag_c_get_193_19.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",12636,12682);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_193_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_193_63); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_193_63.setRuntimeParent(_jettag_c_if_191_7);
                _jettag_c_get_193_63.setTagInfo(_td_c_get_193_63);
                _jettag_c_get_193_63.doStart(context, out);
                _jettag_c_get_193_63.doEnd();
                out.setTag(null,-1,-1);
                out.write("()) && $");  //$NON-NLS-1$        
                out.setTag("get",12690,12729);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_193_117 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_193_117); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_193_117.setRuntimeParent(_jettag_c_if_191_7);
                _jettag_c_get_193_117.setTagInfo(_td_c_get_193_117);
                _jettag_c_get_193_117.doStart(context, out);
                _jettag_c_get_193_117.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",12734,12780);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_193_161 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_193_161); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_193_161.setRuntimeParent(_jettag_c_if_191_7);
                _jettag_c_get_193_161.setTagInfo(_td_c_get_193_161);
                _jettag_c_get_193_161.doStart(context, out);
                _jettag_c_get_193_161.doEnd();
                out.setTag(null,-1,-1);
                out.write("()->getId() > 0)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_191_7.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_191_7.doEnd();
            out.endTag("if",443);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(68);
            out.setTag("if",12806,12874);
            RuntimeTagElement _jettag_c_if_194_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_194_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_194_10.setRuntimeParent(_jettag_c_iterate_190_2);
            _jettag_c_if_194_10.setTagInfo(_td_c_if_194_10);
            _jettag_c_if_194_10.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_194_10.okToProcessBody()) {
                out.write("strlen($");  //$NON-NLS-1$        
                out.setTag("get",12882,12921);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_195_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_195_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_195_13.setRuntimeParent(_jettag_c_if_194_10);
                _jettag_c_get_195_13.setTagInfo(_td_c_get_195_13);
                _jettag_c_get_195_13.doStart(context, out);
                _jettag_c_get_195_13.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",12926,12972);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_195_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_195_57); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_195_57.setRuntimeParent(_jettag_c_if_194_10);
                _jettag_c_get_195_57.setTagInfo(_td_c_get_195_57);
                _jettag_c_get_195_57.doStart(context, out);
                _jettag_c_get_195_57.doEnd();
                out.setTag(null,-1,-1);
                out.write("()) > 0");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_194_10.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_194_10.doEnd();
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
            out.setTag("if",13086,13152);
            RuntimeTagElement _jettag_c_if_202_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_202_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_202_4.setRuntimeParent(_jettag_c_iterate_190_2);
            _jettag_c_if_202_4.setTagInfo(_td_c_if_202_4);
            _jettag_c_if_202_4.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_202_4.okToProcessBody()) {
                out.write("if (is_array($");  //$NON-NLS-1$        
                out.setTag("get",13166,13205);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_203_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_203_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_203_20.setRuntimeParent(_jettag_c_if_202_4);
                _jettag_c_get_203_20.setTagInfo(_td_c_get_203_20);
                _jettag_c_get_203_20.doStart(context, out);
                _jettag_c_get_203_20.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",13210,13256);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_203_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_203_64); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_203_64.setRuntimeParent(_jettag_c_if_202_4);
                _jettag_c_get_203_64.setTagInfo(_td_c_get_203_64);
                _jettag_c_get_203_64.doStart(context, out);
                _jettag_c_get_203_64.doEnd();
                out.setTag(null,-1,-1);
                out.write("())) {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t$first = true;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t$where .= \"(\";");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tforeach ($");  //$NON-NLS-1$        
                out.setTag("get",13318,13357);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_206_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_206_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_206_16.setRuntimeParent(_jettag_c_if_202_4);
                _jettag_c_get_206_16.setTagInfo(_td_c_get_206_16);
                _jettag_c_get_206_16.doStart(context, out);
                _jettag_c_get_206_16.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",13362,13408);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_206_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_206_60); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_206_60.setRuntimeParent(_jettag_c_if_202_4);
                _jettag_c_get_206_60.setTagInfo(_td_c_get_206_60);
                _jettag_c_get_206_60.doStart(context, out);
                _jettag_c_get_206_60.doEnd();
                out.setTag(null,-1,-1);
                out.write("() as $");  //$NON-NLS-1$        
                out.setTag("get",13415,13455);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_206_113 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_206_113); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_206_113.setRuntimeParent(_jettag_c_if_202_4);
                _jettag_c_get_206_113.setTagInfo(_td_c_get_206_113);
                _jettag_c_get_206_113.doStart(context, out);
                _jettag_c_get_206_113.doEnd();
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
                out.setTag("if",13522,13602);
                RuntimeTagElement _jettag_c_if_211_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_211_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_211_7.setRuntimeParent(_jettag_c_if_202_4);
                _jettag_c_if_211_7.setTagInfo(_td_c_if_211_7);
                _jettag_c_if_211_7.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_211_7.okToProcessBody()) {
                    out.write("$where .= \"");  //$NON-NLS-1$        
                    out.setTag("get",13613,13659);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_212_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_212_19); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_212_19.setRuntimeParent(_jettag_c_if_211_7);
                    _jettag_c_get_212_19.setTagInfo(_td_c_get_212_19);
                    _jettag_c_get_212_19.doStart(context, out);
                    _jettag_c_get_212_19.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",13660,13700);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_212_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_212_66); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_212_66.setRuntimeParent(_jettag_c_if_211_7);
                    _jettag_c_get_212_66.setTagInfo(_td_c_get_212_66);
                    _jettag_c_get_212_66.doStart(context, out);
                    _jettag_c_get_212_66.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" = \" . $");  //$NON-NLS-1$        
                    out.setTag("get",13708,13748);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_212_114 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_212_114); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_212_114.setRuntimeParent(_jettag_c_if_211_7);
                    _jettag_c_get_212_114.setTagInfo(_td_c_get_212_114);
                    _jettag_c_get_212_114.doStart(context, out);
                    _jettag_c_get_212_114.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->getId();");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_211_7.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_211_7.doEnd();
                out.endTag("if",163);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(77);
                out.setTag("if",13772,13849);
                RuntimeTagElement _jettag_c_if_213_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_213_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_213_14.setRuntimeParent(_jettag_c_if_202_4);
                _jettag_c_if_213_14.setTagInfo(_td_c_if_213_14);
                _jettag_c_if_213_14.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_213_14.okToProcessBody()) {
                    out.write("$where .= \"(");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\tSELECT count(*)");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\tFROM ");  //$NON-NLS-1$        
                    out.setTag("get",13897,13943);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_216_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_216_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_216_13.setRuntimeParent(_jettag_c_if_213_14);
                    _jettag_c_get_216_13.setTagInfo(_td_c_get_216_13);
                    _jettag_c_get_216_13.doStart(context, out);
                    _jettag_c_get_216_13.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",13944,14009);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_216_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_216_60); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_216_60.setRuntimeParent(_jettag_c_if_213_14);
                    _jettag_c_get_216_60.setTagInfo(_td_c_get_216_60);
                    _jettag_c_get_216_60.doStart(context, out);
                    _jettag_c_get_216_60.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\tWHERE");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.setTag("get",14031,14077);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_218_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_218_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_218_9.setRuntimeParent(_jettag_c_if_213_14);
                    _jettag_c_get_218_9.setTagInfo(_td_c_get_218_9);
                    _jettag_c_get_218_9.doStart(context, out);
                    _jettag_c_get_218_9.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",14078,14143);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_218_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_218_56); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_218_56.setRuntimeParent(_jettag_c_if_213_14);
                    _jettag_c_get_218_56.setTagInfo(_td_c_get_218_56);
                    _jettag_c_get_218_56.doStart(context, out);
                    _jettag_c_get_218_56.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",14144,14190);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_218_122 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_218_122); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_218_122.setRuntimeParent(_jettag_c_if_213_14);
                    _jettag_c_get_218_122.setTagInfo(_td_c_get_218_122);
                    _jettag_c_get_218_122.doStart(context, out);
                    _jettag_c_get_218_122.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_id = ");  //$NON-NLS-1$        
                    out.setTag("get",14196,14242);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_218_174 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_218_174); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_218_174.setRuntimeParent(_jettag_c_if_213_14);
                    _jettag_c_get_218_174.setTagInfo(_td_c_get_218_174);
                    _jettag_c_get_218_174.doStart(context, out);
                    _jettag_c_get_218_174.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".id");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\tAND ");  //$NON-NLS-1$        
                    out.setTag("get",14258,14304);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_219_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_219_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_219_13.setRuntimeParent(_jettag_c_if_213_14);
                    _jettag_c_get_219_13.setTagInfo(_td_c_get_219_13);
                    _jettag_c_get_219_13.doStart(context, out);
                    _jettag_c_get_219_13.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",14305,14370);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_219_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_219_60); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_219_60.setRuntimeParent(_jettag_c_if_213_14);
                    _jettag_c_get_219_60.setTagInfo(_td_c_get_219_60);
                    _jettag_c_get_219_60.doStart(context, out);
                    _jettag_c_get_219_60.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",14371,14436);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_219_126 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_219_126); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_219_126.setRuntimeParent(_jettag_c_if_213_14);
                    _jettag_c_get_219_126.setTagInfo(_td_c_get_219_126);
                    _jettag_c_get_219_126.doStart(context, out);
                    _jettag_c_get_219_126.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_id = \" . $");  //$NON-NLS-1$        
                    out.setTag("get",14447,14487);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_219_202 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_219_202); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_219_202.setRuntimeParent(_jettag_c_if_213_14);
                    _jettag_c_get_219_202.setTagInfo(_td_c_get_219_202);
                    _jettag_c_get_219_202.doStart(context, out);
                    _jettag_c_get_219_202.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->getId() . \"");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t) > 0\";");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_213_14.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_213_14.doEnd();
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
                out.setTag("get",14607,14653);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_226_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_226_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_226_17.setRuntimeParent(_jettag_c_if_202_4);
                _jettag_c_get_226_17.setTagInfo(_td_c_get_226_17);
                _jettag_c_get_226_17.doStart(context, out);
                _jettag_c_get_226_17.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",14654,14694);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_226_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_226_64); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_226_64.setRuntimeParent(_jettag_c_if_202_4);
                _jettag_c_get_226_64.setTagInfo(_td_c_get_226_64);
                _jettag_c_get_226_64.doStart(context, out);
                _jettag_c_get_226_64.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = \" . $");  //$NON-NLS-1$        
                out.setTag("get",14702,14741);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_226_112 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_226_112); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_226_112.setRuntimeParent(_jettag_c_if_202_4);
                _jettag_c_get_226_112.setTagInfo(_td_c_get_226_112);
                _jettag_c_get_226_112.doStart(context, out);
                _jettag_c_get_226_112.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",14746,14792);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_226_156 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_226_156); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_226_156.setRuntimeParent(_jettag_c_if_202_4);
                _jettag_c_get_226_156.setTagInfo(_td_c_get_226_156);
                _jettag_c_get_226_156.doStart(context, out);
                _jettag_c_get_226_156.doEnd();
                out.setTag(null,-1,-1);
                out.write("()->getId();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_202_4.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_202_4.doEnd();
            out.endTag("if",1662);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(69);
            out.setTag("if",14821,14890);
            RuntimeTagElement _jettag_c_if_228_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_228_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_228_11.setRuntimeParent(_jettag_c_iterate_190_2);
            _jettag_c_if_228_11.setTagInfo(_td_c_if_228_11);
            _jettag_c_if_228_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_228_11.okToProcessBody()) {
                out.write("$where .= \"");  //$NON-NLS-1$        
                out.setTag("get",14901,14947);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_229_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_229_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_229_17.setRuntimeParent(_jettag_c_if_228_11);
                _jettag_c_get_229_17.setTagInfo(_td_c_get_229_17);
                _jettag_c_get_229_17.doStart(context, out);
                _jettag_c_get_229_17.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",14948,14988);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_229_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_229_64); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_229_64.setRuntimeParent(_jettag_c_if_228_11);
                _jettag_c_get_229_64.setTagInfo(_td_c_get_229_64);
                _jettag_c_get_229_64.doStart(context, out);
                _jettag_c_get_229_64.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = '\" . $");  //$NON-NLS-1$        
                out.setTag("get",14997,15036);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_229_113 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_229_113); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_229_113.setRuntimeParent(_jettag_c_if_228_11);
                _jettag_c_get_229_113.setTagInfo(_td_c_get_229_113);
                _jettag_c_get_229_113.doStart(context, out);
                _jettag_c_get_229_113.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",15041,15087);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_229_157 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_229_157); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_229_157.setRuntimeParent(_jettag_c_if_228_11);
                _jettag_c_get_229_157.setTagInfo(_td_c_get_229_157);
                _jettag_c_get_229_157.doStart(context, out);
                _jettag_c_get_229_157.doEnd();
                out.setTag(null,-1,-1);
                out.write("() . \"'\";");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_228_11.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_228_11.doEnd();
            out.endTag("if",210);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("\t\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_190_2.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_190_2.doEnd();
        out.loopEnd();
        out.endTag("iterate",2825);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t$query = pg_query(\"SELECT");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.setTag("get",15158,15204);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_234_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_234_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_234_5.setRuntimeParent(null);
        _jettag_c_get_234_5.setTagInfo(_td_c_get_234_5);
        _jettag_c_get_234_5.doStart(context, out);
        _jettag_c_get_234_5.doEnd();
        out.setTag(null,-1,-1);
        out.write(".id AS ");  //$NON-NLS-1$        
        out.setTag("get",15211,15257);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_234_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_234_58); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_234_58.setRuntimeParent(null);
        _jettag_c_get_234_58.setTagInfo(_td_c_get_234_58);
        _jettag_c_get_234_58.doStart(context, out);
        _jettag_c_get_234_58.doEnd();
        out.setTag(null,-1,-1);
        out.write("_id,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(69);
        out.setTag("iterate",15266,15335);
        RuntimeTagElement _jettag_c_iterate_235_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_235_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_235_5.setRuntimeParent(null);
        _jettag_c_iterate_235_5.setTagInfo(_td_c_iterate_235_5);
        _jettag_c_iterate_235_5.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_235_5.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_235_5.getTagInfo().getAttribute("delimiter"),15266,15335);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(125);
            out.setTag("if",15335,15460);
            RuntimeTagElement _jettag_c_if_236_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_236_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_236_6.setRuntimeParent(_jettag_c_iterate_235_5);
            _jettag_c_if_236_6.setTagInfo(_td_c_if_236_6);
            _jettag_c_if_236_6.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_236_6.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",15466,15531);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_237_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_237_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_237_6.setRuntimeParent(_jettag_c_if_236_6);
                _jettag_c_get_237_6.setTagInfo(_td_c_get_237_6);
                _jettag_c_get_237_6.doStart(context, out);
                _jettag_c_get_237_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id AS ");  //$NON-NLS-1$        
                out.setTag("get",15538,15603);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_237_78 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_237_78); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_237_78.setRuntimeParent(_jettag_c_if_236_6);
                _jettag_c_get_237_78.setTagInfo(_td_c_get_237_78);
                _jettag_c_get_237_78.doStart(context, out);
                _jettag_c_get_237_78.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id, ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(107);
                out.setTag("iterate",15608,15715);
                RuntimeTagElement _jettag_c_iterate_237_148 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_237_148); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_237_148.setRuntimeParent(_jettag_c_if_236_6);
                _jettag_c_iterate_237_148.setTagInfo(_td_c_iterate_237_148);
                _jettag_c_iterate_237_148.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_237_148.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_237_148.getTagInfo().getAttribute("delimiter"),15608,15715);
                    out.loopIterate();
                    out.setTag("get",15715,15780);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_238_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_238_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_238_7.setRuntimeParent(_jettag_c_iterate_237_148);
                    _jettag_c_get_238_7.setTagInfo(_td_c_get_238_7);
                    _jettag_c_get_238_7.doStart(context, out);
                    _jettag_c_get_238_7.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",15781,15839);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_238_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_238_73); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_238_73.setRuntimeParent(_jettag_c_iterate_237_148);
                    _jettag_c_get_238_73.setTagInfo(_td_c_get_238_73);
                    _jettag_c_get_238_73.doStart(context, out);
                    _jettag_c_get_238_73.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" AS ");  //$NON-NLS-1$        
                    out.setTag("get",15843,15908);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_238_135 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_238_135); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_238_135.setRuntimeParent(_jettag_c_iterate_237_148);
                    _jettag_c_get_238_135.setTagInfo(_td_c_get_238_135);
                    _jettag_c_get_238_135.doStart(context, out);
                    _jettag_c_get_238_135.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",15909,15967);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_238_201 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_238_201); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_238_201.setRuntimeParent(_jettag_c_iterate_237_148);
                    _jettag_c_get_238_201.setTagInfo(_td_c_get_238_201);
                    _jettag_c_get_238_201.doStart(context, out);
                    _jettag_c_get_238_201.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(",");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_237_148.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_237_148.doEnd();
                out.loopEnd();
                out.endTag("iterate",253);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_236_6.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_236_6.doEnd();
            out.endTag("if",525);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(69);
            out.setTag("if",15992,16061);
            RuntimeTagElement _jettag_c_if_239_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_239_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_239_12.setRuntimeParent(_jettag_c_iterate_235_5);
            _jettag_c_if_239_12.setTagInfo(_td_c_if_239_12);
            _jettag_c_if_239_12.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_239_12.okToProcessBody()) {
                out.setTag("get",16061,16107);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_240_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_240_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_240_6.setRuntimeParent(_jettag_c_if_239_12);
                _jettag_c_get_240_6.setTagInfo(_td_c_get_240_6);
                _jettag_c_get_240_6.doStart(context, out);
                _jettag_c_get_240_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",16108,16148);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_240_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_240_53); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_240_53.setRuntimeParent(_jettag_c_if_239_12);
                _jettag_c_get_240_53.setTagInfo(_td_c_get_240_53);
                _jettag_c_get_240_53.doStart(context, out);
                _jettag_c_get_240_53.doEnd();
                out.setTag(null,-1,-1);
                out.write(" AS ");  //$NON-NLS-1$        
                out.setTag("get",16152,16198);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_240_97 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_240_97); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_240_97.setRuntimeParent(_jettag_c_if_239_12);
                _jettag_c_get_240_97.setTagInfo(_td_c_get_240_97);
                _jettag_c_get_240_97.doStart(context, out);
                _jettag_c_get_240_97.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",16199,16239);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_240_144 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_240_144); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_240_144.setRuntimeParent(_jettag_c_if_239_12);
                _jettag_c_get_240_144.setTagInfo(_td_c_get_240_144);
                _jettag_c_get_240_144.doStart(context, out);
                _jettag_c_get_240_144.doEnd();
                out.setTag(null,-1,-1);
                out.write(",");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_239_12.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_239_12.doEnd();
            out.endTag("if",179);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_235_5.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_235_5.doEnd();
        out.loopEnd();
        out.endTag("iterate",912);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\t\tcreated_at,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tupdate_at");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tFROM ");  //$NON-NLS-1$        
        out.setTag("get",16298,16344);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_243_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_243_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_243_9.setRuntimeParent(null);
        _jettag_c_get_243_9.setTagInfo(_td_c_get_243_9);
        _jettag_c_get_243_9.doStart(context, out);
        _jettag_c_get_243_9.doEnd();
        out.setTag(null,-1,-1);
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(64);
        out.setTag("iterate",16348,16412);
        RuntimeTagElement _jettag_c_iterate_244_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_244_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_244_4.setRuntimeParent(null);
        _jettag_c_iterate_244_4.setTagInfo(_td_c_iterate_244_4);
        _jettag_c_iterate_244_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_244_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_244_4.getTagInfo().getAttribute("delimiter"),16348,16412);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(129);
            out.setTag("if",16412,16541);
            RuntimeTagElement _jettag_c_if_244_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_244_68); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_244_68.setRuntimeParent(_jettag_c_iterate_244_4);
            _jettag_c_if_244_68.setTagInfo(_td_c_if_244_68);
            _jettag_c_if_244_68.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_244_68.okToProcessBody()) {
                out.write("INNER JOIN ");  //$NON-NLS-1$        
                out.setTag("get",16552,16617);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_245_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_245_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_245_16.setRuntimeParent(_jettag_c_if_244_68);
                _jettag_c_get_245_16.setTagInfo(_td_c_get_245_16);
                _jettag_c_get_245_16.doStart(context, out);
                _jettag_c_get_245_16.doEnd();
                out.setTag(null,-1,-1);
                out.write(" ON ");  //$NON-NLS-1$        
                out.setTag("get",16621,16686);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_245_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_245_85); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_245_85.setRuntimeParent(_jettag_c_if_244_68);
                _jettag_c_get_245_85.setTagInfo(_td_c_get_245_85);
                _jettag_c_get_245_85.doStart(context, out);
                _jettag_c_get_245_85.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id = ");  //$NON-NLS-1$        
                out.setTag("get",16692,16738);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_245_156 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_245_156); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_245_156.setRuntimeParent(_jettag_c_if_244_68);
                _jettag_c_get_245_156.setTagInfo(_td_c_get_245_156);
                _jettag_c_get_245_156.doStart(context, out);
                _jettag_c_get_245_156.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",16739,16779);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_245_203 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_245_203); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_245_203.setRuntimeParent(_jettag_c_if_244_68);
                _jettag_c_get_245_203.setTagInfo(_td_c_get_245_203);
                _jettag_c_get_245_203.doStart(context, out);
                _jettag_c_get_245_203.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_c_if_244_68.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_244_68.doEnd();
            out.endTag("if",238);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_244_4.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_244_4.doEnd();
        out.loopEnd();
        out.endTag("iterate",374);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\" . $where . \"ORDER BY ");  //$NON-NLS-1$        
        out.setTag("get",16824,16870);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_246_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_246_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_246_26.setRuntimeParent(null);
        _jettag_c_get_246_26.setTagInfo(_td_c_get_246_26);
        _jettag_c_get_246_26.doStart(context, out);
        _jettag_c_get_246_26.doEnd();
        out.setTag(null,-1,-1);
        out.write(".id\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tif ($query) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\twhile ($row = pg_fetch_assoc($query)) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t$");  //$NON-NLS-1$        
        out.setTag("get",16942,16981);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_250_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_250_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_250_6.setRuntimeParent(null);
        _jettag_c_get_250_6.setTagInfo(_td_c_get_250_6);
        _jettag_c_get_250_6.doStart(context, out);
        _jettag_c_get_250_6.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = new ");  //$NON-NLS-1$        
        out.setTag("get",16988,17032);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_250_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_250_52); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_250_52.setRuntimeParent(null);
        _jettag_c_get_250_52.setTagInfo(_td_c_get_250_52);
        _jettag_c_get_250_52.doStart(context, out);
        _jettag_c_get_250_52.doEnd();
        out.setTag(null,-1,-1);
        out.write("();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\t\t$");  //$NON-NLS-1$        
        out.setTag("get",17042,17081);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_252_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_252_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_252_6.setRuntimeParent(null);
        _jettag_c_get_252_6.setTagInfo(_td_c_get_252_6);
        _jettag_c_get_252_6.doStart(context, out);
        _jettag_c_get_252_6.doEnd();
        out.setTag(null,-1,-1);
        out.write("->setId($row[\"");  //$NON-NLS-1$        
        out.setTag("get",17095,17141);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_252_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_252_59); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_252_59.setRuntimeParent(null);
        _jettag_c_get_252_59.setTagInfo(_td_c_get_252_59);
        _jettag_c_get_252_59.doStart(context, out);
        _jettag_c_get_252_59.doEnd();
        out.setTag(null,-1,-1);
        out.write("_id\"]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(68);
        out.setTag("iterate",17152,17220);
        RuntimeTagElement _jettag_c_iterate_253_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_253_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_253_4.setRuntimeParent(null);
        _jettag_c_iterate_253_4.setTagInfo(_td_c_iterate_253_4);
        _jettag_c_iterate_253_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_253_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_253_4.getTagInfo().getAttribute("delimiter"),17152,17220);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(125);
            out.setTag("if",17220,17345);
            RuntimeTagElement _jettag_c_if_254_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_254_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_254_5.setRuntimeParent(_jettag_c_iterate_253_4);
            _jettag_c_if_254_5.setTagInfo(_td_c_if_254_5);
            _jettag_c_if_254_5.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_254_5.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",17351,17409);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_255_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_255_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_255_6.setRuntimeParent(_jettag_c_if_254_5);
                _jettag_c_get_255_6.setTagInfo(_td_c_get_255_6);
                _jettag_c_get_255_6.doStart(context, out);
                _jettag_c_get_255_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = new ");  //$NON-NLS-1$        
                out.setTag("get",17416,17479);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(63);
                RuntimeTagElement _jettag_c_get_255_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_255_71); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_255_71.setRuntimeParent(_jettag_c_if_254_5);
                _jettag_c_get_255_71.setTagInfo(_td_c_get_255_71);
                _jettag_c_get_255_71.doStart(context, out);
                _jettag_c_get_255_71.doEnd();
                out.setTag(null,-1,-1);
                out.write("();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",17488,17546);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_256_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_256_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_256_6.setRuntimeParent(_jettag_c_if_254_5);
                _jettag_c_get_256_6.setTagInfo(_td_c_get_256_6);
                _jettag_c_get_256_6.doStart(context, out);
                _jettag_c_get_256_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->setId($row[\"");  //$NON-NLS-1$        
                out.setTag("get",17560,17625);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_256_78 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_256_78); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_256_78.setRuntimeParent(_jettag_c_if_254_5);
                _jettag_c_get_256_78.setTagInfo(_td_c_get_256_78);
                _jettag_c_get_256_78.doStart(context, out);
                _jettag_c_get_256_78.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id\"]);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(106);
                out.setTag("iterate",17637,17743);
                RuntimeTagElement _jettag_c_iterate_257_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_257_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_257_5.setRuntimeParent(_jettag_c_if_254_5);
                _jettag_c_iterate_257_5.setTagInfo(_td_c_iterate_257_5);
                _jettag_c_iterate_257_5.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_257_5.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_257_5.getTagInfo().getAttribute("delimiter"),17637,17743);
                    out.loopIterate();
                    out.write("$");  //$NON-NLS-1$        
                    out.setTag("get",17744,17802);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_258_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_258_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_258_7.setRuntimeParent(_jettag_c_iterate_257_5);
                    _jettag_c_get_258_7.setTagInfo(_td_c_get_258_7);
                    _jettag_c_get_258_7.doStart(context, out);
                    _jettag_c_get_258_7.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->set");  //$NON-NLS-1$        
                    out.setTag("get",17807,17871);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(64);
                    RuntimeTagElement _jettag_c_get_258_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_258_70); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_258_70.setRuntimeParent(_jettag_c_iterate_257_5);
                    _jettag_c_get_258_70.setTagInfo(_td_c_get_258_70);
                    _jettag_c_get_258_70.doStart(context, out);
                    _jettag_c_get_258_70.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("($row[\"");  //$NON-NLS-1$        
                    out.setTag("get",17878,17943);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_258_141 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_258_141); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_258_141.setRuntimeParent(_jettag_c_iterate_257_5);
                    _jettag_c_get_258_141.setTagInfo(_td_c_get_258_141);
                    _jettag_c_get_258_141.doStart(context, out);
                    _jettag_c_get_258_141.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",17944,18002);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_258_207 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_258_207); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_258_207.setRuntimeParent(_jettag_c_iterate_257_5);
                    _jettag_c_get_258_207.setTagInfo(_td_c_get_258_207);
                    _jettag_c_get_258_207.doStart(context, out);
                    _jettag_c_get_258_207.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\"]);");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_257_5.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_257_5.doEnd();
                out.loopEnd();
                out.endTag("iterate",268);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",18029,18068);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_260_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_260_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_260_6.setRuntimeParent(_jettag_c_if_254_5);
                _jettag_c_get_260_6.setTagInfo(_td_c_get_260_6);
                _jettag_c_get_260_6.doStart(context, out);
                _jettag_c_get_260_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->set");  //$NON-NLS-1$        
                out.setTag("get",18073,18119);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_260_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_260_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_260_50.setRuntimeParent(_jettag_c_if_254_5);
                _jettag_c_get_260_50.setTagInfo(_td_c_get_260_50);
                _jettag_c_get_260_50.doStart(context, out);
                _jettag_c_get_260_50.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",18121,18179);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_260_98 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_260_98); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_260_98.setRuntimeParent(_jettag_c_if_254_5);
                _jettag_c_get_260_98.setTagInfo(_td_c_get_260_98);
                _jettag_c_get_260_98.doStart(context, out);
                _jettag_c_get_260_98.doEnd();
                out.setTag(null,-1,-1);
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_254_5.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_254_5.doEnd();
            out.endTag("if",840);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(64);
            out.setTag("if",18192,18256);
            RuntimeTagElement _jettag_c_if_261_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_261_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_261_11.setRuntimeParent(_jettag_c_iterate_253_4);
            _jettag_c_if_261_11.setTagInfo(_td_c_if_261_11);
            _jettag_c_if_261_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_261_11.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",18262,18301);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_262_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_262_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_262_6.setRuntimeParent(_jettag_c_if_261_11);
                _jettag_c_get_262_6.setTagInfo(_td_c_get_262_6);
                _jettag_c_get_262_6.doStart(context, out);
                _jettag_c_get_262_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->set");  //$NON-NLS-1$        
                out.setTag("get",18306,18352);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_262_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_262_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_262_50.setRuntimeParent(_jettag_c_if_261_11);
                _jettag_c_get_262_50.setTagInfo(_td_c_get_262_50);
                _jettag_c_get_262_50.doStart(context, out);
                _jettag_c_get_262_50.doEnd();
                out.setTag(null,-1,-1);
                out.write("($row[\"");  //$NON-NLS-1$        
                out.setTag("get",18359,18405);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_262_103 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_262_103); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_262_103.setRuntimeParent(_jettag_c_if_261_11);
                _jettag_c_get_262_103.setTagInfo(_td_c_get_262_103);
                _jettag_c_get_262_103.doStart(context, out);
                _jettag_c_get_262_103.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",18406,18446);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_262_150 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_262_150); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_262_150.setRuntimeParent(_jettag_c_if_261_11);
                _jettag_c_get_262_150.setTagInfo(_td_c_get_262_150);
                _jettag_c_get_262_150.doStart(context, out);
                _jettag_c_get_262_150.doEnd();
                out.setTag(null,-1,-1);
                out.write("\"]);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_261_11.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_261_11.doEnd();
            out.endTag("if",198);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(124);
            out.setTag("if",18461,18585);
            RuntimeTagElement _jettag_c_if_263_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_263_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_263_11.setRuntimeParent(_jettag_c_iterate_253_4);
            _jettag_c_if_263_11.setTagInfo(_td_c_if_263_11);
            _jettag_c_if_263_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_263_11.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$query_");  //$NON-NLS-1$        
                out.setTag("get",18597,18637);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_264_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_264_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_264_12.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_264_12.setTagInfo(_td_c_get_264_12);
                _jettag_c_get_264_12.doStart(context, out);
                _jettag_c_get_264_12.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = pg_query(\"SELECT");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",18663,18728);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_265_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_265_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_265_7.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_265_7.setTagInfo(_td_c_get_265_7);
                _jettag_c_get_265_7.doStart(context, out);
                _jettag_c_get_265_7.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id AS ");  //$NON-NLS-1$        
                out.setTag("get",18735,18800);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_265_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_265_79); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_265_79.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_265_79.setTagInfo(_td_c_get_265_79);
                _jettag_c_get_265_79.doStart(context, out);
                _jettag_c_get_265_79.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id, ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(108);
                out.setTag("iterate",18805,18913);
                RuntimeTagElement _jettag_c_iterate_265_149 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_265_149); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_265_149.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_iterate_265_149.setTagInfo(_td_c_iterate_265_149);
                _jettag_c_iterate_265_149.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_265_149.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_265_149.getTagInfo().getAttribute("delimiter"),18805,18913);
                    out.loopIterate();
                    out.setTag("get",18913,18978);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_266_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_266_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_266_8.setRuntimeParent(_jettag_c_iterate_265_149);
                    _jettag_c_get_266_8.setTagInfo(_td_c_get_266_8);
                    _jettag_c_get_266_8.doStart(context, out);
                    _jettag_c_get_266_8.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",18979,19037);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_266_74 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_266_74); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_266_74.setRuntimeParent(_jettag_c_iterate_265_149);
                    _jettag_c_get_266_74.setTagInfo(_td_c_get_266_74);
                    _jettag_c_get_266_74.doStart(context, out);
                    _jettag_c_get_266_74.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" AS ");  //$NON-NLS-1$        
                    out.setTag("get",19041,19106);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_266_136 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_266_136); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_266_136.setRuntimeParent(_jettag_c_iterate_265_149);
                    _jettag_c_get_266_136.setTagInfo(_td_c_get_266_136);
                    _jettag_c_get_266_136.doStart(context, out);
                    _jettag_c_get_266_136.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",19107,19165);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_266_202 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_266_202); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_266_202.setRuntimeParent(_jettag_c_iterate_265_149);
                    _jettag_c_get_266_202.setTagInfo(_td_c_get_266_202);
                    _jettag_c_get_266_202.doStart(context, out);
                    _jettag_c_get_266_202.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(",");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_265_149.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_265_149.doEnd();
                out.loopEnd();
                out.endTag("iterate",253);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",19185,19231);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_267_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_267_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_267_7.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_267_7.setTagInfo(_td_c_get_267_7);
                _jettag_c_get_267_7.doStart(context, out);
                _jettag_c_get_267_7.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",19232,19297);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_267_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_267_54); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_267_54.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_267_54.setTagInfo(_td_c_get_267_54);
                _jettag_c_get_267_54.doStart(context, out);
                _jettag_c_get_267_54.doEnd();
                out.setTag(null,-1,-1);
                out.write(".created_at,");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",19316,19362);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_268_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_268_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_268_7.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_268_7.setTagInfo(_td_c_get_268_7);
                _jettag_c_get_268_7.doStart(context, out);
                _jettag_c_get_268_7.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",19363,19428);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_268_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_268_54); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_268_54.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_268_54.setTagInfo(_td_c_get_268_54);
                _jettag_c_get_268_54.doStart(context, out);
                _jettag_c_get_268_54.doEnd();
                out.setTag(null,-1,-1);
                out.write(".update_at");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tFROM ");  //$NON-NLS-1$        
                out.setTag("get",19449,19495);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_269_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_269_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_269_11.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_269_11.setTagInfo(_td_c_get_269_11);
                _jettag_c_get_269_11.doStart(context, out);
                _jettag_c_get_269_11.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",19496,19561);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_269_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_269_58); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_269_58.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_269_58.setTagInfo(_td_c_get_269_58);
                _jettag_c_get_269_58.doStart(context, out);
                _jettag_c_get_269_58.doEnd();
                out.setTag(null,-1,-1);
                out.write(NL);         
                out.write("\t\t\t\t\tINNER JOIN ");  //$NON-NLS-1$        
                out.setTag("get",19578,19643);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_270_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_270_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_270_17.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_270_17.setTagInfo(_td_c_get_270_17);
                _jettag_c_get_270_17.doStart(context, out);
                _jettag_c_get_270_17.doEnd();
                out.setTag(null,-1,-1);
                out.write(" ON ");  //$NON-NLS-1$        
                out.setTag("get",19647,19712);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_270_86 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_270_86); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_270_86.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_270_86.setTagInfo(_td_c_get_270_86);
                _jettag_c_get_270_86.doStart(context, out);
                _jettag_c_get_270_86.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id = ");  //$NON-NLS-1$        
                out.setTag("get",19718,19764);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_270_157 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_270_157); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_270_157.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_270_157.setTagInfo(_td_c_get_270_157);
                _jettag_c_get_270_157.doStart(context, out);
                _jettag_c_get_270_157.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",19765,19830);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_270_204 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_270_204); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_270_204.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_270_204.setTagInfo(_td_c_get_270_204);
                _jettag_c_get_270_204.doStart(context, out);
                _jettag_c_get_270_204.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",19831,19896);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_270_270 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_270_270); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_270_270.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_270_270.setTagInfo(_td_c_get_270_270);
                _jettag_c_get_270_270.doStart(context, out);
                _jettag_c_get_270_270.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tWHERE ");  //$NON-NLS-1$        
                out.setTag("get",19912,19958);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_271_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_271_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_271_12.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_271_12.setTagInfo(_td_c_get_271_12);
                _jettag_c_get_271_12.doStart(context, out);
                _jettag_c_get_271_12.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",19959,20024);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_271_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_271_59); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_271_59.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_271_59.setTagInfo(_td_c_get_271_59);
                _jettag_c_get_271_59.doStart(context, out);
                _jettag_c_get_271_59.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",20025,20071);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_271_125 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_271_125); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_271_125.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_271_125.setTagInfo(_td_c_get_271_125);
                _jettag_c_get_271_125.doStart(context, out);
                _jettag_c_get_271_125.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id = \" . $");  //$NON-NLS-1$        
                out.setTag("get",20082,20121);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_271_182 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_271_182); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_271_182.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_271_182.setTagInfo(_td_c_get_271_182);
                _jettag_c_get_271_182.doStart(context, out);
                _jettag_c_get_271_182.doEnd();
                out.setTag(null,-1,-1);
                out.write("->getId()");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\tif ($query_");  //$NON-NLS-1$        
                out.setTag("get",20158,20198);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_274_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_274_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_274_16.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_274_16.setTagInfo(_td_c_get_274_16);
                _jettag_c_get_274_16.doStart(context, out);
                _jettag_c_get_274_16.doEnd();
                out.setTag(null,-1,-1);
                out.write(") {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\twhile ($row_");  //$NON-NLS-1$        
                out.setTag("get",20219,20259);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_275_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_275_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_275_18.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_275_18.setTagInfo(_td_c_get_275_18);
                _jettag_c_get_275_18.doStart(context, out);
                _jettag_c_get_275_18.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = pg_fetch_assoc($query_");  //$NON-NLS-1$        
                out.setTag("get",20284,20324);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_275_83 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_275_83); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_275_83.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_275_83.setTagInfo(_td_c_get_275_83);
                _jettag_c_get_275_83.doStart(context, out);
                _jettag_c_get_275_83.doEnd();
                out.setTag(null,-1,-1);
                out.write(")) {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",20336,20394);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_276_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_276_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_276_8.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_276_8.setTagInfo(_td_c_get_276_8);
                _jettag_c_get_276_8.doStart(context, out);
                _jettag_c_get_276_8.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = new ");  //$NON-NLS-1$        
                out.setTag("get",20401,20464);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(63);
                RuntimeTagElement _jettag_c_get_276_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_276_73); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_276_73.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_276_73.setTagInfo(_td_c_get_276_73);
                _jettag_c_get_276_73.doStart(context, out);
                _jettag_c_get_276_73.doEnd();
                out.setTag(null,-1,-1);
                out.write("();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",20475,20533);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_277_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_277_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_277_8.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_277_8.setTagInfo(_td_c_get_277_8);
                _jettag_c_get_277_8.doStart(context, out);
                _jettag_c_get_277_8.doEnd();
                out.setTag(null,-1,-1);
                out.write("->setId($row_");  //$NON-NLS-1$        
                out.setTag("get",20546,20586);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_277_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_277_79); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_277_79.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_277_79.setTagInfo(_td_c_get_277_79);
                _jettag_c_get_277_79.doStart(context, out);
                _jettag_c_get_277_79.doEnd();
                out.setTag(null,-1,-1);
                out.write("[\"");  //$NON-NLS-1$        
                out.setTag("get",20588,20653);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_277_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_277_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_277_121.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_277_121.setTagInfo(_td_c_get_277_121);
                _jettag_c_get_277_121.doStart(context, out);
                _jettag_c_get_277_121.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id\"]);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(108);
                out.setTag("iterate",20667,20775);
                RuntimeTagElement _jettag_c_iterate_278_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_278_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_278_7.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_iterate_278_7.setTagInfo(_td_c_iterate_278_7);
                _jettag_c_iterate_278_7.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_278_7.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_278_7.getTagInfo().getAttribute("delimiter"),20667,20775);
                    out.loopIterate();
                    out.write("$");  //$NON-NLS-1$        
                    out.setTag("get",20776,20834);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_279_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_279_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_279_9.setRuntimeParent(_jettag_c_iterate_278_7);
                    _jettag_c_get_279_9.setTagInfo(_td_c_get_279_9);
                    _jettag_c_get_279_9.doStart(context, out);
                    _jettag_c_get_279_9.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->set");  //$NON-NLS-1$        
                    out.setTag("get",20839,20903);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(64);
                    RuntimeTagElement _jettag_c_get_279_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_279_72); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_279_72.setRuntimeParent(_jettag_c_iterate_278_7);
                    _jettag_c_get_279_72.setTagInfo(_td_c_get_279_72);
                    _jettag_c_get_279_72.doStart(context, out);
                    _jettag_c_get_279_72.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("($row_");  //$NON-NLS-1$        
                    out.setTag("get",20909,20949);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_279_142 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_279_142); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_279_142.setRuntimeParent(_jettag_c_iterate_278_7);
                    _jettag_c_get_279_142.setTagInfo(_td_c_get_279_142);
                    _jettag_c_get_279_142.doStart(context, out);
                    _jettag_c_get_279_142.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("[\"");  //$NON-NLS-1$        
                    out.setTag("get",20951,21016);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_279_184 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_279_184); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_279_184.setRuntimeParent(_jettag_c_iterate_278_7);
                    _jettag_c_get_279_184.setTagInfo(_td_c_get_279_184);
                    _jettag_c_get_279_184.doStart(context, out);
                    _jettag_c_get_279_184.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",21017,21075);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_279_250 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_279_250); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_279_250.setRuntimeParent(_jettag_c_iterate_278_7);
                    _jettag_c_get_279_250.setTagInfo(_td_c_get_279_250);
                    _jettag_c_get_279_250.doStart(context, out);
                    _jettag_c_get_279_250.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\"]);");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_278_7.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_278_7.doEnd();
                out.loopEnd();
                out.endTag("iterate",311);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",21106,21145);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_281_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_281_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_281_8.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_281_8.setTagInfo(_td_c_get_281_8);
                _jettag_c_get_281_8.doStart(context, out);
                _jettag_c_get_281_8.doEnd();
                out.setTag(null,-1,-1);
                out.write("->add");  //$NON-NLS-1$        
                out.setTag("get",21150,21196);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_281_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_281_52); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_281_52.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_281_52.setTagInfo(_td_c_get_281_52);
                _jettag_c_get_281_52.doStart(context, out);
                _jettag_c_get_281_52.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",21198,21256);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_281_100 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_281_100); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_281_100.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_281_100.setTagInfo(_td_c_get_281_100);
                _jettag_c_get_281_100.doStart(context, out);
                _jettag_c_get_281_100.doEnd();
                out.setTag(null,-1,-1);
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_263_11.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_263_11.doEnd();
            out.endTag("if",2690);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_253_4.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_253_4.doEnd();
        out.loopEnd();
        out.endTag("iterate",4062);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\t\t$result[] = $");  //$NON-NLS-1$        
        out.setTag("get",21312,21351);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_285_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_285_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_285_18.setRuntimeParent(null);
        _jettag_c_get_285_18.setTagInfo(_td_c_get_285_18);
        _jettag_c_get_285_18.doStart(context, out);
        _jettag_c_get_285_18.doEnd();
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
