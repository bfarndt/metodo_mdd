package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_templateForm implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_templateForm(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_iterate_1_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            1, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentForm/entity", //$NON-NLS-1$
                "currentEntity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_23 = new TagInfo("c:get", //$NON-NLS-1$
            3, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_23 = new TagInfo("c:get", //$NON-NLS-1$
            4, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_4 = new TagInfo("c:get", //$NON-NLS-1$
            6, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_55 = new TagInfo("c:get", //$NON-NLS-1$
            6, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_8_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            8, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_9_3 = new TagInfo("c:if", //$NON-NLS-1$
            9, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_5 = new TagInfo("c:get", //$NON-NLS-1$
            10, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_24 = new TagInfo("c:get", //$NON-NLS-1$
            11, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_35 = new TagInfo("c:get", //$NON-NLS-1$
            12, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_8 = new TagInfo("c:get", //$NON-NLS-1$
            15, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_78 = new TagInfo("c:get", //$NON-NLS-1$
            15, 78,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_8 = new TagInfo("c:get", //$NON-NLS-1$
            16, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_8 = new TagInfo("c:get", //$NON-NLS-1$
            17, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_52 = new TagInfo("c:get", //$NON-NLS-1$
            17, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_100 = new TagInfo("c:get", //$NON-NLS-1$
            17, 100,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_22_3 = new TagInfo("c:if", //$NON-NLS-1$
            22, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_5 = new TagInfo("c:get", //$NON-NLS-1$
            23, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_21 = new TagInfo("c:get", //$NON-NLS-1$
            24, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_6 = new TagInfo("c:get", //$NON-NLS-1$
            25, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_56 = new TagInfo("c:get", //$NON-NLS-1$
            25, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_6 = new TagInfo("c:get", //$NON-NLS-1$
            26, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_50 = new TagInfo("c:get", //$NON-NLS-1$
            26, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_98 = new TagInfo("c:get", //$NON-NLS-1$
            26, 98,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_4 = new TagInfo("c:get", //$NON-NLS-1$
            31, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_57 = new TagInfo("c:get", //$NON-NLS-1$
            31, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_12 = new TagInfo("c:get", //$NON-NLS-1$
            32, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_65 = new TagInfo("c:get", //$NON-NLS-1$
            32, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_38_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            38, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_40_7 = new TagInfo("c:if", //$NON-NLS-1$
            40, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'string') or ($currentFeature/DataType/@name = 'int') or ($currentFeature/DataType/@name = 'float') or ($currentFeature/DataType/@name = 'time')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_40 = new TagInfo("c:get", //$NON-NLS-1$
            41, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_33 = new TagInfo("c:get", //$NON-NLS-1$
            42, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_162 = new TagInfo("c:get", //$NON-NLS-1$
            42, 162,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_44_7 = new TagInfo("c:if", //$NON-NLS-1$
            44, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'currency')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_40 = new TagInfo("c:get", //$NON-NLS-1$
            45, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_33 = new TagInfo("c:get", //$NON-NLS-1$
            46, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_177 = new TagInfo("c:get", //$NON-NLS-1$
            46, 177,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_48_7 = new TagInfo("c:if", //$NON-NLS-1$
            48, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'date')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_40 = new TagInfo("c:get", //$NON-NLS-1$
            49, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_33 = new TagInfo("c:get", //$NON-NLS-1$
            50, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_173 = new TagInfo("c:get", //$NON-NLS-1$
            50, 173,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_52_7 = new TagInfo("c:if", //$NON-NLS-1$
            52, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'boolean')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_40 = new TagInfo("c:get", //$NON-NLS-1$
            53, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_37 = new TagInfo("c:get", //$NON-NLS-1$
            54, 37,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_56_7 = new TagInfo("c:if", //$NON-NLS-1$
            56, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_57_8 = new TagInfo("c:setVariable", //$NON-NLS-1$
            57, 8,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity", //$NON-NLS-1$
                "currentEntityRelationship", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_58_8 = new TagInfo("c:set", //$NON-NLS-1$
            58, 8,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$currentForm", //$NON-NLS-1$
                "currentFormType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_59_8 = new TagInfo("c:include", //$NON-NLS-1$
            59, 8,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/templateEntityRelationship.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_66_6 = new TagInfo("c:if", //$NON-NLS-1$
            66, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentForm/@post = 'true')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_77 = new TagInfo("c:get", //$NON-NLS-1$
            67, 77,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_80_7 = new TagInfo("c:iterate", //$NON-NLS-1$
            80, 7,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_81_8 = new TagInfo("c:if", //$NON-NLS-1$
            81, 8,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and ($currentFeature/@min <= 1) and ($currentFeature/@max <= 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_82_9 = new TagInfo("c:setVariable", //$NON-NLS-1$
            82, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity", //$NON-NLS-1$
                "currentEntityRelationship", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_83_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            83, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationship/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_14 = new TagInfo("c:get", //$NON-NLS-1$
            84, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationship/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_68 = new TagInfo("c:get", //$NON-NLS-1$
            84, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_87_8 = new TagInfo("c:if", //$NON-NLS-1$
            87, 8,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_88_13 = new TagInfo("c:get", //$NON-NLS-1$
            88, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_91_7 = new TagInfo("c:if", //$NON-NLS-1$
            91, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentForm/@put = 'true') or ($currentForm/@delete = 'true')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_98_7 = new TagInfo("c:iterate", //$NON-NLS-1$
            98, 7,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_99_8 = new TagInfo("c:if", //$NON-NLS-1$
            99, 8,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'int') or ($currentFeature/DataType/@name = 'float') or ($currentFeature/DataType/@name = 'currency')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_100_15 = new TagInfo("c:get", //$NON-NLS-1$
            100, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_107_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            107, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_108_10 = new TagInfo("c:if", //$NON-NLS-1$
            108, 10,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and ($currentFeature/@min <= 1) and ($currentFeature/@max <= 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_109_11 = new TagInfo("c:setVariable", //$NON-NLS-1$
            109, 11,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity", //$NON-NLS-1$
                "currentEntityRelationship", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_110_36 = new TagInfo("c:get", //$NON-NLS-1$
            110, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_110_105 = new TagInfo("c:get", //$NON-NLS-1$
            110, 105,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_110_153 = new TagInfo("c:get", //$NON-NLS-1$
            110, 153,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_110_222 = new TagInfo("c:get", //$NON-NLS-1$
            110, 222,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_110_291 = new TagInfo("c:get", //$NON-NLS-1$
            110, 291,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_111_11 = new TagInfo("c:iterate", //$NON-NLS-1$
            111, 11,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationship/Feature", //$NON-NLS-1$
                "currentEntityRelationshipFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_112_36 = new TagInfo("c:get", //$NON-NLS-1$
            112, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_112_89 = new TagInfo("c:get", //$NON-NLS-1$
            112, 89,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationshipFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_115_10 = new TagInfo("c:if", //$NON-NLS-1$
            115, 10,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_116_11 = new TagInfo("c:if", //$NON-NLS-1$
            116, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'currency')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_117_36 = new TagInfo("c:get", //$NON-NLS-1$
            117, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_118_18 = new TagInfo("c:if", //$NON-NLS-1$
            118, 18,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/DataType/@name = 'currency')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_119_36 = new TagInfo("c:get", //$NON-NLS-1$
            119, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_121_36 = new TagInfo("c:get", //$NON-NLS-1$
            121, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_121_105 = new TagInfo("c:get", //$NON-NLS-1$
            121, 105,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_121_153 = new TagInfo("c:get", //$NON-NLS-1$
            121, 153,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_121_222 = new TagInfo("c:get", //$NON-NLS-1$
            121, 222,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_121_291 = new TagInfo("c:get", //$NON-NLS-1$
            121, 291,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_123_10 = new TagInfo("c:if", //$NON-NLS-1$
            123, 10,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'int') or ($currentFeature/DataType/@name = 'float') or ($currentFeature/DataType/@name = 'currency')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_124_23 = new TagInfo("c:get", //$NON-NLS-1$
            124, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_124_82 = new TagInfo("c:get", //$NON-NLS-1$
            124, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_127_9 = new TagInfo("c:if", //$NON-NLS-1$
            127, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentForm/@put = 'true') or ($currentForm/@delete = 'true')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_129_11 = new TagInfo("c:if", //$NON-NLS-1$
            129, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentForm/@put = 'true')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_130_105 = new TagInfo("c:get", //$NON-NLS-1$
            130, 105,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_134_11 = new TagInfo("c:if", //$NON-NLS-1$
            134, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentForm/@delete = 'true')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_135_105 = new TagInfo("c:get", //$NON-NLS-1$
            135, 105,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_135_176 = new TagInfo("c:get", //$NON-NLS-1$
            135, 176,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentPage/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_147_7 = new TagInfo("c:iterate", //$NON-NLS-1$
            147, 7,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_148_12 = new TagInfo("c:if", //$NON-NLS-1$
            148, 12,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'int') or ($currentFeature/DataType/@name = 'float') or ($currentFeature/DataType/@name = 'currency')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_149_48 = new TagInfo("c:get", //$NON-NLS-1$
            149, 48,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_157_2 = new TagInfo("c:if", //$NON-NLS-1$
            157, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentForm/@post = 'true')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_158_18 = new TagInfo("c:get", //$NON-NLS-1$
            158, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_39 = new TagInfo("c:get", //$NON-NLS-1$
            159, 39,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_164_55 = new TagInfo("c:get", //$NON-NLS-1$
            164, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_167_52 = new TagInfo("c:get", //$NON-NLS-1$
            167, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentPage/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_169_8 = new TagInfo("c:iterate", //$NON-NLS-1$
            169, 8,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_172_11 = new TagInfo("c:if", //$NON-NLS-1$
            172, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'string') or ($currentFeature/DataType/@name = 'int') or ($currentFeature/DataType/@name = 'float') or ($currentFeature/DataType/@name = 'time')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_173_44 = new TagInfo("c:get", //$NON-NLS-1$
            173, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_174_37 = new TagInfo("c:get", //$NON-NLS-1$
            174, 37,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_174_83 = new TagInfo("c:get", //$NON-NLS-1$
            174, 83,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_174_192 = new TagInfo("c:if", //$NON-NLS-1$
            174, 192,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@required != ''", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_176_11 = new TagInfo("c:if", //$NON-NLS-1$
            176, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'currency')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_177_44 = new TagInfo("c:get", //$NON-NLS-1$
            177, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_178_37 = new TagInfo("c:get", //$NON-NLS-1$
            178, 37,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_178_83 = new TagInfo("c:get", //$NON-NLS-1$
            178, 83,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_180_11 = new TagInfo("c:if", //$NON-NLS-1$
            180, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'date')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_181_44 = new TagInfo("c:get", //$NON-NLS-1$
            181, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_182_37 = new TagInfo("c:get", //$NON-NLS-1$
            182, 37,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_182_83 = new TagInfo("c:get", //$NON-NLS-1$
            182, 83,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_184_11 = new TagInfo("c:if", //$NON-NLS-1$
            184, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'boolean')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_185_44 = new TagInfo("c:get", //$NON-NLS-1$
            185, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_186_41 = new TagInfo("c:get", //$NON-NLS-1$
            186, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_186_87 = new TagInfo("c:get", //$NON-NLS-1$
            186, 87,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_188_11 = new TagInfo("c:if", //$NON-NLS-1$
            188, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_189_12 = new TagInfo("c:setVariable", //$NON-NLS-1$
            189, 12,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity", //$NON-NLS-1$
                "currentEntityRelationship", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_190_12 = new TagInfo("c:set", //$NON-NLS-1$
            190, 12,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$currentForm", //$NON-NLS-1$
                "currentFormType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_191_12 = new TagInfo("c:include", //$NON-NLS-1$
            191, 12,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/templateEntityRelationship.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(60);
        out.setTag("iterate",0,60);
        RuntimeTagElement _jettag_c_iterate_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_1_1.setRuntimeParent(null);
        _jettag_c_iterate_1_1.setTagInfo(_td_c_iterate_1_1);
        _jettag_c_iterate_1_1.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_1_1.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_1_1.getTagInfo().getAttribute("delimiter"),0,60);
            out.loopIterate();
            out.write(NL);         
            out.write("\t<?php");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tinclude_once \"class/");  //$NON-NLS-1$        
            out.setTag("get",90,134);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(44);
            RuntimeTagElement _jettag_c_get_3_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_23); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_3_23.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_3_23.setTagInfo(_td_c_get_3_23);
            _jettag_c_get_3_23.doStart(context, out);
            _jettag_c_get_3_23.doEnd();
            out.setTag(null,-1,-1);
            out.write(".class.php\";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tinclude_once \"class/");  //$NON-NLS-1$        
            out.setTag("get",169,213);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(44);
            RuntimeTagElement _jettag_c_get_4_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_23); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_4_23.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_4_23.setTagInfo(_td_c_get_4_23);
            _jettag_c_get_4_23.doStart(context, out);
            _jettag_c_get_4_23.doEnd();
            out.setTag(null,-1,-1);
            out.write("DB.class.php\";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("\t\t$");  //$NON-NLS-1$        
            out.setTag("get",232,276);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(44);
            RuntimeTagElement _jettag_c_get_6_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_6_4.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_6_4.setTagInfo(_td_c_get_6_4);
            _jettag_c_get_6_4.doStart(context, out);
            _jettag_c_get_6_4.doEnd();
            out.setTag(null,-1,-1);
            out.write(" = new ");  //$NON-NLS-1$        
            out.setTag("get",283,327);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(44);
            RuntimeTagElement _jettag_c_get_6_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_55); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_6_55.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_6_55.setTagInfo(_td_c_get_6_55);
            _jettag_c_get_6_55.doStart(context, out);
            _jettag_c_get_6_55.doEnd();
            out.setTag(null,-1,-1);
            out.write("();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(64);
            out.setTag("iterate",333,397);
            RuntimeTagElement _jettag_c_iterate_8_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_8_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_8_2.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_iterate_8_2.setTagInfo(_td_c_iterate_8_2);
            _jettag_c_iterate_8_2.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_8_2.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_8_2.getTagInfo().getAttribute("delimiter"),333,397);
                out.loopIterate();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(61);
                out.setTag("if",400,461);
                RuntimeTagElement _jettag_c_if_9_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_9_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_9_3.setRuntimeParent(_jettag_c_iterate_8_2);
                _jettag_c_if_9_3.setTagInfo(_td_c_if_9_3);
                _jettag_c_if_9_3.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_9_3.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t$");  //$NON-NLS-1$        
                    out.setTag("get",466,506);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_10_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_10_5.setRuntimeParent(_jettag_c_if_9_3);
                    _jettag_c_get_10_5.setTagInfo(_td_c_get_10_5);
                    _jettag_c_get_10_5.doStart(context, out);
                    _jettag_c_get_10_5.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" = array();");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\tif (isSet($_GET['txt");  //$NON-NLS-1$        
                    out.setTag("get",541,599);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_11_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_24); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_11_24.setRuntimeParent(_jettag_c_if_9_3);
                    _jettag_c_get_11_24.setTagInfo(_td_c_get_11_24);
                    _jettag_c_get_11_24.doStart(context, out);
                    _jettag_c_get_11_24.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("'])) {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t$json = json_decode($_GET['txt");  //$NON-NLS-1$        
                    out.setTag("get",640,698);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(58);
                    RuntimeTagElement _jettag_c_get_12_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_35); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_12_35.setRuntimeParent(_jettag_c_if_9_3);
                    _jettag_c_get_12_35.setTagInfo(_td_c_get_12_35);
                    _jettag_c_get_12_35.doStart(context, out);
                    _jettag_c_get_12_35.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("'], true);");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\tif (is_array($json)) {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\tforeach ($json as $entity) {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t$");  //$NON-NLS-1$        
                    out.setTag("get",777,840);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(63);
                    RuntimeTagElement _jettag_c_get_15_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_15_8.setRuntimeParent(_jettag_c_if_9_3);
                    _jettag_c_get_15_8.setTagInfo(_td_c_get_15_8);
                    _jettag_c_get_15_8.doStart(context, out);
                    _jettag_c_get_15_8.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" = new ");  //$NON-NLS-1$        
                    out.setTag("get",847,910);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(63);
                    RuntimeTagElement _jettag_c_get_15_78 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_78); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_15_78.setRuntimeParent(_jettag_c_if_9_3);
                    _jettag_c_get_15_78.setTagInfo(_td_c_get_15_78);
                    _jettag_c_get_15_78.doStart(context, out);
                    _jettag_c_get_15_78.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("();");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t$");  //$NON-NLS-1$        
                    out.setTag("get",921,984);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(63);
                    RuntimeTagElement _jettag_c_get_16_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_16_8.setRuntimeParent(_jettag_c_if_9_3);
                    _jettag_c_get_16_8.setTagInfo(_td_c_get_16_8);
                    _jettag_c_get_16_8.doStart(context, out);
                    _jettag_c_get_16_8.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->setId($entity[\"id\"]);");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t$");  //$NON-NLS-1$        
                    out.setTag("get",1015,1054);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(39);
                    RuntimeTagElement _jettag_c_get_17_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_17_8.setRuntimeParent(_jettag_c_if_9_3);
                    _jettag_c_get_17_8.setTagInfo(_td_c_get_17_8);
                    _jettag_c_get_17_8.doStart(context, out);
                    _jettag_c_get_17_8.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->add");  //$NON-NLS-1$        
                    out.setTag("get",1059,1105);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_17_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_52); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_17_52.setRuntimeParent(_jettag_c_if_9_3);
                    _jettag_c_get_17_52.setTagInfo(_td_c_get_17_52);
                    _jettag_c_get_17_52.doStart(context, out);
                    _jettag_c_get_17_52.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("($");  //$NON-NLS-1$        
                    out.setTag("get",1107,1170);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(63);
                    RuntimeTagElement _jettag_c_get_17_100 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_100); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_17_100.setRuntimeParent(_jettag_c_if_9_3);
                    _jettag_c_get_17_100.setTagInfo(_td_c_get_17_100);
                    _jettag_c_get_17_100.doStart(context, out);
                    _jettag_c_get_17_100.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(");");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_9_3.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_9_3.doEnd();
                out.endTag("if",732);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(64);
                out.setTag("if",1203,1267);
                RuntimeTagElement _jettag_c_if_22_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_22_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_22_3.setRuntimeParent(_jettag_c_iterate_8_2);
                _jettag_c_if_22_3.setTagInfo(_td_c_if_22_3);
                _jettag_c_if_22_3.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_22_3.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t$");  //$NON-NLS-1$        
                    out.setTag("get",1272,1312);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_23_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_23_5.setRuntimeParent(_jettag_c_if_22_3);
                    _jettag_c_get_23_5.setTagInfo(_td_c_get_23_5);
                    _jettag_c_get_23_5.doStart(context, out);
                    _jettag_c_get_23_5.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" = \"\";");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\tif (isSet($_GET['");  //$NON-NLS-1$        
                    out.setTag("get",1339,1379);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_24_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_21); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_24_21.setRuntimeParent(_jettag_c_if_22_3);
                    _jettag_c_get_24_21.setTagInfo(_td_c_get_24_21);
                    _jettag_c_get_24_21.doStart(context, out);
                    _jettag_c_get_24_21.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("'])) {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t$");  //$NON-NLS-1$        
                    out.setTag("get",1391,1431);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_25_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_6); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_25_6.setRuntimeParent(_jettag_c_if_22_3);
                    _jettag_c_get_25_6.setTagInfo(_td_c_get_25_6);
                    _jettag_c_get_25_6.doStart(context, out);
                    _jettag_c_get_25_6.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" = $_GET[\"");  //$NON-NLS-1$        
                    out.setTag("get",1441,1481);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_25_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_56); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_25_56.setRuntimeParent(_jettag_c_if_22_3);
                    _jettag_c_get_25_56.setTagInfo(_td_c_get_25_56);
                    _jettag_c_get_25_56.doStart(context, out);
                    _jettag_c_get_25_56.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\"];");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t$");  //$NON-NLS-1$        
                    out.setTag("get",1490,1529);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(39);
                    RuntimeTagElement _jettag_c_get_26_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_6); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_26_6.setRuntimeParent(_jettag_c_if_22_3);
                    _jettag_c_get_26_6.setTagInfo(_td_c_get_26_6);
                    _jettag_c_get_26_6.doStart(context, out);
                    _jettag_c_get_26_6.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->set");  //$NON-NLS-1$        
                    out.setTag("get",1534,1580);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_26_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_50); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_26_50.setRuntimeParent(_jettag_c_if_22_3);
                    _jettag_c_get_26_50.setTagInfo(_td_c_get_26_50);
                    _jettag_c_get_26_50.doStart(context, out);
                    _jettag_c_get_26_50.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("($");  //$NON-NLS-1$        
                    out.setTag("get",1582,1622);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_26_98 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_98); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_26_98.setRuntimeParent(_jettag_c_if_22_3);
                    _jettag_c_get_26_98.setTagInfo(_td_c_get_26_98);
                    _jettag_c_get_26_98.doStart(context, out);
                    _jettag_c_get_26_98.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(");");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_22_3.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_22_3.doEnd();
                out.endTag("if",365);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_iterate_8_2.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_8_2.doEnd();
            out.loopEnd();
            out.endTag("iterate",1244);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
            out.write(NL);         
            out.write("\t\t$");  //$NON-NLS-1$        
            out.setTag("get",1658,1702);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(44);
            RuntimeTagElement _jettag_c_get_31_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_31_4.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_31_4.setTagInfo(_td_c_get_31_4);
            _jettag_c_get_31_4.doStart(context, out);
            _jettag_c_get_31_4.doEnd();
            out.setTag(null,-1,-1);
            out.write("DB = new ");  //$NON-NLS-1$        
            out.setTag("get",1711,1755);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(44);
            RuntimeTagElement _jettag_c_get_31_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_57); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_31_57.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_31_57.setTagInfo(_td_c_get_31_57);
            _jettag_c_get_31_57.doStart(context, out);
            _jettag_c_get_31_57.doEnd();
            out.setTag(null,-1,-1);
            out.write("DB();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t$rows = $");  //$NON-NLS-1$        
            out.setTag("get",1772,1816);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(44);
            RuntimeTagElement _jettag_c_get_32_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_32_12.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_32_12.setTagInfo(_td_c_get_32_12);
            _jettag_c_get_32_12.doStart(context, out);
            _jettag_c_get_32_12.doEnd();
            out.setTag(null,-1,-1);
            out.write("DB->get($");  //$NON-NLS-1$        
            out.setTag("get",1825,1869);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(44);
            RuntimeTagElement _jettag_c_get_32_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_65); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_32_65.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_32_65.setTagInfo(_td_c_get_32_65);
            _jettag_c_get_32_65.doStart(context, out);
            _jettag_c_get_32_65.doEnd();
            out.setTag(null,-1,-1);
            out.write(");");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t?>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<div class=\"panel panel-default\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<div class=\"panel-heading\">Filtro</div>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<div class=\"panel-body\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<form class=\"bs-example bs-example-form\" data-example-id=\"simple-input-groups\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(64);
            out.setTag("iterate",2067,2131);
            RuntimeTagElement _jettag_c_iterate_38_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_38_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_38_5.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_iterate_38_5.setTagInfo(_td_c_iterate_38_5);
            _jettag_c_iterate_38_5.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_38_5.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_38_5.getTagInfo().getAttribute("delimiter"),2067,2131);
                out.loopIterate();
                out.write(NL);         
                out.write("\t\t\t\t\t<div class=\"input-group\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(192);
                out.setTag("if",2169,2361);
                RuntimeTagElement _jettag_c_if_40_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_40_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_40_7.setRuntimeParent(_jettag_c_iterate_38_5);
                _jettag_c_if_40_7.setTagInfo(_td_c_if_40_7);
                _jettag_c_if_40_7.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_40_7.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t<span class=\"input-group-addon\">");  //$NON-NLS-1$        
                    out.setTag("get",2401,2441);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_41_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_40); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_41_40.setRuntimeParent(_jettag_c_if_40_7);
                    _jettag_c_get_41_40.setTagInfo(_td_c_get_41_40);
                    _jettag_c_get_41_40.doStart(context, out);
                    _jettag_c_get_41_40.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("</span>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"");  //$NON-NLS-1$        
                    out.setTag("get",2481,2521);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_42_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_33); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_42_33.setRuntimeParent(_jettag_c_if_40_7);
                    _jettag_c_get_42_33.setTagInfo(_td_c_get_42_33);
                    _jettag_c_get_42_33.doStart(context, out);
                    _jettag_c_get_42_33.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\" class=\"form-control\" placeholder=\"\" aria-describedby=\"basic-addon1\" value=\"<?php echo $");  //$NON-NLS-1$        
                    out.setTag("get",2610,2650);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_42_162 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_162); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_42_162.setRuntimeParent(_jettag_c_if_40_7);
                    _jettag_c_get_42_162.setTagInfo(_td_c_get_42_162);
                    _jettag_c_get_42_162.doStart(context, out);
                    _jettag_c_get_42_162.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("; ?>\">");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_40_7.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_40_7.doEnd();
                out.endTag("if",302);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(59);
                out.setTag("if",2677,2736);
                RuntimeTagElement _jettag_c_if_44_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_44_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_44_7.setRuntimeParent(_jettag_c_iterate_38_5);
                _jettag_c_if_44_7.setTagInfo(_td_c_if_44_7);
                _jettag_c_if_44_7.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_44_7.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t<span class=\"input-group-addon\">");  //$NON-NLS-1$        
                    out.setTag("get",2776,2816);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_45_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_40); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_45_40.setRuntimeParent(_jettag_c_if_44_7);
                    _jettag_c_get_45_40.setTagInfo(_td_c_get_45_40);
                    _jettag_c_get_45_40.doStart(context, out);
                    _jettag_c_get_45_40.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" (R$)</span>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"");  //$NON-NLS-1$        
                    out.setTag("get",2861,2901);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_46_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_33); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_46_33.setRuntimeParent(_jettag_c_if_44_7);
                    _jettag_c_get_46_33.setTagInfo(_td_c_get_46_33);
                    _jettag_c_get_46_33.doStart(context, out);
                    _jettag_c_get_46_33.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\" class=\"form-control currency_field\" placeholder=\"\" aria-describedby=\"basic-addon1\" value=\"<?php echo $");  //$NON-NLS-1$        
                    out.setTag("get",3005,3045);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_46_177 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_177); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_46_177.setRuntimeParent(_jettag_c_if_44_7);
                    _jettag_c_get_46_177.setTagInfo(_td_c_get_46_177);
                    _jettag_c_get_46_177.doStart(context, out);
                    _jettag_c_get_46_177.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("; ?>\">");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_44_7.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_44_7.doEnd();
                out.endTag("if",322);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(55);
                out.setTag("if",3072,3127);
                RuntimeTagElement _jettag_c_if_48_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_48_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_48_7.setRuntimeParent(_jettag_c_iterate_38_5);
                _jettag_c_if_48_7.setTagInfo(_td_c_if_48_7);
                _jettag_c_if_48_7.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_48_7.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t<span class=\"input-group-addon\">");  //$NON-NLS-1$        
                    out.setTag("get",3167,3207);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_49_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_40); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_49_40.setRuntimeParent(_jettag_c_if_48_7);
                    _jettag_c_get_49_40.setTagInfo(_td_c_get_49_40);
                    _jettag_c_get_49_40.doStart(context, out);
                    _jettag_c_get_49_40.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("</span>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"");  //$NON-NLS-1$        
                    out.setTag("get",3247,3287);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_50_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_33); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_50_33.setRuntimeParent(_jettag_c_if_48_7);
                    _jettag_c_get_50_33.setTagInfo(_td_c_get_50_33);
                    _jettag_c_get_50_33.doStart(context, out);
                    _jettag_c_get_50_33.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\" class=\"form-control datepicker\" placeholder=\"\" aria-describedby=\"basic-addon1\" value=\"<?php echo $");  //$NON-NLS-1$        
                    out.setTag("get",3387,3427);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_50_173 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_173); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_50_173.setRuntimeParent(_jettag_c_if_48_7);
                    _jettag_c_get_50_173.setTagInfo(_td_c_get_50_173);
                    _jettag_c_get_50_173.doStart(context, out);
                    _jettag_c_get_50_173.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("; ?>\">");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_48_7.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_48_7.doEnd();
                out.endTag("if",313);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(58);
                out.setTag("if",3454,3512);
                RuntimeTagElement _jettag_c_if_52_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_52_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_52_7.setRuntimeParent(_jettag_c_iterate_38_5);
                _jettag_c_if_52_7.setTagInfo(_td_c_if_52_7);
                _jettag_c_if_52_7.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_52_7.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t<span class=\"input-group-addon\">");  //$NON-NLS-1$        
                    out.setTag("get",3552,3592);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_53_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_40); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_53_40.setRuntimeParent(_jettag_c_if_52_7);
                    _jettag_c_get_53_40.setTagInfo(_td_c_get_53_40);
                    _jettag_c_get_53_40.doStart(context, out);
                    _jettag_c_get_53_40.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("</span>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"");  //$NON-NLS-1$        
                    out.setTag("get",3636,3676);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_54_37 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_54_37); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_54_37.setRuntimeParent(_jettag_c_if_52_7);
                    _jettag_c_get_54_37.setTagInfo(_td_c_get_54_37);
                    _jettag_c_get_54_37.doStart(context, out);
                    _jettag_c_get_54_37.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\" class=\"form-control\" placeholder=\"\" aria-describedby=\"basic-addon1\">");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_52_7.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_52_7.doEnd();
                out.endTag("if",241);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(61);
                out.setTag("if",3767,3828);
                RuntimeTagElement _jettag_c_if_56_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_56_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_56_7.setRuntimeParent(_jettag_c_iterate_38_5);
                _jettag_c_if_56_7.setTagInfo(_td_c_if_56_7);
                _jettag_c_if_56_7.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_56_7.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.setTag("setVariable",3836,3928);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(92);
                    RuntimeTagElement _jettag_c_setVariable_57_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_57_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_57_8.setRuntimeParent(_jettag_c_if_56_7);
                    _jettag_c_setVariable_57_8.setTagInfo(_td_c_setVariable_57_8);
                    _jettag_c_setVariable_57_8.doStart(context, out);
                    _jettag_c_setVariable_57_8.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(52);
                    out.setTag("set",3936,3988);
                    RuntimeTagElement _jettag_c_set_58_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_58_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_58_8.setRuntimeParent(_jettag_c_if_56_7);
                    _jettag_c_set_58_8.setTagInfo(_td_c_set_58_8);
                    _jettag_c_set_58_8.doStart(context, out);
                    JET2Writer _jettag_c_set_58_8_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_c_set_58_8.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("formSearch");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_set_58_8.handleBodyContent(out);
                    }
                    out = _jettag_c_set_58_8_saved_out;
            out.bodyContentEnd();
                    _jettag_c_set_58_8.doEnd();
                    out.endTag("set",10);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(8);
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.setTag("include",4014,4079);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    out.includeStart();
                    RuntimeTagElement _jettag_c_include_59_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_59_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_include_59_8.setRuntimeParent(_jettag_c_if_56_7);
                    _jettag_c_include_59_8.setTagInfo(_td_c_include_59_8);
                    _jettag_c_include_59_8.doStart(context, out);
                    _jettag_c_include_59_8.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_56_7.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_56_7.doEnd();
                out.endTag("if",258);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("\t\t\t\t\t</div>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t<br>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_iterate_38_5.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_38_5.doEnd();
            out.loopEnd();
            out.endTag("iterate",1989);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
            out.write("\t\t\t\t<div class=\"btn-group btn-group\" role=\"group\" aria-label=\"...\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">Filtrar</button>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(43);
            out.setTag("if",4274,4317);
            RuntimeTagElement _jettag_c_if_66_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_66_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_66_6.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_if_66_6.setTagInfo(_td_c_if_66_6);
            _jettag_c_if_66_6.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_66_6.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-success\" onclick=\"javascript: add");  //$NON-NLS-1$        
                out.setTag("get",4394,4433);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_67_77 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_77); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_67_77.setRuntimeParent(_jettag_c_if_66_6);
                _jettag_c_get_67_77.setTagInfo(_td_c_get_67_77);
                _jettag_c_get_67_77.doStart(context, out);
                _jettag_c_get_67_77.doEnd();
                out.setTag(null,-1,-1);
                out.write("();\">Adicionar</button>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_66_6.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_66_6.doEnd();
            out.endTag("if",145);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("\t\t\t\t</div>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t</form>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</div>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</div>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("\t<div class=\"panel panel-default\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<div class=\"panel-body\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<table class=\"table table-striped\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t<thead>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t<tr>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t\t<th>#</th>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(64);
            out.setTag("iterate",4656,4720);
            RuntimeTagElement _jettag_c_iterate_80_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_80_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_80_7.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_iterate_80_7.setTagInfo(_td_c_iterate_80_7);
            _jettag_c_iterate_80_7.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_80_7.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_80_7.getTagInfo().getAttribute("delimiter"),4656,4720);
                out.loopIterate();
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(125);
                out.setTag("if",4728,4853);
                RuntimeTagElement _jettag_c_if_81_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_81_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_81_8.setRuntimeParent(_jettag_c_iterate_80_7);
                _jettag_c_if_81_8.setTagInfo(_td_c_if_81_8);
                _jettag_c_if_81_8.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_81_8.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.setTag("setVariable",4862,4954);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(92);
                    RuntimeTagElement _jettag_c_setVariable_82_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_82_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_82_9.setRuntimeParent(_jettag_c_if_81_8);
                    _jettag_c_setVariable_82_9.setTagInfo(_td_c_setVariable_82_9);
                    _jettag_c_setVariable_82_9.doStart(context, out);
                    _jettag_c_setVariable_82_9.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(94);
                    out.setTag("iterate",4963,5057);
                    RuntimeTagElement _jettag_c_iterate_83_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_83_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_83_9.setRuntimeParent(_jettag_c_if_81_8);
                    _jettag_c_iterate_83_9.setTagInfo(_td_c_iterate_83_9);
                    _jettag_c_iterate_83_9.doStart(context, out);
                    out.loopStart();
                    out.setTag(null,-1,-1);
                    while (_jettag_c_iterate_83_9.okToProcessBody()) {
            out.bodyContentEnd();
            out.handleDelimiter(_jettag_c_iterate_83_9.getTagInfo().getAttribute("delimiter"),4963,5057);
                        out.loopIterate();
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t\t\t<th>");  //$NON-NLS-1$        
                        out.setTag("get",5071,5122);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(51);
                        RuntimeTagElement _jettag_c_get_84_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_14); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_84_14.setRuntimeParent(_jettag_c_iterate_83_9);
                        _jettag_c_get_84_14.setTagInfo(_td_c_get_84_14);
                        _jettag_c_get_84_14.doStart(context, out);
                        _jettag_c_get_84_14.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(" - ");  //$NON-NLS-1$        
                        out.setTag("get",5125,5183);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(58);
                        RuntimeTagElement _jettag_c_get_84_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_68); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_84_68.setRuntimeParent(_jettag_c_iterate_83_9);
                        _jettag_c_get_84_68.setTagInfo(_td_c_get_84_68);
                        _jettag_c_get_84_68.doStart(context, out);
                        _jettag_c_get_84_68.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("</th>");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_iterate_83_9.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_iterate_83_9.doEnd();
                    out.loopEnd();
                    out.endTag("iterate",140);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(12);
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_81_8.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_81_8.doEnd();
                out.endTag("if",364);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(64);
                out.setTag("if",5232,5296);
                RuntimeTagElement _jettag_c_if_87_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_87_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_87_8.setRuntimeParent(_jettag_c_iterate_80_7);
                _jettag_c_if_87_8.setTagInfo(_td_c_if_87_8);
                _jettag_c_if_87_8.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_87_8.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t<th>");  //$NON-NLS-1$        
                    out.setTag("get",5309,5349);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_88_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_88_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_88_13.setRuntimeParent(_jettag_c_if_87_8);
                    _jettag_c_get_88_13.setTagInfo(_td_c_get_88_13);
                    _jettag_c_get_88_13.doStart(context, out);
                    _jettag_c_get_88_13.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("</th>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_87_8.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_87_8.doEnd();
                out.endTag("if",66);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_iterate_80_7.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_80_7.doEnd();
            out.loopEnd();
            out.endTag("iterate",656);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
            out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(77);
            out.setTag("if",5395,5472);
            RuntimeTagElement _jettag_c_if_91_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_91_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_91_7.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_if_91_7.setTagInfo(_td_c_if_91_7);
            _jettag_c_if_91_7.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_91_7.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t<th width=\"100px\">&nbsp;</th>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_91_7.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_91_7.doEnd();
            out.endTag("if",44);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("\t\t\t\t\t</tr>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t</thead>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t<tbody>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t<?php");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(64);
            out.setTag("iterate",5577,5641);
            RuntimeTagElement _jettag_c_iterate_98_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_98_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_98_7.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_iterate_98_7.setTagInfo(_td_c_iterate_98_7);
            _jettag_c_iterate_98_7.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_98_7.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_98_7.getTagInfo().getAttribute("delimiter"),5577,5641);
                out.loopIterate();
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(149);
                out.setTag("if",5649,5798);
                RuntimeTagElement _jettag_c_if_99_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_99_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_99_8.setRuntimeParent(_jettag_c_iterate_98_7);
                _jettag_c_if_99_8.setTagInfo(_td_c_if_99_8);
                _jettag_c_if_99_8.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_99_8.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t$total");  //$NON-NLS-1$        
                    out.setTag("get",5813,5859);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_100_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_100_15); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_100_15.setRuntimeParent(_jettag_c_if_99_8);
                    _jettag_c_get_100_15.setTagInfo(_td_c_get_100_15);
                    _jettag_c_get_100_15.doStart(context, out);
                    _jettag_c_get_100_15.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" = 0; ");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_99_8.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_99_8.doEnd();
                out.endTag("if",75);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_iterate_98_7.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_98_7.doEnd();
            out.loopEnd();
            out.endTag("iterate",246);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
            out.write("\t\t\t\t\t\tforeach ($rows as $row) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t\t\t?>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t\t\t<tr>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t\t\t\t<td><?php echo $row->getId(); ?></td>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(64);
            out.setTag("iterate",6008,6072);
            RuntimeTagElement _jettag_c_iterate_107_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_107_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_107_9.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_iterate_107_9.setTagInfo(_td_c_iterate_107_9);
            _jettag_c_iterate_107_9.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_107_9.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_107_9.getTagInfo().getAttribute("delimiter"),6008,6072);
                out.loopIterate();
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(125);
                out.setTag("if",6082,6207);
                RuntimeTagElement _jettag_c_if_108_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_108_10); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_108_10.setRuntimeParent(_jettag_c_iterate_107_9);
                _jettag_c_if_108_10.setTagInfo(_td_c_if_108_10);
                _jettag_c_if_108_10.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_108_10.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.setTag("setVariable",6218,6310);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(92);
                    RuntimeTagElement _jettag_c_setVariable_109_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_109_11); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_109_11.setRuntimeParent(_jettag_c_if_108_10);
                    _jettag_c_setVariable_109_11.setTagInfo(_td_c_setVariable_109_11);
                    _jettag_c_setVariable_109_11.doStart(context, out);
                    _jettag_c_setVariable_109_11.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"");  //$NON-NLS-1$        
                    out.setTag("get",6346,6385);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(39);
                    RuntimeTagElement _jettag_c_get_110_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_110_36); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_110_36.setRuntimeParent(_jettag_c_if_108_10);
                    _jettag_c_get_110_36.setTagInfo(_td_c_get_110_36);
                    _jettag_c_get_110_36.doStart(context, out);
                    _jettag_c_get_110_36.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_<?php echo $row->getId(); ?>_");  //$NON-NLS-1$        
                    out.setTag("get",6415,6455);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_110_105 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_110_105); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_110_105.setRuntimeParent(_jettag_c_if_108_10);
                    _jettag_c_get_110_105.setTagInfo(_td_c_get_110_105);
                    _jettag_c_get_110_105.doStart(context, out);
                    _jettag_c_get_110_105.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\" name=\"");  //$NON-NLS-1$        
                    out.setTag("get",6463,6502);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(39);
                    RuntimeTagElement _jettag_c_get_110_153 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_110_153); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_110_153.setRuntimeParent(_jettag_c_if_108_10);
                    _jettag_c_get_110_153.setTagInfo(_td_c_get_110_153);
                    _jettag_c_get_110_153.doStart(context, out);
                    _jettag_c_get_110_153.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_<?php echo $row->getId(); ?>_");  //$NON-NLS-1$        
                    out.setTag("get",6532,6572);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_110_222 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_110_222); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_110_222.setRuntimeParent(_jettag_c_if_108_10);
                    _jettag_c_get_110_222.setTagInfo(_td_c_get_110_222);
                    _jettag_c_get_110_222.doStart(context, out);
                    _jettag_c_get_110_222.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\" value=\"<?php echo $row->get");  //$NON-NLS-1$        
                    out.setTag("get",6601,6647);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_110_291 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_110_291); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_110_291.setRuntimeParent(_jettag_c_if_108_10);
                    _jettag_c_get_110_291.setTagInfo(_td_c_get_110_291);
                    _jettag_c_get_110_291.doStart(context, out);
                    _jettag_c_get_110_291.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("()->getId(); ?>\">");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(94);
                    out.setTag("iterate",6675,6769);
                    RuntimeTagElement _jettag_c_iterate_111_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_111_11); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_111_11.setRuntimeParent(_jettag_c_if_108_10);
                    _jettag_c_iterate_111_11.setTagInfo(_td_c_iterate_111_11);
                    _jettag_c_iterate_111_11.doStart(context, out);
                    out.loopStart();
                    out.setTag(null,-1,-1);
                    while (_jettag_c_iterate_111_11.okToProcessBody()) {
            out.bodyContentEnd();
            out.handleDelimiter(_jettag_c_iterate_111_11.getTagInfo().getAttribute("delimiter"),6675,6769);
                        out.loopIterate();
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t\t\t\t\t<td><?php echo $row->get");  //$NON-NLS-1$        
                        out.setTag("get",6805,6851);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(46);
                        RuntimeTagElement _jettag_c_get_112_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_112_36); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_112_36.setRuntimeParent(_jettag_c_iterate_111_11);
                        _jettag_c_get_112_36.setTagInfo(_td_c_get_112_36);
                        _jettag_c_get_112_36.doStart(context, out);
                        _jettag_c_get_112_36.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("()->get");  //$NON-NLS-1$        
                        out.setTag("get",6858,6922);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(64);
                        RuntimeTagElement _jettag_c_get_112_89 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_112_89); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_112_89.setRuntimeParent(_jettag_c_iterate_111_11);
                        _jettag_c_get_112_89.setTagInfo(_td_c_get_112_89);
                        _jettag_c_get_112_89.doStart(context, out);
                        _jettag_c_get_112_89.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("(); ?></td>");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_iterate_111_11.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_iterate_111_11.doEnd();
                    out.loopEnd();
                    out.endTag("iterate",175);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(12);
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_108_10.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_108_10.doEnd();
                out.endTag("if",759);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(64);
                out.setTag("if",6983,7047);
                RuntimeTagElement _jettag_c_if_115_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_115_10); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_115_10.setRuntimeParent(_jettag_c_iterate_107_9);
                _jettag_c_if_115_10.setTagInfo(_td_c_if_115_10);
                _jettag_c_if_115_10.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_115_10.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(70);
                    out.setTag("if",7058,7128);
                    RuntimeTagElement _jettag_c_if_116_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_116_11); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_116_11.setRuntimeParent(_jettag_c_if_115_10);
                    _jettag_c_if_116_11.setTagInfo(_td_c_if_116_11);
                    _jettag_c_if_116_11.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_c_if_116_11.okToProcessBody()) {
                        out.write("<td><?php echo $row->get");  //$NON-NLS-1$        
                        out.setTag("get",7152,7198);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(46);
                        RuntimeTagElement _jettag_c_get_117_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_117_36); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_117_36.setRuntimeParent(_jettag_c_if_116_11);
                        _jettag_c_get_117_36.setTagInfo(_td_c_get_117_36);
                        _jettag_c_get_117_36.doStart(context, out);
                        _jettag_c_get_117_36.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("Formated(); ?></td>");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_if_116_11.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_if_116_11.doEnd();
                    out.endTag("if",100);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(73);
                    out.setTag("if",7235,7308);
                    RuntimeTagElement _jettag_c_if_118_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_118_18); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_118_18.setRuntimeParent(_jettag_c_if_115_10);
                    _jettag_c_if_118_18.setTagInfo(_td_c_if_118_18);
                    _jettag_c_if_118_18.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_c_if_118_18.okToProcessBody()) {
                        out.write("<td><?php echo $row->get");  //$NON-NLS-1$        
                        out.setTag("get",7332,7378);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(46);
                        RuntimeTagElement _jettag_c_get_119_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_119_36); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_119_36.setRuntimeParent(_jettag_c_if_118_18);
                        _jettag_c_get_119_36.setTagInfo(_td_c_get_119_36);
                        _jettag_c_get_119_36.doStart(context, out);
                        _jettag_c_get_119_36.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("(); ?></td>");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_if_118_18.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_if_118_18.doEnd();
                    out.endTag("if",92);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"");  //$NON-NLS-1$        
                    out.setTag("get",7443,7482);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(39);
                    RuntimeTagElement _jettag_c_get_121_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_121_36); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_121_36.setRuntimeParent(_jettag_c_if_115_10);
                    _jettag_c_get_121_36.setTagInfo(_td_c_get_121_36);
                    _jettag_c_get_121_36.doStart(context, out);
                    _jettag_c_get_121_36.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_<?php echo $row->getId(); ?>_");  //$NON-NLS-1$        
                    out.setTag("get",7512,7552);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_121_105 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_121_105); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_121_105.setRuntimeParent(_jettag_c_if_115_10);
                    _jettag_c_get_121_105.setTagInfo(_td_c_get_121_105);
                    _jettag_c_get_121_105.doStart(context, out);
                    _jettag_c_get_121_105.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\" name=\"");  //$NON-NLS-1$        
                    out.setTag("get",7560,7599);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(39);
                    RuntimeTagElement _jettag_c_get_121_153 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_121_153); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_121_153.setRuntimeParent(_jettag_c_if_115_10);
                    _jettag_c_get_121_153.setTagInfo(_td_c_get_121_153);
                    _jettag_c_get_121_153.doStart(context, out);
                    _jettag_c_get_121_153.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("_<?php echo $row->getId(); ?>_");  //$NON-NLS-1$        
                    out.setTag("get",7629,7669);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_121_222 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_121_222); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_121_222.setRuntimeParent(_jettag_c_if_115_10);
                    _jettag_c_get_121_222.setTagInfo(_td_c_get_121_222);
                    _jettag_c_get_121_222.doStart(context, out);
                    _jettag_c_get_121_222.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\" value=\"<?php echo $row->get");  //$NON-NLS-1$        
                    out.setTag("get",7698,7744);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_121_291 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_121_291); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_121_291.setRuntimeParent(_jettag_c_if_115_10);
                    _jettag_c_get_121_291.setTagInfo(_td_c_get_121_291);
                    _jettag_c_get_121_291.doStart(context, out);
                    _jettag_c_get_121_291.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("(); ?>\">");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_115_10.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_115_10.doEnd();
                out.endTag("if",715);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(149);
                out.setTag("if",7779,7928);
                RuntimeTagElement _jettag_c_if_123_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_123_10); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_123_10.setRuntimeParent(_jettag_c_iterate_107_9);
                _jettag_c_if_123_10.setTagInfo(_td_c_if_123_10);
                _jettag_c_if_123_10.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_123_10.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t<?php $total");  //$NON-NLS-1$        
                    out.setTag("get",7951,7997);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_124_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_124_23); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_124_23.setRuntimeParent(_jettag_c_if_123_10);
                    _jettag_c_get_124_23.setTagInfo(_td_c_get_124_23);
                    _jettag_c_get_124_23.doStart(context, out);
                    _jettag_c_get_124_23.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(" += $row->get");  //$NON-NLS-1$        
                    out.setTag("get",8010,8056);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_124_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_124_82); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_124_82.setRuntimeParent(_jettag_c_if_123_10);
                    _jettag_c_get_124_82.setTagInfo(_td_c_get_124_82);
                    _jettag_c_get_124_82.doStart(context, out);
                    _jettag_c_get_124_82.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("(); ?> ");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_123_10.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_123_10.doEnd();
                out.endTag("if",145);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_iterate_107_9.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_107_9.doEnd();
            out.loopEnd();
            out.endTag("iterate",2017);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
            out.write("\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(77);
            out.setTag("if",8110,8187);
            RuntimeTagElement _jettag_c_if_127_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_127_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_127_9.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_if_127_9.setTagInfo(_td_c_if_127_9);
            _jettag_c_if_127_9.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_127_9.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t\t\t<td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(42);
                out.setTag("if",8212,8254);
                RuntimeTagElement _jettag_c_if_129_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_129_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_129_11.setRuntimeParent(_jettag_c_if_127_9);
                _jettag_c_if_129_11.setTagInfo(_td_c_if_129_11);
                _jettag_c_if_129_11.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_129_11.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" aria-label=\"Editar\" onclick=\"javascript: update");  //$NON-NLS-1$        
                    out.setTag("get",8359,8398);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(39);
                    RuntimeTagElement _jettag_c_get_130_105 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_130_105); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_130_105.setRuntimeParent(_jettag_c_if_129_11);
                    _jettag_c_get_130_105.setTagInfo(_td_c_get_130_105);
                    _jettag_c_get_130_105.doStart(context, out);
                    _jettag_c_get_130_105.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("(<?php echo $row->getId(); ?>);\">");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-pencil\" aria-hidden=\"true\"></span>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t</button>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_129_11.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_129_11.doEnd();
                out.endTag("if",289);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(45);
                out.setTag("if",8561,8606);
                RuntimeTagElement _jettag_c_if_134_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_134_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_134_11.setRuntimeParent(_jettag_c_if_127_9);
                _jettag_c_if_134_11.setTagInfo(_td_c_if_134_11);
                _jettag_c_if_134_11.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_134_11.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" aria-label=\"Apagar\" onclick=\"javascript: delete");  //$NON-NLS-1$        
                    out.setTag("get",8711,8750);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(39);
                    RuntimeTagElement _jettag_c_get_135_105 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_135_105); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_135_105.setRuntimeParent(_jettag_c_if_134_11);
                    _jettag_c_get_135_105.setTagInfo(_td_c_get_135_105);
                    _jettag_c_get_135_105.doStart(context, out);
                    _jettag_c_get_135_105.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("(<?php echo $row->getId(); ?>, '");  //$NON-NLS-1$        
                    out.setTag("get",8782,8819);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(37);
                    RuntimeTagElement _jettag_c_get_135_176 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_135_176); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_135_176.setRuntimeParent(_jettag_c_if_134_11);
                    _jettag_c_get_135_176.setTagInfo(_td_c_get_135_176);
                    _jettag_c_get_135_176.doStart(context, out);
                    _jettag_c_get_135_176.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("');\">");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-trash\" aria-hidden=\"true\"></span>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t</button>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_134_11.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_134_11.doEnd();
                out.endTag("if",329);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t\t\t</td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_127_9.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_127_9.doEnd();
            out.endTag("if",779);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("\t\t\t\t\t\t\t</tr>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t<?php } ?>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t</tbody>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t<tfoot>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t<tr>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t\t<td>Total <?php echo count($rows); ?></td>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(64);
            out.setTag("iterate",9093,9157);
            RuntimeTagElement _jettag_c_iterate_147_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_147_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_147_7.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_iterate_147_7.setTagInfo(_td_c_iterate_147_7);
            _jettag_c_iterate_147_7.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_147_7.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_147_7.getTagInfo().getAttribute("delimiter"),9093,9157);
                out.loopIterate();
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t<td>");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(149);
                out.setTag("if",9169,9318);
                RuntimeTagElement _jettag_c_if_148_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_148_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_148_12.setRuntimeParent(_jettag_c_iterate_147_7);
                _jettag_c_if_148_12.setTagInfo(_td_c_if_148_12);
                _jettag_c_if_148_12.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_148_12.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t<?php echo 'R$ ' . number_format($total");  //$NON-NLS-1$        
                    out.setTag("get",9366,9412);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_149_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_149_48); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_149_48.setRuntimeParent(_jettag_c_if_148_12);
                    _jettag_c_get_149_48.setTagInfo(_td_c_get_149_48);
                    _jettag_c_get_149_48.doStart(context, out);
                    _jettag_c_get_149_48.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(", 2, ',', '.'); ?>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_148_12.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_148_12.doEnd();
                out.endTag("if",120);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write("</td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_iterate_147_7.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_147_7.doEnd();
            out.loopEnd();
            out.endTag("iterate",300);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
            out.write("\t\t\t\t\t</tr>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t</tfoot>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t</table>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</div>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</div>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(43);
            out.setTag("if",9524,9567);
            RuntimeTagElement _jettag_c_if_157_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_157_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_157_2.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_if_157_2.setTagInfo(_td_c_if_157_2);
            _jettag_c_if_157_2.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_157_2.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t<form action=\"/");  //$NON-NLS-1$        
                out.setTag("get",9585,9624);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_158_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_158_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_158_18.setRuntimeParent(_jettag_c_if_157_2);
                _jettag_c_get_158_18.setTagInfo(_td_c_get_158_18);
                _jettag_c_get_158_18.doStart(context, out);
                _jettag_c_get_158_18.doEnd();
                out.setTag(null,-1,-1);
                out.write("/save.php\" method=\"post\" role=\"form\" data-toggle=\"validator\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<div class=\"modal fade\" id=\"formAdd");  //$NON-NLS-1$        
                out.setTag("get",9724,9763);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_159_39 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_39); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_159_39.setRuntimeParent(_jettag_c_if_157_2);
                _jettag_c_get_159_39.setTagInfo(_td_c_get_159_39);
                _jettag_c_get_159_39.doStart(context, out);
                _jettag_c_get_159_39.doEnd();
                out.setTag(null,-1,-1);
                out.write("\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<div class=\"modal-dialog\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t<div class=\"modal-content\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t<div class=\"modal-header\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t<h4 class=\"modal-title\" id=\"myModalLabel\">Novo ");  //$NON-NLS-1$        
                out.setTag("get",10127,10166);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_164_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_164_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_164_55.setRuntimeParent(_jettag_c_if_157_2);
                _jettag_c_get_164_55.setTagInfo(_td_c_get_164_55);
                _jettag_c_get_164_55.doStart(context, out);
                _jettag_c_get_164_55.doEnd();
                out.setTag(null,-1,-1);
                out.write("</h4>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t</div>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t<div class=\"modal-body\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"pageBack\" value=\"");  //$NON-NLS-1$        
                out.setTag("get",10267,10304);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(37);
                RuntimeTagElement _jettag_c_get_167_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_167_52); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_167_52.setRuntimeParent(_jettag_c_if_157_2);
                _jettag_c_get_167_52.setTagInfo(_td_c_get_167_52);
                _jettag_c_get_167_52.doStart(context, out);
                _jettag_c_get_167_52.doEnd();
                out.setTag(null,-1,-1);
                out.write("\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"id\" id=\"id\" value=\"\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(64);
                out.setTag("iterate",10370,10434);
                RuntimeTagElement _jettag_c_iterate_169_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_169_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_169_8.setRuntimeParent(_jettag_c_if_157_2);
                _jettag_c_iterate_169_8.setTagInfo(_td_c_iterate_169_8);
                _jettag_c_iterate_169_8.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_169_8.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_169_8.getTagInfo().getAttribute("delimiter"),10370,10434);
                    out.loopIterate();
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group\">");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(192);
                    out.setTag("if",10513,10705);
                    RuntimeTagElement _jettag_c_if_172_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_172_11); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_172_11.setRuntimeParent(_jettag_c_iterate_169_8);
                    _jettag_c_if_172_11.setTagInfo(_td_c_if_172_11);
                    _jettag_c_if_172_11.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_c_if_172_11.okToProcessBody()) {
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\">");  //$NON-NLS-1$        
                        out.setTag("get",10749,10789);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(40);
                        RuntimeTagElement _jettag_c_get_173_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_173_44); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_173_44.setRuntimeParent(_jettag_c_if_172_11);
                        _jettag_c_get_173_44.setTagInfo(_td_c_get_173_44);
                        _jettag_c_get_173_44.doStart(context, out);
                        _jettag_c_get_173_44.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("</span>");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"");  //$NON-NLS-1$        
                        out.setTag("get",10833,10873);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(40);
                        RuntimeTagElement _jettag_c_get_174_37 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_174_37); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_174_37.setRuntimeParent(_jettag_c_if_172_11);
                        _jettag_c_get_174_37.setTagInfo(_td_c_get_174_37);
                        _jettag_c_get_174_37.doStart(context, out);
                        _jettag_c_get_174_37.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("\" id=\"");  //$NON-NLS-1$        
                        out.setTag("get",10879,10919);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(40);
                        RuntimeTagElement _jettag_c_get_174_83 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_174_83); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_174_83.setRuntimeParent(_jettag_c_if_172_11);
                        _jettag_c_get_174_83.setTagInfo(_td_c_get_174_83);
                        _jettag_c_get_174_83.doStart(context, out);
                        _jettag_c_get_174_83.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("\" class=\"form-control\" placeholder=\"\" aria-describedby=\"basic-addon1\"");  //$NON-NLS-1$        
                // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
                out.jump(45);
                        out.setTag("if",10988,11033);
                        RuntimeTagElement _jettag_c_if_174_192 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_174_192); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_174_192.setRuntimeParent(_jettag_c_if_172_11);
                        _jettag_c_if_174_192.setTagInfo(_td_c_if_174_192);
                        _jettag_c_if_174_192.doStart(context, out);
                        out.setTag(null,-1,-1);
                        while (_jettag_c_if_174_192.okToProcessBody()) {
                            out.write(" required");  //$NON-NLS-1$        
                out.bodyContentStart();
                            _jettag_c_if_174_192.handleBodyContent(out);
                        }
                out.bodyContentEnd();
                        _jettag_c_if_174_192.doEnd();
                        out.endTag("if",9);
                // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
                out.jump(7);
                        out.write(">");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_if_172_11.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_if_172_11.doEnd();
                    out.endTag("if",356);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(59);
                    out.setTag("if",11079,11138);
                    RuntimeTagElement _jettag_c_if_176_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_176_11); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_176_11.setRuntimeParent(_jettag_c_iterate_169_8);
                    _jettag_c_if_176_11.setTagInfo(_td_c_if_176_11);
                    _jettag_c_if_176_11.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_c_if_176_11.okToProcessBody()) {
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\">");  //$NON-NLS-1$        
                        out.setTag("get",11182,11222);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(40);
                        RuntimeTagElement _jettag_c_get_177_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_177_44); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_177_44.setRuntimeParent(_jettag_c_if_176_11);
                        _jettag_c_get_177_44.setTagInfo(_td_c_get_177_44);
                        _jettag_c_get_177_44.doStart(context, out);
                        _jettag_c_get_177_44.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(" (R$)</span>");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"");  //$NON-NLS-1$        
                        out.setTag("get",11271,11311);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(40);
                        RuntimeTagElement _jettag_c_get_178_37 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_178_37); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_178_37.setRuntimeParent(_jettag_c_if_176_11);
                        _jettag_c_get_178_37.setTagInfo(_td_c_get_178_37);
                        _jettag_c_get_178_37.doStart(context, out);
                        _jettag_c_get_178_37.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("\" id=\"");  //$NON-NLS-1$        
                        out.setTag("get",11317,11357);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(40);
                        RuntimeTagElement _jettag_c_get_178_83 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_178_83); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_178_83.setRuntimeParent(_jettag_c_if_176_11);
                        _jettag_c_get_178_83.setTagInfo(_td_c_get_178_83);
                        _jettag_c_get_178_83.doStart(context, out);
                        _jettag_c_get_178_83.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("\" class=\"form-control currency_field\" placeholder=\"\" aria-describedby=\"basic-addon1\">");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_if_176_11.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_if_176_11.doEnd();
                    out.endTag("if",315);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(55);
                    out.setTag("if",11471,11526);
                    RuntimeTagElement _jettag_c_if_180_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_180_11); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_180_11.setRuntimeParent(_jettag_c_iterate_169_8);
                    _jettag_c_if_180_11.setTagInfo(_td_c_if_180_11);
                    _jettag_c_if_180_11.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_c_if_180_11.okToProcessBody()) {
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\">");  //$NON-NLS-1$        
                        out.setTag("get",11570,11610);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(40);
                        RuntimeTagElement _jettag_c_get_181_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_181_44); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_181_44.setRuntimeParent(_jettag_c_if_180_11);
                        _jettag_c_get_181_44.setTagInfo(_td_c_get_181_44);
                        _jettag_c_get_181_44.doStart(context, out);
                        _jettag_c_get_181_44.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("</span>");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"");  //$NON-NLS-1$        
                        out.setTag("get",11654,11694);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(40);
                        RuntimeTagElement _jettag_c_get_182_37 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_182_37); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_182_37.setRuntimeParent(_jettag_c_if_180_11);
                        _jettag_c_get_182_37.setTagInfo(_td_c_get_182_37);
                        _jettag_c_get_182_37.doStart(context, out);
                        _jettag_c_get_182_37.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("\" id=\"");  //$NON-NLS-1$        
                        out.setTag("get",11700,11740);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(40);
                        RuntimeTagElement _jettag_c_get_182_83 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_182_83); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_182_83.setRuntimeParent(_jettag_c_if_180_11);
                        _jettag_c_get_182_83.setTagInfo(_td_c_get_182_83);
                        _jettag_c_get_182_83.doStart(context, out);
                        _jettag_c_get_182_83.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("\" class=\"form-control datepicker\" placeholder=\"\" aria-describedby=\"basic-addon1\">");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_if_180_11.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_if_180_11.doEnd();
                    out.endTag("if",306);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(58);
                    out.setTag("if",11850,11908);
                    RuntimeTagElement _jettag_c_if_184_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_184_11); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_184_11.setRuntimeParent(_jettag_c_iterate_169_8);
                    _jettag_c_if_184_11.setTagInfo(_td_c_if_184_11);
                    _jettag_c_if_184_11.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_c_if_184_11.okToProcessBody()) {
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\">");  //$NON-NLS-1$        
                        out.setTag("get",11952,11992);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(40);
                        RuntimeTagElement _jettag_c_get_185_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_185_44); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_185_44.setRuntimeParent(_jettag_c_if_184_11);
                        _jettag_c_get_185_44.setTagInfo(_td_c_get_185_44);
                        _jettag_c_get_185_44.doStart(context, out);
                        _jettag_c_get_185_44.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("</span>");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"");  //$NON-NLS-1$        
                        out.setTag("get",12040,12080);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(40);
                        RuntimeTagElement _jettag_c_get_186_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_186_41); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_186_41.setRuntimeParent(_jettag_c_if_184_11);
                        _jettag_c_get_186_41.setTagInfo(_td_c_get_186_41);
                        _jettag_c_get_186_41.doStart(context, out);
                        _jettag_c_get_186_41.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("\" id=\"");  //$NON-NLS-1$        
                        out.setTag("get",12086,12126);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(40);
                        RuntimeTagElement _jettag_c_get_186_87 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_186_87); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_186_87.setRuntimeParent(_jettag_c_if_184_11);
                        _jettag_c_get_186_87.setTagInfo(_td_c_get_186_87);
                        _jettag_c_get_186_87.doStart(context, out);
                        _jettag_c_get_186_87.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("\" class=\"form-control\" placeholder=\"\" aria-describedby=\"basic-addon1\">");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_if_184_11.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_if_184_11.doEnd();
                    out.endTag("if",299);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(61);
                    out.setTag("if",12225,12286);
                    RuntimeTagElement _jettag_c_if_188_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_188_11); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_188_11.setRuntimeParent(_jettag_c_iterate_169_8);
                    _jettag_c_if_188_11.setTagInfo(_td_c_if_188_11);
                    _jettag_c_if_188_11.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_c_if_188_11.okToProcessBody()) {
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                        out.setTag("setVariable",12298,12390);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(92);
                        RuntimeTagElement _jettag_c_setVariable_189_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_189_12); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_189_12.setRuntimeParent(_jettag_c_if_188_11);
                        _jettag_c_setVariable_189_12.setTagInfo(_td_c_setVariable_189_12);
                        _jettag_c_setVariable_189_12.doStart(context, out);
                        _jettag_c_setVariable_189_12.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
                out.jump(52);
                        out.setTag("set",12402,12454);
                        RuntimeTagElement _jettag_c_set_190_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_190_12); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_set_190_12.setRuntimeParent(_jettag_c_if_188_11);
                        _jettag_c_set_190_12.setTagInfo(_td_c_set_190_12);
                        _jettag_c_set_190_12.doStart(context, out);
                        JET2Writer _jettag_c_set_190_12_saved_out = out;
                        out.setTag(null,-1,-1);
                        while (_jettag_c_set_190_12.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            out.write("formAdd");  //$NON-NLS-1$        
                out.bodyContentStart();
                            _jettag_c_set_190_12.handleBodyContent(out);
                        }
                        out = _jettag_c_set_190_12_saved_out;
                out.bodyContentEnd();
                        _jettag_c_set_190_12.doEnd();
                        out.endTag("set",7);
                // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
                out.jump(8);
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                        out.setTag("include",12481,12546);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(65);
                        out.includeStart();
                        RuntimeTagElement _jettag_c_include_191_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_191_12); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_include_191_12.setRuntimeParent(_jettag_c_if_188_11);
                        _jettag_c_include_191_12.setTagInfo(_td_c_include_191_12);
                        _jettag_c_include_191_12.doStart(context, out);
                        _jettag_c_include_191_12.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_if_188_11.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_if_188_11.doEnd();
                    out.endTag("if",271);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t</div>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t</div>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t<br>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_169_8.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_169_8.doEnd();
                out.loopEnd();
                out.endTag("iterate",2182);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t\t\t\t</div>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t<div class=\"modal-footer\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Fechar</button>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">Salvar</button>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t</div>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t</div>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t</div>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t</div>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t</form>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t<script type=\"text/javascript\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t$(function() {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    \t\t\t$('.currency_field').maskMoney({");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    \t\t\t\tprefix:'R$ ',");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    \t\t\t\tallowNegative: true,");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    \t\t\t\tthousands:'.',");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    \t\t\t\tdecimal:',',");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    \t\t\t\taffixesStay: false");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    \t\t\t});");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("  \t\t\t});");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t</script>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_157_2.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_157_2.doEnd();
            out.endTag("if",3573);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_iterate_1_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_1_1.doEnd();
        out.loopEnd();
        out.endTag("iterate",13088);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.popTemplateFile();
    }
}
