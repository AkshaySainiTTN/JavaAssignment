package MultiThreadingpart1;
class Counter {
    int count = 0;
    public synchronized void increment() {
        count++;   // Synchronized method
    }

    // synchronized block
    public void decrement() {
        synchronized (this) {
            count--;
        }
    }
    public int getCount() {
        return count;
    }
}

public class Ans2 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.decrement();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + counter.getCount());
    }
}
