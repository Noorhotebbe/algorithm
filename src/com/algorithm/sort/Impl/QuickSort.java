package com.algorithm.sort.Impl;

import com.algorithm.sort.Sort;

import java.util.Arrays;
import java.util.Random;


/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-04-24 10:44
 * @Description: 快速排序
 */
public class QuickSort {


    public void quickSort(int[] arr, int left, int right) {

        if (left >= right) return;

        int i = left, j = right;
        while (i < j) {

            while (i < j && arr[j] >= arr[left]) j--;
            while (i < j && arr[i] <= arr[left]) i++;

            swap(arr, i, j);
        }
        swap(arr, i, left);

        quickSort(arr, left, i - 1);
        quickSort(arr, i + 1, right);

    }

    private void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int[] arr = new int[80];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }
        new QuickSort().quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
