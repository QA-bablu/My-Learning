package objectorientedconcepts;

import java.util.TreeSet;

import java.util.TreeSet;

class Employeee implements Comparable<Employeee> {
    private String name;
    private int id;

    public Employeee(String name, int id) {
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

    @Override
    public int compareTo(Employeee other) {
        return this.getName().compareTo(other.getName());
    }
}

public class SortedTreeSetEmployees {
    public static void main(String[] args) {
        // Create a TreeSet of Employees sorted by name
        TreeSet<Employeee> employees = new TreeSet<>();

        // Add employees to the TreeSet
        employees.add(new Employeee("John", 101));
        employees.add(new Employeee("Alice", 102));
        employees.add(new Employeee("Bob", 103));
        employees.add(new Employeee("Eva", 104));

        // Print the sorted employees
        System.out.println("Employees sorted by name:");
        for (Employeee employee : employees) {
            System.out.println(employee);
        }
    }
}
