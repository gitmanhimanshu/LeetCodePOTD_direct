class Solution {
    public int trap(int[] height) {
int ans=0;
        int l[]=new int [height.length];
        int r[]=new int[height.length];
            l[0]=height[0];
        for(int i=1;i<l.length;i++){
            l[i]=Math.max(l[i-1],height[i]);
        }
            r[r.length-1]=height[r.length-1];
        for(int i=r.length-2;i>=0;i--){
            r[i]=Math.max(r[i+1],height[i]);
        }
        for(int i=0;i<r.length;i++){
            ans+=Math.min(r[i],l[i])-height[i];
        }
        return ans;
    }
}
