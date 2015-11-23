package generated.usercontent;

import java.util.List;

import core.database.BaseDAO;

public abstract class UserContentDAO extends BaseDAO {
    public abstract List<UserContent> getAllUserContent(String entity, long entityId);
    public abstract boolean insertUserContent(String entityName, long entityId, String title, String content, String name, String email);

    public abstract boolean approveUserContent(long userContentId);
    public abstract boolean deleteUserContent(long userContentId);
    public abstract List<UserContent> getUnapprovedUserContent();

}
