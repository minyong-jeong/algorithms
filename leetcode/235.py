"""
    https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
    235. Lowest Common Ancestor of a Binary Search Tree (Easy)
"""

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None


class Solution(object):
    def lowestCommonAncestor(self, root, p, q):
        """
        :type root: TreeNode
        :type p: TreeNode
        :type q: TreeNode
        :rtype: TreeNode
        """
        return self.search(root, p, q)

    def search(self, cur, p, q):
        if cur.val > p.val and cur.val > q.val:
            return self.search(cur.left, p, q)
        elif cur.val < p.val and cur.val < q.val:
            return self.search(cur.right, p, q)
        else:
            return cur
