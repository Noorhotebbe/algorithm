package com.algorithm.sort.Impl;

import com.algorithm.sort.Sort;

import java.util.Arrays;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-04-20 11:32
 * @Description: 插入排序
 */
public class InsertSort<T extends Comparable<T>> extends Sort<T> {

    @Override
    public void sort(T[] nums) {

        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0; j--) {
                if (compare(nums[j], nums[j - 1])) {
                    swap(nums, j, j - 1);
                }
            }
        }
    }

    /*public void insert(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int val = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = val;
                }
            }
        }
    }*/


    public static void main(String[] args) {
        Integer[] arr = {1, 42, 2, 6, 3, 87, 42, 12, 5, 9};
        InsertSort<Integer> insertSort = new InsertSort<>();
        insertSort.sort(arr);
        System.out.println(Arrays.toString(arr));

        /*int[] arr = {1, 42, 2, 6, 3, 87, 42, 12, 5, 9};
        new InsertSort<>().insert(arr);
        System.out.println(Arrays.toString(arr));*/
    }
}
