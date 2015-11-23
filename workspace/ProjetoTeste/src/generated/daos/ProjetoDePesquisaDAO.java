package generated.daos;

import java.util.List;

import core.database.BaseDAO;
import generated.beans.ProjetoDePesquisa;

public abstract class ProjetoDePesquisaDAO extends BaseDAO {
    public abstract List<ProjetoDePesquisa> getAllProjetoDePesquisas();
    public abstract ProjetoDePesquisa getProjetoDePesquisa(long projetoDePesquisaIdParameter);
    public abstract boolean saveOrUpdateProjetoDePesquisa(ProjetoDePesquisa projetoDePesquisa);
    public abstract boolean insertProjetoDePesquisa(ProjetoDePesquisa projetoDePesquisa);
    public abstract boolean updateProjetoDePesquisa(ProjetoDePesquisa projetoDePesquisa);
    public abstract boolean deleteProjetoDePesquisa(long projetoDePesquisaId);
}
