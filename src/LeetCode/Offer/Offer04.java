package LeetCode.Offer;

import java.util.Arrays;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-10-22 19:06
 **/

public class Offer04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0, col = cols - 1;
        while (row < rows && col >= 0) {
            int num = matrix[row][col];
            if (num == target) {
                return true;
            } else if (num > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}
