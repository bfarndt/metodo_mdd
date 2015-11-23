package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_generateDerbyDAOs implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_generateDerbyDAOs(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_set_5_1 = new TagInfo("c:set", //$NON-NLS-1$
            5, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration", //$NON-NLS-1$
                "derbyDaosPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_59 = new TagInfo("c:get", //$NON-NLS-1$
            5, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@daosPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_6_1 = new TagInfo("c:set", //$NON-NLS-1$
            6, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration", //$NON-NLS-1$
                "derbyDaoFactoryClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_7_1 = new TagInfo("c:set", //$NON-NLS-1$
            7, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration", //$NON-NLS-1$
                "derbyDaoFactoryFullName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_66 = new TagInfo("c:get", //$NON-NLS-1$
            7, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@derbyDaosPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_121 = new TagInfo("c:get", //$NON-NLS-1$
            7, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@derbyDaoFactoryClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_8_1 = new TagInfo("c:set", //$NON-NLS-1$
            8, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration", //$NON-NLS-1$
                "derbyConnectionProviderConstant", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_9_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            9, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/WebDomainAdministrationModel/userTypes", //$NON-NLS-1$
                "userType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_10_2 = new TagInfo("c:set", //$NON-NLS-1$
            10, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$userType", //$NON-NLS-1$
                "derbyDAOClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_54 = new TagInfo("c:get", //$NON-NLS-1$
            10, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@daoClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_project_14_1 = new TagInfo("ws:project", //$NON-NLS-1$
            14, 1,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$theConfiguration/@project}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_15_2 = new TagInfo("ws:folder", //$NON-NLS-1$
            15, 2,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$theConfiguration/@srcfolder}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_package_16_3 = new TagInfo("java:package", //$NON-NLS-1$
            16, 3,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$theConfiguration/@derbyDaosPackage}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_17_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            17, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/WebDomainAdministrationModel/userTypes", //$NON-NLS-1$
                "userType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_18_5 = new TagInfo("java:class", //$NON-NLS-1$
            18, 5,
            new String[] {
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$userType/@derbyDAOClass}", //$NON-NLS-1$
                "templates/persistence/daos/derby/classes/DerbyDAOClass.java.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_project_25_1 = new TagInfo("ws:project", //$NON-NLS-1$
            25, 1,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$theConfiguration/@project}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_26_2 = new TagInfo("ws:folder", //$NON-NLS-1$
            26, 2,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$theConfiguration/@srcfolder}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_package_27_3 = new TagInfo("java:package", //$NON-NLS-1$
            27, 3,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$theConfiguration/@derbyDaosPackage}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_28_4 = new TagInfo("java:class", //$NON-NLS-1$
            28, 4,
            new String[] {
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$theConfiguration/@derbyDaoFactoryClass}", //$NON-NLS-1$
                "templates/persistence/daos/derby/classes/DerbyDAOFactory.java.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_34_1 = new TagInfo("c:include", //$NON-NLS-1$
            34, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/persistence/daos/derby/sql/generateDerbyScript.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        // Depends: common/common.jet 
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(36);
        out.write(NL);         
        // Uses: beans/generateBeans.jet 
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(39);
        out.write(NL);         
        out.write(NL);         
        // Set useful values 
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(27);
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(58);
        out.setTag("set",106,164);
        RuntimeTagElement _jettag_c_set_5_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_5_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_5_1.setRuntimeParent(null);
        _jettag_c_set_5_1.setTagInfo(_td_c_set_5_1);
        _jettag_c_set_5_1.doStart(context, out);
        JET2Writer _jettag_c_set_5_1_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_c_set_5_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",164,213);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(49);
            RuntimeTagElement _jettag_c_get_5_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_59); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_5_59.setRuntimeParent(_jettag_c_set_5_1);
            _jettag_c_get_5_59.setTagInfo(_td_c_get_5_59);
            _jettag_c_get_5_59.doStart(context, out);
            _jettag_c_get_5_59.doEnd();
            out.setTag(null,-1,-1);
            out.write(".derby");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_set_5_1.handleBodyContent(out);
        }
        out = _jettag_c_set_5_1_saved_out;
out.bodyContentEnd();
        _jettag_c_set_5_1.doEnd();
        out.endTag("set",55);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(8);
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(62);
        out.setTag("set",228,290);
        RuntimeTagElement _jettag_c_set_6_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_6_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_6_1.setRuntimeParent(null);
        _jettag_c_set_6_1.setTagInfo(_td_c_set_6_1);
        _jettag_c_set_6_1.doStart(context, out);
        JET2Writer _jettag_c_set_6_1_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_c_set_6_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("DerbyDAOFactory");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_set_6_1.handleBodyContent(out);
        }
        out = _jettag_c_set_6_1_saved_out;
out.bodyContentEnd();
        _jettag_c_set_6_1.doEnd();
        out.endTag("set",15);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(8);
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(65);
        out.setTag("set",314,379);
        RuntimeTagElement _jettag_c_set_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_7_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_7_1.setRuntimeParent(null);
        _jettag_c_set_7_1.setTagInfo(_td_c_set_7_1);
        _jettag_c_set_7_1.doStart(context, out);
        JET2Writer _jettag_c_set_7_1_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_c_set_7_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",379,433);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(54);
            RuntimeTagElement _jettag_c_get_7_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_66); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_7_66.setRuntimeParent(_jettag_c_set_7_1);
            _jettag_c_get_7_66.setTagInfo(_td_c_get_7_66);
            _jettag_c_get_7_66.doStart(context, out);
            _jettag_c_get_7_66.doEnd();
            out.setTag(null,-1,-1);
            out.write(".");  //$NON-NLS-1$        
            out.setTag("get",434,492);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(58);
            RuntimeTagElement _jettag_c_get_7_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_121); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_7_121.setRuntimeParent(_jettag_c_set_7_1);
            _jettag_c_get_7_121.setTagInfo(_td_c_get_7_121);
            _jettag_c_get_7_121.doStart(context, out);
            _jettag_c_get_7_121.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_c_set_7_1.handleBodyContent(out);
        }
        out = _jettag_c_set_7_1_saved_out;
