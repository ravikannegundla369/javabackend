package day1415;

import java.util.Arrays;

public class StreamsAverage {
    public static void main(String[] args) {
        Integer[] numbers = {11, 23, 1, 12, 8, 2, 18, 7, 15, 26,38,44};

        double average = Arrays.stream(numbers)
                .filter(num -> num % 2 != 0)
                .mapToDouble(num -> Math.pow(num, 2))
                .average()
                .orElse(0);

        System.out.println("Average of squares of odd numbers: " + average);
    }


}
