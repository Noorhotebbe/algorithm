package com.algorithm.array.adjustsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-04-20 09:54
 * @Description: 调整数组顺序使奇数位于偶数前面
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有奇数在数组的前半部分，所有偶数在数组的后半部分。
 */
public class ArraySequence {
    public int[] exchange(int[] nums) {

        int left = 0, right = nums.length - 1;

        while (left < right){
            if (nums[left] % 2 != 0){
                left++;
            } else if (nums[right] % 2 == 0) {
                right--;
            } else {
                int val = nums[left];
                nums[left] = nums[right];
                nums[right] = val;
            }
        }

        return nums;

        /*if (nums.length == 0) {
            return new int[0];
        }

        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                arrayList.add(nums[i]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                arrayList.add(nums[i]);
        }

        return arrayList.stream().mapToInt(i -> i).toArray();*/
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] exchange = new ArraySequence().exchange(arr);
        System.out.println(Arrays.toString(exchange));
    }
}
