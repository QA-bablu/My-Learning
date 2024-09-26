package javalearning;

//Step 1: Define the Employee class
class Employee {
 private String name;
 private String account;
 private double salary;
 
 // Parameterized constructor
 public Employee(String name, String account, double salary) {
     this.name = name;
     this.account = account;
     this.salary = salary;
 }
 
 // Getters (and optionally setters)
 public String getName() {
     return name;
 }
 
 public String getAccount() {
     return account;
 }
 
 public double getSalary() {
     return salary;
 }
}




