/*
    https://leetcode.com/problems/climbing-stairs/
    70. Climbing Stairs (Easy)
*/
class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] += dp[i-1];
            dp[i] += dp[i-2];
        }
        
        return dp[n];
    }
}