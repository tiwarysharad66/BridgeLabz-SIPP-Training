import java.util.*;

public class FrequencyCounter {
    public static Map<String, Integer> countFrequency(List<String> items) {
        Map<String, Integer> freq = new HashMap<>();
        for (String item : items) {
            freq.put(item, freq.getOrDefault(item, 0) + 1);
        }
        return freq;
    }
}