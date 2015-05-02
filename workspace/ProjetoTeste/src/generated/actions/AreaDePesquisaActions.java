
package generated.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import core.database.DefaultDAOFactoryProvider;
import generated.daos.AreaDePesquisaDAO;
import generated.beans.AreaDePesquisa;

public class AreaDePesquisaActions {
    public final static String AREADEPESQUISA_EDIT_PAGE = "admin/EditAreaDePesquisa.jsp";
    public final static String AREADEPESQUISA_LIST_PAGE = "admin/ListAreaDePesquisa.jsp";
    public final static String AREADEPESQUISA_LIST_PAGE_FOR_SELECTION = "popups/selectReferenceForm.jsp";

    public String loadAreaDePesquisaForm(HttpServletRequest req, HttpServletResponse resp) {
        String areaDePesquisaIdParameter = req.getParameter("areaDePesquisaId");
        
        
            
        
            
        
        
        if(areaDePesquisaIdParameter != null) {
            long areaDePesquisaId = Long.parseLong(areaDePesquisaIdParameter);
            AreaDePesquisaDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getAreaDePesquisaDAO();
            AreaDePesquisa areaDePesquisa = dao.getAreaDePesquisa(areaDePesquisaId);
            if(areaDePesquisa != null) {
                req.setAttribute("areaDePesquisa",areaDePesquisa);

                
                    
                
                    
                

            }
        }
        
        return AREADEPESQUISA_EDIT_PAGE;
    }
    
    public String deleteAreaDePesquisa(HttpServletRequest req, HttpServletResponse resp) {
        String areaDePesquisaIdParameter = req.getParameter("areaDePesquisaId");
        AreaDePesquisaDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getAreaDePesquisaDAO();
        
        long areaDePesquisaId = Long.parseLong(areaDePesquisaIdParameter);
        boolean result = dao.deleteAreaDePesquisa(areaDePesquisaId);
        
        if(result) {
            req.setAttribute("message", "generated.beans.AreaDePesquisa.delete.ok");
        }
        else req.setAttribute("message", "generated.beans.AreaDePesquisa.delete.failed");
        
        return showAllAreaDePesquisas(req,resp);
    }
    
    public String saveAreaDePesquisa(HttpServletRequest req, HttpServletResponse resp) {
        String areaDePesquisaIdParameter = req.getParameter("areaDePesquisaId");
        
            
        String nomeParameter = req.getParameter("nome");
            
            
        
            
        String descricaoParameter = req.getParameter("descricao");
            
            
        
        
        
        AreaDePesquisa areaDePesquisa = setupAreaDePesquisa(areaDePesquisaIdParameter, nomeParameter, descricaoParameter);
        
        AreaDePesquisaDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getAreaDePesquisaDAO();
        boolean result = dao.saveOrUpdateAreaDePesquisa(areaDePesquisa);
        
        if(result) {
            req.setAttribute("message", "generated.beans.AreaDePesquisa.save.ok");
        }
        else req.setAttribute("message", "generated.beans.AreaDePesquisa.save.failed");
        
        return showAllAreaDePesquisas(req,resp);
    }
    
    public String showAllAreaDePesquisas(HttpServletRequest req, HttpServletResponse resp) {
        AreaDePesquisaDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getAreaDePesquisaDAO();
        
        List<AreaDePesquisa> allAreaDePesquisas = dao.getAllAreaDePesquisas();
        
        req.setAttribute("allAreaDePesquisas", allAreaDePesquisas);
        
        return AREADEPESQUISA_LIST_PAGE;
    }

    public String showAllAreaDePesquisasForSelection(HttpServletRequest req, HttpServletResponse resp) {
        AreaDePesquisaDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getAreaDePesquisaDAO();
        
        List<AreaDePesquisa> allAreaDePesquisas = dao.getAllAreaDePesquisas();
        
        req.setAttribute("allElements", allAreaDePesquisas);
        
        req.setAttribute("currentlySelectedMessageKey", "generated.beans.AreaDePesquisa.currentlySelected.label");
        req.setAttribute("selectMessageKey", "generated.beans.AreaDePesquisa.select.label");
        
        return AREADEPESQUISA_LIST_PAGE_FOR_SELECTION;
    }

    private AreaDePesquisa setupAreaDePesquisa(String areaDePesquisaIdParameter, String nomeParameter, String descricaoParameter) {
        AreaDePesquisa areaDePesquisa = new AreaDePesquisa();
        if(areaDePesquisaIdParameter != null && areaDePesquisaIdParameter.trim().length()>0)
            areaDePesquisa.setAreaDePesquisaId(Long.parseLong(areaDePesquisaIdParameter));

		
		
		areaDePesquisa.setNome(nomeParameter);
		
		
        
        
        
        
		
        
		
		
		areaDePesquisa.setDescricao(descricaoParameter);
		
		
        
        
        
        
		
        
		
		
        
            
        return areaDePesquisa;
    }
}
