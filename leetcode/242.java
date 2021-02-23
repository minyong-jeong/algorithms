/*
    https://leetcode.com/problems/valid-anagram/
    242. Valid Anagram (Easy)
*/
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        
        if (a.length != b.length) {
            return false;
        }
        
        int[] aAlpha = new int[52];
        int[] bAlpha = new int[52];
        for (int i = 0; i < a.length; i++) {
            aAlpha[a[i]-'a']++;
            bAlpha[b[i]-'a']++;
        }
        
        for (int i = 0; i < 52; i++) {
            if (aAlpha[i] != bAlpha[i]) {
                return false;
            }
        }
        
        return true;
    }
}