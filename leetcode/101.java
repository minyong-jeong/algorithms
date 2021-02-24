/*
    https://leetcode.com/problems/symmetric-tree/
    101. Symmetric Tree (Easy)
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
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> leftQ = new LinkedList<TreeNode>();
        Queue<TreeNode> rightQ = new LinkedList<TreeNode>();
        
        if (root.left == null && root.right == null) {
            return true;
        }
        
        if (root.left == null || root.right == null) {
            return false;
        }
        
        leftQ.offer(root.left);
        rightQ.offer(root.right);
        while(!(leftQ.isEmpty() && rightQ.isEmpty())) {
            TreeNode l = leftQ.poll();
            TreeNode r = rightQ.poll();
            
            if (l.val != r.val) {
                return false;
            }
            
            if (l.left != null && r.right != null) {
                leftQ.offer(l.left);
                rightQ.offer(r.right);
            } else if ((l.left == null && r.right != null) || (l.left != null && r.right == null)) {
                return false;
            }
            
            if (l.right != null && r.left != null) {
                leftQ.offer(l.right);
                rightQ.offer(r.left);
            } else if ((l.right == null && r.left != null) || (l.right != null && r.left == null)) {
                return false;
            }
        }
        
        return true;
    }
}
