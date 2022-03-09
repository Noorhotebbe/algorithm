package com.algorithm.array.sortedarraysquared;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-03-08 09:43
 * @Description: 有序数组的平方：
 * 给你一个按非递减顺序排序的整数数组nums，
 * 返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 */
public class SortedArray {
    public int[] sortedSquares(int[] nums) {

        //暴力破解
        /*for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;*/

        //双指针破解
        int left = 0;
        int right = nums.length - 1;
//        ArrayList<Integer> res = new ArrayList<>(nums.length);

        int[] result = new int[nums.length];
        int k = result.length - 1;
        while (left <= right) {
            if (nums[left] * nums[left] < nums[right] * nums[right]) {
                result[k--] = nums[right] * nums[right];
                right--;
            } else {
                result[k--] = nums[left] * nums[left];
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num = {-7, -3, 2, 3, 11};
        int[] squares = new SortedArray().sortedSquares(num);
        System.out.println("排完序为：");
        for (int s : squares) {
            System.out.print(s + " ");
        }
    }
}
