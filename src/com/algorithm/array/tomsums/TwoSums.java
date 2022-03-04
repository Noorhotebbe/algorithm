package com.algorithm.array.tomsums;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2021/9/23
 * @Content:
 *      两数之和：给定一个整数数组nums和一个整数目标值target，
 *      请你在该数组中找出和为目标值target的那两个整数并返回它们的数组下标。
 */
public class TwoSums {
    public int[] twoSum(int[] nums, int target) {

        //双重循环：时间复杂度O(n*n)
//        int[] index = new int[2];
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = nums.length - 1; j > i; j--) {
//                if (nums[i] + nums[j] == target) {
//                    index[0] = i;
//                    index[1] = j;
//                    return index;
//                }
//            }
//        }

        //HashMap优化
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0;i<nums.length;i++){
            if (map.containsKey(target- nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i );
        }
        return new int[0];

//        HashMap<Integer,Integer> map = new HashMap<>();
//        int[] result = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(target-nums[i])){
//                result = new int[]{map.get(target-nums[i]),i};
//                break;
//            }
//            map.put(nums[i],i);
//        }
//        return result;
    }

    public static void main(String[] args) {
        int[] ints = {1,3,4,7,11,6,23,8};
        int number = 12;
        TwoSums sums = new TwoSums();
        int[] sum = sums.twoSum(ints, number);
        System.out.println(Arrays.toString(sum));
    }
}
