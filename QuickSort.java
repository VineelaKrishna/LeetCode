public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 4, 3, 5, 6, 9, 8, 7, 1, 2 };
        int length = arr.length;
        quickSort(arr, 0, length - 1);
        System.out.println("Sorted array: ");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        System.out.println("-----------");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            int pivot = partition(arr, l, r);
            quickSort(arr, l, pivot - 1);
            quickSort(arr, pivot + 1, r);
        }
    }

    static int partition(int[] arr, int l, int r) {
        // pivot
        int pivot = arr[r];
        int i = (l - 1);
        for (int j = l; j <= r - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, r);
        return (i + 1);
    }
}
