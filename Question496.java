import java.lang.System;
import java.util.HashMap;
import java.util.Stack;

/// EASY ////
// To find next greater element array
public class Question496 {
    public static void main(String[] args) {
        int[] input1 = { 4, 1, 2 };
        int[] input2 = { 1, 3, 4, 2 };
        System.out.print(nextGreaterElement(input1, input2).toString());
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // to store element and its next element if it is greater the previous number
        HashMap<Integer, Integer> nextElementMap = new HashMap<>();
        // to stack all the elements and check the last element of the stack with the
        // current element in nums2 array
        Stack<Integer> temp = new Stack<>();
        // looping through nums2 array to add them to hashmap
        for (Integer num : nums2) {
            while (!temp.isEmpty() && num > temp.peek()) {
                nextElementMap.put(temp.pop(), num);
            }
            // pushing the current element to the stack
            temp.push(num);
        }

        // looping through nums1 array and checking if it has any correcponding key in
        // the hashmap
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = nextElementMap.getOrDefault(nums1[i], -1);
        }
        // returning the result
        return nums1;
    }
}
