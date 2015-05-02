
package generated.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import core.database.DefaultDAOFactoryProvider;
import generated.daos.ProjetoDePesquisaDAO;
import generated.beans.ProjetoDePesquisa;

public class ProjetoDePesquisaActions {
    public final static String PROJETODEPESQUISA_EDIT_PAGE = "admin/EditProjetoDePesquisa.jsp";
    public final static String PROJETODEPESQUISA_LIST_PAGE = "admin/ListProjetoDePesquisa.jsp";
    public final static String PROJETODEPESQUISA_LIST_PAGE_FOR_SELECTION = "popups/selectReferenceForm.jsp";

    public String loadProjetoDePesquisaForm(HttpServletRequest req, HttpServletResponse resp) {
        String projetoDePesquisaIdParameter = req.getParameter("projetoDePesquisaId");
        
        
            
        
            
        
            
        
            
        
        
        if(projetoDePesquisaIdParameter != null) {
            long projetoDePesquisaId = Long.parseLong(projetoDePesquisaIdParameter);
            ProjetoDePesquisaDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getProjetoDePesquisaDAO();
            ProjetoDePesquisa projetoDePesquisa = dao.getProjetoDePesquisa(projetoDePesquisaId);
            if(projetoDePesquisa != null) {
                req.setAttribute("projetoDePesquisa",projetoDePesquisa);

                
                    
                
                    
                
                    
                
                    
                

            }
        }
        
        return PROJETODEPESQUISA_EDIT_PAGE;
    }
    
    public String deleteProjetoDePesquisa(HttpServletRequest req, HttpServletResponse resp) {
        String projetoDePesquisaIdParameter = req.getParameter("projetoDePesquisaId");
        ProjetoDePesquisaDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getProjetoDePesquisaDAO();
        
        long projetoDePesquisaId = Long.parseLong(projetoDePesquisaIdParameter);
        boolean result = dao.deleteProjetoDePesquisa(projetoDePesquisaId);
        
        if(result) {
            req.setAttribute("message", "generated.beans.ProjetoDePesquisa.delete.ok");
        }
        else req.setAttribute("message", "generated.beans.ProjetoDePesquisa.delete.failed");
        
        return showAllProjetoDePesquisas(req,resp);
    }
    
    public String saveProjetoDePesquisa(HttpServletRequest req, HttpServletResponse resp) {
        String projetoDePesquisaIdParameter = req.getParameter("projetoDePesquisaId");
        
            
        String tituloParameter = req.getParameter("titulo");
            
            
        
            
        String descricaoParameter = req.getParameter("descricao");
            
            
        
            
        String dataInicioParameter = req.getParameter("dataInicio");
            
            
        
            
        String dataFimParameter = req.getParameter("dataFim");
            
            
        
        
        String apoioParameter = req.getParameter("apoio");
        
        String areaParameter = req.getParameter("area");
        
        
        ProjetoDePesquisa projetoDePesquisa = setupProjetoDePesquisa(projetoDePesquisaIdParameter, tituloParameter, descricaoParameter, dataInicioParameter, dataFimParameter, apoioParameter, areaParameter);
        
        ProjetoDePesquisaDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getProjetoDePesquisaDAO();
        boolean result = dao.saveOrUpdateProjetoDePesquisa(projetoDePesquisa);
        
        if(result) {
            req.setAttribute("message", "generated.beans.ProjetoDePesquisa.save.ok");
        }
        else req.setAttribute("message", "generated.beans.ProjetoDePesquisa.save.failed");
        
        return showAllProjetoDePesquisas(req,resp);
    }
    
    public String showAllProjetoDePesquisas(HttpServletRequest req, HttpServletResponse resp) {
        ProjetoDePesquisaDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getProjetoDePesquisaDAO();
        
        List<ProjetoDePesquisa> allProjetoDePesquisas = dao.getAllProjetoDePesquisas();
        
        req.setAttribute("allProjetoDePesquisas", allProjetoDePesquisas);
        
        return PROJETODEPESQUISA_LIST_PAGE;
    }

    public String showAllProjetoDePesquisasForSelection(HttpServletRequest req, HttpServletResponse resp) {
        ProjetoDePesquisaDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getProjetoDePesquisaDAO();
        
        List<ProjetoDePesquisa> allProjetoDePesquisas = dao.getAllProjetoDePesquisas();
        
        req.setAttribute("allElements", allProjetoDePesquisas);
        
        req.setAttribute("currentlySelectedMessageKey", "generated.beans.ProjetoDePesquisa.currentlySelected.label");
        req.setAttribute("selectMessageKey", "generated.beans.ProjetoDePesquisa.select.label");
        
        return PROJETODEPESQUISA_LIST_PAGE_FOR_SELECTION;
    }

    private ProjetoDePesquisa setupProjetoDePesquisa(String projetoDePesquisaIdParameter, String tituloParameter, String descricaoParameter, String dataInicioParameter, String dataFimParameter, String apoioParameter, String areaParameter) {
        ProjetoDePesquisa projetoDePesquisa = new ProjetoDePesquisa();
        if(projetoDePesquisaIdParameter != null && projetoDePesquisaIdParameter.trim().length()>0)
            projetoDePesquisa.setProjetoDePesquisaId(Long.parseLong(projetoDePesquisaIdParameter));

		
		
		projetoDePesquisa.setTitulo(tituloParameter);
		
		
        
        
        
        
		
        
		
		
		projetoDePesquisa.setDescricao(descricaoParameter);
		
		
        
        
        
        
		
        
		
		
		
        
        
        
        
		
        try {
            if(dataInicioParameter != null && dataInicioParameter.trim().length()>0) {
                java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
                projetoDePesquisa.setDataInicio(sdf.parse(dataInicioParameter));
            }
        }
        catch(java.text.ParseException pe) {
            pe.printStackTrace();
        }
		
        
		
		
		
        
        
        
        
		
        try {
            if(dataFimParameter != null && dataFimParameter.trim().length()>0) {
                java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
                projetoDePesquisa.setDataFim(sdf.parse(dataFimParameter));
            }
        }
        catch(java.text.ParseException pe) {
            pe.printStackTrace();
        }
		
        
		
		
        
        if(apoioParameter != null && apoioParameter.length() > 0) {
            generated.beans.Suporte apoio = new generated.beans.Suporte();
            apoio.setSuporteId(Long.parseLong(apoioParameter));
            projetoDePesquisa.setApoio(apoio);
        }
        
        if(areaParameter != null && areaParameter.length() > 0) {
            generated.beans.AreaDePesquisa area = new generated.beans.AreaDePesquisa();
            area.setAreaDePesquisaId(Long.parseLong(areaParameter));
            projetoDePesquisa.setArea(area);
        }
        
            
        return projetoDePesquisa;
    }
}
