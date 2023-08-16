package org.javafeatures.java11;


/**
 * isBlank(): Boolean method, returns true when a string is empty and vice-versa.
 * lines(): It return a collection of strings that are divided by line terminators.
 * repeat(n): Result is the concatenated string of original string repeated the number of times in the argument.
 * stripLeading(): It is used to remove the white space which is in front of the string
 * stripTrailing(): It is used to remove the white space which is in the back of the string
 * strip(): It is used to remove the white spaces which are in front and back of the string  -same as trim()
 */
public class StringMethodTester {
    public static void main(String[] args) {
        String strStrip = "  Learn Java11 features   ";
        //strip
        System.out.println(strStrip.strip());

        //stripTrailing
        System.out.println(strStrip.stripTrailing());

        //stripLeading
        System.out.println(strStrip.stripLeading());

        System.out.println("..........................");
        //isBlank
        System.out.println(strStrip.isBlank());
        System.out.println("".isBlank());
        System.out.println("..........................");

        //repear
        System.out.println(strStrip.repeat(4));

    }
}
