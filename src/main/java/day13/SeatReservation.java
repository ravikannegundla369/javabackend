package day13;

public class SeatReservation {

    public static void main(String[] args)
    {
        Reservation reserve = new Reservation();
        Person thread1 = new Person(reserve, 4);
        thread1.start();
        Person thread2 = new Person(reserve, 4);
        thread2.start();
        Person thread3 = new Person(reserve, 2);
        thread3.start();
        Person thread4 = new Person(reserve, 2);
        thread4.start();
    }

}
