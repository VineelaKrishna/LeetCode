import java.util.*;
import java.lang.System;

// MEDIUM //
// printing combination of letters forming from the digits on the telephone number pad
public class Question17 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("239"));
    }

    public static List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<String>();

        if (digits != null) {
            if (digits.length() == 0) {
                return result;
            }
            result.add("");
            // an array of the strings corresponding to each number
            String[] chars = new String[] { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
            // looping through each number from the input digits
            for (int i = 0; i < digits.length(); i++) {
                // getting the numeric value of each number
                int index = Character.getNumericValue(digits.charAt(i));
                while (result.peek().length() == i) {
                    String permutation = result.remove();
                    for (char c : chars[index].toCharArray()) {
                        // appening the charater to the permutation
                        result.add(permutation + c);
                    }
                }
            }

        }

        return result;
    }

}
