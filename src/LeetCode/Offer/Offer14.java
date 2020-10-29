package LeetCode.Offer;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-10-28 19:15
 **/

public class Offer14 {

    public int hammingWeight(int n) {
        // n & (n - 1)会将最右边的1变成0
        int count = 0;
        while (n != 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }
}
