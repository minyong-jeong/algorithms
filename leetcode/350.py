'''
350. Intersection of Two Arrays II
https://leetcode.com/problems/intersection-of-two-arrays-ii/

Approach: Sorting
'''


class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        nums1.sort()
        nums2.sort()

        i = 0
        j = 0
        result = []
        while i < len(nums1) and j < len(nums2):
            if nums1[i] == nums2[j]:
                result.append(nums1[i])
                i = i + 1
                j = j + 1
            elif nums1[i] > nums2[j]:
                j = j + 1
            elif nums1[i] < nums2[j]:
                i = i + 1

        return result
