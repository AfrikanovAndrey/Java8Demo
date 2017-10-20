package java8.lambda;

import java.util.Arrays;
import java.util.List;

public class NumbersSum {

    private static List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    private static int sumAll(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    private static int sumEven(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            if ( number % 2 == 0) {
                total += number;
            }
        }
        return total;
    }

    private static int sumOdd(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            if ( number % 2 == 1) {
                total += number;
            }
        }
        return total;
    }

    public static void main(String... args) {
        int sum = sumAll(numbers);
        int sumEven = sumEven(numbers);
        int sumOdd = sumOdd(numbers);
    }
}
