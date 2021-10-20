import java.lang.System;
import java.util.List;
import java.util.ArrayList;

class Question22 {

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList();
        backtrack(result, 0, 0, n, "");
        return result;

    }

    public static void backtrack(List<String> result, int open, int close, int max, String s) {
        if (s.length() == max * 2) {
            result.add(s);
            return;
        }

        if (open < max) {
            backtrack(result, open + 1, close, max, s + "(");
        }
        if (close < open) {
            backtrack(result, open, close + 1, max, s + ")");
        }
    }
}