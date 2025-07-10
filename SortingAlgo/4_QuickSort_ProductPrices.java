// Quick Sort - Sort Product Prices
public class QuickSort_ProductPrices {
    public static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            int pi = partition(prices, low, high);
            quickSort(prices, low, pi - 1);
            quickSort(prices, pi + 1, high);
        }
    }

    public static int partition(int[] prices, int low, int high) {
        int pivot = prices[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (prices[j] < pivot) {
                i++;
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] prices = {999, 799, 1499, 399, 599};
        quickSort(prices, 0, prices.length - 1);
        System.out.print("Sorted Product Prices: ");
        for (int price : prices) {
            System.out.print(price + " ");
        }
    }
}
