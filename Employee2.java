import java.util.Scanner;

class EmployeeException extends Exception {
    public EmployeeException(String msg) {
        System.out.print(msg);
    }
}

class Employee2 {
    private int empID;
    private String name;
    private int age;
    private double income;
    private String city;
    private String vehicle;

    public Employee2(int empID, String name, int age, double income, String city, String vehicle) {
        this.empID = empID;
        this.name = name;
        this.age = age;
        this.income = income;
        this.city = city;
        this.vehicle = vehicle;
    }

    public static Employee2 acceptDetails() throws EmployeeException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        if (age < 18 || age > 55) {
            throw new EmployeeException("Age should be between 18 and 55.");
        }

        System.out.print("Enter Monthly Income: ");
        double income = sc.nextDouble();
        sc.nextLine();

        if (income < 50000 || income > 100000) {
            throw new EmployeeException("Income should be between Rs. 50,000 and Rs. 1,00,000.");
        }
        System.out.print("Enter City: ");
        String city = sc.nextLine();

        if (!(city.equalsIgnoreCase("Pune") || city.equalsIgnoreCase("Mumbai") || city.equalsIgnoreCase("Bangalore")
                || city.equalsIgnoreCase("Chennai"))) {
            throw new EmployeeException("Employee must be staying in Pune, Mumbai, Bangalore, or Chennai.");
        }

        System.out.print("Enter Vehicle: ");
        String vehicle = sc.nextLine();

        if (vehicle == null || vehicle.isEmpty() || !vehicle.toLowerCase().contains("four")) {
            throw new EmployeeException("Employee must have a 4-wheeler vehicle.");
        }

        return new Employee2(id, name, age, income, city, vehicle);
    }

    public void displayDetails() {
        System.out.println(
                "\n********************************************************************************************");
        System.out.println("Employee Details:");
        System.out.println("Employee ID: " + empID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Income: Rs. " + income);
        System.out.println("City: " + city);
        System.out.println("Vehicle Type (No. Of Wheels): " + vehicle);
        System.out.println(
                "********************************************************************************************");
    }

    public static void main(String[] args) {
        try {
            Employee2 emp = Employee2.acceptDetails();
            emp.displayDetails();
        } catch (EmployeeException e) {
            System.out.println("Error occurred during employee details input.");
        }
    }
}
