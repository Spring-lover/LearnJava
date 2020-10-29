package LeetCode.easy;

import java.util.Arrays;

public class test350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int [] intersections = new int[nums1.length + nums2.length];
        int i = 0, index1 = 0, index2 = 0;
        while(index1 < nums1.length && index2 < nums2.length){
            if(nums1[index1] > nums2[index2]){
                index2 += 1;
            }else if(nums1[index1] < nums2[index2]){
                index1 += 1;
            }else{
                index1 += 1;
                index2 += 1;
                intersections[i ++] = nums1[index1];
            }
        }
        return Arrays.copyOfRange(intersections, 0, i);
    }
}
