
import java.util.Scanner;

public class ExceptionHandlingDemo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        try
        {
            System.out.println("Enter the first number:");
            int num1 = scanner.nextInt();
            System.out.println("Enter the second number:");
            int num2 = scanner.nextInt();
            int result = num1 / num2;
            System.out.println("Result of division: " + num1 + "/" + num2 + " =" + result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch(Exception e)
        {
            System.out.println("Error:" + e.getMessage());
        } finally{
            scanner.close(); 
        }
    }
}

