package org.javafeatures.java16;

/**
 * Java 14 introduces a new class type record as preview feature to facilitate creation of immutable data objects.
 * Java 15 enhances record type further.
 * With Java 16, record is now a standard feature of JDK.
 */
public class RecordTester {
    public static void main(String[] args) {
        StudentRecord student = new StudentRecord (1, "Julie", "Red",  12);
        System.out.println(student.id());
        System.out.println(student.name());
        System.out.println(student);
    }

}
//record StudentRecord(int id,
//                     String name,
//                     String section,
//                     int age){}
