/*
 * ServletsHelper.java
 *
 * Created on 28 de Fevereiro de 2007, 17:54
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package core.helpers;

import java.io.File;
import javax.servlet.ServletContext;

/**
 *
 * @author lucredio
 */
public class ServletsHelper {
    private final static String URL_PATH_SEPARATOR = "/";
    
    public static String getJspFolder(String servletPath) {
        String ret = ".";
        int index = servletPath.lastIndexOf(URL_PATH_SEPARATOR);
        if(index != -1)
            ret += servletPath.substring(0,index);
        ret += "/";
        return ret;
    }
    
    public static boolean existsFile(ServletContext context, String relativePath) {
        String realPath = context.getRealPath(URL_PATH_SEPARATOR);
        File f = new File(realPath+relativePath);
        return f.exists();
    }
}
