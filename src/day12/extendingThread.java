package day12;

public class extendingThread extends Thread {
    @Override
    public void run() {


        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        extendingThread obj = new extendingThread();

        System.out.println("Printing the first 10 number's by extending the  thread class ");
        obj.start();
    }



}
