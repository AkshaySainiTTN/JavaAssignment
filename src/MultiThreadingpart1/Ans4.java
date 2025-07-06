package MultiThreadingpart1;
class Shared {
    void methodA(Shared other) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " locked resource A");
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            synchronized (other) {
                System.out.println(Thread.currentThread().getName() + " locked resource B");
            }
        }
    }
    void methodB(Shared other) {
        synchronized (other) {
            System.out.println(Thread.currentThread().getName() + " locked resource B");
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " locked resource A");
            }
        }
    }
}

public class Ans4 {
    public static void main(String[] args) {
        Shared obj1 = new Shared();
        Shared obj2 = new Shared();
        Thread t1 = new Thread(() -> obj1.methodA(obj2), "Thread-1");
        Thread t2 = new Thread(() -> obj2.methodB(obj1), "Thread-2");

        t1.start();
        t2.start();
    }
}
