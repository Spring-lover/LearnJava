package LeetCode.Offer;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-10-27 14:56
 **/

public class Offer11 {
    // 旋转数组 12345 -> 32145
    // 2 2 2 0 1 r2
    public int minArray(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int pivot = low + (high - low) / 2;
            if (numbers[pivot] < numbers[high]) {
                high = pivot;
            } else if (numbers[pivot] > numbers[high]) {
                low = pivot + 1;
            } else {
                high -= 1;
            }
        }
        return numbers[low];
    }
}
