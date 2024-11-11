class Solution {
    public boolean primeSubOperation(int[] nums) {
        List<Integer> him=new ArrayList<>();
        solve(him);
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                continue;
            }
            int e=nums[i];
            for(Integer j:him){
                if((e-j)<nums[i+1]&&j<nums[i]){
                    nums[i]=e-j;
                    break;
                }
            }
            if(nums[i]>=nums[i+1]){
                return false;
            }
        }
       // System.out.println(Arrays.toString(nums));
        return true;
    }
    void solve(List<Integer> him){
        boolean isp[]=new boolean[1000+1];
        int l=1001;
        Arrays.fill(isp,true);
        isp[0]=false;
        isp[1]=false;
        for(int i=2;i*i<l;i++){
            if(isp[i]){
                for(int j=i*2;j<l;j+=i){
                    isp[j]=false;
                }
            }
        }
        for(int i=2;i<l;i++){
            if(isp[i]){
                him.add(i);
            }
        }
    }
}