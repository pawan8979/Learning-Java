
import java.lang.System;

class movieBook {
    int total = 10;
    void bookSeat(int seats)
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        synchronized(this){
            if(total >= seats)
            {
                total-=seats;
                System.out.println("seats booked");
                System.out.println("seats available: "+ total);
            }
            else{
                System.out.println("Not booked");
                System.out.println("seats available: "+ total);
            }
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
    }

}

class __36MovieSyncBlock extends Thread{

    int seats;
    static movieBook m ;
    public void run(){
        m.bookSeat(seats);
    }
    public static void main(String[] args) {
        m = new movieBook();
        MovieSyncBlock pawan = new MovieSyncBlock();
        pawan.setName("pawan");
        pawan.seats= 7;
        pawan.start();
        MovieSyncBlock vivek = new MovieSyncBlock();
        vivek.setName("vivek");
        vivek.seats= 6;
        vivek.start();

    }

}
