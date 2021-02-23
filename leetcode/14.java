/*
    https://leetcode.com/problems/longest-common-prefix/
    14. Longest Common Prefix (Easy)
*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if (n == 0) {
            return "";
        }
        
        String minStr = "";
        int min = 200;
        
        for (int i = 0; i < n; i++) {
            if (min > strs[i].length()) {
                min = strs[i].length();
                minStr = strs[i];
            }
        }
        
        for (int i = 0; i < min; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < n; j++) {
                if (c != strs[j].charAt(i)) {
                    if (i == 0) {
                        return "";
                    } else {
                        return minStr.substring(0, i);
                    }
                }
            }
        }
        
        return minStr;
    }
}