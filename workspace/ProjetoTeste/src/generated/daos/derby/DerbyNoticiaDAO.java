package generated.daos.derby;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import generated.daos.NoticiaDAO;
import generated.beans.Noticia;




public class DerbyNoticiaDAO extends NoticiaDAO {
    @Override
    public List<Noticia> getAllNoticias() {
        Connection conn = getConnection();
        try {
            String query = "SELECT noticiaId, titulo, resumo, conteudo, imagem, data, imagemContentType form Noticia";
            PreparedStatement ps = conn.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            List<Noticia> result = new ArrayList<Noticia>();
            
            while(rs.next()) {
                
                long noticiaId = rs.getLong("noticiaId");
                
                
                String titulo = rs.getString("titulo");
                
                
                
                
                String resumo = rs.getString("resumo");
                
                
                
                
                String conteudo = rs.getString("conteudo");
                
                
                
                
                
                java.sql.Blob blobimagem = rs.getBlob("imagem");
                byte[] imagem = blobimagem.getBytes(1, (int)(blobimagem.length()));
                
                
                
                java.util.Date data = rs.getTimestamp("data");
                
                
                
                
                String imagemContentType = rs.getString("imagemContentType");
                
                
                
                
                
                Noticia noticia = new Noticia();
                noticia.setNoticiaId(noticiaId);
                
                noticia.setTitulo(titulo);
                
                noticia.setResumo(resumo);
                
                noticia.setConteudo(conteudo);
                
                noticia.setImagem(imagem);
                
                noticia.setData(data);
                
                noticia.setImagemContentType(imagemContentType);
                
                

                
                result.add(noticia);
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
    public Noticia getNoticia(long noticiaIdParameter) {
        Connection conn = getConnection();
        try {
            String query = "SELECT noticiaId, titulo, resumo, conteudo, imagem, data, imagemContentType from Noticia WHERE noticiaId = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setLong(1,noticiaIdParameter);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                
                long noticiaId = rs.getLong("noticiaId");
                
                
                String titulo = rs.getString("titulo");
                
                
                
                
                String resumo = rs.getString("resumo");
                
                
                
                
                String conteudo = rs.getString("conteudo");
                
                
                
                
                
                java.sql.Blob blobimagem = rs.getBlob("imagem");
                byte[] imagem = blobimagem.getBytes(1, (int)(blobimagem.length()));
                
                
                
                java.util.Date data = rs.getTimestamp("data");
                
                
                
                
                String imagemContentType = rs.getString("imagemContentType");
                
                
                
                
                
                Noticia noticia = new Noticia();
                noticia.setNoticiaId(noticiaId);
                
                noticia.setTitulo(titulo);
                
                noticia.setResumo(resumo);
                
                noticia.setConteudo(conteudo);
                
                noticia.setImagem(imagem);
                
                noticia.setData(data);
                
                noticia.setImagemContentType(imagemContentType);
                
                

                
                return noticia;
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
    public boolean saveOrUpdateNoticia(Noticia noticia) {
        if(noticia.getNoticiaId() > 0) {
            Noticia existentNoticia = getNoticia(noticia.getNoticiaId());
            if(existentNoticia != null) {
                return updateNoticia(noticia);
            }
        }
        return insertNoticia(noticia);
    }

    @Override
    public boolean insertNoticia(Noticia noticia) {
        Connection conn = getConnection();
        try {
            String query = "INSERT INTO Noticia (titulo, resumo, conteudo, imagem, data, imagemContentType) values (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
    
			
            
            ps.setString(1, noticia.getTitulo());
			
            ps.setString(2, noticia.getResumo());
			
            ps.setString(3, noticia.getConteudo());
			
            ps.setObject(4, noticia.getImagem());
			
            ps.setTimestamp(5, new java.sql.Timestamp(noticia.getData().getTime()));
			
            ps.setString(6, noticia.getImagemContentType());
			     
                 
			       
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
    public boolean updateNoticia(Noticia noticia) {
        Connection conn = getConnection();
        try {
            String query = "UPDATE Noticia set titulo = ?, resumo = ?, conteudo = ?, imagem = ?, data = ?, imagemContentType = ? WHERE noticiaId = ?";
            PreparedStatement ps = conn.prepareStatement(query);

			
            
            ps.setString(1, noticia.getTitulo());
			
            ps.setString(2, noticia.getResumo());
			
            ps.setString(3, noticia.getConteudo());
			
            ps.setObject(4, noticia.getImagem());
			
            ps.setTimestamp(5, new java.sql.Timestamp(noticia.getData().getTime()));
			
            ps.setString(6, noticia.getImagemContentType());
			            
                 
            ps.setLong(7, noticia.getNoticiaId());
            
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
    public boolean deleteNoticia(long noticiaId) {
        Connection conn = getConnection();
        try {
            String query = "DELETE FROM Noticia where noticiaId = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setLong(1,noticiaId);
            
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
