package LeetCode.medium;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-10-20 09:35
 **/

public class medium29 {
    public int divide(int dividend, int divisor) {
        if(dividend == 0) return 0;
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        boolean negative;
        negative = (dividend ^ divisor) < 0;
        long t = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);
        int result = 0;
        for(int i = 31; i >= 0; i--){
            if((t >> i) >= d){
              result += 1 << i;
              t -= d << i;
            }
        }
        return negative ? - result : result;
    }

    public static void main(String[] args) {
        System.out.println(Math.abs(Integer.MIN_VALUE));
    }
}
