public class VowelRemover {
    //avoiding magic strings
    private static final String REMOVE_ALL_VOWELS = "[aeiouAEIOU]";
    public static String removeVowel(String str) {
        return str.replaceAll(REMOVE_ALL_VOWELS, "");
    }
}
