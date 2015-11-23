package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_editpagejsp implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_editpagejsp(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_15_29 = new TagInfo("c:get", //$NON-NLS-1$
            15, 29,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_20 = new TagInfo("c:get", //$NON-NLS-1$
            18, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@webpath", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_15 = new TagInfo("c:get", //$NON-NLS-1$
            20, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@actionClassFullPath", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_65 = new TagInfo("c:get", //$NON-NLS-1$
            20, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@saveAction", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_28 = new TagInfo("c:get", //$NON-NLS-1$
            21, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_76 = new TagInfo("c:get", //$NON-NLS-1$
            21, 76,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_119 = new TagInfo("c:get", //$NON-NLS-1$
            21, 119,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_22_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            22, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/attributes", //$NON-NLS-1$
                "anAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_23_5 = new TagInfo("c:if", //$NON-NLS-1$
            23, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($anAttribute/@isImageContentType = 'true')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_24_6 = new TagInfo("c:if", //$NON-NLS-1$
            24, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@fieldType = 'TEXT' or $anAttribute/@fieldType = 'INT' or $anAttribute/@fieldType = 'LONG' or $anAttribute/@fieldType = 'REAL'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_31 = new TagInfo("c:get", //$NON-NLS-1$
            25, 31,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@messageKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_26_13 = new TagInfo("c:if", //$NON-NLS-1$
            26, 13,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@fieldSize <= 100", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_24 = new TagInfo("c:get", //$NON-NLS-1$
            28, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_29_21 = new TagInfo("c:if", //$NON-NLS-1$
            29, 21,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@fieldSize = 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_32_21 = new TagInfo("c:if", //$NON-NLS-1$
            32, 21,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@fieldSize <= 50", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_31 = new TagInfo("c:get", //$NON-NLS-1$
            33, 31,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@fieldSize", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_35_21 = new TagInfo("c:if", //$NON-NLS-1$
            35, 21,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@fieldSize > 50", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_30 = new TagInfo("c:get", //$NON-NLS-1$
            38, 30,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_73 = new TagInfo("c:get", //$NON-NLS-1$
            38, 73,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_40_13 = new TagInfo("c:if", //$NON-NLS-1$
            40, 13,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@fieldSize > 100", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_33 = new TagInfo("c:get", //$NON-NLS-1$
            42, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_93 = new TagInfo("c:get", //$NON-NLS-1$
            42, 93,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_136 = new TagInfo("c:get", //$NON-NLS-1$
            42, 136,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_45_9 = new TagInfo("c:if", //$NON-NLS-1$
            45, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@fieldType = 'PASSWORD'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_31 = new TagInfo("c:get", //$NON-NLS-1$
            46, 31,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@messageKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_23 = new TagInfo("c:get", //$NON-NLS-1$
            48, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_20 = new TagInfo("c:get", //$NON-NLS-1$
            49, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@fieldSize", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_23 = new TagInfo("c:get", //$NON-NLS-1$
            50, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_66 = new TagInfo("c:get", //$NON-NLS-1$
            50, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_52_9 = new TagInfo("c:if", //$NON-NLS-1$
            52, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@fieldType = 'CURRENCY'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_31 = new TagInfo("c:get", //$NON-NLS-1$
            53, 31,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@messageKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_38 = new TagInfo("c:get", //$NON-NLS-1$
            54, 38,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_55_13 = new TagInfo("c:if", //$NON-NLS-1$
            55, 13,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@fieldSize = 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_58_13 = new TagInfo("c:if", //$NON-NLS-1$
            58, 13,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@fieldSize <= 50", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_59_23 = new TagInfo("c:get", //$NON-NLS-1$
            59, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@fieldSize", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_61_13 = new TagInfo("c:if", //$NON-NLS-1$
            61, 13,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@fieldSize > 50", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_25 = new TagInfo("c:get", //$NON-NLS-1$
            64, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_68 = new TagInfo("c:get", //$NON-NLS-1$
            64, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_66_9 = new TagInfo("c:if", //$NON-NLS-1$
            66, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@fieldType = 'DATE'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_31 = new TagInfo("c:get", //$NON-NLS-1$
            67, 31,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@messageKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_68_35 = new TagInfo("c:get", //$NON-NLS-1$
            68, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_14 = new TagInfo("c:get", //$NON-NLS-1$
            71, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_72_17 = new TagInfo("c:if", //$NON-NLS-1$
            72, 17,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@fieldType = 'DATE'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_89 = new TagInfo("c:get", //$NON-NLS-1$
            72, 89,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_132 = new TagInfo("c:get", //$NON-NLS-1$
            72, 132,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_72_169 = new TagInfo("c:if", //$NON-NLS-1$
            72, 169,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@fieldType = 'DATE'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_74_9 = new TagInfo("c:if", //$NON-NLS-1$
            74, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@fieldType = 'IMAGE'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_75_31 = new TagInfo("c:get", //$NON-NLS-1$
            75, 31,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@messageKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_77_22 = new TagInfo("c:get", //$NON-NLS-1$
            77, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_77_56 = new TagInfo("c:get", //$NON-NLS-1$
            77, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_78_77 = new TagInfo("c:get", //$NON-NLS-1$
            78, 77,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_78_111 = new TagInfo("c:get", //$NON-NLS-1$
            78, 111,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_81_128 = new TagInfo("c:get", //$NON-NLS-1$
            81, 128,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_81_162 = new TagInfo("c:get", //$NON-NLS-1$
            81, 162,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_86_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            86, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/referenceList", //$NON-NLS-1$
                "aReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_87_19 = new TagInfo("c:get", //$NON-NLS-1$
            87, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/@messageKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_88_28 = new TagInfo("c:get", //$NON-NLS-1$
            88, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_88_70 = new TagInfo("c:get", //$NON-NLS-1$
            88, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_89_14 = new TagInfo("c:get", //$NON-NLS-1$
            89, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_89_57 = new TagInfo("c:get", //$NON-NLS-1$
            89, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_89_94 = new TagInfo("c:get", //$NON-NLS-1$
            89, 94,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/referencedType/@idField", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_91_9 = new TagInfo("c:get", //$NON-NLS-1$
            91, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_92_5 = new TagInfo("c:if", //$NON-NLS-1$
            92, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/@fieldSize = 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_95_5 = new TagInfo("c:if", //$NON-NLS-1$
            95, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/@fieldSize <= 50", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_15 = new TagInfo("c:get", //$NON-NLS-1$
            96, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/@fieldSize", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_98_5 = new TagInfo("c:if", //$NON-NLS-1$
            98, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/@fieldSize > 50", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_101_34 = new TagInfo("c:get", //$NON-NLS-1$
            101, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_101_77 = new TagInfo("c:get", //$NON-NLS-1$
            101, 77,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_103_21 = new TagInfo("c:get", //$NON-NLS-1$
            103, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/referencedType/@actionClassFullPath", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_103_87 = new TagInfo("c:get", //$NON-NLS-1$
            103, 87,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/referencedType/@showAllForSelectionAction", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_104_65 = new TagInfo("c:get", //$NON-NLS-1$
            104, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_105_36 = new TagInfo("c:get", //$NON-NLS-1$
            105, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_106_43 = new TagInfo("c:get", //$NON-NLS-1$
            106, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_113_20 = new TagInfo("c:get", //$NON-NLS-1$
            113, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$theConfiguration/@webpath", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
// elemento tipo JETDirective(org.eclipse.jet.core.parser.ast.JETDirective)
out.jump(36);
        out.write(NL);         
        out.write("<%@ page language=\"java\" contentType=\"text/html; charset=ISO-8859-1\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    pageEncoding=\"ISO-8859-1\"%>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<%@ taglib uri=\"/WEB-INF/tags/myfunctions.tld\" prefix=\"f\"%>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<%@ taglib prefix=\"fmt\" uri=\"http://java.sun.com/jsp/jstl/fmt\" %>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<html>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<head>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/admin.css\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/listStyle/listStyle.css\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/datechooser.css\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<script type=\"text/javascript\" src=\"js/datechooserPor.js\"></script>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<script type=\"text/javascript\" src=\"js/util.js\"></script>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<title>Administrative area: ");  //$NON-NLS-1$        
        out.setTag("get",817,851);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(34);
        RuntimeTagElement _jettag_c_get_15_29 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_29); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_15_29.setRuntimeParent(null);
        _jettag_c_get_15_29.setTagInfo(_td_c_get_15_29);
        _jettag_c_get_15_29.doStart(context, out);
        _jettag_c_get_15_29.doEnd();
        out.setTag(null,-1,-1);
        out.write("</title>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</head>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<body>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<%@ include file=\"/");  //$NON-NLS-1$        
        out.setTag("get",894,939);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(45);
        RuntimeTagElement _jettag_c_get_18_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_20); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_18_20.setRuntimeParent(null);
        _jettag_c_get_18_20.setTagInfo(_td_c_get_18_20);
        _jettag_c_get_18_20.doStart(context, out);
        _jettag_c_get_18_20.doEnd();
        out.setTag(null,-1,-1);
        out.write("/jspf/adminPrefix.jspf\" %>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<form action=\"");  //$NON-NLS-1$        
        out.setTag("get",981,1030);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(49);
        RuntimeTagElement _jettag_c_get_20_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_20_15.setRuntimeParent(null);
        _jettag_c_get_20_15.setTagInfo(_td_c_get_20_15);
        _jettag_c_get_20_15.doStart(context, out);
        _jettag_c_get_20_15.doEnd();
        out.setTag(null,-1,-1);
        out.write(".");  //$NON-NLS-1$        
        out.setTag("get",1031,1071);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(40);
        RuntimeTagElement _jettag_c_get_20_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_65); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_20_65.setRuntimeParent(null);
        _jettag_c_get_20_65.setTagInfo(_td_c_get_20_65);
        _jettag_c_get_20_65.doStart(context, out);
        _jettag_c_get_20_65.doEnd();
        out.setTag(null,-1,-1);
        out.write(".do\" method=\"POST\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<input type=\"hidden\" name=\"");  //$NON-NLS-1$        
        out.setTag("get",1118,1155);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_21_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_28); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_28.setRuntimeParent(null);
        _jettag_c_get_21_28.setTagInfo(_td_c_get_21_28);
        _jettag_c_get_21_28.doStart(context, out);
        _jettag_c_get_21_28.doEnd();
        out.setTag(null,-1,-1);
        out.write("\" value=\"${");  //$NON-NLS-1$        
        out.setTag("get",1166,1208);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(42);
        RuntimeTagElement _jettag_c_get_21_76 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_76); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_76.setRuntimeParent(null);
        _jettag_c_get_21_76.setTagInfo(_td_c_get_21_76);
        _jettag_c_get_21_76.doStart(context, out);
        _jettag_c_get_21_76.doEnd();
        out.setTag(null,-1,-1);
        out.write(".");  //$NON-NLS-1$        
        out.setTag("get",1209,1246);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(37);
        RuntimeTagElement _jettag_c_get_21_119 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_119); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_119.setRuntimeParent(null);
        _jettag_c_get_21_119.setTagInfo(_td_c_get_21_119);
        _jettag_c_get_21_119.doStart(context, out);
        _jettag_c_get_21_119.doEnd();
        out.setTag(null,-1,-1);
        out.write("}\" />");  //$NON-NLS-1$        
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(59);
        out.setTag("iterate",1252,1311);
        RuntimeTagElement _jettag_c_iterate_22_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_22_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_22_1.setRuntimeParent(null);
        _jettag_c_iterate_22_1.setTagInfo(_td_c_iterate_22_1);
        _jettag_c_iterate_22_1.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_22_1.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_22_1.getTagInfo().getAttribute("delimiter"),1252,1311);
            out.loopIterate();
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(60);
            out.setTag("if",1316,1376);
            RuntimeTagElement _jettag_c_if_23_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_23_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_23_5.setRuntimeParent(_jettag_c_iterate_22_1);
            _jettag_c_if_23_5.setTagInfo(_td_c_if_23_5);
            _jettag_c_if_23_5.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_23_5.okToProcessBody()) {
                out.write(NL);         
                out.write("    \t");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(153);
                out.setTag("if",1382,1535);
                RuntimeTagElement _jettag_c_if_24_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_24_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_24_6.setRuntimeParent(_jettag_c_if_23_5);
                _jettag_c_if_24_6.setTagInfo(_td_c_if_24_6);
                _jettag_c_if_24_6.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_24_6.okToProcessBody()) {
                    out.write(NL);         
                    out.write("            <fmt:message key=\"");  //$NON-NLS-1$        
                    out.setTag("get",1566,1609);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(43);
                    RuntimeTagElement _jettag_c_get_25_31 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_31); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_25_31.setRuntimeParent(_jettag_c_if_24_6);
                    _jettag_c_get_25_31.setTagInfo(_td_c_get_25_31);
                    _jettag_c_get_25_31.doStart(context, out);
                    _jettag_c_get_25_31.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\" />:");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(44);
                    out.setTag("if",1627,1671);
                    RuntimeTagElement _jettag_c_if_26_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_26_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_26_13.setRuntimeParent(_jettag_c_if_24_6);
                    _jettag_c_if_26_13.setTagInfo(_td_c_if_26_13);
                    _jettag_c_if_26_13.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_c_if_26_13.okToProcessBody()) {
                        out.write(NL);         
                        out.write("                <input type=\"text\"");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("    \t            name=\"");  //$NON-NLS-1$        
                        out.setTag("get",1730,1767);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(37);
                        RuntimeTagElement _jettag_c_get_28_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_24); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_28_24.setRuntimeParent(_jettag_c_if_26_13);
                        _jettag_c_get_28_24.setTagInfo(_td_c_get_28_24);
                        _jettag_c_get_28_24.doStart(context, out);
                        _jettag_c_get_28_24.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("\"");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("                    ");  //$NON-NLS-1$        
                // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
                out.jump(41);
                        out.setTag("if",1789,1830);
                        RuntimeTagElement _jettag_c_if_29_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_29_21); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_29_21.setRuntimeParent(_jettag_c_if_26_13);
                        _jettag_c_if_29_21.setTagInfo(_td_c_if_29_21);
                        _jettag_c_if_29_21.doStart(context, out);
                        out.setTag(null,-1,-1);
                        while (_jettag_c_if_29_21.okToProcessBody()) {
                            out.write(NL);         
                            out.write("                        size=\"10\"");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("                    ");  //$NON-NLS-1$        
                out.bodyContentStart();
                            _jettag_c_if_29_21.handleBodyContent(out);
                        }
                out.bodyContentEnd();
                        _jettag_c_if_29_21.doEnd();
                        out.endTag("if",55);
                // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
                out.jump(7);
                        out.write(NL);         
                        out.write("                    ");  //$NON-NLS-1$        
                // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
                out.jump(43);
                        out.setTag("if",1913,1956);
                        RuntimeTagElement _jettag_c_if_32_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_32_21); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_32_21.setRuntimeParent(_jettag_c_if_26_13);
                        _jettag_c_if_32_21.setTagInfo(_td_c_if_32_21);
                        _jettag_c_if_32_21.doStart(context, out);
                        out.setTag(null,-1,-1);
                        while (_jettag_c_if_32_21.okToProcessBody()) {
                            out.write(NL);         
                            out.write("                        size=\"");  //$NON-NLS-1$        
                            out.setTag("get",1987,2029);
                    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                    out.jump(42);
                            RuntimeTagElement _jettag_c_get_33_31 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_31); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_33_31.setRuntimeParent(_jettag_c_if_32_21);
                            _jettag_c_get_33_31.setTagInfo(_td_c_get_33_31);
                            _jettag_c_get_33_31.doStart(context, out);
                            _jettag_c_get_33_31.doEnd();
                            out.setTag(null,-1,-1);
                            out.write("\"");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("                    ");  //$NON-NLS-1$        
                out.bodyContentStart();
                            _jettag_c_if_32_21.handleBodyContent(out);
                        }
                out.bodyContentEnd();
                        _jettag_c_if_32_21.doEnd();
                        out.endTag("if",95);
                // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
                out.jump(7);
                        out.write(NL);         
                        out.write("                    ");  //$NON-NLS-1$        
                // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
                out.jump(42);
                        out.setTag("if",2079,2121);
                        RuntimeTagElement _jettag_c_if_35_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_35_21); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_35_21.setRuntimeParent(_jettag_c_if_26_13);
                        _jettag_c_if_35_21.setTagInfo(_td_c_if_35_21);
                        _jettag_c_if_35_21.doStart(context, out);
                        out.setTag(null,-1,-1);
                        while (_jettag_c_if_35_21.okToProcessBody()) {
                            out.write(NL);         
                            out.write("                        size=\"50\"");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t               ");  //$NON-NLS-1$        
                out.bodyContentStart();
                            _jettag_c_if_35_21.handleBodyContent(out);
                        }
                out.bodyContentEnd();
                        _jettag_c_if_35_21.doEnd();
                        out.endTag("if",51);
                // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
                out.jump(7);
                        out.write(NL);         
                        out.write("    \t               value=\"${");  //$NON-NLS-1$        
                        out.setTag("get",2209,2251);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(42);
                        RuntimeTagElement _jettag_c_get_38_30 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_30); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_38_30.setRuntimeParent(_jettag_c_if_26_13);
                        _jettag_c_get_38_30.setTagInfo(_td_c_get_38_30);
                        _jettag_c_get_38_30.doStart(context, out);
                        _jettag_c_get_38_30.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(".");  //$NON-NLS-1$        
                        out.setTag("get",2252,2289);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(37);
                        RuntimeTagElement _jettag_c_get_38_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_73); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_38_73.setRuntimeParent(_jettag_c_if_26_13);
                        _jettag_c_get_38_73.setTagInfo(_td_c_get_38_73);
                        _jettag_c_get_38_73.doStart(context, out);
                        _jettag_c_get_38_73.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("}\" /><br/>");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("            ");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_if_26_13.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_if_26_13.doEnd();
                    out.endTag("if",641);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(43);
                    out.setTag("if",2332,2375);
                    RuntimeTagElement _jettag_c_if_40_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_40_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_40_13.setRuntimeParent(_jettag_c_if_24_6);
                    _jettag_c_if_40_13.setTagInfo(_td_c_if_40_13);
                    _jettag_c_if_40_13.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_c_if_40_13.okToProcessBody()) {
                        out.write(NL);         
                        out.write("                <br/>");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("                <textarea name=\"");  //$NON-NLS-1$        
                        out.setTag("get",2430,2467);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(37);
                        RuntimeTagElement _jettag_c_get_42_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_33); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_42_33.setRuntimeParent(_jettag_c_if_40_13);
                        _jettag_c_get_42_33.setTagInfo(_td_c_get_42_33);
                        _jettag_c_get_42_33.doStart(context, out);
                        _jettag_c_get_42_33.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("\" cols=\"50\" rows=\"5\">${");  //$NON-NLS-1$        
                        out.setTag("get",2490,2532);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(42);
                        RuntimeTagElement _jettag_c_get_42_93 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_93); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_42_93.setRuntimeParent(_jettag_c_if_40_13);
                        _jettag_c_get_42_93.setTagInfo(_td_c_get_42_93);
                        _jettag_c_get_42_93.doStart(context, out);
                        _jettag_c_get_42_93.doEnd();
                        out.setTag(null,-1,-1);
                        out.write(".");  //$NON-NLS-1$        
                        out.setTag("get",2533,2570);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(37);
                        RuntimeTagElement _jettag_c_get_42_136 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_136); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_42_136.setRuntimeParent(_jettag_c_if_40_13);
                        _jettag_c_get_42_136.setTagInfo(_td_c_get_42_136);
                        _jettag_c_get_42_136.doStart(context, out);
                        _jettag_c_get_42_136.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("}</textarea><br/>");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("            ");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_if_40_13.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_if_40_13.doEnd();
                    out.endTag("if",225);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
                    out.write(NL);         
                    out.write("        ");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_24_6.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_24_6.doEnd();
                out.endTag("if",1081);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(50);
                out.setTag("if",2632,2682);
                RuntimeTagElement _jettag_c_if_45_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_45_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_45_9.setRuntimeParent(_jettag_c_if_23_5);
                _jettag_c_if_45_9.setTagInfo(_td_c_if_45_9);
                _jettag_c_if_45_9.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_45_9.okToProcessBody()) {
                    out.write(NL);         
                    out.write("            <fmt:message key=\"");  //$NON-NLS-1$        
                    out.setTag("get",2713,2756);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(43);
                    RuntimeTagElement _jettag_c_get_46_31 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_31); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_46_31.setRuntimeParent(_jettag_c_if_45_9);
                    _jettag_c_get_46_31.setTagInfo(_td_c_get_46_31);
                    _jettag_c_get_46_31.doStart(context, out);
                    _jettag_c_get_46_31.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\" />:");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("            <input type=\"password\"");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("                name=\"");  //$NON-NLS-1$        
                    out.setTag("get",2819,2856);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(37);
                    RuntimeTagElement _jettag_c_get_48_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_23); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_48_23.setRuntimeParent(_jettag_c_if_45_9);
                    _jettag_c_get_48_23.setTagInfo(_td_c_get_48_23);
                    _jettag_c_get_48_23.doStart(context, out);
                    _jettag_c_get_48_23.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\"");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t            size=\"");  //$NON-NLS-1$        
                    out.setTag("get",2877,2919);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(42);
                    RuntimeTagElement _jettag_c_get_49_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_20); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_49_20.setRuntimeParent(_jettag_c_if_45_9);
                    _jettag_c_get_49_20.setTagInfo(_td_c_get_49_20);
                    _jettag_c_get_49_20.doStart(context, out);
                    _jettag_c_get_49_20.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\"");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t            value=\"${");  //$NON-NLS-1$        
                    out.setTag("get",2943,2985);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(42);
                    RuntimeTagElement _jettag_c_get_50_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_23); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_50_23.setRuntimeParent(_jettag_c_if_45_9);
                    _jettag_c_get_50_23.setTagInfo(_td_c_get_50_23);
                    _jettag_c_get_50_23.doStart(context, out);
                    _jettag_c_get_50_23.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",2986,3023);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(37);
                    RuntimeTagElement _jettag_c_get_50_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_66); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_50_66.setRuntimeParent(_jettag_c_if_45_9);
                    _jettag_c_get_50_66.setTagInfo(_td_c_get_50_66);
                    _jettag_c_get_50_66.doStart(context, out);
                    _jettag_c_get_50_66.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("}\" /><br/>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("        ");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_45_9.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_45_9.doEnd();
                out.endTag("if",360);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(50);
                out.setTag("if",3058,3108);
                RuntimeTagElement _jettag_c_if_52_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_52_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_52_9.setRuntimeParent(_jettag_c_if_23_5);
                _jettag_c_if_52_9.setTagInfo(_td_c_if_52_9);
                _jettag_c_if_52_9.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_52_9.okToProcessBody()) {
                    out.write(NL);         
                    out.write("            <fmt:message key=\"");  //$NON-NLS-1$        
                    out.setTag("get",3139,3182);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(43);
                    RuntimeTagElement _jettag_c_get_53_31 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_31); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_53_31.setRuntimeParent(_jettag_c_if_52_9);
                    _jettag_c_get_53_31.setTagInfo(_td_c_get_53_31);
                    _jettag_c_get_53_31.doStart(context, out);
                    _jettag_c_get_53_31.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\" />:");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("            <input type=\"text\" name=\"");  //$NON-NLS-1$        
                    out.setTag("get",3225,3262);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(37);
                    RuntimeTagElement _jettag_c_get_54_38 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_54_38); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_54_38.setRuntimeParent(_jettag_c_if_52_9);
                    _jettag_c_get_54_38.setTagInfo(_td_c_get_54_38);
                    _jettag_c_get_54_38.doStart(context, out);
                    _jettag_c_get_54_38.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\"");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(41);
                    out.setTag("if",3276,3317);
                    RuntimeTagElement _jettag_c_if_55_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_55_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_55_13.setRuntimeParent(_jettag_c_if_52_9);
                    _jettag_c_if_55_13.setTagInfo(_td_c_if_55_13);
                    _jettag_c_if_55_13.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_c_if_55_13.okToProcessBody()) {
                        out.write(NL);         
                        out.write("                size=\"10\"");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("            ");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_if_55_13.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_if_55_13.doEnd();
                    out.endTag("if",39);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(43);
                    out.setTag("if",3376,3419);
                    RuntimeTagElement _jettag_c_if_58_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_58_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_58_13.setRuntimeParent(_jettag_c_if_52_9);
                    _jettag_c_if_58_13.setTagInfo(_td_c_if_58_13);
                    _jettag_c_if_58_13.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_c_if_58_13.okToProcessBody()) {
                        out.write(NL);         
                        out.write("                size=\"");  //$NON-NLS-1$        
                        out.setTag("get",3442,3484);
                // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
                out.jump(42);
                        RuntimeTagElement _jettag_c_get_59_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_59_23); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_59_23.setRuntimeParent(_jettag_c_if_58_13);
                        _jettag_c_get_59_23.setTagInfo(_td_c_get_59_23);
                        _jettag_c_get_59_23.doStart(context, out);
                        _jettag_c_get_59_23.doEnd();
                        out.setTag(null,-1,-1);
                        out.write("\"");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("            ");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_if_58_13.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_if_58_13.doEnd();
                    out.endTag("if",79);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(42);
                    out.setTag("if",3518,3560);
                    RuntimeTagElement _jettag_c_if_61_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_61_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_61_13.setRuntimeParent(_jettag_c_if_52_9);
                    _jettag_c_if_61_13.setTagInfo(_td_c_if_61_13);
                    _jettag_c_if_61_13.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_c_if_61_13.okToProcessBody()) {
                        out.write(NL);         
                        out.write("                size=\"50\"");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("           ");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_if_61_13.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_if_61_13.doEnd();
                    out.endTag("if",38);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
                    out.write(NL);         
                    out.write("               value=\"${");  //$NON-NLS-1$        
                    out.setTag("get",3630,3672);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(42);
                    RuntimeTagElement _jettag_c_get_64_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_25); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_64_25.setRuntimeParent(_jettag_c_if_52_9);
                    _jettag_c_get_64_25.setTagInfo(_td_c_get_64_25);
                    _jettag_c_get_64_25.doStart(context, out);
                    _jettag_c_get_64_25.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",3673,3710);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(37);
                    RuntimeTagElement _jettag_c_get_64_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_68); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_64_68.setRuntimeParent(_jettag_c_if_52_9);
                    _jettag_c_get_64_68.setTagInfo(_td_c_get_64_68);
                    _jettag_c_get_64_68.doStart(context, out);
                    _jettag_c_get_64_68.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("}\" /><br/>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("        ");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_52_9.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_52_9.doEnd();
                out.endTag("if",621);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(46);
                out.setTag("if",3745,3791);
                RuntimeTagElement _jettag_c_if_66_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_66_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_66_9.setRuntimeParent(_jettag_c_if_23_5);
                _jettag_c_if_66_9.setTagInfo(_td_c_if_66_9);
                _jettag_c_if_66_9.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_66_9.okToProcessBody()) {
                    out.write(NL);         
                    out.write("            <fmt:message key=\"");  //$NON-NLS-1$        
                    out.setTag("get",3822,3865);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(43);
                    RuntimeTagElement _jettag_c_get_67_31 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_31); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_67_31.setRuntimeParent(_jettag_c_if_66_9);
                    _jettag_c_get_67_31.setTagInfo(_td_c_get_67_31);
                    _jettag_c_get_67_31.doStart(context, out);
                    _jettag_c_get_67_31.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\" />:");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("            <input id=\"datechooser");  //$NON-NLS-1$        
                    out.setTag("get",3905,3942);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(37);
                    RuntimeTagElement _jettag_c_get_68_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_68_35); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_68_35.setRuntimeParent(_jettag_c_if_66_9);
                    _jettag_c_get_68_35.setTagInfo(_td_c_get_68_35);
                    _jettag_c_get_68_35.doStart(context, out);
                    _jettag_c_get_68_35.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\"");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t class=\"datechooser dc-dateformat='j/n/Y' dc-iconlink='${contextPath}css/datechooser.png'\"");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t type=\"text\"");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t name=\"");  //$NON-NLS-1$        
                    out.setTag("get",4073,4110);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(37);
                    RuntimeTagElement _jettag_c_get_71_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_14); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_71_14.setRuntimeParent(_jettag_c_if_66_9);
                    _jettag_c_get_71_14.setTagInfo(_td_c_get_71_14);
                    _jettag_c_get_71_14.doStart(context, out);
                    _jettag_c_get_71_14.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\"");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t value=\"${");  //$NON-NLS-1$        
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(46);
                    out.setTag("if",4128,4174);
                    RuntimeTagElement _jettag_c_if_72_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_72_17); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_72_17.setRuntimeParent(_jettag_c_if_66_9);
                    _jettag_c_if_72_17.setTagInfo(_td_c_if_72_17);
                    _jettag_c_if_72_17.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_c_if_72_17.okToProcessBody()) {
                        out.write("f:formatSimpleDate(");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_if_72_17.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_if_72_17.doEnd();
                    out.endTag("if",19);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
                    out.setTag("get",4200,4242);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(42);
                    RuntimeTagElement _jettag_c_get_72_89 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_89); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_72_89.setRuntimeParent(_jettag_c_if_66_9);
                    _jettag_c_get_72_89.setTagInfo(_td_c_get_72_89);
                    _jettag_c_get_72_89.doStart(context, out);
                    _jettag_c_get_72_89.doEnd();
                    out.setTag(null,-1,-1);
                    out.write(".");  //$NON-NLS-1$        
                    out.setTag("get",4243,4280);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(37);
                    RuntimeTagElement _jettag_c_get_72_132 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_132); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_72_132.setRuntimeParent(_jettag_c_if_66_9);
                    _jettag_c_get_72_132.setTagInfo(_td_c_get_72_132);
                    _jettag_c_get_72_132.doStart(context, out);
                    _jettag_c_get_72_132.doEnd();
                    out.setTag(null,-1,-1);
            // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
            out.jump(46);
                    out.setTag("if",4280,4326);
                    RuntimeTagElement _jettag_c_if_72_169 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_72_169); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_72_169.setRuntimeParent(_jettag_c_if_66_9);
                    _jettag_c_if_72_169.setTagInfo(_td_c_if_72_169);
                    _jettag_c_if_72_169.doStart(context, out);
                    out.setTag(null,-1,-1);
                    while (_jettag_c_if_72_169.okToProcessBody()) {
                        out.write(")");  //$NON-NLS-1$        
            out.bodyContentStart();
                        _jettag_c_if_72_169.handleBodyContent(out);
                    }
            out.bodyContentEnd();
                    _jettag_c_if_72_169.doEnd();
                    out.endTag("if",1);
            // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
            out.jump(7);
                    out.write("}\" /><br/>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("        ");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_66_9.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_66_9.doEnd();
                out.endTag("if",562);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
        // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
        out.jump(47);
                out.setTag("if",4369,4416);
                RuntimeTagElement _jettag_c_if_74_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_74_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_74_9.setRuntimeParent(_jettag_c_if_23_5);
                _jettag_c_if_74_9.setTagInfo(_td_c_if_74_9);
                _jettag_c_if_74_9.doStart(context, out);
                out.setTag(null,-1,-1);
                while (_jettag_c_if_74_9.okToProcessBody()) {
                    out.write(NL);         
                    out.write("            <fmt:message key=\"");  //$NON-NLS-1$        
                    out.setTag("get",4447,4490);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(43);
                    RuntimeTagElement _jettag_c_get_75_31 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_75_31); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_75_31.setRuntimeParent(_jettag_c_if_74_9);
                    _jettag_c_get_75_31.setTagInfo(_td_c_get_75_31);
                    _jettag_c_get_75_31.doStart(context, out);
                    _jettag_c_get_75_31.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\" />:");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("            <br/>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("            <img id=\"");  //$NON-NLS-1$        
                    out.setTag("get",4535,4569);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(34);
                    RuntimeTagElement _jettag_c_get_77_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_77_22); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_77_22.setRuntimeParent(_jettag_c_if_74_9);
                    _jettag_c_get_77_22.setTagInfo(_td_c_get_77_22);
                    _jettag_c_get_77_22.doStart(context, out);
                    _jettag_c_get_77_22.doEnd();
                    out.setTag(null,-1,-1);
                    out.setTag("get",4569,4606);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(37);
                    RuntimeTagElement _jettag_c_get_77_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_77_56); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_77_56.setRuntimeParent(_jettag_c_if_74_9);
                    _jettag_c_get_77_56.setTagInfo(_td_c_get_77_56);
                    _jettag_c_get_77_56.doStart(context, out);
                    _jettag_c_get_77_56.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\"");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("                src=\"core.actions.CommonActions.showSessionImage.do?imageId=");  //$NON-NLS-1$        
                    out.setTag("get",4684,4718);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(34);
                    RuntimeTagElement _jettag_c_get_78_77 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_78_77); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_78_77.setRuntimeParent(_jettag_c_if_74_9);
                    _jettag_c_get_78_77.setTagInfo(_td_c_get_78_77);
                    _jettag_c_get_78_77.doStart(context, out);
                    _jettag_c_get_78_77.doEnd();
                    out.setTag(null,-1,-1);
                    out.setTag("get",4718,4755);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(37);
                    RuntimeTagElement _jettag_c_get_78_111 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_78_111); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_78_111.setRuntimeParent(_jettag_c_if_74_9);
                    _jettag_c_get_78_111.setTagInfo(_td_c_get_78_111);
                    _jettag_c_get_78_111.doStart(context, out);
                    _jettag_c_get_78_111.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("\"");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("                width=\"100\" height=\"100\" />");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("            <br/>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("            <input type=\"button\" value=\"<fmt:message key=\"selectButton\" />\" onclick=\"popup('popups/uploadImageForm.jsp?imageId=");  //$NON-NLS-1$        
                    out.setTag("get",4946,4980);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(34);
                    RuntimeTagElement _jettag_c_get_81_128 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_81_128); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_81_128.setRuntimeParent(_jettag_c_if_74_9);
                    _jettag_c_get_81_128.setTagInfo(_td_c_get_81_128);
                    _jettag_c_get_81_128.doStart(context, out);
                    _jettag_c_get_81_128.doEnd();
                    out.setTag(null,-1,-1);
                    out.setTag("get",4980,5017);
            // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
            out.jump(37);
                    RuntimeTagElement _jettag_c_get_81_162 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_81_162); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_81_162.setRuntimeParent(_jettag_c_if_74_9);
                    _jettag_c_get_81_162.setTagInfo(_td_c_get_81_162);
                    _jettag_c_get_81_162.doStart(context, out);
                    _jettag_c_get_81_162.doEnd();
                    out.setTag(null,-1,-1);
                    out.write("')\" /><br/>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("        ");  //$NON-NLS-1$        
        out.bodyContentStart();
                    _jettag_c_if_74_9.handleBodyContent(out);
                }
        out.bodyContentEnd();
                _jettag_c_if_74_9.doEnd();
                out.endTag("if",621);
        // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
        out.jump(7);
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_23_5.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_23_5.doEnd();
            out.endTag("if",3673);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_iterate_22_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_22_1.doEnd();
        out.loopEnd();
        out.endTag("iterate",3746);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(61);
        out.setTag("iterate",5071,5132);
        RuntimeTagElement _jettag_c_iterate_86_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_86_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_86_1.setRuntimeParent(null);
        _jettag_c_iterate_86_1.setTagInfo(_td_c_iterate_86_1);
        _jettag_c_iterate_86_1.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_86_1.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_86_1.getTagInfo().getAttribute("delimiter"),5071,5132);
            out.loopIterate();
            out.write(NL);         
            out.write("<fmt:message key=\"");  //$NON-NLS-1$        
            out.setTag("get",5151,5193);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(42);
            RuntimeTagElement _jettag_c_get_87_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_87_19); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_87_19.setRuntimeParent(_jettag_c_iterate_86_1);
            _jettag_c_get_87_19.setTagInfo(_td_c_get_87_19);
            _jettag_c_get_87_19.doStart(context, out);
            _jettag_c_get_87_19.doEnd();
            out.setTag(null,-1,-1);
            out.write("\" />:");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("<input type=\"hidden\" name=\"");  //$NON-NLS-1$        
            out.setTag("get",5226,5262);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(36);
            RuntimeTagElement _jettag_c_get_88_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_88_28); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_88_28.setRuntimeParent(_jettag_c_iterate_86_1);
            _jettag_c_get_88_28.setTagInfo(_td_c_get_88_28);
            _jettag_c_get_88_28.doStart(context, out);
            _jettag_c_get_88_28.doEnd();
            out.setTag(null,-1,-1);
            out.write("\" id=\"");  //$NON-NLS-1$        
            out.setTag("get",5268,5304);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(36);
            RuntimeTagElement _jettag_c_get_88_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_88_70); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_88_70.setRuntimeParent(_jettag_c_iterate_86_1);
            _jettag_c_get_88_70.setTagInfo(_td_c_get_88_70);
            _jettag_c_get_88_70.doStart(context, out);
            _jettag_c_get_88_70.doEnd();
            out.setTag(null,-1,-1);
            out.write("\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    value=\"${");  //$NON-NLS-1$        
            out.setTag("get",5319,5361);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(42);
            RuntimeTagElement _jettag_c_get_89_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_89_14); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_89_14.setRuntimeParent(_jettag_c_iterate_86_1);
            _jettag_c_get_89_14.setTagInfo(_td_c_get_89_14);
            _jettag_c_get_89_14.doStart(context, out);
            _jettag_c_get_89_14.doEnd();
            out.setTag(null,-1,-1);
            out.write(".");  //$NON-NLS-1$        
            out.setTag("get",5362,5398);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(36);
            RuntimeTagElement _jettag_c_get_89_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_89_57); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_89_57.setRuntimeParent(_jettag_c_iterate_86_1);
            _jettag_c_get_89_57.setTagInfo(_td_c_get_89_57);
            _jettag_c_get_89_57.doStart(context, out);
            _jettag_c_get_89_57.doEnd();
            out.setTag(null,-1,-1);
            out.write(".");  //$NON-NLS-1$        
            out.setTag("get",5399,5453);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(54);
            RuntimeTagElement _jettag_c_get_89_94 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_89_94); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_89_94.setRuntimeParent(_jettag_c_iterate_86_1);
            _jettag_c_get_89_94.setTagInfo(_td_c_get_89_94);
            _jettag_c_get_89_94.doStart(context, out);
            _jettag_c_get_89_94.doEnd();
            out.setTag(null,-1,-1);
            out.write("}\" /> ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("<input type=\"text\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    id=\"");  //$NON-NLS-1$        
            out.setTag("get",5487,5523);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(36);
            RuntimeTagElement _jettag_c_get_91_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_91_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_91_9.setRuntimeParent(_jettag_c_iterate_86_1);
            _jettag_c_get_91_9.setTagInfo(_td_c_get_91_9);
            _jettag_c_get_91_9.doStart(context, out);
            _jettag_c_get_91_9.doEnd();
            out.setTag(null,-1,-1);
            out.write("Summary\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(40);
            out.setTag("if",5536,5576);
            RuntimeTagElement _jettag_c_if_92_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_92_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_92_5.setRuntimeParent(_jettag_c_iterate_86_1);
            _jettag_c_if_92_5.setTagInfo(_td_c_if_92_5);
            _jettag_c_if_92_5.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_92_5.okToProcessBody()) {
                out.write(NL);         
                out.write("    size=\"10\"");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_92_5.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_92_5.doEnd();
            out.endTag("if",19);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(42);
            out.setTag("if",5607,5649);
            RuntimeTagElement _jettag_c_if_95_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_95_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_95_5.setRuntimeParent(_jettag_c_iterate_86_1);
            _jettag_c_if_95_5.setTagInfo(_td_c_if_95_5);
            _jettag_c_if_95_5.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_95_5.okToProcessBody()) {
                out.write(NL);         
                out.write("        size=\"");  //$NON-NLS-1$        
                out.setTag("get",5664,5705);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(41);
                RuntimeTagElement _jettag_c_get_96_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_96_15.setRuntimeParent(_jettag_c_if_95_5);
                _jettag_c_get_96_15.setTagInfo(_td_c_get_96_15);
                _jettag_c_get_96_15.doStart(context, out);
                _jettag_c_get_96_15.doEnd();
                out.setTag(null,-1,-1);
                out.write("\"");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_95_5.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_95_5.doEnd();
            out.endTag("if",62);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(41);
            out.setTag("if",5723,5764);
            RuntimeTagElement _jettag_c_if_98_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_98_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_98_5.setRuntimeParent(_jettag_c_iterate_86_1);
            _jettag_c_if_98_5.setTagInfo(_td_c_if_98_5);
            _jettag_c_if_98_5.doStart(context, out);
            out.setTag(null,-1,-1);
            while (_jettag_c_if_98_5.okToProcessBody()) {
                out.write(NL);         
                out.write("        size=\"50\"");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
    out.bodyContentStart();
                _jettag_c_if_98_5.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_if_98_5.doEnd();
            out.endTag("if",23);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(7);
            out.write(NL);         
            out.write("    disabled=\"disabled\" value=\"${");  //$NON-NLS-1$        
            out.setTag("get",5828,5870);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(42);
            RuntimeTagElement _jettag_c_get_101_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_101_34); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_101_34.setRuntimeParent(_jettag_c_iterate_86_1);
            _jettag_c_get_101_34.setTagInfo(_td_c_get_101_34);
            _jettag_c_get_101_34.doStart(context, out);
            _jettag_c_get_101_34.doEnd();
            out.setTag(null,-1,-1);
            out.write(".");  //$NON-NLS-1$        
            out.setTag("get",5871,5907);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(36);
            RuntimeTagElement _jettag_c_get_101_77 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_101_77); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_101_77.setRuntimeParent(_jettag_c_iterate_86_1);
            _jettag_c_get_101_77.setTagInfo(_td_c_get_101_77);
            _jettag_c_get_101_77.doStart(context, out);
            _jettag_c_get_101_77.doEnd();
            out.setTag(null,-1,-1);
            out.write(".summary}\" /> <input");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    type=\"button\" value=\"<fmt:message key=\"selectButton\" />\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    onclick=\"popup('");  //$NON-NLS-1$        
            out.setTag("get",6009,6074);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(65);
            RuntimeTagElement _jettag_c_get_103_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_103_21); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_103_21.setRuntimeParent(_jettag_c_iterate_86_1);
            _jettag_c_get_103_21.setTagInfo(_td_c_get_103_21);
            _jettag_c_get_103_21.doStart(context, out);
            _jettag_c_get_103_21.doEnd();
            out.setTag(null,-1,-1);
            out.write(".");  //$NON-NLS-1$        
            out.setTag("get",6075,6146);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(71);
            RuntimeTagElement _jettag_c_get_103_87 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_103_87); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_103_87.setRuntimeParent(_jettag_c_iterate_86_1);
            _jettag_c_get_103_87.setTagInfo(_td_c_get_103_87);
            _jettag_c_get_103_87.doStart(context, out);
            _jettag_c_get_103_87.doEnd();
            out.setTag(null,-1,-1);
            out.write(".do' +");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("                   '?selectedSummary='+document.getElementById('");  //$NON-NLS-1$        
            out.setTag("get",6217,6253);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(36);
            RuntimeTagElement _jettag_c_get_104_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_104_65); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_104_65.setRuntimeParent(_jettag_c_iterate_86_1);
            _jettag_c_get_104_65.setTagInfo(_td_c_get_104_65);
            _jettag_c_get_104_65.doStart(context, out);
            _jettag_c_get_104_65.doEnd();
            out.setTag(null,-1,-1);
            out.write("Summary').value +");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("                   '&openerFieldId=");  //$NON-NLS-1$        
            out.setTag("get",6306,6342);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(36);
            RuntimeTagElement _jettag_c_get_105_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_105_36); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_105_36.setRuntimeParent(_jettag_c_iterate_86_1);
            _jettag_c_get_105_36.setTagInfo(_td_c_get_105_36);
            _jettag_c_get_105_36.doStart(context, out);
            _jettag_c_get_105_36.doEnd();
            out.setTag(null,-1,-1);
            out.write("' +");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("                   '&openerFieldSummaryId=");  //$NON-NLS-1$        
            out.setTag("get",6388,6424);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(36);
            RuntimeTagElement _jettag_c_get_106_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_106_43); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_106_43.setRuntimeParent(_jettag_c_iterate_86_1);
            _jettag_c_get_106_43.setTagInfo(_td_c_get_106_43);
            _jettag_c_get_106_43.doStart(context, out);
            _jettag_c_get_106_43.doEnd();
            out.setTag(null,-1,-1);
            out.write("Summary');\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("<br />");  //$NON-NLS-1$        
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_iterate_86_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_86_1.doEnd();
        out.loopEnd();
        out.endTag("iterate",1314);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write("    <br/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <input type=\"submit\" value=\"<fmt:message key=\"saveButton\" />\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</form> ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<%@ include file=\"/");  //$NON-NLS-1$        
        out.setTag("get",6567,6612);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(45);
        RuntimeTagElement _jettag_c_get_113_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_113_20); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_113_20.setRuntimeParent(null);
        _jettag_c_get_113_20.setTagInfo(_td_c_get_113_20);
        _jettag_c_get_113_20.doStart(context, out);
        _jettag_c_get_113_20.doEnd();
        out.setTag(null,-1,-1);
        out.write("/jspf/adminSuffix.jspf\" %>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("</body>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</html>");  //$NON-NLS-1$        
        out.popTemplateFile();
    }
}
