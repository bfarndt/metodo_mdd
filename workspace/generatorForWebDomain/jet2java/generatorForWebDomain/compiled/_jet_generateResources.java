package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_generateResources implements JET2Template {
    private final String templateFile;
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_generateResources(String templateFile) {
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
                "{$theConfiguration/@resourcesPackage}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_resource_7_4 = new TagInfo("java:resource", //$NON-NLS-1$
            7, 4,
            new String[] {
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "messages.properties", //$NON-NLS-1$
                "templates/persistence/resources/files/messages.properties.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        // Depends: common/common.jet 
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(36);
        out.write(NL);         
        out.write(NL);         
        // Generate messages resource file 
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(41);
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(48);
        out.setTag("project",80,128);
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
            out.setTag("folder",130,179);
            RuntimeTagElement _jettag_ws_folder_5_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_5_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_folder_5_2.setRuntimeParent(_jettag_ws_project_4_1);
            _jettag_ws_folder_5_2.setTagInfo(_td_ws_folder_5_2);
            _jettag_ws_folder_5_2.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_ws_folder_5_2.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(59);
                out.setTag("package",182,241);
                RuntimeTagElement _jettag_java_package_6_3 = context.getTagFactory().createRuntimeTag(_jetns_java, "package", "java:package", _td_java_package_6_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_package_6_3.setRuntimeParent(_jettag_ws_folder_5_2);
                _jettag_java_package_6_3.setTagInfo(_td_java_package_6_3);
                _jettag_java_package_6_3.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_java_package_6_3.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("resource",245,362);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(117);
                    RuntimeTagElement _jettag_java_resource_7_4 = context.getTagFactory().createRuntimeTag(_jetns_java, "resource", "java:resource", _td_java_resource_7_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_resource_7_4.setRuntimeParent(_jettag_java_package_6_3);
                    _jettag_java_resource_7_4.setTagInfo(_td_java_resource_7_4);
                    _jettag_java_resource_7_4.doStart(context, out);
                    _jettag_java_resource_7_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_java_package_6_3.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_java_package_6_3.doEnd();
                out.endTag("package",124);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(15);
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_ws_folder_5_2.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_ws_folder_5_2.doEnd();
            out.endTag("folder",203);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
out.bodyContentStart();
            _jettag_ws_project_4_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_ws_project_4_1.doEnd();
        out.endTag("project",267);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(13);
        out.popTemplateFile();
    }
}
