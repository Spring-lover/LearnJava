package LeetCode.hard;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-10-10 21:51
 **/

public class hard188 {
    public int maxProfit(int k, int[] prices) {
        int len = prices.length;
        if (k >= len / 2) {
            int res = 0;
            for (int i = 1; i < len; i++) {
                int diff = prices[i] - prices[i - 1];
                if (diff > 0) res += diff;
            }
            return res;
        }
        int[][][] dp = new int[len][k + 1][2];
        for (int i = 0; i < len; i++) {
            for (int j = 1; j <= k; j++) {
                if (i == 0) {
                    dp[0][j][1] = -prices[i];
                    continue;
                }
                dp[i][j][0] = Math.max(dp[i - 1][j][0], dp[i - 1][j][1] + prices[i]);
                dp[i][j][1] = Math.max(dp[i - 1][j - 1][0] - prices[i], dp[i - 1][j][1]);
            }
        }
        return dp[len - 1][k][0];
    }
}
