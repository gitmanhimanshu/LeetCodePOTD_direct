class Solution:
    def containsNearbyDuplicate(self, nums: list[int], k: int) -> bool:
        him={}
        for i in range(len(nums)):
            ele=nums[i]
            if ele in him:
                if((i-him[ele]) <=k):
                    return True
                else:
                    him[ele]=i
            him[ele]=i
        return False


        