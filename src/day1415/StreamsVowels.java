package day1415;

import java.util.Arrays;

public class StreamsVowels {

    public static void main(String[] args) {
        String[] strings = {"ravi", "kannegundla", "denton", "UNT"};

        Arrays.stream(strings)
                .filter(str -> str.matches(".*[aeiouAEIOU].*"))
                .forEach(str -> System.out.println(str + " (" + countVowels(str) + " vowels)"));
    }

    private static int countVowels(String str) {
        return (int) str.chars()
                .mapToObj(ch -> (char) ch)
                .filter(ch -> "aeiouAEIOU".contains(String.valueOf(ch)))
                .count();
    }


}
