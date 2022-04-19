package com.algorithm.array.printmatrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-04-19 11:01
 * @Description: 顺时针从外到里打印矩阵(二维数组)
 */
public class MatrixPrint {
    public int[] spiralOrder(int[][] matrix){
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return new int[0];
        }

        List<Integer> res = new ArrayList<>();
        int r1 = 0, r2 = matrix.length - 1, c1 = 0, c2 = matrix[0].length - 1;

        while(r1 <= r2 && c1 <= c2){

            //从左往右（最上面）
            for(int i = c1; i <= c2; i++){
                res.add(matrix[r1][i]);
            }

            //从上往下（最右面）
            for(int i = r1 +1; i <= r2; i++){
                res.add(matrix[i][c2]);
            }

            //从右往左（最下面）
            if(r1 != r2){
                for(int i = c2-1; i >= c1; i--){
                    res.add(matrix[r2][i]);
                }
            }

            //从下往上（最左面）
            if(c1 != c2){
                for(int i = r2 - 1; i > r1; i--){
                    res.add(matrix[i][c1]);
                }
            }

            r1++;
            r2--;
            c1++;
            c2--;
        }

        return res.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        int[][] c = {};
        int[] ints = new MatrixPrint().spiralOrder(c);
        System.out.println(Arrays.toString(ints));
    }
}
