package hyper_threading;

public class DeadLockEx {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();
    }
}

class Thread10 extends Thread {
    @Override
    public void run() {
        System.out.println("hyper_threading.Thread10: Get try catch monitor of Object lock1");
        synchronized (DeadLockEx.lock1) {
            System.out.println("hyper_threading.Thread10: Monitor Object lock1 catch up");
            System.out.println("hyper_threading.Thread10: Get try catch monitor of Object lock2");
            synchronized (DeadLockEx.lock2) {
                System.out.println("hyper_threading.Thread10: Monitor Objects lock1 and lock2 catch up");
            }
        }
    }
}

class Thread20 extends Thread {
    @Override
    public void run() {
        System.out.println("hyper_threading.Thread20: Get try catch monitor of Object lock2");
        synchronized (DeadLockEx.lock2) {
            System.out.println("hyper_threading.Thread20: Monitor Object lock2 catch up");
            System.out.println("hyper_threading.Thread20: Get try catch monitor of Object lock1");
            synchronized (DeadLockEx.lock1) {
                System.out.println("hyper_threading.Thread20: Monitor Objects lock1 and lock2 catch up");
            }
        }
    }
}