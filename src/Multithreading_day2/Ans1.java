package Multithreading_day2;
import java.util.concurrent.*;
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable is running.");
    }
}
class MyCallable implements Callable<String> {
    public String call() throws Exception {
        return "Callable result returned.";
    }
}
public class Ans1 {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(new MyCallable());
        String result = future.get();
        System.out.println("Callable returned: " + result);
        executor.shutdown();
    }
}
