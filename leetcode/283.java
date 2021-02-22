/*
    https://leetcode.com/problems/move-zeroes/
    283. Move Zeroes (Easy)

    Approach: Sliding window
*/
class Solution {
    public void moveZeroes(int[] nums) {
        int end = nums.length;
        int cur = 0;
        for (int i = 0; i < end; i++) {
            if (nums[i] != 0) {
                nums[cur++] = nums[i];
            }
        }
        
        for (int i = cur; i < end; i++) {
            nums[i] = 0;
        }
    }
}