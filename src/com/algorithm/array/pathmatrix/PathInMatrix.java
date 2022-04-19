package com.algorithm.array.pathmatrix;


/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-04-18 11:34
 * @Description: 矩阵中的路径(递归回溯 + 深度优先搜索)
 * 给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。
 * <p>
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 */
public class PathInMatrix {
    public boolean exist(char[][] matrix, String word) {
        char[] words = word.toCharArray();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (dfs(matrix, words, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * 递归回溯+深度优先搜索
     *
     * @param board
     * @param word
     * @param m
     * @param n
     * @param k
     * @return
     */
    public boolean dfs(char[][] board, char[] word, int m, int n, int k) {
        if (m < 0 || m >= board.length || n < 0 || n >= board[0].length || board[m][n] != word[k]) {

            return false;
        }

        if (k == word.length - 1) {
            return true;
        }
        board[m][n] = '\0';

        /*int[] dpx = {-1, 0, 1, 0}, dpy = {0, 1, 0, -1};
        for (int i = 0; i < 4; i++) {
            int x = m + dpx[i];
            int y = n + dpy[i];
            if (dfs(board, word, x, y, k + 1)) {
                return true;
            }
        }*/
        boolean res = dfs(board, word, m - 1, n, k + 1) || dfs(board, word, m, n + 1, k + 1)
                || dfs(board, word, m + 1, n, k + 1) || dfs(board, word, m, n - 1, k + 1);

        board[m][n] = word[k];

        return res;
    }

    public static void main(String[] args) {
        char[][] c = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String str = "ABCD";
        boolean exist = new PathInMatrix().exist(c, str);
        System.out.println(exist);
    }
}
