package org.javafeatures.java16;

import java.lang.reflect.Field;
import java.util.Arrays;

public class StrongEncapsulationTest {
    public static void main(String[] args) throws ReflectiveOperationException {
        byte[] value = getValue("Happy Coding!");
        System.out.println(Arrays.toString(value));
    }

    private static byte[] getValue(String string) throws ReflectiveOperationException {
        Field VALUE = String.class.getDeclaredField("value");
        VALUE.setAccessible(true);
        return (byte[]) VALUE.get(string);
    }
}
