package day13;

public class deadlocks {
    public static void main(String[] args) {
        final String resource1 = "Ravi";
        final String resource2 = "Kannegundla";

        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1: locked resource 1");

                    try { Thread.sleep(100);} catch (Exception e) {}

                    synchronized (resource2) {
                        System.out.println("Thread 1: locked resource 2");
                    }
                }
            }
        };


        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("now thread 2: locked resource 2");

                    try { Thread.sleep(100);} catch (Exception e) {}

                    synchronized (resource1) {
                        System.out.println("now thread 2: locked resource 1");
                    }
                }
            }
        };


        t1.start();
        t2.start();
    }
}
