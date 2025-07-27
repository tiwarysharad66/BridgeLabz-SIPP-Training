import java.util.*;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int num : list) {
            if (!seen.contains(num)) {
                seen.add(num);
                result.add(num);
            }
        }
        return result;
    }
}