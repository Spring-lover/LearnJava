package LeetCode.Offer;

import javax.swing.*;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-10-27 10:30
 **/

public class Offer10I {
    public int fib(int n) {
        int a = 0, b = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
