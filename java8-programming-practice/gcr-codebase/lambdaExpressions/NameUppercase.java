package lambdaExpressions;

import java.util.Arrays;
import java.util.List;

public class NameUppercase {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("kapil", "rohit", "neha");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}

