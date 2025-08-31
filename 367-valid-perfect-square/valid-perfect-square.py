import math
class Solution(object):
    def isPerfectSquare(self, num):
        
        root= int(math.sqrt(num))
        return root * root == num
        