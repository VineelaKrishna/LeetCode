///// MEDIUM ////////
///// group an array of strings into groups of anagrams ////

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Question49 {
    public static void main(String[] args) {

    }

    static List<List<String>> groupAnagrams(String[] strs) {
        // to store key as sorted string and value as a list of strings that has the
        // same key

        HashMap<String, List<String>> groupedAnagrams = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = String.valueOf(charArray);
            /// if the string does not exist as key in the map add it to the list and an
            /// empty list as value
            if (!groupedAnagrams.containsKey(sortedStr)) {
                groupedAnagrams.put(sortedStr, new ArrayList<>());
            }
            // add the original string to the list in the value
            groupedAnagrams.get(sortedStr).add(str);
        }

        // return the values of each key as a list
        return new ArrayList<List<String>>(groupedAnagrams.values());

    }
}
