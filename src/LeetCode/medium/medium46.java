package LeetCode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-10-29 10:31
 **/

public class medium46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        dfs(nums, res, new ArrayList<>(), visited);
        return res;
    }

    public void dfs(int[] nums, List<List<Integer>> res, List<Integer> tmp, boolean[] vis) {
        if (tmp.size() == nums.length) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!vis[i]) {
                vis[i] = true;
                tmp.add(nums[i]);
                dfs(nums, res, tmp, vis);
                tmp.remove(tmp.size() - 1);
                vis[i] = false;
            }
        }
    }
}
