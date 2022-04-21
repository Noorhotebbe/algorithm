package com.algorithm.bitoperation;


/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-04-21 09:38
 * @Description: 二进制中1的个数
 */
public class Binary1 {
    public int hammingWeight(int n) {

        //笨比解法
        /*char[] chars = Integer.toBinaryString(n).toCharArray();
        int count = 0;
        for (char c : chars) {
            if (c == '1'){
                count++;
            }
        }

        return count;*/

        int count = 0, flag = 1;
        while (flag != 0){
            if ((n & flag) != 0){
                count++;
            }
            //循环成二进制三十二个1，最后是负数结束循环
            flag <<= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 11;
        int i = new Binary1().hammingWeight(n);
        System.out.println(i);
    }
}
