package com.algorithm.array.minnumberarray;


/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-03-29 09:29
 * @Description: 旋转数组的最小数字
 */
public class MinArray {
    public int minNumber(int[] numbers) {
        if (numbers.length == 0) {
            return -1;
        }

        //常规解法
        /*int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]){
                min = numbers[i];
            }
        }
        return min;*/

        //二分解法
        int l = 0, r = numbers.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (numbers[mid] > numbers[r]) {
                l = mid + 1;
            } else if (numbers[mid] < numbers[r]) {
                r = mid;
            } else {
                r--;
            }
        }
        return numbers[l];

    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, -1, 2};
        int minNumber = new MinArray().minNumber(arr);
        System.out.println(minNumber);
    }
}
