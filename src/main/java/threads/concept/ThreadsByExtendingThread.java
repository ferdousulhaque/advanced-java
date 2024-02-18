package threads.concept;

public class ThreadsByExtendingThread extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(this.getName());
    }
}

