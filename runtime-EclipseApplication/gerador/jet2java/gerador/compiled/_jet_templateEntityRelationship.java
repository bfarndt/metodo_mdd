package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_templateEntityRelationship implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_templateEntityRelationship(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_33 = new TagInfo("c:get", //$NON-NLS-1$
            1, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_2_87 = new TagInfo("c:get", //$NON-NLS-1$
            2, 87,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationship/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_2_138 = new TagInfo("c:get", //$NON-NLS-1$
            2, 138,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentForm/@currentFormType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_31 = new TagInfo("c:get", //$NON-NLS-1$
            3, 31,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationship/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_91 = new TagInfo("c:get", //$NON-NLS-1$
            3, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationship/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_142 = new TagInfo("c:get", //$NON-NLS-1$
            3, 142,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentForm/@currentFormType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_35 = new TagInfo("c:get", //$NON-NLS-1$
            5, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationship/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_86 = new TagInfo("c:get", //$NON-NLS-1$
            5, 86,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentForm/@currentFormType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_47 = new TagInfo("c:get", //$NON-NLS-1$
            9, 47,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_21 = new TagInfo("c:get", //$NON-NLS-1$
            12, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationship/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_72 = new TagInfo("c:get", //$NON-NLS-1$
            12, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentForm/@currentFormType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_17_8 = new TagInfo("c:iterate", //$NON-NLS-1$
            17, 8,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationship/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_25 = new TagInfo("c:get", //$NON-NLS-1$
            18, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_88 = new TagInfo("c:get", //$NON-NLS-1$
            18, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_28 = new TagInfo("c:get", //$NON-NLS-1$
            24, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationship/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_9 = new TagInfo("c:get", //$NON-NLS-1$
            26, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationship/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_74 = new TagInfo("c:get", //$NON-NLS-1$
            26, 74,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationship/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_13 = new TagInfo("c:get", //$NON-NLS-1$
            27, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationship/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_68 = new TagInfo("c:get", //$NON-NLS-1$
            27, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationship/@className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_22 = new TagInfo("c:get", //$NON-NLS-1$
            28, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationship/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_81 = new TagInfo("c:get", //$NON-NLS-1$
            28, 81,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationship/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_29 = new TagInfo("c:get", //$NON-NLS-1$
            32, 29,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationship/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_33_10 = new TagInfo("c:iterate", //$NON-NLS-1$
            33, 10,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationship/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_30 = new TagInfo("c:get", //$NON-NLS-1$
            34, 30,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationship/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_86 = new TagInfo("c:get", //$NON-NLS-1$
            34, 86,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@methodName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_37 = new TagInfo("c:get", //$NON-NLS-1$
            42, 37,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationship/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_88 = new TagInfo("c:get", //$NON-NLS-1$
            42, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentForm/@currentFormType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_13 = new TagInfo("c:get", //$NON-NLS-1$
            50, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationship/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_64 = new TagInfo("c:get", //$NON-NLS-1$
            50, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentForm/@currentFormType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_11 = new TagInfo("c:get", //$NON-NLS-1$
            51, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationship/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_62 = new TagInfo("c:get", //$NON-NLS-1$
            51, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentForm/@currentFormType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_141 = new TagInfo("c:get", //$NON-NLS-1$
            51, 141,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationship/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_192 = new TagInfo("c:get", //$NON-NLS-1$
            51, 192,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentForm/@currentFormType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_14 = new TagInfo("c:get", //$NON-NLS-1$
            52, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntityRelationship/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_65 = new TagInfo("c:get", //$NON-NLS-1$
            52, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentForm/@currentFormType", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        out.write("<span class=\"input-group-addon\">");  //$NON-NLS-1$        
        out.setTag("get",32,72);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(40);
        RuntimeTagElement _jettag_c_get_1_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_33); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_33.setRuntimeParent(null);
        _jettag_c_get_1_33.setTagInfo(_td_c_get_1_33);
        _jettag_c_get_1_33.doStart(context, out);
        _jettag_c_get_1_33.doEnd();
        out.setTag(null,-1,-1);
        out.write("</span>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#select");  //$NON-NLS-1$        
        out.setTag("get",166,217);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(51);
        RuntimeTagElement _jettag_c_get_2_87 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_87); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_2_87.setRuntimeParent(null);
        _jettag_c_get_2_87.setTagInfo(_td_c_get_2_87);
        _jettag_c_get_2_87.doStart(context, out);
        _jettag_c_get_2_87.doEnd();
        out.setTag(null,-1,-1);
        out.setTag("get",217,265);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(48);
        RuntimeTagElement _jettag_c_get_2_138 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_138); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_2_138.setRuntimeParent(null);
        _jettag_c_get_2_138.setTagInfo(_td_c_get_2_138);
        _jettag_c_get_2_138.doStart(context, out);
        _jettag_c_get_2_138.doEnd();
        out.setTag(null,-1,-1);
        out.write("\">Escolher</button>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<input type=\"hidden\" name=\"txt");  //$NON-NLS-1$        
        out.setTag("get",315,366);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(51);
        RuntimeTagElement _jettag_c_get_3_31 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_31); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_31.setRuntimeParent(null);
        _jettag_c_get_3_31.setTagInfo(_td_c_get_3_31);
        _jettag_c_get_3_31.doStart(context, out);
        _jettag_c_get_3_31.doEnd();
        out.setTag(null,-1,-1);
        out.write("\" id=\"txt");  //$NON-NLS-1$        
        out.setTag("get",375,426);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(51);
        RuntimeTagElement _jettag_c_get_3_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_91); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_91.setRuntimeParent(null);
        _jettag_c_get_3_91.setTagInfo(_td_c_get_3_91);
        _jettag_c_get_3_91.doStart(context, out);
        _jettag_c_get_3_91.doEnd();
        out.setTag(null,-1,-1);
        out.setTag("get",426,474);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(48);
        RuntimeTagElement _jettag_c_get_3_142 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_142); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_142.setRuntimeParent(null);
        _jettag_c_get_3_142.setTagInfo(_td_c_get_3_142);
        _jettag_c_get_3_142.doStart(context, out);
        _jettag_c_get_3_142.doEnd();
        out.setTag(null,-1,-1);
        out.write("\" value=\"\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<div class=\"modal fade\" id=\"select");  //$NON-NLS-1$        
        out.setTag("get",521,572);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(51);
        RuntimeTagElement _jettag_c_get_5_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_35); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_5_35.setRuntimeParent(null);
        _jettag_c_get_5_35.setTagInfo(_td_c_get_5_35);
        _jettag_c_get_5_35.doStart(context, out);
        _jettag_c_get_5_35.doEnd();
        out.setTag(null,-1,-1);
        out.setTag("get",572,620);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(48);
        RuntimeTagElement _jettag_c_get_5_86 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_86); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_5_86.setRuntimeParent(null);
        _jettag_c_get_5_86.setTagInfo(_td_c_get_5_86);
        _jettag_c_get_5_86.doStart(context, out);
        _jettag_c_get_5_86.doEnd();
        out.setTag(null,-1,-1);
        out.write("\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"modal-dialog\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<div class=\"modal-content\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<div class=\"modal-header\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t<h4 class=\"modal-title\" id=\"myModalLabel\">");  //$NON-NLS-1$        
        out.setTag("get",835,875);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(40);
        RuntimeTagElement _jettag_c_get_9_47 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_47); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_47.setRuntimeParent(null);
        _jettag_c_get_9_47.setTagInfo(_td_c_get_9_47);
        _jettag_c_get_9_47.doStart(context, out);
        _jettag_c_get_9_47.doEnd();
        out.setTag(null,-1,-1);
        out.write("</h4>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<div class=\"modal-body\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t<table id=\"table");  //$NON-NLS-1$        
        out.setTag("get",939,990);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(51);
        RuntimeTagElement _jettag_c_get_12_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_21); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_21.setRuntimeParent(null);
        _jettag_c_get_12_21.setTagInfo(_td_c_get_12_21);
        _jettag_c_get_12_21.doStart(context, out);
        _jettag_c_get_12_21.doEnd();
        out.setTag(null,-1,-1);
        out.setTag("get",990,1038);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(48);
        RuntimeTagElement _jettag_c_get_12_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_72); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_72.setRuntimeParent(null);
        _jettag_c_get_12_72.setTagInfo(_td_c_get_12_72);
        _jettag_c_get_12_72.doStart(context, out);
        _jettag_c_get_12_72.doEnd();
        out.setTag(null,-1,-1);
        out.write("\" class=\"table table-striped\" data-toggle=\"table\" data-sort-name=\"id\" data-sort-order=\"inc\" data-pagination=\"true\" data-page-size=\"10\" data-click-to-select=\"true\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t<thead>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t<tr>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t<th data-field=\"selecao\" data-checkbox=\"true\"></th>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t<th data-field=\"id\" data-sortable=\"true\">ID</th>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(76);
        out.setTag("iterate",1348,1424);
        RuntimeTagElement _jettag_c_iterate_17_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_17_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_17_8.setRuntimeParent(null);
        _jettag_c_iterate_17_8.setTagInfo(_td_c_iterate_17_8);
        _jettag_c_iterate_17_8.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_17_8.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_17_8.getTagInfo().getAttribute("delimiter"),1348,1424);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\t\t\t\t\t\t\t<th data-field=\"");  //$NON-NLS-1$        
            out.setTag("get",1449,1489);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(40);
            RuntimeTagElement _jettag_c_get_18_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_25); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_18_25.setRuntimeParent(_jettag_c_iterate_17_8);
            _jettag_c_get_18_25.setTagInfo(_td_c_get_18_25);
            _jettag_c_get_18_25.doStart(context, out);
            _jettag_c_get_18_25.doEnd();
            out.setTag(null,-1,-1);
            out.write("\" data-sortable=\"true\">");  //$NON-NLS-1$        
            out.setTag("get",1512,1552);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(40);
            RuntimeTagElement _jettag_c_get_18_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_88); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_18_88.setRuntimeParent(_jettag_c_iterate_17_8);
            _jettag_c_get_18_88.setTagInfo(_td_c_get_18_88);
            _jettag_c_get_18_88.doStart(context, out);
            _jettag_c_get_18_88.doEnd();
            out.setTag(null,-1,-1);
            out.write("</th>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_17_8.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_17_8.doEnd();
        out.loopEnd();
        out.endTag("iterate",141);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\t\t\t\t</tr>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t</thead>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t<tbody>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t<?php");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tinclude_once \"class/");  //$NON-NLS-1$        
        out.setTag("get",1656,1712);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(56);
        RuntimeTagElement _jettag_c_get_24_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_28); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_24_28.setRuntimeParent(null);
        _jettag_c_get_24_28.setTagInfo(_td_c_get_24_28);
        _jettag_c_get_24_28.doStart(context, out);
        _jettag_c_get_24_28.doEnd();
        out.setTag(null,-1,-1);
        out.write("DB.class.php\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t$");  //$NON-NLS-1$        
        out.setTag("get",1736,1792);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(56);
        RuntimeTagElement _jettag_c_get_26_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_26_9.setRuntimeParent(null);
        _jettag_c_get_26_9.setTagInfo(_td_c_get_26_9);
        _jettag_c_get_26_9.doStart(context, out);
        _jettag_c_get_26_9.doEnd();
        out.setTag(null,-1,-1);
        out.write("DB = new ");  //$NON-NLS-1$        
        out.setTag("get",1801,1857);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(56);
        RuntimeTagElement _jettag_c_get_26_74 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_74); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_26_74.setRuntimeParent(null);
        _jettag_c_get_26_74.setTagInfo(_td_c_get_26_74);
        _jettag_c_get_26_74.doStart(context, out);
        _jettag_c_get_26_74.doEnd();
        out.setTag(null,-1,-1);
        out.write("DB();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t$rows");  //$NON-NLS-1$        
        out.setTag("get",1875,1926);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(51);
        RuntimeTagElement _jettag_c_get_27_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_27_13.setRuntimeParent(null);
        _jettag_c_get_27_13.setTagInfo(_td_c_get_27_13);
        _jettag_c_get_27_13.doStart(context, out);
        _jettag_c_get_27_13.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = $");  //$NON-NLS-1$        
        out.setTag("get",1930,1986);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(56);
        RuntimeTagElement _jettag_c_get_27_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_68); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_27_68.setRuntimeParent(null);
        _jettag_c_get_27_68.setTagInfo(_td_c_get_27_68);
        _jettag_c_get_27_68.doStart(context, out);
        _jettag_c_get_27_68.doEnd();
        out.setTag(null,-1,-1);
        out.write("DB->getAll();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tforeach ($rows");  //$NON-NLS-1$        
        out.setTag("get",2021,2072);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(51);
        RuntimeTagElement _jettag_c_get_28_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_22); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_28_22.setRuntimeParent(null);
        _jettag_c_get_28_22.setTagInfo(_td_c_get_28_22);
        _jettag_c_get_28_22.doStart(context, out);
        _jettag_c_get_28_22.doEnd();
        out.setTag(null,-1,-1);
        out.write(" as $row");  //$NON-NLS-1$        
        out.setTag("get",2080,2131);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(51);
        RuntimeTagElement _jettag_c_get_28_81 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_81); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_28_81.setRuntimeParent(null);
        _jettag_c_get_28_81.setTagInfo(_td_c_get_28_81);
        _jettag_c_get_28_81.doStart(context, out);
        _jettag_c_get_28_81.doEnd();
        out.setTag(null,-1,-1);
        out.write(") {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t<tr>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\t<td></td>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\t<td><?php echo $row");  //$NON-NLS-1$        
        out.setTag("get",2206,2257);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(51);
        RuntimeTagElement _jettag_c_get_32_29 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_29); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_32_29.setRuntimeParent(null);
        _jettag_c_get_32_29.setTagInfo(_td_c_get_32_29);
        _jettag_c_get_32_29.doStart(context, out);
        _jettag_c_get_32_29.doEnd();
        out.setTag(null,-1,-1);
        out.write("->getId(); ?></td>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(76);
        out.setTag("iterate",2285,2361);
        RuntimeTagElement _jettag_c_iterate_33_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_33_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_33_10.setRuntimeParent(null);
        _jettag_c_iterate_33_10.setTagInfo(_td_c_iterate_33_10);
        _jettag_c_iterate_33_10.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_33_10.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_33_10.getTagInfo().getAttribute("delimiter"),2285,2361);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\t\t\t\t\t\t\t\t\t<td><?php echo $row");  //$NON-NLS-1$        
            out.setTag("get",2391,2442);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(51);
            RuntimeTagElement _jettag_c_get_34_30 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_30); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_34_30.setRuntimeParent(_jettag_c_iterate_33_10);
            _jettag_c_get_34_30.setTagInfo(_td_c_get_34_30);
            _jettag_c_get_34_30.doStart(context, out);
            _jettag_c_get_34_30.doEnd();
            out.setTag(null,-1,-1);
            out.write("->get");  //$NON-NLS-1$        
            out.setTag("get",2447,2493);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(46);
            RuntimeTagElement _jettag_c_get_34_86 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_86); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_34_86.setRuntimeParent(_jettag_c_iterate_33_10);
            _jettag_c_get_34_86.setTagInfo(_td_c_get_34_86);
            _jettag_c_get_34_86.doStart(context, out);
            _jettag_c_get_34_86.doEnd();
            out.setTag(null,-1,-1);
            out.write("(); ?></td>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t\t\t\t\t");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_33_10.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_33_10.doEnd();
        out.loopEnd();
        out.endTag("iterate",153);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t</tr>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t<?php } ?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t</tbody>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t</table>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<div class=\"modal-footer\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t<button type=\"button\" id=\"button");  //$NON-NLS-1$        
        out.setTag("get",2661,2712);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(51);
        RuntimeTagElement _jettag_c_get_42_37 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_37); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_42_37.setRuntimeParent(null);
        _jettag_c_get_42_37.setTagInfo(_td_c_get_42_37);
        _jettag_c_get_42_37.doStart(context, out);
        _jettag_c_get_42_37.doEnd();
        out.setTag(null,-1,-1);
        out.setTag("get",2712,2760);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(48);
        RuntimeTagElement _jettag_c_get_42_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_88); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_42_88.setRuntimeParent(null);
        _jettag_c_get_42_88.setTagInfo(_td_c_get_42_88);
        _jettag_c_get_42_88.doStart(context, out);
        _jettag_c_get_42_88.doEnd();
        out.setTag(null,-1,-1);
        out.write("\" class=\"btn btn-primary\">Selecionar</button>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<script type=\"text/javascript\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t$(function() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$(\"#button");  //$NON-NLS-1$        
        out.setTag("get",2901,2952);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(51);
        RuntimeTagElement _jettag_c_get_50_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_50_13.setRuntimeParent(null);
        _jettag_c_get_50_13.setTagInfo(_td_c_get_50_13);
        _jettag_c_get_50_13.doStart(context, out);
        _jettag_c_get_50_13.doEnd();
        out.setTag(null,-1,-1);
        out.setTag("get",2952,3000);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(48);
        RuntimeTagElement _jettag_c_get_50_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_64); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_50_64.setRuntimeParent(null);
        _jettag_c_get_50_64.setTagInfo(_td_c_get_50_64);
        _jettag_c_get_50_64.doStart(context, out);
        _jettag_c_get_50_64.doEnd();
        out.setTag(null,-1,-1);
        out.write("\").click(function() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t$(\"#txt");  //$NON-NLS-1$        
        out.setTag("get",3032,3083);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(51);
        RuntimeTagElement _jettag_c_get_51_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_11); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_51_11.setRuntimeParent(null);
        _jettag_c_get_51_11.setTagInfo(_td_c_get_51_11);
        _jettag_c_get_51_11.doStart(context, out);
        _jettag_c_get_51_11.doEnd();
        out.setTag(null,-1,-1);
        out.setTag("get",3083,3131);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(48);
        RuntimeTagElement _jettag_c_get_51_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_62); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_51_62.setRuntimeParent(null);
        _jettag_c_get_51_62.setTagInfo(_td_c_get_51_62);
        _jettag_c_get_51_62.doStart(context, out);
        _jettag_c_get_51_62.doEnd();
        out.setTag(null,-1,-1);
        out.write("\").val(JSON.stringify($(\"#table");  //$NON-NLS-1$        
        out.setTag("get",3162,3213);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(51);
        RuntimeTagElement _jettag_c_get_51_141 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_141); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_51_141.setRuntimeParent(null);
        _jettag_c_get_51_141.setTagInfo(_td_c_get_51_141);
        _jettag_c_get_51_141.doStart(context, out);
        _jettag_c_get_51_141.doEnd();
        out.setTag(null,-1,-1);
        out.setTag("get",3213,3261);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(48);
        RuntimeTagElement _jettag_c_get_51_192 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_192); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_51_192.setRuntimeParent(null);
        _jettag_c_get_51_192.setTagInfo(_td_c_get_51_192);
        _jettag_c_get_51_192.doStart(context, out);
        _jettag_c_get_51_192.doEnd();
        out.setTag(null,-1,-1);
        out.write("\").bootstrapTable('getSelections')));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t$(\"#select");  //$NON-NLS-1$        
        out.setTag("get",3312,3363);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(51);
        RuntimeTagElement _jettag_c_get_52_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_52_14.setRuntimeParent(null);
        _jettag_c_get_52_14.setTagInfo(_td_c_get_52_14);
        _jettag_c_get_52_14.doStart(context, out);
        _jettag_c_get_52_14.doEnd();
        out.setTag(null,-1,-1);
        out.setTag("get",3363,3411);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(48);
        RuntimeTagElement _jettag_c_get_52_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_65); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_52_65.setRuntimeParent(null);
        _jettag_c_get_52_65.setTagInfo(_td_c_get_52_65);
        _jettag_c_get_52_65.doStart(context, out);
        _jettag_c_get_52_65.doEnd();
        out.setTag(null,-1,-1);
        out.write("\").modal('hide');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</script>");  //$NON-NLS-1$        
        out.popTemplateFile();
    }
}
