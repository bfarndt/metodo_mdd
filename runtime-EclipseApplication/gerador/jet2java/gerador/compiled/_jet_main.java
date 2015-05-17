package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_main implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_f = "org.eclipse.jet.formatTags"; //$NON-NLS-1$
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
    private static final TagInfo _td_c_iterate_31_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            31, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/Domainmodel/Page", //$NON-NLS-1$
                "currentPage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_32_4 = new TagInfo("ws:file", //$NON-NLS-1$
            32, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/templateHtml.jet", //$NON-NLS-1$
                "{$currentPage/@name}.php", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_35_3 = new TagInfo("ws:folder", //$NON-NLS-1$
            35, 3,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "class", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_36_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            36, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/Domainmodel/Entity", //$NON-NLS-1$
                "e", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_37_5 = new TagInfo("c:set", //$NON-NLS-1$
            37, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$e", //$NON-NLS-1$
                "className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_37_41 = new TagInfo("f:uc", //$NON-NLS-1$
            37, 41,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_58 = new TagInfo("c:get", //$NON-NLS-1$
            37, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_38_5 = new TagInfo("ws:file", //$NON-NLS-1$
            38, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/templateEntityClass.jet", //$NON-NLS-1$
                "{$e/@className}.class.php", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_39_5 = new TagInfo("ws:file", //$NON-NLS-1$
            39, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/templateEntityClassDB.jet", //$NON-NLS-1$
                "{$e/@className}DB.class.php", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_43_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            43, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/Domainmodel/Entity", //$NON-NLS-1$
                "currentEntity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_44_4 = new TagInfo("ws:folder", //$NON-NLS-1$
            44, 4,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$currentEntity/@name}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_45_5 = new TagInfo("ws:file", //$NON-NLS-1$
            45, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/templateEntityActionSave.jet", //$NON-NLS-1$
                "save.php", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_46_5 = new TagInfo("ws:file", //$NON-NLS-1$
            46, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/templateEntityActionDelete.jet", //$NON-NLS-1$
                "delete.php", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_50_3 = new TagInfo("ws:folder", //$NON-NLS-1$
            50, 3,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "css", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_51_4 = new TagInfo("ws:file", //$NON-NLS-1$
            51, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/CSS/templateBootstrap-datepicker.jet", //$NON-NLS-1$
                "bootstrap-datepicker.css", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_52_4 = new TagInfo("ws:file", //$NON-NLS-1$
            52, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/CSS/templateBootstrap-datepicker.standalone.jet", //$NON-NLS-1$
                "bootstrap-datepicker.standalone.css", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_53_4 = new TagInfo("ws:file", //$NON-NLS-1$
            53, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/CSS/templateBootstrap-datepicker3.jet", //$NON-NLS-1$
                "bootstrap-datepicker3.css", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_54_4 = new TagInfo("ws:file", //$NON-NLS-1$
            54, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/CSS/templateBootstrap-datepicker3.standalone.jet", //$NON-NLS-1$
                "bootstrap-datepicker3.standalone.css", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_57_3 = new TagInfo("ws:folder", //$NON-NLS-1$
            57, 3,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "js", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_58_4 = new TagInfo("ws:file", //$NON-NLS-1$
            58, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/JS/templateBootstrap-datepicker.jet", //$NON-NLS-1$
                "bootstrap-datepicker.js", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_60_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            60, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/Domainmodel/Entity", //$NON-NLS-1$
                "currentEntity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_61_5 = new TagInfo("ws:file", //$NON-NLS-1$
            61, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/templateEntityJS.jet", //$NON-NLS-1$
                "{$currentEntity/@name}.js", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_66_2 = new TagInfo("ws:file", //$NON-NLS-1$
            66, 2,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/templateSql.jet", //$NON-NLS-1$
                "db.sql", //$NON-NLS-1$
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
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(56);
                out.setTag("iterate",934,990);
                RuntimeTagElement _jettag_c_iterate_31_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_31_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_31_3.setRuntimeParent(_jettag_ws_folder_30_2);
                _jettag_c_iterate_31_3.setTagInfo(_td_c_iterate_31_3);
                _jettag_c_iterate_31_3.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_31_3.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_31_3.getTagInfo().getAttribute("delimiter"),934,990);
                    out.loopIterate();
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",994,1075);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(81);
                    RuntimeTagElement _jettag_ws_file_32_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_32_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_32_4.setRuntimeParent(_jettag_c_iterate_31_3);
                    _jettag_ws_file_32_4.setTagInfo(_td_ws_file_32_4);
                    _jettag_ws_file_32_4.doStart(context, out);
                    _jettag_ws_file_32_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_31_3.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_31_3.doEnd();
                out.loopEnd();
                out.endTag("iterate",88);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(24);
                out.setTag("folder",1094,1118);
                RuntimeTagElement _jettag_ws_folder_35_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_35_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_folder_35_3.setRuntimeParent(_jettag_ws_folder_30_2);
                _jettag_ws_folder_35_3.setTagInfo(_td_ws_folder_35_3);
                _jettag_ws_folder_35_3.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_ws_folder_35_3.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(48);
                    out.setTag("iterate",1122,1170);
                    RuntimeTagElement _jettag_c_iterate_36_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_36_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_36_4.setRuntimeParent(_jettag_ws_folder_35_3);
                    _jettag_c_iterate_36_4.setTagInfo(_td_c_iterate_36_4);
                    _jettag_c_iterate_36_4.doStart(context, out);
                    out.loopStart();
                    out.setTag(null,-1,-1);
                    while (_jettag_c_iterate_36_4.okToProcessBody()) {
            out.bodyContentEnd();
            out.handleDelimiter(_jettag_c_iterate_36_4.getTagInfo().getAttribute("delimiter"),1122,1170);
                        out.loopIterate();
                        out.write(NL);         
                        out.write("\t\t\t\t");  //$NON-NLS-1$        
                // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
                out.jump(36);
                        out.setTag("set",1175,1211);
                        RuntimeTagElement _jettag_c_set_37_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_37_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_set_37_5.setRuntimeParent(_jettag_c_iterate_36_4);
                        _jettag_c_set_37_5.setTagInfo(_td_c_set_37_5);
                        _jettag_c_set_37_5.doStart(context, out);
                        JET2Writer _jettag_c_set_37_5_saved_out = out;
                        out.setTag(null,-1,-1);
                        while (_jettag_c_set_37_5.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
                    out.jump(17);
                            out.setTag("uc",1211,1228);
                            RuntimeTagElement _jettag_f_uc_37_41 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_37_41); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_f_uc_37_41.setRuntimeParent(_jettag_c_set_37_5);
                            _jettag_f_uc_37_41.setTagInfo(_td_f_uc_37_41);
                            _jettag_f_uc_37_41.doStart(context, out);
                            JET2Writer _jettag_f_uc_37_41_saved_out = out;
                            out.setTag(null,-1,-1);
                            while (_jettag_f_uc_37_41.okToProcessBody()) {
                                out = out.newNestedContentWriter();
                                out.setTag("get",1228,1255);
                        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                        out.jump(27);
                                RuntimeTagElement _jettag_c_get_37_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_58); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_37_58.setRuntimeParent(_jettag_f_uc_37_41);
                                _jettag_c_get_37_58.setTagInfo(_td_c_get_37_58);
                                _jettag_c_get_37_58.doStart(context, out);
                                _jettag_c_get_37_58.doEnd();
                                out.setTag(null,-1,-1);
                    out.bodyContentStart();
                                _jettag_f_uc_37_41.handleBodyContent(out);
                            }
                            out = _jettag_f_uc_37_41_saved_out;
                    out.bodyContentEnd();
                            _jettag_f_uc_37_41.doEnd();
                            out.endTag("uc",27);
                    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
                    out.jump(7);
                out.bodyContentStart();
                            _jettag_c_set_37_5.handleBodyContent(out);
                        }
                        out = _jettag_c_set_37_5_saved_out;
                out.bodyContentEnd();
                        _jettag_c_set_37_5.doEnd();
                        out.endTag("set",51);
                // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
                out.jump(8);
                        out.write(NL);         
                        out.write("\t\t\t\t");  //$NON-NLS-1$        
                        out.setTag("file",1275,1364);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(89);
                        RuntimeTagElement _jettag_ws_file_38_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_38_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_ws_file_38_5.setRuntimeParent(_jettag_c_iterate_36_4);
                        _jettag_ws_file_38_5.setTagInfo(_td_ws_file_38_5);
                        _jettag_ws_file_38_5.doStart(context, out);
                        _jettag_ws_file_38_5.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(NL);         
                        out.write("\t\t\t\t");  //$NON-NLS-1$        
                        out.setTag("file",1369,1462);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(93);
                        RuntimeTagElement _jettag_ws_file_39_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_39_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_ws_file_39_5.setRuntimeParent(_jettag_c_iterate_36_4);
                        _jettag_ws_file_39_5.setTagInfo(_td_ws_file_39_5);
                        _jettag_ws_file_39_5.doStart(context, out);
                        _jettag_ws_file_39_5.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(NL);         
                        out.write("\t\t\t");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_iterate_36_4.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_iterate_36_4.doEnd();
                    out.loopEnd();
                    out.endTag("iterate",296);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(12);
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_ws_folder_35_3.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_ws_folder_35_3.doEnd();
                out.endTag("folder",363);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(60);
                out.setTag("iterate",1497,1557);
                RuntimeTagElement _jettag_c_iterate_43_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_43_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_43_3.setRuntimeParent(_jettag_ws_folder_30_2);
                _jettag_c_iterate_43_3.setTagInfo(_td_c_iterate_43_3);
                _jettag_c_iterate_43_3.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_43_3.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_43_3.getTagInfo().getAttribute("delimiter"),1497,1557);
                    out.loopIterate();
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(41);
                    out.setTag("folder",1561,1602);
                    RuntimeTagElement _jettag_ws_folder_44_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_44_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_folder_44_4.setRuntimeParent(_jettag_c_iterate_43_3);
                    _jettag_ws_folder_44_4.setTagInfo(_td_ws_folder_44_4);
                    _jettag_ws_folder_44_4.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_ws_folder_44_4.okToProcessBody()) {
                        out.write(NL);         
                        out.write("\t\t\t\t");  //$NON-NLS-1$        
                        out.setTag("file",1607,1684);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(77);
                        RuntimeTagElement _jettag_ws_file_45_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_45_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_ws_file_45_5.setRuntimeParent(_jettag_ws_folder_44_4);
                        _jettag_ws_file_45_5.setTagInfo(_td_ws_file_45_5);
                        _jettag_ws_file_45_5.doStart(context, out);
                        _jettag_ws_file_45_5.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(NL);         
                        out.write("\t\t\t\t");  //$NON-NLS-1$        
                        out.setTag("file",1689,1770);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(81);
                        RuntimeTagElement _jettag_ws_file_46_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_46_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_ws_file_46_5.setRuntimeParent(_jettag_ws_folder_44_4);
                        _jettag_ws_file_46_5.setTagInfo(_td_ws_file_46_5);
                        _jettag_ws_file_46_5.doStart(context, out);
                        _jettag_ws_file_46_5.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(NL);         
                        out.write("\t\t\t");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_ws_folder_44_4.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_ws_folder_44_4.doEnd();
                    out.endTag("folder",172);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(12);
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_43_3.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_43_3.doEnd();
                out.loopEnd();
                out.endTag("iterate",232);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(22);
                out.setTag("folder",1805,1827);
                RuntimeTagElement _jettag_ws_folder_50_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_50_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_folder_50_3.setRuntimeParent(_jettag_ws_folder_30_2);
                _jettag_ws_folder_50_3.setTagInfo(_td_ws_folder_50_3);
                _jettag_ws_folder_50_3.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_ws_folder_50_3.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",1831,1932);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(101);
                    RuntimeTagElement _jettag_ws_file_51_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_51_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_51_4.setRuntimeParent(_jettag_ws_folder_50_3);
                    _jettag_ws_file_51_4.setTagInfo(_td_ws_file_51_4);
                    _jettag_ws_file_51_4.doStart(context, out);
                    _jettag_ws_file_51_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",1936,2059);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(123);
                    RuntimeTagElement _jettag_ws_file_52_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_52_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_52_4.setRuntimeParent(_jettag_ws_folder_50_3);
                    _jettag_ws_file_52_4.setTagInfo(_td_ws_file_52_4);
                    _jettag_ws_file_52_4.doStart(context, out);
                    _jettag_ws_file_52_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",2063,2166);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(103);
                    RuntimeTagElement _jettag_ws_file_53_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_53_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_53_4.setRuntimeParent(_jettag_ws_folder_50_3);
                    _jettag_ws_file_53_4.setTagInfo(_td_ws_file_53_4);
                    _jettag_ws_file_53_4.doStart(context, out);
                    _jettag_ws_file_53_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",2170,2295);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(125);
                    RuntimeTagElement _jettag_ws_file_54_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_54_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_54_4.setRuntimeParent(_jettag_ws_folder_50_3);
                    _jettag_ws_file_54_4.setTagInfo(_td_ws_file_54_4);
                    _jettag_ws_file_54_4.doStart(context, out);
                    _jettag_ws_file_54_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_ws_folder_50_3.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_ws_folder_50_3.doEnd();
                out.endTag("folder",471);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(21);
                out.setTag("folder",2314,2335);
                RuntimeTagElement _jettag_ws_folder_57_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_57_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_folder_57_3.setRuntimeParent(_jettag_ws_folder_30_2);
                _jettag_ws_folder_57_3.setTagInfo(_td_ws_folder_57_3);
                _jettag_ws_folder_57_3.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_ws_folder_57_3.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",2339,2438);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(99);
                    RuntimeTagElement _jettag_ws_file_58_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_58_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_58_4.setRuntimeParent(_jettag_ws_folder_57_3);
                    _jettag_ws_file_58_4.setTagInfo(_td_ws_file_58_4);
                    _jettag_ws_file_58_4.doStart(context, out);
                    _jettag_ws_file_58_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(60);
                    out.setTag("iterate",2443,2503);
                    RuntimeTagElement _jettag_c_iterate_60_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_60_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_60_4.setRuntimeParent(_jettag_ws_folder_57_3);
                    _jettag_c_iterate_60_4.setTagInfo(_td_c_iterate_60_4);
                    _jettag_c_iterate_60_4.doStart(context, out);
                    out.loopStart();
                    out.setTag(null,-1,-1);
                    while (_jettag_c_iterate_60_4.okToProcessBody()) {
            out.bodyContentEnd();
            out.handleDelimiter(_jettag_c_iterate_60_4.getTagInfo().getAttribute("delimiter"),2443,2503);
                        out.loopIterate();
                        out.write(NL);         
                        out.write("\t\t\t\t");  //$NON-NLS-1$        
                        out.setTag("file",2508,2594);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(86);
                        RuntimeTagElement _jettag_ws_file_61_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_61_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_ws_file_61_5.setRuntimeParent(_jettag_c_iterate_60_4);
                        _jettag_ws_file_61_5.setTagInfo(_td_ws_file_61_5);
                        _jettag_ws_file_61_5.doStart(context, out);
                        _jettag_ws_file_61_5.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(NL);         
                        out.write("\t\t\t");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_iterate_60_4.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_iterate_60_4.doEnd();
                    out.loopEnd();
                    out.endTag("iterate",95);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(12);
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_ws_folder_57_3.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_ws_folder_57_3.doEnd();
                out.endTag("folder",278);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_ws_folder_30_2.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_ws_folder_30_2.doEnd();
            out.endTag("folder",1696);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.setTag("file",2642,2703);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(61);
            RuntimeTagElement _jettag_ws_file_66_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_66_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_66_2.setRuntimeParent(_jettag_ws_project_29_1);
            _jettag_ws_file_66_2.setTagInfo(_td_ws_file_66_2);
            _jettag_ws_file_66_2.doStart(context, out);
            _jettag_ws_file_66_2.doEnd();
            out.setTag(null,-1,-1);
            out.write(NL);         
            out.write(NL);         
out.bodyContentStart();
            _jettag_ws_project_29_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_ws_project_29_1.doEnd();
        out.endTag("project",1798);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(13);
        out.popTemplateFile();
    }
}
