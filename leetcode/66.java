/*
    66. Plus One
    https://leetcode.com/problems/plus-one/
*/

class Solution {
    public int[] plusOne(int[] digits) {
        if (digits.length == 1 && digits[0] == 9) {
            return new int[]{1, 0};
        }
        
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i] + 1;
                break;
            }
        }
        
        if (digits[0] == 0) {
            int[] ret = new int[digits.length + 1];
            ret[0] = 1;
            for (int i = 1; i < ret.length; i++) {
                ret[i] = digits[i-1];
            }
            return ret;
        }
        
        return digits;
    }
}