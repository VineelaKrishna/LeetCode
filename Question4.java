import java.util.Arrays;

//// HARD ////
/// Median of two sorted arrays
public class Question4 {
    public static void main(String[] args) {

        System.out.println(findMedianSortedArrays(new int[] { 1, 2, 3, 6 }, new int[] { 3, 4 }));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int[] mergedArray = new int[length];
        for (int i = 0; i < nums1.length; i++) {
            mergedArray[i] = nums1[i];
        }
        for (int j = 0; j < nums2.length; j++) {
            mergedArray[nums1.length + j] = nums2[j];
        }
        Arrays.sort(mergedArray);

        if (length % 2 == 0)
            return (mergedArray[(length / 2 - 1)] + mergedArray[length / 2]) / 2.0;

        else
            return mergedArray[length / 2];

    }
}