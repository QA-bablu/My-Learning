package javalearning;

interface EmployeeCreator {
    Employee create(String name, String account, double salary);
}

public class EmployeeDetails {
    public static void main(String[] args) {
        // Step 3: Using constructor reference to create Employee objects
        EmployeeCreator creator = Employee::new;
        
        // Create an Employee using the constructor reference
        Employee emp1 = creator.create("John Doe", "AC123", 50000.0);
        
        // Displaying the details of the created Employee object
        System.out.println("Employee Details:");
        System.out.println("Name: " + emp1.getName());
        System.out.println("Account: " + emp1.getAccount());
        System.out.println("Salary: $" + emp1.getSalary());
    }
}