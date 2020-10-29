package JavaConcurrencyInPractice.shiyanlou;

class ThreadA extends Thread {
    private String age;

    public ThreadA(String age) {
        this.age = age;
    }

    @Override
    public void run() {
        System.out.println("age= " + age);
    }
}

public class study1 {
    public static void main(String[] args) {
        String age = "12";
        Thread a = new ThreadA(age);
        a.start();
    }
}
