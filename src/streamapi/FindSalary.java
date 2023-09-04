package streamapi;

import java.util.ArrayList;
import java.util.List;

class Employees {
    private String name;
    private double salary;

    public Employees(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

public class FindSalary {
    public static void main(String[] args) {
        List<Employees> employees = new ArrayList<>();
        employees.add(new Employees("John", 120.0));
        employees.add(new Employees("Alice", 80.0));
        employees.add(new Employees("Bob", 150.0));
        employees.add(new Employees("Eve", 90.0));

        long count = employees.stream()
                .filter(employee -> employee.getSalary() > 100)
                .count();

        System.out.println("Number of employees with a salary greater than 100: " + count);
    }
}
