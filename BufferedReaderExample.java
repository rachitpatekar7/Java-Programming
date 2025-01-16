import java.io.*;
public class BufferedReaderExample 
{
    public static void main(String[] args) 
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1;
        try 
        {
            System.out.print("Enter something: ");
        
            String input = reader.readLine();
            System.out.print("Enter number: ");
            num1 = Integer.parseInt(reader.readLine());
            System.out.println("You entered: " + input + " number " + num1);
        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred while reading input.");
        }
    }
}
