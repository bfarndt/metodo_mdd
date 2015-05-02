package core.controller;
/*
 * ActionDispatcher.java
 *
 * Created on 21 de Agosto de 2006, 22:00
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class ActionDispatcher extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    private final static String ACTION_SUFFIX = ".do";
    
    /** Creates a new instance of ActionDispatcher */
    public ActionDispatcher() {
    }
    
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //req.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("ISO-8859-1");
        
        resp.setCharacterEncoding("ISO-8859-1");
        resp.setHeader("Cache-Control","no-cache"); //HTTP 1.1
        resp.setHeader("Pragma","no-cache"); //HTTP 1.0
        resp.setDateHeader("Expires", 0); //prevents caching at the proxy server
        
        String servletPath = req.getServletPath();
        int index1 = servletPath.lastIndexOf('/');
        if(index1 == -1)
            index1 = servletPath.lastIndexOf('\\');
        
        int index2 = servletPath.lastIndexOf(ACTION_SUFFIX);
        String strAction = servletPath.substring(index1+1,index2);
        
        int index3 = strAction.lastIndexOf('.');
        
        String actionType = strAction.substring(0,index3);
        String action = strAction.substring(index3+1);
        
        if(actionType == null || actionType.trim().equalsIgnoreCase("")) throw new RuntimeException("Action type not defined!");
        if(action == null || action.trim().equalsIgnoreCase("")) throw new RuntimeException("Action not defined!");
        
        try {
            Class<?> actionClass = Class.forName(actionType);
            Object actionObject = actionClass.newInstance();
            Method actionMethod = actionClass.getMethod(action,new Class[] {HttpServletRequest.class, HttpServletResponse.class});
            Object ret = actionMethod.invoke(actionObject,new Object[] {req,resp});
            
            if(ret == null) {
                //req.getRequestDispatcher(ERROR_PAGE).forward(req,resp);
                return;
            }
            if(!(ret instanceof String)) {
                throw new RuntimeException("Return type on action "+actionType+"."+action+" must be a String");
            }
            
            req.getRequestDispatcher((String)ret).forward(req,resp);
        } catch(ClassNotFoundException cnfe) {
            throw new RuntimeException("Action type not found: "+actionType);
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Error instantiating action: "+actionType+"."+action+". See log for details.");
        } catch (InstantiationException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Error instantiating action: "+actionType+". See log for details.");
        } catch(NoSuchMethodException nsme) {
            throw new RuntimeException("Action not found for action type:"+actionType);
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Error executing action: "+actionType+"."+action+". See log for details.");
        } catch (InvocationTargetException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Error executing action: "+actionType+"."+action+". See log for details.");
        }
    }
}