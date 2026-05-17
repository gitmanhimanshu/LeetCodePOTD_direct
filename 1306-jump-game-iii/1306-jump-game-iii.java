class Solution {
    Boolean v[];
    public boolean canReach(int[] arr, int start) {
        v=new Boolean[arr.length];
        return solve(arr,start);
    }
    boolean solve(int a[],int i){
        if(i<0||i>=a.length){
            return false;
        }
        if(a[i]==0){
            return true;
        }
        if(v[i]!=null){
            return false;
        }
        int peeche=i-a[i];
        int aage=i+a[i];
        
        v[i]=true;
        
        return solve(a,peeche)||solve(a,aage);
    }
}