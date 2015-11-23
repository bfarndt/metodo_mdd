
package generated.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import core.database.DefaultDAOFactoryProvider;
import generated.daos.LinkDAO;
import generated.beans.Link;

public class LinkActions {
    public final static String LINK_EDIT_PAGE = "admin/EditLink.jsp";
    public final static String LINK_LIST_PAGE = "admin/ListLink.jsp";
    public final static String LINK_LIST_PAGE_FOR_SELECTION = "popups/selectReferenceForm.jsp";

    public String loadLinkForm(HttpServletRequest req, HttpServletResponse resp) {
        String linkIdParameter = req.getParameter("linkId");
        
        
            
        
            
        
        
        if(linkIdParameter != null) {
            long linkId = Long.parseLong(linkIdParameter);
            LinkDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getLinkDAO();
            Link link = dao.getLink(linkId);
            if(link != null) {
                req.setAttribute("link",link);

                
                    
                
                    
                

            }
        }
        
        return LINK_EDIT_PAGE;
    }
    
    public String deleteLink(HttpServletRequest req, HttpServletResponse resp) {
        String linkIdParameter = req.getParameter("linkId");
        LinkDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getLinkDAO();
        
        long linkId = Long.parseLong(linkIdParameter);
        boolean result = dao.deleteLink(linkId);
        
        if(result) {
            req.setAttribute("message", "generated.beans.Link.delete.ok");
        }
        else req.setAttribute("message", "generated.beans.Link.delete.failed");
        
        return showAllLinks(req,resp);
    }
    
    public String saveLink(HttpServletRequest req, HttpServletResponse resp) {
        String linkIdParameter = req.getParameter("linkId");
        
            
        String tituloParameter = req.getParameter("titulo");
            
            
        
            
        String urlParameter = req.getParameter("url");
            
            
        
        
        
        Link link = setupLink(linkIdParameter, tituloParameter, urlParameter);
        
        LinkDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getLinkDAO();
        boolean result = dao.saveOrUpdateLink(link);
        
        if(result) {
            req.setAttribute("message", "generated.beans.Link.save.ok");
        }
        else req.setAttribute("message", "generated.beans.Link.save.failed");
        
        return showAllLinks(req,resp);
    }
    
    public String showAllLinks(HttpServletRequest req, HttpServletResponse resp) {
        LinkDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getLinkDAO();
        
        List<Link> allLinks = dao.getAllLinks();
        
        req.setAttribute("allLinks", allLinks);
        
        return LINK_LIST_PAGE;
    }

    public String showAllLinksForSelection(HttpServletRequest req, HttpServletResponse resp) {
        LinkDAO dao = DefaultDAOFactoryProvider.getDefaultDAOFactoryInstance().getLinkDAO();
        
        List<Link> allLinks = dao.getAllLinks();
        
        req.setAttribute("allElements", allLinks);
        
        req.setAttribute("currentlySelectedMessageKey", "generated.beans.Link.currentlySelected.label");
        req.setAttribute("selectMessageKey", "generated.beans.Link.select.label");
        
        return LINK_LIST_PAGE_FOR_SELECTION;
    }

    private Link setupLink(String linkIdParameter, String tituloParameter, String urlParameter) {
        Link link = new Link();
        if(linkIdParameter != null && linkIdParameter.trim().length()>0)
            link.setLinkId(Long.parseLong(linkIdParameter));

		
		
		link.setTitulo(tituloParameter);
		
		
        
        
        
        
		
        
		
		
		link.setUrl(urlParameter);
		
		
        
        
        
        
		
        
		
		
        
            
        return link;
    }
}
