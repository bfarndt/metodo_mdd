package generated.daos.derby;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import generated.daos.SuporteDAO;
import generated.beans.Suporte;




public class DerbySuporteDAO extends SuporteDAO {
    @Override
    public List<Suporte> getAllSuportes() {
        Connection conn = getConnection();
        try {
            String query = "SELECT suporteId, agencia, icone, iconeContentType form Suporte";
            PreparedStatement ps = conn.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            List<Suporte> result = new ArrayList<Suporte>();
            
            while(rs.next()) {
                
                long suporteId = rs.getLong("suporteId");
                
                
                String agencia = rs.getString("agencia");
                
                
                
                
                
                java.sql.Blob blobicone = rs.getBlob("icone");
                byte[] icone = blobicone.getBytes(1, (int)(blobicone.length()));
                
                
                
                String iconeContentType = rs.getString("iconeContentType");
                
                
                
                
                
                Suporte suporte = new Suporte();
                suporte.setSuporteId(suporteId);
                
                suporte.setAgencia(agencia);
                
                suporte.setIcone(icone);
                
                suporte.setIconeContentType(iconeContentType);
                
                

                
                result.add(suporte);
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
    public Suporte getSuporte(long suporteIdParameter) {
        Connection conn = getConnection();
        try {
            String query = "SELECT suporteId, agencia, icone, iconeContentType from Suporte WHERE suporteId = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setLong(1,suporteIdParameter);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                
                long suporteId = rs.getLong("suporteId");
                
                
                String agencia = rs.getString("agencia");
                
                
                
                
                
                java.sql.Blob blobicone = rs.getBlob("icone");
                byte[] icone = blobicone.getBytes(1, (int)(blobicone.length()));
                
                
                
                String iconeContentType = rs.getString("iconeContentType");
                
                
                
                
                
                Suporte suporte = new Suporte();
                suporte.setSuporteId(suporteId);
                
                suporte.setAgencia(agencia);
                
                suporte.setIcone(icone);
                
                suporte.setIconeContentType(iconeContentType);
                
                

                
                return suporte;
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
    public boolean saveOrUpdateSuporte(Suporte suporte) {
        if(suporte.getSuporteId() > 0) {
            Suporte existentSuporte = getSuporte(suporte.getSuporteId());
            if(existentSuporte != null) {
                return updateSuporte(suporte);
            }
        }
        return insertSuporte(suporte);
    }

    @Override
    public boolean insertSuporte(Suporte suporte) {
        Connection conn = getConnection();
        try {
            String query = "INSERT INTO Suporte (agencia, icone, iconeContentType) values (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
    
			
            
            ps.setString(1, suporte.getAgencia());
			
            ps.setObject(2, suporte.getIcone());
			
            ps.setString(3, suporte.getIconeContentType());
			     
                 
			       
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
    public boolean updateSuporte(Suporte suporte) {
        Connection conn = getConnection();
        try {
            String query = "UPDATE Suporte set agencia = ?, icone = ?, iconeContentType = ? WHERE suporteId = ?";
            PreparedStatement ps = conn.prepareStatement(query);

			
            
            ps.setString(1, suporte.getAgencia());
			
            ps.setObject(2, suporte.getIcone());
			
            ps.setString(3, suporte.getIconeContentType());
			            
                 
            ps.setLong(4, suporte.getSuporteId());
            
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
    public boolean deleteSuporte(long suporteId) {
        Connection conn = getConnection();
        try {
            String query = "DELETE FROM Suporte where suporteId = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setLong(1,suporteId);
            
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
