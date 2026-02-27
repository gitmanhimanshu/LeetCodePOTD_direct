class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l=1;
        int r=position[position.length-1]-position[0];
        int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPos(position,m,mid)){
                l=mid+1;

                ans=mid;
            }else{
                r=mid-1;
            }
        }
        return ans;
    }
    boolean isPos(int a[],int m,int mid){
        
        int last=a[0];
        m--;
        for(int i=1;i<a.length;i++){
            if((a[i]-last)>=mid){
               m--;
                last=a[i];
            }
            if(m==0){
                return true;
            }
        }
        return m==0;
    }
}