class Solution {
       //   Map<Integer,Integer> him;
       int dp[];
    public int minExtraChar(String s, String[] dictionary) {
     // him=new HashMap<>();
     dp=new int[s.length()+1];
        Set<String> dic=new HashSet<>();
         for(String i:dictionary){
        dic.add(i);
       }
       Arrays.fill(dp,-1);
        return min(s,0,dic);
    }
    int min(String s,int ind,Set<String> dic){
           if(ind>=s.length()){
            return 0;
           }
        //    if(him.containsKey(ind)){
        //     return him.get(ind);
        //    }
        if(dp[ind]!=-1){
            return dp[ind];
        }
           int m=Integer.MAX_VALUE;
           StringBuilder h=new StringBuilder();
           for(int i=ind;i<s.length();i++){
                h.append(s.charAt(i));
                if(dic.contains(h.toString())){
                    m=Math.min(m,min(s,i+1,dic));
                }
           }
        //   him.put(ind,Math.min(m,1+min(s,ind+1,dic)));
          dp[ind]=Math.min(m,1+min(s,ind+1,dic));
          // return him.get(ind);
          return dp[ind];
    }
}