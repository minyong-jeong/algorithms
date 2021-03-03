/*
    https://leetcode.com/problems/subarray-product-less-than-k/
    713. Subarray Product Less Than K (Medium)
*/
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        int num = 1;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            num = num * nums[i];
            while (num >= k && j <= i) {
                num = num / nums[j];
                j++;
            }
            count += (i - j + 1);
        }
        return count;
    }
}