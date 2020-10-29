package LeetCode.easy;

import java.util.HashMap;
import java.util.Map;

public class test387 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> hashmap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            hashmap.put(s.charAt(i), hashmap.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i = 0; i < s.length(); i++){
            if(hashmap.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }

}
