// Given two strings, write a method to decide if one is a permutation of the other

import java.util.Arrays;

public class CheckPermutation {

    // my first solution - sort both string than compare the sorted strings
    // time complexity: O(N**2) --> sorting Quicksort worst case
    public boolean isPermutationSorting(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        if (length1 != length2) {
            return false;
        }
        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();

        Arrays.sort(word1Array);
        Arrays.sort(word2Array);

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

    // count characters
    // 1) Create count arrays of size 256 for both strings. Initialize all values
    // in count arrays as 0.
    // 2) Iterate through every character of both strings and increment the count
    // of character in the corresponding count arrays.
    // 3) Compare count arrays. If both count arrays are same, then return true.
    // time complexity: O(N)
    public boolean isPermutationCountCharacters(String word1, String word2) {
        int NO_OF_CHARS = 256;

        if (word1.length() != word2.length()) {
            return false;
        }

        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();

        int count1[] = new int[NO_OF_CHARS];
        Arrays.fill(count1, 0);

        int count2[] = new int[NO_OF_CHARS];
        Arrays.fill(count2, 0);

        for (int i = 0; i < word1Array.length && i < word2Array.length ; i++) {
            count1[word1Array[i]] ++;
            count2[word2Array[i]] ++;
        }

        for (int i = 0; i < NO_OF_CHARS; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;

    }
}
