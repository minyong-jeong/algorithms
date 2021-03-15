/*
    https://leetcode.com/problems/valid-parentheses/
    20. Valid Parentheses (Easy)
*/
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        char[] arr = s.toCharArray();
        stack.push(getMatchParentheses(arr[0]));
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == '(' || arr[i] == '[' || arr[i] == '{') {
                stack.push(getMatchParentheses(arr[i]));
            } else if (arr[i] == ')' || arr[i] == ']' || arr[i] == '}') {
                if (!stack.empty() && arr[i] == stack.peek()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        
        return stack.empty();
    }
    
    Character getMatchParentheses(char c) {
        if (c == '(') return ')';
        else if (c == '[') return ']';
        else return '}';
    }
}