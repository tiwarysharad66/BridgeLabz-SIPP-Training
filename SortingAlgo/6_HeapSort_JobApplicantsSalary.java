// Heap Sort - Sort Job Applicants by Salary
public class HeapSort_JobApplicantsSalary {
    public static void heapSort(int[] salaries) {
        int n = salaries.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(salaries, n, i);
        for (int i = n - 1; i >= 0; i--) {
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;
            heapify(salaries, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest])
            largest = l;
        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] salaries = {45000, 32000, 60000, 41000, 38000};
        heapSort(salaries);
        System.out.print("Sorted Salaries: ");
        for (int salary : salaries) {
            System.out.print(salary + " ");
        }
    }
}
