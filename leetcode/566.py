"""
    https://leetcode.com/problems/reshape-the-matrix/
    566. Reshape the Matrix (Easy)
"""


class Solution:
    def matrixReshape(self, mat, r, c):
        m = len(mat)
        n = len(mat[0])

        if m*n != r*c:
            return mat

        rLoc = 0
        cLoc = 0
        result = []
        row = []
        for i in mat:
            for j in i:
                row.append(j)
                cLoc = cLoc + 1
                if cLoc == c:
                    rLoc = rLoc + 1
                    cLoc = 0
                    result.append(row[:])
                    row = []

        return result
