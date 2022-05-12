package com.algorithm.array.contiguoussequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-05-12 09:32
 * @Description: 剑指 Offer 57 - II. 和为s的连续正数序列(滑动窗口解)
 * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
 * <p>
 * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
 */
public class FindSequence {
    public int[][] findContiguousSequence(int target) {

        if (target == 0) return new int[0][0];

        List<int[]> res = new ArrayList<>();
        int l = 1, r = 2, sum = 3;

        while (l < r) {

            if (sum == target) {
                int[] data = new int[r - l + 1];
                for (int i = l; i <= r; i++) {
                    data[i - l] = i;
                }
                res.add(data);
            }

            //当值等于目标值时也会移动左边界以寻求下一个解
            if (sum >= target){
                sum -= l++;
            }else {
                sum += ++r;
            }
        }

        return res.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] ints = new FindSequence().findContiguousSequence(15);
        System.out.println(Arrays.deepToString(ints));
    }
}
