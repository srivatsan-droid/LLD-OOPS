package Inheritance.EmployeeManagementSystem;
class Employee {
    String name;
    int id;
    double salary;
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
class Manager extends Employee {
    String department;
    Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }
    void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 123, 50000.0);
        employee.display();
        Manager manager = new Manager("Jane Doe", 456, 80000.0, "Sales");
        manager.display();
    }
}
