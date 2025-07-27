import java.util.*;

public class MaxValueKeyFinder {
    public static String getMaxValueKey(Map<String, Integer> map) {
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}