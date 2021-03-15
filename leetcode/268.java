/*
    https://leetcode.com/problems/missing-number/
    268. Missing Number (Easy)
*/
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int result = (n % 2 == 1) ? n * (n/2 + 1) : (n + 1) * (n/2);
        
        for (int i = 0; i < n; i++) {
            result -= nums[i];
        }
        
        return result;
    }
}