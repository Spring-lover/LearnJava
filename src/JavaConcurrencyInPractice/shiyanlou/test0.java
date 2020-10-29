package JavaConcurrencyInPractice.shiyanlou;


public class test0 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println("hello world");
        System.out.println("hello world");
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("hello myRunnable" + Thread.currentThread().getName());
    }
}
