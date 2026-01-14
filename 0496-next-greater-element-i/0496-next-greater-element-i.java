class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> him=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            him.put(nums2[i],i);
        }
    int ans[]=new int[nums1.length];
    for(int i=0;i<nums1.length;i++){
        int pos=him.get(nums1[i]);
         int j=pos+1;
         while(j<nums2.length){
            if(nums1[i]<nums2[j]){
                ans[i]=nums2[j];
                break;
            }
            j++;
         }
         if(j==nums2.length){
            ans[i]=-1;
         }
    }
    return ans;
    }
}