class Solution {
    int dp[][];
    public int minimumDeleteSum(String s1, String s2) {
        dp=new int[s1.length()+1][s2.length()+1];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        return solve(0,0,s1,s2);
    }
    int solve(int i,int j,String s1,String s2){
            if(i>=s1.length()||j>=s2.length()){
                if(j>=s2.length()){
                    int c=0;
                    while(i<s1.length()){
                        c+=s1.charAt(i);
                        i++;
                    }
                    return c;
                }else if(i>=s1.length()){
                   int c=0;
                    while(j<s2.length()){
                        c+=s2.charAt(j);
                        j++;
                    }
                    return c; 
                }
                return Integer.MAX_VALUE;
            }
            if(dp[i][j]!=-1){
                return dp[i][j];
            }
         int ans=0;
            if(s1.charAt(i)==s2.charAt(j)){
             ans= solve(i+1,j+1,s1,s2);
            }else{
                ans=Math.min(s1.charAt(i)+solve(i+1,j,s1,s2),s2.charAt(j)+solve(i,j+1,s1,s2));

            }
            return  dp[i][j]=ans;

    }
}