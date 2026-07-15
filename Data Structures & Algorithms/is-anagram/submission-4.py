class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        hashmap = {}

        for i in s:
            if i in hashmap:
                hashmap[i] = hashmap.get(i)+1
            else:
                hashmap[i] = 1
        
        for j in t:
            if j in hashmap:
                hashmap[j] = hashmap.get(j) - 1
            else:
                hashmap[j] = -1
        
        for k in hashmap:
            count = hashmap.get(k)
            if count != 0:
                return False
        return True