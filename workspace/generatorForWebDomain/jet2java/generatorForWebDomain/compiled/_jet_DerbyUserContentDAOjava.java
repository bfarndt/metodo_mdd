package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_DerbyUserContentDAOjava implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_DerbyUserContentDAOjava(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_if_21_10 = new TagInfo("c:if", //$NON-NLS-1$
            21, 10,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$featuresModel/WebDomainFeatures/@moderation = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_67_10 = new TagInfo("c:if", //$NON-NLS-1$
            67, 10,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$featuresModel/WebDomainFeatures/@moderation = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_70_10 = new TagInfo("c:if", //$NON-NLS-1$
            70, 10,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$featuresModel/WebDomainFeatures/@moderation != 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_95_1 = new TagInfo("c:if", //$NON-NLS-1$
            95, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$featuresModel/WebDomainFeatures/@moderation = 'true'", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        out.write("package generated.usercontent.derby;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import java.sql.Connection;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.sql.PreparedStatement;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.sql.ResultSet;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.sql.SQLException;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.util.ArrayList;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.util.Date;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.util.List;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import generated.usercontent.UserContent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import generated.usercontent.UserContentDAO;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("public class DerbyUserContentDAO extends UserContentDAO {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t@Override");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic List<UserContent> getAllUserContent(String entityName, long entityId) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        Connection conn = getConnection();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        try {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            String query = \"SELECT userContentId, date, title, content, name, email from UserContent WHERE entityName = ? AND entityId = ?\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        \t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(67);
        out.setTag("if",678,745);
        RuntimeTagElement _jettag_c_if_21_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_21_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_21_10.setRuntimeParent(null);
        _jettag_c_if_21_10.setTagInfo(_td_c_if_21_10);
        _jettag_c_if_21_10.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_c_if_21_10.okToProcessBody()) {
            out.write(NL);         
            out.write("            query += \" AND approved='Y'\";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            ");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_if_21_10.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_if_21_10.doEnd();
        out.endTag("if",55);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(NL);         
        out.write("        ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            PreparedStatement ps = conn.prepareStatement(query);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ps.setString(1, entityName);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ps.setLong(2, entityId);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ResultSet rs = ps.executeQuery();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            List<UserContent> result = new ArrayList<UserContent>();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            while(rs.next()) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            \tlong userContentId = rs.getLong(\"userContentId\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            \tlong date = rs.getLong(\"date\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            \tString title = rs.getString(\"title\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            \tString content = rs.getString(\"content\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            \tString name = rs.getString(\"name\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            \tString email = rs.getString(\"email\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            \tUserContent userContent = new UserContent();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            \tuserContent.setUserContentId(userContentId);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            \tuserContent.setEntityName(entityName);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            \tuserContent.setEntityId(entityId);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            \tuserContent.setDate(new Date(date));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            \tuserContent.setTitle(title);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            \tuserContent.setContent(content);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            \tuserContent.setName(name);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            \tuserContent.setEmail(email);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            \tresult.add(userContent);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return result;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        } catch(SQLException se) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            se.printStackTrace();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        } finally {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            returnConnection(conn);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t@Override");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic boolean insertUserContent(String entityName, long entityId, String title,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tString content, String name, String email) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        Connection conn = getConnection();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        try {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        \t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(67);
        out.setTag("if",2363,2430);
        RuntimeTagElement _jettag_c_if_67_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_67_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_67_10.setRuntimeParent(null);
        _jettag_c_if_67_10.setTagInfo(_td_c_if_67_10);
        _jettag_c_if_67_10.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_c_if_67_10.okToProcessBody()) {
            out.write(NL);         
            out.write("            String query = \"INSERT INTO UserContent (entityName, entityId, date, title, content, name, email, approved) values (?, ?, ?, ?, ?, ?, ?, 'N')\";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            ");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_if_67_10.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_if_67_10.doEnd();
        out.endTag("if",169);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(NL);         
        out.write("        \t");  //$NON-NLS-1$        
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(68);
        out.setTag("if",2616,2684);
        RuntimeTagElement _jettag_c_if_70_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_70_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_70_10.setRuntimeParent(null);
        _jettag_c_if_70_10.setTagInfo(_td_c_if_70_10);
        _jettag_c_if_70_10.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_c_if_70_10.okToProcessBody()) {
            out.write(NL);         
            out.write("            String query = \"INSERT INTO UserContent (entityName, entityId, date, title, content, name, email) values (?, ?, ?, ?, ?, ?, ?)\";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            ");  //$NON-NLS-1$        
out.bodyContentStart();
            _jettag_c_if_70_10.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_if_70_10.doEnd();
        out.endTag("if",154);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write(NL);         
        out.write("            PreparedStatement ps = conn.prepareStatement(query);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ps.setString(1, entityName);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ps.setLong(2, entityId);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ps.setLong(3, new Date().getTime());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ps.setString(4, title);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ps.setString(5, content);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ps.setString(6, name);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ps.setString(7, email);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t       ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            int rows = ps.executeUpdate();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            if(rows == 1)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                return true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        } catch(SQLException se) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            se.printStackTrace();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        } finally {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            returnConnection(conn);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(67);
        out.setTag("if",3489,3556);
        RuntimeTagElement _jettag_c_if_95_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_95_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_95_1.setRuntimeParent(null);
        _jettag_c_if_95_1.setTagInfo(_td_c_if_95_1);
        _jettag_c_if_95_1.doStart(context, out);
        out.setTag(null,-1,-1);
        while (_jettag_c_if_95_1.okToProcessBody()) {
            out.write(NL);         
            out.write("\t@Override");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tpublic boolean approveUserContent(long userContentId) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        Connection conn = getConnection();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        try {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            String query = \"UPDATE UserContent set approved='Y' WHERE userContentId = ?\";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            PreparedStatement ps = conn.prepareStatement(query);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            ps.setLong(1, userContentId);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t       ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            int rows = ps.executeUpdate();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            if(rows == 1)");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("                return true;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            return false;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        } catch(SQLException se) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            se.printStackTrace();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            return false;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        } finally {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            returnConnection(conn);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        }");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t@Override");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tpublic List<UserContent> getUnapprovedUserContent() {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tConnection conn = getConnection();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\ttry {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\tString query = \"SELECT userContentId, entityName, entityId, date, title, content, name, email from UserContent WHERE approved='N'\";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("\t\t\tPreparedStatement ps = conn.prepareStatement(query);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("\t\t\tResultSet rs = ps.executeQuery();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\tList<UserContent> result = new ArrayList<UserContent>();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("\t\t\twhile (rs.next()) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\tlong userContentId = rs.getLong(\"userContentId\");");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\tString entityName = rs.getString(\"entityName\");");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\tlong entityId = rs.getLong(\"entityId\");");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\tlong date = rs.getLong(\"date\");");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\tString title = rs.getString(\"title\");");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\tString content = rs.getString(\"content\");");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\tString name = rs.getString(\"name\");");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\tString email = rs.getString(\"email\");");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("\t\t\t\tUserContent userContent = new UserContent();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\tuserContent.setUserContentId(userContentId);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\tuserContent.setEntityName(entityName);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\tuserContent.setEntityId(entityId);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\tuserContent.setDate(new Date(date));");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\tuserContent.setTitle(title);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\tuserContent.setContent(content);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\tuserContent.setName(name);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\tuserContent.setEmail(email);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("\t\t\t\tresult.add(userContent);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("\t\t\treturn result;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t} catch (SQLException se) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\tse.printStackTrace();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\treturn null;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t} finally {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\treturnConnection(conn);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t}\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t@Override");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tpublic boolean deleteUserContent(long userContentId) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        Connection conn = getConnection();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        try {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            String query = \"DELETE FROM UserContent WHERE userContentId = ?\";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            PreparedStatement ps = conn.prepareStatement(query);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            ps.setLong(1, userContentId);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t       ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            int rows = ps.executeUpdate();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            if(rows == 1)");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("                return true;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            return false;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        } catch(SQLException se) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            se.printStackTrace();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            return false;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        } finally {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            returnConnection(conn);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        }");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t}\t");  //$NON-NLS-1$        
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_if_95_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_if_95_1.doEnd();
        out.endTag("if",2556);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(7);
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.popTemplateFile();
    }
}
