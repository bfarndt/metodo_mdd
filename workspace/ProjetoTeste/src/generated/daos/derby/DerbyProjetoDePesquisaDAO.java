package generated.daos.derby;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import generated.daos.ProjetoDePesquisaDAO;
import generated.beans.ProjetoDePesquisa;




public class DerbyProjetoDePesquisaDAO extends ProjetoDePesquisaDAO {
    @Override
    public List<ProjetoDePesquisa> getAllProjetoDePesquisas() {
        Connection conn = getConnection();
        try {
            String query = "SELECT projetoDePesquisaId, titulo, descricao, dataInicio, dataFim, apoio, area form ProjetoDePesquisa";
            PreparedStatement ps = conn.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            List<ProjetoDePesquisa> result = new ArrayList<ProjetoDePesquisa>();
            
            while(rs.next()) {
                
                long projetoDePesquisaId = rs.getLong("projetoDePesquisaId");
                
                
                String titulo = rs.getString("titulo");
                
                
                
                
                String descricao = rs.getString("descricao");
                
                
                
                
                java.util.Date dataInicio = rs.getTimestamp("dataInicio");
                
                
                
                
                java.util.Date dataFim = rs.getTimestamp("dataFim");
                
                
                
                
                long refapoio = rs.getLong("apoio");
                
                long refarea = rs.getLong("area");
                
                
                ProjetoDePesquisa projetoDePesquisa = new ProjetoDePesquisa();
                projetoDePesquisa.setProjetoDePesquisaId(projetoDePesquisaId);
                
                projetoDePesquisa.setTitulo(titulo);
                
                projetoDePesquisa.setDescricao(descricao);
                
                projetoDePesquisa.setDataInicio(dataInicio);
                
                projetoDePesquisa.setDataFim(dataFim);
                
                
                generated.daos.SuporteDAO apoioDAO = core.database.DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getSuporteDAO();
                generated.beans.Suporte apoio = apoioDAO.getSuporte(refapoio);
                projetoDePesquisa.setApoio(apoio);
                
                generated.daos.AreaDePesquisaDAO areaDAO = core.database.DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getAreaDePesquisaDAO();
                generated.beans.AreaDePesquisa area = areaDAO.getAreaDePesquisa(refarea);
                projetoDePesquisa.setArea(area);
                

                
                result.add(projetoDePesquisa);
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
    public ProjetoDePesquisa getProjetoDePesquisa(long projetoDePesquisaIdParameter) {
        Connection conn = getConnection();
        try {
            String query = "SELECT projetoDePesquisaId, titulo, descricao, dataInicio, dataFim, apoio, area from ProjetoDePesquisa WHERE projetoDePesquisaId = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setLong(1,projetoDePesquisaIdParameter);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                
                long projetoDePesquisaId = rs.getLong("projetoDePesquisaId");
                
                
                String titulo = rs.getString("titulo");
                
                
                
                
                String descricao = rs.getString("descricao");
                
                
                
                
                java.util.Date dataInicio = rs.getTimestamp("dataInicio");
                
                
                
                
                java.util.Date dataFim = rs.getTimestamp("dataFim");
                
                
                
                
                long refapoio = rs.getLong("apoio");
                
                long refarea = rs.getLong("area");
                
                
                ProjetoDePesquisa projetoDePesquisa = new ProjetoDePesquisa();
                projetoDePesquisa.setProjetoDePesquisaId(projetoDePesquisaId);
                
                projetoDePesquisa.setTitulo(titulo);
                
                projetoDePesquisa.setDescricao(descricao);
                
                projetoDePesquisa.setDataInicio(dataInicio);
                
                projetoDePesquisa.setDataFim(dataFim);
                
                
                generated.daos.SuporteDAO apoioDAO = core.database.DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getSuporteDAO();
                generated.beans.Suporte apoio = apoioDAO.getSuporte(refapoio);
                projetoDePesquisa.setApoio(apoio);
                
                generated.daos.AreaDePesquisaDAO areaDAO = core.database.DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getAreaDePesquisaDAO();
                generated.beans.AreaDePesquisa area = areaDAO.getAreaDePesquisa(refarea);
                projetoDePesquisa.setArea(area);
                

                
                return projetoDePesquisa;
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
    public boolean saveOrUpdateProjetoDePesquisa(ProjetoDePesquisa projetoDePesquisa) {
        if(projetoDePesquisa.getProjetoDePesquisaId() > 0) {
            ProjetoDePesquisa existentProjetoDePesquisa = getProjetoDePesquisa(projetoDePesquisa.getProjetoDePesquisaId());
            if(existentProjetoDePesquisa != null) {
                return updateProjetoDePesquisa(projetoDePesquisa);
            }
        }
        return insertProjetoDePesquisa(projetoDePesquisa);
    }

    @Override
    public boolean insertProjetoDePesquisa(ProjetoDePesquisa projetoDePesquisa) {
        Connection conn = getConnection();
        try {
            String query = "INSERT INTO ProjetoDePesquisa (titulo, descricao, dataInicio, dataFim, apoio, area) values (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
    
			
            
            ps.setString(1, projetoDePesquisa.getTitulo());
			
            ps.setString(2, projetoDePesquisa.getDescricao());
			
            ps.setTimestamp(3, new java.sql.Timestamp(projetoDePesquisa.getDataInicio().getTime()));
			
            ps.setTimestamp(4, new java.sql.Timestamp(projetoDePesquisa.getDataFim().getTime()));
			     
            
            if(projetoDePesquisa.getApoio() != null)
                ps.setLong(5, projetoDePesquisa.getApoio().getSuporteId());
            else ps.setLong(5, -1);
            
            if(projetoDePesquisa.getArea() != null)
                ps.setLong(6, projetoDePesquisa.getArea().getAreaDePesquisaId());
            else ps.setLong(6, -1);
                 
			       
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
    public boolean updateProjetoDePesquisa(ProjetoDePesquisa projetoDePesquisa) {
        Connection conn = getConnection();
        try {
            String query = "UPDATE ProjetoDePesquisa set titulo = ?, descricao = ?, dataInicio = ?, dataFim = ?, apoio = ?, area = ? WHERE projetoDePesquisaId = ?";
            PreparedStatement ps = conn.prepareStatement(query);

			
            
            ps.setString(1, projetoDePesquisa.getTitulo());
			
            ps.setString(2, projetoDePesquisa.getDescricao());
			
            ps.setTimestamp(3, new java.sql.Timestamp(projetoDePesquisa.getDataInicio().getTime()));
			
            ps.setTimestamp(4, new java.sql.Timestamp(projetoDePesquisa.getDataFim().getTime()));
			            
            
            if(projetoDePesquisa.getApoio() != null)
                ps.setLong(5, projetoDePesquisa.getApoio().getSuporteId());
            else ps.setLong(5, -1);
            
            if(projetoDePesquisa.getArea() != null)
                ps.setLong(6, projetoDePesquisa.getArea().getAreaDePesquisaId());
            else ps.setLong(6, -1);
                 
            ps.setLong(7, projetoDePesquisa.getProjetoDePesquisaId());
            
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
    public boolean deleteProjetoDePesquisa(long projetoDePesquisaId) {
        Connection conn = getConnection();
        try {
            String query = "DELETE FROM ProjetoDePesquisa where projetoDePesquisaId = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setLong(1,projetoDePesquisaId);
            
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
