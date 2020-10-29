package LeetCode.Offer;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-10-29 11:57
 **/

public class Offer19 {
    // 主要是*的选择问题 可以匹配多个或者0个
    // f[i][j] 代表 s[:i] 和 p[:j]
    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                if (j == 0) {
                    dp[i][j] = i == 0; // 空正则 仅当字符串也是空 为true
                } else {
                    if (p.charAt(j - 1) != '*') {
                        if (i > 0 && (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.')) {
                            dp[i][j] = dp[i - 1][j - 1];
                        }
                    } else {
                        if (j >= 2) {
                            dp[i][j] = dp[i][j - 2];
                        }
                        if(i>= 1 && j >= 2 && (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.')){
                            dp[i][j] = dp[i - 1][j];
                        }
                    }
                }
            }
        }
        return dp[s.length()][p.length()];
    }
}