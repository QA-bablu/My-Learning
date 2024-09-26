package objectorientedconcepts;

import java.util.*;

class Emply {
    private String name;
    private int id;

    public Emply(String name, int id) {
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

public class DescendingSortedTreeMapNameWithLamda {
    public static void main(String[] args) {
        // Creating a set of employees
        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee("John", 1));
        employees.add(new Employee("Alice", 2));
        employees.add(new Employee("Bob", 3));
        employees.add(new Employee("Diana", 4));

        // Creating a TreeMap to sort employees by name in descending order using lambda
        TreeMap<String, Employee> sortedEmployees = new TreeMap<>((name1, name2) -> name2.compareTo(name1));

        // Adding employees to the TreeMap
        for (Employee employee : employees) {
            sortedEmployees.put(employee.getName(), employee);
        }

        // Displaying the sorted employees
        for (Map.Entry<String, Employee> entry : sortedEmployees.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
