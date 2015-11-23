package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_templateFormReport implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_templateFormReport(String templateFile) {
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
    private static final TagInfo _td_c_iterate_8_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            8, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_5 = new TagInfo("c:get", //$NON-NLS-1$
            9, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_21 = new TagInfo("c:get", //$NON-NLS-1$
            10, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_6 = new TagInfo("c:get", //$NON-NLS-1$
            11, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_56 = new TagInfo("c:get", //$NON-NLS-1$
            11, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_6 = new TagInfo("c:get", //$NON-NLS-1$
            12, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_50 = new TagInfo("c:get", //$NON-NLS-1$
            12, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_98 = new TagInfo("c:get", //$NON-NLS-1$
            12, 98,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_4 = new TagInfo("c:get", //$NON-NLS-1$
            16, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_57 = new TagInfo("c:get", //$NON-NLS-1$
            16, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_12 = new TagInfo("c:get", //$NON-NLS-1$
            17, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_65 = new TagInfo("c:get", //$NON-NLS-1$
            17, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_20_2 = new TagInfo("c:if", //$NON-NLS-1$
            20, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentForm/@filter = 'true')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_36 = new TagInfo("c:get", //$NON-NLS-1$
            22, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_93 = new TagInfo("c:get", //$NON-NLS-1$
            24, 93,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_50 = new TagInfo("c:get", //$NON-NLS-1$
            25, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentPage/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_26_6 = new TagInfo("c:iterate", //$NON-NLS-1$
            26, 6,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_28_8 = new TagInfo("c:if", //$NON-NLS-1$
            28, 8,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'string') or ($currentFeature/DataType/@name = 'int') or ($currentFeature/DataType/@name = 'float') or ($currentFeature/DataType/@name = 'time')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_41 = new TagInfo("c:get", //$NON-NLS-1$
            29, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_34 = new TagInfo("c:get", //$NON-NLS-1$
            30, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_80 = new TagInfo("c:get", //$NON-NLS-1$
            30, 80,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_32_8 = new TagInfo("c:if", //$NON-NLS-1$
            32, 8,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'currency')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_41 = new TagInfo("c:get", //$NON-NLS-1$
            33, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_34 = new TagInfo("c:get", //$NON-NLS-1$
            34, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_80 = new TagInfo("c:get", //$NON-NLS-1$
            34, 80,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_36_8 = new TagInfo("c:if", //$NON-NLS-1$
            36, 8,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'date')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_41 = new TagInfo("c:get", //$NON-NLS-1$
            37, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_34 = new TagInfo("c:get", //$NON-NLS-1$
            38, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_80 = new TagInfo("c:get", //$NON-NLS-1$
            38, 80,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_40_8 = new TagInfo("c:if", //$NON-NLS-1$
            40, 8,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'boolean')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_41 = new TagInfo("c:get", //$NON-NLS-1$
            41, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_38 = new TagInfo("c:get", //$NON-NLS-1$
            42, 38,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_84 = new TagInfo("c:get", //$NON-NLS-1$
            42, 84,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_58_58 = new TagInfo("c:if", //$NON-NLS-1$
            58, 58,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentForm/@order = 'true')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_58_151 = new TagInfo("c:if", //$NON-NLS-1$
            58, 151,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentForm/@pagination = 'true')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_61_10 = new TagInfo("c:if", //$NON-NLS-1$
            61, 10,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentForm/@order = 'true')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_62_7 = new TagInfo("c:iterate", //$NON-NLS-1$
            62, 7,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_63_11 = new TagInfo("c:if", //$NON-NLS-1$
            63, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentForm/@order = 'true')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_68 = new TagInfo("c:get", //$NON-NLS-1$
            63, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_138 = new TagInfo("c:get", //$NON-NLS-1$
            63, 138,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_65_7 = new TagInfo("c:if", //$NON-NLS-1$
            65, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentForm/@put = 'true') or ($currentForm/@delete = 'true')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_76_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            76, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_77_34 = new TagInfo("c:get", //$NON-NLS-1$
            77, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_78_35 = new TagInfo("c:get", //$NON-NLS-1$
            78, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_78_104 = new TagInfo("c:get", //$NON-NLS-1$
            78, 104,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_78_152 = new TagInfo("c:get", //$NON-NLS-1$
            78, 152,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_78_221 = new TagInfo("c:get", //$NON-NLS-1$
            78, 221,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_78_290 = new TagInfo("c:get", //$NON-NLS-1$
            78, 290,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_80_9 = new TagInfo("c:if", //$NON-NLS-1$
            80, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentForm/@put = 'true') or ($currentForm/@delete = 'true')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_82_11 = new TagInfo("c:if", //$NON-NLS-1$
            82, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentForm/@put = 'true')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_83_105 = new TagInfo("c:get", //$NON-NLS-1$
            83, 105,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_87_11 = new TagInfo("c:if", //$NON-NLS-1$
            87, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentForm/@delete = 'true')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_88_105 = new TagInfo("c:get", //$NON-NLS-1$
            88, 105,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_88_176 = new TagInfo("c:get", //$NON-NLS-1$
            88, 176,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentPage/@name", //$NON-NLS-1$
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
            out.write("\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(64);
            out.setTag("iterate",334,398);
            RuntimeTagElement _jettag_c_iterate_8_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_8_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_8_3.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_iterate_8_3.setTagInfo(_td_c_iterate_8_3);
            _jettag_c_iterate_8_3.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_8_3.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_8_3.getTagInfo().getAttribute("delimiter"),334,398);
                out.loopIterate();
                out.write(NL);         
                out.write("\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",403,443);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_9_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_9_5.setRuntimeParent(_jettag_c_iterate_8_3);
                _jettag_c_get_9_5.setTagInfo(_td_c_get_9_5);
                _jettag_c_get_9_5.doStart(context, out);
                _jettag_c_get_9_5.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = \"\";");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tif (isSet($_GET['");  //$NON-NLS-1$        
                out.setTag("get",470,510);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_10_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_21); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_10_21.setRuntimeParent(_jettag_c_iterate_8_3);
                _jettag_c_get_10_21.setTagInfo(_td_c_get_10_21);
                _jettag_c_get_10_21.doStart(context, out);
                _jettag_c_get_10_21.doEnd();
                out.setTag(null,-1,-1);
                out.write("'])) {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",522,562);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_11_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_11_6.setRuntimeParent(_jettag_c_iterate_8_3);
                _jettag_c_get_11_6.setTagInfo(_td_c_get_11_6);
                _jettag_c_get_11_6.doStart(context, out);
                _jettag_c_get_11_6.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = $_GET[\"");  //$NON-NLS-1$        
                out.setTag("get",572,612);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_11_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_56); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_11_56.setRuntimeParent(_jettag_c_iterate_8_3);
                _jettag_c_get_11_56.setTagInfo(_td_c_get_11_56);
                _jettag_c_get_11_56.doStart(context, out);
                _jettag_c_get_11_56.doEnd();
                out.setTag(null,-1,-1);
                out.write("\"];");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",621,660);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_12_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_12_6.setRuntimeParent(_jettag_c_iterate_8_3);
                _jettag_c_get_12_6.setTagInfo(_td_c_get_12_6);
                _jettag_c_get_12_6.doStart(context, out);
                _jettag_c_get_12_6.doEnd();
                out.setTag(null,-1,-1);
                out.write("->set");  //$NON-NLS-1$        
                out.setTag("get",665,711);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_12_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_12_50.setRuntimeParent(_jettag_c_iterate_8_3);
                _jettag_c_get_12_50.setTagInfo(_td_c_get_12_50);
                _jettag_c_get_12_50.doStart(context, out);
                _jettag_c_get_12_50.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",713,753);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_12_98 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_98); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_12_98.setRuntimeParent(_jettag_c_iterate_8_3);
                _jettag_c_get_12_98.setTagInfo(_td_c_get_12_98);
                _jettag_c_get_12_98.doStart(context, out);
                _jettag_c_get_12_98.doEnd();
                out.setTag(null,-1,-1);
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_iterate_8_3.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_8_3.doEnd();
            out.loopEnd();
            out.endTag("iterate",365);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
            out.write(NL);         
            out.write("\t\t$");  //$NON-NLS-1$        
            out.setTag("get",780,824);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(44);
            RuntimeTagElement _jettag_c_get_16_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_16_4.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_16_4.setTagInfo(_td_c_get_16_4);
            _jettag_c_get_16_4.doStart(context, out);
            _jettag_c_get_16_4.doEnd();
            out.setTag(null,-1,-1);
            out.write("DB = new ");  //$NON-NLS-1$        
            out.setTag("get",833,877);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(44);
            RuntimeTagElement _jettag_c_get_16_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_57); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_16_57.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_16_57.setTagInfo(_td_c_get_16_57);
            _jettag_c_get_16_57.doStart(context, out);
            _jettag_c_get_16_57.doEnd();
            out.setTag(null,-1,-1);
            out.write("DB();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t$rows = $");  //$NON-NLS-1$        
            out.setTag("get",894,938);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(44);
            RuntimeTagElement _jettag_c_get_17_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_17_12.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_17_12.setTagInfo(_td_c_get_17_12);
            _jettag_c_get_17_12.doStart(context, out);
            _jettag_c_get_17_12.doEnd();
            out.setTag(null,-1,-1);
            out.write("DB->get($");  //$NON-NLS-1$        
            out.setTag("get",947,991);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(44);
            RuntimeTagElement _jettag_c_get_17_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_65); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_17_65.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_17_65.setTagInfo(_td_c_get_17_65);
            _jettag_c_get_17_65.doStart(context, out);
            _jettag_c_get_17_65.doEnd();
            out.setTag(null,-1,-1);
            out.write(");");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t?>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(45);
            out.setTag("if",1000,1045);
            RuntimeTagElement _jettag_c_if_20_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_20_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_20_2.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_if_20_2.setTagInfo(_td_c_if_20_2);
            _jettag_c_if_20_2.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_20_2.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t<div class=\"panel panel-default\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<div class=\"panel-heading\">Novo ");  //$NON-NLS-1$        
                out.setTag("get",1117,1156);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_22_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_36); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_22_36.setRuntimeParent(_jettag_c_if_20_2);
                _jettag_c_get_22_36.setTagInfo(_td_c_get_22_36);
                _jettag_c_get_22_36.doStart(context, out);
                _jettag_c_get_22_36.doEnd();
                out.setTag(null,-1,-1);
                out.write("</div>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<div class=\"panel-body\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<form class=\"bs-example bs-example-form\" data-example-id=\"simple-input-groups\" action=\"/");  //$NON-NLS-1$        
                out.setTag("get",1283,1322);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_24_93 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_93); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_24_93.setRuntimeParent(_jettag_c_if_20_2);
                _jettag_c_get_24_93.setTagInfo(_td_c_get_24_93);
                _jettag_c_get_24_93.doStart(context, out);
                _jettag_c_get_24_93.doEnd();
                out.setTag(null,-1,-1);
                out.write("/save.php\" method=\"post\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t<input type=\"hidden\" name=\"pageBack\" value=\"");  //$NON-NLS-1$        
                out.setTag("get",1397,1434);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(37);
                RuntimeTagElement _jettag_c_get_25_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_25_50.setRuntimeParent(_jettag_c_if_20_2);
                _jettag_c_get_25_50.setTagInfo(_td_c_get_25_50);
                _jettag_c_get_25_50.doStart(context, out);
                _jettag_c_get_25_50.doEnd();
                out.setTag(null,-1,-1);
                out.write("\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(64);
                out.setTag("iterate",1442,1506);
                RuntimeTagElement _jettag_c_iterate_26_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_26_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_26_6.setRuntimeParent(_jettag_c_if_20_2);
                _jettag_c_iterate_26_6.setTagInfo(_td_c_iterate_26_6);
                _jettag_c_iterate_26_6.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_26_6.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_26_6.getTagInfo().getAttribute("delimiter"),1442,1506);
                    out.loopIterate();
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t<div class=\"input-group\">");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(192);
                    out.setTag("if",1546,1738);
                    RuntimeTagElement _jettag_c_if_28_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_28_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_28_8.setRuntimeParent(_jettag_c_iterate_26_6);
                    _jettag_c_if_28_8.setTagInfo(_td_c_if_28_8);
                    _jettag_c_if_28_8.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_c_if_28_8.okToProcessBody()) {
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t\t<span class=\"input-group-addon\">");  //$NON-NLS-1$        
                        out.setTag("get",1779,1819);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(40);
                        RuntimeTagElement _jettag_c_get_29_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_41); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_29_41.setRuntimeParent(_jettag_c_if_28_8);
                        _jettag_c_get_29_41.setTagInfo(_td_c_get_29_41);
                        _jettag_c_get_29_41.doStart(context, out);
                        _jettag_c_get_29_41.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("</span>");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"");  //$NON-NLS-1$        
                        out.setTag("get",1860,1900);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(40);
                        RuntimeTagElement _jettag_c_get_30_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_34); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_30_34.setRuntimeParent(_jettag_c_if_28_8);
                        _jettag_c_get_30_34.setTagInfo(_td_c_get_30_34);
                        _jettag_c_get_30_34.doStart(context, out);
                        _jettag_c_get_30_34.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("\" id=\"");  //$NON-NLS-1$        
                        out.setTag("get",1906,1946);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(40);
                        RuntimeTagElement _jettag_c_get_30_80 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_80); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_30_80.setRuntimeParent(_jettag_c_if_28_8);
                        _jettag_c_get_30_80.setTagInfo(_td_c_get_30_80);
                        _jettag_c_get_30_80.doStart(context, out);
                        _jettag_c_get_30_80.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("\" class=\"form-control\" placeholder=\"\" aria-describedby=\"basic-addon1\">");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_if_28_8.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_if_28_8.doEnd();
                    out.endTag("if",286);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(59);
                    out.setTag("if",2039,2098);
                    RuntimeTagElement _jettag_c_if_32_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_32_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_32_8.setRuntimeParent(_jettag_c_iterate_26_6);
                    _jettag_c_if_32_8.setTagInfo(_td_c_if_32_8);
                    _jettag_c_if_32_8.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_c_if_32_8.okToProcessBody()) {
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t\t<span class=\"input-group-addon\">");  //$NON-NLS-1$        
                        out.setTag("get",2139,2179);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(40);
                        RuntimeTagElement _jettag_c_get_33_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_41); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_33_41.setRuntimeParent(_jettag_c_if_32_8);
                        _jettag_c_get_33_41.setTagInfo(_td_c_get_33_41);
                        _jettag_c_get_33_41.doStart(context, out);
                        _jettag_c_get_33_41.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(" (R$)</span>");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"");  //$NON-NLS-1$        
                        out.setTag("get",2225,2265);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(40);
                        RuntimeTagElement _jettag_c_get_34_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_34); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_34_34.setRuntimeParent(_jettag_c_if_32_8);
                        _jettag_c_get_34_34.setTagInfo(_td_c_get_34_34);
                        _jettag_c_get_34_34.doStart(context, out);
                        _jettag_c_get_34_34.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("\" id=\"");  //$NON-NLS-1$        
                        out.setTag("get",2271,2311);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(40);
                        RuntimeTagElement _jettag_c_get_34_80 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_80); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_34_80.setRuntimeParent(_jettag_c_if_32_8);
                        _jettag_c_get_34_80.setTagInfo(_td_c_get_34_80);
                        _jettag_c_get_34_80.doStart(context, out);
                        _jettag_c_get_34_80.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("\" class=\"form-control\" placeholder=\"\" aria-describedby=\"basic-addon1\">");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_if_32_8.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_if_32_8.doEnd();
                    out.endTag("if",291);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(55);
                    out.setTag("if",2404,2459);
                    RuntimeTagElement _jettag_c_if_36_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_36_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_36_8.setRuntimeParent(_jettag_c_iterate_26_6);
                    _jettag_c_if_36_8.setTagInfo(_td_c_if_36_8);
                    _jettag_c_if_36_8.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_c_if_36_8.okToProcessBody()) {
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t\t<span class=\"input-group-addon\">");  //$NON-NLS-1$        
                        out.setTag("get",2500,2540);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(40);
                        RuntimeTagElement _jettag_c_get_37_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_41); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_37_41.setRuntimeParent(_jettag_c_if_36_8);
                        _jettag_c_get_37_41.setTagInfo(_td_c_get_37_41);
                        _jettag_c_get_37_41.doStart(context, out);
                        _jettag_c_get_37_41.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("</span>");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"");  //$NON-NLS-1$        
                        out.setTag("get",2581,2621);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(40);
                        RuntimeTagElement _jettag_c_get_38_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_34); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_38_34.setRuntimeParent(_jettag_c_if_36_8);
                        _jettag_c_get_38_34.setTagInfo(_td_c_get_38_34);
                        _jettag_c_get_38_34.doStart(context, out);
                        _jettag_c_get_38_34.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("\" id=\"");  //$NON-NLS-1$        
                        out.setTag("get",2627,2667);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(40);
                        RuntimeTagElement _jettag_c_get_38_80 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_80); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_38_80.setRuntimeParent(_jettag_c_if_36_8);
                        _jettag_c_get_38_80.setTagInfo(_td_c_get_38_80);
                        _jettag_c_get_38_80.doStart(context, out);
                        _jettag_c_get_38_80.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("\" class=\"form-control datepicker\" placeholder=\"\" aria-describedby=\"basic-addon1\">");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_if_36_8.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_if_36_8.doEnd();
                    out.endTag("if",297);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(58);
                    out.setTag("if",2771,2829);
                    RuntimeTagElement _jettag_c_if_40_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_40_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_40_8.setRuntimeParent(_jettag_c_iterate_26_6);
                    _jettag_c_if_40_8.setTagInfo(_td_c_if_40_8);
                    _jettag_c_if_40_8.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_c_if_40_8.okToProcessBody()) {
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t\t<span class=\"input-group-addon\">");  //$NON-NLS-1$        
                        out.setTag("get",2870,2910);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(40);
                        RuntimeTagElement _jettag_c_get_41_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_41); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_41_41.setRuntimeParent(_jettag_c_if_40_8);
                        _jettag_c_get_41_41.setTagInfo(_td_c_get_41_41);
                        _jettag_c_get_41_41.doStart(context, out);
                        _jettag_c_get_41_41.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("</span>");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"");  //$NON-NLS-1$        
                        out.setTag("get",2955,2995);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(40);
                        RuntimeTagElement _jettag_c_get_42_38 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_38); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_42_38.setRuntimeParent(_jettag_c_if_40_8);
                        _jettag_c_get_42_38.setTagInfo(_td_c_get_42_38);
                        _jettag_c_get_42_38.doStart(context, out);
                        _jettag_c_get_42_38.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("\" id=\"");  //$NON-NLS-1$        
                        out.setTag("get",3001,3041);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(40);
                        RuntimeTagElement _jettag_c_get_42_84 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_84); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_42_84.setRuntimeParent(_jettag_c_if_40_8);
                        _jettag_c_get_42_84.setTagInfo(_td_c_get_42_84);
                        _jettag_c_get_42_84.doStart(context, out);
                        _jettag_c_get_42_84.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("\" class=\"form-control\" placeholder=\"\" aria-describedby=\"basic-addon1\">");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_if_40_8.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_if_40_8.doEnd();
                    out.endTag("if",290);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t</div>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t<br>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_26_6.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_26_6.doEnd();
                out.loopEnd();
                out.endTag("iterate",1650);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t\t\t\t\t<div class=\"btn-group btn-group\" role=\"group\" aria-label=\"...\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t<button type=\"reset\" class=\"btn btn-default\">Limpar</button>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">Salvar</button>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t</div>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t</form>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t</div>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t</div>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_20_2.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_20_2.doEnd();
            out.endTag("if",2372);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write(NL);         
            out.write("\t<div class=\"panel panel-default\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<div class=\"panel-body\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<table class=\"table table-striped\" data-toggle=\"table\"");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(44);
            out.setTag("if",3545,3589);
            RuntimeTagElement _jettag_c_if_58_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_58_58); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_58_58.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_if_58_58.setTagInfo(_td_c_if_58_58);
            _jettag_c_if_58_58.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_58_58.okToProcessBody()) {
                out.write(" data-sort-name=\"id\" data-sort-order=\"inc\"");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_58_58.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_58_58.doEnd();
            out.endTag("if",42);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(49);
            out.setTag("if",3638,3687);
            RuntimeTagElement _jettag_c_if_58_151 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_58_151); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_58_151.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_if_58_151.setTagInfo(_td_c_if_58_151);
            _jettag_c_if_58_151.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_58_151.okToProcessBody()) {
                out.write(" data-pagination=\"true\" data-page-size=\"10\"");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_58_151.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_58_151.doEnd();
            out.endTag("if",43);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t<thead>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t<tr>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t\t<th");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(44);
            out.setTag("if",3770,3814);
            RuntimeTagElement _jettag_c_if_61_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_61_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_61_10.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_if_61_10.setTagInfo(_td_c_if_61_10);
            _jettag_c_if_61_10.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_61_10.okToProcessBody()) {
                out.write(" data-field=\"id\" data-sortable=\"true\"");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_61_10.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_61_10.doEnd();
            out.endTag("if",37);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(">ID</th>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(64);
            out.setTag("iterate",3873,3937);
            RuntimeTagElement _jettag_c_iterate_62_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_62_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_62_7.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_iterate_62_7.setTagInfo(_td_c_iterate_62_7);
            _jettag_c_iterate_62_7.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_62_7.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_62_7.getTagInfo().getAttribute("delimiter"),3873,3937);
                out.loopIterate();
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t<th");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(44);
                out.setTag("if",3948,3992);
                RuntimeTagElement _jettag_c_if_63_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_63_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_63_11.setRuntimeParent(_jettag_c_iterate_62_7);
                _jettag_c_if_63_11.setTagInfo(_td_c_if_63_11);
                _jettag_c_if_63_11.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_63_11.okToProcessBody()) {
                    out.write(" data-field=\"");  //$NON-NLS-1$        
                    out.setTag("get",4005,4045);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_63_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_68); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_63_68.setRuntimeParent(_jettag_c_if_63_11);
                    _jettag_c_get_63_68.setTagInfo(_td_c_get_63_68);
                    _jettag_c_get_63_68.doStart(context, out);
                    _jettag_c_get_63_68.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\" data-sortable=\"true\"");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_63_11.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_63_11.doEnd();
                out.endTag("if",75);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(">");  //$NON-NLS-1$        
                out.setTag("get",4075,4115);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_63_138 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_138); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_63_138.setRuntimeParent(_jettag_c_iterate_62_7);
                _jettag_c_get_63_138.setTagInfo(_td_c_get_63_138);
                _jettag_c_get_63_138.doStart(context, out);
                _jettag_c_get_63_138.doEnd();
                out.setTag(null,-1,-1);
                out.write("</th>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_iterate_62_7.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_62_7.doEnd();
            out.loopEnd();
            out.endTag("iterate",190);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
            out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(77);
            out.setTag("if",4146,4223);
            RuntimeTagElement _jettag_c_if_65_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_65_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_65_7.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_if_65_7.setTagInfo(_td_c_if_65_7);
            _jettag_c_if_65_7.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_65_7.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t<th width=\"100px\">&nbsp;</th>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_65_7.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_65_7.doEnd();
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
            out.setTag("iterate",4430,4494);
            RuntimeTagElement _jettag_c_iterate_76_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_76_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_76_9.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_iterate_76_9.setTagInfo(_td_c_iterate_76_9);
            _jettag_c_iterate_76_9.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_76_9.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_76_9.getTagInfo().getAttribute("delimiter"),4430,4494);
                out.loopIterate();
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t\t\t<td><?php echo $row->get");  //$NON-NLS-1$        
                out.setTag("get",4528,4574);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_77_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_77_34); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_77_34.setRuntimeParent(_jettag_c_iterate_76_9);
                _jettag_c_get_77_34.setTagInfo(_td_c_get_77_34);
                _jettag_c_get_77_34.doStart(context, out);
                _jettag_c_get_77_34.doEnd();
                out.setTag(null,-1,-1);
                out.write("(); ?></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"");  //$NON-NLS-1$        
                out.setTag("get",4620,4659);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_78_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_78_35); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_78_35.setRuntimeParent(_jettag_c_iterate_76_9);
                _jettag_c_get_78_35.setTagInfo(_td_c_get_78_35);
                _jettag_c_get_78_35.doStart(context, out);
                _jettag_c_get_78_35.doEnd();
                out.setTag(null,-1,-1);
                out.write("_<?php echo $row->getId(); ?>_");  //$NON-NLS-1$        
                out.setTag("get",4689,4729);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_78_104 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_78_104); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_78_104.setRuntimeParent(_jettag_c_iterate_76_9);
                _jettag_c_get_78_104.setTagInfo(_td_c_get_78_104);
                _jettag_c_get_78_104.doStart(context, out);
                _jettag_c_get_78_104.doEnd();
                out.setTag(null,-1,-1);
                out.write("\" name=\"");  //$NON-NLS-1$        
                out.setTag("get",4737,4776);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_78_152 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_78_152); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_78_152.setRuntimeParent(_jettag_c_iterate_76_9);
                _jettag_c_get_78_152.setTagInfo(_td_c_get_78_152);
                _jettag_c_get_78_152.doStart(context, out);
                _jettag_c_get_78_152.doEnd();
                out.setTag(null,-1,-1);
                out.write("_<?php echo $row->getId(); ?>_");  //$NON-NLS-1$        
                out.setTag("get",4806,4846);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_78_221 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_78_221); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_78_221.setRuntimeParent(_jettag_c_iterate_76_9);
                _jettag_c_get_78_221.setTagInfo(_td_c_get_78_221);
                _jettag_c_get_78_221.doStart(context, out);
                _jettag_c_get_78_221.doEnd();
                out.setTag(null,-1,-1);
                out.write("\" value=\"<?php echo $row->get");  //$NON-NLS-1$        
                out.setTag("get",4875,4921);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_78_290 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_78_290); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_78_290.setRuntimeParent(_jettag_c_iterate_76_9);
                _jettag_c_get_78_290.setTagInfo(_td_c_get_78_290);
                _jettag_c_get_78_290.doStart(context, out);
                _jettag_c_get_78_290.doEnd();
                out.setTag(null,-1,-1);
                out.write("(); ?>\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_iterate_76_9.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_76_9.doEnd();
            out.loopEnd();
            out.endTag("iterate",444);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
            out.write("\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(77);
            out.setTag("if",4959,5036);
            RuntimeTagElement _jettag_c_if_80_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_80_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_80_9.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_if_80_9.setTagInfo(_td_c_if_80_9);
            _jettag_c_if_80_9.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_80_9.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t\t\t<td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(42);
                out.setTag("if",5061,5103);
                RuntimeTagElement _jettag_c_if_82_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_82_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_82_11.setRuntimeParent(_jettag_c_if_80_9);
                _jettag_c_if_82_11.setTagInfo(_td_c_if_82_11);
                _jettag_c_if_82_11.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_82_11.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" aria-label=\"Editar\" onclick=\"javascript: update");  //$NON-NLS-1$        
                    out.setTag("get",5208,5247);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(39);
                    RuntimeTagElement _jettag_c_get_83_105 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_83_105); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_83_105.setRuntimeParent(_jettag_c_if_82_11);
                    _jettag_c_get_83_105.setTagInfo(_td_c_get_83_105);
                    _jettag_c_get_83_105.doStart(context, out);
                    _jettag_c_get_83_105.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("(<?php echo $row->getId(); ?>);\">");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-pencil\" aria-hidden=\"true\"></span>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t</button>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_82_11.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_82_11.doEnd();
                out.endTag("if",289);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(45);
                out.setTag("if",5410,5455);
                RuntimeTagElement _jettag_c_if_87_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_87_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_87_11.setRuntimeParent(_jettag_c_if_80_9);
                _jettag_c_if_87_11.setTagInfo(_td_c_if_87_11);
                _jettag_c_if_87_11.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_87_11.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" aria-label=\"Apagar\" onclick=\"javascript: delete");  //$NON-NLS-1$        
                    out.setTag("get",5560,5599);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(39);
                    RuntimeTagElement _jettag_c_get_88_105 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_88_105); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_88_105.setRuntimeParent(_jettag_c_if_87_11);
                    _jettag_c_get_88_105.setTagInfo(_td_c_get_88_105);
                    _jettag_c_get_88_105.doStart(context, out);
                    _jettag_c_get_88_105.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("(<?php echo $row->getId(); ?>, '");  //$NON-NLS-1$        
                    out.setTag("get",5631,5668);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(37);
                    RuntimeTagElement _jettag_c_get_88_176 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_88_176); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_88_176.setRuntimeParent(_jettag_c_if_87_11);
                    _jettag_c_get_88_176.setTagInfo(_td_c_get_88_176);
                    _jettag_c_get_88_176.doStart(context, out);
                    _jettag_c_get_88_176.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("');\">");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-trash\" aria-hidden=\"true\"></span>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t</button>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_87_11.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_87_11.doEnd();
                out.endTag("if",329);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t\t\t</td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_80_9.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_80_9.doEnd();
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
            out.write("\t\t\t</table>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</div>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</div>");  //$NON-NLS-1$        
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_iterate_1_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_1_1.doEnd();
        out.loopEnd();
        out.endTag("iterate",5834);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.popTemplateFile();
    }
}
