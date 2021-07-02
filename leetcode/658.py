"""
    https://leetcode.com/problems/find-k-closest-elements/
    658. Find K Closest Elements (Medium)
"""
class Solution(object):
    def findClosestElements(self, arr, k, x):
        result = []
        count = 0
        start = 0

        for i in arr:
            if count < k:
                count = count + 1
                result.append(i)
            else:
                if i <= x or abs(i-x) < abs(result[start]-x):
                    start = start + 1
                    result.append(i)
                else:
                    break
        return result[start:]