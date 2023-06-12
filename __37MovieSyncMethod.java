import java.lang.System;

class movieBook {
    int total = 10;
    synchronized void bookSeat(int seats)
    {
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

}

class __37MovieSyncMethod extends Thread{

    int seats;
    static movieBook m ;
    public void run(){
        m.bookSeat(seats);
    }
    public static void main(String[] args) {
        m = new movieBook();
        __37MovieSyncMethod pawan = new __37MovieSyncMethod();
        pawan.seats= 7;
        pawan.start();
        __37MovieSyncMethod vivek = new __37MovieSyncMethod();
        vivek.seats= 6;
        vivek.start();

    }

}
