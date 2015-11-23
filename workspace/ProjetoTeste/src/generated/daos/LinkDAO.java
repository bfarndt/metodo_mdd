package generated.daos;

import java.util.List;

import core.database.BaseDAO;
import generated.beans.Link;

public abstract class LinkDAO extends BaseDAO {
    public abstract List<Link> getAllLinks();
    public abstract Link getLink(long linkIdParameter);
    public abstract boolean saveOrUpdateLink(Link link);
    public abstract boolean insertLink(Link link);
    public abstract boolean updateLink(Link link);
    public abstract boolean deleteLink(long linkId);
}
