/*
    https://leetcode.com/problems/count-and-say/
    38. Count and Say (Medium)
*/
class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        
        String str = countAndSay(n-1);
        StringBuilder ret = new StringBuilder();
        char tmp = ' ';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (tmp == ' ') {
                tmp = str.charAt(i);
                count = 1;
            } else {
                if (tmp == str.charAt(i)) {
                    count++;
                } else {
                    ret.append(count).append(tmp);
                    tmp = str.charAt(i);
                    count = 1;
                }
            }
        }
        ret.append(count).append(tmp);
        return ret.toString();
    }
}