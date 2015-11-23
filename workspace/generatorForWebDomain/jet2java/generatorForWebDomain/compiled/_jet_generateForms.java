package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_generateForms implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_generateForms(String templateFile) {
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
    private static final TagInfo _td_ws_folder_5_5 = new TagInfo("ws:folder", //$NON-NLS-1$
            5, 5,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$theConfiguration/@webfolder}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_6_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            6, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/WebDomainAdministrationModel/userTypes", //$NON-NLS-1$
                "userType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_7_13 = new TagInfo("ws:file", //$NON-NLS-1$
            7, 13,
            new String[] {
                "path", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$userType/@editPagePath}", //$NON-NLS-1$
                "templates/persistence/forms/pages/editpage.jsp.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_8_13 = new TagInfo("ws:file", //$NON-NLS-1$
            8, 13,
            new String[] {
                "path", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$userType/@listPagePath}", //$NON-NLS-1$
                "templates/persistence/forms/pages/listpage.jsp.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_10_9 = new TagInfo("ws:folder", //$NON-NLS-1$
            10, 9,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$theConfiguration/@webpath}/jspf", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_11_13 = new TagInfo("ws:file", //$NON-NLS-1$
            11, 13,
            new String[] {
                "path", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "adminPrefix.jspf", //$NON-NLS-1$
                "templates/persistence/forms/pages/jspf/adminPrefix.jspf.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_12_13 = new TagInfo("ws:file", //$NON-NLS-1$
            12, 13,
            new String[] {
                "path", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "adminSuffix.jspf", //$NON-NLS-1$
                "templates/persistence/forms/pages/jspf/adminSuffix.jspf.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        // Depends: common/common.jet 
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(36);
        out.write(NL);         
        // Uses: actions/generateActions.jet 
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(43);
        out.write(NL);         
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(48);
        out.setTag("project",82,130);
        RuntimeTagElement _jettag_ws_project_4_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_4_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_project_4_1.setRuntimeParent(null);
        _jettag_ws_project_4_1.setTagInfo(_td_ws_project_4_1);
        _jettag_ws_project_4_1.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_ws_project_4_1.okToProcessBody()) {
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(49);
            out.setTag("folder",135,184);
            RuntimeTagElement _jettag_ws_folder_5_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_5_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_folder_5_5.setRuntimeParent(_jettag_ws_project_4_1);
            _jettag_ws_folder_5_5.setTagInfo(_td_ws_folder_5_5);
            _jettag_ws_folder_5_5.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_ws_folder_5_5.okToProcessBody()) {
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(75);
                out.setTag("iterate",193,268);
                RuntimeTagElement _jettag_c_iterate_6_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_6_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_6_9.setRuntimeParent(_jettag_ws_folder_5_5);
                _jettag_c_iterate_6_9.setTagInfo(_td_c_iterate_6_9);
                _jettag_c_iterate_6_9.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_6_9.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_6_9.getTagInfo().getAttribute("delimiter"),193,268);
                    out.loopIterate();
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
                    out.setTag("file",281,387);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(106);
                    RuntimeTagElement _jettag_ws_file_7_13 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_7_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_7_13.setRuntimeParent(_jettag_c_iterate_6_9);
                    _jettag_ws_file_7_13.setTagInfo(_td_ws_file_7_13);
                    _jettag_ws_file_7_13.doStart(context, out);
                    _jettag_ws_file_7_13.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
                    out.setTag("file",400,506);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(106);
                    RuntimeTagElement _jettag_ws_file_8_13 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_8_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_8_13.setRuntimeParent(_jettag_c_iterate_6_9);
                    _jettag_ws_file_8_13.setTagInfo(_td_ws_file_8_13);
                    _jettag_ws_file_8_13.doStart(context, out);
                    _jettag_ws_file_8_13.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("        ");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_6_9.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_6_9.doEnd();
                out.loopEnd();
                out.endTag("iterate",247);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(52);
                out.setTag("folder",536,588);
                RuntimeTagElement _jettag_ws_folder_10_9 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_10_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_folder_10_9.setRuntimeParent(_jettag_ws_folder_5_5);
                _jettag_ws_folder_10_9.setTagInfo(_td_ws_folder_10_9);
                _jettag_ws_folder_10_9.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_ws_folder_10_9.okToProcessBody()) {
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
                    out.setTag("file",601,707);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(106);
                    RuntimeTagElement _jettag_ws_file_11_13 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_11_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_11_13.setRuntimeParent(_jettag_ws_folder_10_9);
                    _jettag_ws_file_11_13.setTagInfo(_td_ws_file_11_13);
                    _jettag_ws_file_11_13.doStart(context, out);
                    _jettag_ws_file_11_13.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
                    out.setTag("file",720,826);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(106);
                    RuntimeTagElement _jettag_ws_file_12_13 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_12_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_12_13.setRuntimeParent(_jettag_ws_folder_10_9);
                    _jettag_ws_file_12_13.setTagInfo(_td_ws_file_12_13);
                    _jettag_ws_file_12_13.doStart(context, out);
                    _jettag_ws_file_12_13.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("        ");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_ws_folder_10_9.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_ws_folder_10_9.doEnd();
                out.endTag("folder",247);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_ws_folder_5_5.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_ws_folder_5_5.doEnd();
            out.endTag("folder",668);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
out.bodyContentStart();
            _jettag_ws_project_4_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_ws_project_4_1.doEnd();
        out.endTag("project",735);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(13);
        out.popTemplateFile();
    }
}
