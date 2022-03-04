package com.algorithm.array.subarrays;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-02-24 10:20
 * @Description:
 *      最大子数组之和：
 *          给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），
 *          返回其最大和。子数组 是数组中的一个连续部分。
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums){

        int sum = 0;
        int max = nums[0];
        for (int num : nums) {
            sum = Math.max(num+sum,num);
            max = Math.max(max,sum);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,-10,2,-4,-6};
        int subArray = new MaxSubArray().maxSubArray(nums);
        System.out.println(subArray);
    }
}
