/*
    https://leetcode.com/problems/palindrome-number/
    9. Palindrome Number (Easy)
*/

class Solution {
    public boolean isPalindrome(int x) {
        String t = Integer.toString(x);
        int len = t.length();
        
        for (int i = 0; i < len / 2; i ++) {
            if (t.charAt(i) != t.charAt(len-1-i)) {
                return false;
            }
        }
        return true;
    }
}