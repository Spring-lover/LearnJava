package LeetCode.easy;

public class test48 {
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        // 先转矩阵
        for(int i = 0; i < rows; i ++){
            for(int j = i; j < cols; j++){
                if(i == j) continue;
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // 再转每一行
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols / 2; j++){
                int swap = matrix[i][j];
                matrix[i][j] = matrix[i][cols - j - 1];
                matrix[i][cols - j - 1] = swap;
            }
        }
    }
}
