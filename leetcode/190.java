/*
    https://leetcode.com/problems/reverse-bits/
    190. Reverse Bits (Easy)
*/
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 31; i++) {
            result = result | (n & 1);
            result = result << 1;
            n = n >> 1;
        }
        result = result | (n & 1);
        return result;
    }
}