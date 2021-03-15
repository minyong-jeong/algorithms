/*
    https://leetcode.com/problems/pascals-triangle/
    118. Pascal's Triangle (Easy)
*/
import java.util.ArrayList;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        result.add(new ArrayList<Integer>());
        result.get(0).add(1);
        
        for (int i = 2; i <= numRows; i++) {
            ArrayList temp = new ArrayList<Integer>();
            temp.add(1);
            List<Integer> pre = result.get(i-2);
            for (int j = 2; j <= i-1; j++) {
                temp.add(pre.get(j-2) + pre.get(j-1));
            }
            temp.add(1);
            result.add(temp);
        }
        
        return result;
    }
}