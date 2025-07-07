package Multithreading_day2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SharedResource {
    private final Lock lock = new ReentrantLock();
    public void accessResources(SharedResource other, String myName, String otherName) {
        boolean gotMyLock = false;
        boolean gotOtherLock = false;
        try {
            // Try to acquire my lock
            gotMyLock = this.lock.tryLock(500, TimeUnit.MILLISECONDS);
            if (gotMyLock) {
                System.out.println(Thread.currentThread().getName() + " locked " + myName);

                Thread.sleep(100); // simulate work

                // Try to acquire other resource's lock
                gotOtherLock = other.lock.tryLock(500, TimeUnit.MILLISECONDS);
                if (gotOtherLock) {
                    System.out.println(Thread.currentThread().getName() + " locked " + otherName);
                    System.out.println(Thread.currentThread().getName() + " successfully working with both resources");
                } else {
                    System.out.println(Thread.currentThread().getName() + " could not lock " + otherName);
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " could not lock " + myName);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            // Always unlock in reverse order of locking
            if (gotOtherLock) other.lock.unlock();
            if (gotMyLock) this.lock.unlock();
        }
    }
}

public class Ans2 {
    public static void main(String[] args) {
        SharedResource resourceA = new SharedResource();
        SharedResource resourceB = new SharedResource();

        Thread t1 = new Thread(() -> {
            resourceA.accessResources(resourceB, "Resource A", "Resource B");
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            resourceB.accessResources(resourceA, "Resource B", "Resource A");
        }, "Thread-2");

        t1.start();
        t2.start();
    }
}

