class Solution(object):
    def flowerGame(self, n, m):
        """
        :type n: int
        :type m: int
        :rtype: int
        """
        return (n / 2) * ((m + 1) / 2) + ((n + 1) / 2) * (m / 2)