package LeetCode.medium;

import LeetCode.Common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class test98 {
    private List<Integer> nodelist = new ArrayList<>();

    public boolean isValidBST(TreeNode root) {
        Inorder(root);
        for(int i = 1; i < nodelist.size(); i++){
            if(nodelist.get(i) <= nodelist.get(i - 1)) return false;
        }
        return true;
    }

    private void Inorder(TreeNode root){
        if(root == null) return ;
        Inorder(root.left);
        nodelist.add(root.val);
        Inorder(root.right);
    }
}
