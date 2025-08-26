import math

class Solution(object):
    def areaOfMaxDiagonal(self, dimensions):
        max_diag = 0
        max_area = 0
        for l,w in dimensions:
            diagonal = math.sqrt(l*l + w * w)
            area = l * w

            if diagonal > max_diag:
                max_diag = diagonal
                max_area = area
            elif diagonal == max_diag:
                max_area = max(max_area,area)
        return max_area
        