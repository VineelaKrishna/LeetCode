import java.util.HashMap;

// converting ROMAN number to Decimal
public class Question13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("MCMLXXXVII"));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanToIntMap = new HashMap<>();
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);
        int temp = 0;
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int value = romanToIntMap.get(s.charAt(i));
            // if the char is the first element then add the value to the result
            if (temp == 0) {
                result += value;
            } else {
                // if the current value is greater than of equal to the previous value then add
                // the value to the result
                if (value >= temp)
                    result += value;
                // otherwise substract the value from the result
                else
                    result -= value;
            }
            // storing the previous number
            temp = value;
        }
        // return the result after the looping through all the chars is done
        return result;
    }

}
