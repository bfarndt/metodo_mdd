package core.database;

import java.sql.Connection;

public class BaseDAO {
    private ConnectionProvider connectionProvider;
    
    public void setConnectionProvider(ConnectionProvider connectionProvider) {
        this.connectionProvider = connectionProvider;
    }
    
    protected Connection getConnection() {
        return connectionProvider.getConnection(); 
    }
    
    protected void returnConnection(Connection conn) {
        connectionProvider.returnConnection(conn);
    }
}
