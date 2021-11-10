import java.util.HashSet;

public class Question3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> temp = new HashSet<Character>();
        int fixed = 0;
        int moving = 0;
        int max = 0;
        
        while (moving < s.length()) {
            if (!temp.contains(s.charAt(moving))) {
                temp.add(s.charAt(moving));
                moving++;
                max = Math.max(temp.size(), max);
            } else {
                temp.remove(s.charAt(fixed));
                fixed++;
            }
        }

        return max;

    }
}
