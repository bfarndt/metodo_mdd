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
    private static final TagInfo _td_c_include_29_1 = new TagInfo("c:include", //$NON-NLS-1$
            29, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/settings.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_project_31_1 = new TagInfo("ws:project", //$NON-NLS-1$
            31, 1,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{/Domainmodel/@nomeProj}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_32_2 = new TagInfo("ws:folder", //$NON-NLS-1$
            32, 2,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "www", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_33_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            33, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/Domainmodel/Page", //$NON-NLS-1$
                "currentPage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_34_4 = new TagInfo("ws:file", //$NON-NLS-1$
            34, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/templateHtml.jet", //$NON-NLS-1$
                "{$currentPage/@name}.php", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_37_3 = new TagInfo("ws:folder", //$NON-NLS-1$
            37, 3,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "class", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_38_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            38, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/Domainmodel/Entity", //$NON-NLS-1$
                "currentEntity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_39_5 = new TagInfo("ws:file", //$NON-NLS-1$
            39, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/templateEntityClass.jet", //$NON-NLS-1$
                "{$currentEntity/@className}.class.php", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_40_5 = new TagInfo("ws:file", //$NON-NLS-1$
            40, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/templateEntityClassDB.jet", //$NON-NLS-1$
                "{$currentEntity/@className}DB.class.php", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_44_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            44, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/Domainmodel/Entity", //$NON-NLS-1$
                "currentEntity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_45_4 = new TagInfo("ws:folder", //$NON-NLS-1$
            45, 4,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$currentEntity/@name}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_46_5 = new TagInfo("ws:file", //$NON-NLS-1$
            46, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/templateEntityActionSave.jet", //$NON-NLS-1$
                "save.php", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_47_5 = new TagInfo("ws:file", //$NON-NLS-1$
            47, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/templateEntityActionDelete.jet", //$NON-NLS-1$
                "delete.php", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_51_3 = new TagInfo("ws:folder", //$NON-NLS-1$
            51, 3,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "css", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_52_4 = new TagInfo("ws:file", //$NON-NLS-1$
            52, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/CSS/templateBootstrap-datepicker.jet", //$NON-NLS-1$
                "bootstrap-datepicker.css", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_53_4 = new TagInfo("ws:file", //$NON-NLS-1$
            53, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/CSS/templateBootstrap-datepicker.standalone.jet", //$NON-NLS-1$
                "bootstrap-datepicker.standalone.css", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_54_4 = new TagInfo("ws:file", //$NON-NLS-1$
            54, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/CSS/templateBootstrap-datepicker3.jet", //$NON-NLS-1$
                "bootstrap-datepicker3.css", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_55_4 = new TagInfo("ws:file", //$NON-NLS-1$
            55, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/CSS/templateBootstrap-datepicker3.standalone.jet", //$NON-NLS-1$
                "bootstrap-datepicker3.standalone.css", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_57_4 = new TagInfo("ws:file", //$NON-NLS-1$
            57, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/CSS/templateBootstrap-table.jet", //$NON-NLS-1$
                "bootstrap-table.css", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_58_4 = new TagInfo("ws:file", //$NON-NLS-1$
            58, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/CSS/bootstrap.css.jet", //$NON-NLS-1$
                "bootstrap.css", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_59_4 = new TagInfo("ws:file", //$NON-NLS-1$
            59, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/CSS/theme.css.jet", //$NON-NLS-1$
                "theme.css", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_60_4 = new TagInfo("ws:file", //$NON-NLS-1$
            60, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/CSS/sticky-footer-navbar.css.jet", //$NON-NLS-1$
                "sticky-footer-navbar.css", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_61_4 = new TagInfo("ws:file", //$NON-NLS-1$
            61, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/CSS/bootstrap.min.css.jet", //$NON-NLS-1$
                "bootstrap.min.css", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_62_4 = new TagInfo("ws:file", //$NON-NLS-1$
            62, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/CSS/bootstrap.css.map.jet", //$NON-NLS-1$
                "bootstrap.css.map", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_63_4 = new TagInfo("ws:file", //$NON-NLS-1$
            63, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/CSS/bootstrap-theme.min.css.jet", //$NON-NLS-1$
                "bootstrap-theme.min.css", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_64_4 = new TagInfo("ws:file", //$NON-NLS-1$
            64, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/CSS/bootstrap-theme.css.map.jet", //$NON-NLS-1$
                "bootstrap-theme.css.map", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_65_4 = new TagInfo("ws:file", //$NON-NLS-1$
            65, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/CSS/bootstrap-theme.css.jet", //$NON-NLS-1$
                "bootstrap-theme.css", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_68_3 = new TagInfo("ws:folder", //$NON-NLS-1$
            68, 3,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "js", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_69_4 = new TagInfo("ws:file", //$NON-NLS-1$
            69, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/JS/templateBootstrap-datepicker.jet", //$NON-NLS-1$
                "bootstrap-datepicker.js", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_71_4 = new TagInfo("ws:file", //$NON-NLS-1$
            71, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/JS/templateBootstrap-table.jet", //$NON-NLS-1$
                "bootstrap-table.js", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_73_4 = new TagInfo("ws:file", //$NON-NLS-1$
            73, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/JS/validator.js.jet", //$NON-NLS-1$
                "validator.js", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_74_4 = new TagInfo("ws:file", //$NON-NLS-1$
            74, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/JS/jquery.min.js.jet", //$NON-NLS-1$
                "jquery.min.js", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_75_4 = new TagInfo("ws:file", //$NON-NLS-1$
            75, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/JS/jquery.maskMoney.js.jet", //$NON-NLS-1$
                "jquery.maskMoney.js", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_76_4 = new TagInfo("ws:file", //$NON-NLS-1$
            76, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/JS/ie-emulation-modes-warning.js.jet", //$NON-NLS-1$
                "ie-emulation-modes-warning.js", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_77_4 = new TagInfo("ws:file", //$NON-NLS-1$
            77, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/JS/bootstrap.min.js.jet", //$NON-NLS-1$
                "bootstrap.min.js", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_78_4 = new TagInfo("ws:file", //$NON-NLS-1$
            78, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/JS/bootstrap.js.jet", //$NON-NLS-1$
                "bootstrap.js", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_79_4 = new TagInfo("ws:file", //$NON-NLS-1$
            79, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/JS/bootstrap-table.js.jet", //$NON-NLS-1$
                "bootstrap-table.js", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_80_4 = new TagInfo("ws:file", //$NON-NLS-1$
            80, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/JS/bootstrap-datepicker.js.jet", //$NON-NLS-1$
                "bootstrap-datepicker.js", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_81_4 = new TagInfo("ws:file", //$NON-NLS-1$
            81, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/JS/npm.js.jet", //$NON-NLS-1$
                "npm.js", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_83_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            83, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/Domainmodel/Entity", //$NON-NLS-1$
                "currentEntity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_84_5 = new TagInfo("ws:file", //$NON-NLS-1$
            84, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/templateEntityJS.jet", //$NON-NLS-1$
                "{$currentEntity/@name}.js", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_89_2 = new TagInfo("ws:file", //$NON-NLS-1$
            89, 2,
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
        out.setTag("include",863,910);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(47);
        out.includeStart();
        RuntimeTagElement _jettag_c_include_29_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_29_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_29_1.setRuntimeParent(null);
        _jettag_c_include_29_1.setTagInfo(_td_c_include_29_1);
        _jettag_c_include_29_1.doStart(context, out);
        _jettag_c_include_29_1.doEnd();
        out.setTag(null,-1,-1);
        out.write(NL);         
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(44);
        out.setTag("project",912,956);
        RuntimeTagElement _jettag_ws_project_31_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_31_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_project_31_1.setRuntimeParent(null);
        _jettag_ws_project_31_1.setTagInfo(_td_ws_project_31_1);
        _jettag_ws_project_31_1.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_ws_project_31_1.okToProcessBody()) {
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(22);
            out.setTag("folder",958,980);
            RuntimeTagElement _jettag_ws_folder_32_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_32_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_folder_32_2.setRuntimeParent(_jettag_ws_project_31_1);
            _jettag_ws_folder_32_2.setTagInfo(_td_ws_folder_32_2);
            _jettag_ws_folder_32_2.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_ws_folder_32_2.okToProcessBody()) {
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(56);
                out.setTag("iterate",983,1039);
                RuntimeTagElement _jettag_c_iterate_33_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_33_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_33_3.setRuntimeParent(_jettag_ws_folder_32_2);
                _jettag_c_iterate_33_3.setTagInfo(_td_c_iterate_33_3);
                _jettag_c_iterate_33_3.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_33_3.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_33_3.getTagInfo().getAttribute("delimiter"),983,1039);
                    out.loopIterate();
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",1043,1124);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(81);
                    RuntimeTagElement _jettag_ws_file_34_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_34_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_34_4.setRuntimeParent(_jettag_c_iterate_33_3);
                    _jettag_ws_file_34_4.setTagInfo(_td_ws_file_34_4);
                    _jettag_ws_file_34_4.doStart(context, out);
                    _jettag_ws_file_34_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_33_3.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_33_3.doEnd();
                out.loopEnd();
                out.endTag("iterate",88);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(24);
                out.setTag("folder",1143,1167);
                RuntimeTagElement _jettag_ws_folder_37_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_37_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_folder_37_3.setRuntimeParent(_jettag_ws_folder_32_2);
                _jettag_ws_folder_37_3.setTagInfo(_td_ws_folder_37_3);
                _jettag_ws_folder_37_3.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_ws_folder_37_3.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(60);
                    out.setTag("iterate",1171,1231);
                    RuntimeTagElement _jettag_c_iterate_38_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_38_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_38_4.setRuntimeParent(_jettag_ws_folder_37_3);
                    _jettag_c_iterate_38_4.setTagInfo(_td_c_iterate_38_4);
                    _jettag_c_iterate_38_4.doStart(context, out);
                    out.loopStart();
                    out.setTag(null,-1,-1);
                    while (_jettag_c_iterate_38_4.okToProcessBody()) {
            out.bodyContentEnd();
            out.handleDelimiter(_jettag_c_iterate_38_4.getTagInfo().getAttribute("delimiter"),1171,1231);
                        out.loopIterate();
                        out.write(NL);         
                        out.write("\t\t\t\t");  //$NON-NLS-1$        
                        out.setTag("file",1236,1337);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(101);
                        RuntimeTagElement _jettag_ws_file_39_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_39_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_ws_file_39_5.setRuntimeParent(_jettag_c_iterate_38_4);
                        _jettag_ws_file_39_5.setTagInfo(_td_ws_file_39_5);
                        _jettag_ws_file_39_5.doStart(context, out);
                        _jettag_ws_file_39_5.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(NL);         
                        out.write("\t\t\t\t");  //$NON-NLS-1$        
                        out.setTag("file",1342,1447);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(105);
                        RuntimeTagElement _jettag_ws_file_40_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_40_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_ws_file_40_5.setRuntimeParent(_jettag_c_iterate_38_4);
                        _jettag_ws_file_40_5.setTagInfo(_td_ws_file_40_5);
                        _jettag_ws_file_40_5.doStart(context, out);
                        _jettag_ws_file_40_5.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(NL);         
                        out.write("\t\t\t");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_iterate_38_4.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_iterate_38_4.doEnd();
                    out.loopEnd();
                    out.endTag("iterate",220);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(12);
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_ws_folder_37_3.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_ws_folder_37_3.doEnd();
                out.endTag("folder",299);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(60);
                out.setTag("iterate",1482,1542);
                RuntimeTagElement _jettag_c_iterate_44_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_44_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_44_3.setRuntimeParent(_jettag_ws_folder_32_2);
                _jettag_c_iterate_44_3.setTagInfo(_td_c_iterate_44_3);
                _jettag_c_iterate_44_3.doStart(context, out);
                out.loopStart();
                out.setTag(null,-1,-1);
                while (_jettag_c_iterate_44_3.okToProcessBody()) {
        out.bodyContentEnd();
        out.handleDelimiter(_jettag_c_iterate_44_3.getTagInfo().getAttribute("delimiter"),1482,1542);
                    out.loopIterate();
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(41);
                    out.setTag("folder",1546,1587);
                    RuntimeTagElement _jettag_ws_folder_45_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_45_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_folder_45_4.setRuntimeParent(_jettag_c_iterate_44_3);
                    _jettag_ws_folder_45_4.setTagInfo(_td_ws_folder_45_4);
                    _jettag_ws_folder_45_4.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_ws_folder_45_4.okToProcessBody()) {
                        out.write(NL);         
                        out.write("\t\t\t\t");  //$NON-NLS-1$        
                        out.setTag("file",1592,1669);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(77);
                        RuntimeTagElement _jettag_ws_file_46_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_46_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_ws_file_46_5.setRuntimeParent(_jettag_ws_folder_45_4);
                        _jettag_ws_file_46_5.setTagInfo(_td_ws_file_46_5);
                        _jettag_ws_file_46_5.doStart(context, out);
                        _jettag_ws_file_46_5.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(NL);         
                        out.write("\t\t\t\t");  //$NON-NLS-1$        
                        out.setTag("file",1674,1755);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(81);
                        RuntimeTagElement _jettag_ws_file_47_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_47_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_ws_file_47_5.setRuntimeParent(_jettag_ws_folder_45_4);
                        _jettag_ws_file_47_5.setTagInfo(_td_ws_file_47_5);
                        _jettag_ws_file_47_5.doStart(context, out);
                        _jettag_ws_file_47_5.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(NL);         
                        out.write("\t\t\t");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_ws_folder_45_4.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_ws_folder_45_4.doEnd();
                    out.endTag("folder",172);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(12);
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_iterate_44_3.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_iterate_44_3.doEnd();
                out.loopEnd();
                out.endTag("iterate",232);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(22);
                out.setTag("folder",1790,1812);
                RuntimeTagElement _jettag_ws_folder_51_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_51_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_folder_51_3.setRuntimeParent(_jettag_ws_folder_32_2);
                _jettag_ws_folder_51_3.setTagInfo(_td_ws_folder_51_3);
                _jettag_ws_folder_51_3.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_ws_folder_51_3.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",1816,1917);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(101);
                    RuntimeTagElement _jettag_ws_file_52_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_52_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_52_4.setRuntimeParent(_jettag_ws_folder_51_3);
                    _jettag_ws_file_52_4.setTagInfo(_td_ws_file_52_4);
                    _jettag_ws_file_52_4.doStart(context, out);
                    _jettag_ws_file_52_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",1921,2044);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(123);
                    RuntimeTagElement _jettag_ws_file_53_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_53_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_53_4.setRuntimeParent(_jettag_ws_folder_51_3);
                    _jettag_ws_file_53_4.setTagInfo(_td_ws_file_53_4);
                    _jettag_ws_file_53_4.doStart(context, out);
                    _jettag_ws_file_53_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",2048,2151);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(103);
                    RuntimeTagElement _jettag_ws_file_54_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_54_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_54_4.setRuntimeParent(_jettag_ws_folder_51_3);
                    _jettag_ws_file_54_4.setTagInfo(_td_ws_file_54_4);
                    _jettag_ws_file_54_4.doStart(context, out);
                    _jettag_ws_file_54_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",2155,2280);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(125);
                    RuntimeTagElement _jettag_ws_file_55_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_55_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_55_4.setRuntimeParent(_jettag_ws_folder_51_3);
                    _jettag_ws_file_55_4.setTagInfo(_td_ws_file_55_4);
                    _jettag_ws_file_55_4.doStart(context, out);
                    _jettag_ws_file_55_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",2288,2379);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(91);
                    RuntimeTagElement _jettag_ws_file_57_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_57_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_57_4.setRuntimeParent(_jettag_ws_folder_51_3);
                    _jettag_ws_file_57_4.setTagInfo(_td_ws_file_57_4);
                    _jettag_ws_file_57_4.doStart(context, out);
                    _jettag_ws_file_57_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",2383,2458);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(75);
                    RuntimeTagElement _jettag_ws_file_58_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_58_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_58_4.setRuntimeParent(_jettag_ws_folder_51_3);
                    _jettag_ws_file_58_4.setTagInfo(_td_ws_file_58_4);
                    _jettag_ws_file_58_4.doStart(context, out);
                    _jettag_ws_file_58_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",2462,2529);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(67);
                    RuntimeTagElement _jettag_ws_file_59_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_59_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_59_4.setRuntimeParent(_jettag_ws_folder_51_3);
                    _jettag_ws_file_59_4.setTagInfo(_td_ws_file_59_4);
                    _jettag_ws_file_59_4.doStart(context, out);
                    _jettag_ws_file_59_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",2533,2630);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(97);
                    RuntimeTagElement _jettag_ws_file_60_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_60_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_60_4.setRuntimeParent(_jettag_ws_folder_51_3);
                    _jettag_ws_file_60_4.setTagInfo(_td_ws_file_60_4);
                    _jettag_ws_file_60_4.doStart(context, out);
                    _jettag_ws_file_60_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",2634,2717);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(83);
                    RuntimeTagElement _jettag_ws_file_61_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_61_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_61_4.setRuntimeParent(_jettag_ws_folder_51_3);
                    _jettag_ws_file_61_4.setTagInfo(_td_ws_file_61_4);
                    _jettag_ws_file_61_4.doStart(context, out);
                    _jettag_ws_file_61_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",2721,2804);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(83);
                    RuntimeTagElement _jettag_ws_file_62_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_62_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_62_4.setRuntimeParent(_jettag_ws_folder_51_3);
                    _jettag_ws_file_62_4.setTagInfo(_td_ws_file_62_4);
                    _jettag_ws_file_62_4.doStart(context, out);
                    _jettag_ws_file_62_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",2808,2903);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(95);
                    RuntimeTagElement _jettag_ws_file_63_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_63_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_63_4.setRuntimeParent(_jettag_ws_folder_51_3);
                    _jettag_ws_file_63_4.setTagInfo(_td_ws_file_63_4);
                    _jettag_ws_file_63_4.doStart(context, out);
                    _jettag_ws_file_63_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",2907,3002);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(95);
                    RuntimeTagElement _jettag_ws_file_64_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_64_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_64_4.setRuntimeParent(_jettag_ws_folder_51_3);
                    _jettag_ws_file_64_4.setTagInfo(_td_ws_file_64_4);
                    _jettag_ws_file_64_4.doStart(context, out);
                    _jettag_ws_file_64_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",3006,3093);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(87);
                    RuntimeTagElement _jettag_ws_file_65_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_65_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_65_4.setRuntimeParent(_jettag_ws_folder_51_3);
                    _jettag_ws_file_65_4.setTagInfo(_td_ws_file_65_4);
                    _jettag_ws_file_65_4.doStart(context, out);
                    _jettag_ws_file_65_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_ws_folder_51_3.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_ws_folder_51_3.doEnd();
                out.endTag("folder",1284);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(21);
                out.setTag("folder",3112,3133);
                RuntimeTagElement _jettag_ws_folder_68_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_68_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_folder_68_3.setRuntimeParent(_jettag_ws_folder_32_2);
                _jettag_ws_folder_68_3.setTagInfo(_td_ws_folder_68_3);
                _jettag_ws_folder_68_3.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_ws_folder_68_3.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",3137,3236);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(99);
                    RuntimeTagElement _jettag_ws_file_69_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_69_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_69_4.setRuntimeParent(_jettag_ws_folder_68_3);
                    _jettag_ws_file_69_4.setTagInfo(_td_ws_file_69_4);
                    _jettag_ws_file_69_4.doStart(context, out);
                    _jettag_ws_file_69_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",3244,3333);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(89);
                    RuntimeTagElement _jettag_ws_file_71_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_71_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_71_4.setRuntimeParent(_jettag_ws_folder_68_3);
                    _jettag_ws_file_71_4.setTagInfo(_td_ws_file_71_4);
                    _jettag_ws_file_71_4.doStart(context, out);
                    _jettag_ws_file_71_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",3338,3410);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(72);
                    RuntimeTagElement _jettag_ws_file_73_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_73_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_73_4.setRuntimeParent(_jettag_ws_folder_68_3);
                    _jettag_ws_file_73_4.setTagInfo(_td_ws_file_73_4);
                    _jettag_ws_file_73_4.doStart(context, out);
                    _jettag_ws_file_73_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",3414,3488);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(74);
                    RuntimeTagElement _jettag_ws_file_74_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_74_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_74_4.setRuntimeParent(_jettag_ws_folder_68_3);
                    _jettag_ws_file_74_4.setTagInfo(_td_ws_file_74_4);
                    _jettag_ws_file_74_4.doStart(context, out);
                    _jettag_ws_file_74_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",3492,3578);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(86);
                    RuntimeTagElement _jettag_ws_file_75_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_75_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_75_4.setRuntimeParent(_jettag_ws_folder_68_3);
                    _jettag_ws_file_75_4.setTagInfo(_td_ws_file_75_4);
                    _jettag_ws_file_75_4.doStart(context, out);
                    _jettag_ws_file_75_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",3582,3688);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(106);
                    RuntimeTagElement _jettag_ws_file_76_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_76_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_76_4.setRuntimeParent(_jettag_ws_folder_68_3);
                    _jettag_ws_file_76_4.setTagInfo(_td_ws_file_76_4);
                    _jettag_ws_file_76_4.doStart(context, out);
                    _jettag_ws_file_76_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",3692,3772);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(80);
                    RuntimeTagElement _jettag_ws_file_77_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_77_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_77_4.setRuntimeParent(_jettag_ws_folder_68_3);
                    _jettag_ws_file_77_4.setTagInfo(_td_ws_file_77_4);
                    _jettag_ws_file_77_4.doStart(context, out);
                    _jettag_ws_file_77_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",3776,3848);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(72);
                    RuntimeTagElement _jettag_ws_file_78_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_78_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_78_4.setRuntimeParent(_jettag_ws_folder_68_3);
                    _jettag_ws_file_78_4.setTagInfo(_td_ws_file_78_4);
                    _jettag_ws_file_78_4.doStart(context, out);
                    _jettag_ws_file_78_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",3852,3936);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(84);
                    RuntimeTagElement _jettag_ws_file_79_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_79_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_79_4.setRuntimeParent(_jettag_ws_folder_68_3);
                    _jettag_ws_file_79_4.setTagInfo(_td_ws_file_79_4);
                    _jettag_ws_file_79_4.doStart(context, out);
                    _jettag_ws_file_79_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",3940,4034);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(94);
                    RuntimeTagElement _jettag_ws_file_80_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_80_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_80_4.setRuntimeParent(_jettag_ws_folder_68_3);
                    _jettag_ws_file_80_4.setTagInfo(_td_ws_file_80_4);
                    _jettag_ws_file_80_4.doStart(context, out);
                    _jettag_ws_file_80_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",4038,4098);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(60);
                    RuntimeTagElement _jettag_ws_file_81_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_81_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_81_4.setRuntimeParent(_jettag_ws_folder_68_3);
                    _jettag_ws_file_81_4.setTagInfo(_td_ws_file_81_4);
                    _jettag_ws_file_81_4.doStart(context, out);
                    _jettag_ws_file_81_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(60);
                    out.setTag("iterate",4103,4163);
                    RuntimeTagElement _jettag_c_iterate_83_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_83_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_83_4.setRuntimeParent(_jettag_ws_folder_68_3);
                    _jettag_c_iterate_83_4.setTagInfo(_td_c_iterate_83_4);
                    _jettag_c_iterate_83_4.doStart(context, out);
                    out.loopStart();
                    out.setTag(null,-1,-1);
                    while (_jettag_c_iterate_83_4.okToProcessBody()) {
            out.bodyContentEnd();
            out.handleDelimiter(_jettag_c_iterate_83_4.getTagInfo().getAttribute("delimiter"),4103,4163);
                        out.loopIterate();
                        out.write(NL);         
                        out.write("\t\t\t\t");  //$NON-NLS-1$        
                        out.setTag("file",4168,4254);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(86);
                        RuntimeTagElement _jettag_ws_file_84_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_84_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_ws_file_84_5.setRuntimeParent(_jettag_c_iterate_83_4);
                        _jettag_ws_file_84_5.setTagInfo(_td_ws_file_84_5);
                        _jettag_ws_file_84_5.doStart(context, out);
                        _jettag_ws_file_84_5.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(NL);         
                        out.write("\t\t\t");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_iterate_83_4.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_iterate_83_4.doEnd();
                    out.loopEnd();
                    out.endTag("iterate",95);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(12);
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_ws_folder_68_3.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_ws_folder_68_3.doEnd();
                out.endTag("folder",1140);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_ws_folder_32_2.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_ws_folder_32_2.doEnd();
            out.endTag("folder",3307);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.setTag("file",4302,4363);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(61);
            RuntimeTagElement _jettag_ws_file_89_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_89_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_89_2.setRuntimeParent(_jettag_ws_project_31_1);
            _jettag_ws_file_89_2.setTagInfo(_td_ws_file_89_2);
            _jettag_ws_file_89_2.doStart(context, out);
            _jettag_ws_file_89_2.doEnd();
            out.setTag(null,-1,-1);
            out.write(NL);         
            out.write(NL);         
out.bodyContentStart();
            _jettag_ws_project_31_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_ws_project_31_1.doEnd();
        out.endTag("project",3409);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(13);
        out.popTemplateFile();
    }
}
