import java.util.*;

public class WordFrequencyCounter {
    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> map = new HashMap<>();
        text = text.toLowerCase().replaceAll("[^a-z\s]", "");
        for (String word : text.split("\s+")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }
}