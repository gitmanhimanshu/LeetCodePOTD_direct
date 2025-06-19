class Solution {
    public int partitionArray(int[] nums, int k) {
      int ans=0;
        int i=0;
        int j=0;
        Arrays.sort(nums);
        while(j<nums.length){
                    while(j<nums.length&&(nums[j]-nums[i]<=k)){
                            j++;
                    }
                    ans++;
                    i=j;

        }
        return ans;
    }
}