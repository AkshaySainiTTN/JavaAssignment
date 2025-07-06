package MultiThreadingpart1;
class MyRunnable implements Runnable {
    public void run() {
        try {
            System.out.println("Runing");
            Thread.sleep(1000); // pause for 1 second
            System.out.println("finished");
        } catch (InterruptedException e) {
            System.out.println("thread interrupted");
        }
    }
}
class MyThread extends Thread {
    public void run() {
        try {
            System.out.println("running");
            Thread.sleep(1000); // pause for 1 second
            System.out.println("finished");
        } catch (InterruptedException e) {
            System.out.println("thread interrupted");
        }
    }
}
public class Ans1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyRunnable());
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Main thread ends");
    }

}
