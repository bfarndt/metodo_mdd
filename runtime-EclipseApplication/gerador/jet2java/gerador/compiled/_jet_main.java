package gerador.compiled;

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
    private static final TagInfo _td_ws_project_29_1 = new TagInfo("ws:project", //$NON-NLS-1$
            29, 1,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{/Domainmodel/@nomeProj}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_30_2 = new TagInfo("ws:folder", //$NON-NLS-1$
            30, 2,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "www", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_31_3 = new TagInfo("ws:file", //$NON-NLS-1$
            31, 3,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/templateIndex.jet", //$NON-NLS-1$
                "index.html", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_32_3 = new TagInfo("ws:file", //$NON-NLS-1$
            32, 3,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/templateSql.jet", //$NON-NLS-1$
                "db.sql", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_34_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            34, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/Domainmodel/Entity", //$NON-NLS-1$
                "e", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_35_4 = new TagInfo("ws:folder", //$NON-NLS-1$
            35, 4,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$e/@name}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_36_8 = new TagInfo("ws:file", //$NON-NLS-1$
            36, 8,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/templateEntityHtmlIndex.jet", //$NON-NLS-1$
                "index.php", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_41_7 = new TagInfo("ws:folder", //$NON-NLS-1$
            41, 7,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "DB", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_42_8 = new TagInfo("ws:file", //$NON-NLS-1$
            42, 8,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/templateEntityClass.jet", //$NON-NLS-1$
                "{$e/@name}.class.php", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_43_8 = new TagInfo("ws:file", //$NON-NLS-1$
            43, 8,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/templateEntityClassDB.jet", //$NON-NLS-1$
                "{$e/@name}DB.class.php", //$NON-NLS-1$
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
out.jump(44);
        out.setTag("project",863,907);
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
            out.setTag("folder",909,931);
            RuntimeTagElement _jettag_ws_folder_30_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_30_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_folder_30_2.setRuntimeParent(_jettag_ws_project_29_1);
            _jettag_ws_folder_30_2.setTagInfo(_td_ws_folder_30_2);
            _jettag_ws_folder_30_2.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_ws_folder_30_2.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                out.setTag("file",934,1001);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(67);
                RuntimeTagElement _jettag_ws_file_31_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_31_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_31_3.setRuntimeParent(_jettag_ws_folder_30_2);
                _jettag_ws_file_31_3.setTagInfo(_td_ws_file_31_3);
                _jettag_ws_file_31_3.doStart(context, out);
                _jettag_ws_file_31_3.doEnd();
                out.setTag(null,-1,-1);
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                out.setTag("file",1004,1065);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(61);
                RuntimeTagElement _jettag_ws_file_32_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_32_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_32_3.setRuntimeParent(_jettag_ws_folder_30_2);
                _jettag_ws_file_32_3.setTagInfo(_td_ws_file_32_3);
                _jettag_ws_file_32_3.doStart(context, out);
                _jettag_ws_file_32_3.doEnd();
                out.setTag(null,-1,-1);
                out.write(NL);         
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(48);
                out.setTag("iterate",1069,1117);
                RuntimeTagElement _jettag_c_iterate_34_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_34_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_34_3.setRuntimeParent(_jettag_ws_folder_30_2);
                _jettag_c_iterate_34_3.setTagInfo(_td_c_iterate_34_3);
                _jettag_c_iterate_34_3.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_34_3.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_34_3.getTagInfo().getAttribute("delimiter"),1069,1117);
                    out.loopIterate();
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(29);
                    out.setTag("folder",1121,1150);
                    RuntimeTagElement _jettag_ws_folder_35_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_35_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_folder_35_4.setRuntimeParent(_jettag_c_iterate_34_3);
                    _jettag_ws_folder_35_4.setTagInfo(_td_ws_folder_35_4);
                    _jettag_ws_folder_35_4.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_ws_folder_35_4.okToProcessBody()) {
                        out.write(NL);         
                        out.write("    \t\t\t");  //$NON-NLS-1$        
                        out.setTag("file",1158,1234);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(76);
                        RuntimeTagElement _jettag_ws_file_36_8 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_36_8); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_ws_file_36_8.setRuntimeParent(_jettag_ws_folder_35_4);
                        _jettag_ws_file_36_8.setTagInfo(_td_ws_file_36_8);
                        _jettag_ws_file_36_8.doStart(context, out);
                        _jettag_ws_file_36_8.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(NL);         
                        out.write("    \t\t\t");  //$NON-NLS-1$        
                        //<ws:file template="templates/templateEntityHtmlEdit.jet" path="edit.php"/>
                        //    			<ws:file template="templates/templateEntityHtmlDestroy.jet" path="destroy.php"/>
                // elemento tipo Comment4(org.eclipse.jet.core.parser.ast.Comment)
                out.jump(170);
                        out.write(NL);         
                        out.write("    \t\t");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_ws_folder_35_4.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_ws_folder_35_4.doEnd();
                    out.endTag("folder",269);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(12);
                    out.write(NL);         
                    out.write("    \t\t");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("    \t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(21);
                    out.setTag("folder",1445,1466);
                    RuntimeTagElement _jettag_ws_folder_41_7 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_41_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_folder_41_7.setRuntimeParent(_jettag_c_iterate_34_3);
                    _jettag_ws_folder_41_7.setTagInfo(_td_ws_folder_41_7);
                    _jettag_ws_folder_41_7.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_ws_folder_41_7.okToProcessBody()) {
                        out.write(NL);         
                        out.write("    \t\t\t");  //$NON-NLS-1$        
                        out.setTag("file",1474,1557);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(83);
                        RuntimeTagElement _jettag_ws_file_42_8 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_42_8); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_ws_file_42_8.setRuntimeParent(_jettag_ws_folder_41_7);
                        _jettag_ws_file_42_8.setTagInfo(_td_ws_file_42_8);
                        _jettag_ws_file_42_8.doStart(context, out);
                        _jettag_ws_file_42_8.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(NL);         
                        out.write("    \t\t\t");  //$NON-NLS-1$        
                        out.setTag("file",1565,1652);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(87);
                        RuntimeTagElement _jettag_ws_file_43_8 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_43_8); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_ws_file_43_8.setRuntimeParent(_jettag_ws_folder_41_7);
                        _jettag_ws_file_43_8.setTagInfo(_td_ws_file_43_8);
                        _jettag_ws_file_43_8.doStart(context, out);
                        _jettag_ws_file_43_8.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(NL);         
                        out.write("    \t\t");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_ws_folder_41_7.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_ws_folder_41_7.doEnd();
                    out.endTag("folder",193);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(12);
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_34_3.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_34_3.doEnd();
                out.loopEnd();
                out.endTag("iterate",557);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_ws_folder_30_2.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_ws_folder_30_2.doEnd();
            out.endTag("folder",758);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
            out.write(NL);         
out.bodyContentStart();
            _jettag_ws_project_29_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_ws_project_29_1.doEnd();
        out.endTag("project",796);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(13);
        out.popTemplateFile();
    }
}
