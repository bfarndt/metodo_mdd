package core.database;

import generated.daos.DAOAbstractFactory;
import generated.daos.derby.DerbyDAOFactory;

public class DefaultDAOFactoryProvider {
    private static DAOAbstractFactory theInstance = null;
    
    public static DAOAbstractFactory getDefaultDAOFactoryInstance() {
        if(theInstance == null)
            theInstance = new DerbyDAOFactory(new ConnectionProvider(ConnectionProvider.DERBY));
        return theInstance;
    }
}
