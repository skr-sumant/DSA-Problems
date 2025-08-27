class Solution(object):
    def reorderedPowerOf2(self, n):
        from collections import Counter
        n_counter = Counter(str(n))
        for i in range(31):  
            if n_counter == Counter(str(1 << i)):
                return True
        return False
