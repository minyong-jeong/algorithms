/*
    https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
    108. Convert Sorted Array to Binary Search Tree
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;
        
        TreeNode node = new TreeNode();
        search(node, nums, 0, n);
        return node;
    }
    
    public void search(TreeNode node, int[] nums, int left, int right) {
        int mid = (left + right) / 2;
        node.val = nums[mid];
        
        if (left != mid) {
            node.left = new TreeNode();
            search(node.left, nums, left, mid);
        }
        if (mid+1 != right) {
            node.right = new TreeNode();
            search(node.right, nums, mid + 1, right);
        }
    }
}