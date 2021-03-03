/*
    https://leetcode.com/problems/house-robber/
    198. House Robber (Medium)
*/
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        
        int[][] result = new int[n][2];
        result[0][0] = nums[0];
        for (int i = 1; i < n; i++) {
            int sum = result[i-1][1] + nums[i];
            result[i][1] = result[i-1][0];
            result[i][0] = (sum > result[i][1]) ? sum : result[i][1];
        }
        
        return result[n-1][0];
    }
}