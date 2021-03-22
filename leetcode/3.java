/*
    https://leetcode.com/problems/longest-substring-without-repeating-characters/
    3. Longest Substring Without Repeating Characters (Medium)
*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> list = new ArrayList();
        int max = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (list.contains(c)) {
                int size = list.size();
                if (max < size) {
                    max = size;
                }
                int idx = list.indexOf(c);
                list.subList(0, idx + 1).clear();
                list.add(c);
            } else {
                list.add(c);
            }
        }
        
        int size = list.size();
        if (max < size) {
            max = size;
        }
        
        return max;
    }
}