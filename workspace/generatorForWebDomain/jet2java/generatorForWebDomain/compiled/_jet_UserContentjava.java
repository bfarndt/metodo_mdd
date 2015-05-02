package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_UserContentjava implements JET2Template {
    private final String templateFile;

    public _jet_UserContentjava(String templateFile) {
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
        out.write("import java.util.Date;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("public class UserContent {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    private long userContentId;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate String entityName;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate long entityId;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate Date date;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate String title;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate String content;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate String name;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate String email;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic long getUserContentId() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn userContentId;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void setUserContentId(long userContentId) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.userContentId = userContentId;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic String getEntityName() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn entityName;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void setEntityName(String entityName) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.entityName = entityName;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic long getEntityId() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn entityId;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void setEntityId(long entityId) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.entityId = entityId;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic Date getDate() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn date;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void setDate(Date date) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.date = date;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic String getTitle() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn title;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void setTitle(String title) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.title = title;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic String getContent() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn content;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void setContent(String content) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.content = content;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic String getName() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn name;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void setName(String name) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.name = name;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic String getEmail() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn email;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void setEmail(String email) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.email = email;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.popTemplateFile();
    }
}
