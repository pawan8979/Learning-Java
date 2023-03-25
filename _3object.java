
class Calculator
{
    public
    int ans;

    int add(int a, int b)
    {
        ans= a+b;
        return ans;
    }

}

public class _3object
{
    public static void main(String args[])
    {
        int a= 10;
        int b=20;
        Calculator cal= new Calculator();
        System.out.println("The calculated value is: " + cal.add(a,b));
    }   
}
