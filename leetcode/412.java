/*
    https://leetcode.com/problems/fizz-buzz/
    412. Fizz Buzz (Easy)
*/
import java.util.ArrayList;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        
        for (int i = 1; i <= n; i++) {
            boolean fizz = i % 3 == 0;
            boolean buzz =  i % 5 == 0;
            if (fizz && buzz) {
                list.add("FizzBuzz");
            } else if (fizz) {
                list.add("Fizz");
            } else if (buzz) {
                list.add("Buzz");
            } else {
                list.add(Integer.toString(i));
            }
        }
        
        return list;
    }
}