package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_listpagejsp implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_listpagejsp(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_15_29 = new TagInfo("c:get", //$NON-NLS-1$
            15, 29,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_20 = new TagInfo("c:get", //$NON-NLS-1$
            18, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@webpath", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_32 = new TagInfo("c:get", //$NON-NLS-1$
            20, 32,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_31 = new TagInfo("c:get", //$NON-NLS-1$
            21, 31,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@fullBeanName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_35 = new TagInfo("c:get", //$NON-NLS-1$
            22, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@fullBeanName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_42 = new TagInfo("c:get", //$NON-NLS-1$
            23, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@fullBeanName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_24_28 = new TagInfo("c:iterate", //$NON-NLS-1$
            24, 28,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$userType/attributes[@appearsInLists='true']", //$NON-NLS-1$
                "attribute", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_9 = new TagInfo("c:get", //$NON-NLS-1$
            25, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@messageKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_25_62 = new TagInfo("c:iterate", //$NON-NLS-1$
            25, 62,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/referenceList[@appearsInLists='true']", //$NON-NLS-1$
                "reference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_31 = new TagInfo("c:get", //$NON-NLS-1$
            26, 31,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@messageKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_27_32 = new TagInfo("c:iterate", //$NON-NLS-1$
            27, 32,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$userType/attributes[@appearsInLists='true']", //$NON-NLS-1$
                "attribute", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_28_9 = new TagInfo("c:if", //$NON-NLS-1$
            28, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldType = 'DATE' or $attribute/@fieldType = 'CURRENCY'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_99 = new TagInfo("c:get", //$NON-NLS-1$
            28, 99,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_29_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            29, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/referenceList[@appearsInLists='true']", //$NON-NLS-1$
                "reference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_31 = new TagInfo("c:get", //$NON-NLS-1$
            30, 31,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_31_27 = new TagInfo("c:iterate", //$NON-NLS-1$
            31, 27,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$userType/attributes[@appearsInLists='true']", //$NON-NLS-1$
                "attribute", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_9 = new TagInfo("c:get", //$NON-NLS-1$
            32, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldSize", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_33_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            33, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/referenceList[@appearsInLists='true']", //$NON-NLS-1$
                "reference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_31 = new TagInfo("c:get", //$NON-NLS-1$
            34, 31,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@fieldSize", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_32 = new TagInfo("c:get", //$NON-NLS-1$
            35, 32,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_33 = new TagInfo("c:get", //$NON-NLS-1$
            36, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_32 = new TagInfo("c:get", //$NON-NLS-1$
            37, 32,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@actionClassFullPath", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_82 = new TagInfo("c:get", //$NON-NLS-1$
            37, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@loadFormAction", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_32 = new TagInfo("c:get", //$NON-NLS-1$
            38, 32,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@actionClassFullPath", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_82 = new TagInfo("c:get", //$NON-NLS-1$
            38, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@deleteAction", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_32 = new TagInfo("c:get", //$NON-NLS-1$
            39, 32,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@actionClassFullPath", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_82 = new TagInfo("c:get", //$NON-NLS-1$
            39, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@loadFormAction", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_30 = new TagInfo("c:get", //$NON-NLS-1$
            40, 30,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@actionClassFullPath", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_80 = new TagInfo("c:get", //$NON-NLS-1$
            40, 80,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@loadFormAction", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_32 = new TagInfo("c:get", //$NON-NLS-1$
            42, 32,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@actionClassFullPath", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_82 = new TagInfo("c:get", //$NON-NLS-1$
            42, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@showAllAction", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_45_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            45, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/attributes[@appearsInLists='true']", //$NON-NLS-1$
                "attribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_45_90 = new TagInfo("c:if", //$NON-NLS-1$
            45, 90,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldType = 'DATE'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_51 = new TagInfo("c:get", //$NON-NLS-1$
            46, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_48 = new TagInfo("c:get", //$NON-NLS-1$
            47, 48,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_48_26 = new TagInfo("c:if", //$NON-NLS-1$
            48, 26,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@fieldType = 'CURRENCY'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_51 = new TagInfo("c:get", //$NON-NLS-1$
            49, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_46 = new TagInfo("c:get", //$NON-NLS-1$
            50, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_20 = new TagInfo("c:get", //$NON-NLS-1$
            55, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@webpath", //$NON-NLS-1$
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
        out.write("<%@ taglib uri=\"http://java.sun.com/jsp/jstl/core\" prefix=\"ctrl\"%>  ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<%@ taglib uri=\"/WEB-INF/tags/mytaglib.tld\" prefix=\"mytaglib\"%>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<%@ taglib uri=\"/WEB-INF/tags/myfunctions.tld\" prefix=\"f\"%>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<%@ taglib prefix=\"fmt\" uri=\"http://java.sun.com/jsp/jstl/fmt\" %>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<html>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<head>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/admin.css\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/listStyle/listStyle.css\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<title>Administrative area: ");  //$NON-NLS-1$        
        out.setTag("get",756,790);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_15_29 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_29); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_15_29.setRuntimeParent(null);
        _jettag_c_get_15_29.setTagInfo(_td_c_get_15_29);
        _jettag_c_get_15_29.doStart(context, out);
        _jettag_c_get_15_29.doEnd();
        out.setTag(null,-1,-1);
        out.write("</title>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</head>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<body>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<%@ include file=\"/");  //$NON-NLS-1$        
        out.setTag("get",833,878);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(45);
        RuntimeTagElement _jettag_c_get_18_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_20); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_18_20.setRuntimeParent(null);
        _jettag_c_get_18_20.setTagInfo(_td_c_get_18_20);
        _jettag_c_get_18_20.doStart(context, out);
        _jettag_c_get_18_20.doEnd();
        out.setTag(null,-1,-1);
        out.write("/jspf/adminPrefix.jspf\" %>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<mytaglib:showlist items=\"${all");  //$NON-NLS-1$        
        out.setTag("get",937,971);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_20_32 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_32); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_20_32.setRuntimeParent(null);
        _jettag_c_get_20_32.setTagInfo(_td_c_get_20_32);
        _jettag_c_get_20_32.doStart(context, out);
        _jettag_c_get_20_32.doEnd();
        out.setTag(null,-1,-1);
        out.write("s}\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                   titleList=\"");  //$NON-NLS-1$        
        out.setTag("get",1005,1047);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_21_31 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_31); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_31.setRuntimeParent(null);
        _jettag_c_get_21_31.setTagInfo(_td_c_get_21_31);
        _jettag_c_get_21_31.doStart(context, out);
        _jettag_c_get_21_31.doEnd();
        out.setTag(null,-1,-1);
        out.write(".list.title\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                   insertCaption=\"");  //$NON-NLS-1$        
        out.setTag("get",1094,1136);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_22_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_35); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_22_35.setRuntimeParent(null);
        _jettag_c_get_22_35.setTagInfo(_td_c_get_22_35);
        _jettag_c_get_22_35.doStart(context, out);
        _jettag_c_get_22_35.doEnd();
        out.setTag(null,-1,-1);
        out.write(".new\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                   notExistItemsMessage=\"");  //$NON-NLS-1$        
        out.setTag("get",1183,1225);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_23_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_42); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_23_42.setRuntimeParent(null);
        _jettag_c_get_23_42.setTagInfo(_td_c_get_23_42);
        _jettag_c_get_23_42.doStart(context, out);
        _jettag_c_get_23_42.doEnd();
        out.setTag(null,-1,-1);
        out.write(".empty\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                   titles=\"");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(103);
        out.setTag("iterate",1260,1363);
        RuntimeTagElement _jettag_c_iterate_24_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_24_28); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_24_28.setRuntimeParent(null);
        _jettag_c_iterate_24_28.setTagInfo(_td_c_iterate_24_28);
        _jettag_c_iterate_24_28.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_24_28.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_24_28.getTagInfo().getAttribute("delimiter"),1260,1363);
            out.loopIterate();
            out.setTag("get",1363,1404);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(41);
            RuntimeTagElement _jettag_c_get_25_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_25_9.setRuntimeParent(_jettag_c_iterate_24_28);
            _jettag_c_get_25_9.setTagInfo(_td_c_get_25_9);
            _jettag_c_get_25_9.doStart(context, out);
            _jettag_c_get_25_9.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_c_iterate_24_28.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_24_28.doEnd();
        out.loopEnd();
        out.endTag("iterate",41);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(113);
        out.setTag("iterate",1416,1529);
        RuntimeTagElement _jettag_c_iterate_25_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_25_62); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_25_62.setRuntimeParent(null);
        _jettag_c_iterate_25_62.setTagInfo(_td_c_iterate_25_62);
        _jettag_c_iterate_25_62.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_25_62.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_25_62.getTagInfo().getAttribute("delimiter"),1416,1529);
            out.loopIterate();
            out.write(",");  //$NON-NLS-1$        
            out.setTag("get",1530,1571);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(41);
            RuntimeTagElement _jettag_c_get_26_31 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_31); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_26_31.setRuntimeParent(_jettag_c_iterate_25_62);
            _jettag_c_get_26_31.setTagInfo(_td_c_get_26_31);
            _jettag_c_get_26_31.doStart(context, out);
            _jettag_c_get_26_31.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_c_iterate_25_62.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_25_62.doEnd();
        out.loopEnd();
        out.endTag("iterate",42);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write("\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                   properties=\"");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(103);
        out.setTag("iterate",1616,1719);
        RuntimeTagElement _jettag_c_iterate_27_32 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_27_32); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_27_32.setRuntimeParent(null);
        _jettag_c_iterate_27_32.setTagInfo(_td_c_iterate_27_32);
        _jettag_c_iterate_27_32.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_27_32.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_27_32.getTagInfo().getAttribute("delimiter"),1616,1719);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(82);
            out.setTag("if",1719,1801);
            RuntimeTagElement _jettag_c_if_28_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_28_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_28_9.setRuntimeParent(_jettag_c_iterate_27_32);
            _jettag_c_if_28_9.setTagInfo(_td_c_if_28_9);
            _jettag_c_if_28_9.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_28_9.okToProcessBody()) {
                out.write("*");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_28_9.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_28_9.doEnd();
            out.endTag("if",1);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.setTag("get",1809,1844);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(35);
            RuntimeTagElement _jettag_c_get_28_99 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_99); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_28_99.setRuntimeParent(_jettag_c_iterate_27_32);
            _jettag_c_get_28_99.setTagInfo(_td_c_get_28_99);
            _jettag_c_get_28_99.doStart(context, out);
            _jettag_c_get_28_99.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_c_iterate_27_32.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_27_32.doEnd();
        out.loopEnd();
        out.endTag("iterate",125);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(20);
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(113);
        out.setTag("iterate",1864,1977);
        RuntimeTagElement _jettag_c_iterate_29_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_29_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_29_9.setRuntimeParent(null);
        _jettag_c_iterate_29_9.setTagInfo(_td_c_iterate_29_9);
        _jettag_c_iterate_29_9.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_29_9.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_29_9.getTagInfo().getAttribute("delimiter"),1864,1977);
            out.loopIterate();
            out.write(",");  //$NON-NLS-1$        
            out.setTag("get",1978,2013);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(35);
            RuntimeTagElement _jettag_c_get_30_31 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_31); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_30_31.setRuntimeParent(_jettag_c_iterate_29_9);
            _jettag_c_get_30_31.setTagInfo(_td_c_get_30_31);
            _jettag_c_get_30_31.doStart(context, out);
            _jettag_c_get_30_31.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_c_iterate_29_9.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_29_9.doEnd();
        out.loopEnd();
        out.endTag("iterate",36);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write("\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                   sizes=\"");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(103);
        out.setTag("iterate",2053,2156);
        RuntimeTagElement _jettag_c_iterate_31_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_31_27); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_31_27.setRuntimeParent(null);
        _jettag_c_iterate_31_27.setTagInfo(_td_c_iterate_31_27);
        _jettag_c_iterate_31_27.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_31_27.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_31_27.getTagInfo().getAttribute("delimiter"),2053,2156);
            out.loopIterate();
            out.setTag("get",2156,2196);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(40);
            RuntimeTagElement _jettag_c_get_32_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_32_9.setRuntimeParent(_jettag_c_iterate_31_27);
            _jettag_c_get_32_9.setTagInfo(_td_c_get_32_9);
            _jettag_c_get_32_9.doStart(context, out);
            _jettag_c_get_32_9.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_c_iterate_31_27.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_31_27.doEnd();
        out.loopEnd();
        out.endTag("iterate",40);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(20);
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(113);
        out.setTag("iterate",2216,2329);
        RuntimeTagElement _jettag_c_iterate_33_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_33_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_33_9.setRuntimeParent(null);
        _jettag_c_iterate_33_9.setTagInfo(_td_c_iterate_33_9);
        _jettag_c_iterate_33_9.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_33_9.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_33_9.getTagInfo().getAttribute("delimiter"),2216,2329);
            out.loopIterate();
            out.write(",");  //$NON-NLS-1$        
            out.setTag("get",2330,2370);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(40);
            RuntimeTagElement _jettag_c_get_34_31 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_31); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_34_31.setRuntimeParent(_jettag_c_iterate_33_9);
            _jettag_c_get_34_31.setTagInfo(_td_c_get_34_31);
            _jettag_c_get_34_31.doStart(context, out);
            _jettag_c_get_34_31.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_c_iterate_33_9.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_33_9.doEnd();
        out.loopEnd();
        out.endTag("iterate",41);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write("\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                   idProperty=\"");  //$NON-NLS-1$        
        out.setTag("get",2415,2452);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_35_32 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_32); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_35_32.setRuntimeParent(null);
        _jettag_c_get_35_32.setTagInfo(_td_c_get_35_32);
        _jettag_c_get_35_32.doStart(context, out);
        _jettag_c_get_35_32.doEnd();
        out.setTag(null,-1,-1);
        out.write("\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                   idParameter=\"");  //$NON-NLS-1$        
        out.setTag("get",2486,2523);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_36_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_33); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_36_33.setRuntimeParent(null);
        _jettag_c_get_36_33.setTagInfo(_td_c_get_36_33);
        _jettag_c_get_36_33.doStart(context, out);
        _jettag_c_get_36_33.doEnd();
        out.setTag(null,-1,-1);
        out.write("\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                   insertLink=\"");  //$NON-NLS-1$        
        out.setTag("get",2556,2605);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(49);
        RuntimeTagElement _jettag_c_get_37_32 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_32); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_37_32.setRuntimeParent(null);
        _jettag_c_get_37_32.setTagInfo(_td_c_get_37_32);
        _jettag_c_get_37_32.doStart(context, out);
        _jettag_c_get_37_32.doEnd();
        out.setTag(null,-1,-1);
        out.write(".");  //$NON-NLS-1$        
        out.setTag("get",2606,2650);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_37_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_82); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_37_82.setRuntimeParent(null);
        _jettag_c_get_37_82.setTagInfo(_td_c_get_37_82);
        _jettag_c_get_37_82.doStart(context, out);
        _jettag_c_get_37_82.doEnd();
        out.setTag(null,-1,-1);
        out.write(".do\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                   deleteLink=\"");  //$NON-NLS-1$        
        out.setTag("get",2686,2735);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(49);
        RuntimeTagElement _jettag_c_get_38_32 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_32); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_38_32.setRuntimeParent(null);
        _jettag_c_get_38_32.setTagInfo(_td_c_get_38_32);
        _jettag_c_get_38_32.doStart(context, out);
        _jettag_c_get_38_32.doEnd();
        out.setTag(null,-1,-1);
        out.write(".");  //$NON-NLS-1$        
        out.setTag("get",2736,2778);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_38_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_82); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_38_82.setRuntimeParent(null);
        _jettag_c_get_38_82.setTagInfo(_td_c_get_38_82);
        _jettag_c_get_38_82.doStart(context, out);
        _jettag_c_get_38_82.doEnd();
        out.setTag(null,-1,-1);
        out.write(".do\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                   updateLink=\"");  //$NON-NLS-1$        
        out.setTag("get",2814,2863);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(49);
        RuntimeTagElement _jettag_c_get_39_32 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_32); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_39_32.setRuntimeParent(null);
        _jettag_c_get_39_32.setTagInfo(_td_c_get_39_32);
        _jettag_c_get_39_32.doStart(context, out);
        _jettag_c_get_39_32.doEnd();
        out.setTag(null,-1,-1);
        out.write(".");  //$NON-NLS-1$        
        out.setTag("get",2864,2908);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_39_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_82); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_39_82.setRuntimeParent(null);
        _jettag_c_get_39_82.setTagInfo(_td_c_get_39_82);
        _jettag_c_get_39_82.doStart(context, out);
        _jettag_c_get_39_82.doEnd();
        out.setTag(null,-1,-1);
        out.write(".do\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                   viewLink=\"");  //$NON-NLS-1$        
        out.setTag("get",2942,2991);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(49);
        RuntimeTagElement _jettag_c_get_40_30 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_30); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_40_30.setRuntimeParent(null);
        _jettag_c_get_40_30.setTagInfo(_td_c_get_40_30);
        _jettag_c_get_40_30.doStart(context, out);
        _jettag_c_get_40_30.doEnd();
        out.setTag(null,-1,-1);
        out.write(".");  //$NON-NLS-1$        
        out.setTag("get",2992,3036);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(44);
        RuntimeTagElement _jettag_c_get_40_80 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_80); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_40_80.setRuntimeParent(null);
        _jettag_c_get_40_80.setTagInfo(_td_c_get_40_80);
        _jettag_c_get_40_80.doStart(context, out);
        _jettag_c_get_40_80.doEnd();
        out.setTag(null,-1,-1);
        out.write(".do\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                   paging=\"5\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                   originLink=\"");  //$NON-NLS-1$        
        out.setTag("get",3102,3151);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(49);
        RuntimeTagElement _jettag_c_get_42_32 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_32); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_42_32.setRuntimeParent(null);
        _jettag_c_get_42_32.setTagInfo(_td_c_get_42_32);
        _jettag_c_get_42_32.doStart(context, out);
        _jettag_c_get_42_32.doEnd();
        out.setTag(null,-1,-1);
        out.write(".");  //$NON-NLS-1$        
        out.setTag("get",3152,3195);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(43);
        RuntimeTagElement _jettag_c_get_42_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_82); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_42_82.setRuntimeParent(null);
        _jettag_c_get_42_82.setTagInfo(_td_c_get_42_82);
        _jettag_c_get_42_82.doStart(context, out);
        _jettag_c_get_42_82.doEnd();
        out.setTag(null,-1,-1);
        out.write(".do\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                   highlight=\"true\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <jsp:attribute name=\"specialEvaluation\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(81);
        out.setTag("iterate",3290,3371);
        RuntimeTagElement _jettag_c_iterate_45_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_45_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_45_9.setRuntimeParent(null);
        _jettag_c_iterate_45_9.setTagInfo(_td_c_iterate_45_9);
        _jettag_c_iterate_45_9.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_45_9.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_45_9.getTagInfo().getAttribute("delimiter"),3290,3371);
            out.loopIterate();
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(53);
            out.setTag("if",3371,3424);
            RuntimeTagElement _jettag_c_if_45_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_45_90); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_45_90.setRuntimeParent(_jettag_c_iterate_45_9);
            _jettag_c_if_45_90.setTagInfo(_td_c_if_45_90);
            _jettag_c_if_45_90.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_45_90.okToProcessBody()) {
                out.write("<ctrl:if test=\"${specialPropertyName == '");  //$NON-NLS-1$        
                out.setTag("get",3465,3500);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_46_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_51); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_46_51.setRuntimeParent(_jettag_c_if_45_90);
                _jettag_c_get_46_51.setTagInfo(_td_c_get_46_51);
                _jettag_c_get_46_51.doStart(context, out);
                _jettag_c_get_46_51.doEnd();
                out.setTag(null,-1,-1);
                out.write("'}\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            ${f:formatSimpleDate(evaluatedItem.");  //$NON-NLS-1$        
                out.setTag("get",3552,3587);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_47_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_48); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_47_48.setRuntimeParent(_jettag_c_if_45_90);
                _jettag_c_get_47_48.setTagInfo(_td_c_get_47_48);
                _jettag_c_get_47_48.doStart(context, out);
                _jettag_c_get_47_48.doEnd();
                out.setTag(null,-1,-1);
                out.write(")}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        </ctrl:if>");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_45_90.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_45_90.doEnd();
            out.endTag("if",184);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(57);
            out.setTag("if",3615,3672);
            RuntimeTagElement _jettag_c_if_48_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_48_26); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_48_26.setRuntimeParent(_jettag_c_iterate_45_9);
            _jettag_c_if_48_26.setTagInfo(_td_c_if_48_26);
            _jettag_c_if_48_26.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_48_26.okToProcessBody()) {
                out.write("<ctrl:if test=\"${specialPropertyName == '");  //$NON-NLS-1$        
                out.setTag("get",3713,3748);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_49_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_51); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_49_51.setRuntimeParent(_jettag_c_if_48_26);
                _jettag_c_get_49_51.setTagInfo(_td_c_get_49_51);
                _jettag_c_get_49_51.doStart(context, out);
                _jettag_c_get_49_51.doEnd();
                out.setTag(null,-1,-1);
                out.write("'}\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            ${f:formatCurrency(evaluatedItem.");  //$NON-NLS-1$        
                out.setTag("get",3798,3833);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(35);
                RuntimeTagElement _jettag_c_get_50_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_46); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_50_46.setRuntimeParent(_jettag_c_if_48_26);
                _jettag_c_get_50_46.setTagInfo(_td_c_get_50_46);
                _jettag_c_get_50_46.doStart(context, out);
                _jettag_c_get_50_46.doEnd();
                out.setTag(null,-1,-1);
                out.write(")}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        </ctrl:if>");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_48_26.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_48_26.doEnd();
            out.endTag("if",182);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
out.bodyContentStart();
            _jettag_c_iterate_45_9.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_45_9.doEnd();
        out.loopEnd();
        out.endTag("iterate",490);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("    </jsp:attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</mytaglib:showlist>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<%@ include file=\"/");  //$NON-NLS-1$        
        out.setTag("get",3936,3981);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(45);
        RuntimeTagElement _jettag_c_get_55_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_20); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_55_20.setRuntimeParent(null);
        _jettag_c_get_55_20.setTagInfo(_td_c_get_55_20);
        _jettag_c_get_55_20.doStart(context, out);
        _jettag_c_get_55_20.doEnd();
        out.setTag(null,-1,-1);
        out.write("/jspf/adminSuffix.jspf\" %>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</body>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</html>");  //$NON-NLS-1$        
        out.popTemplateFile();
    }
}
