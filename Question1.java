import java.lang.System;
import java.util.Arrays;

class Question1 {
    // public static int result = 0;
    public static void main(String[] args) {

        int[] input = { -1, 2, 3, 4, 5, 10, 1, 30, 32, 44, 50, 61 };
        // int[] result = twoSum(input, 5);
        // for (int i : result) {
        // System.out.print(i + ", ");
        // }
        System.out.print("Result is " + twoSum(input, 5));
    }

    public static int[] twoSum(int[] nums, int target) {

        if (nums.length == 2) {
            if (nums[0] + nums[1] == target) {
                return new int[] { 0, 1 };
            }
        } else if (nums.length > 2) {
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        System.out.println(nums[i] + ", " + nums[j]);
                        return new int[] { i, j };
                    }
                }
            }
            return new int[] { 0 };
        }
        return new int[] { 0 };
    }

}