package LeetCode.Offer;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-10-27 11:56
 **/

public class Offer10II {
    // f(0) = 1 f(1) = 1 f(2) = 2 f(3) = f(2) + f(1)
    // f(n)// sum = f(n - 1)// a + f(n - 2) //b
    public int numWays(int n) {
        int a = 1, b = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
