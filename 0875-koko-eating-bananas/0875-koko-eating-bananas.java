class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int l=1;
        int r=piles[0];
        for(int i:piles){
            r=Math.max(r,i);
        }
        while(l<r){
            int m=(l+r)/2;
            if(canFinish(h,piles,m)){
                r=m;
            }else{
                l=m+1;
            }
        }
        return l;
    }
    boolean canFinish(int h,int []piles,int m){
        int c=0;
        for(int i:piles){
            c+=i/m;
            if(i%m!=0){
                c++;
            }
        }
        return c<=h;
    }
}