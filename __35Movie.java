import java.lang.System;

class movieBook {
    int total = 10;
    void bookSeat(int seats)
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

class Movie extends Thread{

    int seats;
    static movieBook m ;
    public void run(){
        m.bookSeat(seats);
    }
    public static void main(String[] args) {
        m = new movieBook();
        Movie pawan = new Movie();
        pawan.seats= 7;
        pawan.start();
        Movie vivek = new Movie();
        vivek.seats= 6;
        vivek.start();

    }

}
