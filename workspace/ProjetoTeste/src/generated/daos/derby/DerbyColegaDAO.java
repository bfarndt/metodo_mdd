package generated.daos.derby;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import generated.daos.ColegaDAO;
import generated.beans.Colega;




public class DerbyColegaDAO extends ColegaDAO {
    @Override
    public List<Colega> getAllColegas() {
        Connection conn = getConnection();
        try {
            String query = "SELECT colegaId, nome, homepage form Colega";
            PreparedStatement ps = conn.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            List<Colega> result = new ArrayList<Colega>();
            
            while(rs.next()) {
                
                long colegaId = rs.getLong("colegaId");
                
                
                String nome = rs.getString("nome");
                
                
                
                
                String homepage = rs.getString("homepage");
                
                
                
                
                
                Colega colega = new Colega();
                colega.setColegaId(colegaId);
                
                colega.setNome(nome);
                
                colega.setHomepage(homepage);
                
                

                
                result.add(colega);
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
    public Colega getColega(long colegaIdParameter) {
        Connection conn = getConnection();
        try {
            String query = "SELECT colegaId, nome, homepage from Colega WHERE colegaId = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setLong(1,colegaIdParameter);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                
                long colegaId = rs.getLong("colegaId");
                
                
                String nome = rs.getString("nome");
                
                
                
                
                String homepage = rs.getString("homepage");
                
                
                
                
                
                Colega colega = new Colega();
                colega.setColegaId(colegaId);
                
                colega.setNome(nome);
                
                colega.setHomepage(homepage);
                
                

                
                return colega;
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
    public boolean saveOrUpdateColega(Colega colega) {
        if(colega.getColegaId() > 0) {
            Colega existentColega = getColega(colega.getColegaId());
            if(existentColega != null) {
                return updateColega(colega);
            }
        }
        return insertColega(colega);
    }

    @Override
    public boolean insertColega(Colega colega) {
        Connection conn = getConnection();
        try {
            String query = "INSERT INTO Colega (nome, homepage) values (?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
    
			
            
            ps.setString(1, colega.getNome());
			
            ps.setString(2, colega.getHomepage());
			     
                 
			       
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
    public boolean updateColega(Colega colega) {
        Connection conn = getConnection();
        try {
            String query = "UPDATE Colega set nome = ?, homepage = ? WHERE colegaId = ?";
            PreparedStatement ps = conn.prepareStatement(query);

			
            
            ps.setString(1, colega.getNome());
			
            ps.setString(2, colega.getHomepage());
			            
                 
            ps.setLong(3, colega.getColegaId());
            
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
    public boolean deleteColega(long colegaId) {
        Connection conn = getConnection();
        try {
            String query = "DELETE FROM Colega where colegaId = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setLong(1,colegaId);
            
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
