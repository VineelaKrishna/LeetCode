//// EASY ////
/// find the index of a substring
public class Question28 {
    public static void main(String[] args) {
        System.out.println(strStr("heyhello", "ll"));
    }

    static int strStr(String haystack, String needle) {
        // when needle is empty or haystack and needle are equal
        if (needle == null || needle.length() == 0 || haystack.equals(needle)) {
            return 0;
        }

        if (haystack.contains(needle)) {
            // if needle length is 2 we loop until last but one length and check for the
            // substring
            for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
                // is substring equals needle
                if (haystack.substring(i, i + needle.length()).equals(needle)) {
                    return i;
                }
            }
        }
        // by default
        return -1;

    }
}
