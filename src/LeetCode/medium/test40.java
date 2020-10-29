package LeetCode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-09-10 19:01
 **/

public class test40 {
    private List<List<Integer>> result = new ArrayList<>();
    private List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates, target, 0);
        return result;
    }

    public void dfs(int[] candidates, int target, int index) {

        if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }
        if (target > 0) {
            for (int i = index; i < candidates.length; i++) {
                // 除去重复的值
                if (i > index && candidates[i] == candidates[i - 1]) continue;
                // 选择此值
                temp.add(candidates[i]);
                dfs(candidates, target - candidates[i], i + 1);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        test40 test40 = new test40();
        System.out.println(test40.combinationSum2(candidates, 8));
    }
}
