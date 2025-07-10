// Counting Sort - Sort Student Ages
public class CountingSort_StudentAges {
    public static void countingSort(int[] ages, int maxAge) {
        int[] count = new int[maxAge + 1];
        for (int age : ages) {
            count[age]++;
        }

        int index = 0;
        for (int i = 0; i <= maxAge; i++) {
            while (count[i]-- > 0) {
                ages[index++] = i;
            }
        }
    }

    public static void main(String[] args) {
        int[] ages = {14, 16, 13, 18, 11, 12, 10, 13, 15};
        countingSort(ages, 18);
        System.out.print("Sorted Ages: ");
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}
