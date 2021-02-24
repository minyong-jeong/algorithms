/*
    https://leetcode.com/problems/merge-sorted-array/
    88. Merge Sorted Array (Easy)
*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int remain = n;
        int n1pos = m - 1;
        int n2pos = n - 1;
        while (n1pos > -1 && n2pos > -1) {
            if (nums1[n1pos] >= nums2[n2pos]) {
                nums1[n1pos + n2pos + 1] = nums1[n1pos--];
            } else {
                nums1[n1pos + n2pos + 1] = nums2[n2pos--];
            }
        }
        while (n2pos > -1) {
            nums1[n1pos + n2pos + 1] = nums2[n2pos--];
        }
    }
}