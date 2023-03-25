
class Calculator
{
    public
    double add(double a, double b)
    {
        return a+b;
    }
    int add(int a, int b, int c)
    {
        return a+b+c;
    }

}

public class _4methodOverloading 
{
    public static void main(String args[])
    {
        int a= 10;
        int b=20;
        int c= 30;
        Calculator cal= new Calculator();
        System.out.println("The calculated value is: " + cal.add(a,b));
        System.out.println("The calculated value is: " + cal.add(a,b,c));
    }   
}
