import java.lang.System;
import java.util.Arrays;

class NextGreatestLetterQuestion744 {
    public static void main(String[] args) {
        char[] input = { a, c, d };
        System.out.print(nextGreatestLetter(input, b));
    }

    public static char nextGreatestLetter(char[] letters, char target) {

        int index = Arrays.binarySearch(letters, target);
        if (index >= 0) {
            if (letters.length > index) {
                return letters[index + 1];
            } else
                return letters[0];
        } else {
            for (char c : letters) {
                if (c > target) {
                    return target;
                }
            }
            return letters[0];
        }

    }
}