package com.algorithm.reverse;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2021/9/27
 * @Content:
 *      整数反转:
 *        给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 *          如果反转后整数超过 32 位的有符号整数的范围[−231, 231− 1] ，就返回 0。
 *
 */
public class IntegerReverse {

    public int reverse(int x){
        int rev=0;
        while (x!=0){
            if (rev<Integer.MIN_VALUE/10||rev>Integer.MAX_VALUE/10){
                return 0;
            }
            rev=rev*10+x%10;
            x/=10;
        }
        return rev;
    }
}
