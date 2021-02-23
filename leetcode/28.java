/*
    https://leetcode.com/problems/implement-strstr/
    28. Implement strStr() (Easy)
*/
class Solution {
    public int strStr(String haystack, String needle) {
        char[] a = haystack.toCharArray();
        char[] b = needle.toCharArray();
        
        int alen = a.length;
        int blen = b.length;
        
        if (blen == 0) {
            return 0;
        }
        
        if (alen < blen) {
            return -1;
        }
        
        boolean find;
        for (int i = 0; i < alen - blen + 1; i++) {
            find = true;
            if (a[i] == b[0]) {
                for (int j = 0; j < blen; j++) {
                    if (a[i+j] != b[j]) {
                        find = false;
                        break;
                    }
                }
                
                if (find) {
                    return i;
                }
            }
        }
        return -1;
    }
}