package com.algorithm.sort.Impl;

import com.algorithm.sort.Sort;

import java.util.Arrays;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-04-18 16:16
 * @Description: 选择排序
 */
public class SelectSort<T extends Comparable<T>> extends Sort<T> {

    @Override
    public void sort(T[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (!compare(nums[min], nums[j])) {
                    min = j;
                }
            }

            if (i != min) {
                swap(nums, i, min);
            }
        }
    }

    /*@Override
    public int[] sort(int[] sourceArray) throws Exception {
        for (int i = 0; i < sourceArray.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < sourceArray.length; j++){
                if (sourceArray[j] < sourceArray[min]){
                    min = j;
                }
            }

            if (i != min){
                int temp = sourceArray[i];
                sourceArray[i] = sourceArray[min];
                sourceArray[min] = temp;
            }
        }

        return sourceArray;
    }*/

    public static void main(String[] args) throws Exception {

        Integer[] arr = {1, 42, 2, 6, 3, 87, 42, 12, 5, 9};
        SelectSort<Integer> selectSort = new SelectSort<>();
        selectSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
