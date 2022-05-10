package com.algorithm.array.josephproblem;


/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-05-10 14:46
 * @Description: 剑指 Offer 62. 圆圈中最后剩下的数字（约瑟夫问题）
 * 0,1,···,n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字（删除后从下一个数字开始计数）。求出这个圆圈里剩下的最后一个数字。
 *
 * 例如，0、1、2、3、4这5个数字组成一个圆圈，从数字0开始每次删除第3个数字，则删除的前4个数字依次是2、0、4、1，因此最后剩下的数字是3。
 */
public class Joseph {
    public int lastRemaining(int n, int m) {
        if(n == 1 || m == 0) return 0;

        //模拟链表
        /*ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(i);
        }

        int index = 0;
        while (n > 1){
            index = (index + m - 1) % n;
            res.remove(index);
            n--;
        }

        return res.get(0);*/

        //逆推数学公式解
        int index = 0;
        for (int i = 2; i <= n; i++) {
            index = (index + m) % i;
        }

        return index;
    }

    public static void main(String[] args) {
        int i = new Joseph().lastRemaining(5, 5);
        System.out.println(i);
    }
}
