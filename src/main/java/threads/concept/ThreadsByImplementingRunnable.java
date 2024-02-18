package threads.concept;

import static java.lang.Thread.sleep;

public class ThreadsByImplementingRunnable implements Runnable{
    @Override
    public void run() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(this.getName());
    }

    private String getName() {
        return "Runnable";
    }
}
