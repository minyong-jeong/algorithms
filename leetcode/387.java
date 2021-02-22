/*
    https://leetcode.com/problems/first-unique-character-in-a-string/
    387. First Unique Character in a String (Easy)
*/
class Solution {
    public int firstUniqChar(String s) {
        int[][] alphabet = new int[52][2];
        char[] str = s.toCharArray();
    
        for (int i = 0; i < str.length; i++) {
            int alphaNum = str[i] - 'a';
            
            if (alphabet[alphaNum][0] == 0) {
                alphabet[alphaNum][0]++;
                alphabet[alphaNum][1] = i;
            } else {
                alphabet[alphaNum][0]++;
            }
        }
        
        int loc = str.length;
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i][0] == 1) {
                if (alphabet[i][1] < loc) {
                    loc = alphabet[i][1];
                }
            }
        }
        
        if (loc == str.length) {
            return -1;
        }
        
        return loc;
    }
}