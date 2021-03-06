package com.algorithm.dynamicprogramming.buystock;


/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-03-03 09:13
 * @Description: 买卖股票的最佳时机：
 * 给定一个数组prices ，它的第i个元素prices[i] 表示一支给定股票第 i 天的价格。
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 */
public class Profit {
    public int maxProfit(int[] prices) {

        if (prices.length <= 1) {
            return 0;
        }

        //min:最低买入值，max：最大利润
        int min = prices[0], max = 0;
        for (int price : prices) {
            max = Math.max(max, price - min);
            min = Math.min(min, price);
        }
        return max;
    }
}
