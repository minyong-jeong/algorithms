/*
    https://leetcode.com/problems/string-to-integer-atoi/
    8. String to Integer (atoi) (Medium)
*/
class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }
        
        char c = s.charAt(0);
        if (n == 1 && !(c >= '0' && c <= '9')) {
            return 0;
        }
        if (!(c == ' ' || c == '-' || c == '+' || (c >= '0' && c <= '9'))) {
            return 0;
        }
        
        int cur = 0;
        if (s.charAt(cur) == ' ') {
            for (cur = 0; cur < n; cur++) {
                if (s.charAt(cur) != ' ') {
                    break;
                }
            }
            
            if (cur == n) {
                return 0;
            }
        }
        
        char ch = s.charAt(cur);
        if (!(ch == '-' || ch == '+' || (ch >= '0' && ch <= '9'))) {
            return 0;
        }
        
        int minus = 1;
        if (ch == '-') {
            cur++;
            minus = -1;
            if (!(s.charAt(cur) >= '0' && s.charAt(cur) <= '9')) {
                return 0;
            }
        } else if (ch == '+') {
            cur++;
            if (!(s.charAt(cur) >= '0' && s.charAt(cur) <= '9')) {
                return 0;
            }
        }
        
        ch = s.charAt(cur++);
        int num = (ch - '0') * minus;
        
        while (cur < n) {
            ch = s.charAt(cur++);
            if (!(ch >= '0' && ch <= '9')) {
                break;
            }
            int pop = (ch - '0') * minus;
            if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && pop > 7)) {
                return Integer.MAX_VALUE;
            }
            if (num < Integer.MIN_VALUE / 10 || (num == Integer.MIN_VALUE / 10 && pop < -8)) {
                return Integer.MIN_VALUE;
            }
            num  = num * 10 + pop;
        }
        
        return num;
    }
}