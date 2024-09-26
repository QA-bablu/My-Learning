package objectorientedconcepts;

import java.util.*;

class Emplye {
    private String name;
    private int id;

    public Emplye(String name, int id) {
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

public class DescendingSortedListOfEmployees {
    public static void main(String[] args) {
        // Creating a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 1));
        employees.add(new Employee("Alice", 2));
        employees.add(new Employee("Bob", 3));
        employees.add(new Employee("Diana", 4));

        // Sorting employees by name in descending order using Collections.sort with custom Comparator
        Collections.sort(employees, (e1, e2) -> e2.getName().compareTo(e1.getName()));

        // Displaying the sorted employees
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

