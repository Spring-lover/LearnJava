package LeetCode.easy;

import LeetCode.Common.TreeNode;

public class test108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }

    private TreeNode dfs(int[] nums, int start, int end) {
        if (start > end) return null;
        int mid = (end - start) / 2 + start;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = dfs(nums, start, mid - 1);
        node.right = dfs(nums, mid + 1, end);
        return node;
    }
}
