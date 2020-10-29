package LeetCode.medium;

import LeetCode.Common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-10-27 09:08
 **/

public class medium144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        InOrder(root, result);
        return result;
    }

    public void InOrder(TreeNode root, List<Integer> res) {
        if (root != null) {
            res.add(root.val);
            InOrder(root.left, res);
            InOrder(root.right, res);
        }
    }
}
