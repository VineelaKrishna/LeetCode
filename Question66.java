///// EASY //////
///// Plus One /////

public class Question66 {
    public static void main(String[] args) {
        System.out.println(plusOne(new int[] { 9, 9 }));
    }

    static int[] plusOne(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        // if the number is 9, 99, 999 etc, we need a 1 followed by the 0's(same as
        // length of the input array)
        int[] newDigits = new int[length + 1];
        newDigits[0] = 1;
        for (int i : newDigits) {
            System.out.println(i);
        }
        return newDigits;
    }
}
