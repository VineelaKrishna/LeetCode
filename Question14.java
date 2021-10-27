import java.util.Arrays;
//// EASY ////
/// COMMON PREFIX /////
public class Question14 {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"f", "flower", "florine", "flo"}));
    }
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int length = 0;
        String result = "";
        if(first.length() < last.length())
            length = first.length();
        else length = last.length();
        
        for(int i = 0; i < length; i++){
            if(first.charAt(i) != last.charAt(i)){
                return result;
            }
            result += first.charAt(i);
        }
        return result;
    }
}
