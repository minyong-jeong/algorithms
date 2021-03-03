/*
    https://leetcode.com/problems/maximum-subarray/
    53. Maximum Subarray (Easy)
*/
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        
        int[] tmp = new int[n+1];
        tmp[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < n; i++) {
            int sum = tmp[i-1] + nums[i];
            tmp[i] = (nums[i] > sum) ? nums[i] : sum;
            if (tmp[i] > max) {
                max = tmp[i];
            }
        }
        
        return max;
    }
}