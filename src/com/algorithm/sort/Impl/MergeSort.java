package com.algorithm.sort.Impl;


import java.util.Arrays;
import java.util.Random;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-04-22 13:48
 * @Description: 归并排序(分治法)，时间复杂度O(nlogn)
 */
public class MergeSort {
    public static int[] sort(int[] arr, int left, int right, int[] temp) {
        if (left >= right) {
            return new int[0];
        }

        int mid = (left + right) / 2;
        //左排
        sort(arr, left, mid, temp);
        //右排
        sort(arr, mid + 1, right, temp);

        return merge(arr, left, mid, right, temp);
    }

    /**
     * 合并排序
     *
     * @param arr
     * @param l
     * @param mid
     * @param r
     * @param temp
     */
    public static int[] merge(int[] arr, int l, int mid, int r, int[] temp) {

        int i = l, j = mid + 1, t = 0;

        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                temp[t++] = arr[i++];
            } else {
                temp[t++] = arr[j++];
            }
        }

        //当左右边界还有数据时直接将剩余的数据拷贝进临时数组
        while (i <= mid) {
            temp[t++] = arr[i++];
        }

        while (j <= r) {
            temp[t++] = arr[j++];
        }

        int m = 0;
        while (l <= r) {
            arr[l++] = temp[m++];
        }

        return arr;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[11];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        int[] sort = sort(arr, 0, arr.length - 1, new int[arr.length]);
        System.out.println(Arrays.toString(sort));

    }
}
