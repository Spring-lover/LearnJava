package LeetCode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-10-22 16:35
 **/

public class medium763 {
    public List<Integer> partitionLabels(String S) {
        int[] last = new int[26];
        int length = S.length();
        for (int i = 0; i < length; i++) {
            last[S.charAt(i) - 'a'] = i;  // 维护一维数组的end下标
        }
        List<Integer> partition = new ArrayList<>();
        int start = 0, end = 0;
        for (int i = 0; i < length; i++) {
            end = Math.max(end, last[S.charAt(i) - 'a']);
            if (i == end) {
                partition.add(end - start + 1);
                start = end + 1;
            }
        }
        return partition;
    }
}
