import java.util.Scanner;

class Account{
    int total;
    Account(int total)
    {
        this.total = total;
    }
    public boolean isSufficient(int wd)
    {
        if(total >= wd) return true;
        else return false;
    }

    public void withdraw(int amt)
    {
            total -= amt;
            System.out.println("withdrawed money: " + amt);
            System.out.println("Remaining balance: " + total);
    }
}

class customer extends Thread
{
    Account a;
    String name;
    public customer(Account a, String name)
    {
        this.a = a; 
        this.name = name;
    }
   public void run()
   {
        Scanner scan = new Scanner(System.in);
        synchronized(a)
        {
            System.out.println(name + ": Enter amount to withdraw");
            int amt = scan.nextInt();
            if(a.isSufficient(amt))
            {
                System.out.println("withdrawing for: " + name);
                a.withdraw(amt);
            }
            else
            System.out.println("Insufficient balance");
        }
   }
}

public class __38banksync
{
    public static void main(String[] args) {
        Account a1 = new Account(1000);
        customer c1 = new customer(a1, "Pawan");
        c1.start();
        customer c2 = new customer(a1, "Vivek");
        c2.start();
    }
}