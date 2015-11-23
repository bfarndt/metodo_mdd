
package generated.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import core.database.DefaultDAOFactoryProvider;
import generated.daos.PublicacaoDAO;
import generated.beans.Publicacao;

public class PublicacaoActions {
    public final static String PUBLICACAO_EDIT_PAGE = "admin/EditPublicacao.jsp";
    public final static String PUBLICACAO_LIST_PAGE = "admin/ListPublicacao.jsp";
    public final static String PUBLICACAO_LIST_PAGE_FOR_SELECTION = "popups/selectReferenceForm.jsp";

    public String loadPublicacaoForm(HttpServletRequest req, HttpServletResponse resp) {
        String publicacaoIdParameter = req.getParameter("publicacaoId");
        
        
            
        
            
        
            
        
        
        if(publicacaoIdParameter != null) {
            long publicacaoId = Long.parseLong(publicacaoIdParameter);
            PublicacaoDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getPublicacaoDAO();
            Publicacao publicacao = dao.getPublicacao(publicacaoId);
            if(publicacao != null) {
                req.setAttribute("publicacao",publicacao);

                
                    
                
                    
                
                    
                

            }
        }
        
        return PUBLICACAO_EDIT_PAGE;
    }
    
    public String deletePublicacao(HttpServletRequest req, HttpServletResponse resp) {
        String publicacaoIdParameter = req.getParameter("publicacaoId");
        PublicacaoDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getPublicacaoDAO();
        
        long publicacaoId = Long.parseLong(publicacaoIdParameter);
        boolean result = dao.deletePublicacao(publicacaoId);
        
        if(result) {
            req.setAttribute("message", "generated.beans.Publicacao.delete.ok");
        }
        else req.setAttribute("message", "generated.beans.Publicacao.delete.failed");
        
        return showAllPublicacaos(req,resp);
    }
    
    public String savePublicacao(HttpServletRequest req, HttpServletResponse resp) {
        String publicacaoIdParameter = req.getParameter("publicacaoId");
        
            
        String autoresParameter = req.getParameter("autores");
            
            
        
            
        String localParameter = req.getParameter("local");
            
            
        
            
        String dataParameter = req.getParameter("data");
            
            
        
        
        String areaParameter = req.getParameter("area");
        
        
        Publicacao publicacao = setupPublicacao(publicacaoIdParameter, autoresParameter, localParameter, dataParameter, areaParameter);
        
        PublicacaoDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getPublicacaoDAO();
        boolean result = dao.saveOrUpdatePublicacao(publicacao);
        
        if(result) {
            req.setAttribute("message", "generated.beans.Publicacao.save.ok");
        }
        else req.setAttribute("message", "generated.beans.Publicacao.save.failed");
        
        return showAllPublicacaos(req,resp);
    }
    
    public String showAllPublicacaos(HttpServletRequest req, HttpServletResponse resp) {
        PublicacaoDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getPublicacaoDAO();
        
        List<Publicacao> allPublicacaos = dao.getAllPublicacaos();
        
        req.setAttribute("allPublicacaos", allPublicacaos);
        
        return PUBLICACAO_LIST_PAGE;
    }

    public String showAllPublicacaosForSelection(HttpServletRequest req, HttpServletResponse resp) {
        PublicacaoDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getPublicacaoDAO();
        
        List<Publicacao> allPublicacaos = dao.getAllPublicacaos();
        
        req.setAttribute("allElements", allPublicacaos);
        
        req.setAttribute("currentlySelectedMessageKey", "generated.beans.Publicacao.currentlySelected.label");
        req.setAttribute("selectMessageKey", "generated.beans.Publicacao.select.label");
        
        return PUBLICACAO_LIST_PAGE_FOR_SELECTION;
    }

    private Publicacao setupPublicacao(String publicacaoIdParameter, String autoresParameter, String localParameter, String dataParameter, String areaParameter) {
        Publicacao publicacao = new Publicacao();
        if(publicacaoIdParameter != null && publicacaoIdParameter.trim().length()>0)
            publicacao.setPublicacaoId(Long.parseLong(publicacaoIdParameter));

		
		
		publicacao.setAutores(autoresParameter);
		
		
        
        
        
        
		
        
		
		
		publicacao.setLocal(localParameter);
		
		
        
        
        
        
		
        
		
		
		publicacao.setData(dataParameter);
		
		
        
        
        
        
		
        
		
		
        
        if(areaParameter != null && areaParameter.length() > 0) {
            generated.beans.AreaDePesquisa area = new generated.beans.AreaDePesquisa();
            area.setAreaDePesquisaId(Long.parseLong(areaParameter));
            publicacao.setArea(area);
        }
        
            
        return publicacao;
    }
}
