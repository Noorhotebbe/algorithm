package com.algorithm.array.repeatingarray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-03-23 09:45
 * @Description: 数组中重复的数字
 */
public class FindRepeat {
    public int findRepeatNumber(int[] nums) {

        //哈希
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            } else {
                set.add(num);
            }
        }

        //排序
        /*Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i+1]){
                return nums[i];
            }
        }*/

        return -1;


    }
}
