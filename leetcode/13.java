/*
    https://leetcode.com/problems/roman-to-integer/
    13. Roman to Integer (Easy)
*/
class Solution {
    public int romanToInt(String s) {
        char[] str = s.toCharArray();
        int idx = str.length - 1;
        
        int result = 0;
        while (idx > -1 && str[idx] == 'I') {
            result++;
            idx--;
        }
        
        int i;
        for (i = idx; i > 0; i--) {
            if (str[i] == 'V') {
                if (str[i-1] == 'I') {
                    result += 4;
                    i--;
                } else {
                    result += 5;
                }
            } else if (str[i] == 'X') {
                if (str[i-1] == 'I') {
                    result += 9;
                    i--;
                } else {
                    result += 10;
                }
            } else if (str[i] == 'L') {
                if (str[i-1] == 'X') {
                    result += 40;
                    i--;
                } else {
                    result += 50;
                }
            } else if (str[i] == 'C') {
                if (str[i-1] == 'X') {
                    result += 90;
                    i--;
                } else {
                    result += 100;
                }
            } else if (str[i] == 'D') {
                if (str[i-1] == 'C') {
                    result += 400;
                    i--;
                } else {
                    result += 500;
                }
            } else if (str[i] == 'M') {
                if (str[i-1] == 'C') {
                    result += 900;
                    i--;
                } else {
                    result += 1000;
                }
            }
        }
        
        if (i == 0) {
            if (str[0] == 'M') result += 1000;
            else if (str[0] == 'D') result += 500;
            else if (str[0] == 'C') result += 100;
            else if (str[0] == 'L') result += 50;
            else if (str[0] == 'X') result += 10;
            else if (str[0] == 'V') result += 5;
            else if (str[0] == 'I') result += 1;
        }
        
        return result;
    }
}