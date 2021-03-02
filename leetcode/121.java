/*
    https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    121. Best Time to Buy and Sell Stock (Easy)
*/
class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = 10000;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            
            if (prices[i] - min > max) {
                max = prices[i] - min;
            }
        }
        
        return max;
    }
}