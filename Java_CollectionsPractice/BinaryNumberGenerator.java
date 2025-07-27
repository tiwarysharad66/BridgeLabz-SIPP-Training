import java.util.*;

public class BinaryNumberGenerator {
    public static List<String> generateBinaryNumbers(int n) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        while (n-- > 0) {
            String binary = queue.remove();
            result.add(binary);
            queue.add(binary + "0");
            queue.add(binary + "1");
        }
        return result;
    }
}