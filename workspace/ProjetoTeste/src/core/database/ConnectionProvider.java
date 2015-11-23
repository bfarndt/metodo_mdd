package core.database;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionProvider {
    public final static String DERBY = "jdbc/WebDomainDB";
    
    private String resourceName;
    
    public ConnectionProvider(String resourceName) {
        this.resourceName = resourceName;
    }
    
    public Connection getConnection() {
        return ConnectionHelper.getConnection(resourceName);
    }
    
    public void returnConnection(Connection conn) {
        try {
            conn.close();
        }
        catch(SQLException se) {
            se.printStackTrace();
        }
    }
}
