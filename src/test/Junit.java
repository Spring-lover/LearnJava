package test;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Junit {
    @Test
    public void testHashMap() {
        Map<Integer, Integer> hashmap1 = new HashMap<>();
        Map<Integer, Integer> hashmap2 = new HashMap<>();
        hashmap1.put(1, 2);
        hashmap2.put(1, 2);
        System.out.println(hashmap1 == hashmap2);
    }

    @Test
    public void ArrayEqual() {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println(Arrays.equals(a, b));
    }

    @Test
    public void testLowerCase() {
        String str = "Abc";
        System.out.println(str.toLowerCase());
    }

    @Test
    public void testGetFile() {
        String path = "/Users/hujiale/IdeaProjects/LoveJava/src/LeetCode/Common";
        File file = new File(path);
        File[] files = file.listFiles();
        for (File temp : files) {
            System.out.println(path + "/" + temp.getName());
        }
    }

    @Test
    public void testSet() {
        Set<Character> hashset = new HashSet<>();
        hashset.add('c');
        hashset.add('a');
        hashset.add('b');
        System.out.println(hashset);
        hashset.remove('a');
        System.out.println(hashset);
    }

    @Test
    public void testShell4Java() {
        while (true) {
            System.out.println("Hello Java");
        }
    }
}
