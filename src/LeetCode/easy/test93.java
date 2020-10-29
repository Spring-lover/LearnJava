package LeetCode.easy;

import java.util.LinkedList;
import java.util.List;

public class test93 {
    private List<String> result = new LinkedList<>();

    public List<String> restoreIpAddresses(String s) {
        int[] segments = new int[4];
        backtrack(s, 0, 0, segments);
        return result;
    }

    public void backtrack(String s, int start, int segmentNum, int[] segments) {
        if (segmentNum == 4) {
            if (start == s.length()) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < 3; i++) {
                    sb.append(segments[i]).append(".");
                }
                sb.append(segments[3]);
                result.add(sb.toString());
            }
            return;
        }
        if (start == s.length()) return ;

        if(s.charAt(start) == '0'){ // ip 地址 不能使用前导0
            segments[segmentNum] = 0;
            backtrack(s, start + 1, segmentNum + 1, segments);
        }
        int temp = 0;
        for(int end = start; end < s.length(); end++){
            temp = temp * 10 + s.charAt(end) - '0';
            if(temp > 0 && temp <= 255){
                segments[segmentNum] = temp;
                backtrack(s, end + 1, segmentNum + 1, segments);
            }else break; // 如果不加break 则会将把010 视为 10 导致结果错误
        }
    }
}
