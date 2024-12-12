class Solution {
    public long pickGifts(int[] gifts, int k) {
        
        
        while (k>0){
            
            int max=Integer.MIN_VALUE;
            int ind=-1;
            for(int i=0;i<gifts.length;i++){
            if(gifts[i]>max){
                max=gifts[i];
                ind=i;
            }}
            k--;
            gifts[ind]=(int)Math.sqrt(gifts[ind]);
            
            
            
            
        }
        long ans=0;
        for(int i:gifts)
            ans+=i;
        return ans;
    }
}