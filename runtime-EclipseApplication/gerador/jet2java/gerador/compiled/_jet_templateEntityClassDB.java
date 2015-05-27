package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_templateEntityClassDB implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_f = "org.eclipse.jet.formatTags"; //$NON-NLS-1$

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
    private static final TagInfo _td_f_uc_5_18 = new TagInfo("f:uc", //$NON-NLS-1$
            5, 18,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_35 = new TagInfo("c:get", //$NON-NLS-1$
            5, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_7_7 = new TagInfo("f:uc", //$NON-NLS-1$
            7, 7,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_24 = new TagInfo("c:get", //$NON-NLS-1$
            7, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_23 = new TagInfo("c:get", //$NON-NLS-1$
            21, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_23_34 = new TagInfo("f:lc", //$NON-NLS-1$
            23, 34,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_23_40 = new TagInfo("c:get", //$NON-NLS-1$
            23, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_23_87 = new TagInfo("c:iterate", //$NON-NLS-1$
            23, 87,
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
    private static final TagInfo _td_f_uc_27_56 = new TagInfo("f:uc", //$NON-NLS-1$
            27, 56,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_73 = new TagInfo("c:get", //$NON-NLS-1$
            27, 73,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
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
    private static final TagInfo _td_f_uc_29_57 = new TagInfo("f:uc", //$NON-NLS-1$
            29, 57,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_74 = new TagInfo("c:get", //$NON-NLS-1$
            29, 74,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_26 = new TagInfo("c:get", //$NON-NLS-1$
            36, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_38_29 = new TagInfo("f:lc", //$NON-NLS-1$
            38, 29,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_38_35 = new TagInfo("c:get", //$NON-NLS-1$
            38, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_38_85 = new TagInfo("c:iterate", //$NON-NLS-1$
            38, 85,
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
    private static final TagInfo _td_f_uc_40_98 = new TagInfo("f:uc", //$NON-NLS-1$
            40, 98,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_115 = new TagInfo("c:get", //$NON-NLS-1$
            40, 115,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
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
    private static final TagInfo _td_f_uc_42_99 = new TagInfo("f:uc", //$NON-NLS-1$
            42, 99,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_116 = new TagInfo("c:get", //$NON-NLS-1$
            42, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
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
    private static final TagInfo _td_f_lc_50_34 = new TagInfo("f:lc", //$NON-NLS-1$
            50, 34,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_50_40 = new TagInfo("c:get", //$NON-NLS-1$
            50, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_103 = new TagInfo("c:get", //$NON-NLS-1$
            50, 103,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_60_4 = new TagInfo("f:lc", //$NON-NLS-1$
            60, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_60_10 = new TagInfo("c:get", //$NON-NLS-1$
            60, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_60_63 = new TagInfo("f:lc", //$NON-NLS-1$
            60, 63,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_60_69 = new TagInfo("c:get", //$NON-NLS-1$
            60, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
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
    private static final TagInfo _td_f_lc_63_5 = new TagInfo("f:lc", //$NON-NLS-1$
            63, 5,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_63_11 = new TagInfo("c:get", //$NON-NLS-1$
            63, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_63_83 = new TagInfo("f:lc", //$NON-NLS-1$
            63, 83,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_63_89 = new TagInfo("c:get", //$NON-NLS-1$
            63, 89,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_63_158 = new TagInfo("c:iterate", //$NON-NLS-1$
            63, 158,
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
    private static final TagInfo _td_f_lc_64_6 = new TagInfo("f:lc", //$NON-NLS-1$
            64, 6,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_64_12 = new TagInfo("c:get", //$NON-NLS-1$
            64, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_78 = new TagInfo("c:get", //$NON-NLS-1$
            64, 78,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_64_140 = new TagInfo("f:lc", //$NON-NLS-1$
            64, 140,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_64_146 = new TagInfo("c:get", //$NON-NLS-1$
            64, 146,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_212 = new TagInfo("c:get", //$NON-NLS-1$
            64, 212,
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
    private static final TagInfo _td_f_lc_66_6 = new TagInfo("f:lc", //$NON-NLS-1$
            66, 6,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_66_12 = new TagInfo("c:get", //$NON-NLS-1$
            66, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_59 = new TagInfo("c:get", //$NON-NLS-1$
            66, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_66_103 = new TagInfo("f:lc", //$NON-NLS-1$
            66, 103,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_66_109 = new TagInfo("c:get", //$NON-NLS-1$
            66, 109,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_156 = new TagInfo("c:get", //$NON-NLS-1$
            66, 156,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_67_9 = new TagInfo("f:lc", //$NON-NLS-1$
            67, 9,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_67_15 = new TagInfo("c:get", //$NON-NLS-1$
            67, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
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
    private static final TagInfo _td_f_lc_69_16 = new TagInfo("f:lc", //$NON-NLS-1$
            69, 16,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_69_22 = new TagInfo("c:get", //$NON-NLS-1$
            69, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_69_91 = new TagInfo("f:lc", //$NON-NLS-1$
            69, 91,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_69_97 = new TagInfo("c:get", //$NON-NLS-1$
            69, 97,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_69_168 = new TagInfo("f:lc", //$NON-NLS-1$
            69, 168,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_69_174 = new TagInfo("c:get", //$NON-NLS-1$
            69, 174,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_69_221 = new TagInfo("c:get", //$NON-NLS-1$
            69, 221,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_74_6 = new TagInfo("c:get", //$NON-NLS-1$
            74, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_74_52 = new TagInfo("f:uc", //$NON-NLS-1$
            74, 52,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_74_69 = new TagInfo("c:get", //$NON-NLS-1$
            74, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_76_6 = new TagInfo("c:get", //$NON-NLS-1$
            76, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_76_59 = new TagInfo("f:lc", //$NON-NLS-1$
            76, 59,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_76_65 = new TagInfo("c:get", //$NON-NLS-1$
            76, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_77_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            77, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_78_5 = new TagInfo("c:if", //$NON-NLS-1$
            78, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_6 = new TagInfo("c:get", //$NON-NLS-1$
            79, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_79_71 = new TagInfo("f:uc", //$NON-NLS-1$
            79, 71,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_88 = new TagInfo("c:get", //$NON-NLS-1$
            79, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_80_6 = new TagInfo("c:get", //$NON-NLS-1$
            80, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_80_78 = new TagInfo("f:lc", //$NON-NLS-1$
            80, 78,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_80_84 = new TagInfo("c:get", //$NON-NLS-1$
            80, 84,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_81_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            81, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_82_7 = new TagInfo("c:get", //$NON-NLS-1$
            82, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_82_70 = new TagInfo("f:uc", //$NON-NLS-1$
            82, 70,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_82_87 = new TagInfo("c:get", //$NON-NLS-1$
            82, 87,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_82_159 = new TagInfo("f:lc", //$NON-NLS-1$
            82, 159,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_82_165 = new TagInfo("c:get", //$NON-NLS-1$
            82, 165,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_82_231 = new TagInfo("c:get", //$NON-NLS-1$
            82, 231,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_6 = new TagInfo("c:get", //$NON-NLS-1$
            84, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_84_50 = new TagInfo("f:uc", //$NON-NLS-1$
            84, 50,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_67 = new TagInfo("c:get", //$NON-NLS-1$
            84, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_116 = new TagInfo("c:get", //$NON-NLS-1$
            84, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_85_11 = new TagInfo("c:if", //$NON-NLS-1$
            85, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_6 = new TagInfo("c:get", //$NON-NLS-1$
            86, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_86_50 = new TagInfo("f:uc", //$NON-NLS-1$
            86, 50,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_67 = new TagInfo("c:get", //$NON-NLS-1$
            86, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_86_121 = new TagInfo("f:lc", //$NON-NLS-1$
            86, 121,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_86_127 = new TagInfo("c:get", //$NON-NLS-1$
            86, 127,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_174 = new TagInfo("c:get", //$NON-NLS-1$
            86, 174,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_88_18 = new TagInfo("c:get", //$NON-NLS-1$
            88, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_95_23 = new TagInfo("c:get", //$NON-NLS-1$
            95, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_101_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            101, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_102_7 = new TagInfo("c:if", //$NON-NLS-1$
            102, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_103_15 = new TagInfo("c:get", //$NON-NLS-1$
            103, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_103_59 = new TagInfo("f:uc", //$NON-NLS-1$
            103, 59,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_103_76 = new TagInfo("c:get", //$NON-NLS-1$
            103, 76,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_103_137 = new TagInfo("c:get", //$NON-NLS-1$
            103, 137,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_103_181 = new TagInfo("f:uc", //$NON-NLS-1$
            103, 181,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_103_198 = new TagInfo("c:get", //$NON-NLS-1$
            103, 198,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_104_19 = new TagInfo("c:get", //$NON-NLS-1$
            104, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_104_63 = new TagInfo("f:uc", //$NON-NLS-1$
            104, 63,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_104_80 = new TagInfo("c:get", //$NON-NLS-1$
            104, 80,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_104_135 = new TagInfo("c:get", //$NON-NLS-1$
            104, 135,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_104_179 = new TagInfo("f:uc", //$NON-NLS-1$
            104, 179,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_104_196 = new TagInfo("c:get", //$NON-NLS-1$
            104, 196,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_105_10 = new TagInfo("c:if", //$NON-NLS-1$
            105, 10,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_106_13 = new TagInfo("c:get", //$NON-NLS-1$
            106, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_106_57 = new TagInfo("f:uc", //$NON-NLS-1$
            106, 57,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_106_74 = new TagInfo("c:get", //$NON-NLS-1$
            106, 74,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_113_4 = new TagInfo("c:if", //$NON-NLS-1$
            113, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_114_20 = new TagInfo("c:get", //$NON-NLS-1$
            114, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_114_64 = new TagInfo("f:uc", //$NON-NLS-1$
            114, 64,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_114_81 = new TagInfo("c:get", //$NON-NLS-1$
            114, 81,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_117_16 = new TagInfo("c:get", //$NON-NLS-1$
            117, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_117_60 = new TagInfo("f:uc", //$NON-NLS-1$
            117, 60,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_117_77 = new TagInfo("c:get", //$NON-NLS-1$
            117, 77,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_117_131 = new TagInfo("c:get", //$NON-NLS-1$
            117, 131,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_122_18 = new TagInfo("f:lc", //$NON-NLS-1$
            122, 18,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_122_24 = new TagInfo("c:get", //$NON-NLS-1$
            122, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_122_71 = new TagInfo("c:get", //$NON-NLS-1$
            122, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_122_119 = new TagInfo("c:get", //$NON-NLS-1$
            122, 119,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_127_17 = new TagInfo("f:lc", //$NON-NLS-1$
            127, 17,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_127_23 = new TagInfo("c:get", //$NON-NLS-1$
            127, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_127_70 = new TagInfo("c:get", //$NON-NLS-1$
            127, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_127_118 = new TagInfo("c:get", //$NON-NLS-1$
            127, 118,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_127_162 = new TagInfo("f:uc", //$NON-NLS-1$
            127, 162,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_127_179 = new TagInfo("c:get", //$NON-NLS-1$
            127, 179,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_129_11 = new TagInfo("c:if", //$NON-NLS-1$
            129, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_130_17 = new TagInfo("f:lc", //$NON-NLS-1$
            130, 17,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_130_23 = new TagInfo("c:get", //$NON-NLS-1$
            130, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_130_70 = new TagInfo("c:get", //$NON-NLS-1$
            130, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_130_119 = new TagInfo("c:get", //$NON-NLS-1$
            130, 119,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_130_163 = new TagInfo("f:uc", //$NON-NLS-1$
            130, 163,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_130_180 = new TagInfo("c:get", //$NON-NLS-1$
            130, 180,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_135_4 = new TagInfo("f:lc", //$NON-NLS-1$
            135, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_135_10 = new TagInfo("c:get", //$NON-NLS-1$
            135, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_135_63 = new TagInfo("f:lc", //$NON-NLS-1$
            135, 63,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_135_69 = new TagInfo("c:get", //$NON-NLS-1$
            135, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_135_119 = new TagInfo("c:iterate", //$NON-NLS-1$
            135, 119,
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
    private static final TagInfo _td_c_if_136_5 = new TagInfo("c:if", //$NON-NLS-1$
            136, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_137_5 = new TagInfo("f:lc", //$NON-NLS-1$
            137, 5,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_137_11 = new TagInfo("c:get", //$NON-NLS-1$
            137, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_137_83 = new TagInfo("f:lc", //$NON-NLS-1$
            137, 83,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_137_89 = new TagInfo("c:get", //$NON-NLS-1$
            137, 89,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_137_158 = new TagInfo("c:iterate", //$NON-NLS-1$
            137, 158,
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
    private static final TagInfo _td_f_lc_138_6 = new TagInfo("f:lc", //$NON-NLS-1$
            138, 6,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_138_12 = new TagInfo("c:get", //$NON-NLS-1$
            138, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_138_78 = new TagInfo("c:get", //$NON-NLS-1$
            138, 78,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_138_140 = new TagInfo("f:lc", //$NON-NLS-1$
            138, 140,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_138_146 = new TagInfo("c:get", //$NON-NLS-1$
            138, 146,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_138_212 = new TagInfo("c:get", //$NON-NLS-1$
            138, 212,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_139_11 = new TagInfo("c:if", //$NON-NLS-1$
            139, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_140_6 = new TagInfo("f:lc", //$NON-NLS-1$
            140, 6,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_140_12 = new TagInfo("c:get", //$NON-NLS-1$
            140, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_140_59 = new TagInfo("c:get", //$NON-NLS-1$
            140, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_140_103 = new TagInfo("f:lc", //$NON-NLS-1$
            140, 103,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_140_109 = new TagInfo("c:get", //$NON-NLS-1$
            140, 109,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_140_156 = new TagInfo("c:get", //$NON-NLS-1$
            140, 156,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_141_9 = new TagInfo("f:lc", //$NON-NLS-1$
            141, 9,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_141_15 = new TagInfo("c:get", //$NON-NLS-1$
            141, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_142_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            142, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_142_68 = new TagInfo("c:if", //$NON-NLS-1$
            142, 68,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_143_16 = new TagInfo("f:lc", //$NON-NLS-1$
            143, 16,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_143_22 = new TagInfo("c:get", //$NON-NLS-1$
            143, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_143_91 = new TagInfo("f:lc", //$NON-NLS-1$
            143, 91,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_143_97 = new TagInfo("c:get", //$NON-NLS-1$
            143, 97,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_143_168 = new TagInfo("f:lc", //$NON-NLS-1$
            143, 168,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_143_174 = new TagInfo("c:get", //$NON-NLS-1$
            143, 174,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_143_221 = new TagInfo("c:get", //$NON-NLS-1$
            143, 221,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_148_6 = new TagInfo("c:get", //$NON-NLS-1$
            148, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_148_52 = new TagInfo("f:uc", //$NON-NLS-1$
            148, 52,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_148_69 = new TagInfo("c:get", //$NON-NLS-1$
            148, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_150_6 = new TagInfo("c:get", //$NON-NLS-1$
            150, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_150_59 = new TagInfo("f:lc", //$NON-NLS-1$
            150, 59,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_150_65 = new TagInfo("c:get", //$NON-NLS-1$
            150, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_151_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            151, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_152_5 = new TagInfo("c:if", //$NON-NLS-1$
            152, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_153_6 = new TagInfo("c:get", //$NON-NLS-1$
            153, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_153_71 = new TagInfo("f:uc", //$NON-NLS-1$
            153, 71,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_153_88 = new TagInfo("c:get", //$NON-NLS-1$
            153, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_154_6 = new TagInfo("c:get", //$NON-NLS-1$
            154, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_154_78 = new TagInfo("f:lc", //$NON-NLS-1$
            154, 78,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_154_84 = new TagInfo("c:get", //$NON-NLS-1$
            154, 84,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_155_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            155, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_156_7 = new TagInfo("c:get", //$NON-NLS-1$
            156, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_156_70 = new TagInfo("f:uc", //$NON-NLS-1$
            156, 70,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_156_87 = new TagInfo("c:get", //$NON-NLS-1$
            156, 87,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_156_159 = new TagInfo("f:lc", //$NON-NLS-1$
            156, 159,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_156_165 = new TagInfo("c:get", //$NON-NLS-1$
            156, 165,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_156_231 = new TagInfo("c:get", //$NON-NLS-1$
            156, 231,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_158_6 = new TagInfo("c:get", //$NON-NLS-1$
            158, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_158_50 = new TagInfo("f:uc", //$NON-NLS-1$
            158, 50,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_158_67 = new TagInfo("c:get", //$NON-NLS-1$
            158, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_158_116 = new TagInfo("c:get", //$NON-NLS-1$
            158, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_159_11 = new TagInfo("c:if", //$NON-NLS-1$
            159, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_160_6 = new TagInfo("c:get", //$NON-NLS-1$
            160, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_160_50 = new TagInfo("f:uc", //$NON-NLS-1$
            160, 50,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_160_67 = new TagInfo("c:get", //$NON-NLS-1$
            160, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_160_121 = new TagInfo("f:lc", //$NON-NLS-1$
            160, 121,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_160_127 = new TagInfo("c:get", //$NON-NLS-1$
            160, 127,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_160_174 = new TagInfo("c:get", //$NON-NLS-1$
            160, 174,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_162_18 = new TagInfo("c:get", //$NON-NLS-1$
            162, 18,
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
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(17);
                out.setTag("uc",215,232);
                RuntimeTagElement _jettag_f_uc_5_18 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_5_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_uc_5_18.setRuntimeParent(_jettag_c_if_4_65);
                _jettag_f_uc_5_18.setTagInfo(_td_f_uc_5_18);
                _jettag_f_uc_5_18.doStart(context, out);
                JET2Writer _jettag_f_uc_5_18_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_uc_5_18.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",232,290);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_5_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_35); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_5_35.setRuntimeParent(_jettag_f_uc_5_18);
                    _jettag_c_get_5_35.setTagInfo(_td_c_get_5_35);
                    _jettag_c_get_5_35.doStart(context, out);
                    _jettag_c_get_5_35.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_uc_5_18.handleBodyContent(out);
                }
                out = _jettag_f_uc_5_18_saved_out;
        out.bodyContentEnd();
                _jettag_f_uc_5_18.doEnd();
                out.endTag("uc",58);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(".class.php\";");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_4_65.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_4_65.doEnd();
            out.endTag("if",108);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_4_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_4_1.doEnd();
        out.loopEnd();
        out.endTag("iterate",179);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write(NL);         
        out.write("class ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(17);
        out.setTag("uc",336,353);
        RuntimeTagElement _jettag_f_uc_7_7 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_7_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_uc_7_7.setRuntimeParent(null);
        _jettag_f_uc_7_7.setTagInfo(_td_f_uc_7_7);
        _jettag_f_uc_7_7.doStart(context, out);
        JET2Writer _jettag_f_uc_7_7_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_uc_7_7.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",353,392);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
            RuntimeTagElement _jettag_c_get_7_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_24); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_7_24.setRuntimeParent(_jettag_f_uc_7_7);
            _jettag_c_get_7_24.setTagInfo(_td_c_get_7_24);
            _jettag_c_get_7_24.doStart(context, out);
            _jettag_c_get_7_24.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_f_uc_7_7.handleBodyContent(out);
        }
        out = _jettag_f_uc_7_7_saved_out;
out.bodyContentEnd();
        _jettag_f_uc_7_7.doEnd();
        out.endTag("uc",39);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
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
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic function __construct()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$this->dbconn = pg_connect(\"host= \" . $this->host . \" port=\" . $this->port . \" dbname=\" . $this->dbname . \" user=\" . $this->user . \" password=\" . $this->password);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic function add($");  //$NON-NLS-1$        
        out.setTag("get",791,830);
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
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(6);
        out.setTag("lc",868,874);
        RuntimeTagElement _jettag_f_lc_23_34 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_23_34); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_lc_23_34.setRuntimeParent(null);
        _jettag_f_lc_23_34.setTagInfo(_td_f_lc_23_34);
        _jettag_f_lc_23_34.doStart(context, out);
        JET2Writer _jettag_f_lc_23_34_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_lc_23_34.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",874,913);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
            RuntimeTagElement _jettag_c_get_23_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_40); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_23_40.setRuntimeParent(_jettag_f_lc_23_34);
            _jettag_c_get_23_40.setTagInfo(_td_c_get_23_40);
            _jettag_c_get_23_40.doStart(context, out);
            _jettag_c_get_23_40.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_f_lc_23_34.handleBodyContent(out);
        }
        out = _jettag_f_lc_23_34_saved_out;
out.bodyContentEnd();
        _jettag_f_lc_23_34.doEnd();
        out.endTag("lc",39);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write("(");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(79);
        out.setTag("iterate",921,1000);
        RuntimeTagElement _jettag_c_iterate_23_87 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_23_87); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_23_87.setRuntimeParent(null);
        _jettag_c_iterate_23_87.setTagInfo(_td_c_iterate_23_87);
        _jettag_c_iterate_23_87.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_23_87.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_23_87.getTagInfo().getAttribute("delimiter"),921,1000);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\t\t\t");  //$NON-NLS-1$        
            out.setTag("get",1005,1045);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(40);
            RuntimeTagElement _jettag_c_get_24_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_24_5.setRuntimeParent(_jettag_c_iterate_23_87);
            _jettag_c_get_24_5.setTagInfo(_td_c_get_24_5);
            _jettag_c_get_24_5.doStart(context, out);
            _jettag_c_get_24_5.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_c_iterate_23_87.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_23_87.doEnd();
        out.loopEnd();
        out.endTag("iterate",45);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\t) VALUES(");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(79);
        out.setTag("iterate",1070,1149);
        RuntimeTagElement _jettag_c_iterate_25_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_25_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_25_13.setRuntimeParent(null);
        _jettag_c_iterate_25_13.setTagInfo(_td_c_iterate_25_13);
        _jettag_c_iterate_25_13.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_25_13.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_25_13.getTagInfo().getAttribute("delimiter"),1070,1149);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\t\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(67);
            out.setTag("if",1154,1221);
            RuntimeTagElement _jettag_c_if_26_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_26_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_26_5.setRuntimeParent(_jettag_c_iterate_25_13);
            _jettag_c_if_26_5.setTagInfo(_td_c_if_26_5);
            _jettag_c_if_26_5.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_26_5.okToProcessBody()) {
                out.write("\" . $");  //$NON-NLS-1$        
                out.setTag("get",1226,1265);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_27_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_27_12.setRuntimeParent(_jettag_c_if_26_5);
                _jettag_c_get_27_12.setTagInfo(_td_c_get_27_12);
                _jettag_c_get_27_12.doStart(context, out);
                _jettag_c_get_27_12.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(17);
                out.setTag("uc",1270,1287);
                RuntimeTagElement _jettag_f_uc_27_56 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_27_56); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_uc_27_56.setRuntimeParent(_jettag_c_if_26_5);
                _jettag_f_uc_27_56.setTagInfo(_td_f_uc_27_56);
                _jettag_f_uc_27_56.doStart(context, out);
                JET2Writer _jettag_f_uc_27_56_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_uc_27_56.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",1287,1327);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_27_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_73); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_27_73.setRuntimeParent(_jettag_f_uc_27_56);
                    _jettag_c_get_27_73.setTagInfo(_td_c_get_27_73);
                    _jettag_c_get_27_73.doStart(context, out);
                    _jettag_c_get_27_73.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_uc_27_56.handleBodyContent(out);
                }
                out = _jettag_f_uc_27_56_saved_out;
        out.bodyContentEnd();
                _jettag_f_uc_27_56.doEnd();
                out.endTag("uc",40);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("()->getId() . \"");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_26_5.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_26_5.doEnd();
            out.endTag("if",133);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(70);
            out.setTag("if",1361,1431);
            RuntimeTagElement _jettag_c_if_28_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_28_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_28_12.setRuntimeParent(_jettag_c_iterate_25_13);
            _jettag_c_if_28_12.setTagInfo(_td_c_if_28_12);
            _jettag_c_if_28_12.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_28_12.okToProcessBody()) {
                out.write("'\" . $");  //$NON-NLS-1$        
                out.setTag("get",1437,1476);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_29_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_29_13.setRuntimeParent(_jettag_c_if_28_12);
                _jettag_c_get_29_13.setTagInfo(_td_c_get_29_13);
                _jettag_c_get_29_13.doStart(context, out);
                _jettag_c_get_29_13.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(17);
                out.setTag("uc",1481,1498);
                RuntimeTagElement _jettag_f_uc_29_57 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_29_57); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_uc_29_57.setRuntimeParent(_jettag_c_if_28_12);
                _jettag_f_uc_29_57.setTagInfo(_td_f_uc_29_57);
                _jettag_f_uc_29_57.doStart(context, out);
                JET2Writer _jettag_f_uc_29_57_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_uc_29_57.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",1498,1538);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_29_74 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_74); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_29_74.setRuntimeParent(_jettag_f_uc_29_57);
                    _jettag_c_get_29_74.setTagInfo(_td_c_get_29_74);
                    _jettag_c_get_29_74.doStart(context, out);
                    _jettag_c_get_29_74.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_uc_29_57.handleBodyContent(out);
                }
                out = _jettag_f_uc_29_57_saved_out;
        out.bodyContentEnd();
                _jettag_f_uc_29_57.doEnd();
                out.endTag("uc",40);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("() . \"'");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_28_12.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_28_12.doEnd();
            out.endTag("if",121);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_25_13.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_25_13.doEnd();
        out.loopEnd();
        out.endTag("iterate",410);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\t)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn (pg_affected_rows($query) > 0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic function update($");  //$NON-NLS-1$        
        out.setTag("get",1657,1696);
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
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(6);
        out.setTag("lc",1729,1735);
        RuntimeTagElement _jettag_f_lc_38_29 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_38_29); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_lc_38_29.setRuntimeParent(null);
        _jettag_f_lc_38_29.setTagInfo(_td_f_lc_38_29);
        _jettag_f_lc_38_29.doStart(context, out);
        JET2Writer _jettag_f_lc_38_29_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_lc_38_29.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",1735,1774);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
            RuntimeTagElement _jettag_c_get_38_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_35); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_38_35.setRuntimeParent(_jettag_f_lc_38_29);
            _jettag_c_get_38_35.setTagInfo(_td_c_get_38_35);
            _jettag_c_get_38_35.doStart(context, out);
            _jettag_c_get_38_35.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_f_lc_38_29.handleBodyContent(out);
        }
        out = _jettag_f_lc_38_29_saved_out;
out.bodyContentEnd();
        _jettag_f_lc_38_29.doEnd();
        out.endTag("lc",39);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(" SET");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(79);
        out.setTag("iterate",1785,1864);
        RuntimeTagElement _jettag_c_iterate_38_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_38_85); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_38_85.setRuntimeParent(null);
        _jettag_c_iterate_38_85.setTagInfo(_td_c_iterate_38_85);
        _jettag_c_iterate_38_85.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_38_85.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_38_85.getTagInfo().getAttribute("delimiter"),1785,1864);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(66);
            out.setTag("if",1868,1934);
            RuntimeTagElement _jettag_c_if_39_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_39_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_39_4.setRuntimeParent(_jettag_c_iterate_38_85);
            _jettag_c_if_39_4.setTagInfo(_td_c_if_39_4);
            _jettag_c_if_39_4.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_39_4.okToProcessBody()) {
                out.setTag("get",1934,1974);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_40_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_40_6.setRuntimeParent(_jettag_c_if_39_4);
                _jettag_c_get_40_6.setTagInfo(_td_c_get_40_6);
                _jettag_c_get_40_6.doStart(context, out);
                _jettag_c_get_40_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = \" . $");  //$NON-NLS-1$        
                out.setTag("get",1982,2021);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_40_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_54); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_40_54.setRuntimeParent(_jettag_c_if_39_4);
                _jettag_c_get_40_54.setTagInfo(_td_c_get_40_54);
                _jettag_c_get_40_54.doStart(context, out);
                _jettag_c_get_40_54.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(17);
                out.setTag("uc",2026,2043);
                RuntimeTagElement _jettag_f_uc_40_98 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_40_98); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_uc_40_98.setRuntimeParent(_jettag_c_if_39_4);
                _jettag_f_uc_40_98.setTagInfo(_td_f_uc_40_98);
                _jettag_f_uc_40_98.doStart(context, out);
                JET2Writer _jettag_f_uc_40_98_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_uc_40_98.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",2043,2083);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_40_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_115); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_40_115.setRuntimeParent(_jettag_f_uc_40_98);
                    _jettag_c_get_40_115.setTagInfo(_td_c_get_40_115);
                    _jettag_c_get_40_115.doStart(context, out);
                    _jettag_c_get_40_115.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_uc_40_98.handleBodyContent(out);
                }
                out = _jettag_f_uc_40_98_saved_out;
        out.bodyContentEnd();
                _jettag_f_uc_40_98.doEnd();
                out.endTag("uc",40);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("()->getId() . \"");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_39_4.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_39_4.doEnd();
            out.endTag("if",175);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(69);
            out.setTag("if",2116,2185);
            RuntimeTagElement _jettag_c_if_41_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_41_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_41_11.setRuntimeParent(_jettag_c_iterate_38_85);
            _jettag_c_if_41_11.setTagInfo(_td_c_if_41_11);
            _jettag_c_if_41_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_41_11.okToProcessBody()) {
                out.setTag("get",2185,2225);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_42_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_42_6.setRuntimeParent(_jettag_c_if_41_11);
                _jettag_c_get_42_6.setTagInfo(_td_c_get_42_6);
                _jettag_c_get_42_6.doStart(context, out);
                _jettag_c_get_42_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = '\" . $");  //$NON-NLS-1$        
                out.setTag("get",2234,2273);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_42_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_42_55.setRuntimeParent(_jettag_c_if_41_11);
                _jettag_c_get_42_55.setTagInfo(_td_c_get_42_55);
                _jettag_c_get_42_55.doStart(context, out);
                _jettag_c_get_42_55.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(17);
                out.setTag("uc",2278,2295);
                RuntimeTagElement _jettag_f_uc_42_99 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_42_99); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_uc_42_99.setRuntimeParent(_jettag_c_if_41_11);
                _jettag_f_uc_42_99.setTagInfo(_td_f_uc_42_99);
                _jettag_f_uc_42_99.doStart(context, out);
                JET2Writer _jettag_f_uc_42_99_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_uc_42_99.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",2295,2335);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_42_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_116); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_42_116.setRuntimeParent(_jettag_f_uc_42_99);
                    _jettag_c_get_42_116.setTagInfo(_td_c_get_42_116);
                    _jettag_c_get_42_116.doStart(context, out);
                    _jettag_c_get_42_116.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_uc_42_99.handleBodyContent(out);
                }
                out = _jettag_f_uc_42_99_saved_out;
        out.bodyContentEnd();
                _jettag_f_uc_42_99.doEnd();
                out.endTag("uc",40);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("() . \"'");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_41_11.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_41_11.doEnd();
            out.endTag("if",164);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_38_85.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_38_85.doEnd();
        out.loopEnd();
        out.endTag("iterate",492);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\tWHERE id = \" . $");  //$NON-NLS-1$        
        out.setTag("get",2388,2427);
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
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn (pg_affected_rows($query) > 0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic function destroy($");  //$NON-NLS-1$        
        out.setTag("get",2514,2553);
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
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(6);
        out.setTag("lc",2591,2597);
        RuntimeTagElement _jettag_f_lc_50_34 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_50_34); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_lc_50_34.setRuntimeParent(null);
        _jettag_f_lc_50_34.setTagInfo(_td_f_lc_50_34);
        _jettag_f_lc_50_34.doStart(context, out);
        JET2Writer _jettag_f_lc_50_34_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_lc_50_34.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",2597,2636);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
            RuntimeTagElement _jettag_c_get_50_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_40); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_50_40.setRuntimeParent(_jettag_f_lc_50_34);
            _jettag_c_get_50_40.setTagInfo(_td_c_get_50_40);
            _jettag_c_get_50_40.doStart(context, out);
            _jettag_c_get_50_40.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_f_lc_50_34.handleBodyContent(out);
        }
        out = _jettag_f_lc_50_34_saved_out;
out.bodyContentEnd();
        _jettag_f_lc_50_34.doEnd();
        out.endTag("lc",39);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(" WHERE id = \" . $");  //$NON-NLS-1$        
        out.setTag("get",2660,2699);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_50_103 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_103); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_50_103.setRuntimeParent(null);
        _jettag_c_get_50_103.setTagInfo(_td_c_get_50_103);
        _jettag_c_get_50_103.doStart(context, out);
        _jettag_c_get_50_103.doEnd();
        out.setTag(null,-1,-1);
        out.write("->getId());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn (pg_affected_rows($query) > 0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic function getAll()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$result = array();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$query = pg_query(\"SELECT");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(6);
        out.setTag("lc",2844,2850);
        RuntimeTagElement _jettag_f_lc_60_4 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_60_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_lc_60_4.setRuntimeParent(null);
        _jettag_f_lc_60_4.setTagInfo(_td_f_lc_60_4);
        _jettag_f_lc_60_4.doStart(context, out);
        JET2Writer _jettag_f_lc_60_4_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_lc_60_4.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",2850,2889);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
            RuntimeTagElement _jettag_c_get_60_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_60_10.setRuntimeParent(_jettag_f_lc_60_4);
            _jettag_c_get_60_10.setTagInfo(_td_c_get_60_10);
            _jettag_c_get_60_10.doStart(context, out);
            _jettag_c_get_60_10.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_f_lc_60_4.handleBodyContent(out);
        }
        out = _jettag_f_lc_60_4_saved_out;
out.bodyContentEnd();
        _jettag_f_lc_60_4.doEnd();
        out.endTag("lc",39);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(".id AS ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(6);
        out.setTag("lc",2903,2909);
        RuntimeTagElement _jettag_f_lc_60_63 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_60_63); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_lc_60_63.setRuntimeParent(null);
        _jettag_f_lc_60_63.setTagInfo(_td_f_lc_60_63);
        _jettag_f_lc_60_63.doStart(context, out);
        JET2Writer _jettag_f_lc_60_63_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_lc_60_63.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",2909,2948);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
            RuntimeTagElement _jettag_c_get_60_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_69); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_60_69.setRuntimeParent(_jettag_f_lc_60_63);
            _jettag_c_get_60_69.setTagInfo(_td_c_get_60_69);
            _jettag_c_get_60_69.doStart(context, out);
            _jettag_c_get_60_69.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_f_lc_60_63.handleBodyContent(out);
        }
        out = _jettag_f_lc_60_63_saved_out;
out.bodyContentEnd();
        _jettag_f_lc_60_63.doEnd();
        out.endTag("lc",39);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write("_id,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(84);
        out.setTag("iterate",2963,3047);
        RuntimeTagElement _jettag_c_iterate_61_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_61_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_61_4.setRuntimeParent(null);
        _jettag_c_iterate_61_4.setTagInfo(_td_c_iterate_61_4);
        _jettag_c_iterate_61_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_61_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_61_4.getTagInfo().getAttribute("delimiter"),2963,3047);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(61);
            out.setTag("if",3047,3108);
            RuntimeTagElement _jettag_c_if_62_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_62_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_62_5.setRuntimeParent(_jettag_c_iterate_61_4);
            _jettag_c_if_62_5.setTagInfo(_td_c_if_62_5);
            _jettag_c_if_62_5.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_62_5.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(6);
                out.setTag("lc",3113,3119);
                RuntimeTagElement _jettag_f_lc_63_5 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_63_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_lc_63_5.setRuntimeParent(_jettag_c_if_62_5);
                _jettag_f_lc_63_5.setTagInfo(_td_f_lc_63_5);
                _jettag_f_lc_63_5.doStart(context, out);
                JET2Writer _jettag_f_lc_63_5_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_lc_63_5.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",3119,3177);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_63_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_11); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_63_11.setRuntimeParent(_jettag_f_lc_63_5);
                    _jettag_c_get_63_11.setTagInfo(_td_c_get_63_11);
                    _jettag_c_get_63_11.doStart(context, out);
                    _jettag_c_get_63_11.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_lc_63_5.handleBodyContent(out);
                }
                out = _jettag_f_lc_63_5_saved_out;
        out.bodyContentEnd();
                _jettag_f_lc_63_5.doEnd();
                out.endTag("lc",58);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(".id AS ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(6);
                out.setTag("lc",3191,3197);
                RuntimeTagElement _jettag_f_lc_63_83 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_63_83); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_lc_63_83.setRuntimeParent(_jettag_c_if_62_5);
                _jettag_f_lc_63_83.setTagInfo(_td_f_lc_63_83);
                _jettag_f_lc_63_83.doStart(context, out);
                JET2Writer _jettag_f_lc_63_83_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_lc_63_83.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",3197,3255);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_63_89 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_89); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_63_89.setRuntimeParent(_jettag_f_lc_63_83);
                    _jettag_c_get_63_89.setTagInfo(_td_c_get_63_89);
                    _jettag_c_get_63_89.doStart(context, out);
                    _jettag_c_get_63_89.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_lc_63_83.handleBodyContent(out);
                }
                out = _jettag_f_lc_63_83_saved_out;
        out.bodyContentEnd();
                _jettag_f_lc_63_83.doEnd();
                out.endTag("lc",58);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("_id,");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(121);
                out.setTag("iterate",3266,3387);
                RuntimeTagElement _jettag_c_iterate_63_158 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_63_158); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_63_158.setRuntimeParent(_jettag_c_if_62_5);
                _jettag_c_iterate_63_158.setTagInfo(_td_c_iterate_63_158);
                _jettag_c_iterate_63_158.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_63_158.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_63_158.getTagInfo().getAttribute("delimiter"),3266,3387);
                    out.loopIterate();
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(6);
                    out.setTag("lc",3387,3393);
                    RuntimeTagElement _jettag_f_lc_64_6 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_64_6); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_f_lc_64_6.setRuntimeParent(_jettag_c_iterate_63_158);
                    _jettag_f_lc_64_6.setTagInfo(_td_f_lc_64_6);
                    _jettag_f_lc_64_6.doStart(context, out);
                    JET2Writer _jettag_f_lc_64_6_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_f_lc_64_6.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.setTag("get",3393,3451);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(58);
                        RuntimeTagElement _jettag_c_get_64_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_12); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_64_12.setRuntimeParent(_jettag_f_lc_64_6);
                        _jettag_c_get_64_12.setTagInfo(_td_c_get_64_12);
                        _jettag_c_get_64_12.doStart(context, out);
                        _jettag_c_get_64_12.doEnd();
                        out.setTag(null,-1,-1);
            out.bodyContentStart();
                        _jettag_f_lc_64_6.handleBodyContent(out);
                    }
                    out = _jettag_f_lc_64_6_saved_out;
            out.bodyContentEnd();
                    _jettag_f_lc_64_6.doEnd();
                    out.endTag("lc",58);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",3459,3517);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_64_78 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_78); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_64_78.setRuntimeParent(_jettag_c_iterate_63_158);
                    _jettag_c_get_64_78.setTagInfo(_td_c_get_64_78);
                    _jettag_c_get_64_78.doStart(context, out);
                    _jettag_c_get_64_78.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" AS ");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(6);
                    out.setTag("lc",3521,3527);
                    RuntimeTagElement _jettag_f_lc_64_140 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_64_140); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_f_lc_64_140.setRuntimeParent(_jettag_c_iterate_63_158);
                    _jettag_f_lc_64_140.setTagInfo(_td_f_lc_64_140);
                    _jettag_f_lc_64_140.doStart(context, out);
                    JET2Writer _jettag_f_lc_64_140_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_f_lc_64_140.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.setTag("get",3527,3585);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(58);
                        RuntimeTagElement _jettag_c_get_64_146 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_146); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_64_146.setRuntimeParent(_jettag_f_lc_64_140);
                        _jettag_c_get_64_146.setTagInfo(_td_c_get_64_146);
                        _jettag_c_get_64_146.doStart(context, out);
                        _jettag_c_get_64_146.doEnd();
                        out.setTag(null,-1,-1);
            out.bodyContentStart();
                        _jettag_f_lc_64_140.handleBodyContent(out);
                    }
                    out = _jettag_f_lc_64_140_saved_out;
            out.bodyContentEnd();
                    _jettag_f_lc_64_140.doEnd();
                    out.endTag("lc",58);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",3593,3651);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_64_212 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_212); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_64_212.setRuntimeParent(_jettag_c_iterate_63_158);
                    _jettag_c_get_64_212.setTagInfo(_td_c_get_64_212);
                    _jettag_c_get_64_212.doStart(context, out);
                    _jettag_c_get_64_212.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_c_iterate_63_158.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_63_158.doEnd();
                out.loopEnd();
                out.endTag("iterate",264);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_62_5.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_62_5.doEnd();
            out.endTag("if",559);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(69);
            out.setTag("if",3674,3743);
            RuntimeTagElement _jettag_c_if_65_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_65_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_65_11.setRuntimeParent(_jettag_c_iterate_61_4);
            _jettag_c_if_65_11.setTagInfo(_td_c_if_65_11);
            _jettag_c_if_65_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_65_11.okToProcessBody()) {
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(6);
                out.setTag("lc",3743,3749);
                RuntimeTagElement _jettag_f_lc_66_6 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_66_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_lc_66_6.setRuntimeParent(_jettag_c_if_65_11);
                _jettag_f_lc_66_6.setTagInfo(_td_f_lc_66_6);
                _jettag_f_lc_66_6.doStart(context, out);
                JET2Writer _jettag_f_lc_66_6_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_lc_66_6.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",3749,3788);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(39);
                    RuntimeTagElement _jettag_c_get_66_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_12); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_66_12.setRuntimeParent(_jettag_f_lc_66_6);
                    _jettag_c_get_66_12.setTagInfo(_td_c_get_66_12);
                    _jettag_c_get_66_12.doStart(context, out);
                    _jettag_c_get_66_12.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_lc_66_6.handleBodyContent(out);
                }
                out = _jettag_f_lc_66_6_saved_out;
        out.bodyContentEnd();
                _jettag_f_lc_66_6.doEnd();
                out.endTag("lc",39);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",3796,3836);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_66_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_59); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_66_59.setRuntimeParent(_jettag_c_if_65_11);
                _jettag_c_get_66_59.setTagInfo(_td_c_get_66_59);
                _jettag_c_get_66_59.doStart(context, out);
                _jettag_c_get_66_59.doEnd();
                out.setTag(null,-1,-1);
                out.write(" AS ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(6);
                out.setTag("lc",3840,3846);
                RuntimeTagElement _jettag_f_lc_66_103 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_66_103); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_lc_66_103.setRuntimeParent(_jettag_c_if_65_11);
                _jettag_f_lc_66_103.setTagInfo(_td_f_lc_66_103);
                _jettag_f_lc_66_103.doStart(context, out);
                JET2Writer _jettag_f_lc_66_103_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_lc_66_103.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",3846,3885);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(39);
                    RuntimeTagElement _jettag_c_get_66_109 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_109); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_66_109.setRuntimeParent(_jettag_f_lc_66_103);
                    _jettag_c_get_66_109.setTagInfo(_td_c_get_66_109);
                    _jettag_c_get_66_109.doStart(context, out);
                    _jettag_c_get_66_109.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_lc_66_103.handleBodyContent(out);
                }
                out = _jettag_f_lc_66_103_saved_out;
        out.bodyContentEnd();
                _jettag_f_lc_66_103.doEnd();
                out.endTag("lc",39);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",3893,3933);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_66_156 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_156); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_66_156.setRuntimeParent(_jettag_c_if_65_11);
                _jettag_c_get_66_156.setTagInfo(_td_c_get_66_156);
                _jettag_c_get_66_156.doStart(context, out);
                _jettag_c_get_66_156.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_c_if_65_11.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_65_11.doEnd();
            out.endTag("if",190);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_61_4.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_61_4.doEnd();
        out.loopEnd();
        out.endTag("iterate",893);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\tFROM ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(6);
        out.setTag("lc",3961,3967);
        RuntimeTagElement _jettag_f_lc_67_9 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_67_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_lc_67_9.setRuntimeParent(null);
        _jettag_f_lc_67_9.setTagInfo(_td_f_lc_67_9);
        _jettag_f_lc_67_9.doStart(context, out);
        JET2Writer _jettag_f_lc_67_9_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_lc_67_9.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",3967,4006);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
            RuntimeTagElement _jettag_c_get_67_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_15); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_67_15.setRuntimeParent(_jettag_f_lc_67_9);
            _jettag_c_get_67_15.setTagInfo(_td_c_get_67_15);
            _jettag_c_get_67_15.doStart(context, out);
            _jettag_c_get_67_15.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_f_lc_67_9.handleBodyContent(out);
        }
        out = _jettag_f_lc_67_9_saved_out;
out.bodyContentEnd();
        _jettag_f_lc_67_9.doEnd();
        out.endTag("lc",39);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(64);
        out.setTag("iterate",4017,4081);
        RuntimeTagElement _jettag_c_iterate_68_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_68_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_68_4.setRuntimeParent(null);
        _jettag_c_iterate_68_4.setTagInfo(_td_c_iterate_68_4);
        _jettag_c_iterate_68_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_68_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_68_4.getTagInfo().getAttribute("delimiter"),4017,4081);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(65);
            out.setTag("if",4081,4146);
            RuntimeTagElement _jettag_c_if_68_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_68_68); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_68_68.setRuntimeParent(_jettag_c_iterate_68_4);
            _jettag_c_if_68_68.setTagInfo(_td_c_if_68_68);
            _jettag_c_if_68_68.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_68_68.okToProcessBody()) {
                out.write("INNER JOIN ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(6);
                out.setTag("lc",4157,4163);
                RuntimeTagElement _jettag_f_lc_69_16 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_69_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_lc_69_16.setRuntimeParent(_jettag_c_if_68_68);
                _jettag_f_lc_69_16.setTagInfo(_td_f_lc_69_16);
                _jettag_f_lc_69_16.doStart(context, out);
                JET2Writer _jettag_f_lc_69_16_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_lc_69_16.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",4163,4221);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_69_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_22); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_69_22.setRuntimeParent(_jettag_f_lc_69_16);
                    _jettag_c_get_69_22.setTagInfo(_td_c_get_69_22);
                    _jettag_c_get_69_22.doStart(context, out);
                    _jettag_c_get_69_22.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_lc_69_16.handleBodyContent(out);
                }
                out = _jettag_f_lc_69_16_saved_out;
        out.bodyContentEnd();
                _jettag_f_lc_69_16.doEnd();
                out.endTag("lc",58);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(" ON ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(6);
                out.setTag("lc",4232,4238);
                RuntimeTagElement _jettag_f_lc_69_91 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_69_91); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_lc_69_91.setRuntimeParent(_jettag_c_if_68_68);
                _jettag_f_lc_69_91.setTagInfo(_td_f_lc_69_91);
                _jettag_f_lc_69_91.doStart(context, out);
                JET2Writer _jettag_f_lc_69_91_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_lc_69_91.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",4238,4296);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_69_97 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_97); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_69_97.setRuntimeParent(_jettag_f_lc_69_91);
                    _jettag_c_get_69_97.setTagInfo(_td_c_get_69_97);
                    _jettag_c_get_69_97.doStart(context, out);
                    _jettag_c_get_69_97.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_lc_69_91.handleBodyContent(out);
                }
                out = _jettag_f_lc_69_91_saved_out;
        out.bodyContentEnd();
                _jettag_f_lc_69_91.doEnd();
                out.endTag("lc",58);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(".id = ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(6);
                out.setTag("lc",4309,4315);
                RuntimeTagElement _jettag_f_lc_69_168 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_69_168); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_lc_69_168.setRuntimeParent(_jettag_c_if_68_68);
                _jettag_f_lc_69_168.setTagInfo(_td_f_lc_69_168);
                _jettag_f_lc_69_168.doStart(context, out);
                JET2Writer _jettag_f_lc_69_168_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_lc_69_168.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",4315,4354);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(39);
                    RuntimeTagElement _jettag_c_get_69_174 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_174); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_69_174.setRuntimeParent(_jettag_f_lc_69_168);
                    _jettag_c_get_69_174.setTagInfo(_td_c_get_69_174);
                    _jettag_c_get_69_174.doStart(context, out);
                    _jettag_c_get_69_174.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_lc_69_168.handleBodyContent(out);
                }
                out = _jettag_f_lc_69_168_saved_out;
        out.bodyContentEnd();
                _jettag_f_lc_69_168.doEnd();
                out.endTag("lc",39);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",4362,4402);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_69_221 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_221); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_69_221.setRuntimeParent(_jettag_c_if_68_68);
                _jettag_c_get_69_221.setTagInfo(_td_c_get_69_221);
                _jettag_c_get_69_221.doStart(context, out);
                _jettag_c_get_69_221.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_c_if_68_68.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_68_68.doEnd();
            out.endTag("if",256);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_68_4.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_68_4.doEnd();
        out.loopEnd();
        out.endTag("iterate",328);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif ($query) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\twhile ($row = pg_fetch_assoc($query)) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t$");  //$NON-NLS-1$        
        out.setTag("get",4495,4534);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_74_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_74_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_74_6.setRuntimeParent(null);
        _jettag_c_get_74_6.setTagInfo(_td_c_get_74_6);
        _jettag_c_get_74_6.doStart(context, out);
        _jettag_c_get_74_6.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = new ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(17);
        out.setTag("uc",4541,4558);
        RuntimeTagElement _jettag_f_uc_74_52 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_74_52); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_uc_74_52.setRuntimeParent(null);
        _jettag_f_uc_74_52.setTagInfo(_td_f_uc_74_52);
        _jettag_f_uc_74_52.doStart(context, out);
        JET2Writer _jettag_f_uc_74_52_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_uc_74_52.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",4558,4597);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
            RuntimeTagElement _jettag_c_get_74_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_74_69); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_74_69.setRuntimeParent(_jettag_f_uc_74_52);
            _jettag_c_get_74_69.setTagInfo(_td_c_get_74_69);
            _jettag_c_get_74_69.doStart(context, out);
            _jettag_c_get_74_69.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_f_uc_74_52.handleBodyContent(out);
        }
        out = _jettag_f_uc_74_52_saved_out;
out.bodyContentEnd();
        _jettag_f_uc_74_52.doEnd();
        out.endTag("uc",39);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write("();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\t\t$");  //$NON-NLS-1$        
        out.setTag("get",4614,4653);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_76_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_76_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_76_6.setRuntimeParent(null);
        _jettag_c_get_76_6.setTagInfo(_td_c_get_76_6);
        _jettag_c_get_76_6.doStart(context, out);
        _jettag_c_get_76_6.doEnd();
        out.setTag(null,-1,-1);
        out.write("->setId($row[\"");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(6);
        out.setTag("lc",4667,4673);
        RuntimeTagElement _jettag_f_lc_76_59 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_76_59); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_lc_76_59.setRuntimeParent(null);
        _jettag_f_lc_76_59.setTagInfo(_td_f_lc_76_59);
        _jettag_f_lc_76_59.doStart(context, out);
        JET2Writer _jettag_f_lc_76_59_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_lc_76_59.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",4673,4712);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
            RuntimeTagElement _jettag_c_get_76_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_76_65); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_76_65.setRuntimeParent(_jettag_f_lc_76_59);
            _jettag_c_get_76_65.setTagInfo(_td_c_get_76_65);
            _jettag_c_get_76_65.doStart(context, out);
            _jettag_c_get_76_65.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_f_lc_76_59.handleBodyContent(out);
        }
        out = _jettag_f_lc_76_59_saved_out;
out.bodyContentEnd();
        _jettag_f_lc_76_59.doEnd();
        out.endTag("lc",39);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write("_id\"]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(68);
        out.setTag("iterate",4730,4798);
        RuntimeTagElement _jettag_c_iterate_77_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_77_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_77_4.setRuntimeParent(null);
        _jettag_c_iterate_77_4.setTagInfo(_td_c_iterate_77_4);
        _jettag_c_iterate_77_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_77_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_77_4.getTagInfo().getAttribute("delimiter"),4730,4798);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(61);
            out.setTag("if",4798,4859);
            RuntimeTagElement _jettag_c_if_78_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_78_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_78_5.setRuntimeParent(_jettag_c_iterate_77_4);
            _jettag_c_if_78_5.setTagInfo(_td_c_if_78_5);
            _jettag_c_if_78_5.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_78_5.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",4865,4923);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_79_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_79_6.setRuntimeParent(_jettag_c_if_78_5);
                _jettag_c_get_79_6.setTagInfo(_td_c_get_79_6);
                _jettag_c_get_79_6.doStart(context, out);
                _jettag_c_get_79_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = new ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(17);
                out.setTag("uc",4930,4947);
                RuntimeTagElement _jettag_f_uc_79_71 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_79_71); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_uc_79_71.setRuntimeParent(_jettag_c_if_78_5);
                _jettag_f_uc_79_71.setTagInfo(_td_f_uc_79_71);
                _jettag_f_uc_79_71.doStart(context, out);
                JET2Writer _jettag_f_uc_79_71_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_uc_79_71.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",4947,5005);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_79_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_88); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_79_88.setRuntimeParent(_jettag_f_uc_79_71);
                    _jettag_c_get_79_88.setTagInfo(_td_c_get_79_88);
                    _jettag_c_get_79_88.doStart(context, out);
                    _jettag_c_get_79_88.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_uc_79_71.handleBodyContent(out);
                }
                out = _jettag_f_uc_79_71_saved_out;
        out.bodyContentEnd();
                _jettag_f_uc_79_71.doEnd();
                out.endTag("uc",58);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",5021,5079);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_80_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_80_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_80_6.setRuntimeParent(_jettag_c_if_78_5);
                _jettag_c_get_80_6.setTagInfo(_td_c_get_80_6);
                _jettag_c_get_80_6.doStart(context, out);
                _jettag_c_get_80_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->setId($row[\"");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(6);
                out.setTag("lc",5093,5099);
                RuntimeTagElement _jettag_f_lc_80_78 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_80_78); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_lc_80_78.setRuntimeParent(_jettag_c_if_78_5);
                _jettag_f_lc_80_78.setTagInfo(_td_f_lc_80_78);
                _jettag_f_lc_80_78.doStart(context, out);
                JET2Writer _jettag_f_lc_80_78_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_lc_80_78.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",5099,5157);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_80_84 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_80_84); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_80_84.setRuntimeParent(_jettag_f_lc_80_78);
                    _jettag_c_get_80_84.setTagInfo(_td_c_get_80_84);
                    _jettag_c_get_80_84.doStart(context, out);
                    _jettag_c_get_80_84.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_lc_80_78.handleBodyContent(out);
                }
                out = _jettag_f_lc_80_78_saved_out;
        out.bodyContentEnd();
                _jettag_f_lc_80_78.doEnd();
                out.endTag("lc",58);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("_id\"]);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(106);
                out.setTag("iterate",5176,5282);
                RuntimeTagElement _jettag_c_iterate_81_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_81_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_81_5.setRuntimeParent(_jettag_c_if_78_5);
                _jettag_c_iterate_81_5.setTagInfo(_td_c_iterate_81_5);
                _jettag_c_iterate_81_5.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_81_5.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_81_5.getTagInfo().getAttribute("delimiter"),5176,5282);
                    out.loopIterate();
                    out.write("$");  //$NON-NLS-1$        
                    out.setTag("get",5283,5341);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_82_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_82_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_82_7.setRuntimeParent(_jettag_c_iterate_81_5);
                    _jettag_c_get_82_7.setTagInfo(_td_c_get_82_7);
                    _jettag_c_get_82_7.doStart(context, out);
                    _jettag_c_get_82_7.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->set");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(17);
                    out.setTag("uc",5346,5363);
                    RuntimeTagElement _jettag_f_uc_82_70 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_82_70); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_f_uc_82_70.setRuntimeParent(_jettag_c_iterate_81_5);
                    _jettag_f_uc_82_70.setTagInfo(_td_f_uc_82_70);
                    _jettag_f_uc_82_70.doStart(context, out);
                    JET2Writer _jettag_f_uc_82_70_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_f_uc_82_70.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.setTag("get",5363,5421);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(58);
                        RuntimeTagElement _jettag_c_get_82_87 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_82_87); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_82_87.setRuntimeParent(_jettag_f_uc_82_70);
                        _jettag_c_get_82_87.setTagInfo(_td_c_get_82_87);
                        _jettag_c_get_82_87.doStart(context, out);
                        _jettag_c_get_82_87.doEnd();
                        out.setTag(null,-1,-1);
            out.bodyContentStart();
                        _jettag_f_uc_82_70.handleBodyContent(out);
                    }
                    out = _jettag_f_uc_82_70_saved_out;
            out.bodyContentEnd();
                    _jettag_f_uc_82_70.doEnd();
                    out.endTag("uc",58);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
                    out.write("($row[\"");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(6);
                    out.setTag("lc",5435,5441);
                    RuntimeTagElement _jettag_f_lc_82_159 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_82_159); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_f_lc_82_159.setRuntimeParent(_jettag_c_iterate_81_5);
                    _jettag_f_lc_82_159.setTagInfo(_td_f_lc_82_159);
                    _jettag_f_lc_82_159.doStart(context, out);
                    JET2Writer _jettag_f_lc_82_159_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_f_lc_82_159.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.setTag("get",5441,5499);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(58);
                        RuntimeTagElement _jettag_c_get_82_165 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_82_165); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_82_165.setRuntimeParent(_jettag_f_lc_82_159);
                        _jettag_c_get_82_165.setTagInfo(_td_c_get_82_165);
                        _jettag_c_get_82_165.doStart(context, out);
                        _jettag_c_get_82_165.doEnd();
                        out.setTag(null,-1,-1);
            out.bodyContentStart();
                        _jettag_f_lc_82_159.handleBodyContent(out);
                    }
                    out = _jettag_f_lc_82_159_saved_out;
            out.bodyContentEnd();
                    _jettag_f_lc_82_159.doEnd();
                    out.endTag("lc",58);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",5507,5565);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_82_231 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_82_231); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_82_231.setRuntimeParent(_jettag_c_iterate_81_5);
                    _jettag_c_get_82_231.setTagInfo(_td_c_get_82_231);
                    _jettag_c_get_82_231.doStart(context, out);
                    _jettag_c_get_82_231.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\"]);");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_81_5.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_81_5.doEnd();
                out.loopEnd();
                out.endTag("iterate",292);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",5592,5631);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_84_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_84_6.setRuntimeParent(_jettag_c_if_78_5);
                _jettag_c_get_84_6.setTagInfo(_td_c_get_84_6);
                _jettag_c_get_84_6.doStart(context, out);
                _jettag_c_get_84_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->set");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(17);
                out.setTag("uc",5636,5653);
                RuntimeTagElement _jettag_f_uc_84_50 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_84_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_uc_84_50.setRuntimeParent(_jettag_c_if_78_5);
                _jettag_f_uc_84_50.setTagInfo(_td_f_uc_84_50);
                _jettag_f_uc_84_50.doStart(context, out);
                JET2Writer _jettag_f_uc_84_50_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_uc_84_50.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",5653,5693);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_84_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_67); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_84_67.setRuntimeParent(_jettag_f_uc_84_50);
                    _jettag_c_get_84_67.setTagInfo(_td_c_get_84_67);
                    _jettag_c_get_84_67.doStart(context, out);
                    _jettag_c_get_84_67.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_uc_84_50.handleBodyContent(out);
                }
                out = _jettag_f_uc_84_50_saved_out;
        out.bodyContentEnd();
                _jettag_f_uc_84_50.doEnd();
                out.endTag("uc",40);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",5702,5760);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_84_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_116); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_84_116.setRuntimeParent(_jettag_c_if_78_5);
                _jettag_c_get_84_116.setTagInfo(_td_c_get_84_116);
                _jettag_c_get_84_116.doStart(context, out);
                _jettag_c_get_84_116.doEnd();
                out.setTag(null,-1,-1);
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_78_5.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_78_5.doEnd();
            out.endTag("if",907);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(64);
            out.setTag("if",5773,5837);
            RuntimeTagElement _jettag_c_if_85_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_85_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_85_11.setRuntimeParent(_jettag_c_iterate_77_4);
            _jettag_c_if_85_11.setTagInfo(_td_c_if_85_11);
            _jettag_c_if_85_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_85_11.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",5843,5882);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_86_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_86_6.setRuntimeParent(_jettag_c_if_85_11);
                _jettag_c_get_86_6.setTagInfo(_td_c_get_86_6);
                _jettag_c_get_86_6.doStart(context, out);
                _jettag_c_get_86_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->set");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(17);
                out.setTag("uc",5887,5904);
                RuntimeTagElement _jettag_f_uc_86_50 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_86_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_uc_86_50.setRuntimeParent(_jettag_c_if_85_11);
                _jettag_f_uc_86_50.setTagInfo(_td_f_uc_86_50);
                _jettag_f_uc_86_50.doStart(context, out);
                JET2Writer _jettag_f_uc_86_50_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_uc_86_50.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",5904,5944);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_86_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_67); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_86_67.setRuntimeParent(_jettag_f_uc_86_50);
                    _jettag_c_get_86_67.setTagInfo(_td_c_get_86_67);
                    _jettag_c_get_86_67.doStart(context, out);
                    _jettag_c_get_86_67.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_uc_86_50.handleBodyContent(out);
                }
                out = _jettag_f_uc_86_50_saved_out;
        out.bodyContentEnd();
                _jettag_f_uc_86_50.doEnd();
                out.endTag("uc",40);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("($row[\"");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(6);
                out.setTag("lc",5958,5964);
                RuntimeTagElement _jettag_f_lc_86_121 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_86_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_lc_86_121.setRuntimeParent(_jettag_c_if_85_11);
                _jettag_f_lc_86_121.setTagInfo(_td_f_lc_86_121);
                _jettag_f_lc_86_121.doStart(context, out);
                JET2Writer _jettag_f_lc_86_121_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_lc_86_121.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",5964,6003);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(39);
                    RuntimeTagElement _jettag_c_get_86_127 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_127); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_86_127.setRuntimeParent(_jettag_f_lc_86_121);
                    _jettag_c_get_86_127.setTagInfo(_td_c_get_86_127);
                    _jettag_c_get_86_127.doStart(context, out);
                    _jettag_c_get_86_127.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_lc_86_121.handleBodyContent(out);
                }
                out = _jettag_f_lc_86_121_saved_out;
        out.bodyContentEnd();
                _jettag_f_lc_86_121.doEnd();
                out.endTag("lc",39);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",6011,6051);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_86_174 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_174); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_86_174.setRuntimeParent(_jettag_c_if_85_11);
                _jettag_c_get_86_174.setTagInfo(_td_c_get_86_174);
                _jettag_c_get_86_174.doStart(context, out);
                _jettag_c_get_86_174.doEnd();
                out.setTag(null,-1,-1);
                out.write("\"]);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_85_11.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_85_11.doEnd();
            out.endTag("if",222);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_77_4.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_77_4.doEnd();
        out.loopEnd();
        out.endTag("iterate",1268);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\t\t$result[] = $");  //$NON-NLS-1$        
        out.setTag("get",6096,6135);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_88_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_88_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_88_18.setRuntimeParent(null);
        _jettag_c_get_88_18.setTagInfo(_td_c_get_88_18);
        _jettag_c_get_88_18.doStart(context, out);
        _jettag_c_get_88_18.doEnd();
        out.setTag(null,-1,-1);
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn $result;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic function get($");  //$NON-NLS-1$        
        out.setTag("get",6194,6233);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_95_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_95_23); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_95_23.setRuntimeParent(null);
        _jettag_c_get_95_23.setTagInfo(_td_c_get_95_23);
        _jettag_c_get_95_23.doStart(context, out);
        _jettag_c_get_95_23.doEnd();
        out.setTag(null,-1,-1);
        out.write(")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$result = array();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$where = \"\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(64);
        out.setTag("iterate",6281,6345);
        RuntimeTagElement _jettag_c_iterate_101_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_101_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_101_2.setRuntimeParent(null);
        _jettag_c_iterate_101_2.setTagInfo(_td_c_iterate_101_2);
        _jettag_c_iterate_101_2.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_101_2.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_101_2.getTagInfo().getAttribute("delimiter"),6281,6345);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\tif (");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(61);
            out.setTag("if",6352,6413);
            RuntimeTagElement _jettag_c_if_102_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_102_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_102_7.setRuntimeParent(_jettag_c_iterate_101_2);
            _jettag_c_if_102_7.setTagInfo(_td_c_if_102_7);
            _jettag_c_if_102_7.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_102_7.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t(is_array($");  //$NON-NLS-1$        
                out.setTag("get",6428,6467);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_103_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_103_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_103_15.setRuntimeParent(_jettag_c_if_102_7);
                _jettag_c_get_103_15.setTagInfo(_td_c_get_103_15);
                _jettag_c_get_103_15.doStart(context, out);
                _jettag_c_get_103_15.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(17);
                out.setTag("uc",6472,6489);
                RuntimeTagElement _jettag_f_uc_103_59 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_103_59); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_uc_103_59.setRuntimeParent(_jettag_c_if_102_7);
                _jettag_f_uc_103_59.setTagInfo(_td_f_uc_103_59);
                _jettag_f_uc_103_59.doStart(context, out);
                JET2Writer _jettag_f_uc_103_59_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_uc_103_59.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",6489,6529);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_103_76 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_103_76); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_103_76.setRuntimeParent(_jettag_f_uc_103_59);
                    _jettag_c_get_103_76.setTagInfo(_td_c_get_103_76);
                    _jettag_c_get_103_76.doStart(context, out);
                    _jettag_c_get_103_76.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_uc_103_59.handleBodyContent(out);
                }
                out = _jettag_f_uc_103_59_saved_out;
        out.bodyContentEnd();
                _jettag_f_uc_103_59.doEnd();
                out.endTag("uc",40);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("()) && count($");  //$NON-NLS-1$        
                out.setTag("get",6550,6589);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_103_137 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_103_137); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_103_137.setRuntimeParent(_jettag_c_if_102_7);
                _jettag_c_get_103_137.setTagInfo(_td_c_get_103_137);
                _jettag_c_get_103_137.doStart(context, out);
                _jettag_c_get_103_137.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(17);
                out.setTag("uc",6594,6611);
                RuntimeTagElement _jettag_f_uc_103_181 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_103_181); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_uc_103_181.setRuntimeParent(_jettag_c_if_102_7);
                _jettag_f_uc_103_181.setTagInfo(_td_f_uc_103_181);
                _jettag_f_uc_103_181.doStart(context, out);
                JET2Writer _jettag_f_uc_103_181_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_uc_103_181.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",6611,6651);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_103_198 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_103_198); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_103_198.setRuntimeParent(_jettag_f_uc_103_181);
                    _jettag_c_get_103_198.setTagInfo(_td_c_get_103_198);
                    _jettag_c_get_103_198.doStart(context, out);
                    _jettag_c_get_103_198.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_uc_103_181.handleBodyContent(out);
                }
                out = _jettag_f_uc_103_181_saved_out;
        out.bodyContentEnd();
                _jettag_f_uc_103_181.doEnd();
                out.endTag("uc",40);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("()) > 0)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t|| (is_object($");  //$NON-NLS-1$        
                out.setTag("get",6685,6724);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_104_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_104_19); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_104_19.setRuntimeParent(_jettag_c_if_102_7);
                _jettag_c_get_104_19.setTagInfo(_td_c_get_104_19);
                _jettag_c_get_104_19.doStart(context, out);
                _jettag_c_get_104_19.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(17);
                out.setTag("uc",6729,6746);
                RuntimeTagElement _jettag_f_uc_104_63 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_104_63); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_uc_104_63.setRuntimeParent(_jettag_c_if_102_7);
                _jettag_f_uc_104_63.setTagInfo(_td_f_uc_104_63);
                _jettag_f_uc_104_63.doStart(context, out);
                JET2Writer _jettag_f_uc_104_63_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_uc_104_63.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",6746,6786);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_104_80 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_104_80); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_104_80.setRuntimeParent(_jettag_f_uc_104_63);
                    _jettag_c_get_104_80.setTagInfo(_td_c_get_104_80);
                    _jettag_c_get_104_80.doStart(context, out);
                    _jettag_c_get_104_80.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_uc_104_63.handleBodyContent(out);
                }
                out = _jettag_f_uc_104_63_saved_out;
        out.bodyContentEnd();
                _jettag_f_uc_104_63.doEnd();
                out.endTag("uc",40);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("()) && $");  //$NON-NLS-1$        
                out.setTag("get",6801,6840);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_104_135 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_104_135); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_104_135.setRuntimeParent(_jettag_c_if_102_7);
                _jettag_c_get_104_135.setTagInfo(_td_c_get_104_135);
                _jettag_c_get_104_135.doStart(context, out);
                _jettag_c_get_104_135.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(17);
                out.setTag("uc",6845,6862);
                RuntimeTagElement _jettag_f_uc_104_179 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_104_179); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_uc_104_179.setRuntimeParent(_jettag_c_if_102_7);
                _jettag_f_uc_104_179.setTagInfo(_td_f_uc_104_179);
                _jettag_f_uc_104_179.doStart(context, out);
                JET2Writer _jettag_f_uc_104_179_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_uc_104_179.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",6862,6902);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_104_196 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_104_196); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_104_196.setRuntimeParent(_jettag_f_uc_104_179);
                    _jettag_c_get_104_196.setTagInfo(_td_c_get_104_196);
                    _jettag_c_get_104_196.doStart(context, out);
                    _jettag_c_get_104_196.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_uc_104_179.handleBodyContent(out);
                }
                out = _jettag_f_uc_104_179_saved_out;
        out.bodyContentEnd();
                _jettag_f_uc_104_179.doEnd();
                out.endTag("uc",40);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("()->getId() > 0)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_102_7.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_102_7.doEnd();
            out.endTag("if",515);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(68);
            out.setTag("if",6935,7003);
            RuntimeTagElement _jettag_c_if_105_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_105_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_105_10.setRuntimeParent(_jettag_c_iterate_101_2);
            _jettag_c_if_105_10.setTagInfo(_td_c_if_105_10);
            _jettag_c_if_105_10.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_105_10.okToProcessBody()) {
                out.write("strlen($");  //$NON-NLS-1$        
                out.setTag("get",7011,7050);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_106_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_106_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_106_13.setRuntimeParent(_jettag_c_if_105_10);
                _jettag_c_get_106_13.setTagInfo(_td_c_get_106_13);
                _jettag_c_get_106_13.doStart(context, out);
                _jettag_c_get_106_13.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(17);
                out.setTag("uc",7055,7072);
                RuntimeTagElement _jettag_f_uc_106_57 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_106_57); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_uc_106_57.setRuntimeParent(_jettag_c_if_105_10);
                _jettag_f_uc_106_57.setTagInfo(_td_f_uc_106_57);
                _jettag_f_uc_106_57.doStart(context, out);
                JET2Writer _jettag_f_uc_106_57_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_uc_106_57.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",7072,7112);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_106_74 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_106_74); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_106_74.setRuntimeParent(_jettag_f_uc_106_57);
                    _jettag_c_get_106_74.setTagInfo(_td_c_get_106_74);
                    _jettag_c_get_106_74.doStart(context, out);
                    _jettag_c_get_106_74.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_uc_106_57.handleBodyContent(out);
                }
                out = _jettag_f_uc_106_57_saved_out;
        out.bodyContentEnd();
                _jettag_f_uc_106_57.doEnd();
                out.endTag("uc",40);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("()) > 0");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_105_10.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_105_10.doEnd();
            out.endTag("if",123);
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
            out.write("\t\t\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(66);
            out.setTag("if",7236,7302);
            RuntimeTagElement _jettag_c_if_113_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_113_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_113_4.setRuntimeParent(_jettag_c_iterate_101_2);
            _jettag_c_if_113_4.setTagInfo(_td_c_if_113_4);
            _jettag_c_if_113_4.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_113_4.okToProcessBody()) {
                out.write("if (is_array($");  //$NON-NLS-1$        
                out.setTag("get",7316,7355);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_114_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_114_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_114_20.setRuntimeParent(_jettag_c_if_113_4);
                _jettag_c_get_114_20.setTagInfo(_td_c_get_114_20);
                _jettag_c_get_114_20.doStart(context, out);
                _jettag_c_get_114_20.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(17);
                out.setTag("uc",7360,7377);
                RuntimeTagElement _jettag_f_uc_114_64 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_114_64); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_uc_114_64.setRuntimeParent(_jettag_c_if_113_4);
                _jettag_f_uc_114_64.setTagInfo(_td_f_uc_114_64);
                _jettag_f_uc_114_64.doStart(context, out);
                JET2Writer _jettag_f_uc_114_64_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_uc_114_64.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",7377,7417);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_114_81 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_114_81); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_114_81.setRuntimeParent(_jettag_f_uc_114_64);
                    _jettag_c_get_114_81.setTagInfo(_td_c_get_114_81);
                    _jettag_c_get_114_81.doStart(context, out);
                    _jettag_c_get_114_81.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_uc_114_64.handleBodyContent(out);
                }
                out = _jettag_f_uc_114_64_saved_out;
        out.bodyContentEnd();
                _jettag_f_uc_114_64.doEnd();
                out.endTag("uc",40);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("())) {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t$first = true;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t$where .= \"(\";");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tforeach ($");  //$NON-NLS-1$        
                out.setTag("get",7486,7525);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_117_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_117_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_117_16.setRuntimeParent(_jettag_c_if_113_4);
                _jettag_c_get_117_16.setTagInfo(_td_c_get_117_16);
                _jettag_c_get_117_16.doStart(context, out);
                _jettag_c_get_117_16.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(17);
                out.setTag("uc",7530,7547);
                RuntimeTagElement _jettag_f_uc_117_60 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_117_60); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_uc_117_60.setRuntimeParent(_jettag_c_if_113_4);
                _jettag_f_uc_117_60.setTagInfo(_td_f_uc_117_60);
                _jettag_f_uc_117_60.doStart(context, out);
                JET2Writer _jettag_f_uc_117_60_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_uc_117_60.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",7547,7587);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_117_77 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_117_77); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_117_77.setRuntimeParent(_jettag_f_uc_117_60);
                    _jettag_c_get_117_77.setTagInfo(_td_c_get_117_77);
                    _jettag_c_get_117_77.doStart(context, out);
                    _jettag_c_get_117_77.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_uc_117_60.handleBodyContent(out);
                }
                out = _jettag_f_uc_117_60_saved_out;
        out.bodyContentEnd();
                _jettag_f_uc_117_60.doEnd();
                out.endTag("uc",40);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("() as $");  //$NON-NLS-1$        
                out.setTag("get",7601,7641);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_117_131 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_117_131); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_117_131.setRuntimeParent(_jettag_c_if_113_4);
                _jettag_c_get_117_131.setTagInfo(_td_c_get_117_131);
                _jettag_c_get_117_131.doStart(context, out);
                _jettag_c_get_117_131.doEnd();
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
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(6);
                out.setTag("lc",7719,7725);
                RuntimeTagElement _jettag_f_lc_122_18 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_122_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_lc_122_18.setRuntimeParent(_jettag_c_if_113_4);
                _jettag_f_lc_122_18.setTagInfo(_td_f_lc_122_18);
                _jettag_f_lc_122_18.doStart(context, out);
                JET2Writer _jettag_f_lc_122_18_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_lc_122_18.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",7725,7764);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(39);
                    RuntimeTagElement _jettag_c_get_122_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_122_24); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_122_24.setRuntimeParent(_jettag_f_lc_122_18);
                    _jettag_c_get_122_24.setTagInfo(_td_c_get_122_24);
                    _jettag_c_get_122_24.doStart(context, out);
                    _jettag_c_get_122_24.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_lc_122_18.handleBodyContent(out);
                }
                out = _jettag_f_lc_122_18_saved_out;
        out.bodyContentEnd();
                _jettag_f_lc_122_18.doEnd();
                out.endTag("lc",39);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",7772,7812);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_122_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_122_71); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_122_71.setRuntimeParent(_jettag_c_if_113_4);
                _jettag_c_get_122_71.setTagInfo(_td_c_get_122_71);
                _jettag_c_get_122_71.doStart(context, out);
                _jettag_c_get_122_71.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = \" . $");  //$NON-NLS-1$        
                out.setTag("get",7820,7860);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_122_119 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_122_119); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_122_119.setRuntimeParent(_jettag_c_if_113_4);
                _jettag_c_get_122_119.setTagInfo(_td_c_get_122_119);
                _jettag_c_get_122_119.doStart(context, out);
                _jettag_c_get_122_119.doEnd();
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
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(6);
                out.setTag("lc",7949,7955);
                RuntimeTagElement _jettag_f_lc_127_17 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_127_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_lc_127_17.setRuntimeParent(_jettag_c_if_113_4);
                _jettag_f_lc_127_17.setTagInfo(_td_f_lc_127_17);
                _jettag_f_lc_127_17.doStart(context, out);
                JET2Writer _jettag_f_lc_127_17_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_lc_127_17.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",7955,7994);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(39);
                    RuntimeTagElement _jettag_c_get_127_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_127_23); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_127_23.setRuntimeParent(_jettag_f_lc_127_17);
                    _jettag_c_get_127_23.setTagInfo(_td_c_get_127_23);
                    _jettag_c_get_127_23.doStart(context, out);
                    _jettag_c_get_127_23.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_lc_127_17.handleBodyContent(out);
                }
                out = _jettag_f_lc_127_17_saved_out;
        out.bodyContentEnd();
                _jettag_f_lc_127_17.doEnd();
                out.endTag("lc",39);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",8002,8042);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_127_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_127_70); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_127_70.setRuntimeParent(_jettag_c_if_113_4);
                _jettag_c_get_127_70.setTagInfo(_td_c_get_127_70);
                _jettag_c_get_127_70.doStart(context, out);
                _jettag_c_get_127_70.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = \" . $");  //$NON-NLS-1$        
                out.setTag("get",8050,8089);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_127_118 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_127_118); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_127_118.setRuntimeParent(_jettag_c_if_113_4);
                _jettag_c_get_127_118.setTagInfo(_td_c_get_127_118);
                _jettag_c_get_127_118.doStart(context, out);
                _jettag_c_get_127_118.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(17);
                out.setTag("uc",8094,8111);
                RuntimeTagElement _jettag_f_uc_127_162 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_127_162); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_uc_127_162.setRuntimeParent(_jettag_c_if_113_4);
                _jettag_f_uc_127_162.setTagInfo(_td_f_uc_127_162);
                _jettag_f_uc_127_162.doStart(context, out);
                JET2Writer _jettag_f_uc_127_162_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_uc_127_162.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",8111,8151);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_127_179 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_127_179); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_127_179.setRuntimeParent(_jettag_f_uc_127_162);
                    _jettag_c_get_127_179.setTagInfo(_td_c_get_127_179);
                    _jettag_c_get_127_179.doStart(context, out);
                    _jettag_c_get_127_179.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_uc_127_162.handleBodyContent(out);
                }
                out = _jettag_f_uc_127_162_saved_out;
        out.bodyContentEnd();
                _jettag_f_uc_127_162.doEnd();
                out.endTag("uc",40);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("()->getId();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_113_4.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_113_4.doEnd();
            out.endTag("if",878);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(69);
            out.setTag("if",8187,8256);
            RuntimeTagElement _jettag_c_if_129_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_129_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_129_11.setRuntimeParent(_jettag_c_iterate_101_2);
            _jettag_c_if_129_11.setTagInfo(_td_c_if_129_11);
            _jettag_c_if_129_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_129_11.okToProcessBody()) {
                out.write("$where .= \"");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(6);
                out.setTag("lc",8267,8273);
                RuntimeTagElement _jettag_f_lc_130_17 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_130_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_lc_130_17.setRuntimeParent(_jettag_c_if_129_11);
                _jettag_f_lc_130_17.setTagInfo(_td_f_lc_130_17);
                _jettag_f_lc_130_17.doStart(context, out);
                JET2Writer _jettag_f_lc_130_17_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_lc_130_17.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",8273,8312);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(39);
                    RuntimeTagElement _jettag_c_get_130_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_130_23); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_130_23.setRuntimeParent(_jettag_f_lc_130_17);
                    _jettag_c_get_130_23.setTagInfo(_td_c_get_130_23);
                    _jettag_c_get_130_23.doStart(context, out);
                    _jettag_c_get_130_23.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_lc_130_17.handleBodyContent(out);
                }
                out = _jettag_f_lc_130_17_saved_out;
        out.bodyContentEnd();
                _jettag_f_lc_130_17.doEnd();
                out.endTag("lc",39);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",8320,8360);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_130_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_130_70); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_130_70.setRuntimeParent(_jettag_c_if_129_11);
                _jettag_c_get_130_70.setTagInfo(_td_c_get_130_70);
                _jettag_c_get_130_70.doStart(context, out);
                _jettag_c_get_130_70.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = '\" . $");  //$NON-NLS-1$        
                out.setTag("get",8369,8408);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_130_119 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_130_119); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_130_119.setRuntimeParent(_jettag_c_if_129_11);
                _jettag_c_get_130_119.setTagInfo(_td_c_get_130_119);
                _jettag_c_get_130_119.doStart(context, out);
                _jettag_c_get_130_119.doEnd();
                out.setTag(null,-1,-1);
                out.write("->get");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(17);
                out.setTag("uc",8413,8430);
                RuntimeTagElement _jettag_f_uc_130_163 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_130_163); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_uc_130_163.setRuntimeParent(_jettag_c_if_129_11);
                _jettag_f_uc_130_163.setTagInfo(_td_f_uc_130_163);
                _jettag_f_uc_130_163.doStart(context, out);
                JET2Writer _jettag_f_uc_130_163_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_uc_130_163.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",8430,8470);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_130_180 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_130_180); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_130_180.setRuntimeParent(_jettag_f_uc_130_163);
                    _jettag_c_get_130_180.setTagInfo(_td_c_get_130_180);
                    _jettag_c_get_130_180.doStart(context, out);
                    _jettag_c_get_130_180.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_uc_130_163.handleBodyContent(out);
                }
                out = _jettag_f_uc_130_163_saved_out;
        out.bodyContentEnd();
                _jettag_f_uc_130_163.doEnd();
                out.endTag("uc",40);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("() . \"'\";");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_129_11.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_129_11.doEnd();
            out.endTag("if",234);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("\t\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_101_2.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_101_2.doEnd();
        out.loopEnd();
        out.endTag("iterate",2158);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t$query = pg_query(\"SELECT");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(6);
        out.setTag("lc",8547,8553);
        RuntimeTagElement _jettag_f_lc_135_4 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_135_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_lc_135_4.setRuntimeParent(null);
        _jettag_f_lc_135_4.setTagInfo(_td_f_lc_135_4);
        _jettag_f_lc_135_4.doStart(context, out);
        JET2Writer _jettag_f_lc_135_4_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_lc_135_4.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",8553,8592);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
            RuntimeTagElement _jettag_c_get_135_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_135_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_135_10.setRuntimeParent(_jettag_f_lc_135_4);
            _jettag_c_get_135_10.setTagInfo(_td_c_get_135_10);
            _jettag_c_get_135_10.doStart(context, out);
            _jettag_c_get_135_10.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_f_lc_135_4.handleBodyContent(out);
        }
        out = _jettag_f_lc_135_4_saved_out;
out.bodyContentEnd();
        _jettag_f_lc_135_4.doEnd();
        out.endTag("lc",39);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(".id AS ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(6);
        out.setTag("lc",8606,8612);
        RuntimeTagElement _jettag_f_lc_135_63 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_135_63); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_lc_135_63.setRuntimeParent(null);
        _jettag_f_lc_135_63.setTagInfo(_td_f_lc_135_63);
        _jettag_f_lc_135_63.doStart(context, out);
        JET2Writer _jettag_f_lc_135_63_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_lc_135_63.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",8612,8651);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
            RuntimeTagElement _jettag_c_get_135_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_135_69); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_135_69.setRuntimeParent(_jettag_f_lc_135_63);
            _jettag_c_get_135_69.setTagInfo(_td_c_get_135_69);
            _jettag_c_get_135_69.doStart(context, out);
            _jettag_c_get_135_69.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_f_lc_135_63.handleBodyContent(out);
        }
        out = _jettag_f_lc_135_63_saved_out;
out.bodyContentEnd();
        _jettag_f_lc_135_63.doEnd();
        out.endTag("lc",39);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write("_id,");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(84);
        out.setTag("iterate",8662,8746);
        RuntimeTagElement _jettag_c_iterate_135_119 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_135_119); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_135_119.setRuntimeParent(null);
        _jettag_c_iterate_135_119.setTagInfo(_td_c_iterate_135_119);
        _jettag_c_iterate_135_119.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_135_119.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_135_119.getTagInfo().getAttribute("delimiter"),8662,8746);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(61);
            out.setTag("if",8746,8807);
            RuntimeTagElement _jettag_c_if_136_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_136_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_136_5.setRuntimeParent(_jettag_c_iterate_135_119);
            _jettag_c_if_136_5.setTagInfo(_td_c_if_136_5);
            _jettag_c_if_136_5.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_136_5.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(6);
                out.setTag("lc",8812,8818);
                RuntimeTagElement _jettag_f_lc_137_5 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_137_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_lc_137_5.setRuntimeParent(_jettag_c_if_136_5);
                _jettag_f_lc_137_5.setTagInfo(_td_f_lc_137_5);
                _jettag_f_lc_137_5.doStart(context, out);
                JET2Writer _jettag_f_lc_137_5_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_lc_137_5.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",8818,8876);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_137_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_137_11); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_137_11.setRuntimeParent(_jettag_f_lc_137_5);
                    _jettag_c_get_137_11.setTagInfo(_td_c_get_137_11);
                    _jettag_c_get_137_11.doStart(context, out);
                    _jettag_c_get_137_11.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_lc_137_5.handleBodyContent(out);
                }
                out = _jettag_f_lc_137_5_saved_out;
        out.bodyContentEnd();
                _jettag_f_lc_137_5.doEnd();
                out.endTag("lc",58);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(".id AS ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(6);
                out.setTag("lc",8890,8896);
                RuntimeTagElement _jettag_f_lc_137_83 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_137_83); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_lc_137_83.setRuntimeParent(_jettag_c_if_136_5);
                _jettag_f_lc_137_83.setTagInfo(_td_f_lc_137_83);
                _jettag_f_lc_137_83.doStart(context, out);
                JET2Writer _jettag_f_lc_137_83_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_lc_137_83.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",8896,8954);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_137_89 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_137_89); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_137_89.setRuntimeParent(_jettag_f_lc_137_83);
                    _jettag_c_get_137_89.setTagInfo(_td_c_get_137_89);
                    _jettag_c_get_137_89.doStart(context, out);
                    _jettag_c_get_137_89.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_lc_137_83.handleBodyContent(out);
                }
                out = _jettag_f_lc_137_83_saved_out;
        out.bodyContentEnd();
                _jettag_f_lc_137_83.doEnd();
                out.endTag("lc",58);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("_id,");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(121);
                out.setTag("iterate",8965,9086);
                RuntimeTagElement _jettag_c_iterate_137_158 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_137_158); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_137_158.setRuntimeParent(_jettag_c_if_136_5);
                _jettag_c_iterate_137_158.setTagInfo(_td_c_iterate_137_158);
                _jettag_c_iterate_137_158.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_137_158.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_137_158.getTagInfo().getAttribute("delimiter"),8965,9086);
                    out.loopIterate();
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(6);
                    out.setTag("lc",9086,9092);
                    RuntimeTagElement _jettag_f_lc_138_6 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_138_6); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_f_lc_138_6.setRuntimeParent(_jettag_c_iterate_137_158);
                    _jettag_f_lc_138_6.setTagInfo(_td_f_lc_138_6);
                    _jettag_f_lc_138_6.doStart(context, out);
                    JET2Writer _jettag_f_lc_138_6_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_f_lc_138_6.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.setTag("get",9092,9150);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(58);
                        RuntimeTagElement _jettag_c_get_138_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_138_12); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_138_12.setRuntimeParent(_jettag_f_lc_138_6);
                        _jettag_c_get_138_12.setTagInfo(_td_c_get_138_12);
                        _jettag_c_get_138_12.doStart(context, out);
                        _jettag_c_get_138_12.doEnd();
                        out.setTag(null,-1,-1);
            out.bodyContentStart();
                        _jettag_f_lc_138_6.handleBodyContent(out);
                    }
                    out = _jettag_f_lc_138_6_saved_out;
            out.bodyContentEnd();
                    _jettag_f_lc_138_6.doEnd();
                    out.endTag("lc",58);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",9158,9216);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_138_78 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_138_78); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_138_78.setRuntimeParent(_jettag_c_iterate_137_158);
                    _jettag_c_get_138_78.setTagInfo(_td_c_get_138_78);
                    _jettag_c_get_138_78.doStart(context, out);
                    _jettag_c_get_138_78.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" AS ");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(6);
                    out.setTag("lc",9220,9226);
                    RuntimeTagElement _jettag_f_lc_138_140 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_138_140); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_f_lc_138_140.setRuntimeParent(_jettag_c_iterate_137_158);
                    _jettag_f_lc_138_140.setTagInfo(_td_f_lc_138_140);
                    _jettag_f_lc_138_140.doStart(context, out);
                    JET2Writer _jettag_f_lc_138_140_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_f_lc_138_140.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.setTag("get",9226,9284);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(58);
                        RuntimeTagElement _jettag_c_get_138_146 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_138_146); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_138_146.setRuntimeParent(_jettag_f_lc_138_140);
                        _jettag_c_get_138_146.setTagInfo(_td_c_get_138_146);
                        _jettag_c_get_138_146.doStart(context, out);
                        _jettag_c_get_138_146.doEnd();
                        out.setTag(null,-1,-1);
            out.bodyContentStart();
                        _jettag_f_lc_138_140.handleBodyContent(out);
                    }
                    out = _jettag_f_lc_138_140_saved_out;
            out.bodyContentEnd();
                    _jettag_f_lc_138_140.doEnd();
                    out.endTag("lc",58);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",9292,9350);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_138_212 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_138_212); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_138_212.setRuntimeParent(_jettag_c_iterate_137_158);
                    _jettag_c_get_138_212.setTagInfo(_td_c_get_138_212);
                    _jettag_c_get_138_212.doStart(context, out);
                    _jettag_c_get_138_212.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_c_iterate_137_158.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_137_158.doEnd();
                out.loopEnd();
                out.endTag("iterate",264);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_136_5.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_136_5.doEnd();
            out.endTag("if",559);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(69);
            out.setTag("if",9373,9442);
            RuntimeTagElement _jettag_c_if_139_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_139_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_139_11.setRuntimeParent(_jettag_c_iterate_135_119);
            _jettag_c_if_139_11.setTagInfo(_td_c_if_139_11);
            _jettag_c_if_139_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_139_11.okToProcessBody()) {
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(6);
                out.setTag("lc",9442,9448);
                RuntimeTagElement _jettag_f_lc_140_6 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_140_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_lc_140_6.setRuntimeParent(_jettag_c_if_139_11);
                _jettag_f_lc_140_6.setTagInfo(_td_f_lc_140_6);
                _jettag_f_lc_140_6.doStart(context, out);
                JET2Writer _jettag_f_lc_140_6_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_lc_140_6.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",9448,9487);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(39);
                    RuntimeTagElement _jettag_c_get_140_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_140_12); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_140_12.setRuntimeParent(_jettag_f_lc_140_6);
                    _jettag_c_get_140_12.setTagInfo(_td_c_get_140_12);
                    _jettag_c_get_140_12.doStart(context, out);
                    _jettag_c_get_140_12.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_lc_140_6.handleBodyContent(out);
                }
                out = _jettag_f_lc_140_6_saved_out;
        out.bodyContentEnd();
                _jettag_f_lc_140_6.doEnd();
                out.endTag("lc",39);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",9495,9535);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_140_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_140_59); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_140_59.setRuntimeParent(_jettag_c_if_139_11);
                _jettag_c_get_140_59.setTagInfo(_td_c_get_140_59);
                _jettag_c_get_140_59.doStart(context, out);
                _jettag_c_get_140_59.doEnd();
                out.setTag(null,-1,-1);
                out.write(" AS ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(6);
                out.setTag("lc",9539,9545);
                RuntimeTagElement _jettag_f_lc_140_103 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_140_103); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_lc_140_103.setRuntimeParent(_jettag_c_if_139_11);
                _jettag_f_lc_140_103.setTagInfo(_td_f_lc_140_103);
                _jettag_f_lc_140_103.doStart(context, out);
                JET2Writer _jettag_f_lc_140_103_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_lc_140_103.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",9545,9584);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(39);
                    RuntimeTagElement _jettag_c_get_140_109 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_140_109); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_140_109.setRuntimeParent(_jettag_f_lc_140_103);
                    _jettag_c_get_140_109.setTagInfo(_td_c_get_140_109);
                    _jettag_c_get_140_109.doStart(context, out);
                    _jettag_c_get_140_109.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_lc_140_103.handleBodyContent(out);
                }
                out = _jettag_f_lc_140_103_saved_out;
        out.bodyContentEnd();
                _jettag_f_lc_140_103.doEnd();
                out.endTag("lc",39);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",9592,9632);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_140_156 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_140_156); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_140_156.setRuntimeParent(_jettag_c_if_139_11);
                _jettag_c_get_140_156.setTagInfo(_td_c_get_140_156);
                _jettag_c_get_140_156.doStart(context, out);
                _jettag_c_get_140_156.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_c_if_139_11.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_139_11.doEnd();
            out.endTag("if",190);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_135_119.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_135_119.doEnd();
        out.loopEnd();
        out.endTag("iterate",893);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\tFROM ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(6);
        out.setTag("lc",9660,9666);
        RuntimeTagElement _jettag_f_lc_141_9 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_141_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_lc_141_9.setRuntimeParent(null);
        _jettag_f_lc_141_9.setTagInfo(_td_f_lc_141_9);
        _jettag_f_lc_141_9.doStart(context, out);
        JET2Writer _jettag_f_lc_141_9_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_lc_141_9.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",9666,9705);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
            RuntimeTagElement _jettag_c_get_141_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_141_15); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_141_15.setRuntimeParent(_jettag_f_lc_141_9);
            _jettag_c_get_141_15.setTagInfo(_td_c_get_141_15);
            _jettag_c_get_141_15.doStart(context, out);
            _jettag_c_get_141_15.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_f_lc_141_9.handleBodyContent(out);
        }
        out = _jettag_f_lc_141_9_saved_out;
out.bodyContentEnd();
        _jettag_f_lc_141_9.doEnd();
        out.endTag("lc",39);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(64);
        out.setTag("iterate",9716,9780);
        RuntimeTagElement _jettag_c_iterate_142_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_142_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_142_4.setRuntimeParent(null);
        _jettag_c_iterate_142_4.setTagInfo(_td_c_iterate_142_4);
        _jettag_c_iterate_142_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_142_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_142_4.getTagInfo().getAttribute("delimiter"),9716,9780);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(65);
            out.setTag("if",9780,9845);
            RuntimeTagElement _jettag_c_if_142_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_142_68); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_142_68.setRuntimeParent(_jettag_c_iterate_142_4);
            _jettag_c_if_142_68.setTagInfo(_td_c_if_142_68);
            _jettag_c_if_142_68.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_142_68.okToProcessBody()) {
                out.write("INNER JOIN ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(6);
                out.setTag("lc",9856,9862);
                RuntimeTagElement _jettag_f_lc_143_16 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_143_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_lc_143_16.setRuntimeParent(_jettag_c_if_142_68);
                _jettag_f_lc_143_16.setTagInfo(_td_f_lc_143_16);
                _jettag_f_lc_143_16.doStart(context, out);
                JET2Writer _jettag_f_lc_143_16_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_lc_143_16.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",9862,9920);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_143_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_143_22); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_143_22.setRuntimeParent(_jettag_f_lc_143_16);
                    _jettag_c_get_143_22.setTagInfo(_td_c_get_143_22);
                    _jettag_c_get_143_22.doStart(context, out);
                    _jettag_c_get_143_22.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_lc_143_16.handleBodyContent(out);
                }
                out = _jettag_f_lc_143_16_saved_out;
        out.bodyContentEnd();
                _jettag_f_lc_143_16.doEnd();
                out.endTag("lc",58);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(" ON ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(6);
                out.setTag("lc",9931,9937);
                RuntimeTagElement _jettag_f_lc_143_91 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_143_91); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_lc_143_91.setRuntimeParent(_jettag_c_if_142_68);
                _jettag_f_lc_143_91.setTagInfo(_td_f_lc_143_91);
                _jettag_f_lc_143_91.doStart(context, out);
                JET2Writer _jettag_f_lc_143_91_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_lc_143_91.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",9937,9995);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_143_97 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_143_97); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_143_97.setRuntimeParent(_jettag_f_lc_143_91);
                    _jettag_c_get_143_97.setTagInfo(_td_c_get_143_97);
                    _jettag_c_get_143_97.doStart(context, out);
                    _jettag_c_get_143_97.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_lc_143_91.handleBodyContent(out);
                }
                out = _jettag_f_lc_143_91_saved_out;
        out.bodyContentEnd();
                _jettag_f_lc_143_91.doEnd();
                out.endTag("lc",58);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(".id = ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(6);
                out.setTag("lc",10008,10014);
                RuntimeTagElement _jettag_f_lc_143_168 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_143_168); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_lc_143_168.setRuntimeParent(_jettag_c_if_142_68);
                _jettag_f_lc_143_168.setTagInfo(_td_f_lc_143_168);
                _jettag_f_lc_143_168.doStart(context, out);
                JET2Writer _jettag_f_lc_143_168_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_lc_143_168.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",10014,10053);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(39);
                    RuntimeTagElement _jettag_c_get_143_174 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_143_174); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_143_174.setRuntimeParent(_jettag_f_lc_143_168);
                    _jettag_c_get_143_174.setTagInfo(_td_c_get_143_174);
                    _jettag_c_get_143_174.doStart(context, out);
                    _jettag_c_get_143_174.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_lc_143_168.handleBodyContent(out);
                }
                out = _jettag_f_lc_143_168_saved_out;
        out.bodyContentEnd();
                _jettag_f_lc_143_168.doEnd();
                out.endTag("lc",39);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",10061,10101);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_143_221 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_143_221); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_143_221.setRuntimeParent(_jettag_c_if_142_68);
                _jettag_c_get_143_221.setTagInfo(_td_c_get_143_221);
                _jettag_c_get_143_221.doStart(context, out);
                _jettag_c_get_143_221.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_c_if_142_68.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_142_68.doEnd();
            out.endTag("if",256);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_142_4.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_142_4.doEnd();
        out.loopEnd();
        out.endTag("iterate",328);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\" . $where); echo $where;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif ($query) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\twhile ($row = pg_fetch_assoc($query)) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t$");  //$NON-NLS-1$        
        out.setTag("get",10216,10255);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_148_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_148_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_148_6.setRuntimeParent(null);
        _jettag_c_get_148_6.setTagInfo(_td_c_get_148_6);
        _jettag_c_get_148_6.doStart(context, out);
        _jettag_c_get_148_6.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = new ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(17);
        out.setTag("uc",10262,10279);
        RuntimeTagElement _jettag_f_uc_148_52 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_148_52); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_uc_148_52.setRuntimeParent(null);
        _jettag_f_uc_148_52.setTagInfo(_td_f_uc_148_52);
        _jettag_f_uc_148_52.doStart(context, out);
        JET2Writer _jettag_f_uc_148_52_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_uc_148_52.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",10279,10318);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
            RuntimeTagElement _jettag_c_get_148_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_148_69); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_148_69.setRuntimeParent(_jettag_f_uc_148_52);
            _jettag_c_get_148_69.setTagInfo(_td_c_get_148_69);
            _jettag_c_get_148_69.doStart(context, out);
            _jettag_c_get_148_69.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_f_uc_148_52.handleBodyContent(out);
        }
        out = _jettag_f_uc_148_52_saved_out;
out.bodyContentEnd();
        _jettag_f_uc_148_52.doEnd();
        out.endTag("uc",39);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write("();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\t\t$");  //$NON-NLS-1$        
        out.setTag("get",10335,10374);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_150_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_150_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_150_6.setRuntimeParent(null);
        _jettag_c_get_150_6.setTagInfo(_td_c_get_150_6);
        _jettag_c_get_150_6.doStart(context, out);
        _jettag_c_get_150_6.doEnd();
        out.setTag(null,-1,-1);
        out.write("->setId($row[\"");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(6);
        out.setTag("lc",10388,10394);
        RuntimeTagElement _jettag_f_lc_150_59 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_150_59); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_lc_150_59.setRuntimeParent(null);
        _jettag_f_lc_150_59.setTagInfo(_td_f_lc_150_59);
        _jettag_f_lc_150_59.doStart(context, out);
        JET2Writer _jettag_f_lc_150_59_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_lc_150_59.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",10394,10433);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
            RuntimeTagElement _jettag_c_get_150_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_150_65); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_150_65.setRuntimeParent(_jettag_f_lc_150_59);
            _jettag_c_get_150_65.setTagInfo(_td_c_get_150_65);
            _jettag_c_get_150_65.doStart(context, out);
            _jettag_c_get_150_65.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_f_lc_150_59.handleBodyContent(out);
        }
        out = _jettag_f_lc_150_59_saved_out;
out.bodyContentEnd();
        _jettag_f_lc_150_59.doEnd();
        out.endTag("lc",39);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write("_id\"]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(68);
        out.setTag("iterate",10451,10519);
        RuntimeTagElement _jettag_c_iterate_151_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_151_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_151_4.setRuntimeParent(null);
        _jettag_c_iterate_151_4.setTagInfo(_td_c_iterate_151_4);
        _jettag_c_iterate_151_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_151_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_151_4.getTagInfo().getAttribute("delimiter"),10451,10519);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(61);
            out.setTag("if",10519,10580);
            RuntimeTagElement _jettag_c_if_152_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_152_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_152_5.setRuntimeParent(_jettag_c_iterate_151_4);
            _jettag_c_if_152_5.setTagInfo(_td_c_if_152_5);
            _jettag_c_if_152_5.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_152_5.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",10586,10644);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_153_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_153_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_153_6.setRuntimeParent(_jettag_c_if_152_5);
                _jettag_c_get_153_6.setTagInfo(_td_c_get_153_6);
                _jettag_c_get_153_6.doStart(context, out);
                _jettag_c_get_153_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = new ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(17);
                out.setTag("uc",10651,10668);
                RuntimeTagElement _jettag_f_uc_153_71 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_153_71); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_uc_153_71.setRuntimeParent(_jettag_c_if_152_5);
                _jettag_f_uc_153_71.setTagInfo(_td_f_uc_153_71);
                _jettag_f_uc_153_71.doStart(context, out);
                JET2Writer _jettag_f_uc_153_71_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_uc_153_71.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",10668,10726);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_153_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_153_88); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_153_88.setRuntimeParent(_jettag_f_uc_153_71);
                    _jettag_c_get_153_88.setTagInfo(_td_c_get_153_88);
                    _jettag_c_get_153_88.doStart(context, out);
                    _jettag_c_get_153_88.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_uc_153_71.handleBodyContent(out);
                }
                out = _jettag_f_uc_153_71_saved_out;
        out.bodyContentEnd();
                _jettag_f_uc_153_71.doEnd();
                out.endTag("uc",58);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",10742,10800);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_154_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_154_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_154_6.setRuntimeParent(_jettag_c_if_152_5);
                _jettag_c_get_154_6.setTagInfo(_td_c_get_154_6);
                _jettag_c_get_154_6.doStart(context, out);
                _jettag_c_get_154_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->setId($row[\"");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(6);
                out.setTag("lc",10814,10820);
                RuntimeTagElement _jettag_f_lc_154_78 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_154_78); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_lc_154_78.setRuntimeParent(_jettag_c_if_152_5);
                _jettag_f_lc_154_78.setTagInfo(_td_f_lc_154_78);
                _jettag_f_lc_154_78.doStart(context, out);
                JET2Writer _jettag_f_lc_154_78_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_lc_154_78.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",10820,10878);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_154_84 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_154_84); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_154_84.setRuntimeParent(_jettag_f_lc_154_78);
                    _jettag_c_get_154_84.setTagInfo(_td_c_get_154_84);
                    _jettag_c_get_154_84.doStart(context, out);
                    _jettag_c_get_154_84.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_lc_154_78.handleBodyContent(out);
                }
                out = _jettag_f_lc_154_78_saved_out;
        out.bodyContentEnd();
                _jettag_f_lc_154_78.doEnd();
                out.endTag("lc",58);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("_id\"]);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(106);
                out.setTag("iterate",10897,11003);
                RuntimeTagElement _jettag_c_iterate_155_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_155_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_155_5.setRuntimeParent(_jettag_c_if_152_5);
                _jettag_c_iterate_155_5.setTagInfo(_td_c_iterate_155_5);
                _jettag_c_iterate_155_5.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_155_5.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_155_5.getTagInfo().getAttribute("delimiter"),10897,11003);
                    out.loopIterate();
                    out.write("$");  //$NON-NLS-1$        
                    out.setTag("get",11004,11062);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_156_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_156_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_156_7.setRuntimeParent(_jettag_c_iterate_155_5);
                    _jettag_c_get_156_7.setTagInfo(_td_c_get_156_7);
                    _jettag_c_get_156_7.doStart(context, out);
                    _jettag_c_get_156_7.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->set");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(17);
                    out.setTag("uc",11067,11084);
                    RuntimeTagElement _jettag_f_uc_156_70 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_156_70); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_f_uc_156_70.setRuntimeParent(_jettag_c_iterate_155_5);
                    _jettag_f_uc_156_70.setTagInfo(_td_f_uc_156_70);
                    _jettag_f_uc_156_70.doStart(context, out);
                    JET2Writer _jettag_f_uc_156_70_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_f_uc_156_70.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.setTag("get",11084,11142);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(58);
                        RuntimeTagElement _jettag_c_get_156_87 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_156_87); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_156_87.setRuntimeParent(_jettag_f_uc_156_70);
                        _jettag_c_get_156_87.setTagInfo(_td_c_get_156_87);
                        _jettag_c_get_156_87.doStart(context, out);
                        _jettag_c_get_156_87.doEnd();
                        out.setTag(null,-1,-1);
            out.bodyContentStart();
                        _jettag_f_uc_156_70.handleBodyContent(out);
                    }
                    out = _jettag_f_uc_156_70_saved_out;
            out.bodyContentEnd();
                    _jettag_f_uc_156_70.doEnd();
                    out.endTag("uc",58);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
                    out.write("($row[\"");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(6);
                    out.setTag("lc",11156,11162);
                    RuntimeTagElement _jettag_f_lc_156_159 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_156_159); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_f_lc_156_159.setRuntimeParent(_jettag_c_iterate_155_5);
                    _jettag_f_lc_156_159.setTagInfo(_td_f_lc_156_159);
                    _jettag_f_lc_156_159.doStart(context, out);
                    JET2Writer _jettag_f_lc_156_159_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_f_lc_156_159.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.setTag("get",11162,11220);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(58);
                        RuntimeTagElement _jettag_c_get_156_165 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_156_165); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_156_165.setRuntimeParent(_jettag_f_lc_156_159);
                        _jettag_c_get_156_165.setTagInfo(_td_c_get_156_165);
                        _jettag_c_get_156_165.doStart(context, out);
                        _jettag_c_get_156_165.doEnd();
                        out.setTag(null,-1,-1);
            out.bodyContentStart();
                        _jettag_f_lc_156_159.handleBodyContent(out);
                    }
                    out = _jettag_f_lc_156_159_saved_out;
            out.bodyContentEnd();
                    _jettag_f_lc_156_159.doEnd();
                    out.endTag("lc",58);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
                    out.write("_");  //$NON-NLS-1$        
                    out.setTag("get",11228,11286);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_156_231 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_156_231); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_156_231.setRuntimeParent(_jettag_c_iterate_155_5);
                    _jettag_c_get_156_231.setTagInfo(_td_c_get_156_231);
                    _jettag_c_get_156_231.doStart(context, out);
                    _jettag_c_get_156_231.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\"]);");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_155_5.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_155_5.doEnd();
                out.loopEnd();
                out.endTag("iterate",292);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",11313,11352);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_158_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_158_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_158_6.setRuntimeParent(_jettag_c_if_152_5);
                _jettag_c_get_158_6.setTagInfo(_td_c_get_158_6);
                _jettag_c_get_158_6.doStart(context, out);
                _jettag_c_get_158_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->set");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(17);
                out.setTag("uc",11357,11374);
                RuntimeTagElement _jettag_f_uc_158_50 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_158_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_uc_158_50.setRuntimeParent(_jettag_c_if_152_5);
                _jettag_f_uc_158_50.setTagInfo(_td_f_uc_158_50);
                _jettag_f_uc_158_50.doStart(context, out);
                JET2Writer _jettag_f_uc_158_50_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_uc_158_50.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",11374,11414);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_158_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_158_67); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_158_67.setRuntimeParent(_jettag_f_uc_158_50);
                    _jettag_c_get_158_67.setTagInfo(_td_c_get_158_67);
                    _jettag_c_get_158_67.doStart(context, out);
                    _jettag_c_get_158_67.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_uc_158_50.handleBodyContent(out);
                }
                out = _jettag_f_uc_158_50_saved_out;
        out.bodyContentEnd();
                _jettag_f_uc_158_50.doEnd();
                out.endTag("uc",40);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",11423,11481);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_158_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_158_116); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_158_116.setRuntimeParent(_jettag_c_if_152_5);
                _jettag_c_get_158_116.setTagInfo(_td_c_get_158_116);
                _jettag_c_get_158_116.doStart(context, out);
                _jettag_c_get_158_116.doEnd();
                out.setTag(null,-1,-1);
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_152_5.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_152_5.doEnd();
            out.endTag("if",907);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(64);
            out.setTag("if",11494,11558);
            RuntimeTagElement _jettag_c_if_159_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_159_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_159_11.setRuntimeParent(_jettag_c_iterate_151_4);
            _jettag_c_if_159_11.setTagInfo(_td_c_if_159_11);
            _jettag_c_if_159_11.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_159_11.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",11564,11603);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_160_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_160_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_160_6.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_get_160_6.setTagInfo(_td_c_get_160_6);
                _jettag_c_get_160_6.doStart(context, out);
                _jettag_c_get_160_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->set");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(17);
                out.setTag("uc",11608,11625);
                RuntimeTagElement _jettag_f_uc_160_50 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_160_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_uc_160_50.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_f_uc_160_50.setTagInfo(_td_f_uc_160_50);
                _jettag_f_uc_160_50.doStart(context, out);
                JET2Writer _jettag_f_uc_160_50_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_uc_160_50.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",11625,11665);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_160_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_160_67); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_160_67.setRuntimeParent(_jettag_f_uc_160_50);
                    _jettag_c_get_160_67.setTagInfo(_td_c_get_160_67);
                    _jettag_c_get_160_67.doStart(context, out);
                    _jettag_c_get_160_67.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_uc_160_50.handleBodyContent(out);
                }
                out = _jettag_f_uc_160_50_saved_out;
        out.bodyContentEnd();
                _jettag_f_uc_160_50.doEnd();
                out.endTag("uc",40);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("($row[\"");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(6);
                out.setTag("lc",11679,11685);
                RuntimeTagElement _jettag_f_lc_160_121 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_160_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_lc_160_121.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_f_lc_160_121.setTagInfo(_td_f_lc_160_121);
                _jettag_f_lc_160_121.doStart(context, out);
                JET2Writer _jettag_f_lc_160_121_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_lc_160_121.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",11685,11724);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(39);
                    RuntimeTagElement _jettag_c_get_160_127 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_160_127); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_160_127.setRuntimeParent(_jettag_f_lc_160_121);
                    _jettag_c_get_160_127.setTagInfo(_td_c_get_160_127);
                    _jettag_c_get_160_127.doStart(context, out);
                    _jettag_c_get_160_127.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_lc_160_121.handleBodyContent(out);
                }
                out = _jettag_f_lc_160_121_saved_out;
        out.bodyContentEnd();
                _jettag_f_lc_160_121.doEnd();
                out.endTag("lc",39);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("_");  //$NON-NLS-1$        
                out.setTag("get",11732,11772);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_160_174 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_160_174); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_160_174.setRuntimeParent(_jettag_c_if_159_11);
                _jettag_c_get_160_174.setTagInfo(_td_c_get_160_174);
                _jettag_c_get_160_174.doStart(context, out);
                _jettag_c_get_160_174.doEnd();
                out.setTag(null,-1,-1);
                out.write("\"]);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_159_11.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_159_11.doEnd();
            out.endTag("if",222);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_151_4.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_151_4.doEnd();
        out.loopEnd();
        out.endTag("iterate",1268);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\t\t$result[] = $");  //$NON-NLS-1$        
        out.setTag("get",11817,11856);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_162_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_162_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_162_18.setRuntimeParent(null);
        _jettag_c_get_162_18.setTagInfo(_td_c_get_162_18);
        _jettag_c_get_162_18.doStart(context, out);
        _jettag_c_get_162_18.doEnd();
        out.setTag(null,-1,-1);
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
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
