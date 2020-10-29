package LeetCode.easy;

import LeetCode.Common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-09-12 09:37
 **/

public class test367 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            double sum = 0;
            int Qsize = queue.size();
            for (int i = 0; i < Qsize; i++) {
                TreeNode temp = queue.poll();
                sum += temp.val;
                if (temp.left != null) queue.offer(temp.left);
                if (temp.right != null) queue.offer(temp.right);
            }
            result.add(sum / Qsize);
        }
        return result;
    }
}
