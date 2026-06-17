class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        result = {}
        for i,val in enumerate(nums):
            x = target - val
            if x in result:
                return [result[x],i]
            result[val] = i
        