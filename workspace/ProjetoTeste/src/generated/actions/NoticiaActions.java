
package generated.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import core.database.DefaultDAOFactoryProvider;
import generated.daos.NoticiaDAO;
import generated.beans.Noticia;

public class NoticiaActions {
    public final static String NOTICIA_EDIT_PAGE = "admin/EditNoticia.jsp";
    public final static String NOTICIA_LIST_PAGE = "admin/ListNoticia.jsp";
    public final static String NOTICIA_LIST_PAGE_FOR_SELECTION = "popups/selectReferenceForm.jsp";

    public String loadNoticiaForm(HttpServletRequest req, HttpServletResponse resp) {
        String noticiaIdParameter = req.getParameter("noticiaId");
        
        
            
        
            
        
            
        
            
        req.getSession().removeAttribute("NoticiaimagemContentType");
        req.getSession().removeAttribute("Noticiaimagem");
            
        
            
        
            
        
        
        if(noticiaIdParameter != null) {
            long noticiaId = Long.parseLong(noticiaIdParameter);
            NoticiaDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getNoticiaDAO();
            Noticia noticia = dao.getNoticia(noticiaId);
            if(noticia != null) {
                req.setAttribute("noticia",noticia);

                
                    
                
                    
                
                    
                
                    
                req.getSession().setAttribute("NoticiaimagemContentType",noticia.getImagemContentType());
                req.getSession().setAttribute("Noticiaimagem",noticia.getImagem());
                    
                
                    
                
                    
                

            }
        }
        
        return NOTICIA_EDIT_PAGE;
    }
    
    public String deleteNoticia(HttpServletRequest req, HttpServletResponse resp) {
        String noticiaIdParameter = req.getParameter("noticiaId");
        NoticiaDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getNoticiaDAO();
        
        long noticiaId = Long.parseLong(noticiaIdParameter);
        boolean result = dao.deleteNoticia(noticiaId);
        
        if(result) {
            req.setAttribute("message", "generated.beans.Noticia.delete.ok");
        }
        else req.setAttribute("message", "generated.beans.Noticia.delete.failed");
        
        return showAllNoticias(req,resp);
    }
    
    public String saveNoticia(HttpServletRequest req, HttpServletResponse resp) {
        String noticiaIdParameter = req.getParameter("noticiaId");
        
            
        String tituloParameter = req.getParameter("titulo");
            
            
        
            
        String resumoParameter = req.getParameter("resumo");
            
            
        
            
        String conteudoParameter = req.getParameter("conteudo");
            
            
        
            
            
        byte[] imagemParameter = (byte[]) req.getSession().getAttribute("Noticiaimagem");
        if(imagemParameter == null) imagemParameter = new byte[0];
        String imagemContentTypeParameter = (String) req.getSession().getAttribute("NoticiaimagemContentType");
            
        
            
        String dataParameter = req.getParameter("data");
            
            
        
            
            
        
        
        
        Noticia noticia = setupNoticia(noticiaIdParameter, tituloParameter, resumoParameter, conteudoParameter, imagemParameter, dataParameter, imagemContentTypeParameter);
        
        NoticiaDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getNoticiaDAO();
        boolean result = dao.saveOrUpdateNoticia(noticia);
        
        if(result) {
            req.setAttribute("message", "generated.beans.Noticia.save.ok");
        }
        else req.setAttribute("message", "generated.beans.Noticia.save.failed");
        
        return showAllNoticias(req,resp);
    }
    
    public String showAllNoticias(HttpServletRequest req, HttpServletResponse resp) {
        NoticiaDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getNoticiaDAO();
        
        List<Noticia> allNoticias = dao.getAllNoticias();
        
        req.setAttribute("allNoticias", allNoticias);
        
        return NOTICIA_LIST_PAGE;
    }

    public String showAllNoticiasForSelection(HttpServletRequest req, HttpServletResponse resp) {
        NoticiaDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getNoticiaDAO();
        
        List<Noticia> allNoticias = dao.getAllNoticias();
        
        req.setAttribute("allElements", allNoticias);
        
        req.setAttribute("currentlySelectedMessageKey", "generated.beans.Noticia.currentlySelected.label");
        req.setAttribute("selectMessageKey", "generated.beans.Noticia.select.label");
        
        return NOTICIA_LIST_PAGE_FOR_SELECTION;
    }

    private Noticia setupNoticia(String noticiaIdParameter, String tituloParameter, String resumoParameter, String conteudoParameter, byte [] imagemParameter, String dataParameter, String imagemContentTypeParameter) {
        Noticia noticia = new Noticia();
        if(noticiaIdParameter != null && noticiaIdParameter.trim().length()>0)
            noticia.setNoticiaId(Long.parseLong(noticiaIdParameter));

		
		
		noticia.setTitulo(tituloParameter);
		
		
        
        
        
        
		
        
		
		
		noticia.setResumo(resumoParameter);
		
		
        
        
        
        
		
        
		
		
		noticia.setConteudo(conteudoParameter);
		
		
        
        
        
        
		
        
		
		
		
        
        
        
        
		
        
        noticia.setImagem(imagemParameter);
        
		
		
		
        
        
        
        
		
        try {
            if(dataParameter != null && dataParameter.trim().length()>0) {
                java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
                noticia.setData(sdf.parse(dataParameter));
            }
        }
        catch(java.text.ParseException pe) {
            pe.printStackTrace();
        }
		
        
		
		
		noticia.setImagemContentType(imagemContentTypeParameter);
		
		
        
        
        
        
		
        
		
		
        
            
        return noticia;
    }
}
