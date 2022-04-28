package com.algorithm.array.majorityelement;


import java.util.HashMap;
import java.util.Map;

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
    public int element(int[] nums) {

        /*if (nums.length == 0) {
            return -1;
        }*/

        //摩尔投票法
//        int result = nums[0], count = 1;
//        for (int num : nums) {
//            if (num == result) {
//                count++;
//            } else if (--count == 0) {
//                result = num;
//                count = 1;
//            }
//        }
//        return result;

        //哈希法
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
            if (map.get(nums[i]) > nums.length >> 1){
                return nums[i];
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {6,6,6,7,7};
        int element = new Majority().element(arr);
        System.out.println(element);
    }
}
