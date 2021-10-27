public class Question9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(101));
        System.out.println(isPalindrome(0110));
    }

    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int reverseSum = 0;
        int originalSum = x;
        int remainder = 0;
        while (x != 0) {
            remainder = x % 10;
            reverseSum = reverseSum * 10 + remainder;
            x /= 10;
        }
        if (originalSum == reverseSum)
            return true;
        else
            return false;

    }
}
