package generated.daos;

import java.util.List;

import core.database.BaseDAO;
import generated.beans.Colega;

public abstract class ColegaDAO extends BaseDAO {
    public abstract List<Colega> getAllColegas();
    public abstract Colega getColega(long colegaIdParameter);
    public abstract boolean saveOrUpdateColega(Colega colega);
    public abstract boolean insertColega(Colega colega);
    public abstract boolean updateColega(Colega colega);
    public abstract boolean deleteColega(long colegaId);
}
