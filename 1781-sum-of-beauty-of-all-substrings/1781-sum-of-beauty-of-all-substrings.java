class Solution {
 
    public int beautySum(String s) {
        int ans=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++ ){
            
            for(int j=i;j<s.length();j++){
                sb.append(s.charAt(j));
                ans+=solve(sb.toString());
            }
            sb.setLength(0);
        }
    return ans;
    }
    int solve(String s){
        int a[]=new int[26];
       for(char i:s.toCharArray()){
        a[i-'a']++;
       }
       int max=0;
       int min=Integer.MAX_VALUE;
       for(int i:a){
        max=Math.max(i,max);
      {  if(i!=0)
        min=Math.min(i,min);}
       } 
       if(max==0 ||min==Integer.MAX_VALUE){
        return 0;
       }    
       return max-min;
    }
}