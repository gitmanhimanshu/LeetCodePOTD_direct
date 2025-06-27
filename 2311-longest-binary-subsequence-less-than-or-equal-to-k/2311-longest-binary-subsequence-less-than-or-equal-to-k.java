class Solution {
    public int longestSubsequence(String s, int k) {
    return solve(s.length()-1,s,k);
    }
    int solve(int i,String s,int k){
        
  if(i<0){
    return 0;
  }
        int t=0;
        int nt=0;
        if(s.charAt(i)=='0'){
            t=1+solve(i-1,s,k);
            
        }else{
        int val=(s.charAt(i)-'0') * (int)Math.pow(2,s.length()-i-1);
        if(val<=k){
            k-=val;
            nt=1+solve(i-1,s,k);
        }else{
        nt=0+solve(i-1,s,k);
        }
        }
        return t+nt;
    }
}



// class Solution {
//     public int longestSubsequence(String s, int k) {
//         int ans = 0;
//         int p = 0;
//         for (int i = s.length() - 1; i >= 0; i--) {
//             if(s.charAt(i)=='0'){
//                 ans++;
//                 p++;
//             }else {
//                 int val=(s.charAt(i)-'0') *(int)Math.pow(2,p);
//                 if(val<=k){
//                     ans++;
//                     k-=val;
//                 }
//                 p++;
//             }
//         }
//         return ans;
//     }
// }