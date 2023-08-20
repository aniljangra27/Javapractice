package org.javafeatures.java14;

public class NullPointerExceptionTester {
    public static void main(String[] args)
    {
        Employee e = null;

        System.out.println(e.getName());
    }

    private static class Employee {
        public String getName() {
            return "Anil";
        }
    }
}
