package hashset;

import java.util.LinkedHashSet;

public class RemoveDuplicateChars {


    public static void main(String[] args) {
        String input = "Ravi Kannegundla";
        String result = removeDuplicates(input);
        System.out.println(result);
    }

    public static String removeDuplicates(String input) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();


        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            set.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : set) {
            sb.append(c);
        }

        return sb.toString();
    }


}
