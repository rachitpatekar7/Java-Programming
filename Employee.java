package Ass1;
// Employee Information Management System

import java.util.Scanner;

class Employee
{
    // Attributes of Employee
    private String name;
    private int employeeNumber;
    private String qualification;
    private String address;
    private String contactNumber;
    private double basicSalary;
    private double da;
    private double ta;
    private double netSalary;

    // Default Constructor
    public Employee()
    {
        this.name = "Unknown";
        this.employeeNumber = 0;
        this.qualification = "Unknown";
        this.address = "Unknown";
        this.contactNumber = "Unknown";
        this.basicSalary = 0.0;
        this.da = 0.0;
        this.ta = 0.0;
        this.netSalary = 0.0;
    }

    // Parameterized Constructor
    public Employee(String name, int employeeNumber, String qualification, String address, String contactNumber, double basicSalary, double da, double ta)
    {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.qualification = qualification;
        this.address = address;
        this.contactNumber = contactNumber;
        this.basicSalary = basicSalary;
        this.da = da;
        this.ta = ta;
        calculateNetSalary();
    }

    // Copy Constructor
    public Employee(Employee other)
    {
        this.name = other.name;
        this.employeeNumber = other.employeeNumber;
        this.qualification = other.qualification;
        this.address = other.address;
        this.contactNumber = other.contactNumber;
        this.basicSalary = other.basicSalary;
        this.da = other.da;
        this.ta = other.ta;
        this.netSalary = other.netSalary;
    }

    // Method to calculate net salary
    private void calculateNetSalary()
    {
        this.netSalary = this.basicSalary + this.da + this.ta;
    }

    // Method to accept employee details
    public void acceptDetails()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        this.name = sc.nextLine();

        System.out.print("Enter Employee Number: ");
        this.employeeNumber = sc.nextInt();

        sc.nextLine(); // Consume the newline
        System.out.print("Enter Qualification: ");
        this.qualification = sc.nextLine();

        System.out.print("Enter Address: ");
        this.address = sc.nextLine();

        System.out.print("Enter Contact Number: ");
        this.contactNumber = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        this.basicSalary = sc.nextDouble();

        System.out.print("Enter DA: ");
        this.da = sc.nextDouble();

        System.out.print("Enter TA: ");
        this.ta = sc.nextDouble();

        calculateNetSalary();
    }

    // Method to display employee details
    public void displayDetails()
    {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + this.name);
        System.out.println("Employee Number: " + this.employeeNumber);
        System.out.println("Qualification: " + this.qualification);
        System.out.println("Address: " + this.address);
        System.out.println("Contact Number: " + this.contactNumber);
        System.out.println("Basic Salary: " + this.basicSalary);
        System.out.println("DA: " + this.da);
        System.out.println("TA: " + this.ta);
        System.out.println("Net Salary: " + this.netSalary);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numEmployees = sc.nextInt();
        sc.nextLine(); // Consume newline

        Employee[] employees = new Employee[numEmployees];

        // Accept details for each employee
        for (int i = 0; i < numEmployees; i++)
        {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            employees[i] = new Employee();
            employees[i].acceptDetails();
        }

        // Display details for each employee
        for (int i = 0; i < numEmployees; i++)
        {
            System.out.println("\nDetails of Employee " + (i + 1) + ":");
            employees[i].displayDetails();
        }
    }
}