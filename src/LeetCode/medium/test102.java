package LeetCode.medium;

import LeetCode.Common.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class test102 {
    List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        helper(root);
        return res;
    }

    private void helper(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> tempList = new LinkedList<>();
            int queueSz = queue.size();
            for (int i = 0; i < queueSz; i++) {
                TreeNode tempNode = queue.poll();
                if (tempNode.left != null) queue.add(tempNode.left);
                if (tempNode.right != null) queue.add(tempNode.right);
                tempList.add(tempNode.val);
            }
            res.add(tempList);
        }
    }
}
