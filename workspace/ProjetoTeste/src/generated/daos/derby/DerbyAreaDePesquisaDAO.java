package generated.daos.derby;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import generated.daos.AreaDePesquisaDAO;
import generated.beans.AreaDePesquisa;




public class DerbyAreaDePesquisaDAO extends AreaDePesquisaDAO {
    @Override
    public List<AreaDePesquisa> getAllAreaDePesquisas() {
        Connection conn = getConnection();
        try {
            String query = "SELECT areaDePesquisaId, nome, descricao form AreaDePesquisa";
            PreparedStatement ps = conn.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            List<AreaDePesquisa> result = new ArrayList<AreaDePesquisa>();
            
            while(rs.next()) {
                
                long areaDePesquisaId = rs.getLong("areaDePesquisaId");
                
                
                String nome = rs.getString("nome");
                
                
                
                
                String descricao = rs.getString("descricao");
                
                
                
                
                
                AreaDePesquisa areaDePesquisa = new AreaDePesquisa();
                areaDePesquisa.setAreaDePesquisaId(areaDePesquisaId);
                
                areaDePesquisa.setNome(nome);
                
                areaDePesquisa.setDescricao(descricao);
                
                

                
                result.add(areaDePesquisa);
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
    public AreaDePesquisa getAreaDePesquisa(long areaDePesquisaIdParameter) {
        Connection conn = getConnection();
        try {
            String query = "SELECT areaDePesquisaId, nome, descricao from AreaDePesquisa WHERE areaDePesquisaId = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setLong(1,areaDePesquisaIdParameter);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                
                long areaDePesquisaId = rs.getLong("areaDePesquisaId");
                
                
                String nome = rs.getString("nome");
                
                
                
                
                String descricao = rs.getString("descricao");
                
                
                
                
                
                AreaDePesquisa areaDePesquisa = new AreaDePesquisa();
                areaDePesquisa.setAreaDePesquisaId(areaDePesquisaId);
                
                areaDePesquisa.setNome(nome);
                
                areaDePesquisa.setDescricao(descricao);
                
                

                
                return areaDePesquisa;
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
    public boolean saveOrUpdateAreaDePesquisa(AreaDePesquisa areaDePesquisa) {
        if(areaDePesquisa.getAreaDePesquisaId() > 0) {
            AreaDePesquisa existentAreaDePesquisa = getAreaDePesquisa(areaDePesquisa.getAreaDePesquisaId());
            if(existentAreaDePesquisa != null) {
                return updateAreaDePesquisa(areaDePesquisa);
            }
        }
        return insertAreaDePesquisa(areaDePesquisa);
    }

    @Override
    public boolean insertAreaDePesquisa(AreaDePesquisa areaDePesquisa) {
        Connection conn = getConnection();
        try {
            String query = "INSERT INTO AreaDePesquisa (nome, descricao) values (?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
    
			
            
            ps.setString(1, areaDePesquisa.getNome());
			
            ps.setString(2, areaDePesquisa.getDescricao());
			     
                 
			       
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
    public boolean updateAreaDePesquisa(AreaDePesquisa areaDePesquisa) {
        Connection conn = getConnection();
        try {
            String query = "UPDATE AreaDePesquisa set nome = ?, descricao = ? WHERE areaDePesquisaId = ?";
            PreparedStatement ps = conn.prepareStatement(query);

			
            
            ps.setString(1, areaDePesquisa.getNome());
			
            ps.setString(2, areaDePesquisa.getDescricao());
			            
                 
            ps.setLong(3, areaDePesquisa.getAreaDePesquisaId());
            
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
    public boolean deleteAreaDePesquisa(long areaDePesquisaId) {
        Connection conn = getConnection();
        try {
            String query = "DELETE FROM AreaDePesquisa where areaDePesquisaId = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setLong(1,areaDePesquisaId);
            
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
