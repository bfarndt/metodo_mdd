package generated.daos;

import java.util.List;

import core.database.BaseDAO;
import generated.beans.Suporte;

public abstract class SuporteDAO extends BaseDAO {
    public abstract List<Suporte> getAllSuportes();
    public abstract Suporte getSuporte(long suporteIdParameter);
    public abstract boolean saveOrUpdateSuporte(Suporte suporte);
    public abstract boolean insertSuporte(Suporte suporte);
    public abstract boolean updateSuporte(Suporte suporte);
    public abstract boolean deleteSuporte(long suporteId);
}
