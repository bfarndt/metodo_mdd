package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_DefaultUserContentDAOFactoryProviderjava implements JET2Template {
    private final String templateFile;

    public _jet_DefaultUserContentDAOFactoryProviderjava(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        out.write("package generated.usercontent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import core.database.ConnectionProvider;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import generated.usercontent.derby.DerbyUserContentDAOFactory;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("public class DefaultUserContentDAOFactoryProvider {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    private static UserContentDAOAbstractFactory theInstance = null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public static UserContentDAOAbstractFactory getDefaultDAOFactoryInstance() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if(theInstance == null)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            theInstance = new DerbyUserContentDAOFactory(new ConnectionProvider(ConnectionProvider.DERBY));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        return theInstance;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.popTemplateFile();
    }
}
