package org.javafeatures.java12;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.summingDouble;

/**
 * Collectors.teeing() is the new helper function, It is a composite of two downstream collectors.
 * It helps in performing two steps function into a single step.
 */
public class TeeingCollectorsExample {
    public static void main(String[] args)
    {
        double mean
                = Stream.of(2, 3, 4, 5, 6)
                .collect(Collectors.teeing(
                        summingDouble(i -> i), counting(),
                        (sumOfDouble, n) -> sumOfDouble / n));

        System.out.println(mean);
    }
}
