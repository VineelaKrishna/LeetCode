///// EASY /////
//// Arrage coins in stepwise order(increment by 1) and return the filled number of steps

public class Question441 {

    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));
    }

    public static int arrangeCoins(int n) {
        int counter = 1;

        n = n - counter;

        while (n > counter) {
            counter++;
            n = n - counter;
        }
        return counter;

    }
}
