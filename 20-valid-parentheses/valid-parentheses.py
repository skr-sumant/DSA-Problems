class Solution(object):
    def isValid(self, s):
        hashmap = {")": "(", "}": "{", "]": "["}
        stck = []

        for pt in s:
            if pt not in hashmap:   
                stck.append(pt)
            else:   
                if not stck:   
                    return False
                popped = stck.pop()
                if popped != hashmap[pt]:  
                    return False
        
        
        return not stck
