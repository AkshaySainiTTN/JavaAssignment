package Multithreading_day2;
import java.util.concurrent.*;
import java.util.Random;

public class Ans4{
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<Integer> randomTask = () -> {
            Random rand = new Random();
            int num = rand.nextInt(100);
            System.out.println(Thread.currentThread().getName() + " generated: " + num);
            return num;
        };

        Future<Integer> future = executor.submit(randomTask);
        int result = future.get();
        System.out.println("Main thread received result " + result);

        executor.shutdown();
    }
}
