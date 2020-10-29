package Java2Shell;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-10-20 19:47
 **/

public class HelloShell {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(3000);
        System.out.println("Hello Shell");
        /*运行的程序主体*/
        long end = System.currentTimeMillis();
        System.out.println("程序运行时间：" + (end - start) + "ms");
    }
}
