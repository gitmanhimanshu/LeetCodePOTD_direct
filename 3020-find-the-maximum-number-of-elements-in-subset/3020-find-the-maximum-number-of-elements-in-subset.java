class Solution {
    public int maximumLength(int[] nums) {
        Map<Integer,Integer> him=new HashMap<>();
        for(int i:nums){
            him.put(i,him.getOrDefault(i,0)+1);
        }
        int ans=0;
        if(him.containsKey(1)){
            int f=him.get(1);
            if(f%2==0){
                ans=Math.max(ans,f-1);
            }else{
                ans=Math.max(ans,f);
            }
        }
        for(int i:him.keySet()){
            if(i==1){
                continue;
            }
            int curr=i;
            int len=0;
            while(him.getOrDefault(curr,0)>=2){
                len+=2;
                if(curr>Math.sqrt(Integer.MAX_VALUE)){
                    break;
                }
                curr=curr*curr;
            }
            if (him.getOrDefault(curr, 0) == 1) {
                len += 1;
            } else {
                len -= 1;
            }
            ans=Math.max(len,ans);
        }
        return ans;
    }
}