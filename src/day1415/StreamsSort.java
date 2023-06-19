package day1415;

import java.util.Arrays;
import java.util.Comparator;

public class StreamsSort {
    public static void main(String[] args) {
        String[] strings = {"ravi", "kannegundla", "naveen", "denton", "texas"};
        Arrays.stream(strings)
                .sorted(Comparator.comparing(String::length)
                        .thenComparing(Comparator.comparingInt((String str) -> str.charAt(str.length() - 1)).reversed()))
                .forEach(System.out::println);
    }
}
