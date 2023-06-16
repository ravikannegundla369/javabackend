package day13;


    class Person extends Thread
    {

        Reservation reserve;
        int requestedSeats;

        public Person(Reservation reserve, int requestedSeats)
        {
            this.reserve = reserve;
            this.requestedSeats = requestedSeats;
        }

        @Override
        public void run()
        {
            reserve.reserveSeat(requestedSeats);
        }
    }

