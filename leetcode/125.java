/*
    https://leetcode.com/problems/valid-palindrome/
    125. Valid Palindrome (Easy)
*/
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.trim();
        s = s.replaceAll("[^a-z0-9]", "");
        
        char[] str = s.toCharArray();
        
        int n = str.length;
        for (int i = 0; i < n / 2; i++) {
            if (str[i] != str[n-1-i]) {
                return false;
            }
        }
        return true;
    }
}