import java.lang.System;
import java.util.Arrays;
import java.util.ArrayList;
import ArrayUtil

public class Question496 {
    public static void main(String[] args) {
        int[] input1 = { 4, 1, 2 };
        int[] input2 = { 1, 4, 3, 2 };
        System.out.print(nextGreaterElement(input1, input2).toString());
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = null;
        for (int i = 0; i < nums1.length; i++) {
            int num = nums1[i];
            System.out.println("num: " + num);
            System.out.println("i: " + i);
            result = new int[nums1.length];
            int index = Arrays.binarySearch(nums2, num);
            System.out.println("index: " + index);
            while (index > 0) {
                System.out.println("IN");
                if (nums2.length > i) {
                    System.out.println("nums2.length: " + nums2.length);
                    if (nums2[index + 1] > num) {
                        System.out.println("nums2[index + 1]: " + nums2[index + 1]);
                        System.out.println("num: " + num);
                        result[i] = nums2[index + 1];
                        System.out.println(nums2[index + 1]);
                    } else {
                        result[i] = -1;
                        System.out.println(-1);
                    }
                }
            } 
                result[i] = -1;
        }

        return result;

    }
}
