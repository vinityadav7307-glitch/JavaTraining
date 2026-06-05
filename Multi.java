class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("MyThread is running: " + i);


            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}
// Implementing Runnable Interface
class MyRunnable implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 3; i++) {
            System.out.println("MyRunnable is running: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class Multi {

    public static void main(String[] args) {

        System.out.println("Main Thread Starts....");

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        MyRunnable r1 = new MyRunnable();
        Thread t3 = new Thread(r1);

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Main Thread Ends....");
    }
}