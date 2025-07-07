package Multithreading_day2;

import java.util.concurrent.*;

public class Ans3 {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        Runnable task1 = () -> {
            System.out.println(Thread.currentThread().getName() + " processing Resource A");
            try { Thread.sleep(500); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        };

        Runnable task2 = () -> {
            System.out.println(Thread.currentThread().getName() + " processing Resource B");
            try { Thread.sleep(500); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        };

        Runnable task3 = () -> {
            System.out.println(Thread.currentThread().getName() + " processing Resource C");
            try { Thread.sleep(500); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        };

        singleThreadExecutor.submit(task1);
        fixedThreadPool.submit(task2);
        cachedThreadPool.submit(task3);

        singleThreadExecutor.shutdown();
        fixedThreadPool.shutdown();
        cachedThreadPool.shutdown();

        singleThreadExecutor.awaitTermination(2, TimeUnit.SECONDS);
        fixedThreadPool.awaitTermination(2, TimeUnit.SECONDS);
        cachedThreadPool.awaitTermination(2, TimeUnit.SECONDS);

        System.out.println("All resources processed");
    }
}
