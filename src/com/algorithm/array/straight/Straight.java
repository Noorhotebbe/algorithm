package com.algorithm.array.straight;

import java.util.HashSet;
import java.util.Set;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-05-09 10:36
 * @Description: 剑指 Offer 61. 扑克牌中的顺子
 * 从若干副扑克牌中随机抽 5 张牌，判断是不是一个顺子，即这5张牌是不是连续的。
 * 2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
 */
public class Straight {
    public boolean judgeContinuous(int[] nums) {

        if (nums.length == 0) return false;

        /*int zero = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == 0) zero++;
            else if (nums[i] == nums[i+1]) return false;
        }

        return nums[4] - nums[zero] < 5;*/

        int max = 0, min = 99;
        Set<Integer> set = new HashSet<>();

        for (int val : nums) {
            if (val == 0) continue;
            max = Math.max(max, val);
            min = Math.min(min, val);

            if (set.contains(val)) return false;
            set.add(val);
        }

        return max - min < 5;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 0};
        boolean b = new Straight().judgeContinuous(arr);
        System.out.println(b);
    }
}
