package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_generateDerbyScript implements JET2Template {
    private final String templateFile;
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_generateDerbyScript(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_ws_project_1_1 = new TagInfo("ws:project", //$NON-NLS-1$
            1, 1,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$theConfiguration/@project}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_2_2 = new TagInfo("ws:folder", //$NON-NLS-1$
            2, 2,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "scripts", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_3_3 = new TagInfo("ws:file", //$NON-NLS-1$
            3, 3,
            new String[] {
                "path", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "create.sql", //$NON-NLS-1$
                "templates/persistence/daos/derby/sql/createDerby.sql.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(48);
        out.setTag("project",0,48);
        RuntimeTagElement _jettag_ws_project_1_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_project_1_1.setRuntimeParent(null);
        _jettag_ws_project_1_1.setTagInfo(_td_ws_project_1_1);
        _jettag_ws_project_1_1.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_ws_project_1_1.okToProcessBody()) {
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(26);
            out.setTag("folder",50,76);
            RuntimeTagElement _jettag_ws_folder_2_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_2_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_folder_2_2.setRuntimeParent(_jettag_ws_project_1_1);
            _jettag_ws_folder_2_2.setTagInfo(_td_ws_folder_2_2);
            _jettag_ws_folder_2_2.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_ws_folder_2_2.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                out.setTag("file",79,176);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(97);
                RuntimeTagElement _jettag_ws_file_3_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_3_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_3_3.setRuntimeParent(_jettag_ws_folder_2_2);
                _jettag_ws_file_3_3.setTagInfo(_td_ws_file_3_3);
                _jettag_ws_file_3_3.doStart(context, out);
                _jettag_ws_file_3_3.doEnd();
                out.setTag(null,-1,-1);
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_ws_folder_2_2.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_ws_folder_2_2.doEnd();
            out.endTag("folder",102);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
out.bodyContentStart();
            _jettag_ws_project_1_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_ws_project_1_1.doEnd();
        out.endTag("project",143);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(13);
        out.popTemplateFile();
    }
}
