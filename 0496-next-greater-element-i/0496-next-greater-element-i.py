class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        dict={}
        for i in range(len(nums2)):
            dict[nums2[i]]=i
        a=[]
        greater = [-1] * len(nums2)
        for i in range(len(nums2)-1,-1,-1):
            while(len(a)>0 and nums2[i]>a[-1]):
                a.pop()
            if(len(a)>0):
                greater[i]=a[-1]
            a.append(nums2[i])
        ans=[]
        for i in nums1:
            ans.append(greater[dict[i]])
        return ans
        