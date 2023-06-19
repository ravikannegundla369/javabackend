package day1415;

import java.util.Arrays;
import java.util.Comparator;

public class StreamsCapital {
    public static void main(String[] args) {
        String[] strings = {"ravi", "Kannegundla", "naveen", "Unt"};

        Arrays.stream(strings)
                .map(str -> Character.toUpperCase(str.charAt(0)) + str.substring(1))
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }

}
