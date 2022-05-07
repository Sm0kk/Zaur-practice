package hyper_threading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ATM {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("Zaur", lock);
        new Employee("Oleg", lock);
        new Employee("Elena", lock);
        Thread.sleep(3000);
        new Employee("Vioktor", lock);
        new Employee("Marina", lock);
    }
}

class Employee extends Thread {
    private String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        if (lock.tryLock()) {
            try {
//                System.out.println(name + " wait");
//                lock.lock();
                System.out.println(name + " using an hyper_threading.ATM");
                Thread.sleep(2000);
                System.out.println(name + " stopped using an hyper_threading.ATM...");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
        else {
            System.out.println(name + " don't want wait an hyper_threading.ATM");
        }
    }
}
