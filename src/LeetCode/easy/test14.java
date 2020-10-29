package LeetCode.easy;

import java.util.Arrays;

public class test14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        Arrays.sort(strs, (s1, s2) -> s1.length() - s2.length());
        int len = strs[0].length();
        int i = 0;
        StringBuffer sb = new StringBuffer();
        while (i < len) {
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].charAt(i) != strs[j + 1].charAt(i)) return sb.toString();
            }
            sb.append(strs[0].charAt(i));
            i++;
        }
        return strs[0];
    }
}
