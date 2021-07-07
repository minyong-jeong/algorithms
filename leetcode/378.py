"""
    https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
    378. Kth Smallest Element in a Sorted Matrix (Medium)
"""


class Solution(object):
    def kthSmallest(self, matrix, k):
        result = {}
        for i in matrix:
            for j in i:
                result[j] = result[j] + 1 if j in result else 1

        answer = 0
        count = 0
        for i in sorted(result.keys()):
            if count + result[i] < k:
                count = count + result[i]
            else:
                answer = i
                break

        return answer
