package my.jet.transformation.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_main implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_main(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_8_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            8, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "org.eclipse.jet.taglib.control.iterateSetsContext", //$NON-NLS-1$
                "true()", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_9_1 = new TagInfo("c:set", //$NON-NLS-1$
            9, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "/Domainmodel", //$NON-NLS-1$
                "projectName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_project_29_1 = new TagInfo("ws:project", //$NON-NLS-1$
            29, 1,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{/Domainmodel/@projectName}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_30_2 = new TagInfo("ws:folder", //$NON-NLS-1$
            30, 2,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "www", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_31_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            31, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/Domainmodel/Entity", //$NON-NLS-1$
                "e", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_32_2 = new TagInfo("ws:folder", //$NON-NLS-1$
            32, 2,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "area{$e/@name}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_34_5 = new TagInfo("ws:file", //$NON-NLS-1$
            34, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/templateExemplo.jet", //$NON-NLS-1$
                "ent{$e/@name}.php", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(59);
        out.write(NL);         
        // Main entry point for my.jet.transformation 
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(52);
        out.write(NL);         
        out.write(NL);         
        // 
        //  Let c:iterate tags set the XPath context object.
        //  For 100% compatibility with JET 0.9.x or earlier, remove this statement
        // 
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(136);
        out.write(NL);         
        out.setTag("setVariable",251,339);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(88);
        RuntimeTagElement _jettag_c_setVariable_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_8_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_8_1.setRuntimeParent(null);
        _jettag_c_setVariable_8_1.setTagInfo(_td_c_setVariable_8_1);
        _jettag_c_setVariable_8_1.doStart(context, out);
        _jettag_c_setVariable_8_1.doEnd();
        out.setTag(null,-1,-1);
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(48);
        out.setTag("set",340,388);
        RuntimeTagElement _jettag_c_set_9_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_9_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_9_1.setRuntimeParent(null);
        _jettag_c_set_9_1.setTagInfo(_td_c_set_9_1);
        _jettag_c_set_9_1.doStart(context, out);
        JET2Writer _jettag_c_set_9_1_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_c_set_9_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("projetoMeu");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_set_9_1.handleBodyContent(out);
        }
        out = _jettag_c_set_9_1_saved_out;
out.bodyContentEnd();
        _jettag_c_set_9_1.doEnd();
        out.endTag("set",10);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(8);
        out.write(NL);         
        out.write(NL);         
        // 
        //TODO: traverse input model, performing calculations and storing 
        //the results as model annotations via c:set tag 
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(123);
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        //
        //TODO: traverse annotated model, performing text generation actions 
        //such as ws:file, ws:folder and ws:project 
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(120);
        out.write(NL);         
        out.write("   ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        // For debug purposes, dump the annotated input model in 
        //   the root of the project containing the original input model.
        //   
        //   Note that model formatting may not be identical, and that in
        //   the case of non-XML input models, the dump may look quite different.
// elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
out.jump(268);
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(47);
        out.setTag("project",929,976);
        RuntimeTagElement _jettag_ws_project_29_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_29_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_project_29_1.setRuntimeParent(null);
        _jettag_ws_project_29_1.setTagInfo(_td_ws_project_29_1);
        _jettag_ws_project_29_1.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_ws_project_29_1.okToProcessBody()) {
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(22);
            out.setTag("folder",978,1000);
            RuntimeTagElement _jettag_ws_folder_30_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_30_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_folder_30_2.setRuntimeParent(_jettag_ws_project_29_1);
            _jettag_ws_folder_30_2.setTagInfo(_td_ws_folder_30_2);
            _jettag_ws_folder_30_2.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_ws_folder_30_2.okToProcessBody()) {
                out.write(NL);         
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(48);
                out.setTag("iterate",1001,1049);
                RuntimeTagElement _jettag_c_iterate_31_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_31_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_31_1.setRuntimeParent(_jettag_ws_folder_30_2);
                _jettag_c_iterate_31_1.setTagInfo(_td_c_iterate_31_1);
                _jettag_c_iterate_31_1.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_31_1.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_31_1.getTagInfo().getAttribute("delimiter"),1001,1049);
                    out.loopIterate();
                    out.write(NL);         
                    out.write("\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(33);
                    out.setTag("folder",1051,1084);
                    RuntimeTagElement _jettag_ws_folder_32_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_32_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_folder_32_2.setRuntimeParent(_jettag_c_iterate_31_1);
                    _jettag_ws_folder_32_2.setTagInfo(_td_ws_folder_32_2);
                    _jettag_ws_folder_32_2.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_ws_folder_32_2.okToProcessBody()) {
                        out.write(NL);         
                        out.write(NL);         
                        out.write("    ");  //$NON-NLS-1$        
                        out.setTag("file",1090,1166);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(76);
                        RuntimeTagElement _jettag_ws_file_34_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_34_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_ws_file_34_5.setRuntimeParent(_jettag_ws_folder_32_2);
                        _jettag_ws_file_34_5.setTagInfo(_td_ws_file_34_5);
                        _jettag_ws_file_34_5.doStart(context, out);
                        _jettag_ws_file_34_5.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(NL);         
                        out.write("    ");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("    ");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_ws_folder_32_2.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_ws_folder_32_2.doEnd();
                    out.endTag("folder",92);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(12);
                    out.write(NL);         
                    out.write(NL);         
        out.bodyContentStart();
                    _jettag_c_iterate_31_1.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_31_1.doEnd();
                out.loopEnd();
                out.endTag("iterate",141);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write(NL);         
    out.bodyContentStart();
                _jettag_ws_folder_30_2.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_ws_folder_30_2.doEnd();
            out.endTag("folder",204);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
            out.write(NL);         
out.bodyContentStart();
            _jettag_ws_project_29_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_ws_project_29_1.doEnd();
        out.endTag("project",242);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(13);
        out.popTemplateFile();
    }
}
