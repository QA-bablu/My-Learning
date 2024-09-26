package objectorientedconcepts;

import java.util.TreeSet;

class Employ {
    private String name;
    private int id;

    public Employ(String name, int id) {
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

public class SortedTreeSetEmployeeWithLambda {
    public static void main(String[] args) {
        // Create a TreeSet of Employees sorted by name
        TreeSet<Employee> employees = new TreeSet<>((e1, e2) -> e1.getName().compareTo(e2.getName()));

        // Add employees to the TreeSet
        employees.add(new Employee("John", 101));
        employees.add(new Employee("Alice", 102));
        employees.add(new Employee("Bob", 103));
        employees.add(new Employee("Eva", 104));

        // Print the sorted employees
        System.out.println("Employees sorted by name:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

