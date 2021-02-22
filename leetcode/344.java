/*
    https://leetcode.com/problems/reverse-string/
    344. Reverse String (Easy)
*/
class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        for (int i = 0; i < n / 2; i++) {
            char tmp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = tmp;
        }
    }
}