package LeetCode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-10-28 15:01
 **/

public class easy1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        for (int num : arr) {
            hashmap.put(num, hashmap.getOrDefault(num, 0) + 1);
        }
        int hashSize = hashmap.size();
        Set<Integer> hashset = new HashSet<>();
        for (Integer hashNum : hashmap.keySet()) {
            hashset.add(hashmap.get(hashNum));
        }
        return hashSize == hashset.size();
    }
}
