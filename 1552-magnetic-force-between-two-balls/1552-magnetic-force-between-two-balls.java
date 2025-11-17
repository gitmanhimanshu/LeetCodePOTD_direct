class Solution {
    public int maxDistance(int[] position, int m) {
       Arrays.sort(position);
       int l=1;
       int r=position[position.length-1]-position[0];
       int ans=-1;
       while(l<=r){
        int mid=(l+r)/2;
        if(isPos(position,m,mid)){
      ans=mid;
            l=mid+1;

        }else{
            r=mid-1;
        }
       } 
       return ans;
    }
    boolean isPos(int a[],int k,int m){
        int last=a[0];
        k--;
        for(int i=1;i<a.length;i++){
            if((a[i]-last)>=m){
                k--;
                last=a[i];
            }
            if(k==0){
                return true;
            }
        }
        return k==0;
    }
}