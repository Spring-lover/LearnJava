package LeetCode.easy;

public class test344 {
    public void reverseString(char[] s) {
        int length = s.length;
        for(int i = 0; i < length / 2; i++){
            char t = s[i];
            s[i] = s[length - 1 - i];
            s[length - 1- i] = t;
        }
    }
}
