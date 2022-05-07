package multithreading;

//public class Test3 extends Thread{
//    @Override
//    public void run() {
//        for (int i = 0; i < 1000; i++) {
//            System.out.println(i);
//        }
//    }
//
//    public static void main(String[] args) {
//        Test3 thread = new Test3();
//        thread.start();
//
//        for (int i = 1000; i > 0 ; i--) {
//            System.out.println(i);
//        }
//
//    }
//}


public class Test3 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Test3());
        thread.start();

        for (int i = 1000; i > 0 ; i--) {
            System.out.println(i);
        }

    }
}