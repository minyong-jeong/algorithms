/*
    https://leetcode.com/problems/hamming-distance/
    461. Hamming Distance (Easy)
*/
class Solution {
    public int hammingDistance(int x, int y) {
        int num = x ^ y;
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((num & 1) == 1) {
                count++;
            }
            num = num >> 1;
        }
        
        return count;
    }
}