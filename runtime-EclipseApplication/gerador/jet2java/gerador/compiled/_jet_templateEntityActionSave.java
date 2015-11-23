package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_templateEntityActionSave implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_templateEntityActionSave(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_2_25 = new TagInfo("c:get", //$NON-NLS-1$
            2, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_25 = new TagInfo("c:get", //$NON-NLS-1$
            3, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_3 = new TagInfo("c:get", //$NON-NLS-1$
            5, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_54 = new TagInfo("c:get", //$NON-NLS-1$
            5, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_3 = new TagInfo("c:get", //$NON-NLS-1$
            6, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_56 = new TagInfo("c:get", //$NON-NLS-1$
            6, 56,
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
                "($currentFeature/EntityType/entity/@name != '') and (($currentFeature/@min > 1) or ($currentFeature/@max > 1))", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_4 = new TagInfo("c:get", //$NON-NLS-1$
            10, 4,
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
    private static final TagInfo _td_c_get_15_7 = new TagInfo("c:get", //$NON-NLS-1$
            15, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_54 = new TagInfo("c:get", //$NON-NLS-1$
            15, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_7 = new TagInfo("c:get", //$NON-NLS-1$
            16, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_7 = new TagInfo("c:get", //$NON-NLS-1$
            17, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_51 = new TagInfo("c:get", //$NON-NLS-1$
            17, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_99 = new TagInfo("c:get", //$NON-NLS-1$
            17, 99,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_21_9 = new TagInfo("c:if", //$NON-NLS-1$
            21, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($currentFeature/EntityType/entity/@name != '')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_22_4 = new TagInfo("c:if", //$NON-NLS-1$
            22, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name = 'boolean')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_6 = new TagInfo("c:get", //$NON-NLS-1$
            23, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_50 = new TagInfo("c:get", //$NON-NLS-1$
            23, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_111 = new TagInfo("c:get", //$NON-NLS-1$
            23, 111,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_24_10 = new TagInfo("c:if", //$NON-NLS-1$
            24, 10,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/DataType/@name != 'boolean')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_6 = new TagInfo("c:get", //$NON-NLS-1$
            25, 6,
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
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_105 = new TagInfo("c:get", //$NON-NLS-1$
            25, 105,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_27_9 = new TagInfo("c:if", //$NON-NLS-1$
            27, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($currentFeature/EntityType/entity/@name != '') and ($currentFeature/@min <= 1) and ($currentFeature/@max <= 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_35 = new TagInfo("c:get", //$NON-NLS-1$
            28, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_4 = new TagInfo("c:get", //$NON-NLS-1$
            30, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_51 = new TagInfo("c:get", //$NON-NLS-1$
            30, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/EntityType/entity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_4 = new TagInfo("c:get", //$NON-NLS-1$
            31, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_4 = new TagInfo("c:get", //$NON-NLS-1$
            32, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_48 = new TagInfo("c:get", //$NON-NLS-1$
            32, 48,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_96 = new TagInfo("c:get", //$NON-NLS-1$
            32, 96,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_4 = new TagInfo("c:get", //$NON-NLS-1$
            36, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_14 = new TagInfo("c:get", //$NON-NLS-1$
            37, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_70 = new TagInfo("c:get", //$NON-NLS-1$
            37, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_14 = new TagInfo("c:get", //$NON-NLS-1$
            39, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_67 = new TagInfo("c:get", //$NON-NLS-1$
            39, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@className", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        out.write("<?php");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tinclude_once \"../class/");  //$NON-NLS-1$        
        out.setTag("get",30,74);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_2_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_25); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_2_25.setRuntimeParent(null);
        _jettag_c_get_2_25.setTagInfo(_td_c_get_2_25);
        _jettag_c_get_2_25.doStart(context, out);
        _jettag_c_get_2_25.doEnd();
        out.setTag(null,-1,-1);
        out.write(".class.php\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tinclude_once \"../class/");  //$NON-NLS-1$        
        out.setTag("get",111,155);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_3_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_25); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_25.setRuntimeParent(null);
        _jettag_c_get_3_25.setTagInfo(_td_c_get_3_25);
        _jettag_c_get_3_25.doStart(context, out);
        _jettag_c_get_3_25.doEnd();
        out.setTag(null,-1,-1);
        out.write("DB.class.php\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t$");  //$NON-NLS-1$        
        out.setTag("get",173,217);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_5_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_5_3.setRuntimeParent(null);
        _jettag_c_get_5_3.setTagInfo(_td_c_get_5_3);
        _jettag_c_get_5_3.doStart(context, out);
        _jettag_c_get_5_3.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = new ");  //$NON-NLS-1$        
        out.setTag("get",224,268);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_5_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_54); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_5_54.setRuntimeParent(null);
        _jettag_c_get_5_54.setTagInfo(_td_c_get_5_54);
        _jettag_c_get_5_54.doStart(context, out);
        _jettag_c_get_5_54.doEnd();
        out.setTag(null,-1,-1);
        out.write("();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t$");  //$NON-NLS-1$        
        out.setTag("get",274,318);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_6_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_6_3.setRuntimeParent(null);
        _jettag_c_get_6_3.setTagInfo(_td_c_get_6_3);
        _jettag_c_get_6_3.doStart(context, out);
        _jettag_c_get_6_3.doEnd();
        out.setTag(null,-1,-1);
        out.write("DB = new ");  //$NON-NLS-1$        
        out.setTag("get",327,371);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_6_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_56); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_6_56.setRuntimeParent(null);
        _jettag_c_get_6_56.setTagInfo(_td_c_get_6_56);
        _jettag_c_get_6_56.doStart(context, out);
        _jettag_c_get_6_56.doEnd();
        out.setTag(null,-1,-1);
        out.write("DB();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(66);
        out.setTag("iterate",379,445);
        RuntimeTagElement _jettag_c_iterate_8_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_8_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_8_2.setRuntimeParent(null);
        _jettag_c_iterate_8_2.setTagInfo(_td_c_iterate_8_2);
        _jettag_c_iterate_8_2.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_8_2.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_8_2.getTagInfo().getAttribute("delimiter"),379,445);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(124);
            out.setTag("if",445,569);
            RuntimeTagElement _jettag_c_if_9_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_9_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_9_3.setRuntimeParent(_jettag_c_iterate_8_2);
            _jettag_c_if_9_3.setTagInfo(_td_c_if_9_3);
            _jettag_c_if_9_3.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_9_3.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t$");  //$NON-NLS-1$        
                out.setTag("get",573,613);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_10_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_10_4.setRuntimeParent(_jettag_c_if_9_3);
                _jettag_c_get_10_4.setTagInfo(_td_c_get_10_4);
                _jettag_c_get_10_4.doStart(context, out);
                _jettag_c_get_10_4.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = array();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tif (isSet($_POST['txt");  //$NON-NLS-1$        
                out.setTag("get",648,706);
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
                out.write("\t\t\t$json = json_decode($_POST['txt");  //$NON-NLS-1$        
                out.setTag("get",747,805);
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
                out.write("\t\t\tif (is_array($json)) {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\tforeach ($json as $entity) {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",881,921);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_15_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_15_7.setRuntimeParent(_jettag_c_if_9_3);
                _jettag_c_get_15_7.setTagInfo(_td_c_get_15_7);
                _jettag_c_get_15_7.doStart(context, out);
                _jettag_c_get_15_7.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = new ");  //$NON-NLS-1$        
                out.setTag("get",928,986);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_15_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_54); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_15_54.setRuntimeParent(_jettag_c_if_9_3);
                _jettag_c_get_15_54.setTagInfo(_td_c_get_15_54);
                _jettag_c_get_15_54.doStart(context, out);
                _jettag_c_get_15_54.doEnd();
                out.setTag(null,-1,-1);
                out.write("();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",996,1036);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_16_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_16_7.setRuntimeParent(_jettag_c_if_9_3);
                _jettag_c_get_16_7.setTagInfo(_td_c_get_16_7);
                _jettag_c_get_16_7.doStart(context, out);
                _jettag_c_get_16_7.doEnd();
                out.setTag(null,-1,-1);
                out.write("->setId($entity[\"id\"]);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t$");  //$NON-NLS-1$        
                out.setTag("get",1066,1105);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_17_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_17_7.setRuntimeParent(_jettag_c_if_9_3);
                _jettag_c_get_17_7.setTagInfo(_td_c_get_17_7);
                _jettag_c_get_17_7.doStart(context, out);
                _jettag_c_get_17_7.doEnd();
                out.setTag(null,-1,-1);
                out.write("->add");  //$NON-NLS-1$        
                out.setTag("get",1110,1156);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_17_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_51); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_17_51.setRuntimeParent(_jettag_c_if_9_3);
                _jettag_c_get_17_51.setTagInfo(_td_c_get_17_51);
                _jettag_c_get_17_51.doStart(context, out);
                _jettag_c_get_17_51.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",1158,1198);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_17_99 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_99); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_17_99.setRuntimeParent(_jettag_c_if_9_3);
                _jettag_c_get_17_99.setTagInfo(_td_c_get_17_99);
                _jettag_c_get_17_99.doStart(context, out);
                _jettag_c_get_17_99.doEnd();
                out.setTag(null,-1,-1);
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_9_3.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_9_3.doEnd();
            out.endTag("if",648);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(67);
            out.setTag("if",1224,1291);
            RuntimeTagElement _jettag_c_if_21_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_21_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_21_9.setRuntimeParent(_jettag_c_iterate_8_2);
            _jettag_c_if_21_9.setTagInfo(_td_c_if_21_9);
            _jettag_c_if_21_9.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_21_9.okToProcessBody()) {
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(62);
                out.setTag("if",1291,1353);
                RuntimeTagElement _jettag_c_if_22_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_22_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_22_4.setRuntimeParent(_jettag_c_if_21_9);
                _jettag_c_if_22_4.setTagInfo(_td_c_if_22_4);
                _jettag_c_if_22_4.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_22_4.okToProcessBody()) {
                    out.write("$");  //$NON-NLS-1$        
                    out.setTag("get",1354,1393);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(39);
                    RuntimeTagElement _jettag_c_get_23_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_6); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_23_6.setRuntimeParent(_jettag_c_if_22_4);
                    _jettag_c_get_23_6.setTagInfo(_td_c_get_23_6);
                    _jettag_c_get_23_6.doStart(context, out);
                    _jettag_c_get_23_6.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->set");  //$NON-NLS-1$        
                    out.setTag("get",1398,1444);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_23_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_50); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_23_50.setRuntimeParent(_jettag_c_if_22_4);
                    _jettag_c_get_23_50.setTagInfo(_td_c_get_23_50);
                    _jettag_c_get_23_50.doStart(context, out);
                    _jettag_c_get_23_50.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("(isSet($_POST[\"");  //$NON-NLS-1$        
                    out.setTag("get",1459,1499);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_23_111 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_111); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_23_111.setRuntimeParent(_jettag_c_if_22_4);
                    _jettag_c_get_23_111.setTagInfo(_td_c_get_23_111);
                    _jettag_c_get_23_111.doStart(context, out);
                    _jettag_c_get_23_111.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\"]));");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_22_4.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_22_4.doEnd();
                out.endTag("if",154);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(63);
                out.setTag("if",1514,1577);
                RuntimeTagElement _jettag_c_if_24_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_24_10); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_24_10.setRuntimeParent(_jettag_c_if_21_9);
                _jettag_c_if_24_10.setTagInfo(_td_c_if_24_10);
                _jettag_c_if_24_10.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_24_10.okToProcessBody()) {
                    out.write("$");  //$NON-NLS-1$        
                    out.setTag("get",1578,1617);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(39);
                    RuntimeTagElement _jettag_c_get_25_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_6); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_25_6.setRuntimeParent(_jettag_c_if_24_10);
                    _jettag_c_get_25_6.setTagInfo(_td_c_get_25_6);
                    _jettag_c_get_25_6.doStart(context, out);
                    _jettag_c_get_25_6.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("->set");  //$NON-NLS-1$        
                    out.setTag("get",1622,1668);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(46);
                    RuntimeTagElement _jettag_c_get_25_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_50); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_25_50.setRuntimeParent(_jettag_c_if_24_10);
                    _jettag_c_get_25_50.setTagInfo(_td_c_get_25_50);
                    _jettag_c_get_25_50.doStart(context, out);
                    _jettag_c_get_25_50.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("($_POST[\"");  //$NON-NLS-1$        
                    out.setTag("get",1677,1717);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(40);
                    RuntimeTagElement _jettag_c_get_25_105 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_105); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_25_105.setRuntimeParent(_jettag_c_if_24_10);
                    _jettag_c_get_25_105.setTagInfo(_td_c_get_25_105);
                    _jettag_c_get_25_105.doStart(context, out);
                    _jettag_c_get_25_105.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\"]);");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_24_10.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_24_10.doEnd();
                out.endTag("if",147);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_21_9.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_21_9.doEnd();
            out.endTag("if",442);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(128);
            out.setTag("if",1740,1868);
            RuntimeTagElement _jettag_c_if_27_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_27_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_27_9.setRuntimeParent(_jettag_c_iterate_8_2);
            _jettag_c_if_27_9.setTagInfo(_td_c_if_27_9);
            _jettag_c_if_27_9.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_27_9.okToProcessBody()) {
                out.write("$json = json_decode($_POST['txt");  //$NON-NLS-1$        
                out.setTag("get",1899,1957);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_28_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_35); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_28_35.setRuntimeParent(_jettag_c_if_27_9);
                _jettag_c_get_28_35.setTagInfo(_td_c_get_28_35);
                _jettag_c_get_28_35.doStart(context, out);
                _jettag_c_get_28_35.doEnd();
                out.setTag(null,-1,-1);
                out.write("'], true);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t$");  //$NON-NLS-1$        
                out.setTag("get",1974,2014);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_30_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_30_4.setRuntimeParent(_jettag_c_if_27_9);
                _jettag_c_get_30_4.setTagInfo(_td_c_get_30_4);
                _jettag_c_get_30_4.doStart(context, out);
                _jettag_c_get_30_4.doEnd();
                out.setTag(null,-1,-1);
                out.write(" = new ");  //$NON-NLS-1$        
                out.setTag("get",2021,2079);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(58);
                RuntimeTagElement _jettag_c_get_30_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_51); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_30_51.setRuntimeParent(_jettag_c_if_27_9);
                _jettag_c_get_30_51.setTagInfo(_td_c_get_30_51);
                _jettag_c_get_30_51.doStart(context, out);
                _jettag_c_get_30_51.doEnd();
                out.setTag(null,-1,-1);
                out.write("();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t$");  //$NON-NLS-1$        
                out.setTag("get",2086,2126);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_31_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_31_4.setRuntimeParent(_jettag_c_if_27_9);
                _jettag_c_get_31_4.setTagInfo(_td_c_get_31_4);
                _jettag_c_get_31_4.doStart(context, out);
                _jettag_c_get_31_4.doEnd();
                out.setTag(null,-1,-1);
                out.write("->setId($json[0][\"id\"]);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t$");  //$NON-NLS-1$        
                out.setTag("get",2154,2193);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(39);
                RuntimeTagElement _jettag_c_get_32_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_32_4.setRuntimeParent(_jettag_c_if_27_9);
                _jettag_c_get_32_4.setTagInfo(_td_c_get_32_4);
                _jettag_c_get_32_4.doStart(context, out);
                _jettag_c_get_32_4.doEnd();
                out.setTag(null,-1,-1);
                out.write("->set");  //$NON-NLS-1$        
                out.setTag("get",2198,2244);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(46);
                RuntimeTagElement _jettag_c_get_32_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_48); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_32_48.setRuntimeParent(_jettag_c_if_27_9);
                _jettag_c_get_32_48.setTagInfo(_td_c_get_32_48);
                _jettag_c_get_32_48.doStart(context, out);
                _jettag_c_get_32_48.doEnd();
                out.setTag(null,-1,-1);
                out.write("($");  //$NON-NLS-1$        
                out.setTag("get",2246,2286);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_32_96 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_96); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_32_96.setRuntimeParent(_jettag_c_if_27_9);
                _jettag_c_get_32_96.setTagInfo(_td_c_get_32_96);
                _jettag_c_get_32_96.doStart(context, out);
                _jettag_c_get_32_96.doEnd();
                out.setTag(null,-1,-1);
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_27_9.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_27_9.doEnd();
            out.endTag("if",422);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_8_2.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_8_2.doEnd();
        out.loopEnd();
        out.endTag("iterate",1852);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write(NL);         
        out.write("\tif (isSet($_POST['id']) && $_POST['id'] > 0) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$");  //$NON-NLS-1$        
        out.setTag("get",2362,2401);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_36_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_36_4.setRuntimeParent(null);
        _jettag_c_get_36_4.setTagInfo(_td_c_get_36_4);
        _jettag_c_get_36_4.doStart(context, out);
        _jettag_c_get_36_4.doEnd();
        out.setTag(null,-1,-1);
        out.write("->setId($_POST[\"id\"]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$result = $");  //$NON-NLS-1$        
        out.setTag("get",2437,2481);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_37_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_37_14.setRuntimeParent(null);
        _jettag_c_get_37_14.setTagInfo(_td_c_get_37_14);
        _jettag_c_get_37_14.doStart(context, out);
        _jettag_c_get_37_14.doEnd();
        out.setTag(null,-1,-1);
        out.write("DB->update($");  //$NON-NLS-1$        
        out.setTag("get",2493,2537);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_37_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_70); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_37_70.setRuntimeParent(null);
        _jettag_c_get_37_70.setTagInfo(_td_c_get_37_70);
        _jettag_c_get_37_70.doStart(context, out);
        _jettag_c_get_37_70.doEnd();
        out.setTag(null,-1,-1);
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t} else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$result = $");  //$NON-NLS-1$        
        out.setTag("get",2563,2607);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_39_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_39_14.setRuntimeParent(null);
        _jettag_c_get_39_14.setTagInfo(_td_c_get_39_14);
        _jettag_c_get_39_14.doStart(context, out);
        _jettag_c_get_39_14.doEnd();
        out.setTag(null,-1,-1);
        out.write("DB->add($");  //$NON-NLS-1$        
        out.setTag("get",2616,2660);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_39_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_67); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_39_67.setRuntimeParent(null);
        _jettag_c_get_39_67.setTagInfo(_td_c_get_39_67);
        _jettag_c_get_39_67.doStart(context, out);
        _jettag_c_get_39_67.doEnd();
        out.setTag(null,-1,-1);
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tif ($result) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tdie('<META http-equiv=\"refresh\" content=\"1;URL=/' . $_POST[\"pageBack\"] . '.php?success=1\">');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t} else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tdie('<META http-equiv=\"refresh\" content=\"1;URL=/' . $_POST[\"pageBack\"] . '.php?error=1\">');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("?>");  //$NON-NLS-1$        
        out.popTemplateFile();
    }
}
