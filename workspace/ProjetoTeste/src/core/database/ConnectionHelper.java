package core.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionHelper {
    private static HashMap <String,DataSource> dsObjects = new HashMap<String,DataSource>();
    
    public static Connection getConnection(String resourceName) {
        DataSource ds = dsObjects.get(resourceName);
        if(ds == null) {
            try {
                final Context initCtx = new InitialContext();
                final Context envCtx = (Context) initCtx.lookup("java:/comp/env");
                ds = (DataSource) envCtx.lookup(resourceName);
                if(ds != null)
                    dsObjects.put(resourceName,ds);
                
            } catch (final NamingException ne) {
                ne.printStackTrace();
            }
        }
        if(ds != null) {
            try {
                return ds.getConnection();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        throw new RuntimeException("Error getting database connection!");
    }
}
