/*
    https://leetcode.com/problems/longest-substring-without-repeating-characters/
    3. Longest Substring Without Repeating Characters (Medium)
*/
import java.util.ArrayList;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        if (n == 0) {
            return 0;
        }
        
        List<Character> list = new ArrayList();
        int max = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (list.contains(arr[i])) {
                int size = list.size();
                if (max < size) {
                    max = size;
                }
                int idx = list.indexOf(arr[i]);
                list.subList(0, idx + 1).clear();
                list.add(arr[i]);
            } else {
                list.add(arr[i]);
            }
        }
        
        int size = list.size();
        if (max < size) {
            max = size;
        }
        
        return max;
    }
}