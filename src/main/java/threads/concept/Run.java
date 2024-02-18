package threads.concept;

public class Run extends Thread {
    public static void main(String[] args) {
        System.out.println("Main Thread Priority: " + Thread.currentThread().getPriority());

        // Run a Thread that Extends Thread
        Thread byExtendingThread = new ThreadsByExtendingThread();
        byExtendingThread.start();

        // Run a Thread that Extends Thread
        Thread byImplementingRunnable = new Thread(new ThreadsByImplementingRunnable());
        byImplementingRunnable.start();

        // Running Threads start concurrently by Thread Join


    }
}
