package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_DerbyUserContentDAOFactoryjava implements JET2Template {
    private final String templateFile;

    public _jet_DerbyUserContentDAOFactoryjava(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        out.write("package generated.usercontent.derby;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import core.database.ConnectionProvider;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import generated.usercontent.UserContentDAO;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import generated.usercontent.UserContentDAOAbstractFactory;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("public class DerbyUserContentDAOFactory extends UserContentDAOAbstractFactory {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ConnectionProvider connectionProvider;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public DerbyUserContentDAOFactory(ConnectionProvider connectionProvider) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.connectionProvider = connectionProvider;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t@Override");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic UserContentDAO getUserContentDAO() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        UserContentDAO dao = new DerbyUserContentDAO();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        dao.setConnectionProvider(connectionProvider);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        return dao;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.popTemplateFile();
    }
}
