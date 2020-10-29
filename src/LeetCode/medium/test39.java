package LeetCode.medium;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-09-09 09:59
 **/

public class test39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combine = new ArrayList<>();
        dfs(result, combine, candidates, target, 0);
        return result;
    }

    private void dfs(List<List<Integer>> result, List<Integer> combine, int[] candidates, int target, int index) {
        if (index == candidates.length) return;

        if (target == 0) {
            result.add(new ArrayList<>(combine));
            return ;
        }

        // 直接跳过
        dfs(result, combine, candidates, target, index + 1);

        // 选择当前数
        if (target - candidates[index] >= 0) {
            combine.add(candidates[index]);
            dfs(result, combine, candidates, target - candidates[index], index);
            combine.remove(combine.size() - 1);
        }
    }
}
