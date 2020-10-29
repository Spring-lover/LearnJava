package LeetCode.Offer;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-10-28 18:51
 **/

public class Offer13II {
    public int cuttingRope(int n) {
        if (n <= 3) return n - 1;
        int a = n / 3;
        int b = n % 3;
        if (b == 0) {
            return (int) quickPow(3, a) % 1000000007;
        } else if (b == 1) {
            return (int) (quickPow(3, a - 1) * 4) % 1000000007;
        } else {
            return (int) quickPow(3, a) * 2 % 1000000007;
        }
    }

    public long quickPow(int x, long n) {
        long res = 1;
        long tt = x;
        while (n != 0) {
            if ((n & 1) == 1) {
                res *= tt;
                res %= 1000000007;
            }
            tt *= tt;
            tt %= 1000000007;
            n /= 2;
        }
        return res;
    }
}
