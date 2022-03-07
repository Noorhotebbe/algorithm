package com.algorithm.array.removeelement;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-03-06 18:08
 * @Description: 移除元素：
 * 给你一个数组nums和一个值val，你需要原地移除所有数值等于val的元素并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * 示例：
 * 给定 nums = [3,2,2,3], val = 3, 函数应该返回新的长度 2,
 * 并且 nums 中的前两个元素均为 2。 你不需要考虑数组中超出新长度后面的元素。
 */
public class RemoveElement {
    public int remove(int[] nums, int val) {

        int count = 0;
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            if (val == nums[i]) {
                count++;
            } else {
                nums[i - count] = nums[i];
            }
        }
        return length - count;
    }

    public static void main(String[] args) {
        int[] num = {1,3,5,2,4,3,6,4};
        int n = new RemoveElement().remove(num, 4);
        for (int i = 0; i < n; i++) {
            System.out.println(num[i]);
        }
    }
}
