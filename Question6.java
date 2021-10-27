// MEDIUM ///
// printing the same word in zigzag manner
class Question6 {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }

    public static String convert(String s, int numRows) {
        // if string is null or doesn't exist
        if (s != null) {
            if (s.length() == numRows) {
                return s;
            }
            // if length of the string is more than 0
            if (s.length() > 0) {
                // converting string to char array
                char[] arr = s.toCharArray();
                // creating an array of StringBuilders of length numRows
                StringBuilder[] sb = new StringBuilder[numRows];
                int index = 0;
                // initializing each stringbuilder from the array
                for (int i = 0; i < sb.length; i++) {
                    sb[i] = new StringBuilder();
                }

                // incrementing index in the loop and exiting if index greater than or equal to
                // string's length
                while (index < s.length()) {
                    // appending the char to the sb from 0 to numsRow-1
                    for (int i = 0; i < sb.length && index < s.length(); i++) {
                        sb[i].append(arr[index++]);
                    }
                    // appending the char to the sb from numsRow-1 to 0
                    for (int i = sb.length - 2; i > 0 && index < s.length(); i--) {
                        sb[i].append(arr[index++]);
                    }
                }
                StringBuilder result = new StringBuilder();
                // creating one stringbuilder from the array of stringbuilders
                for (StringBuilder str : sb) {
                    result.append(str);
                }
                // returning the result in string format
                return result.toString();

            } // if it fails at any point we return an empty string
            else
                return "";
        }
        // in default case we return an empty string
        return "";

    }

}