import java.util.*;

public class SearchDataStructureComparison {
    public static void main(String[] args) {
        int size = 1_000_000;
        int target = size - 1;

        int[] array = new int[size];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < size; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        long start = System.nanoTime();
        for (int i : array) {
            if (i == target) break;
        }
        long end = System.nanoTime();
        System.out.println("Array Search Time: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        hashSet.contains(target);
        end = System.nanoTime();
        System.out.println("HashSet Search Time: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        treeSet.contains(target);
        end = System.nanoTime();
        System.out.println("TreeSet Search Time: " + (end - start) / 1e6 + " ms");
    }
}