package com.collection;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionMapJava8 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("anil", 1));
        studentList.add(new Student("max", 2));
        studentList.add(new Student("mike", 3));
        studentList.add(new Student("andy", 2));

        final List<Student> max = studentList.stream()
                .filter(student -> student.getName().equalsIgnoreCase("max"))
                .collect(Collectors.toList());
        System.out.println(max);

        //stream map
        final List<String> collect = studentList.stream()
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println(collect);

        final Map<Integer, String> collect1 = studentList.stream()
                .collect(Collectors.toMap(Student::getId, Student::getName, (oldVal, newVal) ->  newVal, LinkedHashMap::new)); //LinkedHashMap::new - it will keep insertion order
        System.out.println(collect1);
    }
}
class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}