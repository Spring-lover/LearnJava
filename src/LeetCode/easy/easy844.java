package LeetCode.easy;

import java.util.Stack;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-10-19 09:15
 **/

public class easy844 {
    public boolean backspaceCompare(String S, String T) {
        return build(S).equals(build(T));
    }

    public String build(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#') sb.append(s.charAt(i));
            else {
                if (sb.length() != 0) sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }
}
