class Solution(object):
    def lengthOfLastWord(self, s):
        l = 0
        word = s.strip()
        for i in range(len(word)):
            if word[i] == " ":
                l = 0
            else:
                l += 1
        
        return l

        