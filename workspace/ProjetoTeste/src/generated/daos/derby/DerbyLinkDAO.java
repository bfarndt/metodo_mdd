package generated.daos.derby;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import generated.daos.LinkDAO;
import generated.beans.Link;




public class DerbyLinkDAO extends LinkDAO {
    @Override
    public List<Link> getAllLinks() {
        Connection conn = getConnection();
        try {
            String query = "SELECT linkId, titulo, url form Link";
            PreparedStatement ps = conn.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            List<Link> result = new ArrayList<Link>();
            
            while(rs.next()) {
                
                long linkId = rs.getLong("linkId");
                
                
                String titulo = rs.getString("titulo");
                
                
                
                
                String url = rs.getString("url");
                
                
                
                
                
                Link link = new Link();
                link.setLinkId(linkId);
                
                link.setTitulo(titulo);
                
                link.setUrl(url);
                
                

                
                result.add(link);
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
    public Link getLink(long linkIdParameter) {
        Connection conn = getConnection();
        try {
            String query = "SELECT linkId, titulo, url from Link WHERE linkId = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setLong(1,linkIdParameter);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                
                long linkId = rs.getLong("linkId");
                
                
                String titulo = rs.getString("titulo");
                
                
                
                
                String url = rs.getString("url");
                
                
                
                
                
                Link link = new Link();
                link.setLinkId(linkId);
                
                link.setTitulo(titulo);
                
                link.setUrl(url);
                
                

                
                return link;
            }
            
            return null;
        } catch(SQLException se) {
            se.printStackTrace();
            return null;
        } finally {
            returnConnection(conn);
        }
    }

    @Override
    public boolean saveOrUpdateLink(Link link) {
        if(link.getLinkId() > 0) {
            Link existentLink = getLink(link.getLinkId());
            if(existentLink != null) {
                return updateLink(link);
            }
        }
        return insertLink(link);
    }

    @Override
    public boolean insertLink(Link link) {
        Connection conn = getConnection();
        try {
            String query = "INSERT INTO Link (titulo, url) values (?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
    
			
            
            ps.setString(1, link.getTitulo());
			
            ps.setString(2, link.getUrl());
			     
                 
			       
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
    public boolean updateLink(Link link) {
        Connection conn = getConnection();
        try {
            String query = "UPDATE Link set titulo = ?, url = ? WHERE linkId = ?";
            PreparedStatement ps = conn.prepareStatement(query);

			
            
            ps.setString(1, link.getTitulo());
			
            ps.setString(2, link.getUrl());
			            
                 
            ps.setLong(3, link.getLinkId());
            
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
    public boolean deleteLink(long linkId) {
        Connection conn = getConnection();
        try {
            String query = "DELETE FROM Link where linkId = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setLong(1,linkId);
            
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
