class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> him=new HashSet<>();
        for(int i:nums){
            him.add(i);
        }
        return find(nums,him.size())-find(nums,him.size()-1);
    }
      int find(int nums[],int k){
        Map<Integer,Integer> him=new HashMap<>();
        int i=0;
        int j=0;
        int c=0;
        while(j<nums.length){
            int e=nums[j];
            him.put(e,him.getOrDefault(e,0)+1);
            while(him.size()>k){
                int e1=nums[i];
                him.put(e1,him.getOrDefault(e1,0)-1);
                if(him.get(e1)==0){
                    him.remove(e1);
                }
                i++;

            }
            c+=(j-i+1);
            j++;
        }
        return c;
    }
}