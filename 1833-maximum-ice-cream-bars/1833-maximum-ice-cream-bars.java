class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max=Integer.MIN_VALUE;
        for(int i:costs){
            max=Math.max(max,i);
        }
        int a[]=new int[max+1];
        for(int i:costs){
            a[i]++;
        }
        int ans=0;
        // System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                continue;
            }
            int d=Math.min(a[i],coins/i);
            if(d==0){
                return ans;
            }
            ans+=d;
            coins-=d*i;
        }
        return ans;
    }
}