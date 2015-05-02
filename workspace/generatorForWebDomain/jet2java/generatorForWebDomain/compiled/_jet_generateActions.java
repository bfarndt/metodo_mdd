package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_generateActions implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_f = "org.eclipse.jet.formatTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_generateActions(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_ws_project_5_1 = new TagInfo("ws:project", //$NON-NLS-1$
            5, 1,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$theConfiguration/@project}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_6_2 = new TagInfo("ws:folder", //$NON-NLS-1$
            6, 2,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$theConfiguration/@srcfolder}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_package_7_3 = new TagInfo("java:package", //$NON-NLS-1$
            7, 3,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$theConfiguration/@actionsPackage}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_8_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            8, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/WebDomainAdministrationModel/userTypes", //$NON-NLS-1$
                "userType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_9_5 = new TagInfo("c:set", //$NON-NLS-1$
            9, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$userType", //$NON-NLS-1$
                "editPageConstant", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_9_55 = new TagInfo("f:uc", //$NON-NLS-1$
            9, 55,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_9_61 = new TagInfo("c:get", //$NON-NLS-1$
            9, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_10_5 = new TagInfo("c:set", //$NON-NLS-1$
            10, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$userType", //$NON-NLS-1$
                "listPageConstant", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_10_55 = new TagInfo("f:uc", //$NON-NLS-1$
            10, 55,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_10_61 = new TagInfo("c:get", //$NON-NLS-1$
            10, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_11_17 = new TagInfo("c:set", //$NON-NLS-1$
            11, 17,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$userType", //$NON-NLS-1$
                "listPageForSelectionConstant", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_11_79 = new TagInfo("f:uc", //$NON-NLS-1$
            11, 79,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_11_85 = new TagInfo("c:get", //$NON-NLS-1$
            11, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_12_5 = new TagInfo("java:class", //$NON-NLS-1$
            12, 5,
            new String[] {
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$userType/@actionClass}", //$NON-NLS-1$
                "templates/persistence/actions/classes/ActionClass.java.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        // Depends: common/common.jet 
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(36);
        out.write(NL);         
        // Uses: daos/generateDAOs.jet 
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(37);
        out.write(NL);         
        out.write(NL);         
        // Generate action classes 
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(33);
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(48);
        out.setTag("project",110,158);
        RuntimeTagElement _jettag_ws_project_5_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_5_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_project_5_1.setRuntimeParent(null);
        _jettag_ws_project_5_1.setTagInfo(_td_ws_project_5_1);
        _jettag_ws_project_5_1.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_ws_project_5_1.okToProcessBody()) {
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(49);
            out.setTag("folder",160,209);
            RuntimeTagElement _jettag_ws_folder_6_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_6_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_folder_6_2.setRuntimeParent(_jettag_ws_project_5_1);
            _jettag_ws_folder_6_2.setTagInfo(_td_ws_folder_6_2);
            _jettag_ws_folder_6_2.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_ws_folder_6_2.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(57);
                out.setTag("package",212,269);
                RuntimeTagElement _jettag_java_package_7_3 = context.getTagFactory().createRuntimeTag(_jetns_java, "package", "java:package", _td_java_package_7_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_package_7_3.setRuntimeParent(_jettag_ws_folder_6_2);
                _jettag_java_package_7_3.setTagInfo(_td_java_package_7_3);
                _jettag_java_package_7_3.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_java_package_7_3.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(75);
                    out.setTag("iterate",273,348);
                    RuntimeTagElement _jettag_c_iterate_8_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_8_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_8_4.setRuntimeParent(_jettag_java_package_7_3);
                    _jettag_c_iterate_8_4.setTagInfo(_td_c_iterate_8_4);
                    _jettag_c_iterate_8_4.doStart(context, out);
                    out.loopStart();
                    out.setTag(null,-1,-1);
                    while (_jettag_c_iterate_8_4.okToProcessBody()) {
            out.bodyContentEnd();
            out.handleDelimiter(_jettag_c_iterate_8_4.getTagInfo().getAttribute("delimiter"),273,348);
                        out.loopIterate();
                        out.write(NL);         
                        out.write("\t\t\t\t");  //$NON-NLS-1$        
                // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
                out.jump(50);
                        out.setTag("set",353,403);
                        RuntimeTagElement _jettag_c_set_9_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_9_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_set_9_5.setRuntimeParent(_jettag_c_iterate_8_4);
                        _jettag_c_set_9_5.setTagInfo(_td_c_set_9_5);
                        _jettag_c_set_9_5.doStart(context, out);
                        JET2Writer _jettag_c_set_9_5_saved_out = out;
                        out.setTag(null,-1,-1);
                        while (_jettag_c_set_9_5.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
                    out.jump(6);
                            out.setTag("uc",403,409);
                            RuntimeTagElement _jettag_f_uc_9_55 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_9_55); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_f_uc_9_55.setRuntimeParent(_jettag_c_set_9_5);
                            _jettag_f_uc_9_55.setTagInfo(_td_f_uc_9_55);
                            _jettag_f_uc_9_55.doStart(context, out);
                            JET2Writer _jettag_f_uc_9_55_saved_out = out;
                            out.setTag(null,-1,-1);
                            while (_jettag_f_uc_9_55.okToProcessBody()) {
                                out = out.newNestedContentWriter();
                                out.setTag("get",409,443);
                        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                        out.jump(34);
                                RuntimeTagElement _jettag_c_get_9_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_61); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_9_61.setRuntimeParent(_jettag_f_uc_9_55);
                                _jettag_c_get_9_61.setTagInfo(_td_c_get_9_61);
                                _jettag_c_get_9_61.doStart(context, out);
                                _jettag_c_get_9_61.doEnd();
                                out.setTag(null,-1,-1);
                    out.bodyContentStart();
                                _jettag_f_uc_9_55.handleBodyContent(out);
                            }
                            out = _jettag_f_uc_9_55_saved_out;
                    out.bodyContentEnd();
                            _jettag_f_uc_9_55.doEnd();
                            out.endTag("uc",34);
                    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
                    out.jump(7);
                            out.write("_EDIT_PAGE");  //$NON-NLS-1$        
                out.bodyContentStart();
                            _jettag_c_set_9_5.handleBodyContent(out);
                        }
                        out = _jettag_c_set_9_5_saved_out;
                out.bodyContentEnd();
                        _jettag_c_set_9_5.doEnd();
                        out.endTag("set",57);
                // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
                out.jump(8);
                        out.write(NL);         
                        out.write("\t\t\t\t");  //$NON-NLS-1$        
                // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
                out.jump(50);
                        out.setTag("set",473,523);
                        RuntimeTagElement _jettag_c_set_10_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_10_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_set_10_5.setRuntimeParent(_jettag_c_iterate_8_4);
                        _jettag_c_set_10_5.setTagInfo(_td_c_set_10_5);
                        _jettag_c_set_10_5.doStart(context, out);
                        JET2Writer _jettag_c_set_10_5_saved_out = out;
                        out.setTag(null,-1,-1);
                        while (_jettag_c_set_10_5.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
                    out.jump(6);
                            out.setTag("uc",523,529);
                            RuntimeTagElement _jettag_f_uc_10_55 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_10_55); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_f_uc_10_55.setRuntimeParent(_jettag_c_set_10_5);
                            _jettag_f_uc_10_55.setTagInfo(_td_f_uc_10_55);
                            _jettag_f_uc_10_55.doStart(context, out);
                            JET2Writer _jettag_f_uc_10_55_saved_out = out;
                            out.setTag(null,-1,-1);
                            while (_jettag_f_uc_10_55.okToProcessBody()) {
                                out = out.newNestedContentWriter();
                                out.setTag("get",529,563);
                        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                        out.jump(34);
                                RuntimeTagElement _jettag_c_get_10_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_61); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_10_61.setRuntimeParent(_jettag_f_uc_10_55);
                                _jettag_c_get_10_61.setTagInfo(_td_c_get_10_61);
                                _jettag_c_get_10_61.doStart(context, out);
                                _jettag_c_get_10_61.doEnd();
                                out.setTag(null,-1,-1);
                    out.bodyContentStart();
                                _jettag_f_uc_10_55.handleBodyContent(out);
                            }
                            out = _jettag_f_uc_10_55_saved_out;
                    out.bodyContentEnd();
                            _jettag_f_uc_10_55.doEnd();
                            out.endTag("uc",34);
                    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
                    out.jump(7);
                            out.write("_LIST_PAGE");  //$NON-NLS-1$        
                out.bodyContentStart();
                            _jettag_c_set_10_5.handleBodyContent(out);
                        }
                        out = _jettag_c_set_10_5_saved_out;
                out.bodyContentEnd();
                        _jettag_c_set_10_5.doEnd();
                        out.endTag("set",57);
                // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
                out.jump(8);
                        out.write(NL);         
                        out.write("                ");  //$NON-NLS-1$        
                // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
                out.jump(62);
                        out.setTag("set",605,667);
                        RuntimeTagElement _jettag_c_set_11_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_11_17); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_set_11_17.setRuntimeParent(_jettag_c_iterate_8_4);
                        _jettag_c_set_11_17.setTagInfo(_td_c_set_11_17);
                        _jettag_c_set_11_17.doStart(context, out);
                        JET2Writer _jettag_c_set_11_17_saved_out = out;
                        out.setTag(null,-1,-1);
                        while (_jettag_c_set_11_17.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
                    out.jump(6);
                            out.setTag("uc",667,673);
                            RuntimeTagElement _jettag_f_uc_11_79 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_11_79); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_f_uc_11_79.setRuntimeParent(_jettag_c_set_11_17);
                            _jettag_f_uc_11_79.setTagInfo(_td_f_uc_11_79);
                            _jettag_f_uc_11_79.doStart(context, out);
                            JET2Writer _jettag_f_uc_11_79_saved_out = out;
                            out.setTag(null,-1,-1);
                            while (_jettag_f_uc_11_79.okToProcessBody()) {
                                out = out.newNestedContentWriter();
                                out.setTag("get",673,707);
                        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                        out.jump(34);
                                RuntimeTagElement _jettag_c_get_11_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_85); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_11_85.setRuntimeParent(_jettag_f_uc_11_79);
                                _jettag_c_get_11_85.setTagInfo(_td_c_get_11_85);
                                _jettag_c_get_11_85.doStart(context, out);
                                _jettag_c_get_11_85.doEnd();
                                out.setTag(null,-1,-1);
                    out.bodyContentStart();
                                _jettag_f_uc_11_79.handleBodyContent(out);
                            }
                            out = _jettag_f_uc_11_79_saved_out;
                    out.bodyContentEnd();
                            _jettag_f_uc_11_79.doEnd();
                            out.endTag("uc",34);
                    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
                    out.jump(7);
                            out.write("_LIST_PAGE_FOR_SELECTION");  //$NON-NLS-1$        
                out.bodyContentStart();
                            _jettag_c_set_11_17.handleBodyContent(out);
                        }
                        out = _jettag_c_set_11_17_saved_out;
                out.bodyContentEnd();
                        _jettag_c_set_11_17.doEnd();
                        out.endTag("set",71);
                // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
                out.jump(8);
                        out.write(NL);         
                        out.write("\t\t\t\t");  //$NON-NLS-1$        
                        out.setTag("class",751,867);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(116);
                        RuntimeTagElement _jettag_java_class_12_5 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_12_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_java_class_12_5.setRuntimeParent(_jettag_c_iterate_8_4);
                        _jettag_java_class_12_5.setTagInfo(_td_java_class_12_5);
                        _jettag_java_class_12_5.doStart(context, out);
                        _jettag_java_class_12_5.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(NL);         
                        out.write("\t\t\t");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_iterate_8_4.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_iterate_8_4.doEnd();
                    out.loopEnd();
                    out.endTag("iterate",523);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(12);
                    out.write("    ");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_java_package_7_3.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_java_package_7_3.doEnd();
                out.endTag("package",621);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(15);
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_ws_folder_6_2.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_ws_folder_6_2.doEnd();
            out.endTag("folder",698);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
out.bodyContentStart();
            _jettag_ws_project_5_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_ws_project_5_1.doEnd();
        out.endTag("project",762);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(13);
        out.popTemplateFile();
    }
}
