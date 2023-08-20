package org.javafeatures.java14;

/**
 * In Java 14, Text Blocks are still in preview with some new additions. We can now use:
 *
 * Backslash for displaying nice-looking multiline string blocks.
 * \s is used to consider trailing spaces which are by default ignored by the compiler. It preserves all the spaces present before it.
 */
public class TextBlockTesting {
    public static void main(String[] args) {
        String text = """
                Did you know \
                Java 14 \
                has the most features among\
                all non-LTS versions so far\
                """;

        String text2 = """
                line1
                line2 \s
                line3
                """;


        String text3 = "line1\nline2 \nline3\n";

        System.out.println(text);
        System.out.println(text2);
        System.out.println(text3);

    }
}
