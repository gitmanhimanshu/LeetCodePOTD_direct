class Solution {
   
    public int[] separateDigits(int[] nums) {
Stack<Integer> him=new Stack<>();
    for(Integer i=nums.length-1;i>=0;i--){
     
        int n=nums[i];
        while(n>0){
           int d=n%10;
           him.push(d);
           n=n/10;
        }

    }
    int ans[]=new int[him.size()];
    int i=0;
    while(!him.isEmpty()){
        ans[i++]=him.pop();
    }
    return ans;
    }
}