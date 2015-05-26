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
                "$currentEntity/@name", //$NON-NLS-1$
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
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_23 = new TagInfo("c:get", //$NON-NLS-1$
            19, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
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
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_21_87 = new TagInfo("c:iterate", //$NON-NLS-1$
            21, 87,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
                ", ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_4 = new TagInfo("c:get", //$NON-NLS-1$
            22, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_22_65 = new TagInfo("c:iterate", //$NON-NLS-1$
            22, 65,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
                ", ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_10 = new TagInfo("c:get", //$NON-NLS-1$
            23, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_23_54 = new TagInfo("f:uc", //$NON-NLS-1$
            23, 54,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_71 = new TagInfo("c:get", //$NON-NLS-1$
            23, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_26 = new TagInfo("c:get", //$NON-NLS-1$
            28, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
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
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_30_85 = new TagInfo("c:iterate", //$NON-NLS-1$
            30, 85,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
                ", ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_5 = new TagInfo("c:get", //$NON-NLS-1$
            31, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_54 = new TagInfo("c:get", //$NON-NLS-1$
            31, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_31_98 = new TagInfo("f:uc", //$NON-NLS-1$
            31, 98,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_115 = new TagInfo("c:get", //$NON-NLS-1$
            31, 115,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_20 = new TagInfo("c:get", //$NON-NLS-1$
            32, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_27 = new TagInfo("c:get", //$NON-NLS-1$
            37, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
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
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_103 = new TagInfo("c:get", //$NON-NLS-1$
            39, 103,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
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
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_6 = new TagInfo("c:get", //$NON-NLS-1$
            52, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_52_52 = new TagInfo("f:uc", //$NON-NLS-1$
            52, 52,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_69 = new TagInfo("c:get", //$NON-NLS-1$
            52, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_6 = new TagInfo("c:get", //$NON-NLS-1$
            54, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_55_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            55, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_6 = new TagInfo("c:get", //$NON-NLS-1$
            56, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_56_50 = new TagInfo("f:uc", //$NON-NLS-1$
            56, 50,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_67 = new TagInfo("c:get", //$NON-NLS-1$
            56, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_121 = new TagInfo("c:get", //$NON-NLS-1$
            56, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_58_18 = new TagInfo("c:get", //$NON-NLS-1$
            58, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_65_23 = new TagInfo("c:get", //$NON-NLS-1$
            65, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_71_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            71, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_15 = new TagInfo("c:get", //$NON-NLS-1$
            72, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_72_59 = new TagInfo("f:uc", //$NON-NLS-1$
            72, 59,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_76 = new TagInfo("c:get", //$NON-NLS-1$
            72, 76,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_15 = new TagInfo("c:get", //$NON-NLS-1$
            79, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_64 = new TagInfo("c:get", //$NON-NLS-1$
            79, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_79_108 = new TagInfo("f:uc", //$NON-NLS-1$
            79, 108,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_125 = new TagInfo("c:get", //$NON-NLS-1$
            79, 125,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
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
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_6 = new TagInfo("c:get", //$NON-NLS-1$
            86, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_86_52 = new TagInfo("f:uc", //$NON-NLS-1$
            86, 52,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_69 = new TagInfo("c:get", //$NON-NLS-1$
            86, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_88_6 = new TagInfo("c:get", //$NON-NLS-1$
            88, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_89_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            89, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/Feature", //$NON-NLS-1$
                "currentFeature", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_90_6 = new TagInfo("c:get", //$NON-NLS-1$
            90, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_uc_90_50 = new TagInfo("f:uc", //$NON-NLS-1$
            90, 50,
            new String[] {
                "length", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_90_67 = new TagInfo("c:get", //$NON-NLS-1$
            90, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_90_121 = new TagInfo("c:get", //$NON-NLS-1$
            90, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentFeature/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_92_18 = new TagInfo("c:get", //$NON-NLS-1$
            92, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$currentEntity/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        out.write("<?php");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("include_once \"");  //$NON-NLS-1$        
        out.setTag("get",21,60);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
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
        out.setTag("uc",80,97);
        RuntimeTagElement _jettag_f_uc_5_7 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_5_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_uc_5_7.setRuntimeParent(null);
        _jettag_f_uc_5_7.setTagInfo(_td_f_uc_5_7);
        _jettag_f_uc_5_7.doStart(context, out);
        JET2Writer _jettag_f_uc_5_7_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_uc_5_7.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",97,136);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
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
        out.endTag("uc",39);
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
        out.setTag("get",535,574);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
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
        out.setTag("lc",612,618);
        RuntimeTagElement _jettag_f_lc_21_34 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_21_34); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_lc_21_34.setRuntimeParent(null);
        _jettag_f_lc_21_34.setTagInfo(_td_f_lc_21_34);
        _jettag_f_lc_21_34.doStart(context, out);
        JET2Writer _jettag_f_lc_21_34_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_lc_21_34.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",618,657);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
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
        out.endTag("lc",39);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write("(");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(82);
        out.setTag("iterate",665,747);
        RuntimeTagElement _jettag_c_iterate_21_87 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_21_87); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_21_87.setRuntimeParent(null);
        _jettag_c_iterate_21_87.setTagInfo(_td_c_iterate_21_87);
        _jettag_c_iterate_21_87.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_21_87.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_21_87.getTagInfo().getAttribute("delimiter"),665,747);
            out.loopIterate();
            out.setTag("get",747,787);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(40);
            RuntimeTagElement _jettag_c_get_22_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_22_4.setRuntimeParent(_jettag_c_iterate_21_87);
            _jettag_c_get_22_4.setTagInfo(_td_c_get_22_4);
            _jettag_c_get_22_4.doStart(context, out);
            _jettag_c_get_22_4.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_c_iterate_21_87.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_21_87.doEnd();
        out.loopEnd();
        out.endTag("iterate",40);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(") VALUES(");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(82);
        out.setTag("iterate",808,890);
        RuntimeTagElement _jettag_c_iterate_22_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_22_65); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_22_65.setRuntimeParent(null);
        _jettag_c_iterate_22_65.setTagInfo(_td_c_iterate_22_65);
        _jettag_c_iterate_22_65.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_22_65.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_22_65.getTagInfo().getAttribute("delimiter"),808,890);
            out.loopIterate();
            out.write("'\" . $");  //$NON-NLS-1$        
            out.setTag("get",896,935);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
            RuntimeTagElement _jettag_c_get_23_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_23_10.setRuntimeParent(_jettag_c_iterate_22_65);
            _jettag_c_get_23_10.setTagInfo(_td_c_get_23_10);
            _jettag_c_get_23_10.doStart(context, out);
            _jettag_c_get_23_10.doEnd();
            out.setTag(null,-1,-1);
            out.write("->get");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(17);
            out.setTag("uc",940,957);
            RuntimeTagElement _jettag_f_uc_23_54 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_23_54); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_uc_23_54.setRuntimeParent(_jettag_c_iterate_22_65);
            _jettag_f_uc_23_54.setTagInfo(_td_f_uc_23_54);
            _jettag_f_uc_23_54.doStart(context, out);
            JET2Writer _jettag_f_uc_23_54_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_f_uc_23_54.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.setTag("get",957,997);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_23_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_71); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_23_71.setRuntimeParent(_jettag_f_uc_23_54);
                _jettag_c_get_23_71.setTagInfo(_td_c_get_23_71);
                _jettag_c_get_23_71.doStart(context, out);
                _jettag_c_get_23_71.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_f_uc_23_54.handleBodyContent(out);
            }
            out = _jettag_f_uc_23_54_saved_out;
    out.bodyContentEnd();
            _jettag_f_uc_23_54.doEnd();
            out.endTag("uc",40);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write("() . \"'");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_22_65.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_22_65.doEnd();
        out.loopEnd();
        out.endTag("iterate",121);
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
        out.setTag("get",1102,1141);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
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
        out.setTag("lc",1174,1180);
        RuntimeTagElement _jettag_f_lc_30_29 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_30_29); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_lc_30_29.setRuntimeParent(null);
        _jettag_f_lc_30_29.setTagInfo(_td_f_lc_30_29);
        _jettag_f_lc_30_29.doStart(context, out);
        JET2Writer _jettag_f_lc_30_29_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_lc_30_29.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",1180,1219);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
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
        out.endTag("lc",39);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(" SET");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(79);
        out.setTag("iterate",1230,1309);
        RuntimeTagElement _jettag_c_iterate_30_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_30_85); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_30_85.setRuntimeParent(null);
        _jettag_c_iterate_30_85.setTagInfo(_td_c_iterate_30_85);
        _jettag_c_iterate_30_85.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_30_85.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_30_85.getTagInfo().getAttribute("delimiter"),1230,1309);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\t\t\t");  //$NON-NLS-1$        
            out.setTag("get",1314,1354);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(40);
            RuntimeTagElement _jettag_c_get_31_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_31_5.setRuntimeParent(_jettag_c_iterate_30_85);
            _jettag_c_get_31_5.setTagInfo(_td_c_get_31_5);
            _jettag_c_get_31_5.doStart(context, out);
            _jettag_c_get_31_5.doEnd();
            out.setTag(null,-1,-1);
            out.write(" = '\" . $");  //$NON-NLS-1$        
            out.setTag("get",1363,1402);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
            RuntimeTagElement _jettag_c_get_31_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_54); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_31_54.setRuntimeParent(_jettag_c_iterate_30_85);
            _jettag_c_get_31_54.setTagInfo(_td_c_get_31_54);
            _jettag_c_get_31_54.doStart(context, out);
            _jettag_c_get_31_54.doEnd();
            out.setTag(null,-1,-1);
            out.write("->get");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(17);
            out.setTag("uc",1407,1424);
            RuntimeTagElement _jettag_f_uc_31_98 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_31_98); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_uc_31_98.setRuntimeParent(_jettag_c_iterate_30_85);
            _jettag_f_uc_31_98.setTagInfo(_td_f_uc_31_98);
            _jettag_f_uc_31_98.doStart(context, out);
            JET2Writer _jettag_f_uc_31_98_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_f_uc_31_98.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.setTag("get",1424,1464);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_31_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_115); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_31_115.setRuntimeParent(_jettag_f_uc_31_98);
                _jettag_c_get_31_115.setTagInfo(_td_c_get_31_115);
                _jettag_c_get_31_115.doStart(context, out);
                _jettag_c_get_31_115.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_f_uc_31_98.handleBodyContent(out);
            }
            out = _jettag_f_uc_31_98_saved_out;
    out.bodyContentEnd();
            _jettag_f_uc_31_98.doEnd();
            out.endTag("uc",40);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write("() . \"'");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_iterate_30_85.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_30_85.doEnd();
        out.loopEnd();
        out.endTag("iterate",169);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\tWHERE id = \" . $");  //$NON-NLS-1$        
        out.setTag("get",1510,1549);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
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
        out.setTag("get",1636,1675);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
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
        out.setTag("lc",1713,1719);
        RuntimeTagElement _jettag_f_lc_39_34 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_39_34); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_lc_39_34.setRuntimeParent(null);
        _jettag_f_lc_39_34.setTagInfo(_td_f_lc_39_34);
        _jettag_f_lc_39_34.doStart(context, out);
        JET2Writer _jettag_f_lc_39_34_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_lc_39_34.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",1719,1758);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
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
        out.endTag("lc",39);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(" WHERE id = \" . $");  //$NON-NLS-1$        
        out.setTag("get",1782,1821);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_39_103 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_103); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_39_103.setRuntimeParent(null);
        _jettag_c_get_39_103.setTagInfo(_td_c_get_39_103);
        _jettag_c_get_39_103.doStart(context, out);
        _jettag_c_get_39_103.doEnd();
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
        out.setTag("lc",1970,1976);
        RuntimeTagElement _jettag_f_lc_48_36 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_48_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_lc_48_36.setRuntimeParent(null);
        _jettag_f_lc_48_36.setTagInfo(_td_f_lc_48_36);
        _jettag_f_lc_48_36.doStart(context, out);
        JET2Writer _jettag_f_lc_48_36_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_lc_48_36.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",1976,2015);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
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
        out.endTag("lc",39);
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
        out.setTag("get",2093,2132);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_52_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_52_6.setRuntimeParent(null);
        _jettag_c_get_52_6.setTagInfo(_td_c_get_52_6);
        _jettag_c_get_52_6.doStart(context, out);
        _jettag_c_get_52_6.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = new ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(17);
        out.setTag("uc",2139,2156);
        RuntimeTagElement _jettag_f_uc_52_52 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_52_52); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_uc_52_52.setRuntimeParent(null);
        _jettag_f_uc_52_52.setTagInfo(_td_f_uc_52_52);
        _jettag_f_uc_52_52.doStart(context, out);
        JET2Writer _jettag_f_uc_52_52_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_uc_52_52.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",2156,2195);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
            RuntimeTagElement _jettag_c_get_52_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_69); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_52_69.setRuntimeParent(_jettag_f_uc_52_52);
            _jettag_c_get_52_69.setTagInfo(_td_c_get_52_69);
            _jettag_c_get_52_69.doStart(context, out);
            _jettag_c_get_52_69.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_f_uc_52_52.handleBodyContent(out);
        }
        out = _jettag_f_uc_52_52_saved_out;
out.bodyContentEnd();
        _jettag_f_uc_52_52.doEnd();
        out.endTag("uc",39);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write("();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t$");  //$NON-NLS-1$        
        out.setTag("get",2216,2255);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
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
out.jump(64);
        out.setTag("iterate",2279,2343);
        RuntimeTagElement _jettag_c_iterate_55_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_55_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_55_4.setRuntimeParent(null);
        _jettag_c_iterate_55_4.setTagInfo(_td_c_iterate_55_4);
        _jettag_c_iterate_55_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_55_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_55_4.getTagInfo().getAttribute("delimiter"),2279,2343);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\t\t\t$");  //$NON-NLS-1$        
            out.setTag("get",2349,2388);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
            RuntimeTagElement _jettag_c_get_56_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_56_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_56_6.setRuntimeParent(_jettag_c_iterate_55_4);
            _jettag_c_get_56_6.setTagInfo(_td_c_get_56_6);
            _jettag_c_get_56_6.doStart(context, out);
            _jettag_c_get_56_6.doEnd();
            out.setTag(null,-1,-1);
            out.write("->set");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(17);
            out.setTag("uc",2393,2410);
            RuntimeTagElement _jettag_f_uc_56_50 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_56_50); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_uc_56_50.setRuntimeParent(_jettag_c_iterate_55_4);
            _jettag_f_uc_56_50.setTagInfo(_td_f_uc_56_50);
            _jettag_f_uc_56_50.doStart(context, out);
            JET2Writer _jettag_f_uc_56_50_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_f_uc_56_50.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.setTag("get",2410,2450);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_56_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_56_67); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_56_67.setRuntimeParent(_jettag_f_uc_56_50);
                _jettag_c_get_56_67.setTagInfo(_td_c_get_56_67);
                _jettag_c_get_56_67.doStart(context, out);
                _jettag_c_get_56_67.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_f_uc_56_50.handleBodyContent(out);
            }
            out = _jettag_f_uc_56_50_saved_out;
    out.bodyContentEnd();
            _jettag_f_uc_56_50.doEnd();
            out.endTag("uc",40);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write("($row[\"");  //$NON-NLS-1$        
            out.setTag("get",2464,2504);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(40);
            RuntimeTagElement _jettag_c_get_56_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_56_121); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_56_121.setRuntimeParent(_jettag_c_iterate_55_4);
            _jettag_c_get_56_121.setTagInfo(_td_c_get_56_121);
            _jettag_c_get_56_121.doStart(context, out);
            _jettag_c_get_56_121.doEnd();
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
        out.endTag("iterate",169);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\t\t$result[] = $");  //$NON-NLS-1$        
        out.setTag("get",2542,2581);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
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
        out.setTag("get",2640,2679);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
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
out.jump(64);
        out.setTag("iterate",2727,2791);
        RuntimeTagElement _jettag_c_iterate_71_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_71_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_71_2.setRuntimeParent(null);
        _jettag_c_iterate_71_2.setTagInfo(_td_c_iterate_71_2);
        _jettag_c_iterate_71_2.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_71_2.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_71_2.getTagInfo().getAttribute("delimiter"),2727,2791);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\tif (strlen($");  //$NON-NLS-1$        
            out.setTag("get",2806,2845);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
            RuntimeTagElement _jettag_c_get_72_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_15); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_72_15.setRuntimeParent(_jettag_c_iterate_71_2);
            _jettag_c_get_72_15.setTagInfo(_td_c_get_72_15);
            _jettag_c_get_72_15.doStart(context, out);
            _jettag_c_get_72_15.doEnd();
            out.setTag(null,-1,-1);
            out.write("->get");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(17);
            out.setTag("uc",2850,2867);
            RuntimeTagElement _jettag_f_uc_72_59 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_72_59); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_uc_72_59.setRuntimeParent(_jettag_c_iterate_71_2);
            _jettag_f_uc_72_59.setTagInfo(_td_f_uc_72_59);
            _jettag_f_uc_72_59.doStart(context, out);
            JET2Writer _jettag_f_uc_72_59_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_f_uc_72_59.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.setTag("get",2867,2907);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_72_76 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_76); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_72_76.setRuntimeParent(_jettag_f_uc_72_59);
                _jettag_c_get_72_76.setTagInfo(_td_c_get_72_76);
                _jettag_c_get_72_76.doStart(context, out);
                _jettag_c_get_72_76.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_f_uc_72_59.handleBodyContent(out);
            }
            out = _jettag_f_uc_72_59_saved_out;
    out.bodyContentEnd();
            _jettag_f_uc_72_59.doEnd();
            out.endTag("uc",40);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write("()) > 0) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\tif (strlen($where) > 0) {");  //$NON-NLS-1$        
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
            out.setTag("get",3035,3075);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(40);
            RuntimeTagElement _jettag_c_get_79_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_15); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_79_15.setRuntimeParent(_jettag_c_iterate_71_2);
            _jettag_c_get_79_15.setTagInfo(_td_c_get_79_15);
            _jettag_c_get_79_15.doStart(context, out);
            _jettag_c_get_79_15.doEnd();
            out.setTag(null,-1,-1);
            out.write(" = '\" . $");  //$NON-NLS-1$        
            out.setTag("get",3084,3123);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
            RuntimeTagElement _jettag_c_get_79_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_64); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_79_64.setRuntimeParent(_jettag_c_iterate_71_2);
            _jettag_c_get_79_64.setTagInfo(_td_c_get_79_64);
            _jettag_c_get_79_64.doStart(context, out);
            _jettag_c_get_79_64.doEnd();
            out.setTag(null,-1,-1);
            out.write("->get");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(17);
            out.setTag("uc",3128,3145);
            RuntimeTagElement _jettag_f_uc_79_108 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_79_108); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_uc_79_108.setRuntimeParent(_jettag_c_iterate_71_2);
            _jettag_f_uc_79_108.setTagInfo(_td_f_uc_79_108);
            _jettag_f_uc_79_108.doStart(context, out);
            JET2Writer _jettag_f_uc_79_108_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_f_uc_79_108.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.setTag("get",3145,3185);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_79_125 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_125); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_79_125.setRuntimeParent(_jettag_f_uc_79_108);
                _jettag_c_get_79_125.setTagInfo(_td_c_get_79_125);
                _jettag_c_get_79_125.doStart(context, out);
                _jettag_c_get_79_125.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_f_uc_79_108.handleBodyContent(out);
            }
            out = _jettag_f_uc_79_108_saved_out;
    out.bodyContentEnd();
            _jettag_f_uc_79_108.doEnd();
            out.endTag("uc",40);
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
        out.endTag("iterate",416);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t$query = pg_query(\"SELECT * FROM ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(6);
        out.setTag("lc",3255,3261);
        RuntimeTagElement _jettag_f_lc_82_36 = context.getTagFactory().createRuntimeTag(_jetns_f, "lc", "f:lc", _td_f_lc_82_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_lc_82_36.setRuntimeParent(null);
        _jettag_f_lc_82_36.setTagInfo(_td_f_lc_82_36);
        _jettag_f_lc_82_36.doStart(context, out);
        JET2Writer _jettag_f_lc_82_36_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_lc_82_36.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",3261,3300);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
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
        out.endTag("lc",39);
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
        out.setTag("get",3388,3427);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
        RuntimeTagElement _jettag_c_get_86_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_86_6.setRuntimeParent(null);
        _jettag_c_get_86_6.setTagInfo(_td_c_get_86_6);
        _jettag_c_get_86_6.doStart(context, out);
        _jettag_c_get_86_6.doEnd();
        out.setTag(null,-1,-1);
        out.write(" = new ");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(17);
        out.setTag("uc",3434,3451);
        RuntimeTagElement _jettag_f_uc_86_52 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_86_52); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_uc_86_52.setRuntimeParent(null);
        _jettag_f_uc_86_52.setTagInfo(_td_f_uc_86_52);
        _jettag_f_uc_86_52.doStart(context, out);
        JET2Writer _jettag_f_uc_86_52_saved_out = out;
        out.setTag(null,-1,-1);
        while (_jettag_f_uc_86_52.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.setTag("get",3451,3490);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
            RuntimeTagElement _jettag_c_get_86_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_69); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_86_69.setRuntimeParent(_jettag_f_uc_86_52);
            _jettag_c_get_86_69.setTagInfo(_td_c_get_86_69);
            _jettag_c_get_86_69.doStart(context, out);
            _jettag_c_get_86_69.doEnd();
            out.setTag(null,-1,-1);
out.bodyContentStart();
            _jettag_f_uc_86_52.handleBodyContent(out);
        }
        out = _jettag_f_uc_86_52_saved_out;
out.bodyContentEnd();
        _jettag_f_uc_86_52.doEnd();
        out.endTag("uc",39);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write("();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t$");  //$NON-NLS-1$        
        out.setTag("get",3511,3550);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
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
out.jump(64);
        out.setTag("iterate",3574,3638);
        RuntimeTagElement _jettag_c_iterate_89_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_89_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_89_4.setRuntimeParent(null);
        _jettag_c_iterate_89_4.setTagInfo(_td_c_iterate_89_4);
        _jettag_c_iterate_89_4.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_89_4.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_89_4.getTagInfo().getAttribute("delimiter"),3574,3638);
            out.loopIterate();
            out.write(NL);         
            out.write("\t\t\t\t$");  //$NON-NLS-1$        
            out.setTag("get",3644,3683);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(39);
            RuntimeTagElement _jettag_c_get_90_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_90_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_90_6.setRuntimeParent(_jettag_c_iterate_89_4);
            _jettag_c_get_90_6.setTagInfo(_td_c_get_90_6);
            _jettag_c_get_90_6.doStart(context, out);
            _jettag_c_get_90_6.doEnd();
            out.setTag(null,-1,-1);
            out.write("->set");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(17);
            out.setTag("uc",3688,3705);
            RuntimeTagElement _jettag_f_uc_90_50 = context.getTagFactory().createRuntimeTag(_jetns_f, "uc", "f:uc", _td_f_uc_90_50); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_uc_90_50.setRuntimeParent(_jettag_c_iterate_89_4);
            _jettag_f_uc_90_50.setTagInfo(_td_f_uc_90_50);
            _jettag_f_uc_90_50.doStart(context, out);
            JET2Writer _jettag_f_uc_90_50_saved_out = out;
            out.setTag(null,-1,-1);
            while (_jettag_f_uc_90_50.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.setTag("get",3705,3745);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(40);
                RuntimeTagElement _jettag_c_get_90_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_90_67); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_90_67.setRuntimeParent(_jettag_f_uc_90_50);
                _jettag_c_get_90_67.setTagInfo(_td_c_get_90_67);
                _jettag_c_get_90_67.doStart(context, out);
                _jettag_c_get_90_67.doEnd();
                out.setTag(null,-1,-1);
    out.bodyContentStart();
                _jettag_f_uc_90_50.handleBodyContent(out);
            }
            out = _jettag_f_uc_90_50_saved_out;
    out.bodyContentEnd();
            _jettag_f_uc_90_50.doEnd();
            out.endTag("uc",40);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write("($row[\"");  //$NON-NLS-1$        
            out.setTag("get",3759,3799);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(40);
            RuntimeTagElement _jettag_c_get_90_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_90_121); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_90_121.setRuntimeParent(_jettag_c_iterate_89_4);
            _jettag_c_get_90_121.setTagInfo(_td_c_get_90_121);
            _jettag_c_get_90_121.doStart(context, out);
            _jettag_c_get_90_121.doEnd();
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
        out.endTag("iterate",169);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("\t\t\t\t$result[] = $");  //$NON-NLS-1$        
        out.setTag("get",3837,3876);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(39);
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
