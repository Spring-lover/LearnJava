package LeetCode.easy;

import LeetCode.Common.TreeNode;

public class test101 {

    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    private boolean check(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;

        return left.val == right.val && check(left.left, right.right) && check(left.right, right.left);
    }
}
