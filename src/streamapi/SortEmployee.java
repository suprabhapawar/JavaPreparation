package streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class SortEmployee {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 35));
        employees.add(new Employee("Alice", 28));
        employees.add(new Employee("Bob", 42));
        employees.add(new Employee("Eve", 25));

        // Sort employees by age using a custom comparator
        Collections.sort(employees, Comparator.comparingInt(Employee::getAge));

        // Print the sorted employees
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

