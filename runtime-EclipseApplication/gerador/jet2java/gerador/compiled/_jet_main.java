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
    private static final TagInfo _td_ws_file_56_4 = new TagInfo("ws:file", //$NON-NLS-1$
            56, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/CSS/templateBootstrap-theme.css.map.jet", //$NON-NLS-1$
                "bootstrap-theme.css.map", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_57_4 = new TagInfo("ws:file", //$NON-NLS-1$
            57, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/CSS/templateBootstrap-theme.jet", //$NON-NLS-1$
                "bootstrap-theme.css", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_58_4 = new TagInfo("ws:file", //$NON-NLS-1$
            58, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/CSS/templateBootstrap-theme.min.jet", //$NON-NLS-1$
                "bootstrap-theme.min.css", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_59_4 = new TagInfo("ws:file", //$NON-NLS-1$
            59, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/CSS/templateBootstrap.css.map.jet", //$NON-NLS-1$
                "bootstrap.css.map", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_60_4 = new TagInfo("ws:file", //$NON-NLS-1$
            60, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/CSS/templateBootstrap.jet", //$NON-NLS-1$
                "bootstrap.css", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_61_4 = new TagInfo("ws:file", //$NON-NLS-1$
            61, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/CSS/templateBootstrap.min.jet", //$NON-NLS-1$
                "bootstrap.min.css", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_62_4 = new TagInfo("ws:file", //$NON-NLS-1$
            62, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/CSS/templateSticky-footer-navbar.jet", //$NON-NLS-1$
                "sticky-footer-navbar.css", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_63_4 = new TagInfo("ws:file", //$NON-NLS-1$
            63, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/CSS/templateTheme.jet", //$NON-NLS-1$
                "theme.css", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_65_4 = new TagInfo("ws:file", //$NON-NLS-1$
            65, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/CSS/templateBootstrap-table.jet", //$NON-NLS-1$
                "bootstrap-table.css", //$NON-NLS-1$
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
    private static final TagInfo _td_ws_file_70_4 = new TagInfo("ws:file", //$NON-NLS-1$
            70, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/JS/templateBootstrap-table.jet", //$NON-NLS-1$
                "bootstrap-table.js", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_71_4 = new TagInfo("ws:file", //$NON-NLS-1$
            71, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/JS/templateNpm.jet", //$NON-NLS-1$
                "npm.js", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_72_4 = new TagInfo("ws:file", //$NON-NLS-1$
            72, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/JS/templateBootstrap.jet", //$NON-NLS-1$
                "bootstrap.js", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_73_4 = new TagInfo("ws:file", //$NON-NLS-1$
            73, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/JS/templateBootstrap.min.jet", //$NON-NLS-1$
                "bootstrap.min.js", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_74_4 = new TagInfo("ws:file", //$NON-NLS-1$
            74, 4,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/JS/templateIe-emulation-modes-warning.jet", //$NON-NLS-1$
                "ie-emulation-modes-warning.js", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_76_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            76, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/Domainmodel/Entity", //$NON-NLS-1$
                "currentEntity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_77_5 = new TagInfo("ws:file", //$NON-NLS-1$
            77, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/templateEntityJS.jet", //$NON-NLS-1$
                "{$currentEntity/@name}.js", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_81_3 = new TagInfo("ws:folder", //$NON-NLS-1$
            81, 3,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "forms", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_82_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            82, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/Domainmodel/Page", //$NON-NLS-1$
                "currentPage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_83_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            83, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentPage/forms", //$NON-NLS-1$
                "currentForm", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_84_6 = new TagInfo("c:if", //$NON-NLS-1$
            84, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "(emf.eClass($currentForm)/@name = 'Form')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_85_7 = new TagInfo("ws:file", //$NON-NLS-1$
            85, 7,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/templateForm.jet", //$NON-NLS-1$
                "{$currentForm/@name}.php", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_87_6 = new TagInfo("c:if", //$NON-NLS-1$
            87, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "(emf.eClass($currentForm)/@name = 'FormReport')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_88_7 = new TagInfo("ws:file", //$NON-NLS-1$
            88, 7,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/templateFormReport.jet", //$NON-NLS-1$
                "{$currentForm/@name}.php", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_90_6 = new TagInfo("c:if", //$NON-NLS-1$
            90, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "(emf.eClass($currentForm)/@name = 'FormNewEntityOnly')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_91_7 = new TagInfo("ws:file", //$NON-NLS-1$
            91, 7,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/templateFormNewEntityOnly.jet", //$NON-NLS-1$
                "{$currentForm/@name}.php", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_98_2 = new TagInfo("ws:file", //$NON-NLS-1$
            98, 2,
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
                    out.setTag("file",2284,2387);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(103);
                    RuntimeTagElement _jettag_ws_file_56_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_56_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_56_4.setRuntimeParent(_jettag_ws_folder_51_3);
                    _jettag_ws_file_56_4.setTagInfo(_td_ws_file_56_4);
                    _jettag_ws_file_56_4.doStart(context, out);
                    _jettag_ws_file_56_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",2391,2482);
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
                    out.setTag("file",2486,2585);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(99);
                    RuntimeTagElement _jettag_ws_file_58_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_58_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_58_4.setRuntimeParent(_jettag_ws_folder_51_3);
                    _jettag_ws_file_58_4.setTagInfo(_td_ws_file_58_4);
                    _jettag_ws_file_58_4.doStart(context, out);
                    _jettag_ws_file_58_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",2589,2680);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(91);
                    RuntimeTagElement _jettag_ws_file_59_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_59_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_59_4.setRuntimeParent(_jettag_ws_folder_51_3);
                    _jettag_ws_file_59_4.setTagInfo(_td_ws_file_59_4);
                    _jettag_ws_file_59_4.doStart(context, out);
                    _jettag_ws_file_59_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",2684,2763);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(79);
                    RuntimeTagElement _jettag_ws_file_60_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_60_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_60_4.setRuntimeParent(_jettag_ws_folder_51_3);
                    _jettag_ws_file_60_4.setTagInfo(_td_ws_file_60_4);
                    _jettag_ws_file_60_4.doStart(context, out);
                    _jettag_ws_file_60_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",2767,2854);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(87);
                    RuntimeTagElement _jettag_ws_file_61_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_61_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_61_4.setRuntimeParent(_jettag_ws_folder_51_3);
                    _jettag_ws_file_61_4.setTagInfo(_td_ws_file_61_4);
                    _jettag_ws_file_61_4.doStart(context, out);
                    _jettag_ws_file_61_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",2858,2959);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(101);
                    RuntimeTagElement _jettag_ws_file_62_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_62_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_62_4.setRuntimeParent(_jettag_ws_folder_51_3);
                    _jettag_ws_file_62_4.setTagInfo(_td_ws_file_62_4);
                    _jettag_ws_file_62_4.doStart(context, out);
                    _jettag_ws_file_62_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",2963,3034);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(71);
                    RuntimeTagElement _jettag_ws_file_63_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_63_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_63_4.setRuntimeParent(_jettag_ws_folder_51_3);
                    _jettag_ws_file_63_4.setTagInfo(_td_ws_file_63_4);
                    _jettag_ws_file_63_4.doStart(context, out);
                    _jettag_ws_file_63_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",3042,3133);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(91);
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
                out.endTag("folder",1324);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(21);
                out.setTag("folder",3152,3173);
                RuntimeTagElement _jettag_ws_folder_68_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_68_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_folder_68_3.setRuntimeParent(_jettag_ws_folder_32_2);
                _jettag_ws_folder_68_3.setTagInfo(_td_ws_folder_68_3);
                _jettag_ws_folder_68_3.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_ws_folder_68_3.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",3177,3276);
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
                    out.setTag("file",3280,3369);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(89);
                    RuntimeTagElement _jettag_ws_file_70_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_70_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_70_4.setRuntimeParent(_jettag_ws_folder_68_3);
                    _jettag_ws_file_70_4.setTagInfo(_td_ws_file_70_4);
                    _jettag_ws_file_70_4.doStart(context, out);
                    _jettag_ws_file_70_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",3373,3438);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(65);
                    RuntimeTagElement _jettag_ws_file_71_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_71_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_71_4.setRuntimeParent(_jettag_ws_folder_68_3);
                    _jettag_ws_file_71_4.setTagInfo(_td_ws_file_71_4);
                    _jettag_ws_file_71_4.doStart(context, out);
                    _jettag_ws_file_71_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",3442,3519);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(77);
                    RuntimeTagElement _jettag_ws_file_72_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_72_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_72_4.setRuntimeParent(_jettag_ws_folder_68_3);
                    _jettag_ws_file_72_4.setTagInfo(_td_ws_file_72_4);
                    _jettag_ws_file_72_4.doStart(context, out);
                    _jettag_ws_file_72_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",3523,3608);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(85);
                    RuntimeTagElement _jettag_ws_file_73_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_73_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_73_4.setRuntimeParent(_jettag_ws_folder_68_3);
                    _jettag_ws_file_73_4.setTagInfo(_td_ws_file_73_4);
                    _jettag_ws_file_73_4.doStart(context, out);
                    _jettag_ws_file_73_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    out.setTag("file",3612,3723);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(111);
                    RuntimeTagElement _jettag_ws_file_74_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_74_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_74_4.setRuntimeParent(_jettag_ws_folder_68_3);
                    _jettag_ws_file_74_4.setTagInfo(_td_ws_file_74_4);
                    _jettag_ws_file_74_4.doStart(context, out);
                    _jettag_ws_file_74_4.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(NL);         
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(60);
                    out.setTag("iterate",3728,3788);
                    RuntimeTagElement _jettag_c_iterate_76_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_76_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_76_4.setRuntimeParent(_jettag_ws_folder_68_3);
                    _jettag_c_iterate_76_4.setTagInfo(_td_c_iterate_76_4);
                    _jettag_c_iterate_76_4.doStart(context, out);
                    out.loopStart();
                    out.setTag(null,-1,-1);
                    while (_jettag_c_iterate_76_4.okToProcessBody()) {
            out.bodyContentEnd();
            out.handleDelimiter(_jettag_c_iterate_76_4.getTagInfo().getAttribute("delimiter"),3728,3788);
                        out.loopIterate();
                        out.write(NL);         
                        out.write("\t\t\t\t");  //$NON-NLS-1$        
                        out.setTag("file",3793,3879);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(86);
                        RuntimeTagElement _jettag_ws_file_77_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_77_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_ws_file_77_5.setRuntimeParent(_jettag_c_iterate_76_4);
                        _jettag_ws_file_77_5.setTagInfo(_td_ws_file_77_5);
                        _jettag_ws_file_77_5.doStart(context, out);
                        _jettag_ws_file_77_5.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(NL);         
                        out.write("\t\t\t");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_iterate_76_4.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_iterate_76_4.doEnd();
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
                out.endTag("folder",725);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(24);
                out.setTag("folder",3914,3938);
                RuntimeTagElement _jettag_ws_folder_81_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_81_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_folder_81_3.setRuntimeParent(_jettag_ws_folder_32_2);
                _jettag_ws_folder_81_3.setTagInfo(_td_ws_folder_81_3);
                _jettag_ws_folder_81_3.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_ws_folder_81_3.okToProcessBody()) {
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(56);
                    out.setTag("iterate",3942,3998);
                    RuntimeTagElement _jettag_c_iterate_82_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_82_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_82_4.setRuntimeParent(_jettag_ws_folder_81_3);
                    _jettag_c_iterate_82_4.setTagInfo(_td_c_iterate_82_4);
                    _jettag_c_iterate_82_4.doStart(context, out);
                    out.loopStart();
                    out.setTag(null,-1,-1);
                    while (_jettag_c_iterate_82_4.okToProcessBody()) {
            out.bodyContentEnd();
            out.handleDelimiter(_jettag_c_iterate_82_4.getTagInfo().getAttribute("delimiter"),3942,3998);
                        out.loopIterate();
                        out.write(NL);         
                        out.write("\t\t\t\t");  //$NON-NLS-1$        
                // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
                out.jump(57);
                        out.setTag("iterate",4003,4060);
                        RuntimeTagElement _jettag_c_iterate_83_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_83_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_iterate_83_5.setRuntimeParent(_jettag_c_iterate_82_4);
                        _jettag_c_iterate_83_5.setTagInfo(_td_c_iterate_83_5);
                        _jettag_c_iterate_83_5.doStart(context, out);
                        out.loopStart();
                        out.setTag(null,-1,-1);
                        while (_jettag_c_iterate_83_5.okToProcessBody()) {
                out.bodyContentEnd();
                out.handleDelimiter(_jettag_c_iterate_83_5.getTagInfo().getAttribute("delimiter"),4003,4060);
                            out.loopIterate();
                            out.write(NL);         
                            out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
                    out.jump(55);
                            out.setTag("if",4066,4121);
                            RuntimeTagElement _jettag_c_if_84_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_84_6); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_if_84_6.setRuntimeParent(_jettag_c_iterate_83_5);
                            _jettag_c_if_84_6.setTagInfo(_td_c_if_84_6);
                            _jettag_c_if_84_6.doStart(context, out);
                            out.setTag(null,-1,-1);
                            while (_jettag_c_if_84_6.okToProcessBody()) {
                                out.write(NL);         
                                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                                out.setTag("file",4128,4209);
                        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                        out.jump(81);
                                RuntimeTagElement _jettag_ws_file_85_7 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_85_7); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_ws_file_85_7.setRuntimeParent(_jettag_c_if_84_6);
                                _jettag_ws_file_85_7.setTagInfo(_td_ws_file_85_7);
                                _jettag_ws_file_85_7.doStart(context, out);
                                _jettag_ws_file_85_7.doEnd();
                                out.setTag(null,-1,-1);
                                out.write(NL);         
                                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                    out.bodyContentStart();
                                _jettag_c_if_84_6.handleBodyContent(out);
                            }
                    out.bodyContentEnd();
                            _jettag_c_if_84_6.doEnd();
                            out.endTag("if",94);
                    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
                    out.jump(7);
                            out.write(NL);         
                            out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
                    out.jump(61);
                            out.setTag("if",4228,4289);
                            RuntimeTagElement _jettag_c_if_87_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_87_6); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_if_87_6.setRuntimeParent(_jettag_c_iterate_83_5);
                            _jettag_c_if_87_6.setTagInfo(_td_c_if_87_6);
                            _jettag_c_if_87_6.doStart(context, out);
                            out.setTag(null,-1,-1);
                            while (_jettag_c_if_87_6.okToProcessBody()) {
                                out.write(NL);         
                                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                                out.setTag("file",4296,4383);
                        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                        out.jump(87);
                                RuntimeTagElement _jettag_ws_file_88_7 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_88_7); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_ws_file_88_7.setRuntimeParent(_jettag_c_if_87_6);
                                _jettag_ws_file_88_7.setTagInfo(_td_ws_file_88_7);
                                _jettag_ws_file_88_7.doStart(context, out);
                                _jettag_ws_file_88_7.doEnd();
                                out.setTag(null,-1,-1);
                                out.write(NL);         
                                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                    out.bodyContentStart();
                                _jettag_c_if_87_6.handleBodyContent(out);
                            }
                    out.bodyContentEnd();
                            _jettag_c_if_87_6.doEnd();
                            out.endTag("if",100);
                    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
                    out.jump(7);
                            out.write(NL);         
                            out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
                    out.jump(68);
                            out.setTag("if",4402,4470);
                            RuntimeTagElement _jettag_c_if_90_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_90_6); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_if_90_6.setRuntimeParent(_jettag_c_iterate_83_5);
                            _jettag_c_if_90_6.setTagInfo(_td_c_if_90_6);
                            _jettag_c_if_90_6.doStart(context, out);
                            out.setTag(null,-1,-1);
                            while (_jettag_c_if_90_6.okToProcessBody()) {
                                out.write(NL);         
                                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                                out.setTag("file",4477,4571);
                        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                        out.jump(94);
                                RuntimeTagElement _jettag_ws_file_91_7 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_91_7); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_ws_file_91_7.setRuntimeParent(_jettag_c_if_90_6);
                                _jettag_ws_file_91_7.setTagInfo(_td_ws_file_91_7);
                                _jettag_ws_file_91_7.doStart(context, out);
                                _jettag_ws_file_91_7.doEnd();
                                out.setTag(null,-1,-1);
                                out.write(NL);         
                                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                    out.bodyContentStart();
                                _jettag_c_if_90_6.handleBodyContent(out);
                            }
                    out.bodyContentEnd();
                            _jettag_c_if_90_6.doEnd();
                            out.endTag("if",107);
                    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
                    out.jump(7);
                            out.write(NL);         
                            out.write("\t\t\t\t");  //$NON-NLS-1$        
                out.bodyContentStart();
                            _jettag_c_iterate_83_5.handleBodyContent(out);
                        }
                out.bodyContentEnd();
                        _jettag_c_iterate_83_5.doEnd();
                        out.loopEnd();
                        out.endTag("iterate",529);
                // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
                out.jump(12);
                        out.write(NL);         
                        out.write("\t\t\t");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_iterate_82_4.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_iterate_82_4.doEnd();
                    out.loopEnd();
                    out.endTag("iterate",607);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(12);
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_ws_folder_81_3.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_ws_folder_81_3.doEnd();
                out.endTag("folder",682);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(12);
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_ws_folder_32_2.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_ws_folder_32_2.doEnd();
            out.endTag("folder",3654);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.setTag("file",4649,4710);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(61);
            RuntimeTagElement _jettag_ws_file_98_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_98_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_98_2.setRuntimeParent(_jettag_ws_project_31_1);
            _jettag_ws_file_98_2.setTagInfo(_td_ws_file_98_2);
            _jettag_ws_file_98_2.doStart(context, out);
            _jettag_ws_file_98_2.doEnd();
            out.setTag(null,-1,-1);
            out.write(NL);         
            out.write(NL);         
out.bodyContentStart();
            _jettag_ws_project_31_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_ws_project_31_1.doEnd();
        out.endTag("project",3756);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(13);
        out.popTemplateFile();
    }
}
