package LeetCode.hard;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-10-10 21:16
 **/

public class hard123 {
    int maxProfit(int[] prices) {
        int length = prices.length;
        if (length < 2) return 0;

        int[][][] dp = new int[length][3][2];

        dp[0][1][1] = -prices[0];
        dp[0][2][1] = Integer.MIN_VALUE;

        for (int i = 1; i < length; i++) {
            dp[i][1][1] = Math.max(-prices[i], dp[i - 1][1][1]);
            dp[i][1][0] = Math.max(dp[i - 1][1][0], dp[i - 1][1][1] + prices[i]);
            dp[i][2][1] = Math.max(dp[i - 1][1][0] - prices[i], dp[i - 1][2][1]);
            dp[i][2][0] = Math.max(dp[i - 1][2][1] + prices[i], dp[i - 1][2][0]);
        }

        return Math.max(dp[length - 1][1][0], dp[length - 1][2][0]);
    }
}
