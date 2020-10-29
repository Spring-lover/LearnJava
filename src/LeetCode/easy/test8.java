package LeetCode.easy;

public class test8 {
    public int myAtoi(String str) {
        if (str.length() == 0) return 0;
        int cur = 0;
        int res = 0;
        int sign = 1;
        while (cur < str.length() && str.charAt(cur) == ' ') cur++;
        if (cur == str.length()) return 0;
        if (str.charAt(cur) == '+') {
            sign = 1;
            cur++;
        } else if (str.charAt(cur) == '-') {
            sign = -1;
            cur++;
        }
        for (int i = cur; i < str.length(); i++) {
            if (str.charAt(i) > '9' || str.charAt(i) < '0') {
                return sign * res;
            }
            int digit = str.charAt(i) - '0';
            if (sign > 0 && res > (Integer.MAX_VALUE - digit) / 10) return Integer.MAX_VALUE;
            if (sign < 0 && res != 0 && res > (Integer.MIN_VALUE + str.charAt(i) - '0') / 10 * (-1))
                return Integer.MIN_VALUE;
            res = res * 10 + digit;
        }
        return sign * res;
    }
}
