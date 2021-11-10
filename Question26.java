/// EASY ///
/// Remove duplicates from a sorted array

public class Question26 {

    public static void main(String[] args) {
        int[] input = new int[] { 0, 0, 1, 2, 2, 3, 3, 4, 4, 5 };
        System.out.println(removeDuplicates(input));
    }

    public static int removeDuplicates(int[] nums) {
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[count - 1]) {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;

    }
}
