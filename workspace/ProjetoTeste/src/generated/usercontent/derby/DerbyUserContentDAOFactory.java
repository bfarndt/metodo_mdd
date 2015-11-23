package generated.usercontent.derby;

import core.database.ConnectionProvider;
import generated.usercontent.UserContentDAO;
import generated.usercontent.UserContentDAOAbstractFactory;

public class DerbyUserContentDAOFactory extends UserContentDAOAbstractFactory {
    ConnectionProvider connectionProvider;
    
    public DerbyUserContentDAOFactory(ConnectionProvider connectionProvider) {
        this.connectionProvider = connectionProvider;
    }
	
	@Override
	public UserContentDAO getUserContentDAO() {
        UserContentDAO dao = new DerbyUserContentDAO();
        dao.setConnectionProvider(connectionProvider);
        return dao;
	}
}
