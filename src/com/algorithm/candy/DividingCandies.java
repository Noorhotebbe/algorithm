package com.algorithm.candy;

import java.util.HashSet;
import java.util.Set;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2021/11/1
 * @Content: 分糖果：
 * 给定一个偶数长度的数组，其中不同的数字代表着不同种类的糖果，每一个数字代表一个糖果。
 * 你需要把这些糖果平均分给一个弟弟和一个妹妹。返回妹妹可以获得的最大糖果的种类数。
 */
public class DividingCandies {
    public int distributeCandies(int[] candyType) {

        int num = candyType.length / 2;

        Set<Integer> set = new HashSet<>();
        for (int candy : candyType) {
//            set.add(candy);
            if (set.add(candy) && set.size() >= num) {
                return num;
            }
        }

        return set.size();
    }
}
