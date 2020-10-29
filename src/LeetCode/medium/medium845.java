package LeetCode.medium;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-10-25 12:36
 **/

public class medium845 {
    public int longestMountain(int[] A) {
        int n = A.length;
        if (n == 0) return 0;
        int[] left = new int[n];
        for (int i = 1; i < n; i++) {
            left[i] = A[i - 1] < A[i] ? left[i - 1] + 1 : 0;
        }
        int[] right = new int[n];
        for (int i = n - 2; i >= 1; i--) {
            right[i] = A[i + 1] < A[i] ? right[i + 1] + 1 : 0;
        }
        int ans = 0;
        for (int i = 1; i < n - 1; i++) {
            if (left[i] > 0 && right[i] > 0) {
                ans = Math.max(left[i] + right[i] + 1, ans);
            }
        }
        return ans;
    }
}