class A implements Runnable{
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("I am class A");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable{
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("I am class B");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }
        }
    }
    
}

public class _34runnableThread {
    public static void main(String[] args) {
        A obj1= new A();
        Thread t1= new Thread(obj1);
        B obj2= new B();
        Thread t2= new Thread(obj2);

        t1.start();
        t2.start();
        
    }
}
