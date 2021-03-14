// Given two strings, write a method to decide if one is a permutation of the other

import java.util.Arrays;

public class CheckPermutation {

    // my first solution - sort both string than compare the sorted strings
    public boolean isPermutation(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        if (length1 != length2) {
            return false;
        }

        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();

        Arrays.sort(word1Array);
        Arrays.sort(word2Array);
        System.out.println(word1Array);
        System.out.println(word2Array);
        if (Arrays.equals(word1Array, word2Array)) {
            return true;
        }
        // or
//        for (int i = 0; i < length1; i++) {
//            if (word1Array[i] != word2Array[i]) {
//                return false;
//            }
//        }
        return false;
    }
}
