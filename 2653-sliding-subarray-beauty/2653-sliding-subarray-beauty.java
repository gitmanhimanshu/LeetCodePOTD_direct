class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int f[]=new int[50];
        int i=0;
    int ans[]=new int[nums.length-k+1];
    int l=0;
    int j=0;
    while(j<nums.length){
    
        if(j>=k-1){
            if(nums[j]<0)
           {     f[nums[j]+50]++;}
        boolean b=false;
        int c=0;
       //System.out.println(Arrays.toString(f)) ;
        for(int o=0;o<50;o++){
             if(c+f[o]>=x){
                b=true;
                ans[l++]=o-50;
                break;
             }
             c+=f[o];
        }
        if(!b){
            ans[l++]=0;
        }
        if(nums[i]<0)
        {f[nums[i]+50]--;};
        i++;
        }else{
            if(nums[j]<0)
          {  f[nums[j]+50]++;}
        }
        j++;
    }
    return ans;
    }
}