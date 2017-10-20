package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by aafrikanov on 19.10.17.
 */
public class StreamCteateTypes {


    private static List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    public static void main(String[] args){

        // From collection
        Stream<Integer> stream1 = numbers.stream();

        // From set of values
        Stream<Integer> stream2 = Stream.of(1,2,3,4,5);

        // From array
        String[] array = {"a1","a2","a3"};
        Stream<String> stream3 = Arrays.stream(array);

        // Stream from string
        IntStream stream4 = "abc".chars();

        // By Builder
        Stream<Object> stream5 = Stream.builder().add("a1").add("a2").add("a3").build();

        // Parallel stream
        Stream<Integer> stream6 = numbers.parallelStream();
    }
}
