package com.sample.app.java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapSorting {
    public static void main(String[] args) {
        Map<Integer,Employee> employeeMap = new HashMap<>();
        employeeMap.put(1,new Employee(1,"Yogesh","comp",1000d));
        employeeMap.put(2,new Employee(1,"Nilesh","comp",5000d));
        employeeMap.put(3,new Employee(1,"Akshay","comp",2000d));
        employeeMap.put(4,new Employee(1,"Vishal","comp",4000d));
        employeeMap.put(5,new Employee(1,"Nikhil","comp",500d));

        Map<Integer, Employee> nameSortedMap = sortEmpMapBy(employeeMap, Comparator.comparing(Employee::getName));

        nameSortedMap.entrySet()
                .stream()
                .forEach(System.out::println);

    }
    public static Map<Integer,Employee> sortEmpMapBy(Map<Integer,Employee> input, Comparator<Employee> comparator) {
        Map<Integer,Employee> sortedMap = new LinkedHashMap<>();

        input.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(comparator))
                .forEachOrdered(p -> sortedMap.put(p.getKey(),p.getValue()));

        return sortedMap;
    }
}

class Employee {
    private Integer id;
    private String name;
    private String dept;
    private Double salary;

    public Employee(Integer id, String name, String dept, Double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
