package day13;

public class Reservation {


    static int availableSeats = 10;

    synchronized void reserveSeat(int requestedSeats)
    {
        System.out.println(Thread.currentThread().getName() + " entered.");
        System.out.println("Availableseats : " + availableSeats + " Requestedsetas : " + requestedSeats);
        if (availableSeats >= requestedSeats)
        {
            System.out.println("Seat Available. Reserve now :-)");
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread interrupted");
            }
            System.out.println(requestedSeats + " seats reserved.");
            availableSeats = availableSeats - requestedSeats;
        }
        else
        {
            System.out.println("Requested seats not available :-(");
        }
        System.out.println(Thread.currentThread().getName() + " leaving.");
        System.out.println("---------------------This thread is Completed -------------------------");
    }
}


