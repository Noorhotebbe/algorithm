package com.algorithm.array.findnumberoccurrences;

import java.util.logging.Level;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-03-24 09:10
 * @Description: 在排序数组中查找数字
 * 统计一个数字在排序数组中出现的次数
 */
public class FindNumber {
    public static int searchOccurrences(int[] nums, int target) {

        if (nums.length == 0) {
            return 0;
        }
        //常规解法
//        int count = 0;
//        for (int num : nums) {
//            if (target == num) {
//                ++count;
//            }
//        }
//        return count;

        //二分查找解法
        int left = 0, right = nums.length - 1, mid = 0;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (target <= nums[mid]) {
                right = mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            }
        }

        return search(nums, mid, target);

    }

    public static int search(int[] arr, int mid, int val) {

        int count = 0;
        int left = mid;
        while (left >= 0 && arr[left] == val) {
            ++count;
            left -= 1;
        }

        int cur = mid + 1;
        while (cur < arr.length && arr[cur] == val) {
            ++count;
            cur += 1;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {};
        int i = searchOccurrences(arr, 2);
        System.out.println(i);
    }
}
