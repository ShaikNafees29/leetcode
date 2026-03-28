class Solution:
    def substringXorQueries(self, s: str, queries: list[list[int]]) -> list[list[int]]:
        # 1. Pre-calculate all possible decimal values in the string
        # We only need substrings up to 30 bits long.
        occurences = {}
        n = len(s)
        
        # Traverse the string once to map each value to its [start, end]
        # We go from left to right so we always store the FIRST occurrence.
        for i in range(n):
            if s[i] == '0':
                if 0 not in occurences:
                    occurences[0] = [i, i]
                continue # Leading zeros only matter for the value 0
            
            val = 0
            for j in range(i, min(i + 30, n)):
                val = (val * 2) + int(s[j])
                if val not in occurences:
                    occurences[val] = [i, j]
        
        # 2. Process queries using the pre-calculated map
        res = []
        for i, j in queries:
            target = i ^ j
            if target in occurences:
                res.append(occurences[target])
            else:
                res.append([-1, -1])
                
        return res