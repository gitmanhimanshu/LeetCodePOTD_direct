class Solution {
    int a=0;
    String ans=new String();
    public String getPermutation(int n, int k) {
        int nums[]=new int[n];
        boolean b[]=new boolean[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=i+1;
        }
        fun(0,nums,k,b);
        return ans;
    }
    int size(int n){
        int c=0;
        while(n>0){
            c++;
        n=n/10;}
        return c;
    }
    void fun(int h,int []nums,int k,boolean b[]){
        if(size(h)==nums.length){
            a++;
            
            if(a==k){
            ans=Integer.toString(h);  
            }
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(a==k){
                return;
            }
            if(b[i]==false){
                
                b[i]=true;
               h=h*10+nums[i];
                fun(h,nums,k,b);
                b[i]=false;
                h=h/10;
            }
        }
    }
}