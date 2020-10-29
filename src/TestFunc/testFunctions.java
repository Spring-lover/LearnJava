package TestFunc;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-10-27 09:35
 **/

public class testFunctions {
    @Test
    public void testArrayCopyFunc() {
        int[] nums = new int[]{1, 2, 3, 4};
        int[] newNums = Arrays.copyOfRange(nums, 0, 2);
        for (int num : newNums) {
            System.out.println(num);
        }
    }


}
