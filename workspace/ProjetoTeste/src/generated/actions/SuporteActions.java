
package generated.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import core.database.DefaultDAOFactoryProvider;
import generated.daos.SuporteDAO;
import generated.beans.Suporte;

public class SuporteActions {
    public final static String SUPORTE_EDIT_PAGE = "admin/EditSuporte.jsp";
    public final static String SUPORTE_LIST_PAGE = "admin/ListSuporte.jsp";
    public final static String SUPORTE_LIST_PAGE_FOR_SELECTION = "popups/selectReferenceForm.jsp";

    public String loadSuporteForm(HttpServletRequest req, HttpServletResponse resp) {
        String suporteIdParameter = req.getParameter("suporteId");
        
        
            
        
            
        req.getSession().removeAttribute("SuporteiconeContentType");
        req.getSession().removeAttribute("Suporteicone");
            
        
            
        
        
        if(suporteIdParameter != null) {
            long suporteId = Long.parseLong(suporteIdParameter);
            SuporteDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getSuporteDAO();
            Suporte suporte = dao.getSuporte(suporteId);
            if(suporte != null) {
                req.setAttribute("suporte",suporte);

                
                    
                
                    
                req.getSession().setAttribute("SuporteiconeContentType",suporte.getIconeContentType());
                req.getSession().setAttribute("Suporteicone",suporte.getIcone());
                    
                
                    
                

            }
        }
        
        return SUPORTE_EDIT_PAGE;
    }
    
    public String deleteSuporte(HttpServletRequest req, HttpServletResponse resp) {
        String suporteIdParameter = req.getParameter("suporteId");
        SuporteDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getSuporteDAO();
        
        long suporteId = Long.parseLong(suporteIdParameter);
        boolean result = dao.deleteSuporte(suporteId);
        
        if(result) {
            req.setAttribute("message", "generated.beans.Suporte.delete.ok");
        }
        else req.setAttribute("message", "generated.beans.Suporte.delete.failed");
        
        return showAllSuportes(req,resp);
    }
    
    public String saveSuporte(HttpServletRequest req, HttpServletResponse resp) {
        String suporteIdParameter = req.getParameter("suporteId");
        
            
        String agenciaParameter = req.getParameter("agencia");
            
            
        
            
            
        byte[] iconeParameter = (byte[]) req.getSession().getAttribute("Suporteicone");
        if(iconeParameter == null) iconeParameter = new byte[0];
        String iconeContentTypeParameter = (String) req.getSession().getAttribute("SuporteiconeContentType");
            
        
            
            
        
        
        
        Suporte suporte = setupSuporte(suporteIdParameter, agenciaParameter, iconeParameter, iconeContentTypeParameter);
        
        SuporteDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getSuporteDAO();
        boolean result = dao.saveOrUpdateSuporte(suporte);
        
        if(result) {
            req.setAttribute("message", "generated.beans.Suporte.save.ok");
        }
        else req.setAttribute("message", "generated.beans.Suporte.save.failed");
        
        return showAllSuportes(req,resp);
    }
    
    public String showAllSuportes(HttpServletRequest req, HttpServletResponse resp) {
        SuporteDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getSuporteDAO();
        
        List<Suporte> allSuportes = dao.getAllSuportes();
        
        req.setAttribute("allSuportes", allSuportes);
        
        return SUPORTE_LIST_PAGE;
    }

    public String showAllSuportesForSelection(HttpServletRequest req, HttpServletResponse resp) {
        SuporteDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getSuporteDAO();
        
        List<Suporte> allSuportes = dao.getAllSuportes();
        
        req.setAttribute("allElements", allSuportes);
        
        req.setAttribute("currentlySelectedMessageKey", "generated.beans.Suporte.currentlySelected.label");
        req.setAttribute("selectMessageKey", "generated.beans.Suporte.select.label");
        
        return SUPORTE_LIST_PAGE_FOR_SELECTION;
    }

    private Suporte setupSuporte(String suporteIdParameter, String agenciaParameter, byte [] iconeParameter, String iconeContentTypeParameter) {
        Suporte suporte = new Suporte();
        if(suporteIdParameter != null && suporteIdParameter.trim().length()>0)
            suporte.setSuporteId(Long.parseLong(suporteIdParameter));

		
		
		suporte.setAgencia(agenciaParameter);
		
		
        
        
        
        
		
        
		
		
		
        
        
        
        
		
        
        suporte.setIcone(iconeParameter);
        
		
		
		suporte.setIconeContentType(iconeContentTypeParameter);
		
		
        
        
        
        
		
        
		
		
        
            
        return suporte;
    }
}
