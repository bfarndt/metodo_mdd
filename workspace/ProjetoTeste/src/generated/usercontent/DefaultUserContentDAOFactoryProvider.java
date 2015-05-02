package generated.usercontent;

import core.database.ConnectionProvider;
import generated.usercontent.derby.DerbyUserContentDAOFactory;

public class DefaultUserContentDAOFactoryProvider {
    private static UserContentDAOAbstractFactory theInstance = null;
    
    public static UserContentDAOAbstractFactory getDefaultDAOFactoryInstance() {
        if(theInstance == null)
            theInstance = new DerbyUserContentDAOFactory(new ConnectionProvider(ConnectionProvider.DERBY));
        return theInstance;
    }	
}
