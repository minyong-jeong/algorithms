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
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root.left);
        q.offer(root.right);
        
        while(!q.isEmpty()) {
            TreeNode l = q.poll();
            TreeNode r = q.poll();
            
            if (!(l == null && r == null)) {
                if (l == null || r == null) {
                    return false;
                }
                
                if (l.val != r.val) {
                    return false;
                }
                
                q.offer(l.left);
                q.offer(r.right);
                q.offer(l.right);
                q.offer(r.left);
            }
        }
        
        return true;
    }
}
