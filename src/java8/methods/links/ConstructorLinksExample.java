package java8.methods.links;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConstructorLinksExample {

    private static List<String> userNames = Arrays.asList("John", "Brandon", "Mike");

    public static void main(String[] args) {
        List<User> users = userNames.stream().map(User::new).collect(Collectors.toList());

    }
}
