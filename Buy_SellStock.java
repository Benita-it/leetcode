#121. Best Time to Buy and Sell Stock
🔗 Problem Link: (https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)
📁 Topic: Greedy, Arrays

buy = lowest price seen so far
profit = prices[i] - buy → max profit if sold today
Update profit if (currentProfit > maxProfit)

Time Complexity: O(n)
Space Complexity: O(1)

import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}