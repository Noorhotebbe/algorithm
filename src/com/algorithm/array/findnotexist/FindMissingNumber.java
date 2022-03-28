package com.algorithm.array.findnotexist;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-03-25 09:26
 * @Description: 在递增排序数组中找出缺失的数
 * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。
 * 在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 */
public class FindMissingNumber {
    public static int searNotExistNumber(int[] nums) {

        if (nums.length == 0) {
            return -1;
        }

        /*int number = 0;
        for (int num : nums) {
            if (number == num) {
                number++;
            }
        }

        return number;*/

        //二分查找解法
        int left = 0, right = nums.length - 1, mid = 0;
        while (left < right) {
            mid = (left + right) / 2;
            if (nums[mid] != mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left == nums.length - 1 && nums[left] == left ? left + 1 : left;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,5,7};
        int i = searNotExistNumber(arr);
        System.out.println(i);
    }
}
