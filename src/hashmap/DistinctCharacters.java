package hashmap;

import java.util.HashMap;
import java.util.Map;
public class DistinctCharacters {
    public static void printDistinctCharacters(String input) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
    public static void main(String[] args) {
        String input = "ravi kannegundla";
        System.out.println("Input string is : " + input);
        System.out.println("Output:");
        printDistinctCharacters(input);
    }
}
