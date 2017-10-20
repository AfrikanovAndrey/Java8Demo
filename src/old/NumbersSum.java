package old;

import java.util.Arrays;
import java.util.List;

/**
 * Created by aafrikanov on 04.10.17.
 */
public class NumbersSum {
    private  static List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    public static int sumAll(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static int sumEvenNumbers(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                total += number;
            }
        }
        return total;
    }

    public static int sumOddNumbers(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            if (number % 2 == 1) {
                total += number;
            }
        }
        return total;
    }


    public static void main(String ... args){
         int sum = sumAll(numbers);
         int sumEven = sumEvenNumbers(numbers);
         int sumOdd = sumOddNumbers(numbers);
    }
}
