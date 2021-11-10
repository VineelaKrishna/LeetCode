import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question27 {
    public static void main(String[] args) {
        int[] input = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
        System.out.println(removeElement(input, 2));
    }

    static int removeElement(int[] nums, int val) {
        int count = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = Integer.MAX_VALUE;
                count--;
            }
        }
        Arrays.sort(nums);
        return count;
    }
}
