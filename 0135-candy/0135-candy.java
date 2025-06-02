class Solution {
    public int candy(int[] ratings) {
        int l[]=new int [ratings.length];
        int r[]=new int [ratings.length];
        Arrays.fill(l,1);
        Arrays.fill(r,1);
        for(int i=1;i<l.length;i++){
            if(ratings[i]>ratings[i-1]){
                l[i]=l[i-1]+1;
            }
        }
        for(int i=r.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                r[i]=r[i+1]+1;
            }
        }
        int ans=0;
        for(int i=0;i<r.length;i++){
            ans+=Math.max(r[i],l[i]);
        }
        return ans;
    }
}