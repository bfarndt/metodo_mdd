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
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
                ", ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_5 = new TagInfo("c:get", //$NON-NLS-1$
            24, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_25_13 = new TagInfo("c:iterate", //$NON-NLS-1$
            25, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
                ", ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_26_5 = new TagInfo("c:if", //$NON-NLS-1$
            26, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_12 = new TagInfo("c:get", //$NON-NLS-1$
            27, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_56 = new TagInfo("c:get", //$NON-NLS-1$
            27, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_28_12 = new TagInfo("c:if", //$NON-NLS-1$
            28, 12,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_13 = new TagInfo("c:get", //$NON-NLS-1$
            29, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_57 = new TagInfo("c:get", //$NON-NLS-1$
            29, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_26 = new TagInfo("c:get", //$NON-NLS-1$
            36, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_29 = new TagInfo("c:get", //$NON-NLS-1$
            38, 29,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_38_79 = new TagInfo("c:iterate", //$NON-NLS-1$
            38, 79,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
                ", ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_39_4 = new TagInfo("c:if", //$NON-NLS-1$
            39, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_6 = new TagInfo("c:get", //$NON-NLS-1$
            40, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_54 = new TagInfo("c:get", //$NON-NLS-1$
            40, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_98 = new TagInfo("c:get", //$NON-NLS-1$
            40, 98,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_41_11 = new TagInfo("c:if", //$NON-NLS-1$
            41, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_6 = new TagInfo("c:get", //$NON-NLS-1$
            42, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_55 = new TagInfo("c:get", //$NON-NLS-1$
            42, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_99 = new TagInfo("c:get", //$NON-NLS-1$
            42, 99,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_20 = new TagInfo("c:get", //$NON-NLS-1$
            43, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_27 = new TagInfo("c:get", //$NON-NLS-1$
            48, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_34 = new TagInfo("c:get", //$NON-NLS-1$
            50, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_97 = new TagInfo("c:get", //$NON-NLS-1$
            50, 97,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_4 = new TagInfo("c:get", //$NON-NLS-1$
            60, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_57 = new TagInfo("c:get", //$NON-NLS-1$
            60, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_61_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            61, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
                ", ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_62_5 = new TagInfo("c:if", //$NON-NLS-1$
            62, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_5 = new TagInfo("c:get", //$NON-NLS-1$
            63, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_77 = new TagInfo("c:get", //$NON-NLS-1$
            63, 77,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_63_146 = new TagInfo("c:iterate", //$NON-NLS-1$
            63, 146,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
                ", ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_6 = new TagInfo("c:get", //$NON-NLS-1$
            64, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_72 = new TagInfo("c:get", //$NON-NLS-1$
            64, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_134 = new TagInfo("c:get", //$NON-NLS-1$
            64, 134,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_200 = new TagInfo("c:get", //$NON-NLS-1$
            64, 200,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_65_11 = new TagInfo("c:if", //$NON-NLS-1$
            65, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_6 = new TagInfo("c:get", //$NON-NLS-1$
            66, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_53 = new TagInfo("c:get", //$NON-NLS-1$
            66, 53,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_97 = new TagInfo("c:get", //$NON-NLS-1$
            66, 97,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_144 = new TagInfo("c:get", //$NON-NLS-1$
            66, 144,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_9 = new TagInfo("c:get", //$NON-NLS-1$
            67, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_68_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            68, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_68_68 = new TagInfo("c:if", //$NON-NLS-1$
            68, 68,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_69_16 = new TagInfo("c:get", //$NON-NLS-1$
            69, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_69_85 = new TagInfo("c:get", //$NON-NLS-1$
            69, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_69_156 = new TagInfo("c:get", //$NON-NLS-1$
            69, 156,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_69_203 = new TagInfo("c:get", //$NON-NLS-1$
            69, 203,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_70_13 = new TagInfo("c:get", //$NON-NLS-1$
            70, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_75_6 = new TagInfo("c:get", //$NON-NLS-1$
            75, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_75_52 = new TagInfo("c:get", //$NON-NLS-1$
            75, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_77_6 = new TagInfo("c:get", //$NON-NLS-1$
            77, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_77_59 = new TagInfo("c:get", //$NON-NLS-1$
            77, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_78_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            78, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_79_5 = new TagInfo("c:if", //$NON-NLS-1$
            79, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_80_6 = new TagInfo("c:get", //$NON-NLS-1$
            80, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_80_71 = new TagInfo("c:get", //$NON-NLS-1$
            80, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_81_6 = new TagInfo("c:get", //$NON-NLS-1$
            81, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_81_78 = new TagInfo("c:get", //$NON-NLS-1$
            81, 78,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_82_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            82, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_83_7 = new TagInfo("c:get", //$NON-NLS-1$
            83, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_83_70 = new TagInfo("c:get", //$NON-NLS-1$
            83, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_83_141 = new TagInfo("c:get", //$NON-NLS-1$
            83, 141,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_83_207 = new TagInfo("c:get", //$NON-NLS-1$
            83, 207,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_85_6 = new TagInfo("c:get", //$NON-NLS-1$
            85, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_85_50 = new TagInfo("c:get", //$NON-NLS-1$
            85, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_85_98 = new TagInfo("c:get", //$NON-NLS-1$
            85, 98,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_86_11 = new TagInfo("c:if", //$NON-NLS-1$
            86, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_87_6 = new TagInfo("c:get", //$NON-NLS-1$
            87, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_87_50 = new TagInfo("c:get", //$NON-NLS-1$
            87, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_87_103 = new TagInfo("c:get", //$NON-NLS-1$
            87, 103,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_87_150 = new TagInfo("c:get", //$NON-NLS-1$
            87, 150,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_89_18 = new TagInfo("c:get", //$NON-NLS-1$
            89, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_23 = new TagInfo("c:get", //$NON-NLS-1$
            96, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_102_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            102, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_103_7 = new TagInfo("c:if", //$NON-NLS-1$
            103, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_104_15 = new TagInfo("c:get", //$NON-NLS-1$
            104, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_104_59 = new TagInfo("c:get", //$NON-NLS-1$
            104, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_104_119 = new TagInfo("c:get", //$NON-NLS-1$
            104, 119,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_104_163 = new TagInfo("c:get", //$NON-NLS-1$
            104, 163,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_105_19 = new TagInfo("c:get", //$NON-NLS-1$
            105, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_105_63 = new TagInfo("c:get", //$NON-NLS-1$
            105, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_105_117 = new TagInfo("c:get", //$NON-NLS-1$
            105, 117,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_105_161 = new TagInfo("c:get", //$NON-NLS-1$
            105, 161,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_106_10 = new TagInfo("c:if", //$NON-NLS-1$
            106, 10,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_107_13 = new TagInfo("c:get", //$NON-NLS-1$
            107, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_107_57 = new TagInfo("c:get", //$NON-NLS-1$
            107, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_114_4 = new TagInfo("c:if", //$NON-NLS-1$
            114, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_115_20 = new TagInfo("c:get", //$NON-NLS-1$
            115, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_115_64 = new TagInfo("c:get", //$NON-NLS-1$
            115, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_118_16 = new TagInfo("c:get", //$NON-NLS-1$
            118, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_118_60 = new TagInfo("c:get", //$NON-NLS-1$
            118, 60,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_118_113 = new TagInfo("c:get", //$NON-NLS-1$
            118, 113,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_123_18 = new TagInfo("c:get", //$NON-NLS-1$
            123, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_123_65 = new TagInfo("c:get", //$NON-NLS-1$
            123, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_123_113 = new TagInfo("c:get", //$NON-NLS-1$
            123, 113,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_128_17 = new TagInfo("c:get", //$NON-NLS-1$
            128, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_128_64 = new TagInfo("c:get", //$NON-NLS-1$
            128, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_128_112 = new TagInfo("c:get", //$NON-NLS-1$
            128, 112,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_128_156 = new TagInfo("c:get", //$NON-NLS-1$
            128, 156,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_130_11 = new TagInfo("c:if", //$NON-NLS-1$
            130, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_131_17 = new TagInfo("c:get", //$NON-NLS-1$
            131, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_131_64 = new TagInfo("c:get", //$NON-NLS-1$
            131, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_131_113 = new TagInfo("c:get", //$NON-NLS-1$
            131, 113,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_131_157 = new TagInfo("c:get", //$NON-NLS-1$
            131, 157,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_136_4 = new TagInfo("c:get", //$NON-NLS-1$
            136, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_136_57 = new TagInfo("c:get", //$NON-NLS-1$
            136, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_136_107 = new TagInfo("c:iterate", //$NON-NLS-1$
            136, 107,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
                ", ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_137_5 = new TagInfo("c:if", //$NON-NLS-1$
            137, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_138_5 = new TagInfo("c:get", //$NON-NLS-1$
            138, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_138_77 = new TagInfo("c:get", //$NON-NLS-1$
            138, 77,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_138_146 = new TagInfo("c:iterate", //$NON-NLS-1$
            138, 146,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
                ", ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_139_6 = new TagInfo("c:get", //$NON-NLS-1$
            139, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_139_72 = new TagInfo("c:get", //$NON-NLS-1$
            139, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_139_134 = new TagInfo("c:get", //$NON-NLS-1$
            139, 134,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_139_200 = new TagInfo("c:get", //$NON-NLS-1$
            139, 200,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_140_11 = new TagInfo("c:if", //$NON-NLS-1$
            140, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_141_6 = new TagInfo("c:get", //$NON-NLS-1$
            141, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_141_53 = new TagInfo("c:get", //$NON-NLS-1$
            141, 53,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_141_97 = new TagInfo("c:get", //$NON-NLS-1$
            141, 97,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_141_144 = new TagInfo("c:get", //$NON-NLS-1$
            141, 144,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_142_9 = new TagInfo("c:get", //$NON-NLS-1$
            142, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_143_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            143, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_143_68 = new TagInfo("c:if", //$NON-NLS-1$
            143, 68,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_144_16 = new TagInfo("c:get", //$NON-NLS-1$
            144, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_144_85 = new TagInfo("c:get", //$NON-NLS-1$
            144, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_144_156 = new TagInfo("c:get", //$NON-NLS-1$
            144, 156,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_144_203 = new TagInfo("c:get", //$NON-NLS-1$
            144, 203,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_145_26 = new TagInfo("c:get", //$NON-NLS-1$
            145, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_149_6 = new TagInfo("c:get", //$NON-NLS-1$
            149, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_149_52 = new TagInfo("c:get", //$NON-NLS-1$
            149, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_151_6 = new TagInfo("c:get", //$NON-NLS-1$
            151, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_151_59 = new TagInfo("c:get", //$NON-NLS-1$
            151, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_152_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            152, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_153_5 = new TagInfo("c:if", //$NON-NLS-1$
            153, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_154_6 = new TagInfo("c:get", //$NON-NLS-1$
            154, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_154_71 = new TagInfo("c:get", //$NON-NLS-1$
            154, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_155_6 = new TagInfo("c:get", //$NON-NLS-1$
            155, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_155_78 = new TagInfo("c:get", //$NON-NLS-1$
            155, 78,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_156_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            156, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_157_7 = new TagInfo("c:get", //$NON-NLS-1$
            157, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_157_70 = new TagInfo("c:get", //$NON-NLS-1$
            157, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_157_141 = new TagInfo("c:get", //$NON-NLS-1$
            157, 141,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_157_207 = new TagInfo("c:get", //$NON-NLS-1$
            157, 207,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_6 = new TagInfo("c:get", //$NON-NLS-1$
            159, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_50 = new TagInfo("c:get", //$NON-NLS-1$
            159, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_98 = new TagInfo("c:get", //$NON-NLS-1$
            159, 98,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_160_11 = new TagInfo("c:if", //$NON-NLS-1$
            160, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_161_6 = new TagInfo("c:get", //$NON-NLS-1$
            161, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_161_50 = new TagInfo("c:get", //$NON-NLS-1$
            161, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_161_103 = new TagInfo("c:get", //$NON-NLS-1$
            161, 103,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@tableDBName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_161_150 = new TagInfo("c:get", //$NON-NLS-1$
            161, 150,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_163_18 = new TagInfo("c:get", //$NON-NLS-1$
            163, 18,
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
out.jump(79);
        out.setTag("iterate",875,954);
        RuntimeTagElement _jettag_c_iterate_23_81 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_23_81); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_23_81.setRuntimeParent(null);
        _jettag_c_iterate_23_81.setTagInfo(_td_c_iterate_23_81);
        _jettag_c_iterate_23_81.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_23_81.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_23_81.getTagInfo().getAttribute("delimiter"),875,954);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\t\t\t");  //$NON-NLS-1$        
            out.setTag("get",959,999);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(40);
            RuntimeTagElement _jettag_c_get_24_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_24_5.setRuntimeParent(_jettag_c_iterate_23_81);
            _jettag_c_get_24_5.setTagInfo(_td_c_get_24_5);
            _jettag_c_get_24_5.doStart(context, out);
            _jettag_c_get_24_5.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_c_iterate_23_81.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_23_81.doEnd();
        out.loopEnd();
        out.endTag("iterate",45);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\t) VALUES(");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(79);
        out.setTag("iterate",1024,1103);
        RuntimeTagElement _jettag_c_iterate_25_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_25_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_25_13.setRuntimeParent(null);
        _jettag_c_iterate_25_13.setTagInfo(_td_c_iterate_25_13);
        _jettag_c_iterate_25_13.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_25_13.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_25_13.getTagInfo().getAttribute("delimiter"),1024,1103);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\t\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(67);
            out.setTag("if",1108,1175);
            RuntimeTagElement _jettag_c_if_26_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_26_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_26_5.setRuntimeParent(_jettag_c_iterate_25_13);
            _jettag_c_if_26_5.setTagInfo(_td_c_if_26_5);
            _jettag_c_if_26_5.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_26_5.okToProcessBody()) {
                out.write("\" . $");  //$NON-NLS-1$        
                out.setTag("get",1180,1219);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_27_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_27_12.setRuntimeParent(_jettag_c_if_26_5);
                _jettag_c_get_27_12.setTagInfo(_td_c_get_27_12);
                _jettag_c_get_27_12.doStart(context, out);
                _jettag_c_get_27_12.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",1224,1270);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_27_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_56); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_27_56.setRuntimeParent(_jettag_c_if_26_5);
                _jettag_c_get_27_56.setTagInfo(_td_c_get_27_56);
                _jettag_c_get_27_56.doStart(context, out);
                _jettag_c_get_27_56.doEnd();
                out.setTag(null,-1,-1);
                out.write("()->getId() . \"");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_26_5.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_26_5.doEnd();
            out.endTag("if",115);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(70);
            out.setTag("if",1297,1367);
            RuntimeTagElement _jettag_c_if_28_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_28_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_28_12.setRuntimeParent(_jettag_c_iterate_25_13);
            _jettag_c_if_28_12.setTagInfo(_td_c_if_28_12);
            _jettag_c_if_28_12.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_28_12.okToProcessBody()) {
                out.write("'\" . $");  //$NON-NLS-1$        
                out.setTag("get",1373,1412);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_29_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_29_13.setRuntimeParent(_jettag_c_if_28_12);
                _jettag_c_get_29_13.setTagInfo(_td_c_get_29_13);
                _jettag_c_get_29_13.doStart(context, out);
                _jettag_c_get_29_13.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",1417,1463);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_29_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_57); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_29_57.setRuntimeParent(_jettag_c_if_28_12);
                _jettag_c_get_29_57.setTagInfo(_td_c_get_29_57);
                _jettag_c_get_29_57.doStart(context, out);
                _jettag_c_get_29_57.doEnd();
                out.setTag(null,-1,-1);
                out.write("() . \"'");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_28_12.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_28_12.doEnd();
            out.endTag("if",103);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_25_13.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_25_13.doEnd();
        out.loopEnd();
        out.endTag("iterate",374);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\t)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\treturn (pg_affected_rows($query) > 0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic function update($");  //$NON-NLS-1$        
        out.setTag("get",1572,1611);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_36_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_36_26.setRuntimeParent(null);
        _jettag_c_get_36_26.setTagInfo(_td_c_get_36_26);
        _jettag_c_get_36_26.doStart(context, out);
        _jettag_c_get_36_26.doEnd();
        out.setTag(null,-1,-1);
        out.write(")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$query = pg_query(\"UPDATE ");  //$NON-NLS-1$        
        out.setTag("get",1644,1690);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_38_29 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_29); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_38_29.setRuntimeParent(null);
        _jettag_c_get_38_29.setTagInfo(_td_c_get_38_29);
        _jettag_c_get_38_29.doStart(context, out);
        _jettag_c_get_38_29.doEnd();
        out.setTag(null,-1,-1);
        out.write(" SET");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(79);
        out.setTag("iterate",1694,1773);
        RuntimeTagElement _jettag_c_iterate_38_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_38_79); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_38_79.setRuntimeParent(null);
        _jettag_c_iterate_38_79.setTagInfo(_td_c_iterate_38_79);
        _jettag_c_iterate_38_79.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_38_79.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_38_79.getTagInfo().getAttribute("delimiter"),1694,1773);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(66);
            out.setTag("if",1777,1843);
            RuntimeTagElement _jettag_c_if_39_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_39_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_39_4.setRuntimeParent(_jettag_c_iterate_38_79);
            _jettag_c_if_39_4.setTagInfo(_td_c_if_39_4);
            _jettag_c_if_39_4.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_39_4.okToProcessBody()) {
                out.setTag("get",1843,1883);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_40_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_40_6.setRuntimeParent(_jettag_c_if_39_4);
                _jettag_c_get_40_6.setTagInfo(_td_c_get_40_6);
                _jettag_c_get_40_6.doStart(context, out);
                _jettag_c_get_40_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = \" . $");  //$NON-NLS-1$        
                out.setTag("get",1891,1930);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_40_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_54); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_40_54.setRuntimeParent(_jettag_c_if_39_4);
                _jettag_c_get_40_54.setTagInfo(_td_c_get_40_54);
                _jettag_c_get_40_54.doStart(context, out);
                _jettag_c_get_40_54.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",1935,1981);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_40_98 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_98); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_40_98.setRuntimeParent(_jettag_c_if_39_4);
                _jettag_c_get_40_98.setTagInfo(_td_c_get_40_98);
                _jettag_c_get_40_98.doStart(context, out);
                _jettag_c_get_40_98.doEnd();
                out.setTag(null,-1,-1);
                out.write("()->getId() . \"");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_39_4.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_39_4.doEnd();
            out.endTag("if",157);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(69);
            out.setTag("if",2007,2076);
            RuntimeTagElement _jettag_c_if_41_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_41_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_41_11.setRuntimeParent(_jettag_c_iterate_38_79);
            _jettag_c_if_41_11.setTagInfo(_td_c_if_41_11);
            _jettag_c_if_41_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_41_11.okToProcessBody()) {
                out.setTag("get",2076,2116);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_42_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_42_6.setRuntimeParent(_jettag_c_if_41_11);
                _jettag_c_get_42_6.setTagInfo(_td_c_get_42_6);
                _jettag_c_get_42_6.doStart(context, out);
                _jettag_c_get_42_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = '\" . $");  //$NON-NLS-1$        
                out.setTag("get",2125,2164);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_42_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_42_55.setRuntimeParent(_jettag_c_if_41_11);
                _jettag_c_get_42_55.setTagInfo(_td_c_get_42_55);
                _jettag_c_get_42_55.doStart(context, out);
                _jettag_c_get_42_55.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",2169,2215);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_42_99 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_99); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_42_99.setRuntimeParent(_jettag_c_if_41_11);
                _jettag_c_get_42_99.setTagInfo(_td_c_get_42_99);
                _jettag_c_get_42_99.doStart(context, out);
                _jettag_c_get_42_99.doEnd();
                out.setTag(null,-1,-1);
                out.write("() . \"'");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_41_11.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_41_11.doEnd();
            out.endTag("if",146);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_38_79.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_38_79.doEnd();
        out.loopEnd();
        out.endTag("iterate",456);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\tWHERE id = \" . $");  //$NON-NLS-1$        
        out.setTag("get",2261,2300);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_43_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_20); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_43_20.setRuntimeParent(null);
        _jettag_c_get_43_20.setTagInfo(_td_c_get_43_20);
        _jettag_c_get_43_20.doStart(context, out);
        _jettag_c_get_43_20.doEnd();
        out.setTag(null,-1,-1);
        out.write("->getId());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\treturn (pg_affected_rows($query) > 0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic function destroy($");  //$NON-NLS-1$        
        out.setTag("get",2384,2423);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_48_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_27); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_48_27.setRuntimeParent(null);
        _jettag_c_get_48_27.setTagInfo(_td_c_get_48_27);
        _jettag_c_get_48_27.doStart(context, out);
        _jettag_c_get_48_27.doEnd();
        out.setTag(null,-1,-1);
        out.write(")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$query = pg_query(\"DELETE FROM ");  //$NON-NLS-1$        
        out.setTag("get",2461,2507);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_50_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_34); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_50_34.setRuntimeParent(null);
        _jettag_c_get_50_34.setTagInfo(_td_c_get_50_34);
        _jettag_c_get_50_34.doStart(context, out);
        _jettag_c_get_50_34.doEnd();
        out.setTag(null,-1,-1);
        out.write(" WHERE id = \" . $");  //$NON-NLS-1$        
        out.setTag("get",2524,2563);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_50_97 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_97); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_50_97.setRuntimeParent(null);
        _jettag_c_get_50_97.setTagInfo(_td_c_get_50_97);
        _jettag_c_get_50_97.doStart(context, out);
        _jettag_c_get_50_97.doEnd();
        out.setTag(null,-1,-1);
        out.write("->getId());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\treturn (pg_affected_rows($query) > 0);");  //$NON-NLS-1$        
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
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.setTag("get",2703,2749);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_60_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_60_4.setRuntimeParent(null);
        _jettag_c_get_60_4.setTagInfo(_td_c_get_60_4);
        _jettag_c_get_60_4.doStart(context, out);
        _jettag_c_get_60_4.doEnd();
        out.setTag(null,-1,-1);
        out.write(".id AS ");  //$NON-NLS-1$        
        out.setTag("get",2756,2802);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_60_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_57); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_60_57.setRuntimeParent(null);
        _jettag_c_get_60_57.setTagInfo(_td_c_get_60_57);
        _jettag_c_get_60_57.doStart(context, out);
        _jettag_c_get_60_57.doEnd();
        out.setTag(null,-1,-1);
        out.write("_id,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(84);
        out.setTag("iterate",2810,2894);
        RuntimeTagElement _jettag_c_iterate_61_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_61_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_61_4.setRuntimeParent(null);
        _jettag_c_iterate_61_4.setTagInfo(_td_c_iterate_61_4);
        _jettag_c_iterate_61_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_61_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_61_4.getTagInfo().getAttribute("delimiter"),2810,2894);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(61);
            out.setTag("if",2894,2955);
            RuntimeTagElement _jettag_c_if_62_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_62_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_62_5.setRuntimeParent(_jettag_c_iterate_61_4);
            _jettag_c_if_62_5.setTagInfo(_td_c_if_62_5);
            _jettag_c_if_62_5.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_62_5.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",2960,3025);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_63_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_63_5.setRuntimeParent(_jettag_c_if_62_5);
                _jettag_c_get_63_5.setTagInfo(_td_c_get_63_5);
                _jettag_c_get_63_5.doStart(context, out);
                _jettag_c_get_63_5.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id AS ");  //$NON-NLS-1$        
                out.setTag("get",3032,3097);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_63_77 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_77); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_63_77.setRuntimeParent(_jettag_c_if_62_5);
                _jettag_c_get_63_77.setTagInfo(_td_c_get_63_77);
                _jettag_c_get_63_77.doStart(context, out);
                _jettag_c_get_63_77.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id,");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(121);
                out.setTag("iterate",3101,3222);
                RuntimeTagElement _jettag_c_iterate_63_146 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_63_146); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_63_146.setRuntimeParent(_jettag_c_if_62_5);
                _jettag_c_iterate_63_146.setTagInfo(_td_c_iterate_63_146);
                _jettag_c_iterate_63_146.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_63_146.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_63_146.getTagInfo().getAttribute("delimiter"),3101,3222);
                    out.loopIterate();
                    out.setTag("get",3222,3287);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_64_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_6); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_64_6.setRuntimeParent(_jettag_c_iterate_63_146);
                    _jettag_c_get_64_6.setTagInfo(_td_c_get_64_6);
                    _jettag_c_get_64_6.doStart(context, out);
                    _jettag_c_get_64_6.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",3288,3346);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_64_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_72); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_64_72.setRuntimeParent(_jettag_c_iterate_63_146);
                    _jettag_c_get_64_72.setTagInfo(_td_c_get_64_72);
                    _jettag_c_get_64_72.doStart(context, out);
                    _jettag_c_get_64_72.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" AS ");  //$NON-NLS-1$        
                    out.setTag("get",3350,3415);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_64_134 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_134); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_64_134.setRuntimeParent(_jettag_c_iterate_63_146);
                    _jettag_c_get_64_134.setTagInfo(_td_c_get_64_134);
                    _jettag_c_get_64_134.doStart(context, out);
                    _jettag_c_get_64_134.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",3416,3474);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_64_200 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_200); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_64_200.setRuntimeParent(_jettag_c_iterate_63_146);
                    _jettag_c_get_64_200.setTagInfo(_td_c_get_64_200);
                    _jettag_c_get_64_200.doStart(context, out);
                    _jettag_c_get_64_200.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_c_iterate_63_146.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_63_146.doEnd();
                out.loopEnd();
                out.endTag("iterate",252);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_62_5.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_62_5.doEnd();
            out.endTag("if",535);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(69);
            out.setTag("if",3497,3566);
            RuntimeTagElement _jettag_c_if_65_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_65_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_65_11.setRuntimeParent(_jettag_c_iterate_61_4);
            _jettag_c_if_65_11.setTagInfo(_td_c_if_65_11);
            _jettag_c_if_65_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_65_11.okToProcessBody()) {
                out.setTag("get",3566,3612);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_66_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_66_6.setRuntimeParent(_jettag_c_if_65_11);
                _jettag_c_get_66_6.setTagInfo(_td_c_get_66_6);
                _jettag_c_get_66_6.doStart(context, out);
                _jettag_c_get_66_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",3613,3653);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_66_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_53); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_66_53.setRuntimeParent(_jettag_c_if_65_11);
                _jettag_c_get_66_53.setTagInfo(_td_c_get_66_53);
                _jettag_c_get_66_53.doStart(context, out);
                _jettag_c_get_66_53.doEnd();
                out.setTag(null,-1,-1);
                out.write(" AS ");  //$NON-NLS-1$        
                out.setTag("get",3657,3703);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_66_97 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_97); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_66_97.setRuntimeParent(_jettag_c_if_65_11);
                _jettag_c_get_66_97.setTagInfo(_td_c_get_66_97);
                _jettag_c_get_66_97.doStart(context, out);
                _jettag_c_get_66_97.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",3704,3744);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_66_144 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_144); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_66_144.setRuntimeParent(_jettag_c_if_65_11);
                _jettag_c_get_66_144.setTagInfo(_td_c_get_66_144);
                _jettag_c_get_66_144.doStart(context, out);
                _jettag_c_get_66_144.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_c_if_65_11.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_65_11.doEnd();
            out.endTag("if",178);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_61_4.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_61_4.doEnd();
        out.loopEnd();
        out.endTag("iterate",857);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\tFROM ");  //$NON-NLS-1$        
        out.setTag("get",3772,3818);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_67_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_67_9.setRuntimeParent(null);
        _jettag_c_get_67_9.setTagInfo(_td_c_get_67_9);
        _jettag_c_get_67_9.doStart(context, out);
        _jettag_c_get_67_9.doEnd();
        out.setTag(null,-1,-1);
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(64);
        out.setTag("iterate",3822,3886);
        RuntimeTagElement _jettag_c_iterate_68_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_68_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_68_4.setRuntimeParent(null);
        _jettag_c_iterate_68_4.setTagInfo(_td_c_iterate_68_4);
        _jettag_c_iterate_68_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_68_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_68_4.getTagInfo().getAttribute("delimiter"),3822,3886);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(65);
            out.setTag("if",3886,3951);
            RuntimeTagElement _jettag_c_if_68_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_68_68); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_68_68.setRuntimeParent(_jettag_c_iterate_68_4);
            _jettag_c_if_68_68.setTagInfo(_td_c_if_68_68);
            _jettag_c_if_68_68.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_68_68.okToProcessBody()) {
                out.write("INNER JOIN ");  //$NON-NLS-1$        
                out.setTag("get",3962,4027);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_69_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_69_16.setRuntimeParent(_jettag_c_if_68_68);
                _jettag_c_get_69_16.setTagInfo(_td_c_get_69_16);
                _jettag_c_get_69_16.doStart(context, out);
                _jettag_c_get_69_16.doEnd();
                out.setTag(null,-1,-1);
                out.write(" ON ");  //$NON-NLS-1$        
                out.setTag("get",4031,4096);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_69_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_85); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_69_85.setRuntimeParent(_jettag_c_if_68_68);
                _jettag_c_get_69_85.setTagInfo(_td_c_get_69_85);
                _jettag_c_get_69_85.doStart(context, out);
                _jettag_c_get_69_85.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id = ");  //$NON-NLS-1$        
                out.setTag("get",4102,4148);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_69_156 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_156); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_69_156.setRuntimeParent(_jettag_c_if_68_68);
                _jettag_c_get_69_156.setTagInfo(_td_c_get_69_156);
                _jettag_c_get_69_156.doStart(context, out);
                _jettag_c_get_69_156.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",4149,4189);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_69_203 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_203); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_69_203.setRuntimeParent(_jettag_c_if_68_68);
                _jettag_c_get_69_203.setTagInfo(_td_c_get_69_203);
                _jettag_c_get_69_203.doStart(context, out);
                _jettag_c_get_69_203.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_c_if_68_68.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_68_68.doEnd();
            out.endTag("if",238);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_68_4.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_68_4.doEnd();
        out.loopEnd();
        out.endTag("iterate",310);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\tORDER BY ");  //$NON-NLS-1$        
        out.setTag("get",4221,4267);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_70_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_70_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_70_13.setRuntimeParent(null);
        _jettag_c_get_70_13.setTagInfo(_td_c_get_70_13);
        _jettag_c_get_70_13.doStart(context, out);
        _jettag_c_get_70_13.doEnd();
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
        out.setTag("get",4342,4381);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_75_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_75_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_75_6.setRuntimeParent(null);
        _jettag_c_get_75_6.setTagInfo(_td_c_get_75_6);
        _jettag_c_get_75_6.doStart(context, out);
        _jettag_c_get_75_6.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = new ");  //$NON-NLS-1$        
        out.setTag("get",4388,4432);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_75_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_75_52); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_75_52.setRuntimeParent(null);
        _jettag_c_get_75_52.setTagInfo(_td_c_get_75_52);
        _jettag_c_get_75_52.doStart(context, out);
        _jettag_c_get_75_52.doEnd();
        out.setTag(null,-1,-1);
        out.write("();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\t\t$");  //$NON-NLS-1$        
        out.setTag("get",4442,4481);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_77_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_77_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_77_6.setRuntimeParent(null);
        _jettag_c_get_77_6.setTagInfo(_td_c_get_77_6);
        _jettag_c_get_77_6.doStart(context, out);
        _jettag_c_get_77_6.doEnd();
        out.setTag(null,-1,-1);
        out.write("->setId($row[\"");  //$NON-NLS-1$        
        out.setTag("get",4495,4541);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_77_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_77_59); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_77_59.setRuntimeParent(null);
        _jettag_c_get_77_59.setTagInfo(_td_c_get_77_59);
        _jettag_c_get_77_59.doStart(context, out);
        _jettag_c_get_77_59.doEnd();
        out.setTag(null,-1,-1);
        out.write("_id\"]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(68);
        out.setTag("iterate",4552,4620);
        RuntimeTagElement _jettag_c_iterate_78_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_78_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_78_4.setRuntimeParent(null);
        _jettag_c_iterate_78_4.setTagInfo(_td_c_iterate_78_4);
        _jettag_c_iterate_78_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_78_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_78_4.getTagInfo().getAttribute("delimiter"),4552,4620);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(61);
            out.setTag("if",4620,4681);
            RuntimeTagElement _jettag_c_if_79_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_79_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_79_5.setRuntimeParent(_jettag_c_iterate_78_4);
            _jettag_c_if_79_5.setTagInfo(_td_c_if_79_5);
            _jettag_c_if_79_5.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_79_5.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",4687,4745);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_80_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_80_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_80_6.setRuntimeParent(_jettag_c_if_79_5);
                _jettag_c_get_80_6.setTagInfo(_td_c_get_80_6);
                _jettag_c_get_80_6.doStart(context, out);
                _jettag_c_get_80_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = new ");  //$NON-NLS-1$        
                out.setTag("get",4752,4815);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(63);
                RuntimeTagElement _jettag_c_get_80_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_80_71); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_80_71.setRuntimeParent(_jettag_c_if_79_5);
                _jettag_c_get_80_71.setTagInfo(_td_c_get_80_71);
                _jettag_c_get_80_71.doStart(context, out);
                _jettag_c_get_80_71.doEnd();
                out.setTag(null,-1,-1);
                out.write("();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",4824,4882);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_81_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_81_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_81_6.setRuntimeParent(_jettag_c_if_79_5);
                _jettag_c_get_81_6.setTagInfo(_td_c_get_81_6);
                _jettag_c_get_81_6.doStart(context, out);
                _jettag_c_get_81_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->setId($row[\"");  //$NON-NLS-1$        
                out.setTag("get",4896,4961);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_81_78 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_81_78); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_81_78.setRuntimeParent(_jettag_c_if_79_5);
                _jettag_c_get_81_78.setTagInfo(_td_c_get_81_78);
                _jettag_c_get_81_78.doStart(context, out);
                _jettag_c_get_81_78.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id\"]);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(106);
                out.setTag("iterate",4973,5079);
                RuntimeTagElement _jettag_c_iterate_82_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_82_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_82_5.setRuntimeParent(_jettag_c_if_79_5);
                _jettag_c_iterate_82_5.setTagInfo(_td_c_iterate_82_5);
                _jettag_c_iterate_82_5.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_82_5.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_82_5.getTagInfo().getAttribute("delimiter"),4973,5079);
                    out.loopIterate();
                    out.write("$");  //$NON-NLS-1$        
                    out.setTag("get",5080,5138);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_83_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_83_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_83_7.setRuntimeParent(_jettag_c_iterate_82_5);
                    _jettag_c_get_83_7.setTagInfo(_td_c_get_83_7);
                    _jettag_c_get_83_7.doStart(context, out);
                    _jettag_c_get_83_7.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->set");  //$NON-NLS-1$        
                    out.setTag("get",5143,5207);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(64);
                    RuntimeTagElement _jettag_c_get_83_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_83_70); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_83_70.setRuntimeParent(_jettag_c_iterate_82_5);
                    _jettag_c_get_83_70.setTagInfo(_td_c_get_83_70);
                    _jettag_c_get_83_70.doStart(context, out);
                    _jettag_c_get_83_70.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("($row[\"");  //$NON-NLS-1$        
                    out.setTag("get",5214,5279);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_83_141 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_83_141); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_83_141.setRuntimeParent(_jettag_c_iterate_82_5);
                    _jettag_c_get_83_141.setTagInfo(_td_c_get_83_141);
                    _jettag_c_get_83_141.doStart(context, out);
                    _jettag_c_get_83_141.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",5280,5338);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_83_207 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_83_207); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_83_207.setRuntimeParent(_jettag_c_iterate_82_5);
                    _jettag_c_get_83_207.setTagInfo(_td_c_get_83_207);
                    _jettag_c_get_83_207.doStart(context, out);
                    _jettag_c_get_83_207.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\"]);");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_82_5.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_82_5.doEnd();
                out.loopEnd();
                out.endTag("iterate",268);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",5365,5404);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_85_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_85_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_85_6.setRuntimeParent(_jettag_c_if_79_5);
                _jettag_c_get_85_6.setTagInfo(_td_c_get_85_6);
                _jettag_c_get_85_6.doStart(context, out);
                _jettag_c_get_85_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->set");  //$NON-NLS-1$        
                out.setTag("get",5409,5455);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_85_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_85_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_85_50.setRuntimeParent(_jettag_c_if_79_5);
                _jettag_c_get_85_50.setTagInfo(_td_c_get_85_50);
                _jettag_c_get_85_50.doStart(context, out);
                _jettag_c_get_85_50.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",5457,5515);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_85_98 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_85_98); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_85_98.setRuntimeParent(_jettag_c_if_79_5);
                _jettag_c_get_85_98.setTagInfo(_td_c_get_85_98);
                _jettag_c_get_85_98.doStart(context, out);
                _jettag_c_get_85_98.doEnd();
                out.setTag(null,-1,-1);
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_79_5.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_79_5.doEnd();
            out.endTag("if",840);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(64);
            out.setTag("if",5528,5592);
            RuntimeTagElement _jettag_c_if_86_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_86_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_86_11.setRuntimeParent(_jettag_c_iterate_78_4);
            _jettag_c_if_86_11.setTagInfo(_td_c_if_86_11);
            _jettag_c_if_86_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_86_11.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",5598,5637);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_87_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_87_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_87_6.setRuntimeParent(_jettag_c_if_86_11);
                _jettag_c_get_87_6.setTagInfo(_td_c_get_87_6);
                _jettag_c_get_87_6.doStart(context, out);
                _jettag_c_get_87_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->set");  //$NON-NLS-1$        
                out.setTag("get",5642,5688);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_87_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_87_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_87_50.setRuntimeParent(_jettag_c_if_86_11);
                _jettag_c_get_87_50.setTagInfo(_td_c_get_87_50);
                _jettag_c_get_87_50.doStart(context, out);
                _jettag_c_get_87_50.doEnd();
                out.setTag(null,-1,-1);
                out.write("($row[\"");  //$NON-NLS-1$        
                out.setTag("get",5695,5741);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_87_103 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_87_103); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_87_103.setRuntimeParent(_jettag_c_if_86_11);
                _jettag_c_get_87_103.setTagInfo(_td_c_get_87_103);
                _jettag_c_get_87_103.doStart(context, out);
                _jettag_c_get_87_103.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",5742,5782);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_87_150 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_87_150); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_87_150.setRuntimeParent(_jettag_c_if_86_11);
                _jettag_c_get_87_150.setTagInfo(_td_c_get_87_150);
                _jettag_c_get_87_150.doStart(context, out);
                _jettag_c_get_87_150.doEnd();
                out.setTag(null,-1,-1);
                out.write("\"]);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_86_11.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_86_11.doEnd();
            out.endTag("if",198);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_78_4.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_78_4.doEnd();
        out.loopEnd();
        out.endTag("iterate",1177);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\t\t$result[] = $");  //$NON-NLS-1$        
        out.setTag("get",5827,5866);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_89_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_89_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_89_18.setRuntimeParent(null);
        _jettag_c_get_89_18.setTagInfo(_td_c_get_89_18);
        _jettag_c_get_89_18.doStart(context, out);
        _jettag_c_get_89_18.doEnd();
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
        out.setTag("get",5922,5961);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_96_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_23); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_96_23.setRuntimeParent(null);
        _jettag_c_get_96_23.setTagInfo(_td_c_get_96_23);
        _jettag_c_get_96_23.doStart(context, out);
        _jettag_c_get_96_23.doEnd();
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
        out.setTag("iterate",6005,6069);
        RuntimeTagElement _jettag_c_iterate_102_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_102_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_102_2.setRuntimeParent(null);
        _jettag_c_iterate_102_2.setTagInfo(_td_c_iterate_102_2);
        _jettag_c_iterate_102_2.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_102_2.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_102_2.getTagInfo().getAttribute("delimiter"),6005,6069);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\tif (");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(61);
            out.setTag("if",6076,6137);
            RuntimeTagElement _jettag_c_if_103_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_103_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_103_7.setRuntimeParent(_jettag_c_iterate_102_2);
            _jettag_c_if_103_7.setTagInfo(_td_c_if_103_7);
            _jettag_c_if_103_7.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_103_7.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t(is_array($");  //$NON-NLS-1$        
                out.setTag("get",6152,6191);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_104_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_104_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_104_15.setRuntimeParent(_jettag_c_if_103_7);
                _jettag_c_get_104_15.setTagInfo(_td_c_get_104_15);
                _jettag_c_get_104_15.doStart(context, out);
                _jettag_c_get_104_15.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",6196,6242);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_104_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_104_59); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_104_59.setRuntimeParent(_jettag_c_if_103_7);
                _jettag_c_get_104_59.setTagInfo(_td_c_get_104_59);
                _jettag_c_get_104_59.doStart(context, out);
                _jettag_c_get_104_59.doEnd();
                out.setTag(null,-1,-1);
                out.write("()) && count($");  //$NON-NLS-1$        
                out.setTag("get",6256,6295);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_104_119 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_104_119); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_104_119.setRuntimeParent(_jettag_c_if_103_7);
                _jettag_c_get_104_119.setTagInfo(_td_c_get_104_119);
                _jettag_c_get_104_119.doStart(context, out);
                _jettag_c_get_104_119.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",6300,6346);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_104_163 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_104_163); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_104_163.setRuntimeParent(_jettag_c_if_103_7);
                _jettag_c_get_104_163.setTagInfo(_td_c_get_104_163);
                _jettag_c_get_104_163.doStart(context, out);
                _jettag_c_get_104_163.doEnd();
                out.setTag(null,-1,-1);
                out.write("()) > 0)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t|| (is_object($");  //$NON-NLS-1$        
                out.setTag("get",6373,6412);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_105_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_105_19); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_105_19.setRuntimeParent(_jettag_c_if_103_7);
                _jettag_c_get_105_19.setTagInfo(_td_c_get_105_19);
                _jettag_c_get_105_19.doStart(context, out);
                _jettag_c_get_105_19.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",6417,6463);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_105_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_105_63); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_105_63.setRuntimeParent(_jettag_c_if_103_7);
                _jettag_c_get_105_63.setTagInfo(_td_c_get_105_63);
                _jettag_c_get_105_63.doStart(context, out);
                _jettag_c_get_105_63.doEnd();
                out.setTag(null,-1,-1);
                out.write("()) && $");  //$NON-NLS-1$        
                out.setTag("get",6471,6510);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_105_117 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_105_117); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_105_117.setRuntimeParent(_jettag_c_if_103_7);
                _jettag_c_get_105_117.setTagInfo(_td_c_get_105_117);
                _jettag_c_get_105_117.doStart(context, out);
                _jettag_c_get_105_117.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",6515,6561);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_105_161 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_105_161); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_105_161.setRuntimeParent(_jettag_c_if_103_7);
                _jettag_c_get_105_161.setTagInfo(_td_c_get_105_161);
                _jettag_c_get_105_161.doStart(context, out);
                _jettag_c_get_105_161.doEnd();
                out.setTag(null,-1,-1);
                out.write("()->getId() > 0)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_103_7.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_103_7.doEnd();
            out.endTag("if",443);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(68);
            out.setTag("if",6587,6655);
            RuntimeTagElement _jettag_c_if_106_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_106_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_106_10.setRuntimeParent(_jettag_c_iterate_102_2);
            _jettag_c_if_106_10.setTagInfo(_td_c_if_106_10);
            _jettag_c_if_106_10.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_106_10.okToProcessBody()) {
                out.write("strlen($");  //$NON-NLS-1$        
                out.setTag("get",6663,6702);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_107_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_107_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_107_13.setRuntimeParent(_jettag_c_if_106_10);
                _jettag_c_get_107_13.setTagInfo(_td_c_get_107_13);
                _jettag_c_get_107_13.doStart(context, out);
                _jettag_c_get_107_13.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",6707,6753);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_107_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_107_57); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_107_57.setRuntimeParent(_jettag_c_if_106_10);
                _jettag_c_get_107_57.setTagInfo(_td_c_get_107_57);
                _jettag_c_get_107_57.doStart(context, out);
                _jettag_c_get_107_57.doEnd();
                out.setTag(null,-1,-1);
                out.write("()) > 0");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_106_10.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_106_10.doEnd();
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
            out.setTag("if",6867,6933);
            RuntimeTagElement _jettag_c_if_114_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_114_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_114_4.setRuntimeParent(_jettag_c_iterate_102_2);
            _jettag_c_if_114_4.setTagInfo(_td_c_if_114_4);
            _jettag_c_if_114_4.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_114_4.okToProcessBody()) {
                out.write("if (is_array($");  //$NON-NLS-1$        
                out.setTag("get",6947,6986);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_115_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_115_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_115_20.setRuntimeParent(_jettag_c_if_114_4);
                _jettag_c_get_115_20.setTagInfo(_td_c_get_115_20);
                _jettag_c_get_115_20.doStart(context, out);
                _jettag_c_get_115_20.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",6991,7037);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_115_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_115_64); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_115_64.setRuntimeParent(_jettag_c_if_114_4);
                _jettag_c_get_115_64.setTagInfo(_td_c_get_115_64);
                _jettag_c_get_115_64.doStart(context, out);
                _jettag_c_get_115_64.doEnd();
                out.setTag(null,-1,-1);
                out.write("())) {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t$first = true;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t$where .= \"(\";");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tforeach ($");  //$NON-NLS-1$        
                out.setTag("get",7099,7138);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_118_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_118_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_118_16.setRuntimeParent(_jettag_c_if_114_4);
                _jettag_c_get_118_16.setTagInfo(_td_c_get_118_16);
                _jettag_c_get_118_16.doStart(context, out);
                _jettag_c_get_118_16.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",7143,7189);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_118_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_118_60); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_118_60.setRuntimeParent(_jettag_c_if_114_4);
                _jettag_c_get_118_60.setTagInfo(_td_c_get_118_60);
                _jettag_c_get_118_60.doStart(context, out);
                _jettag_c_get_118_60.doEnd();
                out.setTag(null,-1,-1);
                out.write("() as $");  //$NON-NLS-1$        
                out.setTag("get",7196,7236);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_118_113 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_118_113); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_118_113.setRuntimeParent(_jettag_c_if_114_4);
                _jettag_c_get_118_113.setTagInfo(_td_c_get_118_113);
                _jettag_c_get_118_113.doStart(context, out);
                _jettag_c_get_118_113.doEnd();
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
                out.write("\t\t\t\t\t\t$where .= \"");  //$NON-NLS-1$        
                out.setTag("get",7314,7360);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_123_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_123_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_123_18.setRuntimeParent(_jettag_c_if_114_4);
                _jettag_c_get_123_18.setTagInfo(_td_c_get_123_18);
                _jettag_c_get_123_18.doStart(context, out);
                _jettag_c_get_123_18.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",7361,7401);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_123_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_123_65); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_123_65.setRuntimeParent(_jettag_c_if_114_4);
                _jettag_c_get_123_65.setTagInfo(_td_c_get_123_65);
                _jettag_c_get_123_65.doStart(context, out);
                _jettag_c_get_123_65.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = \" . $");  //$NON-NLS-1$        
                out.setTag("get",7409,7449);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_123_113 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_123_113); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_123_113.setRuntimeParent(_jettag_c_if_114_4);
                _jettag_c_get_123_113.setTagInfo(_td_c_get_123_113);
                _jettag_c_get_123_113.doStart(context, out);
                _jettag_c_get_123_113.doEnd();
                out.setTag(null,-1,-1);
                out.write("->getId();");  //$NON-NLS-1$        
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
                out.setTag("get",7538,7584);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_128_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_128_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_128_17.setRuntimeParent(_jettag_c_if_114_4);
                _jettag_c_get_128_17.setTagInfo(_td_c_get_128_17);
                _jettag_c_get_128_17.doStart(context, out);
                _jettag_c_get_128_17.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",7585,7625);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_128_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_128_64); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_128_64.setRuntimeParent(_jettag_c_if_114_4);
                _jettag_c_get_128_64.setTagInfo(_td_c_get_128_64);
                _jettag_c_get_128_64.doStart(context, out);
                _jettag_c_get_128_64.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = \" . $");  //$NON-NLS-1$        
                out.setTag("get",7633,7672);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_128_112 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_128_112); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_128_112.setRuntimeParent(_jettag_c_if_114_4);
                _jettag_c_get_128_112.setTagInfo(_td_c_get_128_112);
                _jettag_c_get_128_112.doStart(context, out);
                _jettag_c_get_128_112.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",7677,7723);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_128_156 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_128_156); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_128_156.setRuntimeParent(_jettag_c_if_114_4);
                _jettag_c_get_128_156.setTagInfo(_td_c_get_128_156);
                _jettag_c_get_128_156.doStart(context, out);
                _jettag_c_get_128_156.doEnd();
                out.setTag(null,-1,-1);
                out.write("()->getId();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_114_4.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_114_4.doEnd();
            out.endTag("if",812);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(69);
            out.setTag("if",7752,7821);
            RuntimeTagElement _jettag_c_if_130_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_130_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_130_11.setRuntimeParent(_jettag_c_iterate_102_2);
            _jettag_c_if_130_11.setTagInfo(_td_c_if_130_11);
            _jettag_c_if_130_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_130_11.okToProcessBody()) {
                out.write("$where .= \"");  //$NON-NLS-1$        
                out.setTag("get",7832,7878);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_131_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_131_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_131_17.setRuntimeParent(_jettag_c_if_130_11);
                _jettag_c_get_131_17.setTagInfo(_td_c_get_131_17);
                _jettag_c_get_131_17.doStart(context, out);
                _jettag_c_get_131_17.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",7879,7919);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_131_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_131_64); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_131_64.setRuntimeParent(_jettag_c_if_130_11);
                _jettag_c_get_131_64.setTagInfo(_td_c_get_131_64);
                _jettag_c_get_131_64.doStart(context, out);
                _jettag_c_get_131_64.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = '\" . $");  //$NON-NLS-1$        
                out.setTag("get",7928,7967);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_131_113 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_131_113); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_131_113.setRuntimeParent(_jettag_c_if_130_11);
                _jettag_c_get_131_113.setTagInfo(_td_c_get_131_113);
                _jettag_c_get_131_113.doStart(context, out);
                _jettag_c_get_131_113.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
                out.setTag("get",7972,8018);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_131_157 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_131_157); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_131_157.setRuntimeParent(_jettag_c_if_130_11);
                _jettag_c_get_131_157.setTagInfo(_td_c_get_131_157);
                _jettag_c_get_131_157.doStart(context, out);
                _jettag_c_get_131_157.doEnd();
                out.setTag(null,-1,-1);
                out.write("() . \"'\";");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_130_11.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_130_11.doEnd();
            out.endTag("if",210);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("\t\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_102_2.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_102_2.doEnd();
        out.loopEnd();
        out.endTag("iterate",1975);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t$query = pg_query(\"SELECT");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.setTag("get",8088,8134);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_136_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_136_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_136_4.setRuntimeParent(null);
        _jettag_c_get_136_4.setTagInfo(_td_c_get_136_4);
        _jettag_c_get_136_4.doStart(context, out);
        _jettag_c_get_136_4.doEnd();
        out.setTag(null,-1,-1);
        out.write(".id AS ");  //$NON-NLS-1$        
        out.setTag("get",8141,8187);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_136_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_136_57); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_136_57.setRuntimeParent(null);
        _jettag_c_get_136_57.setTagInfo(_td_c_get_136_57);
        _jettag_c_get_136_57.doStart(context, out);
        _jettag_c_get_136_57.doEnd();
        out.setTag(null,-1,-1);
        out.write("_id,");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(84);
        out.setTag("iterate",8191,8275);
        RuntimeTagElement _jettag_c_iterate_136_107 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_136_107); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_136_107.setRuntimeParent(null);
        _jettag_c_iterate_136_107.setTagInfo(_td_c_iterate_136_107);
        _jettag_c_iterate_136_107.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_136_107.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_136_107.getTagInfo().getAttribute("delimiter"),8191,8275);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(61);
            out.setTag("if",8275,8336);
            RuntimeTagElement _jettag_c_if_137_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_137_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_137_5.setRuntimeParent(_jettag_c_iterate_136_107);
            _jettag_c_if_137_5.setTagInfo(_td_c_if_137_5);
            _jettag_c_if_137_5.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_137_5.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
                out.setTag("get",8341,8406);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_138_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_138_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_138_5.setRuntimeParent(_jettag_c_if_137_5);
                _jettag_c_get_138_5.setTagInfo(_td_c_get_138_5);
                _jettag_c_get_138_5.doStart(context, out);
                _jettag_c_get_138_5.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id AS ");  //$NON-NLS-1$        
                out.setTag("get",8413,8478);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_138_77 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_138_77); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_138_77.setRuntimeParent(_jettag_c_if_137_5);
                _jettag_c_get_138_77.setTagInfo(_td_c_get_138_77);
                _jettag_c_get_138_77.doStart(context, out);
                _jettag_c_get_138_77.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id,");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(121);
                out.setTag("iterate",8482,8603);
                RuntimeTagElement _jettag_c_iterate_138_146 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_138_146); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_138_146.setRuntimeParent(_jettag_c_if_137_5);
                _jettag_c_iterate_138_146.setTagInfo(_td_c_iterate_138_146);
                _jettag_c_iterate_138_146.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_138_146.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_138_146.getTagInfo().getAttribute("delimiter"),8482,8603);
                    out.loopIterate();
                    out.setTag("get",8603,8668);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_139_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_139_6); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_139_6.setRuntimeParent(_jettag_c_iterate_138_146);
                    _jettag_c_get_139_6.setTagInfo(_td_c_get_139_6);
                    _jettag_c_get_139_6.doStart(context, out);
                    _jettag_c_get_139_6.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",8669,8727);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_139_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_139_72); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_139_72.setRuntimeParent(_jettag_c_iterate_138_146);
                    _jettag_c_get_139_72.setTagInfo(_td_c_get_139_72);
                    _jettag_c_get_139_72.doStart(context, out);
                    _jettag_c_get_139_72.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" AS ");  //$NON-NLS-1$        
                    out.setTag("get",8731,8796);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_139_134 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_139_134); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_139_134.setRuntimeParent(_jettag_c_iterate_138_146);
                    _jettag_c_get_139_134.setTagInfo(_td_c_get_139_134);
                    _jettag_c_get_139_134.doStart(context, out);
                    _jettag_c_get_139_134.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",8797,8855);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_139_200 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_139_200); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_139_200.setRuntimeParent(_jettag_c_iterate_138_146);
                    _jettag_c_get_139_200.setTagInfo(_td_c_get_139_200);
                    _jettag_c_get_139_200.doStart(context, out);
                    _jettag_c_get_139_200.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_c_iterate_138_146.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_138_146.doEnd();
                out.loopEnd();
                out.endTag("iterate",252);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_137_5.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_137_5.doEnd();
            out.endTag("if",535);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(69);
            out.setTag("if",8878,8947);
            RuntimeTagElement _jettag_c_if_140_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_140_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_140_11.setRuntimeParent(_jettag_c_iterate_136_107);
            _jettag_c_if_140_11.setTagInfo(_td_c_if_140_11);
            _jettag_c_if_140_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_140_11.okToProcessBody()) {
                out.setTag("get",8947,8993);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_141_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_141_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_141_6.setRuntimeParent(_jettag_c_if_140_11);
                _jettag_c_get_141_6.setTagInfo(_td_c_get_141_6);
                _jettag_c_get_141_6.doStart(context, out);
                _jettag_c_get_141_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",8994,9034);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_141_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_141_53); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_141_53.setRuntimeParent(_jettag_c_if_140_11);
                _jettag_c_get_141_53.setTagInfo(_td_c_get_141_53);
                _jettag_c_get_141_53.doStart(context, out);
                _jettag_c_get_141_53.doEnd();
                out.setTag(null,-1,-1);
                out.write(" AS ");  //$NON-NLS-1$        
                out.setTag("get",9038,9084);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_141_97 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_141_97); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_141_97.setRuntimeParent(_jettag_c_if_140_11);
                _jettag_c_get_141_97.setTagInfo(_td_c_get_141_97);
                _jettag_c_get_141_97.doStart(context, out);
                _jettag_c_get_141_97.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",9085,9125);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_141_144 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_141_144); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_141_144.setRuntimeParent(_jettag_c_if_140_11);
                _jettag_c_get_141_144.setTagInfo(_td_c_get_141_144);
                _jettag_c_get_141_144.doStart(context, out);
                _jettag_c_get_141_144.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_c_if_140_11.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_140_11.doEnd();
            out.endTag("if",178);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_136_107.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_136_107.doEnd();
        out.loopEnd();
        out.endTag("iterate",857);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\tFROM ");  //$NON-NLS-1$        
        out.setTag("get",9153,9199);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_142_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_142_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_142_9.setRuntimeParent(null);
        _jettag_c_get_142_9.setTagInfo(_td_c_get_142_9);
        _jettag_c_get_142_9.doStart(context, out);
        _jettag_c_get_142_9.doEnd();
        out.setTag(null,-1,-1);
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(64);
        out.setTag("iterate",9203,9267);
        RuntimeTagElement _jettag_c_iterate_143_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_143_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_143_4.setRuntimeParent(null);
        _jettag_c_iterate_143_4.setTagInfo(_td_c_iterate_143_4);
        _jettag_c_iterate_143_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_143_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_143_4.getTagInfo().getAttribute("delimiter"),9203,9267);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(65);
            out.setTag("if",9267,9332);
            RuntimeTagElement _jettag_c_if_143_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_143_68); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_143_68.setRuntimeParent(_jettag_c_iterate_143_4);
            _jettag_c_if_143_68.setTagInfo(_td_c_if_143_68);
            _jettag_c_if_143_68.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_143_68.okToProcessBody()) {
                out.write("INNER JOIN ");  //$NON-NLS-1$        
                out.setTag("get",9343,9408);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_144_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_144_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_144_16.setRuntimeParent(_jettag_c_if_143_68);
                _jettag_c_get_144_16.setTagInfo(_td_c_get_144_16);
                _jettag_c_get_144_16.doStart(context, out);
                _jettag_c_get_144_16.doEnd();
                out.setTag(null,-1,-1);
                out.write(" ON ");  //$NON-NLS-1$        
                out.setTag("get",9412,9477);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_144_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_144_85); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_144_85.setRuntimeParent(_jettag_c_if_143_68);
                _jettag_c_get_144_85.setTagInfo(_td_c_get_144_85);
                _jettag_c_get_144_85.doStart(context, out);
                _jettag_c_get_144_85.doEnd();
                out.setTag(null,-1,-1);
                out.write(".id = ");  //$NON-NLS-1$        
                out.setTag("get",9483,9529);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_144_156 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_144_156); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_144_156.setRuntimeParent(_jettag_c_if_143_68);
                _jettag_c_get_144_156.setTagInfo(_td_c_get_144_156);
                _jettag_c_get_144_156.doStart(context, out);
                _jettag_c_get_144_156.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",9530,9570);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_144_203 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_144_203); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_144_203.setRuntimeParent(_jettag_c_if_143_68);
                _jettag_c_get_144_203.setTagInfo(_td_c_get_144_203);
                _jettag_c_get_144_203.doStart(context, out);
                _jettag_c_get_144_203.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_c_if_143_68.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_143_68.doEnd();
            out.endTag("if",238);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_143_4.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_143_4.doEnd();
        out.loopEnd();
        out.endTag("iterate",310);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\" . $where . \"ORDER BY ");  //$NON-NLS-1$        
        out.setTag("get",9615,9661);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_145_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_145_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_145_26.setRuntimeParent(null);
        _jettag_c_get_145_26.setTagInfo(_td_c_get_145_26);
        _jettag_c_get_145_26.doStart(context, out);
        _jettag_c_get_145_26.doEnd();
        out.setTag(null,-1,-1);
        out.write(".id\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tif ($query) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\twhile ($row = pg_fetch_assoc($query)) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t$");  //$NON-NLS-1$        
        out.setTag("get",9733,9772);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_149_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_149_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_149_6.setRuntimeParent(null);
        _jettag_c_get_149_6.setTagInfo(_td_c_get_149_6);
        _jettag_c_get_149_6.doStart(context, out);
        _jettag_c_get_149_6.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = new ");  //$NON-NLS-1$        
        out.setTag("get",9779,9823);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_149_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_149_52); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_149_52.setRuntimeParent(null);
        _jettag_c_get_149_52.setTagInfo(_td_c_get_149_52);
        _jettag_c_get_149_52.doStart(context, out);
        _jettag_c_get_149_52.doEnd();
        out.setTag(null,-1,-1);
        out.write("();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\t\t$");  //$NON-NLS-1$        
        out.setTag("get",9833,9872);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_151_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_151_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_151_6.setRuntimeParent(null);
        _jettag_c_get_151_6.setTagInfo(_td_c_get_151_6);
        _jettag_c_get_151_6.doStart(context, out);
        _jettag_c_get_151_6.doEnd();
        out.setTag(null,-1,-1);
        out.write("->setId($row[\"");  //$NON-NLS-1$        
        out.setTag("get",9886,9932);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(46);
        RuntimeTagElement _jettag_c_get_151_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_151_59); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_151_59.setRuntimeParent(null);
        _jettag_c_get_151_59.setTagInfo(_td_c_get_151_59);
        _jettag_c_get_151_59.doStart(context, out);
        _jettag_c_get_151_59.doEnd();
        out.setTag(null,-1,-1);
        out.write("_id\"]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(68);
        out.setTag("iterate",9943,10011);
        RuntimeTagElement _jettag_c_iterate_152_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_152_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_152_4.setRuntimeParent(null);
        _jettag_c_iterate_152_4.setTagInfo(_td_c_iterate_152_4);
        _jettag_c_iterate_152_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_152_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_152_4.getTagInfo().getAttribute("delimiter"),9943,10011);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(61);
            out.setTag("if",10011,10072);
            RuntimeTagElement _jettag_c_if_153_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_153_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_153_5.setRuntimeParent(_jettag_c_iterate_152_4);
            _jettag_c_if_153_5.setTagInfo(_td_c_if_153_5);
            _jettag_c_if_153_5.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_153_5.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",10078,10136);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_154_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_154_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_154_6.setRuntimeParent(_jettag_c_if_153_5);
                _jettag_c_get_154_6.setTagInfo(_td_c_get_154_6);
                _jettag_c_get_154_6.doStart(context, out);
                _jettag_c_get_154_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = new ");  //$NON-NLS-1$        
                out.setTag("get",10143,10206);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(63);
                RuntimeTagElement _jettag_c_get_154_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_154_71); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_154_71.setRuntimeParent(_jettag_c_if_153_5);
                _jettag_c_get_154_71.setTagInfo(_td_c_get_154_71);
                _jettag_c_get_154_71.doStart(context, out);
                _jettag_c_get_154_71.doEnd();
                out.setTag(null,-1,-1);
                out.write("();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",10215,10273);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_155_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_155_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_155_6.setRuntimeParent(_jettag_c_if_153_5);
                _jettag_c_get_155_6.setTagInfo(_td_c_get_155_6);
                _jettag_c_get_155_6.doStart(context, out);
                _jettag_c_get_155_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->setId($row[\"");  //$NON-NLS-1$        
                out.setTag("get",10287,10352);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(65);
                RuntimeTagElement _jettag_c_get_155_78 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_155_78); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_155_78.setRuntimeParent(_jettag_c_if_153_5);
                _jettag_c_get_155_78.setTagInfo(_td_c_get_155_78);
                _jettag_c_get_155_78.doStart(context, out);
                _jettag_c_get_155_78.doEnd();
                out.setTag(null,-1,-1);
                out.write("_id\"]);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(106);
                out.setTag("iterate",10364,10470);
                RuntimeTagElement _jettag_c_iterate_156_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_156_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_156_5.setRuntimeParent(_jettag_c_if_153_5);
                _jettag_c_iterate_156_5.setTagInfo(_td_c_iterate_156_5);
                _jettag_c_iterate_156_5.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_156_5.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_156_5.getTagInfo().getAttribute("delimiter"),10364,10470);
                    out.loopIterate();
                    out.write("$");  //$NON-NLS-1$        
                    out.setTag("get",10471,10529);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_157_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_157_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_157_7.setRuntimeParent(_jettag_c_iterate_156_5);
                    _jettag_c_get_157_7.setTagInfo(_td_c_get_157_7);
                    _jettag_c_get_157_7.doStart(context, out);
                    _jettag_c_get_157_7.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->set");  //$NON-NLS-1$        
                    out.setTag("get",10534,10598);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(64);
                    RuntimeTagElement _jettag_c_get_157_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_157_70); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_157_70.setRuntimeParent(_jettag_c_iterate_156_5);
                    _jettag_c_get_157_70.setTagInfo(_td_c_get_157_70);
                    _jettag_c_get_157_70.doStart(context, out);
                    _jettag_c_get_157_70.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("($row[\"");  //$NON-NLS-1$        
                    out.setTag("get",10605,10670);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_c_get_157_141 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_157_141); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_157_141.setRuntimeParent(_jettag_c_iterate_156_5);
                    _jettag_c_get_157_141.setTagInfo(_td_c_get_157_141);
                    _jettag_c_get_157_141.doStart(context, out);
                    _jettag_c_get_157_141.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",10671,10729);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_157_207 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_157_207); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_157_207.setRuntimeParent(_jettag_c_iterate_156_5);
                    _jettag_c_get_157_207.setTagInfo(_td_c_get_157_207);
                    _jettag_c_get_157_207.doStart(context, out);
                    _jettag_c_get_157_207.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\"]);");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_156_5.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_156_5.doEnd();
                out.loopEnd();
                out.endTag("iterate",268);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",10756,10795);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_159_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_159_6.setRuntimeParent(_jettag_c_if_153_5);
                _jettag_c_get_159_6.setTagInfo(_td_c_get_159_6);
                _jettag_c_get_159_6.doStart(context, out);
                _jettag_c_get_159_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->set");  //$NON-NLS-1$        
                out.setTag("get",10800,10846);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_159_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_159_50.setRuntimeParent(_jettag_c_if_153_5);
                _jettag_c_get_159_50.setTagInfo(_td_c_get_159_50);
                _jettag_c_get_159_50.doStart(context, out);
                _jettag_c_get_159_50.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",10848,10906);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_159_98 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_98); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_159_98.setRuntimeParent(_jettag_c_if_153_5);
                _jettag_c_get_159_98.setTagInfo(_td_c_get_159_98);
                _jettag_c_get_159_98.doStart(context, out);
                _jettag_c_get_159_98.doEnd();
                out.setTag(null,-1,-1);
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_153_5.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_153_5.doEnd();
            out.endTag("if",840);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(64);
            out.setTag("if",10919,10983);
            RuntimeTagElement _jettag_c_if_160_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_160_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_160_11.setRuntimeParent(_jettag_c_iterate_152_4);
            _jettag_c_if_160_11.setTagInfo(_td_c_if_160_11);
            _jettag_c_if_160_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_160_11.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",10989,11028);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_161_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_161_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_161_6.setRuntimeParent(_jettag_c_if_160_11);
                _jettag_c_get_161_6.setTagInfo(_td_c_get_161_6);
                _jettag_c_get_161_6.doStart(context, out);
                _jettag_c_get_161_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->set");  //$NON-NLS-1$        
                out.setTag("get",11033,11079);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_161_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_161_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_161_50.setRuntimeParent(_jettag_c_if_160_11);
                _jettag_c_get_161_50.setTagInfo(_td_c_get_161_50);
                _jettag_c_get_161_50.doStart(context, out);
                _jettag_c_get_161_50.doEnd();
                out.setTag(null,-1,-1);
                out.write("($row[\"");  //$NON-NLS-1$        
                out.setTag("get",11086,11132);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_161_103 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_161_103); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_161_103.setRuntimeParent(_jettag_c_if_160_11);
                _jettag_c_get_161_103.setTagInfo(_td_c_get_161_103);
                _jettag_c_get_161_103.doStart(context, out);
                _jettag_c_get_161_103.doEnd();
                out.setTag(null,-1,-1);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",11133,11173);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_161_150 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_161_150); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_161_150.setRuntimeParent(_jettag_c_if_160_11);
                _jettag_c_get_161_150.setTagInfo(_td_c_get_161_150);
                _jettag_c_get_161_150.doStart(context, out);
                _jettag_c_get_161_150.doEnd();
                out.setTag(null,-1,-1);
                out.write("\"]);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_160_11.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_160_11.doEnd();
            out.endTag("if",198);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_152_4.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_152_4.doEnd();
        out.loopEnd();
        out.endTag("iterate",1177);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\t\t$result[] = $");  //$NON-NLS-1$        
        out.setTag("get",11218,11257);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_163_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_163_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_163_18.setRuntimeParent(null);
        _jettag_c_get_163_18.setTagInfo(_td_c_get_163_18);
        _jettag_c_get_163_18.doStart(context, out);
        _jettag_c_get_163_18.doEnd();
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
