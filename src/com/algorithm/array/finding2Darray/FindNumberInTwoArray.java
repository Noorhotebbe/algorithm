package com.algorithm.array.finding2Darray;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-03-28 10:09
 * @Description: 二维数组中的查找
 */
public class FindNumberInTwoArray {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length, n = matrix[0].length;
        int row = 0, col = n - 1;
        while (row < m && col >= 0) {
            if (target < matrix[row][col]) {
                col--;
            } else if (target > matrix[row][col]) {
                row++;
            } else {
                return true;
            }
        }
        return false;
    }
}
