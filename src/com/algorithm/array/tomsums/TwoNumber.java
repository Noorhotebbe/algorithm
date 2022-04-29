package com.algorithm.array.tomsums;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-04-29 10:56
 * @Description: 在有序的数组中给出一个值求出数组中有两数之和等于这个值的数是多少
 */
public class TwoNumber {
    public int[] search(int[] arr, int val){


        if (arr.length != 0){
            //哈希解
//            HashSet<Integer> set = new HashSet<>();
//            for (int num : arr) {
//                if (set.contains(val - num)){
//                    return new int[]{val - num, num};
//                }else {
//                    set.add(num);
//                }
//            }

            //双指针解
            int left = 0, right = arr.length - 1;
            while (left < right){
                int sum = arr[left] + arr[right];
                if (sum == val){
                    return new int[]{arr[left], arr[right]};
                    //因为数组是有序的
                }else if (sum > val){
                    right--;
                }else {
                    left++;
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,6,7,9,12,24,75,785};
        int[] val = new TwoNumber().search(arr, 15);
        System.out.println(Arrays.toString(val));
    }

}
