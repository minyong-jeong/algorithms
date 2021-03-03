/*
    https://leetcode.com/problems/shuffle-an-array/
    384. Shuffle an Array II (Medium)
*/

class Solution {
    private int[] arr;
    private int[] ori;

    public Solution(int[] nums) {
        this.arr = nums;
        this.ori = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            this.ori[i] = nums[i];
        }
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = this.ori[i];
        }
        return this.arr;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int size = this.arr.length;
        for (int i = 0; i < this.arr.length; i++) {
            int random = (int)(Math.random() * size);
            int tmp = arr[i];
            arr[i] = arr[random];
            arr[random] = tmp;
        }
        return this.arr;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */