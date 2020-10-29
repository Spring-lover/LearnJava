package LeetCode.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-09-12 17:05
 **/

public class hot3 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hashset = new HashSet<>();
        int ans = 0, rk = -1;
        for (int i = 0; i < s.length(); i++) {
            if (i != 0) hashset.remove(s.charAt(i));
            while (rk + 1 < s.length() && !hashset.contains(s.charAt(rk + 1))) {
                hashset.add(s.charAt(rk + 1));
                rk++;
            }
            ans = Math.max(ans, rk + 1 - i);
        }
        return ans;
    }
}
