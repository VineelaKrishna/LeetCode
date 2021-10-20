import java.lang.System;
import java.util.Arrays;

class Question744 {
    public static void main(String[] args) {
        char[] input = { 'a', 'c', 'd' };
        System.out.print(nextGreatestLetter(input, 'b'));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        if (letters.length > 0) {
            int index = Arrays.binarySearch(letters, target);
            if (index >= 0) {
                while (letters.length > index + 1) {
                    if (letters[index] == letters[index + 1]) {
                        index = index + 1;
                    } else
                        return letters[index + 1];
                }
                return letters[0];
            } else {
                for (char c : letters) {
                    if (c > target) {
                        return c;
                    }
                }
                return letters[0];
            }
        }
        return 'a';

    }
}