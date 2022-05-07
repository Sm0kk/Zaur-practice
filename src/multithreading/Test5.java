package multithreading;

public class Test5 {
    public static void main(String[] args) {
        MyThread5 thread5 = new MyThread5();
        thread5.setName("My thread");
        thread5.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Name of thread5 = " + thread5.getName() +
                " Priority of thread5 = " + thread5.getPriority());

    }
}

class MyThread5 extends Thread{
    public void run() {
        System.out.println("Hello");
    }
}
