// class Solution {
//     public int minDistance(String word1, String word2) {
//         return solve(0,0,word1,word2);
//     }
//     int solve(int i,int j,String s1,String s2){
//         if(i>=s1.length()){
//             return s2.length()-j;
//         }
//         if(j>=s2.length()){
//             return s1.length()-i;
//         }
//         int ans=0;
//         if(s1.charAt(i)==s2.charAt(j)){
//             ans=solve(i+1,j+1,s1,s2);
//         }else{
//             int insert=1+solve(i,j+1,s1,s2);
//             int delete=1+solve(i+1,j,s1,s2);
//             int replace=1+solve(i+1,j+1,s1,s2);
//             ans=Math.min(insert,Math.min(delete,replace));
//         }

//         return ans;
//     }
// }
class Solution {
    int[][] dp;

    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        dp = new int[n][m];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(0, 0, word1, word2);
    }

    int solve(int i, int j, String s1, String s2) {

        // s1 finished → insert remaining chars of s2
        if (i == s1.length()) {
            return s2.length() - j;
        }

        // s2 finished → delete remaining chars of s1
        if (j == s2.length()) {
            return s1.length() - i;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        // characters match → move both
        if (s1.charAt(i) == s2.charAt(j)) {
            return dp[i][j] = solve(i + 1, j + 1, s1, s2);
        }

        // operations
        int insert  = 1 + solve(i, j + 1, s1, s2);
        int delete  = 1 + solve(i + 1, j, s1, s2);
        int replace = 1 + solve(i + 1, j + 1, s1, s2);

        return dp[i][j] = Math.min(insert, Math.min(delete, replace));
    }
}
