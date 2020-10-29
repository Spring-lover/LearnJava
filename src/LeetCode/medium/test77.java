package LeetCode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-09-08 19:43
 **/

public class test77 {
    private List<Integer> temp = new ArrayList<>();
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        dfs(1, n, k);
        return res;
    }

    private void dfs(int start, int end, int number) {
        if (temp.size() + (end - start + 1) < number) return;
        if (temp.size() == number) {
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(start);
        dfs(start + 1, end, number);
        temp.remove(temp.size() - 1);
        dfs(start + 1, end, number);
    }
}
