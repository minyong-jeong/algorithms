/*
    https://leetcode.com/problems/flip-equivalent-binary-trees/
    951. Flip Equivalent Binary Trees (Medium)
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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        Map<Integer, int[]> map = new HashMap<Integer, int[]>();
        Map<Integer, int[]> map2 = new HashMap<Integer, int[]>();
        
        bfs(root1, map);
        bfs(root2, map2);
        
        if (map.size() != map2.size()) {
            return false;
        }
        
        for (int key : map.keySet()) {
            if (!map2.containsKey(key)) {
                return false;
            }
            
            if (map.get(key)[0] != map2.get(key)[0] || map.get(key)[1] != map2.get(key)[1]) {
                return false;
            }
        }
        
        return true;
    }
    
    public void bfs(TreeNode root, Map<Integer, int[]> map) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        
        if (root != null) {
            q.offer(root);
        }
        
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            int leftVal = -1;
            int rightVal = -1;
            
            if (node.left != null) {
                leftVal = node.left.val;
                q.offer(node.left);
            }
            
            if (node.right != null) {
                rightVal = node.right.val;
                q.offer(node.right);
            }
            
            if (leftVal > rightVal) {
                map.put(node.val, new int[]{rightVal, leftVal});
            } else {
                map.put(node.val, new int[]{leftVal, rightVal});
            }
        }
    }
}