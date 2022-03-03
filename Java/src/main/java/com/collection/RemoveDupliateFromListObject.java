package com.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;

public class RemoveDupliateFromListObject {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "anil"));
        employeeList.add(new Employee(2, "sunil"));
        employeeList.add(new Employee(1, "aarav"));

        //removing duplicate from list
        final ArrayList<Employee> collectById = employeeList.stream()
                .collect(collectingAndThen(toCollection(() -> new TreeSet<>(comparingInt(Employee::getId))),
                        ArrayList::new));

        final ArrayList<Employee> collectByName = employeeList.stream()
                .collect(Collectors.collectingAndThen(toCollection(() -> new TreeSet<>(comparing(Employee::getName))),
                        ArrayList::new));

        System.out.println(collectById);
// -- by name
        System.out.println(collectByName);
    }
}

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}