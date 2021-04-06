/*
    https://leetcode.com/problems/license-key-formatting/
    482. License Key Formatting (Easy)
*/
class Solution {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder strbuf = new StringBuilder();
        
        int count = 0;
        int i = S.length() - 1;
        while (i >= 0) {
            if (S.charAt(i) != '-') {
                count++;
                strbuf.insert(0, S.charAt(i));
                
                if (count >= K && i > 0) {
                    strbuf.insert(0, '-');
                    count = 0;
                }
            }
            i--;
        }
        
        if (strbuf.length() != 0 && strbuf.charAt(0) == '-') {
            strbuf.deleteCharAt(0);
        }
        
        return strbuf.toString().toUpperCase();
    }
}