package java8.stream;

import java.util.Arrays;
import java.util.List;

public class NumbersSum {
    private static List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    public static void main(String... args) {
        int sum = numbers.stream().reduce((x, y) -> x + y).orElse(0);

        int sumEven = numbers.stream().filter(num -> num % 2 == 0).reduce((x, y) -> (x + y)).orElse(0);

        int sumOdd = numbers.stream().filter(num -> num % 2 == 1).reduce((x, y) -> (x + y)).orElse(0);

    }
}
