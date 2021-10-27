import java.lang.System;
import java.util.List;
import java.util.ArrayList;

//// EASY ///
// A program to check if the given string contains a valid set of paranthesis
public class Question20 {
    public static void main(String[] args) {
        System.out.println(isValid("({[]})"));
        System.out.println(isValid("({}[]{})"));
        System.out.println(isValid("({[)]})"));
        System.out.println(isValid("}{"));
    }

    public static boolean isValid(String s) {
        // if the string's length is an odd number then the string can never contain a
        // valid set paranthesis
        if (s.length() % 2 == 1) {
            return false;
        } // if the length is even number
        else {
            List<Character> result = new ArrayList<Character>();
            // convering string to a character array
            char[] chars = s.toCharArray();
            // looping through each character from the array
            for (char c : chars) {
                // if the character is an open bracket then add it to the list
                if (c == '{' || c == '[' || c == '(') {
                    result.add(c);
                } // if the character is an close bracket
                else if (c == '}' || c == ']' || c == ')') {
                    // only continue if the list is not empty
                    if (!result.isEmpty()) {
                        char temp = result.get(result.size() - 1);
                        // checking if the last element from the list has the corresponding open bracket
                        if (temp == '{' && c == '}' || temp == '[' && c == ']' || temp == '(' && c == ')') {
                            // if yes remove the last element
                            result.remove(result.size() - 1);
                        } // if it fails then return false
                        else
                            return false;
                    } // if it the list "result" is empty and there are still chars in the array then
                      // return false
                    else
                        return false;
                }
            }

            // if result list becomes empty then return true
            if (result.isEmpty()) {
                return true;
            }

        } // by default return false if it fails at any point
        return false;

    }

}
