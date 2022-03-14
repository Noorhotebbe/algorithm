package com.algorithm.array.majorityelement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-03-11 09:13
 * @Description: 多数元素
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于⌊ n/2 ⌋的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */
public class Majority {
    public int element(int[] nums) throws Exception {

        Map<Integer, Long> map = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        if (nums.length == 0) {
            throw new Exception("数组不允许为空");
        }

        int result = nums[0], count = 1;
        for (int num : nums) {
            if (num == result){
                count++;
            }else if (--count == 0 ){
                result = num;
                count = 1;
            }
        }
        return result;
    }
}
