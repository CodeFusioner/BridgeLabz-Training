package collectors;

import java.util.*;
import java.util.stream.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {

        String text = "java is fun and java is powerful";

        Map<String, Long> freqMap = Arrays.stream(text.split(" "))
                .collect(Collectors.toMap(
                        word -> word,
                        word -> 1L,
                        Long::sum
                ));

        System.out.println(freqMap);
    }
}
