// Insertion Sort - Sort Employee IDs
public class InsertionSort_EmployeeIDs {
    public static void insertionSort(int[] ids) {
        for (int i = 1; i < ids.length; i++) {
            int key = ids[i];
            int j = i - 1;
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j = j - 1;
            }
            ids[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] ids = {105, 101, 110, 102, 108};
        insertionSort(ids);
        System.out.print("Sorted Employee IDs: ");
        for (int id : ids) {
            System.out.print(id + " ");
        }
    }
}
