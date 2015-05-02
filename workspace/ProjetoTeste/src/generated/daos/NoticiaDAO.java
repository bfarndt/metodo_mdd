package generated.daos;

import java.util.List;

import core.database.BaseDAO;
import generated.beans.Noticia;

public abstract class NoticiaDAO extends BaseDAO {
    public abstract List<Noticia> getAllNoticias();
    public abstract Noticia getNoticia(long noticiaIdParameter);
    public abstract boolean saveOrUpdateNoticia(Noticia noticia);
    public abstract boolean insertNoticia(Noticia noticia);
    public abstract boolean updateNoticia(Noticia noticia);
    public abstract boolean deleteNoticia(long noticiaId);
}
