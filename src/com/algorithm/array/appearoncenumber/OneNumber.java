package com.algorithm.array.appearoncenumber;


/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-03-05 09:18
 * @Description:
 *      只出现一次的数字：
 *          给定一个非空整数数组，除了某个元素只出现一次以外，
 *          其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 *          说明：你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 */
public class OneNumber {
    public int appearOnce(int[] nums){

        if (nums.length == 0){
            return 0;
        }

        //采用异或运算
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2,5,4,5};
        int i = new OneNumber().appearOnce(nums);
        System.out.println(i);
    }
}
