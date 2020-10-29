package LeetCode.easy;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-10-04 10:05
 **/

public class test121 {
    public int maxProfit(int[] prices) {
        int result = 0;
        int min = Integer.MAX_VALUE;
        for (int price : prices) {
            if (min > price) min = price;
            result = Math.max(result, price - min);
        }
        return result;
    }

    public int maxProfitDP(int[] prices) {
        int length = prices.length;
        if (length < 2) return 0;

        int[][] dp = new int[length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];

        for (int i = 1; i < length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], -prices[i]);
        }

        return dp[length - 1][0];
    }
}
