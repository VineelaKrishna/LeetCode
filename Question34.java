public class Question34 {
    public static void main(String[] args) {
        System.out.println(searchRange(new int[]{1,2,3,4,6,6,6,6,9,10}, 6));
        System.out.println(searchRange(new int[]{1,2,3,4,6,6,6,6,9,10}, 2));
        System.out.println(searchRange(new int[]{1,2,3,4,6,6,6,6,9,10}, 7));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1,-1};
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == target){
                if(result[0] == -1){
                    result[0] = i;
                    result[1] = i;
                } else 
                    result[1] = i;
                
            }
        }
        System.out.println(result[0] + ", " + result[1]);
        return result;
    }
        
}
