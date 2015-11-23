package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_pagejsp implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_pagejsp(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_if_10_1 = new TagInfo("c:if", //$NON-NLS-1$
            10, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$featuresModel/WebDomainFeatures/@userContent = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_8 = new TagInfo("c:get", //$NON-NLS-1$
            18, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$page/@title", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_26_1 = new TagInfo("c:if", //$NON-NLS-1$
            26, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$page/top", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_27_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            27, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$page/top", //$NON-NLS-1$
                "component", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_28_2 = new TagInfo("c:set", //$NON-NLS-1$
            28, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$component", //$NON-NLS-1$
                "location", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_29_2 = new TagInfo("c:include", //$NON-NLS-1$
            29, 2,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/navigation/pages/components.jet", //$NON-NLS-1$
                "component,featuresModel", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_35_1 = new TagInfo("c:if", //$NON-NLS-1$
            35, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$page/left", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_36_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            36, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$page/left", //$NON-NLS-1$
                "component", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_37_2 = new TagInfo("c:set", //$NON-NLS-1$
            37, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$component", //$NON-NLS-1$
                "location", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_38_2 = new TagInfo("c:include", //$NON-NLS-1$
            38, 2,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/navigation/pages/components.jet", //$NON-NLS-1$
                "component,featuresModel", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_44_1 = new TagInfo("c:if", //$NON-NLS-1$
            44, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$page/main", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_45_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            45, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$page/main", //$NON-NLS-1$
                "component", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_46_2 = new TagInfo("c:set", //$NON-NLS-1$
            46, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$component", //$NON-NLS-1$
                "location", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_47_2 = new TagInfo("c:include", //$NON-NLS-1$
            47, 2,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/navigation/pages/components.jet", //$NON-NLS-1$
                "component,featuresModel", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_53_1 = new TagInfo("c:if", //$NON-NLS-1$
            53, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$page/right", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_54_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            54, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$page/right", //$NON-NLS-1$
                "component", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_55_2 = new TagInfo("c:set", //$NON-NLS-1$
            55, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$component", //$NON-NLS-1$
                "location", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_56_2 = new TagInfo("c:include", //$NON-NLS-1$
            56, 2,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/navigation/pages/components.jet", //$NON-NLS-1$
                "component,featuresModel", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_62_1 = new TagInfo("c:if", //$NON-NLS-1$
            62, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$page/left", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_63_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            63, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$page/bottom", //$NON-NLS-1$
                "component", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_64_2 = new TagInfo("c:set", //$NON-NLS-1$
            64, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$component", //$NON-NLS-1$
                "location", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_65_2 = new TagInfo("c:include", //$NON-NLS-1$
            65, 2,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/navigation/pages/components.jet", //$NON-NLS-1$
                "component,featuresModel", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(36);
        out.write(NL);         
        out.write("<%@ page language=\"java\" contentType=\"text/html; charset=ISO-8859-1\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    pageEncoding=\"ISO-8859-1\"%>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<%@page import=\"generated.beans.*\"%>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<%@page import=\"generated.daos.*\"%>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<%@page import=\"java.util.*\"%>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<%@page import=\"core.database.*\"%>");  //$NON-NLS-1$        
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(68);
        out.setTag("if",381,449);
        RuntimeTagElement _jettag_c_if_10_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_10_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_10_1.setRuntimeParent(null);
        _jettag_c_if_10_1.setTagInfo(_td_c_if_10_1);
        _jettag_c_if_10_1.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_c_if_10_1.okToProcessBody()) {
            out.write(NL);         
            out.write("<%@page import=\"generated.usercontent.*\"%>");  //$NON-NLS-1$        
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_if_10_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_if_10_1.doEnd();
        out.endTag("if",44);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(NL);         
        out.write(NL);         
        out.write("<html>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<head>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/navigation.css\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<title>");  //$NON-NLS-1$        
        out.setTag("get",667,698);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(31);
        RuntimeTagElement _jettag_c_get_18_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_18_8.setRuntimeParent(null);
        _jettag_c_get_18_8.setTagInfo(_td_c_get_18_8);
        _jettag_c_get_18_8.doStart(context, out);
        _jettag_c_get_18_8.doEnd();
        out.setTag(null,-1,-1);
        out.write("</title>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<script type=\"text/javascript\" src=\"../js/util.js\"></script>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</head>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<body>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<table class=\"navMainTable\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<tr><td class=\"navTopArea\" colspan=\"3\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<!-- begin top -->");  //$NON-NLS-1$        
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(23);
        out.setTag("if",872,895);
        RuntimeTagElement _jettag_c_if_26_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_26_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_26_1.setRuntimeParent(null);
        _jettag_c_if_26_1.setTagInfo(_td_c_if_26_1);
        _jettag_c_if_26_1.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_c_if_26_1.okToProcessBody()) {
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.setTag("setVariable",897,949);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(52);
            RuntimeTagElement _jettag_c_setVariable_27_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_27_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_27_2.setRuntimeParent(_jettag_c_if_26_1);
            _jettag_c_setVariable_27_2.setTagInfo(_td_c_setVariable_27_2);
            _jettag_c_setVariable_27_2.doStart(context, out);
            _jettag_c_setVariable_27_2.doEnd();
            out.setTag(null,-1,-1);
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(43);
            out.setTag("set",951,994);
            RuntimeTagElement _jettag_c_set_28_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_28_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_28_2.setRuntimeParent(_jettag_c_if_26_1);
            _jettag_c_set_28_2.setTagInfo(_td_c_set_28_2);
            _jettag_c_set_28_2.doStart(context, out);
            JET2Writer _jettag_c_set_28_2_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_c_set_28_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("top");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_set_28_2.handleBodyContent(out);
            }
            out = _jettag_c_set_28_2_saved_out;
    out.bodyContentEnd();
            _jettag_c_set_28_2.doEnd();
            out.endTag("set",3);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(8);
            out.write(" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.setTag("include",1008,1114);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(106);
            out.includeStart();
            RuntimeTagElement _jettag_c_include_29_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_29_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_29_2.setRuntimeParent(_jettag_c_if_26_1);
            _jettag_c_include_29_2.setTagInfo(_td_c_include_29_2);
            _jettag_c_include_29_2.doStart(context, out);
            _jettag_c_include_29_2.doEnd();
            out.setTag(null,-1,-1);
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_if_26_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_if_26_1.doEnd();
        out.endTag("if",220);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(NL);         
        out.write("<!-- end top -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</td></tr>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<tr><td class=\"navLeftArea\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<!-- begin left -->");  //$NON-NLS-1$        
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(24);
        out.setTag("if",1200,1224);
        RuntimeTagElement _jettag_c_if_35_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_35_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_35_1.setRuntimeParent(null);
        _jettag_c_if_35_1.setTagInfo(_td_c_if_35_1);
        _jettag_c_if_35_1.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_c_if_35_1.okToProcessBody()) {
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.setTag("setVariable",1226,1279);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(53);
            RuntimeTagElement _jettag_c_setVariable_36_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_36_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_36_2.setRuntimeParent(_jettag_c_if_35_1);
            _jettag_c_setVariable_36_2.setTagInfo(_td_c_setVariable_36_2);
            _jettag_c_setVariable_36_2.doStart(context, out);
            _jettag_c_setVariable_36_2.doEnd();
            out.setTag(null,-1,-1);
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(43);
            out.setTag("set",1281,1324);
            RuntimeTagElement _jettag_c_set_37_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_37_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_37_2.setRuntimeParent(_jettag_c_if_35_1);
            _jettag_c_set_37_2.setTagInfo(_td_c_set_37_2);
            _jettag_c_set_37_2.doStart(context, out);
            JET2Writer _jettag_c_set_37_2_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_c_set_37_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("left");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_set_37_2.handleBodyContent(out);
            }
            out = _jettag_c_set_37_2_saved_out;
    out.bodyContentEnd();
            _jettag_c_set_37_2.doEnd();
            out.endTag("set",4);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(8);
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.setTag("include",1338,1444);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(106);
            out.includeStart();
            RuntimeTagElement _jettag_c_include_38_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_38_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_38_2.setRuntimeParent(_jettag_c_if_35_1);
            _jettag_c_include_38_2.setTagInfo(_td_c_include_38_2);
            _jettag_c_include_38_2.doStart(context, out);
            _jettag_c_include_38_2.doEnd();
            out.setTag(null,-1,-1);
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_if_35_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_if_35_1.doEnd();
        out.endTag("if",221);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(NL);         
        out.write("<!-- end left -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</td>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<td class=\"navMainArea\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<!-- begin main -->");  //$NON-NLS-1$        
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(24);
        out.setTag("if",1522,1546);
        RuntimeTagElement _jettag_c_if_44_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_44_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_44_1.setRuntimeParent(null);
        _jettag_c_if_44_1.setTagInfo(_td_c_if_44_1);
        _jettag_c_if_44_1.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_c_if_44_1.okToProcessBody()) {
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.setTag("setVariable",1548,1601);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(53);
            RuntimeTagElement _jettag_c_setVariable_45_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_45_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_45_2.setRuntimeParent(_jettag_c_if_44_1);
            _jettag_c_setVariable_45_2.setTagInfo(_td_c_setVariable_45_2);
            _jettag_c_setVariable_45_2.doStart(context, out);
            _jettag_c_setVariable_45_2.doEnd();
            out.setTag(null,-1,-1);
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(43);
            out.setTag("set",1603,1646);
            RuntimeTagElement _jettag_c_set_46_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_46_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_46_2.setRuntimeParent(_jettag_c_if_44_1);
            _jettag_c_set_46_2.setTagInfo(_td_c_set_46_2);
            _jettag_c_set_46_2.doStart(context, out);
            JET2Writer _jettag_c_set_46_2_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_c_set_46_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("main");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_set_46_2.handleBodyContent(out);
            }
            out = _jettag_c_set_46_2_saved_out;
    out.bodyContentEnd();
            _jettag_c_set_46_2.doEnd();
            out.endTag("set",4);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(8);
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.setTag("include",1660,1766);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(106);
            out.includeStart();
            RuntimeTagElement _jettag_c_include_47_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_47_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_47_2.setRuntimeParent(_jettag_c_if_44_1);
            _jettag_c_include_47_2.setTagInfo(_td_c_include_47_2);
            _jettag_c_include_47_2.doStart(context, out);
            _jettag_c_include_47_2.doEnd();
            out.setTag(null,-1,-1);
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_if_44_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_if_44_1.doEnd();
        out.endTag("if",221);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(NL);         
        out.write("<!-- end main -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</td>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<td class=\"navRightArea\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<!-- begin right -->");  //$NON-NLS-1$        
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(25);
        out.setTag("if",1846,1871);
        RuntimeTagElement _jettag_c_if_53_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_53_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_53_1.setRuntimeParent(null);
        _jettag_c_if_53_1.setTagInfo(_td_c_if_53_1);
        _jettag_c_if_53_1.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_c_if_53_1.okToProcessBody()) {
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.setTag("setVariable",1873,1927);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(54);
            RuntimeTagElement _jettag_c_setVariable_54_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_54_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_54_2.setRuntimeParent(_jettag_c_if_53_1);
            _jettag_c_setVariable_54_2.setTagInfo(_td_c_setVariable_54_2);
            _jettag_c_setVariable_54_2.doStart(context, out);
            _jettag_c_setVariable_54_2.doEnd();
            out.setTag(null,-1,-1);
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(43);
            out.setTag("set",1929,1972);
            RuntimeTagElement _jettag_c_set_55_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_55_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_55_2.setRuntimeParent(_jettag_c_if_53_1);
            _jettag_c_set_55_2.setTagInfo(_td_c_set_55_2);
            _jettag_c_set_55_2.doStart(context, out);
            JET2Writer _jettag_c_set_55_2_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_c_set_55_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("right");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_set_55_2.handleBodyContent(out);
            }
            out = _jettag_c_set_55_2_saved_out;
    out.bodyContentEnd();
            _jettag_c_set_55_2.doEnd();
            out.endTag("set",5);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(8);
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.setTag("include",1987,2093);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(106);
            out.includeStart();
            RuntimeTagElement _jettag_c_include_56_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_56_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_56_2.setRuntimeParent(_jettag_c_if_53_1);
            _jettag_c_include_56_2.setTagInfo(_td_c_include_56_2);
            _jettag_c_include_56_2.doStart(context, out);
            _jettag_c_include_56_2.doEnd();
            out.setTag(null,-1,-1);
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_if_53_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_if_53_1.doEnd();
        out.endTag("if",223);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(NL);         
        out.write("<!-- end right -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</td></tr>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<tr><td class=\"navBottomArea\" colspan=\"3\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<!-- begin bottom -->");  //$NON-NLS-1$        
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(24);
        out.setTag("if",2197,2221);
        RuntimeTagElement _jettag_c_if_62_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_62_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_62_1.setRuntimeParent(null);
        _jettag_c_if_62_1.setTagInfo(_td_c_if_62_1);
        _jettag_c_if_62_1.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_c_if_62_1.okToProcessBody()) {
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.setTag("setVariable",2223,2278);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(55);
            RuntimeTagElement _jettag_c_setVariable_63_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_63_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_63_2.setRuntimeParent(_jettag_c_if_62_1);
            _jettag_c_setVariable_63_2.setTagInfo(_td_c_setVariable_63_2);
            _jettag_c_setVariable_63_2.doStart(context, out);
            _jettag_c_setVariable_63_2.doEnd();
            out.setTag(null,-1,-1);
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(43);
            out.setTag("set",2280,2323);
            RuntimeTagElement _jettag_c_set_64_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_64_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_64_2.setRuntimeParent(_jettag_c_if_62_1);
            _jettag_c_set_64_2.setTagInfo(_td_c_set_64_2);
            _jettag_c_set_64_2.doStart(context, out);
            JET2Writer _jettag_c_set_64_2_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_c_set_64_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("bottom");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_set_64_2.handleBodyContent(out);
            }
            out = _jettag_c_set_64_2_saved_out;
    out.bodyContentEnd();
            _jettag_c_set_64_2.doEnd();
            out.endTag("set",6);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(8);
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.setTag("include",2339,2445);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(106);
            out.includeStart();
            RuntimeTagElement _jettag_c_include_65_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_65_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_65_2.setRuntimeParent(_jettag_c_if_62_1);
            _jettag_c_include_65_2.setTagInfo(_td_c_include_65_2);
            _jettag_c_include_65_2.doStart(context, out);
            _jettag_c_include_65_2.doEnd();
            out.setTag(null,-1,-1);
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_if_62_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_if_62_1.doEnd();
        out.endTag("if",225);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(NL);         
        out.write("<!-- end bottom -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</td></tr>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</table>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("</body>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</html>");  //$NON-NLS-1$        
        out.popTemplateFile();
    }
}
