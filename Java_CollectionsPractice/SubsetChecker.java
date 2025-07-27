import java.util.*;

public class SubsetChecker {
    public static boolean isSubset(Set<?> subset, Set<?> superset) {
        return superset.containsAll(subset);
    }
}