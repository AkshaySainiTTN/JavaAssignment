package Multithreading_day2;

import java.util.concurrent.*;

public class Ans5{
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor1 = Executors.newFixedThreadPool(2);
        ExecutorService executor2 = Executors.newFixedThreadPool(2);

        Runnable task = () -> {
            try {
                System.out.println(Thread.currentThread().getName() + " started");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " completed");
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted");
            }
        };

        System.out.println("Using shutdown");
        for (int i = 0; i < 3; i++) {
            executor1.submit(task);
        }
        executor1.shutdown();
        executor1.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Executor 1 terminated\n");

        System.out.println("Using shutdownNow");
        for (int i = 0; i < 3; i++) {
            executor2.submit(task);
        }
        Thread.sleep(500);
        java.util.List<Runnable> notStarted = executor2.shutdownNow();
        System.out.println("Tasks not started " + notStarted.size());
        executor2.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Executor 2 terminated");
    }
}
