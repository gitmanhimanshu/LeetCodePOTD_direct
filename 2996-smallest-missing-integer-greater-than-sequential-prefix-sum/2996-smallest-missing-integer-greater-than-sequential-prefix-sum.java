class Solution {
    public int missingInteger(int[] nums) {
        int c=0;
        
        Set<Integer> him=new HashSet<>();
        for(int i:nums){
            him.add(i);
        }
        c=nums[0];
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=(nums[i-1]+1)){
                break;
            }
            c+=nums[i];
            
        }
        int x=c;
        while(him.contains(x)){
            x++;
        }
        return x;

    }
}