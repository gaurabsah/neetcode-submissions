class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map = {}
        res = [0, 0]

        for pos, i in enumerate(nums):
            rem = target - i
            if rem in map:
                res[0] = map.get(rem)
                res[1] = pos
                return res
            map[i] = pos
        return res
