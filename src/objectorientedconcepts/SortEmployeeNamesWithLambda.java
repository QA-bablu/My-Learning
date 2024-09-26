package objectorientedconcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employe {
    private String name;
    private int id;

    public Employe(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

public class SortEmployeeNamesWithLambda {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 101));
        employees.add(new Employee("Alice", 102));
        employees.add(new Employee("Bob", 103));
        employees.add(new Employee("Eva", 104));

        // Sorting the list of employees based on their names in alphabetical order using lambda expression
        Collections.sort(employees, (e1, e2) -> e1.getName().compareTo(e2.getName()));

        // Printing the sorted list of employees
        System.out.println("Employees sorted in alphabetical order:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

