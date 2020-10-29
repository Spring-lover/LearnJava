package LeetCode.medium;

import LeetCode.Common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-10-29 12:11
 **/

public class medium129 {
    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }

    public int helper(TreeNode root, int i) {
        if (root == null) return 0;
        int temp = i * 10 + root.val;
        if (root.left == null && root.right == null) return temp;
        return helper(root.left, temp) + helper(root.right, temp);
    }
}
