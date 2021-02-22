/*
350. Intersection of Two Arrays II
https://leetcode.com/problems/intersection-of-two-arrays-ii/

Approach: Sorting
*/

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
        	if (nums1[i] == nums2[j]) {
        		arrList.add(nums1[i]);
        		i++;
        		j++;
        	} else if (nums1[i] > nums2[j]) {
        		j++;
        	} else if (nums1[i] < nums2[j]) {
        		i++;
        	}
        }
        
        return convertIntegerArray(arrList);
    }
    
    public int[] convertIntegerArray(ArrayList<Integer> arrList) {
    	int[] intArr = new int[arrList.size()];
    	for (int i = 0; i < intArr.length; i++) {
    		intArr[i] = arrList.get(i);
    	}
    	return intArr;
    }
}