import java.lang.System;
import java.util.List;
import java.util.ArrayList;

public class Question20 {
    public static void main(String[] args) {
        System.out.println(isValid("({[]})"));
        System.out.println(isValid("({}[]{})"));
        System.out.println(isValid("({[)]})"));
        System.out.println(isValid("}{"));
    }

    public static boolean isValid(String s) {

        if (s.length() % 2 == 1) {
            return false;
        } else {
            List<Character> result = new ArrayList();
            char[] chars = s.toCharArray();
            for (char c : chars) {
                if (c == '{' || c == '[' || c == '(') {
                    result.add(c);
                } else if (c == '}' || c == ']' || c == ')') {
                    if (!result.isEmpty()) {
                        char temp = result.get(result.size() - 1);
                        if (temp == '{' && c == '}' || temp == '[' && c == ']' || temp == '(' && c == ')') {
                            result.remove(result.size() - 1);
                        } else
                            return false;
                    } else
                        return false;
                }
            }

            if (result.isEmpty()) {
                return true;
            }

        }
        return false;

    }

}
