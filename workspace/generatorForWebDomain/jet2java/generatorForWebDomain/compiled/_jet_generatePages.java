package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_generatePages implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_generatePages(String templateFile) {
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
    private static final TagInfo _td_ws_folder_2_5 = new TagInfo("ws:folder", //$NON-NLS-1$
            2, 5,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$theConfiguration/@webfolder}/gen", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_3_6 = new TagInfo("c:iterate", //$NON-NLS-1$
            3, 6,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$navigationModel/Navigation/pages", //$NON-NLS-1$
                "page", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_4_13 = new TagInfo("ws:file", //$NON-NLS-1$
            4, 13,
            new String[] {
                "path", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$page/@name}.jsp", //$NON-NLS-1$
                "templates/navigation/pages/page.jsp.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_6_6 = new TagInfo("c:if", //$NON-NLS-1$
            6, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$featuresModel/WebDomainFeatures/@userContent = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_7_4 = new TagInfo("ws:file", //$NON-NLS-1$
            7, 4,
            new String[] {
                "path", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "uploadUserCommentForm.jsp", //$NON-NLS-1$
                "templates/navigation/pages/uploadUserCommentForm.jsp.jet", //$NON-NLS-1$
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
            out.write("    ");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(53);
            out.setTag("folder",53,106);
            RuntimeTagElement _jettag_ws_folder_2_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_2_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_folder_2_5.setRuntimeParent(_jettag_ws_project_1_1);
            _jettag_ws_folder_2_5.setTagInfo(_td_ws_folder_2_5);
            _jettag_ws_folder_2_5.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_ws_folder_2_5.okToProcessBody()) {
                out.write(NL);         
                out.write("    \t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(65);
                out.setTag("iterate",112,177);
                RuntimeTagElement _jettag_c_iterate_3_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_3_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_3_6.setRuntimeParent(_jettag_ws_folder_2_5);
                _jettag_c_iterate_3_6.setTagInfo(_td_c_iterate_3_6);
                _jettag_c_iterate_3_6.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_3_6.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_3_6.getTagInfo().getAttribute("delimiter"),112,177);
                    out.loopIterate();
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
                    out.setTag("file",190,277);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(87);
                    RuntimeTagElement _jettag_ws_file_4_13 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_4_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_4_13.setRuntimeParent(_jettag_c_iterate_3_6);
                    _jettag_ws_file_4_13.setTagInfo(_td_ws_file_4_13);
                    _jettag_ws_file_4_13.doStart(context, out);
                    _jettag_ws_file_4_13.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("    \t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_3_6.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_3_6.doEnd();
                out.loopEnd();
                out.endTag("iterate",106);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("    \t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(68);
                out.setTag("if",301,369);
                RuntimeTagElement _jettag_c_if_6_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_6_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_6_6.setRuntimeParent(_jettag_ws_folder_2_5);
                _jettag_c_if_6_6.setTagInfo(_td_c_if_6_6);
                _jettag_c_if_6_6.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_6_6.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",373,485);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(112);
                    RuntimeTagElement _jettag_ws_file_7_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_7_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_7_4.setRuntimeParent(_jettag_c_if_6_6);
                    _jettag_ws_file_7_4.setTagInfo(_td_ws_file_7_4);
                    _jettag_ws_file_7_4.doStart(context, out);
                    _jettag_ws_file_7_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_6_6.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_6_6.doEnd();
                out.endTag("if",119);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_ws_folder_2_5.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_ws_folder_2_5.doEnd();
            out.endTag("folder",394);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
out.bodyContentStart();
            _jettag_ws_project_1_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_ws_project_1_1.doEnd();
        out.endTag("project",465);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(13);
        out.popTemplateFile();
    }
}
