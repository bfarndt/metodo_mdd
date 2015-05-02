package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_generateUserContent implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_generateUserContent(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_if_2_1 = new TagInfo("c:if", //$NON-NLS-1$
            2, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$featuresModel/WebDomainFeatures/@userContent = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_project_3_1 = new TagInfo("ws:project", //$NON-NLS-1$
            3, 1,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$theConfiguration/@project}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_4_2 = new TagInfo("ws:folder", //$NON-NLS-1$
            4, 2,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$theConfiguration/@srcfolder}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_package_5_3 = new TagInfo("java:package", //$NON-NLS-1$
            5, 3,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "generated.usercontent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_6_4 = new TagInfo("java:class", //$NON-NLS-1$
            6, 4,
            new String[] {
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UserContent", //$NON-NLS-1$
                "templates/userContent/files/UserContent.java.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_7_4 = new TagInfo("java:class", //$NON-NLS-1$
            7, 4,
            new String[] {
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UserContentActions", //$NON-NLS-1$
                "templates/userContent/files/UserContentActions.java.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_8_4 = new TagInfo("java:class", //$NON-NLS-1$
            8, 4,
            new String[] {
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UserContentDAO", //$NON-NLS-1$
                "templates/userContent/files/UserContentDAO.java.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_9_4 = new TagInfo("java:class", //$NON-NLS-1$
            9, 4,
            new String[] {
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UserContentDAOAbstractFactory", //$NON-NLS-1$
                "templates/userContent/files/UserContentDAOAbstractFactory.java.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_10_4 = new TagInfo("java:class", //$NON-NLS-1$
            10, 4,
            new String[] {
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "DefaultUserContentDAOFactoryProvider", //$NON-NLS-1$
                "templates/userContent/files/DefaultUserContentDAOFactoryProvider.java.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_package_12_3 = new TagInfo("java:package", //$NON-NLS-1$
            12, 3,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "generated.usercontent.derby", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_13_4 = new TagInfo("java:class", //$NON-NLS-1$
            13, 4,
            new String[] {
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "DerbyUserContentDAO", //$NON-NLS-1$
                "templates/userContent/files/DerbyUserContentDAO.java.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_14_4 = new TagInfo("java:class", //$NON-NLS-1$
            14, 4,
            new String[] {
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "DerbyUserContentDAOFactory", //$NON-NLS-1$
                "templates/userContent/files/DerbyUserContentDAOFactory.java.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_17_1 = new TagInfo("c:if", //$NON-NLS-1$
            17, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$featuresModel/WebDomainFeatures/@moderation = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_18_2 = new TagInfo("ws:folder", //$NON-NLS-1$
            18, 2,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$theConfiguration/@webfolder}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_19_3 = new TagInfo("ws:folder", //$NON-NLS-1$
            19, 3,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$theConfiguration/@webpath}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_20_4 = new TagInfo("ws:file", //$NON-NLS-1$
            20, 4,
            new String[] {
                "path", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "moderation.jsp", //$NON-NLS-1$
                "templates/userContent/files/moderation.jsp.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        // Depends: common/common.jet 
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(36);
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(68);
        out.setTag("if",37,105);
        RuntimeTagElement _jettag_c_if_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_2_1.setRuntimeParent(null);
        _jettag_c_if_2_1.setTagInfo(_td_c_if_2_1);
        _jettag_c_if_2_1.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_c_if_2_1.okToProcessBody()) {
            out.write(NL);         
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(48);
            out.setTag("project",106,154);
            RuntimeTagElement _jettag_ws_project_3_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_3_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_project_3_1.setRuntimeParent(_jettag_c_if_2_1);
            _jettag_ws_project_3_1.setTagInfo(_td_ws_project_3_1);
            _jettag_ws_project_3_1.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_ws_project_3_1.okToProcessBody()) {
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(49);
                out.setTag("folder",156,205);
                RuntimeTagElement _jettag_ws_folder_4_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_4_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_folder_4_2.setRuntimeParent(_jettag_ws_project_3_1);
                _jettag_ws_folder_4_2.setTagInfo(_td_ws_folder_4_2);
                _jettag_ws_folder_4_2.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_ws_folder_4_2.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(43);
                    out.setTag("package",208,251);
                    RuntimeTagElement _jettag_java_package_5_3 = context.getTagFactory().createRuntimeTag(_jetns_java, "package", "java:package", _td_java_package_5_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_package_5_3.setRuntimeParent(_jettag_ws_folder_4_2);
                    _jettag_java_package_5_3.setTagInfo(_td_java_package_5_3);
                    _jettag_java_package_5_3.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_java_package_5_3.okToProcessBody()) {
                        out.write(NL);         
                        out.write("\t\t\t");  //$NON-NLS-1$        
                        out.setTag("class",255,348);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(93);
                        RuntimeTagElement _jettag_java_class_6_4 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_6_4); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_java_class_6_4.setRuntimeParent(_jettag_java_package_5_3);
                        _jettag_java_class_6_4.setTagInfo(_td_java_class_6_4);
                        _jettag_java_class_6_4.doStart(context, out);
                        _jettag_java_class_6_4.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(NL);         
                        out.write("\t\t\t");  //$NON-NLS-1$        
                        out.setTag("class",352,459);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(107);
                        RuntimeTagElement _jettag_java_class_7_4 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_7_4); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_java_class_7_4.setRuntimeParent(_jettag_java_package_5_3);
                        _jettag_java_class_7_4.setTagInfo(_td_java_class_7_4);
                        _jettag_java_class_7_4.doStart(context, out);
                        _jettag_java_class_7_4.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(NL);         
                        out.write("\t\t\t");  //$NON-NLS-1$        
                        out.setTag("class",463,562);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(99);
                        RuntimeTagElement _jettag_java_class_8_4 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_8_4); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_java_class_8_4.setRuntimeParent(_jettag_java_package_5_3);
                        _jettag_java_class_8_4.setTagInfo(_td_java_class_8_4);
                        _jettag_java_class_8_4.doStart(context, out);
                        _jettag_java_class_8_4.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(NL);         
                        out.write("\t\t\t");  //$NON-NLS-1$        
                        out.setTag("class",566,695);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(129);
                        RuntimeTagElement _jettag_java_class_9_4 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_9_4); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_java_class_9_4.setRuntimeParent(_jettag_java_package_5_3);
                        _jettag_java_class_9_4.setTagInfo(_td_java_class_9_4);
                        _jettag_java_class_9_4.doStart(context, out);
                        _jettag_java_class_9_4.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(NL);         
                        out.write("\t\t\t");  //$NON-NLS-1$        
                        out.setTag("class",699,842);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(143);
                        RuntimeTagElement _jettag_java_class_10_4 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_10_4); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_java_class_10_4.setRuntimeParent(_jettag_java_package_5_3);
                        _jettag_java_class_10_4.setTagInfo(_td_java_class_10_4);
                        _jettag_java_class_10_4.doStart(context, out);
                        _jettag_java_class_10_4.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(NL);         
                        out.write("\t\t");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_java_package_5_3.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_java_package_5_3.doEnd();
                    out.endTag("package",594);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(15);
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(49);
                    out.setTag("package",863,912);
                    RuntimeTagElement _jettag_java_package_12_3 = context.getTagFactory().createRuntimeTag(_jetns_java, "package", "java:package", _td_java_package_12_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_package_12_3.setRuntimeParent(_jettag_ws_folder_4_2);
                    _jettag_java_package_12_3.setTagInfo(_td_java_package_12_3);
                    _jettag_java_package_12_3.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_java_package_12_3.okToProcessBody()) {
                        out.write(NL);         
                        out.write("\t\t\t");  //$NON-NLS-1$        
                        out.setTag("class",916,1025);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(109);
                        RuntimeTagElement _jettag_java_class_13_4 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_13_4); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_java_class_13_4.setRuntimeParent(_jettag_java_package_12_3);
                        _jettag_java_class_13_4.setTagInfo(_td_java_class_13_4);
                        _jettag_java_class_13_4.doStart(context, out);
                        _jettag_java_class_13_4.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(NL);         
                        out.write("\t\t\t");  //$NON-NLS-1$        
                        out.setTag("class",1029,1152);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(123);
                        RuntimeTagElement _jettag_java_class_14_4 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_14_4); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_java_class_14_4.setRuntimeParent(_jettag_java_package_12_3);
                        _jettag_java_class_14_4.setTagInfo(_td_java_class_14_4);
                        _jettag_java_class_14_4.doStart(context, out);
                        _jettag_java_class_14_4.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(NL);         
                        out.write("\t\t");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_java_package_12_3.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_java_package_12_3.doEnd();
                    out.endTag("package",243);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(15);
                    out.write(NL);         
                    out.write("\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_ws_folder_4_2.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_ws_folder_4_2.doEnd();
                out.endTag("folder",967);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(67);
                out.setTag("if",1185,1252);
                RuntimeTagElement _jettag_c_if_17_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_17_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_17_1.setRuntimeParent(_jettag_ws_project_3_1);
                _jettag_c_if_17_1.setTagInfo(_td_c_if_17_1);
                _jettag_c_if_17_1.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_17_1.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(49);
                    out.setTag("folder",1254,1303);
                    RuntimeTagElement _jettag_ws_folder_18_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_18_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_folder_18_2.setRuntimeParent(_jettag_c_if_17_1);
                    _jettag_ws_folder_18_2.setTagInfo(_td_ws_folder_18_2);
                    _jettag_ws_folder_18_2.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_ws_folder_18_2.okToProcessBody()) {
                        out.write(NL);         
                        out.write("\t\t");  //$NON-NLS-1$        
                // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
                out.jump(47);
                        out.setTag("folder",1306,1353);
                        RuntimeTagElement _jettag_ws_folder_19_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_19_3); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_ws_folder_19_3.setRuntimeParent(_jettag_ws_folder_18_2);
                        _jettag_ws_folder_19_3.setTagInfo(_td_ws_folder_19_3);
                        _jettag_ws_folder_19_3.doStart(context, out);
                        out.setTag(null,-1,-1);
                        while (_jettag_ws_folder_19_3.okToProcessBody()) {
                            out.write(NL);         
                            out.write("\t\t\t");  //$NON-NLS-1$        
                            out.setTag("file",1357,1448);
                    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                    out.jump(91);
                            RuntimeTagElement _jettag_ws_file_20_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_20_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_ws_file_20_4.setRuntimeParent(_jettag_ws_folder_19_3);
                            _jettag_ws_file_20_4.setTagInfo(_td_ws_file_20_4);
                            _jettag_ws_file_20_4.doStart(context, out);
                            _jettag_ws_file_20_4.doEnd();
                            out.setTag(null,-1,-1);
                            out.write(NL);         
                            out.write("\t\t");  //$NON-NLS-1$        
                out.bodyContentStart();
                            _jettag_ws_folder_19_3.handleBodyContent(out);
                        }
                out.bodyContentEnd();
                        _jettag_ws_folder_19_3.doEnd();
                        out.endTag("folder",98);
                // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
                out.jump(12);
                        out.write(NL);         
                        out.write("\t");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_ws_folder_18_2.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_ws_folder_18_2.doEnd();
                    out.endTag("folder",162);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(12);
                    out.write(NL);         
        out.bodyContentStart();
                    _jettag_c_if_17_1.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_17_1.doEnd();
                out.endTag("if",226);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
    out.bodyContentStart();
                _jettag_ws_project_3_1.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_ws_project_3_1.doEnd();
            out.endTag("project",1332);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(13);
            out.write(NL);         
            out.write(NL);         
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_if_2_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_if_2_1.doEnd();
        out.endTag("if",1397);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.popTemplateFile();
    }
}
