import java.util.*;

public class SetOperations {
    public static Set<Integer> union(Set<Integer> a, Set<Integer> b) {
        Set<Integer> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    public static Set<Integer> intersection(Set<Integer> a, Set<Integer> b) {
        Set<Integer> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }

    public static Set<Integer> symmetricDifference(Set<Integer> a, Set<Integer> b) {
        Set<Integer> result = new HashSet<>(a);
        result.addAll(b);
        Set<Integer> common = new HashSet<>(a);
        common.retainAll(b);
        result.removeAll(common);
        return result;
    }
}