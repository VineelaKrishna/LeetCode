///// MEDIUM ///
////// Reverse integer //////

public class Question7 {
    public static void main(String[] args) {
        System.out.println(reverse(-2147483412));
    }

    public static int reverse(int x) {
        int reverse = 0;
        while (x != 0) {
            // checking for boundaries
            if (reverse < Integer.MIN_VALUE / 10 || reverse > Integer.MAX_VALUE / 10) {
                return 0;
            }
            // reverse = previous reverse value * 10 and then add the current digit from the
            // original number
            reverse = (reverse * 10) + (x % 10);
            x = x / 10;
        }
        return reverse;

    }
}
