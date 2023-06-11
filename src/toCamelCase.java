
public class toCamelCase {
    static String toCamelCase(String s) {
        int length = s.length();
        StringBuilder newString = new StringBuilder();
        if(length > 0) {
            if (!Character.isUpperCase(s.charAt(0))) {s = s.toLowerCase();}
            for (int i = 0; i < length; i++) {
                if (s.charAt(i) == ('-') || s.charAt(i) == ('_')) {
                    newString.append(Character.toUpperCase(s.charAt(i + 1)));
                    i++;
                } else {
                    newString.append(s.charAt(i));
                }
            }
            return newString.toString();
        } else {return s;}
    }
}
