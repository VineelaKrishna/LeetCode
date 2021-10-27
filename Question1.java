
// Finding two numbers from an array that adds up to the target number given as input
import java.lang.System;

/// EASY ///
class Question1 {
    public static void main(String[] args) {

        int[] input = { -1, 2, 3, 4, 5, 10, 1, 30, 32, 44, 50, 61 };

        System.out.print("Result is " + twoSum(input, 5));
    }

    public static int[] twoSum(int[] nums, int target) {
        // default check if the array is of length
        if (nums.length == 2) {
            if (nums[0] + nums[1] == target) {
                return new int[] { 0, 1 };
            }
        } // when length is greater than 2
        else if (nums.length > 2) {
            // looping through all the elements from the array
            for (int i = 0; i < nums.length - 1; i++) {
                // looping through all the elements from i till
                // the last element in the array
                for (int j = i + 1; j < nums.length; j++) {
                    // checking if the elements from the two loops add up to the target
                    if (nums[i] + nums[j] == target) {
                        System.out.println(nums[i] + ", " + nums[j]);
                        return new int[] { i, j };
                    }
                }
            }
            // if no elements are found return [0]
            return new int[] { 0 };
        }
        // by default return [0]
        return new int[] { 0 };
    }

}