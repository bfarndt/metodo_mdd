package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_generateDAOs implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_generateDAOs(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_ws_project_4_1 = new TagInfo("ws:project", //$NON-NLS-1$
            4, 1,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$theConfiguration/@project}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_5_2 = new TagInfo("ws:folder", //$NON-NLS-1$
            5, 2,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$theConfiguration/@srcfolder}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_package_6_3 = new TagInfo("java:package", //$NON-NLS-1$
            6, 3,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$theConfiguration/@daosPackage}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_7_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            7, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/WebDomainAdministrationModel/userTypes", //$NON-NLS-1$
                "userType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_8_5 = new TagInfo("java:class", //$NON-NLS-1$
            8, 5,
            new String[] {
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$userType/@daoClass}", //$NON-NLS-1$
                "templates/persistence/daos/classes/DAOAbstractClass.java.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_project_15_1 = new TagInfo("ws:project", //$NON-NLS-1$
            15, 1,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$theConfiguration/@project}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_16_2 = new TagInfo("ws:folder", //$NON-NLS-1$
            16, 2,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$theConfiguration/@srcfolder}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_package_17_3 = new TagInfo("java:package", //$NON-NLS-1$
            17, 3,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$theConfiguration/@daosPackage}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_18_4 = new TagInfo("java:class", //$NON-NLS-1$
            18, 4,
            new String[] {
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$theConfiguration/@daoAbstractFactoryClass}", //$NON-NLS-1$
                "templates/persistence/daos/classes/DAOAbstractFactory.java.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_24_1 = new TagInfo("c:include", //$NON-NLS-1$
            24, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/persistence/daos/derby/generateDerbyDAOs.jet", //$NON-NLS-1$
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
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(48);
        out.setTag("project",78,126);
        RuntimeTagElement _jettag_ws_project_4_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_4_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_project_4_1.setRuntimeParent(null);
        _jettag_ws_project_4_1.setTagInfo(_td_ws_project_4_1);
        _jettag_ws_project_4_1.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_ws_project_4_1.okToProcessBody()) {
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(49);
            out.setTag("folder",128,177);
            RuntimeTagElement _jettag_ws_folder_5_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_5_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_folder_5_2.setRuntimeParent(_jettag_ws_project_4_1);
            _jettag_ws_folder_5_2.setTagInfo(_td_ws_folder_5_2);
            _jettag_ws_folder_5_2.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_ws_folder_5_2.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(54);
                out.setTag("package",180,234);
                RuntimeTagElement _jettag_java_package_6_3 = context.getTagFactory().createRuntimeTag(_jetns_java, "package", "java:package", _td_java_package_6_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_package_6_3.setRuntimeParent(_jettag_ws_folder_5_2);
                _jettag_java_package_6_3.setTagInfo(_td_java_package_6_3);
                _jettag_java_package_6_3.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_java_package_6_3.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(75);
                    out.setTag("iterate",238,313);
                    RuntimeTagElement _jettag_c_iterate_7_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_7_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_7_4.setRuntimeParent(_jettag_java_package_6_3);
                    _jettag_c_iterate_7_4.setTagInfo(_td_c_iterate_7_4);
                    _jettag_c_iterate_7_4.doStart(context, out);
                    out.loopStart();
                    out.setTag(null,-1,-1);
                    while (_jettag_c_iterate_7_4.okToProcessBody()) {
            out.bodyContentEnd();
            out.handleDelimiter(_jettag_c_iterate_7_4.getTagInfo().getAttribute("delimiter"),238,313);
                        out.loopIterate();
                        out.write(NL);         
                        out.write("\t\t\t\t");  //$NON-NLS-1$        
                        out.setTag("class",318,433);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(115);
                        RuntimeTagElement _jettag_java_class_8_5 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_8_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_java_class_8_5.setRuntimeParent(_jettag_c_iterate_7_4);
                        _jettag_java_class_8_5.setTagInfo(_td_java_class_8_5);
                        _jettag_java_class_8_5.doStart(context, out);
                        _jettag_java_class_8_5.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(NL);         
                        out.write("\t\t\t");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_iterate_7_4.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_iterate_7_4.doEnd();
                    out.loopEnd();
                    out.endTag("iterate",124);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(12);
                    out.write("    ");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_java_package_6_3.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_java_package_6_3.doEnd();
                out.endTag("package",222);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(15);
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_ws_folder_5_2.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_ws_folder_5_2.doEnd();
            out.endTag("folder",296);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
out.bodyContentStart();
            _jettag_ws_project_4_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_ws_project_4_1.doEnd();
        out.endTag("project",360);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(13);
        out.write(NL);         
        out.write(NL);         
        // Generate DAO abstract factory 
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(39);
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(48);
        out.setTag("project",541,589);
        RuntimeTagElement _jettag_ws_project_15_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_15_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_project_15_1.setRuntimeParent(null);
        _jettag_ws_project_15_1.setTagInfo(_td_ws_project_15_1);
        _jettag_ws_project_15_1.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_ws_project_15_1.okToProcessBody()) {
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(49);
            out.setTag("folder",591,640);
            RuntimeTagElement _jettag_ws_folder_16_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_16_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_folder_16_2.setRuntimeParent(_jettag_ws_project_15_1);
            _jettag_ws_folder_16_2.setTagInfo(_td_ws_folder_16_2);
            _jettag_ws_folder_16_2.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_ws_folder_16_2.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(54);
                out.setTag("package",643,697);
                RuntimeTagElement _jettag_java_package_17_3 = context.getTagFactory().createRuntimeTag(_jetns_java, "package", "java:package", _td_java_package_17_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_package_17_3.setRuntimeParent(_jettag_ws_folder_16_2);
                _jettag_java_package_17_3.setTagInfo(_td_java_package_17_3);
                _jettag_java_package_17_3.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_java_package_17_3.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("class",701,841);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(140);
                    RuntimeTagElement _jettag_java_class_18_4 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_18_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_class_18_4.setRuntimeParent(_jettag_java_package_17_3);
                    _jettag_java_class_18_4.setTagInfo(_td_java_class_18_4);
                    _jettag_java_class_18_4.doStart(context, out);
                    _jettag_java_class_18_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_java_package_17_3.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_java_package_17_3.doEnd();
                out.endTag("package",147);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(15);
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_ws_folder_16_2.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_ws_folder_16_2.doEnd();
            out.endTag("folder",221);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
out.bodyContentStart();
            _jettag_ws_project_15_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_ws_project_15_1.doEnd();
        out.endTag("project",285);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(13);
        out.write(NL);         
        out.write(NL);         
        // Generate Derby Concrete DAOs 
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(38);
        out.write(NL);         
        out.setTag("include",928,1007);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(79);
        out.includeStart();
        RuntimeTagElement _jettag_c_include_24_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_24_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_24_1.setRuntimeParent(null);
        _jettag_c_include_24_1.setTagInfo(_td_c_include_24_1);
        _jettag_c_include_24_1.doStart(context, out);
        _jettag_c_include_24_1.doEnd();
        out.setTag(null,-1,-1);
        out.write(NL);         
        // Include other concrete DAOs here (ex: Oracle, Postgres, Mysql, etc) 
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(77);
        out.write(NL);         
        //
        //<c:include template="templates/persistence/daos/mysql/generateMySQLDAOs.jet" />
        //<c:include template="templates/persistence/daos/mssql/generateMSSQLDAOs.jet" />
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(169);
        out.write(NL);         
        out.write(NL);         
        // Generate DefaultDAOFactoryProvider 
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(44);
        out.write(NL);         
        // Removed. I think it is better if DefaultDAOFactoryProvider remains outside the generated packages 
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(107);
        out.write(NL);         
        // 
        //<ws:project name="{$theConfiguration/@project}">
        //	<ws:folder path="{$theConfiguration/@srcfolder}">
        //		<java:package name="{$theConfiguration/@daosPackage}">
        //			<java:class name="{$theConfiguration/@defaultDAOFactoryProviderClass}" template="templates/persistence/daos/classes/DefaultDAOFactoryProvider.java.jet" />
        //		</java:package>
        //	</ws:folder>
        //</ws:project>
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(371);
        out.popTemplateFile();
    }
}
