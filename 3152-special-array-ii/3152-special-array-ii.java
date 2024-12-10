class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n=nums.length;
        int a[]=new int[n];
        for(int i=1;i<n;i++){
            if(((nums[i]&1)==1&&(nums[i-1]&1)==1)||((nums[i]&1)==0&&(nums[i-1]&1)==0)){
                a[i]=a[i-1]+1;
                }else{
                a[i]=a[i-1];
                }
            }
        boolean ans[]=new boolean[queries.length];
System.out.println(Arrays.toString(a));
        int i=0;
        for(int b[]: queries){
            int s=b[0];
            int t=b[1];
            
        //   int specialCount = a[t] - (s > 0 ? a[s - 1] : 0);
            
             ans[i] = (0 == (a[s] - a[t]));    
               

            i++;
            }
        return ans;
        
        
    }
}