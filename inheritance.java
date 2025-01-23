import java.util.*;

class Employee 
{
    public void DisplaySalary(String name, double sal) 
    {
        System.out.println("********************************************");
        System.out.println(name);
        System.out.println("Salary: " + sal);
    }
}

class FullTimeEmployee extends Employee 
{
    public void CalculateSalary(double sal) 
    {
        sal = sal * 1.5;
        DisplaySalary("Type : Full-Time Employee", sal);
    }
}

class PartTimeEmployee extends Employee 
{
    public void CalculateSalary(double sal) 
    {
        sal = sal * 1.25;
        DisplaySalary("Type : Part-Time Employee", sal);
    }
}

public class inheritance 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double s;
        String name;
        System.out.println("Enter Name:");
        name = sc.nextLine();
        System.out.println("Enter Salary:");
        s = sc.nextDouble();
        Employee e = new Employee();
        e.DisplaySalary("Employee Name: "+name, s);
        PartTimeEmployee e1 = new PartTimeEmployee();
        e1.CalculateSalary(s);
        FullTimeEmployee e2 = new FullTimeEmployee();
        e2.CalculateSalary(s);
        System.out.println("********************************************");
    }
}
