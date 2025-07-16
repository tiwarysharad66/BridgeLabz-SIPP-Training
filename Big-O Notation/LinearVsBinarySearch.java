import java.util.*;

public class LinearVsBinarySearch {
    public static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) return true;
        }
        return false;
    }

    public static boolean binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return true;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] data = new int[1_000_000];
        for (int i = 0; i < data.length; i++) data[i] = i;
        int target = 999_999;

        long start = System.nanoTime();
        linearSearch(data, target);
        long end = System.nanoTime();
        System.out.println("Linear Search Time: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        binarySearch(data, target);
        end = System.nanoTime();
        System.out.println("Binary Search Time: " + (end - start) / 1e6 + " ms");
    }
}