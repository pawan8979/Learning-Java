class Calculator
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
    public int sub(int n1, int n2)
    {
        return n1-n2;
    }
}

class Advance extends Calculator
{
    public int mult(int n1, int n2)
    {
        return n1*n2;
    }
    public int div(int n1, int n2)
    {
        return n1/n2;
    }

}

public class _14inheritance {
    public static void main(String[] args) {
        Advance obj= new Advance();
        int op1= obj.add(4,5);
        int op2= obj.sub(10,4);
        int op3= obj.mult(2,3);
        int op4= obj.div(6,2);

        System.out.println(op1 + " " + op2 + " " + op3 + " " + op4);
        
    }
}
