import java.lang.System;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


class Question15 {
    // public static int result = 0;
    public static void main(String[] args) {

        int[] input = {0, 0, 0, 0, 1, -1};
        // { -1, -2, 3, 4, 5, -3, 10, 1, -1, 30, 32, 44, 50, 61 };

        System.out.print("Result is " + threeSum(input));
        // threeSum(input);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
       
        Arrays.sort(nums);

        
        for (int i = 0; i < nums.length - 2; i++) {
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
                int low = i + 1;
                int high = nums.length-1;
                int sum = 0 - nums[i];
                while(low<high){
                    if(nums[low] + nums[high] == sum){
                        result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while(low < high && nums[low] == nums[low+1]) {
                            low++;
                        }
                        while(low < high && nums[high] == nums[high-1]) {
                            high--;
                        }
                        low++;
                        high--;
                    } else if(nums[low] + nums[high] > sum){
                        high--;
                    } else {
                        low++;
                    }
                }

            }

           
        }
    
        return result;
    
    }

}