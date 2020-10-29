package LeetCode.Offer;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-10-28 19:25
 **/

public class Offer16 {
    public double myPow(double x, int n) {
        boolean flag = false;
        if (n < 0) {
            n = -n;
            flag = true;
        }
        double res = 1;
        double tt = x;
        while (n != 0) {
            if ((n & 1) == 1) {
                res *= tt;
            }
            tt *= tt;
            n /= 2;
        }
        if (flag) return res;
        else return 1.0 / res;
    }
}
