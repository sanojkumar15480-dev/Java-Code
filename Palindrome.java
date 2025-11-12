public class Palindrome 
{
    public static void main(String args[])
    {
        int num = 123, reversedInterger = 0, remiander, originalInteger;
        originalInteger = num;
        while(num!=0)
        {
            remiander = num % 10;
            reversedInterger = reversedInterger * 10 + remiander;
            num /=10;
        }
        if(originalInteger== reversedInterger)
        System.out.println(originalInteger + " is a palinddrome.");
        else
        System.out.println(originalInteger + " is not a palindrome.");
    }
}
