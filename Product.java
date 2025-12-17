
class product {
    public int multiply(int a, int b)
    {
    int prod =  a*b;
    return prod;
    }
    public int multiply(int a, int b, int c)
    {
    int prod= a * b * c;
    return prod;
    }
}

class GFG{
    public static void main(String args[])
    {
        product ob  = new product();
        int prod1 = ob.multiply(1,2);
        System.out.println("product of two numbers:" +  prod1);
        int prod2 = ob.multiply(1,2,3);
        System.out.println("product of three numbers:" + prod2);
    }
}