package java8.lambda;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class NumbersSumLambda {

    private static List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    private static int sumAll(List<Integer> numbers, Predicate<Integer> predicate) {
        int total = 0;
        for (int number : numbers) {
            if (predicate.test(number)) {
                total += number;
            }
        }
        numbers = new ArrayList<>();
        return total;
    }

    /*
     * Структура лямбда-выражения
     * (параметры) -> "тело" выражения
     *
     * () -> {dfvdsgdsg;}
     */

    public static void main(String... args) {
        int sum = sumAll(numbers, (num) -> true);


        int sumA = sumAll(numbers, new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {

                return integer % 2 == 0;
            }
        });

        int sumEven = sumAll(numbers, num -> num % 2 == 0);

        int sumOdd = sumAll(numbers, (num) -> (num % 2 == 1));

        numbers.forEach((x) -> x = x * 2);
        numbers.forEach(x -> System.out.println(x));
        for (Integer x : numbers) {
            System.out.println(x);
        }
    }

    /*
    public static void repeatText(String text, int count) {
        Runnable r = () -> {
            while (count > 0) {
                count--; // Error: Can't mutate captured variable
                System.out.println(text);
                Thread.yield();
            }
        };
        new Thread(r).start();
    }
    */
}