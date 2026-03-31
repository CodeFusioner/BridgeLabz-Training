package streamApi;

import java.util.List;

public class NameDemo {
    public static void main(String[] args) {
        List<String> customerNames = List.of(
                "rahul", "amit", "divyansh", "neha"
        );
        customerNames.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

    }
}
