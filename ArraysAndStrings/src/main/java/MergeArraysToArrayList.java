import java.util.ArrayList;

public class MergeArraysToArrayList {
    ArrayList<String> merge(String[] words, String[] moreWords) {
        ArrayList<String> sentence = new ArrayList<>();
        for (String word: words) {
            sentence.add(word);
        }
        for (String word: moreWords) {
            sentence.add(word);
        }
        return sentence;
    }
}
