import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
public class DescendingOrder {
    public static int sortDesc(final int num) {
        //Your code
        String numToString = Integer.toString(num);
        List<Character> toArrange = new ArrayList<Character>();
        for (int i = 0; i < numToString.length(); i++) {
            toArrange.add(numToString.charAt(i));
        }
        toArrange.sort(Collections.reverseOrder());
        StringBuilder arranged = new StringBuilder();
        for (char f : toArrange) {
            arranged.append(f);
        }
        return  Integer.parseInt(arranged.toString());

    }

    public static void main(String[] args) {
        System.out.println(sortDesc(5679384));
    }
}

