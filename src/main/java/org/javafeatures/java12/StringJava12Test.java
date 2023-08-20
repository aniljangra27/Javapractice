package org.javafeatures.java12;

import java.lang.invoke.MethodHandles;
import java.util.Optional;

/**
 *  indent adjusts the indentation of each line based on the integer parameter. If the parameter is greater than zero, new spaces will be inserted at the beginning of each line.
 *  Transform: It accepts a single argument function as a parameter that will be applied to the string.
 *  Optional<String> describeConstable(): This method will return an Optional object containing a descriptor for the String instance.
 *  String resolveConstantDesc​(MethodHandles.Lookup lookup): This method will return a String object which is the descriptor for the invoking String instance.
 */
public class StringJava12Test {
    public static void main(String[] args) {
        String text = "Hi There!\nThis is Java 12 article.";

        text = text.indent(4);
        System.out.println(text);

        text = text.indent(-10);
        System.out.println(text);

        System.out.println(".............................");

        String transformed = text.transform(value ->
                new StringBuilder(value).reverse().toString()   // Transform
        );
        System.out.println(transformed);

        System.out.println("...............................");

        String message = "Welcome!";
        Optional<String> opOfMessage = message.describeConstable(); // describe optional
        System.out.println(opOfMessage);

        System.out.println("...............................");
        String resolveConstantDesc = "Welcome!";
        String constantDesc = resolveConstantDesc.resolveConstantDesc(MethodHandles.lookup());  // resolve ConstantDesc
        System.out.println(constantDesc);


        String textBlock = """
				Hi
				Hello
				Yes""";

        String str = "Hi\nHello\nYes";

        System.out.println("Text Block String:\n" + textBlock);
        System.out.println("Normal String Literal:\n" + str);
    }
}
