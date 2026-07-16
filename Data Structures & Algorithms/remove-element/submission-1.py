class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        start = 0
        n = len(nums)

        while(start < n):
            if nums[start] == val:
                nums[start] = nums[n - 1]
                n -= 1
            else:
                start += 1
        return n