package java8.methods.links;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

/**
 * Created by aafrikanov on 17.10.17.
 */
public class MethodLinksExamples {

    private  static List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);


    private static void print(String s, Printer printer){
        printer.print(s);
    }

    private static Integer sum(int x, int y, BiFunction function){
        return (Integer)function.apply(x, y);
    }

    public static void main(String[] args){

        // Simple
        for (int num : numbers){
            System.out.println(num);
        }

        // Lambda
        numbers.forEach(
                num -> System.out.println(num)
        );

        // Method link
        numbers.forEach(
                System.out::println
        );
    }

    /*
    * object::instanceMethod (Пример: System.out::println() эквивалентно x -> System.out.println(x))
    * Class::staticMethod (Пример: Math::pow эквивалентно (x, y) -> Math.pow(x, y))
    * Class::instanceMethod (Пример: String::compareToIgnoreCase - это то же самое, что и (x, y) -> x.compareToIgnoreCase(y))

     */


}
