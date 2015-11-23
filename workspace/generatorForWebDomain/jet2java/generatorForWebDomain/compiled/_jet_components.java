package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_components implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_f = "org.eclipse.jet.formatTags"; //$NON-NLS-1$

    public _jet_components(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_if_3_1 = new TagInfo("c:if", //$NON-NLS-1$
            3, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$component/@componentTitle", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_29 = new TagInfo("c:get", //$NON-NLS-1$
            4, 29,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@componentTitle", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_6_2 = new TagInfo("c:if", //$NON-NLS-1$
            6, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "emf.eClass($component)/@name = 'Text'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_3 = new TagInfo("c:get", //$NON-NLS-1$
            7, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@text", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_9_2 = new TagInfo("c:if", //$NON-NLS-1$
            9, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "emf.eClass($component)/@name = 'NavList'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_10_4 = new TagInfo("c:if", //$NON-NLS-1$
            10, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$component/@location = 'top' or $component/@location = 'bottom'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_11_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            11, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$component/listItems", //$NON-NLS-1$
                "li", //$NON-NLS-1$
                "|", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_14 = new TagInfo("c:get", //$NON-NLS-1$
            12, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$li/page/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_53 = new TagInfo("c:get", //$NON-NLS-1$
            12, 53,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$li/@text", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_15_4 = new TagInfo("c:if", //$NON-NLS-1$
            15, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$component/@location != 'top' and $component/@location != 'bottom'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_16_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            16, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$component/listItems", //$NON-NLS-1$
                "li", //$NON-NLS-1$
                "<br/>", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_14 = new TagInfo("c:get", //$NON-NLS-1$
            17, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$li/page/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_53 = new TagInfo("c:get", //$NON-NLS-1$
            17, 53,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$li/@text", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_22_2 = new TagInfo("c:if", //$NON-NLS-1$
            22, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$component/self::Summary", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_3 = new TagInfo("c:get", //$NON-NLS-1$
            24, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@entity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_110 = new TagInfo("c:get", //$NON-NLS-1$
            24, 110,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@entity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_8 = new TagInfo("c:get", //$NON-NLS-1$
            25, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@entity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_51 = new TagInfo("c:get", //$NON-NLS-1$
            25, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@entity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_101 = new TagInfo("c:get", //$NON-NLS-1$
            25, 101,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@entity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_26_3 = new TagInfo("c:if", //$NON-NLS-1$
            26, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$component/@summarySize > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_7 = new TagInfo("c:get", //$NON-NLS-1$
            29, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@entity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_46 = new TagInfo("c:get", //$NON-NLS-1$
            29, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@entity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_90 = new TagInfo("c:get", //$NON-NLS-1$
            29, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@entity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_30_3 = new TagInfo("c:if", //$NON-NLS-1$
            30, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$component/@summarySize > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_18 = new TagInfo("c:get", //$NON-NLS-1$
            31, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@summarySize", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_36_3 = new TagInfo("c:if", //$NON-NLS-1$
            36, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$component/page", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_13 = new TagInfo("c:get", //$NON-NLS-1$
            37, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/page/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_74 = new TagInfo("c:get", //$NON-NLS-1$
            37, 74,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@entity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_115 = new TagInfo("c:get", //$NON-NLS-1$
            37, 115,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@entity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_170 = new TagInfo("c:get", //$NON-NLS-1$
            37, 170,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@entity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_39_3 = new TagInfo("c:set", //$NON-NLS-1$
            39, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$component", //$NON-NLS-1$
                "upperCaseTitleField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_39_57 = new TagInfo("f:uc", //$NON-NLS-1$
            39, 57,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_74 = new TagInfo("c:get", //$NON-NLS-1$
            39, 74,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@titleField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_7 = new TagInfo("c:get", //$NON-NLS-1$
            40, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@entity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_48 = new TagInfo("c:get", //$NON-NLS-1$
            40, 48,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@upperCaseTitleField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_41_3 = new TagInfo("c:if", //$NON-NLS-1$
            41, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$component/page", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_45_3 = new TagInfo("c:if", //$NON-NLS-1$
            45, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$component/@summaryField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_47_4 = new TagInfo("c:if", //$NON-NLS-1$
            47, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$component/page", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_14 = new TagInfo("c:get", //$NON-NLS-1$
            48, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/page/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_75 = new TagInfo("c:get", //$NON-NLS-1$
            48, 75,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@entity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_116 = new TagInfo("c:get", //$NON-NLS-1$
            48, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@entity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_171 = new TagInfo("c:get", //$NON-NLS-1$
            48, 171,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@entity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_50_4 = new TagInfo("c:set", //$NON-NLS-1$
            50, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$component", //$NON-NLS-1$
                "upperCaseSummaryField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_50_60 = new TagInfo("f:uc", //$NON-NLS-1$
            50, 60,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_77 = new TagInfo("c:get", //$NON-NLS-1$
            50, 77,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@summaryField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_8 = new TagInfo("c:get", //$NON-NLS-1$
            51, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@entity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_49 = new TagInfo("c:get", //$NON-NLS-1$
            51, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@upperCaseSummaryField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_52_4 = new TagInfo("c:if", //$NON-NLS-1$
            52, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$component/page", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_61_2 = new TagInfo("c:if", //$NON-NLS-1$
            61, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$component/self::EntityView", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_3 = new TagInfo("c:get", //$NON-NLS-1$
            63, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@entity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_110 = new TagInfo("c:get", //$NON-NLS-1$
            63, 110,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@entity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_3 = new TagInfo("c:get", //$NON-NLS-1$
            64, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@entity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_42 = new TagInfo("c:get", //$NON-NLS-1$
            64, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@entity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_89 = new TagInfo("c:get", //$NON-NLS-1$
            64, 89,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@entity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_65_7 = new TagInfo("c:get", //$NON-NLS-1$
            65, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@entity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_66_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            66, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$component/listEntityFields", //$NON-NLS-1$
                "lef", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_67_5 = new TagInfo("c:if", //$NON-NLS-1$
            67, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$lef/@fieldType = 'IMAGE'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_68_6 = new TagInfo("c:set", //$NON-NLS-1$
            68, 6,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$lef", //$NON-NLS-1$
                "upperCaseFieldName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_68_53 = new TagInfo("f:uc", //$NON-NLS-1$
            68, 53,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_68_70 = new TagInfo("c:get", //$NON-NLS-1$
            68, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$lef/@fieldName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_70_45 = new TagInfo("c:get", //$NON-NLS-1$
            70, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@entity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_70_82 = new TagInfo("c:get", //$NON-NLS-1$
            70, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$lef/@fieldName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_70_130 = new TagInfo("c:get", //$NON-NLS-1$
            70, 130,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@entity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_70_171 = new TagInfo("c:get", //$NON-NLS-1$
            70, 171,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$lef/@upperCaseFieldName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_45 = new TagInfo("c:get", //$NON-NLS-1$
            71, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@entity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_82 = new TagInfo("c:get", //$NON-NLS-1$
            71, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$lef/@fieldName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_119 = new TagInfo("c:get", //$NON-NLS-1$
            71, 119,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@entity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_160 = new TagInfo("c:get", //$NON-NLS-1$
            71, 160,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$lef/@upperCaseFieldName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_76_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            76, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$component/htmlContent", //$NON-NLS-1$
                "hitem", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_128_3 = new TagInfo("c:if", //$NON-NLS-1$
            128, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$featuresModel/WebDomainFeatures/@userContent = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_129_4 = new TagInfo("c:include", //$NON-NLS-1$
            129, 4,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/navigation/pages/userContent.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_132_3 = new TagInfo("c:if", //$NON-NLS-1$
            132, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$component/componentLink", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_133_40 = new TagInfo("c:get", //$NON-NLS-1$
            133, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/componentLink/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_133_95 = new TagInfo("c:get", //$NON-NLS-1$
            133, 95,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$component/@linkTitle", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_136_2 = new TagInfo("c:if", //$NON-NLS-1$
            136, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$component/self::Text", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(36);
        out.write(NL);         
        out.write("<% { %>");  //$NON-NLS-1$        
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(40);
        out.setTag("if",45,85);
        RuntimeTagElement _jettag_c_if_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_3_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_3_1.setRuntimeParent(null);
        _jettag_c_if_3_1.setTagInfo(_td_c_if_3_1);
        _jettag_c_if_3_1.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_c_if_3_1.okToProcessBody()) {
            out.write(NL);         
            out.write("<div class=\"componentTitle\">");  //$NON-NLS-1$        
            out.setTag("get",114,159);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(45);
            RuntimeTagElement _jettag_c_get_4_29 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_29); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_4_29.setRuntimeParent(_jettag_c_if_3_1);
            _jettag_c_get_4_29.setTagInfo(_td_c_get_4_29);
            _jettag_c_get_4_29.doStart(context, out);
            _jettag_c_get_4_29.doEnd();
            out.setTag(null,-1,-1);
            out.write("</div>");  //$NON-NLS-1$        
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_if_3_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_if_3_1.doEnd();
        out.endTag("if",81);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(51);
        out.setTag("if",175,226);
        RuntimeTagElement _jettag_c_if_6_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_6_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_6_2.setRuntimeParent(null);
        _jettag_c_if_6_2.setTagInfo(_td_c_if_6_2);
        _jettag_c_if_6_2.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_c_if_6_2.okToProcessBody()) {
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
            out.setTag("get",229,264);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(35);
            RuntimeTagElement _jettag_c_get_7_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_7_3.setRuntimeParent(_jettag_c_if_6_2);
            _jettag_c_get_7_3.setTagInfo(_td_c_get_7_3);
            _jettag_c_get_7_3.doStart(context, out);
            _jettag_c_get_7_3.doEnd();
            out.setTag(null,-1,-1);
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_if_6_2.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_if_6_2.doEnd();
        out.endTag("if",40);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(54);
        out.setTag("if",276,330);
        RuntimeTagElement _jettag_c_if_9_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_9_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_9_2.setRuntimeParent(null);
        _jettag_c_if_9_2.setTagInfo(_td_c_if_9_2);
        _jettag_c_if_9_2.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_c_if_9_2.okToProcessBody()) {
            out.write(NL);         
            out.write("\t\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(77);
            out.setTag("if",334,411);
            RuntimeTagElement _jettag_c_if_10_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_10_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_10_4.setRuntimeParent(_jettag_c_if_9_2);
            _jettag_c_if_10_4.setTagInfo(_td_c_if_10_4);
            _jettag_c_if_10_4.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_10_4.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(64);
                out.setTag("iterate",416,480);
                RuntimeTagElement _jettag_c_iterate_11_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_11_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_11_5.setRuntimeParent(_jettag_c_if_10_4);
                _jettag_c_iterate_11_5.setTagInfo(_td_c_iterate_11_5);
                _jettag_c_iterate_11_5.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_11_5.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_11_5.getTagInfo().getAttribute("delimiter"),416,480);
                    out.loopIterate();
                    out.write(NL);         
                    out.write("\t\t\t\t<a href=\"");  //$NON-NLS-1$        
                    out.setTag("get",494,527);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(33);
                    RuntimeTagElement _jettag_c_get_12_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_14); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_12_14.setRuntimeParent(_jettag_c_iterate_11_5);
                    _jettag_c_get_12_14.setTagInfo(_td_c_get_12_14);
                    _jettag_c_get_12_14.doStart(context, out);
                    _jettag_c_get_12_14.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".jsp\">");  //$NON-NLS-1$        
                    out.setTag("get",533,561);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(28);
                    RuntimeTagElement _jettag_c_get_12_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_53); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_12_53.setRuntimeParent(_jettag_c_iterate_11_5);
                    _jettag_c_get_12_53.setTagInfo(_td_c_get_12_53);
                    _jettag_c_get_12_53.doStart(context, out);
                    _jettag_c_get_12_53.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("</a>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_11_5.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_11_5.doEnd();
                out.loopEnd();
                out.endTag("iterate",90);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_10_4.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_10_4.doEnd();
            out.endTag("if",175);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("\t\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(80);
            out.setTag("if",597,677);
            RuntimeTagElement _jettag_c_if_15_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_15_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_15_4.setRuntimeParent(_jettag_c_if_9_2);
            _jettag_c_if_15_4.setTagInfo(_td_c_if_15_4);
            _jettag_c_if_15_4.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_15_4.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(68);
                out.setTag("iterate",682,750);
                RuntimeTagElement _jettag_c_iterate_16_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_16_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_16_5.setRuntimeParent(_jettag_c_if_15_4);
                _jettag_c_iterate_16_5.setTagInfo(_td_c_iterate_16_5);
                _jettag_c_iterate_16_5.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_16_5.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_16_5.getTagInfo().getAttribute("delimiter"),682,750);
                    out.loopIterate();
                    out.write(NL);         
                    out.write("\t\t\t\t<a href=\"");  //$NON-NLS-1$        
                    out.setTag("get",764,797);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(33);
                    RuntimeTagElement _jettag_c_get_17_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_14); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_17_14.setRuntimeParent(_jettag_c_iterate_16_5);
                    _jettag_c_get_17_14.setTagInfo(_td_c_get_17_14);
                    _jettag_c_get_17_14.doStart(context, out);
                    _jettag_c_get_17_14.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".jsp\">");  //$NON-NLS-1$        
                    out.setTag("get",803,831);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(28);
                    RuntimeTagElement _jettag_c_get_17_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_53); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_17_53.setRuntimeParent(_jettag_c_iterate_16_5);
                    _jettag_c_get_17_53.setTagInfo(_td_c_get_17_53);
                    _jettag_c_get_17_53.doStart(context, out);
                    _jettag_c_get_17_53.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("</a>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_16_5.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_16_5.doEnd();
                out.loopEnd();
                out.endTag("iterate",90);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_15_4.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_15_4.doEnd();
            out.endTag("if",179);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("\t\t<br/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_if_9_2.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_if_9_2.doEnd();
        out.endTag("if",543);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(38);
        out.setTag("if",883,921);
        RuntimeTagElement _jettag_c_if_22_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_22_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_22_2.setRuntimeParent(null);
        _jettag_c_if_22_2.setTagInfo(_td_c_if_22_2);
        _jettag_c_if_22_2.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_c_if_22_2.okToProcessBody()) {
            out.write(NL);         
            out.write("\t\t<%");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
            out.setTag("get",929,966);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(37);
            RuntimeTagElement _jettag_c_get_24_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_24_3.setRuntimeParent(_jettag_c_if_22_2);
            _jettag_c_get_24_3.setTagInfo(_td_c_get_24_3);
            _jettag_c_get_24_3.doStart(context, out);
            _jettag_c_get_24_3.doEnd();
            out.setTag(null,-1,-1);
            out.write("DAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().get");  //$NON-NLS-1$        
            out.setTag("get",1036,1073);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(37);
            RuntimeTagElement _jettag_c_get_24_110 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_110); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_24_110.setRuntimeParent(_jettag_c_if_22_2);
            _jettag_c_get_24_110.setTagInfo(_td_c_get_24_110);
            _jettag_c_get_24_110.doStart(context, out);
            _jettag_c_get_24_110.doEnd();
            out.setTag(null,-1,-1);
            out.write("DAO();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tList<");  //$NON-NLS-1$        
            out.setTag("get",1087,1124);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(37);
            RuntimeTagElement _jettag_c_get_25_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_8); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_25_8.setRuntimeParent(_jettag_c_if_22_2);
            _jettag_c_get_25_8.setTagInfo(_td_c_get_25_8);
            _jettag_c_get_25_8.doStart(context, out);
            _jettag_c_get_25_8.doEnd();
            out.setTag(null,-1,-1);
            out.write("> list");  //$NON-NLS-1$        
            out.setTag("get",1130,1167);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(37);
            RuntimeTagElement _jettag_c_get_25_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_51); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_25_51.setRuntimeParent(_jettag_c_if_22_2);
            _jettag_c_get_25_51.setTagInfo(_td_c_get_25_51);
            _jettag_c_get_25_51.doStart(context, out);
            _jettag_c_get_25_51.doEnd();
            out.setTag(null,-1,-1);
            out.write(" = dao.getAll");  //$NON-NLS-1$        
            out.setTag("get",1180,1217);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(37);
            RuntimeTagElement _jettag_c_get_25_101 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_101); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_25_101.setRuntimeParent(_jettag_c_if_22_2);
            _jettag_c_get_25_101.setTagInfo(_td_c_get_25_101);
            _jettag_c_get_25_101.doStart(context, out);
            _jettag_c_get_25_101.doEnd();
            out.setTag(null,-1,-1);
            out.write("s();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(41);
            out.setTag("if",1224,1265);
            RuntimeTagElement _jettag_c_if_26_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_26_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_26_3.setRuntimeParent(_jettag_c_if_22_2);
            _jettag_c_if_26_3.setTagInfo(_td_c_if_26_3);
            _jettag_c_if_26_3.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_26_3.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\tint count = 0;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_26_3.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_26_3.doEnd();
            out.endTag("if",21);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("\t\tfor(");  //$NON-NLS-1$        
            out.setTag("get",1300,1337);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(37);
            RuntimeTagElement _jettag_c_get_29_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_29_7.setRuntimeParent(_jettag_c_if_22_2);
            _jettag_c_get_29_7.setTagInfo(_td_c_get_29_7);
            _jettag_c_get_29_7.doStart(context, out);
            _jettag_c_get_29_7.doEnd();
            out.setTag(null,-1,-1);
            out.write(" a");  //$NON-NLS-1$        
            out.setTag("get",1339,1376);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(37);
            RuntimeTagElement _jettag_c_get_29_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_46); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_29_46.setRuntimeParent(_jettag_c_if_22_2);
            _jettag_c_get_29_46.setTagInfo(_td_c_get_29_46);
            _jettag_c_get_29_46.doStart(context, out);
            _jettag_c_get_29_46.doEnd();
            out.setTag(null,-1,-1);
            out.write(" : list");  //$NON-NLS-1$        
            out.setTag("get",1383,1420);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(37);
            RuntimeTagElement _jettag_c_get_29_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_90); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_29_90.setRuntimeParent(_jettag_c_if_22_2);
            _jettag_c_get_29_90.setTagInfo(_td_c_get_29_90);
            _jettag_c_get_29_90.doStart(context, out);
            _jettag_c_get_29_90.doEnd();
            out.setTag(null,-1,-1);
            out.write(") {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(41);
            out.setTag("if",1426,1467);
            RuntimeTagElement _jettag_c_if_30_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_30_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_30_3.setRuntimeParent(_jettag_c_if_22_2);
            _jettag_c_if_30_3.setTagInfo(_td_c_if_30_3);
            _jettag_c_if_30_3.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_30_3.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\tif(count++ >= ");  //$NON-NLS-1$        
                out.setTag("get",1485,1527);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(42);
                RuntimeTagElement _jettag_c_get_31_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_31_18.setRuntimeParent(_jettag_c_if_30_3);
                _jettag_c_get_31_18.setTagInfo(_td_c_get_31_18);
                _jettag_c_get_31_18.doStart(context, out);
                _jettag_c_get_31_18.doEnd();
                out.setTag(null,-1,-1);
                out.write(") break;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_30_3.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_30_3.doEnd();
            out.endTag("if",71);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("\t\t%>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<div class=\"summaryItem\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<span class=\"summaryTitle\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(29);
            out.setTag("if",1611,1640);
            RuntimeTagElement _jettag_c_if_36_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_36_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_36_3.setRuntimeParent(_jettag_c_if_22_2);
            _jettag_c_if_36_3.setTagInfo(_td_c_if_36_3);
            _jettag_c_if_36_3.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_36_3.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t<a href=\"");  //$NON-NLS-1$        
                out.setTag("get",1653,1693);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_37_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_37_13.setRuntimeParent(_jettag_c_if_36_3);
                _jettag_c_get_37_13.setTagInfo(_td_c_get_37_13);
                _jettag_c_get_37_13.doStart(context, out);
                _jettag_c_get_37_13.doEnd();
                out.setTag(null,-1,-1);
                out.write(".jsp?idParameter=<%=a");  //$NON-NLS-1$        
                out.setTag("get",1714,1751);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(37);
                RuntimeTagElement _jettag_c_get_37_74 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_74); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_37_74.setRuntimeParent(_jettag_c_if_36_3);
                _jettag_c_get_37_74.setTagInfo(_td_c_get_37_74);
                _jettag_c_get_37_74.doStart(context, out);
                _jettag_c_get_37_74.doEnd();
                out.setTag(null,-1,-1);
                out.write(".get");  //$NON-NLS-1$        
                out.setTag("get",1755,1792);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(37);
                RuntimeTagElement _jettag_c_get_37_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_115); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_37_115.setRuntimeParent(_jettag_c_if_36_3);
                _jettag_c_get_37_115.setTagInfo(_td_c_get_37_115);
                _jettag_c_get_37_115.doStart(context, out);
                _jettag_c_get_37_115.doEnd();
                out.setTag(null,-1,-1);
                out.write("Id()%>&entityName=");  //$NON-NLS-1$        
                out.setTag("get",1810,1847);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(37);
                RuntimeTagElement _jettag_c_get_37_170 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_170); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_37_170.setRuntimeParent(_jettag_c_if_36_3);
                _jettag_c_get_37_170.setTagInfo(_td_c_get_37_170);
                _jettag_c_get_37_170.doStart(context, out);
                _jettag_c_get_37_170.doEnd();
                out.setTag(null,-1,-1);
                out.write("\" class=\"summaryTitle\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_36_3.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_36_3.doEnd();
            out.endTag("if",233);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(54);
            out.setTag("set",1883,1937);
            RuntimeTagElement _jettag_c_set_39_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_39_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_39_3.setRuntimeParent(_jettag_c_if_22_2);
            _jettag_c_set_39_3.setTagInfo(_td_c_set_39_3);
            _jettag_c_set_39_3.doStart(context, out);
            JET2Writer _jettag_c_set_39_3_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_c_set_39_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(17);
                out.setTag("uc",1937,1954);
                RuntimeTagElement _jettag_f_uc_39_57 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_39_57); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_uc_39_57.setRuntimeParent(_jettag_c_set_39_3);
                _jettag_f_uc_39_57.setTagInfo(_td_f_uc_39_57);
                _jettag_f_uc_39_57.doStart(context, out);
                JET2Writer _jettag_f_uc_39_57_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_f_uc_39_57.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.setTag("get",1954,1995);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(41);
                    RuntimeTagElement _jettag_c_get_39_74 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_74); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_39_74.setRuntimeParent(_jettag_f_uc_39_57);
                    _jettag_c_get_39_74.setTagInfo(_td_c_get_39_74);
                    _jettag_c_get_39_74.doStart(context, out);
                    _jettag_c_get_39_74.doEnd();
                    out.setTag(null,-1,-1);
        out.bodyContentStart();
                    _jettag_f_uc_39_57.handleBodyContent(out);
                }
                out = _jettag_f_uc_39_57_saved_out;
        out.bodyContentEnd();
                _jettag_f_uc_39_57.doEnd();
                out.endTag("uc",41);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
    out.bodyContentStart();
                _jettag_c_set_39_3.handleBodyContent(out);
            }
            out = _jettag_c_set_39_3_saved_out;
    out.bodyContentEnd();
            _jettag_c_set_39_3.doEnd();
            out.endTag("set",65);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(8);
            out.write(NL);         
            out.write("\t\t<%=a");  //$NON-NLS-1$        
            out.setTag("get",2017,2054);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(37);
            RuntimeTagElement _jettag_c_get_40_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_40_7.setRuntimeParent(_jettag_c_if_22_2);
            _jettag_c_get_40_7.setTagInfo(_td_c_get_40_7);
            _jettag_c_get_40_7.doStart(context, out);
            _jettag_c_get_40_7.doEnd();
            out.setTag(null,-1,-1);
            out.write(".get");  //$NON-NLS-1$        
            out.setTag("get",2058,2108);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(50);
            RuntimeTagElement _jettag_c_get_40_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_48); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_40_48.setRuntimeParent(_jettag_c_if_22_2);
            _jettag_c_get_40_48.setTagInfo(_td_c_get_40_48);
            _jettag_c_get_40_48.doStart(context, out);
            _jettag_c_get_40_48.doEnd();
            out.setTag(null,-1,-1);
            out.write("()%>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(29);
            out.setTag("if",2115,2144);
            RuntimeTagElement _jettag_c_if_41_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_41_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_41_3.setRuntimeParent(_jettag_c_if_22_2);
            _jettag_c_if_41_3.setTagInfo(_td_c_if_41_3);
            _jettag_c_if_41_3.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_41_3.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t</a>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_41_3.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_41_3.doEnd();
            out.endTag("if",11);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("\t\t</span><br/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(38);
            out.setTag("if",2180,2218);
            RuntimeTagElement _jettag_c_if_45_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_45_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_45_3.setRuntimeParent(_jettag_c_if_22_2);
            _jettag_c_if_45_3.setTagInfo(_td_c_if_45_3);
            _jettag_c_if_45_3.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_45_3.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t<span class=\"summaryField\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(29);
                out.setTag("if",2253,2282);
                RuntimeTagElement _jettag_c_if_47_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_47_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_47_4.setRuntimeParent(_jettag_c_if_45_3);
                _jettag_c_if_47_4.setTagInfo(_td_c_if_47_4);
                _jettag_c_if_47_4.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_47_4.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t\t<a href=\"");  //$NON-NLS-1$        
                    out.setTag("get",2296,2336);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_48_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_14); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_48_14.setRuntimeParent(_jettag_c_if_47_4);
                    _jettag_c_get_48_14.setTagInfo(_td_c_get_48_14);
                    _jettag_c_get_48_14.doStart(context, out);
                    _jettag_c_get_48_14.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".jsp?idParameter=<%=a");  //$NON-NLS-1$        
                    out.setTag("get",2357,2394);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(37);
                    RuntimeTagElement _jettag_c_get_48_75 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_75); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_48_75.setRuntimeParent(_jettag_c_if_47_4);
                    _jettag_c_get_48_75.setTagInfo(_td_c_get_48_75);
                    _jettag_c_get_48_75.doStart(context, out);
                    _jettag_c_get_48_75.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".get");  //$NON-NLS-1$        
                    out.setTag("get",2398,2435);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(37);
                    RuntimeTagElement _jettag_c_get_48_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_116); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_48_116.setRuntimeParent(_jettag_c_if_47_4);
                    _jettag_c_get_48_116.setTagInfo(_td_c_get_48_116);
                    _jettag_c_get_48_116.doStart(context, out);
                    _jettag_c_get_48_116.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("Id()%>&entityName=");  //$NON-NLS-1$        
                    out.setTag("get",2453,2490);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(37);
                    RuntimeTagElement _jettag_c_get_48_171 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_171); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_48_171.setRuntimeParent(_jettag_c_if_47_4);
                    _jettag_c_get_48_171.setTagInfo(_td_c_get_48_171);
                    _jettag_c_get_48_171.doStart(context, out);
                    _jettag_c_get_48_171.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\" class=\"summaryField\">");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_47_4.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_47_4.doEnd();
                out.endTag("if",235);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(56);
                out.setTag("set",2528,2584);
                RuntimeTagElement _jettag_c_set_50_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_50_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_50_4.setRuntimeParent(_jettag_c_if_45_3);
                _jettag_c_set_50_4.setTagInfo(_td_c_set_50_4);
                _jettag_c_set_50_4.doStart(context, out);
                JET2Writer _jettag_c_set_50_4_saved_out = out;
                out.setTag(null,-1,-1);
                while (_jettag_c_set_50_4.okToProcessBody()) {
                    out = out.newNestedContentWriter();
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(17);
                    out.setTag("uc",2584,2601);
                    RuntimeTagElement _jettag_f_uc_50_60 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_50_60); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_f_uc_50_60.setRuntimeParent(_jettag_c_set_50_4);
                    _jettag_f_uc_50_60.setTagInfo(_td_f_uc_50_60);
                    _jettag_f_uc_50_60.doStart(context, out);
                    JET2Writer _jettag_f_uc_50_60_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_f_uc_50_60.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.setTag("get",2601,2644);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(43);
                        RuntimeTagElement _jettag_c_get_50_77 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_77); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_50_77.setRuntimeParent(_jettag_f_uc_50_60);
                        _jettag_c_get_50_77.setTagInfo(_td_c_get_50_77);
                        _jettag_c_get_50_77.doStart(context, out);
                        _jettag_c_get_50_77.doEnd();
                        out.setTag(null,-1,-1);
            out.bodyContentStart();
                        _jettag_f_uc_50_60.handleBodyContent(out);
                    }
                    out = _jettag_f_uc_50_60_saved_out;
            out.bodyContentEnd();
                    _jettag_f_uc_50_60.doEnd();
                    out.endTag("uc",43);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
        out.bodyContentStart();
                    _jettag_c_set_50_4.handleBodyContent(out);
                }
                out = _jettag_c_set_50_4_saved_out;
        out.bodyContentEnd();
                _jettag_c_set_50_4.doEnd();
                out.endTag("set",67);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(8);
                out.write(NL);         
                out.write("\t\t\t<%=a");  //$NON-NLS-1$        
                out.setTag("get",2667,2704);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(37);
                RuntimeTagElement _jettag_c_get_51_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_51_8.setRuntimeParent(_jettag_c_if_45_3);
                _jettag_c_get_51_8.setTagInfo(_td_c_get_51_8);
                _jettag_c_get_51_8.doStart(context, out);
                _jettag_c_get_51_8.doEnd();
                out.setTag(null,-1,-1);
                out.write(".get");  //$NON-NLS-1$        
                out.setTag("get",2708,2760);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(52);
                RuntimeTagElement _jettag_c_get_51_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_49); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_51_49.setRuntimeParent(_jettag_c_if_45_3);
                _jettag_c_get_51_49.setTagInfo(_td_c_get_51_49);
                _jettag_c_get_51_49.doStart(context, out);
                _jettag_c_get_51_49.doEnd();
                out.setTag(null,-1,-1);
                out.write("()%>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(29);
                out.setTag("if",2768,2797);
                RuntimeTagElement _jettag_c_if_52_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_52_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_52_4.setRuntimeParent(_jettag_c_if_45_3);
                _jettag_c_if_52_4.setTagInfo(_td_c_if_52_4);
                _jettag_c_if_52_4.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_52_4.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t\t</a>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_52_4.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_52_4.doEnd();
                out.endTag("if",13);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("\t\t\t</span><br/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_45_3.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_45_3.doEnd();
            out.endTag("if",618);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("\t\t</div>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<% } %>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_if_22_2.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_if_22_2.doEnd();
        out.endTag("if",1945);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(41);
        out.setTag("if",2875,2916);
        RuntimeTagElement _jettag_c_if_61_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_61_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_61_2.setRuntimeParent(null);
        _jettag_c_if_61_2.setTagInfo(_td_c_if_61_2);
        _jettag_c_if_61_2.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_c_if_61_2.okToProcessBody()) {
            out.write(NL);         
            out.write("\t\t<% long idParameter = Long.parseLong(request.getParameter(\"idParameter\"));");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
            out.setTag("get",2996,3033);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(37);
            RuntimeTagElement _jettag_c_get_63_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_63_3.setRuntimeParent(_jettag_c_if_61_2);
            _jettag_c_get_63_3.setTagInfo(_td_c_get_63_3);
            _jettag_c_get_63_3.doStart(context, out);
            _jettag_c_get_63_3.doEnd();
            out.setTag(null,-1,-1);
            out.write("DAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().get");  //$NON-NLS-1$        
            out.setTag("get",3103,3140);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(37);
            RuntimeTagElement _jettag_c_get_63_110 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_110); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_63_110.setRuntimeParent(_jettag_c_if_61_2);
            _jettag_c_get_63_110.setTagInfo(_td_c_get_63_110);
            _jettag_c_get_63_110.doStart(context, out);
            _jettag_c_get_63_110.doEnd();
            out.setTag(null,-1,-1);
            out.write("DAO();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
            out.setTag("get",3149,3186);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(37);
            RuntimeTagElement _jettag_c_get_64_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_64_3.setRuntimeParent(_jettag_c_if_61_2);
            _jettag_c_get_64_3.setTagInfo(_td_c_get_64_3);
            _jettag_c_get_64_3.doStart(context, out);
            _jettag_c_get_64_3.doEnd();
            out.setTag(null,-1,-1);
            out.write(" a");  //$NON-NLS-1$        
            out.setTag("get",3188,3225);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(37);
            RuntimeTagElement _jettag_c_get_64_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_42); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_64_42.setRuntimeParent(_jettag_c_if_61_2);
            _jettag_c_get_64_42.setTagInfo(_td_c_get_64_42);
            _jettag_c_get_64_42.doStart(context, out);
            _jettag_c_get_64_42.doEnd();
            out.setTag(null,-1,-1);
            out.write(" = dao.get");  //$NON-NLS-1$        
            out.setTag("get",3235,3272);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(37);
            RuntimeTagElement _jettag_c_get_64_89 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_89); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_64_89.setRuntimeParent(_jettag_c_if_61_2);
            _jettag_c_get_64_89.setTagInfo(_td_c_get_64_89);
            _jettag_c_get_64_89.doStart(context, out);
            _jettag_c_get_64_89.doEnd();
            out.setTag(null,-1,-1);
            out.write("(idParameter);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tif(a");  //$NON-NLS-1$        
            out.setTag("get",3293,3330);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(37);
            RuntimeTagElement _jettag_c_get_65_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_65_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_65_7.setRuntimeParent(_jettag_c_if_61_2);
            _jettag_c_get_65_7.setTagInfo(_td_c_get_65_7);
            _jettag_c_get_65_7.doStart(context, out);
            _jettag_c_get_65_7.doEnd();
            out.setTag(null,-1,-1);
            out.write(" != null) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(58);
            out.setTag("iterate",3345,3403);
            RuntimeTagElement _jettag_c_iterate_66_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_66_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_66_4.setRuntimeParent(_jettag_c_if_61_2);
            _jettag_c_iterate_66_4.setTagInfo(_td_c_iterate_66_4);
            _jettag_c_iterate_66_4.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_66_4.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_66_4.getTagInfo().getAttribute("delimiter"),3345,3403);
                out.loopIterate();
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(39);
                out.setTag("if",3408,3447);
                RuntimeTagElement _jettag_c_if_67_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_67_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_67_5.setRuntimeParent(_jettag_c_iterate_66_4);
                _jettag_c_if_67_5.setTagInfo(_td_c_if_67_5);
                _jettag_c_if_67_5.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_67_5.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t\t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(47);
                    out.setTag("set",3453,3500);
                    RuntimeTagElement _jettag_c_set_68_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_68_6); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_68_6.setRuntimeParent(_jettag_c_if_67_5);
                    _jettag_c_set_68_6.setTagInfo(_td_c_set_68_6);
                    _jettag_c_set_68_6.doStart(context, out);
                    JET2Writer _jettag_c_set_68_6_saved_out = out;
                    out.setTag(null,-1,-1);
                    while (_jettag_c_set_68_6.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
                out.jump(17);
                        out.setTag("uc",3500,3517);
                        RuntimeTagElement _jettag_f_uc_68_53 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_68_53); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_f_uc_68_53.setRuntimeParent(_jettag_c_set_68_6);
                        _jettag_f_uc_68_53.setTagInfo(_td_f_uc_68_53);
                        _jettag_f_uc_68_53.doStart(context, out);
                        JET2Writer _jettag_f_uc_68_53_saved_out = out;
                        out.setTag(null,-1,-1);
                        while (_jettag_f_uc_68_53.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            out.setTag("get",3517,3551);
                    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                    out.jump(34);
                            RuntimeTagElement _jettag_c_get_68_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_68_70); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_68_70.setRuntimeParent(_jettag_f_uc_68_53);
                            _jettag_c_get_68_70.setTagInfo(_td_c_get_68_70);
                            _jettag_c_get_68_70.doStart(context, out);
                            _jettag_c_get_68_70.doEnd();
                            out.setTag(null,-1,-1);
                out.bodyContentStart();
                            _jettag_f_uc_68_53.handleBodyContent(out);
                        }
                        out = _jettag_f_uc_68_53_saved_out;
                out.bodyContentEnd();
                        _jettag_f_uc_68_53.doEnd();
                        out.endTag("uc",34);
                // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
                out.jump(7);
            out.bodyContentStart();
                        _jettag_c_set_68_6.handleBodyContent(out);
                    }
                    out = _jettag_c_set_68_6_saved_out;
            out.bodyContentEnd();
                    _jettag_c_set_68_6.doEnd();
                    out.endTag("set",58);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(8);
                    out.write(NL);         
                    out.write("\t\t\t\t");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t    request.getSession().setAttribute(\"a");  //$NON-NLS-1$        
                    out.setTag("get",3616,3653);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(37);
                    RuntimeTagElement _jettag_c_get_70_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_70_45); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_70_45.setRuntimeParent(_jettag_c_if_67_5);
                    _jettag_c_get_70_45.setTagInfo(_td_c_get_70_45);
                    _jettag_c_get_70_45.doStart(context, out);
                    _jettag_c_get_70_45.doEnd();
                    out.setTag(null,-1,-1);
                    out.setTag("get",3653,3687);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(34);
                    RuntimeTagElement _jettag_c_get_70_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_70_82); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_70_82.setRuntimeParent(_jettag_c_if_67_5);
                    _jettag_c_get_70_82.setTagInfo(_td_c_get_70_82);
                    _jettag_c_get_70_82.doStart(context, out);
                    _jettag_c_get_70_82.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("ContentType\",a");  //$NON-NLS-1$        
                    out.setTag("get",3701,3738);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(37);
                    RuntimeTagElement _jettag_c_get_70_130 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_70_130); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_70_130.setRuntimeParent(_jettag_c_if_67_5);
                    _jettag_c_get_70_130.setTagInfo(_td_c_get_70_130);
                    _jettag_c_get_70_130.doStart(context, out);
                    _jettag_c_get_70_130.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".get");  //$NON-NLS-1$        
                    out.setTag("get",3742,3785);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(43);
                    RuntimeTagElement _jettag_c_get_70_171 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_70_171); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_70_171.setRuntimeParent(_jettag_c_if_67_5);
                    _jettag_c_get_70_171.setTagInfo(_td_c_get_70_171);
                    _jettag_c_get_70_171.doStart(context, out);
                    _jettag_c_get_70_171.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("ContentType());");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("    \t\t\t\trequest.getSession().setAttribute(\"a");  //$NON-NLS-1$        
                    out.setTag("get",3845,3882);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(37);
                    RuntimeTagElement _jettag_c_get_71_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_45); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_71_45.setRuntimeParent(_jettag_c_if_67_5);
                    _jettag_c_get_71_45.setTagInfo(_td_c_get_71_45);
                    _jettag_c_get_71_45.doStart(context, out);
                    _jettag_c_get_71_45.doEnd();
                    out.setTag(null,-1,-1);
                    out.setTag("get",3882,3916);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(34);
                    RuntimeTagElement _jettag_c_get_71_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_82); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_71_82.setRuntimeParent(_jettag_c_if_67_5);
                    _jettag_c_get_71_82.setTagInfo(_td_c_get_71_82);
                    _jettag_c_get_71_82.doStart(context, out);
                    _jettag_c_get_71_82.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\",a");  //$NON-NLS-1$        
                    out.setTag("get",3919,3956);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(37);
                    RuntimeTagElement _jettag_c_get_71_119 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_119); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_71_119.setRuntimeParent(_jettag_c_if_67_5);
                    _jettag_c_get_71_119.setTagInfo(_td_c_get_71_119);
                    _jettag_c_get_71_119.doStart(context, out);
                    _jettag_c_get_71_119.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".get");  //$NON-NLS-1$        
                    out.setTag("get",3960,4003);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(43);
                    RuntimeTagElement _jettag_c_get_71_160 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_160); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_71_160.setRuntimeParent(_jettag_c_if_67_5);
                    _jettag_c_get_71_160.setTagInfo(_td_c_get_71_160);
                    _jettag_c_get_71_160.doStart(context, out);
                    _jettag_c_get_71_160.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("());");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_67_5.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_67_5.doEnd();
                out.endTag("if",565);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_iterate_66_4.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_66_4.doEnd();
            out.loopEnd();
            out.endTag("iterate",620);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
            out.write("\t\t%>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(55);
            out.setTag("iterate",4044,4099);
            RuntimeTagElement _jettag_c_iterate_76_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_76_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_76_3.setRuntimeParent(_jettag_c_if_61_2);
            _jettag_c_iterate_76_3.setTagInfo(_td_c_iterate_76_3);
            _jettag_c_iterate_76_3.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_76_3.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_76_3.getTagInfo().getAttribute("delimiter"),4044,4099);
                out.loopIterate();
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
                out.scriptletStart();
        
        			// Este trecho eh processado pelo JET, e nao JSP!
        			br.ufscar.dc.webnav.webNav.HtmlItem hi = (br.ufscar.dc.webnav.webNav.HtmlItem)context.getVariable("hitem"); 
        			br.ufscar.dc.webnav.webNav.EntityView comp = (br.ufscar.dc.webnav.webNav.EntityView) hi.eContainer();
        			java.util.List<br.ufscar.dc.webnav.webNav.EntityField> fields = comp.getListEntityFields();
        			String beanName = "a"+comp.getEntity();
        			String text = hi.getContent();
        			text = text.replaceAll("\\\\\"", "\"");
        			String ret = "";
        			int index = -1;
        		
        			String fieldName = "", fieldType = "";
        		
        			while ((index = text.indexOf("${")) != -1) {
        				String line = "";
        				line += text.substring(0, index);
        				text = text.substring(index + 2);
        				index = text.indexOf("}");
        				int fieldNumber = Integer.parseInt(text.substring(0, index));
        				br.ufscar.dc.webnav.webNav.EntityField field = fields.get(fieldNumber - 1);
        				fieldName = (String) field.eGet(field.eClass()
        						.getEStructuralFeature("fieldName"));
        				fieldType = (String) field.eGet(field.eClass()
        						.getEStructuralFeature("fieldType"));

        				if (fieldType.equals("IMAGE")) {
        					line += "core.actions.CommonActions.showSessionImage.do?imageId=";
        					line += beanName + fieldName;
        				} else if (fieldType.equals("DATE")) {
        					line += "<%=new java.text.SimpleDateFormat(\"dd/MM/yyyy\").format(";
        					line += beanName + "." + "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1) + "()";
        					line += ")%>";
        				} else if (fieldType.equals("REFERENCE")) {
        					line += "<%=" + beanName + "." + "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1) + "()" + ".getSummary()%>";
        				} else {
        					line += "<%=" + beanName + "." + "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1) + "()" + "%>";
        				}
        				text = text.substring(index + 1);
        				ret += line;
        			}
        			ret += text;
        			if(fieldType.equals("IMAGE"))
        				ret = "<% if("+beanName + "." + "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1) + "()" + ".length>0) { %>" + ret;
        			if(fieldType.equals("IMAGE"))
        				ret += "<% } %>";
        			out.write(ret+"\n");
        		
        // elemento tipo JavaScriptlet(org.eclipse.jet.core.parser.ast.JavaScriptlet)
        out.jump(2148);
                out.scriptletEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_iterate_76_3.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_76_3.doEnd();
            out.loopEnd();
            out.endTag("iterate",2155);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
            out.write(NL);         
            out.write("\t\t<% } %>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(68);
            out.setTag("if",6281,6349);
            RuntimeTagElement _jettag_c_if_128_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_128_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_128_3.setRuntimeParent(_jettag_c_if_61_2);
            _jettag_c_if_128_3.setTagInfo(_td_c_if_128_3);
            _jettag_c_if_128_3.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_128_3.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
                out.setTag("include",6353,6420);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(67);
                out.includeStart();
                RuntimeTagElement _jettag_c_include_129_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_129_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_129_4.setRuntimeParent(_jettag_c_if_128_3);
                _jettag_c_include_129_4.setTagInfo(_td_c_include_129_4);
                _jettag_c_include_129_4.doStart(context, out);
                _jettag_c_include_129_4.doEnd();
                out.setTag(null,-1,-1);
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_128_3.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_128_3.doEnd();
            out.endTag("if",74);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(38);
            out.setTag("if",6434,6472);
            RuntimeTagElement _jettag_c_if_132_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_132_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_132_3.setRuntimeParent(_jettag_c_if_61_2);
            _jettag_c_if_132_3.setTagInfo(_td_c_if_132_3);
            _jettag_c_if_132_3.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_132_3.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t<div class=\"componentLink\"><a href=\"");  //$NON-NLS-1$        
                out.setTag("get",6512,6561);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(49);
                RuntimeTagElement _jettag_c_get_133_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_133_40); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_133_40.setRuntimeParent(_jettag_c_if_132_3);
                _jettag_c_get_133_40.setTagInfo(_td_c_get_133_40);
                _jettag_c_get_133_40.doStart(context, out);
                _jettag_c_get_133_40.doEnd();
                out.setTag(null,-1,-1);
                out.write(".jsp\">");  //$NON-NLS-1$        
                out.setTag("get",6567,6607);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_133_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_133_95); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_133_95.setRuntimeParent(_jettag_c_if_132_3);
                _jettag_c_get_133_95.setTagInfo(_td_c_get_133_95);
                _jettag_c_get_133_95.doStart(context, out);
                _jettag_c_get_133_95.doEnd();
                out.setTag(null,-1,-1);
                out.write("</a></div>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_132_3.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_132_3.doEnd();
            out.endTag("if",148);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_if_61_2.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_if_61_2.doEnd();
        out.endTag("if",3713);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(35);
        out.setTag("if",6638,6673);
        RuntimeTagElement _jettag_c_if_136_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_136_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_136_2.setRuntimeParent(null);
        _jettag_c_if_136_2.setTagInfo(_td_c_if_136_2);
        _jettag_c_if_136_2.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_c_if_136_2.okToProcessBody()) {
            out.write("Text");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_if_136_2.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_if_136_2.doEnd();
        out.endTag("if",4);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(NL);         
        out.write("<% } %>");  //$NON-NLS-1$        
        out.popTemplateFile();
    }
}
