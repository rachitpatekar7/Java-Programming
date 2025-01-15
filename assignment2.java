import java.util.*;

// base class s
class calc 
{
    // access specifier
    protected int result;

    //constructor
    public calc() 
    {
        result = 0;
    }

    //method
    public int add(int a, int b) 
    {
        result = a + b;

        return result;
    }

  
    public int subtract(int a, int b) 
    {
        result = a - b;
        return result;
    }

    public int multiply(int a, int b) 
    {
        result = a * b;
        return result;
    }


    public double divide(int a, int b) 
    {
        if (b != 0) 
        {
            result = a / b;
            return a / (double) b; 
        } 
        else 
        {
            System.out.println("cant divide it is zero!");
            return 0;
        }
    }

    public void displayResult() 
    {
        System.out.println("Result: " + result);
    }
}

// inherited class 
class ac extends calc 
{

   
    public double power(int a, int b) 
    {
        result = (int) Math.pow(a, b);
        return result;
    }

    public int factorial(int a) 
    {
        result = 1;
        for (int i = 1; i <= a; i++) 
        {
            result *= i;
        }
        return result;
    }
}


public class assignment2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        //object creation
        ac calc = new ac();
        
        int choice;
        do 
        {
            System.out.println("\nRachit Calculator");
            System.out.println("Select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Factorial");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            int a, b;
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter value of A: ");
                    a = sc.nextInt();
                    System.out.print("Enter value of B: ");
                    b = sc.nextInt();
                    calc.add(a, b);
                    calc.displayResult();
                    break;

                case 2:
                    System.out.print("Enter value of A: ");
                    a = sc.nextInt();
                    System.out.print("Enter value of B: ");
                    b = sc.nextInt();
                    calc.subtract(a, b);
                    calc.displayResult();
                    break;

                case 3:
                    System.out.print("Enter value of A: ");
                    a = sc.nextInt();
                    System.out.print("Enter value of B: ");
                    b = sc.nextInt();
                    calc.multiply(a, b);
                    calc.displayResult();
                    break;

                case 4:
                    System.out.print("Enter value of A: ");
                    a = sc.nextInt();
                    System.out.print("Enter value of B: ");
                    b = sc.nextInt();
                    calc.divide(a, b);
                    calc.displayResult();
                    break;

                case 5:
                    System.out.print("Enter base value A: ");
                    a = sc.nextInt();
                    System.out.print("Enter exponent value B: ");
                    b = sc.nextInt();
                    calc.power(a, b);
                    calc.displayResult();
                    break;

                case 6:
                    System.out.print("Enter number for factorial: ");
                    a = sc.nextInt();
                    calc.factorial(a);
                    calc.displayResult();
                    break;

                case 7:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 7);

    }
}
