package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_templateEntityClassDB implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_f = "org.eclipse.jet.formatTags"; //$NON-NLS-1$

    public _jet_templateEntityClassDB(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_3_10 = new TagInfo("c:get", //$NON-NLS-1$
            3, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_5_7 = new TagInfo("f:uc", //$NON-NLS-1$
            5, 7,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_24 = new TagInfo("c:get", //$NON-NLS-1$
            5, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_23 = new TagInfo("c:get", //$NON-NLS-1$
            17, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_19_34 = new TagInfo("f:lc", //$NON-NLS-1$
            19, 34,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_19_40 = new TagInfo("c:get", //$NON-NLS-1$
            19, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_19_75 = new TagInfo("c:iterate", //$NON-NLS-1$
            19, 75,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$e/Feature", //$NON-NLS-1$
                "f", //$NON-NLS-1$
                ", ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_4 = new TagInfo("c:get", //$NON-NLS-1$
            20, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$f/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_20_52 = new TagInfo("c:iterate", //$NON-NLS-1$
            20, 52,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$e/Feature", //$NON-NLS-1$
                "f", //$NON-NLS-1$
                ", ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_10 = new TagInfo("c:get", //$NON-NLS-1$
            21, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_21_42 = new TagInfo("f:uc", //$NON-NLS-1$
            21, 42,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_59 = new TagInfo("c:get", //$NON-NLS-1$
            21, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$f/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_26 = new TagInfo("c:get", //$NON-NLS-1$
            26, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_28_29 = new TagInfo("f:lc", //$NON-NLS-1$
            28, 29,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_28_35 = new TagInfo("c:get", //$NON-NLS-1$
            28, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_29_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            29, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$e/Feature", //$NON-NLS-1$
                "f", //$NON-NLS-1$
                ", ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_6 = new TagInfo("c:get", //$NON-NLS-1$
            30, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$f/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_42 = new TagInfo("c:get", //$NON-NLS-1$
            30, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_30_74 = new TagInfo("f:uc", //$NON-NLS-1$
            30, 74,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_91 = new TagInfo("c:get", //$NON-NLS-1$
            30, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$f/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_37_34 = new TagInfo("f:lc", //$NON-NLS-1$
            37, 34,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_37_40 = new TagInfo("c:get", //$NON-NLS-1$
            37, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_46_36 = new TagInfo("f:lc", //$NON-NLS-1$
            46, 36,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_46_42 = new TagInfo("c:get", //$NON-NLS-1$
            46, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_6 = new TagInfo("c:get", //$NON-NLS-1$
            50, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_50_40 = new TagInfo("f:uc", //$NON-NLS-1$
            50, 40,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_57 = new TagInfo("c:get", //$NON-NLS-1$
            50, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_51_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            51, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$e/Feature", //$NON-NLS-1$
                "f", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_7 = new TagInfo("c:get", //$NON-NLS-1$
            52, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_52_39 = new TagInfo("f:uc", //$NON-NLS-1$
            52, 39,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_56 = new TagInfo("c:get", //$NON-NLS-1$
            52, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$f/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_97 = new TagInfo("c:get", //$NON-NLS-1$
            52, 97,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$f/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_18 = new TagInfo("c:get", //$NON-NLS-1$
            55, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        out.write("<?php");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("include \"");  //$NON-NLS-1$        
        out.setTag("get",16,43);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(27);
        RuntimeTagElement _jettag_c_get_3_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_10.setRuntimeParent(null);
        _jettag_c_get_3_10.setTagInfo(_td_c_get_3_10);
        _jettag_c_get_3_10.doStart(context, out);
        _jettag_c_get_3_10.doEnd();
        out.setTag(null,-1,-1);
        out.write(".class.php\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("class ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(17);
        out.setTag("uc",63,80);
        RuntimeTagElement _jettag_f_uc_5_7 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_5_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_uc_5_7.setRuntimeParent(null);
        _jettag_f_uc_5_7.setTagInfo(_td_f_uc_5_7);
        _jettag_f_uc_5_7.doStart(context, out);
        JET2Writer _jettag_f_uc_5_7_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_uc_5_7.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",80,107);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_5_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_24); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_5_24.setRuntimeParent(_jettag_f_uc_5_7);
            _jettag_c_get_5_24.setTagInfo(_td_c_get_5_24);
            _jettag_c_get_5_24.doStart(context, out);
            _jettag_c_get_5_24.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_f_uc_5_7.handleBodyContent(out);
        }
        out = _jettag_f_uc_5_7_saved_out;
out.bodyContentEnd();
        _jettag_f_uc_5_7.doEnd();
        out.endTag("uc",27);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write("DB");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate $dbconn;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate $dbname = \"jet\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate $user = \"jet\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate $password = \"jet\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic function __construct()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$this->dbconn = pg_connect(\"dbname=\" . $this->dbname . \" user=\" . $this->user . \" password=\" . $this->password);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic function add($");  //$NON-NLS-1$        
        out.setTag("get",393,420);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(27);
        RuntimeTagElement _jettag_c_get_17_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_23); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_17_23.setRuntimeParent(null);
        _jettag_c_get_17_23.setTagInfo(_td_c_get_17_23);
        _jettag_c_get_17_23.doStart(context, out);
        _jettag_c_get_17_23.doEnd();
        out.setTag(null,-1,-1);
        out.write(")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$query = pg_query('INSERT INTO ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(6);
        out.setTag("lc",458,464);
        RuntimeTagElement _jettag_f_lc_19_34 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_19_34); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_lc_19_34.setRuntimeParent(null);
        _jettag_f_lc_19_34.setTagInfo(_td_f_lc_19_34);
        _jettag_f_lc_19_34.doStart(context, out);
        JET2Writer _jettag_f_lc_19_34_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_lc_19_34.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",464,491);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_19_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_40); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_19_40.setRuntimeParent(_jettag_f_lc_19_34);
            _jettag_c_get_19_40.setTagInfo(_td_c_get_19_40);
            _jettag_c_get_19_40.doStart(context, out);
            _jettag_c_get_19_40.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_f_lc_19_34.handleBodyContent(out);
        }
        out = _jettag_f_lc_19_34_saved_out;
out.bodyContentEnd();
        _jettag_f_lc_19_34.doEnd();
        out.endTag("lc",27);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write("(");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(57);
        out.setTag("iterate",499,556);
        RuntimeTagElement _jettag_c_iterate_19_75 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_19_75); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_19_75.setRuntimeParent(null);
        _jettag_c_iterate_19_75.setTagInfo(_td_c_iterate_19_75);
        _jettag_c_iterate_19_75.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_19_75.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_19_75.getTagInfo().getAttribute("delimiter"),499,556);
            out.loopIterate();
            out.setTag("get",556,583);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_20_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_20_4.setRuntimeParent(_jettag_c_iterate_19_75);
            _jettag_c_get_20_4.setTagInfo(_td_c_get_20_4);
            _jettag_c_get_20_4.doStart(context, out);
            _jettag_c_get_20_4.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_c_iterate_19_75.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_19_75.doEnd();
        out.loopEnd();
        out.endTag("iterate",27);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(") VALUES(");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(57);
        out.setTag("iterate",604,661);
        RuntimeTagElement _jettag_c_iterate_20_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_20_52); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_20_52.setRuntimeParent(null);
        _jettag_c_iterate_20_52.setTagInfo(_td_c_iterate_20_52);
        _jettag_c_iterate_20_52.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_20_52.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_20_52.getTagInfo().getAttribute("delimiter"),604,661);
            out.loopIterate();
            out.write("\"' . $");  //$NON-NLS-1$        
            out.setTag("get",667,694);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_21_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_21_10.setRuntimeParent(_jettag_c_iterate_20_52);
            _jettag_c_get_21_10.setTagInfo(_td_c_get_21_10);
            _jettag_c_get_21_10.doStart(context, out);
            _jettag_c_get_21_10.doEnd();
            out.setTag(null,-1,-1);
            out.write("->get");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(17);
            out.setTag("uc",699,716);
            RuntimeTagElement _jettag_f_uc_21_42 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_21_42); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_uc_21_42.setRuntimeParent(_jettag_c_iterate_20_52);
            _jettag_f_uc_21_42.setTagInfo(_td_f_uc_21_42);
            _jettag_f_uc_21_42.doStart(context, out);
            JET2Writer _jettag_f_uc_21_42_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_f_uc_21_42.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.setTag("get",716,743);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(27);
                RuntimeTagElement _jettag_c_get_21_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_59); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_21_59.setRuntimeParent(_jettag_f_uc_21_42);
                _jettag_c_get_21_59.setTagInfo(_td_c_get_21_59);
                _jettag_c_get_21_59.doStart(context, out);
                _jettag_c_get_21_59.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_f_uc_21_42.handleBodyContent(out);
            }
            out = _jettag_f_uc_21_42_saved_out;
    out.bodyContentEnd();
            _jettag_f_uc_21_42.doEnd();
            out.endTag("uc",27);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write("() . '\"");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_20_52.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_20_52.doEnd();
        out.loopEnd();
        out.endTag("iterate",96);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(")');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn (pg_affected_rows($query) > 0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic function update($");  //$NON-NLS-1$        
        out.setTag("get",848,875);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(27);
        RuntimeTagElement _jettag_c_get_26_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_26_26.setRuntimeParent(null);
        _jettag_c_get_26_26.setTagInfo(_td_c_get_26_26);
        _jettag_c_get_26_26.doStart(context, out);
        _jettag_c_get_26_26.doEnd();
        out.setTag(null,-1,-1);
        out.write(")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$query = pg_query('UPDATE ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(6);
        out.setTag("lc",908,914);
        RuntimeTagElement _jettag_f_lc_28_29 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_28_29); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_lc_28_29.setRuntimeParent(null);
        _jettag_f_lc_28_29.setTagInfo(_td_f_lc_28_29);
        _jettag_f_lc_28_29.doStart(context, out);
        JET2Writer _jettag_f_lc_28_29_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_lc_28_29.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",914,941);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_28_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_35); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_28_35.setRuntimeParent(_jettag_f_lc_28_29);
            _jettag_c_get_28_35.setTagInfo(_td_c_get_28_35);
            _jettag_c_get_28_35.doStart(context, out);
            _jettag_c_get_28_35.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_f_lc_28_29.handleBodyContent(out);
        }
        out = _jettag_f_lc_28_29_saved_out;
out.bodyContentEnd();
        _jettag_f_lc_28_29.doEnd();
        out.endTag("lc",27);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(" SET");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(59);
        out.setTag("iterate",956,1015);
        RuntimeTagElement _jettag_c_iterate_29_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_29_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_29_4.setRuntimeParent(null);
        _jettag_c_iterate_29_4.setTagInfo(_td_c_iterate_29_4);
        _jettag_c_iterate_29_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_29_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_29_4.getTagInfo().getAttribute("delimiter"),956,1015);
            out.loopIterate();
            out.setTag("get",1015,1042);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_30_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_30_6.setRuntimeParent(_jettag_c_iterate_29_4);
            _jettag_c_get_30_6.setTagInfo(_td_c_get_30_6);
            _jettag_c_get_30_6.doStart(context, out);
            _jettag_c_get_30_6.doEnd();
            out.setTag(null,-1,-1);
            out.write(" = \"' . $");  //$NON-NLS-1$        
            out.setTag("get",1051,1078);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_30_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_42); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_30_42.setRuntimeParent(_jettag_c_iterate_29_4);
            _jettag_c_get_30_42.setTagInfo(_td_c_get_30_42);
            _jettag_c_get_30_42.doStart(context, out);
            _jettag_c_get_30_42.doEnd();
            out.setTag(null,-1,-1);
            out.write("->get");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(17);
            out.setTag("uc",1083,1100);
            RuntimeTagElement _jettag_f_uc_30_74 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_30_74); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_uc_30_74.setRuntimeParent(_jettag_c_iterate_29_4);
            _jettag_f_uc_30_74.setTagInfo(_td_f_uc_30_74);
            _jettag_f_uc_30_74.doStart(context, out);
            JET2Writer _jettag_f_uc_30_74_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_f_uc_30_74.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.setTag("get",1100,1127);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(27);
                RuntimeTagElement _jettag_c_get_30_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_91); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_30_91.setRuntimeParent(_jettag_f_uc_30_74);
                _jettag_c_get_30_91.setTagInfo(_td_c_get_30_91);
                _jettag_c_get_30_91.doStart(context, out);
                _jettag_c_get_30_91.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_f_uc_30_74.handleBodyContent(out);
            }
            out = _jettag_f_uc_30_74_saved_out;
    out.bodyContentEnd();
            _jettag_f_uc_30_74.doEnd();
            out.endTag("uc",27);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write("() . '\"");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_29_4.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_29_4.doEnd();
        out.loopEnd();
        out.endTag("iterate",126);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write("');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn (pg_affected_rows($query) > 0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic function destroy()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$query = pg_query(\"DELETE FROM ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(6);
        out.setTag("lc",1269,1275);
        RuntimeTagElement _jettag_f_lc_37_34 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_37_34); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_lc_37_34.setRuntimeParent(null);
        _jettag_f_lc_37_34.setTagInfo(_td_f_lc_37_34);
        _jettag_f_lc_37_34.doStart(context, out);
        JET2Writer _jettag_f_lc_37_34_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_lc_37_34.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",1275,1302);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_37_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_40); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_37_40.setRuntimeParent(_jettag_f_lc_37_34);
            _jettag_c_get_37_40.setTagInfo(_td_c_get_37_40);
            _jettag_c_get_37_40.doStart(context, out);
            _jettag_c_get_37_40.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_f_lc_37_34.handleBodyContent(out);
        }
        out = _jettag_f_lc_37_34_saved_out;
out.bodyContentEnd();
        _jettag_f_lc_37_34.doEnd();
        out.endTag("lc",27);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write("\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn (pg_affected_rows($query) > 0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic function getAll()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$result = array();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$query = pg_query(\"SELECT * FROM ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(6);
        out.setTag("lc",1450,1456);
        RuntimeTagElement _jettag_f_lc_46_36 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_46_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_lc_46_36.setRuntimeParent(null);
        _jettag_f_lc_46_36.setTagInfo(_td_f_lc_46_36);
        _jettag_f_lc_46_36.doStart(context, out);
        JET2Writer _jettag_f_lc_46_36_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_lc_46_36.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",1456,1483);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_46_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_42); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_46_42.setRuntimeParent(_jettag_f_lc_46_36);
            _jettag_c_get_46_42.setTagInfo(_td_c_get_46_42);
            _jettag_c_get_46_42.doStart(context, out);
            _jettag_c_get_46_42.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_f_lc_46_36.handleBodyContent(out);
        }
        out = _jettag_f_lc_46_36_saved_out;
out.bodyContentEnd();
        _jettag_f_lc_46_36.doEnd();
        out.endTag("lc",27);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write("\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif ( ! $query) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\twhile ($row = pg_fetch_assoc($query)) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t$");  //$NON-NLS-1$        
        out.setTag("get",1564,1591);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(27);
        RuntimeTagElement _jettag_c_get_50_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_50_6.setRuntimeParent(null);
        _jettag_c_get_50_6.setTagInfo(_td_c_get_50_6);
        _jettag_c_get_50_6.doStart(context, out);
        _jettag_c_get_50_6.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = new ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(17);
        out.setTag("uc",1598,1615);
        RuntimeTagElement _jettag_f_uc_50_40 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_50_40); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_uc_50_40.setRuntimeParent(null);
        _jettag_f_uc_50_40.setTagInfo(_td_f_uc_50_40);
        _jettag_f_uc_50_40.doStart(context, out);
        JET2Writer _jettag_f_uc_50_40_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_uc_50_40.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",1615,1642);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_50_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_57); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_50_57.setRuntimeParent(_jettag_f_uc_50_40);
            _jettag_c_get_50_57.setTagInfo(_td_c_get_50_57);
            _jettag_c_get_50_57.doStart(context, out);
            _jettag_c_get_50_57.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_f_uc_50_40.handleBodyContent(out);
        }
        out = _jettag_f_uc_50_40_saved_out;
out.bodyContentEnd();
        _jettag_f_uc_50_40.doEnd();
        out.endTag("uc",27);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write("();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(39);
        out.setTag("iterate",1657,1696);
        RuntimeTagElement _jettag_c_iterate_51_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_51_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_51_5.setRuntimeParent(null);
        _jettag_c_iterate_51_5.setTagInfo(_td_c_iterate_51_5);
        _jettag_c_iterate_51_5.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_51_5.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_51_5.getTagInfo().getAttribute("delimiter"),1657,1696);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\t\t\t\t$");  //$NON-NLS-1$        
            out.setTag("get",1703,1730);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_52_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_52_7.setRuntimeParent(_jettag_c_iterate_51_5);
            _jettag_c_get_52_7.setTagInfo(_td_c_get_52_7);
            _jettag_c_get_52_7.doStart(context, out);
            _jettag_c_get_52_7.doEnd();
            out.setTag(null,-1,-1);
            out.write("->set");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(17);
            out.setTag("uc",1735,1752);
            RuntimeTagElement _jettag_f_uc_52_39 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_52_39); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_uc_52_39.setRuntimeParent(_jettag_c_iterate_51_5);
            _jettag_f_uc_52_39.setTagInfo(_td_f_uc_52_39);
            _jettag_f_uc_52_39.doStart(context, out);
            JET2Writer _jettag_f_uc_52_39_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_f_uc_52_39.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.setTag("get",1752,1779);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(27);
                RuntimeTagElement _jettag_c_get_52_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_56); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_52_56.setRuntimeParent(_jettag_f_uc_52_39);
                _jettag_c_get_52_56.setTagInfo(_td_c_get_52_56);
                _jettag_c_get_52_56.doStart(context, out);
                _jettag_c_get_52_56.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_f_uc_52_39.handleBodyContent(out);
            }
            out = _jettag_f_uc_52_39_saved_out;
    out.bodyContentEnd();
            _jettag_f_uc_52_39.doEnd();
            out.endTag("uc",27);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write("($row[\"");  //$NON-NLS-1$        
            out.setTag("get",1793,1820);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_52_97 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_97); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_52_97.setRuntimeParent(_jettag_c_iterate_51_5);
            _jettag_c_get_52_97.setTagInfo(_td_c_get_52_97);
            _jettag_c_get_52_97.doStart(context, out);
            _jettag_c_get_52_97.doEnd();
            out.setTag(null,-1,-1);
            out.write("\"]);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_51_5.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_51_5.doEnd();
        out.loopEnd();
        out.endTag("iterate",133);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t$result[] = $");  //$NON-NLS-1$        
        out.setTag("get",1864,1891);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(27);
        RuntimeTagElement _jettag_c_get_55_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_55_18.setRuntimeParent(null);
        _jettag_c_get_55_18.setTagInfo(_td_c_get_55_18);
        _jettag_c_get_55_18.doStart(context, out);
        _jettag_c_get_55_18.doEnd();
        out.setTag(null,-1,-1);
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn $result;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("?>");  //$NON-NLS-1$        
        out.popTemplateFile();
    }
}
