package LeetCode.Offer;

import java.util.Arrays;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-10-29 10:42
 **/

public class Offer17II {
    public void printNumber(int n) {
        int[] nums = new int[4];
        dfs(nums, 0);
    }

    public void dfs(int[] nums, int index) {
        if (index == 4) {
            System.out.println(Arrays.toString(nums));
            return ;
        }
        for(int i = 0; i < 4; i++){
            nums[index] = i;
            dfs(nums, index + 1);
        }
    }

    public static void main(String[] args) {
        Offer17II offer17II = new Offer17II();
        offer17II.printNumber(4);
    }
}
