package com.algorithm.zeroones;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2021/9/27
 * @Content:
 *      判断哪种字符串更长：
 *          给你一个二进制字符串 s 。如果字符串中由 1组成的最长连续子字符串严格长于由0组成的最长连续子字符串，
 *          返回 true ；否则，返回 false 。
 *
 */
public class CheckZeroOnes {

    public boolean check(String s){

        int currZero=0,maxZero=0;
        int currOne=0,maxOne=0;

        for (char str:s.toCharArray()) {
            if (str=='1'){
                maxOne=Math.max(maxOne,++currOne);
                currZero=0;
            }else if (str=='0'){
                maxZero= Math.max(maxZero,++currZero);
                currOne=0;
            }
        }
        return maxOne>maxZero;
    }
}
