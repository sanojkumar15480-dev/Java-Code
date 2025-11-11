import java.util.Scanner;


public class CheckEvenodd 
{
    public static void main(String ages[])
    {
        int num;
        System.out.println("enter the Integer number:");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        if(num%2 ==0)
        System.out.println("Enter the number is even:");
        else
        System.out.println("Enter tne number is odd:");
    }
}
