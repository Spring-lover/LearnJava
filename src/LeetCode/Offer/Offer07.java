package LeetCode.Offer;

import LeetCode.Common.TreeNode;

import java.util.Arrays;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-10-27 09:32
 **/

public class Offer07 {
    // preorder 前序遍历 根 左 右
    // inorder 中序遍历 左 根 右
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        if (n == 0) return null;
        int rootValue = preorder[0], rootIndex = 0;
        for (int i = 0; i < n; i++) {
            if (rootValue == inorder[i]) {
                rootIndex = i;
                break;
            }
        }
        TreeNode root = new TreeNode(rootValue);
        root.left = buildTree(
                Arrays.copyOfRange(preorder, 1, 1 + rootIndex),
                Arrays.copyOfRange(inorder, 0, rootIndex)
        );
        root.right = buildTree(
                Arrays.copyOfRange(preorder, rootIndex + 1, n),
                Arrays.copyOfRange(inorder, rootIndex + 1, n)
        );
        return root;
    }
}
