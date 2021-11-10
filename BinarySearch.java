public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7, 9 };
        int key = 5;
        int result = bs.binarySearch(input, 0, input.length - 1, key);
        if (result > -1) {
            System.out.println("The element is found at position " + result);
        } else
            System.out.println(key + " is not found in the given array");
    }

    int binarySearch(int[] arr, int start, int end, int key) {
        if (key >= start) {
            int mid = (start + (end - 1)) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                return binarySearch(arr, start, mid, key);
            } else
                return binarySearch(arr, mid, end, key);
        } else
            return -1;
    }

}
