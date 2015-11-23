package generated.daos;

import java.util.List;

import core.database.BaseDAO;
import generated.beans.AreaDePesquisa;

public abstract class AreaDePesquisaDAO extends BaseDAO {
    public abstract List<AreaDePesquisa> getAllAreaDePesquisas();
    public abstract AreaDePesquisa getAreaDePesquisa(long areaDePesquisaIdParameter);
    public abstract boolean saveOrUpdateAreaDePesquisa(AreaDePesquisa areaDePesquisa);
    public abstract boolean insertAreaDePesquisa(AreaDePesquisa areaDePesquisa);
    public abstract boolean updateAreaDePesquisa(AreaDePesquisa areaDePesquisa);
    public abstract boolean deleteAreaDePesquisa(long areaDePesquisaId);
}
