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
                out.write("'\" . $");  //$NON-NLS-1$        
                out.setTag("get",1654,1693);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_31_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_31_13.setRuntimeParent(_jettag_c_if_30_12);
                _jettag_c_get_31_13.setTagInfo(_td_c_get_31_13);
                _jettag_c_get_31_13.doStart(context, out);
                _jettag_c_get_31_13.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",1698,1744);
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
        out.setTag("iterate",1916,1983);
        RuntimeTagElement _jettag_c_iterate_40_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_40_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_40_3.setRuntimeParent(null);
        _jettag_c_iterate_40_3.setTagInfo(_td_c_iterate_40_3);
        _jettag_c_iterate_40_3.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_40_3.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_40_3.getTagInfo().getAttribute("delimiter"),1916,1983);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(127);
            out.setTag("if",1983,2110);
            RuntimeTagElement _jettag_c_if_41_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_41_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_41_4.setRuntimeParent(_jettag_c_iterate_40_3);
            _jettag_c_if_41_4.setTagInfo(_td_c_if_41_4);
            _jettag_c_if_41_4.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_41_4.okToProcessBody()) {
                out.write("foreach ($");  //$NON-NLS-1$        
                out.setTag("get",2120,2159);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_42_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_42_14.setRuntimeParent(_jettag_c_if_41_4);
                _jettag_c_get_42_14.setTagInfo(_td_c_get_42_14);
                _jettag_c_get_42_14.doStart(context, out);
                _jettag_c_get_42_14.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",2164,2210);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_42_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_58); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_42_58.setRuntimeParent(_jettag_c_if_41_4);
                _jettag_c_get_42_58.setTagInfo(_td_c_get_42_58);
                _jettag_c_get_42_58.doStart(context, out);
                _jettag_c_get_42_58.doEnd();
                out.setTag(null,-1,-1);
                out.write("() as $row");  //$NON-NLS-1$        
                out.setTag("get",2220,2266);
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
                out.setTag("get",2304,2350);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_43_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_35); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_43_35.setRuntimeParent(_jettag_c_if_41_4);
                _jettag_c_get_43_35.setTagInfo(_td_c_get_43_35);
                _jettag_c_get_43_35.doStart(context, out);
                _jettag_c_get_43_35.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",2351,2416);
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
                out.setTag("get",2423,2469);
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
                out.setTag("get",2479,2544);
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
                out.setTag("get",2626,2672);
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
        out.setTag("get",2854,2893);
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
        out.setTag("get",2926,2972);
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
        out.setTag("iterate",2976,3040);
        RuntimeTagElement _jettag_c_iterate_64_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_64_79); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_64_79.setRuntimeParent(null);
        _jettag_c_iterate_64_79.setTagInfo(_td_c_iterate_64_79);
        _jettag_c_iterate_64_79.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_64_79.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_64_79.getTagInfo().getAttribute("delimiter"),2976,3040);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\t\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(131);
            out.setTag("if",3045,3176);
            RuntimeTagElement _jettag_c_if_65_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_65_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_65_5.setRuntimeParent(_jettag_c_iterate_64_79);
            _jettag_c_if_65_5.setTagInfo(_td_c_if_65_5);
            _jettag_c_if_65_5.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_65_5.okToProcessBody()) {
                out.setTag("get",3176,3216);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_66_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_66_7.setRuntimeParent(_jettag_c_if_65_5);
                _jettag_c_get_66_7.setTagInfo(_td_c_get_66_7);
                _jettag_c_get_66_7.doStart(context, out);
                _jettag_c_get_66_7.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = \" . $");  //$NON-NLS-1$        
                out.setTag("get",3224,3263);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_66_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_66_55.setRuntimeParent(_jettag_c_if_65_5);
                _jettag_c_get_66_55.setTagInfo(_td_c_get_66_55);
                _jettag_c_get_66_55.doStart(context, out);
                _jettag_c_get_66_55.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",3268,3314);
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
            out.setTag("if",3342,3412);
            RuntimeTagElement _jettag_c_if_67_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_67_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_67_12.setRuntimeParent(_jettag_c_iterate_64_79);
            _jettag_c_if_67_12.setTagInfo(_td_c_if_67_12);
            _jettag_c_if_67_12.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_67_12.okToProcessBody()) {
                out.setTag("get",3412,3452);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_68_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_68_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_68_7.setRuntimeParent(_jettag_c_if_67_12);
                _jettag_c_get_68_7.setTagInfo(_td_c_get_68_7);
                _jettag_c_get_68_7.doStart(context, out);
                _jettag_c_get_68_7.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = '\" . $");  //$NON-NLS-1$        
                out.setTag("get",3461,3500);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_68_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_68_56); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_68_56.setRuntimeParent(_jettag_c_if_67_12);
                _jettag_c_get_68_56.setTagInfo(_td_c_get_68_56);
                _jettag_c_get_68_56.doStart(context, out);
                _jettag_c_get_68_56.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",3505,3551);
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
        out.setTag("get",3615,3654);
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
        out.setTag("iterate",3719,3786);
        RuntimeTagElement _jettag_c_iterate_74_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_74_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_74_3.setRuntimeParent(null);
        _jettag_c_iterate_74_3.setTagInfo(_td_c_iterate_74_3);
        _jettag_c_iterate_74_3.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_74_3.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_74_3.getTagInfo().getAttribute("delimiter"),3719,3786);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(127);
            out.setTag("if",3786,3913);
            RuntimeTagElement _jettag_c_if_75_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_75_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_75_4.setRuntimeParent(_jettag_c_iterate_74_3);
            _jettag_c_if_75_4.setTagInfo(_td_c_if_75_4);
            _jettag_c_if_75_4.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_75_4.okToProcessBody()) {
                out.write("$query = pg_query(\"DELETE FROM ");  //$NON-NLS-1$        
                out.setTag("get",3944,3990);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_76_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_76_35); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_76_35.setRuntimeParent(_jettag_c_if_75_4);
                _jettag_c_get_76_35.setTagInfo(_td_c_get_76_35);
                _jettag_c_get_76_35.doStart(context, out);
                _jettag_c_get_76_35.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",3991,4056);
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
                out.setTag("get",4066,4112);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_77_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_77_10); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_77_10.setRuntimeParent(_jettag_c_if_75_4);
                _jettag_c_get_77_10.setTagInfo(_td_c_get_77_10);
                _jettag_c_get_77_10.doStart(context, out);
                _jettag_c_get_77_10.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id = \" . $");  //$NON-NLS-1$        
                out.setTag("get",4123,4162);
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
                out.setTag("get",4248,4287);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_82_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_82_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_82_13.setRuntimeParent(_jettag_c_if_75_4);
                _jettag_c_get_82_13.setTagInfo(_td_c_get_82_13);
                _jettag_c_get_82_13.doStart(context, out);
                _jettag_c_get_82_13.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",4292,4338);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_82_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_82_57); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_82_57.setRuntimeParent(_jettag_c_if_75_4);
                _jettag_c_get_82_57.setTagInfo(_td_c_get_82_57);
                _jettag_c_get_82_57.doStart(context, out);
                _jettag_c_get_82_57.doEnd();
                out.setTag(null,-1,-1);
                out.write("() as $row");  //$NON-NLS-1$        
                out.setTag("get",4348,4394);
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
                out.setTag("get",4432,4478);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_83_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_83_35); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_83_35.setRuntimeParent(_jettag_c_if_75_4);
                _jettag_c_get_83_35.setTagInfo(_td_c_get_83_35);
                _jettag_c_get_83_35.doStart(context, out);
                _jettag_c_get_83_35.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",4479,4544);
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
                out.setTag("get",4551,4597);
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
                out.setTag("get",4607,4672);
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
                out.setTag("get",4733,4772);
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
                out.setTag("get",4800,4846);
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
        out.setTag("get",5029,5068);
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
        out.setTag("iterate",5093,5160);
        RuntimeTagElement _jettag_c_iterate_105_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_105_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_105_3.setRuntimeParent(null);
        _jettag_c_iterate_105_3.setTagInfo(_td_c_iterate_105_3);
        _jettag_c_iterate_105_3.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_105_3.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_105_3.getTagInfo().getAttribute("delimiter"),5093,5160);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(127);
            out.setTag("if",5160,5287);
            RuntimeTagElement _jettag_c_if_106_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_106_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_106_4.setRuntimeParent(_jettag_c_iterate_105_3);
            _jettag_c_if_106_4.setTagInfo(_td_c_if_106_4);
            _jettag_c_if_106_4.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_106_4.okToProcessBody()) {
                out.write("$query = pg_query(\"DELETE FROM ");  //$NON-NLS-1$        
                out.setTag("get",5318,5364);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_107_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_107_35); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_107_35.setRuntimeParent(_jettag_c_if_106_4);
                _jettag_c_get_107_35.setTagInfo(_td_c_get_107_35);
                _jettag_c_get_107_35.doStart(context, out);
                _jettag_c_get_107_35.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",5365,5430);
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
                out.setTag("get",5440,5486);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_108_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_10); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_108_10.setRuntimeParent(_jettag_c_if_106_4);
                _jettag_c_get_108_10.setTagInfo(_td_c_get_108_10);
                _jettag_c_get_108_10.doStart(context, out);
                _jettag_c_get_108_10.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id = \" . $");  //$NON-NLS-1$        
                out.setTag("get",5497,5536);
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
        out.setTag("get",5662,5708);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_113_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_113_34); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_113_34.setRuntimeParent(null);
        _jettag_c_get_113_34.setTagInfo(_td_c_get_113_34);
        _jettag_c_get_113_34.doStart(context, out);
        _jettag_c_get_113_34.doEnd();
        out.setTag(null,-1,-1);
        out.write(" WHERE id = \" . $");  //$NON-NLS-1$        
        out.setTag("get",5725,5764);
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
        out.setTag("get",5940,5986);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_125_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_125_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_125_5.setRuntimeParent(null);
        _jettag_c_get_125_5.setTagInfo(_td_c_get_125_5);
        _jettag_c_get_125_5.doStart(context, out);
        _jettag_c_get_125_5.doEnd();
        out.setTag(null,-1,-1);
        out.write(".id AS ");  //$NON-NLS-1$        
        out.setTag("get",5993,6039);
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
        out.setTag("iterate",6048,6117);
        RuntimeTagElement _jettag_c_iterate_126_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_126_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_126_5.setRuntimeParent(null);
        _jettag_c_iterate_126_5.setTagInfo(_td_c_iterate_126_5);
        _jettag_c_iterate_126_5.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_126_5.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_126_5.getTagInfo().getAttribute("delimiter"),6048,6117);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(125);
            out.setTag("if",6117,6242);
            RuntimeTagElement _jettag_c_if_127_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_127_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_127_6.setRuntimeParent(_jettag_c_iterate_126_5);
            _jettag_c_if_127_6.setTagInfo(_td_c_if_127_6);
            _jettag_c_if_127_6.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_127_6.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",6248,6313);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_128_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_128_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_128_6.setRuntimeParent(_jettag_c_if_127_6);
                _jettag_c_get_128_6.setTagInfo(_td_c_get_128_6);
                _jettag_c_get_128_6.doStart(context, out);
                _jettag_c_get_128_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id AS ");  //$NON-NLS-1$        
                out.setTag("get",6320,6385);
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
                out.setTag("iterate",6390,6497);
                RuntimeTagElement _jettag_c_iterate_128_148 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_128_148); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_128_148.setRuntimeParent(_jettag_c_if_127_6);
                _jettag_c_iterate_128_148.setTagInfo(_td_c_iterate_128_148);
                _jettag_c_iterate_128_148.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_128_148.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_128_148.getTagInfo().getAttribute("delimiter"),6390,6497);
                    out.loopIterate();
                    out.setTag("get",6497,6562);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_129_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_129_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_129_7.setRuntimeParent(_jettag_c_iterate_128_148);
                    _jettag_c_get_129_7.setTagInfo(_td_c_get_129_7);
                    _jettag_c_get_129_7.doStart(context, out);
                    _jettag_c_get_129_7.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",6563,6621);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_129_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_129_73); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_129_73.setRuntimeParent(_jettag_c_iterate_128_148);
                    _jettag_c_get_129_73.setTagInfo(_td_c_get_129_73);
                    _jettag_c_get_129_73.doStart(context, out);
                    _jettag_c_get_129_73.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" AS ");  //$NON-NLS-1$        
                    out.setTag("get",6625,6690);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_129_135 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_129_135); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_129_135.setRuntimeParent(_jettag_c_iterate_128_148);
                    _jettag_c_get_129_135.setTagInfo(_td_c_get_129_135);
                    _jettag_c_get_129_135.doStart(context, out);
                    _jettag_c_get_129_135.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",6691,6749);
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
            out.setTag("if",6774,6843);
            RuntimeTagElement _jettag_c_if_130_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_130_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_130_12.setRuntimeParent(_jettag_c_iterate_126_5);
            _jettag_c_if_130_12.setTagInfo(_td_c_if_130_12);
            _jettag_c_if_130_12.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_130_12.okToProcessBody()) {
                out.setTag("get",6843,6889);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_131_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_131_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_131_6.setRuntimeParent(_jettag_c_if_130_12);
                _jettag_c_get_131_6.setTagInfo(_td_c_get_131_6);
                _jettag_c_get_131_6.doStart(context, out);
                _jettag_c_get_131_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",6890,6930);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_131_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_131_53); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_131_53.setRuntimeParent(_jettag_c_if_130_12);
                _jettag_c_get_131_53.setTagInfo(_td_c_get_131_53);
                _jettag_c_get_131_53.doStart(context, out);
                _jettag_c_get_131_53.doEnd();
                out.setTag(null,-1,-1);
                out.write(" AS ");  //$NON-NLS-1$        
                out.setTag("get",6934,6980);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_131_97 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_131_97); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_131_97.setRuntimeParent(_jettag_c_if_130_12);
                _jettag_c_get_131_97.setTagInfo(_td_c_get_131_97);
                _jettag_c_get_131_97.doStart(context, out);
                _jettag_c_get_131_97.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",6981,7021);
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
        out.setTag("get",7080,7126);
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
        out.setTag("iterate",7130,7194);
        RuntimeTagElement _jettag_c_iterate_135_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_135_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_135_4.setRuntimeParent(null);
        _jettag_c_iterate_135_4.setTagInfo(_td_c_iterate_135_4);
        _jettag_c_iterate_135_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_135_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_135_4.getTagInfo().getAttribute("delimiter"),7130,7194);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(129);
            out.setTag("if",7194,7323);
            RuntimeTagElement _jettag_c_if_135_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_135_68); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_135_68.setRuntimeParent(_jettag_c_iterate_135_4);
            _jettag_c_if_135_68.setTagInfo(_td_c_if_135_68);
            _jettag_c_if_135_68.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_135_68.okToProcessBody()) {
                out.write("INNER JOIN ");  //$NON-NLS-1$        
                out.setTag("get",7334,7399);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_136_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_136_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_136_16.setRuntimeParent(_jettag_c_if_135_68);
                _jettag_c_get_136_16.setTagInfo(_td_c_get_136_16);
                _jettag_c_get_136_16.doStart(context, out);
                _jettag_c_get_136_16.doEnd();
                out.setTag(null,-1,-1);
                out.write(" ON ");  //$NON-NLS-1$        
                out.setTag("get",7403,7468);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_136_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_136_85); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_136_85.setRuntimeParent(_jettag_c_if_135_68);
                _jettag_c_get_136_85.setTagInfo(_td_c_get_136_85);
                _jettag_c_get_136_85.doStart(context, out);
                _jettag_c_get_136_85.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id = ");  //$NON-NLS-1$        
                out.setTag("get",7474,7520);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_136_156 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_136_156); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_136_156.setRuntimeParent(_jettag_c_if_135_68);
                _jettag_c_get_136_156.setTagInfo(_td_c_get_136_156);
                _jettag_c_get_136_156.doStart(context, out);
                _jettag_c_get_136_156.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",7521,7561);
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
        out.setTag("get",7593,7639);
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
        out.setTag("get",7714,7753);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_142_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_142_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_142_6.setRuntimeParent(null);
        _jettag_c_get_142_6.setTagInfo(_td_c_get_142_6);
        _jettag_c_get_142_6.doStart(context, out);
        _jettag_c_get_142_6.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = new ");  //$NON-NLS-1$        
        out.setTag("get",7760,7804);
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
        out.setTag("get",7814,7853);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_144_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_144_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_144_6.setRuntimeParent(null);
        _jettag_c_get_144_6.setTagInfo(_td_c_get_144_6);
        _jettag_c_get_144_6.doStart(context, out);
        _jettag_c_get_144_6.doEnd();
        out.setTag(null,-1,-1);
        out.write("->setId($row[\"");  //$NON-NLS-1$        
        out.setTag("get",7867,7913);
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
        out.setTag("iterate",7924,7992);
        RuntimeTagElement _jettag_c_iterate_145_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_145_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_145_4.setRuntimeParent(null);
        _jettag_c_iterate_145_4.setTagInfo(_td_c_iterate_145_4);
        _jettag_c_iterate_145_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_145_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_145_4.getTagInfo().getAttribute("delimiter"),7924,7992);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(125);
            out.setTag("if",7992,8117);
            RuntimeTagElement _jettag_c_if_146_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_146_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_146_5.setRuntimeParent(_jettag_c_iterate_145_4);
            _jettag_c_if_146_5.setTagInfo(_td_c_if_146_5);
            _jettag_c_if_146_5.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_146_5.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",8123,8181);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_147_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_147_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_147_6.setRuntimeParent(_jettag_c_if_146_5);
                _jettag_c_get_147_6.setTagInfo(_td_c_get_147_6);
                _jettag_c_get_147_6.doStart(context, out);
                _jettag_c_get_147_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = new ");  //$NON-NLS-1$        
                out.setTag("get",8188,8251);
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
                out.setTag("get",8260,8318);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_148_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_148_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_148_6.setRuntimeParent(_jettag_c_if_146_5);
                _jettag_c_get_148_6.setTagInfo(_td_c_get_148_6);
                _jettag_c_get_148_6.doStart(context, out);
                _jettag_c_get_148_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->setId($row[\"");  //$NON-NLS-1$        
                out.setTag("get",8332,8397);
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
                out.setTag("iterate",8409,8515);
                RuntimeTagElement _jettag_c_iterate_149_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_149_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_149_5.setRuntimeParent(_jettag_c_if_146_5);
                _jettag_c_iterate_149_5.setTagInfo(_td_c_iterate_149_5);
                _jettag_c_iterate_149_5.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_149_5.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_149_5.getTagInfo().getAttribute("delimiter"),8409,8515);
                    out.loopIterate();
                    out.write("$");  //$NON-NLS-1$        
                    out.setTag("get",8516,8574);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_150_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_150_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_150_7.setRuntimeParent(_jettag_c_iterate_149_5);
                    _jettag_c_get_150_7.setTagInfo(_td_c_get_150_7);
                    _jettag_c_get_150_7.doStart(context, out);
                    _jettag_c_get_150_7.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->set");  //$NON-NLS-1$        
                    out.setTag("get",8579,8643);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(64);
                    RuntimeTagElement _jettag_c_get_150_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_150_70); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_150_70.setRuntimeParent(_jettag_c_iterate_149_5);
                    _jettag_c_get_150_70.setTagInfo(_td_c_get_150_70);
                    _jettag_c_get_150_70.doStart(context, out);
                    _jettag_c_get_150_70.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("($row[\"");  //$NON-NLS-1$        
                    out.setTag("get",8650,8715);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_150_141 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_150_141); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_150_141.setRuntimeParent(_jettag_c_iterate_149_5);
                    _jettag_c_get_150_141.setTagInfo(_td_c_get_150_141);
                    _jettag_c_get_150_141.doStart(context, out);
                    _jettag_c_get_150_141.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",8716,8774);
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
                out.setTag("get",8801,8840);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_152_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_152_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_152_6.setRuntimeParent(_jettag_c_if_146_5);
                _jettag_c_get_152_6.setTagInfo(_td_c_get_152_6);
                _jettag_c_get_152_6.doStart(context, out);
                _jettag_c_get_152_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->set");  //$NON-NLS-1$        
                out.setTag("get",8845,8891);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_152_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_152_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_152_50.setRuntimeParent(_jettag_c_if_146_5);
                _jettag_c_get_152_50.setTagInfo(_td_c_get_152_50);
                _jettag_c_get_152_50.doStart(context, out);
                _jettag_c_get_152_50.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",8893,8951);
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
            out.setTag("if",8964,9028);
            RuntimeTagElement _jettag_c_if_153_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_153_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_153_11.setRuntimeParent(_jettag_c_iterate_145_4);
            _jettag_c_if_153_11.setTagInfo(_td_c_if_153_11);
            _jettag_c_if_153_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_153_11.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",9034,9073);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_154_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_154_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_154_6.setRuntimeParent(_jettag_c_if_153_11);
                _jettag_c_get_154_6.setTagInfo(_td_c_get_154_6);
                _jettag_c_get_154_6.doStart(context, out);
                _jettag_c_get_154_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->set");  //$NON-NLS-1$        
                out.setTag("get",9078,9124);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_154_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_154_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_154_50.setRuntimeParent(_jettag_c_if_153_11);
                _jettag_c_get_154_50.setTagInfo(_td_c_get_154_50);
                _jettag_c_get_154_50.doStart(context, out);
                _jettag_c_get_154_50.doEnd();
                out.setTag(null,-1,-1);
                out.write("($row[\"");  //$NON-NLS-1$        
                out.setTag("get",9131,9177);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_154_103 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_154_103); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_154_103.setRuntimeParent(_jettag_c_if_153_11);
                _jettag_c_get_154_103.setTagInfo(_td_c_get_154_103);
                _jettag_c_get_154_103.doStart(context, out);
                _jettag_c_get_154_103.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",9178,9218);
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
            out.setTag("if",9233,9357);
            RuntimeTagElement _jettag_c_if_155_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_155_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_155_11.setRuntimeParent(_jettag_c_iterate_145_4);
            _jettag_c_if_155_11.setTagInfo(_td_c_if_155_11);
            _jettag_c_if_155_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_155_11.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$query_");  //$NON-NLS-1$        
                out.setTag("get",9369,9409);
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
                out.setTag("get",9435,9500);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_157_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_157_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_157_7.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_157_7.setTagInfo(_td_c_get_157_7);
                _jettag_c_get_157_7.doStart(context, out);
                _jettag_c_get_157_7.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id AS ");  //$NON-NLS-1$        
                out.setTag("get",9507,9572);
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
                out.setTag("iterate",9577,9685);
                RuntimeTagElement _jettag_c_iterate_157_149 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_157_149); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_157_149.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_iterate_157_149.setTagInfo(_td_c_iterate_157_149);
                _jettag_c_iterate_157_149.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_157_149.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_157_149.getTagInfo().getAttribute("delimiter"),9577,9685);
                    out.loopIterate();
                    out.setTag("get",9685,9750);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_158_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_158_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_158_8.setRuntimeParent(_jettag_c_iterate_157_149);
                    _jettag_c_get_158_8.setTagInfo(_td_c_get_158_8);
                    _jettag_c_get_158_8.doStart(context, out);
                    _jettag_c_get_158_8.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",9751,9809);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_158_74 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_158_74); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_158_74.setRuntimeParent(_jettag_c_iterate_157_149);
                    _jettag_c_get_158_74.setTagInfo(_td_c_get_158_74);
                    _jettag_c_get_158_74.doStart(context, out);
                    _jettag_c_get_158_74.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" AS ");  //$NON-NLS-1$        
                    out.setTag("get",9813,9878);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_158_136 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_158_136); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_158_136.setRuntimeParent(_jettag_c_iterate_157_149);
                    _jettag_c_get_158_136.setTagInfo(_td_c_get_158_136);
                    _jettag_c_get_158_136.doStart(context, out);
                    _jettag_c_get_158_136.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",9879,9937);
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
                out.setTag("get",9957,10003);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_159_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_159_7.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_159_7.setTagInfo(_td_c_get_159_7);
                _jettag_c_get_159_7.doStart(context, out);
                _jettag_c_get_159_7.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",10004,10069);
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
                out.setTag("get",10088,10134);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_160_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_160_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_160_7.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_160_7.setTagInfo(_td_c_get_160_7);
                _jettag_c_get_160_7.doStart(context, out);
                _jettag_c_get_160_7.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",10135,10200);
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
                out.setTag("get",10221,10267);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_161_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_161_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_161_11.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_161_11.setTagInfo(_td_c_get_161_11);
                _jettag_c_get_161_11.doStart(context, out);
                _jettag_c_get_161_11.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",10268,10333);
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
                out.setTag("get",10350,10415);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_162_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_162_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_162_17.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_162_17.setTagInfo(_td_c_get_162_17);
                _jettag_c_get_162_17.doStart(context, out);
                _jettag_c_get_162_17.doEnd();
                out.setTag(null,-1,-1);
                out.write(" ON ");  //$NON-NLS-1$        
                out.setTag("get",10419,10484);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_162_86 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_162_86); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_162_86.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_162_86.setTagInfo(_td_c_get_162_86);
                _jettag_c_get_162_86.doStart(context, out);
                _jettag_c_get_162_86.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id = ");  //$NON-NLS-1$        
                out.setTag("get",10490,10536);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_162_157 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_162_157); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_162_157.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_162_157.setTagInfo(_td_c_get_162_157);
                _jettag_c_get_162_157.doStart(context, out);
                _jettag_c_get_162_157.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",10537,10602);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_162_204 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_162_204); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_162_204.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_162_204.setTagInfo(_td_c_get_162_204);
                _jettag_c_get_162_204.doStart(context, out);
                _jettag_c_get_162_204.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",10603,10668);
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
                out.setTag("get",10684,10730);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_163_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_163_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_163_12.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_163_12.setTagInfo(_td_c_get_163_12);
                _jettag_c_get_163_12.doStart(context, out);
                _jettag_c_get_163_12.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",10731,10796);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_163_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_163_59); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_163_59.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_163_59.setTagInfo(_td_c_get_163_59);
                _jettag_c_get_163_59.doStart(context, out);
                _jettag_c_get_163_59.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",10797,10843);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_163_125 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_163_125); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_163_125.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_163_125.setTagInfo(_td_c_get_163_125);
                _jettag_c_get_163_125.doStart(context, out);
                _jettag_c_get_163_125.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id = \" . $");  //$NON-NLS-1$        
                out.setTag("get",10854,10893);
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
                out.setTag("get",10930,10970);
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
                out.setTag("get",10991,11031);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_167_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_167_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_167_18.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_167_18.setTagInfo(_td_c_get_167_18);
                _jettag_c_get_167_18.doStart(context, out);
                _jettag_c_get_167_18.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = pg_fetch_assoc($query_");  //$NON-NLS-1$        
                out.setTag("get",11056,11096);
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
                out.setTag("get",11108,11166);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_168_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_168_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_168_8.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_168_8.setTagInfo(_td_c_get_168_8);
                _jettag_c_get_168_8.doStart(context, out);
                _jettag_c_get_168_8.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = new ");  //$NON-NLS-1$        
                out.setTag("get",11173,11236);
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
                out.setTag("get",11247,11305);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_169_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_169_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_169_8.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_169_8.setTagInfo(_td_c_get_169_8);
                _jettag_c_get_169_8.doStart(context, out);
                _jettag_c_get_169_8.doEnd();
                out.setTag(null,-1,-1);
                out.write("->setId($row_");  //$NON-NLS-1$        
                out.setTag("get",11318,11358);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_169_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_169_79); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_169_79.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_169_79.setTagInfo(_td_c_get_169_79);
                _jettag_c_get_169_79.doStart(context, out);
                _jettag_c_get_169_79.doEnd();
                out.setTag(null,-1,-1);
                out.write("[\"");  //$NON-NLS-1$        
                out.setTag("get",11360,11425);
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
                out.setTag("iterate",11439,11547);
                RuntimeTagElement _jettag_c_iterate_170_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_170_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_170_7.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_iterate_170_7.setTagInfo(_td_c_iterate_170_7);
                _jettag_c_iterate_170_7.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_170_7.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_170_7.getTagInfo().getAttribute("delimiter"),11439,11547);
                    out.loopIterate();
                    out.write("$");  //$NON-NLS-1$        
                    out.setTag("get",11548,11606);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_171_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_171_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_171_9.setRuntimeParent(_jettag_c_iterate_170_7);
                    _jettag_c_get_171_9.setTagInfo(_td_c_get_171_9);
                    _jettag_c_get_171_9.doStart(context, out);
                    _jettag_c_get_171_9.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->set");  //$NON-NLS-1$        
                    out.setTag("get",11611,11675);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(64);
                    RuntimeTagElement _jettag_c_get_171_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_171_72); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_171_72.setRuntimeParent(_jettag_c_iterate_170_7);
                    _jettag_c_get_171_72.setTagInfo(_td_c_get_171_72);
                    _jettag_c_get_171_72.doStart(context, out);
                    _jettag_c_get_171_72.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("($row_");  //$NON-NLS-1$        
                    out.setTag("get",11681,11721);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_171_142 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_171_142); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_171_142.setRuntimeParent(_jettag_c_iterate_170_7);
                    _jettag_c_get_171_142.setTagInfo(_td_c_get_171_142);
                    _jettag_c_get_171_142.doStart(context, out);
                    _jettag_c_get_171_142.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("[\"");  //$NON-NLS-1$        
                    out.setTag("get",11723,11788);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_171_184 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_171_184); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_171_184.setRuntimeParent(_jettag_c_iterate_170_7);
                    _jettag_c_get_171_184.setTagInfo(_td_c_get_171_184);
                    _jettag_c_get_171_184.doStart(context, out);
                    _jettag_c_get_171_184.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",11789,11847);
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
                out.setTag("get",11878,11917);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_173_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_173_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_173_8.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_173_8.setTagInfo(_td_c_get_173_8);
                _jettag_c_get_173_8.doStart(context, out);
                _jettag_c_get_173_8.doEnd();
                out.setTag(null,-1,-1);
                out.write("->add");  //$NON-NLS-1$        
                out.setTag("get",11922,11968);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_173_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_173_52); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_173_52.setRuntimeParent(_jettag_c_if_155_11);
                _jettag_c_get_173_52.setTagInfo(_td_c_get_173_52);
                _jettag_c_get_173_52.doStart(context, out);
                _jettag_c_get_173_52.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",11970,12028);
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
        out.setTag("get",12084,12123);
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
        out.setTag("get",12179,12218);
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
        out.setTag("iterate",12262,12326);
        RuntimeTagElement _jettag_c_iterate_190_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_190_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_190_2.setRuntimeParent(null);
        _jettag_c_iterate_190_2.setTagInfo(_td_c_iterate_190_2);
        _jettag_c_iterate_190_2.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_190_2.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_190_2.getTagInfo().getAttribute("delimiter"),12262,12326);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\tif (");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(61);
            out.setTag("if",12333,12394);
            RuntimeTagElement _jettag_c_if_191_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_191_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_191_7.setRuntimeParent(_jettag_c_iterate_190_2);
            _jettag_c_if_191_7.setTagInfo(_td_c_if_191_7);
            _jettag_c_if_191_7.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_191_7.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t(is_array($");  //$NON-NLS-1$        
                out.setTag("get",12409,12448);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_192_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_192_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_192_15.setRuntimeParent(_jettag_c_if_191_7);
                _jettag_c_get_192_15.setTagInfo(_td_c_get_192_15);
                _jettag_c_get_192_15.doStart(context, out);
                _jettag_c_get_192_15.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",12453,12499);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_192_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_192_59); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_192_59.setRuntimeParent(_jettag_c_if_191_7);
                _jettag_c_get_192_59.setTagInfo(_td_c_get_192_59);
                _jettag_c_get_192_59.doStart(context, out);
                _jettag_c_get_192_59.doEnd();
                out.setTag(null,-1,-1);
                out.write("()) && count($");  //$NON-NLS-1$        
                out.setTag("get",12513,12552);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_192_119 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_192_119); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_192_119.setRuntimeParent(_jettag_c_if_191_7);
                _jettag_c_get_192_119.setTagInfo(_td_c_get_192_119);
                _jettag_c_get_192_119.doStart(context, out);
                _jettag_c_get_192_119.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",12557,12603);
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
                out.setTag("get",12630,12669);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_193_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_193_19); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_193_19.setRuntimeParent(_jettag_c_if_191_7);
                _jettag_c_get_193_19.setTagInfo(_td_c_get_193_19);
                _jettag_c_get_193_19.doStart(context, out);
                _jettag_c_get_193_19.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",12674,12720);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_193_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_193_63); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_193_63.setRuntimeParent(_jettag_c_if_191_7);
                _jettag_c_get_193_63.setTagInfo(_td_c_get_193_63);
                _jettag_c_get_193_63.doStart(context, out);
                _jettag_c_get_193_63.doEnd();
                out.setTag(null,-1,-1);
                out.write("()) && $");  //$NON-NLS-1$        
                out.setTag("get",12728,12767);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_193_117 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_193_117); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_193_117.setRuntimeParent(_jettag_c_if_191_7);
                _jettag_c_get_193_117.setTagInfo(_td_c_get_193_117);
                _jettag_c_get_193_117.doStart(context, out);
                _jettag_c_get_193_117.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",12772,12818);
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
            out.setTag("if",12844,12912);
            RuntimeTagElement _jettag_c_if_194_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_194_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_194_10.setRuntimeParent(_jettag_c_iterate_190_2);
            _jettag_c_if_194_10.setTagInfo(_td_c_if_194_10);
            _jettag_c_if_194_10.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_194_10.okToProcessBody()) {
                out.write("strlen($");  //$NON-NLS-1$        
                out.setTag("get",12920,12959);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_195_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_195_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_195_13.setRuntimeParent(_jettag_c_if_194_10);
                _jettag_c_get_195_13.setTagInfo(_td_c_get_195_13);
                _jettag_c_get_195_13.doStart(context, out);
                _jettag_c_get_195_13.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",12964,13010);
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
            out.setTag("if",13124,13190);
            RuntimeTagElement _jettag_c_if_202_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_202_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_202_4.setRuntimeParent(_jettag_c_iterate_190_2);
            _jettag_c_if_202_4.setTagInfo(_td_c_if_202_4);
            _jettag_c_if_202_4.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_202_4.okToProcessBody()) {
                out.write("if (is_array($");  //$NON-NLS-1$        
                out.setTag("get",13204,13243);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_203_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_203_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_203_20.setRuntimeParent(_jettag_c_if_202_4);
                _jettag_c_get_203_20.setTagInfo(_td_c_get_203_20);
                _jettag_c_get_203_20.doStart(context, out);
                _jettag_c_get_203_20.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",13248,13294);
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
                out.setTag("get",13356,13395);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_206_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_206_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_206_16.setRuntimeParent(_jettag_c_if_202_4);
                _jettag_c_get_206_16.setTagInfo(_td_c_get_206_16);
                _jettag_c_get_206_16.doStart(context, out);
                _jettag_c_get_206_16.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",13400,13446);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_206_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_206_60); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_206_60.setRuntimeParent(_jettag_c_if_202_4);
                _jettag_c_get_206_60.setTagInfo(_td_c_get_206_60);
                _jettag_c_get_206_60.doStart(context, out);
                _jettag_c_get_206_60.doEnd();
                out.setTag(null,-1,-1);
                out.write("() as $");  //$NON-NLS-1$        
                out.setTag("get",13453,13493);
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
                out.setTag("if",13560,13640);
                RuntimeTagElement _jettag_c_if_211_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_211_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_211_7.setRuntimeParent(_jettag_c_if_202_4);
                _jettag_c_if_211_7.setTagInfo(_td_c_if_211_7);
                _jettag_c_if_211_7.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_211_7.okToProcessBody()) {
                    out.write("$where .= \"");  //$NON-NLS-1$        
                    out.setTag("get",13651,13697);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_212_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_212_19); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_212_19.setRuntimeParent(_jettag_c_if_211_7);
                    _jettag_c_get_212_19.setTagInfo(_td_c_get_212_19);
                    _jettag_c_get_212_19.doStart(context, out);
                    _jettag_c_get_212_19.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",13698,13738);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_212_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_212_66); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_212_66.setRuntimeParent(_jettag_c_if_211_7);
                    _jettag_c_get_212_66.setTagInfo(_td_c_get_212_66);
                    _jettag_c_get_212_66.doStart(context, out);
                    _jettag_c_get_212_66.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" = \" . $");  //$NON-NLS-1$        
                    out.setTag("get",13746,13786);
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
                out.setTag("if",13810,13887);
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
                    out.setTag("get",13935,13981);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_216_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_216_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_216_13.setRuntimeParent(_jettag_c_if_213_14);
                    _jettag_c_get_216_13.setTagInfo(_td_c_get_216_13);
                    _jettag_c_get_216_13.doStart(context, out);
                    _jettag_c_get_216_13.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",13982,14047);
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
                    out.setTag("get",14069,14115);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_218_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_218_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_218_9.setRuntimeParent(_jettag_c_if_213_14);
                    _jettag_c_get_218_9.setTagInfo(_td_c_get_218_9);
                    _jettag_c_get_218_9.doStart(context, out);
                    _jettag_c_get_218_9.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",14116,14181);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_218_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_218_56); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_218_56.setRuntimeParent(_jettag_c_if_213_14);
                    _jettag_c_get_218_56.setTagInfo(_td_c_get_218_56);
                    _jettag_c_get_218_56.doStart(context, out);
                    _jettag_c_get_218_56.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",14182,14228);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_218_122 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_218_122); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_218_122.setRuntimeParent(_jettag_c_if_213_14);
                    _jettag_c_get_218_122.setTagInfo(_td_c_get_218_122);
                    _jettag_c_get_218_122.doStart(context, out);
                    _jettag_c_get_218_122.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_id = ");  //$NON-NLS-1$        
                    out.setTag("get",14234,14280);
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
                    out.setTag("get",14296,14342);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_219_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_219_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_219_13.setRuntimeParent(_jettag_c_if_213_14);
                    _jettag_c_get_219_13.setTagInfo(_td_c_get_219_13);
                    _jettag_c_get_219_13.doStart(context, out);
                    _jettag_c_get_219_13.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",14343,14408);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_219_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_219_60); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_219_60.setRuntimeParent(_jettag_c_if_213_14);
                    _jettag_c_get_219_60.setTagInfo(_td_c_get_219_60);
                    _jettag_c_get_219_60.doStart(context, out);
                    _jettag_c_get_219_60.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",14409,14474);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_219_126 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_219_126); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_219_126.setRuntimeParent(_jettag_c_if_213_14);
                    _jettag_c_get_219_126.setTagInfo(_td_c_get_219_126);
                    _jettag_c_get_219_126.doStart(context, out);
                    _jettag_c_get_219_126.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_id = \" . $");  //$NON-NLS-1$        
                    out.setTag("get",14485,14525);
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
                out.setTag("get",14645,14691);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_226_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_226_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_226_17.setRuntimeParent(_jettag_c_if_202_4);
                _jettag_c_get_226_17.setTagInfo(_td_c_get_226_17);
                _jettag_c_get_226_17.doStart(context, out);
                _jettag_c_get_226_17.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",14692,14732);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_226_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_226_64); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_226_64.setRuntimeParent(_jettag_c_if_202_4);
                _jettag_c_get_226_64.setTagInfo(_td_c_get_226_64);
                _jettag_c_get_226_64.doStart(context, out);
                _jettag_c_get_226_64.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = \" . $");  //$NON-NLS-1$        
                out.setTag("get",14740,14779);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_226_112 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_226_112); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_226_112.setRuntimeParent(_jettag_c_if_202_4);
                _jettag_c_get_226_112.setTagInfo(_td_c_get_226_112);
                _jettag_c_get_226_112.doStart(context, out);
                _jettag_c_get_226_112.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",14784,14830);
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
            out.setTag("if",14859,14928);
            RuntimeTagElement _jettag_c_if_228_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_228_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_228_11.setRuntimeParent(_jettag_c_iterate_190_2);
            _jettag_c_if_228_11.setTagInfo(_td_c_if_228_11);
            _jettag_c_if_228_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_228_11.okToProcessBody()) {
                out.write("$where .= \"");  //$NON-NLS-1$        
                out.setTag("get",14939,14985);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_229_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_229_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_229_17.setRuntimeParent(_jettag_c_if_228_11);
                _jettag_c_get_229_17.setTagInfo(_td_c_get_229_17);
                _jettag_c_get_229_17.doStart(context, out);
                _jettag_c_get_229_17.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",14986,15026);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_229_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_229_64); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_229_64.setRuntimeParent(_jettag_c_if_228_11);
                _jettag_c_get_229_64.setTagInfo(_td_c_get_229_64);
                _jettag_c_get_229_64.doStart(context, out);
                _jettag_c_get_229_64.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = '\" . $");  //$NON-NLS-1$        
                out.setTag("get",15035,15074);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_229_113 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_229_113); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_229_113.setRuntimeParent(_jettag_c_if_228_11);
                _jettag_c_get_229_113.setTagInfo(_td_c_get_229_113);
                _jettag_c_get_229_113.doStart(context, out);
                _jettag_c_get_229_113.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",15079,15125);
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
        out.setTag("get",15196,15242);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_234_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_234_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_234_5.setRuntimeParent(null);
        _jettag_c_get_234_5.setTagInfo(_td_c_get_234_5);
        _jettag_c_get_234_5.doStart(context, out);
        _jettag_c_get_234_5.doEnd();
        out.setTag(null,-1,-1);
        out.write(".id AS ");  //$NON-NLS-1$        
        out.setTag("get",15249,15295);
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
        out.setTag("iterate",15304,15373);
        RuntimeTagElement _jettag_c_iterate_235_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_235_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_235_5.setRuntimeParent(null);
        _jettag_c_iterate_235_5.setTagInfo(_td_c_iterate_235_5);
        _jettag_c_iterate_235_5.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_235_5.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_235_5.getTagInfo().getAttribute("delimiter"),15304,15373);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(125);
            out.setTag("if",15373,15498);
            RuntimeTagElement _jettag_c_if_236_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_236_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_236_6.setRuntimeParent(_jettag_c_iterate_235_5);
            _jettag_c_if_236_6.setTagInfo(_td_c_if_236_6);
            _jettag_c_if_236_6.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_236_6.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",15504,15569);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_237_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_237_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_237_6.setRuntimeParent(_jettag_c_if_236_6);
                _jettag_c_get_237_6.setTagInfo(_td_c_get_237_6);
                _jettag_c_get_237_6.doStart(context, out);
                _jettag_c_get_237_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id AS ");  //$NON-NLS-1$        
                out.setTag("get",15576,15641);
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
                out.setTag("iterate",15646,15753);
                RuntimeTagElement _jettag_c_iterate_237_148 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_237_148); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_237_148.setRuntimeParent(_jettag_c_if_236_6);
                _jettag_c_iterate_237_148.setTagInfo(_td_c_iterate_237_148);
                _jettag_c_iterate_237_148.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_237_148.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_237_148.getTagInfo().getAttribute("delimiter"),15646,15753);
                    out.loopIterate();
                    out.setTag("get",15753,15818);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_238_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_238_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_238_7.setRuntimeParent(_jettag_c_iterate_237_148);
                    _jettag_c_get_238_7.setTagInfo(_td_c_get_238_7);
                    _jettag_c_get_238_7.doStart(context, out);
                    _jettag_c_get_238_7.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",15819,15877);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_238_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_238_73); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_238_73.setRuntimeParent(_jettag_c_iterate_237_148);
                    _jettag_c_get_238_73.setTagInfo(_td_c_get_238_73);
                    _jettag_c_get_238_73.doStart(context, out);
                    _jettag_c_get_238_73.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" AS ");  //$NON-NLS-1$        
                    out.setTag("get",15881,15946);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_238_135 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_238_135); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_238_135.setRuntimeParent(_jettag_c_iterate_237_148);
                    _jettag_c_get_238_135.setTagInfo(_td_c_get_238_135);
                    _jettag_c_get_238_135.doStart(context, out);
                    _jettag_c_get_238_135.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",15947,16005);
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
            out.setTag("if",16030,16099);
            RuntimeTagElement _jettag_c_if_239_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_239_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_239_12.setRuntimeParent(_jettag_c_iterate_235_5);
            _jettag_c_if_239_12.setTagInfo(_td_c_if_239_12);
            _jettag_c_if_239_12.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_239_12.okToProcessBody()) {
                out.setTag("get",16099,16145);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_240_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_240_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_240_6.setRuntimeParent(_jettag_c_if_239_12);
                _jettag_c_get_240_6.setTagInfo(_td_c_get_240_6);
                _jettag_c_get_240_6.doStart(context, out);
                _jettag_c_get_240_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",16146,16186);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_240_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_240_53); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_240_53.setRuntimeParent(_jettag_c_if_239_12);
                _jettag_c_get_240_53.setTagInfo(_td_c_get_240_53);
                _jettag_c_get_240_53.doStart(context, out);
                _jettag_c_get_240_53.doEnd();
                out.setTag(null,-1,-1);
                out.write(" AS ");  //$NON-NLS-1$        
                out.setTag("get",16190,16236);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_240_97 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_240_97); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_240_97.setRuntimeParent(_jettag_c_if_239_12);
                _jettag_c_get_240_97.setTagInfo(_td_c_get_240_97);
                _jettag_c_get_240_97.doStart(context, out);
                _jettag_c_get_240_97.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",16237,16277);
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
        out.setTag("get",16336,16382);
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
        out.setTag("iterate",16386,16450);
        RuntimeTagElement _jettag_c_iterate_244_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_244_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_244_4.setRuntimeParent(null);
        _jettag_c_iterate_244_4.setTagInfo(_td_c_iterate_244_4);
        _jettag_c_iterate_244_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_244_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_244_4.getTagInfo().getAttribute("delimiter"),16386,16450);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(129);
            out.setTag("if",16450,16579);
            RuntimeTagElement _jettag_c_if_244_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_244_68); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_244_68.setRuntimeParent(_jettag_c_iterate_244_4);
            _jettag_c_if_244_68.setTagInfo(_td_c_if_244_68);
            _jettag_c_if_244_68.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_244_68.okToProcessBody()) {
                out.write("INNER JOIN ");  //$NON-NLS-1$        
                out.setTag("get",16590,16655);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_245_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_245_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_245_16.setRuntimeParent(_jettag_c_if_244_68);
                _jettag_c_get_245_16.setTagInfo(_td_c_get_245_16);
                _jettag_c_get_245_16.doStart(context, out);
                _jettag_c_get_245_16.doEnd();
                out.setTag(null,-1,-1);
                out.write(" ON ");  //$NON-NLS-1$        
                out.setTag("get",16659,16724);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_245_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_245_85); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_245_85.setRuntimeParent(_jettag_c_if_244_68);
                _jettag_c_get_245_85.setTagInfo(_td_c_get_245_85);
                _jettag_c_get_245_85.doStart(context, out);
                _jettag_c_get_245_85.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id = ");  //$NON-NLS-1$        
                out.setTag("get",16730,16776);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_245_156 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_245_156); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_245_156.setRuntimeParent(_jettag_c_if_244_68);
                _jettag_c_get_245_156.setTagInfo(_td_c_get_245_156);
                _jettag_c_get_245_156.doStart(context, out);
                _jettag_c_get_245_156.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",16777,16817);
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
        out.setTag("get",16862,16908);
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
        out.setTag("get",16980,17019);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_250_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_250_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_250_6.setRuntimeParent(null);
        _jettag_c_get_250_6.setTagInfo(_td_c_get_250_6);
        _jettag_c_get_250_6.doStart(context, out);
        _jettag_c_get_250_6.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = new ");  //$NON-NLS-1$        
        out.setTag("get",17026,17070);
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
        out.setTag("get",17080,17119);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_252_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_252_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_252_6.setRuntimeParent(null);
        _jettag_c_get_252_6.setTagInfo(_td_c_get_252_6);
        _jettag_c_get_252_6.doStart(context, out);
        _jettag_c_get_252_6.doEnd();
        out.setTag(null,-1,-1);
        out.write("->setId($row[\"");  //$NON-NLS-1$        
        out.setTag("get",17133,17179);
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
        out.setTag("iterate",17190,17258);
        RuntimeTagElement _jettag_c_iterate_253_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_253_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_253_4.setRuntimeParent(null);
        _jettag_c_iterate_253_4.setTagInfo(_td_c_iterate_253_4);
        _jettag_c_iterate_253_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_253_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_253_4.getTagInfo().getAttribute("delimiter"),17190,17258);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(125);
            out.setTag("if",17258,17383);
            RuntimeTagElement _jettag_c_if_254_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_254_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_254_5.setRuntimeParent(_jettag_c_iterate_253_4);
            _jettag_c_if_254_5.setTagInfo(_td_c_if_254_5);
            _jettag_c_if_254_5.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_254_5.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",17389,17447);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_255_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_255_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_255_6.setRuntimeParent(_jettag_c_if_254_5);
                _jettag_c_get_255_6.setTagInfo(_td_c_get_255_6);
                _jettag_c_get_255_6.doStart(context, out);
                _jettag_c_get_255_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = new ");  //$NON-NLS-1$        
                out.setTag("get",17454,17517);
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
                out.setTag("get",17526,17584);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_256_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_256_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_256_6.setRuntimeParent(_jettag_c_if_254_5);
                _jettag_c_get_256_6.setTagInfo(_td_c_get_256_6);
                _jettag_c_get_256_6.doStart(context, out);
                _jettag_c_get_256_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->setId($row[\"");  //$NON-NLS-1$        
                out.setTag("get",17598,17663);
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
                out.setTag("iterate",17675,17781);
                RuntimeTagElement _jettag_c_iterate_257_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_257_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_257_5.setRuntimeParent(_jettag_c_if_254_5);
                _jettag_c_iterate_257_5.setTagInfo(_td_c_iterate_257_5);
                _jettag_c_iterate_257_5.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_257_5.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_257_5.getTagInfo().getAttribute("delimiter"),17675,17781);
                    out.loopIterate();
                    out.write("$");  //$NON-NLS-1$        
                    out.setTag("get",17782,17840);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_258_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_258_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_258_7.setRuntimeParent(_jettag_c_iterate_257_5);
                    _jettag_c_get_258_7.setTagInfo(_td_c_get_258_7);
                    _jettag_c_get_258_7.doStart(context, out);
                    _jettag_c_get_258_7.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->set");  //$NON-NLS-1$        
                    out.setTag("get",17845,17909);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(64);
                    RuntimeTagElement _jettag_c_get_258_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_258_70); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_258_70.setRuntimeParent(_jettag_c_iterate_257_5);
                    _jettag_c_get_258_70.setTagInfo(_td_c_get_258_70);
                    _jettag_c_get_258_70.doStart(context, out);
                    _jettag_c_get_258_70.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("($row[\"");  //$NON-NLS-1$        
                    out.setTag("get",17916,17981);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_258_141 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_258_141); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_258_141.setRuntimeParent(_jettag_c_iterate_257_5);
                    _jettag_c_get_258_141.setTagInfo(_td_c_get_258_141);
                    _jettag_c_get_258_141.doStart(context, out);
                    _jettag_c_get_258_141.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",17982,18040);
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
                out.setTag("get",18067,18106);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_260_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_260_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_260_6.setRuntimeParent(_jettag_c_if_254_5);
                _jettag_c_get_260_6.setTagInfo(_td_c_get_260_6);
                _jettag_c_get_260_6.doStart(context, out);
                _jettag_c_get_260_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->set");  //$NON-NLS-1$        
                out.setTag("get",18111,18157);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_260_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_260_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_260_50.setRuntimeParent(_jettag_c_if_254_5);
                _jettag_c_get_260_50.setTagInfo(_td_c_get_260_50);
                _jettag_c_get_260_50.doStart(context, out);
                _jettag_c_get_260_50.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",18159,18217);
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
            out.setTag("if",18230,18294);
            RuntimeTagElement _jettag_c_if_261_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_261_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_261_11.setRuntimeParent(_jettag_c_iterate_253_4);
            _jettag_c_if_261_11.setTagInfo(_td_c_if_261_11);
            _jettag_c_if_261_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_261_11.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",18300,18339);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_262_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_262_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_262_6.setRuntimeParent(_jettag_c_if_261_11);
                _jettag_c_get_262_6.setTagInfo(_td_c_get_262_6);
                _jettag_c_get_262_6.doStart(context, out);
                _jettag_c_get_262_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->set");  //$NON-NLS-1$        
                out.setTag("get",18344,18390);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_262_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_262_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_262_50.setRuntimeParent(_jettag_c_if_261_11);
                _jettag_c_get_262_50.setTagInfo(_td_c_get_262_50);
                _jettag_c_get_262_50.doStart(context, out);
                _jettag_c_get_262_50.doEnd();
                out.setTag(null,-1,-1);
                out.write("($row[\"");  //$NON-NLS-1$        
                out.setTag("get",18397,18443);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_262_103 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_262_103); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_262_103.setRuntimeParent(_jettag_c_if_261_11);
                _jettag_c_get_262_103.setTagInfo(_td_c_get_262_103);
                _jettag_c_get_262_103.doStart(context, out);
                _jettag_c_get_262_103.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",18444,18484);
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
            out.setTag("if",18499,18623);
            RuntimeTagElement _jettag_c_if_263_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_263_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_263_11.setRuntimeParent(_jettag_c_iterate_253_4);
            _jettag_c_if_263_11.setTagInfo(_td_c_if_263_11);
            _jettag_c_if_263_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_263_11.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$query_");  //$NON-NLS-1$        
                out.setTag("get",18635,18675);
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
                out.setTag("get",18701,18766);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_265_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_265_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_265_7.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_265_7.setTagInfo(_td_c_get_265_7);
                _jettag_c_get_265_7.doStart(context, out);
                _jettag_c_get_265_7.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id AS ");  //$NON-NLS-1$        
                out.setTag("get",18773,18838);
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
                out.setTag("iterate",18843,18951);
                RuntimeTagElement _jettag_c_iterate_265_149 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_265_149); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_265_149.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_iterate_265_149.setTagInfo(_td_c_iterate_265_149);
                _jettag_c_iterate_265_149.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_265_149.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_265_149.getTagInfo().getAttribute("delimiter"),18843,18951);
                    out.loopIterate();
                    out.setTag("get",18951,19016);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_266_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_266_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_266_8.setRuntimeParent(_jettag_c_iterate_265_149);
                    _jettag_c_get_266_8.setTagInfo(_td_c_get_266_8);
                    _jettag_c_get_266_8.doStart(context, out);
                    _jettag_c_get_266_8.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",19017,19075);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_266_74 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_266_74); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_266_74.setRuntimeParent(_jettag_c_iterate_265_149);
                    _jettag_c_get_266_74.setTagInfo(_td_c_get_266_74);
                    _jettag_c_get_266_74.doStart(context, out);
                    _jettag_c_get_266_74.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" AS ");  //$NON-NLS-1$        
                    out.setTag("get",19079,19144);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_266_136 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_266_136); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_266_136.setRuntimeParent(_jettag_c_iterate_265_149);
                    _jettag_c_get_266_136.setTagInfo(_td_c_get_266_136);
                    _jettag_c_get_266_136.doStart(context, out);
                    _jettag_c_get_266_136.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",19145,19203);
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
                out.setTag("get",19223,19269);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_267_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_267_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_267_7.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_267_7.setTagInfo(_td_c_get_267_7);
                _jettag_c_get_267_7.doStart(context, out);
                _jettag_c_get_267_7.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",19270,19335);
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
                out.setTag("get",19354,19400);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_268_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_268_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_268_7.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_268_7.setTagInfo(_td_c_get_268_7);
                _jettag_c_get_268_7.doStart(context, out);
                _jettag_c_get_268_7.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",19401,19466);
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
                out.setTag("get",19487,19533);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_269_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_269_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_269_11.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_269_11.setTagInfo(_td_c_get_269_11);
                _jettag_c_get_269_11.doStart(context, out);
                _jettag_c_get_269_11.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",19534,19599);
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
                out.setTag("get",19616,19681);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_270_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_270_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_270_17.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_270_17.setTagInfo(_td_c_get_270_17);
                _jettag_c_get_270_17.doStart(context, out);
                _jettag_c_get_270_17.doEnd();
                out.setTag(null,-1,-1);
                out.write(" ON ");  //$NON-NLS-1$        
                out.setTag("get",19685,19750);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_270_86 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_270_86); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_270_86.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_270_86.setTagInfo(_td_c_get_270_86);
                _jettag_c_get_270_86.doStart(context, out);
                _jettag_c_get_270_86.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id = ");  //$NON-NLS-1$        
                out.setTag("get",19756,19802);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_270_157 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_270_157); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_270_157.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_270_157.setTagInfo(_td_c_get_270_157);
                _jettag_c_get_270_157.doStart(context, out);
                _jettag_c_get_270_157.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",19803,19868);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_270_204 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_270_204); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_270_204.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_270_204.setTagInfo(_td_c_get_270_204);
                _jettag_c_get_270_204.doStart(context, out);
                _jettag_c_get_270_204.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",19869,19934);
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
                out.setTag("get",19950,19996);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_271_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_271_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_271_12.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_271_12.setTagInfo(_td_c_get_271_12);
                _jettag_c_get_271_12.doStart(context, out);
                _jettag_c_get_271_12.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",19997,20062);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_271_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_271_59); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_271_59.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_271_59.setTagInfo(_td_c_get_271_59);
                _jettag_c_get_271_59.doStart(context, out);
                _jettag_c_get_271_59.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",20063,20109);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_271_125 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_271_125); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_271_125.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_271_125.setTagInfo(_td_c_get_271_125);
                _jettag_c_get_271_125.doStart(context, out);
                _jettag_c_get_271_125.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id = \" . $");  //$NON-NLS-1$        
                out.setTag("get",20120,20159);
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
                out.setTag("get",20196,20236);
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
                out.setTag("get",20257,20297);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_275_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_275_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_275_18.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_275_18.setTagInfo(_td_c_get_275_18);
                _jettag_c_get_275_18.doStart(context, out);
                _jettag_c_get_275_18.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = pg_fetch_assoc($query_");  //$NON-NLS-1$        
                out.setTag("get",20322,20362);
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
                out.setTag("get",20374,20432);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_276_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_276_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_276_8.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_276_8.setTagInfo(_td_c_get_276_8);
                _jettag_c_get_276_8.doStart(context, out);
                _jettag_c_get_276_8.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = new ");  //$NON-NLS-1$        
                out.setTag("get",20439,20502);
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
                out.setTag("get",20513,20571);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_277_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_277_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_277_8.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_277_8.setTagInfo(_td_c_get_277_8);
                _jettag_c_get_277_8.doStart(context, out);
                _jettag_c_get_277_8.doEnd();
                out.setTag(null,-1,-1);
                out.write("->setId($row_");  //$NON-NLS-1$        
                out.setTag("get",20584,20624);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_277_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_277_79); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_277_79.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_277_79.setTagInfo(_td_c_get_277_79);
                _jettag_c_get_277_79.doStart(context, out);
                _jettag_c_get_277_79.doEnd();
                out.setTag(null,-1,-1);
                out.write("[\"");  //$NON-NLS-1$        
                out.setTag("get",20626,20691);
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
                out.setTag("iterate",20705,20813);
                RuntimeTagElement _jettag_c_iterate_278_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_278_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_278_7.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_iterate_278_7.setTagInfo(_td_c_iterate_278_7);
                _jettag_c_iterate_278_7.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_278_7.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_278_7.getTagInfo().getAttribute("delimiter"),20705,20813);
                    out.loopIterate();
                    out.write("$");  //$NON-NLS-1$        
                    out.setTag("get",20814,20872);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_279_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_279_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_279_9.setRuntimeParent(_jettag_c_iterate_278_7);
                    _jettag_c_get_279_9.setTagInfo(_td_c_get_279_9);
                    _jettag_c_get_279_9.doStart(context, out);
                    _jettag_c_get_279_9.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->set");  //$NON-NLS-1$        
                    out.setTag("get",20877,20941);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(64);
                    RuntimeTagElement _jettag_c_get_279_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_279_72); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_279_72.setRuntimeParent(_jettag_c_iterate_278_7);
                    _jettag_c_get_279_72.setTagInfo(_td_c_get_279_72);
                    _jettag_c_get_279_72.doStart(context, out);
                    _jettag_c_get_279_72.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("($row_");  //$NON-NLS-1$        
                    out.setTag("get",20947,20987);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_279_142 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_279_142); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_279_142.setRuntimeParent(_jettag_c_iterate_278_7);
                    _jettag_c_get_279_142.setTagInfo(_td_c_get_279_142);
                    _jettag_c_get_279_142.doStart(context, out);
                    _jettag_c_get_279_142.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("[\"");  //$NON-NLS-1$        
                    out.setTag("get",20989,21054);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_279_184 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_279_184); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_279_184.setRuntimeParent(_jettag_c_iterate_278_7);
                    _jettag_c_get_279_184.setTagInfo(_td_c_get_279_184);
                    _jettag_c_get_279_184.doStart(context, out);
                    _jettag_c_get_279_184.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",21055,21113);
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
                out.setTag("get",21144,21183);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_281_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_281_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_281_8.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_281_8.setTagInfo(_td_c_get_281_8);
                _jettag_c_get_281_8.doStart(context, out);
                _jettag_c_get_281_8.doEnd();
                out.setTag(null,-1,-1);
                out.write("->add");  //$NON-NLS-1$        
                out.setTag("get",21188,21234);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_281_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_281_52); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_281_52.setRuntimeParent(_jettag_c_if_263_11);
                _jettag_c_get_281_52.setTagInfo(_td_c_get_281_52);
                _jettag_c_get_281_52.doStart(context, out);
                _jettag_c_get_281_52.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",21236,21294);
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
        out.setTag("get",21350,21389);
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
