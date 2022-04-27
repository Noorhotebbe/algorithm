package com.algorithm.array.smallknumber;


import java.util.Arrays;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-04-26 09:24
 * @Description: 最小的k个数
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 */
public class TheSmallNumber {
    public int[] getLeastNumbers(int[] arr, int k) {

        if (arr.length == 0 || k == 0) {
            return new int[0];
        }

        if (k >= arr.length) return arr;

        /*int[] res = new int[n];
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            res[i] = arr[i];
        }
        return res;*/

        return quickSort(arr, 0, arr.length - 1, k);
    }

    /**
     * 快排的快速选择
     *
     * @param arr
     * @param left
     * @param right
     * @param k
     * @return
     */
    private int[] quickSort(int[] arr, int left, int right, int k) {

        int i = left, j = right;
        while (i < j) {

            while (i < j && arr[j] >= arr[left]) j--;
            while (i < j && arr[i] <= arr[left]) i++;

            swap(arr, i, j);
        }
        swap(arr, i, left);
        if (k < i) quickSort(arr, left, i - 1, k);
        if (k > i) quickSort(arr, i + 1, right, k);

        return Arrays.copyOf(arr, k);
    }

    private void swap(int[] arr, int i, int j) {

        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {

        int[] arr = {0,0,1,2,4,2,2,3,1,4};
        int[] leastNumbers = new TheSmallNumber().getLeastNumbers(arr, 10);
        System.out.println(Arrays.toString(leastNumbers));
    }
}
