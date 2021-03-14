public class ConcatenateAListOfStrings {
    public String joinWords(String[] words) {
        StringBuilder sentence = new StringBuilder();
        for (String word: words) {
            sentence.append(word);
        }

        return sentence.toString();
    }
}
