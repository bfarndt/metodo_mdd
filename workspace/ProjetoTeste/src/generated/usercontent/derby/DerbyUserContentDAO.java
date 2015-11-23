package generated.usercontent.derby;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import generated.usercontent.UserContent;
import generated.usercontent.UserContentDAO;

public class DerbyUserContentDAO extends UserContentDAO {

	@Override
	public List<UserContent> getAllUserContent(String entityName, long entityId) {
        Connection conn = getConnection();
        try {
            String query = "SELECT userContentId, date, title, content, name, email from UserContent WHERE entityName = ? AND entityId = ?";
        	
            query += " AND approved='Y'";
            
        
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, entityName);
            ps.setLong(2, entityId);
            
            ResultSet rs = ps.executeQuery();
            List<UserContent> result = new ArrayList<UserContent>();
            
            while(rs.next()) {
            	long userContentId = rs.getLong("userContentId");
            	long date = rs.getLong("date");
            	String title = rs.getString("title");
            	String content = rs.getString("content");
            	String name = rs.getString("name");
            	String email = rs.getString("email");

            	UserContent userContent = new UserContent();
            	userContent.setUserContentId(userContentId);
            	userContent.setEntityName(entityName);
            	userContent.setEntityId(entityId);
            	userContent.setDate(new Date(date));
            	userContent.setTitle(title);
            	userContent.setContent(content);
            	userContent.setName(name);
            	userContent.setEmail(email);
                
            	result.add(userContent);
            }
            
            return result;
        } catch(SQLException se) {
            se.printStackTrace();
            return null;
        } finally {
            returnConnection(conn);
        }
	}

	@Override
	public boolean insertUserContent(String entityName, long entityId, String title,
			String content, String name, String email) {
        Connection conn = getConnection();
        try {
        	
            String query = "INSERT INTO UserContent (entityName, entityId, date, title, content, name, email, approved) values (?, ?, ?, ?, ?, ?, ?, 'N')";
            
        	
            PreparedStatement ps = conn.prepareStatement(query);
    
            ps.setString(1, entityName);
            ps.setLong(2, entityId);
            ps.setLong(3, new Date().getTime());
            ps.setString(4, title);
            ps.setString(5, content);
            ps.setString(6, name);
            ps.setString(7, email);
			       
            int rows = ps.executeUpdate();
            if(rows == 1)
                return true;
            return false;
        } catch(SQLException se) {
            se.printStackTrace();
            return false;
        } finally {
            returnConnection(conn);
        }
	}
	

	@Override
	public boolean approveUserContent(long userContentId) {
        Connection conn = getConnection();
        try {
            String query = "UPDATE UserContent set approved='Y' WHERE userContentId = ?";
            PreparedStatement ps = conn.prepareStatement(query);
    
            ps.setLong(1, userContentId);
			       
            int rows = ps.executeUpdate();
            if(rows == 1)
                return true;
            return false;
        } catch(SQLException se) {
            se.printStackTrace();
            return false;
        } finally {
            returnConnection(conn);
        }
	}
	
	@Override
	public List<UserContent> getUnapprovedUserContent() {
		Connection conn = getConnection();
		try {
			String query = "SELECT userContentId, entityName, entityId, date, title, content, name, email from UserContent WHERE approved='N'";

			PreparedStatement ps = conn.prepareStatement(query);

			ResultSet rs = ps.executeQuery();
			List<UserContent> result = new ArrayList<UserContent>();

			while (rs.next()) {
				long userContentId = rs.getLong("userContentId");
				String entityName = rs.getString("entityName");
				long entityId = rs.getLong("entityId");
				long date = rs.getLong("date");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String name = rs.getString("name");
				String email = rs.getString("email");

				UserContent userContent = new UserContent();
				userContent.setUserContentId(userContentId);
				userContent.setEntityName(entityName);
				userContent.setEntityId(entityId);
				userContent.setDate(new Date(date));
				userContent.setTitle(title);
				userContent.setContent(content);
				userContent.setName(name);
				userContent.setEmail(email);

				result.add(userContent);
			}

			return result;
		} catch (SQLException se) {
			se.printStackTrace();
			return null;
		} finally {
			returnConnection(conn);
		}
	}	
	
	@Override
	public boolean deleteUserContent(long userContentId) {
        Connection conn = getConnection();
        try {
            String query = "DELETE FROM UserContent WHERE userContentId = ?";
            PreparedStatement ps = conn.prepareStatement(query);
    
            ps.setLong(1, userContentId);
			       
            int rows = ps.executeUpdate();
            if(rows == 1)
                return true;
            return false;
        } catch(SQLException se) {
            se.printStackTrace();
            return false;
        } finally {
            returnConnection(conn);
        }
	}	
	
}