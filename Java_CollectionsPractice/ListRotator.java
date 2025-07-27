import java.util.*;

public class ListRotator {
    public static List<Integer> rotate(List<Integer> list, int k) {
        int n = list.size();
        List<Integer> rotated = new ArrayList<>();
        for (int i = k; i < n; i++) rotated.add(list.get(i));
        for (int i = 0; i < k; i++) rotated.add(list.get(i));
        return rotated;
    }
}