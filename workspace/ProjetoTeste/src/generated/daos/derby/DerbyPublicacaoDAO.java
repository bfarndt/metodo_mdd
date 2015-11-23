package generated.daos.derby;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import generated.daos.PublicacaoDAO;
import generated.beans.Publicacao;




public class DerbyPublicacaoDAO extends PublicacaoDAO {
    @Override
    public List<Publicacao> getAllPublicacaos() {
        Connection conn = getConnection();
        try {
            String query = "SELECT publicacaoId, autores, local, data, area form Publicacao";
            PreparedStatement ps = conn.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            List<Publicacao> result = new ArrayList<Publicacao>();
            
            while(rs.next()) {
                
                long publicacaoId = rs.getLong("publicacaoId");
                
                
                String autores = rs.getString("autores");
                
                
                
                
                String local = rs.getString("local");
                
                
                
                
                String data = rs.getString("data");
                
                
                
                
                long refarea = rs.getLong("area");
                
                
                Publicacao publicacao = new Publicacao();
                publicacao.setPublicacaoId(publicacaoId);
                
                publicacao.setAutores(autores);
                
                publicacao.setLocal(local);
                
                publicacao.setData(data);
                
                
                generated.daos.AreaDePesquisaDAO areaDAO = core.database.DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getAreaDePesquisaDAO();
                generated.beans.AreaDePesquisa area = areaDAO.getAreaDePesquisa(refarea);
                publicacao.setArea(area);
                

                
                result.add(publicacao);
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
    public Publicacao getPublicacao(long publicacaoIdParameter) {
        Connection conn = getConnection();
        try {
            String query = "SELECT publicacaoId, autores, local, data, area from Publicacao WHERE publicacaoId = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setLong(1,publicacaoIdParameter);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                
                long publicacaoId = rs.getLong("publicacaoId");
                
                
                String autores = rs.getString("autores");
                
                
                
                
                String local = rs.getString("local");
                
                
                
                
                String data = rs.getString("data");
                
                
                
                
                long refarea = rs.getLong("area");
                
                
                Publicacao publicacao = new Publicacao();
                publicacao.setPublicacaoId(publicacaoId);
                
                publicacao.setAutores(autores);
                
                publicacao.setLocal(local);
                
                publicacao.setData(data);
                
                
                generated.daos.AreaDePesquisaDAO areaDAO = core.database.DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getAreaDePesquisaDAO();
                generated.beans.AreaDePesquisa area = areaDAO.getAreaDePesquisa(refarea);
                publicacao.setArea(area);
                

                
                return publicacao;
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
    public boolean saveOrUpdatePublicacao(Publicacao publicacao) {
        if(publicacao.getPublicacaoId() > 0) {
            Publicacao existentPublicacao = getPublicacao(publicacao.getPublicacaoId());
            if(existentPublicacao != null) {
                return updatePublicacao(publicacao);
            }
        }
        return insertPublicacao(publicacao);
    }

    @Override
    public boolean insertPublicacao(Publicacao publicacao) {
        Connection conn = getConnection();
        try {
            String query = "INSERT INTO Publicacao (autores, local, data, area) values (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
    
			
            
            ps.setString(1, publicacao.getAutores());
			
            ps.setString(2, publicacao.getLocal());
			
            ps.setString(3, publicacao.getData());
			     
            
            if(publicacao.getArea() != null)
                ps.setLong(4, publicacao.getArea().getAreaDePesquisaId());
            else ps.setLong(4, -1);
                 
			       
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
    public boolean updatePublicacao(Publicacao publicacao) {
        Connection conn = getConnection();
        try {
            String query = "UPDATE Publicacao set autores = ?, local = ?, data = ?, area = ? WHERE publicacaoId = ?";
            PreparedStatement ps = conn.prepareStatement(query);

			
            
            ps.setString(1, publicacao.getAutores());
			
            ps.setString(2, publicacao.getLocal());
			
            ps.setString(3, publicacao.getData());
			            
            
            if(publicacao.getArea() != null)
                ps.setLong(4, publicacao.getArea().getAreaDePesquisaId());
            else ps.setLong(4, -1);
                 
            ps.setLong(5, publicacao.getPublicacaoId());
            
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
    public boolean deletePublicacao(long publicacaoId) {
        Connection conn = getConnection();
        try {
            String query = "DELETE FROM Publicacao where publicacaoId = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setLong(1,publicacaoId);
            
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
