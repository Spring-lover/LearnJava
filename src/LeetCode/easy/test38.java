package LeetCode.easy;

import java.time.temporal.Temporal;

public class test38 {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        String temp = countAndSay(n - 1);
        StringBuffer sb = new StringBuffer();
        char c = '0';
        int count = 0;
        for(int i = 0; i < temp.length(); i++){
            if(i == 0){
                c = temp.charAt(i);
                count = 1;
            }else {
                if(temp.charAt(i) == c){
                    count ++;
                }else{
                    sb.append(count);
                    sb.append(c);
                    c = temp.charAt(i);
                    count = 1;
                }
            }
        }
        sb.append(count);
        sb.append(c);
        return sb.toString();
    }
}
