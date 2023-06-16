package day12;

public class implementRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);

        }
    }

    public static void main(String[] args) {
        implementRunnable obj = new implementRunnable();
        Thread t1 = new Thread(obj);

        System.out.println("printing the first 10 number's by implementing Runnable interface");
        t1.start();
    }



}
