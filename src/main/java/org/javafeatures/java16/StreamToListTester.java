package org.javafeatures.java16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The aim is to reduce the boilerplate with some commonly used Stream collectors, such as Collectors.toList and Collectors.toSet:
 * Note: with JAVA 16 - the build source should be 16 in pom file
 *  <configuration>
 *                     <source>16</source>
 *                     <target>16</target>
 *                 </configuration>
 */
public class StreamToListTester {
    public static void main(String[] args) {
        List<String> integersAsString = Arrays.asList("1", "2", "3");
        List<Integer> ints = integersAsString.stream().map(Integer::parseInt).collect(Collectors.toList()); // before JAVA 16
        List<Integer> intsEquivalent = integersAsString.stream().map(Integer::parseInt).toList();

        System.out.println(ints);
        System.out.println(intsEquivalent);
    }
}
