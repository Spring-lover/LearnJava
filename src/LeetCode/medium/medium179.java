package LeetCode.medium;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-10-21 10:37
 **/

public class medium179 {
    public String largestNumber(int[] nums) {
        String[] asStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            asStrs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(asStrs, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        if (asStrs[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();
        for (String numAsStr : asStrs) {
            sb.append(numAsStr);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"1", "2", "3", "4"};
        Arrays.sort(strs, Comparator.reverseOrder());
        Arrays.sort(strs, String::compareTo);
        System.out.println(Arrays.toString(strs));
    }
}
