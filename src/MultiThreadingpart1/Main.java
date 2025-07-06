package MultiThreadingpart1;

class MyThreadd extends Thread {
    // Volatile variable
    volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Thread is running...");
        }
        System.out.println("Thread stopped.");
    }

    public void stopThread() {
        running = false;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThreadd t = new MyThreadd();
        t.start();

        Thread.sleep(1000); // Let the thread run for 1 second

        t.stopThread(); // Change the volatile variable to stop the thread
    }
}
