class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> him=new HashSet<>();
        if(nums.length<3){
            return new ArrayList<>(him);
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==0){
                    him.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                }
                else if(sum<=0){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return new ArrayList<>(him);
    }
}