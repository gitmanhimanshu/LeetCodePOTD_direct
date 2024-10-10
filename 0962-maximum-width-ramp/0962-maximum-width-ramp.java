class Solution {
    public int maxWidthRamp(int[] nums) {
        Stack<Integer> him=new Stack<>();
        for(int i=0;i<nums.length;i++){
            if(him.isEmpty()||nums[i]<nums[him.peek()]){
                him.push(i);
            }
        }
        int ans=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
        while(!him.isEmpty()&&nums[i]>=nums[him.peek()]){
                ans=Math.max(ans,i-him.pop());
            }
            // if(him.isEmpty()){
            //     break;
            // }
        }
        return ans;
    }
}