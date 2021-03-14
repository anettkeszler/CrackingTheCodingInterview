public class Application {
    public static void main(String[] args) {
        System.out.println("Hello, Arrays and Strings!");

        // merge two arrays into an arraylist
        MergeArraysToArrayList merge = new MergeArraysToArrayList();
        System.out.println(merge.merge(new String[]{"netti", "peti", "johi"}, new String[]{"basketball", "football", "valley ball"}));

        // concatenate a list of Strings with StringBuilder
        ConcatenateAListOfStrings concatenate = new ConcatenateAListOfStrings();
        System.out.println(concatenate.joinWords(new String[]{"Hello", "Netti", "!", "Have", "a", "nice", "evening."}));

        // 1.1. Is Unique
        IsUnique1 isUnique = new IsUnique1();
        System.out.println(isUnique.isUniqueASCII("abcdefg12345"));
        System.out.println(isUnique.isUniqueASCII("abcdeafg1234"));
    }
}
