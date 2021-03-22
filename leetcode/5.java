/*
    https://leetcode.com/problems/longest-palindromic-substring/
    5. Longest Palindromic Substring (Medium)
*/
class Solution {
    public String longestPalindrome(String s) {
        char[] str = s.toCharArray();
        int n = str.length;
        
        int max = 0;
        int rleft = 0;
        int rright = 0;
        for (int i = 0; i < n; i++) {
            // Odd
            int left = i-1;
            int right = i+1;
            int count = 1;
            while (left >= 0 && right < n && str[left] == str[right]) {
                left--;
                right++;
                count += 2;
            }
            
            if (max < count) {
                max = count;
                rleft = left + 1;
                rright = right;
            }
            
            // Even
            left = i;
            right = i + 1;
            count = 0;
            while (left >= 0 && right < n && str[left] == str[right]) {
                left--;
                right++;
                count += 2;
            }
            
            if (max < count) {
                max = count;
                rleft = left + 1;
                rright = right;
            }
        }
        
        return s.substring(rleft, rright);
    }
}