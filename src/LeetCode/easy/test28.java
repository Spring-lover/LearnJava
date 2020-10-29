package LeetCode.easy;

public class test28 {
    private int[] next;

    public int strStr(String haystack, String needle) {
        getNext(needle);
        return KMP(haystack, needle);
    }
    public int KMP(String t, String p){
        int i = 0;
        int j = 0;
        while(i < t.length() && j < p.length()){
            if(j == -1 || t.charAt(i) == p.charAt(j)){
                i ++;
                j ++;
            }else{
                j = next[j];
            }
        }
        if(j == p.length()) return i - p.length();
        return -1;
    }
    public void getNext(String needle){
        next = new int[needle.length() + 1];
        next[0] = -1;
        int i = 0, j = -1;
        while(i < needle.length()){
            if(j == -1 || needle.charAt(i) == needle.charAt(j)){
                i ++;
                j ++;
                next[i] = j;
            }else {
                j = next[j];
            }
        }
    }
}
