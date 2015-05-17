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
    
    private static final TagInfo _td_c_get_3_15 = new TagInfo("c:get", //$NON-NLS-1$
            3, 15,
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
    private static final TagInfo _td_c_get_19_23 = new TagInfo("c:get", //$NON-NLS-1$
            19, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_21_34 = new TagInfo("f:lc", //$NON-NLS-1$
            21, 34,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_21_40 = new TagInfo("c:get", //$NON-NLS-1$
            21, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_21_75 = new TagInfo("c:iterate", //$NON-NLS-1$
            21, 75,
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
    private static final TagInfo _td_c_get_22_4 = new TagInfo("c:get", //$NON-NLS-1$
            22, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$f/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_22_52 = new TagInfo("c:iterate", //$NON-NLS-1$
            22, 52,
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
    private static final TagInfo _td_c_get_23_10 = new TagInfo("c:get", //$NON-NLS-1$
            23, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_23_42 = new TagInfo("f:uc", //$NON-NLS-1$
            23, 42,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_59 = new TagInfo("c:get", //$NON-NLS-1$
            23, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$f/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_26 = new TagInfo("c:get", //$NON-NLS-1$
            28, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_30_29 = new TagInfo("f:lc", //$NON-NLS-1$
            30, 29,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_30_35 = new TagInfo("c:get", //$NON-NLS-1$
            30, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_30_73 = new TagInfo("c:iterate", //$NON-NLS-1$
            30, 73,
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
    private static final TagInfo _td_c_get_31_5 = new TagInfo("c:get", //$NON-NLS-1$
            31, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$f/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_41 = new TagInfo("c:get", //$NON-NLS-1$
            31, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_31_73 = new TagInfo("f:uc", //$NON-NLS-1$
            31, 73,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_90 = new TagInfo("c:get", //$NON-NLS-1$
            31, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$f/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_20 = new TagInfo("c:get", //$NON-NLS-1$
            32, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_27 = new TagInfo("c:get", //$NON-NLS-1$
            37, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_39_34 = new TagInfo("f:lc", //$NON-NLS-1$
            39, 34,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_39_40 = new TagInfo("c:get", //$NON-NLS-1$
            39, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_91 = new TagInfo("c:get", //$NON-NLS-1$
            39, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_48_36 = new TagInfo("f:lc", //$NON-NLS-1$
            48, 36,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_48_42 = new TagInfo("c:get", //$NON-NLS-1$
            48, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_6 = new TagInfo("c:get", //$NON-NLS-1$
            52, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_52_40 = new TagInfo("f:uc", //$NON-NLS-1$
            52, 40,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_57 = new TagInfo("c:get", //$NON-NLS-1$
            52, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_6 = new TagInfo("c:get", //$NON-NLS-1$
            54, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_55_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            55, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$e/Feature", //$NON-NLS-1$
                "f", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_6 = new TagInfo("c:get", //$NON-NLS-1$
            56, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_56_38 = new TagInfo("f:uc", //$NON-NLS-1$
            56, 38,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_55 = new TagInfo("c:get", //$NON-NLS-1$
            56, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$f/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_96 = new TagInfo("c:get", //$NON-NLS-1$
            56, 96,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$f/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_58_18 = new TagInfo("c:get", //$NON-NLS-1$
            58, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_65_23 = new TagInfo("c:get", //$NON-NLS-1$
            65, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_71_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            71, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$e/Feature", //$NON-NLS-1$
                "f", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_15 = new TagInfo("c:get", //$NON-NLS-1$
            72, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_72_47 = new TagInfo("f:uc", //$NON-NLS-1$
            72, 47,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_64 = new TagInfo("c:get", //$NON-NLS-1$
            72, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$f/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_15 = new TagInfo("c:get", //$NON-NLS-1$
            79, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$f/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_51 = new TagInfo("c:get", //$NON-NLS-1$
            79, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_79_83 = new TagInfo("f:uc", //$NON-NLS-1$
            79, 83,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_100 = new TagInfo("c:get", //$NON-NLS-1$
            79, 100,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$f/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_lc_82_36 = new TagInfo("f:lc", //$NON-NLS-1$
            82, 36,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_82_42 = new TagInfo("c:get", //$NON-NLS-1$
            82, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_6 = new TagInfo("c:get", //$NON-NLS-1$
            86, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_86_40 = new TagInfo("f:uc", //$NON-NLS-1$
            86, 40,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_57 = new TagInfo("c:get", //$NON-NLS-1$
            86, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_88_6 = new TagInfo("c:get", //$NON-NLS-1$
            88, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_89_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            89, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$e/Feature", //$NON-NLS-1$
                "f", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_90_6 = new TagInfo("c:get", //$NON-NLS-1$
            90, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$e/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_90_38 = new TagInfo("f:uc", //$NON-NLS-1$
            90, 38,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_90_55 = new TagInfo("c:get", //$NON-NLS-1$
            90, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$f/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_90_96 = new TagInfo("c:get", //$NON-NLS-1$
            90, 96,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$f/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_92_18 = new TagInfo("c:get", //$NON-NLS-1$
            92, 18,
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
        out.write("include_once \"");  //$NON-NLS-1$        
        out.setTag("get",21,48);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(27);
        RuntimeTagElement _jettag_c_get_3_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_15.setRuntimeParent(null);
        _jettag_c_get_3_15.setTagInfo(_td_c_get_3_15);
        _jettag_c_get_3_15.doStart(context, out);
        _jettag_c_get_3_15.doEnd();
        out.setTag(null,-1,-1);
        out.write(".class.php\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("class ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(17);
        out.setTag("uc",68,85);
        RuntimeTagElement _jettag_f_uc_5_7 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_5_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_uc_5_7.setRuntimeParent(null);
        _jettag_f_uc_5_7.setTagInfo(_td_f_uc_5_7);
        _jettag_f_uc_5_7.doStart(context, out);
        JET2Writer _jettag_f_uc_5_7_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_uc_5_7.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",85,112);
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
        out.write("\tprivate $host = \"localhost\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate $port = \"5432\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate $dbname = \"jet\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate $user = \"postgres\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate $password = \"teste\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic function __construct()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$this->dbconn = pg_connect(\"host= \" . $this->host . \" port=\" . $this->port . \" dbname=\" . $this->dbname . \" user=\" . $this->user . \" password=\" . $this->password);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic function add($");  //$NON-NLS-1$        
        out.setTag("get",511,538);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(27);
        RuntimeTagElement _jettag_c_get_19_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_23); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_19_23.setRuntimeParent(null);
        _jettag_c_get_19_23.setTagInfo(_td_c_get_19_23);
        _jettag_c_get_19_23.doStart(context, out);
        _jettag_c_get_19_23.doEnd();
        out.setTag(null,-1,-1);
        out.write(")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$query = pg_query(\"INSERT INTO ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(6);
        out.setTag("lc",576,582);
        RuntimeTagElement _jettag_f_lc_21_34 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_21_34); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_lc_21_34.setRuntimeParent(null);
        _jettag_f_lc_21_34.setTagInfo(_td_f_lc_21_34);
        _jettag_f_lc_21_34.doStart(context, out);
        JET2Writer _jettag_f_lc_21_34_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_lc_21_34.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",582,609);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_21_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_40); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_21_40.setRuntimeParent(_jettag_f_lc_21_34);
            _jettag_c_get_21_40.setTagInfo(_td_c_get_21_40);
            _jettag_c_get_21_40.doStart(context, out);
            _jettag_c_get_21_40.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_f_lc_21_34.handleBodyContent(out);
        }
        out = _jettag_f_lc_21_34_saved_out;
out.bodyContentEnd();
        _jettag_f_lc_21_34.doEnd();
        out.endTag("lc",27);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write("(");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(57);
        out.setTag("iterate",617,674);
        RuntimeTagElement _jettag_c_iterate_21_75 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_21_75); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_21_75.setRuntimeParent(null);
        _jettag_c_iterate_21_75.setTagInfo(_td_c_iterate_21_75);
        _jettag_c_iterate_21_75.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_21_75.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_21_75.getTagInfo().getAttribute("delimiter"),617,674);
            out.loopIterate();
            out.setTag("get",674,701);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_22_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_22_4.setRuntimeParent(_jettag_c_iterate_21_75);
            _jettag_c_get_22_4.setTagInfo(_td_c_get_22_4);
            _jettag_c_get_22_4.doStart(context, out);
            _jettag_c_get_22_4.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_c_iterate_21_75.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_21_75.doEnd();
        out.loopEnd();
        out.endTag("iterate",27);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(") VALUES(");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(57);
        out.setTag("iterate",722,779);
        RuntimeTagElement _jettag_c_iterate_22_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_22_52); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_22_52.setRuntimeParent(null);
        _jettag_c_iterate_22_52.setTagInfo(_td_c_iterate_22_52);
        _jettag_c_iterate_22_52.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_22_52.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_22_52.getTagInfo().getAttribute("delimiter"),722,779);
            out.loopIterate();
            out.write("'\" . $");  //$NON-NLS-1$        
            out.setTag("get",785,812);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_23_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_23_10.setRuntimeParent(_jettag_c_iterate_22_52);
            _jettag_c_get_23_10.setTagInfo(_td_c_get_23_10);
            _jettag_c_get_23_10.doStart(context, out);
            _jettag_c_get_23_10.doEnd();
            out.setTag(null,-1,-1);
            out.write("->get");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(17);
            out.setTag("uc",817,834);
            RuntimeTagElement _jettag_f_uc_23_42 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_23_42); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_uc_23_42.setRuntimeParent(_jettag_c_iterate_22_52);
            _jettag_f_uc_23_42.setTagInfo(_td_f_uc_23_42);
            _jettag_f_uc_23_42.doStart(context, out);
            JET2Writer _jettag_f_uc_23_42_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_f_uc_23_42.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.setTag("get",834,861);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(27);
                RuntimeTagElement _jettag_c_get_23_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_59); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_23_59.setRuntimeParent(_jettag_f_uc_23_42);
                _jettag_c_get_23_59.setTagInfo(_td_c_get_23_59);
                _jettag_c_get_23_59.doStart(context, out);
                _jettag_c_get_23_59.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_f_uc_23_42.handleBodyContent(out);
            }
            out = _jettag_f_uc_23_42_saved_out;
    out.bodyContentEnd();
            _jettag_f_uc_23_42.doEnd();
            out.endTag("uc",27);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write("() . \"'");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_22_52.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_22_52.doEnd();
        out.loopEnd();
        out.endTag("iterate",96);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(")\");");  //$NON-NLS-1$        
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
        out.setTag("get",966,993);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(27);
        RuntimeTagElement _jettag_c_get_28_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_28_26.setRuntimeParent(null);
        _jettag_c_get_28_26.setTagInfo(_td_c_get_28_26);
        _jettag_c_get_28_26.doStart(context, out);
        _jettag_c_get_28_26.doEnd();
        out.setTag(null,-1,-1);
        out.write(")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$query = pg_query(\"UPDATE ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(6);
        out.setTag("lc",1026,1032);
        RuntimeTagElement _jettag_f_lc_30_29 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_30_29); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_lc_30_29.setRuntimeParent(null);
        _jettag_f_lc_30_29.setTagInfo(_td_f_lc_30_29);
        _jettag_f_lc_30_29.doStart(context, out);
        JET2Writer _jettag_f_lc_30_29_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_lc_30_29.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",1032,1059);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_30_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_35); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_30_35.setRuntimeParent(_jettag_f_lc_30_29);
            _jettag_c_get_30_35.setTagInfo(_td_c_get_30_35);
            _jettag_c_get_30_35.doStart(context, out);
            _jettag_c_get_30_35.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_f_lc_30_29.handleBodyContent(out);
        }
        out = _jettag_f_lc_30_29_saved_out;
out.bodyContentEnd();
        _jettag_f_lc_30_29.doEnd();
        out.endTag("lc",27);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(" SET");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(54);
        out.setTag("iterate",1070,1124);
        RuntimeTagElement _jettag_c_iterate_30_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_30_73); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_30_73.setRuntimeParent(null);
        _jettag_c_iterate_30_73.setTagInfo(_td_c_iterate_30_73);
        _jettag_c_iterate_30_73.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_30_73.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_30_73.getTagInfo().getAttribute("delimiter"),1070,1124);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\t\t\t");  //$NON-NLS-1$        
            out.setTag("get",1129,1156);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_31_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_31_5.setRuntimeParent(_jettag_c_iterate_30_73);
            _jettag_c_get_31_5.setTagInfo(_td_c_get_31_5);
            _jettag_c_get_31_5.doStart(context, out);
            _jettag_c_get_31_5.doEnd();
            out.setTag(null,-1,-1);
            out.write(" = '\" . $");  //$NON-NLS-1$        
            out.setTag("get",1165,1192);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_31_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_41); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_31_41.setRuntimeParent(_jettag_c_iterate_30_73);
            _jettag_c_get_31_41.setTagInfo(_td_c_get_31_41);
            _jettag_c_get_31_41.doStart(context, out);
            _jettag_c_get_31_41.doEnd();
            out.setTag(null,-1,-1);
            out.write("->get");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(17);
            out.setTag("uc",1197,1214);
            RuntimeTagElement _jettag_f_uc_31_73 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_31_73); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_uc_31_73.setRuntimeParent(_jettag_c_iterate_30_73);
            _jettag_f_uc_31_73.setTagInfo(_td_f_uc_31_73);
            _jettag_f_uc_31_73.doStart(context, out);
            JET2Writer _jettag_f_uc_31_73_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_f_uc_31_73.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.setTag("get",1214,1241);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(27);
                RuntimeTagElement _jettag_c_get_31_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_90); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_31_90.setRuntimeParent(_jettag_f_uc_31_73);
                _jettag_c_get_31_90.setTagInfo(_td_c_get_31_90);
                _jettag_c_get_31_90.doStart(context, out);
                _jettag_c_get_31_90.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_f_uc_31_73.handleBodyContent(out);
            }
            out = _jettag_f_uc_31_73_saved_out;
    out.bodyContentEnd();
            _jettag_f_uc_31_73.doEnd();
            out.endTag("uc",27);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write("() . \"'");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_30_73.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_30_73.doEnd();
        out.loopEnd();
        out.endTag("iterate",131);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\tWHERE id = \" . $");  //$NON-NLS-1$        
        out.setTag("get",1287,1314);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(27);
        RuntimeTagElement _jettag_c_get_32_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_20); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_32_20.setRuntimeParent(null);
        _jettag_c_get_32_20.setTagInfo(_td_c_get_32_20);
        _jettag_c_get_32_20.doStart(context, out);
        _jettag_c_get_32_20.doEnd();
        out.setTag(null,-1,-1);
        out.write("->getId());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn (pg_affected_rows($query) > 0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic function destroy($");  //$NON-NLS-1$        
        out.setTag("get",1401,1428);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(27);
        RuntimeTagElement _jettag_c_get_37_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_27); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_37_27.setRuntimeParent(null);
        _jettag_c_get_37_27.setTagInfo(_td_c_get_37_27);
        _jettag_c_get_37_27.doStart(context, out);
        _jettag_c_get_37_27.doEnd();
        out.setTag(null,-1,-1);
        out.write(")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$query = pg_query(\"DELETE FROM ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(6);
        out.setTag("lc",1466,1472);
        RuntimeTagElement _jettag_f_lc_39_34 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_39_34); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_lc_39_34.setRuntimeParent(null);
        _jettag_f_lc_39_34.setTagInfo(_td_f_lc_39_34);
        _jettag_f_lc_39_34.doStart(context, out);
        JET2Writer _jettag_f_lc_39_34_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_lc_39_34.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",1472,1499);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_39_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_40); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_39_40.setRuntimeParent(_jettag_f_lc_39_34);
            _jettag_c_get_39_40.setTagInfo(_td_c_get_39_40);
            _jettag_c_get_39_40.doStart(context, out);
            _jettag_c_get_39_40.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_f_lc_39_34.handleBodyContent(out);
        }
        out = _jettag_f_lc_39_34_saved_out;
out.bodyContentEnd();
        _jettag_f_lc_39_34.doEnd();
        out.endTag("lc",27);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(" WHERE id = \" . $");  //$NON-NLS-1$        
        out.setTag("get",1523,1550);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(27);
        RuntimeTagElement _jettag_c_get_39_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_91); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_39_91.setRuntimeParent(null);
        _jettag_c_get_39_91.setTagInfo(_td_c_get_39_91);
        _jettag_c_get_39_91.doStart(context, out);
        _jettag_c_get_39_91.doEnd();
        out.setTag(null,-1,-1);
        out.write("->getId());");  //$NON-NLS-1$        
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
        out.setTag("lc",1699,1705);
        RuntimeTagElement _jettag_f_lc_48_36 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_48_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_lc_48_36.setRuntimeParent(null);
        _jettag_f_lc_48_36.setTagInfo(_td_f_lc_48_36);
        _jettag_f_lc_48_36.doStart(context, out);
        JET2Writer _jettag_f_lc_48_36_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_lc_48_36.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",1705,1732);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_48_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_42); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_48_42.setRuntimeParent(_jettag_f_lc_48_36);
            _jettag_c_get_48_42.setTagInfo(_td_c_get_48_42);
            _jettag_c_get_48_42.doStart(context, out);
            _jettag_c_get_48_42.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_f_lc_48_36.handleBodyContent(out);
        }
        out = _jettag_f_lc_48_36_saved_out;
out.bodyContentEnd();
        _jettag_f_lc_48_36.doEnd();
        out.endTag("lc",27);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write("\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif ($query) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\twhile ($row = pg_fetch_assoc($query)) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t$");  //$NON-NLS-1$        
        out.setTag("get",1810,1837);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(27);
        RuntimeTagElement _jettag_c_get_52_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_52_6.setRuntimeParent(null);
        _jettag_c_get_52_6.setTagInfo(_td_c_get_52_6);
        _jettag_c_get_52_6.doStart(context, out);
        _jettag_c_get_52_6.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = new ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(17);
        out.setTag("uc",1844,1861);
        RuntimeTagElement _jettag_f_uc_52_40 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_52_40); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_uc_52_40.setRuntimeParent(null);
        _jettag_f_uc_52_40.setTagInfo(_td_f_uc_52_40);
        _jettag_f_uc_52_40.doStart(context, out);
        JET2Writer _jettag_f_uc_52_40_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_uc_52_40.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",1861,1888);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_52_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_57); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_52_57.setRuntimeParent(_jettag_f_uc_52_40);
            _jettag_c_get_52_57.setTagInfo(_td_c_get_52_57);
            _jettag_c_get_52_57.doStart(context, out);
            _jettag_c_get_52_57.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_f_uc_52_40.handleBodyContent(out);
        }
        out = _jettag_f_uc_52_40_saved_out;
out.bodyContentEnd();
        _jettag_f_uc_52_40.doEnd();
        out.endTag("uc",27);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write("();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t$");  //$NON-NLS-1$        
        out.setTag("get",1909,1936);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(27);
        RuntimeTagElement _jettag_c_get_54_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_54_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_54_6.setRuntimeParent(null);
        _jettag_c_get_54_6.setTagInfo(_td_c_get_54_6);
        _jettag_c_get_54_6.doStart(context, out);
        _jettag_c_get_54_6.doEnd();
        out.setTag(null,-1,-1);
        out.write("->setId($row[\"id\"]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(39);
        out.setTag("iterate",1960,1999);
        RuntimeTagElement _jettag_c_iterate_55_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_55_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_55_4.setRuntimeParent(null);
        _jettag_c_iterate_55_4.setTagInfo(_td_c_iterate_55_4);
        _jettag_c_iterate_55_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_55_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_55_4.getTagInfo().getAttribute("delimiter"),1960,1999);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\t\t\t$");  //$NON-NLS-1$        
            out.setTag("get",2005,2032);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_56_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_56_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_56_6.setRuntimeParent(_jettag_c_iterate_55_4);
            _jettag_c_get_56_6.setTagInfo(_td_c_get_56_6);
            _jettag_c_get_56_6.doStart(context, out);
            _jettag_c_get_56_6.doEnd();
            out.setTag(null,-1,-1);
            out.write("->set");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(17);
            out.setTag("uc",2037,2054);
            RuntimeTagElement _jettag_f_uc_56_38 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_56_38); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_uc_56_38.setRuntimeParent(_jettag_c_iterate_55_4);
            _jettag_f_uc_56_38.setTagInfo(_td_f_uc_56_38);
            _jettag_f_uc_56_38.doStart(context, out);
            JET2Writer _jettag_f_uc_56_38_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_f_uc_56_38.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.setTag("get",2054,2081);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(27);
                RuntimeTagElement _jettag_c_get_56_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_56_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_56_55.setRuntimeParent(_jettag_f_uc_56_38);
                _jettag_c_get_56_55.setTagInfo(_td_c_get_56_55);
                _jettag_c_get_56_55.doStart(context, out);
                _jettag_c_get_56_55.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_f_uc_56_38.handleBodyContent(out);
            }
            out = _jettag_f_uc_56_38_saved_out;
    out.bodyContentEnd();
            _jettag_f_uc_56_38.doEnd();
            out.endTag("uc",27);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write("($row[\"");  //$NON-NLS-1$        
            out.setTag("get",2095,2122);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_56_96 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_56_96); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_56_96.setRuntimeParent(_jettag_c_iterate_55_4);
            _jettag_c_get_56_96.setTagInfo(_td_c_get_56_96);
            _jettag_c_get_56_96.doStart(context, out);
            _jettag_c_get_56_96.doEnd();
            out.setTag(null,-1,-1);
            out.write("\"]);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_55_4.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_55_4.doEnd();
        out.loopEnd();
        out.endTag("iterate",131);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\t\t$result[] = $");  //$NON-NLS-1$        
        out.setTag("get",2160,2187);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(27);
        RuntimeTagElement _jettag_c_get_58_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_58_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_58_18.setRuntimeParent(null);
        _jettag_c_get_58_18.setTagInfo(_td_c_get_58_18);
        _jettag_c_get_58_18.doStart(context, out);
        _jettag_c_get_58_18.doEnd();
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
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic function get($");  //$NON-NLS-1$        
        out.setTag("get",2246,2273);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(27);
        RuntimeTagElement _jettag_c_get_65_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_65_23); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_65_23.setRuntimeParent(null);
        _jettag_c_get_65_23.setTagInfo(_td_c_get_65_23);
        _jettag_c_get_65_23.doStart(context, out);
        _jettag_c_get_65_23.doEnd();
        out.setTag(null,-1,-1);
        out.write(")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$result = array();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$where = \"\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(39);
        out.setTag("iterate",2321,2360);
        RuntimeTagElement _jettag_c_iterate_71_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_71_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_71_2.setRuntimeParent(null);
        _jettag_c_iterate_71_2.setTagInfo(_td_c_iterate_71_2);
        _jettag_c_iterate_71_2.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_71_2.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_71_2.getTagInfo().getAttribute("delimiter"),2321,2360);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\tif (strlen($");  //$NON-NLS-1$        
            out.setTag("get",2375,2402);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_72_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_15); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_72_15.setRuntimeParent(_jettag_c_iterate_71_2);
            _jettag_c_get_72_15.setTagInfo(_td_c_get_72_15);
            _jettag_c_get_72_15.doStart(context, out);
            _jettag_c_get_72_15.doEnd();
            out.setTag(null,-1,-1);
            out.write("->get");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(17);
            out.setTag("uc",2407,2424);
            RuntimeTagElement _jettag_f_uc_72_47 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_72_47); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_uc_72_47.setRuntimeParent(_jettag_c_iterate_71_2);
            _jettag_f_uc_72_47.setTagInfo(_td_f_uc_72_47);
            _jettag_f_uc_72_47.doStart(context, out);
            JET2Writer _jettag_f_uc_72_47_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_f_uc_72_47.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.setTag("get",2424,2451);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(27);
                RuntimeTagElement _jettag_c_get_72_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_64); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_72_64.setRuntimeParent(_jettag_f_uc_72_47);
                _jettag_c_get_72_64.setTagInfo(_td_c_get_72_64);
                _jettag_c_get_72_64.doStart(context, out);
                _jettag_c_get_72_64.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_f_uc_72_47.handleBodyContent(out);
            }
            out = _jettag_f_uc_72_47_saved_out;
    out.bodyContentEnd();
            _jettag_f_uc_72_47.doEnd();
            out.endTag("uc",27);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write("()) > 0) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\tif (srlen($where) > 0) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t$where .= \" AND \";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t} else {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t$where = \"WHERE \";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t$where .= \"");  //$NON-NLS-1$        
            out.setTag("get",2578,2605);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_79_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_15); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_79_15.setRuntimeParent(_jettag_c_iterate_71_2);
            _jettag_c_get_79_15.setTagInfo(_td_c_get_79_15);
            _jettag_c_get_79_15.doStart(context, out);
            _jettag_c_get_79_15.doEnd();
            out.setTag(null,-1,-1);
            out.write("' = \" . $");  //$NON-NLS-1$        
            out.setTag("get",2614,2641);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_79_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_51); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_79_51.setRuntimeParent(_jettag_c_iterate_71_2);
            _jettag_c_get_79_51.setTagInfo(_td_c_get_79_51);
            _jettag_c_get_79_51.doStart(context, out);
            _jettag_c_get_79_51.doEnd();
            out.setTag(null,-1,-1);
            out.write("->get");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(17);
            out.setTag("uc",2646,2663);
            RuntimeTagElement _jettag_f_uc_79_83 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_79_83); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_uc_79_83.setRuntimeParent(_jettag_c_iterate_71_2);
            _jettag_f_uc_79_83.setTagInfo(_td_f_uc_79_83);
            _jettag_f_uc_79_83.doStart(context, out);
            JET2Writer _jettag_f_uc_79_83_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_f_uc_79_83.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.setTag("get",2663,2690);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(27);
                RuntimeTagElement _jettag_c_get_79_100 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_100); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_79_100.setRuntimeParent(_jettag_f_uc_79_83);
                _jettag_c_get_79_100.setTagInfo(_td_c_get_79_100);
                _jettag_c_get_79_100.doStart(context, out);
                _jettag_c_get_79_100.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_f_uc_79_83.handleBodyContent(out);
            }
            out = _jettag_f_uc_79_83_saved_out;
    out.bodyContentEnd();
            _jettag_f_uc_79_83.doEnd();
            out.endTag("uc",27);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write("() . \"'\";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_71_2.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_71_2.doEnd();
        out.loopEnd();
        out.endTag("iterate",352);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t$query = pg_query(\"SELECT * FROM ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(6);
        out.setTag("lc",2760,2766);
        RuntimeTagElement _jettag_f_lc_82_36 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_82_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_lc_82_36.setRuntimeParent(null);
        _jettag_f_lc_82_36.setTagInfo(_td_f_lc_82_36);
        _jettag_f_lc_82_36.doStart(context, out);
        JET2Writer _jettag_f_lc_82_36_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_lc_82_36.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",2766,2793);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_82_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_82_42); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_82_42.setRuntimeParent(_jettag_f_lc_82_36);
            _jettag_c_get_82_42.setTagInfo(_td_c_get_82_42);
            _jettag_c_get_82_42.doStart(context, out);
            _jettag_c_get_82_42.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_f_lc_82_36.handleBodyContent(out);
        }
        out = _jettag_f_lc_82_36_saved_out;
out.bodyContentEnd();
        _jettag_f_lc_82_36.doEnd();
        out.endTag("lc",27);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(" \" . $where);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif ($query) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\twhile ($row = pg_fetch_assoc($query)) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t$");  //$NON-NLS-1$        
        out.setTag("get",2881,2908);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(27);
        RuntimeTagElement _jettag_c_get_86_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_86_6.setRuntimeParent(null);
        _jettag_c_get_86_6.setTagInfo(_td_c_get_86_6);
        _jettag_c_get_86_6.doStart(context, out);
        _jettag_c_get_86_6.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = new ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(17);
        out.setTag("uc",2915,2932);
        RuntimeTagElement _jettag_f_uc_86_40 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_86_40); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_uc_86_40.setRuntimeParent(null);
        _jettag_f_uc_86_40.setTagInfo(_td_f_uc_86_40);
        _jettag_f_uc_86_40.doStart(context, out);
        JET2Writer _jettag_f_uc_86_40_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_uc_86_40.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",2932,2959);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_86_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_57); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_86_57.setRuntimeParent(_jettag_f_uc_86_40);
            _jettag_c_get_86_57.setTagInfo(_td_c_get_86_57);
            _jettag_c_get_86_57.doStart(context, out);
            _jettag_c_get_86_57.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_f_uc_86_40.handleBodyContent(out);
        }
        out = _jettag_f_uc_86_40_saved_out;
out.bodyContentEnd();
        _jettag_f_uc_86_40.doEnd();
        out.endTag("uc",27);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write("();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t$");  //$NON-NLS-1$        
        out.setTag("get",2980,3007);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(27);
        RuntimeTagElement _jettag_c_get_88_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_88_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_88_6.setRuntimeParent(null);
        _jettag_c_get_88_6.setTagInfo(_td_c_get_88_6);
        _jettag_c_get_88_6.doStart(context, out);
        _jettag_c_get_88_6.doEnd();
        out.setTag(null,-1,-1);
        out.write("->setId($row[\"id\"]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(39);
        out.setTag("iterate",3031,3070);
        RuntimeTagElement _jettag_c_iterate_89_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_89_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_89_4.setRuntimeParent(null);
        _jettag_c_iterate_89_4.setTagInfo(_td_c_iterate_89_4);
        _jettag_c_iterate_89_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_89_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_89_4.getTagInfo().getAttribute("delimiter"),3031,3070);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\t\t\t$");  //$NON-NLS-1$        
            out.setTag("get",3076,3103);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_90_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_90_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_90_6.setRuntimeParent(_jettag_c_iterate_89_4);
            _jettag_c_get_90_6.setTagInfo(_td_c_get_90_6);
            _jettag_c_get_90_6.doStart(context, out);
            _jettag_c_get_90_6.doEnd();
            out.setTag(null,-1,-1);
            out.write("->set");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(17);
            out.setTag("uc",3108,3125);
            RuntimeTagElement _jettag_f_uc_90_38 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_90_38); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_uc_90_38.setRuntimeParent(_jettag_c_iterate_89_4);
            _jettag_f_uc_90_38.setTagInfo(_td_f_uc_90_38);
            _jettag_f_uc_90_38.doStart(context, out);
            JET2Writer _jettag_f_uc_90_38_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_f_uc_90_38.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.setTag("get",3125,3152);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(27);
                RuntimeTagElement _jettag_c_get_90_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_90_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_90_55.setRuntimeParent(_jettag_f_uc_90_38);
                _jettag_c_get_90_55.setTagInfo(_td_c_get_90_55);
                _jettag_c_get_90_55.doStart(context, out);
                _jettag_c_get_90_55.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_f_uc_90_38.handleBodyContent(out);
            }
            out = _jettag_f_uc_90_38_saved_out;
    out.bodyContentEnd();
            _jettag_f_uc_90_38.doEnd();
            out.endTag("uc",27);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write("($row[\"");  //$NON-NLS-1$        
            out.setTag("get",3166,3193);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(27);
            RuntimeTagElement _jettag_c_get_90_96 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_90_96); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_90_96.setRuntimeParent(_jettag_c_iterate_89_4);
            _jettag_c_get_90_96.setTagInfo(_td_c_get_90_96);
            _jettag_c_get_90_96.doStart(context, out);
            _jettag_c_get_90_96.doEnd();
            out.setTag(null,-1,-1);
            out.write("\"]);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_89_4.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_89_4.doEnd();
        out.loopEnd();
        out.endTag("iterate",131);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\t\t$result[] = $");  //$NON-NLS-1$        
        out.setTag("get",3231,3258);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(27);
        RuntimeTagElement _jettag_c_get_92_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_92_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_92_18.setRuntimeParent(null);
        _jettag_c_get_92_18.setTagInfo(_td_c_get_92_18);
        _jettag_c_get_92_18.doStart(context, out);
        _jettag_c_get_92_18.doEnd();
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
