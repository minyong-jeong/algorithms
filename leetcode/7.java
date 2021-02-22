/*
    https://leetcode.com/problems/reverse-integer/
    7. Reverse Integer (Easy)
*/
class Solution {
    public int reverse(int x) {
        int reverseX = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (reverseX > Integer.MAX_VALUE / 10 || (reverseX == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (reverseX < Integer.MIN_VALUE / 10 || (reverseX == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            reverseX = reverseX * 10 + pop;
        }
        return reverseX;
    }
}