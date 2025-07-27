import java.util.ArrayList;
import java.util.List;

public class ListReverseArrayList {
    public static List<Integer> reverse(List<Integer> list) {
        List<Integer> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }
}