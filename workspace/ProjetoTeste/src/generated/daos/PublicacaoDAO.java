package generated.daos;

import java.util.List;

import core.database.BaseDAO;
import generated.beans.Publicacao;

public abstract class PublicacaoDAO extends BaseDAO {
    public abstract List<Publicacao> getAllPublicacaos();
    public abstract Publicacao getPublicacao(long publicacaoIdParameter);
    public abstract boolean saveOrUpdatePublicacao(Publicacao publicacao);
    public abstract boolean insertPublicacao(Publicacao publicacao);
    public abstract boolean updatePublicacao(Publicacao publicacao);
    public abstract boolean deletePublicacao(long publicacaoId);
}
