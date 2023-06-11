public class StringSplit {
    public static String[] solution(String s) {
        StringBuilder changing = new StringBuilder(s);

        String[] finalArray;
        if ((changing.length()) % 2 != 0) {
            changing.append("_");
            s = changing.toString();
        }
        finalArray = s.split("(?<=\\G.{" + 2 + "})");
        return finalArray;
    }
}
