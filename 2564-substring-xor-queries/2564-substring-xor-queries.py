class Solution:
    def substringXorQueries(self, s: str, queries: list[list[int]]) -> list[list[int]]:
        occurances = {}
        n = len(s)
        for i in range(n):
            if s[i]=='0':
                if 0 not in occurances:
                    occurances[0] = [i,i]
                continue
            val = 0
            for j in range(i,min(i+30,n)):
                val = (val * 2) +int(s[j])
                if val not in occurances:
                    occurances[val] = [i,j]
        res =[]
        for i,j in queries:
            target = i ^ j
            if target in occurances:
                res.append(occurances[target])
            else:
                res.append([-1,-1])
        return res