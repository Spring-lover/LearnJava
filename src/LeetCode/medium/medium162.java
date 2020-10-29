package LeetCode.medium;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-10-21 10:22
 **/

public class medium162 {
    // logN : 二分法
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[mid + 1]){
                right = mid;
            }else{
                left = mid  + 1;
            }
        }
        return left;
    }
}
