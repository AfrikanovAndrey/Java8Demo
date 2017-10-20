package java8.lambda;

import java.util.Arrays;
import java.util.List;

public class NumbersSumFunctionalProgramming {

    private  static List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    static final Checkable<Integer> EVEN_NUMBER_CHECKER = new Checkable<Integer>(){
        @Override
        public boolean check(Integer num) {
            return num % 2 == 0;
        }
    };

    static final Checkable<Integer> ODD_NUMBER_CHECKER = new Checkable<Integer>(){
        @Override
        public boolean check(Integer num) {
            return num % 2 == 1;
        }
    };

    static final Checkable<Integer> ALL_NUMBER_CHECKER = new Checkable<Integer>(){
        @Override
        public boolean check(Integer num) {
            return true;
        }
    };

    private static int sum(List<Integer> numbers, Checkable<Integer> checker) {
        int total = 0;
        for (int number : numbers) {
            if (checker.check(number)) {
                total += number;
            }
        }
        return total;
    }

    public static void main(String ... args){
        int sumAll = sum(numbers, ALL_NUMBER_CHECKER);
        int sumEven = sum(numbers, EVEN_NUMBER_CHECKER);
        int sumOdd = sum(numbers, ODD_NUMBER_CHECKER);
    }
}



