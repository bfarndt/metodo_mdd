package core.helpers;

import java.util.Collection;

/**
 * Testando alguma edi��o
 * @author lucredio
 */
public class CollectionHelper {
    public static boolean belongsTo(Collection<?> collection, Object element) {
        return collection.contains(element);
    }
}
