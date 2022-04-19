package com.algorithm.sort.Impl;

import com.algorithm.sort.Sort;

import java.util.Arrays;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-04-18 14:46
 * @Description: 冒泡排序
 */
public class BubbleSort<T extends Comparable<T>> extends Sort<T> {

    @Override
    public void sort(T[] nums) {

        for (int i = 1; i < nums.length; i++) {

            boolean flag = true;
            for (int j = 0; j < nums.length - 1; j++) {
                if (!compare(nums[j], nums[j + 1])) {
                    swap(nums, j, j + 1);
                    flag = false;
                }
            }

            if (flag) {
                break;
            }
        }
    }

    /*@Override
    public int[] sort(int[] sourceArray) throws Exception {
        int[] array = Arrays.copyOf(sourceArray, sourceArray.length);

        for (int i = 1; i < array.length; i++) {

            //标识，当顺序没有交换则为true
            boolean flag = true;
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    flag = false;
                }
            }
            if (flag){
                break;
            }
        }
        return array;
    }*/


    public static void main(String[] args) throws Exception {
        Integer[] arr = {1, 42, 2, 6, 3, 87, 42, 12, 5, 9};
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        bubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
