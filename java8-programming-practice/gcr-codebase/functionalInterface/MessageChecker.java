package functionalInterface;

import java.util.function.Function;

public class MessageChecker {
    public static void main(String[] args) {

        Function<String, Integer> lengthCalculator =
                message -> message.length();

        String msg = "Patient needs immediate attention";

        int length = lengthCalculator.apply(msg);

        System.out.println("Message length = " + length);
    }
}
