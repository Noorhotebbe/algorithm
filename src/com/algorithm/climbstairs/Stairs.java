package com.algorithm.climbstairs;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-02-25 09:30
 * @Description:
 *      爬楼梯：
 *          假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *          每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 */
public class Stairs {
    public int climbStairs(int n){


        /*if (n <= 2) return n;

        int a = 1;
        int b = 2;
        int count = 0;
        for (int i = 3; i <=n ; i++) {
            count = a + b;
            a = b;
            b = count;
        }
        return count;*/

        /*if (n <= 1) return n;

        int[] stairs = new int[3];
        stairs[1] = 1;
        stairs[2] = 2;
        for (int i = 3; i <= n ; i++) {
            int count = stairs[1] + stairs[2];
            stairs[1] = stairs[2];
            stairs[2] = count;
        }
        return stairs[2];*/

        int[] count = new int[n + 1];
        return climbStairsCount(n,count);

    }

    public int climbStairsCount(int n, int count[]){

        if (count[n] > 0) {
            return count[n];
        }
        if (n == 1) {
            count[n] = 1;
        } else if (n == 2) {
            count[n] = 2;
        } else {
            count[n] = climbStairsCount(n-1,count)+climbStairsCount(n-2,count);
        }

        return count[n];
    }

    public static void main(String[] args) {
        int i = new Stairs().climbStairs(3);
        System.out.println(i);
    }
}
