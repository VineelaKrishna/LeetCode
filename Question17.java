import java.util.*;
import java.lang.System;


public class Question17 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("239"));
    }

    public static List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList();

        if (digits != null) {
            if (digits.length() == 0) {
                return result;
            }
            result.add("");
            String[] chars = new String[] { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
            for (int i = 0; i < digits.length(); i++) {
                int index = Character.getNumericValue(digits.charAt(i));

                while (result.peek().length() == i) {
                    String perm = result.remove();
                    for (char c : chars[index].toCharArray()) {
                        result.add(perm + c);
                    }
                }
            }

        }

        return result;
    }

}
