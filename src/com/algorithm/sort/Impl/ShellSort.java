package com.algorithm.sort.Impl;

import com.algorithm.sort.Sort;

import java.util.Arrays;


/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-04-21 11:14
 * @Description: 希尔排序（缩小增量排序）
 */
public class ShellSort<T extends Comparable<T>> extends Sort<T> {

    @Override
    public void sort(T[] nums) {

        //增量
        int gap = 1;
        while (gap < nums.length / 3) {
            gap = gap * 3 + 1;
        }

        while (gap >= 1) {
            for (int i = gap; i < nums.length; i++) {
                for (int j = i; j >= gap; j -= gap) {
                    if (compare(nums[j], nums[j - gap])) {
                        swap(nums, j, j - gap);
                    }
                }
            }
            gap /= 3;
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 42, 2, 6, 3, 87, 42, 12, 5, 9};
        ShellSort<Integer> shellSort = new ShellSort<>();
        shellSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
