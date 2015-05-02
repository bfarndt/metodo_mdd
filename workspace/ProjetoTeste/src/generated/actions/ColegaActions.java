
package generated.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import core.database.DefaultDAOFactoryProvider;
import generated.daos.ColegaDAO;
import generated.beans.Colega;

public class ColegaActions {
    public final static String COLEGA_EDIT_PAGE = "admin/EditColega.jsp";
    public final static String COLEGA_LIST_PAGE = "admin/ListColega.jsp";
    public final static String COLEGA_LIST_PAGE_FOR_SELECTION = "popups/selectReferenceForm.jsp";

    public String loadColegaForm(HttpServletRequest req, HttpServletResponse resp) {
        String colegaIdParameter = req.getParameter("colegaId");
        
        
            
        
            
        
        
        if(colegaIdParameter != null) {
            long colegaId = Long.parseLong(colegaIdParameter);
            ColegaDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getColegaDAO();
            Colega colega = dao.getColega(colegaId);
            if(colega != null) {
                req.setAttribute("colega",colega);

                
                    
                
                    
                

            }
        }
        
        return COLEGA_EDIT_PAGE;
    }
    
    public String deleteColega(HttpServletRequest req, HttpServletResponse resp) {
        String colegaIdParameter = req.getParameter("colegaId");
        ColegaDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getColegaDAO();
        
        long colegaId = Long.parseLong(colegaIdParameter);
        boolean result = dao.deleteColega(colegaId);
        
        if(result) {
            req.setAttribute("message", "generated.beans.Colega.delete.ok");
        }
        else req.setAttribute("message", "generated.beans.Colega.delete.failed");
        
        return showAllColegas(req,resp);
    }
    
    public String saveColega(HttpServletRequest req, HttpServletResponse resp) {
        String colegaIdParameter = req.getParameter("colegaId");
        
            
        String nomeParameter = req.getParameter("nome");
            
            
        
            
        String homepageParameter = req.getParameter("homepage");
            
            
        
        
        
        Colega colega = setupColega(colegaIdParameter, nomeParameter, homepageParameter);
        
        ColegaDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getColegaDAO();
        boolean result = dao.saveOrUpdateColega(colega);
        
        if(result) {
            req.setAttribute("message", "generated.beans.Colega.save.ok");
        }
        else req.setAttribute("message", "generated.beans.Colega.save.failed");
        
        return showAllColegas(req,resp);
    }
    
    public String showAllColegas(HttpServletRequest req, HttpServletResponse resp) {
        ColegaDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getColegaDAO();
        
        List<Colega> allColegas = dao.getAllColegas();
        
        req.setAttribute("allColegas", allColegas);
        
        return COLEGA_LIST_PAGE;
    }

    public String showAllColegasForSelection(HttpServletRequest req, HttpServletResponse resp) {
        ColegaDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getColegaDAO();
        
        List<Colega> allColegas = dao.getAllColegas();
        
        req.setAttribute("allElements", allColegas);
        
        req.setAttribute("currentlySelectedMessageKey", "generated.beans.Colega.currentlySelected.label");
        req.setAttribute("selectMessageKey", "generated.beans.Colega.select.label");
        
        return COLEGA_LIST_PAGE_FOR_SELECTION;
    }

    private Colega setupColega(String colegaIdParameter, String nomeParameter, String homepageParameter) {
        Colega colega = new Colega();
        if(colegaIdParameter != null && colegaIdParameter.trim().length()>0)
            colega.setColegaId(Long.parseLong(colegaIdParameter));

		
		
		colega.setNome(nomeParameter);
		
		
        
        
        
        
		
        
		
		
		colega.setHomepage(homepageParameter);
		
		
        
        
        
        
		
        
		
		
        
            
        return colega;
    }
}
