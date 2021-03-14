import java.util.Arrays;


// Implement an algorithm to determine if a string has all unique characters.
// What if you cannot use additional data structure?

public class IsUnique1 {

    // brute force solution: Run 2 loops with variable i and j. Compare str[i] and str[j].
    // If they become equal at any point, return false.
    // time complexity: O(N**2)
    public boolean isUnique(String word) {
        String[] wordArray = word.split("");

        for (int i = 0; i < wordArray.length; i++) {
            for (int j = i+1; j < wordArray.length; j++) {
                System.out.println(wordArray[i] + wordArray[j]);
                if (wordArray[i].equals(wordArray[j])) {
                    return false;
                }
            }
        }
        return true;
    }

    // brute force solution without String array
    // time complexity: O(N**2)
    public boolean isUnique2(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = i+1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    // sorting: using sorting, based on ASCII values of characters
    // time complexity: O(N logN)
    public boolean isUnique3(String word) {
        char[] wordArray = word.toCharArray();
        Arrays.sort(wordArray);
        for (int i = 0; i < wordArray.length -1 ; i++) {
            if (wordArray[i] != wordArray[i+1]) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }


}
