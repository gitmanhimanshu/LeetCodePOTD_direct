class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
     Set<List<Integer> >him=new HashSet<>();
        Arrays.sort(nums);
        long sum=0;
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int k=j+1;
                int l=nums.length-1;
                while(k<l){
                      sum=((long)nums[i]+(long)nums[j]+(long)nums[k]+(long)nums[l]);
                    if(sum==target){
                        him.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        k++;
                        l--;
                    }
                     else if(sum>target){
                         l--;
                     }
                    else{
                        k++;
                    }
                }
            }
        }
        return new ArrayList<>( him);
    }
}