out.bodyContentEnd();
        _jettag_c_set_7_1.doEnd();
        out.endTag("set",113);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(8);
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(73);
        out.setTag("set",501,574);
        RuntimeTagElement _jettag_c_set_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_8_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_8_1.setRuntimeParent(null);
        _jettag_c_set_8_1.setTagInfo(_td_c_set_8_1);
        _jettag_c_set_8_1.doStart(context, out);
        JET2Writer _jettag_c_set_8_1_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_c_set_8_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("Derby");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_set_8_1.handleBodyContent(out);
        }
        out = _jettag_c_set_8_1_saved_out;
out.bodyContentEnd();
        _jettag_c_set_8_1.doEnd();
        out.endTag("set",5);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(8);
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(75);
        out.setTag("iterate",588,663);
        RuntimeTagElement _jettag_c_iterate_9_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_9_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_9_1.setRuntimeParent(null);
        _jettag_c_iterate_9_1.setTagInfo(_td_c_iterate_9_1);
        _jettag_c_iterate_9_1.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_9_1.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_9_1.getTagInfo().getAttribute("delimiter"),588,663);
            out.loopIterate();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(47);
            out.setTag("set",665,712);
            RuntimeTagElement _jettag_c_set_10_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_10_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_10_2.setRuntimeParent(_jettag_c_iterate_9_1);
            _jettag_c_set_10_2.setTagInfo(_td_c_set_10_2);
            _jettag_c_set_10_2.doStart(context, out);
            JET2Writer _jettag_c_set_10_2_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_c_set_10_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("Derby");  //$NON-NLS-1$        
                out.setTag("get",717,755);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(38);
                RuntimeTagElement _jettag_c_get_10_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_54); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_10_54.setRuntimeParent(_jettag_c_set_10_2);
                _jettag_c_get_10_54.setTagInfo(_td_c_get_10_54);
                _jettag_c_get_10_54.doStart(context, out);
                _jettag_c_get_10_54.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_c_set_10_2.handleBodyContent(out);
            }
            out = _jettag_c_set_10_2_saved_out;
    out.bodyContentEnd();
            _jettag_c_set_10_2.doEnd();
            out.endTag("set",43);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(8);
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_iterate_9_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_9_1.doEnd();
        out.loopEnd();
        out.endTag("iterate",101);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        // Generate concrete Derby classes 
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(41);
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(48);
        out.setTag("project",824,872);
        RuntimeTagElement _jettag_ws_project_14_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_14_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_project_14_1.setRuntimeParent(null);
        _jettag_ws_project_14_1.setTagInfo(_td_ws_project_14_1);
        _jettag_ws_project_14_1.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_ws_project_14_1.okToProcessBody()) {
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(49);
            out.setTag("folder",874,923);
            RuntimeTagElement _jettag_ws_folder_15_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_15_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_folder_15_2.setRuntimeParent(_jettag_ws_project_14_1);
            _jettag_ws_folder_15_2.setTagInfo(_td_ws_folder_15_2);
            _jettag_ws_folder_15_2.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_ws_folder_15_2.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(59);
                out.setTag("package",926,985);
                RuntimeTagElement _jettag_java_package_16_3 = context.getTagFactory().createRuntimeTag(_jetns_java, "package", "java:package", _td_java_package_16_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_package_16_3.setRuntimeParent(_jettag_ws_folder_15_2);
                _jettag_java_package_16_3.setTagInfo(_td_java_package_16_3);
                _jettag_java_package_16_3.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_java_package_16_3.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(75);
                    out.setTag("iterate",989,1064);
                    RuntimeTagElement _jettag_c_iterate_17_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_17_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_17_4.setRuntimeParent(_jettag_java_package_16_3);
                    _jettag_c_iterate_17_4.setTagInfo(_td_c_iterate_17_4);
                    _jettag_c_iterate_17_4.doStart(context, out);
                    out.loopStart();
                    out.setTag(null,-1,-1);
                    while (_jettag_c_iterate_17_4.okToProcessBody()) {
            out.bodyContentEnd();
            out.handleDelimiter(_jettag_c_iterate_17_4.getTagInfo().getAttribute("delimiter"),989,1064);
                        out.loopIterate();
                        out.write(NL);         
                        out.write("\t\t\t\t");  //$NON-NLS-1$        
                        out.setTag("class",1069,1192);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(123);
                        RuntimeTagElement _jettag_java_class_18_5 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_18_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_java_class_18_5.setRuntimeParent(_jettag_c_iterate_17_4);
                        _jettag_java_class_18_5.setTagInfo(_td_java_class_18_5);
                        _jettag_java_class_18_5.doStart(context, out);
                        _jettag_java_class_18_5.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(NL);         
                        out.write("\t\t\t");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_iterate_17_4.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_iterate_17_4.doEnd();
                    out.loopEnd();
                    out.endTag("iterate",132);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(12);
                    out.write("    ");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_java_package_16_3.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_java_package_16_3.doEnd();
                out.endTag("package",230);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(15);
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_ws_folder_15_2.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_ws_folder_15_2.doEnd();
            out.endTag("folder",309);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
out.bodyContentStart();
            _jettag_ws_project_14_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_ws_project_14_1.doEnd();
        out.endTag("project",373);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(13);
        out.write(NL);         
        out.write(NL);         
        // Generate concrete Derby DAO factory 
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(45);
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(48);
        out.setTag("project",1306,1354);
        RuntimeTagElement _jettag_ws_project_25_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_25_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_project_25_1.setRuntimeParent(null);
        _jettag_ws_project_25_1.setTagInfo(_td_ws_project_25_1);
        _jettag_ws_project_25_1.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_ws_project_25_1.okToProcessBody()) {
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(49);
            out.setTag("folder",1356,1405);
            RuntimeTagElement _jettag_ws_folder_26_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_26_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_folder_26_2.setRuntimeParent(_jettag_ws_project_25_1);
            _jettag_ws_folder_26_2.setTagInfo(_td_ws_folder_26_2);
            _jettag_ws_folder_26_2.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_ws_folder_26_2.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(59);
                out.setTag("package",1408,1467);
                RuntimeTagElement _jettag_java_package_27_3 = context.getTagFactory().createRuntimeTag(_jetns_java, "package", "java:package", _td_java_package_27_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_package_27_3.setRuntimeParent(_jettag_ws_folder_26_2);
                _jettag_java_package_27_3.setTagInfo(_td_java_package_27_3);
                _jettag_java_package_27_3.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_java_package_27_3.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("class",1471,1611);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(140);
                    RuntimeTagElement _jettag_java_class_28_4 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_28_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_class_28_4.setRuntimeParent(_jettag_java_package_27_3);
                    _jettag_java_class_28_4.setTagInfo(_td_java_class_28_4);
                    _jettag_java_class_28_4.doStart(context, out);
                    _jettag_java_class_28_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_java_package_27_3.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_java_package_27_3.doEnd();
                out.endTag("package",147);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(15);
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_ws_folder_26_2.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_ws_folder_26_2.doEnd();
            out.endTag("folder",226);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
out.bodyContentStart();
            _jettag_ws_project_25_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_ws_project_25_1.doEnd();
        out.endTag("project",290);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(13);
        out.write(NL);         
        out.write(NL);         
        // Generate Derby database creation script 
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(49);
        out.write(NL);         
        out.setTag("include",1709,1794);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(85);
        out.includeStart();
        RuntimeTagElement _jettag_c_include_34_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_34_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_34_1.setRuntimeParent(null);
        _jettag_c_include_34_1.setTagInfo(_td_c_include_34_1);
        _jettag_c_include_34_1.doStart(context, out);
        _jettag_c_include_34_1.doEnd();
        out.setTag(null,-1,-1);
        out.write(NL);         
        out.popTemplateFile();
    }
}
