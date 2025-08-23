public class ArmstrongNo {
    public static void main(String[] args){
        int n= 153,rev=0,rem,temp;
        temp =n;
        while(n>0){
            rem =n%10;
            rev=rev+rem*rem*rem;
            n=n/10;
        }
        if(temp==rev){
            System.out.println("ArmstrongNo");
        }
    }
}